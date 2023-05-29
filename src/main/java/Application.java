import animals.Kotik;

import java.util.Arrays;
import java.util.Objects;

public class Application {

    public static void main(String args[]){

        Kotik cat = new Kotik("cali", "miy",1 ,43);
        Kotik cat1 = new Kotik();


//        System.out.println(compareVoice(cat.getVoice(), cat1.getVoice()));
        System.out.println("Всего котиков - " + Kotik.getCount());
        System.out.println(Arrays.toString(cat1.liveAnotherDay()));
    }

    private static boolean compareVoice(Kotik voice, Kotik voice1) {
        return Objects.equals(voice, voice1);
    }
}
