import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the command (a + b)");
        String data = scanner.nextLine();
        System.out.println(calc(data));


    }
    public static String calc (String input) throws Exception{
        int answer = 0;
        String [] inputInArray = input.split(" ");
        int a = Integer.valueOf(inputInArray[0]);
        int b = Integer.valueOf(inputInArray[2]);
        if (a < 0 || a > 10 ){
            throw new Exception();
        }

        switch (inputInArray[1]){
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
            case "/":
                answer = a / b;
                break;
        }

        return String.valueOf(answer);


    }
}