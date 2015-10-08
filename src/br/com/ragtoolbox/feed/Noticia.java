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

	str = str.replaceAll("&aacute;","�");
	str = str.replaceAll("&atilde;","�");
	str = str.replaceAll("&eacute;","�");
	str = str.replaceAll("&ecirc;","�");
	str = str.replaceAll("&iacute;","�");
	str = str.replaceAll("&oacute;","�");
	str = str.replaceAll("&ouml;","�");
	str = str.replaceAll("&uacute;","�");
	str = str.replaceAll("&ccedil;","�");
	str = str.replaceAll("&Aacute;","�");
	str = str.replaceAll("&Atilde;","�");
	str = str.replaceAll("&Eacute;","�");
	str = str.replaceAll("&Ecirc;","�");
	str = str.replaceAll("&Iacute;","�");
	str = str.replaceAll("&Oacute;","�");
	str = str.replaceAll("&Ouml;","�");
	str = str.replaceAll("&Uacute;","�");
	str = str.replaceAll("&ntilde;","�");
	str = str.replaceAll("&Ntilde;","�");
	str = str.replaceAll("&Ccedil;","�");
	str = str.replaceAll("&nbsp;"," ");
	str = str.replaceAll("&quot;","\"");
	
	return str;

}

 
}