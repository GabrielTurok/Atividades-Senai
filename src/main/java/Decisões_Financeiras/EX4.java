package Decisões_Financeiras;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Valor do produto: ");
        double valor = sc.nextFloat();
        System.out.print("Informe seu salário: ");
        double sal = sc.nextFloat();


        double parcela = valor / 5;
        double porcentsal = sal * 0.1;

        if (porcentsal > parcela) {
            System.out.println("Você pode comprar este produto parcelado");
        } else {
            System.out.println("Você não pode parcelar este produto");
        }
    }
}