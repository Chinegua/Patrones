package composite;

public class ExpresionValor extends Expresion{
    
    int value;
    
    public ExpresionValor(int value){
        this.value = value;
    }
    
    public int operacion(){
        return this.value;
    }

}
