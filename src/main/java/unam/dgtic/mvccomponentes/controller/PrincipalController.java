package unam.dgtic.mvccomponentes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "spring")
public class PrincipalController {

    @GetMapping("getmapping")
    public String getMapping(Model model) {
        model.addAttribute("contenido", "@Getmapping en Método");
        return "spring/getmapping";
    }
}
