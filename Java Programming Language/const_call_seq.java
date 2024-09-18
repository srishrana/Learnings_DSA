public class const_call_seq {
    public static void main(String[] args) {
        Mustang ms = new Mustang();
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called!");
    }
}

class horse extends Animal {
    horse() {
        System.out.println("Horse constructor called!");
    }
}

class Mustang extends horse {
    Mustang() {
        System.out.println("Mustang const xcalled!");
    }
}
