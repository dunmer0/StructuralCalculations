package org.dunmer.structuralcalculations.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    @JoinColumn(name = "element_id")
    private Set<Section> section = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "element_id")
    private Set<Stress> stresses = new HashSet<>();

    @Enumerated(EnumType.STRING)
    private Concrete concrete;

    @Enumerated(EnumType.STRING)
    private Steel steel;
}
