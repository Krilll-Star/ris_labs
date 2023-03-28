import java.util.*;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        List<String> al = new ArrayList<>();
        al.add("Czech");
        al.add("Russia");
        al.add("Serbia");
        al.add("Slovenia");
        al.add("Slovakia");
        al.add("Belarus");

        String[] subStr;
        Set<String> hs = new HashSet<>();

        for (int i = 0; i < al.size(); i++){
            subStr = al.get(i).split("");
            for (int j = 0; j < subStr.length; j++){
                hs.add(subStr[j]);
            }
        }

        System.out.println(hs);
    }
}