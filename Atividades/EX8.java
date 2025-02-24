import java.util.Arrays;
import java.util.Scanner;


public class EX8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] nome = new String[5];

        System.out.println("Digite 5 nomes: ");

        for (int i = 0; i < 5; i++){
            nome[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(nome));

    }
}