
package Area;


public class rectangulo {
   private int base, altura, area;
    
   public rectangulo(int base,int altura){
       this.base = base;
       this.altura = altura;
    
   }
    
    public void CalculoArea(){
        area = base * altura;
           
    }
    
    public void Imprimir(){
        CalculoArea();
        System.out.println("El área es:" + area);
    
    }
    
    
    
}
