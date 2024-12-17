package com.groupeisi;

public class Factoriel {
    public static long calculateFactorial(int number) {
        if (number < 0) {
            System.out.println("Le factoriel n'existe pas pour les nombres négatifs");
            return -1;
        }

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
