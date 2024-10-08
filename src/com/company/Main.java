package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	java Main is a class file
	objects
	primitve variables hold 1 value
	objects can perfom methods to do chunks of code
	a class = blueprint of what object will look like
	 */
        int x = 5;
        Student nate = new Student("Nate", "Levy");
        // you just type the quotations and the name and it will automatically print the theirFirstName and the theirLastName
        System.out.println(nate.getFirstName());
        nate.setFirstName("Nathaniel");
        System.out.println(nate.getFirstName());
       // System.out.print(nate.ge());

        nate.lastName = "Levi";
        System.out.println(nate.lastName);


        // for objects, use java keyword new
        // the object has all the values unique to the student
        Student andrew = new Student();
        // has unique attributes
        // class files are blueprints to make objects from
        // the new Student() creates a constructor
        // as soon as you provide your own specific constructor, it gets rid of the original one
        System.out.println(nate.getFirstName());
        nate.setFirstName("Nathaniel");
        System.out.println(nate.getFirstName());
        System.out.println("dsdhjshdjsjdhsj");
        nate.favoriteTeacher();

        // methods can also save us from having to do multiple lines of code over and over



    }

    public String getFullName() {
        return firstName + " " + lastName;
    }


}
