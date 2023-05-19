
public class Bai1{
}
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //sử dụng class Scanner để lấy dữ liệu từ bàn phím
    Scanner sc = new Scanner(System.in);
    //khai báo biến n là số lượng phần tử trong mảng
    int n;
    System.out.print("\n\nNhập số lượng phần tử cho mảng: ");
    n = sc.nextInt();
    int numberArr[] = new int[n];
    //nhập giá trị cho từng phần tử trong mảng
    for (int i = 0; i < n; i++) {
      System.out.print("\nNhập phần tử thứ " + i + ": ");
      numberArr[i] = sc.nextInt();
    }
    //in các phần tử trong mảng ra màn hình
    System.out.println("Các phần tử trong mảng là: ");
    for(double i : numberArr){
      System.out.print(i + ", ");
    }
    double max = numberArr[0];
    //dùng vòng lặp for duyệt các phần tử trong mảng. so sánh max với từng phần tử nếu số nào lớn hơn max thì gán nó cho max.
    // cứ lặp như vậy cho đến hết các phần tử thì max sẽ là giá trị lớn nhất trong mảng
    for (double num: numberArr) {
      if(max < num)
        max = num;
    }
    System.out.printf("\nSố lớn nhất trong mảng là: %.2f", max);
 
    System.out.println("\n----------------------------------");
    System.out.println("Chương trình này được đăng tại Freetuts.net");
  }
}