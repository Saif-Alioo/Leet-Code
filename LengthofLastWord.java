package lengthoflastword;

//import java.util.Scanner;

public class LengthofLastWord {

    static int length(String s) {
        int count = 0;
        char ch[] = s.toCharArray();
        int len = s.length();
        int i = 0;
        while (i < len) {
            if (ch[i] != ' ') {
                count++;
                i++;
            } else {
                while (i < len && ch[i] == ' ') {
                    i++;
                }
                if (i == len) {
//                    System.out.println("count");
                    return count;
                } else {
                    count = 0;
                }
            }

        }

        return count;
    }

    public static void main(String[] args) {
//        System.out.println("Enter the string::");
//        Scanner sc=new Scanner(System.in);
//        String st=sc.nextLine();
        String st = "Saif Ali Khan";
        System.out.println("Length of last word is "+length(st));
    }

}
