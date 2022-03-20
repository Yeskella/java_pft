package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTest extends TestBase{


  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("John", "Middle", "New-York", "green@site.com", "+333334"));
    app.getContactHelper().enterForm();
    app.getContactHelper().goHome();
  }


}