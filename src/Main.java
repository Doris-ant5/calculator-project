import java.util.Scanner;
public class Main {
    public static double giveMeNumber () {
        Scanner scanner = new Scanner(System.in);
        String inputAdditionFirstNumber;
        boolean isNumber;
        do {
            inputAdditionFirstNumber = scanner.nextLine();
            isNumber = inputAdditionFirstNumber.matches("^(-?[0-9]+)(\\.[0-9]+)?$");
            if (!isNumber) {
                System.out.println("Podana wartość nie jest liczbą, proszę wpisać poprawną wartość");
            }
        }
        while (!isNumber);
        return Double.parseDouble(inputAdditionFirstNumber);
    }

    public static double giveMeAdditionOfNumbers (double numberOneToAdd, double numberTwoToAdd) {
        return numberOneToAdd + numberTwoToAdd;
    }

    public static double giveMeSubtractionOfNumbers (double numberOneToSubtraction, double numberTwoToSubtraction) {
        return numberOneToSubtraction - numberTwoToSubtraction;
    }

    public static double giveMeMultiplyOfNumbers (double numberOneToMultiply, double numberTwoToMultiply) {
        return numberOneToMultiply * numberTwoToMultiply;
    }

    public static double giveMeDivideOfNumbers (double numberOneToDivide, double numberTwoToDivide) {
        return numberOneToDivide / numberTwoToDivide;
    }

    public static double giveMeSquareRootOfNumbers (double numberOneToSquareRoot) {
        return (Math.sqrt(numberOneToSquareRoot));
    }

    public static double giveMeNthSquareOfNumbers (double numberOneToNthSquare, double numberTwoToNthSquare) {
        return Math.pow(numberTwoToNthSquare, 1 / numberOneToNthSquare);
    }

    public static double giveMeLogarithmOfNumbers (double numberOneToLogarithm) {
        return Math.log(numberOneToLogarithm) / Math.log(2);
    }

    public static void printMeScore (double score) {
        System.out.println("Wynik operacji to: " + score);
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

            switch (inputFromUser) {
                case "e" -> System.out.println("Dziękuję za skorzystanie z programu. Do widzenia");
                case "1" -> {
                    System.out.println("Prosze o podanie pierwszego skladnika");
                    double number1Addition = giveMeNumber();
                    System.out.println("Prosze o podanie drugiego skladnika");
                    double number2Addition = giveMeNumber();
                    double resultOfAddition = giveMeAdditionOfNumbers(number1Addition, number2Addition);
                    printMeScore(resultOfAddition);
                }
                case "2" -> {
                    System.out.println("Prosze o podanie odjemnej");
                    double number1Subtraction = giveMeNumber();
                    System.out.println("Prosze o podanie odjemnika");
                    double number2Subtraction = giveMeNumber();
                    double resultOfSubtraction = giveMeSubtractionOfNumbers(number1Subtraction, number2Subtraction);
                    printMeScore(resultOfSubtraction);
                }
                case "3" -> {
                    System.out.println("Prosze o podanie pierwszego czynnika");
                    double number1Multiply = giveMeNumber();
                    System.out.println("Prosze o podanie drugiego czynnika");
                    double number2Multiply = giveMeNumber();
                    double resultOfMultiply = giveMeMultiplyOfNumbers(number1Multiply, number2Multiply);
                    printMeScore(resultOfMultiply);
                }
                case "4" -> {
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
                    double resultOfDivide = giveMeDivideOfNumbers(number1Divide, number2Divide);
                    printMeScore(resultOfDivide);
                }
                case "5" -> {
                    System.out.println("Prosze o podanie zmiennej");
                    double number1SquareRoot = -1;
                    while (number1SquareRoot < 0) {
                        number1SquareRoot = giveMeNumber();
                        if (number1SquareRoot < 0) {
                            System.out.println("Nie mozesz pierwiastkować liczb ujemnych");
                        }
                    }
                    double resultOfSquareRoot = giveMeSquareRootOfNumbers(number1SquareRoot);
                    printMeScore(resultOfSquareRoot);
                }
                case "6" -> {
                    System.out.println("Prosze o podanie stopnia pierwiastka");
                    double number1NthSquare = giveMeNumber();
                    System.out.println("Prosze o podanie zmiennej");
                    double number2NthSquare = giveMeNumber();
                    double resultOfNthSquare = giveMeNthSquareOfNumbers(number1NthSquare, number2NthSquare);
                    printMeScore(resultOfNthSquare);
                }
                case "7" -> {
                    System.out.println("Prosze o podanie zmiennej");
                    double number1Logarithm = -1;
                    while (number1Logarithm < 0) {
                        number1Logarithm = giveMeNumber();
                        if (number1Logarithm < 0) {
                            System.out.println("Podstawa logarytmu nie moze byc liczba ujemna");
                        }
                    }
                    double resultOfLogarithm = giveMeLogarithmOfNumbers(number1Logarithm);
                    printMeScore(resultOfLogarithm);
                }
                default -> System.out.println("Niepoprawna operacja");
            }
        }
    }
}