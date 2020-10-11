/**
 * the student class represents a student in a student administration system.
 * it holds the student details relevant in our context.
 *
 * @author shamim
 * @version 0.0
 */
public class Student {
    // the student's first name
    private String firstName;
    // the student's last name
    private String lastName;
    // the student ID
    private String id;
    // the grade
    private int grade;
    /**￼￼
     * Create a new student with a given name and ID number. *
     * @param fName first name of student
     * @param lName last name of student
     * @param sID student ID
    */
        public Student(String fName, String lName, String sID){
            firstName = fName;
            lastName = lName;
            id = sID;
            grade = 0;
        }
    /**
     * @param fName set first name of a student
     */
        public void setFirstName(String fName){
            firstName = fName;
        }
        /**
         * get the grade of student
         * @return firstName field
         */
    public String getFirstName(){
        return firstName;
    }
    /**
     * @param lName set lastName of a student
     */
    public void setLastName(String lName){
        lastName = lName;
    }
    /**
     * get the lastName of student
     * @return lastName field
     */
    public String getLastName(){
        return lastName;
    }
    /**
     * @param sID set id of a student
     */
    public void setId(String sID){
        id = sID;
    }
    /**
     * get the id of student
     * @return id field
     */
    public String getId(){
        return id;
    }
    /**
     * @param newGrade set grade of a student
     */
    public void setGrade(int newGrade){
        grade = newGrade;
    }
    /**
     * get the grade of student
     * @return grade field
    */
        public int getGrade(){
            return grade;
        }
        /**
         * Print the student’s last name and ID number to the output terminal.
         */
    public void print(){
        System.out.println(lastName + ", student ID: " + id + ", grade: " +grade);
    }
}
