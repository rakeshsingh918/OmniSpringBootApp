package com.aldocs.repositories.dev;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aldocs.model.AIMJob;

/**
 * Spring Data repository to manage {@link DevOmniDataAIMJob}.
 *
 */

@Repository
public interface DevAIMJobRepository extends CrudRepository<AIMJob, Integer> {
}