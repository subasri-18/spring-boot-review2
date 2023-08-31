package com.example.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.CakesEntity;

import com.example.demo.repository.CakesRepo;

@Service

public class CakesService {
	@Autowired
	CakesRepo srp;
	public CakesEntity saveinfo(CakesEntity ss)
	{
		return srp.save(ss);
	}
    public List<CakesEntity> savedetails(List<CakesEntity> ss)
    {
    	return (List<CakesEntity>)srp.saveAll(ss);
    }
	public List<CakesEntity> showinfo()
	{
		return srp.findAll();
	}
	public CakesEntity changeinfo(CakesEntity ss)
	{
		return srp.saveAndFlush(ss);
	}
	public void deleteinfo(CakesEntity ss)
	{
		srp.delete(ss);
	}

	public void deletepid(int id)
	{
		srp.deleteById(id);
	}
	
	public List<CakesEntity> sortinfo(String s)
	{
		return srp.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	public List<CakesEntity> getbypage(int pgno,int pgsize){
		Page<CakesEntity> p=srp.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
		
	}
	public List<CakesEntity> getcake(int i,String s)
	{
		return srp.getcakeinfo(i, s);
	}
	
	public int delcake(int id)
	{
		return srp.deletecakeinfo(id);
	}
	
	public int updatecake(int id,int id1)
	{
		return srp.updatecakeinfo(id,id1);
	}
}
