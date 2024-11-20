package com.devwiki.leafy.dto.plantLog;

import com.devwiki.leafy.dto.userPlant.UserPlantDto;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class PlantLogDto {

    private Long plantLogId;
    private UserPlantDto userPlant;
    private LocalDate logDate;
    private String note;
    private boolean watered;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
