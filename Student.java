public class Student()
{
  private String firstName;
  private String lastName;
//  modifications
  private int grade;

  public Student(String fName, String lName, int theGrade)
  {
    firstName = fName;
    lastName = lName;
    grade = theGrade;
  }

  public String toString()
  {
    return "The name of this student is " + firstName + " " + lastName+ "with a grade of " + grade;
}
  
<<<<<<< Updated upstream
//  edits for dev branch: this comment
=======
//  comments to test dev branch
>>>>>>> Stashed changes
