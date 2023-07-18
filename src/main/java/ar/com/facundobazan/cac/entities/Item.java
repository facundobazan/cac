package ar.com.facundobazan.cac.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ticket_id", nullable = false)
    private Integer ticketId;
    @Column(name = "producto_id", nullable = false)
    private Integer productoId;
    @Column(name = "cantidad", nullable = false)
    private Integer cantidad = 1;

    public Item() {
    }

    public Item(Integer id, Integer ticketId, Integer productoId, Integer cantidad) {
        setId(id);
        setTicketId(ticketId);
        setProductoId(productoId);
        setCantidad(cantidad);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
