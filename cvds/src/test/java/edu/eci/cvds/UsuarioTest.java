package edu.eci.cvds;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void testCrearUsuarioCorrecto() {
        Usuario usuario = new Usuario("Juan Pérez", "juan@example.com");

        assertEquals("Juan Pérez", usuario.getNombre());
        assertEquals("juan@example.com", usuario.getEmail());
    }

    @Test
    public void testModificarNombreUsuario() {
        Usuario usuario = new Usuario("Juan Pérez", "juan@example.com");
        usuario.setNombre("Carlos Gómez");

        assertEquals("Carlos Gómez", usuario.getNombre());
    }

    @Test
    public void testEmailNulo() {
        Usuario usuario = new Usuario("Ana López", null);

        assertNull(usuario.getEmail());
    }

    @Test
    public void testEmailVacio() {
        Usuario usuario = new Usuario("Ana López", "");

        assertTrue(usuario.getEmail().isEmpty());
    }
}
