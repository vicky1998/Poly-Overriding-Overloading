public class DynamicPolyDemo {
    public static void main(String[] args) {
        Vehicle v1=new Bike();
        //parent can hold the object f child class b
        v1.run();
        //output bike can move
        Vehicle v2=new Vehicle();
        v2.run();
        //output vehicle can move


    }

}
class Vehicle{
    public void run(){
        System.out.println("vehicle can move");
    }
}

class Bike extends Vehicle{

    public void run() {
        System.out.println("bike can move");
    }
}
