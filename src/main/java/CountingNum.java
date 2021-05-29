import java.util.Scanner;

public class CountingNum {
    public static void main(String[] args){
        System.out.print("What is the input string? ");
        Scanner input = new Scanner(System.in);
        String string = input.next();
        int length = string.length();
        System.out.printf("%s has %d characters.", string, length);
    }
}
