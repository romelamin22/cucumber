package features.steps_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationGlue {

    WebDriver driver;

    @Given("user launches browser")
    public void user_launches_browser() {
        driver = new ChromeDriver();
    }
    @When("user enters the url")
    public void user_enters_the_url() {
        driver.get("https://www.amazon.com/");
    }
    @When("user clicks on clinic link")
    public void user_clicks_on_clinic_link() {
        driver.findElement(By.xpath("//div[@id='nav-xshop']//a[@data-csa-c-content-id='nav_cs_clinic']")).click();
    }

    @Then("user is navigated to clinic page")
    public void user_is_navigated_to_clinic_page() {
        driver.quit();
    }



}
