# Swagger2 整合说明文档V1.0.0 

#### 步骤一：基础准备

​	**Swagger2 pom 依赖**

​		在父工程的 pom 增加 依赖及版本号，方便进行统一版本控制

```
	<!--版本号-->
	<properties>
        <swagger.version>2.9.2</swagger.version>
    </properties>
    
    <!--依赖版本管理-->
    <dependencyManagement>
        <dependencies>
            <!-- swagger -->
            <dependency>
                <groupId>io.springfox</groupId>
                <artifactId>springfox-swagger2</artifactId>
                <version>${swagger.version}</version>
            </dependency>
            <dependency>
                <groupId>io.springfox</groupId>
                <artifactId>springfox-swagger-ui</artifactId>
                <version>${swagger.version}</version>
            </dependency>
        </dependencies>
    </dependencyManagement>
```



#### 步骤二：

