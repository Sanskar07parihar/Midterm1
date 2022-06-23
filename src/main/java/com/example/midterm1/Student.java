package com.example.midterm1;

import java.util.Arrays;
import java.util.List;

public class Student {
    public int getStudent_number() {
        return student_number;
    }

    public void setStudent_number(int student_number) {
        if(student_number > 200034000 && student_number < 200070000){
            this.student_number = student_number;

        }else{
            throw new IllegalArgumentException("Invalid StudentNumber");
        }
        this.student_number = student_number;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(String telephone_number) {
        if (telephone_number.matches("[02-9]\\d{0,9}")) {
            this.telephone_number = telephone_number;
        }
        else {
            this.telephone_number = "Invalid TelephoneNumber";
        }
        this.telephone_number = telephone_number;
    }

    public int getAverage_grade() {
        return average_grade;
    }

    public void setAverage_grade(int average_grade) {
        if(average_grade > 0 && average_grade < 100){
            this.average_grade = average_grade;
        }else{
            throw new IllegalArgumentException("Average grade must be 1-100");
        }
        this.average_grade = average_grade;
    }

    public String getMajor_code() {
        return major_code;
    }

    public void setMajor_code(String major_code) {
        for (int j = 0; j < 4; j++) {
            if (Character.isUpperCase(major_code.charAt(j))) {
                this.major_code = major_code;
            }else{
                throw new IllegalArgumentException("Major code should be in uppercase");
            }
        }
        this.major_code = major_code;
    }

    public String getFirst_name() {

        return first_name;
    }

    public void setFirst_name(String first_name) {
        if(first_name.length() > 1){
            this.first_name = first_name;
        }else{
            throw new IllegalArgumentException("Invalid First name");
        }
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        if(last_name.length() > 1){
            this.last_name = last_name;
        }else{
            throw new IllegalArgumentException("Invalid Last name");
        }
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {

        List<String> provincename= Arrays.asList("AB", "BC", "MB", "NB", "NL", "NS", "NT", "NU", "ON", "PE", "QC", "SK", "YT");
        if(provincename.contains(province))
        {
            this.province = province;
        }
        else
        {
            throw new IllegalArgumentException(province + "is not valid");
        }

    }

    public Student(int student_number, String telephone_number, int average_grade, String major_code, String first_name, String last_name, String gender, String province) {
        this.student_number = student_number;
        this.telephone_number = telephone_number;
        this.average_grade = average_grade;
        this.major_code = major_code;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.province = province;
    }

    private int student_number, average_grade;
    private String first_name, last_name, gender, province, telephone_number, major_code;
}