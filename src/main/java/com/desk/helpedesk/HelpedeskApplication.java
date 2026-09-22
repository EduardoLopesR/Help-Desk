package com.desk.helpedesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desk.helpedesk.domain.Chamado;
import com.desk.helpedesk.domain.Cliente;
import com.desk.helpedesk.domain.Tecnico;
import com.desk.helpedesk.domain.enums.Perfil;
import com.desk.helpedesk.domain.enums.Prioridade;
import com.desk.helpedesk.repository.ChamadoRepository;
import com.desk.helpedesk.repository.ClienteRepository;
import com.desk.helpedesk.repository.TecnicoRepository;

@SpringBootApplication
public class HelpedeskApplication implements CommandLineRunner {

	HelpedeskApplication(TecnicoRepository tecnicoRepository, ClienteRepository clienteRepository, ChamadoRepository chamado, ChamadoRepository chamadoRepository) {
		this.tecnicoRepository = tecnicoRepository;
		this.clienteRepository = clienteRepository;
		this.chamadoRepository = chamado;
		this.chamadoRepository = chamadoRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(HelpedeskApplication.class, args);
	}

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Tecnico tecnico = new Tecnico(null, "Edu", "14141414141", "dudukakaroto4@gmail.com.br", "123");
		tecnico.addPerfil(Perfil.ADMIN);
		
		Cliente cliente = new Cliente(null, "Jose", "12345","jose@jose.com","123");
		
		Chamado chamado = new Chamado(null, Prioridade.ALTA, com.desk.helpedesk.domain.enums.Status.ANDAMENTO, "Chamado1", "Primeiro Chamado", tecnico, cliente);
		
		tecnicoRepository.saveAll(Arrays.asList(tecnico));
		clienteRepository.saveAll(Arrays.asList(cliente));
		chamadoRepository.saveAll(Arrays.asList(chamado));
	}

}
