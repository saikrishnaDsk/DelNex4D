package pro1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSrlz {

public static void main(String[] args) {

try{
FileInputStream fin=new FileInputStream("myobj.ser");
ObjectInputStream oin=new ObjectInputStream(fin);

IOStreamsDemo test=(IOStreamsDemo)oin.readObject();
System.out.println(test.x);
System.out.println(test.y);
System.out.println(test.z);
System.out.println(test.testingData);

}
catch (Exception e) {
e.printStackTrace();
}

}

}
