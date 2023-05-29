import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Kotik {

    private String name = "tom";
    private String voice = "mau" ;
    private int satiety = 1;
    private double weight = 1;
    public static int count = 0;
    final  int METHODS = 5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, double weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    private String play() {
        if(satiety == 0 ){
            //System.out.println("Котик очень голоден, показатель сытости - " + satiety);
            return  eat() ;
        }
        weight=weight-2;
        satiety--;
        return "играл";
    }
    private String sleep () {
        return "Спал";
    }
    private String wash () {
        return "Умывался";
    }
    private String walk () {
        return "Гулял";
    }
    private String hunt () {
        return "Охотился";
    }
/**/
    private String eat ( int satiety ) {
        this.satiety= this.satiety + satiety;
        //System.out.println(" Показатель сытости" + this.satiety);
        return "ел";
    }
    private String eat (String foodName, int satiety) {
        this.satiety= this.satiety + satiety;
       // System.out.println(foodName + " " + satiety);
        return "ел";
    }
    private String eat () {
        this.satiety++;
        eat(this.satiety);
        eat("burg", this.satiety);
        return "ел";
    }

    public String[] liveAnotherDay(){
        String result;
        String[] dayCat = new String[24];
        for (int i=0; i<dayCat.length; i++){
            int qwe = (int) (Math.random()*METHODS);
            switch (qwe) {
                case 1:
                    result = play();
                    break;
                case 2:
                    result = wash();
                    break;
                case 3:
                    result = walk();
                    break;
                case 4:
                    result = hunt();
                    break;
                default:
                    result = sleep();
                    break;
            }
            dayCat[i] = "ЧАС: " + i + " " + result;
        }
        return dayCat;
    }
}
