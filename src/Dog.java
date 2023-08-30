public class Dog extends Animal{

    private boolean isFed;

    public Dog(String name, int age, boolean isFed) {
        super(name, age);
        this.isFed = isFed;
    }


    public boolean isFed() {
        return isFed;
    }

    public void setFed(boolean fed) {
        isFed = fed;
    }

    public void bark(){
        System.out.println(this.getName() + " is barking");
    }

    @Override
    public void walk() {
        System.out.println("This dog's name is " + this.getName() + " and he is walking");
    }

    @Override
    public String toString() {
        return String.format("This dog's name is %s and he is %s years old",this.getName(),this.getAge());
    }
}
