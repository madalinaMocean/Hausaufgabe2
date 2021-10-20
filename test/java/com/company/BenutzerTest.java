package com.company;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    Basketball b1=new Basketball();
    Basketball b2=new Basketball();
    Fussball f1=new Fussball();
    Fussball f2=new Fussball();
    Hindernislauf hi1 = new Hindernislauf();
    Hindernislauf hi2=new Hindernislauf();
    Hochsprung ho1=new Hochsprung();
    Hochsprung ho2=new Hochsprung();

    List<Sport> sportUser1 = List.of(new Sport[]{b1, f2, hi1, ho1});
    Benutzer user1=new Benutzer("Pop","Andrei",sportUser1);

    @Test
    void kalkuliereZeit() {
        assertEquals(user1.kalkuliereZeit(),170);
    }

    @Test
    void testKalkuliereZeit() {
        assertEquals(user1.kalkuliereZeit(b1),55);
        assertEquals(user1.kalkuliereZeit(f1),65);
        assertEquals(user1.kalkuliereZeit(hi1),30);
        assertEquals(user1.kalkuliereZeit(ho1),20);
    }

    @Test
    void kalkuliereDurschnittszeit() {
        assertEquals(user1.kalkuliereDurschnittszeit(),42.5);
    }
}