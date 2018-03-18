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
import modelo.ProfesionistaDAO;

/**
 *
 * @author ludus
 */
@ManagedBean
@ViewScoped
public class IniciarSesion {
    private int idprofesionista;
    private String contrasenia;
    private Profesionista profesionista;
    private String instrucciones;
    private FacesContext facesContext;
    private HttpSession session;

    public int getIdprofesionista() {
        return idprofesionista;
    }

    public void setIdprofesionista(int idprofesionista) {
        this.idprofesionista = idprofesionista;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Profesionista getProfesionista() {
        return profesionista;
    }

    public void setProfesionista(Profesionista profesionista) {
        this.profesionista = profesionista;
    }

    public FacesContext getFacesContext() {
        return facesContext;
    }

    public void setFacesContext(FacesContext facesContext) {
        this.facesContext = facesContext;
    }

    public HttpSession getHttpSession() {
        return session;
    }

    public void setHttpSession(HttpSession httpSession) {
        this.session = httpSession;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }
    
    public IniciarSesion() {
        profesionista = null;
        facesContext = FacesContext.getCurrentInstance();
        session = (HttpSession) facesContext.getExternalContext().
                                    getSession(true);
        instrucciones = (String) session.getAttribute("error");
        
        if (instrucciones == null)
            instrucciones = "Ingrese sus datos a continuación:";
        
    }
    
    public String iniciarSesion() {
        ProfesionistaDAO profDAO = new ProfesionistaDAO();
        Profesionista prof = profDAO.validar(idprofesionista,contrasenia);
        
        if(prof != null) {
            this.profesionista = prof;
            session.setAttribute("usuario", prof);
            session.removeAttribute("error");
            return "index?faces-redirect=true";
        }
        else {
            session.setAttribute("error","Id incorrecta o contraseña "+
                                         "incorrecta. Inténtelo de nuevo:");
            return "iniciarsesion?faces-redirect=true";
        }
        
    }
    
}
