package br.com.bradseg.suportessv.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bradseg.suportessv.facade.ServidoresFacade;
 
@Controller
public class IndexController {

    @Autowired
    private ServidoresFacade servidoresFacade;

    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "Isso é um teste. Atenção !!");
        System.out.println(servidoresFacade.toString());
        return "index";
    }
     
    @RequestMapping("/next")
    public String next(Map<String, Object> model) {
        model.put("message", "You are in new page !!");
        return "next";
    }
 
}