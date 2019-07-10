package com.michaelknapp.strategyPattern;

public class DivByThree implements strategyInterface {

    private int divByThree = 3;
    private String outPut;
    private int number;


    public int divByThree(int divByThree,String outPut, int number){
        this.divByThree = divByThree;
        this.outPut = outPut;
        this.number = number%3;
        return this.number;

    }
    public int getNumber(){
        return number;
    }
    public int getDivByThree(){
        return divByThree;
    }

    @Override
    public void outPut(String outPut, int number) {
        for(int i = 0; i < number; i++){
            System.out.println("Foo");
        }
        System.out.println(this.number + "Divided by 3");
    }
}
