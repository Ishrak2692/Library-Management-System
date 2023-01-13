/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem2;


public class Readers extends library implements Ioffer {
    
    String  number;
    int spent_hour;
    int day;
    
Readers (String  i,String n,String   num, int s , int d){
        id=i;
        name=n;
        number=num;
        spent_hour=s;
        day=d;
        }
     void ReaderInfo(){
System.out.println("Readers Name : "+name+"\n Readers  Id : "+id+"\n Readers Number : "+number+"\n Spent hour for reading books: "+spent_hour+"\n return book in day: "+day);
    }
  //abstract
void bookinformation(){
    if(day>7){
        System.out.println("pay fine for each day");
    }
    else
        System.out.println("no need fine");
    
    
}
//interface
public  void getoffer(){
    if(spent_hour>4 )
        System.out.println("get offer");
    else
        System.out.println("no offer");
}
}
    

