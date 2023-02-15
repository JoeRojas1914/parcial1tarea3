public class Main {

    //hola
    public static void main(String[] args) {

        int operationIndex = 0;
        do {
            String operation = args[operationIndex];
            int operandoIzquierdo = Integer.parseInt(args[operationIndex + 1]);
            int operandoDerecho = Integer.parseInt(args[operationIndex + 2]);


            switch (operation) {
                case "SUMA" ->
                        System.out.println(operandoIzquierdo + " + " + operandoDerecho + " = " + (operandoIzquierdo + operandoDerecho));
                case "RESTA" ->
                        System.out.println(operandoIzquierdo + " - " + operandoDerecho + " = " + (operandoIzquierdo - operandoDerecho));
                case "MULTIPLICACION" ->
                        System.out.println(operandoIzquierdo + " * " + operandoDerecho + " = " + (operandoIzquierdo * operandoDerecho));
                case "DIVISION" ->
                        System.out.println(operandoIzquierdo + " / " + operandoDerecho + " = " + (operandoIzquierdo / operandoDerecho));
            }

            operationIndex += 3;
        }while(operationIndex < args.length);
    }
}