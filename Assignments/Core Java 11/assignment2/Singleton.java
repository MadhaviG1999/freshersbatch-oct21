public class Singleton {
    private static Singleton s = null;   
public String str;     
private Singleton()   
{   
str = "it is an example of singleton class.";   
}   
public static Singleton getInstance()   
{   
    if (s== null)   
s = new Singleton();   
return s;   
}   
}  
class Test  
{   
public static void main(String args[])   
{    
Singleton a = Singleton.getInstance();   
Singleton b = Singleton.getInstance();   
Singleton c = Singleton.getInstance();    
a.str = (a.str).toUpperCase();   
System.out.println("String from a is " + a.str);   
System.out.println("String from b is " + b.str);   
System.out.println("String from c is " + c.str);   
}   
    
}