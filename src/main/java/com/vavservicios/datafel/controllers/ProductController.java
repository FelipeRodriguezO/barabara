package com.vavservicios.datafel.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vavservicios.datafel.models.ProductModel;
import com.vavservicios.datafel.models.WeightModel;
import com.vavservicios.datafel.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

     @GetMapping()
    public ArrayList<ProductModel> obtenerProductos() {
        return productService.obtenerProductos();

    }

    @GetMapping(path = "/{id}")
	public ProductModel getProductById(@PathVariable("id") Long id) {
		return(productService.obtenerPorId(id)); 
	}

    @PostMapping()
    public ProductModel guardaProducto(@RequestBody ProductModel producto) {
        return this.productService.guardaProducto(producto);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.productService.eliminarProducto(id);
        if (ok) {
            return "Se elimino el producto con id " + id;

        } else {
            return "No pudo eliminar el producto con id " + id;

        }
    }
    
}
