package com.vavservicios.datafel.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vavservicios.datafel.models.ProductModel;
import com.vavservicios.datafel.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ArrayList<ProductModel> obtenerProductos() {
        return (ArrayList<ProductModel>) productRepository.findAll();
    }

    public ProductModel guardaProducto(ProductModel product) {
        return productRepository.save(product);
    }

    public ProductModel obtenerPorId(Long id) {
        return productRepository.findById(id).get();
    }

    public boolean eliminarProducto(Long id)
    {
        try {
            productRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}