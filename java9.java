// Interface definition
interface Number {
    int findCube(int n);
}

// Class A implementing the interface
class A implements Number {
    @Override
    public int findCube(int n) {
        return n * n * n; // Cube of the number
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        int number = 5;
        int cube = a.findCube(number);
        System.out.println("Cube of " + number + " is: " + cube);
    }
}
