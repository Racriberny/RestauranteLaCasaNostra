package com.joanmoncho.tiendavintage.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "factura", schema = "futbolvintage", catalog = "")
public class FacturaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idfactura", nullable = false)
    private int idfactura;
    @Basic
    @Column(name = "idmetodo pago", nullable = false)
    private int idmetodoPago;
    @Basic
    @Column(name = "idusuario", nullable = false)
    private int idusuario;

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public int getIdmetodoPago() {
        return idmetodoPago;
    }

    public void setIdmetodoPago(int idmetodoPago) {
        this.idmetodoPago = idmetodoPago;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FacturaEntity that = (FacturaEntity) o;

        if (idfactura != that.idfactura) return false;
        if (idmetodoPago != that.idmetodoPago) return false;
        if (idusuario != that.idusuario) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idfactura;
        result = 31 * result + idmetodoPago;
        result = 31 * result + idusuario;
        return result;
    }
}
