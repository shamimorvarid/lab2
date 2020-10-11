public class Lab {
    private Student[] students = new Student[100];
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;
    private int index;
    private int sum;
    public Lab(int cap, String d) {
        // the lab's capacity
        // the lab's day
        capacity = cap;
        day = d;
    }

    /**
     * initializing an array of student with lab'students
     * @param std students of array
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        }
        else {
            System.out.println("Lab is full!!!"); }
    }
    /**
     * Print the student’s last name and ID number and grade to the output terminal.
     */
    public void print() {
        System.out.println(students[0].getLastName() +", student id = " + students[0].getId() + ", grade:" + students[0].getGrade());
        System.out.println(students[1].getLastName() +", student id = " + students[1].getId() + ", grade:" + students[1].getGrade());
        System.out.println(students[2].getLastName() +", student id = " + students[2].getId() +  ", grade:" + students[2].getGrade());
        System.out.println("the avg is: " + avg);
    };
    /**
     * get the students of lab
     * @return students field
     */
    public Student[] getStudents() {
        return students;
    };
    /**
     * @param students set students of a lab
     */
    public void setStudents(Student[] students) {
        this.students = students;
    };
    /**
     * get the average of grades
     * @return avg field
     */
    public int getAvg() {
        return avg;
    };

    /**
     * calculate average of student's grade of lab
     * does not return anything
     */
    public void calculateAvg() {
        while(index<currentSize) {
            sum = sum + students[index].getGrade();
            index++;
        }
        avg = sum/currentSize;
    };
    /**
     * get the day of lab
     * @return day field
     */
    public String getDay() {
        return day;
    };
    /**
     * @param day set day of a lab
     */
    public void setDay(String day) {
        this.day = day;
    };
    /**
     * get the capacity of lab
     * @return capacity field
     */
    public int getCapacity() {
        return capacity;
    };
    /**
     * @param capacity set capacity of a lab
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    };



}