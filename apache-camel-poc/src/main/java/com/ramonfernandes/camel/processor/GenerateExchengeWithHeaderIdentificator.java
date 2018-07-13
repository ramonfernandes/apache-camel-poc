package com.ramonfernandes.camel.processor;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class GenerateExchengeWithHeaderIdentificator implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getIn().setHeader(((String) exchange.getIn().getBody()).split("ç")[0], );
    }
}
