the Singleton Pattern is a time-tested method for ensuring only one object gets created. The Singleton Pattern also gives us a global point of access, just like a global variable, but without the downsides.

### Definition

The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

By adding the synchronized keyword to getInstance(), we force every thread to wait its turn before it can enter the method. That is, no two threads may enter the method at the same time. But synchronization is expensive. And the only time synchronization is relevant is the first time through this method.After the first time through synchronization is totally unneeded overhead.

If you are using a large number of Singletons in your application, you should take a hard look at your design. Singletons are meant to be used sparingly.
