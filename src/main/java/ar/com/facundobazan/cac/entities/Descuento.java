package ar.com.facundobazan.cac.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "descuentos")
public class Descuento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "descuento", nullable = false, unique = true, length = 50)
    private String descuento;
    @Column(name = "valor", nullable = false)
    private Double valor = 0.0;

    public Descuento() {
    }

    public Descuento(Integer id, String descuento, Double valor) {
        setId(id);
        setDescuento(descuento);
        setValor(valor);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
