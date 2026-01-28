package oops.objects;


// template or a blueprint for Object
/*
* int, float, long -> values
* String -> Object
*
* value = contains only data
* object = contains both data and actions to perform on that data e.g. string.toUpperCase()
* int and String -> data type
* int -> primitive type -> Fixed Memory
* String or objects -> non-primitive type -> Dynamic Memory
* Bike template for bike object
* */

public class Bike {

    int price;
    String model;

    public Bike(int priceVal, String modelVal) {
        price = priceVal;
        model = modelVal;
        System.out.println(model.length());
    }

    void drive() {
        System.out.println("Driving..."+model);
    }

}
