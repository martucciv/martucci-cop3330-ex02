package ex02;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */

import java.util.Scanner;

public class CountingNum {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        CountingNum count = new CountingNum();
        String string = count.readInput();
        int length = count.getLength(string);
        count.printOutput(string, length);
    }

    public String readInput(){
        System.out.print("What is the input string? ");
       return input.nextLine();
    }

    public int getLength(String string){
        return string.length();
    }

    public void printOutput(String string, int length){
        System.out.printf("%s has %d characters.", string, length);
    }
}
