package array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Roman on 05.02.2016.
 */
public class ArrayWork {
    public static void main(String[] args) {


        int[][] matrixA;
        matrixA = new int[3][3];

        matrixA[0][0] = 1;
        matrixA[0][1] = 2;
        matrixA[0][2] = 3;
        matrixA[0][2] = 3;
        matrixA[1][0] = 4;
        matrixA[1][1] = 5;
        matrixA[1][2] = 6;
        matrixA[2][0] = 7;
        matrixA[2][1] = 8;
        matrixA[2][2] = 9;

        //showMatrix(matrixA);
        chooseMax2(matrixA);
    }

    private static void showMatrix(int[][] matrixA) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }

    }

    private static void chooseMax(int[][] matrixA) {
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j < i) {
                    list.add(matrixA[i][j]);
                    System.out.print(matrixA[i][j] + "\t");
                }
            }
            System.out.println();
        }
        Collections.sort(list);
        System.out.println("");
        System.out.println(list.get(list.size() - 1));
    }

    private static void chooseMax2(int[][] matrixA) {

int max = 0;
        for (int i = 1; i < 3; i++) {
            max = matrixA[1][0];
            for (int j = 0; j <= i - 1; j++) {
                if(max < matrixA[i][j]){
                    max = matrixA[i][j];
                };
                //System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(max);
    }

}


