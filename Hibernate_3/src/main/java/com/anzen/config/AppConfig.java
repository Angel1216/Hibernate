package com.anzen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;



@Configuration
public class AppConfig {

	// Se habilita el Bean del SessionFactory para realizar la inyección de dependencia en el repositorio 
	@Bean
    public HibernateJpaSessionFactoryBean sessionFactory() {
        return new HibernateJpaSessionFactoryBean();
    }
	
}
