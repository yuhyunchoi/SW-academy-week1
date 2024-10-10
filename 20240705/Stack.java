// 사용자 정의 예외 클래스

import javax.management.RuntimeErrorException;

class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}
public class Stack{
    private int[] array = new int[10];
    private int index = 0;

    public void push(int input) throws StackOverflowException{
        if (index >= array.length){
            throw new StackOverflowException("Stakc is full, cannot push " + input);
        }
        array[index++] = input;
    }
    public int pop(){
        if(index == 0){
            throw new RuntimeException("Stack is empty, cannot pop");
        }
        return array[--index];
    }
    public static void main(String[] args) {
        Stack stack = new Stack();

        try {
            // 스택이 가득 찼을 때 예외를 발생시키는 예제
            for (int i = 0; i <= 10; i++) {
                stack.push(i);
            }
        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
        }

        // 스택의 요소를 팝하여 출력
        while (true) {
            try {
                System.out.println(stack.pop());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}