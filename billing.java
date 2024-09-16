import java.util.Scanner;

public class billing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        

        System.out.println(pen);
        System.out.println(pencil);
        System.out.println(eraser);

        float total = (pen + pencil + eraser);

        System.out.println("Total bill :" + total);


        // add with the 18% GST bill

        float newtotal = total + (0.18f * total);

        System.out.println("Bill with GST is ::" + newtotal);
    }
}
