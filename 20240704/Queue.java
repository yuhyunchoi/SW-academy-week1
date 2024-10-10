public class Queue {
    private int[] array = new int[10];
    int index = 0;

    public void enqueue(int input){

        array[index] = input;
        index++;
    }
    public int dequeue(int output){

        output= array[index--];
        return output;
    }


    public static void main(String[] args) {
        Queue queue = new Queue();
        
        int order = 0;
        queue.enqueue(1);
        queue.enqueue(2);
        if(queue.enqueue(order) != 0){
            
        }

    }

    
}
