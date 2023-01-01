import java.util.Scanner;
public class Main {
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
                String inputAdditionFirstNumber;
                do {
                    inputAdditionFirstNumber = scanner.nextLine();
                    if (!inputAdditionFirstNumber.matches("[0-9.]+")) {
                        System.out.println("Podana wartość nie jest liczbą, proszę wpisać poprawną wartość");
                    }
                }
                while (!inputAdditionFirstNumber.matches("[0-9.]+"));
                Double inputAdditionFirstDouble = Double.parseDouble(inputAdditionFirstNumber);
                System.out.println("Prosze o podanie drugiego skladnika");
                String inputAdditionSecondNumber;
                do {
                    inputAdditionSecondNumber = scanner.nextLine();
                    if (!inputAdditionSecondNumber.matches("[0-9.]+")) {
                        System.out.println("Podana wartość nie jest liczbą, proszę wpisać poprawną wartość");
                    }
                }
                while (!inputAdditionSecondNumber.matches("[0-9.]+"));
                Double inputAdditionSecondDouble = Double.parseDouble(inputAdditionSecondNumber);
                double ResultOfAddition = inputAdditionFirstDouble + inputAdditionSecondDouble;
                System.out.println("Wynik operacji to: " + ResultOfAddition);
            } else if (inputFromUser.equals("2")) {
                System.out.println("Prosze o podanie odjemnej");
                String inputSubstractionFirstNumber;
                do {
                    inputSubstractionFirstNumber = scanner.nextLine();
                    if (!inputSubstractionFirstNumber.matches("[0-9.]+")) {
                        System.out.println("Podana wartość nie jest liczbą, proszę wpisać poprawną wartość");
                    }
                }
                while (!inputSubstractionFirstNumber.matches("[0-9.]+"));
                Double inputSubstractionFirstDouble = Double.parseDouble(inputSubstractionFirstNumber);
                System.out.println("Prosze o podanie odjemnika");
                String inputSubstractionSecondNumber;
                do {
                    inputSubstractionSecondNumber = scanner.nextLine();
                    if (!inputSubstractionSecondNumber.matches("[0-9.]+")) {
                        System.out.println("Podana wartość nie jest liczbą, proszę wpisać poprawną wartość");
                    }
                }
                while (!inputSubstractionSecondNumber.matches("[0-9.]+"));
                Double inputSubstractionSecondDouble = Double.parseDouble(inputSubstractionSecondNumber);
                double ResultOfSubstraction = inputSubstractionFirstDouble - inputSubstractionSecondDouble;
                System.out.println("Wynik operacji to: " + ResultOfSubstraction);

            } else if (inputFromUser.equals("3")) {
                System.out.println("Prosze o podanie pierwszego czynnika");
                String inputMultiplicationFirstNumber;
                do {
                    inputMultiplicationFirstNumber = scanner.nextLine();
                    if (!inputMultiplicationFirstNumber.matches("[0-9.]+")) {
                        System.out.println("Podana wartość nie jest liczbą, proszę wpisać poprawną wartość");
                    }
                }
                while (!inputMultiplicationFirstNumber.matches("[0-9.]+"));
                Double inputMultiplicationFirstDouble = Double.parseDouble(inputMultiplicationFirstNumber);
                System.out.println("Prosze o podanie drugiego czynnika");
                String inputMultiplicationSecondNumber;
                do {
                    inputMultiplicationSecondNumber = scanner.nextLine();
                    if (!inputMultiplicationSecondNumber.matches("[0-9.]+")) {
                        System.out.println("Podana wartość nie jest liczbą, proszę wpisać poprawną wartość");
                    }
                }
                while (!inputMultiplicationSecondNumber.matches("[0-9.]+"));
                Double inputMultiplicationSecondDouble = Double.parseDouble(inputMultiplicationSecondNumber);
                double ResultOfMultiplication = inputMultiplicationFirstDouble * inputMultiplicationSecondDouble;
                System.out.println("Wynik operacji to: " + ResultOfMultiplication);

            } else if (inputFromUser.equals("4")) {
                System.out.println("Prosze o podanie dzielnej");
                String inputDivisionFirstNumber;
                do {
                    inputDivisionFirstNumber = scanner.nextLine();
                    if (!inputDivisionFirstNumber.matches("[0-9.]+")) {
                        System.out.println("Podana wartość nie jest liczbą, proszę wpisać poprawną wartość");
                    }
                }
                while (!inputDivisionFirstNumber.matches("[0-9.]+"));
                Double inputDivisionFirstDouble = Double.parseDouble(inputDivisionFirstNumber);
                System.out.println("Prosze o podanie dzielnika");
                String inputDivisionSecondNumber;
                do {
                    inputDivisionSecondNumber = scanner.nextLine();
                    if (!inputDivisionSecondNumber.matches("[0-9.]+")) {
                        System.out.println("Podana wartość nie jest liczbą, proszę wpisać poprawną wartość");
                    } else if (inputDivisionSecondNumber.equals("0")) {
                        System.out.println("Nie mozesz dzielic przez 0");
                    }
                }
                while (!inputDivisionSecondNumber.matches("[0-9.]+") || inputDivisionSecondNumber.equals("0"));
                Double inputDivisionSecondDouble = Double.parseDouble(inputDivisionSecondNumber);
                double ResultOfDivision = inputDivisionFirstDouble / inputDivisionSecondDouble;
                System.out.println("Wynik operacji to: " + ResultOfDivision);

            } else if (inputFromUser.equals("5")) {
                System.out.println("Prosze o podanie zmiennej");
                String inputSquareRootFirstNumber;
                do {
                    inputSquareRootFirstNumber = scanner.nextLine();
                    if (!inputSquareRootFirstNumber.matches("[0-9.]+")) {
                        System.out.println("Podana wartość nie jest liczbą, proszę wpisać poprawną wartość");
                    }
                }
                while (!inputSquareRootFirstNumber.matches("[0-9.]+"));
                double inputSquareRootFirstDouble = Double.parseDouble(inputSquareRootFirstNumber);
                double ResultOfSquareRoot = (Math.sqrt(inputSquareRootFirstDouble));
                System.out.println("Wynik operacji to: " + ResultOfSquareRoot);

            } else if (inputFromUser.equals("6")) {
                System.out.println("Prosze o podanie stopnia pierwiastka");
                String inputSquareNthFirstNumber;
                do {
                    inputSquareNthFirstNumber = scanner.nextLine();
                    if (!inputSquareNthFirstNumber.matches("[0-9.]+")) {
                        System.out.println("Podana wartość nie jest liczbą, proszę wpisać poprawną wartość");
                    }
                }
                while (!inputSquareNthFirstNumber.matches("[0-9.]+"));
                double inputSquareNthFirstDouble = Double.parseDouble(inputSquareNthFirstNumber);
                System.out.println("Prosze o podanie zmiennej");
                String inputSquareNthSecondNumber;
                do {
                    inputSquareNthSecondNumber = scanner.nextLine();
                    if (!inputSquareNthSecondNumber.matches("[0-9.]+")) {
                        System.out.println("Podana wartość nie jest liczbą, proszę wpisać poprawną wartość");
                    }
                }
                while (!inputSquareNthSecondNumber.matches("[0-9.]+"));
                double inputSquareNthSecondDouble = Double.parseDouble(inputSquareNthSecondNumber);
                double ResultOfSquareNth = Math.pow(inputSquareNthSecondDouble, 1 / inputSquareNthFirstDouble);
                System.out.println("Wynik operacji to: " + ResultOfSquareNth);

            } else if (inputFromUser.equals("7")) {
                System.out.println("Prosze o podanie zmiennej");
                String inputLogarithmFirstNumber;
                do {
                    inputLogarithmFirstNumber = scanner.nextLine();
                    if (!inputLogarithmFirstNumber.matches("[0-9.]+")) {
                        System.out.println("Podana wartość nie jest liczbą, proszę wpisać poprawną wartość");
                    }
                }
                while (!inputLogarithmFirstNumber.matches("[0-9.]+"));
                double inputLogarithmFirstDouble = Double.parseDouble(inputLogarithmFirstNumber);
                double ResultOfLogarithm = Math.log(inputLogarithmFirstDouble) / Math.log(2);
                System.out.println("Wynik operacji to: " + ResultOfLogarithm);
            } else {
                System.out.println("Niepoprawna operacja");
            }
        }
    }
}