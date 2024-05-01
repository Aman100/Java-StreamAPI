/*
*/
import java.util.*;
import java.util.stream.Collectors;
class eg2
{
public static void main(String gg[])
{
//Sort Integer reverse
List<Integer> list=new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
List<Integer> filteredList=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
filteredList.forEach(System.out::println);
System.out.println();

/*
Sort Integer using fields
filteredList=list.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
filteredList.forEach(System.out::println);
*/
System.out.println();
//Sort Integer in ascending order
filteredList=list.stream().sorted().collect(Collectors.toList());
filteredList.forEach(System.out::println);

}
}