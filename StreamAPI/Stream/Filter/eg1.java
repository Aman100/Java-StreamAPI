/*
Code won't run as Operation Not Allowed As toList() On Stream 
Returns ImmutableCollection.
*/
import java.util.*;
import java.util.stream.Collectors;
class eg1
{
public static void main(String gg[])
{

List<Integer> list=new ArrayList(Arrays.asList(1,2,3,4,5,6,74,8,10));
List<Integer> filteredList=list.stream().filter((num)->num>6).toList();
filteredList.forEach(System.out::println);
fl1.add(2);
}
}