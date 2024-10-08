package com.vavservicios.datafel.services;


import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vavservicios.datafel.models.WeightModel;
import com.vavservicios.datafel.repositories.WeightRepository;

@Service
public class WeightService {

	@Autowired
	WeightRepository weightRepository;

	public ArrayList<WeightModel> getWeightFindAll() {
		return (ArrayList<WeightModel>)weightRepository.findAll();
	}

	public WeightModel saveWeight( WeightModel weight) {
		return weightRepository.save(weight);
	}

	public  WeightModel getById(Long id) {
		return weightRepository.findById(id).get();
	}

	public boolean deleteWeight(Long id) {
		try {
			weightRepository.deleteById(id);
			return true;
		 } catch (Exception e) {
			 return false;
		}
	}
}