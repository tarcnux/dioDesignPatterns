package subsistema2.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {}

    public static CepApi getInstancia() {
        return instancia;
    }

    public String getCidade(String cep){
        return "Brusque";
    }

    public String getEstado(String cep){
        return "SC";
    }

}
