package br.com.ragtoolbox.simulador;


import br.com.ragtoolbox.R;
import br.com.ragtoolbox.R.layout;
import br.com.ragtoolbox.R.menu;
import br.com.ragtoolbox.infos.SobreApp;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SimuladorNovoOuLoad extends Activity {

	Button btnovaarvore, btcarregararvore;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simulador_novo_ou_load);
		
		
		btnovaarvore = (Button) findViewById(R.id.btnovaarvore);
		btcarregararvore = (Button) findViewById(R.id.btcarregararvore);
		
		btnovaarvore.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSelecaoSimulador = new Intent(SimuladorNovoOuLoad.this, SimuladorEscolherPersona.class);
				SimuladorNovoOuLoad.this.startActivity(abrirSelecaoSimulador);
				
				
			}
		});
		
		btcarregararvore.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSelecaoSimulador = new Intent(SimuladorNovoOuLoad.this, SimuladorLoad.class);
				SimuladorNovoOuLoad.this.startActivity(abrirSelecaoSimulador);
			}
		});
	}
	

}
