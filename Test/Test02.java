import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//TQ1. 삼각형 넓이구하기
//        int width, height;
//        double area;
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("width : ");
//        width = sc.nextByte();
//        System.out.println("height");
//        height = sc.nextByte();
//        area = (double) (width * height) / 2.0;
//
//        System.out.println(area);


//﻿Q1) 변수 교환
//      Scanner 를 이용해서 두 수를 입력받습니다.
//      a, b에 100, 200 받아. 이를 값을 교환 해보세요.
//      b<--200,  a<--100  어떻게 코딩해야 할까?

        int a, b;
        //입력
        Scanner sc = new Scanner(System.in);
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());

        System.out.println("A : " + a + "B : " + b);
        //코딩
        int temp = a;
        a = b;
        b = temp;

        System.out.println("A : " + a + "B : " + b);
    }
}