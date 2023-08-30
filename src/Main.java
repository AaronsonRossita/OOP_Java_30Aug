import generic.MyGenericClass;
import generic.MyGenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToDoubleBiFunction;

public class Main {

    public static void main(String[] args) {

        MyGenericClass obj1 = new generic.MyGenericClass<>();
        MyGenericClass<String> obj2 = new generic.MyGenericClass<>();
        MyGenericClass<generic.MyGenericType> obj3 = new generic.MyGenericClass<>();
        //System.out.println(obj1);

//        int i1 = 1;
//        Integer i2 = 2;
//        String s1 = "";
//
//        ArrayList list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add("two");
//        list1.add(true);
//        list1.add(obj1);
//        System.out.println(list1);
//        list1.add(3,"four");
//        System.out.println(list1);
//        list1.remove(obj1);
//        System.out.println(list1);
//        System.out.println("At index 0 = " + list1.get(0));
//        list1.clear();
//        System.out.println(list1);
//
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("one");
//        list2.add("two");
//        System.out.println(list2.contains("two"));
//
//        ArrayList<Integer> list3 =  new ArrayList<>();
//        list3.add(1);
//        list3.add(2);
        // TODO: 30/08/2023
        //int[] list3RegArr = list3.toArray();
//        System.out.println(list3.size());
//
//        HashMap<Integer,String> hashMap1 = new HashMap<>();
//        hashMap1.put(1,"one");
//        hashMap1.put(2,"two");
//        System.out.println(hashMap1);
//        hashMap1.put(1,"three");
//        System.out.println(hashMap1);
//        hashMap1.put(3,"three");
//        System.out.println(hashMap1);
//        HashMap<String,String> hashMap2 = new HashMap<>();
//        hashMap2.put("one","אחד");
//        hashMap2.put("two","שתיים");
//        hashMap2.put("three","שלוש");
//
//        System.out.println(hashMap2.get("two"));
//        System.out.println(hashMap2.containsKey("four"));
//        System.out.println(hashMap2.containsKey("ארבע"));

        Animal animal1 = new Animal("Jerry",5);
//        animal1.walk();

        Cat cat1 = new Cat("Tom",6);
//        cat1.walk();
//        cat1.meow();

        Kitten kitten1 = new Kitten("Mitzi",1,true);
//        kitten1.walk();
//        kitten1.meow();
//        kitten1.play();

        Dog dog1 = new Dog("Spike",3,true);
//        dog1.walk();
//        dog1.bark();
//
//        printObject(animal1); // Animal is Object
//        printObject(cat1); // Cat is Animal and Animal is Object
//        printObject(kitten1); // Kitten is Cat and Cat is Animal and Animal is Object
//        printObject(dog1); // Dog is Animal and Animal is Object
//        printObject(obj1); // MyGenericClass is Object
//
//        walkAnimal(animal1); // Animal is Animal
//        walkAnimal(cat1); // Cat is Animal
//        walkAnimal(kitten1); // Kitten is Cat and Cat is Animal
//        walkAnimal(dog1); // Dog is Animal
//        walkAnimal(obj1);
//
//        meowCat(cat1);  // Cat is Cat
//        meowCat(kitten1); // Kitten is Cat
//        meowCat(dog1); // Dog is not Cat
//        meowCat(animal1); // Animal is not Cat
//
//        playKitten(kitten1); // Kitten is Kitten
//        playKitten(cat1); // Cat is not Kitten
//        playKitten(dog1); // Dog is not Kitten
//        playKitten(animal1); // Animal is not Kitten

        System.out.println(animal1);
        System.out.println(cat1);
        System.out.println(kitten1);
        System.out.println(dog1);

    }

    public static void printObject(Object o){
        System.out.println(o);
    }

    public static void walkAnimal(Animal a){
        a.walk();
    }

    public static void meowCat(Cat c){
        c.meow();
    }

    public static void playKitten(Kitten k){
        k.play();
    }



    public static void printArr(Object[] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("}");
    }





}