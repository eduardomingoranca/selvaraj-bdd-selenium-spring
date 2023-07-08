package com.selvaraj.brazil.springselenium.util;

import com.github.javafaker.Faker;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static org.openqa.selenium.OutputType.FILE;
import static org.springframework.util.FileCopyUtils.copy;

@Lazy
@Component
public class ScreenShotUtil {

    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}")
    private Path path;

    @Autowired
    private Faker faker;

    public void takeScreenShot() throws IOException {
        File sourceFile = this.driver.getScreenshotAs(FILE);
        String imageName = faker.name().firstName();
        copy(sourceFile, this.path.resolve(imageName + ".png").toFile());;
    }

}
