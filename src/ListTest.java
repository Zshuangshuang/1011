import java.util.ArrayList;
import java.util.List;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-11
 * Time:15:31
 **/
public class ListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("C语言");
        list.add("python");
        list.add("java");
        list.add("Rubby");
        System.out.println(list);
        list.set(0,"PHP");
        for (String s:list) {
            System.out.print(s+"   ");
        }
        System.out.println();
        System.out.println(list.subList(1, 3));

        List<String> list2 = new ArrayList<>(list);

    }
}
