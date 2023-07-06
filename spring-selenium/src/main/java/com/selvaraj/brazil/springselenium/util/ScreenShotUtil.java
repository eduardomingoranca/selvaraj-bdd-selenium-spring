package com.selvaraj.brazil.springselenium.util;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.OutputType.FILE;
import static org.springframework.util.FileCopyUtils.copy;

@Lazy
@Component
public class ScreenShotUtil {

    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}/img.png")
    private Path path;

    @PostConstruct
    private void init() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sleeping.....");
        }
    }

    public void takeScreenShot() throws IOException {
        File sourceFile = this.driver.getScreenshotAs(FILE);
        copy(sourceFile, this.path.toFile());
    }

}
