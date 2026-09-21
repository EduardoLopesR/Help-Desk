package com.desk.helpedesk.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.desk.helpedesk.domain.enums.Perfil;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.jsontype.TypeSerializer;

@Entity
public class Tecnico extends Pessoa {
	
	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "tecnico")
	private List<Chamado> chamados = new ArrayList<>();

	public Tecnico() {
		super();
		addPerfil(Perfil.TECNICO);
	}

	public Tecnico(Integer id, String nome, String cpf, String email, String senha, Set<Integer> perfis) {
		super(id, nome, cpf, email, senha, perfis);
		addPerfil(Perfil.TECNICO);
	}
	
	

	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}

	@Override
	public void serialize(JsonGenerator gen, SerializationContext serializers) throws JacksonException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serializeWithType(JsonGenerator gen, SerializationContext serializers, TypeSerializer typeSer)
			throws JacksonException {
		// TODO Auto-generated method stub
		
	}
	
	
}
