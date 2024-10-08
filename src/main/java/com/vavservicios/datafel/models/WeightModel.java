// Model generates for Felipe's Programs
//
// Class Model WeightModel
// We suggest to use the file: WeightModel.java

package com.vavservicios.datafel.models;
import jakarta.persistence.*;

@Entity
@Table(name = "weight")
public class WeightModel {
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

	private String dateweight;

	public String getDateweight() {
		return dateweight;
	}

	public void setDateweight(String dateweight) {
		this.dateweight = dateweight;
	}

	private double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}