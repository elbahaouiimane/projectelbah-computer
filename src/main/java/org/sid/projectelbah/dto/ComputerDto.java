package org.sid.projectelbah.dto;

import jakarta.persistence.Entity;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class ComputerDto {
    String proce;
    int ram;
    String hardDrive;
    double price;
    String macAdress;
}
