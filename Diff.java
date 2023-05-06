import java.util.ArrayList;
import java.util.List;

public class Diff {
    
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Sachin");
        list.add("ketan");
        list.stream().forEach(e->System.out.println(e));
    }
}
