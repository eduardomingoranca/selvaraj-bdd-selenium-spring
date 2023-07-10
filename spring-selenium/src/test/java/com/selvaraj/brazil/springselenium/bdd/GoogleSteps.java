package com.selvaraj.brazil.springselenium.bdd;

import com.selvaraj.brazil.springselenium.page.google.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.testng.Assert.assertTrue;

@SpringBootTest
public class GoogleSteps {
    @Autowired
    private GooglePage googlePage;

    @Given("I am on the google site")
    public void launchSite() {
        this.googlePage.goTo();
    }

    @When("I enter {string} as a keyword")
    public void enterKeyword(String keyword) {
        this.googlePage.getSearchComponent().search(keyword);
    }

    @Then("I should see search results page")
    public void clickSearch() {
        assertTrue(this.googlePage.getSearchResult().isAt());
    }

    @Then("I should see at least {int} results")
    public void verifyResults(int count) {
        assertTrue(this.googlePage.getSearchResult().getCount() >= count);
    }

}
