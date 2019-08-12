package com.aldocs.repositories.prod;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aldocs.model.AIMJob;

/**
 * Spring Data repository managing {@link ProdOmniDataAIMJob}.
 *
 */

@Repository
public interface ProdAIMJobRepository extends CrudRepository<AIMJob, Integer> {

}
