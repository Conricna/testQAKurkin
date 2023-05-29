import animals.Kotik;

import java.util.Arrays;
import java.util.Objects;

public class Application {

    public static void main(String[] args){

        Kotik cat = new Kotik("Котик1", "ma",1 ,1);
        Kotik cat1 = new Kotik();



        System.out.println("Всего котиков - " + Kotik.getCount());
        System.out.println(Arrays.toString(cat1.liveAnotherDay()));
        //System.out.println(new Application().compareVoice(cat, cat1));
        System.out.println(compareVoice(cat, cat1));

    }


    public static boolean compareVoice(Kotik voice, Kotik voice1) {
        return Objects.equals(voice.getVoice(), voice1.getVoice());
    }
}
