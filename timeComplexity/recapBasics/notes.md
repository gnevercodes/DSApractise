## Chapter 9:

1. JVM starts up, it gets a chunk of memory from the
   underlying OS and uses it to run your Java program.
2. In Java, we (programmers) care about the area of memory
   where objects live (the heap) and the one where method
   invocations and local variables live (the stack)
3. Methods are stacked : When you call a method, the method lands on the
   top of a call stack. That new thing that’s actually
   pushed onto the stack is the stack frame, and it
   holds the state of the method including which line
   of code is executing, and the values of all local
   variables.
4. Remember, a non-primitive variable holds a reference to an object,
   not the object itself. You already know where objects live—on the
   heap. It doesn’t matter where they’re declared or created.
5. Constructor Overloading
6. Constructor chaining .
7. super();
8. The call to super() must be the first statement
   in each constructor!
9. An object is alive as long as there are live references to it.
10. if that was the only live reference to the object, the object is now abandoned
    on the Heap. The reference variable disintegrated with the Stack frame, so
    the abandoned object is now, officially, toast. The trick is to know the point at
    which an object becomes eligible for garbage collection
11. Three types of Object-Killers.
12. static methods cant use instane variables nor the non static methods.
13. Static variable can have same value for any instances(good for counters.);
14. static variables are shared.
15. static final variables are constants

## TO-do

- [ ]Number formatting - 302
- [ ]Static imports page 303
