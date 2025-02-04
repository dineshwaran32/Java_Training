package Day10;


interface Second1{
 abstract void run();
 default void run2() {
 System.out.println("Default method");

 }

}

class Third1 implements Second{
 public void run() {
 }
}

public class P3 {
  public static void main(String[] args) {
   Second1 s=new Second1() {
  public void run() {
  System.out.println("Eunning abstract method");
  }
   };
   s.run();
   s.run2();

  }

}

/*
 * and onject space
 */

