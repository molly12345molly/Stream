import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);
        //使用迭代器进行遍历
        Iterator<Integer> iterator=set.iterator();
        while (iterator.hasNext()){
            Integer n=iterator.next();
            System.out.println(n);//12123
        }
        //使用增强for遍历set集合
        System.out.println("---------");

    }
}
