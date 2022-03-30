package com.company;

import listbook.Book;
import listbook.FuntionBook;
import listbook.ProgrammingBooK;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sum = 0;
        int count = 0;

        Book[] book = new Book[10];

        book[0] = new ProgrammingBooK("1","java",5, "en", "java", "Lee");
        book[1] = new ProgrammingBooK("2","java",5, "en", "java", "Lee");
        book[2] = new ProgrammingBooK("3","chim3",10,"mk","php","Combo");
        book[3] = new ProgrammingBooK("4","java",5, "en", "java", "Lee");
        book[4] = new ProgrammingBooK("5","chim5",10,"CN1","C","cc");

        book[5] = new FuntionBook("6","Anh di roi",15,"Lee","Game the thao1");
        book[6] = new FuntionBook("7","Anh di roi",15,"Lee","Game the thao2");
        book[7] = new FuntionBook("8","Anh di roi",15,"Lee","Game the thao3");
        book[8] = new FuntionBook("9","Anh di roi",15,"Lee","Game the thao4");
        book[9] = new FuntionBook("10","Anh di roi",15,"Lee","Game the thao5");

        for (int i = 0; i < book.length; i++) {
            sum += book[i].getPrice();
        }
        System.out.println("tổng giá :" +sum);



        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ngon ngu");
        String language = scanner.next();

        for (int i = 0; i < book.length; i++) {
            if (book[i] instanceof ProgrammingBooK){
                if (((ProgrammingBooK) book[i]).getLanguage().equalsIgnoreCase(language)){
                    count++;
                }
            }
        }
        System.out.println("số lượng: " + count);
    }
}
