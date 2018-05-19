package br.henrique.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Veiculo extends AbstractEntityImpl {	

		@Column(length=200)
		private String modelo;
		@Column (length = 100)
		private String marca;
		@Column
		private Integer ano;
		@Column(length=20)
		private String cor;		
		@Column 
		private Integer chassi;
		@Column
		private Integer renavam;
		@Column
		private Double valor;
		
		private transient Double valorInicial;
		
		private transient Double valorFinal;
		
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public Integer getAno() {
			return ano;
		}
		public void setAno(Integer ano) {
			this.ano = ano;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public Integer getChassi() {
			return chassi;
		}
		public void setChassi(Integer chassi) {
			this.chassi = chassi;
		}
		public Integer getRenavam() {
			return renavam;
		}
		public void setRenavam(Integer renavam) {
			this.renavam = renavam;
		}
		public Double getValor() {
			return valor;
		}
		public void setValor(Double valor) {
			this.valor = valor;
		}
		public Double getValorInicial() {
			return valorInicial;
		}
		public void setValorInicial(Double valorInicial) {
			this.valorInicial = valorInicial;
		}
		public Double getValorFinal() {
			return valorFinal;
		}
		public void setValorFinal(Double valorFinal) {
			this.valorFinal = valorFinal;
		}
	
	
}
