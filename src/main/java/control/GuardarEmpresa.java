package control;

import java.util.HashSet;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Empresa;
import modelo.EmpresaDAO;

/**
 *
 * @author ludus
 */
@ManagedBean
@ViewScoped
public class GuardarEmpresa {
    private int idempresa;
    private String nombre;
    private String oficinas;
    private Integer numempleados;
    private String contacto;
    private Set vacantes;

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOficinas() {
        return oficinas;
    }

    public void setOficinas(String oficinas) {
        this.oficinas = oficinas;
    }

    public Integer getNumempleados() {
        return numempleados;
    }

    public void setNumempleados(Integer numempleados) {
        this.numempleados = numempleados;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Set getVacantes() {
        return vacantes;
    }

    public void setVacantes(Set vacantes) {
        this.vacantes = vacantes;
    }
    
    public void guardarEmpresa() {
        Empresa emp = new Empresa();
        
        emp.setIdempresa(idempresa);
        emp.setNombre(nombre);
        emp.setOficinas(oficinas);
        emp.setNumempleados(numempleados);
        emp.setContacto(contacto);
        EmpresaDAO empDAO = new EmpresaDAO();
        empDAO.insert(emp);
    }
    
}
