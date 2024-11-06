package kadai_026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	ArrayList<String> jyankenList = new ArrayList<String>();
	
	HashMap<String,String> jyankenMap = new HashMap<String,String>();
	
	public Jyanken_Chapter26(){
		setJyankenMap();
		setJyankenList();
	}
	
	private void setJyankenList() {
		
		jyankenList.add("グー");
		jyankenList.add("チョキ");
		jyankenList.add("パー");
		
	}
	
	private void setJyankenMap() {
		
		jyankenMap.put("r","グー");
		jyankenMap.put("s","チョキ");
		jyankenMap.put("p","パー");
		
	}
	
	public String getMyChoice() throws IllegalArgumentException{
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		String myChoiceInput = scanner.nextLine();
		
		String myChoice = jyankenMap.get(myChoiceInput);
		
		if(myChoice == null) {
			throw new IllegalArgumentException("じゃんけんの手はr・s・pのみです");
		}else {
			scanner.close();
			return myChoice;
		}
		
	}
	
	public String getRandom() {
		
		int randomChoiceNumber = (int)Math.floor(Math.random() * 3);				
		String randomChoice = jyankenList.get(randomChoiceNumber);
		
		return randomChoice;
		
	}
	
	public void playGame(String myChoice) {
		 
		String randomChoice = getRandom();
		
		System.out.println("自分の手は" + myChoice + ",対戦相手の手は" + randomChoice);
		
		int myChoiceNumber = jyankenList.indexOf(myChoice);
		int randomChoiceNumber = jyankenList.indexOf(randomChoice);
		
        if (myChoiceNumber == randomChoiceNumber) {
            System.out.println("あいこです");
        } else if ((myChoiceNumber == 0 && randomChoiceNumber == 1) || 
                   (myChoiceNumber == 1 && randomChoiceNumber == 2) || 
                   (myChoiceNumber == 2 && randomChoiceNumber == 0)) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
	
	}

}
