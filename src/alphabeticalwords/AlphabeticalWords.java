/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabeticalwords;

import java.util.Scanner;
import java.lang.*;

public class AlphabeticalWords {
    public static void main(String[] args) {
        Boolean flag = false;
        Character[] charDivider;
        String word;
        int compare;
        
        System.out.println("Input word to validate.");
        Scanner input = new Scanner(System.in);
        word=input.nextLine();
        charDivider = new Character[word.length()];
        for(int index = 0;index<word.length();index++){
            charDivider[index] = word.charAt(index);
            if(index > 0){
                compare = charDivider[index].compareTo(charDivider[index-1]);
                if(compare < 0){
                    flag = true;
                }
            }
        }
        
        if(flag){
            System.out.println(word + " NOT IN ORDER");
        }
        
        else{
            System.out.println(word + " IN ORDER");
        }
    }
}