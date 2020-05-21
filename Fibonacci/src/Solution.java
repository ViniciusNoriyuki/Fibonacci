public class Solution {
    public static void main(String[] args) {
        for(int i = 9; i >= 0; i--)
            System.out.print(fibonacci(i)+ " ");
    }
    static Integer fibonacci(int i){
        if(i < 2)
            return i;
        else
            return (fibonacci(i-1) + fibonacci(i-2));
    }
}
