class ClickPen extends Pen {
  public ClickPen(String color, WritingStrategy strategy) {
    super(color, strategy);
  }

  @Override
  public void open() {
    System.out.println("Pen is now open");
    setOpen(true);
  }

  @Override
  public void close() {
    System.out.println("Pen closed");
    setOpen(false);
  }

  @Override
  public void refill() {
    System.out.println("pen refilling...");
  }
}