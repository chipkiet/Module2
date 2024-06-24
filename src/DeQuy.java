package src;

import java.util.Stack;

public class DeQuy {
    public static int useDeQuy(int n){
        Stack<Integer> stack = new Stack<>();
        int result = 1;

        for (int i = n; i>=1; i-- ){
            stack.push(i);
        }
        while (!stack.isEmpty()){
            result*= stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Giai thua :  " + n + "la : " + useDeQuy(n) );
    }
}
