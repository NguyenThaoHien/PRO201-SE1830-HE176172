public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0; i<3; i++) {
            a[i] = sc.nextInt();  
        }
        //1.Find min,max
        int max = a[0];
        if (max < a[1]) max=a[1];
        if (max < a[2]) max=a[2];
        System.out.println(max);
        
        //2
        float avg = (a[0]+a[1]+a[2])/3;
        float b = avg - a[0];
        float min = Math.abs(b);
        for(int i=1; i<3; i++) {
            float c = avg - a[i];
            float temp = Math.abs(c);
            if (min > temp) min=temp;
        }
        System.out.println(min);
        
    }
//3.Peterson number

import java.util.Scanner;

public class FindPeterson{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int sum;
      int value;
      int rem;
      int test;
      int count ;
        // cho chạy từ 0 đến 1000 và gán biến test vào i để kiểm tra số
      for(int i = 0 ; i <= 1000 ; i++){
          test = i;
          count = 0;
          // tính và so sánh
          while(test > 0){
            value = test % 10;
               rem = test / 10;
               sum = 1;
                for(int n = 1 ; n <= value ;n++){
                     sum *= n;  }
                       test = rem;
                       count += sum;  }
          // nếu tích = số i thì in ra
       if(count == i ){ System.out.println(i+" ");
        }
       }
    }
}
