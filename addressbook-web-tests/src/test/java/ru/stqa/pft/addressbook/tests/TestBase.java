package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;


public class TestBase {


  public final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }


  @AfterMethod
  public void tearDown() throws Exception {
    app.stop();
  }


}
