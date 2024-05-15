package patternmatching;

public class PatternMatching {

  public void patternMatchingInstanceOf(Object obj) {

    // OLD
    if (obj instanceof Contact) {
      Contact contact = (Contact) obj;
      System.out.println("Contact name: " + contact.getName());
    }

    // NEW Java 17
    if (obj instanceof Contact contact) {
      System.out.println(contact.getName());
    }
  }

  public class Contact {
    private final String name;

    public Contact(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }



}
