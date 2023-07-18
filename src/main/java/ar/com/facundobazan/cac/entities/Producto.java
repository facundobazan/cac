package ar.com.facundobazan.cac.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "codigo", nullable = true, unique = true, length = 20)
    private String codigo;
    @Column(name = "producto", nullable = false, unique = true, length = 50)
    private String producto;
    @Column(name = "descripcion", nullable = true, length = 200)
    private String descripcion;
    @Column(name = "precio", nullable = false)
    private Double precio = 0.0;

    public Producto() {
    }

    public Producto(Integer id, String codigo, String producto, String descripcion, Double precio) {
        setId(id);
        setCodigo(codigo);
        setProducto(producto);
        setDescripcion(descripcion);
        setPrecio(precio);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
