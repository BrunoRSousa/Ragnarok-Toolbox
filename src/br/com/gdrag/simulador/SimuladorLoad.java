package br.com.gdrag.simulador;



import br.com.gdrag.R;
import br.com.gdrag.R.id;
import br.com.gdrag.R.layout;
import br.com.gdrag.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class SimuladorLoad extends Activity {

	Button btnApagarTudo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simulador_load);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.simulador_load, menu);
		return true;
	}
	
	public void onResume(){
		super.onResume();
		btnApagarTudo = (Button) findViewById(R.id.btnApagarTudo);
		try {
		SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
		
		Cursor cs = db.rawQuery("SELECT * FROM simulacoes_de_classes", null);
		
		
		String[] from = {"nome", "classe"};
		int[] to = {R.id.txtNomeSimulacao, R.id.txtClasse};
		SimpleCursorAdapter ad = new SimpleCursorAdapter(getBaseContext(), R.layout.lista_simulacoes, cs, from, to, 0);
		
		ListView lvSimulacoes = (ListView)findViewById(R.id.lvSimulacoes);
		
		
		lvSimulacoes.setAdapter(ad);
		
		db.close();
		
		lvSimulacoes.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView adapter, View view, int position, long id) {
				final SQLiteCursor c = (SQLiteCursor) adapter.getAdapter().getItem(position);
				AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorLoad.this);
				msg.setTitle("O que você deseja fazer?");
				msg.setNegativeButton("Visualizar", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						
						if (c.getString(2).equals("cavaleiro runico")){
							Intent it = new Intent(getBaseContext(), SimuladorCavaleiroRunico.class);
							it.putExtra("id", c.getInt(3));
							startActivity(it);
						}
						
						if (c.getString(2).equals("guardiao real")){
							Intent it = new Intent(getBaseContext(), SimuladorGuardiaoReal.class);
							it.putExtra("id", c.getInt(3));
							startActivity(it);
						}
						
						
						
					}
				});
				msg.setNeutralButton("Deletar", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						AlertDialog.Builder msg2 = new AlertDialog.Builder(SimuladorLoad.this);
						msg2.setTitle("Você tem certeza?");
						msg2.setMessage("Não é possível recuperar dados apagados, você tem certeza disso?");
						msg2.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								int deletarSimulacao = c.getInt(3);
								int deletarID = c.getInt(0);
								
								try {
								SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
								
								if (c.getString(2).equals("cavaleiro runico")){
									db.delete("cavaleiro_runico", "_id=?", new String[]{String.valueOf(deletarSimulacao)});
								}
								
								if (c.getString(2).equals("guardiao real")){
									db.delete("guardiao_real", "_id=?", new String[]{String.valueOf(deletarSimulacao)});
								}
								
								db.delete("simulacoes_de_classes", "_id=?", new String[]{String.valueOf(deletarID)});
								
								db.close();
								
								
								finish();
								Intent abrirSelecaoSimulador = new Intent(SimuladorLoad.this, SimuladorLoad.class);
								SimuladorLoad.this.startActivity(abrirSelecaoSimulador);
								} catch (Exception e) {
									Toast.makeText(getBaseContext(),
											"Erro ao deletar simulação", Toast.LENGTH_SHORT)
											.show();
								}
							}
						});
						msg2.setNegativeButton("Não", null);
						
						msg2.show();
					}
				});
				
				msg.show();
			}
			
		});
		
		} catch (Exception e) {
			btnApagarTudo.setEnabled(false);
			Toast.makeText(getBaseContext(), "Nenhuma simulação salva!",
					Toast.LENGTH_LONG).show();
		}
		
		
		
		btnApagarTudo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorLoad.this);
				msg.setTitle("Realmente deseja deletar tudo?");
				msg.setMessage("OBS: Os dados apagados não poderam ser recuperados, deseja apagar tudo?");
				msg.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						try {
							SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
							db.delete("cavaleiro_runico", null, null);
							db.delete("guardiao_real", null, null);
							db.delete("simulacoes_de_classes", null, null);
							
							db.close();
							
							Toast.makeText(getBaseContext(), "Simulações deletadas!",
									Toast.LENGTH_LONG).show();
							finish();
							} catch (Exception e) {
								Toast.makeText(getBaseContext(), "Falha ao deletar",
										Toast.LENGTH_SHORT).show();
								finish();
							}
					}
				});
				msg.setNeutralButton("Não", null);
				msg.show();
				
			}
		});
	}

}
