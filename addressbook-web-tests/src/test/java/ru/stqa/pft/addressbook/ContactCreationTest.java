package ru.stqa.pft.addressbook;


import org.testng.annotations.*;


public class ContactCreationTest extends TestBase{


  @Test
  public void testContactCreation() throws Exception {
    initContactCreation();
    fillContactForm(new ContactData("John", "Middle", "New-York", "green@site.com", "+333334"));
    enterForm();
    goHome();
  }


}
