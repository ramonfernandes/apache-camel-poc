package com.ramonfernandes.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.Arrays;
import java.util.List;

public class GenerateArrayFromStringFileProcessor implements Processor {
    @Override
    public void process(Exchange exchange) {
        String[] body = exchange.getIn().getBody(String.class).replace(" 00", "@00").split("@|\n");
        List<String> result = Arrays.asList(body);
        exchange.getIn().setBody(result);
    }
}
