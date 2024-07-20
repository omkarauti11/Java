public class _23_String {
    public static void main(String[] args) {

        String name = new String("Navin");
        System.out.println(name.hashCode());
        System.out.println(name);

        name = name + " hello";
        System.out.println(name.hashCode());
        System.out.println(name);


        String s1="Navin";
		String s2="Navin";
		
		System.out.println(s1==s2);

    }
}


// String: Immutable. Once a String object is created, it cannot be changed. Any operation that seems to modify the string actually creates a new String object.
// StringBuffer: Mutable. It can be modified after creation without creating a new object.
// StringBuilder: Mutable. Similar to StringBuffer, it can be modified after creation.


// String: Thread-safe due to its immutability.
// StringBuffer: Thread-safe. Methods are synchronized, making it suitable for use in multi-threaded environments.
// StringBuilder: Not thread-safe. Methods are not synchronized, making it faster than StringBuffer but not safe for use in multi-threaded environments.



// StringBuffer and StringBuilder in Java do not maintain a pool of strings similar to the String class. The String class has a concept of a string pool, also known as the interned string pool, which is used to save memory by storing only one copy of each distinct string value.