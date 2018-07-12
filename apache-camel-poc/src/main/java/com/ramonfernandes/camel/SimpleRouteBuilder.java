package com.ramonfernandes.camel;

import org.apache.camel.builder.RouteBuilder;

import java.io.File;

public class SimpleRouteBuilder extends RouteBuilder {

    private final File INPUT_FOLDER = new File(System.getenv("HOME") + "/inputFolder");
    private final File OUTPUT_FOLDER = new File(System.getenv("HOME") + "/outputFolder");

    @Override
    public void configure() {
        from("file:" + INPUT_FOLDER + "?noop=true")
                .to("file:" + OUTPUT_FOLDER);
    }
}
