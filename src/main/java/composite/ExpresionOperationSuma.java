package composite;

public class ExpresionOperationSuma extends ExpresionOperation {

    public ExpresionOperationSuma(int x, int y) {
        super.setX(x);
        super.setY(y);
    }

    public int operacion() {
        return super.getX() + super.getY();
    }

    public static void main(String[] args) {
        ExpresionValor dos = new ExpresionValor(2);
        ExpresionValor tres = new ExpresionValor(3);
        ExpresionOperationSuma suma = new ExpresionOperationSuma(dos.operacion(),tres.operacion());
        ExpresionOperationSuma suma2 = new ExpresionOperationSuma(suma.operacion(),tres.operacion());

        System.out.print(suma.operacion());
        System.out.print(suma2.operacion());

        
    }

}
