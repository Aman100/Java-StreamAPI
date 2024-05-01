/*
sorting list using streams
*/
import java.util.*;
import java.util.stream.Collectors;
class eg1
{
public static void main(String gg[])
{

List<Integer> list=new ArrayList(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
List<Integer> filteredList=list.stream().sorted().collect(Collectors.toList());
filteredList.forEach(System.out::println);
}
}