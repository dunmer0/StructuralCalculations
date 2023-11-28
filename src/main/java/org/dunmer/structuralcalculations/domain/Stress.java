package org.dunmer.structuralcalculations.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Stress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Position position;
    private double axial;
    private double bending;
    private double shear;
    private double tensileReinforcement;
    private double shearReinforcement;
}
