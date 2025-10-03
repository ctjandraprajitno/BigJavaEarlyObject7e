public class StudentTester {

  public static void main(String[] args){
    Student eric = new Student("Eric");
    eric.addQuiz(90);
    eric.addQuiz(80);
    eric.addQuiz(70);
    System.out.println(eric.getName());
    System.out.println(eric.getTotalScore());
    System.out.println(eric.getAverageScore());
  }
}
