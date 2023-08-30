package generic;

public class MyGenericClass<T> {

    private T t;

    public MyGenericClass() {

    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void printTClass(){
        System.out.println(t.getClass());
    }

}
