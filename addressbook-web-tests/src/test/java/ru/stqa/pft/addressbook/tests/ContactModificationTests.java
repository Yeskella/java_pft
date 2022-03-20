package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModifications() {

    app.getContactHelper().submitEditMifications();
    app.getContactHelper().fillContactForm(new ContactData("John", "Middle", "New-York", "green@site.com", "+333334"));
    app.getContactHelper().submitUpdateContact();
    app.getContactHelper().goHome();
  }
}
