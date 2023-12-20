public class getNumS {
    public static void main(String agrs[]){
        int g = getOperationCount(10);
        System.out.println("So lan lap lai la " + g);
    }

    public static int getOperationCount(int n){
        int counter = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                counter++;
            }
        }
        return counter;
    }
}
