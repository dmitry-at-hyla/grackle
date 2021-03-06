package com.github.hyla.grackle.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrackleConfig {

    @Bean(name = "grackleOperatorBeanFactory")
    public OperatorBeanFactory operatorBeanFactory() {
        return new OperatorBeanFactory();
    }

    @Bean(name = "grackleDefaultOperators")
    public Operators defaultOperators() {
        return new Operators();
    }

    @Bean(name = "grackleQueryBeanFactory")
    public QueryBeanFactory queryBeanFactory() {
        return new QueryBeanFactory();
    }
}
