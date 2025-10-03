// Implement a class Student. 
// For the purpose of this exercise, a student has a name and a total quiz score. 
// Supply an appropriate constructor and methods getName(), addQuiz(int score), getTotalScore(), and getAverageScore(). 
// To compute the average you also need to store the number of quizzes that the student took.
// Supply a StudentTester class that tests all methods

public class Student {
  private String name;
  private int totalScore;
  private int quizCount;

  public Student(String name) {
    this.name = name;
    this.totalScore = 0;
    this.quizCount = 0;
  }

  public String getName() {
    return name;
  }

  public void addQuiz(int score) {
    totalScore += score;
    quizCount++;
  }

  public int getTotalScore() {
    return totalScore;
  }

  public float getAverageScore() {
    return totalScore / quizCount;
  }

}
