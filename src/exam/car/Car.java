package exam.car;

public class Car {
    String name;
   private static int count =0;
    public Car(String s){
        name = s;
        System.out.println("차량구입, 이름: "+ name);
        count++;
    }


    static void showTotalCars(){
        System.out.println(count);
    }





}
