package com.selvaraj.brazil.springselenium.page.flights;

import com.selvaraj.brazil.springselenium.kelvin.annotation.Page;
import com.selvaraj.brazil.springselenium.kelvin.annotation.TakeScreenshot;
import com.selvaraj.brazil.springselenium.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Page
public class FlightPage extends Base {

    @FindBy(css = "nav.rlGvde a")
    private List<WebElement> elements;

    public void goTo(final String url) {
        this.driver.get(url);
        this.driver.manage().window().maximize();
    }

    @TakeScreenshot
    public List<String> getLabels() {
       return this.elements
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .collect(toList());
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> !this.elements.isEmpty());
    }

}
