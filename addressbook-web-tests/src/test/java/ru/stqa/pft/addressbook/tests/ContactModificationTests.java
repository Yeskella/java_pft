package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModifications() {
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("John", "Middle", "New-York", "green@site.com", "+333334", "test1"), true);
    }
    app.getContactHelper().switchToContactEditing();
    app.getContactHelper().fillContactForm(new ContactData("John",
            "Middle",
            "New-York",
            "green@site.com",
            "+333334",
            null), false);
    app.getContactHelper().submitUpdateContact();
    app.getContactHelper().goHome();
  }
}
