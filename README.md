## 资料
[Spring 文档](https://spring.io/guides)    
[Spring Web](https://spring.io/guides/gs/serving-web-content/)   
[es](https://elasticsearch.cn/explore)    
[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)    
[Bootstrap](https://v3.bootcss.com/getting-started/)    
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)    
[Spring](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)    
[菜鸟教程](https://www.runoob.com/mysql/mysql-insert-query.html)    
[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values)    
[Spring Dev Tool](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#using-boot-devtools)  
[Spring MVC](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/web.html#mvc-handlermapping-interceptor)  
[Markdown 插件](http://editor.md.ipandao.com/)   
[UFfile SDK](https://github.com/ucloud/ufile-sdk-java)  
[Count(*) VS Count(1)](https://mp.weixin.qq.com/s/Rwpke4BHu7Fz7KOpE2d3Lw)  

## 工具
[Git](https://git-scm.com/download)   
[Visual Paradigm](https://www.visual-paradigm.com)    
[Flyway](https://flywaydb.org/getstarted/firststeps/maven)  
[Lombok](https://www.projectlombok.org)    
[ctotree](https://www.octotree.io/)   
[Table of content sidebar](https://chrome.google.com/webstore/detail/table-of-contents-sidebar/ohohkfheangmbedkgechjkmbepeikkej)    
[One Tab](https://chrome.google.com/webstore/detail/chphlpgkkbolifaimnlloiipkdnihall)    
[Live Reload](https://chrome.google.com/webstore/detail/livereload/jnihajbhpnppcggbcgedagnkighmdlei/related)  
[Postman](https://chrome.google.com/webstore/detail/coohjcphdfgbiolnekdpbcijmhambjff)


## 日志
- 2020-4-15 开始搭建环境
- 2020-4-16 运行出第一个网页
- 2020-4-17 导航栏制作
- 2020-4-18 实现登录功能
- 2020-4-20 解决重大问题，即登录时返回404网页。*以后要注意代码书写规范*
~~~
<a href="https://github.com/login/oauth/authorize?client_id=7c8b8107134709190c9d&redirect_uri=http://localhost:1234/callback&scope=user&state=1">登录</a>
<!-- 注意引号位置-->
~~~
- 2020-4-21 使用H2数据库实现持久化 BUG:There is no getter for property named 'account_id' in 'class
- 2020-4-24 解决 BUG:There is no getter for property named 'account_id' in 'class 
~~~
<!-- 错误写法-->
values (#{name},#{account_id},#{token},#{gmt_create},#{gmt_modified})
<!-- 正确写法-->
values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})
<!-- 注：要理解命令的作用！要注意细节！！！！！！！！！！！！！->
~~~