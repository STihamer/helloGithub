import java.util.ArrayList;
import java.util.List;

public class HelloGit {

    public static void printHello(){
        System.out.println("Hello Git");

        List<String>happyArray = new ArrayList<>();
        happyArray.add("I");
        happyArray.add("am");
        happyArray.add("a");
        happyArray.add("happy");
        happyArray.add("list");
        System.out.println(happyArray);
        System.out.println(happyArray + "modified");

        List<String> sadList = new ArrayList<>();
        sadList.add("I");
        sadList.add("am");
        sadList.add("so");
        sadList.add("sad");

        System.out.println(sadList);
    }
}
