package org.springframework.samples.petclinic.graphql;

import jakarta.validation.constraints.Size;
import java.time.LocalDate;

/**
 * @author Nils Hartmann (nils@nilshartmann.net)
 */
public record AddVisitInput(
    int petId,
    Integer vetId,
    LocalDate date,
    @Size(min=5)
    String description
) {}

