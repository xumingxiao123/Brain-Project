package community.xumingxiao.community.dto;

import org.springframework.stereotype.Component;

@Component
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
    //alt+ins 快速创建get和set方法
    public String getClinet_id() { return client_id; }
    //public String getClient_id() { return client_id; }
    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }
    public String getClinet_secret() {return client_secret;  }
   // public String getClient_secret() { }
    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }
    public String getCode() { return code; }
    public void setCode(String code) {
        this.code = code;
    }
    public String getRediect_url() {return redirect_uri; }
   // public String getRedirect_uri() {return redirect_uri;}
    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }



}
