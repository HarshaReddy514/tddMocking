package demo;

public class MockSignleton {

    public String  iamusingSingleTon(){
        Mysingleton instance = Mysingleton.getInstance();


        System.out.println("I am testing this method ");

         return  instance.insideSignletonClass();

    }




}
