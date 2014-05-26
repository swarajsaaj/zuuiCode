import java.io.*;

public class biodata implements Serializable
{
    String name;
    int age;
    String phno;
    double bill;
    biodata(int a,String n,String p,double b)
    {
        age = a;
        name  = n;
        phno = p;
        bill = b;
    }
}
