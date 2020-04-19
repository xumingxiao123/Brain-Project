package community.xumingxiao.community.controller;

import community.xumingxiao.community.dto.AccessTokenDTO;
import community.xumingxiao.community.dto.GithubUser;
import community.xumingxiao.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name="code")String code,
                           @RequestParam(name="state")String state){
        AccessTokenDTO accessTokenDTO=new AccessTokenDTO();
        accessTokenDTO.setClient_id("7c8b8107134709190c9d");
        accessTokenDTO.setClient_secret("b38c1f8a5d5c6303e6d83f5d24eb54b1be7b61a1");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri("http://localhost:1234/callback");
        accessTokenDTO.setState(state);
        String accessToken =githubProvider.getAcessToken(accessTokenDTO);
        //GithubUser user=githubProvider.getUser(accessToken);
        //System.out.println(user.getName());
        return"index";
    }
}
