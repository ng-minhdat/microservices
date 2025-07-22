package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "Error Response",
        description = "Schema to hold Error Response information"
)
@Data @AllArgsConstructor
public class ErrorResponseDto {
    @Schema(
            description = "API path invoked by client"
    )
    private String apiPath;

    @Schema(
            description = "Error code presenting the error that happened"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message presenting the error that happened"
    )
    private String errorMessage;

    @Schema(
            description = "Time when the error happened"
    )
    private LocalDateTime errorTime;
}
