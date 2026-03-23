class CapPen extends Pen {
  public CapPen(String color, WritingStrategy strategy) {
    super(color, strategy);
  }

  @Override
  public void open() {
    System.out.println("Cap removed");
    setOpen(true);
  }

  @Override
  public void close() {
    System.out.println("Cap closed");
    setOpen(false);
  }

  @Override
  public void refill() {
    System.out.println("opening body to replace refill");
  }
}