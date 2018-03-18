/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import modelo.Profesionista;

/**
 *
 * @author ludus
 */
@ManagedBean
@ViewScoped
public class Index {
    private String mensajeBienvenida;
    private Profesionista usuario;
    private FacesContext facesContext;
    private HttpSession session;
    
    public Index() {
        facesContext = FacesContext.getCurrentInstance();
        session = (HttpSession) facesContext.getExternalContext().
                                getSession(true);
        usuario = (Profesionista) session.getAttribute("usuario");
        mensajeBienvenida = usuario == null ? "¡Bienvenido!" :
                                              ("¡Bienvenido, " +
                                               usuario.getNombre() +"!");
    }

    public String getMensajeBienvenida() {
        return mensajeBienvenida;
    }

    public void setMensajeBienvenida(String mensajeBienvenida) {
        this.mensajeBienvenida = mensajeBienvenida;
    }

    public Profesionista getUsuario() {
        return usuario;
    }

    public void setUsuario(Profesionista usuario) {
        this.usuario = usuario;
    }

    public FacesContext getFacesContext() {
        return facesContext;
    }

    public void setFacesContext(FacesContext facesContext) {
        this.facesContext = facesContext;
    }

    public HttpSession getSession() {
        return session;
    }

    public void setSession(HttpSession session) {
        this.session = session;
    }
    
}
