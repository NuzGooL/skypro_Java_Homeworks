package P2_JavaCore.HW05_Exeptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void checkSignInExceptions(String login, String password, String confirmPassword) {

        if (login.length() > 20) {
            throw new WrongLoginException("Login is longer than 20 chars");
        }

        Pattern pattern = Pattern.compile("\\W");

        Matcher matcherLogin = pattern.matcher(login);
        if (matcherLogin.find()) {
            throw new WrongLoginException("Invalid character");
        }

        if (password.length() > 20) {
            throw new WrongPasswordException("Password is longer than 20 chars");
        }
        Matcher matcherPassword = pattern.matcher(password);
        if (matcherPassword.find()) {
            throw new WrongPasswordException("Invalid character");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password failed verification");
        }
    }

    public static void main(String[] args) {
        try {
            checkSignInExceptions("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Случилось: " + e);
        }
    }
}