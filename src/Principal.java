import java.util.Scanner;

public class Principal {
     static String resultado="";
     String palabra;
    public void principal(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa una palabra");
         palabra=scanner.nextLine();
        cifrado(palabra);
    }
    public void cifrado(String palabra){
        String alfabeto="ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";
        String rot13="NOPQRSTUVWXYZAÑBCDEFGHIJKLMnopqrstuvwxyzañbcdefghijklm";
        for (int i=0;i <palabra.length();i++){
            char letra=palabra.charAt(i);
            int principio=alfabeto.indexOf(letra);
            if (principio!=-1){
                resultado+=rot13.charAt(principio);
            }
            else {
                resultado+=letra;
            }
        }
    }
    public void mostrar(){
        System.out.println(palabra);
        System.out.println(resultado);
    }
}
