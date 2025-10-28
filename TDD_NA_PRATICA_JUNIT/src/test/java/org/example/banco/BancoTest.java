package org.example.banco;

import junit.framework.TestCase;
import org.junit.Test;

public class BancoTest extends TestCase {

    @Test
    public void testSaldoDivida() {
        Banco banco = new Banco();
        assertEquals(700.0,banco.saldoDivida(300));
    }
}