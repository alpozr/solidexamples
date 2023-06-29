package singleresp;


public class Student {

    private String fullName ;
    private int studentNumber;

    public Student(String fullName,int studentNumber){
        this.fullName=fullName;
        this.studentNumber=studentNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }


}
