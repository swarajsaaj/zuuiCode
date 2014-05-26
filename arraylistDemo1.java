
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.*;

public class arraylistDemo1 
{
    public static void main(String[] args) throws Exception
    {
         
          ArrayList<biodata> ar = new ArrayList<>();
               
           ar.add(new biodata(1,"A","Green Avenue",345.3));
           ar.add(new biodata(2,"B","Green Avenue",345.32));
           ar.add(new biodata(3,"c","Rose Avenue",445.6));
           ar.add(new biodata(4,"d","Chand Avenue",125.987));
           ar.add(new biodata(5,"e","Suraj Avenue",0864.2));
           ar.add(new biodata(6,"f","Akash Avenue",4823.3));
           ar.add(new biodata(7,"g","White Avenue",875.7));
          
              
           Object[] obj= ar.toArray();
           
           FileOutputStream fs = new FileOutputStream("C:\\Users\\Compaq\\Documents\\NetBeansProjects\\Java\\src\\aempty.ser");
           ObjectOutputStream out = new ObjectOutputStream(fs);
           out.writeObject(obj);
           
           out.close();
           fs.close();
           System.out.println("DONE");
           
           
    }
}
