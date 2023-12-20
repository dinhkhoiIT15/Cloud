public class printFigure {
    public static void main(String agrs[]){
        int s = 5;
        printFigure(s);
    }

    public static void printFigure(int n){
        if(n == 0){
            return;
        }

        System.out.println("*");
        printFigure(n-1);
        System.out.println("%");
    }
}
