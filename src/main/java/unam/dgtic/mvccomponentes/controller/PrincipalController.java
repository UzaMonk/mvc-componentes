package unam.dgtic.mvccomponentes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import unam.dgtic.mvccomponentes.model.Candidato;

@Controller
@RequestMapping(value = "spring")
public class PrincipalController {

    @RequestMapping(value = "requestmapping", method = RequestMethod.GET)
    public String mappingClase(Model model) {
        model.addAttribute("contenido", "@RequestMapping Clase");
        return "spring/requestmapping";
    }

    @GetMapping("getmapping")
    public String getMapping(Model model) {
        model.addAttribute("contenido", "@Getmapping en Método");
        return "spring/getmapping";
    }

    @GetMapping("parametros-uno/{edad}")
    public String getParametrosUno(@PathVariable("edad") int edad, Model model) {
        String cadena = "Tu edad es: " + edad;
        model.addAttribute("contenido", cadena);
        if (edad == 1) {
            return "redirect:/spring/getmapping";
        } else {
            return "spring/pathvariable";
        }
    }

    @GetMapping("parametros-dos/{edad}/{nombre}")
    public String getParametrosDos(@PathVariable("edad") int edad,
                                   @PathVariable("nombre") String nombre, Model model) {
        String cadena = "Hola " + nombre + " tu edad es " + edad;
        model.addAttribute("contenido", cadena);
        return "spring/pathvariable";
    }

    @GetMapping("requestparam")
    public String getRequestParam(@RequestParam(value = "dato", required = false) String informacion,
                                  Model model) {
        String cadena = "Sin Información";
        if (informacion != null) {
            cadena = "la informaciíon es:" + informacion;
        }
        model.addAttribute("contenido", cadena);
        return "spring/requestparam";
    }

    @GetMapping("requestparam-v")
    public String getRequestParam(@RequestParam(value = "dato", required = false) String informacion,
                                  @RequestParam(value = "diplomado", required = false) String diplo,
                                  Model model) {
        String cadena = "Sin Información";
        if (informacion != null) {
            cadena = "la informaciíon es:" + informacion + " diplomado " + diplo;
        }
        model.addAttribute("contenido", cadena);
        return "spring/requestparam";

    }

    //Desplegar formulario
    @GetMapping("ver-formulario")
    public String verFormulario(Model model) {
        model.addAttribute("contenido", "Ingresa los datos siguientes");
        return "spring/requestparam-post";
    }

    @PostMapping("recibir-informacion")
    public String recibirDatos(@RequestParam(value = "nombre") String nombre,
                               @RequestParam(value = "correo") String corre,
                               Model model) {
        String cadena = "Sin información";
        if (!nombre.isEmpty() && !corre.isEmpty()) {
            model.addAttribute("contenido", "Los datos que ingresas son:");
            cadena = "Tu nombre es:" + nombre + " y correo " + corre;
        }
        model.addAttribute("info", cadena);

        return "spring/requestparam-post";
    }

    @GetMapping("ver-Candidato")
    public String verCandidato(Model model) {
        model.addAttribute("contenido", "Ingresa los datos siguientes");
        return "spring/binding";
    }

    @PostMapping("recibir-Candidato")
    public String recibirCandidato(Candidato candidato, Model model) {
        String cadena = "Sin información";
        if (!candidato.getNombre().isEmpty() && !candidato.getCorreo().isEmpty()) {
            model.addAttribute("contenido", "Los datos que ingresas son:");
            cadena = "Tu nombre es:" + candidato.getNombre() + " y correo " + candidato.getCorreo();
        }
        model.addAttribute("info", cadena);
        return "spring/binding";
    }

    @GetMapping("ver-Candidato-v2")
    public String verCandidatoV2(Model model) {
        model.addAttribute("Candidato", new Candidato());
        model.addAttribute("contenido", "Ingresa los datos siguientes");
        return "spring/binding-v2";
    }

    @PostMapping("recibir-Candidato-v2")
    public String recibirCandidatov2(Candidato candidato, Model model) {
        String cadena = "Sin información";
        if (!candidato.getNombre().isEmpty() && !candidato.getCorreo().isEmpty()) {
            model.addAttribute("contenido", "Los datos que ingresas son:");
            cadena = "Tu nombre es:" + candidato.getNombre() + " y correo " + candidato.getCorreo();
        }
        model.addAttribute("info", cadena);
        return "spring/binding-v2";
    }

    @GetMapping("ver-Candidato-v3")
    public String verCandidatoV3(Model model) {
        model.addAttribute("Candidato", new Candidato());
        model.addAttribute("contenido", "Ingresa los datos siguientes");
        return "spring/binding-v3";
    }

}








