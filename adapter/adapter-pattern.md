## Adapter

OO adapters play the same role as their real-world counterparts: they take an interface and adapt it to one that a client is expecting. The adapter acts as the middleman by receiving requests from the client and converting them into requests that make sense on the vendor classes.

### Definition

The Adapter Pattern converts the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn’t otherwise because of
incompatible interfaces.

Decorator vs Adapter
Decorator allows new behavior to be added to classes without altering existing code. Adapter allows existing code to be used classes that wouldn’t otherwise be compatible.

## Facade

### Definition

The Facade Pattern provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

A facade not only simplifies an interface, it decouples a client from a subsystem of components.

Facades and adapters may wrap multiple classes, but a facade’s intent is to simplify, while an adapter’s is to convert the interface to something different.

One of the most important things to remember about a pattern is its intent. The purpose of the facade is to make a subsystem easier to use through a simplified interface.

## Principle

Principle of Least Knowledge: talk only to your immediate friends.
