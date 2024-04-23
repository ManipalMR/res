package com.res.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.res.model.Res;

@Repository
public interface ReRepository extends JpaRepository<Res, Integer>{

}
