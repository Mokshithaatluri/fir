
class Demo{
public static void main(String[] args)
{
Test t=new Test();
int result1=t.add(2,3);
int result2=t.add(2,3,4);
System.out.println(result1+" "+result2);
}
}
class Test
{
public int add(int a,int b)
{
return a+b;
}
public static int add(int a,int b,int c)
{
return a+b+c;
}
}

