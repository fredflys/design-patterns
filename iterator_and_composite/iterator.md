## Iterator

### Definition

The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

It also places the task of traversal on the iterator object, not on the aggregate, which simplifies the aggregate interface and implementation, and places the responsibility where it should be. Traversal is separated from the aggregate object and is delegated to the iterator object.

### Design Principle

Single Responsibility: A class should have only one reason to change. Every responsbility of a class is an area of potential change.

### Notes

Cohesion is a measure of how closely a class or a module supports a single purpose or responsibility.

## Composite

### Problem

Now that we have refactored the code using the iterator pattern, what if a menu is needed, which has a tree structure (**nested** menu), i.e. a menu can has other menus as sub-menus? For exapmle, a dessert menu can be part of the cafe menu and includes different desserts. The current iterator pattern does not support such a design.

### Definition

The composite pattern allows you to compose objects into tree structures to represent part-whole hierachies. Composite lets clients treat individual objects and compositions of objects uniformly.
It has a recursive structure: a composite contains components and components come in two flavors: composites and leaf elements.
