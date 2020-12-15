### feign
* 声明式REST客户端，(伪RPC）
* 采用了接口加注解
1. 启动类加@EnableFeignClients
2. @FeignClient(name = "product")定义一个接口，name是要访问的服务名
3. 注入直接调用