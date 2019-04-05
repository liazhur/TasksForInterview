package Tests;

import java.util.HashMap;

public class TestsInterview {
	
	public static void main(String[] args) {
		System.out.println(checkNewspaperWords("abc, de! de fg","de? fg")); 
		int Main_Array[] = {1,0,0,0,0,1,1,1,1,1};
		//System.out.println(findMaxZerosOrOnes(Main_Array)); 
	}
	
//	1. There is a scoundrel who stole a dog from a neighbor.
//	He wants to write a ransom note, cutting out words from a newspaper. 
//	The task is to write a function that accepts 2 strings (text of the newspaper, text of the note) 
//	and returns true if all the words from the note are in the text of the newspaper or false if there are not enough words
// cover case when words in note more than in newspaper
	
	public static boolean checkNewspaperWords(String newspp, String note) {
		boolean result = false;
		String[] newspWords = newspp.toLowerCase().split("\\W+");
		String[] noteWords = note.toLowerCase().split("\\W+");
		
		// Create map for Newspaper and store duplicates quantity
		HashMap<String, Integer> newspaperMap = new HashMap<String, Integer>();
		for (String word:newspWords) {
			if (newspaperMap.get(word) == null) {
				newspaperMap.put(word, 1);
					}
			else {
					newspaperMap.put(word, newspaperMap.get(word)+1);
				}
				}
		for (String noteWord : noteWords) {
            if (newspaperMap.get(noteWord) == null) {
                newspaperMap.put(noteWord, -1);    
            } else {
                newspaperMap.put(noteWord, newspaperMap.get(noteWord) - 1);
            }
		 }
		
        for (HashMap.Entry<String, Integer> wordItem : newspaperMap.entrySet()) {
            if (wordItem.getValue() > 0) {
            	result = true;
            } else {
               //Not enough words in Newspaper
               result = false;
            }  
        }
		return result; 
	}
	
	//3. Написать функцию, которая принимает на вход массив нулей и единиц 
	//и возвращает максимальное число идущий вподряд нулей или единиц
	
	public static int findMaxZerosOrOnes(int[] arr) {
		int result = 0; 
		
		int zeroCountInRow = 0;
		int onesCountInRow = 0;
		int i; 
		
		for (int n:arr) {
			if(n==0) {
				zeroCountInRow++;
			}
			if(n==1) {
				onesCountInRow++;
			}
			else{ 
				  throw new IllegalArgumentException();
			}
		}
		
		return result;
		
	}

}
