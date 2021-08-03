# Feign小例子

### 技术参数

springboot 2.5.3， eureka，feign

### 目录结构
```$text
springcloud
    |______eureka_server(服务注册）
    |______service_consumer(Feign客户端）
    |______service_consumer2(Feign客户端2）
    |______service_provider(内容提供者）
    |______service_provider_api(公共api）

```
### 运行
* 执行顺序：eureka_server，service_provider，service_consumer
* 启动成功：http://localhost:1113/consumer/data?param=welcome

### Feign流程图
[![fFBHRx.png](https://z3.ax1x.com/2021/08/03/fFBHRx.png)](https://imgtu.com/i/fFBHRx)

### 仅供参考，如有错误，请手下留情。。
