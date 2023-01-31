public class StaticTest {

  public int a = 10;

  public void nonStatic() {
    System.out.println("can access static variable inside non-static method : "
        + a);
    main(new String[2]);
  }

  public static void main(String[] args) {
    System.out.println("Inside main method");
  }

}
