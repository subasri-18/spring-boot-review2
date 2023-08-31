 package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cake")

public class CakesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cakeid;
	private String fl;
	private int quantity;
	public CakesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CakesEntity(int cakeid, String fl, int quantity) {
		super();
		this.cakeid = cakeid;
		this.fl = fl;
		this.quantity = quantity;
	}
	public int getCakeid() {
		return cakeid;
	}
	public void setCakeid(int cakeid) {
		this.cakeid = cakeid;
	}
	public String getFl() {
		return fl;
	}
	public void setFl(String fl) {
		this.fl = fl;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

	



}
