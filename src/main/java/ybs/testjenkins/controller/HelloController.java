package ybs.testjenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String testHello(ModelMap modelMap){
        modelMap.put("hello","hello world 101");
        return "index";
    }
}
