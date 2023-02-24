package Products;

import java.util.ArrayList;

public class Products {

    ArrayList<String> cards = new ArrayList<>();
    ArrayList<String> saveAccount = new ArrayList<>();
    ArrayList<String> currentAccount = new ArrayList<>();
    ArrayList<String> credit = new ArrayList<>();
    public void cards(){
        cards.add("""
                Tipo de tarjeta
                *Mastercard
                
                Caracteristicas
                * Ingresos a partir de 1 millon
                * cuota de manejo de $26.600
                * Cupo entre 1 y 5 millones
                * 6 meses sin cuota de manejo
                
                Beneficios
                *Cobertura de viajes
                *Ofertas y descuentos
                *Pago sin contacto
                *Avance del 100%
                
                Politicas
                * Intereses de 3.12% mensual y 45.16% anual
                * Las compras a una cuota no generaran intereses
                * Las compras interacionales se diferiran a 36 cuotas
                * Los avances nacionales e internacionse difieren a 24 cuotas
                """);
        cards.add("""
                Tipo de tarjeta
                * Visa
                
                Caracteristicas
                * Ingresos a partir de 1 millon
                * cuota de manejo de $26.600
                * Cupo entre 1 y 5 millones
                * 6 meses sin cuota de manejo
                
                Beneficios
                *Cobertura de viajes
                *Ofertas y descuentos
                *Pago sin contacto
                *Desembolso de emergencia""\"
                
                Politicas
                * Intereses de 3.12% mensual y 45.16% anual
                * Las compras a una cuota no generaran intereses
                * Las compras interacionales se diferiran a 36 cuotas
                * Los avances nacionales e internacionse difieren a 24 cuotas
                """);
        cards.add("""
                Tipo de tarjeta
                *American Express
                
                Caracteristicas
                * Ingresos a partir de 1 millon
                * cuota de manejo de $26.600
                * Cupo entre 1 y 5 millones
                * 6 meses sin cuota de manejo
                
                Beneficios
                *2x1 en Cinemark
                *Ofertas y descuentos
                *Pago sin contacto
                *Avance del 100%
                
                Politicas
                * Intereses de 3.12% mensual y 45.16% anual
                * Las compras a una cuota no generaran intereses
                * Las compras interacionales se diferiran a 36 cuotas
                * Los avances nacionales e internacionse difieren a 24 cuotas
                """);

    }
    public void saveAccount(){
        saveAccount.add("""
                Caracteristicas
                * Monto de apertura $0
                * Saldo minimo $0
                * Tarjeta debito Mastercard
                * Cuota de manejo $12.990
                
                Beneficios
                * Rendimineto del 0.05% E.A
                * Exencion de impuesto 4*1000
                
                Politicas
                * Retención en la fuente del 7%
                * Cancelación en cualquier momento
                """);
    }
    public void currentAccount(){
        currentAccount.add("""
                Caracteristicas
                * Monto de apertura $0
                * Saldo minimo $0
                * Tarjeta debito Mastercard
                
                Beneficios
                * Sobregiro de cupo
                * Pago de facturas
                * Retiro ilimitados
                * Manejo de cheques
                
                Politicas
                * Solicitud de certificado de ingresos
                * Certificado de declaración de renta
                """);
    }
    public void credit(){
        credit.add("""
                Monto
                * Se establece de acuerdo a la capacidad de endeudamiento
                
                Caracteristicas
                * Desembolso desde 1 millon
                * Plazos entre 48 y 60 meses para tasa fija
                * Plazos entre 60 y 84 meses para tasa variable
                
                Politicas
                * Puede cancelar el valor total del credito en cualquier momento
                * Los retrasos en las cuotas generaran intereses adicionales
                * Interese desde 2.03% hasta 3.16% mes vencido
                * Interese desde 27.2% hasta 45.2% E.A
                """);
    }
}
