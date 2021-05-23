package ch16;

public class Employee {

    public static int serialNum = 1000; // static variable is on the Data region when processing
    
    private int employeeId;
    private String employeeName;
    private String department;


    // public static int getSerialNum() {  // it can be used before declare in main

    //     int i = 0;                // local variable

    //     employeeName = "lee";     // instance variable
    //                               // we can't use employeeId(member var) in static method
    //                               // we can use this in public method

    //     return serialNum;         // static variable
    // }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
}
