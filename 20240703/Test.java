public class Test{
    public static void printTo(int to){
        for(int i = 0 ;i <= to ; i++){
            System.out.println(i);
        }
    }
    public static int factorial(int n){
        if(n < 1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
