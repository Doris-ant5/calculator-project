import java.util.Scanner;
public class Main {
    public static double giveMeNumber () {
        Scanner scanner = new Scanner(System.in);
        String inputAdditionFirstNumber;
        do {
            inputAdditionFirstNumber = scanner.nextLine();
            if (!inputAdditionFirstNumber.matches("[0-9.]+")) {
                System.out.println("Podana wartość nie jest liczbą, proszę wpisać poprawną wartość");
            }
        }
        while (!inputAdditionFirstNumber.matches("[0-9.]+"));
        return Double.parseDouble(inputAdditionFirstNumber);
    }
    public static void main(String[] args) {

        String inputFromUser = "";
        while (!inputFromUser.equals("e")) {
            System.out.println("""
                    Wybierz wartość z nawiasu by wybrac odpowiednia operacje:
                    [1] Dodawanie
                    [2] Odejmowanie
                    [3] Mnozenie
                    [4] Dzielenie
                    [5] Pierwiastek kwadratowy
                    [6] Pierwiastek n-tego stopnia
                    [7] Logarytm z liczby o podstawie 2

                    [e] Wyjscie z programu\s""");

            Scanner scanner = new Scanner(System.in);
            inputFromUser = scanner.nextLine();

            if (inputFromUser.equals("e")) {
                System.out.println("Dziękuję za skorzystanie z programu. Do widzenia");

            } else if (inputFromUser.equals("1")) {
                System.out.println("Prosze o podanie pierwszego skladnika");
                double number1Addition = giveMeNumber();
                System.out.println("Prosze o podanie drugiego skladnika");
                double number2Addition = giveMeNumber();
                double ResultOfAddition = number1Addition + number2Addition;
                System.out.println("Wynik operacji to: " + ResultOfAddition);

            } else if (inputFromUser.equals("2")) {
                System.out.println("Prosze o podanie odjemnej");
                double number1Subtraction = giveMeNumber();
                System.out.println("Prosze o podanie odjemnika");
                double number2Subtraction = giveMeNumber();
                double ResultOfSubtraction = number1Subtraction - number2Subtraction;
                System.out.println("Wynik operacji to: " + ResultOfSubtraction);

            } else if (inputFromUser.equals("3")) {
                System.out.println("Prosze o podanie pierwszego czynnika");
                double number1Multiply = giveMeNumber();
                System.out.println("Prosze o podanie drugiego czynnika");
                double number2Multiply = giveMeNumber();
                double ResultOfMultiply = number1Multiply * number2Multiply;
                System.out.println("Wynik operacji to: " + ResultOfMultiply);

            } else if (inputFromUser.equals("4")) {
                System.out.println("Prosze o podanie dzielnej");
                double number1Divide = giveMeNumber();
                System.out.println("Prosze o podanie dzielnika");

                double number2Divide = 0;
                while (number2Divide == 0) {
                    number2Divide = giveMeNumber();
                    if (number2Divide == 0) {
                        System.out.println("Nie mozesz dzielic przez 0. Proszę wpisać liczbę różną od 0");
                    }
                }

                double ResultOfDivision = number1Divide / number2Divide;
                System.out.println("Wynik operacji to: " + ResultOfDivision);

            } else if (inputFromUser.equals("5")) {
                System.out.println("Prosze o podanie zmiennej");
                double number1SquareRoot = giveMeNumber();
                double ResultOfSquareRoot = (Math.sqrt(number1SquareRoot));
                System.out.println("Wynik operacji to: " + ResultOfSquareRoot);

            } else if (inputFromUser.equals("6")) {
                System.out.println("Prosze o podanie stopnia pierwiastka");
                double number1NthSquare = giveMeNumber();
                System.out.println("Prosze o podanie zmiennej");
                double number2NthSquare = giveMeNumber();
                double ResultOfNthSquare = Math.pow(number2NthSquare, 1 / number1NthSquare);
                System.out.println("Wynik operacji to: " + ResultOfNthSquare);

            } else if (inputFromUser.equals("7")) {
                System.out.println("Prosze o podanie zmiennej");
                double number1Logarithm = giveMeNumber();
                double ResultOfLogarithm = Math.log(number1Logarithm) / Math.log(2);
                System.out.println("Wynik operacji to: " + ResultOfLogarithm);

            } else {
                System.out.println("Niepoprawna operacja");
            }
        }
    }
}