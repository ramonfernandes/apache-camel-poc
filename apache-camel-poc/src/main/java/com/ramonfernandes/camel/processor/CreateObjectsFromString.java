package com.ramonfernandes.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CreateObjectsFromString implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getIn().setBody("Esse aqui é um:" + exchange.getIn().getBody());
    }
}
