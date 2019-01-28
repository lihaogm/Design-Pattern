## 1 设计模式介绍

### 1.1 设计模式简介

设计模式是一套被反复使用的，多人知晓的，经过分类编目的代码设计经验的总结。

### 1.2 设计模式的类型

- 创建者模式（例：工厂模式、单例模式等）

  ：提供了一种在创建对象的同时隐藏创建逻辑的方式，不是直接使用new来创建对象。

- 结构性模式（例：适配器模式、装饰者模式、代理模式等）

  ：关注类和对象的组合。

- 行为型模式（例：策略模式、解释器模式、观察者模式）

  ：关注对象之间的通信。

- J2EE模式（例：MVC模式、前端控制器模式等）

  ：关注表示层。

### 1.3 设计模式6大原则

1. 开闭原则

   ：对扩展开放，对修改关闭。拓展程序而不修改原有代码。

2. 里氏代换原则

   ：任何父类可以出现的地方，子类一定可以出现。只有当子类可以替换掉父类，且软件单位功能不受影响时，父类才能真正被复用，而子类也能够在父类的基础上增加新的行为。

3. 依赖倒转原则

   ：针对接口编程，依赖于抽象而不依赖与具体。

4. 接口隔离原则

   ：使用多个隔离的接口，比使用单个接口要好。降低类之间的耦合度。

5. 最少知道原则（迪米特原则）

   一个实体应该尽量少地与其他实体发生相互作用，使得系统功能模块相对独立。

6. 合成复用原则

   尽量使用合成（聚合）的方法，而不是继承。

## 2 工厂模式（Factory Pattern）

### 2.1 实现图

![](/Users/lihao/workspace/eclipse-workspace/Design-Pattern/pic/工厂模式实现.png)

### 2.2 实现步骤

1. 创建一个接口
2. 创建接口实现类
3. 创建一个工厂，生成基于给定信息的实体类的对象
4. 使用工厂，获取相应的实体对象

## 3 抽象工厂模式

### 3.1 实现图

![](/Users/lihao/workspace/eclipse-workspace/Design-Pattern/pic/抽象工厂模式实现.png)

### 3.2 实现步骤

1. 为形状和颜色分别创建接口
2. 创建接口的实现类
3. 为形状和颜色创建抽象工厂类 AbstractFactory
4. 创建工厂类继承抽象工厂类 ShapeFactory extends AbstractFactory
5. 创建工厂创造器类，通过相关信息生成指定工厂