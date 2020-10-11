import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
// write your code here
        System.out.println("彭振");
        List<String> list=new ArrayList<>();
        list.add("张三");
        list.add("张三");
        list.add("张三");
        list.add("张三无六七七八八");
        //关注的是过滤，参数及对参数的操作
        System.out.println(list.stream().filter(name->name.endsWith("三")).count());
        list.stream().filter(name->name.length()>3).forEach(name-> System.out.println(name));
        //两次过滤，一次输出
        list.stream().filter(name->name.startsWith("张")).filter(name->name.length()>3).forEach(name-> System.out.println(name));
        //流思想概述----拼接流式模型，按照生产线生产物品，例如生产饮料---放瓶子，洗瓶子，装饮料，封口，装箱




    }
}
