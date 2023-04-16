package Clase8_Herencia_Descuentos;

public class DescuentoPorcentual extends Descuento {

    @Override
    public Double valorFinal(Double valorInicial) {
        return valorInicial - (valorInicial * super.valor);
    }
    public void metodoB() {

    }
}
