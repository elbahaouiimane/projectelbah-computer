package org.sid.projectelbah.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString

public class Computer {
    @Id
    @GeneratedValue
    Long id_Pc;
    String proce;
    Integer ram;
    String hardDrive;
    double price;
    String macAdress;

}
