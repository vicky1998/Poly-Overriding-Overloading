// there are two types of polymorphism
// 1)Static-> achieved by method overloading.
// 2)Dynamic->achieved by method overriding.
//Method overloading  means there are several methods present in class having same name
//but diff type of order/types/no parameters.
//Example of static polymorphism

public class PolyDemo {

    public int sum(int a,int b)
    { int res;
    return res=a+b;
    }
    public int sum(double a,float b){
        int res;
        return res= (int) (a+b);
    }
    public int sum(int a,int b,int c){
        int res;
        return res=a+b+c;
    }

    public static void main(String[] args) {
         PolyDemo p1=new PolyDemo();
//here at compile time compiler will decide which  method to call then acc to no parameters
//and dtat type of parameters it will decide.
        System.out.println(p1.sum(10,2,3));
        System.out.println(p1.sum(10.1,10.1f));
        System.out.println(p1.sum(10,20));
// it's known as method overloading;
    }

}
