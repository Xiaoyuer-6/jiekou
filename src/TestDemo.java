
class Animal {
    public String name;

    public Animal eat() {
        System.out.println(this.name+"Animal eat!");
        return new Animal();
    }
}

class Dog extends Animal {
    public Dog eat() {
        System.out.println(this.name+"Dog eat!");
        return new Dog();
    }

    public void func() {
        System.out.println("func()");
    }
}
public class TestDemo {

    public static void main(String[] args) {
        //
        Animal animal = new Dog();
        animal.eat();
    }

}
