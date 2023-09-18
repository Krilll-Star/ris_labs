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
    List<String> al = new ArrayList<>();
    al.add("Czech");
    al.add("Russia");
    al.add("Serbia");
    al.add("Slovenia");
    al.add("Slovakia");
    al.add("Belarus");
    
    Set<Character> hs = new HashSet<>();
    for (String s : al)
        for (int j = 0; j < s.length(); j++)
            hs.add(s.charAt(j));
    
    System.out.println(hs);
    }
}
