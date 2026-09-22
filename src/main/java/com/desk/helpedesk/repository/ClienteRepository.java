package com.desk.helpedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desk.helpedesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
