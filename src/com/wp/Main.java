package com.wp;

import java.util.Scanner;

/**
 * Created by 王萍 on 2017/2/19 0019.
 */
public class Main {
    public static void main(String args[]) {
        Scanner xx = new Scanner(System.in);
        int sum = 0;
        System.out.printf("请输入年份：");
        int year = xx.nextInt();
        System.out.printf("请输入月份：");
        int month = xx.nextInt();
        for (int y = 1900; y < year; y++) {
            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
                sum += 366;
            else
                sum += 365;
        }
        for (int m = 1; m < month; m++) {
            if (m == 2) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    sum += 29;
                else
                    sum += 28;
            } else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
                sum += 31;
            else
                sum += 30;
        }
        int weekday = sum % 7;
        System.out.println("\t\t" + year + "  年  " + month + "  月");
        System.out.println();
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for (int i = 0; i < weekday; i++)
            System.out.print("\t");
        if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                for (int i = 1; i <= 29; i++) {
                    if (sum % 7 == 6)
                        System.out.print(i + "\n");
                    else
                        System.out.print(i + "\t");
                    sum++;
                }

            } else {
                for (int i = 1; i <= 28; i++) {
                    if (sum % 7 == 6)
                        System.out.print(i + "\n");
                    else
                        System.out.print(i + "\t");
                    sum++;
                }

            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            for (int i = 1; i <= 31; i++) {
                if (sum % 7 == 6)
                    System.out.print(i + "\n");
                else
                    System.out.print(i + "\t");
                sum++;
            }

        } else {
            for (int i = 1; i <= 30; i++) {
                if (sum % 7 == 6)
                    System.out.print(i + "\n");
                else
                    System.out.print(i + "\t");
                sum++;
            }

        }

    }


}
