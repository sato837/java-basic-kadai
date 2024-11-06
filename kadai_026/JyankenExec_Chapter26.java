package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
		
		String playGame = "notdone";
		
		while(playGame.equals("notdone")){
			try {
				String myChoice = jyanken.getMyChoice();		
				jyanken.playGame(myChoice);
				playGame = "done";
			}catch(IllegalArgumentException e) {
				System.out.println("エラー: " + e.getMessage());
			}
		}

	}

}
