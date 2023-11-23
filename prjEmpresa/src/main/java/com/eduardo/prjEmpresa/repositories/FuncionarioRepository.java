package com.eduardo.prjEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.prjEmpresa.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
