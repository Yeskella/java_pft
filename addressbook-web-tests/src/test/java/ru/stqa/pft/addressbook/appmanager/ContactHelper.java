package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

  public void fillContactForm(ContactData ContactData) {
    type((By.name("firstname")), ContactData.getName());
    type((By.name("lastname")), ContactData.getLastname());
    type((By.name("address")), ContactData.getAddress());
    type((By.name("email")), ContactData.getEmail());
    type((By.name("home")), ContactData.getPhone());

  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void submitEditMifications() {
    click(By.xpath("//img[@alt='Edit']"));

  }

  public void submitUpdateContact() {
    click(By.xpath("//div[@id='content']/form/input[22]"));

  }

  public void submitDeletedContact() {
    click(By.xpath("//div[@id='content']/form[2]/input[2]"));
  }
}
