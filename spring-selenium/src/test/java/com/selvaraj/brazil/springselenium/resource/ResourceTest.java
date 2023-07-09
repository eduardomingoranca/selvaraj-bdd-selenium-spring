package com.selvaraj.brazil.springselenium.resource;

import com.selvaraj.brazil.springselenium.SpringBaseTestNGTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import java.io.IOException;

import static java.nio.file.Files.readAllLines;

public class ResourceTest extends SpringBaseTestNGTest {

//    @Value("classpath:data/testdata.csv")
    @Value("file:/Users/eduar/Workspace/selvaraj-bdd-selenium-spring/spring-selenium/src/test/resources/data/testdata.csv")
    private Resource resource;

    @Test
    public void resourceTest() throws IOException {
        readAllLines(resource.getFile().toPath())
                .forEach(System.out::println);
    }
}
