package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CakesEntity;


import jakarta.transaction.Transactional;

@Repository

public interface CakesRepo extends JpaRepository<CakesEntity, Integer> {
	@Query(value="select * from cake where cakeid=:cakeid or fl=:fl",nativeQuery=true)
	public List<CakesEntity> getcakeinfo(@Param("cakeid") int cakeid,@Param("fl") String fl);
	
	@Modifying
	@Transactional
	@Query(value="delete from cake where cakeid=:cakeid",nativeQuery=true)
	public int deletecakeinfo(@Param("cakeid")int cakeid);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE cake SET cakeid = ?1 WHERE cakeid = ?2", nativeQuery = true)
	public int updatecakeinfo(int newid, int oldid);
	

}
