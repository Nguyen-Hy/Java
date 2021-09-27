
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("1. góc nằm trong ");
        System.out.println("2. góc nằm ngoài ");
        int luaChon = scanner.nextInt();

        switch (luaChon){
            case 1:{
                System.out.println("nhập vào 3 góc ");
                 a = scanner.nextInt();
                 b = scanner.nextInt();
                 c = scanner.nextInt();
                 int sum = 360 - a - b - c;
                System.out.println("x = " + sum);
                 break;
            }//end case 1

            case 2:{
                System.out.println("1. 1 góc nằm ngoài");
                System.out.println("2. 2 góc nằm ngoài");
                System.out.println("3. 3 góc nằm ngoài");

                int luaChonGoc = scanner.nextInt();
                 switch (luaChonGoc){
                     case 1:{
                         System.out.println("nhap 2 goc nam trong ");
                         a = scanner.nextInt();
                         b = scanner.nextInt();

                         System.out.println("nhap so do 1 goc nam ngoai ");
                         c = scanner.nextInt();
                         int doiGocKeBu = 188 - c;
                         int sum = 360 - a - b - doiGocKeBu;
                         System.out.println("x = " + sum);
                          break;
                     }//end case 1 (luaChonGoc)

                     case 2:{
                         System.out.println("nhap 1 goc nam trong ");
                         a = scanner.nextInt();

                         System.out.println("nhap so do 2 goc nam ngoai ");
                         b = scanner.nextInt();
                         c = scanner.nextInt();
                         int doiGocKeBu1 = 180 - b;
                         int doiGocKeBu2 = 180 - c;
                         int sum = 360 - a - doiGocKeBu1 - doiGocKeBu2;
                         System.out.println("x = " + sum);
                           break;
                     }//end case 2 (luaChonGoc)

                     case 3:{
                         System.out.println("nhap so do 3 goc nam ngoai ");
                         b = scanner.nextInt();
                         c = scanner.nextInt();
                         a = scanner.nextInt();
                         int doiGocKeBu1 = 188 - a;
                         int doiGocKeBu2 = 180 - b;
                         int doiGocKeBu3 = 180 - c;
                         int sum = 360 - doiGocKeBu1 - doiGocKeBu2 - doiGocKeBu3;
                         System.out.println("x = " + sum);
                          break;
                     }//end case 3 (luaChonGoc)\

                 }//end switch (luaChonGoc)


            }//end case2 (luaChon)

        }//end switch(luaChon)

    }

}
