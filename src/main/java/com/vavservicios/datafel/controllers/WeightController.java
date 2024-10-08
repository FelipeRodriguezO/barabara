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
import com.vavservicios.datafel.models.WeightModel;
import com.vavservicios.datafel.services.WeightService;
import java.util.Optional;

@RestController
@RequestMapping("/weight")
public class WeightController {

	@Autowired
	WeightService weightService;

	@GetMapping()
	public ArrayList<WeightModel> getWeightFindAll() {
		return weightService.getWeightFindAll();
	}

	@GetMapping(path = "/{id}")
	public WeightModel getWeightById(@PathVariable("id") Long id) {
		return(weightService.getById(id)); 
	}

	@PostMapping()
	public WeightModel saveWeight(@RequestBody WeightModel weight) {
		return this.weightService.saveWeight(weight);
	}

	@DeleteMapping(path = "/{id}")
	public String deleteById(@PathVariable("id") Long id){
		boolean ok = this.weightService.deleteWeight(id); 
		if (ok) {
			return "Se elimino el Weight con id = " + id;
		} else {
			return "No pudo eliminar el weight con id = " + id;
		}
	}
}
