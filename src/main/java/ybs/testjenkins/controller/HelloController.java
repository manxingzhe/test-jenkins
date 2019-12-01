package ybs.testjenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String testHello(ModelMap modelMap){
        modelMap.put("hello","hello world44");
        return "index";
    }
}
