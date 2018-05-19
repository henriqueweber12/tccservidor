package br.henrique.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Orcamentos extends AbstractEntityImpl {
	
	@Column (length = 100)
	private String nomecliente;
	
	@Column (length = 100)
	private String emailcliente;
	
	@Column (length = 13)
	private String fonecliente;
	
	@ManyToOne
	@JoinColumn (name="id_veiculo", referencedColumnName="id")
	private Veiculo veiculo;
 
	@Column
	private Integer valor;
	
	@Column
	private String formapagamento;

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getEmailcliente() {
		return emailcliente;
	}

	public void setEmailcliente(String emailcliente) {
		this.emailcliente = emailcliente;
	}

	public String getFonecliente() {
		return fonecliente;
	}

	public void setFonecliente(String fonecliente) {
		this.fonecliente = fonecliente;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getFormapagamento() {
		return formapagamento;
	}

	public void setFormapagamento(String formapagamento) {
		this.formapagamento = formapagamento;
	}

	
	

}
