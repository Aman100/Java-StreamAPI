/*
Map is used to transform the data
*/
import java.util.*;
import java.util.stream.Collectors;
class eg1
{
public static void main(String gg[])
{
List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
List<Integer> filteredList=list.stream().map((num)->(num%2!=0)?num*100:num)
.collect(Collectors.toList());
filteredList.forEach(System.out::println);
}
}