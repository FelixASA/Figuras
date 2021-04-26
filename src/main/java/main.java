import java.util.*;

public class main {
    public static void main(String[] args) {
        int c = 0;
        String color = "", o = "";
        Figuras figuras = new Figuras();
        while (!o.equals("F")) {
            if (o.equals("M")) {
                color = "magenta";
                figuras.cambiarColor(c, color);
            } else if (o.equals("N")) {
                color = "orange";
                figuras.cambiarColor(c, color);
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
            }
            o=opcion(o);
            if(o.equals("A") || o.equals("R") || o.equals("G")) {
                figuras.limpiar(c);
                figuras = new Figuras();
            }
            if (o.equals("A")) c = c + 1;
            else if (o.equals("R")) c = c - 1;
            if (c == 6) c = 0;
            else if (c == -1) c = 5;
        }
        System.exit(0);
    }

    public static String opcion(String o) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una opcion: ");
        o = sc.nextLine();
        return o;
    }
}