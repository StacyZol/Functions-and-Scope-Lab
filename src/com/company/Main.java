package com.company;

import java.util.Scanner;

public class Main {

    public static int parameterCount(String... vars) {
        return vars.length;

    }
    public static void parameterCount2(String... vars) {
        System.out.println(vars.length);
    }
    public static int stringLength(String apple){
        return apple.length();
    }
    public static String longestString(String a, String b) {
        if (a.length() > b.length() ) {
            return a;
        }
        else {
            return b;
        }
    }
    public static void askQuestion(){
        System.out.println("What's your name?");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        System.out.println(userInput);
    }
    /*public static void typeQuit() {
        System.out.println("Please print something");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if (userString.equals("pencil")){
    }
    */
    public static void main(String[] args) {
        System.out.println(parameterCount("Two", "Three"));
        parameterCount2("Two", "Three");
        parameterCount2("a", "b", "c");
        System.out.println(stringLength("boy"));
        String str = "boy";
        System.out.println(longestString("boy", "girl"));
        askQuestion();
        //typeQuit();
    }



}