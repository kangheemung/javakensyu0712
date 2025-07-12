package lesson14; 
 
public class Sample1407{ 
    public static void main(String[] args) { 
        Human1407 satou = new Human1407(); 
 
        // 戻り値を持つメソッドを呼びだし、戻り値を変数に代入 
        String[] showHobbies = satou.tellHobbies(); 
        for(int i=0; i< showHobbies.length; i++) {
        	System.out.println((i+1)+"つ目の趣味は"+showHobbies[i]+"です。");
        }
    } 
} 