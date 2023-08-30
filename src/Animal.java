public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void walk(){
        System.out.println("This animal " + name + " is walking");
    }

    @Override
    public String toString() {
        return String.format("This animal's name is %s and he is %s years old",name,age);
    }
}
