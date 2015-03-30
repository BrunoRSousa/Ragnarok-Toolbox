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

public class SimuladorJusticeiro extends Activity {

		//Botões de interrogação
		Button btCaraOuCoroaInterrogacao,
		btAtirarMoedasInterrogacao,
		btBalaMagicaInterrogacao,
		btTiroBombinhaInterrogacao,
		btAtaqueTriploInterrogacao,
		btAtaqueCerteiroInterrogacao,
		btAumentarPrecisaoInterrogacao,
		btOlhosDeSerpenteInterrogacao,
		btAtaqueConcentradoInterrogacao,
		btResistenciaFinalInterrogacao,
		btPanicoDoJusticeiroInterrogacao,
		btReacaoEmCadeiaInterrogacao,
		btRajadaCerteiraInterrogacao,
		btDesperadoInterrogacao,
		btAtaqueGatlingInterrogacao,
		btRastrearAlvoInterrogacao,
		btDesarmarInterrogacao,
		btFerirAlvoInterrogacao,
		btControleDeMultidaoInterrogacao,
		btAtaqueTotalInterrogacao,
		btDisparoEspalhadoInterrogacao,
		btMinaDoJusticeiroInterrogacao;

		//Botões de diminuir habilidades
		Button btCaraOuCoroaDiminuir,
		btAtirarMoedasDiminuir,
		btBalaMagicaDiminuir,
		btTiroBombinhaDiminuir,
		btAtaqueTriploDiminuir,
		btAtaqueCerteiroDiminuir,
		btAumentarPrecisaoDiminuir,
		btOlhosDeSerpenteDiminuir,
		btAtaqueConcentradoDiminuir,
		btResistenciaFinalDiminuir,
		btPanicoDoJusticeiroDiminuir,
		btReacaoEmCadeiaDiminuir,
		btRajadaCerteiraDiminuir,
		btDesperadoDiminuir,
		btAtaqueGatlingDiminuir,
		btRastrearAlvoDiminuir,
		btDesarmarDiminuir,
		btFerirAlvoDiminuir,
		btControleDeMultidaoDiminuir,
		btAtaqueTotalDiminuir,
		btDisparoEspalhadoDiminuir,
		btMinaDoJusticeiroDiminuir;

		//Botões de aumentar habilidades
		Button btCaraOuCoroaAumentar,
		btAtirarMoedasAumentar,
		btBalaMagicaAumentar,
		btTiroBombinhaAumentar,
		btAtaqueTriploAumentar,
		btAtaqueCerteiroAumentar,
		btAumentarPrecisaoAumentar,
		btOlhosDeSerpenteAumentar,
		btAtaqueConcentradoAumentar,
		btResistenciaFinalAumentar,
		btPanicoDoJusticeiroAumentar,
		btReacaoEmCadeiaAumentar,
		btRajadaCerteiraAumentar,
		btDesperadoAumentar,
		btAtaqueGatlingAumentar,
		btRastrearAlvoAumentar,
		btDesarmarAumentar,
		btFerirAlvoAumentar,
		btControleDeMultidaoAumentar,
		btAtaqueTotalAumentar,
		btDisparoEspalhadoAumentar,
		btMinaDoJusticeiroAumentar;

		//Resto dos botões
		Button btResetar, btSalvar;
		ToggleButton tgbtSomenteHabilidadeAprendida;


		//Txt pontos da tela
		TextView txtCaraOuCoroaPontos,
		txtAtirarMoedasPontos,
		txtBalaMagicaPontos,
		txtTiroBombinhaPontos,
		txtAtaqueTriploPontos,
		txtAtaqueCerteiroPontos,
		txtAumentarPrecisaoPontos,
		txtOlhosDeSerpentePontos,
		txtAtaqueConcentradoPontos,
		txtResistenciaFinalPontos,
		txtPanicoDoJusticeiroPontos,
		txtReacaoEmCadeiaPontos,
		txtRajadaCerteiraPontos,
		txtDesperadoPontos,
		txtAtaqueGatlingPontos,
		txtRastrearAlvoPontos,
		txtDesarmarPontos,
		txtFerirAlvoPontos,
		txtControleDeMultidaoPontos,
		txtAtaqueTotalPontos,
		txtDisparoEspalhadoPontos,
		txtMinaDoJusticeiroPontos;

		//Txt pontos restantes
		TextView txtClasse1;

		//Layouts
		LinearLayout layCaraOuCoroa,
		layAtirarMoedas,
		layBalaMagica,
		layTiroBombinha,
		layAtaqueTriplo,
		layAtaqueCerteiro,
		layAumentarPrecisao,
		layOlhosDeSerpente,
		layAtaqueConcentrado,
		layResistenciaFinal,
		layPanicoDoJusticeiro,
		layReacaoEmCadeia,
		layRajadaCerteira,
		layDesperado,
		layAtaqueGatling,
		layRastrearAlvo,
		layDesarmar,
		layFerirAlvo,
		layControleDeMultidao,
		layAtaqueTotal,
		layDisparoEspalhado,
		layMinaDoJusticeiro;

		//Variaveis de Skill
		int varCaraOuCoroa,
		varAtirarMoedas,
		varBalaMagica,
		varTiroBombinha,
		varAtaqueTriplo,
		varAtaqueCerteiro,
		varAumentarPrecisao,
		varOlhosDeSerpente,
		varAtaqueConcentrado,
		varResistenciaFinal,
		varPanicoDoJusticeiro,
		varReacaoEmCadeia,
		varRajadaCerteira,
		varDesperado,
		varAtaqueGatling,
		varRastrearAlvo,
		varDesarmar,
		varFerirAlvo,
		varControleDeMultidao,
		varAtaqueTotal,
		varDisparoEspalhado,
		varMinaDoJusticeiro;

		//variavel para alteração do db
		String idParaAlterar;

		//Variaveis de ponto
		int primeiraClasse;

		int skillPrimeira;

		int count;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_simulador_justiceiro);

			Intent it = getIntent();

			final int id = it.getIntExtra("id", 0);
			idParaAlterar = "_id =" +id;

			//inicialização de variáveis
			varCaraOuCoroa = 0;
			varAtirarMoedas = 0;
			varBalaMagica = 0;
			varTiroBombinha = 0;
			varAtaqueTriplo = 0;
			varAtaqueCerteiro = 0;
			varAumentarPrecisao = 0;
			varOlhosDeSerpente = 0;
			varAtaqueConcentrado = 0;
			varResistenciaFinal = 0;
			varPanicoDoJusticeiro = 0;
			varReacaoEmCadeia = 0;
			varRajadaCerteira = 0;
			varDesperado = 0;
			varAtaqueGatling = 0;
			varRastrearAlvo = 0;
			varDesarmar = 0;
			varFerirAlvo = 0;
			varControleDeMultidao = 0;
			varAtaqueTotal = 0;
			varDisparoEspalhado = 0;
			varMinaDoJusticeiro = 0;



			primeiraClasse = 69;

			skillPrimeira = 0;

			count = 0;


			//Botões de interrogações
			btCaraOuCoroaInterrogacao = (Button) findViewById(R.id.btCaraOuCoroaInterrogacao);
			btAtirarMoedasInterrogacao = (Button) findViewById(R.id.btAtirarMoedasInterrogacao);
			btBalaMagicaInterrogacao = (Button) findViewById(R.id.btBalaMagicaInterrogacao);
			btTiroBombinhaInterrogacao = (Button) findViewById(R.id.btTiroBombinhaInterrogacao);
			btAtaqueTriploInterrogacao = (Button) findViewById(R.id.btAtaqueTriploInterrogacao);
			btAtaqueCerteiroInterrogacao = (Button) findViewById(R.id.btAtaqueCerteiroInterrogacao);
			btAumentarPrecisaoInterrogacao = (Button) findViewById(R.id.btAumentarPrecisaoInterrogacao);
			btOlhosDeSerpenteInterrogacao = (Button) findViewById(R.id.btOlhosDeSerpenteInterrogacao);
			btAtaqueConcentradoInterrogacao = (Button) findViewById(R.id.btAtaqueConcentradoInterrogacao);
			btResistenciaFinalInterrogacao = (Button) findViewById(R.id.btResistenciaFinalInterrogacao);
			btPanicoDoJusticeiroInterrogacao = (Button) findViewById(R.id.btPanicoDoJusticeiroInterrogacao);
			btReacaoEmCadeiaInterrogacao = (Button) findViewById(R.id.btReacaoEmCadeiaInterrogacao);
			btRajadaCerteiraInterrogacao = (Button) findViewById(R.id.btRajadaCerteiraInterrogacao);
			btDesperadoInterrogacao = (Button) findViewById(R.id.btDesperadoInterrogacao);
			btAtaqueGatlingInterrogacao = (Button) findViewById(R.id.btAtaqueGatlingInterrogacao);
			btRastrearAlvoInterrogacao = (Button) findViewById(R.id.btRastrearAlvoInterrogacao);
			btDesarmarInterrogacao = (Button) findViewById(R.id.btDesarmarInterrogacao);
			btFerirAlvoInterrogacao = (Button) findViewById(R.id.btFerirAlvoInterrogacao);
			btControleDeMultidaoInterrogacao = (Button) findViewById(R.id.btControleDeMultidaoInterrogacao);
			btAtaqueTotalInterrogacao = (Button) findViewById(R.id.btAtaqueTotalInterrogacao);
			btDisparoEspalhadoInterrogacao = (Button) findViewById(R.id.btDisparoEspalhadoInterrogacao);
			btMinaDoJusticeiroInterrogacao = (Button) findViewById(R.id.btMinaDoJusticeiroInterrogacao);

			//Botões de diminuir habilidades
			btCaraOuCoroaDiminuir = (Button) findViewById(R.id.btCaraOuCoroaDiminuir);
			btAtirarMoedasDiminuir = (Button) findViewById(R.id.btAtirarMoedasDiminuir);
			btBalaMagicaDiminuir = (Button) findViewById(R.id.btBalaMagicaDiminuir);
			btTiroBombinhaDiminuir = (Button) findViewById(R.id.btTiroBombinhaDiminuir);
			btAtaqueTriploDiminuir = (Button) findViewById(R.id.btAtaqueTriploDiminuir);
			btAtaqueCerteiroDiminuir = (Button) findViewById(R.id.btAtaqueCerteiroDiminuir);
			btAumentarPrecisaoDiminuir = (Button) findViewById(R.id.btAumentarPrecisaoDiminuir);
			btOlhosDeSerpenteDiminuir = (Button) findViewById(R.id.btOlhosDeSerpenteDiminuir);
			btAtaqueConcentradoDiminuir = (Button) findViewById(R.id.btAtaqueConcentradoDiminuir);
			btResistenciaFinalDiminuir = (Button) findViewById(R.id.btResistenciaFinalDiminuir);
			btPanicoDoJusticeiroDiminuir = (Button) findViewById(R.id.btPanicoDoJusticeiroDiminuir);
			btReacaoEmCadeiaDiminuir = (Button) findViewById(R.id.btReacaoEmCadeiaDiminuir);
			btRajadaCerteiraDiminuir = (Button) findViewById(R.id.btRajadaCerteiraDiminuir);
			btDesperadoDiminuir = (Button) findViewById(R.id.btDesperadoDiminuir);
			btAtaqueGatlingDiminuir = (Button) findViewById(R.id.btAtaqueGatlingDiminuir);
			btRastrearAlvoDiminuir = (Button) findViewById(R.id.btRastrearAlvoDiminuir);
			btDesarmarDiminuir = (Button) findViewById(R.id.btDesarmarDiminuir);
			btFerirAlvoDiminuir = (Button) findViewById(R.id.btFerirAlvoDiminuir);
			btControleDeMultidaoDiminuir = (Button) findViewById(R.id.btControleDeMultidaoDiminuir);
			btAtaqueTotalDiminuir = (Button) findViewById(R.id.btAtaqueTotalDiminuir);
			btDisparoEspalhadoDiminuir = (Button) findViewById(R.id.btDisparoEspalhadoDiminuir);
			btMinaDoJusticeiroDiminuir = (Button) findViewById(R.id.btMinaDoJusticeiroDiminuir);

			//Botões de aumentar habilidades
			btCaraOuCoroaAumentar = (Button) findViewById(R.id.btCaraOuCoroaAumentar);
			btAtirarMoedasAumentar = (Button) findViewById(R.id.btAtirarMoedasAumentar);
			btBalaMagicaAumentar = (Button) findViewById(R.id.btBalaMagicaAumentar);
			btTiroBombinhaAumentar = (Button) findViewById(R.id.btTiroBombinhaAumentar);
			btAtaqueTriploAumentar = (Button) findViewById(R.id.btAtaqueTriploAumentar);
			btAtaqueCerteiroAumentar = (Button) findViewById(R.id.btAtaqueCerteiroAumentar);
			btAumentarPrecisaoAumentar = (Button) findViewById(R.id.btAumentarPrecisaoAumentar);
			btOlhosDeSerpenteAumentar = (Button) findViewById(R.id.btOlhosDeSerpenteAumentar);
			btAtaqueConcentradoAumentar = (Button) findViewById(R.id.btAtaqueConcentradoAumentar);
			btResistenciaFinalAumentar = (Button) findViewById(R.id.btResistenciaFinalAumentar);
			btPanicoDoJusticeiroAumentar = (Button) findViewById(R.id.btPanicoDoJusticeiroAumentar);
			btReacaoEmCadeiaAumentar = (Button) findViewById(R.id.btReacaoEmCadeiaAumentar);
			btRajadaCerteiraAumentar = (Button) findViewById(R.id.btRajadaCerteiraAumentar);
			btDesperadoAumentar = (Button) findViewById(R.id.btDesperadoAumentar);
			btAtaqueGatlingAumentar = (Button) findViewById(R.id.btAtaqueGatlingAumentar);
			btRastrearAlvoAumentar = (Button) findViewById(R.id.btRastrearAlvoAumentar);
			btDesarmarAumentar = (Button) findViewById(R.id.btDesarmarAumentar);
			btFerirAlvoAumentar = (Button) findViewById(R.id.btFerirAlvoAumentar);
			btControleDeMultidaoAumentar = (Button) findViewById(R.id.btControleDeMultidaoAumentar);
			btAtaqueTotalAumentar = (Button) findViewById(R.id.btAtaqueTotalAumentar);
			btDisparoEspalhadoAumentar = (Button) findViewById(R.id.btDisparoEspalhadoAumentar);
			btMinaDoJusticeiroAumentar = (Button) findViewById(R.id.btMinaDoJusticeiroAumentar);

			//Resto dos botões
			btResetar = (Button) findViewById(R.id.btResetar);
			btSalvar = (Button) findViewById(R.id.btSalvar);
			tgbtSomenteHabilidadeAprendida = (ToggleButton) findViewById(R.id.tgbtSomenteHabilidadeAprendida);

			//Txt pontos da tela
			txtCaraOuCoroaPontos = (TextView) findViewById(R.id.txtCaraOuCoroaPontos);
			txtAtirarMoedasPontos = (TextView) findViewById(R.id.txtAtirarMoedasPontos);
			txtBalaMagicaPontos = (TextView) findViewById(R.id.txtBalaMagicaPontos);
			txtTiroBombinhaPontos = (TextView) findViewById(R.id.txtTiroBombinhaPontos);
			txtAtaqueTriploPontos = (TextView) findViewById(R.id.txtAtaqueTriploPontos);
			txtAtaqueCerteiroPontos = (TextView) findViewById(R.id.txtAtaqueCerteiroPontos);
			txtAumentarPrecisaoPontos = (TextView) findViewById(R.id.txtAumentarPrecisaoPontos);
			txtOlhosDeSerpentePontos = (TextView) findViewById(R.id.txtOlhosDeSerpentePontos);
			txtAtaqueConcentradoPontos = (TextView) findViewById(R.id.txtAtaqueConcentradoPontos);
			txtResistenciaFinalPontos = (TextView) findViewById(R.id.txtResistenciaFinalPontos);
			txtPanicoDoJusticeiroPontos = (TextView) findViewById(R.id.txtPanicoDoJusticeiroPontos);
			txtReacaoEmCadeiaPontos = (TextView) findViewById(R.id.txtReacaoEmCadeiaPontos);
			txtRajadaCerteiraPontos = (TextView) findViewById(R.id.txtRajadaCerteiraPontos);
			txtDesperadoPontos = (TextView) findViewById(R.id.txtDesperadoPontos);
			txtAtaqueGatlingPontos = (TextView) findViewById(R.id.txtAtaqueGatlingPontos);
			txtRastrearAlvoPontos = (TextView) findViewById(R.id.txtRastrearAlvoPontos);
			txtDesarmarPontos = (TextView) findViewById(R.id.txtDesarmarPontos);
			txtFerirAlvoPontos = (TextView) findViewById(R.id.txtFerirAlvoPontos);
			txtControleDeMultidaoPontos = (TextView) findViewById(R.id.txtControleDeMultidaoPontos);
			txtAtaqueTotalPontos = (TextView) findViewById(R.id.txtAtaqueTotalPontos);
			txtDisparoEspalhadoPontos = (TextView) findViewById(R.id.txtDisparoEspalhadoPontos);
			txtMinaDoJusticeiroPontos = (TextView) findViewById(R.id.txtMinaDoJusticeiroPontos);

			//Txt pontos restantes
			txtClasse1 = (TextView) findViewById(R.id.txtClasse1);

			//Layouts
			layCaraOuCoroa = (LinearLayout) findViewById(R.id.layCaraOuCoroa);
			layAtirarMoedas = (LinearLayout) findViewById(R.id.layAtirarMoedas);
			layBalaMagica = (LinearLayout) findViewById(R.id.layBalaMagica);
			layTiroBombinha = (LinearLayout) findViewById(R.id.layTiroBombinha);
			layAtaqueTriplo = (LinearLayout) findViewById(R.id.layAtaqueTriplo);
			layAtaqueCerteiro = (LinearLayout) findViewById(R.id.layAtaqueCerteiro);
			layAumentarPrecisao = (LinearLayout) findViewById(R.id.layAumentarPrecisao);
			layOlhosDeSerpente = (LinearLayout) findViewById(R.id.layOlhosDeSerpente);
			layAtaqueConcentrado = (LinearLayout) findViewById(R.id.layAtaqueConcentrado);
			layResistenciaFinal = (LinearLayout) findViewById(R.id.layResistenciaFinal);
			layPanicoDoJusticeiro = (LinearLayout) findViewById(R.id.layPanicoDoJusticeiro);
			layReacaoEmCadeia = (LinearLayout) findViewById(R.id.layReacaoEmCadeia);
			layRajadaCerteira = (LinearLayout) findViewById(R.id.layRajadaCerteira);
			layDesperado = (LinearLayout) findViewById(R.id.layDesperado);
			layAtaqueGatling = (LinearLayout) findViewById(R.id.layAtaqueGatling);
			layRastrearAlvo = (LinearLayout) findViewById(R.id.layRastrearAlvo);
			layDesarmar = (LinearLayout) findViewById(R.id.layDesarmar);
			layFerirAlvo = (LinearLayout) findViewById(R.id.layFerirAlvo);
			layControleDeMultidao = (LinearLayout) findViewById(R.id.layControleDeMultidao);
			layAtaqueTotal = (LinearLayout) findViewById(R.id.layAtaqueTotal);
			layDisparoEspalhado = (LinearLayout) findViewById(R.id.layDisparoEspalhado);
			layMinaDoJusticeiro = (LinearLayout) findViewById(R.id.layMinaDoJusticeiro);

			if (id>0)
				recarregarBuild(id);


			//Eventos de informação
			btCaraOuCoroaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Cara Ou Coroa");
					dialogo.setMessage(R.string.caraOuCoroaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtirarMoedasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Atirar Moedas");
					dialogo.setMessage(R.string.atirarMoedasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBalaMagicaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Bala Mágica");
					dialogo.setMessage(R.string.balaMagicaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTiroBombinhaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Tiro Bombinha");
					dialogo.setMessage(R.string.tiroBombinhaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueTriploInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Ataque Triplo");
					dialogo.setMessage(R.string.ataqueTriploInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueCerteiroInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Ataque Certeiro");
					dialogo.setMessage(R.string.ataqueCerteiroInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAumentarPrecisaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Aumentar Precisão");
					dialogo.setMessage(R.string.aumentarPrecisaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOlhosDeSerpenteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Olhos De Serpente");
					dialogo.setMessage(R.string.olhosDeSerpenteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueConcentradoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Ataque Concentrado");
					dialogo.setMessage(R.string.ataqueConcentradoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btResistenciaFinalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Resistência Final");
					dialogo.setMessage(R.string.resistenciaFinalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPanicoDoJusticeiroInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Pânico Do Justiceiro");
					dialogo.setMessage(R.string.panicoDoJusticeiroInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btReacaoEmCadeiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Reação Em Cadeia");
					dialogo.setMessage(R.string.reacaoEmCadeiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRajadaCerteiraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Rajada Certeira");
					dialogo.setMessage(R.string.rajadaCerteiraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDesperadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Desperado");
					dialogo.setMessage(R.string.desperadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueGatlingInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Ataque Gatling");
					dialogo.setMessage(R.string.ataqueGatlingInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRastrearAlvoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Rastrear Alvo");
					dialogo.setMessage(R.string.rastrearAlvoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDesarmarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Desarmar");
					dialogo.setMessage(R.string.desarmarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFerirAlvoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Ferir Alvo");
					dialogo.setMessage(R.string.ferirAlvoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btControleDeMultidaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Controle De Multidão");
					dialogo.setMessage(R.string.controleDeMultidaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueTotalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Ataque Total");
					dialogo.setMessage(R.string.ataqueTotalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDisparoEspalhadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Disparo Espalhado");
					dialogo.setMessage(R.string.disparoEspalhadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMinaDoJusticeiroInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorJusticeiro.this);
					dialogo.setTitle("Mina Do Justiceiro");
					dialogo.setMessage(R.string.minaDoJusticeiroInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});


			//Eventos de aumentar
			btCaraOuCoroaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCaraOuCoroa, "CaraOuCoroa", 5, 1, "Aumentar");

				}
			});
			btAtirarMoedasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCaraOuCoroa<1 && count<1){
						atualizarCalculo(varCaraOuCoroa, "CaraOuCoroa", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAtirarMoedas, "AtirarMoedas", 1, 1, "Aumentar");

				}
			});
			btBalaMagicaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCaraOuCoroa<1 && count<1){
						atualizarCalculo(varCaraOuCoroa, "CaraOuCoroa", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBalaMagica, "BalaMagica", 1, 1, "Aumentar");

				}
			});
			btTiroBombinhaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCaraOuCoroa<1 && count<1){
						atualizarCalculo(varCaraOuCoroa, "CaraOuCoroa", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTiroBombinha, "TiroBombinha", 1, 1, "Aumentar");

				}
			});
			btAtaqueTriploAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCaraOuCoroa<1 && count<1){
						atualizarCalculo(varCaraOuCoroa, "CaraOuCoroa", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueConcentrado<1 && count<1){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varReacaoEmCadeia<10 && count<10){
						atualizarCalculo(varReacaoEmCadeia, "ReacaoEmCadeia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAtaqueTriplo, "AtaqueTriplo", 1, 1, "Aumentar");

				}
			});
			btAtaqueCerteiroAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueConcentrado<5 && count<5){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRastrearAlvo<10 && count<10){
						atualizarCalculo(varRastrearAlvo, "RastrearAlvo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varCaraOuCoroa<5 && count<5){
						atualizarCalculo(varCaraOuCoroa, "CaraOuCoroa", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAtaqueCerteiro, "AtaqueCerteiro", 1, 1, "Aumentar");

				}
			});
			btAumentarPrecisaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCaraOuCoroa<2 && count<2){
						atualizarCalculo(varCaraOuCoroa, "CaraOuCoroa", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varOlhosDeSerpente<10 && count<10){
						atualizarCalculo(varOlhosDeSerpente, "OlhosDeSerpente", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAumentarPrecisao, "AumentarPrecisao", 1, 1, "Aumentar");

				}
			});
			btOlhosDeSerpenteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOlhosDeSerpente, "OlhosDeSerpente", 10, 1, "Aumentar");

				}
			});
			btAtaqueConcentradoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");

				}
			});
			btResistenciaFinalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCaraOuCoroa<4 && count<4){
						atualizarCalculo(varCaraOuCoroa, "CaraOuCoroa", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueConcentrado<1 && count<1){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varReacaoEmCadeia<3 && count<3){
						atualizarCalculo(varReacaoEmCadeia, "ReacaoEmCadeia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaCerteira<5 && count<5){
						atualizarCalculo(varRajadaCerteira, "RajadaCerteira", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesperado<5 && count<5){
						atualizarCalculo(varDesperado, "Desperado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueConcentrado<1 && count<1){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varReacaoEmCadeia<3 && count<3){
						atualizarCalculo(varReacaoEmCadeia, "ReacaoEmCadeia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaCerteira<7 && count<7){
						atualizarCalculo(varRajadaCerteira, "RajadaCerteira", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueGatling<10 && count<10){
						atualizarCalculo(varAtaqueGatling, "AtaqueGatling", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varResistenciaFinal, "ResistenciaFinal", 1, 1, "Aumentar");

				}
			});
			btPanicoDoJusticeiroAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueConcentrado<5 && count<5){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRastrearAlvo<7 && count<7){
						atualizarCalculo(varRastrearAlvo, "RastrearAlvo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesarmar<5 && count<5){
						atualizarCalculo(varDesarmar, "Desarmar", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varCaraOuCoroa<4 && count<4){
						atualizarCalculo(varCaraOuCoroa, "CaraOuCoroa", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPanicoDoJusticeiro, "PanicoDoJusticeiro", 1, 1, "Aumentar");

				}
			});
			btReacaoEmCadeiaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueConcentrado<1 && count<1){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varReacaoEmCadeia, "ReacaoEmCadeia", 10, 1, "Aumentar");

				}
			});
			btRajadaCerteiraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueConcentrado<1 && count<1){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varReacaoEmCadeia<3 && count<3){
						atualizarCalculo(varReacaoEmCadeia, "ReacaoEmCadeia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRajadaCerteira, "RajadaCerteira", 10, 1, "Aumentar");

				}
			});
			btDesperadoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueConcentrado<1 && count<1){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varReacaoEmCadeia<3 && count<3){
						atualizarCalculo(varReacaoEmCadeia, "ReacaoEmCadeia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaCerteira<5 && count<5){
						atualizarCalculo(varRajadaCerteira, "RajadaCerteira", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDesperado, "Desperado", 10, 1, "Aumentar");

				}
			});
			btAtaqueGatlingAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueConcentrado<1 && count<1){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varReacaoEmCadeia<3 && count<3){
						atualizarCalculo(varReacaoEmCadeia, "ReacaoEmCadeia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaCerteira<5 && count<5){
						atualizarCalculo(varRajadaCerteira, "RajadaCerteira", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesperado<5 && count<5){
						atualizarCalculo(varDesperado, "Desperado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueConcentrado<1 && count<1){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varReacaoEmCadeia<3 && count<3){
						atualizarCalculo(varReacaoEmCadeia, "ReacaoEmCadeia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaCerteira<7 && count<7){
						atualizarCalculo(varRajadaCerteira, "RajadaCerteira", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAtaqueGatling, "AtaqueGatling", 10, 1, "Aumentar");

				}
			});
			btRastrearAlvoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueConcentrado<5 && count<5){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRastrearAlvo, "RastrearAlvo", 10, 1, "Aumentar");

				}
			});
			btDesarmarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueConcentrado<5 && count<5){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRastrearAlvo<7 && count<7){
						atualizarCalculo(varRastrearAlvo, "RastrearAlvo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDesarmar, "Desarmar", 5, 1, "Aumentar");

				}
			});
			btFerirAlvoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueConcentrado<5 && count<5){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRastrearAlvo<5 && count<5){
						atualizarCalculo(varRastrearAlvo, "RastrearAlvo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFerirAlvo, "FerirAlvo", 5, 1, "Aumentar");

				}
			});
			btControleDeMultidaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueConcentrado<5 && count<5){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varControleDeMultidao, "ControleDeMultidao", 10, 1, "Aumentar");

				}
			});
			btAtaqueTotalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueConcentrado<5 && count<5){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varControleDeMultidao<3 && count<3){
						atualizarCalculo(varControleDeMultidao, "ControleDeMultidao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAtaqueTotal, "AtaqueTotal", 10, 1, "Aumentar");

				}
			});
			btDisparoEspalhadoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueConcentrado<5 && count<5){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varControleDeMultidao<3 && count<3){
						atualizarCalculo(varControleDeMultidao, "ControleDeMultidao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueTotal<5 && count<5){
						atualizarCalculo(varAtaqueTotal, "AtaqueTotal", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDisparoEspalhado, "DisparoEspalhado", 10, 1, "Aumentar");

				}
			});
			btMinaDoJusticeiroAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueConcentrado<5 && count<5){
						atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varControleDeMultidao<3 && count<3){
						atualizarCalculo(varControleDeMultidao, "ControleDeMultidao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueTotal<5 && count<5){
						atualizarCalculo(varAtaqueTotal, "AtaqueTotal", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varDisparoEspalhado<7 && count<7){
						atualizarCalculo(varDisparoEspalhado, "DisparoEspalhado", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMinaDoJusticeiro, "MinaDoJusticeiro", 10, 1, "Aumentar");

				}
			});


			//Eventos de diminuir
			btCaraOuCoroaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCaraOuCoroa, "CaraOuCoroa", 5, 1, "Diminuir");

				}
			});
			btAtirarMoedasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtirarMoedas, "AtirarMoedas", 1, 1, "Diminuir");

				}
			});
			btBalaMagicaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBalaMagica, "BalaMagica", 1, 1, "Diminuir");

				}
			});
			btTiroBombinhaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTiroBombinha, "TiroBombinha", 1, 1, "Diminuir");

				}
			});
			btAtaqueTriploDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtaqueTriplo, "AtaqueTriplo", 1, 1, "Diminuir");

				}
			});
			btAtaqueCerteiroDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtaqueCerteiro, "AtaqueCerteiro", 1, 1, "Diminuir");

				}
			});
			btAumentarPrecisaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAumentarPrecisao, "AumentarPrecisao", 1, 1, "Diminuir");

				}
			});
			btOlhosDeSerpenteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOlhosDeSerpente, "OlhosDeSerpente", 10, 1, "Diminuir");

				}
			});
			btAtaqueConcentradoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtaqueConcentrado, "AtaqueConcentrado", 10, 1, "Diminuir");

				}
			});
			btResistenciaFinalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varResistenciaFinal, "ResistenciaFinal", 1, 1, "Diminuir");

				}
			});
			btPanicoDoJusticeiroDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPanicoDoJusticeiro, "PanicoDoJusticeiro", 1, 1, "Diminuir");

				}
			});
			btReacaoEmCadeiaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varReacaoEmCadeia, "ReacaoEmCadeia", 10, 1, "Diminuir");

				}
			});
			btRajadaCerteiraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRajadaCerteira, "RajadaCerteira", 10, 1, "Diminuir");

				}
			});
			btDesperadoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDesperado, "Desperado", 10, 1, "Diminuir");

				}
			});
			btAtaqueGatlingDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtaqueGatling, "AtaqueGatling", 10, 1, "Diminuir");

				}
			});
			btRastrearAlvoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRastrearAlvo, "RastrearAlvo", 10, 1, "Diminuir");

				}
			});
			btDesarmarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDesarmar, "Desarmar", 5, 1, "Diminuir");

				}
			});
			btFerirAlvoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFerirAlvo, "FerirAlvo", 5, 1, "Diminuir");

				}
			});
			btControleDeMultidaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varControleDeMultidao, "ControleDeMultidao", 10, 1, "Diminuir");

				}
			});
			btAtaqueTotalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtaqueTotal, "AtaqueTotal", 10, 1, "Diminuir");

				}
			});
			btDisparoEspalhadoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDisparoEspalhado, "DisparoEspalhado", 10, 1, "Diminuir");

				}
			});
			btMinaDoJusticeiroDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMinaDoJusticeiro, "MinaDoJusticeiro", 10, 1, "Diminuir");

				}
			});


			//Outros Botões
			btResetar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					varCaraOuCoroa = 0;
					varAtirarMoedas = 0;
					varBalaMagica = 0;
					varTiroBombinha = 0;
					varAtaqueTriplo = 0;
					varAtaqueCerteiro = 0;
					varAumentarPrecisao = 0;
					varOlhosDeSerpente = 0;
					varAtaqueConcentrado = 0;
					varResistenciaFinal = 0;
					varPanicoDoJusticeiro = 0;
					varReacaoEmCadeia = 0;
					varRajadaCerteira = 0;
					varDesperado = 0;
					varAtaqueGatling = 0;
					varRastrearAlvo = 0;
					varDesarmar = 0;
					varFerirAlvo = 0;
					varControleDeMultidao = 0;
					varAtaqueTotal = 0;
					varDisparoEspalhado = 0;
					varMinaDoJusticeiro = 0;

					primeiraClasse = 69;

					skillPrimeira = 0;
					atualizarTela();

				}
			});

			btSalvar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					if (id > 0){
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorJusticeiro.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorJusticeiro.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorJusticeiro.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorJusticeiro.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorJusticeiro.this);
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
			if(varCaraOuCoroa==0)
				layCaraOuCoroa.setVisibility(View.GONE);
			if(varAtirarMoedas==0)
				layAtirarMoedas.setVisibility(View.GONE);
			if(varBalaMagica==0)
				layBalaMagica.setVisibility(View.GONE);
			if(varTiroBombinha==0)
				layTiroBombinha.setVisibility(View.GONE);
			if(varAtaqueTriplo==0)
				layAtaqueTriplo.setVisibility(View.GONE);
			if(varAtaqueCerteiro==0)
				layAtaqueCerteiro.setVisibility(View.GONE);
			if(varAumentarPrecisao==0)
				layAumentarPrecisao.setVisibility(View.GONE);
			if(varOlhosDeSerpente==0)
				layOlhosDeSerpente.setVisibility(View.GONE);
			if(varAtaqueConcentrado==0)
				layAtaqueConcentrado.setVisibility(View.GONE);
			if(varResistenciaFinal==0)
				layResistenciaFinal.setVisibility(View.GONE);
			if(varPanicoDoJusticeiro==0)
				layPanicoDoJusticeiro.setVisibility(View.GONE);
			if(varReacaoEmCadeia==0)
				layReacaoEmCadeia.setVisibility(View.GONE);
			if(varRajadaCerteira==0)
				layRajadaCerteira.setVisibility(View.GONE);
			if(varDesperado==0)
				layDesperado.setVisibility(View.GONE);
			if(varAtaqueGatling==0)
				layAtaqueGatling.setVisibility(View.GONE);
			if(varRastrearAlvo==0)
				layRastrearAlvo.setVisibility(View.GONE);
			if(varDesarmar==0)
				layDesarmar.setVisibility(View.GONE);
			if(varFerirAlvo==0)
				layFerirAlvo.setVisibility(View.GONE);
			if(varControleDeMultidao==0)
				layControleDeMultidao.setVisibility(View.GONE);
			if(varAtaqueTotal==0)
				layAtaqueTotal.setVisibility(View.GONE);
			if(varDisparoEspalhado==0)
				layDisparoEspalhado.setVisibility(View.GONE);
			if(varMinaDoJusticeiro==0)
				layMinaDoJusticeiro.setVisibility(View.GONE);

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

				if (nomeDaHabilidade=="CaraOuCoroa" && varAtirarMoedas>=1 && varCaraOuCoroa<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CaraOuCoroa" && varBalaMagica>=1 && varCaraOuCoroa<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CaraOuCoroa" && varTiroBombinha>=1 && varCaraOuCoroa<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CaraOuCoroa" && varAtaqueTriplo>=1 && varCaraOuCoroa<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ReacaoEmCadeia" && varAtaqueTriplo>=1 && varReacaoEmCadeia<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RastrearAlvo" && varAtaqueCerteiro>=1 && varRastrearAlvo<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CaraOuCoroa" && varAtaqueCerteiro>=1 && varCaraOuCoroa<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CaraOuCoroa" && varAumentarPrecisao>=1 && varCaraOuCoroa<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OlhosDeSerpente" && varAumentarPrecisao>=1 && varOlhosDeSerpente<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CaraOuCoroa" && varResistenciaFinal>=1 && varCaraOuCoroa<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtaqueGatling" && varResistenciaFinal>=1 && varAtaqueGatling<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Desarmar" && varPanicoDoJusticeiro>=1 && varDesarmar<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CaraOuCoroa" && varPanicoDoJusticeiro>=1 && varCaraOuCoroa<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtaqueConcentrado" && varReacaoEmCadeia>=1 && varAtaqueConcentrado<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ReacaoEmCadeia" && varRajadaCerteira>=1 && varReacaoEmCadeia<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RajadaCerteira" && varDesperado>=1 && varRajadaCerteira<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Desperado" && varAtaqueGatling>=1 && varDesperado<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RajadaCerteira" && varAtaqueGatling>=1 && varRajadaCerteira<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtaqueConcentrado" && varRastrearAlvo>=1 && varAtaqueConcentrado<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RastrearAlvo" && varDesarmar>=1 && varRastrearAlvo<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RastrearAlvo" && varFerirAlvo>=1 && varRastrearAlvo<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtaqueConcentrado" && varControleDeMultidao>=1 && varAtaqueConcentrado<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ControleDeMultidao" && varAtaqueTotal>=1 && varControleDeMultidao<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtaqueTotal" && varDisparoEspalhado>=1 && varAtaqueTotal<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DisparoEspalhado" && varMinaDoJusticeiro>=1 && varDisparoEspalhado<=07){
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
			if(nomeDaHabilidade=="CaraOuCoroa"){
				varCaraOuCoroa = habilidade;
			} else if(nomeDaHabilidade=="AtirarMoedas"){
				varAtirarMoedas = habilidade;
			} else if(nomeDaHabilidade=="BalaMagica"){
				varBalaMagica = habilidade;
			} else if(nomeDaHabilidade=="TiroBombinha"){
				varTiroBombinha = habilidade;
			} else if(nomeDaHabilidade=="AtaqueTriplo"){
				varAtaqueTriplo = habilidade;
			} else if(nomeDaHabilidade=="AtaqueCerteiro"){
				varAtaqueCerteiro = habilidade;
			} else if(nomeDaHabilidade=="AumentarPrecisao"){
				varAumentarPrecisao = habilidade;
			} else if(nomeDaHabilidade=="OlhosDeSerpente"){
				varOlhosDeSerpente = habilidade;
			} else if(nomeDaHabilidade=="AtaqueConcentrado"){
				varAtaqueConcentrado = habilidade;
			} else if(nomeDaHabilidade=="ResistenciaFinal"){
				varResistenciaFinal = habilidade;
			} else if(nomeDaHabilidade=="PanicoDoJusticeiro"){
				varPanicoDoJusticeiro = habilidade;
			} else if(nomeDaHabilidade=="ReacaoEmCadeia"){
				varReacaoEmCadeia = habilidade;
			} else if(nomeDaHabilidade=="RajadaCerteira"){
				varRajadaCerteira = habilidade;
			} else if(nomeDaHabilidade=="Desperado"){
				varDesperado = habilidade;
			} else if(nomeDaHabilidade=="AtaqueGatling"){
				varAtaqueGatling = habilidade;
			} else if(nomeDaHabilidade=="RastrearAlvo"){
				varRastrearAlvo = habilidade;
			} else if(nomeDaHabilidade=="Desarmar"){
				varDesarmar = habilidade;
			} else if(nomeDaHabilidade=="FerirAlvo"){
				varFerirAlvo = habilidade;
			} else if(nomeDaHabilidade=="ControleDeMultidao"){
				varControleDeMultidao = habilidade;
			} else if(nomeDaHabilidade=="AtaqueTotal"){
				varAtaqueTotal = habilidade;
			} else if(nomeDaHabilidade=="DisparoEspalhado"){
				varDisparoEspalhado = habilidade;
			} else if(nomeDaHabilidade=="MinaDoJusticeiro"){
				varMinaDoJusticeiro = habilidade;
			}

			atualizarTela();

		}

		public void atualizarTela(){
			txtCaraOuCoroaPontos.setText(varCaraOuCoroa + "/5");
			txtAtirarMoedasPontos.setText(varAtirarMoedas + "/1");
			txtBalaMagicaPontos.setText(varBalaMagica + "/1");
			txtTiroBombinhaPontos.setText(varTiroBombinha + "/1");
			txtAtaqueTriploPontos.setText(varAtaqueTriplo + "/1");
			txtAtaqueCerteiroPontos.setText(varAtaqueCerteiro + "/1");
			txtAumentarPrecisaoPontos.setText(varAumentarPrecisao + "/1");
			txtOlhosDeSerpentePontos.setText(varOlhosDeSerpente + "/10");
			txtAtaqueConcentradoPontos.setText(varAtaqueConcentrado + "/10");
			txtResistenciaFinalPontos.setText(varResistenciaFinal + "/1");
			txtPanicoDoJusticeiroPontos.setText(varPanicoDoJusticeiro + "/1");
			txtReacaoEmCadeiaPontos.setText(varReacaoEmCadeia + "/10");
			txtRajadaCerteiraPontos.setText(varRajadaCerteira + "/10");
			txtDesperadoPontos.setText(varDesperado + "/10");
			txtAtaqueGatlingPontos.setText(varAtaqueGatling + "/10");
			txtRastrearAlvoPontos.setText(varRastrearAlvo + "/10");
			txtDesarmarPontos.setText(varDesarmar + "/5");
			txtFerirAlvoPontos.setText(varFerirAlvo + "/5");
			txtControleDeMultidaoPontos.setText(varControleDeMultidao + "/10");
			txtAtaqueTotalPontos.setText(varAtaqueTotal + "/10");
			txtDisparoEspalhadoPontos.setText(varDisparoEspalhado + "/10");
			txtMinaDoJusticeiroPontos.setText(varMinaDoJusticeiro + "/10");

			txtClasse1.setText("Classe 1: " + primeiraClasse);

			tudoVisivel();
		}

		public void tudoVisivel(){
			layCaraOuCoroa.setVisibility(View.VISIBLE);
			layAtirarMoedas.setVisibility(View.VISIBLE);
			layBalaMagica.setVisibility(View.VISIBLE);
			layTiroBombinha.setVisibility(View.VISIBLE);
			layAtaqueTriplo.setVisibility(View.VISIBLE);
			layAtaqueCerteiro.setVisibility(View.VISIBLE);
			layAumentarPrecisao.setVisibility(View.VISIBLE);
			layOlhosDeSerpente.setVisibility(View.VISIBLE);
			layAtaqueConcentrado.setVisibility(View.VISIBLE);
			layResistenciaFinal.setVisibility(View.VISIBLE);
			layPanicoDoJusticeiro.setVisibility(View.VISIBLE);
			layReacaoEmCadeia.setVisibility(View.VISIBLE);
			layRajadaCerteira.setVisibility(View.VISIBLE);
			layDesperado.setVisibility(View.VISIBLE);
			layAtaqueGatling.setVisibility(View.VISIBLE);
			layRastrearAlvo.setVisibility(View.VISIBLE);
			layDesarmar.setVisibility(View.VISIBLE);
			layFerirAlvo.setVisibility(View.VISIBLE);
			layControleDeMultidao.setVisibility(View.VISIBLE);
			layAtaqueTotal.setVisibility(View.VISIBLE);
			layDisparoEspalhado.setVisibility(View.VISIBLE);
			layMinaDoJusticeiro.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM justiceiro WHERE _id = ?", new String[]{String.valueOf(id)});

			if(cs.moveToFirst()){
			primeiraClasse = cs.getInt(2);

			varCaraOuCoroa = cs.getInt(3);
			varAtirarMoedas = cs.getInt(4);
			varBalaMagica = cs.getInt(5);
			varTiroBombinha = cs.getInt(6);
			varAtaqueTriplo = cs.getInt(7);
			varAtaqueCerteiro = cs.getInt(8);
			varAumentarPrecisao = cs.getInt(9);
			varOlhosDeSerpente = cs.getInt(10);
			varAtaqueConcentrado = cs.getInt(11);
			varResistenciaFinal = cs.getInt(12);
			varPanicoDoJusticeiro = cs.getInt(13);
			varReacaoEmCadeia = cs.getInt(14);
			varRajadaCerteira = cs.getInt(15);
			varDesperado = cs.getInt(16);
			varAtaqueGatling = cs.getInt(17);
			varRastrearAlvo = cs.getInt(18);
			varDesarmar = cs.getInt(19);
			varFerirAlvo = cs.getInt(20);
			varControleDeMultidao = cs.getInt(21);
			varAtaqueTotal = cs.getInt(22);
			varDisparoEspalhado = cs.getInt(23);
			varMinaDoJusticeiro = cs.getInt(24);

			skillPrimeira = cs.getInt(25);
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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS justiceiro (");
					sqlClasse.append("_id INTEGER PRIMARY KEY, ");
					sqlClasse.append("nome VARCHAR(30), ");
					sqlClasse.append("primeira_classe INT(2), ");
					sqlClasse.append("skill_caraoucoroa INT(2), ");
					sqlClasse.append("skill_atirarmoedas INT(2), ");
					sqlClasse.append("skill_balamagica INT(2), ");
					sqlClasse.append("skill_tirobombinha INT(2), ");
					sqlClasse.append("skill_ataquetriplo INT(2), ");
					sqlClasse.append("skill_ataquecerteiro INT(2), ");
					sqlClasse.append("skill_aumentarprecisao INT(2), ");
					sqlClasse.append("skill_olhosdeserpente INT(2), ");
					sqlClasse.append("skill_ataqueconcentrado INT(2), ");
					sqlClasse.append("skill_resistenciafinal INT(2), ");
					sqlClasse.append("skill_panicodojusticeiro INT(2), ");
					sqlClasse.append("skill_reacaoemcadeia INT(2), ");
					sqlClasse.append("skill_rajadacerteira INT(2), ");
					sqlClasse.append("skill_desperado INT(2), ");
					sqlClasse.append("skill_ataquegatling INT(2), ");
					sqlClasse.append("skill_rastrearalvo INT(2), ");
					sqlClasse.append("skill_desarmar INT(2), ");
					sqlClasse.append("skill_feriralvo INT(2), ");
					sqlClasse.append("skill_controledemultidao INT(2), ");
					sqlClasse.append("skill_ataquetotal INT(2), ");
					sqlClasse.append("skill_disparoespalhado INT(2), ");
					sqlClasse.append("skill_minadojusticeiro INT(2), ");
					sqlClasse.append("skill_primeira INT(2));");
					db.execSQL(sqlClasse.toString());

					ContentValues ins = new ContentValues();
					ins.put("nome", nomeDaSim);
					ins.put("primeira_classe", primeiraClasse);
					ins.put("skill_caraoucoroa", varCaraOuCoroa);
					ins.put("skill_atirarmoedas", varAtirarMoedas);
					ins.put("skill_balamagica", varBalaMagica);
					ins.put("skill_tirobombinha", varTiroBombinha);
					ins.put("skill_ataquetriplo", varAtaqueTriplo);
					ins.put("skill_ataquecerteiro", varAtaqueCerteiro);
					ins.put("skill_aumentarprecisao", varAumentarPrecisao);
					ins.put("skill_olhosdeserpente", varOlhosDeSerpente);
					ins.put("skill_ataqueconcentrado", varAtaqueConcentrado);
					ins.put("skill_resistenciafinal", varResistenciaFinal);
					ins.put("skill_panicodojusticeiro", varPanicoDoJusticeiro);
					ins.put("skill_reacaoemcadeia", varReacaoEmCadeia);
					ins.put("skill_rajadacerteira", varRajadaCerteira);
					ins.put("skill_desperado", varDesperado);
					ins.put("skill_ataquegatling", varAtaqueGatling);
					ins.put("skill_rastrearalvo", varRastrearAlvo);
					ins.put("skill_desarmar", varDesarmar);
					ins.put("skill_feriralvo", varFerirAlvo);
					ins.put("skill_controledemultidao", varControleDeMultidao);
					ins.put("skill_ataquetotal", varAtaqueTotal);
					ins.put("skill_disparoespalhado", varDisparoEspalhado);
					ins.put("skill_minadojusticeiro", varMinaDoJusticeiro);
					ins.put("skill_primeira", skillPrimeira);
					if(!novo){
						try {
							db.update("justiceiro", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("justiceiro", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from justiceiro", null);
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
						ins2.put("classe", "justiceiro");
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
			getMenuInflater().inflate(R.menu.simulador_justiceiro, menu);
			return true;
		}

	}