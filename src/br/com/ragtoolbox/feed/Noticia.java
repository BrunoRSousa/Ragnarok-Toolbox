package br.com.ragtoolbox.feed;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import br.com.ragtoolbox.R;
import br.com.ragtoolbox.R.layout;
import br.com.ragtoolbox.R.menu;
 
public class Noticia  extends Activity
{
 
 
// JSON node keys
private static final String TAG_TITULO = "titulo";
private static final String TAG_TEXTO = "texto";
private static final String TAG_DATA = "mobile";
private static final String TAG_LINK = "link";
@Override
    public void onCreate(Bundle savedInstanceState) {
 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia);
        
        Intent in = getIntent();
         
        String titulo = in.getStringExtra(TAG_TITULO);
        String descricao = in.getStringExtra(TAG_TEXTO);
        String dtPublicacao = in.getStringExtra(TAG_DATA);
        final String link = in.getStringExtra(TAG_LINK);
         
        TextView lblTitulo = (TextView) findViewById(R.id.titulo_label);
        TextView lblDescricao = (TextView) findViewById(R.id.descricao_label);
        TextView lblData = (TextView) findViewById(R.id.dtPublicacao_label);
        Button btNavegador = (Button) findViewById(R.id.btNavegador);
         
        descricao = replaceCh(descricao);
        lblTitulo.setText(titulo);
        lblDescricao.setText(descricao);
        lblData.setText(dtPublicacao);
     
        btNavegador.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
				startActivity(browserIntent);
			}
		});
}

public String replaceCh(String str) {

	str = str.replaceAll("&aacute;","á");
	str = str.replaceAll("&atilde;","ã");
	str = str.replaceAll("&eacute;","é");
	str = str.replaceAll("&ecirc;","ê");
	str = str.replaceAll("&iacute;","í");
	str = str.replaceAll("&oacute;","ó");
	str = str.replaceAll("&ouml;","ö");
	str = str.replaceAll("&uacute;","ú");
	str = str.replaceAll("&ccedil;","ç");
	str = str.replaceAll("&Aacute;","Á");
	str = str.replaceAll("&Atilde;","Ã");
	str = str.replaceAll("&Eacute;","É");
	str = str.replaceAll("&Ecirc;","Ê");
	str = str.replaceAll("&Iacute;","Í");
	str = str.replaceAll("&Oacute;","Ó");
	str = str.replaceAll("&Ouml;","Ö");
	str = str.replaceAll("&Uacute;","Ú");
	str = str.replaceAll("&ntilde;","ñ");
	str = str.replaceAll("&Ntilde;","Ñ");
	str = str.replaceAll("&Ccedil;","Ç");
	str = str.replaceAll("&nbsp;"," ");
	str = str.replaceAll("&quot;","\"");
	
	return str;

}

 
}