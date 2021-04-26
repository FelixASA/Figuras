import java.awt.*;
import java.util.*;

public class Figuras {

        private Square[] cuadrados;
        private Circle[] circulos;
        private Triangle[] triangulos;
        private Trapecio[] trapecios;

        public Figuras(){
            cuadrados=new Square[100];
            circulos=new Circle[100];
            triangulos=new Triangle[100];
            trapecios=new Trapecio[100];
        }

        public Square cuadradoRandom(){
            int posX=(int) (Math.random() * 750);
            int posY=(int) (Math.random() * 750);
            int size=(int) (Math.random() * 50 + 1);
            String color=colorRandom();
            Square cuadrado=new Square(size, posX, posY,color);
            return cuadrado;
        }

        public Circle circuloRandom(){
            int diametro=(int) (Math.random() * 50);
            int posX=(int) (Math.random() * 750);
            int posY=(int) (Math.random() * 750);
            String color=colorRandom();
            Circle circulo=new Circle(diametro, posX, posY, color);
            return circulo;
        }

        public Triangle trianguloRandom(){
            int posX=(int) (Math.random() * 750);
            int posY=(int) (Math.random() * 750);
            int altura=(int) (Math.random() * 50);
            int base=(int) (Math.random() * 50);
            String color=colorRandom();
            Triangle triangulo=new Triangle(altura,base, posX, posY, color);
            return triangulo;
        }

        public Trapecio trapecioRandom(){
            int posX=(int) (Math.random() * 750);
            int posY=(int) (Math.random() * 750);
            int altura=(int) (Math.random() * 50 + 1);
            int base=(int) (Math.random() * 40 + 1);
            String color=colorRandom();
            Trapecio trapecio=new Trapecio(base,altura, posX, posY, color);
            return trapecio;
        }

        public String colorRandom(){
            String color;
            int codigo=(int) (Math.random() * 7 + 1);
            switch(codigo){
                case 1: color="red";
                    break;
                case 2: color="black";
                    break;
                case 3: color="blue";
                    break;
                case 4: color="yellow";
                    break;
                case 5: color="green";
                    break;
                case 6: color="magenta";
                    break;
                case 7: color="orange";
                    break;
                default:color="black";
                    break;
            }
            return color;
        }

        public void crearFiguras(){
            for(int i=0;i<20;i++){
                cuadrados[i]=cuadradoRandom();
                circulos[i]=circuloRandom();
                trapecios[i]=trapecioRandom();
                triangulos[i]=trianguloRandom();
            }
        }

        public void mostrarFiguras(){
            for(int i=0;i<20;i++){
                cuadrados[i].makeVisible();
                circulos[i].makeVisible();
                trapecios[i].makeVisible();
                triangulos[i].makeVisible();
            }
        }
    }

