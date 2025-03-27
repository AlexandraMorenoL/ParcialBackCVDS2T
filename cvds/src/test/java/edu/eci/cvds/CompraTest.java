package edu.eci.cvds;

import static org.junit.jupiter.api.Assertions.*;
        import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.time.LocalDate;

public class CompraTest {

    @Test
    public void testCrearCompraCorrecta() {
        Usuario usuario = new Usuario("Juan Pérez", "juan@example.com");
        Articulo articulo1 = new Articulo("Teclado", 30.00, 5);
        Articulo articulo2 = new Articulo("Monitor", 200.00, 3);
        Compra compra = new Compra(usuario, Arrays.asList(articulo1, articulo2));

        assertEquals("Juan Pérez", compra.getUsuario().getNombre());
        assertEquals(230.00, compra.getTotal(), 0.01);
        assertEquals(2, compra.getArticulos().size());
        assertEquals(LocalDate.now(), compra.getFecha());
    }

    @Test
    public void testCompraSinArticulos() {
        Usuario usuario = new Usuario("Ana Gómez", "ana@example.com");
        Compra compra = new Compra(usuario, Arrays.asList());

        assertEquals(0, compra.getTotal());
    }

    @Test
    public void testModificarArticulosEnCompra() {
        Usuario usuario = new Usuario("Pedro Ruiz", "pedro@example.com");
        Articulo articulo1 = new Articulo("Mouse", 25.00, 4);
        Compra compra = new Compra(usuario, Arrays.asList(articulo1));

        Articulo articulo2 = new Articulo("Laptop", 1000.00, 2);
        compra.setArticulos(Arrays.asList(articulo1, articulo2));

        assertEquals(1025.00, compra.getTotal(), 0.01);
    }
}