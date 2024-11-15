class hi extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hi i am Rohith");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class hello extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hello i am not Rohith");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class we extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("we are not Rohith");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
public class Main {
    public static void main(String[] args){
        hi obj1=new hi();
        hello obj2=new hello();
        we obj3=new we();

        obj1.start();
        try{Thread.sleep(10);} catch(Exception e){}
        obj2.start();
        try{Thread.sleep(10);} catch(Exception e){}
        obj3.start();

    }

}
