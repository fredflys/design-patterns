Example

- Java I/O relies heavily on decorators.

Design Principle

- Classes should be open for extension, but closed for modification.
- Designs that are resilient to change and flexible enough to take on new functionality to meet changing requirements.
- Applying the Open-Closed Principle (open to extension and closed to modification) EVERYWHERE is wasteful and unnecessary, and can lead to complex, hard-to-understand code. The decorator adds its own behavior before and/or after delegating to the object it decorates to do the rest of the job.

The Decorator Pattern attaches additional responsibilities to an object dynamically.  
Decorators provide a flexible alternative to subclassing for extending functionality.

Inheritance is applied here to achieve the type matching, not to get behavior. The behavior comes in through the composition of decorators with the base components as well as other decorators.

Downside:
Using this pattern often result in a large number of small classes that can be overwhelming to a developer trying to use the Decorator-based API.
