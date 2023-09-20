package com.example.bomobomo.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class AdminDto {
    private Long adminNumber;
    private String adminId;
    private String adminPassword;
}
