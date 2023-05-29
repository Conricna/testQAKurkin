package animals;

public class Kotik {

    private String name = "tom";
    private String voice = "mau" ;
    private int satiety = 1;
    private int weight = 1;
    private static int count = 0;
    private final  int METHODS = 5;

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
        if(satiety == 0 ){
            //System.out.println("Котик очень голоден, показатель сытости - " + satiety);
            return  eat() ;
        }
        return "Спал";
    }
    private String wash () {
        if(satiety == 0 ){
            //System.out.println("Котик очень голоден, показатель сытости - " + satiety);
            return  eat() ;
        }
        return "Умывался";
    }
    private String walk () {
        if(satiety == 0 ){
            //System.out.println("Котик очень голоден, показатель сытости - " + satiety);
            return  eat() ;
        }
        return "Гулял";
    }
    private String hunt () {
        if(satiety == 0 ){
            //System.out.println("Котик очень голоден, показатель сытости - " + satiety);
            return  eat() ;
        }
        return "Охотился";
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
    private String eat () {
        this.satiety++;
        eat(this.satiety);
        eat( this.satiety, "burg");
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
