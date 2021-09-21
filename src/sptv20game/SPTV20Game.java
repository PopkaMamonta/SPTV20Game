
package sptv20game;

import java.util.Random;
import java.util.Scanner;

public class SPTV20Game {

    public static void main(String[] args) {
        //Программа загадывает число и просит пользователя отгадать, 
        //если пользователь отгадал то он выйграл, иначе пользователь проиграл
        int max=5, min=0,attempt=1;
        Random random=new Random();
        System.out.println("Программа загадала число от 0 до 5");
        int truenum=random.nextInt(max - min + 1) + min;
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.print("Отгадай число: ");
            int usernum=scanner.nextInt();
            if(truenum==usernum){
                System.out.println("Ура! Ты угадал!");
                    System.out.println("Хочешь ли ты продолжить игру?(введите 0 чтобы выйти и любое другое число, чтобы продолжить).");
                    int choose=scanner.nextInt();
                    if(choose>0){
                    i=0;
                    }else{
                    break;
                    }
            }else{
                if(attempt<3){
                    System.out.println("Неправильно, попробуй еще раз.");
                }else{
                    System.out.println(":( Ты проиграл!Загадано число: "+truenum);
                    System.out.println("Хочешь ли ты продолжить игру?(введите 0 чтобы выйти и любое другое число, чтобы продолжить).");
                    int choose=scanner.nextInt();
                    if(choose>0){
                    i=0;
                    }else{
                    break;
                    }
                }
                }    
            attempt++;
        }
    }
    
}
