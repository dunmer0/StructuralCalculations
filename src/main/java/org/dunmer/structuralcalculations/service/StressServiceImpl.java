package org.dunmer.structuralcalculations.service;

import lombok.RequiredArgsConstructor;
import org.dunmer.structuralcalculations.domain.Stress;
import org.dunmer.structuralcalculations.repository.SectionRepository;
import org.dunmer.structuralcalculations.repository.StressRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StressServiceImpl implements StressService{
    private final StressRepository stressRepository;
    private final SectionRepository sectionRepository;
    @Override
    public Iterable<Stress> findAll() {
        return stressRepository.findAll();
    }

    @Override
    public Stress addOne(Stress stress) {
        return this.stressRepository.save(stress);
    }
}
