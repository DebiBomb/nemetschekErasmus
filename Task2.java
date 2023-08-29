package nemetschekErasmus;

public class Task2 {
    
public static void main(String[] args){

    System.out.println(Fibonacci(21));
}
    static public int Fibonacci(int n){
    {
        if (n <= 1)
            return n;
     
        int a = 0, b = 1, c = 1;
        int res = 1;

        while (c < n)
        {
            c = a + b;
            res++;
            a = b;
            b = c;
        }        
        return res;
    }
    }
}
