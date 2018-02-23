package com.nea.sm.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nea.sm.web.entity.Kurs;

@Repository
public interface KursRepository extends JpaRepository<Kurs, Long>{

	List<Kurs> getAllByOrderByIdAsc();
}