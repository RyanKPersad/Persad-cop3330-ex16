package Driving_Age;
import java.util.Scanner;

/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */

public class App 
{
    static  Scanner myObj = new Scanner(System.in);

    public static void main( String[] args )
    {
        String age;
        int legal_age = 16;

        System.out.println( "What is your age?" );
        age = myObj.nextLine();
        //convert to int
        int new_age = Integer.parseInt(age);
        //ternary operator to compare age
        String result = (new_age >= legal_age)?"You are old enough to legally drive.":"You are not old enough to legally drive.";

        System.out.println(result);
    }
}
