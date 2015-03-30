package br.com.gdrag.simulador;

import br.com.gdrag.R;
import br.com.gdrag.R.id;
import br.com.gdrag.R.layout;
import br.com.gdrag.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SimuladorCla extends Activity {

		//Botões de interrogação
		Button btChamadoUrgenteInterrogacao,
		btRegeneracaoInterrogacao,
		btRestauracaoInterrogacao,
		btComandoDeBatalhaInterrogacao,
		btAutorizacaoOficialInterrogacao,
		btContratoComKafraInterrogacao,
		btComandarGuardioesInterrogacao,
		btExpandirClaInterrogacao,
		btGrandeLiderancaInterrogacao,
		btFerimentosDeGloriaInterrogacao,
		btCoracaoFrioInterrogacao,
		btOlharApuradoInterrogacao,
		btFortalecerGuardioesInterrogacao,
		btDesenvolvimentoPermanenteInterrogacao;

		//Botões de diminuir habilidades
		Button btChamadoUrgenteDiminuir,
		btRegeneracaoDiminuir,
		btRestauracaoDiminuir,
		btComandoDeBatalhaDiminuir,
		btAutorizacaoOficialDiminuir,
		btContratoComKafraDiminuir,
		btComandarGuardioesDiminuir,
		btExpandirClaDiminuir,
		btGrandeLiderancaDiminuir,
		btFerimentosDeGloriaDiminuir,
		btCoracaoFrioDiminuir,
		btOlharApuradoDiminuir,
		btFortalecerGuardioesDiminuir,
		btDesenvolvimentoPermanenteDiminuir;

		//Botões de aumentar habilidades
		Button btChamadoUrgenteAumentar,
		btRegeneracaoAumentar,
		btRestauracaoAumentar,
		btComandoDeBatalhaAumentar,
		btAutorizacaoOficialAumentar,
		btContratoComKafraAumentar,
		btComandarGuardioesAumentar,
		btExpandirClaAumentar,
		btGrandeLiderancaAumentar,
		btFerimentosDeGloriaAumentar,
		btCoracaoFrioAumentar,
		btOlharApuradoAumentar,
		btFortalecerGuardioesAumentar,
		btDesenvolvimentoPermanenteAumentar;

		//Resto dos botões
		Button btResetar, btSalvar;
		ToggleButton tgbtSomenteHabilidadeAprendida;


		//Txt pontos da tela
		TextView txtChamadoUrgentePontos,
		txtRegeneracaoPontos,
		txtRestauracaoPontos,
		txtComandoDeBatalhaPontos,
		txtAutorizacaoOficialPontos,
		txtContratoComKafraPontos,
		txtComandarGuardioesPontos,
		txtExpandirClaPontos,
		txtGrandeLiderancaPontos,
		txtFerimentosDeGloriaPontos,
		txtCoracaoFrioPontos,
		txtOlharApuradoPontos,
		txtFortalecerGuardioesPontos,
		txtDesenvolvimentoPermanentePontos;

		//Txt pontos restantes
		TextView txtClasse1, txtClasse2, txtTransClasse, txtClasse3;

		//Layouts
		LinearLayout layChamadoUrgente,
		layRegeneracao,
		layRestauracao,
		layComandoDeBatalha,
		layAutorizacaoOficial,
		layContratoComKafra,
		layComandarGuardioes,
		layExpandirCla,
		layGrandeLideranca,
		layFerimentosDeGloria,
		layCoracaoFrio,
		layOlharApurado,
		layFortalecerGuardioes,
		layDesenvolvimentoPermanente;

		//Variaveis de Skill
		int varChamadoUrgente,
		varRegeneracao,
		varRestauracao,
		varComandoDeBatalha,
		varAutorizacaoOficial,
		varContratoComKafra,
		varComandarGuardioes,
		varExpandirCla,
		varGrandeLideranca,
		varFerimentosDeGloria,
		varCoracaoFrio,
		varOlharApurado,
		varFortalecerGuardioes,
		varDesenvolvimentoPermanente;

		//variavel para alteração do db
		String idParaAlterar;

		//Variaveis de ponto
		int primeiraClasse;

		int skillPrimeira;

		int count;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_simulador_cla);

			Intent it = getIntent();

			final int id = it.getIntExtra("id", 0);
			idParaAlterar = "_id =" +id;

			//inicialização de variáveis
			varChamadoUrgente = 0;
			varRegeneracao = 0;
			varRestauracao = 0;
			varComandoDeBatalha = 0;
			varAutorizacaoOficial = 0;
			varContratoComKafra = 0;
			varComandarGuardioes = 0;
			varExpandirCla = 0;
			varGrandeLideranca = 0;
			varFerimentosDeGloria = 0;
			varCoracaoFrio = 0;
			varOlharApurado = 0;
			varFortalecerGuardioes = 0;
			varDesenvolvimentoPermanente = 0;



			primeiraClasse = 49;

			skillPrimeira = 0;

			count = 0;


			//Botões de interrogações
			btChamadoUrgenteInterrogacao = (Button) findViewById(R.id.btChamadoUrgenteInterrogacao);
			btRegeneracaoInterrogacao = (Button) findViewById(R.id.btRegeneracaoInterrogacao);
			btRestauracaoInterrogacao = (Button) findViewById(R.id.btRestauracaoInterrogacao);
			btComandoDeBatalhaInterrogacao = (Button) findViewById(R.id.btComandoDeBatalhaInterrogacao);
			btAutorizacaoOficialInterrogacao = (Button) findViewById(R.id.btAutorizacaoOficialInterrogacao);
			btContratoComKafraInterrogacao = (Button) findViewById(R.id.btContratoComKafraInterrogacao);
			btComandarGuardioesInterrogacao = (Button) findViewById(R.id.btComandarGuardioesInterrogacao);
			btExpandirClaInterrogacao = (Button) findViewById(R.id.btExpandirClaInterrogacao);
			btGrandeLiderancaInterrogacao = (Button) findViewById(R.id.btGrandeLiderancaInterrogacao);
			btFerimentosDeGloriaInterrogacao = (Button) findViewById(R.id.btFerimentosDeGloriaInterrogacao);
			btCoracaoFrioInterrogacao = (Button) findViewById(R.id.btCoracaoFrioInterrogacao);
			btOlharApuradoInterrogacao = (Button) findViewById(R.id.btOlharApuradoInterrogacao);
			btFortalecerGuardioesInterrogacao = (Button) findViewById(R.id.btFortalecerGuardioesInterrogacao);
			btDesenvolvimentoPermanenteInterrogacao = (Button) findViewById(R.id.btDesenvolvimentoPermanenteInterrogacao);

			//Botões de diminuir habilidades
			btChamadoUrgenteDiminuir = (Button) findViewById(R.id.btChamadoUrgenteDiminuir);
			btRegeneracaoDiminuir = (Button) findViewById(R.id.btRegeneracaoDiminuir);
			btRestauracaoDiminuir = (Button) findViewById(R.id.btRestauracaoDiminuir);
			btComandoDeBatalhaDiminuir = (Button) findViewById(R.id.btComandoDeBatalhaDiminuir);
			btAutorizacaoOficialDiminuir = (Button) findViewById(R.id.btAutorizacaoOficialDiminuir);
			btContratoComKafraDiminuir = (Button) findViewById(R.id.btContratoComKafraDiminuir);
			btComandarGuardioesDiminuir = (Button) findViewById(R.id.btComandarGuardioesDiminuir);
			btExpandirClaDiminuir = (Button) findViewById(R.id.btExpandirClaDiminuir);
			btGrandeLiderancaDiminuir = (Button) findViewById(R.id.btGrandeLiderancaDiminuir);
			btFerimentosDeGloriaDiminuir = (Button) findViewById(R.id.btFerimentosDeGloriaDiminuir);
			btCoracaoFrioDiminuir = (Button) findViewById(R.id.btCoracaoFrioDiminuir);
			btOlharApuradoDiminuir = (Button) findViewById(R.id.btOlharApuradoDiminuir);
			btFortalecerGuardioesDiminuir = (Button) findViewById(R.id.btFortalecerGuardioesDiminuir);
			btDesenvolvimentoPermanenteDiminuir = (Button) findViewById(R.id.btDesenvolvimentoPermanenteDiminuir);

			//Botões de aumentar habilidades
			btChamadoUrgenteAumentar = (Button) findViewById(R.id.btChamadoUrgenteAumentar);
			btRegeneracaoAumentar = (Button) findViewById(R.id.btRegeneracaoAumentar);
			btRestauracaoAumentar = (Button) findViewById(R.id.btRestauracaoAumentar);
			btComandoDeBatalhaAumentar = (Button) findViewById(R.id.btComandoDeBatalhaAumentar);
			btAutorizacaoOficialAumentar = (Button) findViewById(R.id.btAutorizacaoOficialAumentar);
			btContratoComKafraAumentar = (Button) findViewById(R.id.btContratoComKafraAumentar);
			btComandarGuardioesAumentar = (Button) findViewById(R.id.btComandarGuardioesAumentar);
			btExpandirClaAumentar = (Button) findViewById(R.id.btExpandirClaAumentar);
			btGrandeLiderancaAumentar = (Button) findViewById(R.id.btGrandeLiderancaAumentar);
			btFerimentosDeGloriaAumentar = (Button) findViewById(R.id.btFerimentosDeGloriaAumentar);
			btCoracaoFrioAumentar = (Button) findViewById(R.id.btCoracaoFrioAumentar);
			btOlharApuradoAumentar = (Button) findViewById(R.id.btOlharApuradoAumentar);
			btFortalecerGuardioesAumentar = (Button) findViewById(R.id.btFortalecerGuardioesAumentar);
			btDesenvolvimentoPermanenteAumentar = (Button) findViewById(R.id.btDesenvolvimentoPermanenteAumentar);

			//Resto dos botões
			btResetar = (Button) findViewById(R.id.btResetar);
			btSalvar = (Button) findViewById(R.id.btSalvar);
			tgbtSomenteHabilidadeAprendida = (ToggleButton) findViewById(R.id.tgbtSomenteHabilidadeAprendida);

			//Txt pontos da tela
			txtChamadoUrgentePontos = (TextView) findViewById(R.id.txtChamadoUrgentePontos);
			txtRegeneracaoPontos = (TextView) findViewById(R.id.txtRegeneracaoPontos);
			txtRestauracaoPontos = (TextView) findViewById(R.id.txtRestauracaoPontos);
			txtComandoDeBatalhaPontos = (TextView) findViewById(R.id.txtComandoDeBatalhaPontos);
			txtAutorizacaoOficialPontos = (TextView) findViewById(R.id.txtAutorizacaoOficialPontos);
			txtContratoComKafraPontos = (TextView) findViewById(R.id.txtContratoComKafraPontos);
			txtComandarGuardioesPontos = (TextView) findViewById(R.id.txtComandarGuardioesPontos);
			txtExpandirClaPontos = (TextView) findViewById(R.id.txtExpandirClaPontos);
			txtGrandeLiderancaPontos = (TextView) findViewById(R.id.txtGrandeLiderancaPontos);
			txtFerimentosDeGloriaPontos = (TextView) findViewById(R.id.txtFerimentosDeGloriaPontos);
			txtCoracaoFrioPontos = (TextView) findViewById(R.id.txtCoracaoFrioPontos);
			txtOlharApuradoPontos = (TextView) findViewById(R.id.txtOlharApuradoPontos);
			txtFortalecerGuardioesPontos = (TextView) findViewById(R.id.txtFortalecerGuardioesPontos);
			txtDesenvolvimentoPermanentePontos = (TextView) findViewById(R.id.txtDesenvolvimentoPermanentePontos);

			//Txt pontos restantes
			txtClasse1 = (TextView) findViewById(R.id.txtClasse1);
			txtClasse2 = (TextView) findViewById(R.id.txtClasse2);
			txtTransClasse = (TextView) findViewById(R.id.txtClasseTrans);
			txtClasse3 = (TextView) findViewById(R.id.txtClasse3);

			//Layouts
			layChamadoUrgente = (LinearLayout) findViewById(R.id.layChamadoUrgente);
			layRegeneracao = (LinearLayout) findViewById(R.id.layRegeneracao);
			layRestauracao = (LinearLayout) findViewById(R.id.layRestauracao);
			layComandoDeBatalha = (LinearLayout) findViewById(R.id.layComandoDeBatalha);
			layAutorizacaoOficial = (LinearLayout) findViewById(R.id.layAutorizacaoOficial);
			layContratoComKafra = (LinearLayout) findViewById(R.id.layContratoComKafra);
			layComandarGuardioes = (LinearLayout) findViewById(R.id.layComandarGuardioes);
			layExpandirCla = (LinearLayout) findViewById(R.id.layExpandirCla);
			layGrandeLideranca = (LinearLayout) findViewById(R.id.layGrandeLideranca);
			layFerimentosDeGloria = (LinearLayout) findViewById(R.id.layFerimentosDeGloria);
			layCoracaoFrio = (LinearLayout) findViewById(R.id.layCoracaoFrio);
			layOlharApurado = (LinearLayout) findViewById(R.id.layOlharApurado);
			layFortalecerGuardioes = (LinearLayout) findViewById(R.id.layFortalecerGuardioes);
			layDesenvolvimentoPermanente = (LinearLayout) findViewById(R.id.layDesenvolvimentoPermanente);

			if (id>0)
				recarregarBuild(id);


			//Eventos de informação
			btChamadoUrgenteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCla.this);
					dialogo.setTitle("Chamado Urgente");
					dialogo.setMessage(R.string.chamadoUrgenteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRegeneracaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCla.this);
					dialogo.setTitle("Regeneração");
					dialogo.setMessage(R.string.regeneracaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRestauracaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCla.this);
					dialogo.setTitle("Restauração");
					dialogo.setMessage(R.string.restauracaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btComandoDeBatalhaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCla.this);
					dialogo.setTitle("Comando De Batalha");
					dialogo.setMessage(R.string.comandoDeBatalhaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAutorizacaoOficialInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCla.this);
					dialogo.setTitle("Autorização Oficial");
					dialogo.setMessage(R.string.autorizacaoOficialInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btContratoComKafraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCla.this);
					dialogo.setTitle("Contrato Com Kafra");
					dialogo.setMessage(R.string.contratoComKafraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btComandarGuardioesInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCla.this);
					dialogo.setTitle("Comandar Guardiões");
					dialogo.setMessage(R.string.comandarGuardioesInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btExpandirClaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCla.this);
					dialogo.setTitle("Expandir Clã");
					dialogo.setMessage(R.string.expandirClaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGrandeLiderancaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCla.this);
					dialogo.setTitle("Grande Liderança");
					dialogo.setMessage(R.string.grandeLiderancaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFerimentosDeGloriaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCla.this);
					dialogo.setTitle("Ferimentos De Glória");
					dialogo.setMessage(R.string.ferimentosDeGloriaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCoracaoFrioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCla.this);
					dialogo.setTitle("Coração Frio");
					dialogo.setMessage(R.string.coracaoFrioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOlharApuradoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCla.this);
					dialogo.setTitle("Olhar Apurado");
					dialogo.setMessage(R.string.olharApuradoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFortalecerGuardioesInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCla.this);
					dialogo.setTitle("Fortalecer Guardiões");
					dialogo.setMessage(R.string.fortalecerGuardioesInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDesenvolvimentoPermanenteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCla.this);
					dialogo.setTitle("Desenvolvimento Permanente");
					dialogo.setMessage(R.string.desenvolvimentoPermanenteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});


			//Eventos de aumentar
			btChamadoUrgenteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varExpandirCla<5 && count<5){
						atualizarCalculo(varExpandirCla, "ExpandirCla", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varExpandirCla<2 && count<2){
						atualizarCalculo(varExpandirCla, "ExpandirCla", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAutorizacaoOficial<1 && count<1){
						atualizarCalculo(varAutorizacaoOficial, "AutorizacaoOficial", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varComandoDeBatalha<1 && count<1){
						atualizarCalculo(varComandoDeBatalha, "ComandoDeBatalha", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRegeneracao<1 && count<1){
						atualizarCalculo(varRegeneracao, "Regeneracao", 3, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAutorizacaoOficial<1 && count<1){
						atualizarCalculo(varAutorizacaoOficial, "AutorizacaoOficial", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varComandarGuardioes<1 && count<1){
						atualizarCalculo(varComandarGuardioes, "ComandarGuardioes", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varChamadoUrgente, "ChamadoUrgente", 1, 1, "Aumentar");

				}
			});
			btRegeneracaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varExpandirCla<5 && count<5){
						atualizarCalculo(varExpandirCla, "ExpandirCla", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varExpandirCla<2 && count<2){
						atualizarCalculo(varExpandirCla, "ExpandirCla", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAutorizacaoOficial<1 && count<1){
						atualizarCalculo(varAutorizacaoOficial, "AutorizacaoOficial", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varComandoDeBatalha<1 && count<1){
						atualizarCalculo(varComandoDeBatalha, "ComandoDeBatalha", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRegeneracao, "Regeneracao", 3, 1, "Aumentar");

				}
			});
			btRestauracaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varExpandirCla<5 && count<5){
						atualizarCalculo(varExpandirCla, "ExpandirCla", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varExpandirCla<2 && count<2){
						atualizarCalculo(varExpandirCla, "ExpandirCla", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAutorizacaoOficial<1 && count<1){
						atualizarCalculo(varAutorizacaoOficial, "AutorizacaoOficial", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varComandoDeBatalha<1 && count<1){
						atualizarCalculo(varComandoDeBatalha, "ComandoDeBatalha", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRegeneracao<1 && count<1){
						atualizarCalculo(varRegeneracao, "Regeneracao", 3, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRestauracao, "Restauracao", 1, 1, "Aumentar");

				}
			});
			btComandoDeBatalhaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varExpandirCla<2 && count<2){
						atualizarCalculo(varExpandirCla, "ExpandirCla", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAutorizacaoOficial<1 && count<1){
						atualizarCalculo(varAutorizacaoOficial, "AutorizacaoOficial", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varComandoDeBatalha, "ComandoDeBatalha", 1, 1, "Aumentar");

				}
			});
			btAutorizacaoOficialAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAutorizacaoOficial, "AutorizacaoOficial", 1, 1, "Aumentar");

				}
			});
			btContratoComKafraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAutorizacaoOficial<1 && count<1){
						atualizarCalculo(varAutorizacaoOficial, "AutorizacaoOficial", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varContratoComKafra, "ContratoComKafra", 1, 1, "Aumentar");

				}
			});
			btComandarGuardioesAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAutorizacaoOficial<1 && count<1){
						atualizarCalculo(varAutorizacaoOficial, "AutorizacaoOficial", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varComandarGuardioes, "ComandarGuardioes", 1, 1, "Aumentar");

				}
			});
			btExpandirClaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varExpandirCla, "ExpandirCla", 10, 1, "Aumentar");

				}
			});
			btGrandeLiderancaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGrandeLideranca, "GrandeLideranca", 5, 1, "Aumentar");

				}
			});
			btFerimentosDeGloriaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFerimentosDeGloria, "FerimentosDeGloria", 5, 1, "Aumentar");

				}
			});
			btCoracaoFrioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFerimentosDeGloria<1 && count<1){
						atualizarCalculo(varFerimentosDeGloria, "FerimentosDeGloria", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCoracaoFrio, "CoracaoFrio", 5, 1, "Aumentar");

				}
			});
			btOlharApuradoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varGrandeLideranca<1 && count<1){
						atualizarCalculo(varGrandeLideranca, "GrandeLideranca", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varOlharApurado, "OlharApurado", 5, 1, "Aumentar");

				}
			});
			btFortalecerGuardioesAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFortalecerGuardioes, "FortalecerGuardioes", 3, 1, "Aumentar");

				}
			});
			btDesenvolvimentoPermanenteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDesenvolvimentoPermanente, "DesenvolvimentoPermanente", 1, 1, "Aumentar");

				}
			});


			//Eventos de diminuir
			btChamadoUrgenteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChamadoUrgente, "ChamadoUrgente", 1, 1, "Diminuir");

				}
			});
			btRegeneracaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRegeneracao, "Regeneracao", 3, 1, "Diminuir");

				}
			});
			btRestauracaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRestauracao, "Restauracao", 1, 1, "Diminuir");

				}
			});
			btComandoDeBatalhaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varComandoDeBatalha, "ComandoDeBatalha", 1, 1, "Diminuir");

				}
			});
			btAutorizacaoOficialDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAutorizacaoOficial, "AutorizacaoOficial", 1, 1, "Diminuir");

				}
			});
			btContratoComKafraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varContratoComKafra, "ContratoComKafra", 1, 1, "Diminuir");

				}
			});
			btComandarGuardioesDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varComandarGuardioes, "ComandarGuardioes", 1, 1, "Diminuir");

				}
			});
			btExpandirClaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varExpandirCla, "ExpandirCla", 10, 1, "Diminuir");

				}
			});
			btGrandeLiderancaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGrandeLideranca, "GrandeLideranca", 5, 1, "Diminuir");

				}
			});
			btFerimentosDeGloriaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFerimentosDeGloria, "FerimentosDeGloria", 5, 1, "Diminuir");

				}
			});
			btCoracaoFrioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCoracaoFrio, "CoracaoFrio", 5, 1, "Diminuir");

				}
			});
			btOlharApuradoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOlharApurado, "OlharApurado", 5, 1, "Diminuir");

				}
			});
			btFortalecerGuardioesDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFortalecerGuardioes, "FortalecerGuardioes", 3, 1, "Diminuir");

				}
			});
			btDesenvolvimentoPermanenteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDesenvolvimentoPermanente, "DesenvolvimentoPermanente", 1, 1, "Diminuir");

				}
			});


			//Outros Botões
			btResetar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					varChamadoUrgente = 0;
					varRegeneracao = 0;
					varRestauracao = 0;
					varComandoDeBatalha = 0;
					varAutorizacaoOficial = 0;
					varContratoComKafra = 0;
					varComandarGuardioes = 0;
					varExpandirCla = 0;
					varGrandeLideranca = 0;
					varFerimentosDeGloria = 0;
					varCoracaoFrio = 0;
					varOlharApurado = 0;
					varFortalecerGuardioes = 0;
					varDesenvolvimentoPermanente = 0;

					primeiraClasse = 49;

					skillPrimeira = 0;
					atualizarTela();

				}
			});

			btSalvar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					if (id > 0){
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorCla.this);
						msgA.setTitle("Deseja sobrepor a simulação?");
						msgA.setMessage("Deseja sobrepor a simulação atual ou salva-la como uma nova simulação?");
						msgA.setNegativeButton("Sobrepor", new DialogInterface.OnClickListener() {

							@Override
								public void onClick(DialogInterface dialog, int which) {
									salvarNoDB(false, null);
								}
						});

						msgA.setPositiveButton("Salvar como...", new DialogInterface.OnClickListener() {

							@Override
								public void onClick(DialogInterface dialog, int which) {
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorCla.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorCla.this);
								msg.setView(nomeParaSalvar);
								msg.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {

								@Override
									public void onClick(DialogInterface dialog, int which) {
										if (nomeParaSalvar.getText().toString().length() <= 0) {
											nomeParaSalvar.setError("Preencha o campo!");
											Toast.makeText(getBaseContext(), "ERROR: Insira um nome!", Toast.LENGTH_SHORT).show();
										} else {
											salvarNoDB(true, nomeParaSalvar.getText().toString());
										}
									}
								});

								msg.setNeutralButton("Cancelar", null);
								msg.show();
								}
						});

						msgA.setNeutralButton("Cancelar", null);
						msgA.show();

					} else {

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorCla.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorCla.this);
						msg.setView(nomeParaSalvar);
						msg.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {

						@Override
							public void onClick(DialogInterface dialog, int which) {
								if (nomeParaSalvar.getText().toString().length() <= 0) {
									nomeParaSalvar.setError("Preencha o campo!");
									Toast.makeText(getBaseContext(), "ERROR: Insira um nome!", Toast.LENGTH_SHORT).show();
								} else {
									salvarNoDB(true, nomeParaSalvar.getText().toString());
								}
								}
							});

							msg.setNeutralButton("Cancelar", null);
							msg.show();

						}
					}
			});

			tgbtSomenteHabilidadeAprendida.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					if (tgbtSomenteHabilidadeAprendida.isChecked()){
						somenteHabilidadeAprendida();
					} else {
						tudoVisivel();
					}
				}

			});

		}

		public void somenteHabilidadeAprendida(){
			if(varChamadoUrgente==0)
				layChamadoUrgente.setVisibility(View.GONE);
			if(varRegeneracao==0)
				layRegeneracao.setVisibility(View.GONE);
			if(varRestauracao==0)
				layRestauracao.setVisibility(View.GONE);
			if(varComandoDeBatalha==0)
				layComandoDeBatalha.setVisibility(View.GONE);
			if(varAutorizacaoOficial==0)
				layAutorizacaoOficial.setVisibility(View.GONE);
			if(varContratoComKafra==0)
				layContratoComKafra.setVisibility(View.GONE);
			if(varComandarGuardioes==0)
				layComandarGuardioes.setVisibility(View.GONE);
			if(varExpandirCla==0)
				layExpandirCla.setVisibility(View.GONE);
			if(varGrandeLideranca==0)
				layGrandeLideranca.setVisibility(View.GONE);
			if(varFerimentosDeGloria==0)
				layFerimentosDeGloria.setVisibility(View.GONE);
			if(varCoracaoFrio==0)
				layCoracaoFrio.setVisibility(View.GONE);
			if(varOlharApurado==0)
				layOlharApurado.setVisibility(View.GONE);
			if(varFortalecerGuardioes==0)
				layFortalecerGuardioes.setVisibility(View.GONE);
			if(varDesenvolvimentoPermanente==0)
				layDesenvolvimentoPermanente.setVisibility(View.GONE);

		}

		public void atualizarCalculo(int habilidade, String nomeDaHabilidade, int pontosMax, int classe, String acao){
			if (acao=="Aumentar"){

				if (habilidade < pontosMax){

					if (classe==1){
						if (primeiraClasse>0){
							primeiraClasse--;
							skillPrimeira++;
							habilidade++;
						} else {
							Toast.makeText(this, "0 pontos disponiveis", Toast.LENGTH_LONG).show();
						}

					}

				}

			} else if (acao=="Diminuir"){
				boolean podeDiminuir = true;

				if (nomeDaHabilidade=="Regeneracao" && varChamadoUrgente>=1 && varRegeneracao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ComandarGuardioes" && varChamadoUrgente>=1 && varComandarGuardioes<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ExpandirCla" && varRegeneracao>=1 && varExpandirCla<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ComandoDeBatalha" && varRegeneracao>=1 && varComandoDeBatalha<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Regeneracao" && varRestauracao>=1 && varRegeneracao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ExpandirCla" && varComandoDeBatalha>=1 && varExpandirCla<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AutorizacaoOficial" && varComandoDeBatalha>=1 && varAutorizacaoOficial<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AutorizacaoOficial" && varContratoComKafra>=1 && varAutorizacaoOficial<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AutorizacaoOficial" && varComandarGuardioes>=1 && varAutorizacaoOficial<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FerimentosDeGloria" && varCoracaoFrio>=1 && varFerimentosDeGloria<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="GrandeLideranca" && varOlharApurado>=1 && varGrandeLideranca<=01){
					podeDiminuir = false;
				}


				if(podeDiminuir){
					if (habilidade>0){
						habilidade--;

						if (classe==1){
							if (skillPrimeira>0 && skillPrimeira<=49 && primeiraClasse <49){
								primeiraClasse++;
							}
							skillPrimeira--;
						}
					}

				} else {
					Toast.makeText(this, "Essa Habilidade é pré requisito de outra já aprendia", Toast.LENGTH_LONG).show();
				}

				podeDiminuir=true;
			}
			if(nomeDaHabilidade=="ChamadoUrgente"){
				varChamadoUrgente = habilidade;
			} else if(nomeDaHabilidade=="Regeneracao"){
				varRegeneracao = habilidade;
			} else if(nomeDaHabilidade=="Restauracao"){
				varRestauracao = habilidade;
			} else if(nomeDaHabilidade=="ComandoDeBatalha"){
				varComandoDeBatalha = habilidade;
			} else if(nomeDaHabilidade=="AutorizacaoOficial"){
				varAutorizacaoOficial = habilidade;
			} else if(nomeDaHabilidade=="ContratoComKafra"){
				varContratoComKafra = habilidade;
			} else if(nomeDaHabilidade=="ComandarGuardioes"){
				varComandarGuardioes = habilidade;
			} else if(nomeDaHabilidade=="ExpandirCla"){
				varExpandirCla = habilidade;
			} else if(nomeDaHabilidade=="GrandeLideranca"){
				varGrandeLideranca = habilidade;
			} else if(nomeDaHabilidade=="FerimentosDeGloria"){
				varFerimentosDeGloria = habilidade;
			} else if(nomeDaHabilidade=="CoracaoFrio"){
				varCoracaoFrio = habilidade;
			} else if(nomeDaHabilidade=="OlharApurado"){
				varOlharApurado = habilidade;
			} else if(nomeDaHabilidade=="FortalecerGuardioes"){
				varFortalecerGuardioes = habilidade;
			} else if(nomeDaHabilidade=="DesenvolvimentoPermanente"){
				varDesenvolvimentoPermanente = habilidade;
			}

			atualizarTela();

		}

		public void atualizarTela(){
			txtChamadoUrgentePontos.setText(varChamadoUrgente + "/1");
			txtRegeneracaoPontos.setText(varRegeneracao + "/3");
			txtRestauracaoPontos.setText(varRestauracao + "/1");
			txtComandoDeBatalhaPontos.setText(varComandoDeBatalha + "/1");
			txtAutorizacaoOficialPontos.setText(varAutorizacaoOficial + "/1");
			txtContratoComKafraPontos.setText(varContratoComKafra + "/1");
			txtComandarGuardioesPontos.setText(varComandarGuardioes + "/1");
			txtExpandirClaPontos.setText(varExpandirCla + "/10");
			txtGrandeLiderancaPontos.setText(varGrandeLideranca + "/5");
			txtFerimentosDeGloriaPontos.setText(varFerimentosDeGloria + "/5");
			txtCoracaoFrioPontos.setText(varCoracaoFrio + "/5");
			txtOlharApuradoPontos.setText(varOlharApurado + "/5");
			txtFortalecerGuardioesPontos.setText(varFortalecerGuardioes + "/3");
			txtDesenvolvimentoPermanentePontos.setText(varDesenvolvimentoPermanente + "/1");

			txtClasse1.setText("Pontos: " + primeiraClasse);

			tudoVisivel();
		}

		public void tudoVisivel(){
			layChamadoUrgente.setVisibility(View.VISIBLE);
			layRegeneracao.setVisibility(View.VISIBLE);
			layRestauracao.setVisibility(View.VISIBLE);
			layComandoDeBatalha.setVisibility(View.VISIBLE);
			layAutorizacaoOficial.setVisibility(View.VISIBLE);
			layContratoComKafra.setVisibility(View.VISIBLE);
			layComandarGuardioes.setVisibility(View.VISIBLE);
			layExpandirCla.setVisibility(View.VISIBLE);
			layGrandeLideranca.setVisibility(View.VISIBLE);
			layFerimentosDeGloria.setVisibility(View.VISIBLE);
			layCoracaoFrio.setVisibility(View.VISIBLE);
			layOlharApurado.setVisibility(View.VISIBLE);
			layFortalecerGuardioes.setVisibility(View.VISIBLE);
			layDesenvolvimentoPermanente.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM cla WHERE _id = ?", new String[]{String.valueOf(id)});

			if(cs.moveToFirst()){
			primeiraClasse = cs.getInt(2);

			varChamadoUrgente = cs.getInt(3);
			varRegeneracao = cs.getInt(4);
			varRestauracao = cs.getInt(5);
			varComandoDeBatalha = cs.getInt(6);
			varAutorizacaoOficial = cs.getInt(7);
			varContratoComKafra = cs.getInt(8);
			varComandarGuardioes = cs.getInt(9);
			varExpandirCla = cs.getInt(10);
			varGrandeLideranca = cs.getInt(11);
			varFerimentosDeGloria = cs.getInt(12);
			varCoracaoFrio = cs.getInt(13);
			varOlharApurado = cs.getInt(14);
			varFortalecerGuardioes = cs.getInt(15);
			varDesenvolvimentoPermanente = cs.getInt(16);

			skillPrimeira = cs.getInt(16);
			}
			db.close();
			} catch (Exception e) {
				Toast.makeText(getBaseContext(), "Erro ao recarregar simulação!",
						Toast.LENGTH_LONG).show();
			}
			atualizarTela();
			tgbtSomenteHabilidadeAprendida.performClick();
			somenteHabilidadeAprendida();

		}

			public void salvarNoDB(boolean novo, String nomeDaSim){
				try {
					SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
					StringBuilder sqlClasse = new StringBuilder();
					sqlClasse.append("CREATE TABLE IF NOT EXISTS cla (");
					sqlClasse.append("_id INTEGER PRIMARY KEY, ");
					sqlClasse.append("nome VARCHAR(30), ");
					sqlClasse.append("primeira_classe INT(2), ");
					sqlClasse.append("skill_chamadourgente INT(2), ");
					sqlClasse.append("skill_regeneracao INT(2), ");
					sqlClasse.append("skill_restauracao INT(2), ");
					sqlClasse.append("skill_comandodebatalha INT(2), ");
					sqlClasse.append("skill_autorizacaooficial INT(2), ");
					sqlClasse.append("skill_contratocomkafra INT(2), ");
					sqlClasse.append("skill_comandarguardioes INT(2), ");
					sqlClasse.append("skill_expandircla INT(2), ");
					sqlClasse.append("skill_grandelideranca INT(2), ");
					sqlClasse.append("skill_ferimentosdegloria INT(2), ");
					sqlClasse.append("skill_coracaofrio INT(2), ");
					sqlClasse.append("skill_olharapurado INT(2), ");
					sqlClasse.append("skill_fortalecerguardioes INT(2), ");
					sqlClasse.append("skill_desenvolvimentopermanente INT(2), ");
					sqlClasse.append("skill_primeira INT(2));");
					db.execSQL(sqlClasse.toString());

					ContentValues ins = new ContentValues();
					ins.put("nome", nomeDaSim);
					ins.put("primeira_classe", primeiraClasse);
					ins.put("skill_chamadourgente", varChamadoUrgente);
					ins.put("skill_regeneracao", varRegeneracao);
					ins.put("skill_restauracao", varRestauracao);
					ins.put("skill_comandodebatalha", varComandoDeBatalha);
					ins.put("skill_autorizacaooficial", varAutorizacaoOficial);
					ins.put("skill_contratocomkafra", varContratoComKafra);
					ins.put("skill_comandarguardioes", varComandarGuardioes);
					ins.put("skill_expandircla", varExpandirCla);
					ins.put("skill_grandelideranca", varGrandeLideranca);
					ins.put("skill_ferimentosdegloria", varFerimentosDeGloria);
					ins.put("skill_coracaofrio", varCoracaoFrio);
					ins.put("skill_olharapurado", varOlharApurado);
					ins.put("skill_fortalecerguardioes", varFortalecerGuardioes);
					ins.put("skill_desenvolvimentopermanente", varDesenvolvimentoPermanente);
					ins.put("skill_primeira", skillPrimeira);
					if(!novo){
						try {
							db.update("cla", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("cla", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from cla", null);
						cs.moveToLast();

						int idSimulacao = (int) cs.getInt(cs.getColumnIndex("_id"));

						StringBuilder sqlGeral = new StringBuilder();
						sqlGeral.append("CREATE TABLE IF NOT EXISTS simulacoes_de_classes (");
						sqlGeral.append("_id INTEGER PRIMARY KEY, ");
						sqlGeral.append("nome VARCHAR(30), ");
						sqlGeral.append("classe VARCHAR(30), ");
						sqlGeral.append("idSimulacao int(4));");
						db.execSQL(sqlGeral.toString());

						ContentValues ins2 = new ContentValues();
						ins2.put("nome", nomeDaSim);
						ins2.put("classe", "cla");
						ins2.put("idSimulacao", idSimulacao);

						if (db.insert("simulacoes_de_classes", "_id", ins2) > 0) {
							Toast.makeText(getBaseContext(), "Salvo com sucesso!",
									Toast.LENGTH_SHORT).show();
						} else {
							Toast.makeText(getBaseContext(),
									"Erro ao salvar!", Toast.LENGTH_SHORT)
									.show();
						}

						db.close();

					} else {
						Toast.makeText(getBaseContext(),
								"Erro ao salvar!", Toast.LENGTH_SHORT)
								.show();
					}
				}
					db.close();


				} catch (Exception e){
					Toast.makeText(getBaseContext(), "Erro no database!!", Toast.LENGTH_SHORT).show();
				}
			}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.simulador_cla, menu);
			return true;
		}

	}