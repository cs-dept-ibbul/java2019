
public class Student
{
    private String name;
    private int iDNumber;
    private double quiz1, quiz2, quiz3; 
    
    public Student(String sName, int id, double firstQuiz, double secondQuiz, double thirdQuiz)
    {
        name = sName;
        iDNumber = id;
        quiz1 = firstQuiz;
        quiz2 = secondQuiz;
        quiz3 = thirdQuiz;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getId()
    {
        return iDNumber;
    }
    
    public void getQuiz()
    {
        System.out.println("Quiz1 = " + quiz1);
        System.out.println("Quiz2 = " + quiz2);
        System.out.println("Quiz3 = " + quiz3);
    }
    
    public void setQuizOne(double quizOne)
    {
        quiz1 = quizOne;
    }
    
    public void setQuizTwo(double quizTwo)
    {
        quiz2 = quizTwo;
    }
    
    public void setQuizThree(double quizThree)
    {
        quiz3 = quizThree;
    }
    
    public double average()
    {
        return (quiz1 + quiz2 + quiz3)/3;
    }
    
    public void printDetails()
    {
        
        getName();
        getId();
        getQuiz();
        average();
    }
}
