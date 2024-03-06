package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class Dan {

	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDan;
	private String tenDan;
	private String gia;
	public Dan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dan(int idDan, String tenDan, String gia) {
		super();
		this.idDan = idDan;
		this.tenDan = tenDan;
		this.gia = gia;
	}
	public int getIdDan() {
		return idDan;
	}
	public void setIdDan(int idDan) {
		this.idDan = idDan;
	}
	public String getTenDan() {
		return tenDan;
	}
	public void setTenDan(String tenDan) {
		this.tenDan = tenDan;
	}
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
	}
	@Override
	public String toString() {
		return "Dan [idDan=" + idDan + ", tenDan=" + tenDan + ", gia=" + gia + "]";
	}
	

}
