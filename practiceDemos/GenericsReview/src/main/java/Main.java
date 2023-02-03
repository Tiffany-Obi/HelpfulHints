import java.util.*;

public class Main {

    // What are Generics?
    // Generics was introduced in Java5 as a way to deal with type safety.
    //It makes the code stabke by detecting the type safety bugs at compile time

    //Naming convention for Generics

    // T => Generic data type
    // R => Return type
    // E => Element
    // K , V => Map Key, Map Value
    // N => Number


    //syntax = ClassOrInterface<Type>


    //Before Generics we would store any type of object in a collection
    //Now with the use of generics we  store a specific type of objects

    //Note: Generics can be declared on a class, method params or as a return type

    //class example
    public static void main(String[] args) {
//        GenericClass<Integer> genClass = new GenericClass<>();
//
//        genClass.add(123);
//        System.out.println(genClass.getT());
//
//       // genClass.add("hello"); compile error because genClass has been set to take integers and we gave it a string
//
//        GenericClass<String> genString = new GenericClass<>();
//
//        genString.add("hello");
//        System.out.println(genString.getT());
//
//
//        System.out.println(genClass.createUser(new String("Test")));


//Generics are most used with collections

        // non-generic
//        List list = new ArrayList<>();
//        list.add("ten");
//        list.add(10);
//        list.add(true);

        List<Integer> list = new ArrayList<>();
 //       list.add("ten");// compile time error
        list.add(10);
//        list.add(true); // compile time error

        for(Object item: list){
            System.out.println(item);
        }


        // before generics we would have to typecast when getting an object or value

        Integer ten = list.get(0);

        System.out.println(ten);


        //With Generics we dont have to type cast in order to get out value
        // makes sense sice Generics allows us to ensure that a collection is holding a specific type


        Map<Integer,String> map = new HashMap<>();
        map.put(5,"Hello");
        map.put(7,"Tiffany");

//        Set<Map.Entry<Integer,String>> set = map.entrySet();
//
//        Iterator<Map.Entry<Integer,String>> itr = set.iterator();
//
//        while(itr.hasNext()){
//            Map.Entry e = itr.next();
//            System.out.println(e.getKey() + " " + e.getValue() );
//        }
        map.forEach((K, V) -> System.out.println(K + ", " + V));


    }





}
