package org.example.customer.controller;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.example.customer.model.Adress;

public record CustomerRequest(
        String id,
        @NotNull(message = "Customer firstname is required")
        String firstName,
        @NotNull(message = "Customer lastname is required")
        String lastName,
        @NotNull(message = "Customer email is required")
        @Email(message = "Customer email is not a valid email address")
        String email,
        Adress adress
) {
}
