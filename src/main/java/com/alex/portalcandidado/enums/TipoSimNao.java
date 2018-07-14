package com.alex.portalcandidado.enums;

public enum TipoSimNao {
	
	SIM(1,"Sim"),
	NAO(2,"Não");
	
	private int cod;
	private String descricao;
	private TipoSimNao(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	public int getCod() {
		return cod;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoSimNao toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (TipoSimNao x : TipoSimNao.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id Invalido" + cod);
	}

}
