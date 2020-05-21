import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            if(i == 0 || i == 1)
                fibonacci.add(i);
            else{
                int a1 = fibonacci.get(i - 1);
                int a2 = fibonacci.get(i - 2);
                int res = a1 + a2;
                fibonacci.add(res);
            }
        }
        for(int i = 9; i >= 0; i--)
            System.out.print(fibonacci.get(i) + " ");
    }
}
