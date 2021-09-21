
package sptv20game;

import java.util.Random;
import java.util.Scanner;

public class SPTV20Game {

    public static void main(String[] args) {
        //Программа загадывает число и просит пользователя отгадать, 
        //если пользователь отгадал то он выйграл, иначе пользователь проиграл
        int max=5, min=0;
        Random random=new Random();
        int truenum=random.nextInt(max - min + 1) + min;
        System.out.println("Программа загадала число от 0 до 5");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Отгадайте число: ");
        int usernum=scanner.nextInt();
        if(truenum==usernum){
            System.out.println("Ура! Ты угадал!");
        }else{
            System.out.println(":( Ты проиграл!Загадано число: "+truenum);
        }
        
    }
    
}
