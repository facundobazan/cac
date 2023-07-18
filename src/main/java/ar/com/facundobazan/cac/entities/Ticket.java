package ar.com.facundobazan.cac.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "usuario_id", nullable = false)
    private Integer usuarioId;
    @Column(name = "descuento_id", nullable = false)
    private Integer descuentoId;

    public Ticket() {
    }
}
