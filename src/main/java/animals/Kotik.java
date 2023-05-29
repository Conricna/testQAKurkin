package animals;

import java.util.Objects;

public class Kotik {

    private String name = "tom";
    private String voice = "mau" ;
    private boolean satiety =  false;
    private int weight = 1;
    private static int count = 0;
    private final int METHODS = 5;

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

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Kotik() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public Kotik(String name, String voice, boolean satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    private boolean play() {
        if(satiety == false ){
            //System.out.println("Котик очень голоден, показатель сытости - " + satiety);
            eat();
            return false;
        }
        weight=weight-2;
        return true ;
    }
    private boolean sleep () {
        if(satiety == false ){
            //System.out.println("Котик очень голоден, показатель сытости - " + satiety);
            eat();
            return false ;
        }
        return true;
    }
    private boolean wash () {
        if(satiety == false ){
            //System.out.println("Котик очень голоден, показатель сытости - " + satiety);
            eat();
            return false ;
        }
        return true;
    }
    private boolean walk () {
        if(satiety == false ){
            //System.out.println("Котик очень голоден, показатель сытости - " + satiety);
            eat();
            return  false ;
        }
        return true;
    }
    private boolean hunt () {
        if(satiety == false ){
            //System.out.println("Котик очень голоден, показатель сытости - " + satiety);
            eat();
            return  false ;
        }
        return true;
    }
/**/
    private void eat (boolean satiety ) {
        this.satiety= true;
        //System.out.println(" Показатель сытости" + this.satiety);
    }
    private void eat (boolean satiety, String foodName) {
        this.satiety= true;
       // System.out.println(foodName + " " + satiety);
    }
    private void eat () {
        this.satiety= true;
        eat(this.satiety);
        eat( this.satiety, "burg");
    }


    public String[] liveAnotherDay(){
        String result = null;
        String[] dayCat = new String[24];
        for (int i=0; i<dayCat.length; i++){
            int qwe = (int) (Math.random()*METHODS);
            switch (qwe) {
                case 1:
                    if (play()){
                         result= "играл";
                    }
                    else
                        result = "ел";
                    break;
                case 2:
                    if (wash()){
                        result = "Умывался";
                    }
                    break;
                case 3:
                    if (walk()){
                        result = "Гулял";
                    };
                    break;
                case 4:
                    if(hunt()){
                        result = "Охотился";
                    }
                    break;
                default:
                    if(sleep()){
                        result = "Спал";
                    }
                    break;
            }
            dayCat[i] =  + i + " - " + result;
        }
        return dayCat;
    }
}
