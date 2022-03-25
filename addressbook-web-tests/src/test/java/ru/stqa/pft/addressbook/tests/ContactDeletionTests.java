package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletions() {
    if (! app.getContactHelper().isThereAContact()) {
       app.getContactHelper().createContact(new ContactData("John", "Middle", "New-York", "green@site.com", "+333334", "test1"), true);
    }
    app.getContactHelper().switchToContactEditing();
    app.getContactHelper().submitDeletedContact();

  }
}
