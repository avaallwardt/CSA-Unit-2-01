package com.company;

public class  Student {
    // Student class name matches the file name
    private double gpa;
    private int gradeLevel;
    private int numOfAPCourses;
    private int age;
    private String firstName;
    private String lastName;
    private String activeSport;

    // each of these variables has an access modifier in the class
    // it auto types in public before each variable
    // in java, public makes it available
    // to make it not available, change it all to private so that you can only refer to it in the class
    // bc they are private, you no longer have permission to view them
    public Student() {

    }
// the above is the format for a constructor in java
    // java gives you an empty one by default when you make a student

    public Student(String theirFirstName, String theirLastName) {
        firstName = theirFirstName;
        lastName = theirLastName;


    }

    public String getFirstName() {
        // replace void with the type of variable
        // when you call the action, whatever in the set will run
        // makes getFirstName available for nate
        return firstName;
        // we can't leave the variables on public bc it is not a best practice
    }

    public void setFirstName(String newName) {
        // creates a temporary string variablewhile the method is running
    }

    public void favoriteTeacher() {
        System.out.println("My favorite teacher?");
        System.out.println("Mr. U of course");
        // change String to void
    }
}
