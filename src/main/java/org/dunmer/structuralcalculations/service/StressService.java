package org.dunmer.structuralcalculations.service;

import lombok.RequiredArgsConstructor;
import org.dunmer.structuralcalculations.domain.Stress;
import org.springframework.stereotype.Service;


public interface StressService {
    Iterable<Stress> findAll();

    Stress addOne(Stress stress);
}
