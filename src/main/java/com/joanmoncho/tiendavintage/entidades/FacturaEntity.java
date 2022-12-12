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
    @Column(name = "cliente_idcliente", nullable = false)
    private int clienteIdcliente;
    @Basic
    @Column(name = "metodo pago_idmetodo pago", nullable = false)
    private int metodoPagoIdmetodoPago;

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public int getClienteIdcliente() {
        return clienteIdcliente;
    }

    public void setClienteIdcliente(int clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }

    public int getMetodoPagoIdmetodoPago() {
        return metodoPagoIdmetodoPago;
    }

    public void setMetodoPagoIdmetodoPago(int metodoPagoIdmetodoPago) {
        this.metodoPagoIdmetodoPago = metodoPagoIdmetodoPago;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FacturaEntity that = (FacturaEntity) o;

        if (idfactura != that.idfactura) return false;
        if (clienteIdcliente != that.clienteIdcliente) return false;
        if (metodoPagoIdmetodoPago != that.metodoPagoIdmetodoPago) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idfactura;
        result = 31 * result + clienteIdcliente;
        result = 31 * result + metodoPagoIdmetodoPago;
        return result;
    }
}
