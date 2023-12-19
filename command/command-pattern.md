The Command Pattern allows you to decouple the requester of an action from the object that actually performs the action. （separate requester from executor)

Customer - Order - Waitress - Cook
Client - Command - Invoker - Receiver

### Definition

The Command Pattern encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.
The Meta Command Pattern allows you to create macros of commands so that you can execute multiple commands at once.

#### Null Object

A null object is useful when you don’t have a meaningful object to return, and yet you want to remove the responsibility for handling null from the client.

### Use lambda expression to implement command pattern

You can use Java’s lambda expressions to skip the step of creating all those concrete command objects. With lambda expressions, instead of instantiating the concrete command objects, you can use function objects in their place. In other words, we can use a function object as a command. Yet there is a limitation: the interface must be a functional interface. A functional interface is an interface that contains exactly one abstract method. This constraint is what allows lambda expressions to work as they do. When you write a lambda expression, you're essentially providing an implementation of the abstract method in the functional interface.

Commands give us a way to package a piece of computation (a receiver and a set of actions) and pass it around as a first-class object. Use cases include queuing up requests for threads to consume, logging requests with object serialization for recovery in case of system failure, and undoable operations.
