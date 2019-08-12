package com.aldocs.repositories.qa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aldocs.model.AIMJob;

/**
 * Spring Data repository managing {@link QAOmniDataAIMJob}.
 *
 */

@Repository
public interface QaAIMJobRepository extends CrudRepository<AIMJob, Integer> {
}