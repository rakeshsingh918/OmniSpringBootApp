package com.aldocs.repositories.uat;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aldocs.model.AIMJob;

/**
 * Spring Data repository managing {@link UatOmniDataAIMJob}.
 *
 */

@Repository
public interface UatAIMJobRepository extends CrudRepository<AIMJob, Integer> {
}