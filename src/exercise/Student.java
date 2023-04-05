package exercise;

public class Student {
    private String studentNumber;
    private String studentName;
    private int markForMaths;
    private int markForEnglish;
    private int markForScience;
    
    public Student(String studentNumber,String studentName){
        this.studentNumber=studentNumber;
        this.studentName=studentName;
    }
    
    public String getNumber(){
        return studentNumber;
    }
    
    public String getName(){
        return studentName;
    }
    
    public  void enterMarks(int markForMaths,int markForEnglish,int markForScience){
        this.markForMaths=markForMaths;
        this.markForEnglish=markForEnglish;
        this.markForScience=markForScience;
    }
    
    public  int getMathsMark(){
        return markForMaths;
    }
    
    public  int getEnglishMark(){
        return markForEnglish;
    }
    
    public  int getScienceMark(){
        return markForScience;
    }
    
    public  double calculateAverageMark(){
        return ((double)markForMaths+(double)markForEnglish+(double)markForScience)/3;
    }
    
    public static void main(String[] args) {
        Student dqy=new Student("22200150101","dqy");
        dqy.enterMarks(100,100,100);
        System.out.println(dqy.calculateAverageMark());
    }
}
