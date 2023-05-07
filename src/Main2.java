import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    // Привет мой друг!
    public static Scanner scanner = new Scanner(System.in);
    public static String example;
    public static int count;
    public static String finalResult;
    public static List<String> list = new ArrayList();


    public static void main(String[] args) {
        example = scanner.nextLine();
        char [] chars = example.toCharArray();
        String [] strings = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if(Character.isLetter(chars[i])){
                strings[i]=String.valueOf(chars[i]);
                count++;
                if(i==chars.length-1){
                    strings[i]=chars[i]+ " ["+count+"] ";
                }
            }
            else if(!Character.isLetter(chars[i])){
                if(String.valueOf(chars[i]).equals(" ")){
                    if(count==0){

                    }
                    else{
                    strings[i]=" [" + String.valueOf(count)+"] ";
                    count = 0;
                    }
                }
                else{
                    if(count==0){
                        strings[i] = String.valueOf(chars[i]);
                    }
                    else {
                        strings[i] = chars[i] + " [" + String.valueOf(count) + "]";

                        count = 0;
                    }
                }
            }

        }
        Arrays.stream(strings).forEach((el)->list.add(el));
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==null){
                list.set(i, " ");
            }
            else if(list.get(i).chars().allMatch(Character::isDigit)){
                list.set(i, " ["+list.get(i)+"] ");
            }
        }

        String listString = "";

        for (String a :
                list) {
            listString+=a;
        }

        for (int i = 0; i < listString.length(); i++) {
            System.out.print(listString.charAt(i));
            if(i==0){

            }
            else if(i % 100 == 0){
                System.out.println();
            }
        }
        System.out.println();

// check
    }
}
