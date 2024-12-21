package org.sid.projectelbah.web;

import lombok.AllArgsConstructor;
import org.sid.projectelbah.dto.ComputerDto;
import org.sid.projectelbah.service.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ComputerGraphQLController {
    private ComputerService computerService;

    @MutationMapping
    public ComputerDto saveComputer(@Argument ComputerDto computer){
        return computerService.saveComputer(computer);
    }

    @QueryMapping
    public List<ComputerDto> getComputerByProce(@Argument String proce){return computerService.getComputerByProce(proce);}

}
