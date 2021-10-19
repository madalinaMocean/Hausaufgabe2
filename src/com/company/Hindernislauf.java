package com.company;

public class Hindernislauf extends Leichtathletik{

    @Override
    public double kalkuliereZeit() {
        return super.kalkuliereZeit()+30;
    }
}
