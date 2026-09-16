package com.desk.helpedesk.domain;

import java.util.Set;

import com.desk.helpedesk.domain.enums.Perfil;

import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.jsontype.TypeSerializer;

public class Tecnico extends Pessoa {
	
	@SuppressWarnings("unused")
	private static long serialVersionUID = 1L;

	public Tecnico() {
		super();
		addPerfil(Perfil.TECNICO);
	}

	public Tecnico(Integer id, String nome, String cpf, String email, String senha, Set<Integer> perfis) {
		super(id, nome, cpf, email, senha, perfis);
		addPerfil(Perfil.TECNICO);
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
