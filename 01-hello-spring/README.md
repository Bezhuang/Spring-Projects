## Hello Spring

使用 Spring Boot 创建一个简单的 API（[localhost:8080](http://localhost:8080)）。

```java
@SpringBootApplication
@RestController
public class HelloSpringApplication {

    public static void main(String[] args) {
      	SpringApplication.run(HelloSpringApplication.class, args);
    }

    @GetMapping
    public List<String> hello() {
      	return List.of("Hello", "Spring");
    }

}
```

返回一个 `JSON` 文件：

```JSON
[
  	"Hello",
  	"Spring"
]
```

