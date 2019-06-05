# eurekaDemo
1.该项目主要模拟eureka的注册，发现和消费，其中消费者通过在ServiceRibbonApplication中注入RestTemplate时配置@LoadBalanced，实现负载均衡；
2.先启动server【服务的注册中心，类似于zookeeper】，再启动注册的服务和消费者。模拟注册服务集群时，可以先配置8762启动一个app，再配置8763启动一个app；
3.启动消费者，输入测试url：
  http://127.0.0.1:8764/hi?name=qweqwue
  发现获取的服务器内容是8762和8763轮询得到的，即负载均衡生效。

参考文献：https://blog.csdn.net/forezp/article/details/69788938
