public class GenericClass<T> implements CRUD<T>{
    T object;

    void add(T obj){
        this.object = obj;
    }

    T getT() {
        return object;
    }

    @Override
    public Object createUser(Object element) {
        //logic
        return element;
    }


}
