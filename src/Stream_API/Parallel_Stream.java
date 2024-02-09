package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
class Student{
    String name;
    int score;
    Student(String name, int score){
        this.name=name;
        this.score=score;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
}

public class Parallel_Stream {
    public static void main(String []args){
        IntStream is = IntStream.rangeClosed(1,5);
        System.out.println("Sequential Steam");
        is.forEach(System.out::println);

        System.out.println("Parallel Steam");
        IntStream ps = IntStream.rangeClosed(1,5);
        ps.parallel().forEach(System.out::println);
        List<Student> s= Arrays.asList(
                new Student("Mohan",85),
                new Student("Moh",88),
                new Student("Mohit",75),
                new Student("Mo",85),
                new Student("Moan",85),
                new Student("Mohn",85),
                new Student("Mohijan",85),
                new Student("Rajan",85),
                new Student("Dev",45)

        );
        s.stream().filter(e->e.getScore()>=75).limit(3)
                .forEach(t-> System.out.println("Name " +t.getName() + "Score " +t.getScore()));

        //Parallel stream method
        s.parallelStream().filter(e->e.getScore()>=75).limit(3)
                .forEach(t-> System.out.println("Name " +t.getName() + "Score " +t.getScore()));

        //Another way to declare  parallel stream
        s.stream().parallel().filter(e->e.getScore()>=75).limit(3)
                .forEach(t-> System.out.println("Name " +t.getName() + "Score " +t.getScore()));

    }
}
