package com.ramonfernandes.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CreateObjectsFromString implements Processor {
    @Override
    public void process(Exchange exchange) {
        String body = (String) exchange.getIn().getBody();
        exchange.getIn().setHeader("identifier", body.split("ç")[0]);
    }
}
