package edu.eci.cvds;
import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

// @Document(collection = "usuarios")
public class Usuario {
    @Id
    private String id;
    private String nombre;
    private String email;

    // Constructor vacío
    public Usuario() {}

    // Constructor con parámetros
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
