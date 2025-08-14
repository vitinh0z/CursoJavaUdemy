public class Moedas {

    private int escolhaMoeda;
    private double moeda;
    private double moedaConvertida;



    public void setEscolhaMoeda(int escolhaMoeda){
        this.escolhaMoeda = escolhaMoeda;
    }

    public  int getEscolhaMoeda (){
        return escolhaMoeda;
    }


    public void setMoeda (double moeda){
        this.moeda = moeda;
    }

    public double getMoeda () {
        return moeda;
    }

    public void Converter () {
        double valorDolar = 5.41;
        double valorIene = 0.037;
        double valorLibra = 7.32;
        double valorEuro = 6.31;

        switch (getEscolhaMoeda()) {
            case 1:
                this.moedaConvertida = getMoeda() * valorDolar;
                break;
            case 2:
                this.moedaConvertida = getMoeda() * valorIene;
                break;
            case 3:
                this.moedaConvertida = getMoeda() * valorLibra;
                break;
            case 4:
                this.moedaConvertida = getMoeda() * valorEuro;
                break;

            default:
                System.out.println("Opção Invalida. Tente Novamente");
                break;
        }

    


    }

    public double getConvertida (){
        return moedaConvertida;
    }

    public String toString (){
        return String.format("O valor de %.2f fica %f em %d", getMoeda(), getEscolhaMoeda(), Converter() );
    }


}
