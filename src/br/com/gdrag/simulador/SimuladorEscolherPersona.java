package br.com.gdrag.simulador;

import br.com.gdrag.R;
import br.com.gdrag.R.layout;
import br.com.gdrag.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

public class SimuladorEscolherPersona extends Activity {

	LinearLayout layCavaleiroRunico,
	layGuardiaoReal;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simulador_escolher_persona);
		
		layCavaleiroRunico = (LinearLayout) findViewById(R.id.layCavaleiroRunico);
		
		layGuardiaoReal = (LinearLayout) findViewById(R.id.layGuardiaoReal);
		
		layCavaleiroRunico.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorCavaleiroRunico.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
		layGuardiaoReal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorGuardiaoReal.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.simulador_escolher_persona, menu);
		return true;
	}

}
