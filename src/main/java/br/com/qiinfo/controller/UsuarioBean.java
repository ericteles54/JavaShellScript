package br.com.qiinfo.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.qiinfo.model.Usuario;
import br.com.qiinfo.repository.UsuarioRepository;
import br.com.qiinfo.util.ExecutaComandoShell;

/**
 * 
 * Classe ManagedBean responsável pela interface web de manipulação de Usuarios
 * do sistema
 * 
 * @author Eric Teles Leite
 *
 */

@ManagedBean
@ViewScoped
public class UsuarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Usuario usuario;
	private String comando;

	public UsuarioBean() {
		this.usuario = new Usuario();
	}

	/**
	 * Método responsável por adionar usuários ao sistema
	 */
	public void adicionar() {
		UsuarioRepository usuarioRepository = new UsuarioRepository();
		usuarioRepository.adicionar(this.usuario);

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Usuário " + this.usuario.getNome() + " adicionado com sucesso"));

		this.usuario = new Usuario();
	}

	public void executarComando() {
		ExecutaComandoShell executaComandoShell = new ExecutaComandoShell();
		System.out.println(executaComandoShell.executarComando(this.comando));
				
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getComando() {
		return comando;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}

}
