package com.groupeisi;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre pour calculer son factoriel: ");
        int nombre = scanner.nextInt();
        long resultat = Factoriel.calculateFactorial(nombre);
        System.out.println("Le factoriel de " + nombre + " est : " + resultat);


        scanner.close();
    }


}