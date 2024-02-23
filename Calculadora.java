public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Ingrese dos números: ");
        int num1 = Integer.parseInt(System.console().readLine());
        int num2 = Integer.parseInt(System.console().readLine());
        
        
        int suma = Suma.sumar(num1, num2);
        int resta = Resta.restar(num1, num2);
        int multiplicacion =Multiplicacion.multiplicar(num1,num2);
        double division = Division.dividir(num1, num2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
