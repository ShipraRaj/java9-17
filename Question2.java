import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class TakeDropWhile{
public static void main(String [] args){
//takewhile
Stream<String> stream=Stream.of("aman","amar","suraj","subham");
List<String> list=stream.takeWhile(name  -> (name.charAt(0) =='a')).collect(Collectors.toList());
System.out.println(list);

//dropwhile
List<Integer> list1=Stream.of(2,3,5,4,6,8,10,12).dropWhile(n -> n%2 == 0).collect(Collectors.toList());
System.out.println(list1);
}
}



