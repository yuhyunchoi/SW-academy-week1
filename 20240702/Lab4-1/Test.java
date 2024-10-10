import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print(">>");
        int i = sc.nextInt();
        int j = 1;

        do{
            if( i < 1 || i >=9)
                break;

            System.out.println(i + " * " + j + " = " + i*j );
            
            j++;

        }while(j < 10);

        sc.close();




    }
}



