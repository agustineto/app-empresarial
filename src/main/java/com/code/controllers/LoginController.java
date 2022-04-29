package com.code.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
public class LoginController {
	
	private String usuario;
	private String password;
	

	
	public void ingresar() {
		System.out.println("Boton ingresar, Usuario: " + usuario);
		if(usuario.equals("jsf") && password.equals("jsf")) {
			FacesContext.getCurrentInstance().addMessage("formularioLogin:txtUsuario", 
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Correcto", ""));
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formularioLogin:txtUsuario", 
						new FacesMessage(FacesMessage.SEVERITY_INFO, "La página no existe", ""));
				e.printStackTrace();
			}
		}else {
			FacesContext.getCurrentInstance().addMessage("formularioLogin:txtUsuario", 
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Incorrecto", ""));
		}
	}
	
	public void redireccionar(String pagina) throws IOException {
		ExternalContext exContext = FacesContext.getCurrentInstance().getExternalContext();
		exContext.redirect(pagina);
		
	}


	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	
}
