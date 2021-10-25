package com.unab.apijava41.data.repositorios;


import com.unab.apijava41.data.entidades.VacunadosEntity;
import com.unab.apijava41.data.entidades.VacunasEntity;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IVacunasRepository extends PagingAndSortingRepository<VacunadosEntity,Long>{
    VacunasEntity findById(long id);
    
}
