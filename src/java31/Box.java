package java31;

import java.util.ArrayList;

public class Box <T extends java31.Fruit>{
    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits){
        this.fruits=fruits;
    }
    public float getWeight(){
        float sum = 0;
        for (T fruit : fruits){
            sum += fruit.weight;
        }
        return sum;
    }
    public void compare(Box<?> another){
        float thisWeight = getWeight();
        float anotherWeight = another.getWeight();
        if(thisWeight>anotherWeight){
            System.out.println("Первая коробка тяжелее");
        }
        else if (anotherWeight>thisWeight){
            System.out.println("Вторая коробка тяжелей");
        }
        else {
            System.out.println("Коробки по весу равны");
        }
    }
    public void sprinkleFruit(Box<T> other){
        other.fruits.addAll(fruits);
        fruits.clear();
    }
}

