/*
Reduce on Streams is used to perform aggregate operations.

Points:
1. Passing default/starting value to reduce: It will return Wrapper DataType
2. Not Passing default/starting value to reduce: It will return Wrapper wrappen
in optional

*/
import java.util.*;
import java.util.stream.*;
class eg1
{
public static void main(String gg[])
{
List<Integer> list=new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

System.out.println("----------------- MAX VALUE Way 1: Using Math.max------------------");
Integer max=list.stream().reduce(0,Integer::max);
System.out.println(max);
System.out.println("----------------- MAX VALUE Way 2: Traditional Approach------------------");
Optional<Integer> maxx=list.stream().reduce((calcTillNow,nextVal)->(calcTillNow>nextVal)?calcTillNow:nextVal);
System.out.println(maxx.get());
System.out.println("----------------- SUM WAY 1------------------");
Optional<Integer> sum=list.stream().reduce((calcTillNow,nextVal)->
{
System.out.println("calcTillNow: " + calcTillNow + ", nextVal: " + nextVal);
return calcTillNow+nextVal;
});
System.out.println(sum.get());
System.out.println("----------------- SUM WAY 2------------------");
Integer summ=list.stream().reduce(0,Integer::sum);
System.out.println(summ);
System.out.println("----------------- MIN VALUE ------------------");
Integer min=list.stream().reduce(2147483647,Integer::min);
System.out.println(min);
System.out.println("----------------- AVERAGE VALUE ------------------");
Double avg=list.stream().mapToInt(Integer::intValue).average().getAsDouble();
System.out.println(avg);
}
}
