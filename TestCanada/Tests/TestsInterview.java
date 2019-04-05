package Tests;

import java.util.HashMap;

public class TestsInterview {
	
	public static void main(String[] args) {
//		System.out.println(checkNewspaperWords("abc, de! de fg","de? fg fg! fg#")); 
//		int[] enterArray={1,1,1,1,0,1,0,0,0,0,1};
//		findMaxZerosOrOnes(enterArray); 
		System.out.println(isArmstrongNumber(152));
		
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
            if (wordItem.getValue() < 0) {
            	//Not enough words in Newspaper
            	result = false;
            	break;
            } else {
               result = true;
            }  
        }
		return result; 
	}
	

//2. Write a function that takes a number as input and returns true if this number is an Armstrong number 
//	or false if it is not
	/* Function to calculate x raised to the 
    power y */
 static int power(int x, long y) 
 { 
     if( y == 0) 
         return 1; 
     if (y%2 == 0) 
         return power(x, y/2)*power(x, y/2); 
     return x*power(x, y/2)*power(x, y/2); 
 } 

 /* Function to calculate order of the number */
 static int order(int x) 
 { 
     int n = 0; 
     while (x != 0) 
     { 
         n++; 
         x = x/10; 
     } 
     return n; 
 } 

 // Function to check whether the given number is 
 // Armstrong number or not 
 static boolean isArmstrongNumber (int x) 
 { 
     // Calling order function 
     int n = order(x); 
     int temp=x, sum=0; 
     while (temp!=0) 
     { 
         int r = temp%10; 
         sum = sum + power(r,n); 
         temp = temp/10; 
     } 

     // If satisfies Armstrong condition 
     return (sum == x); 
 } 
		


	// 3. Write a function that takes an array of zeros and ones as input
	// and returns the maximum number of consecutive zeros or ones
	
	public static int findMaxZerosOrOnes(int arr[]) {
		int resultOnes = 0; 
		int onesCountInRow = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			// Reset count when 0 is found 
			if (arr[i] == 0) {
				onesCountInRow = 0; 
			}
			
			// If 1 is found, increment count 
            // and update result if count becomes 
            // more. 
			else {
				onesCountInRow++;//increase count 
                resultOnes = Math.max(resultOnes, onesCountInRow); 
						}
		}
		System.out.println(resultOnes);
		
		return resultOnes;
		
	}

}
