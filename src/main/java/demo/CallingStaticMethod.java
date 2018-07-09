package demo;

public class CallingStaticMethod {

    public static String thiscallStaticMethodInside(String params){

        System.out.println("The call static method inside ");
        return HelperStatic.iamStatic(params);

    }


}
