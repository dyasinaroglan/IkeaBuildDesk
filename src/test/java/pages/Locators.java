package pages;

import org.openqa.selenium.By;

public interface Locators {

    String url = "https://www.ikea.com/us/en/planners/";
    By designOwnDesk = By.xpath("//h2[text()='Design your own desk']");
    By iframeConfig = By.cssSelector("iframe.planner-iframe");
    By configurationMenu = By.cssSelector("div#configuration-menu");
    By dimensionsMenu = By.xpath("(//div[@class='menu-button'])[1]");
    By dimensionLarge = By.xpath("//i[@title='Large']//parent::li");
    By dimensionSmall = By.xpath("//i[@title='Small']//parent::li");
    By unıtMenu = By.xpath("(//div[@class='menu-icon'])[2]");
    By unıtUnıts = By.xpath("//i[@title='Units']//parent::li");
    By totalPrice = By.cssSelector("div.TotalPrice__simple span.IKEA__price-amount");

}
