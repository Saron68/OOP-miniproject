public class Animal{
     String name;
     int age;
     int number of legs;


     Animal(String name){
        this.name = name;
       }

       void eat(){
        System.out.println(name +"eats")

       }
       
}
public class Dog extends Animal;
    String bread;

    Dog(String bread , String name){
     super(name);
     this.bread = bread;   
    }  
    @Override
    void eat(){ 
        System.out.println(name +"eats bone")
    }
public class Main{
    public static void main(){
        Dog Dog1 = new Dog("buchi", "shepherd");
    }
}   