# cainiao

第一个测试的github演示项目
spring boot简单实例跳坑
坑一：
   通过maven构建了一个简单的spring boot 项目，该项目没有任何内容，
   但是竟然给我报了一个错误，错误， 错误。。。。我的老天爷，晴天霹雳，这么简单的东西竟然报错：
   贴一下错误提示：Cannot determine embedded database driver class for database type NONE
   翻译：无法为不存在数据库嵌入驱动类型
   解决办法：在启动项目的main类上加注解@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
   按照上面的提示添加你会发现 改注解有问题， 尝试启动项目， what? 项目竟然被启动了，没有错。。。。
   可是提示很明显了:Attributes should be specified via @SpringBootApplication
   
   最后明白辽： @SpringBootApplication注解是SpringBoot的核心注解，它其实是一个组合注解：  
          该注解主要组合了以下注解：
          
          1. @SpringBootConfiguration：这是SpringBoot项目的配置注解，这也是一个组合注解：
          
          在Spring Boot项目中推荐使用@SpringBootConfiguration替代@Configuration
          
          2. @EnableAutoConfiguration：启用自动配置，该注解会使SpringBoot根据项目中依赖的jar包自动配置项目的配置项：
          
          a)  如：我们添加了spring-boot-starter-web的依赖，项目中也就会引入SpringMVC的依赖，SpringBoot就会自动配置tomcat和SpringMVC
          3. @ComponentScan：默认扫描@SpringBootApplication所在类的同级目录以及它的子目录。
          
          所以现在明白了：其实是告诉你你用@EnabelAutoConfiguration是和@SpringBootApplication重复了，重复但是不是错啊，小兄弟，所以虽然
          提示有问题，但是不妨碍启动项目，由上可知我们也可以改成@SpringBootAppication(exclude={DataSourceAutoConfiguration.class})
          
              spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration,org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration
 
          
