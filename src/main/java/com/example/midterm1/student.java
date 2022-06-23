package com.example.midterm1;

public class student {

    private int StudentNumber;
    private String FirstName;
    private String LastName;
    private String Gender;
    private int TelephoneNumber;
    private String Province;
    private int AverageGrade;
    private int Majorcode;

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        StudentNumber = studentNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        TelephoneNumber = telephoneNumber;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public int getAverageGrade() {
        return AverageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        AverageGrade = averageGrade;
    }

    public int getMajorcode() {
        return Majorcode;
    }

    public void setMajorcode(int majorcode) {
        Majorcode = majorcode;
    }

    public student(int studentNumber, String firstName, String lastName, String gender, int telephoneNumber, String province, int AverageGrade, int majorcode) {
        StudentNumber = studentNumber;
        FirstName = firstName;
        LastName = lastName;
        Gender = gender;
        TelephoneNumber = telephoneNumber;
        Province = province;
        AverageGrade = AverageGrade;
        Majorcode = majorcode;
    }
}
