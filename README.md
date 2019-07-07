<p align="center">
  <a href="http://avatar.wlgdo.com">
   <img alt="avatar-github-img" src="https://repository-images.githubusercontent.com/182984652/8992b700-7337-11e9-9c04-df8b5f02c21e">
  </a>
</p>

# Avatars
>Ps:为什么叫Avatar呢？其实简单，就是想提供一套灵活的，可以根据不用业务来‘画像’的轻应用框架。

本项目使用目前主流微服务架构技术，用到Springboot、springbootAdmin、Actuator监控（支持自定义Endpoint）、Dubbo、mybaties、Vue前端、Quartz集群
Gradle(Multiple modules)、mybatisPlus（多、动态数据源）、OAuth2.0授权服务（SaaS企业版）、微信小程序等等。
项目还整合Redis,MQ,Jenkin部署等中间件及自动化构建部署技术，
是一套完备的的企业级SOA架构，企业用户可以拿来即用，初学者可以逐级掌握的一套框架[持续支持]。

### 中台服务[avatar-service](https://github.com/wligang/avatars/tree/master/avatar-service)
 提供大中台支持、Rpc提供者、DB持久化等等核心服务

### 前台PAI服务[avatar-web-x](https://github.com/wligang/avatars/tree/master/avatar-web)
  提供各微应用API服务,如MQ消费者、RPC消费者、TCP、HTTP等等

### 后台服务[avatar-admin](https://github.com/wligang/avatars/tree/master/avatar-admin)
  提供大后台管理，权限校验，角色配置，监控等等
  
### 后台前端[avatar-admin-web](https://github.com/wligang/avatars/tree/master/avatar-admin-web)
  使用nodeJs容器,vue框架搭设的后台管理平台架构
### 任务调度中心[avatar-dynamic-quartz](https://github.com/wligang/avatars/tree/master/avatar-dynamic-quartz)
  使用多租户技术，做到分布式任务调度管理，动态数据源切换，任务调度管理与配置中心
### 多数据源模块[avatar-service-dynamic-datasource](https://github.com/wligang/avatars/tree/master/avatar-service-dynamic-datasource) 
   包括多数据源策略，动态数据源、读写分离、多租户、自定义quartz多数据源、多租户集群策略。
### 操作说明
  1、因为项目是使用gradle构建的多模块以来项目，所以需要在开发环境具备gradle环境，如果不习惯或者不喜欢gradle,依然可以使用相关的命令来吧gradle构建装化成maven构建，相关的操作可以自行csdn了解一下。
  2、整个项目虽然是基于多模块依赖构成，但是项目架构本身是松耦合，所以可以根据自己的业务要求来选择需要保留的模块，灵活操作。

### Hido互联

这个工程已经发布完成了一个简单版本，在微信小程序搜索“Hido互联”或者扫描下面的小程序码,即可体验

###下面是运行的效果

<img src="https://img-blog.csdnimg.cn/20190506121130640.jpg" width = "180" height = "300" div align="left"/>

<img src="https://img-blog.csdnimg.cn/20190506121145624.jpg" width = "180" height = "320" div align="left"/>

<img src="https://img-blog.csdnimg.cn/20190506121156678.jpg" width = "180" height = "320" div align="left"/>

<img src="https://img-blog.csdnimg.cn/20190506121209283.jpg" width = "180" height = "320" div align=""/>



### 小程序码
![https://img-blog.csdnimg.cn/20190505115944855.jpg](https://img-blog.csdnimg.cn/20190505115944855.jpg)



如果觉得项目不错，可以点个Star哦😉😉😉



