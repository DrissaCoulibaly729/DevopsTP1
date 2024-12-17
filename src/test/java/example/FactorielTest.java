package example;

import org.example.Factoriel;
import org.junit.Test;

public class FactorielTest {
    @Test
    public void testFactorielOne() {
        //g
        Factoriel factoriel = new Factoriel();

        //w
        int result = 24;
        int n = 4;

        //T
        assert(result == factoriel.factoriel(n));
    }
    @Test
    public void testFactoriel0() {
        //g
        Factoriel factoriel = new Factoriel();

        //w
        int result = 1;
        int n = 0;

        //T
        assert(result == factoriel.factoriel(n));
    }
}
