public class Cat extends Animal {


    public Cat(String name, int age){
        super(name, age);
    }

    public void meow(){
        System.out.println(this.getName() + " is meowing" );
    }

//    @Override
//    public void walk() {
//        super.walk();
//    }

//    @Override
//    public void walk() {
//        super.walk();
//        System.out.println("Also he is a cat");
//    }

    @Override
    public void walk() {
        System.out.println("This cat's name is " + this.getName() + " and he is walking");
    }

    @Override
    public String toString() {
        return String.format("This cat's name is %s and he is %s years old",this.getName(),this.getAge());
    }
}
