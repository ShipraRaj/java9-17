import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Immutablecollection{
public static void main(String[] args){
Stream<Integer> evenStream= Stream.iterate(0,i -> i+2).limit(50);
List<Integer> evenNo = (List<Integer>)evenStream.collect(Collectors.toUnmodifiableList());
System.out.println(evenNo);
evenNo.add(90);

}
}