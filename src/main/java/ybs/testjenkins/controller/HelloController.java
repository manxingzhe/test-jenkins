package ybs.testjenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String testHello(ModelMap modelMap){
        modelMap.put("hello","hello world 111");
        return "index";
    }
}
