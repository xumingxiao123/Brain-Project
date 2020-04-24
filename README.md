## 日志
- 2020-4-15 开始搭建环境
1. Could not transfer artifact org.springframework.boot:spring-boot-starter-parent:pom:2.0.0.RELEASE
[link](https://blog.csdn.net/qq_38091949/article/details/94731101)
2. 解决idea中maven项目的pom文件不会自动下载jar包问题 + 更新不完整依赖命令
[link](https://blog.csdn.net/zhang33565417/article/details/97634921)
3. spring-boot-maven-plugin not found的解决方案
[link1](https://www.cnblogs.com/vevy/p/12246679.html)
[link2](https://www.iteye.com/blog/phoenixfu-2429768)
4. Maven配置远程仓库（方法二比较好用）
[link](https://blog.csdn.net/jiguquan3839/article/details/89287018)
5. Spring初学：Maven和Spring以及Spring Boot的简介以及区别
[link](https://blog.csdn.net/he13733625052/article/details/104663111/)
6. Maven cannot resolve spring-boot-maven-plugin 解决方案
[link](https://blog.csdn.net/qq_34792057/article/details/98378398)
7. Maven详解及常用命令
[link1](https://blog.csdn.net/qq_35627970/article/details/81163131)
[link2](https://blog.csdn.net/weixin_33814685/article/details/93560414?depth_1-utm_source=distribute.pc_relevant.none-task-blog-OPENSEARCH-1&utm_source=distribute.pc_relevant.none-task-blog-OPENSEARCH-1)
[link3](https://www.cnblogs.com/ysocean/p/7420373.html)
[link4](https://blog.csdn.net/qq_37776015/article/details/92178370)
[link5](https://www.jianshu.com/p/57eeac8860c0)
8. POM文件讲解[link1](https://blog.csdn.net/qq_33363618/article/details/79438044)
[link2](https://www.jianshu.com/p/77e410c27cad)
[link3](https://blog.csdn.net/qq_23659871/article/details/88826848)
[link4](https://blog.csdn.net/Coder_Qiang/article/details/83306721)
- 2020-4-16 运行出第一个网页
1. Spring工具包[link](https://spring.io/guides)
2. JSP替代
3. 用SpringMVC服务Web内容[link](https://spring.io/guides#tutorials)
4. SpringMvc三层架构注解详解@Controller、@Service和@Repository
[link1](https://spring.io/guides/gs/serving-web-content/)
[link2](https://blog.csdn.net/qq_41357573/article/details/84454502)
5. @Controller注解：用于指示Spring类的实例是一个控制器。
[link](https://www.jianshu.com/p/331a0afa8052)
6. IDEA中Maven依赖包下载不了的问题解决方案汇总
[link](https://blog.csdn.net/jwcxs_m/article/details/80076909)
7. IDEA在java和resources中创建包不分级、无法创建package等一揽子问题的解决方案
[link](https://blog.csdn.net/qq_37618760/article/details/104037867)
8. java.lang.NoSuchMethodError: org.springframework.web.util.UrlPathHelper.getLookupPathForRequest
[link](https://blog.csdn.net/zwd926/article/details/102967677)
- 2020-4-17 导航栏制作
1. Git注册
2. Git下载
[link](https://git-scm.com/download/win)
3. 仓库
[link](https://github.com/xumingxiao123/BrainProject)
4. IntelliJ IDEA 如何配置git
[link](https://blog.csdn.net/qq_32154641/article/details/80420150)
5. idea中使用github
[link](https://www.cnblogs.com/javabg/p/7987755.html)
6. Bootstrap官网[link1](https://www.bootcss.com/)
[link2](https://v3.bootcss.com/)
7. html-css-js基本理解和简单总结
[link](https://www.cnblogs.com/zzzlw/p/9626916.html)
8. 阿里巴巴代码手册
[link1](https://www.jianshu.com/p/1884cdc54409)
[link2](https://www.cnblogs.com/han-1034683568/p/7680354.html)
9. 使用gethub App
[link](https://developer.github.com/apps/)
10. Github 登录
[link](https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/)
11. 新用户注册[link](https://github.com/settings/applications/new)
- 2020-4-18 实现登录功能
1. okhttp
[link](https://square.github.io/okhttp/)
2. OkHttp的基本使用方法
[link](https://www.cnblogs.com/hankzhouAndroid/p/8709928.html)
3. Fastjson
[link](https://mvnrepository.com/)
4. java中关于set()和get()方法的理解和使用
[link](https://blog.csdn.net/weixin_42057767/article/details/81351666)
5. @SpringBootApplication
[link1](https://www.cnblogs.com/MaxElephant/p/8108140.html)
[link2](https://blog.csdn.net/qq_33863843/article/details/80824737)
[link3](https://www.jianshu.com/p/39ee4f98575c)
- 2020-4-20 解决重大问题，即登录时返回404网页。*以后要注意代码书写规范*
~~~
<a href="https://github.com/login/oauth/authorize?client_id=7c8b8107134709190c9d&redirect_uri=http://localhost:1234/callback&scope=user&state=1">登录</a>
<!-- 注意引号位置-->
~~~
1. 第三方登录，回调页面跳转
[link](https://blog.csdn.net/xihua1244914259/article/details/79000813)
2. 第三方登录实现原理
[link](https://blog.csdn.net/weixin_43885417/article/details/91163338)
3. 细说第三方登录—>PHP实现支付宝、QQ、微博、百度账号、Github登录
[link](https://blog.csdn.net/weixin_43885417/article/details/105102144)
4. Mybatis
[link](https://www.w3cschool.cn/mybatis/)
5. 什么是数据库连接池，有什么作用？
当链接数据库的时候，都是初始化链接，很花费时间。数据库连接池都是已经初始化的连接，可以拿来就使用，提高连接效率，并连接都是连接池自己管理不用自己管理
6. 一文搞懂Session和Cookie的用法及区别[link1](https://juejin.im/post/5d8330996fb9a06b1d217bf5)
HTTP协议是无状态的协议。一旦数据交换完毕，客户端与服务器端的连接就会关闭，再次交换数据需要建立新的连接，这就意味着服务器无法从连接上跟踪会话，即用户A购买了一件商品放入购物车内，当再次购买商品时服务器已经无法判断该购买行为是属于用户A。因而引入了跟踪会话的机制cookie与session。
Cookie保存在客户端浏览器中，而Session保存在服务器上。客户端浏览器访问服务器的时候，服务器把客户端信息以某种形式记录在服务器上，这就是Session
客户端们颁发一个通行证吧，每人一个，无论谁访问都必须携带自己通行证。这样服务器就能从通行证上确认客户身份了。这就是Cookie 的工作原理。
Session通过在服务器端记录信息确定用户身份，Cookie通过在客户端记录信息确定用户身份。
7. 自己尝试DEBUG!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
- 2020-4-21 使用H2数据库实现持久化 BUG:There is no getter for property named 'account_id' in 'class
- 2020-4-24 解决解决重大BUG:There is no getter for property named 'account_id' in 'class 
~~~
<!-- 错误写法-->
values (#{name},#{account_id},#{token},#{gmt_create},#{gmt_modified})
<!-- 正确写法-->
values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})
<!-- 注：要理解命令的作用！要注意细节！！！！！！！！！！！！！->
~~~

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