import animals.Kotik;

import java.util.Arrays;
import java.util.Objects;

public class Application {
    public static void main(String args[]){

        Kotik cat = new Kotik("cali", "miy",false ,43);
        Kotik cat1 = new Kotik();


        System.out.println(compareVoice(cat.getVoice(), cat1.getVoice()));
        System.out.println("Голос первого котёнка - " + cat.getVoice());
        System.out.println("Голос второго котёнка - " + cat1.getVoice());
        System.out.println("Всего котиков - " + Kotik.getCount());
        System.out.println(Arrays.toString(cat1.liveAnotherDay()));
    }
    public static boolean compareVoice(String voice1, String voice2){
        if (voice1!=voice2) return false;
        return true;
    }
}
