//Leer la cantidad de personas que viajan, el valor por persona que viajan a Cartagena y luego imprimir:
//Valor bruto del viaje
//Valor del IVA (19%)
//Descuento: si viajan hasta 5 personas no hay descuento, si viajan entre 6 y 10 personas 
//el descuento es del 10% sobre el valor bruto y si viajan más de 11 personas es del 20% sobre el valor bruto.
//Valor neto del viaje
//Utilizar clases y funciones

package viajespersonas;
import java.util.Scanner;
public class ViajesPersonas 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int cantidadPersonas;
        float valorPorPersona;
        
        System.out.print("Ingrese cantidad de personas: ");
        cantidadPersonas = teclado.nextInt();
        System.out.print("Ingrese valor por persona: ");
        valorPorPersona = teclado.nextFloat();
        
        Viaje viaje = new Viaje(cantidadPersonas, valorPorPersona);
        System.out.println("El valor bruto es: " + viaje.CalcularValorBruto());
        System.out.println("El valor bruto con el 19% del IVA es: " + viaje.ValorBrutoMasIva());
        
        if(viaje.TieneDescuento())
        {
            System.out.println("El porcentaje de descuento es: " + viaje.CalcularPorcentajeDescuento()); 
            System.out.println("El valor de descuento es: " + viaje.CalcularValorDescuento());
        }else
        {
            System.out.println("no tiene descuento");             
        }
 
        System.out.println("El valor de neto es: " + viaje.ValorNeto()); 


        
        
    
        
        
                
        
    }
    
    
}
