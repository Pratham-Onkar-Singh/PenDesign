public class Main {
  public static void main(String[] args) {
    Pen myPen = PenFactory.createPen("ball", "cap", "red");

    myPen.open();

    myPen.write();
    
    myPen.close();
    
    myPen.refill();
  }
}