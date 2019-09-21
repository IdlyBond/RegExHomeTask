import java.util.Scanner;

public class NameChecker {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        NameChecker checker = new NameChecker();
        while(true) {
            System.out.println("Введите ФИО на русском или английском, или \"0\" для выхода: ");
            String fio = scr.nextLine();
            if(fio.trim().equals("0")) break;
            else System.out.println(checker.nameChecker(fio));
        }
    }

    public boolean nameChecker(String fio){
        return fio.trim().matches("^[A-Z][a-z]+\\s[A-Z][a-z]+\\s[A-Z][a-z]+$|^[А-Я][а-я]+\\s[А-Я][а-я]+\\s[А-Я][а-я]+$");
    }
}
