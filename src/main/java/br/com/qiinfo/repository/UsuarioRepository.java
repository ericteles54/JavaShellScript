package br.com.qiinfo.repository;

import br.com.qiinfo.model.Usuario;

/**
 * 
 * Classe responsável por manipular os objetos do tipo Usuário do sistema
 * 
 *   
 * @author Eric Teles Leite
 *
 */
public class UsuarioRepository {

	private Usuario usuario;
	
	/**
	 * Metodo que adiciona um usuário ao sistema
	 * 
	 * @param usuario
	 */
	public void adicionar(Usuario usuario) {
		this.usuario = usuario;
		System.out.println("Usuario " + this.usuario.getNome() + " adicionado com sucesso");		
	}
	
	/**
	 * Metodo que remove um usuário do sistema
	 * 
	 * @param usuario_id
	 */
	public void remover(Long usuario_id) {
		System.out.println("Removendo usuário ID:" + usuario_id);
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
