public class PenFactory {
  public static Pen createPen(String type, String mechanism, String color) {
    WritingStrategy strategy;
    
    // writing staregy:
    switch (type.toLowerCase()) {
      case "ball" -> strategy = new BallWritingStrategy();
      case "gel" -> strategy = new GelWritingStrategy();
      case "fountain" -> strategy = new FountainWritingStrategy();
      default -> throw new IllegalArgumentException("Pen type not supported:" + type);
    }

    // mechanism
    if (mechanism.equalsIgnoreCase("no-cap")) {
      return new ClickPen(color, strategy);
    } else {
      return new CapPen(color, strategy);
    }
  }
}