package day14.hackerrankproblems;
class Cycle {

    void print() {
        System.out.println(
                "My ancestor is a cycle who is a vehicle with pedals."
        );
    }
}

class Motorcycle extends Cycle {

    @Override
    void print() {
        System.out.println(
                "Hello I am a motorcycle, I am a cycle with an engine."
        );

        super.print();
    }
}

public class SuperKeywordDemo {

    public static void main(String[] args) {

        Motorcycle motorcycle = new Motorcycle();

        motorcycle.print();
    }
}