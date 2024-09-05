public abstract class Animal {
//    public String name;
//    public String species;
//
//    public Animal(String name, String species) {
//        this.name = name;
//        this.species = species;
//    }
//
//    void eat() {
//        System.out.println("This animal eats food.");
//    }
//
//    void makeSound() {
//        System.out.println("Yohooo");
//    }
    abstract void sound();

    void sleep() {
        System.out.println("This animal is sleeping");
    }
}
