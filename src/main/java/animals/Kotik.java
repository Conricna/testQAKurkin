package animals;

import java.util.Objects;

public class Kotik {

    private String name = "tom";
    private String voice = "mau" ;
    private int satiety = 1;
    private int weight = 1;
    private static int count = 0;
    private static final int METHODS = 5;

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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Kotik() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    private boolean play() {
        if(satiety > 0 ){
            satiety--;
            return true;
        }
        return false ;
    }
    private boolean sleep () {
        if(satiety > 0 ){
            satiety--;
            return true;
        }
        return false ;
    }
    private boolean wash () {
        if(satiety > 0 ){
            satiety--;
            return true;
        }
        return false ;
    }
    private boolean walk () {
        if(satiety > 0 ){
            satiety--;
            return true;
        }
        return false ;
    }
    private boolean hunt () {
        if(satiety > 0 ){
            satiety--;
            return true;
        }
        return false ;
    }
/**/
    private void eat (int satiety ) {
        this.satiety= this.satiety + satiety;
        //System.out.println(" Показатель сытости" + this.satiety);
    }
    private void eat (int satiety, String foodName) {
        this.satiety= this.satiety + satiety;
       // System.out.println(foodName + " " + satiety);
    }
    private void eat () {
        this.satiety++;
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
                    else {
                        eat();
                        result = "ел";
                    }
                    break;
                case 2:
                    if (wash()){
                        result = "Умывался";
                    }
                    else {
                        eat();
                        result = "ел";
                    }
                    break;
                case 3:
                    if (walk()){
                        result = "Гулял";
                    }
                    else {
                        eat();
                        result = "ел";
                    }
                    break;
                case 4:
                    if(hunt()){
                        result = "Охотился";
                    }
                    else {
                        eat();
                        result = "ел";
                    }
                    break;
                default:
                    if(sleep()){
                        result = "Спал";
                    }
                    else {
                        eat();
                        result = "ел";
                    }
                    break;
            }
            dayCat[i] =  + i + " - " + result;
        }
        return dayCat;
    }
}
