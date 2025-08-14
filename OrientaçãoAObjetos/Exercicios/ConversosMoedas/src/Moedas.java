public class Moedas {

    private int escolhaMoeda;
    private double moeda;
    private double moedaConvertida;
    private String nomeMoeda;



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


    public String getNomeMoeda () {
        return nomeMoeda;
    }




    public void Converter () {
        double valorDolar = 5.42;
        double valorIene = 0.037;
        double valorLibra = 7.32;
        double valorEuro = 6.31;

        switch (getEscolhaMoeda()) {
            case 1:
                this.moedaConvertida = getMoeda() / valorDolar;
                this.nomeMoeda = "Dolar(USD)";
                break;
            case 2:
                this.moedaConvertida = getMoeda() / valorIene;
                this.nomeMoeda = "EURO(EUR)";
                break;
            case 3:
                this.moedaConvertida = getMoeda() / valorLibra;
                this.nomeMoeda = "LIBRA(GBP)";
                break;
            case 4:
                this.moedaConvertida = getMoeda() / valorEuro;
                this.nomeMoeda = "IENE(JPY)";
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
        return String.format("O valor de %f fica %f em %s", getMoeda(),getConvertida(),getNomeMoeda());
    }


}
