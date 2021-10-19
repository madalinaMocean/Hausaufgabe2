package com.company;

public class Hochsprung extends Leichtathletik{

    @Override
    public double kalkuliereZeit() {
        return super.kalkuliereZeit()+20;
    }
}
