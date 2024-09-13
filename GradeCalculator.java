public class GradeCalculator
{
  public static void main(String[] args)
  {
    String courseName = "AP Chemistry";
    int dailyMinutes = 131;

    int homeworkScore_1 = 100;
    int homeworkScore_2 = 85;
    int homeworkScore_3 = 90;
    int homeworkScore_4 = 95;

    double quizScore_1 = 95.4;
    double quizScore_2 = 93.8;

    double examScore = 92.4;

    System.out.println("course name: " + courseName);
    System.out.println("average time spent in a week for this course in minutes: " + dailyMinutes);
    System.out.println("homework grades for this course: ");
    
    System.out.println(homeworkScore_1);
    System.out.println(homeworkScore_2);
    System.out.println(homeworkScore_3);
    System.out.println(homeworkScore_4);

    System.out.println("quiz grades for this course: ");
    System.out.println(quizScore_1);
    System.out.println(quizScore_2);
    System.out.println("final exam grade for this course: ");
    System.out.println(examScore);

    System.out.println("Weekly minutes spent: " + (double)((dailyMinutes * 7)/60) + " hours");
    System.out.println("Weekly hours spent: " + ((dailyMinutes * 7)/60) + " hours"); 

    //15h 24m





    
    



    

    
  }

  public static double avgHomeworkScore(int... scores){
    int sum = 0;

    for (int score : scores) {
      sum += score;
    }

    return (double) sum / scores.length;
  }

  public static double avgQuizScore(int...scores){
    int sum = 0;

    for (int score : scores) {
      sum += score;
    }

    return (double) sum / scores.length; 
  }

  

  
}
