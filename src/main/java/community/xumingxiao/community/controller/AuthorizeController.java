package community.xumingxiao.community.controller;

import community.xumingxiao.community.dto.AccessTokenDTO;
import community.xumingxiao.community.dto.GithubUser;
import community.xumingxiao.community.mapper.UserMapper;
import community.xumingxiao.community.model.User;
import community.xumingxiao.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;


    //@Value从application.properties中取对应的值
    @Value("${github.client.id}")
    private String clientId;
    @Value("${github.client.screct}")
    private String clientScrect;
    @Value("${github.redirect.uri}")
    private String redirectUri;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/callback")
    public String callback(@RequestParam(name="code")String code,
                           @RequestParam(name="state")String state,
                           HttpServletRequest request){
        AccessTokenDTO accessTokenDTO=new AccessTokenDTO();
        accessTokenDTO.setClient_id(clientId);
        accessTokenDTO.setClient_secret(clientScrect);
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri(redirectUri);
        accessTokenDTO.setState(state);
        String accessToken =githubProvider.getAcessToken(accessTokenDTO);
        GithubUser githubUser=githubProvider.getUser(accessToken);
        if(githubUser!=null){
            User user=new User();
            user.setToken(UUID.randomUUID().toString());
            user.setName(githubUser.getName());
            user.setAccountId(String.valueOf(githubUser.getId()));
            user.setGmtCreate(System.currentTimeMillis());
            user.setGmtModified(user.getGmtCreate());
            //写入数据库
            userMapper.insert(user);
            //登录成功，写cookie和session
            request.getSession().setAttribute("User",githubUser);
            return "redirect:/";
        }else{
            return "redirect:/";
        }
    }
}
