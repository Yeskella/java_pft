package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{


  public NavigationHelper(WebDriver wd) {
    super (wd);
  }

  public void gotoGroupPage() {
    if (isElementsPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementsPresent(By.name("new"))) {
          return;
    }

      click(By.linkText("groups"));
    }

  public void logoutWeb() {
    click(By.linkText("Logout"));
  }


}
