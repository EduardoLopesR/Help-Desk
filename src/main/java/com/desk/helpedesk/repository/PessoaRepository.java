package com.desk.helpedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desk.helpedesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
