
package librarymanagementsystem2;


public class LibraryInfo extends library{
    
    String location;
    
   LibraryInfo(String i,String n,String l){
        id=i;
        name=n;
        location=l;
       }
    void LibraryInfo(){
        System.out.println("Library Name : "+name+"\nLibrary Id : "+id+"\nLibrary Location : "+location);
    }


    
}

    

