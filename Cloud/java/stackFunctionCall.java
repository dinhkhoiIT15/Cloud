public class stackFunctionCall{
    public static void main(String agrs[]){
        A();
    }

    private static void A(){
        System.out.println("This is A()");
        B();
    }

    private static void B(){
        System.out.println("This is B()");
        C();
    }

    private static void C(){
        System.out.println("This is C()");
        D();
    }

    private static void D(){
        System.out.println("This is D()");
    }
}