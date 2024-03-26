package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//span[text()='Products']")
    public WebElement header;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement dropdownSort;

    @FindBy(css = "#shopping_cart_container>a")
    public WebElement basket;

    public void sortProduct(String sortType){
        Select select = new Select(dropdownSort);
        select.selectByVisibleText(sortType);
    }

    public void addProduct(int i){
        Driver.get().findElement(By.xpath("(//button[text()='Add to cart'])["+i+"]")).click();
    }
    public void addProduct(String productName){
        Driver.get().findElement(By.xpath("//*[text()='"+productName+"']/../../../div[2]/button")).click();
    }
}
