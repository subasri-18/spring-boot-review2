package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")

public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custid;
	private String custname;
	private String theme;
	private String caketype;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_cakeid")
	private CakesEntity cs;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_cakeid")
	private List<CakesEntity> cp;

	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerEntity(int custid, String custname, String theme, String caketype, CakesEntity cs,
			List<CakesEntity> cp) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.theme = theme;
		this.caketype = caketype;
		this.cs = cs;
		this.cp = cp;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getCaketype() {
		return caketype;
	}

	public void setCaketype(String caketype) {
		this.caketype = caketype;
	}

	public CakesEntity getCs() {
		return cs;
	}

	public void setCs(CakesEntity cs) {
		this.cs = cs;
	}

	public List<CakesEntity> getCp() {
		return cp;
	}

	public void setCp(List<CakesEntity> cp) {
		this.cp = cp;
	}
	
	
	
	

}
