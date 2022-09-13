package br.com.imdbtop;

import java.util.ArrayList;
import java.util.List;

public class itens {
    private List<filme> items = new ArrayList<filme>();    


    

    public itens(List<filme> filmes) {
        this.items = filmes;
    }




    public List<filme> getFilmes() {
        return items;
    }

}
