package com.ramonfernandes.main;

import com.ramonfernandes.camel.SimpleRouteBuilder;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {
    public static void main(String[] args) {
        SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();
        CamelContext camelContext = new DefaultCamelContext();
        try {
            camelContext.addRoutes(routeBuilder);
            while(true)
                camelContext.start();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
