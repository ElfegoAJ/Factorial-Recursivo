
public class mainFactorial {

    public static void main(String[] args) {
        mainFactorial objFac = new mainFactorial();
        System.out.println("Factorial de 4 mediante recursivo es: " + objFac.factorialRecursivo(4));
        System.out.println("Factorial de 4 mediante ciclo es: " +  objFac.factorialCiclo(4));
    }
    
    //Creando el metodo factorial de manera recursiva
    public int factorialRecursivo(int n){
        if (n<0) {
            return 0;
        }else if(n==0){
            //caso base
            return 1;
        }else{
            //Dominio (problema - 1)
            return n * factorialRecursivo(n-1);
        }
    }
    
    //Creando metodo factorial mediante ciclo
    public int factorialCiclo(int n){
        int factor = 1;
        if (n<0) {
            return  0;
        }else{
            while(n!=0){
                factor = n*factor;
                n--;
            }
            return factor;
        }
    }

}
