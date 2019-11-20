package pl.lawsome.workshopspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller//bardziej specyficzna adnotacja niż component
public class HelloController {

    //http://localhost:8080/hello?name=Maetusz
    @GetMapping(value = "/hello")//get odbieramy dane, post wysyyłamy
    public String getHello(@RequestParam String name, Model model)//można requier false wtedy nie trzeba parmatru
    //zamisat requestParam może być pathVariable w itedy @GetMapping(value = "/hello/{name}")
    {
        model.addAttribute("inputName", name);//odpowienida nazwa w html
        return "hello";
    }
    //w spring mamy ViewResolver i zwróci widok, który jest w odpowiendim miejsu

}
