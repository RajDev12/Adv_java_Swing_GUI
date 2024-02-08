import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
//package Stream_API;

public interface Demo02_02 {
    public static void main(String[] args) {
        //Non - Terminal -> filter, map, distinct, limit
        //    return stream of object
        //  Terminal -> collect, count, min,max, forEach, toArray
        List<String> list = Arrays.asList("bike","car","car", "bike");
        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
        list.stream().distinct().forEach(System.out::println);

        long x  = list.stream().count();
        long y = list.stream().distinct().count();
        System.out.println(x);
        System.out.println(y);

        list.stream().limit(2).forEach(System.out::println);
        List<String> collect2 =list.stream().limit(3).collect(Collectors.toList());
        System.out.println(collect2);

        //filter revision
        List<Integer> list1 =Arrays.asList(2,3,4,5,8,76,9,42,5,78,9,6,4,6,54);
        long z = list1.stream().filter(e->e%2==0).count();
        System.out.println(z);

//        Optional<Integer> m =  list1.stream().min((x, y)->{return x.compareTo(y)});
//        System.out.println(m.get());

        //REDUCE=combines many objects into a single stream or list
        List<String> list2 =Arrays.asList("1","2","3","A","B", "C");
        Optional<String> red = list2.stream().reduce(
                (val, comb) -> {
                    return val+comb;
                }
        );
        System.out.println(red);
        //do above code for the integer also

        //toArray
        Object a[]= list.stream().toArray();
        System.out.println(a.length);
        for(Object t:a){
            System.out.println(t);
        }



    }
}
