package org.example.Cliente;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class CarroAlugadoTest {
    @Mock
    private AlugaCarro alugaCarro;

    public CarroAlugadoTest(){
        alugaCarro = Mockito.mock(Cliente.class);
    }

    @Test
    public void alugaCarroParaCliente(){
        CarroAlugado car = new CarroAlugado(alugaCarro);
        String resultado = "Camilo Golf";

        Mockito.when(alugaCarro.getNomeCliente()).thenReturn("Camilo");
        Mockito.when(alugaCarro.getModeloCarro()).thenReturn(" Golf");

        String mockitoResultado = car.getaLugaCarro().getNomeCliente() + car.getaLugaCarro().getModeloCarro();

        Mockito.verify(alugaCarro).getNomeCliente();
        assertEquals(resultado,mockitoResultado);
    }


}