package acess_specifier;


class privateaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class Accessspecifier2{

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		privateaccessspecifier  obj = new privateaccessspecifier(); 
        //trying to access private method of another class 
        //obj.display();

	}
}




