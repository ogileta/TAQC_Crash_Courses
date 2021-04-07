import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter c");
        int c = sc.nextInt();
        System.out.println("enter x");
        int x = sc.nextInt();
        System.out.println("enter y");
        int y = sc.nextInt();

        if (((a <= 0) | (b <= 0) | (c <= 0) | (x <= 0) | (y <= 0))) {
            System.out.println("wrong data");
        } else {
            if (((a < x) & (b < y)) | ((b < x) & (a < y)) |
                    ((b < x) & (c < y)) | ((c < x) & (b < y)) |
                    ((a < x) & (c < y)) | ((c < x)) & ((a < y))) {
                System.out.println("passes through");
            } else {
                System.out.println("doesnt pass through");
            }
        }
    }
}

