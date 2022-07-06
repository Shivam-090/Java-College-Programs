class Parent {   
    String name;   
    void showMessage()   
    {   
        System.out.println("Parent method is called");   
    }   
}   
    
class Child extends Parent {   
    int age;   
    void showMessage()   
    {   
        System.out.println("Child method is called");   
    }   
}   
    
public class Downcasting{  
    
    public static void main(String[] args)   
    {   
        Parent p = new Child();  
        p.name = "Shubham";  
        Child c = (Child)p;
        c.age = 18;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage();   
    }   
}  