package ru.vitalynec.java;

public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private String position;
    private String email;
    private String phone;
    private int salary;

    public int getAge() {
        return age;
    }

    int age;

    public Employee(String firstName, String lastName, String middleName, String position, String email, String phone, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

        if (middleName == null) {
            this.middleName = "";
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
