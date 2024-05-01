/*
Way to Average list of numbers:
Mentioned Below

Another Way:
IntStream average method
*/
import java.util.function.*;
import java.util.*;
import java.util.stream.Collectors;
class eg1
{
public static void main(String gg[])
{
List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
Double avg=list.stream().collect(Collectors.averagingInt(val->val));
System.out.println(avg);
}
}