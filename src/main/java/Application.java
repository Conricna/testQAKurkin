import animals.Kotik;

import java.util.Arrays;

public class Application {
    public static void main(String args[]){

        Kotik cat = new Kotik("cali", "miy",1 ,43);
        Kotik cat1 = new Kotik();

        System.out.println("Голос первого котёнка - " + cat.getVoice());
        System.out.println("Голос второго котёнка - " + cat1.getVoice());
        System.out.println("Всего котиков - " + Kotik.count);
        System.out.println(Arrays.toString(cat1.liveAnotherDay()));
    }
}
