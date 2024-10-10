public class Algorithm {
    static final int addFrom1To10 = 55;

    // To-do add sigma method here
    static int sigma(int start, int end, int step){
        return calc(new Adder(), 0, start, end, step);
    }
    static int pi(int start, int end, int step){
        return calc(new Multiplier(), 1,start, end, step);
    }
    static int calc(Adder binder, int init, int start, int end, int step){
        int result = init;

        for(int next = start; next <= end; next += step){
            result =  binder.apply(next, result);
        }
        return result;
    }
    static int calc(Multiplier binder, int init, int start, int end, int step){
        int result = init;

        for(int next = start; next <= end; next += step){
            result =  binder.apply(next, result);
        }
        return result;
    }
    //
    // To-do add overloaded accumulate method here
    //

    public static void main(String[] args) {
        
        System.out.println(sigma(1,10,1));
        System.out.println(pi(1,10,1));

    }
}