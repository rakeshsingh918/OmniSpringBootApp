package com.aldocs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldocs.model.AIMJob;
import com.aldocs.repositories.dev.DevAIMJobRepository;
import com.aldocs.repositories.qa.QaAIMJobRepository;

@Service
public class ProductService {

	@Autowired
	DevAIMJobRepository devRepository;

	@Autowired
	QaAIMJobRepository qaRepository;
	
	//Similar way You Inject the Other Repository
	//for Prod and UAT
	

	public Optional<AIMJob> findById(int id) {
		
		//Based on Passed @param we can call diff DB repo to get or check the Data
		if (id == 1)
			return devRepository.findById(id);
		else
			return qaRepository.findById(id);
	}

	/*
	 * @Transactional public void saveProduct(com.aldocs.json.AIMJob aimJob) {
	 * System.out.println("new job saved"); AIMJob aimJob1 = new AIMJob();
	 * aimJob1.setDescription(aimJob.getDescription());
	 * aimJob1.setCategory(aimJob.getCategory());
	 * aimJob1.setShowTo(aimJob.getShowTo()); aimJob1.setActive(aimJob.isActive());
	 * devRepository.save(aimJob1); }
	 */

	public List<AIMJob> getAllJob() {
		return (List<AIMJob>) devRepository.findAll();
	}

	public AIMJob saveAIMJob(AIMJob aimJob) {
		return devRepository.save(aimJob);
	}

}
