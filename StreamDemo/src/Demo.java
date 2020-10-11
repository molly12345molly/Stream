import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

        //所有的collection集合都可以通过Stream获取流  map方法
        Stream<String> stream=Stream.of("1","2","3","4");
        Stream<Integer> stream1=stream.map((String s)->{
            return Integer.parseInt(s);
        });
        stream1.forEach(i-> System.out.println(i));

        String[] arr={"美羊羊","喜洋洋","红太狼"};
        Stream<String> stream2=Stream.of(arr);
        Stream<String> stream3=stream2.limit(1);
        //遍历流
        //stream3.forEach(name-> System.out.println(name));

        //跳过前几个元素的方法
        String[] arr1={"美羊羊","喜洋洋","红太狼"};
        Stream<String> stream4=Stream.of(arr1);
        Stream<String> stream5=stream4.skip(1);
        //stream5.forEach(name-> System.out.println(name));

        Stream<String> concat=Stream.concat(stream3,stream5);
        concat.forEach(name-> System.out.println(name));








    }
}
