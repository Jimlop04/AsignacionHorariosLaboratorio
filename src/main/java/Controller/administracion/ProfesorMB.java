package Controller.administracion;

import DAO.administracion.ProfesorDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import Model.administracion.Profesor;
import global.Mensajes;
import java.sql.SQLException;
import Controller.login.LoginMB;
import javax.faces.bean.ManagedBean;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;

/**
 *
 * @author ebert
 */
@Getter
@Setter
@ManagedBean
@javax.faces.view.ViewScoped
public class ProfesorMB extends Mensajes implements Serializable {

    static final String NUEVO = "Nuevo";
    LoginMB prueba = new LoginMB();
    static final String EDITAR = "Editar";
    List<Profesor> listarProfesor;
    Profesor profesor;
    String profesorModo;
    ProfesorDAO profesorDAO;

    @PostConstruct
    public void init() {
         System.out.println("1");
        try {
            int var = (Integer) prueba.httpSession.getAttribute("chiquito");            
        } catch (Exception ex) {
          
        }
         System.out.println("2");
        profesorDAO = new ProfesorDAO();
        profesor = new Profesor();
         System.out.println("3");
        

    }
    
}
