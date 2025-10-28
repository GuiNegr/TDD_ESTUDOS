package org.example.banco;

import junit.framework.TestCase;
import org.junit.Test;

public class JurosTest extends TestCase {

    @Test
    public void testCalculoJuros() {
        Juros juros = new Juros();
        assertEquals(500.0,juros.calculoJuros(250.0));
    }
}