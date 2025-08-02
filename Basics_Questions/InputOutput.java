import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Int1 = scanner.nextInt();
        int Int2 = scanner.nextInt();
        int Int3 = scanner.nextInt();
        scanner.close();

        System.out.println(Int1);
        System.out.println(Int2);
        System.out.println(Int3);
    }
}
