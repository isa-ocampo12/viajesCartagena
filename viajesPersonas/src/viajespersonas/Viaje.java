
package viajespersonas;

public class Viaje  
{

    public Viaje(int CantidadPersonas, float ValorPorPersona) {
        this.CantidadPersonas = CantidadPersonas; //this = para diferenciar que es variable de la clase a la que se refiere
        this.ValorPorPersona = ValorPorPersona;
    }
    
    public int CantidadPersonas;
    public float ValorPorPersona;
    
    public float CalcularValorBruto()
    {
        float valorBruto = CantidadPersonas * ValorPorPersona;
        return valorBruto;
    }
    
    public double CalcularValorIva()
    {
       
       double iva = 0.19 * CalcularValorBruto();
        return iva;
    }
    public double CalcularPorcentajeDescuento()
    {
        if(CantidadPersonas <= 5 )
        {
            return 0;
        }
        else if(CantidadPersonas >=6 && CantidadPersonas <=10)
        {
            return 0.1;
        }
        else
        {
            return 0.2;
        }
    }
    
    public double CalcularValorDescuento()
    {
        return (ValorBrutoMasIva()) * (CalcularPorcentajeDescuento());
    }
    
    public double ValorBrutoMasIva()
    {
        return (CalcularValorBruto() + CalcularValorIva());
    }
    
    public double ValorNeto()
    {
        return (ValorBrutoMasIva()) * (1 - CalcularPorcentajeDescuento());
    }
    
    public boolean TieneDescuento()
    {
        return CalcularPorcentajeDescuento() != 0;
    }

}
