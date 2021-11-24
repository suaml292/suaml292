package com.example.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.sample.test.demo.TestBase;

import junit.framework.Assert;

public class OrderPizza extends TestBase {
	

	public void selectPizzaType(String pizzatype) {
		Select pizzaList = new Select(driver.findElement(By.id("pizza1Pizza")));
		pizzaList.selectByVisibleText(pizzatype);
	}
	
	public void selectPizzatopping(String pizzatopping) {
		Select toppingList = new Select(driver.findElement(By.xpath("//div[@id='pizza1']//select[@class='toppings1']")));
		toppingList.selectByVisibleText(pizzatopping);
	}

	public void enterQuantity(String quantity) {
		driver.findElement(By.id("pizza1Qty")).sendKeys(quantity);
	}

	public void enterName(String name) {
		driver.findElement(By.id("name")).sendKeys(name);
	}

	public void enterEmail(String enteremail) {
		driver.findElement(By.id("email")).sendKeys(enteremail);
	}

	public void enterPhoneNumber(String enterphone) {
		driver.findElement(By.id("phone")).sendKeys(enterphone);
	}

	public void clickCashPaymentType() {
		driver.findElement(By.id("cashpayment")).click();
	}

	public void selectCashPaymentType() {
		driver.findElement(By.id("ccpayment")).click();
	}

	public void clickPlaceOrder() {
		driver.findElement(By.id("placeOrder")).click();
	}

	public void assertMessageInDiallogBox(String expectedMessage) {
		String actualMessage = driver.findElement(By.xpath("//div[@id='dialog']/p")).getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	public void clickResetButton() {
		driver.findElement(By.id("reset")).click();
	}

}
