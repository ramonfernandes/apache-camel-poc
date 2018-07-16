package com.ramonfernandes.spring;

import com.ramonfernandes.camel.aggregator.AggregateObjectsStrategy;
import com.ramonfernandes.camel.processor.CreateObjectsFromString;
import com.ramonfernandes.camel.processor.GenerateArrayFromStringFileProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppConfig {


    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public AggregateObjectsStrategy aggregateObjectsStrategy(){
        return new AggregateObjectsStrategy();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public CreateObjectsFromString createObjectsFromString(){
        return new CreateObjectsFromString();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public GenerateArrayFromStringFileProcessor generateArrayFromStringFileProcessor(){
        return new GenerateArrayFromStringFileProcessor();
    }

}
