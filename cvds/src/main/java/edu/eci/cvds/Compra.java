package edu.eci.cvds;


import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import java.time.LocalDate;

//@Document(collection = "compras")
public class Compra {
    @Id
    private String id;
    private Usuario usuario;
    private List<Articulo> articulos;
    private double total;
    private LocalDate fecha;

    // Constructor vacío
    public Compra() {}

    // Constructor con parámetros
    public Compra(Usuario usuario, List<Articulo> articulos) {
        this.usuario = usuario;
        this.articulos = articulos;
        this.fecha = LocalDate.now();
        calcularTotal();
    }

    // Método para calcular el total de la compra
    private void calcularTotal() {
        this.total = articulos.stream().mapToDouble(a -> a.getPrecio()).sum();
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
        calcularTotal(); // Recalcula el total cuando se cambian los artículos
    }

    public double getTotal() {
        return total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}


