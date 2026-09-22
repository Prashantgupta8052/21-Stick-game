 // kya aap pahla khelna chahta ho
//  hamara pass 21 stick hai 
// ek ya do stick utha sakta ho max isa jada allow hi hai 
// tumhra apponenet bhi laghbag 1 or 2 stick pick karega
// ab dekho 2 stick tumna uthaya aur do stick tumhra apponenet na uthaya to 
// to 4 stick use go gayi aur bachi stick 17 hai aur tumha next round ma 
// aise hi uthayenge to fir 13 stick bachegi next round ma aisa jo player 
// last ma stick uthayega ho game haar jayega to lets creat the the game

import java.util.Scanner;

public class Twentyonestick {
    public static void main(String[] args) {
        int total_stick=21;
        System.out.println("do you want to play first? (y/n)");
        Scanner sc=new Scanner(System.in);
        String first=sc.nextLine();
        Scanner pick_num= new Scanner(System.in);
        int input_num=0;
        //we have two case first case is agar pahla maina play
        // second case ki maina baad ma khela 
        while(total_stick>0){
            if(first.equals("y") ||first.equals("Y") ){
                System.out.println("currently"+total_stick+"are available");
                System.out.println("pick your stick (1 or 2)");
                input_num=pick_num.nextInt();
                if(input_num>2){
                    input_num=2;
                }
                else if(input_num<1){
                    input_num=1;
                    total_stick=total_stick-input_num;
                    if(total_stick<=0){
                        System.out.println("you have lost the game ");
                    }
                    else{
                        if((total_stick-2)%3==0 ||(total_stick-2)==0 ){
                            input_num=1;
                        }
                    }
                }
                else{
                    input_num=2;
                    System.out.println("your apponent picks"+input_num+"sticks");
                    total_stick=total_stick-input_num;
                    if(total_stick<=0){
                        System.out.println("you have won the match");
                    }
                }
            }
            else{
                if((total_stick-2)%3==0 || (total_stick-2)==0){
                    input_num=1;
                }
                else{
                    input_num=2;
                }
                System.out.println("your apponenet picks"+input_num+"sticks");
                total_stick=total_stick-input_num;
                if(total_stick<=0){
                    System.out.println("you have won the game ");
                }
                else{
                    System.out.println("currently"+total_stick+"sticks are avilable");
                }
                System.out.println("pick you stick (1 or 2)");
                input_num=pick_num.nextInt();
                if(input_num>2){
                    input_num=2;
                }
                else if(input_num<1){
                    input_num=1;
                    total_stick=total_stick-input_num;
                    if(total_stick<=0){
                        System.out.println("you have lost  the game ");
                    }
                }
            }
        }

    }
}
