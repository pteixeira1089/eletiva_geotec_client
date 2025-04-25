package com.eemarisademello.eletiva_geotec_client.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FeelingDTO {
    private Long feelingId;

    @NotBlank
    private String feeling;

}
