package practice.constuctors;
//package com.xyram.practice.abs.services.impl;
//Write a Java program to create a class called "Cat" with instance variables name and age.
// Implement a default constructor that initializes the name to "Unknown" and the age to 0.
// Print the values of the variables.
class cat{
    String name;
    int age;

    cat(){
        this.name="Unknown";
        this.age=0;
    }
}
public class Default {
    public static void main(String[] args) {
        cat c = new cat();
        System.out.println(c.name+"\n"+c.age);
    }
}
