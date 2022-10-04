import java.util.*; 
public class IfPresent{
public static void main(String[] args){
Optional<Integer> op = Optional.of(9455);
System.out.println("Optional: " + op);
op.ifPresentOrElse((value) -> {
System.out.println("Value is present, its: " + value); },
()
 -> {
System.out.println("Value is Empty");
});
}
}  