import java.awt.*;
import java.util.*;

public class Figuras {

    private Square[] cuadrados;
    private Circle[] circulos;
    private Triangle[] triangulos;
    private Trapecio[] trapecios;
    private Rectangulo[] rectangulos;

    public Figuras() {
        cuadrados = new Square[20];
        circulos = new Circle[20];
        triangulos = new Triangle[20];
        trapecios = new Trapecio[20];
        rectangulos = new Rectangulo[20];
    }

    public Square cuadradoRandom() {
        int posX = (int) (Math.random() * 750);
        int posY = (int) (Math.random() * 500);
        int size = (int) (Math.random() * 50 + 5);
        String color = colorRandom();
        Square cuadrado = new Square(size, posX, posY, color);
        return cuadrado;
    }

    public Circle circuloRandom() {
        int diametro = (int) (Math.random() * 50 + 5);
        int posX = (int) (Math.random() * 750);
        int posY = (int) (Math.random() * 500);
        String color = colorRandom();
        Circle circulo = new Circle(diametro, posX, posY, color);
        return circulo;
    }

    public Triangle trianguloRandom() {
        int posX = (int) (Math.random() * 750);
        int posY = (int) (Math.random() * 500);
        int altura = (int) (Math.random() * 50 + 5);
        int base = (int) (Math.random() * 50 + 5);
        String color = colorRandom();
        Triangle triangulo = new Triangle(altura, base, posX, posY, color);
        return triangulo;
    }

    public Trapecio trapecioRandom() {
        int posX = (int) (Math.random() * 750);
        int posY = (int) (Math.random() * 500);
        int altura = (int) (Math.random() * 50 + 5);
        int base = (int) (Math.random() * 40 + 5);
        String color = colorRandom();
        Trapecio trapecio = new Trapecio(base, altura, posX, posY, color);
        return trapecio;
    }
     public Rectangulo rectanguloRandom(){
         int posX = (int) (Math.random() * 750);
         int posY = (int) (Math.random() * 500);
         int altura = (int) (Math.random() * 50 + 5);
         int base = (int) (Math.random() * 100 + 5);
         String color = colorRandom();
         Rectangulo rectangulo = new Rectangulo(altura,base, posX, posY, color);
         return rectangulo;
     }

    public String colorRandom() {
        String color;
        int codigo = (int) (Math.random() * 7 + 1);
        switch (codigo) {
            case 1:
                color = "red";
                break;
            case 2:
                color = "black";
                break;
            case 3:
                color = "blue";
                break;
            case 4:
                color = "yellow";
                break;
            case 5:
                color = "green";
                break;
            case 6:
                color = "magenta";
                break;
            case 7:
                color = "orange";
                break;
            default:
                color = "black";
                break;
        }
        return color;
    }

    public void crearFiguras() {
        for (int i = 0; i < 20; i++) {
            cuadrados[i] = cuadradoRandom();
            cuadrados[i].makeVisible();
            circulos[i] = circuloRandom();
            circulos[i].makeVisible();
            trapecios[i] = trapecioRandom();
            trapecios[i].makeVisible();
            triangulos[i] = trianguloRandom();
            triangulos[i].makeVisible();
            rectangulos[i]= rectanguloRandom();
            rectangulos[i].makeVisible();
        }
    }

    public void crearCuadrados() {
        for (int i = 0; i < 20; i++) {
            cuadrados[i] = cuadradoRandom();
            cuadrados[i].makeVisible();
        }
    }

    public void crearCirculos() {
        for (int i = 0; i < 20; i++) {
            circulos[i] = circuloRandom();
            circulos[i].makeVisible();
        }
    }

    public void crearTrapecios() {
        for (int i = 0; i < 20; i++) {
            trapecios[i] = trapecioRandom();
            trapecios[i].makeVisible();
        }
    }

    public void crearTriangulos() {
        for (int i = 0; i < 20; i++) {
            triangulos[i] = trianguloRandom();
            triangulos[i].makeVisible();
        }
    }

    public void crearRectangulos() {
        for (int i = 0; i < 20; i++) {
            rectangulos[i] = rectanguloRandom();
            rectangulos[i].makeVisible();

        }
    }

    public void mostrarFiguras() {
        for (int i = 0; i < 20; i++) {
            cuadrados[i].makeVisible();
            circulos[i].makeVisible();
            trapecios[i].makeVisible();
            triangulos[i].makeVisible();
            rectangulos[i].makeVisible();
        }
    }

    public void limpiar(int c) {
        for(int i=0;i<20;i++){
            switch(c) {
                case 0: limpiarTodo();
                    break;
                case 1: circulos[i].erase();
                    break;
                case 2: triangulos[i].erase();
                    break;
                case 3: cuadrados[i].erase();
                    break;
                case 4: rectangulos[i].erase();
                    break;
                case 5: trapecios[i].erase();
                    break;
            }

        }

    }
    public void limpiarTodo() {
        for (int i = 0; i < 20; i++) {
            cuadrados[i].erase();
            circulos[i].erase();
            trapecios[i].erase();
            triangulos[i].erase();
            rectangulos[i].erase();
        }
    }
    public void cambiarColor(int c,String color) {
        if(color.equals("M") || color.equals("N") ) {
            for (int i = 0; i < 20; i++) {
                switch (c) {
                    case 0:
                        colorTodo(color);
                        break;
                    case 1:
                        circulos[i].changeColor(color);
                        break;
                    case 2:
                        triangulos[i].changeColor(color);
                        break;
                    case 3:
                        cuadrados[i].changeColor(color);
                        break;
                    case 4:
                        rectangulos[i].changeColor(color);
                        break;
                    case 5:
                        trapecios[i].changeColor(color);
                        break;
                }
            }
        }
    }
        public void colorTodo(String color) {
            for (int i = 0; i < 20; i++) {
                cuadrados[i].changeColor(color);
                circulos[i].changeColor(color);
                trapecios[i].changeColor(color);
                triangulos[i].changeColor(color);
                rectangulos[i].changeColor(color);
            }
        }

}


