## 观察者模式
``定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖都会收到通知并自动跟新。``
### 类图
![类图](https://github.com/Frapschen/DesignPattern/blob/master/ObserverPattern/imgs/ClassUML.png)
### 使用方法
观察者模式的关键在于Subject接口与Observer接口。任何主题（被观察者）需要实现Subject接口
并持有一个Observer接口的结合。任何观察者需要实现Observer接口。然后，使用Subject接口中的
几个方法就可以注册、删除、通知观察者。 
### 使用场景
### 优缺点