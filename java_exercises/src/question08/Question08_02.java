package question08; 
 
public class Question08_02 { 
 public static void main(String[] args) { 
	 int foo[] = new int[5];

		foo[0] = 88;
		foo[1] = 62;
		foo[2] = 54;
		foo[3] = 76;
		foo[4] = 45;
	 //ichiro[88],jiro[62] , saburo[54],shiro[76] , goro[45] 
 int sum = foo[0] + foo[1] + foo[2]+ foo[3]+foo[4];
 
 System.out.println("全員のテストの合計は" + sum + "点です"); 
 } 
} 