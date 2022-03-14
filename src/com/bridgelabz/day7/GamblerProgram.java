package com.bridgelabz.day7;


    public class GamblerProgram {
        public static  int startingTotalAmount=100;
        public static final int betsPerGame=1;
        public static void main(String[] args) {
            System.out.println("Welcome to Gambling Program");
           GamblerProgram gambler = new GamblerProgram();
           gambler.UC1();
           gambler.UC2();

        }
    //UC1
    public void UC1() {
        System.out.println(startingTotalAmount);
        System.out.println(betsPerGame);
        }


    public void UC2() {

            double winOrLoose=Math.floor(Math.random()*10)%2;
            if(betsPerGame==winOrLoose) {
                System.out.println("you won the game");
                startingTotalAmount=startingTotalAmount+1;
                System.out.println("After winning the game your total amount is:"+startingTotalAmount);
            }else {
                System.out.println("you loose the game");
                startingTotalAmount=startingTotalAmount-1;
                System.out.println("After loosing the game your total amount is:"+startingTotalAmount);
            }
    }

}