public class Student()
{
  private String firstName;
  private String lastName;

  public Student(String fName, String lName)
  {
    firstName = fName;
    lastName = lName;
  }

  public String toString()
  {
    return "The name of this student is " + firstName + " " + lastName;
}
