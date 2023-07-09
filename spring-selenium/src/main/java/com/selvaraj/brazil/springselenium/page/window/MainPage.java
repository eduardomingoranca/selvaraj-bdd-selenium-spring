package com.selvaraj.brazil.springselenium.page.window;

import com.selvaraj.brazil.springselenium.kelvin.annotation.Page;
import com.selvaraj.brazil.springselenium.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

@Page
public class MainPage extends Base {

    @FindBy(tagName = "a")
    private List<WebElement> links;

    public void goTo() {
        this.driver.get("https://vins-udemy.s3.amazonaws.com/ds/window/main.html");
    }

    public void launchAllWindows() {
        for (int i = 0; i < links.size(); i++) {
            links.get(i).click();
            this.wait.until(numberOfWindowsToBe(i + 2));
        }
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> !this.links.isEmpty());
    }
}
