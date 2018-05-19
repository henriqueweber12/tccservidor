package br.henrique.bean;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

import br.henrique.model.Usuario;

@LocalBean
@Stateless
public class UsuarioBean extends AbstractBeanImpl<Usuario> {

	@Override
	public Class getClasse() {
		return Usuario.class;
	}

	public Usuario logar(Usuario usuario) throws Exception {
		String sql = "Select u From Usuario u " + " where upper(u.email) = :email " + "   and upper(u.senha) = :senha ";
		Query query = entity.createQuery(sql);
		query.setParameter("email", usuario.getEmail().toUpperCase().trim());
		query.setParameter("senha", usuario.getSenha().toUpperCase());
		List<Usuario> lista = query.getResultList();
		if (lista.isEmpty()) {
			return null;
		}
		return lista.get(0);
	}
}
