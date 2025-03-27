package edu.eci.cvds;
import static org.junit.jupiter.api.Assertions.*;
        import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.time.LocalDateTime;

public class PagoTest {

    @Test
    public void testCrearPagoPendiente() {
        Usuario usuario = new Usuario("Luis Gómez", "luis@example.com");
        Articulo articulo = new Articulo("Audífonos", 50.00, 10);
        Compra compra = new Compra(usuario, Arrays.asList(articulo));
        Pago pago = new Pago(compra, "Tarjeta de Crédito");

        assertEquals("PENDIENTE", pago.getEstado());
        assertNotNull(pago.getFechaPago());
        assertEquals("Tarjeta de Crédito", pago.getMetodoPago());
    }

    @Test
    public void testAprobarPago() {
        Usuario usuario = new Usuario("Carlos Díaz", "carlos@example.com");
        Articulo articulo = new Articulo("Tablet", 300.00, 5);
        Compra compra = new Compra(usuario, Arrays.asList(articulo));
        Pago pago = new Pago(compra, "PayPal");

        pago.aprobarPago();

        assertEquals("APROBADO", pago.getEstado());
    }

    @Test
    public void testRechazarPago() {
        Usuario usuario = new Usuario("María López", "maria@example.com");
        Articulo articulo = new Articulo("Teclado Mecánico", 120.00, 3);
        Compra compra = new Compra(usuario, Arrays.asList(articulo));
        Pago pago = new Pago(compra, "Bitcoin");

        pago.rechazarPago();

        assertEquals("RECHAZADO", pago.getEstado());
    }
}


