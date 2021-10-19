package com.company;

import java.util.List;

/**
 * The type Benutzer.
 */
public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    /**
     * Gets vor name.
     *
     * @return the vor name
     */
    public String getVorName() {
        return vorName;
    }

    /**
     * Sets vor name.
     *
     * @param vorName the vor name
     */
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    /**
     * Gets nach name.
     *
     * @return the nach name
     */
    public String getNachName() {
        return nachName;
    }

    /**
     * Sets nach name.
     *
     * @param nachName the nach name
     */
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    /**
     * Gets sport.
     *
     * @return the sport
     */
    public List<Sport> getSport() {
        return sport;
    }

    /**
     * Sets sport.
     *
     * @param sport the sport
     */
    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    /**
     * Instantiates a new Benutzer.
     *
     * @param vorName  the vor name
     * @param nachName the nach name
     * @param sport    the sport
     */
    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport=sport;
    }

    /**
     * Kalkuliere zeit double.
     * return the added times of sports in the list
     *
     * @return the double
     */
    public double kalkuliereZeit(){
        double sum=0;
        for(Sport el: sport){
            sum+=el.kalkuliereZeit();
        }
        return sum;
    }

    /**
     * Kalkuliere zeit double.
     * returns the added times of sports in the list of the same type as the given parameter
     *
     * @param currentSport the current sport
     * @return the double
     */
    public double kalkuliereZeit(Sport currentSport){
        double sum=0;
        for(Sport el: sport){
            if(currentSport.getClass()==el.getClass()) {
                sum += el.kalkuliereZeit();
            }
        }
        return sum;
    }

    /**
     * Kalkuliere durschnittszeit double.
     * returns the average time of sports in the list
     *
     * @return the double
     */
    public double kalkuliereDurschnittszeit(){
        double sum=0;
        for(Sport el: sport){
            sum+=el.kalkuliereZeit();
        }
        return sum/sport.size();
    }


}
