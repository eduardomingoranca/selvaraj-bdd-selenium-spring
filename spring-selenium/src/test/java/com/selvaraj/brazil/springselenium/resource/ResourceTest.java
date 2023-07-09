package com.selvaraj.brazil.springselenium.resource;

import com.selvaraj.brazil.springselenium.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.newOutputStream;
import static java.nio.file.Files.readAllLines;
import static org.springframework.util.FileCopyUtils.copy;

public class ResourceTest extends SpringBaseTestNGTest {
    @Value("classpath:data/testdata.csv")
    private Resource resource;

    @Value("${screenshot.path}")
    private Path path;

    @Autowired
    private ResourceLoader resourceLoader;

    @Test(dataProvider = "getData")
    public void resourceTest(String url, String saveAs) throws IOException {
        copy(resourceLoader.getResource(url).getInputStream(),
                newOutputStream(path.resolve(saveAs)));
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        return readAllLines(Path.of(resource.getFile().getPath()))
                .stream()
                .map(s -> s.split(","))
                .toArray(Object[][]::new);
    }

}
