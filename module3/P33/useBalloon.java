public class useBalloon {
  public static void main(String[] args) {
    Balloon balon = new Balloon();
    balon.setRad(12);
    balon.inflate(3);
    System.out.println(balon.getVolume());
  }
}
