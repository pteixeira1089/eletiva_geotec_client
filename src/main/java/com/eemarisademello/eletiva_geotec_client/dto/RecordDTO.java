package com.eemarisademello.eletiva_geotec_client.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecordDTO {

    private Long recordId;

    @NotNull
    private Long userId;

    @NotBlank
    private String pictureUrl;


    private LocalDateTime createdAt;

    @NotNull
    private Double latitude;

    @NotNull
    private Double longitude;

    @NotNull
    private FeelingDTO feeling;


    private CategoryDTO category;

    @NotBlank
    private String comment;

}
