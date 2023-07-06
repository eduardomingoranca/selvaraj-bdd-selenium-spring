package com.selvaraj.brazil.springselenium.util;

import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static org.openqa.selenium.OutputType.FILE;
import static org.springframework.util.FileCopyUtils.copy;

@Component
public class ScreenShotUtil {

    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}")
    private Path path;

    public void takeScreenShot(final String imgName) throws IOException {
        File sourceFile = this.driver.getScreenshotAs(FILE);
        copy(sourceFile, this.path.resolve(imgName).toFile());
    }

}
