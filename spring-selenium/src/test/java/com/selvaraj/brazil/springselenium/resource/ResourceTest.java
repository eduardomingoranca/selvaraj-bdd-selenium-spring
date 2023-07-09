package com.selvaraj.brazil.springselenium.resource;

import com.selvaraj.brazil.springselenium.SpringBaseTestNGTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class ResourceTest extends SpringBaseTestNGTest {

    @Value("https://www.google.com")
    private Resource resource;

    @Test
    public void resourceTest() throws IOException {
        String resourceInputStream = new String(resource.getInputStream().readAllBytes());
        System.out.println(resourceInputStream);
    }
}
