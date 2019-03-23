package com.sda.lessons;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int tab01[] = new int[3];
        tab01[0] = 1;
        tab01[1] = 2;
        tab01[2] = 3;

        int tab02[] = {1, 2, 3};

        int tab03[][] = new int[3][3];
        tab03[0][0] = 1;
        tab03[0][1] = 2;
        tab03[0][2] = 3;
        tab03[1][0] = 4;
        tab03[1][1] = 5;
        tab03[1][2] = 6;
        tab03[2][0] = 7;
        tab03[2][1] = 8;
        tab03[2][2] = 9;

        int tab4[][] = {
                {1, 2, 3},
                {4, 5, 6, 5},
                {7, 8, 9},
                {10, 11, 12, 13, 14, 15, 152}
        };

        int tab5[][] = new int[3][];
        tab5[0] = new int[8];
        tab5[1] = new int[3];
        tab5[2] = new int[5];

        tab5[0] = tab03[2];

        for (int i = 0; i < tab4.length; i++) {
            int[] innerTable = tab4[i];
            int innerLength = innerTable.length;
            for (int j = 0; j < innerLength; j++) {
                System.out.print(innerTable[j] + " ");
            }
            System.out.print("\n");
        }

        int i = 0;
        int j = 0;

        while ( i < tab4.length ) {

            int[] innerTable = tab4[i];
            int innerLength = innerTable.length;
            while ( j < innerLength ) {
                System.out.print(innerTable[j] + " ");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
