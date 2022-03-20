package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String lastname;
  private final String address;
  private final String email;
  private final String phone;
  private final String group;

  public ContactData(String name, String family, String address, String email, String phone, String group)  {
    this.name = name;
    this.lastname = family;
    this.address = address;
    this.email = email;
    this.phone = phone;
    this.group = group;

  }

  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }

  public String getPhone() {
    return phone;
  }

  public String getGroup() {
    return group;
  }
}
