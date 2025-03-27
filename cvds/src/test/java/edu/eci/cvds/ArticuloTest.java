package edu.eci.cvds;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArticuloTest {

    @Test
    public void testCrearArticuloCorrecto() {
        Articulo articulo = new Articulo("Laptop", 2500.00, 10);

        assertEquals("Laptop", articulo.getNombre());
        assertEquals(2500.00, articulo.getPrecio(), 0.01);
        assertEquals(10, articulo.getCantidadDisponible());
    }

    @Test
    public void testModificarPrecioArticulo() {
        Articulo articulo = new Articulo("Tablet", 500.00, 5);
        articulo.setPrecio(450.00);

        assertEquals(450.00, articulo.getPrecio(), 0.01);
    }

    @Test
    public void testCantidadDisponibleNegativa() {
        Articulo articulo = new Articulo("Mouse", 25.00, -5);

        assertTrue(articulo.getCantidadDisponible() < 0);
    }
}
