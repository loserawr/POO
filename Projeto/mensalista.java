public class mensalista extends horalista{ // Herdando a classe "horalista" que está herdando a classe "funcionario"
    private double salarioMes = 3000; // Salario fixo por mês, quanta ganha será com base nos dias trabalhados(Exemplo: 30 dias = 100% / 15 dias = 50%)
    private int diasTrab;
    private double calcSal;

// Metodos Getters and Setter do Mensalista
   public double getCalcSal() {
        return calcSal;
    }


    public void setCalcSal(double calcSal) {
        this.calcSal = calcSal;
    }


public int getDiasTrab() {
        return diasTrab;
    }


    public void setDiasTrab(int diasTrab) {
        this.diasTrab = diasTrab;
    }


public double getSalarioMes() {
        return salarioMes;
    }


    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }

public double calcMess(){ // Metodo exclusivo para calcular o salario do mensalista com base nos dias trabalhados no mês
    calcSal = (salarioMes) / 30;
    calcSal = (calcSal) * (getDiasTrab());
    return calcSal;

}
// Metodo herdado que será utilizado para poliformismo
@Override
   public String realizarTarefa() {

    return ("Bom trabalho, Mensalista :)");
}
    
    
}
