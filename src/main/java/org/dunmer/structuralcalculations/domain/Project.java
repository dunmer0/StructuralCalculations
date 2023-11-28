package org.dunmer.structuralcalculations.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

/**
 *Base of the structure.
 *It will store all the elements for calculations.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @ManyToOne
    private Engineer engineer;
    @OneToMany
    @JoinColumn(name = "project_id")
    private Set<Element> element;
}
