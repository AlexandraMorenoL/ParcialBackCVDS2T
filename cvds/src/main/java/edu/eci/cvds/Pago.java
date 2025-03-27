package edu.eci.cvds;
import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

//@Document(collection = "pagos")
public class Pago {
    @Id
    private String id;
    private Compra compra;
    private String estado; // "APROBADO", "RECHAZADO", "PENDIENTE"
    private LocalDateTime fechaPago;
    private String metodoPago;

    // Constructor vacío
    public Pago() {}

    // Constructor con parámetros
    public Pago(Compra compra, String metodoPago) {
        this.compra = compra;
        this.metodoPago = metodoPago;
        this.fechaPago = LocalDateTime.now();
        this.estado = "PENDIENTE"; // Por defecto, el pago inicia como pendiente
    }

    // Método para aprobar el pago
    public void aprobarPago() {
        this.estado = "APROBADO";
    }

    // Método para rechazar el pago
    public void rechazarPago() {
        this.estado = "RECHAZADO";
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}




