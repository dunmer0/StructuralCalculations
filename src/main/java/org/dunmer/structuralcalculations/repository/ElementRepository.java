package org.dunmer.structuralcalculations.repository;

import org.dunmer.structuralcalculations.domain.Element;
import org.springframework.data.repository.CrudRepository;

public interface ElementRepository extends CrudRepository<Element, Long> {
}
