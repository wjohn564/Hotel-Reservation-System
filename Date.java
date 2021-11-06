package DateAndTime;

import java.util.StringTokenizer;

public class Date
{  
   private String date;
   private int year;
   private int month;
   private int day;

   public Date(String s){
       String[] input = s.split("/");
       
       this.date = s;
       this.year = Integer.parseInt(input[0]);
       this.month = Integer.parseInt(input[1]);
       this.day = Integer.parseInt(input[2]);
        
   }
   
   public int getYear(){
       return year;
    }
    
   public int getMonth(){
        return month;
   }
    
   public int getDay(){
        return day;
   }
   
   public String getDate() {
	   return date;
   }
   public boolean equals(Object o){
       boolean check;
       if(o == null){
            check = false;
        }else if(!(o instanceof Date)){
            check = false;
        }
       
       Date d = (Date) o;
       if(d.getYear() == year && d.getMonth() == month && d.getDay() == day){
           check = true;
        }else{
           check = false;
        }
        
       return check;
    }
    
   @Override
   public String toString(){
       return "Date: " + year + "/" + month + "/" + day;
    }
       
}
