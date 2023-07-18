package ar.com.facundobazan.cac.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "rol", length = 20, unique = true, nullable = false)
    private String rol;

    public Rol() {
    }

    public Rol(Integer id, String rol) {
        setId(id);
        setRol(rol);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
