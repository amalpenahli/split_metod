import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String inputWord = input();
        spl(inputWord);

    }

    public  static  String input(){
        System.out.println("soz daxil edin");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        return word;

    }

    public static  void spl(String inputWord){
        String regex = "[a]";
        String[] myArray = inputWord.split(regex);
        for (String soz : myArray) {
            System.out.println(soz);
        }
    }
}