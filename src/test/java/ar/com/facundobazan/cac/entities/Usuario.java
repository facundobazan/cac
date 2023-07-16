package ar.com.facundobazan.cac.entities;

import jakarta.persistence.*;
//import lombok.Data;

@Entity
@Table(name = "usuarios")
//@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "apellido", nullable = false, length = 80)
    private String apellido;
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "telefono", nullable = true, length = 10)
    private String telefono;
    @Column(name = "email", nullable = false, length = 60, unique = true)
    private String email;
    @Column(name = "password", nullable = false, length = 60)
    private String password;

    public Usuario() {
    }

    public Usuario(Integer id, String apellido, String nombre, String telefono, String email, String password) {
        setId(id);
        setApellido(apellido);
        setNombre(nombre);
        setTelefono(telefono);
        setEmail(email);
        setPassword(password);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
