package com.vavservicios.datafel.models;
import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private String image2;

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    private String image3;

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String comparison1;

    public String getComparison1() {
        return comparison1;
    }

    public void setComparison1(String comparison1) {
        this.comparison1 = comparison1;
    }

    private String comparison2;

    public String getComparison2() {
        return comparison2;
    }

    public void setComparison2(String comparison2) {
        this.comparison2 = comparison2;
    }

    private String comparison3;

    public String getComparison3() {
        return comparison3;
    }

    public void setComparison3(String comparison3) {
        this.comparison3 = comparison3;
    }
    
}

