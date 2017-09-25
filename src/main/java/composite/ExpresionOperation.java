package composite;

import java.util.List;


public abstract class ExpresionOperation extends Expresion {
    
    public int x;
    public int y;
    private List<Expresion> lista;
    
    public abstract int operacion();
    
    public void add(Expresion expresion){
        this.lista.add(expresion);
    }

    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    

}
