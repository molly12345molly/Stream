import java.util.HashSet;

public class DemoHash {
    public static void main(String[] args) {


        //创建hash集合对象
        HashSet<String> set=new HashSet<>();
        String s1=new String("abc");
        String s2=new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        System.out.println(set);
//set集合调用add方法时，会调用hashcode方法和equals方法判断元素是否重复
        //所以确定不会重复



    }


}
