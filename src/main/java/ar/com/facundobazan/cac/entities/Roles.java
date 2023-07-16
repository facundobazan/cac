package ar.com.facundobazan.cac.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "roles", length = 20, unique = true, nullable = false)
    private String roles;

    public Roles() {
    }

    public Roles(Integer id, String roles) {
        setId(id);
        setRoles(roles);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
