public class AverageMarks{
   public static void main(String[] args){
      
        int maths = 80;
        int science = 85;
        int history = 90;

        int Average = (maths+ science + history)/3;
        
        System.out.println("Average Marks:" + Average);

        if(Average>=90){
           System.out.println("Grade:A");
        }
        else if(Average>=70){
           System.out.println("Grade:B");
        }
        else if(Average>=50){
           System.out.println("Grade:C");
        }
        else if(Average>=30){
           System.out.println("Grade:D");
        }
        else{
           System.out.println("Fail");
        }
     }
  }
