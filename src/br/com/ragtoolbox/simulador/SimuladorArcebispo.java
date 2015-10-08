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

public class SimuladorArcebispo extends Activity {

		//Botões de interrogação
		Button btProtecaoDivinaInterrogacao,
		btFlageloDoMalInterrogacao,
		btSignumCrucisInterrogacao,
		btAngelusInterrogacao,
		btBencaoInterrogacao,
		btCurarInterrogacao,
		btAumentarAgilidadeInterrogacao,
		btDiminuirAgilidadeInterrogacao,
		btAquaBenedictaInterrogacao,
		btTeleporteInterrogacao,
		btPortalInterrogacao,
		btRevelacaoInterrogacao,
		btEscudoSagradoInterrogacao,
		btMedicarInterrogacao,
		btLuzDivinaInterrogacao,
		btAumentarRecuperacaoDeSPInterrogacao,
		btPericiaComMacaInterrogacao,
		btImpositioManusInterrogacao,
		btSuffragiumInterrogacao,
		btAspersioInterrogacao,
		btBenedictioSanctissimiSacramentiInterrogacao,
		btSantuarioInterrogacao,
		btGracaDivinaInterrogacao,
		btRetardarVenenoInterrogacao,
		btRessuscitarInterrogacao,
		btEscudoMagicoInterrogacao,
		btKyrieEleisonInterrogacao,
		btMagnificatInterrogacao,
		btLexDivinaInterrogacao,
		btEsconjurarInterrogacao,
		btLexAeternaInterrogacao,
		btMagnusExorcismusInterrogacao,
		btGloriaInterrogacao,
		btMartirioInterrogacao,
		btAssumptioInterrogacao,
		btBasilicaInterrogacao,
		btMeditatioInterrogacao,
		btRiquezaDeEspiritoInterrogacao,
		btSoproDivinoInterrogacao,
		btClementiaInterrogacao,
		btCantoCandidusInterrogacao,
		btPraefatioInterrogacao,
		btRenovatioInterrogacao,
		btCuratioInterrogacao,
		btLaudaAgnusInterrogacao,
		btLaudaRamusInterrogacao,
		btSilentiumInterrogacao,
		btGeneseInterrogacao,
		btOratioInterrogacao,
		btSacramentumInterrogacao,
		btExpiatioInterrogacao,
		btEucaristiaInterrogacao,
		btGeminiLumenInterrogacao,
		btCriarAncillaInterrogacao,
		btEpiclesisInterrogacao,
		btJudexInterrogacao,
		btAdoramusInterrogacao;

		//Botões de diminuir habilidades
		Button btProtecaoDivinaDiminuir,
		btFlageloDoMalDiminuir,
		btSignumCrucisDiminuir,
		btAngelusDiminuir,
		btBencaoDiminuir,
		btCurarDiminuir,
		btAumentarAgilidadeDiminuir,
		btDiminuirAgilidadeDiminuir,
		btAquaBenedictaDiminuir,
		btTeleporteDiminuir,
		btPortalDiminuir,
		btRevelacaoDiminuir,
		btEscudoSagradoDiminuir,
		btMedicarDiminuir,
		btAumentarRecuperacaoDeSPDiminuir,
		btPericiaComMacaDiminuir,
		btImpositioManusDiminuir,
		btSuffragiumDiminuir,
		btAspersioDiminuir,
		btBenedictioSanctissimiSacramentiDiminuir,
		btSantuarioDiminuir,
		btGracaDivinaDiminuir,
		btRetardarVenenoDiminuir,
		btRessuscitarDiminuir,
		btEscudoMagicoDiminuir,
		btKyrieEleisonDiminuir,
		btMagnificatDiminuir,
		btLexDivinaDiminuir,
		btEsconjurarDiminuir,
		btLexAeternaDiminuir,
		btMagnusExorcismusDiminuir,
		btGloriaDiminuir,
		btAssumptioDiminuir,
		btBasilicaDiminuir,
		btMeditatioDiminuir,
		btRiquezaDeEspiritoDiminuir,
		btSoproDivinoDiminuir,
		btClementiaDiminuir,
		btCantoCandidusDiminuir,
		btPraefatioDiminuir,
		btRenovatioDiminuir,
		btCuratioDiminuir,
		btLaudaAgnusDiminuir,
		btLaudaRamusDiminuir,
		btSilentiumDiminuir,
		btGeneseDiminuir,
		btOratioDiminuir,
		btSacramentumDiminuir,
		btExpiatioDiminuir,
		btEucaristiaDiminuir,
		btGeminiLumenDiminuir,
		btCriarAncillaDiminuir,
		btEpiclesisDiminuir,
		btJudexDiminuir,
		btAdoramusDiminuir;

		//Botões de aumentar habilidades
		Button btProtecaoDivinaAumentar,
		btFlageloDoMalAumentar,
		btSignumCrucisAumentar,
		btAngelusAumentar,
		btBencaoAumentar,
		btCurarAumentar,
		btAumentarAgilidadeAumentar,
		btDiminuirAgilidadeAumentar,
		btAquaBenedictaAumentar,
		btTeleporteAumentar,
		btPortalAumentar,
		btRevelacaoAumentar,
		btEscudoSagradoAumentar,
		btMedicarAumentar,
		btAumentarRecuperacaoDeSPAumentar,
		btPericiaComMacaAumentar,
		btImpositioManusAumentar,
		btSuffragiumAumentar,
		btAspersioAumentar,
		btBenedictioSanctissimiSacramentiAumentar,
		btSantuarioAumentar,
		btGracaDivinaAumentar,
		btRetardarVenenoAumentar,
		btRessuscitarAumentar,
		btEscudoMagicoAumentar,
		btKyrieEleisonAumentar,
		btMagnificatAumentar,
		btLexDivinaAumentar,
		btEsconjurarAumentar,
		btLexAeternaAumentar,
		btMagnusExorcismusAumentar,
		btGloriaAumentar,
		btAssumptioAumentar,
		btBasilicaAumentar,
		btMeditatioAumentar,
		btRiquezaDeEspiritoAumentar,
		btSoproDivinoAumentar,
		btClementiaAumentar,
		btCantoCandidusAumentar,
		btPraefatioAumentar,
		btRenovatioAumentar,
		btCuratioAumentar,
		btLaudaAgnusAumentar,
		btLaudaRamusAumentar,
		btSilentiumAumentar,
		btGeneseAumentar,
		btOratioAumentar,
		btSacramentumAumentar,
		btExpiatioAumentar,
		btEucaristiaAumentar,
		btGeminiLumenAumentar,
		btCriarAncillaAumentar,
		btEpiclesisAumentar,
		btJudexAumentar,
		btAdoramusAumentar;

		//Resto dos botões
		Button btResetar, btSalvar, btSalvarIMG;
		ToggleButton tgbtSomenteHabilidadeAprendida;


		//Txt pontos da tela
		TextView txtProtecaoDivinaPontos,
		txtFlageloDoMalPontos,
		txtSignumCrucisPontos,
		txtAngelusPontos,
		txtBencaoPontos,
		txtCurarPontos,
		txtAumentarAgilidadePontos,
		txtDiminuirAgilidadePontos,
		txtAquaBenedictaPontos,
		txtTeleportePontos,
		txtPortalPontos,
		txtRevelacaoPontos,
		txtEscudoSagradoPontos,
		txtMedicarPontos,
		txtAumentarRecuperacaoDeSPPontos,
		txtPericiaComMacaPontos,
		txtImpositioManusPontos,
		txtSuffragiumPontos,
		txtAspersioPontos,
		txtBenedictioSanctissimiSacramentiPontos,
		txtSantuarioPontos,
		txtGracaDivinaPontos,
		txtRetardarVenenoPontos,
		txtRessuscitarPontos,
		txtEscudoMagicoPontos,
		txtKyrieEleisonPontos,
		txtMagnificatPontos,
		txtLexDivinaPontos,
		txtEsconjurarPontos,
		txtLexAeternaPontos,
		txtMagnusExorcismusPontos,
		txtGloriaPontos,
		txtAssumptioPontos,
		txtBasilicaPontos,
		txtMeditatioPontos,
		txtRiquezaDeEspiritoPontos,
		txtSoproDivinoPontos,
		txtClementiaPontos,
		txtCantoCandidusPontos,
		txtPraefatioPontos,
		txtRenovatioPontos,
		txtCuratioPontos,
		txtLaudaAgnusPontos,
		txtLaudaRamusPontos,
		txtSilentiumPontos,
		txtGenesePontos,
		txtOratioPontos,
		txtSacramentumPontos,
		txtExpiatioPontos,
		txtEucaristiaPontos,
		txtGeminiLumenPontos,
		txtCriarAncillaPontos,
		txtEpiclesisPontos,
		txtJudexPontos,
		txtAdoramusPontos;

		//Txt pontos restantes
		TextView txtClasse1, txtClasse2, txtTransClasse, txtClasse3;

		//Layouts
		LinearLayout layProtecaoDivina,
		layFlageloDoMal,
		laySignumCrucis,
		layAngelus,
		layBencao,
		layCurar,
		layAumentarAgilidade,
		layDiminuirAgilidade,
		layAquaBenedicta,
		layTeleporte,
		layPortal,
		layRevelacao,
		layEscudoSagrado,
		layMedicar,
		layAumentarRecuperacaoDeSP,
		layPericiaComMaca,
		layImpositioManus,
		laySuffragium,
		layAspersio,
		layBenedictioSanctissimiSacramenti,
		laySantuario,
		layGracaDivina,
		layRetardarVeneno,
		layRessuscitar,
		layEscudoMagico,
		layKyrieEleison,
		layMagnificat,
		layLexDivina,
		layEsconjurar,
		layLexAeterna,
		layMagnusExorcismus,
		layGloria,
		layAssumptio,
		layBasilica,
		layMeditatio,
		layRiquezaDeEspirito,
		laySoproDivino,
		layClementia,
		layCantoCandidus,
		layPraefatio,
		layRenovatio,
		layCuratio,
		layLaudaAgnus,
		layLaudaRamus,
		laySilentium,
		layGenese,
		layOratio,
		laySacramentum,
		layExpiatio,
		layEucaristia,
		layGeminiLumen,
		layCriarAncilla,
		layEpiclesis,
		layJudex,
		layAdoramus;

		//Variaveis de Skill
		int varProtecaoDivina,
		varFlageloDoMal,
		varSignumCrucis,
		varAngelus,
		varBencao,
		varCurar,
		varAumentarAgilidade,
		varDiminuirAgilidade,
		varAquaBenedicta,
		varTeleporte,
		varPortal,
		varRevelacao,
		varEscudoSagrado,
		varMedicar,
		varAumentarRecuperacaoDeSP,
		varPericiaComMaca,
		varImpositioManus,
		varSuffragium,
		varAspersio,
		varBenedictioSanctissimiSacramenti,
		varSantuario,
		varGracaDivina,
		varRetardarVeneno,
		varRessuscitar,
		varEscudoMagico,
		varKyrieEleison,
		varMagnificat,
		varLexDivina,
		varEsconjurar,
		varLexAeterna,
		varMagnusExorcismus,
		varGloria,
		varAssumptio,
		varBasilica,
		varMeditatio,
		varRiquezaDeEspirito,
		varSoproDivino,
		varClementia,
		varCantoCandidus,
		varPraefatio,
		varRenovatio,
		varCuratio,
		varLaudaAgnus,
		varLaudaRamus,
		varSilentium,
		varGenese,
		varOratio,
		varSacramentum,
		varExpiatio,
		varEucaristia,
		varGeminiLumen,
		varCriarAncilla,
		varEpiclesis,
		varJudex,
		varAdoramus;

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
			setContentView(R.layout.activity_simulador_arcebispo);

			Intent it = getIntent();

			final int id = it.getIntExtra("id", 0);
			idParaAlterar = "_id =" +id;

			//inicialização de variáveis
			varProtecaoDivina = 0;
			varFlageloDoMal = 0;
			varSignumCrucis = 0;
			varAngelus = 0;
			varBencao = 0;
			varCurar = 0;
			varAumentarAgilidade = 0;
			varDiminuirAgilidade = 0;
			varAquaBenedicta = 0;
			varTeleporte = 0;
			varPortal = 0;
			varRevelacao = 0;
			varEscudoSagrado = 0;
			varMedicar = 0;
			varAumentarRecuperacaoDeSP = 0;
			varPericiaComMaca = 0;
			varImpositioManus = 0;
			varSuffragium = 0;
			varAspersio = 0;
			varBenedictioSanctissimiSacramenti = 0;
			varSantuario = 0;
			varGracaDivina = 0;
			varRetardarVeneno = 0;
			varRessuscitar = 0;
			varEscudoMagico = 0;
			varKyrieEleison = 0;
			varMagnificat = 0;
			varLexDivina = 0;
			varEsconjurar = 0;
			varLexAeterna = 0;
			varMagnusExorcismus = 0;
			varGloria = 0;
			varAssumptio = 0;
			varBasilica = 0;
			varMeditatio = 0;
			varRiquezaDeEspirito = 0;
			varSoproDivino = 0;
			varClementia = 0;
			varCantoCandidus = 0;
			varPraefatio = 0;
			varRenovatio = 0;
			varCuratio = 0;
			varLaudaAgnus = 0;
			varLaudaRamus = 0;
			varSilentium = 0;
			varGenese = 0;
			varOratio = 0;
			varSacramentum = 0;
			varExpiatio = 0;
			varEucaristia = 0;
			varGeminiLumen = 0;
			varCriarAncilla = 0;
			varEpiclesis = 0;
			varJudex = 0;
			varAdoramus = 0;



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
			btProtecaoDivinaInterrogacao = (Button) findViewById(R.id.btProtecaoDivinaInterrogacao);
			btFlageloDoMalInterrogacao = (Button) findViewById(R.id.btFlageloDoMalInterrogacao);
			btSignumCrucisInterrogacao = (Button) findViewById(R.id.btSignumCrucisInterrogacao);
			btAngelusInterrogacao = (Button) findViewById(R.id.btAngelusInterrogacao);
			btBencaoInterrogacao = (Button) findViewById(R.id.btBencaoInterrogacao);
			btCurarInterrogacao = (Button) findViewById(R.id.btCurarInterrogacao);
			btAumentarAgilidadeInterrogacao = (Button) findViewById(R.id.btAumentarAgilidadeInterrogacao);
			btDiminuirAgilidadeInterrogacao = (Button) findViewById(R.id.btDiminuirAgilidadeInterrogacao);
			btAquaBenedictaInterrogacao = (Button) findViewById(R.id.btAquaBenedictaInterrogacao);
			btTeleporteInterrogacao = (Button) findViewById(R.id.btTeleporteInterrogacao);
			btPortalInterrogacao = (Button) findViewById(R.id.btPortalInterrogacao);
			btRevelacaoInterrogacao = (Button) findViewById(R.id.btRevelacaoInterrogacao);
			btEscudoSagradoInterrogacao = (Button) findViewById(R.id.btEscudoSagradoInterrogacao);
			btMedicarInterrogacao = (Button) findViewById(R.id.btMedicarInterrogacao);
			btLuzDivinaInterrogacao = (Button) findViewById(R.id.btLuzDivinaInterrogacao);
			btAumentarRecuperacaoDeSPInterrogacao = (Button) findViewById(R.id.btAumentarRecuperacaoDeSPInterrogacao);
			btPericiaComMacaInterrogacao = (Button) findViewById(R.id.btPericiaComMacaInterrogacao);
			btImpositioManusInterrogacao = (Button) findViewById(R.id.btImpositioManusInterrogacao);
			btSuffragiumInterrogacao = (Button) findViewById(R.id.btSuffragiumInterrogacao);
			btAspersioInterrogacao = (Button) findViewById(R.id.btAspersioInterrogacao);
			btBenedictioSanctissimiSacramentiInterrogacao = (Button) findViewById(R.id.btBenedictioSanctissimiSacramentiInterrogacao);
			btSantuarioInterrogacao = (Button) findViewById(R.id.btSantuarioInterrogacao);
			btGracaDivinaInterrogacao = (Button) findViewById(R.id.btGracaDivinaInterrogacao);
			btRetardarVenenoInterrogacao = (Button) findViewById(R.id.btRetardarVenenoInterrogacao);
			btRessuscitarInterrogacao = (Button) findViewById(R.id.btRessuscitarInterrogacao);
			btEscudoMagicoInterrogacao = (Button) findViewById(R.id.btEscudoMagicoInterrogacao);
			btKyrieEleisonInterrogacao = (Button) findViewById(R.id.btKyrieEleisonInterrogacao);
			btMagnificatInterrogacao = (Button) findViewById(R.id.btMagnificatInterrogacao);
			btLexDivinaInterrogacao = (Button) findViewById(R.id.btLexDivinaInterrogacao);
			btEsconjurarInterrogacao = (Button) findViewById(R.id.btEsconjurarInterrogacao);
			btLexAeternaInterrogacao = (Button) findViewById(R.id.btLexAeternaInterrogacao);
			btMagnusExorcismusInterrogacao = (Button) findViewById(R.id.btMagnusExorcismusInterrogacao);
			btGloriaInterrogacao = (Button) findViewById(R.id.btGloriaInterrogacao);
			btMartirioInterrogacao = (Button) findViewById(R.id.btMartirioInterrogacao);
			btAssumptioInterrogacao = (Button) findViewById(R.id.btAssumptioInterrogacao);
			btBasilicaInterrogacao = (Button) findViewById(R.id.btBasilicaInterrogacao);
			btMeditatioInterrogacao = (Button) findViewById(R.id.btMeditatioInterrogacao);
			btRiquezaDeEspiritoInterrogacao = (Button) findViewById(R.id.btRiquezaDeEspiritoInterrogacao);
			btSoproDivinoInterrogacao = (Button) findViewById(R.id.btSoproDivinoInterrogacao);
			btClementiaInterrogacao = (Button) findViewById(R.id.btClementiaInterrogacao);
			btCantoCandidusInterrogacao = (Button) findViewById(R.id.btCantoCandidusInterrogacao);
			btPraefatioInterrogacao = (Button) findViewById(R.id.btPraefatioInterrogacao);
			btRenovatioInterrogacao = (Button) findViewById(R.id.btRenovatioInterrogacao);
			btCuratioInterrogacao = (Button) findViewById(R.id.btCuratioInterrogacao);
			btLaudaAgnusInterrogacao = (Button) findViewById(R.id.btLaudaAgnusInterrogacao);
			btLaudaRamusInterrogacao = (Button) findViewById(R.id.btLaudaRamusInterrogacao);
			btSilentiumInterrogacao = (Button) findViewById(R.id.btSilentiumInterrogacao);
			btGeneseInterrogacao = (Button) findViewById(R.id.btGeneseInterrogacao);
			btOratioInterrogacao = (Button) findViewById(R.id.btOratioInterrogacao);
			btSacramentumInterrogacao = (Button) findViewById(R.id.btSacramentumInterrogacao);
			btExpiatioInterrogacao = (Button) findViewById(R.id.btExpiatioInterrogacao);
			btEucaristiaInterrogacao = (Button) findViewById(R.id.btEucaristiaInterrogacao);
			btGeminiLumenInterrogacao = (Button) findViewById(R.id.btGeminiLumenInterrogacao);
			btCriarAncillaInterrogacao = (Button) findViewById(R.id.btCriarAncillaInterrogacao);
			btEpiclesisInterrogacao = (Button) findViewById(R.id.btEpiclesisInterrogacao);
			btJudexInterrogacao = (Button) findViewById(R.id.btJudexInterrogacao);
			btAdoramusInterrogacao = (Button) findViewById(R.id.btAdoramusInterrogacao);

			//Botões de diminuir habilidades
			btProtecaoDivinaDiminuir = (Button) findViewById(R.id.btProtecaoDivinaDiminuir);
			btFlageloDoMalDiminuir = (Button) findViewById(R.id.btFlageloDoMalDiminuir);
			btSignumCrucisDiminuir = (Button) findViewById(R.id.btSignumCrucisDiminuir);
			btAngelusDiminuir = (Button) findViewById(R.id.btAngelusDiminuir);
			btBencaoDiminuir = (Button) findViewById(R.id.btBencaoDiminuir);
			btCurarDiminuir = (Button) findViewById(R.id.btCurarDiminuir);
			btAumentarAgilidadeDiminuir = (Button) findViewById(R.id.btAumentarAgilidadeDiminuir);
			btDiminuirAgilidadeDiminuir = (Button) findViewById(R.id.btDiminuirAgilidadeDiminuir);
			btAquaBenedictaDiminuir = (Button) findViewById(R.id.btAquaBenedictaDiminuir);
			btTeleporteDiminuir = (Button) findViewById(R.id.btTeleporteDiminuir);
			btPortalDiminuir = (Button) findViewById(R.id.btPortalDiminuir);
			btRevelacaoDiminuir = (Button) findViewById(R.id.btRevelacaoDiminuir);
			btEscudoSagradoDiminuir = (Button) findViewById(R.id.btEscudoSagradoDiminuir);
			btMedicarDiminuir = (Button) findViewById(R.id.btMedicarDiminuir);
			btAumentarRecuperacaoDeSPDiminuir = (Button) findViewById(R.id.btAumentarRecuperacaoDeSPDiminuir);
			btPericiaComMacaDiminuir = (Button) findViewById(R.id.btPericiaComMacaDiminuir);
			btImpositioManusDiminuir = (Button) findViewById(R.id.btImpositioManusDiminuir);
			btSuffragiumDiminuir = (Button) findViewById(R.id.btSuffragiumDiminuir);
			btAspersioDiminuir = (Button) findViewById(R.id.btAspersioDiminuir);
			btBenedictioSanctissimiSacramentiDiminuir = (Button) findViewById(R.id.btBenedictioSanctissimiSacramentiDiminuir);
			btSantuarioDiminuir = (Button) findViewById(R.id.btSantuarioDiminuir);
			btGracaDivinaDiminuir = (Button) findViewById(R.id.btGracaDivinaDiminuir);
			btRetardarVenenoDiminuir = (Button) findViewById(R.id.btRetardarVenenoDiminuir);
			btRessuscitarDiminuir = (Button) findViewById(R.id.btRessuscitarDiminuir);
			btEscudoMagicoDiminuir = (Button) findViewById(R.id.btEscudoMagicoDiminuir);
			btKyrieEleisonDiminuir = (Button) findViewById(R.id.btKyrieEleisonDiminuir);
			btMagnificatDiminuir = (Button) findViewById(R.id.btMagnificatDiminuir);
			btLexDivinaDiminuir = (Button) findViewById(R.id.btLexDivinaDiminuir);
			btEsconjurarDiminuir = (Button) findViewById(R.id.btEsconjurarDiminuir);
			btLexAeternaDiminuir = (Button) findViewById(R.id.btLexAeternaDiminuir);
			btMagnusExorcismusDiminuir = (Button) findViewById(R.id.btMagnusExorcismusDiminuir);
			btGloriaDiminuir = (Button) findViewById(R.id.btGloriaDiminuir);
			btAssumptioDiminuir = (Button) findViewById(R.id.btAssumptioDiminuir);
			btBasilicaDiminuir = (Button) findViewById(R.id.btBasilicaDiminuir);
			btMeditatioDiminuir = (Button) findViewById(R.id.btMeditatioDiminuir);
			btRiquezaDeEspiritoDiminuir = (Button) findViewById(R.id.btRiquezaDeEspiritoDiminuir);
			btSoproDivinoDiminuir = (Button) findViewById(R.id.btSoproDivinoDiminuir);
			btClementiaDiminuir = (Button) findViewById(R.id.btClementiaDiminuir);
			btCantoCandidusDiminuir = (Button) findViewById(R.id.btCantoCandidusDiminuir);
			btPraefatioDiminuir = (Button) findViewById(R.id.btPraefatioDiminuir);
			btRenovatioDiminuir = (Button) findViewById(R.id.btRenovatioDiminuir);
			btCuratioDiminuir = (Button) findViewById(R.id.btCuratioDiminuir);
			btLaudaAgnusDiminuir = (Button) findViewById(R.id.btLaudaAgnusDiminuir);
			btLaudaRamusDiminuir = (Button) findViewById(R.id.btLaudaRamusDiminuir);
			btSilentiumDiminuir = (Button) findViewById(R.id.btSilentiumDiminuir);
			btGeneseDiminuir = (Button) findViewById(R.id.btGeneseDiminuir);
			btOratioDiminuir = (Button) findViewById(R.id.btOratioDiminuir);
			btSacramentumDiminuir = (Button) findViewById(R.id.btSacramentumDiminuir);
			btExpiatioDiminuir = (Button) findViewById(R.id.btExpiatioDiminuir);
			btEucaristiaDiminuir = (Button) findViewById(R.id.btEucaristiaDiminuir);
			btGeminiLumenDiminuir = (Button) findViewById(R.id.btGeminiLumenDiminuir);
			btCriarAncillaDiminuir = (Button) findViewById(R.id.btCriarAncillaDiminuir);
			btEpiclesisDiminuir = (Button) findViewById(R.id.btEpiclesisDiminuir);
			btJudexDiminuir = (Button) findViewById(R.id.btJudexDiminuir);
			btAdoramusDiminuir = (Button) findViewById(R.id.btAdoramusDiminuir);

			//Botões de aumentar habilidades
			btProtecaoDivinaAumentar = (Button) findViewById(R.id.btProtecaoDivinaAumentar);
			btFlageloDoMalAumentar = (Button) findViewById(R.id.btFlageloDoMalAumentar);
			btSignumCrucisAumentar = (Button) findViewById(R.id.btSignumCrucisAumentar);
			btAngelusAumentar = (Button) findViewById(R.id.btAngelusAumentar);
			btBencaoAumentar = (Button) findViewById(R.id.btBencaoAumentar);
			btCurarAumentar = (Button) findViewById(R.id.btCurarAumentar);
			btAumentarAgilidadeAumentar = (Button) findViewById(R.id.btAumentarAgilidadeAumentar);
			btDiminuirAgilidadeAumentar = (Button) findViewById(R.id.btDiminuirAgilidadeAumentar);
			btAquaBenedictaAumentar = (Button) findViewById(R.id.btAquaBenedictaAumentar);
			btTeleporteAumentar = (Button) findViewById(R.id.btTeleporteAumentar);
			btPortalAumentar = (Button) findViewById(R.id.btPortalAumentar);
			btRevelacaoAumentar = (Button) findViewById(R.id.btRevelacaoAumentar);
			btEscudoSagradoAumentar = (Button) findViewById(R.id.btEscudoSagradoAumentar);
			btMedicarAumentar = (Button) findViewById(R.id.btMedicarAumentar);
			btAumentarRecuperacaoDeSPAumentar = (Button) findViewById(R.id.btAumentarRecuperacaoDeSPAumentar);
			btPericiaComMacaAumentar = (Button) findViewById(R.id.btPericiaComMacaAumentar);
			btImpositioManusAumentar = (Button) findViewById(R.id.btImpositioManusAumentar);
			btSuffragiumAumentar = (Button) findViewById(R.id.btSuffragiumAumentar);
			btAspersioAumentar = (Button) findViewById(R.id.btAspersioAumentar);
			btBenedictioSanctissimiSacramentiAumentar = (Button) findViewById(R.id.btBenedictioSanctissimiSacramentiAumentar);
			btSantuarioAumentar = (Button) findViewById(R.id.btSantuarioAumentar);
			btGracaDivinaAumentar = (Button) findViewById(R.id.btGracaDivinaAumentar);
			btRetardarVenenoAumentar = (Button) findViewById(R.id.btRetardarVenenoAumentar);
			btRessuscitarAumentar = (Button) findViewById(R.id.btRessuscitarAumentar);
			btEscudoMagicoAumentar = (Button) findViewById(R.id.btEscudoMagicoAumentar);
			btKyrieEleisonAumentar = (Button) findViewById(R.id.btKyrieEleisonAumentar);
			btMagnificatAumentar = (Button) findViewById(R.id.btMagnificatAumentar);
			btLexDivinaAumentar = (Button) findViewById(R.id.btLexDivinaAumentar);
			btEsconjurarAumentar = (Button) findViewById(R.id.btEsconjurarAumentar);
			btLexAeternaAumentar = (Button) findViewById(R.id.btLexAeternaAumentar);
			btMagnusExorcismusAumentar = (Button) findViewById(R.id.btMagnusExorcismusAumentar);
			btGloriaAumentar = (Button) findViewById(R.id.btGloriaAumentar);
			btAssumptioAumentar = (Button) findViewById(R.id.btAssumptioAumentar);
			btBasilicaAumentar = (Button) findViewById(R.id.btBasilicaAumentar);
			btMeditatioAumentar = (Button) findViewById(R.id.btMeditatioAumentar);
			btRiquezaDeEspiritoAumentar = (Button) findViewById(R.id.btRiquezaDeEspiritoAumentar);
			btSoproDivinoAumentar = (Button) findViewById(R.id.btSoproDivinoAumentar);
			btClementiaAumentar = (Button) findViewById(R.id.btClementiaAumentar);
			btCantoCandidusAumentar = (Button) findViewById(R.id.btCantoCandidusAumentar);
			btPraefatioAumentar = (Button) findViewById(R.id.btPraefatioAumentar);
			btRenovatioAumentar = (Button) findViewById(R.id.btRenovatioAumentar);
			btCuratioAumentar = (Button) findViewById(R.id.btCuratioAumentar);
			btLaudaAgnusAumentar = (Button) findViewById(R.id.btLaudaAgnusAumentar);
			btLaudaRamusAumentar = (Button) findViewById(R.id.btLaudaRamusAumentar);
			btSilentiumAumentar = (Button) findViewById(R.id.btSilentiumAumentar);
			btGeneseAumentar = (Button) findViewById(R.id.btGeneseAumentar);
			btOratioAumentar = (Button) findViewById(R.id.btOratioAumentar);
			btSacramentumAumentar = (Button) findViewById(R.id.btSacramentumAumentar);
			btExpiatioAumentar = (Button) findViewById(R.id.btExpiatioAumentar);
			btEucaristiaAumentar = (Button) findViewById(R.id.btEucaristiaAumentar);
			btGeminiLumenAumentar = (Button) findViewById(R.id.btGeminiLumenAumentar);
			btCriarAncillaAumentar = (Button) findViewById(R.id.btCriarAncillaAumentar);
			btEpiclesisAumentar = (Button) findViewById(R.id.btEpiclesisAumentar);
			btJudexAumentar = (Button) findViewById(R.id.btJudexAumentar);
			btAdoramusAumentar = (Button) findViewById(R.id.btAdoramusAumentar);

			//Resto dos botões
			btResetar = (Button) findViewById(R.id.btResetar);
			btSalvar = (Button) findViewById(R.id.btSalvar);
			btSalvarIMG = (Button) findViewById(R.id.btSalvarIMG);
			tgbtSomenteHabilidadeAprendida = (ToggleButton) findViewById(R.id.tgbtSomenteHabilidadeAprendida);

			//Txt pontos da tela
			txtProtecaoDivinaPontos = (TextView) findViewById(R.id.txtProtecaoDivinaPontos);
			txtFlageloDoMalPontos = (TextView) findViewById(R.id.txtFlageloDoMalPontos);
			txtSignumCrucisPontos = (TextView) findViewById(R.id.txtSignumCrucisPontos);
			txtAngelusPontos = (TextView) findViewById(R.id.txtAngelusPontos);
			txtBencaoPontos = (TextView) findViewById(R.id.txtBencaoPontos);
			txtCurarPontos = (TextView) findViewById(R.id.txtCurarPontos);
			txtAumentarAgilidadePontos = (TextView) findViewById(R.id.txtAumentarAgilidadePontos);
			txtDiminuirAgilidadePontos = (TextView) findViewById(R.id.txtDiminuirAgilidadePontos);
			txtAquaBenedictaPontos = (TextView) findViewById(R.id.txtAquaBenedictaPontos);
			txtTeleportePontos = (TextView) findViewById(R.id.txtTeleportePontos);
			txtPortalPontos = (TextView) findViewById(R.id.txtPortalPontos);
			txtRevelacaoPontos = (TextView) findViewById(R.id.txtRevelacaoPontos);
			txtEscudoSagradoPontos = (TextView) findViewById(R.id.txtEscudoSagradoPontos);
			txtMedicarPontos = (TextView) findViewById(R.id.txtMedicarPontos);
			txtAumentarRecuperacaoDeSPPontos = (TextView) findViewById(R.id.txtAumentarRecuperacaoDeSPPontos);
			txtPericiaComMacaPontos = (TextView) findViewById(R.id.txtPericiaComMacaPontos);
			txtImpositioManusPontos = (TextView) findViewById(R.id.txtImpositioManusPontos);
			txtSuffragiumPontos = (TextView) findViewById(R.id.txtSuffragiumPontos);
			txtAspersioPontos = (TextView) findViewById(R.id.txtAspersioPontos);
			txtBenedictioSanctissimiSacramentiPontos = (TextView) findViewById(R.id.txtBenedictioSanctissimiSacramentiPontos);
			txtSantuarioPontos = (TextView) findViewById(R.id.txtSantuarioPontos);
			txtGracaDivinaPontos = (TextView) findViewById(R.id.txtGracaDivinaPontos);
			txtRetardarVenenoPontos = (TextView) findViewById(R.id.txtRetardarVenenoPontos);
			txtRessuscitarPontos = (TextView) findViewById(R.id.txtRessuscitarPontos);
			txtEscudoMagicoPontos = (TextView) findViewById(R.id.txtEscudoMagicoPontos);
			txtKyrieEleisonPontos = (TextView) findViewById(R.id.txtKyrieEleisonPontos);
			txtMagnificatPontos = (TextView) findViewById(R.id.txtMagnificatPontos);
			txtLexDivinaPontos = (TextView) findViewById(R.id.txtLexDivinaPontos);
			txtEsconjurarPontos = (TextView) findViewById(R.id.txtEsconjurarPontos);
			txtLexAeternaPontos = (TextView) findViewById(R.id.txtLexAeternaPontos);
			txtMagnusExorcismusPontos = (TextView) findViewById(R.id.txtMagnusExorcismusPontos);
			txtGloriaPontos = (TextView) findViewById(R.id.txtGloriaPontos);
			txtAssumptioPontos = (TextView) findViewById(R.id.txtAssumptioPontos);
			txtBasilicaPontos = (TextView) findViewById(R.id.txtBasilicaPontos);
			txtMeditatioPontos = (TextView) findViewById(R.id.txtMeditatioPontos);
			txtRiquezaDeEspiritoPontos = (TextView) findViewById(R.id.txtRiquezaDeEspiritoPontos);
			txtSoproDivinoPontos = (TextView) findViewById(R.id.txtSoproDivinoPontos);
			txtClementiaPontos = (TextView) findViewById(R.id.txtClementiaPontos);
			txtCantoCandidusPontos = (TextView) findViewById(R.id.txtCantoCandidusPontos);
			txtPraefatioPontos = (TextView) findViewById(R.id.txtPraefatioPontos);
			txtRenovatioPontos = (TextView) findViewById(R.id.txtRenovatioPontos);
			txtCuratioPontos = (TextView) findViewById(R.id.txtCuratioPontos);
			txtLaudaAgnusPontos = (TextView) findViewById(R.id.txtLaudaAgnusPontos);
			txtLaudaRamusPontos = (TextView) findViewById(R.id.txtLaudaRamusPontos);
			txtSilentiumPontos = (TextView) findViewById(R.id.txtSilentiumPontos);
			txtGenesePontos = (TextView) findViewById(R.id.txtGenesePontos);
			txtOratioPontos = (TextView) findViewById(R.id.txtOratioPontos);
			txtSacramentumPontos = (TextView) findViewById(R.id.txtSacramentumPontos);
			txtExpiatioPontos = (TextView) findViewById(R.id.txtExpiatioPontos);
			txtEucaristiaPontos = (TextView) findViewById(R.id.txtEucaristiaPontos);
			txtGeminiLumenPontos = (TextView) findViewById(R.id.txtGeminiLumenPontos);
			txtCriarAncillaPontos = (TextView) findViewById(R.id.txtCriarAncillaPontos);
			txtEpiclesisPontos = (TextView) findViewById(R.id.txtEpiclesisPontos);
			txtJudexPontos = (TextView) findViewById(R.id.txtJudexPontos);
			txtAdoramusPontos = (TextView) findViewById(R.id.txtAdoramusPontos);

			//Txt pontos restantes
			txtClasse1 = (TextView) findViewById(R.id.txtClasse1);
			txtClasse2 = (TextView) findViewById(R.id.txtClasse2);
			txtTransClasse = (TextView) findViewById(R.id.txtClasseTrans);
			txtClasse3 = (TextView) findViewById(R.id.txtClasse3);

			//Layouts
			layProtecaoDivina = (LinearLayout) findViewById(R.id.layProtecaoDivina);
			layFlageloDoMal = (LinearLayout) findViewById(R.id.layFlageloDoMal);
			laySignumCrucis = (LinearLayout) findViewById(R.id.laySignumCrucis);
			layAngelus = (LinearLayout) findViewById(R.id.layAngelus);
			layBencao = (LinearLayout) findViewById(R.id.layBencao);
			layCurar = (LinearLayout) findViewById(R.id.layCurar);
			layAumentarAgilidade = (LinearLayout) findViewById(R.id.layAumentarAgilidade);
			layDiminuirAgilidade = (LinearLayout) findViewById(R.id.layDiminuirAgilidade);
			layAquaBenedicta = (LinearLayout) findViewById(R.id.layAquaBenedicta);
			layTeleporte = (LinearLayout) findViewById(R.id.layTeleporte);
			layPortal = (LinearLayout) findViewById(R.id.layPortal);
			layRevelacao = (LinearLayout) findViewById(R.id.layRevelacao);
			layEscudoSagrado = (LinearLayout) findViewById(R.id.layEscudoSagrado);
			layMedicar = (LinearLayout) findViewById(R.id.layMedicar);
			layAumentarRecuperacaoDeSP = (LinearLayout) findViewById(R.id.layAumentarRecuperacaoDeSP);
			layPericiaComMaca = (LinearLayout) findViewById(R.id.layPericiaComMaca);
			layImpositioManus = (LinearLayout) findViewById(R.id.layImpositioManus);
			laySuffragium = (LinearLayout) findViewById(R.id.laySuffragium);
			layAspersio = (LinearLayout) findViewById(R.id.layAspersio);
			layBenedictioSanctissimiSacramenti = (LinearLayout) findViewById(R.id.layBenedictioSanctissimiSacramenti);
			laySantuario = (LinearLayout) findViewById(R.id.laySantuario);
			layGracaDivina = (LinearLayout) findViewById(R.id.layGracaDivina);
			layRetardarVeneno = (LinearLayout) findViewById(R.id.layRetardarVeneno);
			layRessuscitar = (LinearLayout) findViewById(R.id.layRessuscitar);
			layEscudoMagico = (LinearLayout) findViewById(R.id.layEscudoMagico);
			layKyrieEleison = (LinearLayout) findViewById(R.id.layKyrieEleison);
			layMagnificat = (LinearLayout) findViewById(R.id.layMagnificat);
			layLexDivina = (LinearLayout) findViewById(R.id.layLexDivina);
			layEsconjurar = (LinearLayout) findViewById(R.id.layEsconjurar);
			layLexAeterna = (LinearLayout) findViewById(R.id.layLexAeterna);
			layMagnusExorcismus = (LinearLayout) findViewById(R.id.layMagnusExorcismus);
			layGloria = (LinearLayout) findViewById(R.id.layGloria);
			layAssumptio = (LinearLayout) findViewById(R.id.layAssumptio);
			layBasilica = (LinearLayout) findViewById(R.id.layBasilica);
			layMeditatio = (LinearLayout) findViewById(R.id.layMeditatio);
			layRiquezaDeEspirito = (LinearLayout) findViewById(R.id.layRiquezaDeEspirito);
			laySoproDivino = (LinearLayout) findViewById(R.id.laySoproDivino);
			layClementia = (LinearLayout) findViewById(R.id.layClementia);
			layCantoCandidus = (LinearLayout) findViewById(R.id.layCantoCandidus);
			layPraefatio = (LinearLayout) findViewById(R.id.layPraefatio);
			layRenovatio = (LinearLayout) findViewById(R.id.layRenovatio);
			layCuratio = (LinearLayout) findViewById(R.id.layCuratio);
			layLaudaAgnus = (LinearLayout) findViewById(R.id.layLaudaAgnus);
			layLaudaRamus = (LinearLayout) findViewById(R.id.layLaudaRamus);
			laySilentium = (LinearLayout) findViewById(R.id.laySilentium);
			layGenese = (LinearLayout) findViewById(R.id.layGenese);
			layOratio = (LinearLayout) findViewById(R.id.layOratio);
			laySacramentum = (LinearLayout) findViewById(R.id.laySacramentum);
			layExpiatio = (LinearLayout) findViewById(R.id.layExpiatio);
			layEucaristia = (LinearLayout) findViewById(R.id.layEucaristia);
			layGeminiLumen = (LinearLayout) findViewById(R.id.layGeminiLumen);
			layCriarAncilla = (LinearLayout) findViewById(R.id.layCriarAncilla);
			layEpiclesis = (LinearLayout) findViewById(R.id.layEpiclesis);
			layJudex = (LinearLayout) findViewById(R.id.layJudex);
			layAdoramus = (LinearLayout) findViewById(R.id.layAdoramus);

			layPrincipal = (LinearLayout) findViewById(R.id.habilidades);
			
			if (id>0)
				recarregarBuild(id);


			//Eventos de informação
			btProtecaoDivinaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Proteção Divina");
					dialogo.setMessage(R.string.protecaoDivinaNovicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFlageloDoMalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Flagelo Do Mal");
					dialogo.setMessage(R.string.flageloDoMalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSignumCrucisInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Signum Crucis");
					dialogo.setMessage(R.string.signumCrucisInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAngelusInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Angelus");
					dialogo.setMessage(R.string.angelusInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBencaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Bênção");
					dialogo.setMessage(R.string.bencaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCurarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Curar");
					dialogo.setMessage(R.string.curarNovicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAumentarAgilidadeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Aumentar Agilidade");
					dialogo.setMessage(R.string.aumentarAgilidadeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDiminuirAgilidadeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Diminuir Agilidade");
					dialogo.setMessage(R.string.diminuirAgilidadeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAquaBenedictaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Aqua Benedicta");
					dialogo.setMessage(R.string.aquaBenedictaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTeleporteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Teleporte");
					dialogo.setMessage(R.string.teleporteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPortalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Portal");
					dialogo.setMessage(R.string.portalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRevelacaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Revelação");
					dialogo.setMessage(R.string.revelacaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEscudoSagradoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Escudo Sagrado");
					dialogo.setMessage(R.string.escudoSagradoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMedicarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Medicar");
					dialogo.setMessage(R.string.medicarNovicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLuzDivinaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Luz Divina");
					dialogo.setMessage(R.string.luzDivinaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAumentarRecuperacaoDeSPInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Aumentar Recuperação De SP");
					dialogo.setMessage(R.string.aumentarRecuperacaoDeSPInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaComMacaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Perícia Com Maça");
					dialogo.setMessage(R.string.periciaComMacaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btImpositioManusInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Impositio Manus");
					dialogo.setMessage(R.string.impositioManusInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSuffragiumInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Suffragium");
					dialogo.setMessage(R.string.suffragiumInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAspersioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Aspersio");
					dialogo.setMessage(R.string.aspersioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBenedictioSanctissimiSacramentiInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Benedictio Sanctissimi Sacramenti");
					dialogo.setMessage(R.string.benedictioSanctissimiSacramentiInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSantuarioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Santuário");
					dialogo.setMessage(R.string.santuarioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGracaDivinaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Graça Divina");
					dialogo.setMessage(R.string.gracaDivinaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRetardarVenenoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Retardar Veneno");
					dialogo.setMessage(R.string.retardarVenenoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRessuscitarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Ressuscitar");
					dialogo.setMessage(R.string.ressuscitarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEscudoMagicoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Escudo Mágico");
					dialogo.setMessage(R.string.escudoMagicoSacerdoteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btKyrieEleisonInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Kyrie Eleison");
					dialogo.setMessage(R.string.kyrieEleisonInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMagnificatInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Magnificat");
					dialogo.setMessage(R.string.magnificatInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLexDivinaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Lex Divina");
					dialogo.setMessage(R.string.lexDivinaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEsconjurarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Esconjurar");
					dialogo.setMessage(R.string.esconjurarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLexAeternaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Lex Aeterna");
					dialogo.setMessage(R.string.lexAeternaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMagnusExorcismusInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Magnus Exorcismus");
					dialogo.setMessage(R.string.magnusExorcismusInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGloriaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Glória");
					dialogo.setMessage(R.string.gloriaSacerdoteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMartirioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Martírio");
					dialogo.setMessage(R.string.martirioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAssumptioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Assumptio");
					dialogo.setMessage(R.string.assumptioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBasilicaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Basílica");
					dialogo.setMessage(R.string.basilicaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMeditatioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Meditatio");
					dialogo.setMessage(R.string.meditatioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRiquezaDeEspiritoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Riqueza De Espírito");
					dialogo.setMessage(R.string.riquezaDeEspiritoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSoproDivinoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Sopro Divino");
					dialogo.setMessage(R.string.soproDivinoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btClementiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Clementia");
					dialogo.setMessage(R.string.clementiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCantoCandidusInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Canto Candidus");
					dialogo.setMessage(R.string.cantoCandidusInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPraefatioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Praefatio");
					dialogo.setMessage(R.string.praefatioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRenovatioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Renovatio");
					dialogo.setMessage(R.string.renovatioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCuratioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Curatio");
					dialogo.setMessage(R.string.curatioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLaudaAgnusInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Lauda Agnus");
					dialogo.setMessage(R.string.laudaAgnusInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLaudaRamusInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Lauda Ramus");
					dialogo.setMessage(R.string.laudaRamusInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSilentiumInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Silentium");
					dialogo.setMessage(R.string.silentiumInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGeneseInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Gênese");
					dialogo.setMessage(R.string.geneseInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOratioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Oratio");
					dialogo.setMessage(R.string.oratioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSacramentumInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Sacramentum");
					dialogo.setMessage(R.string.sacramentumInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btExpiatioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Expiatio");
					dialogo.setMessage(R.string.expiatioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEucaristiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Eucaristia");
					dialogo.setMessage(R.string.eucaristiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGeminiLumenInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Gemini Lumen");
					dialogo.setMessage(R.string.geminiLumenInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCriarAncillaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Criar Ancilla");
					dialogo.setMessage(R.string.criarAncillaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEpiclesisInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Epiclesis");
					dialogo.setMessage(R.string.epiclesisInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btJudexInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Judex");
					dialogo.setMessage(R.string.judexInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAdoramusInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcebispo.this);
					dialogo.setTitle("Adoramus");
					dialogo.setMessage(R.string.adoramusInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});


			//Eventos de aumentar
			btProtecaoDivinaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");

				}
			});
			btFlageloDoMalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varProtecaoDivina<3 && count<3){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFlageloDoMal, "FlageloDoMal", 10, 1, "Aumentar");

				}
			});
			btSignumCrucisAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varProtecaoDivina<3 && count<3){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varFlageloDoMal<3 && count<3){
						atualizarCalculo(varFlageloDoMal, "FlageloDoMal", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSignumCrucis, "SignumCrucis", 10, 1, "Aumentar");

				}
			});
			btAngelusAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varProtecaoDivina<3 && count<3){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAngelus, "Angelus", 10, 1, "Aumentar");

				}
			});
			btBencaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varProtecaoDivina<5 && count<5){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBencao, "Bencao", 10, 1, "Aumentar");

				}
			});
			btCurarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");

				}
			});
			btAumentarAgilidadeAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCurar<3 && count<3){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAumentarAgilidade, "AumentarAgilidade", 10, 1, "Aumentar");

				}
			});
			btDiminuirAgilidadeAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCurar<3 && count<3){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAumentarAgilidade<1 && count<1){
						atualizarCalculo(varAumentarAgilidade, "AumentarAgilidade", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDiminuirAgilidade, "DiminuirAgilidade", 10, 1, "Aumentar");

				}
			});
			btAquaBenedictaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAquaBenedicta, "AquaBenedicta", 1, 1, "Aumentar");

				}
			});
			btTeleporteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRevelacao<1 && count<1){
						atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTeleporte, "Teleporte", 2, 1, "Aumentar");

				}
			});
			btPortalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRevelacao<1 && count<1){
						atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTeleporte<2 && count<2){
						atualizarCalculo(varTeleporte, "Teleporte", 2, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPortal, "Portal", 4, 1, "Aumentar");

				}
			});
			btRevelacaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Aumentar");

				}
			});
			btEscudoSagradoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRevelacao<1 && count<1){
						atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTeleporte<2 && count<2){
						atualizarCalculo(varTeleporte, "Teleporte", 2, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPortal<4 && count<4){
						atualizarCalculo(varPortal, "Portal", 4, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEscudoSagrado, "EscudoSagrado", 1, 1, "Aumentar");

				}
			});
			btMedicarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCurar<2 && count<2){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMedicar, "Medicar", 1, 1, "Aumentar");

				}
			});
			btAumentarRecuperacaoDeSPAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 2, "Aumentar");

				}
			});
			btPericiaComMacaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComMaca, "PericiaComMaca", 10, 2, "Aumentar");

				}
			});
			btImpositioManusAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Aumentar");

				}
			});
			btSuffragiumAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varImpositioManus<2 && count<2){
						atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSuffragium, "Suffragium", 3, 2, "Aumentar");

				}
			});
			btAspersioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAquaBenedicta<1 && count<1){
						atualizarCalculo(varAquaBenedicta, "AquaBenedicta", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpositioManus<3 && count<3){
						atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAspersio, "Aspersio", 5, 2, "Aumentar");

				}
			});
			btBenedictioSanctissimiSacramentiAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAquaBenedicta<1 && count<1){
						atualizarCalculo(varAquaBenedicta, "AquaBenedicta", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpositioManus<3 && count<3){
						atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAspersio<5 && count<5){
						atualizarCalculo(varAspersio, "Aspersio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varProtecaoDivina<3 && count<3){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAngelus<2 && count<2){
						atualizarCalculo(varAngelus, "Angelus", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varKyrieEleison<4 && count<4){
						atualizarCalculo(varKyrieEleison, "KyrieEleison", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMagnificat<3 && count<3){
						atualizarCalculo(varMagnificat, "Magnificat", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varGloria<3 && count<3){
						atualizarCalculo(varGloria, "Gloria", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBenedictioSanctissimiSacramenti, "BenedictioSanctissimiSacramenti", 5, 2, "Aumentar");

				}
			});
			btSantuarioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCurar<1 && count<1){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSantuario, "Santuario", 10, 2, "Aumentar");

				}
			});
			btGracaDivinaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Aumentar");

				}
			});
			btRetardarVenenoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varGracaDivina<1 && count<1){
						atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRetardarVeneno, "RetardarVeneno", 4, 2, "Aumentar");

				}
			});
			btRessuscitarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varGracaDivina<1 && count<1){
						atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAumentarRecuperacaoDeSP<4 && count<4){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRessuscitar, "Ressuscitar", 4, 2, "Aumentar");

				}
			});
			btEscudoMagicoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAquaBenedicta<1 && count<1){
						atualizarCalculo(varAquaBenedicta, "AquaBenedicta", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpositioManus<3 && count<3){
						atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAspersio<4 && count<4){
						atualizarCalculo(varAspersio, "Aspersio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCurar<1 && count<1){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSantuario<3 && count<3){
						atualizarCalculo(varSantuario, "Santuario", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEscudoMagico, "EscudoMagico", 10, 2, "Aumentar");

				}
			});
			btKyrieEleisonAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varProtecaoDivina<3 && count<3){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAngelus<2 && count<2){
						atualizarCalculo(varAngelus, "Angelus", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varKyrieEleison, "KyrieEleison", 10, 2, "Aumentar");

				}
			});
			btMagnificatAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMagnificat, "Magnificat", 5, 2, "Aumentar");

				}
			});
			btLexDivinaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRevelacao<1 && count<1){
						atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varLexDivina, "LexDivina", 10, 2, "Aumentar");

				}
			});
			btEsconjurarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varGracaDivina<1 && count<1){
						atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAumentarRecuperacaoDeSP<4 && count<4){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRessuscitar<1 && count<1){
						atualizarCalculo(varRessuscitar, "Ressuscitar", 4, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevelacao<1 && count<1){
						atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLexDivina<3 && count<3){
						atualizarCalculo(varLexDivina, "LexDivina", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEsconjurar, "Esconjurar", 10, 2, "Aumentar");

				}
			});
			btLexAeternaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRevelacao<1 && count<1){
						atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLexDivina<5 && count<5){
						atualizarCalculo(varLexDivina, "LexDivina", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varLexAeterna, "LexAeterna", 1, 2, "Aumentar");

				}
			});
			btMagnusExorcismusAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAquaBenedicta<1 && count<1){
						atualizarCalculo(varAquaBenedicta, "AquaBenedicta", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpositioManus<3 && count<3){
						atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAspersio<4 && count<4){
						atualizarCalculo(varAspersio, "Aspersio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCurar<1 && count<1){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSantuario<3 && count<3){
						atualizarCalculo(varSantuario, "Santuario", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEscudoMagico<1 && count<1){
						atualizarCalculo(varEscudoMagico, "EscudoMagico", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevelacao<1 && count<1){
						atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLexDivina<5 && count<5){
						atualizarCalculo(varLexDivina, "LexDivina", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLexAeterna<1 && count<1){
						atualizarCalculo(varLexAeterna, "LexAeterna", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varGracaDivina<1 && count<1){
						atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAumentarRecuperacaoDeSP<4 && count<4){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRessuscitar<1 && count<1){
						atualizarCalculo(varRessuscitar, "Ressuscitar", 4, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevelacao<1 && count<1){
						atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLexDivina<3 && count<3){
						atualizarCalculo(varLexDivina, "LexDivina", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsconjurar<3 && count<3){
						atualizarCalculo(varEsconjurar, "Esconjurar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMagnusExorcismus, "MagnusExorcismus", 10, 2, "Aumentar");

				}
			});
			btGloriaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varProtecaoDivina<3 && count<3){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAngelus<2 && count<2){
						atualizarCalculo(varAngelus, "Angelus", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varKyrieEleison<4 && count<4){
						atualizarCalculo(varKyrieEleison, "KyrieEleison", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMagnificat<3 && count<3){
						atualizarCalculo(varMagnificat, "Magnificat", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGloria, "Gloria", 5, 2, "Aumentar");

				}
			});
			btAssumptioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varProtecaoDivina<3 && count<3){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAngelus<1 && count<1){
						atualizarCalculo(varAngelus, "Angelus", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpositioManus<3 && count<3){
						atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAumentarRecuperacaoDeSP<3 && count<3){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAssumptio, "Assumptio", 5, 3, "Aumentar");

				}
			});
			btBasilicaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varProtecaoDivina<3 && count<3){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAngelus<2 && count<2){
						atualizarCalculo(varAngelus, "Angelus", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varKyrieEleison<4 && count<4){
						atualizarCalculo(varKyrieEleison, "KyrieEleison", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMagnificat<3 && count<3){
						atualizarCalculo(varMagnificat, "Magnificat", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varGloria<2 && count<2){
						atualizarCalculo(varGloria, "Gloria", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAumentarRecuperacaoDeSP<1 && count<1){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBasilica, "Basilica", 5, 3, "Aumentar");

				}
			});
			btMeditatioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRevelacao<1 && count<1){
						atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLexDivina<5 && count<5){
						atualizarCalculo(varLexDivina, "LexDivina", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAquaBenedicta<1 && count<1){
						atualizarCalculo(varAquaBenedicta, "AquaBenedicta", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpositioManus<3 && count<3){
						atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAspersio<3 && count<3){
						atualizarCalculo(varAspersio, "Aspersio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAumentarRecuperacaoDeSP<5 && count<5){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMeditatio, "Meditatio", 10, 3, "Aumentar");

				}
			});
			btRiquezaDeEspiritoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaComMaca<10 && count<10){
						atualizarCalculo(varPericiaComMaca, "PericiaComMaca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varProtecaoDivina<3 && count<3){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varFlageloDoMal<10 && count<10){
						atualizarCalculo(varFlageloDoMal, "FlageloDoMal", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRiquezaDeEspirito, "RiquezaDeEspirito", 5, 3, "Aumentar");

				}
			});
			btSoproDivinoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCurar<1 && count<1){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSoproDivino, "SoproDivino", 3, 4, "Aumentar");

				}
			});
			btClementiaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varProtecaoDivina<5 && count<5){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varBencao<1 && count<1){
						atualizarCalculo(varBencao, "Bencao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varClementia, "Clementia", 3, 4, "Aumentar");

				}
			});
			btCantoCandidusAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCurar<3 && count<3){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAumentarAgilidade<1 && count<1){
						atualizarCalculo(varAumentarAgilidade, "AumentarAgilidade", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCantoCandidus, "CantoCandidus", 3, 4, "Aumentar");

				}
			});
			btPraefatioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varProtecaoDivina<3 && count<3){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAngelus<2 && count<2){
						atualizarCalculo(varAngelus, "Angelus", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varKyrieEleison<1 && count<1){
						atualizarCalculo(varKyrieEleison, "KyrieEleison", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPraefatio, "Praefatio", 10, 4, "Aumentar");

				}
			});
			btRenovatioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCurar<1 && count<1){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSoproDivino<3 && count<3){
						atualizarCalculo(varSoproDivino, "SoproDivino", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRenovatio, "Renovatio", 1, 4, "Aumentar");

				}
			});
			btCuratioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCurar<1 && count<1){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSoproDivino<3 && count<3){
						atualizarCalculo(varSoproDivino, "SoproDivino", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenovatio<1 && count<1){
						atualizarCalculo(varRenovatio, "Renovatio", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCuratio, "Curatio", 5, 4, "Aumentar");

				}
			});
			btLaudaAgnusAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varGracaDivina<1 && count<1){
						atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varLaudaAgnus, "LaudaAgnus", 4, 4, "Aumentar");

				}
			});
			btLaudaRamusAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varGracaDivina<1 && count<1){
						atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaudaAgnus<2 && count<2){
						atualizarCalculo(varLaudaAgnus, "LaudaAgnus", 4, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varLaudaRamus, "LaudaRamus", 4, 4, "Aumentar");

				}
			});
			btSilentiumAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varGracaDivina<1 && count<1){
						atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaudaAgnus<2 && count<2){
						atualizarCalculo(varLaudaAgnus, "LaudaAgnus", 4, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaudaRamus<2 && count<2){
						atualizarCalculo(varLaudaRamus, "LaudaRamus", 4, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varGenese<1 && count<1){
						atualizarCalculo(varGenese, "Genese", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSilentium, "Silentium", 5, 4, "Aumentar");

				}
			});
			btGeneseAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varGracaDivina<1 && count<1){
						atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaudaAgnus<2 && count<2){
						atualizarCalculo(varLaudaAgnus, "LaudaAgnus", 4, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaudaRamus<2 && count<2){
						atualizarCalculo(varLaudaRamus, "LaudaRamus", 4, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGenese, "Genese", 5, 4, "Aumentar");

				}
			});
			btOratioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varProtecaoDivina<3 && count<3){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAngelus<2 && count<2){
						atualizarCalculo(varAngelus, "Angelus", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varKyrieEleison<1 && count<1){
						atualizarCalculo(varKyrieEleison, "KyrieEleison", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPraefatio<5 && count<5){
						atualizarCalculo(varPraefatio, "Praefatio", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varOratio, "Oratio", 10, 4, "Aumentar");

				}
			});
			btSacramentumAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCurar<1 && count<1){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSoproDivino<3 && count<3){
						atualizarCalculo(varSoproDivino, "SoproDivino", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenovatio<1 && count<1){
						atualizarCalculo(varRenovatio, "Renovatio", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCuratio<1 && count<1){
						atualizarCalculo(varCuratio, "Curatio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varProtecaoDivina<5 && count<5){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varBencao<1 && count<1){
						atualizarCalculo(varBencao, "Bencao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varClementia<3 && count<3){
						atualizarCalculo(varClementia, "Clementia", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCriarAncilla<1 && count<1){
						atualizarCalculo(varCriarAncilla, "CriarAncilla", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varEpiclesis<1 && count<1){
						atualizarCalculo(varEpiclesis, "Epiclesis", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varProtecaoDivina<3 && count<3){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAngelus<2 && count<2){
						atualizarCalculo(varAngelus, "Angelus", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varKyrieEleison<1 && count<1){
						atualizarCalculo(varKyrieEleison, "KyrieEleison", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPraefatio<5 && count<5){
						atualizarCalculo(varPraefatio, "Praefatio", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varOratio<5 && count<5){
						atualizarCalculo(varOratio, "Oratio", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAquaBenedicta<1 && count<1){
						atualizarCalculo(varAquaBenedicta, "AquaBenedicta", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpositioManus<3 && count<3){
						atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAspersio<1 && count<1){
						atualizarCalculo(varAspersio, "Aspersio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varGeminiLumen<5 && count<5){
						atualizarCalculo(varGeminiLumen, "GeminiLumen", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varExpiatio<1 && count<1){
						atualizarCalculo(varExpiatio, "Expiatio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSacramentum, "Sacramentum", 5, 4, "Aumentar");

				}
			});
			btExpiatioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varProtecaoDivina<3 && count<3){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAngelus<2 && count<2){
						atualizarCalculo(varAngelus, "Angelus", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varKyrieEleison<1 && count<1){
						atualizarCalculo(varKyrieEleison, "KyrieEleison", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPraefatio<5 && count<5){
						atualizarCalculo(varPraefatio, "Praefatio", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varOratio<5 && count<5){
						atualizarCalculo(varOratio, "Oratio", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAquaBenedicta<1 && count<1){
						atualizarCalculo(varAquaBenedicta, "AquaBenedicta", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpositioManus<3 && count<3){
						atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAspersio<1 && count<1){
						atualizarCalculo(varAspersio, "Aspersio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varGeminiLumen<5 && count<5){
						atualizarCalculo(varGeminiLumen, "GeminiLumen", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varExpiatio, "Expiatio", 5, 4, "Aumentar");

				}
			});
			btEucaristiaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCurar<1 && count<1){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSoproDivino<3 && count<3){
						atualizarCalculo(varSoproDivino, "SoproDivino", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenovatio<1 && count<1){
						atualizarCalculo(varRenovatio, "Renovatio", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCuratio<1 && count<1){
						atualizarCalculo(varCuratio, "Curatio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varProtecaoDivina<5 && count<5){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varBencao<1 && count<1){
						atualizarCalculo(varBencao, "Bencao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varClementia<3 && count<3){
						atualizarCalculo(varClementia, "Clementia", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCriarAncilla<1 && count<1){
						atualizarCalculo(varCriarAncilla, "CriarAncilla", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varEpiclesis<1 && count<1){
						atualizarCalculo(varEpiclesis, "Epiclesis", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varProtecaoDivina<3 && count<3){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAngelus<2 && count<2){
						atualizarCalculo(varAngelus, "Angelus", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varKyrieEleison<1 && count<1){
						atualizarCalculo(varKyrieEleison, "KyrieEleison", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPraefatio<5 && count<5){
						atualizarCalculo(varPraefatio, "Praefatio", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varOratio<5 && count<5){
						atualizarCalculo(varOratio, "Oratio", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAquaBenedicta<1 && count<1){
						atualizarCalculo(varAquaBenedicta, "AquaBenedicta", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpositioManus<3 && count<3){
						atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAspersio<1 && count<1){
						atualizarCalculo(varAspersio, "Aspersio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varGeminiLumen<5 && count<5){
						atualizarCalculo(varGeminiLumen, "GeminiLumen", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varExpiatio<1 && count<1){
						atualizarCalculo(varExpiatio, "Expiatio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEucaristia, "Eucaristia", 10, 4, "Aumentar");

				}
			});
			btGeminiLumenAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAquaBenedicta<1 && count<1){
						atualizarCalculo(varAquaBenedicta, "AquaBenedicta", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpositioManus<3 && count<3){
						atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAspersio<1 && count<1){
						atualizarCalculo(varAspersio, "Aspersio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGeminiLumen, "GeminiLumen", 10, 4, "Aumentar");

				}
			});
			btCriarAncillaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varProtecaoDivina<5 && count<5){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varBencao<1 && count<1){
						atualizarCalculo(varBencao, "Bencao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varClementia<3 && count<3){
						atualizarCalculo(varClementia, "Clementia", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCriarAncilla, "CriarAncilla", 1, 4, "Aumentar");

				}
			});
			btEpiclesisAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCurar<1 && count<1){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSoproDivino<3 && count<3){
						atualizarCalculo(varSoproDivino, "SoproDivino", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenovatio<1 && count<1){
						atualizarCalculo(varRenovatio, "Renovatio", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCuratio<1 && count<1){
						atualizarCalculo(varCuratio, "Curatio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varProtecaoDivina<5 && count<5){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varBencao<1 && count<1){
						atualizarCalculo(varBencao, "Bencao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varClementia<3 && count<3){
						atualizarCalculo(varClementia, "Clementia", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCriarAncilla<1 && count<1){
						atualizarCalculo(varCriarAncilla, "CriarAncilla", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEpiclesis, "Epiclesis", 5, 4, "Aumentar");

				}
			});
			btJudexAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varGracaDivina<1 && count<1){
						atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAumentarRecuperacaoDeSP<4 && count<4){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRessuscitar<1 && count<1){
						atualizarCalculo(varRessuscitar, "Ressuscitar", 4, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevelacao<1 && count<1){
						atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLexDivina<3 && count<3){
						atualizarCalculo(varLexDivina, "LexDivina", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsconjurar<1 && count<1){
						atualizarCalculo(varEsconjurar, "Esconjurar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varJudex, "Judex", 5, 4, "Aumentar");

				}
			});
			btAdoramusAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varGracaDivina<1 && count<1){
						atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAumentarRecuperacaoDeSP<4 && count<4){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRessuscitar<1 && count<1){
						atualizarCalculo(varRessuscitar, "Ressuscitar", 4, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevelacao<1 && count<1){
						atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLexDivina<3 && count<3){
						atualizarCalculo(varLexDivina, "LexDivina", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsconjurar<1 && count<1){
						atualizarCalculo(varEsconjurar, "Esconjurar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varJudex<5 && count<5){
						atualizarCalculo(varJudex, "Judex", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varProtecaoDivina<5 && count<5){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varBencao<1 && count<1){
						atualizarCalculo(varBencao, "Bencao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varClementia<3 && count<3){
						atualizarCalculo(varClementia, "Clementia", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCriarAncilla<1 && count<1){
						atualizarCalculo(varCriarAncilla, "CriarAncilla", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAquaBenedicta<1 && count<1){
						atualizarCalculo(varAquaBenedicta, "AquaBenedicta", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpositioManus<3 && count<3){
						atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAspersio<4 && count<4){
						atualizarCalculo(varAspersio, "Aspersio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCurar<1 && count<1){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSantuario<3 && count<3){
						atualizarCalculo(varSantuario, "Santuario", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEscudoMagico<1 && count<1){
						atualizarCalculo(varEscudoMagico, "EscudoMagico", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevelacao<1 && count<1){
						atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLexDivina<5 && count<5){
						atualizarCalculo(varLexDivina, "LexDivina", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLexAeterna<1 && count<1){
						atualizarCalculo(varLexAeterna, "LexAeterna", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varGracaDivina<1 && count<1){
						atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAumentarRecuperacaoDeSP<4 && count<4){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRessuscitar<1 && count<1){
						atualizarCalculo(varRessuscitar, "Ressuscitar", 4, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevelacao<1 && count<1){
						atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLexDivina<3 && count<3){
						atualizarCalculo(varLexDivina, "LexDivina", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsconjurar<3 && count<3){
						atualizarCalculo(varEsconjurar, "Esconjurar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMagnusExorcismus<1 && count<1){
						atualizarCalculo(varMagnusExorcismus, "MagnusExorcismus", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAdoramus, "Adoramus", 10, 4, "Aumentar");

				}
			});


			//Eventos de diminuir
			btProtecaoDivinaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Diminuir");

				}
			});
			btFlageloDoMalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFlageloDoMal, "FlageloDoMal", 10, 1, "Diminuir");

				}
			});
			btSignumCrucisDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSignumCrucis, "SignumCrucis", 10, 1, "Diminuir");

				}
			});
			btAngelusDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAngelus, "Angelus", 10, 1, "Diminuir");

				}
			});
			btBencaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBencao, "Bencao", 10, 1, "Diminuir");

				}
			});
			btCurarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCurar, "Curar", 10, 1, "Diminuir");

				}
			});
			btAumentarAgilidadeDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAumentarAgilidade, "AumentarAgilidade", 10, 1, "Diminuir");

				}
			});
			btDiminuirAgilidadeDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDiminuirAgilidade, "DiminuirAgilidade", 10, 1, "Diminuir");

				}
			});
			btAquaBenedictaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAquaBenedicta, "AquaBenedicta", 1, 1, "Diminuir");

				}
			});
			btTeleporteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTeleporte, "Teleporte", 2, 1, "Diminuir");

				}
			});
			btPortalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPortal, "Portal", 4, 1, "Diminuir");

				}
			});
			btRevelacaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRevelacao, "Revelacao", 1, 1, "Diminuir");

				}
			});
			btEscudoSagradoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEscudoSagrado, "EscudoSagrado", 1, 1, "Diminuir");

				}
			});
			btMedicarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMedicar, "Medicar", 1, 1, "Diminuir");

				}
			});
			btAumentarRecuperacaoDeSPDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 2, "Diminuir");

				}
			});
			btPericiaComMacaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComMaca, "PericiaComMaca", 10, 2, "Diminuir");

				}
			});
			btImpositioManusDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Diminuir");

				}
			});
			btSuffragiumDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSuffragium, "Suffragium", 3, 2, "Diminuir");

				}
			});
			btAspersioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAspersio, "Aspersio", 5, 2, "Diminuir");

				}
			});
			btBenedictioSanctissimiSacramentiDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBenedictioSanctissimiSacramenti, "BenedictioSanctissimiSacramenti", 5, 2, "Diminuir");

				}
			});
			btSantuarioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSantuario, "Santuario", 10, 2, "Diminuir");

				}
			});
			btGracaDivinaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Diminuir");

				}
			});
			btRetardarVenenoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRetardarVeneno, "RetardarVeneno", 4, 2, "Diminuir");

				}
			});
			btRessuscitarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRessuscitar, "Ressuscitar", 4, 2, "Diminuir");

				}
			});
			btEscudoMagicoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEscudoMagico, "EscudoMagico", 10, 2, "Diminuir");

				}
			});
			btKyrieEleisonDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varKyrieEleison, "KyrieEleison", 10, 2, "Diminuir");

				}
			});
			btMagnificatDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMagnificat, "Magnificat", 5, 2, "Diminuir");

				}
			});
			btLexDivinaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLexDivina, "LexDivina", 10, 2, "Diminuir");

				}
			});
			btEsconjurarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEsconjurar, "Esconjurar", 10, 2, "Diminuir");

				}
			});
			btLexAeternaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLexAeterna, "LexAeterna", 1, 2, "Diminuir");

				}
			});
			btMagnusExorcismusDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMagnusExorcismus, "MagnusExorcismus", 10, 2, "Diminuir");

				}
			});
			btGloriaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGloria, "Gloria", 5, 2, "Diminuir");

				}
			});
			btAssumptioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAssumptio, "Assumptio", 5, 3, "Diminuir");

				}
			});
			btBasilicaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBasilica, "Basilica", 5, 3, "Diminuir");

				}
			});
			btMeditatioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMeditatio, "Meditatio", 10, 3, "Diminuir");

				}
			});
			btRiquezaDeEspiritoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRiquezaDeEspirito, "RiquezaDeEspirito", 5, 3, "Diminuir");

				}
			});
			btSoproDivinoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSoproDivino, "SoproDivino", 3, 4, "Diminuir");

				}
			});
			btClementiaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varClementia, "Clementia", 3, 4, "Diminuir");

				}
			});
			btCantoCandidusDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCantoCandidus, "CantoCandidus", 3, 4, "Diminuir");

				}
			});
			btPraefatioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPraefatio, "Praefatio", 10, 4, "Diminuir");

				}
			});
			btRenovatioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRenovatio, "Renovatio", 1, 4, "Diminuir");

				}
			});
			btCuratioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCuratio, "Curatio", 5, 4, "Diminuir");

				}
			});
			btLaudaAgnusDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLaudaAgnus, "LaudaAgnus", 4, 4, "Diminuir");

				}
			});
			btLaudaRamusDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLaudaRamus, "LaudaRamus", 4, 4, "Diminuir");

				}
			});
			btSilentiumDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSilentium, "Silentium", 5, 4, "Diminuir");

				}
			});
			btGeneseDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGenese, "Genese", 5, 4, "Diminuir");

				}
			});
			btOratioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOratio, "Oratio", 10, 4, "Diminuir");

				}
			});
			btSacramentumDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSacramentum, "Sacramentum", 5, 4, "Diminuir");

				}
			});
			btExpiatioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varExpiatio, "Expiatio", 5, 4, "Diminuir");

				}
			});
			btEucaristiaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEucaristia, "Eucaristia", 10, 4, "Diminuir");

				}
			});
			btGeminiLumenDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGeminiLumen, "GeminiLumen", 10, 4, "Diminuir");

				}
			});
			btCriarAncillaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCriarAncilla, "CriarAncilla", 1, 4, "Diminuir");

				}
			});
			btEpiclesisDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEpiclesis, "Epiclesis", 5, 4, "Diminuir");

				}
			});
			btJudexDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varJudex, "Judex", 5, 4, "Diminuir");

				}
			});
			btAdoramusDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAdoramus, "Adoramus", 10, 4, "Diminuir");

				}
			});


			//Outros Botões
			btResetar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					varProtecaoDivina = 0;
					varFlageloDoMal = 0;
					varSignumCrucis = 0;
					varAngelus = 0;
					varBencao = 0;
					varCurar = 0;
					varAumentarAgilidade = 0;
					varDiminuirAgilidade = 0;
					varAquaBenedicta = 0;
					varTeleporte = 0;
					varPortal = 0;
					varRevelacao = 0;
					varEscudoSagrado = 0;
					varMedicar = 0;
					varAumentarRecuperacaoDeSP = 0;
					varPericiaComMaca = 0;
					varImpositioManus = 0;
					varSuffragium = 0;
					varAspersio = 0;
					varBenedictioSanctissimiSacramenti = 0;
					varSantuario = 0;
					varGracaDivina = 0;
					varRetardarVeneno = 0;
					varRessuscitar = 0;
					varEscudoMagico = 0;
					varKyrieEleison = 0;
					varMagnificat = 0;
					varLexDivina = 0;
					varEsconjurar = 0;
					varLexAeterna = 0;
					varMagnusExorcismus = 0;
					varGloria = 0;
					varAssumptio = 0;
					varBasilica = 0;
					varMeditatio = 0;
					varRiquezaDeEspirito = 0;
					varSoproDivino = 0;
					varClementia = 0;
					varCantoCandidus = 0;
					varPraefatio = 0;
					varRenovatio = 0;
					varCuratio = 0;
					varLaudaAgnus = 0;
					varLaudaRamus = 0;
					varSilentium = 0;
					varGenese = 0;
					varOratio = 0;
					varSacramentum = 0;
					varExpiatio = 0;
					varEucaristia = 0;
					varGeminiLumen = 0;
					varCriarAncilla = 0;
					varEpiclesis = 0;
					varJudex = 0;
					varAdoramus = 0;

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
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorArcebispo.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorArcebispo.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorArcebispo.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorArcebispo.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorArcebispo.this);
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

					AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorArcebispo.this);
					msg.setTitle("Escolha um nome");
					msg.setMessage("OBS: Salvar PNG só irá salvar em forma de imagem! É recomendado que salve a build na memória do celular também.\nEscolha um nome para salvar esta simulação:");
					final EditText nomeParaSalvar = new EditText(SimuladorArcebispo.this);
					msg.setView(nomeParaSalvar);
					msg.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {

							@Override
						public void onClick(DialogInterface dialog, int which) {
							if (nomeParaSalvar.getText().toString().length() <= 0) {
								nomeParaSalvar.setError("Preencha o campo!");
								Toast.makeText(getBaseContext(), "ERROR: Insira um nome!", Toast.LENGTH_SHORT).show();
							} else {
								SaveFile sf = new SaveFile();
								sf.takeAScreenShot(SimuladorArcebispo.this, layPrincipal, nomeParaSalvar.getText().toString());
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
			if(varProtecaoDivina==0)
				layProtecaoDivina.setVisibility(View.GONE);
			if(varFlageloDoMal==0)
				layFlageloDoMal.setVisibility(View.GONE);
			if(varSignumCrucis==0)
				laySignumCrucis.setVisibility(View.GONE);
			if(varAngelus==0)
				layAngelus.setVisibility(View.GONE);
			if(varBencao==0)
				layBencao.setVisibility(View.GONE);
			if(varCurar==0)
				layCurar.setVisibility(View.GONE);
			if(varAumentarAgilidade==0)
				layAumentarAgilidade.setVisibility(View.GONE);
			if(varDiminuirAgilidade==0)
				layDiminuirAgilidade.setVisibility(View.GONE);
			if(varAquaBenedicta==0)
				layAquaBenedicta.setVisibility(View.GONE);
			if(varTeleporte==0)
				layTeleporte.setVisibility(View.GONE);
			if(varPortal==0)
				layPortal.setVisibility(View.GONE);
			if(varRevelacao==0)
				layRevelacao.setVisibility(View.GONE);
			if(varEscudoSagrado==0)
				layEscudoSagrado.setVisibility(View.GONE);
			if(varMedicar==0)
				layMedicar.setVisibility(View.GONE);

			if(varAumentarRecuperacaoDeSP==0)
				layAumentarRecuperacaoDeSP.setVisibility(View.GONE);
			if(varPericiaComMaca==0)
				layPericiaComMaca.setVisibility(View.GONE);
			if(varImpositioManus==0)
				layImpositioManus.setVisibility(View.GONE);
			if(varSuffragium==0)
				laySuffragium.setVisibility(View.GONE);
			if(varAspersio==0)
				layAspersio.setVisibility(View.GONE);
			if(varBenedictioSanctissimiSacramenti==0)
				layBenedictioSanctissimiSacramenti.setVisibility(View.GONE);
			if(varSantuario==0)
				laySantuario.setVisibility(View.GONE);
			if(varGracaDivina==0)
				layGracaDivina.setVisibility(View.GONE);
			if(varRetardarVeneno==0)
				layRetardarVeneno.setVisibility(View.GONE);
			if(varRessuscitar==0)
				layRessuscitar.setVisibility(View.GONE);
			if(varEscudoMagico==0)
				layEscudoMagico.setVisibility(View.GONE);
			if(varKyrieEleison==0)
				layKyrieEleison.setVisibility(View.GONE);
			if(varMagnificat==0)
				layMagnificat.setVisibility(View.GONE);
			if(varLexDivina==0)
				layLexDivina.setVisibility(View.GONE);
			if(varEsconjurar==0)
				layEsconjurar.setVisibility(View.GONE);
			if(varLexAeterna==0)
				layLexAeterna.setVisibility(View.GONE);
			if(varMagnusExorcismus==0)
				layMagnusExorcismus.setVisibility(View.GONE);
			if(varGloria==0)
				layGloria.setVisibility(View.GONE);

			if(varAssumptio==0)
				layAssumptio.setVisibility(View.GONE);
			if(varBasilica==0)
				layBasilica.setVisibility(View.GONE);
			if(varMeditatio==0)
				layMeditatio.setVisibility(View.GONE);
			if(varRiquezaDeEspirito==0)
				layRiquezaDeEspirito.setVisibility(View.GONE);

			if(varSoproDivino==0)
				laySoproDivino.setVisibility(View.GONE);
			if(varClementia==0)
				layClementia.setVisibility(View.GONE);
			if(varCantoCandidus==0)
				layCantoCandidus.setVisibility(View.GONE);
			if(varPraefatio==0)
				layPraefatio.setVisibility(View.GONE);
			if(varRenovatio==0)
				layRenovatio.setVisibility(View.GONE);
			if(varCuratio==0)
				layCuratio.setVisibility(View.GONE);
			if(varLaudaAgnus==0)
				layLaudaAgnus.setVisibility(View.GONE);
			if(varLaudaRamus==0)
				layLaudaRamus.setVisibility(View.GONE);
			if(varSilentium==0)
				laySilentium.setVisibility(View.GONE);
			if(varGenese==0)
				layGenese.setVisibility(View.GONE);
			if(varOratio==0)
				layOratio.setVisibility(View.GONE);
			if(varSacramentum==0)
				laySacramentum.setVisibility(View.GONE);
			if(varExpiatio==0)
				layExpiatio.setVisibility(View.GONE);
			if(varEucaristia==0)
				layEucaristia.setVisibility(View.GONE);
			if(varGeminiLumen==0)
				layGeminiLumen.setVisibility(View.GONE);
			if(varCriarAncilla==0)
				layCriarAncilla.setVisibility(View.GONE);
			if(varEpiclesis==0)
				layEpiclesis.setVisibility(View.GONE);
			if(varJudex==0)
				layJudex.setVisibility(View.GONE);
			if(varAdoramus==0)
				layAdoramus.setVisibility(View.GONE);

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

				if (nomeDaHabilidade=="ProtecaoDivina" && varFlageloDoMal>=1 && varProtecaoDivina<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FlageloDoMal" && varSignumCrucis>=1 && varFlageloDoMal<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ProtecaoDivina" && varAngelus>=1 && varProtecaoDivina<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ProtecaoDivina" && varBencao>=1 && varProtecaoDivina<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Curar" && varAumentarAgilidade>=1 && varCurar<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AumentarAgilidade" && varDiminuirAgilidade>=1 && varAumentarAgilidade<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Revelacao" && varTeleporte>=1 && varRevelacao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Teleporte" && varPortal>=1 && varTeleporte<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Portal" && varEscudoSagrado>=1 && varPortal<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Curar" && varMedicar>=1 && varCurar<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ImpositioManus" && varSuffragium>=1 && varImpositioManus<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AquaBenedicta" && varAspersio>=1 && varAquaBenedicta<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ImpositioManus" && varAspersio>=1 && varImpositioManus<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Aspersio" && varBenedictioSanctissimiSacramenti>=1 && varAspersio<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Gloria" && varBenedictioSanctissimiSacramenti>=1 && varGloria<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Curar" && varSantuario>=1 && varCurar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="GracaDivina" && varRetardarVeneno>=1 && varGracaDivina<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="GracaDivina" && varRessuscitar>=1 && varGracaDivina<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AumentarRecuperacaoDeSP" && varRessuscitar>=1 && varAumentarRecuperacaoDeSP<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Aspersio" && varEscudoMagico>=1 && varAspersio<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Santuario" && varEscudoMagico>=1 && varSantuario<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Angelus" && varKyrieEleison>=1 && varAngelus<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Revelacao" && varLexDivina>=1 && varRevelacao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Ressuscitar" && varEsconjurar>=1 && varRessuscitar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LexDivina" && varEsconjurar>=1 && varLexDivina<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LexDivina" && varLexAeterna>=1 && varLexDivina<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EscudoMagico" && varMagnusExorcismus>=1 && varEscudoMagico<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LexAeterna" && varMagnusExorcismus>=1 && varLexAeterna<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Esconjurar" && varMagnusExorcismus>=1 && varEsconjurar<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="KyrieEleison" && varGloria>=1 && varKyrieEleison<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Magnificat" && varGloria>=1 && varMagnificat<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Angelus" && varAssumptio>=1 && varAngelus<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ImpositioManus" && varAssumptio>=1 && varImpositioManus<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AumentarRecuperacaoDeSP" && varAssumptio>=1 && varAumentarRecuperacaoDeSP<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Gloria" && varBasilica>=1 && varGloria<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AumentarRecuperacaoDeSP" && varBasilica>=1 && varAumentarRecuperacaoDeSP<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LexDivina" && varMeditatio>=1 && varLexDivina<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Aspersio" && varMeditatio>=1 && varAspersio<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AumentarRecuperacaoDeSP" && varMeditatio>=1 && varAumentarRecuperacaoDeSP<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaComMaca" && varRiquezaDeEspirito>=1 && varPericiaComMaca<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FlageloDoMal" && varRiquezaDeEspirito>=1 && varFlageloDoMal<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Curar" && varSoproDivino>=1 && varCurar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Bencao" && varClementia>=1 && varBencao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AumentarAgilidade" && varCantoCandidus>=1 && varAumentarAgilidade<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="KyrieEleison" && varPraefatio>=1 && varKyrieEleison<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="SoproDivino" && varRenovatio>=1 && varSoproDivino<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Renovatio" && varCuratio>=1 && varRenovatio<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="GracaDivina" && varLaudaAgnus>=1 && varGracaDivina<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LaudaAgnus" && varLaudaRamus>=1 && varLaudaAgnus<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Genese" && varSilentium>=1 && varGenese<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LaudaRamus" && varGenese>=1 && varLaudaRamus<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Praefatio" && varOratio>=1 && varPraefatio<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Epiclesis" && varSacramentum>=1 && varEpiclesis<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Expiatio" && varSacramentum>=1 && varExpiatio<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Oratio" && varExpiatio>=1 && varOratio<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="GeminiLumen" && varExpiatio>=1 && varGeminiLumen<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Epiclesis" && varEucaristia>=1 && varEpiclesis<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Expiatio" && varEucaristia>=1 && varExpiatio<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Aspersio" && varGeminiLumen>=1 && varAspersio<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Clementia" && varCriarAncilla>=1 && varClementia<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Curatio" && varEpiclesis>=1 && varCuratio<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CriarAncilla" && varEpiclesis>=1 && varCriarAncilla<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Esconjurar" && varJudex>=1 && varEsconjurar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Judex" && varAdoramus>=1 && varJudex<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CriarAncilla" && varAdoramus>=1 && varCriarAncilla<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MagnusExorcismus" && varAdoramus>=1 && varMagnusExorcismus<=01){
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
			if(nomeDaHabilidade=="ProtecaoDivina"){
				varProtecaoDivina = habilidade;
			} else if(nomeDaHabilidade=="FlageloDoMal"){
				varFlageloDoMal = habilidade;
			} else if(nomeDaHabilidade=="SignumCrucis"){
				varSignumCrucis = habilidade;
			} else if(nomeDaHabilidade=="Angelus"){
				varAngelus = habilidade;
			} else if(nomeDaHabilidade=="Bencao"){
				varBencao = habilidade;
			} else if(nomeDaHabilidade=="Curar"){
				varCurar = habilidade;
			} else if(nomeDaHabilidade=="AumentarAgilidade"){
				varAumentarAgilidade = habilidade;
			} else if(nomeDaHabilidade=="DiminuirAgilidade"){
				varDiminuirAgilidade = habilidade;
			} else if(nomeDaHabilidade=="AquaBenedicta"){
				varAquaBenedicta = habilidade;
			} else if(nomeDaHabilidade=="Teleporte"){
				varTeleporte = habilidade;
			} else if(nomeDaHabilidade=="Portal"){
				varPortal = habilidade;
			} else if(nomeDaHabilidade=="Revelacao"){
				varRevelacao = habilidade;
			} else if(nomeDaHabilidade=="EscudoSagrado"){
				varEscudoSagrado = habilidade;
			} else if(nomeDaHabilidade=="Medicar"){
				varMedicar = habilidade;
			}

			else if(nomeDaHabilidade=="AumentarRecuperacaoDeSP"){
				varAumentarRecuperacaoDeSP = habilidade;
			} else if(nomeDaHabilidade=="PericiaComMaca"){
				varPericiaComMaca = habilidade;
			} else if(nomeDaHabilidade=="ImpositioManus"){
				varImpositioManus = habilidade;
			} else if(nomeDaHabilidade=="Suffragium"){
				varSuffragium = habilidade;
			} else if(nomeDaHabilidade=="Aspersio"){
				varAspersio = habilidade;
			} else if(nomeDaHabilidade=="BenedictioSanctissimiSacramenti"){
				varBenedictioSanctissimiSacramenti = habilidade;
			} else if(nomeDaHabilidade=="Santuario"){
				varSantuario = habilidade;
			} else if(nomeDaHabilidade=="GracaDivina"){
				varGracaDivina = habilidade;
			} else if(nomeDaHabilidade=="RetardarVeneno"){
				varRetardarVeneno = habilidade;
			} else if(nomeDaHabilidade=="Ressuscitar"){
				varRessuscitar = habilidade;
			} else if(nomeDaHabilidade=="EscudoMagico"){
				varEscudoMagico = habilidade;
			} else if(nomeDaHabilidade=="KyrieEleison"){
				varKyrieEleison = habilidade;
			} else if(nomeDaHabilidade=="Magnificat"){
				varMagnificat = habilidade;
			} else if(nomeDaHabilidade=="LexDivina"){
				varLexDivina = habilidade;
			} else if(nomeDaHabilidade=="Esconjurar"){
				varEsconjurar = habilidade;
			} else if(nomeDaHabilidade=="LexAeterna"){
				varLexAeterna = habilidade;
			} else if(nomeDaHabilidade=="MagnusExorcismus"){
				varMagnusExorcismus = habilidade;
			} else if(nomeDaHabilidade=="Gloria"){
				varGloria = habilidade;
			}

			else if(nomeDaHabilidade=="Assumptio"){
				varAssumptio = habilidade;
			} else if(nomeDaHabilidade=="Basilica"){
				varBasilica = habilidade;
			} else if(nomeDaHabilidade=="Meditatio"){
				varMeditatio = habilidade;
			} else if(nomeDaHabilidade=="RiquezaDeEspirito"){
				varRiquezaDeEspirito = habilidade;
			}

			else if(nomeDaHabilidade=="SoproDivino"){
				varSoproDivino = habilidade;
			} else if(nomeDaHabilidade=="Clementia"){
				varClementia = habilidade;
			} else if(nomeDaHabilidade=="CantoCandidus"){
				varCantoCandidus = habilidade;
			} else if(nomeDaHabilidade=="Praefatio"){
				varPraefatio = habilidade;
			} else if(nomeDaHabilidade=="Renovatio"){
				varRenovatio = habilidade;
			} else if(nomeDaHabilidade=="Curatio"){
				varCuratio = habilidade;
			} else if(nomeDaHabilidade=="LaudaAgnus"){
				varLaudaAgnus = habilidade;
			} else if(nomeDaHabilidade=="LaudaRamus"){
				varLaudaRamus = habilidade;
			} else if(nomeDaHabilidade=="Silentium"){
				varSilentium = habilidade;
			} else if(nomeDaHabilidade=="Genese"){
				varGenese = habilidade;
			} else if(nomeDaHabilidade=="Oratio"){
				varOratio = habilidade;
			} else if(nomeDaHabilidade=="Sacramentum"){
				varSacramentum = habilidade;
			} else if(nomeDaHabilidade=="Expiatio"){
				varExpiatio = habilidade;
			} else if(nomeDaHabilidade=="Eucaristia"){
				varEucaristia = habilidade;
			} else if(nomeDaHabilidade=="GeminiLumen"){
				varGeminiLumen = habilidade;
			} else if(nomeDaHabilidade=="CriarAncilla"){
				varCriarAncilla = habilidade;
			} else if(nomeDaHabilidade=="Epiclesis"){
				varEpiclesis = habilidade;
			} else if(nomeDaHabilidade=="Judex"){
				varJudex = habilidade;
			} else if(nomeDaHabilidade=="Adoramus"){
				varAdoramus = habilidade;
			}

			atualizarTela();

		}

		public void atualizarTela(){
			txtProtecaoDivinaPontos.setText(varProtecaoDivina + "/10");
			txtFlageloDoMalPontos.setText(varFlageloDoMal + "/10");
			txtSignumCrucisPontos.setText(varSignumCrucis + "/10");
			txtAngelusPontos.setText(varAngelus + "/10");
			txtBencaoPontos.setText(varBencao + "/10");
			txtCurarPontos.setText(varCurar + "/10");
			txtAumentarAgilidadePontos.setText(varAumentarAgilidade + "/10");
			txtDiminuirAgilidadePontos.setText(varDiminuirAgilidade + "/10");
			txtAquaBenedictaPontos.setText(varAquaBenedicta + "/1");
			txtTeleportePontos.setText(varTeleporte + "/2");
			txtPortalPontos.setText(varPortal + "/4");
			txtRevelacaoPontos.setText(varRevelacao + "/1");
			txtEscudoSagradoPontos.setText(varEscudoSagrado + "/1");
			txtMedicarPontos.setText(varMedicar + "/1");

			txtAumentarRecuperacaoDeSPPontos.setText(varAumentarRecuperacaoDeSP + "/10");
			txtPericiaComMacaPontos.setText(varPericiaComMaca + "/10");
			txtImpositioManusPontos.setText(varImpositioManus + "/5");
			txtSuffragiumPontos.setText(varSuffragium + "/3");
			txtAspersioPontos.setText(varAspersio + "/5");
			txtBenedictioSanctissimiSacramentiPontos.setText(varBenedictioSanctissimiSacramenti + "/5");
			txtSantuarioPontos.setText(varSantuario + "/10");
			txtGracaDivinaPontos.setText(varGracaDivina + "/1");
			txtRetardarVenenoPontos.setText(varRetardarVeneno + "/4");
			txtRessuscitarPontos.setText(varRessuscitar + "/4");
			txtEscudoMagicoPontos.setText(varEscudoMagico + "/10");
			txtKyrieEleisonPontos.setText(varKyrieEleison + "/10");
			txtMagnificatPontos.setText(varMagnificat + "/5");
			txtLexDivinaPontos.setText(varLexDivina + "/10");
			txtEsconjurarPontos.setText(varEsconjurar + "/10");
			txtLexAeternaPontos.setText(varLexAeterna + "/1");
			txtMagnusExorcismusPontos.setText(varMagnusExorcismus + "/10");
			txtGloriaPontos.setText(varGloria + "/5");

			txtAssumptioPontos.setText(varAssumptio + "/5");
			txtBasilicaPontos.setText(varBasilica + "/5");
			txtMeditatioPontos.setText(varMeditatio + "/10");
			txtRiquezaDeEspiritoPontos.setText(varRiquezaDeEspirito + "/5");

			txtSoproDivinoPontos.setText(varSoproDivino + "/3");
			txtClementiaPontos.setText(varClementia + "/3");
			txtCantoCandidusPontos.setText(varCantoCandidus + "/3");
			txtPraefatioPontos.setText(varPraefatio + "/10");
			txtRenovatioPontos.setText(varRenovatio + "/1");
			txtCuratioPontos.setText(varCuratio + "/5");
			txtLaudaAgnusPontos.setText(varLaudaAgnus + "/4");
			txtLaudaRamusPontos.setText(varLaudaRamus + "/4");
			txtSilentiumPontos.setText(varSilentium + "/5");
			txtGenesePontos.setText(varGenese + "/5");
			txtOratioPontos.setText(varOratio + "/10");
			txtSacramentumPontos.setText(varSacramentum + "/5");
			txtExpiatioPontos.setText(varExpiatio + "/5");
			txtEucaristiaPontos.setText(varEucaristia + "/10");
			txtGeminiLumenPontos.setText(varGeminiLumen + "/10");
			txtCriarAncillaPontos.setText(varCriarAncilla + "/1");
			txtEpiclesisPontos.setText(varEpiclesis + "/5");
			txtJudexPontos.setText(varJudex + "/5");
			txtAdoramusPontos.setText(varAdoramus + "/10");

			txtClasse1.setText("Classe 1: " + primeiraClasse);
			txtClasse2.setText("Classe 2: " + segundaClasse);
			txtTransClasse.setText("Transclasse: " + transClasse + " (" + (segundaClasse + transClasse) + ")");
			txtClasse3.setText("Classe 3: " + terceiraClasse);

			tudoVisivel();
		}

		public void tudoVisivel(){
			layProtecaoDivina.setVisibility(View.VISIBLE);
			layFlageloDoMal.setVisibility(View.VISIBLE);
			laySignumCrucis.setVisibility(View.VISIBLE);
			layAngelus.setVisibility(View.VISIBLE);
			layBencao.setVisibility(View.VISIBLE);
			layCurar.setVisibility(View.VISIBLE);
			layAumentarAgilidade.setVisibility(View.VISIBLE);
			layDiminuirAgilidade.setVisibility(View.VISIBLE);
			layAquaBenedicta.setVisibility(View.VISIBLE);
			layTeleporte.setVisibility(View.VISIBLE);
			layPortal.setVisibility(View.VISIBLE);
			layRevelacao.setVisibility(View.VISIBLE);
			layEscudoSagrado.setVisibility(View.VISIBLE);
			layMedicar.setVisibility(View.VISIBLE);

			layAumentarRecuperacaoDeSP.setVisibility(View.VISIBLE);
			layPericiaComMaca.setVisibility(View.VISIBLE);
			layImpositioManus.setVisibility(View.VISIBLE);
			laySuffragium.setVisibility(View.VISIBLE);
			layAspersio.setVisibility(View.VISIBLE);
			layBenedictioSanctissimiSacramenti.setVisibility(View.VISIBLE);
			laySantuario.setVisibility(View.VISIBLE);
			layGracaDivina.setVisibility(View.VISIBLE);
			layRetardarVeneno.setVisibility(View.VISIBLE);
			layRessuscitar.setVisibility(View.VISIBLE);
			layEscudoMagico.setVisibility(View.VISIBLE);
			layKyrieEleison.setVisibility(View.VISIBLE);
			layMagnificat.setVisibility(View.VISIBLE);
			layLexDivina.setVisibility(View.VISIBLE);
			layEsconjurar.setVisibility(View.VISIBLE);
			layLexAeterna.setVisibility(View.VISIBLE);
			layMagnusExorcismus.setVisibility(View.VISIBLE);
			layGloria.setVisibility(View.VISIBLE);

			layAssumptio.setVisibility(View.VISIBLE);
			layBasilica.setVisibility(View.VISIBLE);
			layMeditatio.setVisibility(View.VISIBLE);
			layRiquezaDeEspirito.setVisibility(View.VISIBLE);

			laySoproDivino.setVisibility(View.VISIBLE);
			layClementia.setVisibility(View.VISIBLE);
			layCantoCandidus.setVisibility(View.VISIBLE);
			layPraefatio.setVisibility(View.VISIBLE);
			layRenovatio.setVisibility(View.VISIBLE);
			layCuratio.setVisibility(View.VISIBLE);
			layLaudaAgnus.setVisibility(View.VISIBLE);
			layLaudaRamus.setVisibility(View.VISIBLE);
			laySilentium.setVisibility(View.VISIBLE);
			layGenese.setVisibility(View.VISIBLE);
			layOratio.setVisibility(View.VISIBLE);
			laySacramentum.setVisibility(View.VISIBLE);
			layExpiatio.setVisibility(View.VISIBLE);
			layEucaristia.setVisibility(View.VISIBLE);
			layGeminiLumen.setVisibility(View.VISIBLE);
			layCriarAncilla.setVisibility(View.VISIBLE);
			layEpiclesis.setVisibility(View.VISIBLE);
			layJudex.setVisibility(View.VISIBLE);
			layAdoramus.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM arcebispo WHERE _id = ?", new String[]{String.valueOf(id)});

			if(cs.moveToFirst()){
			primeiraClasse = cs.getInt(2);
			segundaClasse = cs.getInt(3);
			transClasse = cs.getInt(4);
			terceiraClasse = cs.getInt(5);

			varProtecaoDivina = cs.getInt(6);
			varFlageloDoMal = cs.getInt(7);
			varSignumCrucis = cs.getInt(8);
			varAngelus = cs.getInt(9);
			varBencao = cs.getInt(10);
			varCurar = cs.getInt(11);
			varAumentarAgilidade = cs.getInt(12);
			varDiminuirAgilidade = cs.getInt(13);
			varAquaBenedicta = cs.getInt(14);
			varTeleporte = cs.getInt(15);
			varPortal = cs.getInt(16);
			varRevelacao = cs.getInt(17);
			varEscudoSagrado = cs.getInt(18);
			varMedicar = cs.getInt(19);

			varAumentarRecuperacaoDeSP = cs.getInt(20);
			varPericiaComMaca = cs.getInt(21);
			varImpositioManus = cs.getInt(22);
			varSuffragium = cs.getInt(23);
			varAspersio = cs.getInt(24);
			varBenedictioSanctissimiSacramenti = cs.getInt(25);
			varSantuario = cs.getInt(26);
			varGracaDivina = cs.getInt(27);
			varRetardarVeneno = cs.getInt(28);
			varRessuscitar = cs.getInt(29);
			varEscudoMagico = cs.getInt(30);
			varKyrieEleison = cs.getInt(31);
			varMagnificat = cs.getInt(32);
			varLexDivina = cs.getInt(33);
			varEsconjurar = cs.getInt(34);
			varLexAeterna = cs.getInt(35);
			varMagnusExorcismus = cs.getInt(36);
			varGloria = cs.getInt(37);

			varAssumptio = cs.getInt(38);
			varBasilica = cs.getInt(39);
			varMeditatio = cs.getInt(40);
			varRiquezaDeEspirito = cs.getInt(41);

			varSoproDivino = cs.getInt(42);
			varClementia = cs.getInt(43);
			varCantoCandidus = cs.getInt(44);
			varPraefatio = cs.getInt(45);
			varRenovatio = cs.getInt(46);
			varCuratio = cs.getInt(47);
			varLaudaAgnus = cs.getInt(48);
			varLaudaRamus = cs.getInt(49);
			varSilentium = cs.getInt(50);
			varGenese = cs.getInt(51);
			varOratio = cs.getInt(52);
			varSacramentum = cs.getInt(53);
			varExpiatio = cs.getInt(54);
			varEucaristia = cs.getInt(55);
			varGeminiLumen = cs.getInt(56);
			varCriarAncilla = cs.getInt(57);
			varEpiclesis = cs.getInt(58);
			varJudex = cs.getInt(59);
			varAdoramus = cs.getInt(60);

			skillPrimeira = cs.getInt(61);
			skillSegunda = cs.getInt(62);
			skillTrans = cs.getInt(63);
			skillTerceira = cs.getInt(64);
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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS arcebispo (");
					sqlClasse.append("_id INTEGER PRIMARY KEY, ");
					sqlClasse.append("nome VARCHAR(30), ");
					sqlClasse.append("primeira_classe INT(2), ");
					sqlClasse.append("segunda_classe INT(2), ");
					sqlClasse.append("trans_classe INT(2), ");
					sqlClasse.append("terceira_classe INT(2), ");
					sqlClasse.append("skill_protecaodivina INT(2), ");
					sqlClasse.append("skill_flagelodomal INT(2), ");
					sqlClasse.append("skill_signumcrucis INT(2), ");
					sqlClasse.append("skill_angelus INT(2), ");
					sqlClasse.append("skill_bencao INT(2), ");
					sqlClasse.append("skill_curar INT(2), ");
					sqlClasse.append("skill_aumentaragilidade INT(2), ");
					sqlClasse.append("skill_diminuiragilidade INT(2), ");
					sqlClasse.append("skill_aquabenedicta INT(2), ");
					sqlClasse.append("skill_teleporte INT(2), ");
					sqlClasse.append("skill_portal INT(2), ");
					sqlClasse.append("skill_revelacao INT(2), ");
					sqlClasse.append("skill_escudosagrado INT(2), ");
					sqlClasse.append("skill_medicar INT(2), ");
					sqlClasse.append("skill_aumentarrecuperacaodesp INT(2), ");
					sqlClasse.append("skill_periciacommaca INT(2), ");
					sqlClasse.append("skill_impositiomanus INT(2), ");
					sqlClasse.append("skill_suffragium INT(2), ");
					sqlClasse.append("skill_aspersio INT(2), ");
					sqlClasse.append("skill_benedictiosanctissimisacramenti INT(2), ");
					sqlClasse.append("skill_santuario INT(2), ");
					sqlClasse.append("skill_gracadivina INT(2), ");
					sqlClasse.append("skill_retardarveneno INT(2), ");
					sqlClasse.append("skill_ressuscitar INT(2), ");
					sqlClasse.append("skill_escudomagico INT(2), ");
					sqlClasse.append("skill_kyrieeleison INT(2), ");
					sqlClasse.append("skill_magnificat INT(2), ");
					sqlClasse.append("skill_lexdivina INT(2), ");
					sqlClasse.append("skill_esconjurar INT(2), ");
					sqlClasse.append("skill_lexaeterna INT(2), ");
					sqlClasse.append("skill_magnusexorcismus INT(2), ");
					sqlClasse.append("skill_gloria INT(2), ");
					sqlClasse.append("skill_assumptio INT(2), ");
					sqlClasse.append("skill_basilica INT(2), ");
					sqlClasse.append("skill_meditatio INT(2), ");
					sqlClasse.append("skill_riquezadeespirito INT(2), ");
					sqlClasse.append("skill_soprodivino INT(2), ");
					sqlClasse.append("skill_clementia INT(2), ");
					sqlClasse.append("skill_cantocandidus INT(2), ");
					sqlClasse.append("skill_praefatio INT(2), ");
					sqlClasse.append("skill_renovatio INT(2), ");
					sqlClasse.append("skill_curatio INT(2), ");
					sqlClasse.append("skill_laudaagnus INT(2), ");
					sqlClasse.append("skill_laudaramus INT(2), ");
					sqlClasse.append("skill_silentium INT(2), ");
					sqlClasse.append("skill_genese INT(2), ");
					sqlClasse.append("skill_oratio INT(2), ");
					sqlClasse.append("skill_sacramentum INT(2), ");
					sqlClasse.append("skill_expiatio INT(2), ");
					sqlClasse.append("skill_eucaristia INT(2), ");
					sqlClasse.append("skill_geminilumen INT(2), ");
					sqlClasse.append("skill_criarancilla INT(2), ");
					sqlClasse.append("skill_epiclesis INT(2), ");
					sqlClasse.append("skill_judex INT(2), ");
					sqlClasse.append("skill_adoramus INT(2), ");
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
					ins.put("skill_protecaodivina", varProtecaoDivina);
					ins.put("skill_flagelodomal", varFlageloDoMal);
					ins.put("skill_signumcrucis", varSignumCrucis);
					ins.put("skill_angelus", varAngelus);
					ins.put("skill_bencao", varBencao);
					ins.put("skill_curar", varCurar);
					ins.put("skill_aumentaragilidade", varAumentarAgilidade);
					ins.put("skill_diminuiragilidade", varDiminuirAgilidade);
					ins.put("skill_aquabenedicta", varAquaBenedicta);
					ins.put("skill_teleporte", varTeleporte);
					ins.put("skill_portal", varPortal);
					ins.put("skill_revelacao", varRevelacao);
					ins.put("skill_escudosagrado", varEscudoSagrado);
					ins.put("skill_medicar", varMedicar);
					ins.put("skill_aumentarrecuperacaodesp", varAumentarRecuperacaoDeSP);
					ins.put("skill_periciacommaca", varPericiaComMaca);
					ins.put("skill_impositiomanus", varImpositioManus);
					ins.put("skill_suffragium", varSuffragium);
					ins.put("skill_aspersio", varAspersio);
					ins.put("skill_benedictiosanctissimisacramenti", varBenedictioSanctissimiSacramenti);
					ins.put("skill_santuario", varSantuario);
					ins.put("skill_gracadivina", varGracaDivina);
					ins.put("skill_retardarveneno", varRetardarVeneno);
					ins.put("skill_ressuscitar", varRessuscitar);
					ins.put("skill_escudomagico", varEscudoMagico);
					ins.put("skill_kyrieeleison", varKyrieEleison);
					ins.put("skill_magnificat", varMagnificat);
					ins.put("skill_lexdivina", varLexDivina);
					ins.put("skill_esconjurar", varEsconjurar);
					ins.put("skill_lexaeterna", varLexAeterna);
					ins.put("skill_magnusexorcismus", varMagnusExorcismus);
					ins.put("skill_gloria", varGloria);
					ins.put("skill_assumptio", varAssumptio);
					ins.put("skill_basilica", varBasilica);
					ins.put("skill_meditatio", varMeditatio);
					ins.put("skill_riquezadeespirito", varRiquezaDeEspirito);
					ins.put("skill_soprodivino", varSoproDivino);
					ins.put("skill_clementia", varClementia);
					ins.put("skill_cantocandidus", varCantoCandidus);
					ins.put("skill_praefatio", varPraefatio);
					ins.put("skill_renovatio", varRenovatio);
					ins.put("skill_curatio", varCuratio);
					ins.put("skill_laudaagnus", varLaudaAgnus);
					ins.put("skill_laudaramus", varLaudaRamus);
					ins.put("skill_silentium", varSilentium);
					ins.put("skill_genese", varGenese);
					ins.put("skill_oratio", varOratio);
					ins.put("skill_sacramentum", varSacramentum);
					ins.put("skill_expiatio", varExpiatio);
					ins.put("skill_eucaristia", varEucaristia);
					ins.put("skill_geminilumen", varGeminiLumen);
					ins.put("skill_criarancilla", varCriarAncilla);
					ins.put("skill_epiclesis", varEpiclesis);
					ins.put("skill_judex", varJudex);
					ins.put("skill_adoramus", varAdoramus);
					ins.put("skill_primeira", skillPrimeira);
					ins.put("skill_segunda", skillSegunda);
					ins.put("skill_trans", skillTrans);
					ins.put("skill_terceira", skillTerceira);
					if(!novo){
						try {
							db.update("arcebispo", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("arcebispo", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from arcebispo", null);
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
						ins2.put("classe", "arcebispo");
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