package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//We cant modify the stream, once we create a stream and perform some operation on the go and it got deleted after one operation

public class MyStream {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,12,13,26,27,29,60,80);

        //another way tot create s list
        List<Integer> newList = new ArrayList<>();
        newList.add(10);
        newList.add(12);
        newList.add(1);
        newList.add(90);
        newList.add(60);

        //without stream
        List<Integer> evenList = new ArrayList<>();
        for(int i:myList){
            if(i%2 == 0)
                evenList.add(i);
        }
        System.out.println(("My List :" + myList));
        System.out.println(("Even List :" + evenList));

        //CONVERTING THE myList into a stream collection
        //under filter we are using predicate statement. its takes a arument and returns boolean

        Stream<Integer> stream1 = myList.stream();
        List<Integer> collect1 = stream1.filter(n->n%2 == 0).collect(Collectors.toList());
        System.out.println("collect1" + collect1);

        //stream1 woill be deleted and ours answers stored in collect1 List.

        Stream<Integer> stream2 = myList.stream();
        List<Integer> collect2 = stream2.filter(n->n%2 == 0).collect(Collectors.toList());
        System.out.println("collect2" + collect2);

        //display items from myList > 25
        Stream<Integer> stream3 = myList.stream();
        List<Integer> collect3 = stream3.filter(n-> n>25).collect(Collectors.toList());
        System.out.println("collect3" + collect3);


        //we didnt made any changes in our orginal myList
        System.out.println(myList);


        //String is a class and name is the object of class string ,SO we are using Stream.of(OBJECT)
        String[] name = {"Aman","Rohit","Rahul","Amar"};
        List<String> myfriend = Stream.of(name).collect(Collectors.toList());

        String []name2 = {"Aman","Rohit","Rahul","Amar"};
        Stream<String> str1 = Stream.of(name2);
        str1.forEach(n->{
            System.out.println(n);
        });
        //empty stream
        Stream<Objects> emptystream = Stream.empty();
        emptystream.forEach(e->{
            System.out.println(e);
        });

        //defining a aonymous array
        IntStream stream4 = Arrays.stream(new int[]{8,4,5,6,3,7});
        stream4.forEach(e->{
            System.out.println(e);
        });
        Stream<String> stream5 = Arrays.stream(new String[]{"A","B","C","D","E","F","G"});
        stream5.forEach(e->{
            System.out.println(e);
        });


        //filter name begins with R
        List<String> strings1 =Arrays.asList("A","B","C","D","cdkjjbvl","F","cmpdkfnos");
        List<String> startswithC= strings1.stream().filter(e -> e.startsWith("c")).collect(Collectors.toList());
        System.out.println(startswithC);


        List<String> strings2 =Arrays.asList("A","B","C","D","cdkjjbvl","F","cmpdkfnos");
        List<String> endsswithC= strings1.stream().filter(e -> e.endsWith("l")).collect(Collectors.toList());
        System.out.println(endsswithC);

        List<Integer> num =Arrays.asList(6,5,4,7,7,8,9);
        List<Integer> nn =num.stream().map(n->n+n).collect(Collectors.toList());
        System.out.println(nn);

        Integer nn1 = num.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(nn1);

    }
}
//interface in java is a reference type similar to a class which have only abstract meythod. abstract method doesnt have body part