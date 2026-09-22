package com.desk.helpedesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desk.helpedesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
