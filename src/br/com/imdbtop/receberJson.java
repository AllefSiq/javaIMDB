package br.com.imdbtop;



import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import com.google.gson.Gson;

public class receberJson {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        String apiKey = "";
        URI imdbuUri = URI.create("https://imdb-api.com/pt/API/Top250Movies/" + apiKey);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
              .uri(imdbuUri)
              .GET().build();


        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body().toString();

        Gson gson = new Gson();
        
        
        itens item =  gson.fromJson(json, itens.class);

        List<filme> filmes = item.getFilmes();
        
        filmes.forEach(System.out::println);
        


        



       
    }
}
