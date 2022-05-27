package java31;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1. пункт дз
        String[] strings = new String[] {"1", "2"};
        changeArrayElements(strings, 0, 1);
        System.out.println(Arrays.toString(strings));

        Box<Apple> appleBox = new Box<>(addApples(8));
        Box<Orange> orangeBox = new Box<>(addOranges(8));
        Box<Apple> appleBox2 = new Box<>(addApples(0));

        appleBox.compare(orangeBox);
        appleBox.compare(appleBox2);
        appleBox.sprinkleFruit(appleBox2);
        appleBox.compare(orangeBox);
        appleBox.compare(appleBox2);
    }
    public static ArrayList<Apple> addApples(int count){
        ArrayList<Apple> fruits = new ArrayList<>();
        for (int i=0;i<count;i++){
            fruits.add(new Apple());
        }
        return fruits;
    }
    public static ArrayList<Orange> addOranges(int count){
        ArrayList<Orange> fruits = new ArrayList<>();
        for (int i=0;i<count;i++){
            fruits.add(new Orange());
        }
        return fruits;
    }
    //1. пункт дз. метод меняющий местами индексы массива.
    public static <T>void changeArrayElements(T[] array, int firstIndex, int secondIndex){
        if (firstIndex<0 ||firstIndex> array.length || secondIndex<0 || secondIndex>array.length){
            System.out.println("Индексы не верны");
            return;
        }
        try {
            T arrayElement = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = arrayElement;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индексы не верны");
        }
    }

    }

