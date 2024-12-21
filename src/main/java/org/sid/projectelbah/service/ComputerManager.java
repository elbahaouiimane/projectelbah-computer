package org.sid.projectelbah.service;

import lombok.AllArgsConstructor;
import org.sid.projectelbah.dao.entities.Computer;
import org.sid.projectelbah.dao.repository.ComputerRepository;
import org.sid.projectelbah.dto.ComputerDto;
import org.sid.projectelbah.mapper.ComputerMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor

public class ComputerManager implements ComputerService {

    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;

    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDto);
        computer = computerRepository.save(computer);
        computerDto = computerMapper.fromComputerToComputerDto(computer);
        return computerDto;


    }

    @Override
    public List<ComputerDto> getComputerByProce(String proce) {
        List<Computer>  computers = computerRepository.getComputerByProce(proce);
        List<ComputerDto> computerDtos = new ArrayList<>();
        for (Computer computer : computers) {
            computerDtos.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDtos;
    }

    @Override
    public List<ComputerDto> saveComputers(List<ComputerDto> computerDtos) {

        List<Computer> computers = new ArrayList<>();
        for (ComputerDto computerDto : computerDtos) {
            computers.add(computerMapper.fromComputerDtoToComputer(computerDto));
        }

        computers = computerRepository.saveAll(computers);

        computerDtos = new ArrayList<>();
        for (Computer computer : computers) {
            computerDtos.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDtos;
    }
}
