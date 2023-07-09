package com.selvaraj.brazil.springselenium.resource;

import com.selvaraj.brazil.springselenium.SpringBaseTestNGTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.newOutputStream;
import static org.springframework.util.FileCopyUtils.copy;

public class ResourceTest extends SpringBaseTestNGTest {

    @Value("https://www.w3.org/TR/2022/WD-png-3-20221025/")
    private Resource resource;


    @Value("${screenshot.path}/some.txt")
    private Path path;

    @Test
    public void resourceTest() throws IOException {
        copy(resource.getInputStream(), newOutputStream(path));
    }
}
