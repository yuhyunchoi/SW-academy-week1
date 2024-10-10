public class Stack {
    private int[] array = new int[10];
    int index = 0;

    public void push(int n){
    
        array[index] = n;
        index++;

    }
    public int pop(){
        int output = array[--index];
        return output;
    }
    


    public static void main(String[] args) {
        
        Stack stack = new Stack();

        stack.push(3);
        stack.push(2);
        stack.push(1);
 

    }
}
