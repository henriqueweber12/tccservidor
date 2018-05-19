package br.henrique.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class VeiculoAdicionais extends AbstractEntityImpl{
	
	@ManyToOne
	@JoinColumn (name="id_veiculo", referencedColumnName="id")
	private Veiculo veiculo;
	
	@ManyToOne
	@JoinColumn (name="id_adicionais", referencedColumnName="id")
	private Adicionais adicionais;

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Adicionais getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(Adicionais adicionais) {
		this.adicionais = adicionais;
	}
	

}
