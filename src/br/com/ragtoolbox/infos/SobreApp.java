package br.com.ragtoolbox.infos;

import br.com.ragtoolbox.R;
import br.com.ragtoolbox.R.layout;
import br.com.ragtoolbox.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SobreApp extends Activity {

	Button btnLogAtt, btnMaisInfo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sobre_app);
		
		btnLogAtt = (Button) findViewById(R.id.btnLogAtt);
		btnMaisInfo = (Button) findViewById(R.id.btnMaisInfo);
		
		btnLogAtt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent logDeAtt = new Intent(SobreApp.this, LogDeAtualizacao.class);
				SobreApp.this.startActivity(logDeAtt);
			}
		});
		
		btnMaisInfo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SobreApp.this);
				dialogo.setTitle("Guia de Ragnarok");
				dialogo.setMessage("Desenvolvido por: @BrunoR_Sousa\n\n" +
						"Parte das informações continas no aplicativos foram retiradas de:\n" +
						"http://browiki.org/wiki/\n" +
						"http://irowiki.org/wiki/\n" +
						"levelupgames.uol.com.br/ragnarok/\n\n" +
						"OBS: Pode conter erros em descrições de habilidades ou calculos, sinta-se à vontade para reportar. :)");
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
				
			}
		});
	}

}
