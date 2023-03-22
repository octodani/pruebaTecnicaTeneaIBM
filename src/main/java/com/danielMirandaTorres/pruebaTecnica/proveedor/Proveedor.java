package com.danielMirandaTorres.pruebaTecnica.proveedor;

import jakarta.persistence.*;

import java.sql.Date;


@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @Column(name = "id_proveedor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProveedor;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_de_alta")
    @Temporal(TemporalType.DATE)
    private Date fechaDeAlta;

    @Column(name = "id_cliente")
    private Long idCliente;

    public Proveedor() {}

    public Proveedor(String nombre, Date fechaDeAlta, Long idCliente) {
        this.nombre = nombre;
        this.fechaDeAlta = fechaDeAlta;
        this.idCliente = idCliente;
    }

    public Long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(Date fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
}
