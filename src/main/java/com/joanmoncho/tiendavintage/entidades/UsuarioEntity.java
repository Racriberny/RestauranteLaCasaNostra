package com.joanmoncho.tiendavintage.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario", schema = "futbolvintage", catalog = "")
public class UsuarioEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idusuario", nullable = false)
    private int idusuario;
    @Basic
    @Column(name = "nombre", nullable = true, length = 45)
    private String nombre;
    @Basic
    @Column(name = "email", nullable = true, length = 45)
    private String email;
    @Basic
    @Column(name = "contraseña", nullable = true, length = 45)
    private String contraseña;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioEntity that = (UsuarioEntity) o;

        if (idusuario != that.idusuario) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (contraseña != null ? !contraseña.equals(that.contraseña) : that.contraseña != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idusuario;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (contraseña != null ? contraseña.hashCode() : 0);
        return result;
    }
}
