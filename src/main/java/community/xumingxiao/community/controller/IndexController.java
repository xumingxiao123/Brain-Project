package community.xumingxiao.community.controller;

import community.xumingxiao.community.mapper.UserMapper;
import community.xumingxiao.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;


@Controller
public class IndexController {
    //该注解将HTTP Get 映射到特定的处理方法上
    @Autowired
    private UserMapper userMapper;
    //验证前端访问情况
    @GetMapping("/")
    public String index(HttpServletRequest request){
         Cookie[] cookies =request.getCookies();
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("token")){
                String token=cookie.getValue();
                User user=userMapper.findByToken(token);
                if(user!=null){
                    request.getSession().setAttribute("user",user);
                }
                break;
            }
        }
        return "index"; }
}
