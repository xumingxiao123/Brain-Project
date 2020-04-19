package community.xumingxiao.community.provider;
import com.alibaba.fastjson.JSON;
import community.xumingxiao.community.dto.AccessTokenDTO;
import community.xumingxiao.community.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GithubProvider {
public String getAcessToken(AccessTokenDTO accessTokenDTO){
    MediaType mediaType = MediaType.get("application/json; charset=utf-8");
    OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(mediaType,JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                //.url("https://github.com/login/oauth/access_token")

               // .url("https://github.com/login/oauth/access_token?client_id=7c8b8107134709190c9d&client_secret=b38c1f8a5d5c6303e6d83f5d24eb54b1be7b61a1&code="+accessTokenDTO.getCode()+"&redirect_uri=http://localhost:1234/callback&state=1")
                .url("https://github.com/login/oauth/access_token?client_id="+accessTokenDTO.getClinet_id()+"&client_secret="+accessTokenDTO.getClinet_secret()+"&code="+accessTokenDTO.getCode()+"&redirect_uri="+accessTokenDTO.getRediect_url()+"&state="+accessTokenDTO.getState())
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
             String string =response.body().string();
             //String token=string.split("&")[0].split("=")[1];
             //return token;
            System.out.println(string);
            return string;
        } catch (IOException e) {
            //e.printStackTrace();
        }
        return null;
}
public GithubUser getUser(String accessToken){
    OkHttpClient client = new OkHttpClient();
    Request request=new Request.Builder()
            // .url("https://api.github.com/user?access_token=4d059f22aef2ee61133280e626a987cb0a51ac24")
               .url("https://api.github.com/user?access_token="+accessToken)
                .build();

        try {
            Response response = client.newCall(request).execute();
            String string =response.body().string();
            GithubUser githubUser= JSON.parseObject(string, GithubUser.class);
            return githubUser;
        }catch(IOException e){
        }
        return null;
    }
}



