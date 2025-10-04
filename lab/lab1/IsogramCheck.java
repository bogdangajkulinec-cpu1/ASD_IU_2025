import java.util.Scanner;

public class IsogramCheck {
    public static void main(String[] args) {
        String input = inputString();
        isIsogramCheck(input);
    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void isIsogramCheck(String inputString) {
        if (inputString.isEmpty()) {
            System.out.println("Строка является изограммой");
            return;
        }
        String lowerString = inputString.toLowerCase();
        for (int i = 0; i < lowerString.length(); i++) {
            for (int j = i + 1; j < lowerString.length(); j++) {
                if (lowerString.charAt(i) == lowerString.charAt(j)) {
                    System.out.println("Строка не является изограммой");
                    return;
                }
            }
        }
        System.out.println("Строка является изограммой");
    }
}
/* 3 Изограмма – это слово, в котором нет повторяющихся букв,
последовательных или непоследовательных. Реализуйте функцию, которая
определяет, является ли строка, изограммой. Пустая строка является
изограммой.
 */