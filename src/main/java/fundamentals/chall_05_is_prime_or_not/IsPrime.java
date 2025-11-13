package fundamentals.chall_05_is_prime_or_not;

/*Crea un programa en Java que determine si un número ingresado es primo o no primo.
Requisitos:
Debe haber una clase POJO para almacenar la respuesta ("es primo" o "no es primo").
Implementa una clase Calculadora con un método para verificar si un número es primo.
Usa un método que devuelva un objeto de la clase POJO con la respuesta.
🔹 Ejemplo de entrada: Calculadora.respuesta(7).imprimir();
🔹 Salida esperada: es primo
¡Inténtalo! */

class POJO1{
    String respuesta;
    public POJO1(String respuesta){
        this.respuesta=respuesta;
    }

    public void imprimeRespuesta(){
        System.out.println(respuesta);
    }
}

class Calculator{
    private int number;
    public Calculator(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }

    public POJO1 isPrimeOrNot(int num){
        String response = "";
        for(int i=2;i<num;i++){
            if(num%i==0){
                response= "no es primo";
                break;
            }
            if(num%i!=0){
                response="si es primo";
            }
        }
        return new POJO1(response);
    }
}

public class IsPrime {
    public static void main(String[] args){
        int value =4;
        Calculator calculator = new Calculator(value);
        calculator.isPrimeOrNot(value).imprimeRespuesta();


    }
}