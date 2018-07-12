package com.ramonfernandes.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ChangeStringMessageProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String body = exchange.getIn().getBody(String.class);
        body = "que loucura mudou";
        exchange.getIn().setBody(body);
    }
}
