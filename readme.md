#2021.01.12
> done：
1. 微服务搭架子，eureka、zuul
2. user模块简单实现了个demo

> 今日份bug
1. IDEA用maven进行import报错Auto build completed with errors
    `repository`依赖下载下来了，`external liberaries`却没有依赖
Solution：后来发现是因为<depedency>放在<dependenciyManager>里，删掉<dependenciyManager>解决
2. 子模块引入依赖继承父模块版本时，还要嵌套<depedencyManager><depedency><depedencies>
3. mapper没有注入
```sql
No MyBatis mapper was found in '[com.phonestore.user]' package. Please check your configuration.
```
Solution：`tk.mapper`和`Mapper`依赖不能都导入，因为`tk.mapper`内置了`mapper`依赖
```xml
<!-- mybatis启动器 -->
<!--        <dependency>-->
<!--            <groupId>org.mybatis.spring.boot</groupId>-->
<!--            <artifactId>mybatis-spring-boot-starter</artifactId>-->
<!--        </dependency>-->
        <!-- 通用Mapper启动器 -->
        <dependency>
            <groupId>tk.mybatis</groupId>
            <artifactId>mapper-spring-boot-starter</artifactId>
        </dependency>
```
