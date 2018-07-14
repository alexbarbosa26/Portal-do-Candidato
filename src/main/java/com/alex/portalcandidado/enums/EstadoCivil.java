package com.alex.portalcandidado.enums;

public enum EstadoCivil {
	
	CASADO(1,"Casado"),
	SOLTEIRO(2,"Solteiro"),
	VIUVO(3,"Viúvo"),
	DIVORCIADO(4,"Divorciado"),
	SEPARADO(5,"Separado");
	
	private int cod;
	private String descricao;
	
	private EstadoCivil(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static EstadoCivil toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (EstadoCivil x : EstadoCivil.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id Invalido" + cod);
	}

}
