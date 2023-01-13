/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem2;

/**
 *
 * @author ISHRAK
 */
public class BooksInfo   extends library  {
       
    
    
    int  quantity;
    int price;
    
    

    public BooksInfo(String  i, String n,int q, int p) {
        id = i;
        name = n;
         
        
       quantity = q;
       price = p;
        
        
    }
    
    void BookInfo(){
        System.out.println("Books Id: "+id+"\nBooks Name : "+name+"\nBook quantity : "+quantity+"\nbook price :"+price);
    }
    
    
//override
void tax(){
    if(150<price){
        System.out.println("with add tax");
        
    }
    else{
        System.out.println("with no tax");
    }
    
    
}
    
}
