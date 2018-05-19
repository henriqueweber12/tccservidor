package br.henrique.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrcamentoVeiculoAdicional extends AbstractEntityImpl {
	
	@ManyToOne
	@JoinColumn (name="id_adicionais", referencedColumnName="id")
	private Adicionais adicionais;
	
	@ManyToOne
	@JoinColumn (name="id_orcamentos", referencedColumnName="id")
	private Orcamentos orcamentos;

	public Adicionais getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(Adicionais adicionais) {
		this.adicionais = adicionais;
	}

	public Orcamentos getOrcamentos() {
		return orcamentos;
	}

	public void setOrcamentos(Orcamentos orcamentos) {
		this.orcamentos = orcamentos;
	}
}
