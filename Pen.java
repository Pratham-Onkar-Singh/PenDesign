public abstract class Pen {
  private String color;
  private WritingStrategy writingStrategy;
  private boolean isOpen = false;

  public Pen(String color, WritingStrategy strategy) {
    this.color = color;
    this.writingStrategy = strategy;
  }

  public abstract void open();

  public abstract void close();
  
  public abstract void refill();

  protected void setOpen(boolean open) {
    this.isOpen = open;
  }
  
  public void write() {
    if (isOpen) {
      System.out.print("color: " + color + "  ");
      writingStrategy.write();
    } else {
      System.out.println("Error: open pen first smarty");
    }
  }

}