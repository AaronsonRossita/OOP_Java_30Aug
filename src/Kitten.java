public class Kitten extends Cat {

    private boolean eatsOnItsOwn;


    public Kitten(String name, int age, boolean eatsOnItsOwn) {
        super(name, age);
        this.eatsOnItsOwn = eatsOnItsOwn;
    }

    public void play(){
        System.out.println("This kitten " + this.getName() + " is playing");
    }

    @Override
    public void walk() {
        System.out.println("This kitten's name is " + this.getName() + " and he is walking");
    }

    @Override
    public String toString() {
        return String.format("This kitten's name is %s and he is %s years old",this.getName(),this.getAge());
    }
}
