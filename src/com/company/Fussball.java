package com.company;

public class Fussball extends Mannschaftssport{

    @Override
    public double kalkuliereZeit() {
        return super.kalkuliereZeit()+65;
    }
}
