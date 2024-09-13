// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        // TODO: Implement the recursive function
        if (n<=2){
            return n;
        }
        else if (n==3){
            return 4;
        }
        else{
            return n + fRecursive(n-1) + fRecursive(n-2) + 1;
        }
    }

    public static int fIterative(int n) {
        // TODO: Implement the iterative function
        if (n<=2){
            return n;
        }
        else if (n==3){
            return 4;
        }
        else{
            int [] f = new int[n+1];
            f[0] = 0;
            f[1] = 1;
            f[2] = 2;
            f[3] = 4;
            for (int i=4;i<=n;i++){
                f[i] = n + f[i-1] + f[i-2] + 1;
            }
            return f[n];
        }
    }
}