package com.groupeisi;

import org.junit.Test;

public class FactorielTest {
    // Test pour le factoriel de 4
    @Test
    public void testFactorielOne() {
        // Arrange : création de l'instance de Factoriel
        Factoriel factoriel = new Factoriel();

        // Act : calcul du factoriel pour n = 4
        long result = 24;
        int n = 4;

        // Assert : vérification que le résultat est correct
        assert(result == factoriel.calculateFactorial(n));
    }

    // Test pour le factoriel de 0
    @Test
    public void testFactorielZero() {
        // Arrange : création de l'instance de Factoriel
        Factoriel factoriel = new Factoriel();

        // Act : calcul du factoriel pour n = 0
        long result = 1;
        int n = 0;

        // Assert : vérification que le résultat est correct
        assert(result == factoriel.calculateFactorial(n));
    }

    // Test pour un nombre négatif, devrait retourner -1
    @Test
    public void testFactorielNegative() {
        // Arrange : création de l'instance de Factoriel
        Factoriel factoriel = new Factoriel();

        // Act : calcul du factoriel pour n = -5
        long result = -1;
        int n = -5;

        // Assert : vérification que le résultat est correct
        assert(result == factoriel.calculateFactorial(n));
    }

    // Test pour un grand nombre (par exemple n = 20)
    @Test
    public void testFactorielLargeNumber() {
        // Arrange : création de l'instance de Factoriel
        Factoriel factoriel = new Factoriel();

        // Act : calcul du factoriel pour n = 20
        long result = 2432902008176640000L;
        int n = 20;

        // Assert : vérification que le résultat est correct
        assert(result == factoriel.calculateFactorial(n));
    }
}
