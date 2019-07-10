package com.michaelknapp.strategyPattern;

public class DivBySeven implements strategyInterface {

    private int divBySeven = 7;
    private String outPut;
    private int number;

    public int getDivBySeve(int number,String outPut,int divBySeven){
        this.number = number%7;
        this.divBySeven = divBySeven;
        this.outPut = outPut;
        return number;
    }

    @Override
    public void outPut(String outPut,int number){
        for(int i = 0; i < number; i++){
            System.out.println("Qix");
        }
        System.out.println(this.number + "Divided by 7");
    }
}
