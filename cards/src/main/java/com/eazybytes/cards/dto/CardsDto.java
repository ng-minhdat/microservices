package com.eazybytes.cards.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class CardsDto {
    @NotEmpty(message = "Mobile number cannot be a null or empty")
    @Pattern(regexp = "[0-9]{10}", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @NotEmpty(message = "Mobile number cannot be a null or empty")
    @Pattern(regexp = "[0-9]{12}", message = "Card number must be 12 digits")
    private String cardNumber;

    @NotEmpty(message = "Card type cannot be a null or empty")
    private String cardType;

    @Positive(message = "Total limit must be greater than zero")
    private int totalLimit;

    @PositiveOrZero(message = "Amount used must be greater than or equal to zero")
    private int amountUsed;

    @PositiveOrZero(message = "Available amount must be greater than or equal to zero")
    private int availableAmount;
}
