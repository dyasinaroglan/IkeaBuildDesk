package stepdefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import static pages.Locators.*;
import static com.codeborne.selenide.Selenide.*;

public class buildDeskStepdefs {
    @Given("user on planner page")
    public void userOnPlannerPage() {
        open(url);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @And("user clicks design own desk")
    public void userClicksDesignOwnDesk() {
        $(designOwnDesk).scrollIntoView(true).shouldBe(Condition.visible).click();
        sleep(1000);
        $(iframeConfig).shouldBe(Condition.visible, Duration.ofSeconds(15));
        switchTo().frame("byod-application");
        $(configurationMenu).shouldBe(Condition.visible).click();
        sleep(1000);
    }

    @When("user selects dimension as {string}")
    public void userSelectsDimensionAs(String dimension) {
        $(dimensionsMenu).click();
        sleep(1000);
        if(dimension.equalsIgnoreCase("Large")){
            $(dimensionLarge).click();
            sleep(1000);
        }else {
            $(dimensionSmall).click();
        }
    }

    @And("user selects unit as {string}")
    public void userSelectsUnitAs(String unıt) {
        sleep(1000);
        $(unıtMenu).click();
        if(unıt.equalsIgnoreCase("unıts")){
            sleep(1000);
            $(unıtUnıts).click();
        }

    }

    @Then("price should be {double}")
    public void priceShouldBe(double price) {
        String p = String.valueOf(price);
        $(totalPrice).scrollIntoView(true).shouldBe(Condition.text(p));
    }
}
