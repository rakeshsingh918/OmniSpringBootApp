package com.aldocs.repositories;

import com.aldocs.model.AIMJob;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<AIMJob, Integer> {
}
