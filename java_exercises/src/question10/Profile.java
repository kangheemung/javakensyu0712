package question10;
// Question10_1 応用 以下の条件を満たすProfileクラスを作成しましょう。
//  アクセス制限のついた年齢フィールド(フィールド名は任意)
//  アクセス制限のついた名前フィールド(フィールド名は任意)
//  年齢フィールドのgetterメソッド
//  年齢フィールドのsetterメソッド
//  名前フィールドのgetterメソッド
//  名前フィールドのsetterメソッド
// また、Question10_01クラスでProfileクラスをオブジェクト化し、コンソール上に実行結果を表示しましょう。
// 記述にあたっては以下の仕様に従うものとします。
public class Profile {
	
	private int age;
    private String name;
	 // Constructor
    public Profile(int age, String name) {
        this.age = age;
        this.name = name;
    }
// Getter and Setter for Age
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	// Getter and Setter for Name
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public static void main(String[] args) {
        Profile profile = new Profile(25, "John");
        
        System.out.println("Name: " + profile.getName());
        System.out.println("Age: " + profile.getAge());

        profile.setAge(30);
        profile.setName("Alice");

        System.out.println("Updated Name: " + profile.getName());
        System.out.println("Updated Age: " + profile.getAge());
    }

}
