package Day_04;

import java.util.*;

public class intToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        try {
            // Convert integer to string
            String s = Integer.toString(n);

            // Parse the string back to integer and compare
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
        sc.close();
    }
}
