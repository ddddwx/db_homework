# 作业说明
## 数据库配置
1. 在PostgreSql中运行sql文件夹下的create.sql文件生成三张表以及插入数据
2. 对./demo_homework/src/main/resources下的`application.properties`进行配置
    - spring.datasource.url:数据库的存储位置需要进行修改，将示例代码中的`book_management`修改为自己对应的数据库
    - spring.datasource.username:管理此数据库的用户，将示例代码中的`postgres`修改为对应的管理员
    - spring.datasource.password:数据库密码

## 作业描述
> 一般的SpringBoot的分层为Controller层+Service层+DAO层+Model层，对应示例代码中的文件夹为：`cotroller`，`service`，`Repository`，`model`。分别对应的功能为：捕获前端请求、逻辑处理、数据库操作、表映射。

1. 进入./demo_homework/src/main/java/org/cu/db/demo中的`controller`文件夹，其中包含了`ExampleController`和`HomeworkController`两个类，作业需要实现`HomeworkController`类中的4个函数。（结合之前的sql练习的sql语句）
2. 每个函数的具体返回内容(请据此判断自己是否实现正确)：
   
    _在完成一个homework1函数后，点击IDEA右上角的"▶️"箭头启动项目，在浏览器输入`localhost:8082/homework/1`即可获取返回结果_
    - homework1返回参数：
        
        > [123,223,124,224,125,126]
    - homework2返回参数:
        
        > [{"callnumber":"Call123","name":"Iliad","isbn":"ISBN123","year":1997,"publisher":"Homer Publishing"},{"callnumber":"Call124","name":"Odyssey","isbn":"ISBN124","year":1997,"publisher":"Homer Publishing"}]
    - homework3返回参数:
        
        > 2
    - homework4返回参数:
        
        > ["Call123","Call125","Call124","Call126"]

## 提交
**在完成项目代码书写后，将代码push到Github或码云，生成仓库链接。将仓库链接复制到txt文件中，并附上本小组成员名单，最后提交到作业邮箱。**

## **命名：组号_实验四springboot练习.txt**

## 推荐阅读：
1. SpringBoot:[官方教程](https://spring.io/guides/gs/spring-boot/)、[易百教程](https://www.yiibai.com/spring-boot/)
2. Git教程:[廖雪峰教程](liaoxuefeng.com/wiki/896043488029600/896067008724000)、[Git简易手册](http://rogerdudler.github.io/git-guide/index.zh.html)、[Git使用手册](http://iissnan.com/progit/html/zh/ch1_0.html)
3. Mybatis教程:[mybatis文档](https://mybatis.org/mybatis-3/zh/index.html)

