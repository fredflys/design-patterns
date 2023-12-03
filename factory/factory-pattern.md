### Definition

- The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

### Format

```java
abstract Product factoryMethod(String type)
```

- **abstract**: A factory method is abstract so the subclasses are counted on to handle object creation.

- **Product**: A factory method returns a Product that is typically used within methods defined in the superclass.
- **factoryMethod**: A factory method isolates the client (the code in the superclass, like orderPizza()) from knowing what kind of concrete Product is actually created.
- **parameter**: A factory method may be parameterized (or not) to select among several variations of a product.

### Notes

When you use the new operator you are certainly instantiating a concrete class.

A factory method handles object creation and encapsulates it in a subclass. This decouples the client code in the superclass from the object creation code in the subclass.

All factory patterns encapsulate object creation by letting subclasses decide what objects to create.

A default factory method can be defined to produce some concrete product. Then you always have a means of creating products even if there are no subclasses of the Creator class.

Creator - ConcreteCreator
Product - ConcreteProduct

Abstraction creates a layer between creator and concrete products. Abstract product can now serve as a middleman.

### Design Principle

#### Dependency Inversion Principle

Depend upon abstractions. Do not depend upon concrete classes.
High-level components should not depend on our low-level components; rather, they should both depend on abstractions. A “high-level” component is a class with behavior defined in terms of other, “low-level” components.

#### Guidlines

- No variable should hold a reference to a concrete class. (no **new** keyword)
- No class should derive from a concrete class.
- No method should override an implemented method of any of its base classes.

#### Inversion

The “inversion” in the name Dependency Inversion Principle is there because it inverts the way you typically might think about your OO design. The top-to-bottom dependency chart we drew a couple of pages back has inverted itself, with both high-level and low-level modules now depending on the abstraction.

Inverting your thinking by starting from bottom up and think about what you can abstract rather than starting at the top and following things down to concrete classes.

### Abstract Factory Pattern

The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

Abstract factory creates objects through composition and factory method through inheritance. Factory Method relies on inheritance: object creation is delegated to subclasses, which implement the factory method to create objects.
