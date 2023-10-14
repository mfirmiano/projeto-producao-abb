public class Main {
    public static void main(String[] args) {
        ABBAPIClient apiClient = ABBAPIClient.getInstance();

        // Envie dados de quantidade de peças produzidas
        int quantidadeProduzida = 100;
        apiClient.enviarDadosProducao(quantidadeProduzida);

        // Envie dados de tempo de parada
        int downtime = 30; // tempo em minutos
        apiClient.enviarDowntime(downtime);
    }
}
