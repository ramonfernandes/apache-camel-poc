package com.ramonfernandes.camel.route;

import com.ramonfernandes.camel.aggregator.AggregateObjectsStrategy;
import com.ramonfernandes.camel.processor.CreateObjectsFromString;
import com.ramonfernandes.camel.processor.GenerateArrayFromStringFileProcessor;
import com.ramonfernandes.spring.AppConfig;
import org.apache.camel.builder.RouteBuilder;

import java.io.File;

public class SimpleRouteBuilder extends RouteBuilder {

    private final File INPUT_FOLDER = new File(System.getenv("HOME") + "/inputFolder");
    private final File OUTPUT_FOLDER = new File(System.getenv("HOME") + "/outputFolder");
    private AppConfig appConfig = new AppConfig();

    @Override
    public void configure() {
        from("file:" + INPUT_FOLDER + "?noop=true")
                .process(appConfig.generateArrayFromStringFileProcessor())
                .split(body())
                .process(appConfig.createObjectsFromString())
                .aggregate(header("identifier"), appConfig.aggregateObjectsStrategy())
                .completionFromBatchConsumer()
                .to("file:" + OUTPUT_FOLDER);
    }
}
