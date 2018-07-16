package com.ramonfernandes.camel.aggregator;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;


public class AggregateObjectsStrategy implements AggregationStrategy {


    private static String result;

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if (result == null)
            result = "";
        result = result + newExchange.getIn().getBody() + "\n";
        newExchange.getIn().setBody(result);
        return newExchange;
    }
}
