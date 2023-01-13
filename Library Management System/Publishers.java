/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem2;


public class Publishers  extends library {
  
 
    String number;
    
   Publishers (String  i,String n,String num){
        id=i;
        name=n;
        number=num;
       }
   void Publishers_Info(){
       System.out.println("Publisher Name : "+name+"\n Publisher Id : "+id+"\n Publisher Number : "+number);
    }
//abstract
void bookinformation(BooksInfo b1 ){
    if(b1.quantity<400)
        System.out.println("need to supply books");
    else 
        System.out.println("dont need to supply books");

    

}
}
    

