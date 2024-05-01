/*
Collectors.joining(delimiter): 
Used to concatenate string which optional delimiter.
*/
import java.util.function.*;
import java.util.*;
import java.util.stream.Collectors;

class eg1
{
public static void main(String gg[])
{
List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
String string=list.stream().map(str -> String.valueOf(str))
.collect(Collectors.joining(","));

System.out.println(string);
}
}