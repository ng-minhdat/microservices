package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class AccountsDto {
    @NotNull(message = "Account number cannot be a null or empty")
    @Min(value = 1_000_000_000L, message = "Account number must be at least 10 digits")
    @Max(value = 9_999_999_999L, message = "Account number must be at most 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "Account type cannot be a null or empty")
    private String accountType;

    @NotEmpty(message = "Branch address cannot be a null or empty")
    private String branchAddress;
}
