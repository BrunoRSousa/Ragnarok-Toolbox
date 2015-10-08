package br.com.ragtoolbox.simulador;

import br.com.ragtoolbox.R;
import br.com.ragtoolbox.R.id;
import br.com.ragtoolbox.R.layout;
import br.com.ragtoolbox.R.menu;
import br.com.ragtoolbox.actions.SaveFile;
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

public class SimuladorMusa extends Activity {

		//Botões de interrogação
		Button btRajadaDeFlechasInterrogacao,
		btChuvaDeFlechasInterrogacao,
		btOlhosDeAguiaInterrogacao,
		btPrecisaoInterrogacao,
		btConcentracaoInterrogacao,
		btFabricarFlechasInterrogacao,
		btDisparoViolentoInterrogacao,
		btEncerramentoInterrogacao,
		btBisInterrogacao,
		btDancaDoVentreInterrogacao,
		btNaoMeAbandonesInterrogacao,
		btDancaCiganaInterrogacao,
		btBeijoDaSorteInterrogacao,
		btSibiloInterrogacao,
		btEscandaloInterrogacao,
		btLicoesDeDancaInterrogacao,
		btEstilingueInterrogacao,
		btPiscadelaInterrogacao,
		btOdeASiegfriedInterrogacao,
		btBanqueteDeNjordInterrogacao,
		btRufarDosTamboresInterrogacao,
		btAnelDeNibelungosInterrogacao,
		btRitmoCaoticoInterrogacao,
		btLamentoDeLokiInterrogacao,
		btCantigaDeNinarInterrogacao,
		btCancaoPreciosaInterrogacao,
		btVulcaoDeFlechasInterrogacao,
		btBastaoDeHermodInterrogacao,
		btControleDeMarioneteInterrogacao,
		btDestinoNasCartasInterrogacao,
		btBencaoProtetoraInterrogacao,
		btGritoDeLiberdadeInterrogacao,
		btRitmoContagianteInterrogacao,
		btBaladaSinfonicaInterrogacao,
		btSerenataAoLuarInterrogacao,
		btDominioMusicalInterrogacao,
		btMelodiaDeMorfeuInterrogacao,
		btRessonanciaInterrogacao,
		btAtivarRessonanciaInterrogacao,
		btRuidoEstridenteInterrogacao,
		btSibiloDeEirInterrogacao,
		btRequiemDeOrfeuInterrogacao,
		btPoemaDeNifflheimInterrogacao,
		btCantoDaSereiaInterrogacao,
		btImprovisoInterrogacao,
		btOdeAHelaInterrogacao,
		btTemporalDeMilFlechasInterrogacao,
		btBradoDeOdinInterrogacao,
		btOrvalhoDeIdunInterrogacao,
		btCancaoDeAlfheimInterrogacao,
		btDancaComLobosInterrogacao,
		btCanticoDaIluminacaoInterrogacao,
		btClamorDeBatalhaInterrogacao,
		btPreludioDoRagnarokInterrogacao,
		btMurmurioPereneInterrogacao,
		btEmbalosDeSabadoANoiteInterrogacao;

		//Botões de diminuir habilidades
		Button btRajadaDeFlechasDiminuir,
		btChuvaDeFlechasDiminuir,
		btOlhosDeAguiaDiminuir,
		btPrecisaoDiminuir,
		btConcentracaoDiminuir,
		btEncerramentoDiminuir,
		btBisDiminuir,
		btDancaDoVentreDiminuir,
		btNaoMeAbandonesDiminuir,
		btDancaCiganaDiminuir,
		btBeijoDaSorteDiminuir,
		btSibiloDiminuir,
		btEscandaloDiminuir,
		btLicoesDeDancaDiminuir,
		btEstilingueDiminuir,
		btOdeASiegfriedDiminuir,
		btBanqueteDeNjordDiminuir,
		btRufarDosTamboresDiminuir,
		btAnelDeNibelungosDiminuir,
		btRitmoCaoticoDiminuir,
		btLamentoDeLokiDiminuir,
		btCantigaDeNinarDiminuir,
		btCancaoPreciosaDiminuir,
		btVulcaoDeFlechasDiminuir,
		btBastaoDeHermodDiminuir,
		btControleDeMarioneteDiminuir,
		btDestinoNasCartasDiminuir,
		btBencaoProtetoraDiminuir,
		btGritoDeLiberdadeDiminuir,
		btRitmoContagianteDiminuir,
		btBaladaSinfonicaDiminuir,
		btSerenataAoLuarDiminuir,
		btDominioMusicalDiminuir,
		btMelodiaDeMorfeuDiminuir,
		btRessonanciaDiminuir,
		btAtivarRessonanciaDiminuir,
		btRuidoEstridenteDiminuir,
		btSibiloDeEirDiminuir,
		btRequiemDeOrfeuDiminuir,
		btPoemaDeNifflheimDiminuir,
		btCantoDaSereiaDiminuir,
		btImprovisoDiminuir,
		btOdeAHelaDiminuir,
		btTemporalDeMilFlechasDiminuir,
		btBradoDeOdinDiminuir,
		btOrvalhoDeIdunDiminuir,
		btCancaoDeAlfheimDiminuir,
		btDancaComLobosDiminuir,
		btCanticoDaIluminacaoDiminuir,
		btClamorDeBatalhaDiminuir,
		btPreludioDoRagnarokDiminuir,
		btMurmurioPereneDiminuir,
		btEmbalosDeSabadoANoiteDiminuir;

		//Botões de aumentar habilidades
		Button btRajadaDeFlechasAumentar,
		btChuvaDeFlechasAumentar,
		btOlhosDeAguiaAumentar,
		btPrecisaoAumentar,
		btConcentracaoAumentar,
		btEncerramentoAumentar,
		btBisAumentar,
		btDancaDoVentreAumentar,
		btNaoMeAbandonesAumentar,
		btDancaCiganaAumentar,
		btBeijoDaSorteAumentar,
		btSibiloAumentar,
		btEscandaloAumentar,
		btLicoesDeDancaAumentar,
		btEstilingueAumentar,
		btOdeASiegfriedAumentar,
		btBanqueteDeNjordAumentar,
		btRufarDosTamboresAumentar,
		btAnelDeNibelungosAumentar,
		btRitmoCaoticoAumentar,
		btLamentoDeLokiAumentar,
		btCantigaDeNinarAumentar,
		btCancaoPreciosaAumentar,
		btVulcaoDeFlechasAumentar,
		btBastaoDeHermodAumentar,
		btControleDeMarioneteAumentar,
		btDestinoNasCartasAumentar,
		btBencaoProtetoraAumentar,
		btGritoDeLiberdadeAumentar,
		btRitmoContagianteAumentar,
		btBaladaSinfonicaAumentar,
		btSerenataAoLuarAumentar,
		btDominioMusicalAumentar,
		btMelodiaDeMorfeuAumentar,
		btRessonanciaAumentar,
		btAtivarRessonanciaAumentar,
		btRuidoEstridenteAumentar,
		btSibiloDeEirAumentar,
		btRequiemDeOrfeuAumentar,
		btPoemaDeNifflheimAumentar,
		btCantoDaSereiaAumentar,
		btImprovisoAumentar,
		btOdeAHelaAumentar,
		btTemporalDeMilFlechasAumentar,
		btBradoDeOdinAumentar,
		btOrvalhoDeIdunAumentar,
		btCancaoDeAlfheimAumentar,
		btDancaComLobosAumentar,
		btCanticoDaIluminacaoAumentar,
		btClamorDeBatalhaAumentar,
		btPreludioDoRagnarokAumentar,
		btMurmurioPereneAumentar,
		btEmbalosDeSabadoANoiteAumentar;

		//Resto dos botões
		Button btResetar, btSalvar, btSalvarIMG;
		ToggleButton tgbtSomenteHabilidadeAprendida;


		//Txt pontos da tela
		TextView txtRajadaDeFlechasPontos,
		txtChuvaDeFlechasPontos,
		txtOlhosDeAguiaPontos,
		txtPrecisaoPontos,
		txtConcentracaoPontos,
		txtEncerramentoPontos,
		txtBisPontos,
		txtDancaDoVentrePontos,
		txtNaoMeAbandonesPontos,
		txtDancaCiganaPontos,
		txtBeijoDaSortePontos,
		txtSibiloPontos,
		txtEscandaloPontos,
		txtLicoesDeDancaPontos,
		txtEstilinguePontos,
		txtOdeASiegfriedPontos,
		txtBanqueteDeNjordPontos,
		txtRufarDosTamboresPontos,
		txtAnelDeNibelungosPontos,
		txtRitmoCaoticoPontos,
		txtLamentoDeLokiPontos,
		txtCantigaDeNinarPontos,
		txtCancaoPreciosaPontos,
		txtVulcaoDeFlechasPontos,
		txtBastaoDeHermodPontos,
		txtControleDeMarionetePontos,
		txtDestinoNasCartasPontos,
		txtBencaoProtetoraPontos,
		txtGritoDeLiberdadePontos,
		txtRitmoContagiantePontos,
		txtBaladaSinfonicaPontos,
		txtSerenataAoLuarPontos,
		txtDominioMusicalPontos,
		txtMelodiaDeMorfeuPontos,
		txtRessonanciaPontos,
		txtAtivarRessonanciaPontos,
		txtRuidoEstridentePontos,
		txtSibiloDeEirPontos,
		txtRequiemDeOrfeuPontos,
		txtPoemaDeNifflheimPontos,
		txtCantoDaSereiaPontos,
		txtImprovisoPontos,
		txtOdeAHelaPontos,
		txtTemporalDeMilFlechasPontos,
		txtBradoDeOdinPontos,
		txtOrvalhoDeIdunPontos,
		txtCancaoDeAlfheimPontos,
		txtDancaComLobosPontos,
		txtCanticoDaIluminacaoPontos,
		txtClamorDeBatalhaPontos,
		txtPreludioDoRagnarokPontos,
		txtMurmurioPerenePontos,
		txtEmbalosDeSabadoANoitePontos;

		//Txt pontos restantes
		TextView txtClasse1, txtClasse2, txtTransClasse, txtClasse3;

		//Layouts
		LinearLayout layRajadaDeFlechas,
		layChuvaDeFlechas,
		layOlhosDeAguia,
		layPrecisao,
		layConcentracao,
		layEncerramento,
		layBis,
		layDancaDoVentre,
		layNaoMeAbandones,
		layDancaCigana,
		layBeijoDaSorte,
		laySibilo,
		layEscandalo,
		layLicoesDeDanca,
		layEstilingue,
		layOdeASiegfried,
		layBanqueteDeNjord,
		layRufarDosTambores,
		layAnelDeNibelungos,
		layRitmoCaotico,
		layLamentoDeLoki,
		layCantigaDeNinar,
		layCancaoPreciosa,
		layVulcaoDeFlechas,
		layBastaoDeHermod,
		layControleDeMarionete,
		layDestinoNasCartas,
		layBencaoProtetora,
		layGritoDeLiberdade,
		layRitmoContagiante,
		layBaladaSinfonica,
		laySerenataAoLuar,
		layDominioMusical,
		layMelodiaDeMorfeu,
		layRessonancia,
		layAtivarRessonancia,
		layRuidoEstridente,
		laySibiloDeEir,
		layRequiemDeOrfeu,
		layPoemaDeNifflheim,
		layCantoDaSereia,
		layImproviso,
		layOdeAHela,
		layTemporalDeMilFlechas,
		layBradoDeOdin,
		layOrvalhoDeIdun,
		layCancaoDeAlfheim,
		layDancaComLobos,
		layCanticoDaIluminacao,
		layClamorDeBatalha,
		layPreludioDoRagnarok,
		layMurmurioPerene,
		layEmbalosDeSabadoANoite;

		//Variaveis de Skill
		int varRajadaDeFlechas,
		varChuvaDeFlechas,
		varOlhosDeAguia,
		varPrecisao,
		varConcentracao,
		varEncerramento,
		varBis,
		varDancaDoVentre,
		varNaoMeAbandones,
		varDancaCigana,
		varBeijoDaSorte,
		varSibilo,
		varEscandalo,
		varLicoesDeDanca,
		varEstilingue,
		varOdeASiegfried,
		varBanqueteDeNjord,
		varRufarDosTambores,
		varAnelDeNibelungos,
		varRitmoCaotico,
		varLamentoDeLoki,
		varCantigaDeNinar,
		varCancaoPreciosa,
		varVulcaoDeFlechas,
		varBastaoDeHermod,
		varControleDeMarionete,
		varDestinoNasCartas,
		varBencaoProtetora,
		varGritoDeLiberdade,
		varRitmoContagiante,
		varBaladaSinfonica,
		varSerenataAoLuar,
		varDominioMusical,
		varMelodiaDeMorfeu,
		varRessonancia,
		varAtivarRessonancia,
		varRuidoEstridente,
		varSibiloDeEir,
		varRequiemDeOrfeu,
		varPoemaDeNifflheim,
		varCantoDaSereia,
		varImproviso,
		varOdeAHela,
		varTemporalDeMilFlechas,
		varBradoDeOdin,
		varOrvalhoDeIdun,
		varCancaoDeAlfheim,
		varDancaComLobos,
		varCanticoDaIluminacao,
		varClamorDeBatalha,
		varPreludioDoRagnarok,
		varMurmurioPerene,
		varEmbalosDeSabadoANoite;

		//variavel para alteração do db
		String idParaAlterar;

		//Variaveis de ponto
		int primeiraClasse;
		int segundaClasse;
		int transClasse;
		int terceiraClasse;

		int skillPrimeira;
		int skillSegunda;
		int skillTrans;
		int skillTerceira;

		int count;
		
		LinearLayout layPrincipal;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_simulador_musa);

			Intent it = getIntent();

			final int id = it.getIntExtra("id", 0);
			idParaAlterar = "_id =" +id;

			//inicialização de variáveis
			varRajadaDeFlechas = 0;
			varChuvaDeFlechas = 0;
			varOlhosDeAguia = 0;
			varPrecisao = 0;
			varConcentracao = 0;
			varEncerramento = 0;
			varBis = 0;
			varDancaDoVentre = 0;
			varNaoMeAbandones = 0;
			varDancaCigana = 0;
			varBeijoDaSorte = 0;
			varSibilo = 0;
			varEscandalo = 0;
			varLicoesDeDanca = 0;
			varEstilingue = 0;
			varOdeASiegfried = 0;
			varBanqueteDeNjord = 0;
			varRufarDosTambores = 0;
			varAnelDeNibelungos = 0;
			varRitmoCaotico = 0;
			varLamentoDeLoki = 0;
			varCantigaDeNinar = 0;
			varCancaoPreciosa = 0;
			varVulcaoDeFlechas = 0;
			varBastaoDeHermod = 0;
			varControleDeMarionete = 0;
			varDestinoNasCartas = 0;
			varBencaoProtetora = 0;
			varGritoDeLiberdade = 0;
			varRitmoContagiante = 0;
			varBaladaSinfonica = 0;
			varSerenataAoLuar = 0;
			varDominioMusical = 0;
			varMelodiaDeMorfeu = 0;
			varRessonancia = 0;
			varAtivarRessonancia = 0;
			varRuidoEstridente = 0;
			varSibiloDeEir = 0;
			varRequiemDeOrfeu = 0;
			varPoemaDeNifflheim = 0;
			varCantoDaSereia = 0;
			varImproviso = 0;
			varOdeAHela = 0;
			varTemporalDeMilFlechas = 0;
			varBradoDeOdin = 0;
			varOrvalhoDeIdun = 0;
			varCancaoDeAlfheim = 0;
			varDancaComLobos = 0;
			varCanticoDaIluminacao = 0;
			varClamorDeBatalha = 0;
			varPreludioDoRagnarok = 0;
			varMurmurioPerene = 0;
			varEmbalosDeSabadoANoite = 0;



			primeiraClasse = 49;
			segundaClasse = 49;
			transClasse = 20;
			terceiraClasse = 49;

			skillPrimeira = 0;
			skillSegunda = 0;
			skillTrans = 0;
			skillTerceira = 0;

			count = 0;


			//Botões de interrogações
			btRajadaDeFlechasInterrogacao = (Button) findViewById(R.id.btRajadaDeFlechasInterrogacao);
			btChuvaDeFlechasInterrogacao = (Button) findViewById(R.id.btChuvaDeFlechasInterrogacao);
			btOlhosDeAguiaInterrogacao = (Button) findViewById(R.id.btOlhosDeAguiaInterrogacao);
			btPrecisaoInterrogacao = (Button) findViewById(R.id.btPrecisaoInterrogacao);
			btConcentracaoInterrogacao = (Button) findViewById(R.id.btConcentracaoInterrogacao);
			btFabricarFlechasInterrogacao = (Button) findViewById(R.id.btFabricarFlechasInterrogacao);
			btDisparoViolentoInterrogacao = (Button) findViewById(R.id.btDisparoViolentoInterrogacao);
			btEncerramentoInterrogacao = (Button) findViewById(R.id.btEncerramentoInterrogacao);
			btBisInterrogacao = (Button) findViewById(R.id.btBisInterrogacao);
			btDancaDoVentreInterrogacao = (Button) findViewById(R.id.btDancaDoVentreInterrogacao);
			btNaoMeAbandonesInterrogacao = (Button) findViewById(R.id.btNaoMeAbandonesInterrogacao);
			btDancaCiganaInterrogacao = (Button) findViewById(R.id.btDancaCiganaInterrogacao);
			btBeijoDaSorteInterrogacao = (Button) findViewById(R.id.btBeijoDaSorteInterrogacao);
			btSibiloInterrogacao = (Button) findViewById(R.id.btSibiloInterrogacao);
			btEscandaloInterrogacao = (Button) findViewById(R.id.btEscandaloInterrogacao);
			btLicoesDeDancaInterrogacao = (Button) findViewById(R.id.btLicoesDeDancaInterrogacao);
			btEstilingueInterrogacao = (Button) findViewById(R.id.btEstilingueInterrogacao);
			btPiscadelaInterrogacao = (Button) findViewById(R.id.btPiscadelaInterrogacao);
			btOdeASiegfriedInterrogacao = (Button) findViewById(R.id.btOdeASiegfriedInterrogacao);
			btBanqueteDeNjordInterrogacao = (Button) findViewById(R.id.btBanqueteDeNjordInterrogacao);
			btRufarDosTamboresInterrogacao = (Button) findViewById(R.id.btRufarDosTamboresInterrogacao);
			btAnelDeNibelungosInterrogacao = (Button) findViewById(R.id.btAnelDeNibelungosInterrogacao);
			btRitmoCaoticoInterrogacao = (Button) findViewById(R.id.btRitmoCaoticoInterrogacao);
			btLamentoDeLokiInterrogacao = (Button) findViewById(R.id.btLamentoDeLokiInterrogacao);
			btCantigaDeNinarInterrogacao = (Button) findViewById(R.id.btCantigaDeNinarInterrogacao);
			btCancaoPreciosaInterrogacao = (Button) findViewById(R.id.btCancaoPreciosaInterrogacao);
			btVulcaoDeFlechasInterrogacao = (Button) findViewById(R.id.btVulcaoDeFlechasInterrogacao);
			btBastaoDeHermodInterrogacao = (Button) findViewById(R.id.btBastaoDeHermodInterrogacao);
			btControleDeMarioneteInterrogacao = (Button) findViewById(R.id.btControleDeMarioneteInterrogacao);
			btDestinoNasCartasInterrogacao = (Button) findViewById(R.id.btDestinoNasCartasInterrogacao);
			btBencaoProtetoraInterrogacao = (Button) findViewById(R.id.btBencaoProtetoraInterrogacao);
			btGritoDeLiberdadeInterrogacao = (Button) findViewById(R.id.btGritoDeLiberdadeInterrogacao);
			btRitmoContagianteInterrogacao = (Button) findViewById(R.id.btRitmoContagianteInterrogacao);
			btBaladaSinfonicaInterrogacao = (Button) findViewById(R.id.btBaladaSinfonicaInterrogacao);
			btSerenataAoLuarInterrogacao = (Button) findViewById(R.id.btSerenataAoLuarInterrogacao);
			btDominioMusicalInterrogacao = (Button) findViewById(R.id.btDominioMusicalInterrogacao);
			btMelodiaDeMorfeuInterrogacao = (Button) findViewById(R.id.btMelodiaDeMorfeuInterrogacao);
			btRessonanciaInterrogacao = (Button) findViewById(R.id.btRessonanciaInterrogacao);
			btAtivarRessonanciaInterrogacao = (Button) findViewById(R.id.btAtivarRessonanciaInterrogacao);
			btRuidoEstridenteInterrogacao = (Button) findViewById(R.id.btRuidoEstridenteInterrogacao);
			btSibiloDeEirInterrogacao = (Button) findViewById(R.id.btSibiloDeEirInterrogacao);
			btRequiemDeOrfeuInterrogacao = (Button) findViewById(R.id.btRequiemDeOrfeuInterrogacao);
			btPoemaDeNifflheimInterrogacao = (Button) findViewById(R.id.btPoemaDeNifflheimInterrogacao);
			btCantoDaSereiaInterrogacao = (Button) findViewById(R.id.btCantoDaSereiaInterrogacao);
			btImprovisoInterrogacao = (Button) findViewById(R.id.btImprovisoInterrogacao);
			btOdeAHelaInterrogacao = (Button) findViewById(R.id.btOdeAHelaInterrogacao);
			btTemporalDeMilFlechasInterrogacao = (Button) findViewById(R.id.btTemporalDeMilFlechasInterrogacao);
			btBradoDeOdinInterrogacao = (Button) findViewById(R.id.btBradoDeOdinInterrogacao);
			btOrvalhoDeIdunInterrogacao = (Button) findViewById(R.id.btOrvalhoDeIdunInterrogacao);
			btCancaoDeAlfheimInterrogacao = (Button) findViewById(R.id.btCancaoDeAlfheimInterrogacao);
			btDancaComLobosInterrogacao = (Button) findViewById(R.id.btDancaComLobosInterrogacao);
			btCanticoDaIluminacaoInterrogacao = (Button) findViewById(R.id.btCanticoDaIluminacaoInterrogacao);
			btClamorDeBatalhaInterrogacao = (Button) findViewById(R.id.btClamorDeBatalhaInterrogacao);
			btPreludioDoRagnarokInterrogacao = (Button) findViewById(R.id.btPreludioDoRagnarokInterrogacao);
			btMurmurioPereneInterrogacao = (Button) findViewById(R.id.btMurmurioPereneInterrogacao);
			btEmbalosDeSabadoANoiteInterrogacao = (Button) findViewById(R.id.btEmbalosDeSabadoANoiteInterrogacao);

			//Botões de diminuir habilidades
			btRajadaDeFlechasDiminuir = (Button) findViewById(R.id.btRajadaDeFlechasDiminuir);
			btChuvaDeFlechasDiminuir = (Button) findViewById(R.id.btChuvaDeFlechasDiminuir);
			btOlhosDeAguiaDiminuir = (Button) findViewById(R.id.btOlhosDeAguiaDiminuir);
			btPrecisaoDiminuir = (Button) findViewById(R.id.btPrecisaoDiminuir);
			btConcentracaoDiminuir = (Button) findViewById(R.id.btConcentracaoDiminuir);
			btEncerramentoDiminuir = (Button) findViewById(R.id.btEncerramentoDiminuir);
			btBisDiminuir = (Button) findViewById(R.id.btBisDiminuir);
			btDancaDoVentreDiminuir = (Button) findViewById(R.id.btDancaDoVentreDiminuir);
			btNaoMeAbandonesDiminuir = (Button) findViewById(R.id.btNaoMeAbandonesDiminuir);
			btDancaCiganaDiminuir = (Button) findViewById(R.id.btDancaCiganaDiminuir);
			btBeijoDaSorteDiminuir = (Button) findViewById(R.id.btBeijoDaSorteDiminuir);
			btSibiloDiminuir = (Button) findViewById(R.id.btSibiloDiminuir);
			btEscandaloDiminuir = (Button) findViewById(R.id.btEscandaloDiminuir);
			btLicoesDeDancaDiminuir = (Button) findViewById(R.id.btLicoesDeDancaDiminuir);
			btEstilingueDiminuir = (Button) findViewById(R.id.btEstilingueDiminuir);
			btOdeASiegfriedDiminuir = (Button) findViewById(R.id.btOdeASiegfriedDiminuir);
			btBanqueteDeNjordDiminuir = (Button) findViewById(R.id.btBanqueteDeNjordDiminuir);
			btRufarDosTamboresDiminuir = (Button) findViewById(R.id.btRufarDosTamboresDiminuir);
			btAnelDeNibelungosDiminuir = (Button) findViewById(R.id.btAnelDeNibelungosDiminuir);
			btRitmoCaoticoDiminuir = (Button) findViewById(R.id.btRitmoCaoticoDiminuir);
			btLamentoDeLokiDiminuir = (Button) findViewById(R.id.btLamentoDeLokiDiminuir);
			btCantigaDeNinarDiminuir = (Button) findViewById(R.id.btCantigaDeNinarDiminuir);
			btCancaoPreciosaDiminuir = (Button) findViewById(R.id.btCancaoPreciosaDiminuir);
			btVulcaoDeFlechasDiminuir = (Button) findViewById(R.id.btVulcaoDeFlechasDiminuir);
			btBastaoDeHermodDiminuir = (Button) findViewById(R.id.btBastaoDeHermodDiminuir);
			btControleDeMarioneteDiminuir = (Button) findViewById(R.id.btControleDeMarioneteDiminuir);
			btDestinoNasCartasDiminuir = (Button) findViewById(R.id.btDestinoNasCartasDiminuir);
			btBencaoProtetoraDiminuir = (Button) findViewById(R.id.btBencaoProtetoraDiminuir);
			btGritoDeLiberdadeDiminuir = (Button) findViewById(R.id.btGritoDeLiberdadeDiminuir);
			btRitmoContagianteDiminuir = (Button) findViewById(R.id.btRitmoContagianteDiminuir);
			btBaladaSinfonicaDiminuir = (Button) findViewById(R.id.btBaladaSinfonicaDiminuir);
			btSerenataAoLuarDiminuir = (Button) findViewById(R.id.btSerenataAoLuarDiminuir);
			btDominioMusicalDiminuir = (Button) findViewById(R.id.btDominioMusicalDiminuir);
			btMelodiaDeMorfeuDiminuir = (Button) findViewById(R.id.btMelodiaDeMorfeuDiminuir);
			btRessonanciaDiminuir = (Button) findViewById(R.id.btRessonanciaDiminuir);
			btAtivarRessonanciaDiminuir = (Button) findViewById(R.id.btAtivarRessonanciaDiminuir);
			btRuidoEstridenteDiminuir = (Button) findViewById(R.id.btRuidoEstridenteDiminuir);
			btSibiloDeEirDiminuir = (Button) findViewById(R.id.btSibiloDeEirDiminuir);
			btRequiemDeOrfeuDiminuir = (Button) findViewById(R.id.btRequiemDeOrfeuDiminuir);
			btPoemaDeNifflheimDiminuir = (Button) findViewById(R.id.btPoemaDeNifflheimDiminuir);
			btCantoDaSereiaDiminuir = (Button) findViewById(R.id.btCantoDaSereiaDiminuir);
			btImprovisoDiminuir = (Button) findViewById(R.id.btImprovisoDiminuir);
			btOdeAHelaDiminuir = (Button) findViewById(R.id.btOdeAHelaDiminuir);
			btTemporalDeMilFlechasDiminuir = (Button) findViewById(R.id.btTemporalDeMilFlechasDiminuir);
			btBradoDeOdinDiminuir = (Button) findViewById(R.id.btBradoDeOdinDiminuir);
			btOrvalhoDeIdunDiminuir = (Button) findViewById(R.id.btOrvalhoDeIdunDiminuir);
			btCancaoDeAlfheimDiminuir = (Button) findViewById(R.id.btCancaoDeAlfheimDiminuir);
			btDancaComLobosDiminuir = (Button) findViewById(R.id.btDancaComLobosDiminuir);
			btCanticoDaIluminacaoDiminuir = (Button) findViewById(R.id.btCanticoDaIluminacaoDiminuir);
			btClamorDeBatalhaDiminuir = (Button) findViewById(R.id.btClamorDeBatalhaDiminuir);
			btPreludioDoRagnarokDiminuir = (Button) findViewById(R.id.btPreludioDoRagnarokDiminuir);
			btMurmurioPereneDiminuir = (Button) findViewById(R.id.btMurmurioPereneDiminuir);
			btEmbalosDeSabadoANoiteDiminuir = (Button) findViewById(R.id.btEmbalosDeSabadoANoiteDiminuir);

			//Botões de aumentar habilidades
			btRajadaDeFlechasAumentar = (Button) findViewById(R.id.btRajadaDeFlechasAumentar);
			btChuvaDeFlechasAumentar = (Button) findViewById(R.id.btChuvaDeFlechasAumentar);
			btOlhosDeAguiaAumentar = (Button) findViewById(R.id.btOlhosDeAguiaAumentar);
			btPrecisaoAumentar = (Button) findViewById(R.id.btPrecisaoAumentar);
			btConcentracaoAumentar = (Button) findViewById(R.id.btConcentracaoAumentar);
			btEncerramentoAumentar = (Button) findViewById(R.id.btEncerramentoAumentar);
			btBisAumentar = (Button) findViewById(R.id.btBisAumentar);
			btDancaDoVentreAumentar = (Button) findViewById(R.id.btDancaDoVentreAumentar);
			btNaoMeAbandonesAumentar = (Button) findViewById(R.id.btNaoMeAbandonesAumentar);
			btDancaCiganaAumentar = (Button) findViewById(R.id.btDancaCiganaAumentar);
			btBeijoDaSorteAumentar = (Button) findViewById(R.id.btBeijoDaSorteAumentar);
			btSibiloAumentar = (Button) findViewById(R.id.btSibiloAumentar);
			btEscandaloAumentar = (Button) findViewById(R.id.btEscandaloAumentar);
			btLicoesDeDancaAumentar = (Button) findViewById(R.id.btLicoesDeDancaAumentar);
			btEstilingueAumentar = (Button) findViewById(R.id.btEstilingueAumentar);
			btOdeASiegfriedAumentar = (Button) findViewById(R.id.btOdeASiegfriedAumentar);
			btBanqueteDeNjordAumentar = (Button) findViewById(R.id.btBanqueteDeNjordAumentar);
			btRufarDosTamboresAumentar = (Button) findViewById(R.id.btRufarDosTamboresAumentar);
			btAnelDeNibelungosAumentar = (Button) findViewById(R.id.btAnelDeNibelungosAumentar);
			btRitmoCaoticoAumentar = (Button) findViewById(R.id.btRitmoCaoticoAumentar);
			btLamentoDeLokiAumentar = (Button) findViewById(R.id.btLamentoDeLokiAumentar);
			btCantigaDeNinarAumentar = (Button) findViewById(R.id.btCantigaDeNinarAumentar);
			btCancaoPreciosaAumentar = (Button) findViewById(R.id.btCancaoPreciosaAumentar);
			btVulcaoDeFlechasAumentar = (Button) findViewById(R.id.btVulcaoDeFlechasAumentar);
			btBastaoDeHermodAumentar = (Button) findViewById(R.id.btBastaoDeHermodAumentar);
			btControleDeMarioneteAumentar = (Button) findViewById(R.id.btControleDeMarioneteAumentar);
			btDestinoNasCartasAumentar = (Button) findViewById(R.id.btDestinoNasCartasAumentar);
			btBencaoProtetoraAumentar = (Button) findViewById(R.id.btBencaoProtetoraAumentar);
			btGritoDeLiberdadeAumentar = (Button) findViewById(R.id.btGritoDeLiberdadeAumentar);
			btRitmoContagianteAumentar = (Button) findViewById(R.id.btRitmoContagianteAumentar);
			btBaladaSinfonicaAumentar = (Button) findViewById(R.id.btBaladaSinfonicaAumentar);
			btSerenataAoLuarAumentar = (Button) findViewById(R.id.btSerenataAoLuarAumentar);
			btDominioMusicalAumentar = (Button) findViewById(R.id.btDominioMusicalAumentar);
			btMelodiaDeMorfeuAumentar = (Button) findViewById(R.id.btMelodiaDeMorfeuAumentar);
			btRessonanciaAumentar = (Button) findViewById(R.id.btRessonanciaAumentar);
			btAtivarRessonanciaAumentar = (Button) findViewById(R.id.btAtivarRessonanciaAumentar);
			btRuidoEstridenteAumentar = (Button) findViewById(R.id.btRuidoEstridenteAumentar);
			btSibiloDeEirAumentar = (Button) findViewById(R.id.btSibiloDeEirAumentar);
			btRequiemDeOrfeuAumentar = (Button) findViewById(R.id.btRequiemDeOrfeuAumentar);
			btPoemaDeNifflheimAumentar = (Button) findViewById(R.id.btPoemaDeNifflheimAumentar);
			btCantoDaSereiaAumentar = (Button) findViewById(R.id.btCantoDaSereiaAumentar);
			btImprovisoAumentar = (Button) findViewById(R.id.btImprovisoAumentar);
			btOdeAHelaAumentar = (Button) findViewById(R.id.btOdeAHelaAumentar);
			btTemporalDeMilFlechasAumentar = (Button) findViewById(R.id.btTemporalDeMilFlechasAumentar);
			btBradoDeOdinAumentar = (Button) findViewById(R.id.btBradoDeOdinAumentar);
			btOrvalhoDeIdunAumentar = (Button) findViewById(R.id.btOrvalhoDeIdunAumentar);
			btCancaoDeAlfheimAumentar = (Button) findViewById(R.id.btCancaoDeAlfheimAumentar);
			btDancaComLobosAumentar = (Button) findViewById(R.id.btDancaComLobosAumentar);
			btCanticoDaIluminacaoAumentar = (Button) findViewById(R.id.btCanticoDaIluminacaoAumentar);
			btClamorDeBatalhaAumentar = (Button) findViewById(R.id.btClamorDeBatalhaAumentar);
			btPreludioDoRagnarokAumentar = (Button) findViewById(R.id.btPreludioDoRagnarokAumentar);
			btMurmurioPereneAumentar = (Button) findViewById(R.id.btMurmurioPereneAumentar);
			btEmbalosDeSabadoANoiteAumentar = (Button) findViewById(R.id.btEmbalosDeSabadoANoiteAumentar);

			//Resto dos botões
			btResetar = (Button) findViewById(R.id.btResetar);
			btSalvar = (Button) findViewById(R.id.btSalvar);
			btSalvarIMG = (Button) findViewById(R.id.btSalvarIMG);
			tgbtSomenteHabilidadeAprendida = (ToggleButton) findViewById(R.id.tgbtSomenteHabilidadeAprendida);

			//Txt pontos da tela
			txtRajadaDeFlechasPontos = (TextView) findViewById(R.id.txtRajadaDeFlechasPontos);
			txtChuvaDeFlechasPontos = (TextView) findViewById(R.id.txtChuvaDeFlechasPontos);
			txtOlhosDeAguiaPontos = (TextView) findViewById(R.id.txtOlhosDeAguiaPontos);
			txtPrecisaoPontos = (TextView) findViewById(R.id.txtPrecisaoPontos);
			txtConcentracaoPontos = (TextView) findViewById(R.id.txtConcentracaoPontos);
			txtEncerramentoPontos = (TextView) findViewById(R.id.txtEncerramentoPontos);
			txtBisPontos = (TextView) findViewById(R.id.txtBisPontos);
			txtDancaDoVentrePontos = (TextView) findViewById(R.id.txtDancaDoVentrePontos);
			txtNaoMeAbandonesPontos = (TextView) findViewById(R.id.txtNaoMeAbandonesPontos);
			txtDancaCiganaPontos = (TextView) findViewById(R.id.txtDancaCiganaPontos);
			txtBeijoDaSortePontos = (TextView) findViewById(R.id.txtBeijoDaSortePontos);
			txtSibiloPontos = (TextView) findViewById(R.id.txtSibiloPontos);
			txtEscandaloPontos = (TextView) findViewById(R.id.txtEscandaloPontos);
			txtLicoesDeDancaPontos = (TextView) findViewById(R.id.txtLicoesDeDancaPontos);
			txtEstilinguePontos = (TextView) findViewById(R.id.txtEstilinguePontos);
			txtOdeASiegfriedPontos = (TextView) findViewById(R.id.txtOdeASiegfriedPontos);
			txtBanqueteDeNjordPontos = (TextView) findViewById(R.id.txtBanqueteDeNjordPontos);
			txtRufarDosTamboresPontos = (TextView) findViewById(R.id.txtRufarDosTamboresPontos);
			txtAnelDeNibelungosPontos = (TextView) findViewById(R.id.txtAnelDeNibelungosPontos);
			txtRitmoCaoticoPontos = (TextView) findViewById(R.id.txtRitmoCaoticoPontos);
			txtLamentoDeLokiPontos = (TextView) findViewById(R.id.txtLamentoDeLokiPontos);
			txtCantigaDeNinarPontos = (TextView) findViewById(R.id.txtCantigaDeNinarPontos);
			txtCancaoPreciosaPontos = (TextView) findViewById(R.id.txtCancaoPreciosaPontos);
			txtVulcaoDeFlechasPontos = (TextView) findViewById(R.id.txtVulcaoDeFlechasPontos);
			txtBastaoDeHermodPontos = (TextView) findViewById(R.id.txtBastaoDeHermodPontos);
			txtControleDeMarionetePontos = (TextView) findViewById(R.id.txtControleDeMarionetePontos);
			txtDestinoNasCartasPontos = (TextView) findViewById(R.id.txtDestinoNasCartasPontos);
			txtBencaoProtetoraPontos = (TextView) findViewById(R.id.txtBencaoProtetoraPontos);
			txtGritoDeLiberdadePontos = (TextView) findViewById(R.id.txtGritoDeLiberdadePontos);
			txtRitmoContagiantePontos = (TextView) findViewById(R.id.txtRitmoContagiantePontos);
			txtBaladaSinfonicaPontos = (TextView) findViewById(R.id.txtBaladaSinfonicaPontos);
			txtSerenataAoLuarPontos = (TextView) findViewById(R.id.txtSerenataAoLuarPontos);
			txtDominioMusicalPontos = (TextView) findViewById(R.id.txtDominioMusicalPontos);
			txtMelodiaDeMorfeuPontos = (TextView) findViewById(R.id.txtMelodiaDeMorfeuPontos);
			txtRessonanciaPontos = (TextView) findViewById(R.id.txtRessonanciaPontos);
			txtAtivarRessonanciaPontos = (TextView) findViewById(R.id.txtAtivarRessonanciaPontos);
			txtRuidoEstridentePontos = (TextView) findViewById(R.id.txtRuidoEstridentePontos);
			txtSibiloDeEirPontos = (TextView) findViewById(R.id.txtSibiloDeEirPontos);
			txtRequiemDeOrfeuPontos = (TextView) findViewById(R.id.txtRequiemDeOrfeuPontos);
			txtPoemaDeNifflheimPontos = (TextView) findViewById(R.id.txtPoemaDeNifflheimPontos);
			txtCantoDaSereiaPontos = (TextView) findViewById(R.id.txtCantoDaSereiaPontos);
			txtImprovisoPontos = (TextView) findViewById(R.id.txtImprovisoPontos);
			txtOdeAHelaPontos = (TextView) findViewById(R.id.txtOdeAHelaPontos);
			txtTemporalDeMilFlechasPontos = (TextView) findViewById(R.id.txtTemporalDeMilFlechasPontos);
			txtBradoDeOdinPontos = (TextView) findViewById(R.id.txtBradoDeOdinPontos);
			txtOrvalhoDeIdunPontos = (TextView) findViewById(R.id.txtOrvalhoDeIdunPontos);
			txtCancaoDeAlfheimPontos = (TextView) findViewById(R.id.txtCancaoDeAlfheimPontos);
			txtDancaComLobosPontos = (TextView) findViewById(R.id.txtDancaComLobosPontos);
			txtCanticoDaIluminacaoPontos = (TextView) findViewById(R.id.txtCanticoDaIluminacaoPontos);
			txtClamorDeBatalhaPontos = (TextView) findViewById(R.id.txtClamorDeBatalhaPontos);
			txtPreludioDoRagnarokPontos = (TextView) findViewById(R.id.txtPreludioDoRagnarokPontos);
			txtMurmurioPerenePontos = (TextView) findViewById(R.id.txtMurmurioPerenePontos);
			txtEmbalosDeSabadoANoitePontos = (TextView) findViewById(R.id.txtEmbalosDeSabadoANoitePontos);

			//Txt pontos restantes
			txtClasse1 = (TextView) findViewById(R.id.txtClasse1);
			txtClasse2 = (TextView) findViewById(R.id.txtClasse2);
			txtTransClasse = (TextView) findViewById(R.id.txtClasseTrans);
			txtClasse3 = (TextView) findViewById(R.id.txtClasse3);

			//Layouts
			layRajadaDeFlechas = (LinearLayout) findViewById(R.id.layRajadaDeFlechas);
			layChuvaDeFlechas = (LinearLayout) findViewById(R.id.layChuvaDeFlechas);
			layOlhosDeAguia = (LinearLayout) findViewById(R.id.layOlhosDeAguia);
			layPrecisao = (LinearLayout) findViewById(R.id.layPrecisao);
			layConcentracao = (LinearLayout) findViewById(R.id.layConcentracao);
			layEncerramento = (LinearLayout) findViewById(R.id.layEncerramento);
			layBis = (LinearLayout) findViewById(R.id.layBis);
			layDancaDoVentre = (LinearLayout) findViewById(R.id.layDancaDoVentre);
			layNaoMeAbandones = (LinearLayout) findViewById(R.id.layNaoMeAbandones);
			layDancaCigana = (LinearLayout) findViewById(R.id.layDancaCigana);
			layBeijoDaSorte = (LinearLayout) findViewById(R.id.layBeijoDaSorte);
			laySibilo = (LinearLayout) findViewById(R.id.laySibilo);
			layEscandalo = (LinearLayout) findViewById(R.id.layEscandalo);
			layLicoesDeDanca = (LinearLayout) findViewById(R.id.layLicoesDeDanca);
			layEstilingue = (LinearLayout) findViewById(R.id.layEstilingue);
			layOdeASiegfried = (LinearLayout) findViewById(R.id.layOdeASiegfried);
			layBanqueteDeNjord = (LinearLayout) findViewById(R.id.layBanqueteDeNjord);
			layRufarDosTambores = (LinearLayout) findViewById(R.id.layRufarDosTambores);
			layAnelDeNibelungos = (LinearLayout) findViewById(R.id.layAnelDeNibelungos);
			layRitmoCaotico = (LinearLayout) findViewById(R.id.layRitmoCaotico);
			layLamentoDeLoki = (LinearLayout) findViewById(R.id.layLamentoDeLoki);
			layCantigaDeNinar = (LinearLayout) findViewById(R.id.layCantigaDeNinar);
			layCancaoPreciosa = (LinearLayout) findViewById(R.id.layCancaoPreciosa);
			layVulcaoDeFlechas = (LinearLayout) findViewById(R.id.layVulcaoDeFlechas);
			layBastaoDeHermod = (LinearLayout) findViewById(R.id.layBastaoDeHermod);
			layControleDeMarionete = (LinearLayout) findViewById(R.id.layControleDeMarionete);
			layDestinoNasCartas = (LinearLayout) findViewById(R.id.layDestinoNasCartas);
			layBencaoProtetora = (LinearLayout) findViewById(R.id.layBencaoProtetora);
			layGritoDeLiberdade = (LinearLayout) findViewById(R.id.layGritoDeLiberdade);
			layRitmoContagiante = (LinearLayout) findViewById(R.id.layRitmoContagiante);
			layBaladaSinfonica = (LinearLayout) findViewById(R.id.layBaladaSinfonica);
			laySerenataAoLuar = (LinearLayout) findViewById(R.id.laySerenataAoLuar);
			layDominioMusical = (LinearLayout) findViewById(R.id.layDominioMusical);
			layMelodiaDeMorfeu = (LinearLayout) findViewById(R.id.layMelodiaDeMorfeu);
			layRessonancia = (LinearLayout) findViewById(R.id.layRessonancia);
			layAtivarRessonancia = (LinearLayout) findViewById(R.id.layAtivarRessonancia);
			layRuidoEstridente = (LinearLayout) findViewById(R.id.layRuidoEstridente);
			laySibiloDeEir = (LinearLayout) findViewById(R.id.laySibiloDeEir);
			layRequiemDeOrfeu = (LinearLayout) findViewById(R.id.layRequiemDeOrfeu);
			layPoemaDeNifflheim = (LinearLayout) findViewById(R.id.layPoemaDeNifflheim);
			layCantoDaSereia = (LinearLayout) findViewById(R.id.layCantoDaSereia);
			layImproviso = (LinearLayout) findViewById(R.id.layImproviso);
			layOdeAHela = (LinearLayout) findViewById(R.id.layOdeAHela);
			layTemporalDeMilFlechas = (LinearLayout) findViewById(R.id.layTemporalDeMilFlechas);
			layBradoDeOdin = (LinearLayout) findViewById(R.id.layBradoDeOdin);
			layOrvalhoDeIdun = (LinearLayout) findViewById(R.id.layOrvalhoDeIdun);
			layCancaoDeAlfheim = (LinearLayout) findViewById(R.id.layCancaoDeAlfheim);
			layDancaComLobos = (LinearLayout) findViewById(R.id.layDancaComLobos);
			layCanticoDaIluminacao = (LinearLayout) findViewById(R.id.layCanticoDaIluminacao);
			layClamorDeBatalha = (LinearLayout) findViewById(R.id.layClamorDeBatalha);
			layPreludioDoRagnarok = (LinearLayout) findViewById(R.id.layPreludioDoRagnarok);
			layMurmurioPerene = (LinearLayout) findViewById(R.id.layMurmurioPerene);
			layEmbalosDeSabadoANoite = (LinearLayout) findViewById(R.id.layEmbalosDeSabadoANoite);
			
			layPrincipal = (LinearLayout) findViewById(R.id.habilidades);

			if (id>0)
				recarregarBuild(id);


			//Eventos de informação
			btRajadaDeFlechasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Rajada De Flechas");
					dialogo.setMessage(R.string.rajadaDeFlechasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChuvaDeFlechasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Chuva De Flechas");
					dialogo.setMessage(R.string.chuvaDeFlechasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOlhosDeAguiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Olhos De Águia");
					dialogo.setMessage(R.string.olhosDeAguiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPrecisaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Precisão");
					dialogo.setMessage(R.string.precisaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btConcentracaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Concentração");
					dialogo.setMessage(R.string.concentracaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFabricarFlechasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Fabricar Flechas");
					dialogo.setMessage(R.string.fabricarFlechasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDisparoViolentoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Disparo Violento");
					dialogo.setMessage(R.string.disparoViolentoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEncerramentoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Encerramento");
					dialogo.setMessage(R.string.encerramentoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBisInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Bis");
					dialogo.setMessage(R.string.bisInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDancaDoVentreInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Dança Do Ventre");
					dialogo.setMessage(R.string.dancaDoVentreInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btNaoMeAbandonesInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Não Me Abandones");
					dialogo.setMessage(R.string.naoMeAbandonesInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDancaCiganaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Dança Cigana");
					dialogo.setMessage(R.string.dancaCiganaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBeijoDaSorteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Beijo Da Sorte");
					dialogo.setMessage(R.string.beijoDaSorteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSibiloInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Sibilo");
					dialogo.setMessage(R.string.sibiloInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEscandaloInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Escândalo");
					dialogo.setMessage(R.string.escandaloInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLicoesDeDancaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Lições De Dança");
					dialogo.setMessage(R.string.licoesDeDancaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEstilingueInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Estilingue");
					dialogo.setMessage(R.string.estilingueInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPiscadelaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Piscadela");
					dialogo.setMessage(R.string.piscadelaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOdeASiegfriedInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Ode A Siegfried");
					dialogo.setMessage(R.string.odeASiegfriedOdaliscaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBanqueteDeNjordInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Banquete De Njord");
					dialogo.setMessage(R.string.banqueteDeNjordInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRufarDosTamboresInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Rufar Dos Tambores");
					dialogo.setMessage(R.string.rufarDosTamboresOdaliscaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAnelDeNibelungosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Anel De Nibelungos");
					dialogo.setMessage(R.string.anelDeNibelungosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRitmoCaoticoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Ritmo Caótico");
					dialogo.setMessage(R.string.ritmoCaoticoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLamentoDeLokiInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Lamento De Loki");
					dialogo.setMessage(R.string.lamentoDeLokiOdaliscaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCantigaDeNinarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Cantiga De Ninar");
					dialogo.setMessage(R.string.cantigaDeNinarOdaliscaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCancaoPreciosaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Canção Preciosa");
					dialogo.setMessage(R.string.cancaoPreciosaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btVulcaoDeFlechasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Vulcão De Flechas");
					dialogo.setMessage(R.string.vulcaoDeFlechasCiganaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBastaoDeHermodInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Bastão De Hermod");
					dialogo.setMessage(R.string.bastaoDeHermodCiganaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btControleDeMarioneteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Controle De Marionete");
					dialogo.setMessage(R.string.controleDeMarioneteCiganaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDestinoNasCartasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Destino Nas Cartas");
					dialogo.setMessage(R.string.destinoNasCartasCiganaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBencaoProtetoraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Bênção Protetora");
					dialogo.setMessage(R.string.bencaoProtetoraCiganaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGritoDeLiberdadeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Grito De Liberdade");
					dialogo.setMessage(R.string.gritoDeLiberdadeCiganaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRitmoContagianteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Ritmo Contagiante");
					dialogo.setMessage(R.string.ritmoContagianteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBaladaSinfonicaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Balada Sinfônica");
					dialogo.setMessage(R.string.baladaSinfonicaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSerenataAoLuarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Serenata Ao Luar");
					dialogo.setMessage(R.string.serenataAoLuarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDominioMusicalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Domínio Musical");
					dialogo.setMessage(R.string.dominioMusicalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMelodiaDeMorfeuInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Melodia De Morfeu");
					dialogo.setMessage(R.string.melodiaDeMorfeuInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRessonanciaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Ressonância");
					dialogo.setMessage(R.string.ressonanciaMusaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtivarRessonanciaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Ativar Ressonância");
					dialogo.setMessage(R.string.ativarRessonanciaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRuidoEstridenteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Ruído Estridente");
					dialogo.setMessage(R.string.ruidoEstridenteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSibiloDeEirInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Sibilo De Eir");
					dialogo.setMessage(R.string.sibiloDeEirInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRequiemDeOrfeuInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Réquiem De Orfeu");
					dialogo.setMessage(R.string.requiemDeOrfeuInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPoemaDeNifflheimInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Poema De Nifflheim");
					dialogo.setMessage(R.string.poemaDeNifflheimInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCantoDaSereiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Canto Da Sereia");
					dialogo.setMessage(R.string.cantoDaSereiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btImprovisoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Improviso");
					dialogo.setMessage(R.string.improvisoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOdeAHelaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Ode A Hela");
					dialogo.setMessage(R.string.odeAHelaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTemporalDeMilFlechasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Temporal De Mil Flechas");
					dialogo.setMessage(R.string.temporalDeMilFlechasMusaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBradoDeOdinInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Brado De Odin");
					dialogo.setMessage(R.string.bradoDeOdinInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOrvalhoDeIdunInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Orvalho De Idun");
					dialogo.setMessage(R.string.orvalhoDeIdunMusaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCancaoDeAlfheimInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Canção De Alfheim");
					dialogo.setMessage(R.string.cancaoDeAlfheimMusaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDancaComLobosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Dança Com Lobos");
					dialogo.setMessage(R.string.dancaComLobosMusaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCanticoDaIluminacaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Cântico Da Iluminação");
					dialogo.setMessage(R.string.canticoDaIluminacaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btClamorDeBatalhaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Clamor De Batalha");
					dialogo.setMessage(R.string.clamorDeBatalhaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPreludioDoRagnarokInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Prelúdio Do Ragnarok");
					dialogo.setMessage(R.string.preludioDoRagnarokInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMurmurioPereneInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Murmúrio Perene");
					dialogo.setMessage(R.string.murmurioPereneInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEmbalosDeSabadoANoiteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMusa.this);
					dialogo.setTitle("Embalos De Sábado A Noite");
					dialogo.setMessage(R.string.embalosDeSabadoANoiteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});


			//Eventos de aumentar
			btRajadaDeFlechasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRajadaDeFlechas, "RajadaDeFlechas", 10, 1, "Aumentar");

				}
			});
			btChuvaDeFlechasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRajadaDeFlechas<5 && count<5){
						atualizarCalculo(varRajadaDeFlechas, "RajadaDeFlechas", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varChuvaDeFlechas, "ChuvaDeFlechas", 10, 1, "Aumentar");

				}
			});
			btOlhosDeAguiaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 1, "Aumentar");

				}
			});
			btPrecisaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");

				}
			});
			btConcentracaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varOlhosDeAguia<1 && count<1){
						atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varConcentracao, "Concentracao", 10, 1, "Aumentar");

				}
			});
			btEncerramentoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");

				}
			});
			btBisAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBis, "Bis", 1, 2, "Aumentar");

				}
			});
			btDancaDoVentreAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");

				}
			});
			btNaoMeAbandonesAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<3 && count<3){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varNaoMeAbandones, "NaoMeAbandones", 10, 2, "Aumentar");

				}
			});
			btDancaCiganaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<3 && count<3){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDancaCigana, "DancaCigana", 10, 2, "Aumentar");

				}
			});
			btBeijoDaSorteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<3 && count<3){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBeijoDaSorte, "BeijoDaSorte", 10, 2, "Aumentar");

				}
			});
			btSibiloAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<3 && count<3){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSibilo, "Sibilo", 10, 2, "Aumentar");

				}
			});
			btEscandaloAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varBis<1 && count<1){
						atualizarCalculo(varBis, "Bis", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEscandalo, "Escandalo", 5, 2, "Aumentar");

				}
			});
			btLicoesDeDancaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");

				}
			});
			btEstilingueAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicoesDeDanca<3 && count<3){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEstilingue, "Estilingue", 5, 2, "Aumentar");

				}
			});
			btOdeASiegfriedAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<3 && count<3){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varBeijoDaSorte<10 && count<10){
						atualizarCalculo(varBeijoDaSorte, "BeijoDaSorte", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varOdeASiegfried, "OdeASiegfried", 5, 2, "Aumentar");

				}
			});
			btBanqueteDeNjordAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<3 && count<3){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varBeijoDaSorte<10 && count<10){
						atualizarCalculo(varBeijoDaSorte, "BeijoDaSorte", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varOdeASiegfried<3 && count<3){
						atualizarCalculo(varOdeASiegfried, "OdeASiegfried", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBanqueteDeNjord, "BanqueteDeNjord", 5, 2, "Aumentar");

				}
			});
			btRufarDosTamboresAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<3 && count<3){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaCigana<10 && count<10){
						atualizarCalculo(varDancaCigana, "DancaCigana", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRufarDosTambores, "RufarDosTambores", 5, 2, "Aumentar");

				}
			});
			btAnelDeNibelungosAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<3 && count<3){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaCigana<10 && count<10){
						atualizarCalculo(varDancaCigana, "DancaCigana", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRufarDosTambores<3 && count<3){
						atualizarCalculo(varRufarDosTambores, "RufarDosTambores", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAnelDeNibelungos, "AnelDeNibelungos", 5, 2, "Aumentar");

				}
			});
			btRitmoCaoticoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<3 && count<3){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varNaoMeAbandones<10 && count<10){
						atualizarCalculo(varNaoMeAbandones, "NaoMeAbandones", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLamentoDeLoki<1 && count<1){
						atualizarCalculo(varLamentoDeLoki, "LamentoDeLoki", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRitmoCaotico, "RitmoCaotico", 1, 2, "Aumentar");

				}
			});
			btLamentoDeLokiAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<3 && count<3){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varNaoMeAbandones<10 && count<10){
						atualizarCalculo(varNaoMeAbandones, "NaoMeAbandones", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varLamentoDeLoki, "LamentoDeLoki", 1, 2, "Aumentar");

				}
			});
			btCantigaDeNinarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<3 && count<3){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varSibilo<10 && count<10){
						atualizarCalculo(varSibilo, "Sibilo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCantigaDeNinar, "CantigaDeNinar", 1, 2, "Aumentar");

				}
			});
			btCancaoPreciosaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<3 && count<3){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varSibilo<10 && count<10){
						atualizarCalculo(varSibilo, "Sibilo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCantigaDeNinar<1 && count<1){
						atualizarCalculo(varCantigaDeNinar, "CantigaDeNinar", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCancaoPreciosa, "CancaoPreciosa", 1, 2, "Aumentar");

				}
			});
			btVulcaoDeFlechasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRajadaDeFlechas<5 && count<5){
						atualizarCalculo(varRajadaDeFlechas, "RajadaDeFlechas", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varChuvaDeFlechas<5 && count<5){
						atualizarCalculo(varChuvaDeFlechas, "ChuvaDeFlechas", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<3 && count<3){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstilingue<1 && count<1){
						atualizarCalculo(varEstilingue, "Estilingue", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varVulcaoDeFlechas, "VulcaoDeFlechas", 10, 3, "Aumentar");

				}
			});
			btBastaoDeHermodAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varOlhosDeAguia<1 && count<1){
						atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varConcentracao<10 && count<10){
						atualizarCalculo(varConcentracao, "Concentracao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<10 && count<10){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBastaoDeHermod, "BastaoDeHermod", 5, 3, "Aumentar");

				}
			});
			btControleDeMarioneteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varOlhosDeAguia<1 && count<1){
						atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varConcentracao<10 && count<10){
						atualizarCalculo(varConcentracao, "Concentracao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<5 && count<5){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varControleDeMarionete, "ControleDeMarionete", 1, 3, "Aumentar");

				}
			});
			btDestinoNasCartasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varOlhosDeAguia<1 && count<1){
						atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varConcentracao<10 && count<10){
						atualizarCalculo(varConcentracao, "Concentracao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<3 && count<3){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDestinoNasCartas, "DestinoNasCartas", 5, 3, "Aumentar");

				}
			});
			btBencaoProtetoraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varOlhosDeAguia<1 && count<1){
						atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varConcentracao<5 && count<5){
						atualizarCalculo(varConcentracao, "Concentracao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<7 && count<7){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBencaoProtetora, "BencaoProtetora", 5, 3, "Aumentar");

				}
			});
			btGritoDeLiberdadeAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<3 && count<3){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<10 && count<10){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varOlhosDeAguia<1 && count<1){
						atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varConcentracao<10 && count<10){
						atualizarCalculo(varConcentracao, "Concentracao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<5 && count<5){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varControleDeMarionete<1 && count<1){
						atualizarCalculo(varControleDeMarionete, "ControleDeMarionete", 1, 3, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGritoDeLiberdade, "GritoDeLiberdade", 5, 3, "Aumentar");

				}
			});
			btRitmoContagianteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRitmoContagiante, "RitmoContagiante", 5, 4, "Aumentar");

				}
			});
			btBaladaSinfonicaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBaladaSinfonica, "BaladaSinfonica", 5, 4, "Aumentar");

				}
			});
			btSerenataAoLuarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSerenataAoLuar, "SerenataAoLuar", 5, 4, "Aumentar");

				}
			});
			btDominioMusicalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");

				}
			});
			btMelodiaDeMorfeuAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");

				}
			});
			btRessonanciaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<5 && count<5){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRessonancia, "Ressonancia", 5, 4, "Aumentar");

				}
			});
			btAtivarRessonanciaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<5 && count<5){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRessonancia<1 && count<1){
						atualizarCalculo(varRessonancia, "Ressonancia", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAtivarRessonancia, "AtivarRessonancia", 1, 4, "Aumentar");

				}
			});
			btRuidoEstridenteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<5 && count<5){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRessonancia<1 && count<1){
						atualizarCalculo(varRessonancia, "Ressonancia", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtivarRessonancia<1 && count<1){
						atualizarCalculo(varAtivarRessonancia, "AtivarRessonancia", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRuidoEstridente, "RuidoEstridente", 5, 4, "Aumentar");

				}
			});
			btSibiloDeEirAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSibiloDeEir, "SibiloDeEir", 5, 4, "Aumentar");

				}
			});
			btRequiemDeOrfeuAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSibiloDeEir<3 && count<3){
						atualizarCalculo(varSibiloDeEir, "SibiloDeEir", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRequiemDeOrfeu, "RequiemDeOrfeu", 5, 4, "Aumentar");

				}
			});
			btPoemaDeNifflheimAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPoemaDeNifflheim, "PoemaDeNifflheim", 5, 4, "Aumentar");

				}
			});
			btCantoDaSereiaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPoemaDeNifflheim<3 && count<3){
						atualizarCalculo(varPoemaDeNifflheim, "PoemaDeNifflheim", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCantoDaSereia, "CantoDaSereia", 5, 4, "Aumentar");

				}
			});
			btImprovisoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPoemaDeNifflheim<1 && count<1){
						atualizarCalculo(varPoemaDeNifflheim, "PoemaDeNifflheim", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varImproviso, "Improviso", 5, 4, "Aumentar");

				}
			});
			btOdeAHelaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPoemaDeNifflheim<1 && count<1){
						atualizarCalculo(varPoemaDeNifflheim, "PoemaDeNifflheim", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varImproviso<1 && count<1){
						atualizarCalculo(varImproviso, "Improviso", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varOdeAHela, "OdeAHela", 5, 4, "Aumentar");

				}
			});
			btTemporalDeMilFlechasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicoesDeDanca<3 && count<3){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstilingue<5 && count<5){
						atualizarCalculo(varEstilingue, "Estilingue", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTemporalDeMilFlechas, "TemporalDeMilFlechas", 5, 4, "Aumentar");

				}
			});
			btBradoDeOdinAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEncerramento<1 && count<1){
						atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicoesDeDanca<1 && count<1){
						atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaDoVentre<5 && count<5){
						atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRessonancia<1 && count<1){
						atualizarCalculo(varRessonancia, "Ressonancia", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtivarRessonancia<1 && count<1){
						atualizarCalculo(varAtivarRessonancia, "AtivarRessonancia", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRuidoEstridente<1 && count<1){
						atualizarCalculo(varRuidoEstridente, "RuidoEstridente", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBradoDeOdin, "BradoDeOdin", 5, 4, "Aumentar");

				}
			});
			btOrvalhoDeIdunAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBaladaSinfonica<1 && count<1){
						atualizarCalculo(varBaladaSinfonica, "BaladaSinfonica", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSerenataAoLuar<1 && count<1){
						atualizarCalculo(varSerenataAoLuar, "SerenataAoLuar", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRitmoContagiante<1 && count<1){
						atualizarCalculo(varRitmoContagiante, "RitmoContagiante", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varOrvalhoDeIdun, "OrvalhoDeIdun", 5, 4, "Aumentar");

				}
			});
			btCancaoDeAlfheimAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBaladaSinfonica<1 && count<1){
						atualizarCalculo(varBaladaSinfonica, "BaladaSinfonica", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSerenataAoLuar<1 && count<1){
						atualizarCalculo(varSerenataAoLuar, "SerenataAoLuar", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRitmoContagiante<1 && count<1){
						atualizarCalculo(varRitmoContagiante, "RitmoContagiante", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCancaoDeAlfheim, "CancaoDeAlfheim", 5, 4, "Aumentar");

				}
			});
			btDancaComLobosAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBaladaSinfonica<1 && count<1){
						atualizarCalculo(varBaladaSinfonica, "BaladaSinfonica", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSerenataAoLuar<1 && count<1){
						atualizarCalculo(varSerenataAoLuar, "SerenataAoLuar", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRitmoContagiante<1 && count<1){
						atualizarCalculo(varRitmoContagiante, "RitmoContagiante", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDancaComLobos, "DancaComLobos", 5, 4, "Aumentar");

				}
			});
			btCanticoDaIluminacaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBaladaSinfonica<1 && count<1){
						atualizarCalculo(varBaladaSinfonica, "BaladaSinfonica", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSerenataAoLuar<1 && count<1){
						atualizarCalculo(varSerenataAoLuar, "SerenataAoLuar", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRitmoContagiante<1 && count<1){
						atualizarCalculo(varRitmoContagiante, "RitmoContagiante", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCancaoDeAlfheim<1 && count<1){
						atualizarCalculo(varCancaoDeAlfheim, "CancaoDeAlfheim", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCanticoDaIluminacao, "CanticoDaIluminacao", 5, 4, "Aumentar");

				}
			});
			btClamorDeBatalhaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBaladaSinfonica<1 && count<1){
						atualizarCalculo(varBaladaSinfonica, "BaladaSinfonica", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSerenataAoLuar<1 && count<1){
						atualizarCalculo(varSerenataAoLuar, "SerenataAoLuar", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRitmoContagiante<1 && count<1){
						atualizarCalculo(varRitmoContagiante, "RitmoContagiante", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaComLobos<1 && count<1){
						atualizarCalculo(varDancaComLobos, "DancaComLobos", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varClamorDeBatalha, "ClamorDeBatalha", 5, 4, "Aumentar");

				}
			});
			btPreludioDoRagnarokAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBaladaSinfonica<1 && count<1){
						atualizarCalculo(varBaladaSinfonica, "BaladaSinfonica", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSerenataAoLuar<1 && count<1){
						atualizarCalculo(varSerenataAoLuar, "SerenataAoLuar", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRitmoContagiante<1 && count<1){
						atualizarCalculo(varRitmoContagiante, "RitmoContagiante", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaComLobos<1 && count<1){
						atualizarCalculo(varDancaComLobos, "DancaComLobos", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varEmbalosDeSabadoANoite<3 && count<3){
						atualizarCalculo(varEmbalosDeSabadoANoite, "EmbalosDeSabadoANoite", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBaladaSinfonica<1 && count<1){
						atualizarCalculo(varBaladaSinfonica, "BaladaSinfonica", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSerenataAoLuar<1 && count<1){
						atualizarCalculo(varSerenataAoLuar, "SerenataAoLuar", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRitmoContagiante<1 && count<1){
						atualizarCalculo(varRitmoContagiante, "RitmoContagiante", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCancaoDeAlfheim<1 && count<1){
						atualizarCalculo(varCancaoDeAlfheim, "CancaoDeAlfheim", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCanticoDaIluminacao<3 && count<3){
						atualizarCalculo(varCanticoDaIluminacao, "CanticoDaIluminacao", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPreludioDoRagnarok, "PreludioDoRagnarok", 5, 4, "Aumentar");

				}
			});
			btMurmurioPereneAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBaladaSinfonica<1 && count<1){
						atualizarCalculo(varBaladaSinfonica, "BaladaSinfonica", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSerenataAoLuar<1 && count<1){
						atualizarCalculo(varSerenataAoLuar, "SerenataAoLuar", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRitmoContagiante<1 && count<1){
						atualizarCalculo(varRitmoContagiante, "RitmoContagiante", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaComLobos<1 && count<1){
						atualizarCalculo(varDancaComLobos, "DancaComLobos", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varEmbalosDeSabadoANoite<3 && count<3){
						atualizarCalculo(varEmbalosDeSabadoANoite, "EmbalosDeSabadoANoite", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBaladaSinfonica<1 && count<1){
						atualizarCalculo(varBaladaSinfonica, "BaladaSinfonica", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSerenataAoLuar<1 && count<1){
						atualizarCalculo(varSerenataAoLuar, "SerenataAoLuar", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRitmoContagiante<1 && count<1){
						atualizarCalculo(varRitmoContagiante, "RitmoContagiante", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCancaoDeAlfheim<1 && count<1){
						atualizarCalculo(varCancaoDeAlfheim, "CancaoDeAlfheim", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCanticoDaIluminacao<3 && count<3){
						atualizarCalculo(varCanticoDaIluminacao, "CanticoDaIluminacao", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPreludioDoRagnarok<1 && count<1){
						atualizarCalculo(varPreludioDoRagnarok, "PreludioDoRagnarok", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBaladaSinfonica<1 && count<1){
						atualizarCalculo(varBaladaSinfonica, "BaladaSinfonica", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSerenataAoLuar<1 && count<1){
						atualizarCalculo(varSerenataAoLuar, "SerenataAoLuar", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRitmoContagiante<1 && count<1){
						atualizarCalculo(varRitmoContagiante, "RitmoContagiante", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaComLobos<1 && count<1){
						atualizarCalculo(varDancaComLobos, "DancaComLobos", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varClamorDeBatalha<1 && count<1){
						atualizarCalculo(varClamorDeBatalha, "ClamorDeBatalha", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMurmurioPerene, "MurmurioPerene", 5, 4, "Aumentar");

				}
			});
			btEmbalosDeSabadoANoiteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBaladaSinfonica<1 && count<1){
						atualizarCalculo(varBaladaSinfonica, "BaladaSinfonica", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSerenataAoLuar<1 && count<1){
						atualizarCalculo(varSerenataAoLuar, "SerenataAoLuar", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioMusical<1 && count<1){
						atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMelodiaDeMorfeu<1 && count<1){
						atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRitmoContagiante<1 && count<1){
						atualizarCalculo(varRitmoContagiante, "RitmoContagiante", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDancaComLobos<1 && count<1){
						atualizarCalculo(varDancaComLobos, "DancaComLobos", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEmbalosDeSabadoANoite, "EmbalosDeSabadoANoite", 5, 4, "Aumentar");

				}
			});


			//Eventos de diminuir
			btRajadaDeFlechasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRajadaDeFlechas, "RajadaDeFlechas", 10, 1, "Diminuir");

				}
			});
			btChuvaDeFlechasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChuvaDeFlechas, "ChuvaDeFlechas", 10, 1, "Diminuir");

				}
			});
			btOlhosDeAguiaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 1, "Diminuir");

				}
			});
			btPrecisaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Diminuir");

				}
			});
			btConcentracaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varConcentracao, "Concentracao", 10, 1, "Diminuir");

				}
			});
			btEncerramentoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEncerramento, "Encerramento", 1, 2, "Diminuir");

				}
			});
			btBisDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBis, "Bis", 1, 2, "Diminuir");

				}
			});
			btDancaDoVentreDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDancaDoVentre, "DancaDoVentre", 5, 2, "Diminuir");

				}
			});
			btNaoMeAbandonesDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varNaoMeAbandones, "NaoMeAbandones", 10, 2, "Diminuir");

				}
			});
			btDancaCiganaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDancaCigana, "DancaCigana", 10, 2, "Diminuir");

				}
			});
			btBeijoDaSorteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBeijoDaSorte, "BeijoDaSorte", 10, 2, "Diminuir");

				}
			});
			btSibiloDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSibilo, "Sibilo", 10, 2, "Diminuir");

				}
			});
			btEscandaloDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEscandalo, "Escandalo", 5, 2, "Diminuir");

				}
			});
			btLicoesDeDancaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLicoesDeDanca, "LicoesDeDanca", 10, 2, "Diminuir");

				}
			});
			btEstilingueDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEstilingue, "Estilingue", 5, 2, "Diminuir");

				}
			});
			btOdeASiegfriedDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOdeASiegfried, "OdeASiegfried", 5, 2, "Diminuir");

				}
			});
			btBanqueteDeNjordDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBanqueteDeNjord, "BanqueteDeNjord", 5, 2, "Diminuir");

				}
			});
			btRufarDosTamboresDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRufarDosTambores, "RufarDosTambores", 5, 2, "Diminuir");

				}
			});
			btAnelDeNibelungosDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAnelDeNibelungos, "AnelDeNibelungos", 5, 2, "Diminuir");

				}
			});
			btRitmoCaoticoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRitmoCaotico, "RitmoCaotico", 1, 2, "Diminuir");

				}
			});
			btLamentoDeLokiDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLamentoDeLoki, "LamentoDeLoki", 1, 2, "Diminuir");

				}
			});
			btCantigaDeNinarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCantigaDeNinar, "CantigaDeNinar", 1, 2, "Diminuir");

				}
			});
			btCancaoPreciosaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCancaoPreciosa, "CancaoPreciosa", 1, 2, "Diminuir");

				}
			});
			btVulcaoDeFlechasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varVulcaoDeFlechas, "VulcaoDeFlechas", 10, 3, "Diminuir");

				}
			});
			btBastaoDeHermodDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBastaoDeHermod, "BastaoDeHermod", 5, 3, "Diminuir");

				}
			});
			btControleDeMarioneteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varControleDeMarionete, "ControleDeMarionete", 1, 3, "Diminuir");

				}
			});
			btDestinoNasCartasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDestinoNasCartas, "DestinoNasCartas", 5, 3, "Diminuir");

				}
			});
			btBencaoProtetoraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBencaoProtetora, "BencaoProtetora", 5, 3, "Diminuir");

				}
			});
			btGritoDeLiberdadeDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGritoDeLiberdade, "GritoDeLiberdade", 5, 3, "Diminuir");

				}
			});
			btRitmoContagianteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRitmoContagiante, "RitmoContagiante", 5, 4, "Diminuir");

				}
			});
			btBaladaSinfonicaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBaladaSinfonica, "BaladaSinfonica", 5, 4, "Diminuir");

				}
			});
			btSerenataAoLuarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSerenataAoLuar, "SerenataAoLuar", 5, 4, "Diminuir");

				}
			});
			btDominioMusicalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDominioMusical, "DominioMusical", 10, 4, "Diminuir");

				}
			});
			btMelodiaDeMorfeuDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMelodiaDeMorfeu, "MelodiaDeMorfeu", 5, 4, "Diminuir");

				}
			});
			btRessonanciaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRessonancia, "Ressonancia", 5, 4, "Diminuir");

				}
			});
			btAtivarRessonanciaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtivarRessonancia, "AtivarRessonancia", 1, 4, "Diminuir");

				}
			});
			btRuidoEstridenteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRuidoEstridente, "RuidoEstridente", 5, 4, "Diminuir");

				}
			});
			btSibiloDeEirDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSibiloDeEir, "SibiloDeEir", 5, 4, "Diminuir");

				}
			});
			btRequiemDeOrfeuDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRequiemDeOrfeu, "RequiemDeOrfeu", 5, 4, "Diminuir");

				}
			});
			btPoemaDeNifflheimDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPoemaDeNifflheim, "PoemaDeNifflheim", 5, 4, "Diminuir");

				}
			});
			btCantoDaSereiaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCantoDaSereia, "CantoDaSereia", 5, 4, "Diminuir");

				}
			});
			btImprovisoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varImproviso, "Improviso", 5, 4, "Diminuir");

				}
			});
			btOdeAHelaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOdeAHela, "OdeAHela", 5, 4, "Diminuir");

				}
			});
			btTemporalDeMilFlechasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTemporalDeMilFlechas, "TemporalDeMilFlechas", 5, 4, "Diminuir");

				}
			});
			btBradoDeOdinDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBradoDeOdin, "BradoDeOdin", 5, 4, "Diminuir");

				}
			});
			btOrvalhoDeIdunDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOrvalhoDeIdun, "OrvalhoDeIdun", 5, 4, "Diminuir");

				}
			});
			btCancaoDeAlfheimDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCancaoDeAlfheim, "CancaoDeAlfheim", 5, 4, "Diminuir");

				}
			});
			btDancaComLobosDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDancaComLobos, "DancaComLobos", 5, 4, "Diminuir");

				}
			});
			btCanticoDaIluminacaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCanticoDaIluminacao, "CanticoDaIluminacao", 5, 4, "Diminuir");

				}
			});
			btClamorDeBatalhaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varClamorDeBatalha, "ClamorDeBatalha", 5, 4, "Diminuir");

				}
			});
			btPreludioDoRagnarokDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPreludioDoRagnarok, "PreludioDoRagnarok", 5, 4, "Diminuir");

				}
			});
			btMurmurioPereneDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMurmurioPerene, "MurmurioPerene", 5, 4, "Diminuir");

				}
			});
			btEmbalosDeSabadoANoiteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEmbalosDeSabadoANoite, "EmbalosDeSabadoANoite", 5, 4, "Diminuir");

				}
			});


			//Outros Botões
			btResetar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					varRajadaDeFlechas = 0;
					varChuvaDeFlechas = 0;
					varOlhosDeAguia = 0;
					varPrecisao = 0;
					varConcentracao = 0;
					varEncerramento = 0;
					varBis = 0;
					varDancaDoVentre = 0;
					varNaoMeAbandones = 0;
					varDancaCigana = 0;
					varBeijoDaSorte = 0;
					varSibilo = 0;
					varEscandalo = 0;
					varLicoesDeDanca = 0;
					varEstilingue = 0;
					varOdeASiegfried = 0;
					varBanqueteDeNjord = 0;
					varRufarDosTambores = 0;
					varAnelDeNibelungos = 0;
					varRitmoCaotico = 0;
					varLamentoDeLoki = 0;
					varCantigaDeNinar = 0;
					varCancaoPreciosa = 0;
					varVulcaoDeFlechas = 0;
					varBastaoDeHermod = 0;
					varControleDeMarionete = 0;
					varDestinoNasCartas = 0;
					varBencaoProtetora = 0;
					varGritoDeLiberdade = 0;
					varRitmoContagiante = 0;
					varBaladaSinfonica = 0;
					varSerenataAoLuar = 0;
					varDominioMusical = 0;
					varMelodiaDeMorfeu = 0;
					varRessonancia = 0;
					varAtivarRessonancia = 0;
					varRuidoEstridente = 0;
					varSibiloDeEir = 0;
					varRequiemDeOrfeu = 0;
					varPoemaDeNifflheim = 0;
					varCantoDaSereia = 0;
					varImproviso = 0;
					varOdeAHela = 0;
					varTemporalDeMilFlechas = 0;
					varBradoDeOdin = 0;
					varOrvalhoDeIdun = 0;
					varCancaoDeAlfheim = 0;
					varDancaComLobos = 0;
					varCanticoDaIluminacao = 0;
					varClamorDeBatalha = 0;
					varPreludioDoRagnarok = 0;
					varMurmurioPerene = 0;
					varEmbalosDeSabadoANoite = 0;

					primeiraClasse = 49;
					segundaClasse = 49;
					transClasse = 20;
					terceiraClasse = 49;

					skillPrimeira = 0;
					skillSegunda = 0;
					skillTrans = 0;
					skillTerceira = 0;
					atualizarTela();

				}
			});

			btSalvar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					if (id > 0){
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorMusa.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorMusa.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorMusa.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorMusa.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorMusa.this);
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
			
			btSalvarIMG.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {

					AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorMusa.this);
					msg.setTitle("Escolha um nome");
					msg.setMessage("OBS: Salvar PNG só irá salvar em forma de imagem! É recomendado que salve a build na memória do celular também.\nEscolha um nome para salvar esta simulação:");
					final EditText nomeParaSalvar = new EditText(SimuladorMusa.this);
					msg.setView(nomeParaSalvar);
					msg.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {

							@Override
						public void onClick(DialogInterface dialog, int which) {
							if (nomeParaSalvar.getText().toString().length() <= 0) {
								nomeParaSalvar.setError("Preencha o campo!");
								Toast.makeText(getBaseContext(), "ERROR: Insira um nome!", Toast.LENGTH_SHORT).show();
							} else {
								SaveFile sf = new SaveFile();
								sf.takeAScreenShot(SimuladorMusa.this, layPrincipal, nomeParaSalvar.getText().toString());
							}
							}
						});

						msg.setNeutralButton("Cancelar", null);
						msg.show();

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
			if(varRajadaDeFlechas==0)
				layRajadaDeFlechas.setVisibility(View.GONE);
			if(varChuvaDeFlechas==0)
				layChuvaDeFlechas.setVisibility(View.GONE);
			if(varOlhosDeAguia==0)
				layOlhosDeAguia.setVisibility(View.GONE);
			if(varPrecisao==0)
				layPrecisao.setVisibility(View.GONE);
			if(varConcentracao==0)
				layConcentracao.setVisibility(View.GONE);

			if(varEncerramento==0)
				layEncerramento.setVisibility(View.GONE);
			if(varBis==0)
				layBis.setVisibility(View.GONE);
			if(varDancaDoVentre==0)
				layDancaDoVentre.setVisibility(View.GONE);
			if(varNaoMeAbandones==0)
				layNaoMeAbandones.setVisibility(View.GONE);
			if(varDancaCigana==0)
				layDancaCigana.setVisibility(View.GONE);
			if(varBeijoDaSorte==0)
				layBeijoDaSorte.setVisibility(View.GONE);
			if(varSibilo==0)
				laySibilo.setVisibility(View.GONE);
			if(varEscandalo==0)
				layEscandalo.setVisibility(View.GONE);
			if(varLicoesDeDanca==0)
				layLicoesDeDanca.setVisibility(View.GONE);
			if(varEstilingue==0)
				layEstilingue.setVisibility(View.GONE);
			if(varOdeASiegfried==0)
				layOdeASiegfried.setVisibility(View.GONE);
			if(varBanqueteDeNjord==0)
				layBanqueteDeNjord.setVisibility(View.GONE);
			if(varRufarDosTambores==0)
				layRufarDosTambores.setVisibility(View.GONE);
			if(varAnelDeNibelungos==0)
				layAnelDeNibelungos.setVisibility(View.GONE);
			if(varRitmoCaotico==0)
				layRitmoCaotico.setVisibility(View.GONE);
			if(varLamentoDeLoki==0)
				layLamentoDeLoki.setVisibility(View.GONE);
			if(varCantigaDeNinar==0)
				layCantigaDeNinar.setVisibility(View.GONE);
			if(varCancaoPreciosa==0)
				layCancaoPreciosa.setVisibility(View.GONE);

			if(varVulcaoDeFlechas==0)
				layVulcaoDeFlechas.setVisibility(View.GONE);
			if(varBastaoDeHermod==0)
				layBastaoDeHermod.setVisibility(View.GONE);
			if(varControleDeMarionete==0)
				layControleDeMarionete.setVisibility(View.GONE);
			if(varDestinoNasCartas==0)
				layDestinoNasCartas.setVisibility(View.GONE);
			if(varBencaoProtetora==0)
				layBencaoProtetora.setVisibility(View.GONE);
			if(varGritoDeLiberdade==0)
				layGritoDeLiberdade.setVisibility(View.GONE);

			if(varRitmoContagiante==0)
				layRitmoContagiante.setVisibility(View.GONE);
			if(varBaladaSinfonica==0)
				layBaladaSinfonica.setVisibility(View.GONE);
			if(varSerenataAoLuar==0)
				laySerenataAoLuar.setVisibility(View.GONE);
			if(varDominioMusical==0)
				layDominioMusical.setVisibility(View.GONE);
			if(varMelodiaDeMorfeu==0)
				layMelodiaDeMorfeu.setVisibility(View.GONE);
			if(varRessonancia==0)
				layRessonancia.setVisibility(View.GONE);
			if(varAtivarRessonancia==0)
				layAtivarRessonancia.setVisibility(View.GONE);
			if(varRuidoEstridente==0)
				layRuidoEstridente.setVisibility(View.GONE);
			if(varSibiloDeEir==0)
				laySibiloDeEir.setVisibility(View.GONE);
			if(varRequiemDeOrfeu==0)
				layRequiemDeOrfeu.setVisibility(View.GONE);
			if(varPoemaDeNifflheim==0)
				layPoemaDeNifflheim.setVisibility(View.GONE);
			if(varCantoDaSereia==0)
				layCantoDaSereia.setVisibility(View.GONE);
			if(varImproviso==0)
				layImproviso.setVisibility(View.GONE);
			if(varOdeAHela==0)
				layOdeAHela.setVisibility(View.GONE);
			if(varTemporalDeMilFlechas==0)
				layTemporalDeMilFlechas.setVisibility(View.GONE);
			if(varBradoDeOdin==0)
				layBradoDeOdin.setVisibility(View.GONE);
			if(varOrvalhoDeIdun==0)
				layOrvalhoDeIdun.setVisibility(View.GONE);
			if(varCancaoDeAlfheim==0)
				layCancaoDeAlfheim.setVisibility(View.GONE);
			if(varDancaComLobos==0)
				layDancaComLobos.setVisibility(View.GONE);
			if(varCanticoDaIluminacao==0)
				layCanticoDaIluminacao.setVisibility(View.GONE);
			if(varClamorDeBatalha==0)
				layClamorDeBatalha.setVisibility(View.GONE);
			if(varPreludioDoRagnarok==0)
				layPreludioDoRagnarok.setVisibility(View.GONE);
			if(varMurmurioPerene==0)
				layMurmurioPerene.setVisibility(View.GONE);
			if(varEmbalosDeSabadoANoite==0)
				layEmbalosDeSabadoANoite.setVisibility(View.GONE);

		}

		public void atualizarCalculo(int habilidade, String nomeDaHabilidade, int pontosMax, int classe, String acao){
			if (acao=="Aumentar"){

				if (habilidade < pontosMax){

					if (classe==1){
						if (primeiraClasse>0){
							primeiraClasse--;
							skillPrimeira++;
							habilidade++;
						} else if (segundaClasse>0){
							segundaClasse--;
							skillPrimeira++;
							habilidade++;
						} else if (transClasse>0){
							transClasse--;
							skillPrimeira++;
							habilidade++;
						} else if (terceiraClasse>0){
							terceiraClasse--;
							skillPrimeira++;
							habilidade++;
						} else {
							Toast.makeText(this, "0 pontos disponiveis", Toast.LENGTH_LONG).show();
						}

					} else if (classe==2){
						if (segundaClasse>0){
							segundaClasse--;
							skillSegunda++;
							habilidade++;
						} else if (transClasse>0){
							transClasse--;
							skillSegunda++;
							habilidade++;
						} else if (terceiraClasse>0){
							terceiraClasse--;
							skillSegunda++;
							habilidade++;
						} else {
							Toast.makeText(this, "0 pontos disponiveis", Toast.LENGTH_LONG).show();
						}

					} else if (classe==3){
						if (transClasse>0){
							transClasse--;
							skillTrans++;
							habilidade++;
						} else if (segundaClasse>0){
							segundaClasse--;
							skillTrans++;
							habilidade++;
						} else if (terceiraClasse>0){
							terceiraClasse--;
							skillTrans++;
							habilidade++;
						}  else {
							Toast.makeText(this, "0 pontos disponiveis", Toast.LENGTH_LONG).show();
						}

					} else if (classe==4){
						if (terceiraClasse>0){
							terceiraClasse--;
							skillTerceira++;
							habilidade++;
						} else {
							Toast.makeText(this, "0 pontos disponiveis", Toast.LENGTH_LONG).show();
						}
					}

				}

			} else if (acao=="Diminuir"){
				boolean podeDiminuir = true;

				if (nomeDaHabilidade=="RajadaDeFlechas" && varChuvaDeFlechas>=1 && varRajadaDeFlechas<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Precisao" && varOlhosDeAguia>=1 && varPrecisao<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Precisao" && varConcentracao>=1 && varPrecisao<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OlhosDeAguia" && varConcentracao>=1 && varOlhosDeAguia<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Encerramento" && varBis>=1 && varEncerramento<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Encerramento" && varDancaDoVentre>=1 && varEncerramento<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LicoesDeDanca" && varDancaDoVentre>=1 && varLicoesDeDanca<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DancaDoVentre" && varNaoMeAbandones>=1 && varDancaDoVentre<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DancaDoVentre" && varDancaCigana>=1 && varDancaDoVentre<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DancaDoVentre" && varBeijoDaSorte>=1 && varDancaDoVentre<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DancaDoVentre" && varSibilo>=1 && varDancaDoVentre<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Bis" && varEscandalo>=1 && varBis<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LicoesDeDanca" && varEstilingue>=1 && varLicoesDeDanca<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="BeijoDaSorte" && varOdeASiegfried>=1 && varBeijoDaSorte<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OdeASiegfried" && varBanqueteDeNjord>=1 && varOdeASiegfried<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DancaCigana" && varRufarDosTambores>=1 && varDancaCigana<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RufarDosTambores" && varAnelDeNibelungos>=1 && varRufarDosTambores<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LamentoDeLoki" && varRitmoCaotico>=1 && varLamentoDeLoki<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="NaoMeAbandones" && varLamentoDeLoki>=1 && varNaoMeAbandones<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Sibilo" && varCantigaDeNinar>=1 && varSibilo<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CantigaDeNinar" && varCancaoPreciosa>=1 && varCantigaDeNinar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ChuvaDeFlechas" && varVulcaoDeFlechas>=1 && varChuvaDeFlechas<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Estilingue" && varVulcaoDeFlechas>=1 && varEstilingue<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Concentracao" && varBastaoDeHermod>=1 && varConcentracao<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LicoesDeDanca" && varBastaoDeHermod>=1 && varLicoesDeDanca<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Concentracao" && varControleDeMarionete>=1 && varConcentracao<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LicoesDeDanca" && varControleDeMarionete>=1 && varLicoesDeDanca<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Concentracao" && varDestinoNasCartas>=1 && varConcentracao<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LicoesDeDanca" && varDestinoNasCartas>=1 && varLicoesDeDanca<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Concentracao" && varBencaoProtetora>=1 && varConcentracao<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LicoesDeDanca" && varBencaoProtetora>=1 && varLicoesDeDanca<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DancaDoVentre" && varGritoDeLiberdade>=1 && varDancaDoVentre<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LicoesDeDanca" && varGritoDeLiberdade>=1 && varLicoesDeDanca<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ControleDeMarionete" && varGritoDeLiberdade>=1 && varControleDeMarionete<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MelodiaDeMorfeu" && varRitmoContagiante>=1 && varMelodiaDeMorfeu<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MelodiaDeMorfeu" && varBaladaSinfonica>=1 && varMelodiaDeMorfeu<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MelodiaDeMorfeu" && varSerenataAoLuar>=1 && varMelodiaDeMorfeu<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DominioMusical" && varMelodiaDeMorfeu>=1 && varDominioMusical<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DancaDoVentre" && varRessonancia>=1 && varDancaDoVentre<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Ressonancia" && varAtivarRessonancia>=1 && varRessonancia<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtivarRessonancia" && varRuidoEstridente>=1 && varAtivarRessonancia<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DominioMusical" && varSibiloDeEir>=1 && varDominioMusical<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="SibiloDeEir" && varRequiemDeOrfeu>=1 && varSibiloDeEir<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DominioMusical" && varPoemaDeNifflheim>=1 && varDominioMusical<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PoemaDeNifflheim" && varCantoDaSereia>=1 && varPoemaDeNifflheim<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PoemaDeNifflheim" && varImproviso>=1 && varPoemaDeNifflheim<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Improviso" && varOdeAHela>=1 && varImproviso<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Estilingue" && varTemporalDeMilFlechas>=1 && varEstilingue<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RuidoEstridente" && varBradoDeOdin>=1 && varRuidoEstridente<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="BaladaSinfonica" && varOrvalhoDeIdun>=1 && varBaladaSinfonica<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="SerenataAoLuar" && varOrvalhoDeIdun>=1 && varSerenataAoLuar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RitmoContagiante" && varOrvalhoDeIdun>=1 && varRitmoContagiante<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="BaladaSinfonica" && varCancaoDeAlfheim>=1 && varBaladaSinfonica<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="SerenataAoLuar" && varCancaoDeAlfheim>=1 && varSerenataAoLuar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RitmoContagiante" && varCancaoDeAlfheim>=1 && varRitmoContagiante<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="BaladaSinfonica" && varDancaComLobos>=1 && varBaladaSinfonica<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="SerenataAoLuar" && varDancaComLobos>=1 && varSerenataAoLuar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RitmoContagiante" && varDancaComLobos>=1 && varRitmoContagiante<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CancaoDeAlfheim" && varCanticoDaIluminacao>=1 && varCancaoDeAlfheim<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DancaComLobos" && varClamorDeBatalha>=1 && varDancaComLobos<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EmbalosDeSabadoANoite" && varPreludioDoRagnarok>=1 && varEmbalosDeSabadoANoite<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CanticoDaIluminacao" && varPreludioDoRagnarok>=1 && varCanticoDaIluminacao<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PreludioDoRagnarok" && varMurmurioPerene>=1 && varPreludioDoRagnarok<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ClamorDeBatalha" && varMurmurioPerene>=1 && varClamorDeBatalha<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DancaComLobos" && varEmbalosDeSabadoANoite>=1 && varDancaComLobos<=01){
					podeDiminuir = false;
				}


				if(podeDiminuir){
					if (habilidade>0){
						habilidade--;

						if (classe==1){
							if (skillPrimeira>0 && skillPrimeira<=49 && primeiraClasse <49){
								primeiraClasse++;
							} else if ((segundaClasse+skillSegunda)<49){
								segundaClasse++;
							} else if ((transClasse + skillTrans)<20){
								transClasse++;
							} else if ((terceiraClasse+skillTerceira) <49){
								terceiraClasse++;
							}
							skillPrimeira--;
						} else if (classe==2){
							if (skillSegunda>0 && skillSegunda<=49 && segundaClasse <49){
								segundaClasse++;
							} else if ((transClasse + skillTrans)<20){
								transClasse++;
							} else if ((terceiraClasse+skillTerceira) <49){
								terceiraClasse++;
							}
							skillSegunda--;
						} else if (classe==3){
							if (skillTrans>0 && skillTrans<=20 && transClasse <20){
								transClasse++;
							} else if ((segundaClasse+skillSegunda) <49){
								segundaClasse++;
							} else if ((terceiraClasse+skillTerceira) <49){
								terceiraClasse++;
							}
							skillTrans--;
						} else if (classe==4){
							if (skillTerceira>0 && terceiraClasse <49){
								terceiraClasse++;
							}
							skillTerceira--;
						}
					}

				} else {
					Toast.makeText(this, "Essa Habilidade é pré requisito de outra já aprendia", Toast.LENGTH_LONG).show();
				}

				podeDiminuir=true;
			}
			if(nomeDaHabilidade=="RajadaDeFlechas"){
				varRajadaDeFlechas = habilidade;
			} else if(nomeDaHabilidade=="ChuvaDeFlechas"){
				varChuvaDeFlechas = habilidade;
			} else if(nomeDaHabilidade=="OlhosDeAguia"){
				varOlhosDeAguia = habilidade;
			} else if(nomeDaHabilidade=="Precisao"){
				varPrecisao = habilidade;
			} else if(nomeDaHabilidade=="Concentracao"){
				varConcentracao = habilidade;
			}

			else if(nomeDaHabilidade=="Encerramento"){
				varEncerramento = habilidade;
			} else if(nomeDaHabilidade=="Bis"){
				varBis = habilidade;
			} else if(nomeDaHabilidade=="DancaDoVentre"){
				varDancaDoVentre = habilidade;
			} else if(nomeDaHabilidade=="NaoMeAbandones"){
				varNaoMeAbandones = habilidade;
			} else if(nomeDaHabilidade=="DancaCigana"){
				varDancaCigana = habilidade;
			} else if(nomeDaHabilidade=="BeijoDaSorte"){
				varBeijoDaSorte = habilidade;
			} else if(nomeDaHabilidade=="Sibilo"){
				varSibilo = habilidade;
			} else if(nomeDaHabilidade=="Escandalo"){
				varEscandalo = habilidade;
			} else if(nomeDaHabilidade=="LicoesDeDanca"){
				varLicoesDeDanca = habilidade;
			} else if(nomeDaHabilidade=="Estilingue"){
				varEstilingue = habilidade;
			} else if(nomeDaHabilidade=="OdeASiegfried"){
				varOdeASiegfried = habilidade;
			} else if(nomeDaHabilidade=="BanqueteDeNjord"){
				varBanqueteDeNjord = habilidade;
			} else if(nomeDaHabilidade=="RufarDosTambores"){
				varRufarDosTambores = habilidade;
			} else if(nomeDaHabilidade=="AnelDeNibelungos"){
				varAnelDeNibelungos = habilidade;
			} else if(nomeDaHabilidade=="RitmoCaotico"){
				varRitmoCaotico = habilidade;
			} else if(nomeDaHabilidade=="LamentoDeLoki"){
				varLamentoDeLoki = habilidade;
			} else if(nomeDaHabilidade=="CantigaDeNinar"){
				varCantigaDeNinar = habilidade;
			} else if(nomeDaHabilidade=="CancaoPreciosa"){
				varCancaoPreciosa = habilidade;
			}

			else if(nomeDaHabilidade=="VulcaoDeFlechas"){
				varVulcaoDeFlechas = habilidade;
			} else if(nomeDaHabilidade=="BastaoDeHermod"){
				varBastaoDeHermod = habilidade;
			} else if(nomeDaHabilidade=="ControleDeMarionete"){
				varControleDeMarionete = habilidade;
			} else if(nomeDaHabilidade=="DestinoNasCartas"){
				varDestinoNasCartas = habilidade;
			} else if(nomeDaHabilidade=="BencaoProtetora"){
				varBencaoProtetora = habilidade;
			} else if(nomeDaHabilidade=="GritoDeLiberdade"){
				varGritoDeLiberdade = habilidade;
			}

			else if(nomeDaHabilidade=="RitmoContagiante"){
				varRitmoContagiante = habilidade;
			} else if(nomeDaHabilidade=="BaladaSinfonica"){
				varBaladaSinfonica = habilidade;
			} else if(nomeDaHabilidade=="SerenataAoLuar"){
				varSerenataAoLuar = habilidade;
			} else if(nomeDaHabilidade=="DominioMusical"){
				varDominioMusical = habilidade;
			} else if(nomeDaHabilidade=="MelodiaDeMorfeu"){
				varMelodiaDeMorfeu = habilidade;
			} else if(nomeDaHabilidade=="Ressonancia"){
				varRessonancia = habilidade;
			} else if(nomeDaHabilidade=="AtivarRessonancia"){
				varAtivarRessonancia = habilidade;
			} else if(nomeDaHabilidade=="RuidoEstridente"){
				varRuidoEstridente = habilidade;
			} else if(nomeDaHabilidade=="SibiloDeEir"){
				varSibiloDeEir = habilidade;
			} else if(nomeDaHabilidade=="RequiemDeOrfeu"){
				varRequiemDeOrfeu = habilidade;
			} else if(nomeDaHabilidade=="PoemaDeNifflheim"){
				varPoemaDeNifflheim = habilidade;
			} else if(nomeDaHabilidade=="CantoDaSereia"){
				varCantoDaSereia = habilidade;
			} else if(nomeDaHabilidade=="Improviso"){
				varImproviso = habilidade;
			} else if(nomeDaHabilidade=="OdeAHela"){
				varOdeAHela = habilidade;
			} else if(nomeDaHabilidade=="TemporalDeMilFlechas"){
				varTemporalDeMilFlechas = habilidade;
			} else if(nomeDaHabilidade=="BradoDeOdin"){
				varBradoDeOdin = habilidade;
			} else if(nomeDaHabilidade=="OrvalhoDeIdun"){
				varOrvalhoDeIdun = habilidade;
			} else if(nomeDaHabilidade=="CancaoDeAlfheim"){
				varCancaoDeAlfheim = habilidade;
			} else if(nomeDaHabilidade=="DancaComLobos"){
				varDancaComLobos = habilidade;
			} else if(nomeDaHabilidade=="CanticoDaIluminacao"){
				varCanticoDaIluminacao = habilidade;
			} else if(nomeDaHabilidade=="ClamorDeBatalha"){
				varClamorDeBatalha = habilidade;
			} else if(nomeDaHabilidade=="PreludioDoRagnarok"){
				varPreludioDoRagnarok = habilidade;
			} else if(nomeDaHabilidade=="MurmurioPerene"){
				varMurmurioPerene = habilidade;
			} else if(nomeDaHabilidade=="EmbalosDeSabadoANoite"){
				varEmbalosDeSabadoANoite = habilidade;
			}

			atualizarTela();

		}

		public void atualizarTela(){
			txtRajadaDeFlechasPontos.setText(varRajadaDeFlechas + "/10");
			txtChuvaDeFlechasPontos.setText(varChuvaDeFlechas + "/10");
			txtOlhosDeAguiaPontos.setText(varOlhosDeAguia + "/10");
			txtPrecisaoPontos.setText(varPrecisao + "/10");
			txtConcentracaoPontos.setText(varConcentracao + "/10");

			txtEncerramentoPontos.setText(varEncerramento + "/1");
			txtBisPontos.setText(varBis + "/1");
			txtDancaDoVentrePontos.setText(varDancaDoVentre + "/5");
			txtNaoMeAbandonesPontos.setText(varNaoMeAbandones + "/10");
			txtDancaCiganaPontos.setText(varDancaCigana + "/10");
			txtBeijoDaSortePontos.setText(varBeijoDaSorte + "/10");
			txtSibiloPontos.setText(varSibilo + "/10");
			txtEscandaloPontos.setText(varEscandalo + "/5");
			txtLicoesDeDancaPontos.setText(varLicoesDeDanca + "/10");
			txtEstilinguePontos.setText(varEstilingue + "/5");
			txtOdeASiegfriedPontos.setText(varOdeASiegfried + "/5");
			txtBanqueteDeNjordPontos.setText(varBanqueteDeNjord + "/5");
			txtRufarDosTamboresPontos.setText(varRufarDosTambores + "/5");
			txtAnelDeNibelungosPontos.setText(varAnelDeNibelungos + "/5");
			txtRitmoCaoticoPontos.setText(varRitmoCaotico + "/1");
			txtLamentoDeLokiPontos.setText(varLamentoDeLoki + "/1");
			txtCantigaDeNinarPontos.setText(varCantigaDeNinar + "/1");
			txtCancaoPreciosaPontos.setText(varCancaoPreciosa + "/1");

			txtVulcaoDeFlechasPontos.setText(varVulcaoDeFlechas + "/10");
			txtBastaoDeHermodPontos.setText(varBastaoDeHermod + "/5");
			txtControleDeMarionetePontos.setText(varControleDeMarionete + "/1");
			txtDestinoNasCartasPontos.setText(varDestinoNasCartas + "/5");
			txtBencaoProtetoraPontos.setText(varBencaoProtetora + "/5");
			txtGritoDeLiberdadePontos.setText(varGritoDeLiberdade + "/5");

			txtRitmoContagiantePontos.setText(varRitmoContagiante + "/5");
			txtBaladaSinfonicaPontos.setText(varBaladaSinfonica + "/5");
			txtSerenataAoLuarPontos.setText(varSerenataAoLuar + "/5");
			txtDominioMusicalPontos.setText(varDominioMusical + "/10");
			txtMelodiaDeMorfeuPontos.setText(varMelodiaDeMorfeu + "/5");
			txtRessonanciaPontos.setText(varRessonancia + "/5");
			txtAtivarRessonanciaPontos.setText(varAtivarRessonancia + "/1");
			txtRuidoEstridentePontos.setText(varRuidoEstridente + "/5");
			txtSibiloDeEirPontos.setText(varSibiloDeEir + "/5");
			txtRequiemDeOrfeuPontos.setText(varRequiemDeOrfeu + "/5");
			txtPoemaDeNifflheimPontos.setText(varPoemaDeNifflheim + "/5");
			txtCantoDaSereiaPontos.setText(varCantoDaSereia + "/5");
			txtImprovisoPontos.setText(varImproviso + "/5");
			txtOdeAHelaPontos.setText(varOdeAHela + "/5");
			txtTemporalDeMilFlechasPontos.setText(varTemporalDeMilFlechas + "/5");
			txtBradoDeOdinPontos.setText(varBradoDeOdin + "/5");
			txtOrvalhoDeIdunPontos.setText(varOrvalhoDeIdun + "/5");
			txtCancaoDeAlfheimPontos.setText(varCancaoDeAlfheim + "/5");
			txtDancaComLobosPontos.setText(varDancaComLobos + "/5");
			txtCanticoDaIluminacaoPontos.setText(varCanticoDaIluminacao + "/5");
			txtClamorDeBatalhaPontos.setText(varClamorDeBatalha + "/5");
			txtPreludioDoRagnarokPontos.setText(varPreludioDoRagnarok + "/5");
			txtMurmurioPerenePontos.setText(varMurmurioPerene + "/5");
			txtEmbalosDeSabadoANoitePontos.setText(varEmbalosDeSabadoANoite + "/5");

			txtClasse1.setText("Classe 1: " + primeiraClasse);
			txtClasse2.setText("Classe 2: " + segundaClasse);
			txtTransClasse.setText("Transclasse: " + transClasse + " (" + (segundaClasse + transClasse) + ")");
			txtClasse3.setText("Classe 3: " + terceiraClasse);

			tudoVisivel();
		}

		public void tudoVisivel(){
			layRajadaDeFlechas.setVisibility(View.VISIBLE);
			layChuvaDeFlechas.setVisibility(View.VISIBLE);
			layOlhosDeAguia.setVisibility(View.VISIBLE);
			layPrecisao.setVisibility(View.VISIBLE);
			layConcentracao.setVisibility(View.VISIBLE);

			layEncerramento.setVisibility(View.VISIBLE);
			layBis.setVisibility(View.VISIBLE);
			layDancaDoVentre.setVisibility(View.VISIBLE);
			layNaoMeAbandones.setVisibility(View.VISIBLE);
			layDancaCigana.setVisibility(View.VISIBLE);
			layBeijoDaSorte.setVisibility(View.VISIBLE);
			laySibilo.setVisibility(View.VISIBLE);
			layEscandalo.setVisibility(View.VISIBLE);
			layLicoesDeDanca.setVisibility(View.VISIBLE);
			layEstilingue.setVisibility(View.VISIBLE);
			layOdeASiegfried.setVisibility(View.VISIBLE);
			layBanqueteDeNjord.setVisibility(View.VISIBLE);
			layRufarDosTambores.setVisibility(View.VISIBLE);
			layAnelDeNibelungos.setVisibility(View.VISIBLE);
			layRitmoCaotico.setVisibility(View.VISIBLE);
			layLamentoDeLoki.setVisibility(View.VISIBLE);
			layCantigaDeNinar.setVisibility(View.VISIBLE);
			layCancaoPreciosa.setVisibility(View.VISIBLE);

			layVulcaoDeFlechas.setVisibility(View.VISIBLE);
			layBastaoDeHermod.setVisibility(View.VISIBLE);
			layControleDeMarionete.setVisibility(View.VISIBLE);
			layDestinoNasCartas.setVisibility(View.VISIBLE);
			layBencaoProtetora.setVisibility(View.VISIBLE);
			layGritoDeLiberdade.setVisibility(View.VISIBLE);

			layRitmoContagiante.setVisibility(View.VISIBLE);
			layBaladaSinfonica.setVisibility(View.VISIBLE);
			laySerenataAoLuar.setVisibility(View.VISIBLE);
			layDominioMusical.setVisibility(View.VISIBLE);
			layMelodiaDeMorfeu.setVisibility(View.VISIBLE);
			layRessonancia.setVisibility(View.VISIBLE);
			layAtivarRessonancia.setVisibility(View.VISIBLE);
			layRuidoEstridente.setVisibility(View.VISIBLE);
			laySibiloDeEir.setVisibility(View.VISIBLE);
			layRequiemDeOrfeu.setVisibility(View.VISIBLE);
			layPoemaDeNifflheim.setVisibility(View.VISIBLE);
			layCantoDaSereia.setVisibility(View.VISIBLE);
			layImproviso.setVisibility(View.VISIBLE);
			layOdeAHela.setVisibility(View.VISIBLE);
			layTemporalDeMilFlechas.setVisibility(View.VISIBLE);
			layBradoDeOdin.setVisibility(View.VISIBLE);
			layOrvalhoDeIdun.setVisibility(View.VISIBLE);
			layCancaoDeAlfheim.setVisibility(View.VISIBLE);
			layDancaComLobos.setVisibility(View.VISIBLE);
			layCanticoDaIluminacao.setVisibility(View.VISIBLE);
			layClamorDeBatalha.setVisibility(View.VISIBLE);
			layPreludioDoRagnarok.setVisibility(View.VISIBLE);
			layMurmurioPerene.setVisibility(View.VISIBLE);
			layEmbalosDeSabadoANoite.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM musa WHERE _id = ?", new String[]{String.valueOf(id)});

			if(cs.moveToFirst()){
			primeiraClasse = cs.getInt(2);
			segundaClasse = cs.getInt(3);
			transClasse = cs.getInt(4);
			terceiraClasse = cs.getInt(5);

			varRajadaDeFlechas = cs.getInt(6);
			varChuvaDeFlechas = cs.getInt(7);
			varOlhosDeAguia = cs.getInt(8);
			varPrecisao = cs.getInt(9);
			varConcentracao = cs.getInt(10);

			varEncerramento = cs.getInt(11);
			varBis = cs.getInt(12);
			varDancaDoVentre = cs.getInt(13);
			varNaoMeAbandones = cs.getInt(14);
			varDancaCigana = cs.getInt(15);
			varBeijoDaSorte = cs.getInt(16);
			varSibilo = cs.getInt(17);
			varEscandalo = cs.getInt(18);
			varLicoesDeDanca = cs.getInt(19);
			varEstilingue = cs.getInt(20);
			varOdeASiegfried = cs.getInt(21);
			varBanqueteDeNjord = cs.getInt(22);
			varRufarDosTambores = cs.getInt(23);
			varAnelDeNibelungos = cs.getInt(24);
			varRitmoCaotico = cs.getInt(25);
			varLamentoDeLoki = cs.getInt(26);
			varCantigaDeNinar = cs.getInt(27);
			varCancaoPreciosa = cs.getInt(28);

			varVulcaoDeFlechas = cs.getInt(29);
			varBastaoDeHermod = cs.getInt(30);
			varControleDeMarionete = cs.getInt(31);
			varDestinoNasCartas = cs.getInt(32);
			varBencaoProtetora = cs.getInt(33);
			varGritoDeLiberdade = cs.getInt(34);

			varRitmoContagiante = cs.getInt(35);
			varBaladaSinfonica = cs.getInt(36);
			varSerenataAoLuar = cs.getInt(37);
			varDominioMusical = cs.getInt(38);
			varMelodiaDeMorfeu = cs.getInt(39);
			varRessonancia = cs.getInt(40);
			varAtivarRessonancia = cs.getInt(41);
			varRuidoEstridente = cs.getInt(42);
			varSibiloDeEir = cs.getInt(43);
			varRequiemDeOrfeu = cs.getInt(44);
			varPoemaDeNifflheim = cs.getInt(45);
			varCantoDaSereia = cs.getInt(46);
			varImproviso = cs.getInt(47);
			varOdeAHela = cs.getInt(48);
			varTemporalDeMilFlechas = cs.getInt(49);
			varBradoDeOdin = cs.getInt(50);
			varOrvalhoDeIdun = cs.getInt(51);
			varCancaoDeAlfheim = cs.getInt(52);
			varDancaComLobos = cs.getInt(53);
			varCanticoDaIluminacao = cs.getInt(54);
			varClamorDeBatalha = cs.getInt(55);
			varPreludioDoRagnarok = cs.getInt(56);
			varMurmurioPerene = cs.getInt(57);
			varEmbalosDeSabadoANoite = cs.getInt(58);

			skillPrimeira = cs.getInt(59);
			skillSegunda = cs.getInt(60);
			skillTrans = cs.getInt(61);
			skillTerceira = cs.getInt(62);
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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS musa (");
					sqlClasse.append("_id INTEGER PRIMARY KEY, ");
					sqlClasse.append("nome VARCHAR(30), ");
					sqlClasse.append("primeira_classe INT(2), ");
					sqlClasse.append("segunda_classe INT(2), ");
					sqlClasse.append("trans_classe INT(2), ");
					sqlClasse.append("terceira_classe INT(2), ");
					sqlClasse.append("skill_rajadadeflechas INT(2), ");
					sqlClasse.append("skill_chuvadeflechas INT(2), ");
					sqlClasse.append("skill_olhosdeaguia INT(2), ");
					sqlClasse.append("skill_precisao INT(2), ");
					sqlClasse.append("skill_concentracao INT(2), ");
					sqlClasse.append("skill_encerramento INT(2), ");
					sqlClasse.append("skill_bis INT(2), ");
					sqlClasse.append("skill_dancadoventre INT(2), ");
					sqlClasse.append("skill_naomeabandones INT(2), ");
					sqlClasse.append("skill_dancacigana INT(2), ");
					sqlClasse.append("skill_beijodasorte INT(2), ");
					sqlClasse.append("skill_sibilo INT(2), ");
					sqlClasse.append("skill_escandalo INT(2), ");
					sqlClasse.append("skill_licoesdedanca INT(2), ");
					sqlClasse.append("skill_estilingue INT(2), ");
					sqlClasse.append("skill_odeasiegfried INT(2), ");
					sqlClasse.append("skill_banquetedenjord INT(2), ");
					sqlClasse.append("skill_rufardostambores INT(2), ");
					sqlClasse.append("skill_aneldenibelungos INT(2), ");
					sqlClasse.append("skill_ritmocaotico INT(2), ");
					sqlClasse.append("skill_lamentodeloki INT(2), ");
					sqlClasse.append("skill_cantigadeninar INT(2), ");
					sqlClasse.append("skill_cancaopreciosa INT(2), ");
					sqlClasse.append("skill_vulcaodeflechas INT(2), ");
					sqlClasse.append("skill_bastaodehermod INT(2), ");
					sqlClasse.append("skill_controledemarionete INT(2), ");
					sqlClasse.append("skill_destinonascartas INT(2), ");
					sqlClasse.append("skill_bencaoprotetora INT(2), ");
					sqlClasse.append("skill_gritodeliberdade INT(2), ");
					sqlClasse.append("skill_ritmocontagiante INT(2), ");
					sqlClasse.append("skill_baladasinfonica INT(2), ");
					sqlClasse.append("skill_serenataaoluar INT(2), ");
					sqlClasse.append("skill_dominiomusical INT(2), ");
					sqlClasse.append("skill_melodiademorfeu INT(2), ");
					sqlClasse.append("skill_ressonancia INT(2), ");
					sqlClasse.append("skill_ativarressonancia INT(2), ");
					sqlClasse.append("skill_ruidoestridente INT(2), ");
					sqlClasse.append("skill_sibilodeeir INT(2), ");
					sqlClasse.append("skill_requiemdeorfeu INT(2), ");
					sqlClasse.append("skill_poemadenifflheim INT(2), ");
					sqlClasse.append("skill_cantodasereia INT(2), ");
					sqlClasse.append("skill_improviso INT(2), ");
					sqlClasse.append("skill_odeahela INT(2), ");
					sqlClasse.append("skill_temporaldemilflechas INT(2), ");
					sqlClasse.append("skill_bradodeodin INT(2), ");
					sqlClasse.append("skill_orvalhodeidun INT(2), ");
					sqlClasse.append("skill_cancaodealfheim INT(2), ");
					sqlClasse.append("skill_dancacomlobos INT(2), ");
					sqlClasse.append("skill_canticodailuminacao INT(2), ");
					sqlClasse.append("skill_clamordebatalha INT(2), ");
					sqlClasse.append("skill_preludiodoragnarok INT(2), ");
					sqlClasse.append("skill_murmurioperene INT(2), ");
					sqlClasse.append("skill_embalosdesabadoanoite INT(2), ");
					sqlClasse.append("skill_primeira INT(2), ");
					sqlClasse.append("skill_segunda INT(2), ");
					sqlClasse.append("skill_trans INT(2), ");
					sqlClasse.append("skill_terceira INT(2));");
					db.execSQL(sqlClasse.toString());

					ContentValues ins = new ContentValues();
					ins.put("nome", nomeDaSim);
					ins.put("primeira_classe", primeiraClasse);
					ins.put("segunda_classe", segundaClasse);
					ins.put("trans_classe", transClasse);
					ins.put("terceira_classe", terceiraClasse);
					ins.put("skill_rajadadeflechas", varRajadaDeFlechas);
					ins.put("skill_chuvadeflechas", varChuvaDeFlechas);
					ins.put("skill_olhosdeaguia", varOlhosDeAguia);
					ins.put("skill_precisao", varPrecisao);
					ins.put("skill_concentracao", varConcentracao);
					ins.put("skill_encerramento", varEncerramento);
					ins.put("skill_bis", varBis);
					ins.put("skill_dancadoventre", varDancaDoVentre);
					ins.put("skill_naomeabandones", varNaoMeAbandones);
					ins.put("skill_dancacigana", varDancaCigana);
					ins.put("skill_beijodasorte", varBeijoDaSorte);
					ins.put("skill_sibilo", varSibilo);
					ins.put("skill_escandalo", varEscandalo);
					ins.put("skill_licoesdedanca", varLicoesDeDanca);
					ins.put("skill_estilingue", varEstilingue);
					ins.put("skill_odeasiegfried", varOdeASiegfried);
					ins.put("skill_banquetedenjord", varBanqueteDeNjord);
					ins.put("skill_rufardostambores", varRufarDosTambores);
					ins.put("skill_aneldenibelungos", varAnelDeNibelungos);
					ins.put("skill_ritmocaotico", varRitmoCaotico);
					ins.put("skill_lamentodeloki", varLamentoDeLoki);
					ins.put("skill_cantigadeninar", varCantigaDeNinar);
					ins.put("skill_cancaopreciosa", varCancaoPreciosa);
					ins.put("skill_vulcaodeflechas", varVulcaoDeFlechas);
					ins.put("skill_bastaodehermod", varBastaoDeHermod);
					ins.put("skill_controledemarionete", varControleDeMarionete);
					ins.put("skill_destinonascartas", varDestinoNasCartas);
					ins.put("skill_bencaoprotetora", varBencaoProtetora);
					ins.put("skill_gritodeliberdade", varGritoDeLiberdade);
					ins.put("skill_ritmocontagiante", varRitmoContagiante);
					ins.put("skill_baladasinfonica", varBaladaSinfonica);
					ins.put("skill_serenataaoluar", varSerenataAoLuar);
					ins.put("skill_dominiomusical", varDominioMusical);
					ins.put("skill_melodiademorfeu", varMelodiaDeMorfeu);
					ins.put("skill_ressonancia", varRessonancia);
					ins.put("skill_ativarressonancia", varAtivarRessonancia);
					ins.put("skill_ruidoestridente", varRuidoEstridente);
					ins.put("skill_sibilodeeir", varSibiloDeEir);
					ins.put("skill_requiemdeorfeu", varRequiemDeOrfeu);
					ins.put("skill_poemadenifflheim", varPoemaDeNifflheim);
					ins.put("skill_cantodasereia", varCantoDaSereia);
					ins.put("skill_improviso", varImproviso);
					ins.put("skill_odeahela", varOdeAHela);
					ins.put("skill_temporaldemilflechas", varTemporalDeMilFlechas);
					ins.put("skill_bradodeodin", varBradoDeOdin);
					ins.put("skill_orvalhodeidun", varOrvalhoDeIdun);
					ins.put("skill_cancaodealfheim", varCancaoDeAlfheim);
					ins.put("skill_dancacomlobos", varDancaComLobos);
					ins.put("skill_canticodailuminacao", varCanticoDaIluminacao);
					ins.put("skill_clamordebatalha", varClamorDeBatalha);
					ins.put("skill_preludiodoragnarok", varPreludioDoRagnarok);
					ins.put("skill_murmurioperene", varMurmurioPerene);
					ins.put("skill_embalosdesabadoanoite", varEmbalosDeSabadoANoite);
					ins.put("skill_primeira", skillPrimeira);
					ins.put("skill_segunda", skillSegunda);
					ins.put("skill_trans", skillTrans);
					ins.put("skill_terceira", skillTerceira);
					if(!novo){
						try {
							db.update("musa", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("musa", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from musa", null);
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
						ins2.put("classe", "musa");
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

	}