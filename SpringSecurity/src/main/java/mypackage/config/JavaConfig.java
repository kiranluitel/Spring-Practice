package mypackage.config;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan("mypackage")
@PropertySource("classpath:persistence-mysql.properties")
public class JavaConfig {
	
	@Autowired
	private Environment env;
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Bean
	public DataSource dataSource() {
		
		//create a connection pool
		ComboPooledDataSource securityDataSource = new ComboPooledDataSource();
		
		try {
			securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException e) {
			throw new RuntimeException(e);
		}
		//set jdbc driver class
		
		//log connection properties
		
		logger.info(">>>>jdbc.url: "+env.getProperty("jdbc.driver"));
		logger.info(">>>>jdbc.url: "+env.getProperty("jdbc.user"));
		
		//database connection props
		
		securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		securityDataSource.setUser(env.getProperty("jdbc.user"));
		securityDataSource.setPassword(env.getProperty("jdbc.password"));
		
		
		
		//set connection pool props
		securityDataSource.setInitialPoolSize(getPropertyInInt("connection.pool.initialPoolSize"));
		securityDataSource.setMinPoolSize(getPropertyInInt("connection.pool.minPoolSize"));
		securityDataSource.setMaxPoolSize(getPropertyInInt("connection.pool.maxPoolSize"));
		securityDataSource.setMaxIdleTime(getPropertyInInt("connection.pool.maxIdleTime"));
		
		//return
		return securityDataSource;
	}
	
	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	private int getPropertyInInt(String propertyName) {
		
		String propVal = env.getProperty(propertyName);
		
		return Integer.parseInt(propVal);
	}

}
