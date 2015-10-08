package br.com.ragtoolbox.simulador;

import br.com.ragtoolbox.R;
import br.com.ragtoolbox.R.layout;
import br.com.ragtoolbox.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SimuladorEscolherPersona extends Activity {

	LinearLayout layCavaleiroRunico,
	layGuardiaoReal,
	layArcano,
	layFeiticeiro,
	laySentinela,
	layTrovadorMusa,
	layMecanico,
	layBioquimico,
	laySicario,
	layRenegado,
	layArcebispo,
	layShura,
	layMestreTaekwon,
	layEspiritualista,
	layKagerouOboro,
	layJusticeiro,
	laySuperAprendizExpandido,
	layCla;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simulador_escolher_persona);
		
		layCavaleiroRunico = (LinearLayout) findViewById(R.id.layCavaleiroRunico);
		
		layGuardiaoReal = (LinearLayout) findViewById(R.id.layGuardiaoReal);
		
		layArcano = (LinearLayout) findViewById(R.id.layArcano);
		
		layFeiticeiro = (LinearLayout) findViewById(R.id.layFeiticeiro);
		
		laySentinela = (LinearLayout) findViewById(R.id.laySentinela);
		
		layTrovadorMusa = (LinearLayout) findViewById(R.id.layTrovadorMusa);
		
		layMecanico = (LinearLayout) findViewById(R.id.layMecanico);
		
		layBioquimico = (LinearLayout) findViewById(R.id.laybioquimico);
		
		laySicario = (LinearLayout) findViewById(R.id.laySicario);
		
		layRenegado = (LinearLayout) findViewById(R.id.layRenegado);
		
		layArcebispo = (LinearLayout) findViewById(R.id.layArcebispo);
		
		layShura = (LinearLayout) findViewById(R.id.layShura);
		
		layMestreTaekwon = (LinearLayout) findViewById(R.id.layMestreTaekwon);
		
		layEspiritualista = (LinearLayout) findViewById(R.id.layEspiritualista);
		
		layKagerouOboro = (LinearLayout) findViewById(R.id.layKagerouOboro);
		
		layJusticeiro = (LinearLayout) findViewById(R.id.layJusticeiro);
		
		laySuperAprendizExpandido = (LinearLayout) findViewById(R.id.laySuperAprendiz);
		
		layCla = (LinearLayout) findViewById(R.id.layClan);
		
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
		
		layArcano.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorArcano.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
		layFeiticeiro.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorFeiticeiro.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
		laySentinela.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorSentinela.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
		layTrovadorMusa.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorEscolherPersona.this);
				msg.setTitle("Trovador/Musa");
				msg.setNegativeButton("Trovador", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorTrovador.class);
						SimuladorEscolherPersona.this.startActivity(abrirSimulador);
					}
				});
				msg.setNeutralButton("Musa", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorMusa.class);
						SimuladorEscolherPersona.this.startActivity(abrirSimulador);
					}
				});
				
				msg.show();
			}
		});
		
		layMecanico.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorMecanico.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
		layBioquimico.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorBioquimico.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
		laySicario.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorSicario.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
		layRenegado.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorRenegado.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
		layArcebispo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorArcebispo.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
		layShura.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorShura.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
		layMestreTaekwon.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorMestreTaekwon.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
		layEspiritualista.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorEspiritualista.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
		layKagerouOboro.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorEscolherPersona.this);
				msg.setTitle("Kagerou/Oboro");
				msg.setNegativeButton("Kagerou", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorKagerou.class);
						SimuladorEscolherPersona.this.startActivity(abrirSimulador);
					}
				});
				msg.setNeutralButton("Oboro", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorOboro.class);
						SimuladorEscolherPersona.this.startActivity(abrirSimulador);
					}
				});
				
				msg.show();
			}
		});
		
		layJusticeiro.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorJusticeiro.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
		laySuperAprendizExpandido.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorSuperAprendizExpandido.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
		layCla.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent abrirSimulador = new Intent(SimuladorEscolherPersona.this, SimuladorCla.class);
				SimuladorEscolherPersona.this.startActivity(abrirSimulador);
			}
		});
		
	}

}
