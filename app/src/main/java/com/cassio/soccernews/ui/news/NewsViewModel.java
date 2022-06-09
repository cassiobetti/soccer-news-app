package com.cassio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.cassio.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();


        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviaria tem Desfalque","Nesta segunda-feira, a Seleção Brasileira Feminina"));
        news.add(new News("Ferroviaria Joga no Sabado","Nesta segunda-feira, a Seleção Brasileira Feminina"));
        news.add(new News("Copa do Mundo Inicia","Nesta segunda-feira, a Seleção Brasileira Feminina"));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}















