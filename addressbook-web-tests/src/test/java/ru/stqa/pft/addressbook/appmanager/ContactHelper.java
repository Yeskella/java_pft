package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void goHome() {
    wd.findElement(By.linkText("home page")).click();
  }

  public void enterForm() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type((By.name("firstname")), contactData.getName());
    type((By.name("lastname")), contactData.getLastname());
    type((By.name("address")), contactData.getAddress());
    type((By.name("email")), contactData.getEmail());
    type((By.name("home")), contactData.getPhone());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementsPresent(By.name("new_group")));
    }

  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void switchToContactEditing() {
    click(By.xpath("//img[@alt='Edit']"));

  }

  public void submitUpdateContact() {
    click(By.xpath("//div[@id='content']/form/input[22]"));

  }

  public void submitDeletedContact() {
    click(By.xpath("//div[@id='content']/form[2]/input[2]"));
  }
}
