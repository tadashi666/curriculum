package check;

import constants.Constants;

public class Check {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String firstName = "尾崎";
		String lastName = "正";
		System.out.println(printName( firstName, lastName));

		String CHECK_CLASS_JAVA = "java吉";
	    String CHECK_CLASS_HOGE = "hoge";
	    String CHECK_CLASS_R2D2 = "R2D2";
	    String CHECK_CLASS_LUKE = "ルーク";

		Pet pet = new Pet(CHECK_CLASS_JAVA,CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet rob = new RobotPet(CHECK_CLASS_R2D2,CHECK_CLASS_LUKE);
		rob.introduce();
	}

	public static String printName(String firstName, String lastName) {
		// TODO 自動生成されたメソッド・スタブ
		return firstName + lastName;
	}


}
