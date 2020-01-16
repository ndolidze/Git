import java.util.Scanner;
public class Lecture1b {
    public static void main(String[] args) {
        Shape a=new Shape();
        Scanner obj=new Scanner(System.in);
        System.out.println("shemoitanet shape is sigane");
        a.setWidth(obj.nextDouble());
        System.out.println("Shemoitaanet shape is sigrdze");
        a.setHeight(obj.nextDouble());
        a.print();;

    }
}