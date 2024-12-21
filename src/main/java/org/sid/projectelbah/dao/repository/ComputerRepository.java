package org.sid.projectelbah.dao.repository;

import org.sid.projectelbah.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer,Long> {
public List<Computer> getComputerByProce(String proce);
}
