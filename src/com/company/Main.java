package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

         Basketball basketball1=new Basketball();
         Basketball basketball2=new Basketball();
         Fussball fussball1=new Fussball();
         Fussball fussball2=new Fussball();
         Hindernislauf hindernislauf1 = new Hindernislauf();
         Hindernislauf hindernislauf2=new Hindernislauf();
         Hochsprung hochsprung1=new Hochsprung();
         Hochsprung hochsprung2=new Hochsprung();

         List<Sport> sportUser1 = List.of(new Sport[]{basketball1, fussball2, hindernislauf1});
         Benutzer user1=new Benutzer("Pop","Andrei",sportUser1);
         System.out.println();
         System.out.println("Added new user with name: " + user1.getVorName()+" "+ user1.getNachName()+ ", and Sport Types:"+
                 sportUser1.stream().map(e -> e.getClass().toString().substring(18)+" ").reduce(" ", String::concat) + ";");

         System.out.print("Added times of Sport Durations from user " + user1.getVorName()+" "+ user1.getNachName()+ ": ");
         System.out.println(user1.kalkuliereZeit());
         System.out.print("Added times of Sport Durations from user, for sport of given type("+ basketball1.getClass().toString().substring(18) +"): ");
         System.out.println(user1.kalkuliereZeit(basketball1));
         System.out.print("Average times of Sport Durations from user, " + user1.getVorName()+" "+ user1.getNachName()+": ");
         System.out.println(user1.kalkuliereDurschnittszeit());
    }
}
