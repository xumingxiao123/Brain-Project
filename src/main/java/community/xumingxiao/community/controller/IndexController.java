package community.xumingxiao.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {
    //该注解将HTTP Get 映射到特定的处理方法上。
    @GetMapping("/")
    public String index(){ return "index"; }
}
