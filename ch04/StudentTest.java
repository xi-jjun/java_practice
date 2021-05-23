package ch04;

public class StudentTest {
    
    public static void main(String[] args) {

    //  <data type>  <variable>  <make instance>   <Class>
    //  < Student > <studentLee>      <new>      <Student()>
        Student studentLee = new Student(); // "studentLee" is instance
        // "studentLee" is reference variable in stack, 
        // and value is start address of "Class Student" member variable in heap.

        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "Seoul";

        studentLee.showStudentInfo();
    }
}