package br.com.ragtoolbox.feed;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import br.com.ragtoolbox.R;
import br.com.ragtoolbox.R.layout;
import br.com.ragtoolbox.R.menu;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class Noticias extends ListActivity {
	 
    private ProgressDialog pDialog;
 
    // URL JSON
    private static String url = "http://levelupgames.uol.com.br/services/noticias/ragnarok/feed/todas?&show-page=1&max-results=20";
 
    // JSON Node names
    private static final String TAG_PAGE = "Page";
    private static final String TAG_ID = "id";
    private static final String TAG_TITULO = "titulo";
    private static final String TAG_DESCRICAO = "descricao";
    private static final String TAG_CATEGORIA = "nomeAmigavelCategoria";
    private static final String TAG_DATA = "dtPublicacao";
    
    private static final String TAG_TEXTO = "texto";
    private static final String TAG_LINK = "link";
 
    // Váriavel de objetos do JSON
    JSONArray pages = null;

    ArrayList<HashMap<String, String>> listaDeNoticias;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);
 
        listaDeNoticias = new ArrayList<HashMap<String, String>>();
 
        ListView lv = getListView();
 
        // Função click do listview
        lv.setOnItemClickListener(new OnItemClickListener() {
 
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) {
                // getting values from selected ListItem
                String titulo = ((TextView) view.findViewById(R.id.titulo))
                        .getText().toString();
                String texto = ((TextView) view.findViewById(R.id.texto))
                        .getText().toString();
                String dtPublicacao = ((TextView) view.findViewById(R.id.dtPublicacao))
                        .getText().toString();
                String link = ((TextView) view.findViewById(R.id.link))
                        .getText().toString();
 
                // Starting single contact activity
                Intent in = new Intent(getApplicationContext(),
                        Noticia.class);
                in.putExtra(TAG_TITULO, titulo);
                in.putExtra(TAG_TEXTO, texto);
                in.putExtra(TAG_DATA, dtPublicacao);
                in.putExtra(TAG_LINK, link);
                startActivity(in);
 
            }
        });
 
        // async task
        new GetPages().execute();
    }
 
    /**
     * Async task class to get json by making HTTP call
     * */
    private class GetPages extends AsyncTask<Void, Void, Void> {
 
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(Noticias.this);
            pDialog.setMessage("Carregando...");
            pDialog.setCancelable(false);
            pDialog.show();
 
        }
 
        @Override
        protected Void doInBackground(Void... arg0) {
            ServiceHandler sh = new ServiceHandler();
 
            String jsonStr = sh.makeServiceCall(url, ServiceHandler.GET);
 
            Log.d("Response: ", "> " + jsonStr);
 
            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);
                     
                    // Pegando nodo do JSON
                    pages = jsonObj.getJSONArray(TAG_PAGE);
 
                    for (int i = 0; i < pages.length(); i++) {
                        JSONObject c = pages.getJSONObject(i);
                         
                        String id = c.getString(TAG_ID);
                        String titulo = c.getString(TAG_TITULO);
                        String descricao = c.getString(TAG_DESCRICAO);
                        String categoria = c.getString(TAG_CATEGORIA);
                        String dtPublicacao = c.getString(TAG_DATA);
                        
                        String texto = c.getString(TAG_TEXTO);
                        String link = c.getString(TAG_LINK);
 
                        // hashmap para Notícia
                        HashMap<String, String> infos = new HashMap<String, String>();
 
                        infos.put(TAG_ID, id);
                        infos.put(TAG_TITULO, titulo);
                        infos.put(TAG_DESCRICAO, descricao);
                        infos.put(TAG_CATEGORIA, categoria);
                        infos.put(TAG_DATA, dtPublicacao);
                        
                        infos.put(TAG_TEXTO, texto);
                        infos.put(TAG_LINK, link);
 
                        listaDeNoticias.add(infos);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                Log.e("ServiceHandler", "Couldn't get any data from the url");
            }
 
            return null;
        }
 
        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            // Retirando a caixa de diálogo
            if (pDialog.isShowing())
                pDialog.dismiss();
            /**
             * Updating parsed JSON data into ListView
             * */
            ListAdapter adapter = new SimpleAdapter(
                    Noticias.this, listaDeNoticias,
                    R.layout.list_item, new String[] { TAG_TITULO, TAG_DESCRICAO, TAG_CATEGORIA,
                            TAG_DATA, TAG_TEXTO, TAG_LINK }, new int[] { R.id.titulo,
                            R.id.descricao, R.id.categoria, R.id.dtPublicacao, R.id.texto, R.id.link });
 
            setListAdapter(adapter);
        }
 
    }
 
}