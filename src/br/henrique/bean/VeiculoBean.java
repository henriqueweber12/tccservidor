package br.henrique.bean;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

import br.henrique.model.Usuario;
import br.henrique.model.Veiculo;

@LocalBean
@Stateless
public class VeiculoBean extends AbstractBeanImpl<Veiculo>{

	@Override
	public Class getClasse() {
		return Veiculo.class;
	}
	
	public List<Veiculo> listaVeiculo(Veiculo veiculo) throws Exception {
		String sql = "Select u From Veiculo u ";
		if (veiculo != null) {
			if (veiculo.getModelo() != null && veiculo.getModelo().equals("")) {
				sql += (sql.contains("where") ? "" : " where ") + "upper(u.modelo) = :modelo ";
			}
			else if (veiculo.getValorInicial() != null) {
				sql += (sql.contains("where") ? " and " : " where ") + " u.valor between :valorinicial and :valorfinal ";
			}
		}
		Query query = entity.createQuery(sql);
		if (veiculo.getModelo() != null) {
			query.setParameter("modelo", veiculo.getModelo().toUpperCase().trim());	
		}
		if (veiculo.getValorInicial() != null) {
			query.setParameter("valorinicial", veiculo.getValorInicial());
			query.setParameter("valorfinal", veiculo.getValorFinal());
		}
		
		List<Veiculo> listaveiculo = query.getResultList();
		
		return listaveiculo;
	}
	
}
