## Mule 社区版的一些实例

### 1. 官网的工具下载太慢了，所以放到了[百度盘](http://pan.baidu.com/s/1slTc4A5),请选择自己所需的版本下载

### 2. WebService
#### 1. CXF方式发布
#####1. 发布一个简单service
一个mule形式展现的SOA API至少要三个要素
1. **endpoint** _接受请求，发送响应_
2. **CXF组件** _一个SOA API，当收到请求的时候，通过在URL后添加?wsdl 暴露其wsdl文件来展现接口，通过CXF，Mule有两种展示wsdl的形式_：

       1.wsdl first  把自己建立的WSDL文件连接到CXF组件引用
       2.代码 first   采用Java注解，用 JAX-WS编译一个以此为基础的WSDL
可以通过CXF组件来验证WSDL传入请求有效性  

CXF组件同样允许你选择一种类型的操作

       1. Proxy Service 允许你直接在flow中处理XML文件，这就意味着更少的转换，
       
3. **处理组件** 处理请求，执行业务逻辑
#####2. 发布一个JAX-WS service
#####3. 代理一个已发布的service
       
### 3. JMS

### 4. Maven