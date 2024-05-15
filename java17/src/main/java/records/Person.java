package records;

// IDEA wants to turn this into a Record
public class Person {

  private final String firstName;
  private final String lastName;
  private final String email;


  public Person(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return "PersonClass: %s, %s, %s".formatted(firstName, lastName, email);
  }

  // This record is the same as the Person class.
  // Record class is implicitly final, so you can't extend it. Otherwise, it's a normal class.
  public record PersonRecord(String firstName, String lastName, String email) { }


  // What else can you do in a record?
  public record PersonRecordExtendedExample(String firstName, String lastName, String email) {

    static {
      // You can have static initializer
    }

    // Can have static fields
    static double numero = 1.2;

    // Can have static methods
    public static double getNumero() {
      return numero;
    }

    // Can't declare instance fields in a Record
//    private int instanceNumber;

    // Canonical constructor
//    public PersonRecordExtendedExample(String firstName, String lastName, String email) {
//      this.firstName = firstName;
//      this.lastName = lastName;
//      this.email = email;
//    }

    // Compact constructor
    public PersonRecordExtendedExample {
      // Can't do this, it happens automatically in a compact constructor
//      this.firstName = "word";
    }


    // Override instance getters
    @Override
    public String email() {
      return firstName + " Explicit getter declaration";
    }

    // Declare instance method
    public void doSomeStuff() {
      System.out.println("I will do some stuff here");
    }

    // Could declare a nested class if you want to.


  }

  public static void main(String[] args){

    System.out.println("""
      A record declaration specifies in a header a description of its contents; 
      the following are created:
        * accessors
        * constructor
        * equals
        * hashCode
        * toString
      A record's fields are final because the class is intended to serve as a simple "data carrier".
    """);
    System.out.println(new Person("jef", "smith", "jeff@mail.com"));
    System.out.println(new PersonRecord("bob", "Joe", "bob@email.com"));
  }


}
