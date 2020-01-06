package pro1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IOStreamsDemo implements Serializable{

int x;
String y;
static int z;

transient int testingData;

public static void main(String[] args) {

try{

IOStreamsDemo iod=new IOStreamsDemo();
iod.x=50;
iod.y="SOME VALUE";
iod.z=500;
iod.testingData=60;
FileOutputStream fout=new FileOutputStream("myobj.ser");
ObjectOutputStream oout=new ObjectOutputStream(fout);
oout.writeObject(iod);
System.out.println("Obj Stored");

}
catch (Exception e) {
e.printStackTrace();
}
}
}