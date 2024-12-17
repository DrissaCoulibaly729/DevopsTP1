package org.example;

public class Factoriel {

    public int factoriel(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++ ) {
            f = f * i;
        }
        return f;
    }
}
