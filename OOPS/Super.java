public class Super {
    public static void main(String[] args) {
        Horse sc = new Horse();
        System.out.println(sc.color);

    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "borwn"; // super key print first of all parent class propeties

        System.out.println("horse constructor called");
    }
}
