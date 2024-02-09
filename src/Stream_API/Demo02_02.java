package Stream_API;

import java.util.Arrays;
import java.util.List;
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

    }
}
