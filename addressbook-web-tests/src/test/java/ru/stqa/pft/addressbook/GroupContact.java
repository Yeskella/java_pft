package ru.stqa.pft.addressbook;

public class GroupContact {
  private final String name;
  private final String family;
  private final String address;
  private final String email;
  private final String phone;

  public GroupContact(String Name, String Family, String address, String email, String phone) {
    name = Name;
    family = Family;
    this.address = address;
    this.email = email;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public String getFamily() {
    return family;
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
}
