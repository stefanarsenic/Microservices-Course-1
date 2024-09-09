package org.example.customer.controller;
;
import org.example.customer.model.Adress;

public record CustomerResponse(
        String id,
        String firstName,
        String lastName,
        String email,
        Adress adress
) {
}
