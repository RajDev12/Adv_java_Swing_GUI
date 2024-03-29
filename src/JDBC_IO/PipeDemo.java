package JDBC_IO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class PipeDemo {
    public static void main(String[] args)  throws IOException {
        Pipe p= Pipe.open();
        Pipe.SinkChannel ps=p.sink();
        String str="Computer";

        ByteBuffer bb=ByteBuffer.allocate(1024);
        bb.clear();
        bb.put(str.getBytes());
        bb.put(str.getBytes());
        bb.flip();
        while(bb.hasRemaining()){
            //writing to SinkChannel
            ps.write(bb);
        }

        //Creating the Source Channel
        Pipe.SourceChannel source=p.source();
        bb=ByteBuffer.allocate(2048);
        while(source.read(bb)>0){
            bb.flip();
            while (bb.hasRemaining()) {
                char t = (char) bb.get();
                System.out.print(t);
            }
            bb.clear();
        }


    }

}
