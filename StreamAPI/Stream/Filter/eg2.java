/*
Code will run as collect method on Stream class will 
return Mutable List.
*/
import java.util.*;
import java.util.stream.Collectors;
class eg2
{
public static void main(String gg[])
{
List<Integer> list=new ArrayList(Arrays.asList(1,2,3,4,5,6,74,8,10));
List<Integer> filteredList=list.stream().filter((num)->num>6).collect(Collectors.toList());
System.out.println("-------------------Before Modification-------------------");
filteredList.forEach(System.out::println);
filteredList.add(91);
filteredList.add(100);
System.out.println("-------------------After Modification-------------------");
filteredList.forEach(System.out::println);
}
}