package dgtic.core.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InicioController {
    @Value("${mensaje.application}")
    private String valor;

    @RequestMapping(value = "/",method = RequestMethod.GET )
    public String inicio(){
        return "inicio";
    }
    @RequestMapping(value = "modelo",method = RequestMethod.GET )
    public String modelo(Model model){
        model.addAttribute("mensaje","Hola Spring MVC");
        return "inicio";
    }
    @RequestMapping(value = "aplicacion",method = RequestMethod.GET )
    public String modeloAplicacion(Model model){
        model.addAttribute("mensaje","Hola Spring MVC");
        model.addAttribute("app",valor);
        return "inicio";
    }
    //    @RequestMapping(value = "principal",method = RequestMethod.GET )
//    public String modeloPrincipal(){
//        return "principal";
//    }
    @RequestMapping(value = "principal",method = RequestMethod.GET )
    public String modeloPrincipal(Model model){
        model.addAttribute("contenido","Pagina Principal");
        return "principal/principal";
    }

    @RequestMapping(value = "cambio",method = RequestMethod.GET )
    public String modeloPrincipalCambio(Model model){
        return "principal/principal";
    }

}
