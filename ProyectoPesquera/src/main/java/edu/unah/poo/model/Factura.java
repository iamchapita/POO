package edu.unah.poo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Factura")

public class Factura {

	@Id
	private int idFactura;
	private String fecha;
	private double isv;
	private String lugarVenta;
	private double total;

	@ManyToOne
	@JoinColumn(name = "idEmpleado")
	@JsonBackReference
	private Empleado vendedor;

	@OneToMany(mappedBy = "factura")
	@JsonBackReference
	private List<ProductoFactura> productosFacturas;

	public Factura() {
	}

	public Factura(int idFactura, String fecha, double isv, String lugarVenta, double total, Empleado vendedor) {
		this.idFactura = idFactura;
		this.fecha = fecha;
		this.isv = isv;
		this.lugarVenta = lugarVenta;
		this.total = total;
		this.vendedor = vendedor;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getIsv() {
		return isv;
	}

	public void setIsv(double isv) {
		this.isv = isv;
	}

	public String getLugarVenta() {
		return lugarVenta;
	}

	public void setLugarVenta(String lugarVenta) {
		this.lugarVenta = lugarVenta;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Empleado getVendedor() {
		return vendedor;
	}

	public void setVendendor(Empleado vendedor) {
		this.vendedor = vendedor;
	}

}
