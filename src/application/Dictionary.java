package application;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	
	private Map<String, String> memory;
	
	public Dictionary() {
		memory=new HashMap<>();
	}
	
	//search question
	public String search(String question) {
		return memory.get(question);
	}
	
	//save question and answer
	public void saveToMemory(String question,String answer) {
		memory.put(question, answer);
	}
	
	//memorize words
	public int size() {
		return memory.size();
	}
	
}
