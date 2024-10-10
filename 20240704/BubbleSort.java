import java.util.Scanner;

public class BubbleSort{

    public static void bubbleSort(int[] array, int decision){
        int tmp = 0;
        
        switch(decision){
        case 1: 
            for(int i = 0; i < array.length - 1; i++){
                for(int j = 0; j < array.length - 1 - i; j++){
                    if(array[j] > array[j+1]){
                        tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }
                }
            }
            
            break;
        case 2:
            for(int i = 0; i < array.length - 1; i++){
                for(int j = 0; j < array.length - 1 - i; j++){
                    if(array[j] < array[j+1]){
                        tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }
                }
            }
            
            break;
        default: 
            
            break;
        }
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] array = { 6,1,4,3,2,5,8,7};
        
        System.out.print("Asc: 1, Desc : 2 >> ");
        String decision = sc.nextLine();
        int decisionInteger = Integer.parseInt(decision);
        if(decisionInteger == 1 || decisionInteger == 2){
            System.out.print("Original array >> ");
            for(int i = 0; i< array.length; i++){
                System.out.print(array[i]+ " ");
            }
            
            bubbleSort(array, decisionInteger);
            
            System.out.print("\nSorted array >> ");
            for(int i = 0; i< array.length; i++){
                System.out.print(array[i]+ " ");
            }
            
        }
        else{
            System.out.println("Wrong choice");
        }
       
        sc.close();

    }

}