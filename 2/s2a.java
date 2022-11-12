/*Write a multithreading program in java to display all the vowels from a given String. */

import java.util.*;

class Vowels extends Thread {
    String s1;

    Vowels(String s) {
        s1 = s;
        start();
    }

    public void run() {
        System.out.println("Vowels are  ");
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                System.out.print(" " + ch);
        }
    }
}

public class s2a {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = sn.nextLine();
        sn.close();  
        new Vowels(str1);
    }
}
