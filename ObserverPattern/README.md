## 观察者模式
``定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖都会收到通知并自动跟新。``
### 类图
![类图](https://github.com/Frapschen/DesignPattern/blob/master/ObserverPattern/imgs/ClassUML.png)
### 使用方法
* 观察者模式的关键在于Subject接口与Observer接口。任何被观察者(例子中是WeatherData)需要实现Subject接口并
持有一个Observer接口的集合。这个集合在``notifyObservers()``方法中被使用，循环给所有的观察者发送通知(发送数据，调用``update()``方法)
* 任何观察者需要实现Observer接口并实现``update()``方法，它持有一个被观察者的对象引用，通过这个引用就可以注册、删除观察者。 
* 观察者模式中，一般是被观察者推送数据到注册的观察者，还可以让观察者主动拉取数据。
### 使用场景
* 在java的GUI组件中，大量使用了观察者模式。
* 有关事件处理，数据监控，变化监控的场景使用。