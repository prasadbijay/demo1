package com.binarytree;

 public class Tsc{
int id_num;
int phone;
String name;
 static String jobtitle="tsc";

public Tsc( int id, int p_number, String ename){
id_num=id;
phone=p_number;
name=ename;
}
public void display(){
System.out.println(this.id_num +  "  "+this.phone+  "  "  +this.name+  "  "  +this.jobtitle+  "  ");
}
public static void main(String[] args){
Tsc tc=new Tsc(1000,564920132,"bijay");
Tsc tc1=new Tsc(1001,770920132,"ankush");
Tsc tc2=new Tsc(1002,990920122,"venky");
Tsc tc3=new Tsc(1003,860920132,"rahul");
Tsc tc4=new Tsc(1004,900920122,"thrusal");
tc.display();
tc1.display();
tc2.display();
tc3.display();
tc4.display();
}
}
