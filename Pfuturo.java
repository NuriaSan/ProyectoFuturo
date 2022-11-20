// Realizado por Nuria Sánchez
public class Pfuturo {
    private String valor1;
    private String valor2;

    public Pfuturo (){}
    static String veredicto(String valor1, String valor2){
        if (valor1.equals(valor2)) {
                System.out.println ("Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.");
        } else if (Integer.parseInt(valor1)>Integer.parseInt(valor2)) {System.out.println ("Poco tiempo de estudio. Debes dedicar más tiempo.");
        }else System.out.println("Ideal. Trabajas los contenidos en casa.");
        return"";

    }
}
