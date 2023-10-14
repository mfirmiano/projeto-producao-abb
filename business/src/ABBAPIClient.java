public class ABBAPIClient {
    private static ABBAPIClient instance;

    private ABBAPIClient() {
        // Inicialize aqui a comunicação com a API ABB
        System.out.println("Dados da API recebidos!!\n\n");
    }

    public static ABBAPIClient getInstance() {
        if (instance == null) {
            instance = new ABBAPIClient();
        }
        return instance;
    }

    public void enviarDadosProducao(int quantidade) {
        // Implemente a lógica para enviar os dados de quantidade de peças produzidas
        System.out.printf("\nA quantidade de peças produzidas foi de: %d peças", quantidade);
    }

    public void enviarDowntime(int downtime) {
        // Implemente a lógica para enviar os dados de tempo de parada
        System.out.printf("\nO tempo total de downtime foi de %d minutos", downtime);
    }
}
