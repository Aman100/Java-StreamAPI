/*
MapToLong
MapToInt
MapToDouble: It takes objecj reference compatible 
with DoubleStream class which is used to perform 
aggregations.
*/
import java.util.*;
import java.util.stream.Collectors;
class eg1
{
public static void main(String gg[])
{
List<String> list=new ArrayList<>();
list.add("1.456");
list.add("2.674");
list.add("3.87");
list.add("4.78976");
List<Double> finalList=list.stream().mapToDouble(Double::parseDouble)
.boxed().collect(Collectors.toList());
finalList.forEach(System.out::println);
}
}
