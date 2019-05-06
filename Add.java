class B
{
void m1(int a,int b)
{
System.out.println(a);
System.out.println(b);
}
}
class A extends B
{
void m1(String str1,String str2)
{
System.out.println(str1);
System.out.println(str2);
}
}
class Add extends A
{
void m1(float f1)
{
System.out.println(f1);
}
public static void main(String[]args)
{
Add a=new Add();
a.m1(2.5f);
a.m1("anil","venky");
}
}