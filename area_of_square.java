import java.util.Scanner;

public class area_of_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float area = side * side;
          
        System.out.println("Area of square is ::" + area);
    }
}
