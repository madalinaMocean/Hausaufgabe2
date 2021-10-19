package com.company;

public class Basketball extends Mannschaftssport{

    @Override
    public double kalkuliereZeit() {
        return super.kalkuliereZeit()+55;
    }
}
