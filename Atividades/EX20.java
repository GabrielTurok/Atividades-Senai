import java.util.Random;
import java.util.Scanner;

public class EX19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [][] n = new int[3][3];

        System.out.println("Digite os numeros da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int b = 0; b < 3; b++) {
                n[i][b] = sc.nextInt();
            }
        }

        System.out.println("Matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int b = 0; b < 3; b++) {
                System.out.print(n[i][b]);
            }
        }

        System.out.println("Matriz transposta:");

        for (int i = 0; i < 3; i++) {
            for (int b = 0; b < 3; b++) {
                System.out.print(n[b][i]);
            }
        }
    }
}