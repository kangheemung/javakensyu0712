package question09; 
 
import java.util.Random; 
 
public class Question09_04 { 
 public static void main(String[] args) { 
 int result = new Random().nextInt(4) + 1; 
 System.out.println("福引きを購入します"); 
 
 
 switch (result) {
 case  1:
	 System.out.println("大当たり"); 
     // 式の値と値Aが一致したときの処理
     break;
 case 2:
     // 式の値と値Bが一致したときの処理
	 System.out.println("当たり");
     break;
 case 3:
     // 式の値と値Bが一致したときの処理
	 System.out.println("外れ"); 

     break;
 default:
     // 式の値がどのcaseの値とも一致しなかったときの処理
	 System.out.println("大外れ"); 

   }
  } 
} 