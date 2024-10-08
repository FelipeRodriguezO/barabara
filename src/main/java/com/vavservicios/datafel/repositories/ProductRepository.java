package com.vavservicios.datafel.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vavservicios.datafel.models.*;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long>{
 
    
}
