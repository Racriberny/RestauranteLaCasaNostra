package com.joanmoncho.tiendavintage.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "lineas de factura", schema = "futbolvintage", catalog = "")
public class LineasDeFacturaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idlineas de factura", nullable = false)
    private int idlineasDeFactura;
    @Basic
    @Column(name = "lineas", nullable = true, length = 45)
    private String lineas;
    @Basic
    @Column(name = "cantidad", nullable = true)
    private Integer cantidad;
    @Basic
    @Column(name = "precio", nullable = true, precision = 0)
    private Double precio;
    @Basic
    @Column(name = "factura_idfactura", nullable = false)
    private int facturaIdfactura;
    @Basic
    @Column(name = "producto_idproducto", nullable = false)
    private int productoIdproducto;

    public int getIdlineasDeFactura() {
        return idlineasDeFactura;
    }

    public void setIdlineasDeFactura(int idlineasDeFactura) {
        this.idlineasDeFactura = idlineasDeFactura;
    }

    public String getLineas() {
        return lineas;
    }

    public void setLineas(String lineas) {
        this.lineas = lineas;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getFacturaIdfactura() {
        return facturaIdfactura;
    }

    public void setFacturaIdfactura(int facturaIdfactura) {
        this.facturaIdfactura = facturaIdfactura;
    }

    public int getProductoIdproducto() {
        return productoIdproducto;
    }

    public void setProductoIdproducto(int productoIdproducto) {
        this.productoIdproducto = productoIdproducto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LineasDeFacturaEntity that = (LineasDeFacturaEntity) o;

        if (idlineasDeFactura != that.idlineasDeFactura) return false;
        if (facturaIdfactura != that.facturaIdfactura) return false;
        if (productoIdproducto != that.productoIdproducto) return false;
        if (lineas != null ? !lineas.equals(that.lineas) : that.lineas != null) return false;
        if (cantidad != null ? !cantidad.equals(that.cantidad) : that.cantidad != null) return false;
        if (precio != null ? !precio.equals(that.precio) : that.precio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idlineasDeFactura;
        result = 31 * result + (lineas != null ? lineas.hashCode() : 0);
        result = 31 * result + (cantidad != null ? cantidad.hashCode() : 0);
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        result = 31 * result + facturaIdfactura;
        result = 31 * result + productoIdproducto;
        return result;
    }
}
