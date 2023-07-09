package com.selvaraj.brazil.springselenium.flights;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("language/id.properties")
public class FlightAppDetails {
    @Value("${flight.app.url}")
    private String url;

    @Value("${flight.app.labels}")
    private List<String> getLabels;

    public String getUrl() {
        return url;
    }

    public List<String> getGetLabels() {
        return getLabels;
    }

}
