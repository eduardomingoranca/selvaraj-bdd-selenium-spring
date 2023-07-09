package com.selvaraj.brazil.springselenium.props;

import com.selvaraj.brazil.springselenium.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

import static org.springframework.core.io.support.PropertiesLoaderUtils.loadProperties;

public class PropsTest extends SpringBaseTestNGTest {

    @Autowired
    private ResourceLoader loader;

    @Test
    public void propsTest() throws IOException {
        Properties properties = loadProperties(loader.getResource("my.properties"));
        System.out.println(properties);
    }
}
