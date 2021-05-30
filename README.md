# Design Pattern with Java Implementation

## Software Engineering
- [ ] 耦合性
- [ ] 内聚性
- [ ] 可维护性
- [ ] 可扩展性
- [ ] 重用性
- [ ] 灵活性

## Principles
- 单一职责 Single Responsibility: easy
- 接口隔离 Interface Segregation: easy
- 依赖倒置 Dependence Inversion: make interaction abstract
- Liskov Substitution: all child class instance could replace parent class instance
  所有引用基类的地方必须能透明地使用其子类对象；在子类在尽量不要重写父类函数；可以通过"聚合、组合、依赖解决"
- 开闭原则 Open Closed Principle: OCP 软件实体（类、模块等）对扩展开放、对修改关闭
- Demeter Principle: 一个对象应该对其他对象保持最少的了解；类与类关系越密切，耦合度越大
- 合成复用原则 Composite Reuse Principle: 尽量使用合成/聚合的方式，而不是使用继承

### Dependence Inversion Implementation
- Interface
- Constructor
- setter method

### Singleton