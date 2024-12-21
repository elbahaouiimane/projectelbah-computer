package org.sid.projectelbah;

import org.sid.projectelbah.dto.ComputerDto;
import org.sid.projectelbah.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ProjectelbahApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectelbahApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ComputerService computerService){
        return  args -> {
            computerService.saveComputers(
                    List.of(
                            ComputerDto.builder().proce("Intel core i5").ram(9).hardDrive("512Go").price(5999).macAdress("00:14:22:01:23:50").build(),
                            ComputerDto.builder().proce("Intel core i7").ram(16).hardDrive("512Go SSD").price(11990).macAdress("00:14:22:01:23:51").build(),
                            ComputerDto.builder().proce("Intel core i3").ram(8).hardDrive("500Go").price(4999).macAdress("00:14:22:01:23:52").build(),
                            ComputerDto.builder().proce("Intel core i9").ram(32).hardDrive("1TO SSD").price(29990).macAdress("00:14:22:01:23:53").build()
                    )

            );
        };
    }

}
