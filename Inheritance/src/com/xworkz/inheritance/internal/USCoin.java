package com.xworkz.inheritance.internal;

public class USCoin extends Coin{
    public void bronze(Coin coin){
        coin.steelCoin();
        if(coin instanceof USCoin){
            USCoin usCoin = (USCoin) coin;
            usCoin.throwIt();
        }
    }
    public void throwIt(){
        System.out.println("Running throwIt in uscoin");

    }
}
