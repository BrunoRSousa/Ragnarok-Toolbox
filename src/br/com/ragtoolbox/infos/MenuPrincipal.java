package br.com.ragtoolbox.infos;

import br.com.ragtoolbox.R;
import br.com.ragtoolbox.feed.Noticias;
import br.com.ragtoolbox.simulador.SimuladorEscolherPersona;
import br.com.ragtoolbox.simulador.SimuladorNovoOuLoad;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MenuPrincipal extends Activity {

	Button btclasses;
	Button btinfoapk;
	Button btsair;
	Button btsimulador;
	Button btnoticias;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_menu_principal);
	  
		btclasses = (Button) findViewById(R.id.btpersonagens);
		btinfoapk = (Button) findViewById(R.id.btinfoapk);
		btsair = (Button) findViewById(R.id.btsair);
		btsimulador = (Button) findViewById(R.id.btsimulador);
		btnoticias = (Button) findViewById(R.id.btnoticias);
		
//		AlertDialog.Builder msg = new AlertDialog.Builder(MenuPrincipal.this);
//		msg.setTitle("O Aplicativo está em testes!");
//		msg.setMessage("Esta versão do aplicativo não está completa e pode haver mudanças em sua versão final, caso você encontre algum bug, por favor, me avise no tópico do aplicativo no fórum. (O Tópico está localizado em Ragnarok Online > Geral > Ragnarok Toolbox Beta");
//		msg.setNeutralButton("Ok!", null);
//		
//		msg.show();
		
		btnoticias.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirNoticias = new Intent(MenuPrincipal.this, Noticias.class);
				MenuPrincipal.this.startActivity(abrirNoticias);
				
			}
		});

		btclasses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirClasses = new Intent(MenuPrincipal.this, Classes.class);
				MenuPrincipal.this.startActivity(abrirClasses);
				
			}
		});
		
		btsimulador.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent abrirSimulador = new Intent(MenuPrincipal.this, SimuladorNovoOuLoad.class);
				MenuPrincipal.this.startActivity(abrirSimulador);
			}
		});
		
		btinfoapk.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent abrirInfo = new Intent(MenuPrincipal.this, SobreApp.class);
				MenuPrincipal.this.startActivity(abrirInfo);
			}
		});
		
		
		btsair.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
		
	}

	  
}
