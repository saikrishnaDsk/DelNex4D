package pro1;

import java.util.Vector;

//set , list  , map
//set         list
//unordered  ordered
//unique       not unique  


public class CollectionDemo {

public static void main(String[] args) {

Vector<Integer> v=new Vector<Integer>();
int x=50;
v.add(x);
v.add(50);
v.insertElementAt(100, 1);

System.out.println(v);
v.insertElementAt(200, 2);

System.out.println(v.size());
System.out.println(v);

v.add(666);
System.out.println(v.size());


for(Integer i:v)
{
System.out.println(i);
}

}

}