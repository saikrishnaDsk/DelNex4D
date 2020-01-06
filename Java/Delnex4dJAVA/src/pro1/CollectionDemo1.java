package pro1;

import java.util.ArrayList;

// set , list  , map
// set         list
// unordered  ordered
// unique       not unique  


public class CollectionDemo1 {

public static void main(String[] args) {

ArrayList<Integer> v=new ArrayList<Integer>();
int x=50;
v.add(x);
v.add(50);
v.add(1,100);

System.out.println(v);
v.add(2, 200);

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