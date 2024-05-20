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

##### 传统的方式构建Spring应用程序

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