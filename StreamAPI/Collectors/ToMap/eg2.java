/*
Collectors.toMap(Student::getName,p->p,(student1,student2)->student1): 
Used to create map in which the key is name, value is student object itself.

Third argument: Third argument is used to to specify which Student object to
use during key collision.
*/
import java.util.function.*;
import java.util.*;
import java.util.stream.Collectors;

class Student
{
private String name;
private Integer age;
private Integer rollNumber;
public Student(String name, Integer age, Integer rollNumber)
{
this.name=name;
this.age=age;
this.rollNumber=rollNumber;
}
String getName()
{
return this.name;
}
Integer getAge()
{
return this.age;
}
Integer getRollNumber()
{
return this.rollNumber;
}
public String toString()
{
return this.getName() + " " + this.getAge() + " " + this.getRollNumber();
}
}

class eg2
{
public static void main(String gg[])
{
List<Student> list=new ArrayList<>();
list.addAll(Arrays.asList(new Student("Aman",1,111),new Student("Aman",2,22),
new Student("Aman",3,333),new Student("Amit",4,444),new Student("Ankita",5,555)));

Map<String,Student> map=list.stream()
.collect(Collectors.toMap(Student::getName
,student -> student
,(student1,studen2)->student1));

//Function.identity()==student->student

for(Map.Entry<String,Student> entry:map.entrySet())
{
System.out.println("Key: " + entry.getKey() +", Value: " + entry.getValue());
}

}
}