package exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class StringLengthFinding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for(int i = 0; i < str.length(); i++){
            LinkedList<Character> linkedList = new LinkedList<>();
            linkedList.add(str.charAt(i));
            for(int j = i + 1; j < str.length(); j++){
                if(str.charAt(j) > linkedList.getLast()){
                    linkedList.add(str.charAt(j));
                }
            }
            if(linkedList.size() > max.size()){
                max.clear();
                max.addAll(linkedList);
            }
            linkedList.clear();
        }
        for (Character character: max){
            System.out.println(character);
        }
        System.out.println();
    }
}
