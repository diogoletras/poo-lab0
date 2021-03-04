
/**
 * Write a description of class AppStart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppStart
{
    public static void main(String[] args) {
        int ordem = 1;
                
        Size size_medium;
        
        size_medium = Size.MEDIUM;
        
        System.out.print("Name : ");
        System.out.println("toString() : " + size_medium.toString());
        System.out.println("Ordem : " + ordem);
        System.out.println("Valor minimo : " + size_medium.getMinValue());
        System.out.println("Valor maximo : " + size_medium.getMaxValue());
        System.out.println("Codigo : " + size_medium.getCode());
    }
}
