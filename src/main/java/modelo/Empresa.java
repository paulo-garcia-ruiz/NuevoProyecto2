package modelo;
// Generated 26/02/2018 07:08:39 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private int idempresa;
     private String nombre;
     private String oficinas;
     private Integer numempleados;
     private String contacto;
     private Set vacantes = new HashSet(0);

    public Empresa() {
    }

	
    public Empresa(int idempresa) {
        this.idempresa = idempresa;
    }
    public Empresa(int idempresa, String nombre, String oficinas, Integer numempleados, String contacto, Set vacantes) {
       this.idempresa = idempresa;
       this.nombre = nombre;
       this.oficinas = oficinas;
       this.numempleados = numempleados;
       this.contacto = contacto;
       this.vacantes = vacantes;
    }
   
    public int getIdempresa() {
        return this.idempresa;
    }
    
    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getOficinas() {
        return this.oficinas;
    }
    
    public void setOficinas(String oficinas) {
        this.oficinas = oficinas;
    }
    public Integer getNumempleados() {
        return this.numempleados;
    }
    
    public void setNumempleados(Integer numempleados) {
        this.numempleados = numempleados;
    }
    public String getContacto() {
        return this.contacto;
    }
    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public Set getVacantes() {
        return this.vacantes;
    }
    
    public void setVacantes(Set vacantes) {
        this.vacantes = vacantes;
    }




}


