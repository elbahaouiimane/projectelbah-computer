package org.sid.projectelbah.service;

import org.sid.projectelbah.dao.entities.Computer;
import org.sid.projectelbah.dto.ComputerDto;

import java.util.List;

public interface ComputerService {
    public List<ComputerDto> getComputerByProce(String proce);

    public  ComputerDto saveComputer(ComputerDto computerDto);

    public List<ComputerDto> saveComputers(List<ComputerDto> computerDtos);

}
