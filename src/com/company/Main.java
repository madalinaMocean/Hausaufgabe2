package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

         Basketball b1=new Basketball();
         Basketball b2=new Basketball();
         Fussball f1=new Fussball();
         Fussball f2=new Fussball();
         Hindernislauf hi1 = new Hindernislauf();
         Hindernislauf hi2=new Hindernislauf();
         Hochsprung ho1=new Hochsprung();
         Hochsprung ho2=new Hochsprung();

         List<Sport> sportUser1 = List.of(new Sport[]{b1, f2, hi1});
         Benutzer user1=new Benutzer("Pop","Andrei",sportUser1);
         System.out.println();
         System.out.println("Added new user with name: " + user1.getVorName()+" "+ user1.getNachName()+ ", and Sport Types:"+
                 sportUser1.stream().map(e -> e.getClass().toString().substring(18)+" ").reduce(" ", String::concat) + ";");

         System.out.print("Added times of Sport Durations from user " + user1.getVorName()+" "+ user1.getNachName()+ ": ");
         System.out.println(user1.kalkuliereZeit());
         System.out.print("Added times of Sport Durations from user, for sport of given type("+ b1.getClass().toString().substring(18) +"): ");
         System.out.println(user1.kalkuliereZeit(b1));
         System.out.print("Average times of Sport Durations from user, " + user1.getVorName()+" "+ user1.getNachName()+": ");
         System.out.println(user1.kalkuliereDurschnittszeit());
    }
}
