package ar.com.facundobazan.cac.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "apellido", length = 80, nullable = false)
    private String apellido;
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    @Column(name = "telefono", length = 10, nullable = true)
    private String telefono;
    @Column(name = "email", length = 60, nullable = false, unique = true)
    private String email;
    @Column(name = "password", length = 60, nullable = false)
    private String password;
    @Column(name = "rol_id", length = 60, nullable = false)
    private Integer rolId;

    public Usuario() {
    }

    public Usuario(Integer id, String apellido, String nombre, String telefono, String email, String password, Integer rolId) {
        setId(id);
        setApellido(apellido);
        setNombre(nombre);
        setTelefono(telefono);
        setEmail(email);
        setPassword(password);
        setRolId(rolId);
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }
}
