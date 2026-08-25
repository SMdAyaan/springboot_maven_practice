Scanner sc = new Scanner(System.in) is used to read the user input
It can be invoked by typing "sysout"

nextBoolean() - Used for reading Boolean value                    
nextByte() - Used for reading Byte value
nextDouble() - Used for reading Double value
nextFloat() - Used for reading Float value
nextInt() - Used for reading Int value
nextLine() - Used for reading Line value
nextLong() - Used for reading Long value
nextShort() - Used for reading Short value

print() - Prints the output without moving the cursor to the next line.
println() - Prints the output and then moves the cursor to the next line.
printf() - Prints formatted output using format specifiers.

Final - Keyword used for a variable which has to remain constant throughout the execution

IntStream is a specialized stream in Java for handling sequences of primitive int values, supporting both sequential and parallel operations.
IntStream.range(1, 5); // 1, 2, 3, 4 (end exclusive)
IntStream rangeClosed = IntStream.rangeClosed(1, 5); // 1, 2, 3, 4, 5 (end inclusive)

-----------------------------------------------------------

ABSTRACT CLASS:
An Abstract class can have both abstract and concrete methods.
An abstract class can be referenced to an object but it can't be instantiated to an object.

INNER CLASS:
An inner class is a class inside another class
These classes provide a better sense of encapsulation
We cannot instantiate an interface

FUNCTIONAL INTERFACES
A functional interface in Java is an interface with exactly one abstract method, designed to be implemented using lambda expressions or method references.

LAMBDA EXPRESSION
A lambda expression in Java is an anonymous function that provides a concise way to implement a functional interface, introduced in Java 8 to enable functional-style programming.

THREADS
The moment you extend a normal class with Thread, then that class becomes a Thread
In every thread, you need to have a run() method
The range of each priority goes from 1(least) to 10(highest)

Streams cannot go back to the previous state.

------------------------------------------------------------------

COLLECTIONS:
The Java Collections Framework is a set of classes and interfaces that provide standardized ways to store, manipulate, search, sort, and retrieve groups of objects.

Iterable
   |
Collection
   |
   +---- List
   |       |
   |       +--- ArrayList
   |       +--- LinkedList
   |       +--- Vector
   |             |
   |             +--- Stack
   |
   +---- Set
   |       |
   |       +--- HashSet
   |       +--- LinkedHashSet
   |       +--- TreeSet
   |
   +---- Queue
           |
           +--- PriorityQueue
           +--- ArrayDeque

Map (separate hierarchy)
   |
   +--- HashMap
   +--- LinkedHashMap
   +--- TreeMap
   +--- Hashtable
   +--- ConcurrentHashMap

Collection vs Collections:
Collection - An interface (Collection<String> col = new ArrayList<>();)
Collections - A utility class containing several helper methods like sort(),distinct()

LIST:
Maintains insertion order
Allows duplicates
Provides index-based access

ArrayList - Used for dynamic Array, Most commonly used.
LinkedList - implemented using a doubly Linked List
Stack - LIFO

SET:
No duplicates
No index
HashSet- Internally uses Hashmap

MAP:
Stores Key -> Value
