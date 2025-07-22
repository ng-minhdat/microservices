package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Schema(
        name = "Account",
        description = "Schema to hold the Account information"
)
@Data
public class AccountsDto {
    @Schema(
            description = "Account number of Eazy Bank account",
            example = "3454432434"
    )
    @NotNull(message = "Account number cannot be a null or empty")
    @Min(value = 1_000_000_000L, message = "Account number must be at least 10 digits")
    @Max(value = 9_999_999_999L, message = "Account number must be at most 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of Eazy Bank account",
            example = "Savings"
    )
    @NotEmpty(message = "Account type cannot be a null or empty")
    private String accountType;

    @Schema(
            description = "Eazy Bank branch address",
            example = "123 New York"
    )
    @NotEmpty(message = "Branch address cannot be a null or empty")
    private String branchAddress;
}
