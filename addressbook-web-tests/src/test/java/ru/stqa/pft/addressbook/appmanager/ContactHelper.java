package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import ru.stqa.pft.addressbook.model.GroupDataContact;

public class ContactHelper {




  public void goHome() {
    wd.findElement(By.linkText("home page")).click();
  }

  public void enterForm() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void fillContactForm(GroupDataContact groupDataContact) {
    type(By.name("firstname"), groupDataContact.getName());
    type(By.name("lastname"), groupDataContact.getName());
    type(By.name("address"), groupDataContact.getName());
    type(By.name("email"), groupDataContact.getName());
    type(By.name("home"), groupDataContact.getName());
  }

  private void type(By locator, String text) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  public void initContactCreation() {
    wd.findElement(By.linkText("add new")).click();
  }
}
