package com.ramonfernandes.camel.aggregator;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import java.util.ArrayList;
import java.util.List;

public class AggregateObjectsStrategy implements AggregationStrategy {
    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        List<String> listOfObjects = (ArrayList) oldExchange.getIn().getBody();
        String result = "";
        for(String object : listOfObjects)
            result = result + object;
        newExchange.getIn().setBody(result);
        return newExchange;
    }
}
