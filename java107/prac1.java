class prac1
{
prac1()
{
System.out.println("Person classConstructor");
}}
class Student extends prac1{
Student()
{
	super();
System.out.println("Student class Constructor");
}}

class Test
{
public static void main(String[] args){
Student s = new Student();}
}