package com.ShoppersStack.Generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility {
	Select sel;
public void Selectbyvalue(WebElement element,String Value)
{
	sel=new Select(element);
	sel.selectByValue(Value);
	
}

public void Selectbyindex(WebElement element,int index)
{
	sel=new Select(element);
	sel.selectByIndex(index);
}


public void SelectbyivsibleText(WebElement element,String Value)
{
	sel=new Select(element);
	sel.selectByVisibleText(Value);

}


public void Deselectbyvalue(WebElement element,String Value)
{
	sel=new Select(element);
	sel.deselectByValue(Value);
	
}

public void Deselectbyindex(WebElement element,int index)
{
	sel=new Select(element);
	sel.deselectByIndex(index);
	
}

public void SelectbyvisibleText(WebElement element,String Value)
{
	sel=new Select(element);
	sel.deselectByVisibleText(Value);
}

public void deselectAll(WebElement element,String Value)
{
	sel=new Select(element);
	sel.deselectAll();
	
}


public void  Actionsclass(WebDriver driver,WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
	
	
}
public void Getscreenshot(WebDriver driver,WebElement element) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("");
	FileHandler.copy(temp, dest);
}

}

