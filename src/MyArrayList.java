/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-11
 * Time:14:05
 **/
public class MyArrayList<E> {

    private E[] data = (E[])new Object[100];
    private int size;
    public void add(E elem){
        data[size] = elem;
        size++;
    }
    public  Object get(int index){
        return data[index];
    }
}
