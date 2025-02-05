# [SpringBoot](https://spring.io/projects/spring-boot)

## SpringBoot 四层架构

### controller

控制层，用来沟通前后端，注解为 `@RestController`

### entity/domain/POJO(Plain Old Java Objects)/model

实体层，

### mapper/DAO(Data Access Objects)

数据持久化层，负责和数据库进行交互，实现数据的增删改查。Mybatis mapper 主要与 .xml 进行交互。

### service

业务逻辑层，用来沟通数据层和控制层，实现具体的业务逻辑，注解为 `@Service`

## AOP

AOP(Aspect Oriented Programming 面向切面编程),

- Aspect(切面)
- Joint Point(连接点)
- Pointcut(切点)
- Advice(增强)
- Target(目标)
- Weaving(织入)

## page 分页
