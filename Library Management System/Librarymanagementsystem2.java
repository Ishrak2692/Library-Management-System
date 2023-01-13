
package librarymanagementsystem2;


public class Librarymanagementsystem2 {
    

    
    public static void main(String[] args) {
        
         StaffInfo s1 = new StaffInfo("1001","tamim",1500);
         s1.setSalary(56000);
      
       BooksInfo book = new BooksInfo("0988870","Himu Somgro",400,200);
        Readers  reader  = new Readers("104","Noor Islam","017XXXXXXXX",5,8);
        Publishers publisher  = new Publishers("986", "Jabeda Khatun", "018XXXXXXXX");
        LibraryInfo library = new LibraryInfo("5600","BANGLA  LIBRARY","Dhanmondi 32");
        
       director d1=new director();
       System.out.println("");
        System.out.println("");
        System.out.println("FOR STAFF------");
        s1.Staff_Info();
        
        d1.getbonus(s1);
        s1.tax(0);       
        System.out.println("");
        System.out.println("");
        System.out.println(" FOR BOOK------");
        book.BookInfo();
        book.tax();
        publisher.bookinformation(book);
        //Arraylist <String> = new Arraylist<String>();
        
        System.out.println("");
        System.out.println("");
        System.out.println(" FOR READERS------");
       reader .ReaderInfo();
       reader.bookinformation();
       reader.getoffer();
       System.out.println("");
        System.out.println("");
        System.out.println(" FOR PUBLISHERS------");
        publisher. Publishers_Info ();
        
        System.out.println("");
        System.out.println("");
        System.out.println("FOR LIBRARY--------");
       library.LibraryInfo();
       //s1.setSalary(90);
       //d1.getbonus(s1);


    }
    
        
        
    }
    

