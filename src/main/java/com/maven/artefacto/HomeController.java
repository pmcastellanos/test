/************
 * @author: pcastesa
 * @date: 15/02/2025
 *****/


package com.maven.artefacto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "hola chicos y chicas y gatos/gatas";
    }
}
