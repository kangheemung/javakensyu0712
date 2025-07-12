package lesson14; 
 
/** 
 * 人間クラス 
 */ 
public class Human1406 { 
    /** 
     * 携帯電話を購入 
     * 
     * @param p 携帯電話 
     */ 
	

	/**
	 * @param sei kang;
	 @param mei heemung;
	 @return fullName;
	 */
	
    public String sayFullName(String sei, String mei) { 
    	String fullName = sei+mei;
    	return fullName;
    }
	    /**
	     * @param weight
	     * @param height
	     * @return BMI
	     */
	
		 public double calcBmi(double weight ,double height) {
		 double bmi =weight/(height/100)*(height/100);
		 return bmi;
      }
    } 
