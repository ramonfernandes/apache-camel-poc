package com.ramonfernandes.camel.aggregator;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;



public class AggregateObjectsStrategy implements AggregationStrategy {
    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if (oldExchange != null)
            newExchange.getIn().setBody(oldExchange.getIn().getBody() + "\n" + newExchange.getIn().getBody());
        oldExchange = newExchange;
        System.out.println("body:" + newExchange.getIn().getBody() + "\n\n");
        return newExchange;
    }
}
