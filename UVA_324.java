import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigInteger[] series = new BigInteger[370];
        series[0] = BigInteger.ONE;
        series[1] = BigInteger.ONE;
        int i = 2;
        for (BigInteger bi = BigInteger.valueOf(2);
                bi.compareTo(BigInteger.valueOf(369)) <= 0;
                bi = bi.add(BigInteger.ONE)) {
                
            series[i] = bi.multiply(series[i-1]);
            i++;
        }
        
        Scanner s = new Scanner(System.in);
        BigInteger x, sum;
        int tem;
        while (true) {
            int  temp = s.nextInt();
            if(temp == 0) break;
            int [] num = new int[10];
            for(int j=0; j<10; j++){
                num[j] = 0;
            }
            BigInteger value = series[temp];
            sum = BigInteger.ZERO;
            while(value != BigInteger.ZERO){
                x = value.mod(BigInteger.TEN);
                tem = x.intValue();
                num[tem]++;
                value = value.divide(BigInteger.TEN);
            }
            
            System.out.println(temp + "! --");
            
            System.out.printf("   (0)   %d   (1)   %d   (2)   %d   "
                     + "(3)   %d   (4)   %d\n   (5)   %d   (6)   "
                     + "%d   (7)   %d   (8)   %d   (9)   %d\n", 
                     num[0],num[1], num[2], num[3], num[4], num[5], num[6], num[7], num[8], num[9]);
            
        }
        
    }
    
}
