package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* 1. Написать программу, которая загадывает случайное число от 0 до 9 и
	пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
	больше ли указанное пользователем число, чем загаданное, или меньше.
	После победы или проигрыша выводится запрос – «Повторить игру еще раз?
	1 – да / 0 – нет»(1 – повторить, 0 – нет).
	 */
        int repeat = 1;
        int x = 0, num = 0;
        do {
            Random random = new Random();
            x = random.nextInt(10);
            System.out.println("Программа загадала число от 0 до 9. У вас есть 3 попытки, чтобы его отгадать.");
            for (int i = 0; i < 3; i++) {
                Scanner scanner = new Scanner(System.in);
                num = scanner.nextInt();
                if (num < x) {
                    System.out.println("Указанное вами число меньше загаданного.");
                } else if (num > x) {
                    System.out.println("Указанное вами число больше загаданного.");
                } else {
                    System.out.println("Вы угадали!");
                    break;
                }
            }
            if (num != x)
                System.out.println("Количество попыток исчерпано.");
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner rpt = new Scanner(System.in);
            repeat = rpt.nextInt();
        } while (repeat == 1);

    /* 2.*Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
    "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
    "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его
    с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер
    показывает буквы, которые стоят на своих местах. apple – загаданное apricot - ответ игрока ap#############
    (15 символов, чтобы пользователь не мог узнать длину слова) Для сравнения двух слов посимвольно можно
    пользоваться: String str = "apple"; char a = str.charAt(0); - метод, вернет char, который стоит в слове str
    на первой позиции Играем до тех пор, пока игрок не отгадает слово. Используем только маленькие буквы.
    */
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Программа загадала одно слово из перечисленных: \"apple\", \"orange\", \"lemon\", \"banana\", \"apricot\",\n" +
                "\"avocado\", \"broccoli\", \"carrot\", \"cherry\", \"garlic\", \"grape\", \"melon\", \"leak\", \"kiwi\", \"mango\",\n" +
                "\"mushroom\", \"nut\", \"olive\", \"pea\", \"peanut\", \"pear\", \"pepper\", \"pineapple\", \"pumpkin\", \"potato\".\n"+
                "Попробуйте угадать, какое слово загадано.");
        Random randomWord = new Random();
        int numWord = randomWord.nextInt(words.length);
        Scanner wrd = new Scanner(System.in);
        String intWord = wrd.next();
        String str = words[numWord+1];
        while (!intWord.equals(str)){
            char arr[] = new char[15];
            for (int i = 0; i < 15; i++) {
                char a, b;
                if (i < str.length())
                    a = str.charAt(i);
                else
                    a = '#';
                if (i < intWord.length())
                    b = intWord.charAt(i);
                else
                    b = '#';
                if (a == b)
                    arr[i] = a;
                else
                    arr[i] = '#';
            }
            System.out.println(Arrays.toString(arr) +"\n Попробуйте еще раз, с подсказкой.");
            Scanner newWrd = new Scanner(System.in);
            intWord = newWrd.next();

        }
        System.out.println("Вы угадали! Игра окончена.");
    }
}
