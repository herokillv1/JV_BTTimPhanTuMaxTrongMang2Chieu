import java.util.Scanner;

public class BTTimPhanTuMaxTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Row mảng : ");
        int row = scanner.nextInt();
        System.out.println("Nhập Column mảng : ");
        int column = scanner.nextInt();
        int[][] array = new int[row][column];
        System.out.println();
        System.out.println("Mảng vừa tạo : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max<array[i][j]){
                    max=array[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất trong mảng là : ");
        System.out.print(max);
    }
}
