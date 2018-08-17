







import java.util.Scanner;

class Casa
{
    Triangle Techo;
    Square Casa;
    Square Ventana;
    Circle Sol;
    
    void dibujate()
    {
        Techo = new Triangle();
        Ventana = new Square();
        Casa = new Square();
        Sol = new Circle();
        
       
        System.out.print("Para mover a la izquierda o hacia arriba, tiene que llevar el signo -.");
        
        Sol.makeVisible();
        Sol.moveHorizontal(100);
        Sol.moveVertical(-40);
        Sol.changeColor("yellow");
        Sol.changeSize(85);
        
        Techo.makeVisible();
        Techo.moveVertical(-85);
        Techo.changeSize(85,180);
        
        Casa.makeVisible();
        Casa.changeSize(170);
        Casa.moveVertical(20);
        Casa.moveHorizontal(-185); 
        
        Ventana.makeVisible();
        Ventana.changeColor("black");
        Ventana.moveHorizontal(-150);
        Ventana.moveVertical(50);
        
    }
    void mueveteDerecha(int x)
    {
        
        Techo.moveHorizontal(x);
        Casa.moveHorizontal(x);
        Ventana.moveHorizontal(x);
        
    }
    void mueveteIzquierda(int x)
    {
       
        Techo.moveHorizontal(x);
        Casa.moveHorizontal(x);
        Ventana.moveHorizontal(x);
    }
    void mueveteArriba(int y)
    {
        
        Techo.moveVertical(y);
        Casa.moveVertical(y);
        Ventana.moveVertical(y);
    }
    void mueveteAbajo(int y)
    {
        
        Techo.moveVertical(y);
        Casa.moveVertical(y);
        Ventana.moveVertical(y);
    }
}
