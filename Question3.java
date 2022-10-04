import java.util.stream.IntStream;
import java.util.stream.LongStream;
public class RangeClosedExample{
public static void main(String[] args){
System.out.println("Using IntStream.rangeClosed()");
IntStream.rangeClosed(1,10).forEach(i -> System.out.print(i + " "));
}
}
