package ch06;

public class Student {
    
    //member variable
    public int studentID;
    public String studentName;
    public int grade;
    // member variable is initated by constructor


    // We can use 2 constructor.

    // Default constructor
    //public Student() {
    //    
    //}

    // Constructor
    // init member variable when is called by client
    public Student(int studentID, String studentName, int grade) {

        this.studentID = studentID;     // this : indicate member variable
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {

        return studentName + studentID + grade;
    }
}