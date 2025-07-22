package com.eazybytes.loans.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class LoansDto {
    @NotEmpty(message = "Mobile number cannot be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @NotEmpty(message = "Loan number cannot be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Loan number must be 12 digits")
    private String loanNumber;

    @NotEmpty(message = "Loan type cannot be a null or empty")
    private String loanType;

    @Positive(message = "Total loan amount must be greater than zero")
    private int totalLoan;

    @PositiveOrZero(message = "Total loan amount paid must be greater than or equal to zero")
    private int amountPaid;

    @PositiveOrZero(message = "Total outstanding amount must be greater than or equal to zero")
    private int outstandingAmount;
}
