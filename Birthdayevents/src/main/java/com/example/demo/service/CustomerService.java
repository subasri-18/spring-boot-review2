package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.model.CustomerEntity;
import com.example.demo.repository.CustomerRepository;

@Service

public class CustomerService {
	@Autowired
	CustomerRepository srp;
	public CustomerEntity saveinfo(CustomerEntity ss)
	{
		return srp.save(ss);
	}
    public List<CustomerEntity> savedetails(List<CustomerEntity> ss)
    {
    	return (List<CustomerEntity>)srp.saveAll(ss);
    }
	public List<CustomerEntity> showinfo()
	{
		return srp.findAll();
	}
	public CustomerEntity changeinfo(CustomerEntity ss)
	{
		return srp.saveAndFlush(ss);
	}
	public void deleteinfo(CustomerEntity ss)
	{
		srp.delete(ss);
	}

	

	public void deletepid(int id)
	{
		srp.deleteById(id);
	}
	public List<CustomerEntity> sortinfo(String s)
	{
		return srp.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	public List<CustomerEntity> getbypage(int pgno,int pgsize){
		Page<CustomerEntity> p=srp.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
		
	}

		public List<CustomerEntity> getcust(int i,String s)
		{
			return srp.getcustomerinfo(i, s);
		}
		
		public int delcust(int id)
		{
			return srp.deletecustomerinfo(id);
		}
		
		public int updatecust(int id,int id1)
		{
			return srp.updatecustomerinfo(id,id1);
		}
		public CustomerEntity savecustomeriddetails(CustomerEntity ss)
		{
			return srp.save(ss);
		}
		
		public List<CustomerEntity> showcustomeridinfo()
		{
		      return srp.findAll();
		}
}
