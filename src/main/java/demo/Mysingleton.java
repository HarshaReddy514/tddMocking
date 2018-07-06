package demo;

public class Mysingleton {

    private static Mysingleton ourInstance =  null;

    private Mysingleton() {

    }
    public static Mysingleton getInstance() {
        if(ourInstance == null ){
            ourInstance =  new Mysingleton();
        }

        return ourInstance;
    }


    public  String  insideSignletonClass(){

        System.out.println("Inside signleton class ");
        return "signleton method call ";
    }

}
