### Definition

The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

It also places the task of traversal on the iterator object, not on the aggregate, which simplifies the aggregate interface and implementation, and places the responsibility where it should be. Traversal is separated from the aggregate object and is delegated to the iterator object.

### Design Principle

Single Responsibility: A class should have only one reason to change. Every responsbility of a class is an area of potential change.

### Notes

Cohesion is a measure of how closely a class or a module supports a single purpose or responsibility.
