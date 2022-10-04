import java.util.*;
class OptionalStream{
public static void main(String[] args){
Optional<Integer> op = Optional.of(9455);
System.out.println("Optional: " + op);
System.out.println("Getting the stream");
op.stream().forEach(System.out::println);
}
}