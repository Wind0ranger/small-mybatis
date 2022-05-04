学习mybatis
## 一、创建简单的映射器代理工厂
1. 提供一个映射器的代理实现类 MapperProxy，通过代理类包装对数据库的操作。
2. 提供工厂实例化操作 MapperProxyFactory#newInstance，为每个 IDAO 接口生成代理类。
![img.png](fig/img_1_1.png)
![img.png](fig/img_1_2.png)
6. 