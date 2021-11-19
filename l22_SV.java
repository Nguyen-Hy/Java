package baiTapPremium.L22;

import java.util.Scanner;

public class l22_SV {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var n = scanner.nextInt();

        var svName = getName(n, scanner);
       var avgMark = getMark(svName, scanner);
        System.out.println(xepLoai(avgMark));

    }//main


        private static String[] getName( int n, Scanner scanner){
        String[] sv = new String[n];
            System.out.println("nhap ten sinh vien");
        for( int i = 0; i < n; i++ ){
            sv[i] = scanner.next();
        }
        return sv;
    }

        private static void showName( String[] sv ){
        for( String i : sv ){
            System.out.println(i);
        }
    }

    private static float[] getMark( String[] svName, Scanner scanner ){
        float[] avgMark = new float[svName.length];
        System.out.println("nhap diem");
        for( int i = 0; i < svName.length; i++ ){
            avgMark[i] = scanner.nextFloat();
        }
        return avgMark;
    }

    private static String xepLoai (float[] avgMark ) {
        String xLoai = "";
        for (int i = 0; i < avgMark.length; i++) {
            if (avgMark[i] < 2.0f) {
                xLoai = "truot";
            } else if (avgMark[i] < 2.5f) {
                xLoai = "yeu";
            } else if (avgMark[i] < 3.0) {
                xLoai = "trung binh";
            } else if (avgMark[i] < 3.2f) {
                xLoai = "kha";
            } else if (avgMark[i] < 3.6f) {
                xLoai = "gioi";
            } else {
                xLoai = "suat sac";
            }
        }
        return xLoai;
    }

}
