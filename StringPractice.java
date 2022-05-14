//Take an array of Strings inputs from the user & find the cumulative (combined) length of all those strings.

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Strings : ");
        int size = sc.nextInt();
        String array[] = new String[size];
        int totlength=0;

        for (int i=0; i<size; i++){
            array[i] = sc.next();
            totlength += array[i].length();
        }
        System.out.println("Total length of Strings are : "+ totlength);
    }
}
