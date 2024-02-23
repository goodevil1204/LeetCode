public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){ return false; }
        int c = 0;
        while(n != 0){
            n = n & (n - 1);
            System.out.println("n : "+ n);
            c++;
            if(c > 2){ return false; }
        }
        return c == 1;
    }
}
