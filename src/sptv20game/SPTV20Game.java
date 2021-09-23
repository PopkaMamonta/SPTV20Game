
package sptv20game;

import java.util.Random;
import java.util.Scanner;

public class SPTV20Game {

    public static void main(String[] args) {
        //Программа загадывает число и просит пользователя отгадать, 
        //если пользователь отгадал то он выйграл, иначе пользователь проиграл
        int attempt=1,ii=1;
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите с какого числа будет загадываться: ");
        int MinDia=scanner.nextInt();
        System.out.println("Введите до какого числа будет загадываться: ");
        int MaxDia=scanner.nextInt();
        while(ii==1){
        System.out.printf("Программа загадала число от %d до %d\n",MinDia,MaxDia);
        int truenum=random.nextInt(MaxDia - MinDia + 1) + MinDia;
        for(int i=0;i<3;i++){
            System.out.print("Отгадай число: ");
            int usernum=scanner.nextInt();
            if(truenum==usernum){
                System.out.println("Ура! Ты угадал!");
                    System.out.println("Хочешь ли ты продолжить игру?(введите 0 чтобы выйти и любое другое число, чтобы продолжить).");
                    int choose=scanner.nextInt();
                    if(choose>0){
                    i=0;
                    attempt=1;
                    break;
                    }else{
                    ii=ii-1;
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
                    attempt=1;
                    break;
                    }else{
                    ii=ii-1;
                    }
                }
                }    
            attempt++;
            }
        }
    }
    
}
