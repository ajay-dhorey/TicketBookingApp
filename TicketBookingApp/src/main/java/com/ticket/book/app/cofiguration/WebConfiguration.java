package com.ticket.book.app.cofiguration;

import javax.servlet.Filter;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.support.OpenSessionInViewFilter;

@Configuration
public class WebConfiguration {
    @Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }
    
//    
//    @Bean
//    public FilterRegistrationBean filterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(openSessionInView());
//        registration.addUrlPatterns("/*");
//
//        return registration;
//    }
//
//    @Bean
//    public Filter openSessionInView() {
//        return new OpenSessionInViewFilter();
//    }

}