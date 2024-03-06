package com.example.demo.entiry;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;


@RedisHash("Product")
public class Product implements Serializable {

	/**
	 * 
	 */
	
	
	private String id;
	private String tenDan;
	private String gia;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String id, String tenDan, String gia) {
		super();
		this.id = id;
		this.tenDan = tenDan;
		this.gia = gia;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
		return "Dan [id=" + id + ", tenDan=" + tenDan + ", gia=" + gia + "]";
	}
	

}
