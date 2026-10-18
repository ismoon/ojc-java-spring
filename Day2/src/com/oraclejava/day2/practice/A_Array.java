package com.oraclejava.day2.practice;

public class A_Array {
    public void practice1() {
        // 1. 배열의 선언 및 생성
        int[] iArray = new int[5];
        // double[] dArray = new double[] {1.1, 2.2, 3.3, 4.4, 5.5};
        // double[] dArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        double[] dArray;

        dArray = new double[] {1.1, 2.2, 3.3, 4.4, 5.5};

        // 2. 배열 변수와 인덱스를 이용한 값 저장
        iArray[0] = 2;
        iArray[1] = 4;
        iArray[2] = 6;
        iArray[3] = 8;
        iArray[4] = 10;
        // iArray[5] = 12; // ArrayIndexOutOfBoundsException

        // 3. 배열 변수와 인덱스를 이용한 값 출력
        System.out.println(iArray[0]);
        System.out.println(iArray[1]);
        System.out.println(iArray[2]);
        System.out.println(iArray[3]);
        System.out.println(iArray[4]);
        System.out.println();

        // 4. 반복문을 이용한 출력
        // 배열변수.length를 통해서 배열의 길이를 알 수 있다.
        // for (int i = 0; i < iArray.length; i++) {
        //     System.out.println(iArray[i]);
        // }

        // 향상된 for 문
        for (int value : iArray) {
            System.out.println(value);
        }

        System.out.println();

        for (double value : dArray) {
            System.out.println(value);
        }
    }

    public void practice2() {
        // 1. 2차원 배열의 선언 및 생성
        int[][] iArray = new int[2][3];
        // double[][] dArray = new double[][] {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}};
        double[][] dArray = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}};

        // 2. 2차원 배열 변수와 인덱스를 이용한 값 저장 및 출력
        iArray[0][0] = 10;
        iArray[1][2] = 20;

        System.out.println(iArray[0][0]);
        System.out.println(iArray[1][2]);
        System.out.println();

        // 3. 반복문을 이용한 출력
        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j < iArray[i].length; j++) {
                System.out.printf("%2d ", iArray[i][j]);
            }

            System.out.println();
        }

        System.out.println();

        for (double[] values : dArray) {
            for (double value : values) {
                System.out.printf("%.1f ", value);
            }

            System.out.println();
        }

        
    }

}
