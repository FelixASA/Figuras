import java.util.*;

public class main {
    public static void main(String[] args) {
        int c = 0;
        String color = "", o = "";
        while (!o.equals("F")) {
            Figuras figuras = new Figuras();
            if (o.equals("M")) {
                color = "magenta";
                figuras.cambiarColor(c, color);
                o=opcion(o);
            } else if (o.equals("N")) {
                color = "orange";
                figuras.cambiarColor(c, color);
                o=opcion(o);
            } else {
                switch (c) {
                    case 0:
                        figuras.crearFiguras();
                        break;
                    case 1:
                        figuras.crearCirculos();
                        break;
                    case 2:
                        figuras.crearTriangulos();
                        break;
                    case 3:
                        figuras.crearCuadrados();
                        break;
                    case 4:
                        figuras.crearRectangulos();
                        break;
                    case 5:
                        figuras.crearTrapecios();
                        break;
                }
                o=opcion(o);
                figuras.limpiar(c);
            }
            if (o.equals("A")) c = c + 1;
            else if (o.equals("R")) c = c - 1;
            if (c == 6) c = 0;
            else if (c == -1) c = 5;
        }
    }

    public static String opcion(String o) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una opcion: ");
        o = sc.nextLine();
        return o;
    }
}