/*
anyMatch: Check if any occurance of elem occurs or not according to predicate
*/
import java.util.*;
import java.util.stream.Collectors;
class eg1
{
public static void main(String gg[])
{
List<Integer> list=new ArrayList(Arrays.asList(1,2,3,4,5,6,74,8,10));
Boolean res=list.stream().anyMatch(elem -> elem==5);
if(res) System.out.println("FOUND");
else System.out.println("NOT FOUND");
}
}