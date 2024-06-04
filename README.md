## SpringBoot & Vue3 学习笔记

课程收获

- 掌握SpringBoot3
- 掌握Vue
- 掌握单体应用中前后端常用的技术
- 独立完成管理系统的接口开发
- 独立完成管理系统的页面开发
- 掌握web开发常见解决方案



### SpringBoot概述

SpringBoot是Spring提供的一个子项目，用于快速构建Spring应用程序

##### 核心功能：Spring Framework

- Spring Data 数据获取
- Spring AMQP 消息传递
- Spring Security 认证授权
- Spring Cloud 服务治理

传统的方式构建Spring应用程序

- 导入依赖繁琐
- 项目配置繁琐

##### 起步依赖

本质上就是一个Maven坐标，整合了完成一个功能需要的所有坐标；

spring-boot-starter-web

##### 自动配置

遵循约定大约配置的原则，在boot程序启动后，一些bean对象会自动注入到ioc容器，不需要手动声明，简化开发

##### 其他特性

- 内嵌Tomcat, Jetty
- 外部化配置：只需要修改项目外部的配置文件
- 不需要XML配置

###  SpringBoot入门

- 创建Maven工程
- 导入 spring-boot-starter-web依赖
- 编写Controller
- 提供启动类

### 学习计划

- 基础篇

  - 配置文件

  - 整合MyBatis

  - Bean管理

  - 自动配置管理

  - 自定义Starter

- 实战篇
  - 项目开发
  - 整合三方技术
  - 项目部署
- 面试篇
  - 面试题
  - 源码

### 基础篇-04_springboot配置文件

- properties 配置文件

  - application.properties

  - ```java
    server.port=9090
    server.servlet.context.path=/start
    ```

- yaml / yml 配置文件

  - application.yml / application.yaml

  - ```java
    server:
    	port:9191
        servlet:
    		context-path:/start2
    ```

  

  

  

### 基础篇-05_yml配置信息书写和获取

- 

  - 三方技术配置信息

  - 自定义配置信息

  - ```java
    // application.yml配置
    email:
      user:1004462123@qq.com
      code:
      host:smtp.qq.com
      auth:true
    ```

  - ```java
    // 在代码中使用时，可使用@Value注解
    @Value("${email.user}")
    @Value("${email.code}")
    @Value("${email.host}")
    @Value("${email.auth}")
    
    // 当注解比较多时，会存在每一条都写得冗余代码
    @ConfigurationProperties(prefix="前缀")
    ```

### 基础篇-06_Springboot整合mybatis

```java
// pom.xml文件
// 添加数据库启动依赖
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>3.0.0</version>
</dependency>   

// 添加mysql依赖    
```

项目增加文件：

- SqlSessionFactoryBean
- MapperScannerConfigurer
- Datasource

UserController -> UserService -> UserMapper -> 操作数据库



### 基础篇-07_ Bean扫描

Bean扫描

- 标签：<context:component-scan base-package="com.itheima">
- 注解：@ComponentScan(basePackages = "com.itheima"

Springboot项目启动类上添加了@SpringBootApplication注解，

@SpringBootApplication注解中包含了@ComponentScan。



### 基础篇-08_ Bean注册

| 注解        | 说明                 | 位置                                              |
| ----------- | -------------------- | ------------------------------------------------- |
| @Component  | 声明Bean的基础注解   | 不属于以下三类，用此注解                          |
| @Controller | @Component的衍生注解 | 标注在控制器类上                                  |
| @Service    | @Component的衍生注解 | 标注在业务类上                                    |
| @Repository | @Component的衍生注解 | 标注在数据访问类上（由于与MyBatis整合，用的少）。 |

如果要注册的bean对象不是来自于第三方（不是自定义的），是无法使用@component及衍生注解声明bean的。

- @Bean
- @Import



### 基础篇-09_ 注册条件



### 基础篇-10_ 自动配置原理



### 基础篇-11_ 自定义Starter



### 实战篇-01_ 实战概述

- 市场需求：既要懂得后端的知识，也要懂得前端的知识。
- 知识整合
  - 后台知识：
    - Validation 数据校验
    - MyBatis 数据库操作
    - Redis 缓存
    - Junit 单元测试
    - SpringBoot 项目部署
  - 前端知识：
    - Vite Vue项目脚手架 
    - Router 路由
    - Pina 状态管理
    - Element - Plus UI组件



### 实战篇-02_ 开发模式和环境搭建

环境搭建

- 准备数据库表
- 创建springboot工程，引入对应的依赖（web、mybatis、mysql驱动）
- 配置文件application.yml中引入mybatis的配置信息
- 创建包结构，并准备实体类



#### 实战篇-03_ 注册接口



#### 实战篇-04_ 注册接口参数校验



#### 实战篇-05_ 登录主逻辑



#### 实战篇-06_ 登录认证引入



#### 实战篇-07_  JWT令牌



#### 实战篇-08_ 登录认证_完成



#### 实战篇-09_ 获取用户详细信息



#### 实战篇-10_ 获取用户详细信息_ThreadLocal优化



#### 实战篇-11_ 更新用户基本信息



#### 实战篇-12_ 更新用户基本信息_参数校验



#### 实战篇-13_ 更新用户头像



#### 实战篇-14_ 更新用户密码



#### 实战篇-15_ 新增文章分类



#### 实战篇-16_ 文章分类列表



#### 实战篇-17_ 获取文章分类详情



#### 实战篇-18_ 更新参数分类



#### 实战篇-19_ 更新文章分裂和添加文章分类



#### 实战篇-20_ 新增文章



#### 实战篇-21_ 新增文章参数校验_自定义校验



#### 实战篇-22_ 文章分类列表查询（条件分页）



#### 实战篇-23_ 文件上传_本地存储



#### 实战篇-24_ 文件上传 阿里云OSS 准备工作



#### 实战篇-25_ 文件上传 阿里云OSS 入门程序



#### 实战篇-26_ 文件上传 阿里云OSS 程序集成



#### 实战篇-27_ 登录优化_redis 思路分析



#### 实战篇-28_ 



#### 实战篇-29_ 



#### 实战篇-30_ 



#### 实战篇-31_ 



#### 实战篇-32_ 



#### 实战篇-33_ 



#### 实战篇-34_ 



#### 实战篇-35_ 



#### 实战篇-36_ 



#### 实战篇-37_ 



#### 实战篇-38_ 



#### 实战篇-39_ 



#### 实战篇-40_ 



#### 实战篇-41_ 



#### 实战篇-42_ 



#### 实战篇-43_ 



#### 实战篇-44_ 



#### 实战篇-45_ 



#### 实战篇-46_ 



#### 实战篇-47_



面试篇-01_ 面试篇导学



面试篇-02_ 前置知识_ ApplicationContextInitializer



面试篇-03_ 前置知识_ ApplicationListener



面试篇-04_ 前置知识_ BeanFactory



面试篇-05_ 前置知识_ BeanDefinition



面试篇-06_ 前置知识_ Aware



面试篇-07_ 前置知识_ InitilizingBean



面试篇-08_ 

