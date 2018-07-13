package com.ramonfernandes.camel.route;

import com.ramonfernandes.camel.aggregator.AggregateObjectsStrategy;
import com.ramonfernandes.camel.processor.CreateObjectsFromString;
import com.ramonfernandes.camel.processor.GenerateArrayFromStringFileProcessor;
import org.apache.camel.builder.RouteBuilder;

import java.io.File;

public class SimpleRouteBuilder extends RouteBuilder {

    private final File INPUT_FOLDER = new File(System.getenv("HOME") + "/inputFolder");
    private final File OUTPUT_FOLDER = new File(System.getenv("HOME") + "/outputFolder");

    @Override
    public void configure() {
        from("file:" + INPUT_FOLDER + "?noop=true")
                .process(new GenerateArrayFromStringFileProcessor())
                .split(body())
                .process(new CreateObjectsFromString())
                .aggregate(header("identifier"), new AggregateObjectsStrategy())
                .completionFromBatchConsumer()
                .to("file:" + OUTPUT_FOLDER);
    }
}
