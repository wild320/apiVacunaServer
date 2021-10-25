package com.unab.apijava41.data.repositorios;

import com.unab.apijava41.data.entidades.VacunadosEntity;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IVacunadosRepository  extends PagingAndSortingRepository<VacunadosEntity,Long>{
    
}
