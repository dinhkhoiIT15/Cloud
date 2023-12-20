//Array Sum
public class test {
    public static void main(String agrs[]){
        int[] arr = {1,2,3,4,5};
        int sum = sum(arr, 0);
        int s = sum1(5);

        System.out.println("The sum is " + sum);
        System.out.println("The sum is " + s);
    }

    public static int sum(int[] arr, int index){
        if(index == arr.length -1){
            return arr[index];
        }

        return arr[index] + sum(arr, index+1);
    }

    public static int sum1(int n){
        if(n == 0){
            return 0;
        }

        return n + sum1(n -1);
    }
}


