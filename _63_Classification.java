// +----------------+
// |    Object      |
// +----------------+
//        |
//        v
// +----------------+
// |   Throwable    |
// +----------------+
//        |
// +--------------------+--------------------+
// |                                         |
// v                                         v
// +-----------+                           +-----------+
// |   Error   |                           | Exception |
// +-----------+                           +-----------+
// |                                         |
// v                                         v
// +-------------------+               +-------------------------------+
// | ThreadDeath       |               | RuntimeException              |
// +-------------------+               +-------------------------------+
// | VirtualMachineError|              | SQLException                  |
// | - OutOfMemoryError |              | IOException                   |
// +-------------------+               +-------------------------------+
// | IOError           |               | +--------------------------+  |
// +-------------------+               | | ArithmeticException       |  |
//                                     | +--------------------------+  |
//                                     | | ArrayIndexOutOfBoundsException|  |
//                                     | +--------------------------+  |
//                                     | | NullPointerException      |  |
//                                     | +--------------------------+  |
//                                     |                             |  |
//                                     +-----------------------------+  |




// Object Class: The root class of the Java class hierarchy. All classes are derived from Object.

// Throwable Class: The superclass for all errors and exceptions in Java.


// Error Class
// Errors indicate serious problems that a reasonable application should not try to catch. Errors are divided into:

// ThreadDeath: Represents an error that occurs when a thread is terminated.
// VirtualMachineError: Indicates that the Java Virtual Machine is broken or has run out of resources necessary for it to continue operating.
// OutOfMemoryError: Thrown when the JVM cannot allocate an object because it is out of memory.
// IOError: Signals that an I/O operation has failed.


// Exception Class
// Exceptions are events that disrupt the normal flow of the program's instructions. They are divided into:



// RuntimeException (Unchecked Exception): These exceptions are not checked at compile-time.
// ArithmeticException: Thrown when an arithmetic operation is performed that causes an error (e.g., division by zero).
// ArrayIndexOutOfBoundsException: Thrown when an array has been accessed with an illegal index.
// NullPointerException: Thrown when an application attempts to use an object reference that has the null value.
// Handling: It is optional to handle runtime exceptions. Developers can choose to handle them or let them propagate.


// SQLException (Checked Exception): Thrown when a database access error occurs.
// Handling: It is mandatory to handle SQL exceptions. They must be caught or declared in the method signature.


// IOException (Checked Exception): Thrown when an I/O operation fails or is interrupted.
// Handling: It is mandatory to handle IO exceptions. They must be caught or declared in the method signature.


public class _63_Classification {
    // Classification 
}
