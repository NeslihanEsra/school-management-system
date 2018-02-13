package com.nea.sm.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nea.sm.entity.Grup;

@Repository
public interface GrupRespository extends JpaRepository<Grup, Long>{
	
	List<Grup> getAllByOrderByIdAsc();
	
	Page<Grup> getAllByOrderByIdAsc(Pageable pageable);

}
