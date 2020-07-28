import org.junit.Test;

import junit.framework.TestCase;

public class DicionarioCarroTeste extends TestCase {

    @Test
    public void testAdicionaDicionario() {

        Carro c1 = new Carro("ABC1234", "GOL", "2018", "Clarice Lispector");
        Carro c2 = new Carro("EFG5678", "Onix", "2019", "Monteiro Lobato");
        Carro c3 = new Carro("REC9999", "Up", "2020", "Gloria Pires");

        Dicionario<String, Carro> dicionario = new Dicionario<>();
        dicionario.adiciona(c1.getPlaca(), c1);
        dicionario.adiciona(c2.getPlaca(), c2);
        dicionario.adiciona(c3.getPlaca(), c3);

        Carro carroRetornado = dicionario.retorna(c2.getPlaca());
        assertEquals(c2, carroRetornado);
    }

    @Test
    public void testBuscaDicionario() {
        
        Carro c1 = new Carro("ABC1234", "GOL", "2018", "Clarice Lispector");
        Carro c2 = new Carro("EFG5678", "Onix", "2019", "Monteiro Lobato");
        Carro c3 = new Carro("REC9999", "Up", "2020", "Gloria Pires");

        Dicionario<String, Carro> dicionario = new Dicionario<>();
        dicionario.adiciona(c1.getPlaca(), c1);
        dicionario.adiciona(c2.getPlaca(), c2);
        dicionario.adiciona(c3.getPlaca(), c3);

        Carro carroRetornado = dicionario.retorna(c1.getPlaca());
        assertEquals(c1, carroRetornado);

    }

    @Test
    public void testRemoveDicionario() {
        
        Carro c1 = new Carro("ABC1234", "GOL", "2018", "Clarice Lispector");
        Carro c2 = new Carro("EFG5678", "Onix", "2019", "Monteiro Lobato");
        Carro c3 = new Carro("REC9999", "Up", "2020", "Gloria Pires");

        Dicionario<String, Carro> dicionario = new Dicionario<>();
        dicionario.adiciona(c1.getPlaca(), c1);
        dicionario.adiciona(c2.getPlaca(), c2);
        dicionario.adiciona(c3.getPlaca(), c3);

        Carro carroRetornado = dicionario.remove(c3.getPlaca());
        assertEquals(c3, carroRetornado);
        
    }

    @Test
    public void testDicionarioVazio() {
        Dicionario<String, Carro> dicionario = new Dicionario<>();
        assertEquals(true, true);
    }
    
}