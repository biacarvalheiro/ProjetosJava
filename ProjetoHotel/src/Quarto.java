public class Quarto {
    //Atributos privados
    private String numeroQuarto;
    private String nomeHospede;
    private String tipoQuarto;
    private double valorConsumo;
    private boolean ocupado;

    //Getters e setters
    public String getNumeroQuarto(){
        return numeroQuarto;
    }

    public void setNumeroQuarto(String numeroQuarto){
        this.numeroQuarto = numeroQuarto;
    }

    public String getNomeHospede(){
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede){
        this.nomeHospede = nomeHospede;
    }

    public String getTipoQuarto(){
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto){
        this.tipoQuarto = tipoQuarto;
    }

    public double getValorConsumo(){
        return valorConsumo;
    }

    public void setValorConsumo(double valorConsumo){
        this.valorConsumo = valorConsumo;
    }

    public boolean isOcupado(){
        return ocupado;
    }

    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }

    public void adicionarConsumo(double valor){
        valorConsumo += valor;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Dados da Reserva \n");
        sb.append("Número do quarto: ").append(numeroQuarto).append("\n");
        sb.append("Nome do hóspede: ").append(nomeHospede).append("\n");
        sb.append("Tipo do quarto: ").append(tipoQuarto).append("\n");
        sb.append("Valor do consumo: ").append(valorConsumo).append("\n");
        if(ocupado){
            sb.append("Quarto ocupado \n");
        }else{
            sb.append("Quarto disponível \n");
        }
        return sb.toString();
    }



}
