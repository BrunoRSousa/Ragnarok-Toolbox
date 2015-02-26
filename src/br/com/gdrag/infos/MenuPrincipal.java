package br.com.gdrag.infos;

import br.com.gdrag.R;
import br.com.gdrag.simulador.SimuladorEscolherPersona;
import br.com.gdrag.simulador.SimuladorNovoOuLoad;
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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_menu_principal);
	  
		btclasses = (Button) findViewById(R.id.btpersonagens);
		btinfoapk = (Button) findViewById(R.id.btinfoapk);
		btsair = (Button) findViewById(R.id.btsair);
		btsimulador = (Button) findViewById(R.id.btsimulador);
		
		

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

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_principal, menu);
		return true;
	}

	  
}
