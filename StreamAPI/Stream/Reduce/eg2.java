/*
Reduce on Streams is used to perform aggregate operations.

mapToInt: return IntStream which is also used to perform aggregate operations.
return: aggregation on this method will return OptionalInteger except for sum()
*/
import java.util.*;
import java.util.stream.*;
class eg2
{
public static void main(String gg[])
{
List<Integer> list=new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

System.out.println("----------------- MAX VALUE------------------");
Integer max=list.stream().mapToInt(Integer::intValue).max().getAsInt();
System.out.println(max);
System.out.println("----------------- SUM------------------");
Integer sum=list.stream().mapToInt(Integer::intValue).sum();
System.out.println(sum);
System.out.println("----------------- MIN VALUE ------------------");
Integer min=list.stream().mapToInt(Integer::intValue).min().getAsInt();
System.out.println(min);
System.out.println("----------------- AVERAGE VALUE ------------------");
Double avg=list.stream().mapToInt(Integer::intValue).average().getAsDouble();
System.out.println(avg);
}
}
