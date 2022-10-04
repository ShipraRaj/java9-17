class Questn10 {
    public static void main (String[] args) {
        
      String string="abc"; 
      int count=3;  
      System.out.println("String :"+string.repeat(count));

String str = "        Geeks For Geeks Internship    !   ";
// removing leading and trailing white spaces
 System.out.println(str.strip());


String s = "";
System.out.println("\"" + s + "\" is blank - " + s.isBlank());
   
s = "h i  ";
System.out.println("\"" + s + "\" is blank - " + s.isBlank());


 // Input string(indent)
        String input = "GeeksforGeeks";
        System.out.println(input);
        System.out.println("Input String length: "
                           + input.length());
 
        // Call indent method on input string with n=5
        // (positive)
        String output = input.indent(5);
        System.out.println(output);
        System.out.println("New String length: "
                           + output.length());
 
        // Call indent method on output string with n=0
        String output1 = output.indent(0);
        System.out.println(output1);
        System.out.println("New String length: "
                           + output1.length());
 
        // Call indent method on output1 string with n=-3
        // (negative)
        String output2 = output.indent(-3);
        System.out.println(output2);
        System.out.println("New String length: "
                           + output2.length());


String text = "Woolha,dot,com";
  List<String> result = text.transform(t -> {
    return Arrays.asList(t.split(","));
  });
System.out.println(result);

System.out.println("hello world  ".stripIndent());

//formatted:
System.out.println("1. %s 2. %s 3. %s ".formatted("one", "two", "three"));

String str = "This is tab \t, Next New Line \n,next backspace \b,next Single Quotes \' next,Double Quotes \" ";
System.out.println(str.translateEscapes());
      }
}