import java.util.*;
import java.util.stream.*;
class IteratorStream{
//Function to get Stream
public static <T> Stream<T> getStreamFromIterator(Iterator<T> iterator){
//Convert Iterator to spliterator
Spliterator<T> splt = Spliterators.spliteratorUnknownSize(iterator,0);
//get a sequential stream from spliterator
return StreamSupport.stream(splt,false);
}

public static void main(String[] args){
//get the iterator
 Iterator<Integer> iter = Arrays.asList(1,2,3,4,5).iterator();
//get stream from iterator
Stream<Integer> stream = getStreamFromIterator(iter);
//Print the elements of stream
stream.forEach(s -> System.out.println(s));
}
}
