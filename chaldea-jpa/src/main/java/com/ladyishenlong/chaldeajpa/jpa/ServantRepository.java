package com.ladyishenlong.chaldeajpa.jpa;

import com.ladyishenlong.chaldeajpa.model.ServantModel;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServantRepository extends JpaRepository<ServantModel,Integer> {



}
