/*
Collectors.groupingBy(Function.identity(),Collectors.counting()): 
Used on Stream to groupBy elements of list and associate counter with it
*/
import java.util.function.*;
import java.util.*;
import java.util.stream.Collectors;
class eg1
{
public static void main(String gg[])
{
List<String> list=new ArrayList<>();
list.add("Aman");
list.add("Aman");
list.add("Aman");
list.add("Amit");
list.add("Ankita");
Map<String,Long> map=list.stream().collect(
Collectors.groupingBy(Function.identity(),Collectors.counting()));
Iterator<Map.Entry<String,Long>> it=map.entrySet().iterator();
while(it.hasNext())
{
Map.Entry<String,Long> entry=it.next();
System.out.println(entry.getKey() + " " + entry.getValue());
}
}
}