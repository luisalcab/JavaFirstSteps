
public class TestDescuento {
	
	public static void main(String[] args) {

        double valorCompra = 250.0;
        
        boolean esDescuento10 = valorCompra >= 100.0 && valorCompra < 200.0;
        boolean esDescuento15 = valorCompra >= 200.0 && valorCompra < 300.0;
        boolean esDecuento20 = valorCompra >= 300.0;
        
        double descuento = 0;
      
        if (esDescuento10) {
        	descuento = 10.0;
        } else if (esDescuento15) {
        	descuento = 15.0;
        } else if (esDecuento20) {
        	descuento = 20.0;
        }
        
        double valorCompraDescuento = valorCompra - (valorCompra * (descuento / 100));
        
        System.out.println("Subtotal: " + valorCompra);
        System.out.println("Promo: " + descuento + "% descuento");
        System.out.println("El precio con descuento es: " + valorCompraDescuento);

    }

}
