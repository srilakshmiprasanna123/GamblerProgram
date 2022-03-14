package com.bridgelabz.day7;

import java.util.Scanner;

public class GamblerProgram {
        public static int startingTotalAmount = 100;
        public static final int betsPerGame = 1;
        public static int totalAmount = 0;

        public static void main(String[] args) {
            System.out.println("Welcome to Gambling Program");
            GamblerProgram gambler = new GamblerProgram();
            gambler.UC1();
            gambler.UC2();
            gambler.UC3();
            gambler.UC4();
            gambler.UC5();
            gambler.UC6();
            gambler.UC7();

        }

        //UC1
        public void UC1() {
            System.out.println(startingTotalAmount);
            System.out.println(betsPerGame);
        }


        public void UC2() {

            double winOrLoose = Math.floor(Math.random() * 10) % 2;
            if (betsPerGame == winOrLoose) {
                System.out.println("you won the game");
                startingTotalAmount = startingTotalAmount + 1;
                System.out.println("After winning the game your total amount is:" + startingTotalAmount);
            } else {
                System.out.println("you loose the game");
                startingTotalAmount = startingTotalAmount - 1;
                System.out.println("After loosing the game your total amount is:" + startingTotalAmount);
            }
        }

        public void UC3() {
            while (startingTotalAmount > 50 && startingTotalAmount < 150) {
                double winOrLoose = Math.floor(Math.random() * 10) % 2;
                if (betsPerGame == winOrLoose) {
                    System.out.println("you won the game");
                    startingTotalAmount = startingTotalAmount + 1;
                    System.out.println("After winning the game your total amount is:" + startingTotalAmount);
                } else {
                    System.out.println("you loose the game");
                    startingTotalAmount = startingTotalAmount - 1;
                    System.out.println("After loosing the game your total amount is:" + startingTotalAmount);
                }
                if (startingTotalAmount == 50) {
                    System.out.println("Today you loose your 50% amount so you have to resign for the day");
                } else {
                    System.out.println("Today you won your 50% amount so you have to resign for the day");
                }
            }

        }

        public void UC4() {
            int stake = startingTotalAmount;
            for (int i = 1; i <= 20; i++) {
                while (stake > 50 && stake < 150) {
                    double winOrLoose = Math.floor(Math.random() * 10) % 2;
                    if (betsPerGame == winOrLoose) {
                        System.out.println("you won the game");
                        stake = stake + 1;
                        System.out.println("After winning the game your total amount is:" + stake);
                    } else {
                        System.out.println("you loose the game");
                        stake = stake - 1;
                        System.out.println("After loosing the game your total amount is:" + stake);
                    }
                }
                if (stake == 50) {
                    System.out.println("Today you loose your 50% amount so you have to resign for the day");
                } else {
                    System.out.println("Today you won your 50% amount so you have to resign for the day");
                }
                totalAmount = totalAmount + stake;
                System.out.println(totalAmount);
            }
            System.out.println("After 20 days of playing total amount is: " + totalAmount);
            if (totalAmount > 2000) {
                int profit = totalAmount - 2000;
                System.out.println("you are in profit by: " + profit);
            } else if (totalAmount < 2000) {
                int loss = 2000 - totalAmount;
                System.out.println("you are in loss by: " + loss);
            } else {
                System.out.println("you are neither in loss nor in profit: " + totalAmount);
            }
        }

        public void UC5() {
            int stake = startingTotalAmount;
            int daysLoss = 0;
            int daysWon = 0;
            for (int i = 1; i <= 20; i++) {
                while (stake > 50 && stake < 150) {
                    double winOrLoose = Math.floor(Math.random() * 10) % 2;
                    if (betsPerGame == winOrLoose) {
                        System.out.println("you won the game");
                        stake = stake + 1;
                        System.out.println("After winning the game your total amount is:" + stake);
                    } else {
                        System.out.println("you loose the game");
                        stake = stake - 1;
                        System.out.println("After loosing the game your total amount is:" + stake);
                    }
                }
                if (stake == 50) {
                    System.out.println("Today you loose your 50% amount so you have to resign for the day");
                    daysLoss = daysLoss + 1;
                } else {
                    System.out.println("Today you won your 50% amount so you have to resign for the day");
                    daysWon = daysWon + 1;
                }
                totalAmount = totalAmount + stake;
                System.out.println(totalAmount);
            }
            System.out.println("After 20 days total amount is:" + totalAmount);
            if (totalAmount > 2000) {
                int profit = totalAmount - 2000;
                System.out.println("you are in profit by: " + profit);
            } else if (totalAmount < 2000) {
                int loss = 2000 - totalAmount;
                System.out.println("you are in loss by: " + loss);
            } else {
                System.out.println("you are neither in loss nor in profit: " + totalAmount);
            }
            System.out.println("In a Month" + daysWon + "days won and" + daysLoss + "days lost");
        }

        public void UC6() {
            int stake = 100;
            int betsPerGame = 1;
            int totalAmount = 0;
            int daysLoss = 0;
            int daysWon = 0;
            for (int i = 1; i <= 20; i++) {
                while (stake > 50 && stake < 150) {
                    double winOrLoose = Math.floor(Math.random() * 10) % 2;
                    if (betsPerGame == winOrLoose) {
                        System.out.println("you won the game");
                        stake = stake + 1;
                        System.out.println("After winning the game your total amount is:" + stake);
                    } else {
                        System.out.println("you loose the game");
                        stake = stake - 1;
                        System.out.println("After loosing the game your total amount is:" + stake);
                    }
                }
                if (stake == 50) {
                    System.out.println("Today you loose your 50% amount so you have to resign for the day");
                    daysLoss = daysLoss + 1;
                    System.out.println("Day" + i + "is a unlucky day as he lost maximum amount Rs:" + stake);
                } else {
                    System.out.println("Today you won your 50% amount so you have to resign for the day");
                    daysWon = daysWon + 1;
                    System.out.println("Day" + i + "is a lucky day as he won maximum amount Rs:" + stake);
                }
                totalAmount = totalAmount + stake;
                System.out.println(totalAmount);
            }
            System.out.println("After 20 days of playing total amount is: " + totalAmount);
            if (totalAmount > 2000) {
                int profit = totalAmount - 2000;
                System.out.println("you are in profit by: " + profit);
            } else if (totalAmount < 2000) {
                int loss = 2000 - totalAmount;
                System.out.println("you are in loss by: " + loss);
            } else {
                System.out.println("you are neither in loss nor in profit: " + totalAmount);
            }
            System.out.println("In a Month" + daysWon + "days won and" + daysLoss + "days lost");
        }
        public void UC7() {

            System.out.println("Do you want to play??? press 1 for yes and 0 for no");
            Scanner sc= new Scanner(System.in);
            int a= sc.nextInt();

            if (a==1){
                    System.out.println("lets play");
                }
                else{
                    System.out.println("thanks for playing");
                }
            }

        }



