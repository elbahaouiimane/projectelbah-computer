package org.sid.projectelbah.mapper;


import org.modelmapper.ModelMapper;
import org.sid.projectelbah.dao.entities.Computer;
import org.sid.projectelbah.dto.ComputerDto;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper mapper = new ModelMapper();

    public Computer fromComputerDtoToComputer(ComputerDto computerDto){ return mapper.map(computerDto, Computer.class);
    }

    public ComputerDto fromComputerToComputerDto(Computer computer){return mapper.map(computer, ComputerDto.class);
    }

}
