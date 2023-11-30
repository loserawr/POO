public class horalista extends funcionario { // herdando a classe "funcionario"
    private double salarioHora;
    private int horasTrab;
    private double valorHora;

// Metodos Getters and Setter do Horalista
public double getSalarioHora() {
    return salarioHora;
}

public void setSalarioHora(double salarioHora) {
    this.salarioHora = salarioHora;
}

public int getHorasTrab() {
    return horasTrab;
}

public void setHorasTrab(int horasTrab) {
    this.horasTrab = horasTrab;
}

public double getValorHora() {
    return valorHora;
}

public void setValorHora(double valorHora) {
    this.valorHora = valorHora;
}

public double calculoHora() { //metodo exclusivo para calcular o salario do funcinario horalista com base nas horas trabalhadas, usando 25 reais como valor da hora
    valorHora = 12;
    return salarioHora = getHorasTrab() * (valorHora);
    
}
// Metodo herdado que será utilizado para poliformismo
    @Override
    public String realizarTarefa() {

        return ("Bom trabalho, Horalista :)");
    }
}
