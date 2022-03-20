package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletions() {
    app.getContactHelper().submitEditMifications();
    app.getContactHelper().submitDeletedContact();

  }
}
