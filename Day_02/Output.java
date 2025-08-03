package Day_02;

import java.util.*;

public class Output {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Consume the leftover newline
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
