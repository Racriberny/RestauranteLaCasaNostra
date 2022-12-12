package com.joanmoncho.tiendavintage.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "metodo pago", schema = "futbolvintage", catalog = "")
public class MetodoPagoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idmetodo pago", nullable = false)
    private int idmetodoPago;
    @Basic
    @Column(name = "transferencia-bancaria", nullable = true, length = 45)
    private String transferenciaBancaria;
    @Basic
    @Column(name = "paypal", nullable = true, length = 45)
    private String paypal;
    @Basic
    @Column(name = "a-plazos", nullable = true, length = 45)
    private String aPlazos;

    public int getIdmetodoPago() {
        return idmetodoPago;
    }

    public void setIdmetodoPago(int idmetodoPago) {
        this.idmetodoPago = idmetodoPago;
    }

    public String getTransferenciaBancaria() {
        return transferenciaBancaria;
    }

    public void setTransferenciaBancaria(String transferenciaBancaria) {
        this.transferenciaBancaria = transferenciaBancaria;
    }

    public String getPaypal() {
        return paypal;
    }

    public void setPaypal(String paypal) {
        this.paypal = paypal;
    }

    public String getaPlazos() {
        return aPlazos;
    }

    public void setaPlazos(String aPlazos) {
        this.aPlazos = aPlazos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetodoPagoEntity that = (MetodoPagoEntity) o;

        if (idmetodoPago != that.idmetodoPago) return false;
        if (transferenciaBancaria != null ? !transferenciaBancaria.equals(that.transferenciaBancaria) : that.transferenciaBancaria != null)
            return false;
        if (paypal != null ? !paypal.equals(that.paypal) : that.paypal != null) return false;
        if (aPlazos != null ? !aPlazos.equals(that.aPlazos) : that.aPlazos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idmetodoPago;
        result = 31 * result + (transferenciaBancaria != null ? transferenciaBancaria.hashCode() : 0);
        result = 31 * result + (paypal != null ? paypal.hashCode() : 0);
        result = 31 * result + (aPlazos != null ? aPlazos.hashCode() : 0);
        return result;
    }
}
