package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String,String> dictionaryMap = new HashMap<String,String>();
	
	public void setDictionary() {
		
		dictionaryMap.put("apple","りんご");
		dictionaryMap.put("peach","桃");
		dictionaryMap.put("banana","バナナ");
		dictionaryMap.put("lemon","レモン");
		dictionaryMap.put("pear","梨");
		dictionaryMap.put("kiwi","キウィ");
		dictionaryMap.put("strawberry","いちご");
		dictionaryMap.put("grape","ぶどう");
		dictionaryMap.put("muscat","マスカット");
		dictionaryMap.put("cherry","さくらんぼ");
		
	}
	
	public void searchDictionary(String word) {
		
		String wordResult = dictionaryMap.get(word);
		
		if(wordResult != null) {
			System.out.println(word + "の意味は" + wordResult);
		}else {
			System.out.println(word + "は辞書に存在しません");
		}
	
	}


}
