
class Calculator {
    int num = 5;

    public int add(int n1, int n2) {
        System.out.println(num);
        return n1 + n2;
    }
}

public class _18_StackAndHeap {
    public static void main(String[] args) {

        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();

        int r1 = obj.add(3, 4);
        System.out.println(r1);


        obj.num = 8;

        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}



// Stack: Main Method
// +-----------------+
// | Reference to    |
// | obj1 (pointer)  |
// +-----------------+
// | Reference to    |
// | obj2 (pointer)  |
// +-----------------+

// Heap:
// +-----------------+     +-----------------+
// | obj1 instance   |     | obj2 instance   |
// | x = 10          |     | x = 20          |
// | Method (stack)  |     | x = 20          |
// +-----------------+     +-----------------+
