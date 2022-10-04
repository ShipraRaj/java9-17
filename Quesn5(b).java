import java.util.Optional;
class OptionalOrElseThrowExample{
public static void main(String[] args) throws Exception{
Optional<Integer> optional1 = Optional.of(1);
System.out.println("Optional1 : " + optional1);
Integer val = optional1.orElseThrow(() -> {
  return new  Exception("no value present in optional object");
});
System.out.println("Value at optional1 is : " + val);
Optional<Integer> optional2 = Optional.empty();
System.out.println("Value at optional2 is: " + optional2);
val = optional2.orElseThrow(() -> {
 return new Exception ("no value present in optional object");
});
}
} 