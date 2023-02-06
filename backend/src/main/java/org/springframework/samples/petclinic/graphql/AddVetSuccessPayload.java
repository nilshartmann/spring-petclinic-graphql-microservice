package org.springframework.samples.petclinic.graphql;

/**
 * @author Nils Hartmann
 */
public record AddVetSuccessPayload(VetResource vet) implements AddVetPayload {

    public VetResource getVet() {
        return vet();
    }
}
