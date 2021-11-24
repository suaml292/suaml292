package com.sample.test.demo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.example.test.pages.OrderPizza;
import com.sample.test.demo.TestBase;

import junit.framework.Assert;

public class DemoTest extends TestBase {

	OrderPizza orderpizza = new OrderPizza();
	
	
	@Test(priority=1)
	public void pizzaOrderWithCashPayment() {
		
		orderpizza.selectPizzaType("Small 6 Slices - 1 topping $7.50");
		orderpizza.enterQuantity("5");
		orderpizza.enterName("Sulman");
		orderpizza.enterEmail("sulman.islam@gmail.com");
		orderpizza.enterPhoneNumber("4103014296");
		orderpizza.clickCashPaymentType();
		orderpizza.clickPlaceOrder();
		orderpizza.assertMessageInDiallogBox("Thank you for your order! TOTAL: 37.5 Small 6 Slices - 1 topping");
		orderpizza.clickResetButton();


	}

	
	
	
	
	@Test(priority=2)
	public void missingMendatoryInformation() throws InterruptedException {
		
		orderpizza.selectPizzaType("Small 6 Slices - 1 topping $7.50");
		orderpizza.enterQuantity("5");
		orderpizza.enterName("");
		orderpizza.enterEmail("sulman.islam@gmail.com");
		orderpizza.enterPhoneNumber("4103014296");
		orderpizza.clickCashPaymentType();
		orderpizza.clickPlaceOrder();
		orderpizza.assertMessageInDiallogBox("Missing name");
		orderpizza.clickResetButton();


	}
	
	
	
}
