package org.dunmer.structuralcalculations.repository;

import org.dunmer.structuralcalculations.domain.Engineer;
import org.springframework.data.repository.CrudRepository;

public interface EngineerRepository extends CrudRepository<Engineer, Long> {
}
