public class Dog()
{
  private String firstName;
  private String lastName;

  public Dog(String fName, String lName)
  {
    firstName = fName;
    lastName = lName;
  }

  public String toString()
  {
    return "Dog's name is " + firstName + " " + lastName;
}
