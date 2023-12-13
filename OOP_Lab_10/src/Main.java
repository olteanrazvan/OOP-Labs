import java.io.File;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        List<String> cars = new ArrayList<>();
        Map<String, Integer> map = new TreeMap<>();
        String chat[] = {"Buna","Ce","Mai","Zici","Buna","Mai","Buna"};
        cars.add("Dacia");
        cars.add("Renault");
        cars.add("Toyota");
        for(String car:cars){
            if(car.equals("Dacia")){
                car = "Logan";
            }
        }
        ListIterator carsIt = cars.listIterator();
        while(carsIt.hasNext()){
            if(carsIt.next().equals("Dacia")){
                carsIt.set("Logan");
            }
        }
        System.out.println(cars);
        for(int i = 0;i < chat.length;i++){
            if(map.containsKey(chat[i])){
                int index = map.get(chat[i]);
                map.put(chat[i], index + 1);
            }
            else{
                map.put(chat[i], 1);
            }
        }
        System.out.println(map);

        Comparator<File> byLengthComp = new ByLengthComparator();
        File dir = new File(System.getProperty("user.home"));
        File[] children = dir.listFiles();
        System.out.println("Fisiere dupa director");
        Arrays.sort(children, ByLengthComparator());
    }
}