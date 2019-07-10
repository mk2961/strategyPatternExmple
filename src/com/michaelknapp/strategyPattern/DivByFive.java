package com.michaelknapp.strategyPattern;

public class DivByFive implements strategyInterface{

    private int divByFive = 5;
    private String outPut;
    private int number;

    public int getDivByFive(int number,String outPut,int divByFive){
        this.divByFive = divByFive;
        this.number = number;
        this.outPut = outPut;
        return this.number%5;
    }
    @Override
    public void outPut(String outPut, int number){

        for(int i = 0; i < number; i++){
            System.out.println("Bar");
        }
        System.out.println(this.number + "Divided by 5");
    }
}
