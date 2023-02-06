package org.springframework.samples.petclinic.model;

public class InvalidVetDataException extends RuntimeException {
    public InvalidVetDataException(String msg, Object... args) {
        super(String.format(msg, args));
    }
}
