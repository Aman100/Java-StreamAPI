/*
Collectors.groupingBy(Student::getName): 
Used on Stream to groupBy name and return a Map in which 
key=String, value=List<Student>
*/
import java.util.function.*;
import java.util.*;
import java.util.stream.Collectors;

class Student
{
private String name;
private Integer age;
public Student(String name, Integer age)
{
this.name=name;
this.age=age;
}
String getName()
{
return this.name;
}
Integer getAge()
{
return this.age;
}
}

class eg2
{
public static void main(String gg[])
{
List<Student> list=new ArrayList<>();
list.addAll(Arrays.asList(new Student("Aman",1),new Student("Aman",2),
new Student("Aman",3),new Student("Amit",4),new Student("Ankita",5)));

Map<String,List<Student>> map=list.stream()
.collect(Collectors.groupingBy(Student::getName));

for(Map.Entry<String,List<Student>> entry:map.entrySet())
{
System.out.println("Key: " + entry.getKey());
for(Student s: entry.getValue()) System.out.println(s.getName() + " " + s.getAge());
System.out.println();
}
}
}