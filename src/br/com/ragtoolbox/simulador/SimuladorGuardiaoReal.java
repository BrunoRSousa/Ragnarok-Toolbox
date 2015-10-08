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

public class SimuladorGuardiaoReal extends Activity {

		//Botões de interrogações
		Button btPericiaComEspadaInterrogacao,
		btPericiaComEspadaDeDuasMaosInterrogacao,
		btAumentarRecuperacaoDeHPInterrogacao,
		btGolpeFulminanteInterrogacao,
		btProvocarInterrogacao,
		btImpactoExplosivoInterrogacao,
		btVigorInterrogacao,
		btInstintoDeSobrevivenciaInterrogacao,
		btGolpeFatalInterrogacao,
		btRecuperarHPEmMovimentoInterrogacao,
		btFeInterrogacao,
		btBloqueioInterrogacao,
		btPunicaoDivinaInterrogacao,
		btEscudoBumerangueInterrogacao,
		btEscudoRefletorInterrogacao,
		btCruxDivinumInterrogacao,
		btCruxMagnunInterrogacao,
		btRedencaoInterrogacao,
		btDivinaProvidenciaInterrogacao,
		btAuraSagradaInterrogacao,
		btRapidezComLancaInterrogacao,
		btCurarInterrogacao,
		btMedicarInterrogacao,
		btPericiaComLancaInterrogacao,
		btPericiaEmMontariaInterrogacao,
		btMontariaInterrogacao,
		btFlageloDoMalInterrogacao,
		btProtecaoDivinaInterrogacao,
		btSubmissaoInterrogacao,
		btCantoDeBatalhaInterrogacao,
		btGloriaDominiInterrogacao,
		btSacrificioDoMartirInterrogacao,
		btChoqueRapidoInterrogacao,
		btReflexaoAmplificadaInterrogacao,
		btAegisDominiInterrogacao,
		btAegisInferiInterrogacao,
		btEscudoCompressorInterrogacao,
		btProtecaoDaVanguardaInterrogacao,
		btRetribuicaoDaVanguardaInterrogacao,
		btPisotearArmadilhaInterrogacao,
		btPrestigioDivinoInterrogacao,
		btDevocaoInterrogacao,
		btConsagracaoInterrogacao,
		btFormacaoRealInterrogacao,
		btToqueDoOblivioInterrogacao,
		btExcederLimiteInterrogacao,
		btDisparoPerfuranteInterrogacao,
		btTrindadeInterrogacao,
		btEspiralLunarInterrogacao,
		btLancaDoDestinoInterrogacao,
		btEstocadaPrecisaInterrogacao,
		btLuzDaCriacaoInterrogacao;
		
		//Botões de diminuir habilidades
		Button btPericiaComEspadaDiminuir,
		btPericiaComEspadaDeDuasMaosDiminuir,
		btAumentarRecuperacaoDeHPDiminuir,
		btGolpeFulminanteDiminuir,
		btProvocarDiminuir,
		btImpactoExplosivoDiminuir,
		btVigorDiminuir,
		btFeDiminuir,
		btBloqueioDiminuir,
		btPunicaoDivinaDiminuir,
		btEscudoBumerangueDiminuir,
		btEscudoRefletorDiminuir,
		btCruxDivinumDiminuir,
		btCruxMagnunDiminuir,
		btRedencaoDiminuir,
		btDivinaProvidenciaDiminuir,
		btAuraSagradaDiminuir,
		btRapidezComLancaDiminuir,
		btCurarDiminuir,
		btMedicarDiminuir,
		btPericiaComLancaDiminuir,
		btPericiaEmMontariaDiminuir,
		btMontariaDiminuir,
		btFlageloDoMalDiminuir,
		btProtecaoDivinaDiminuir,
		btCantoDeBatalhaDiminuir,
		btGloriaDominiDiminuir,
		btSacrificioDoMartirDiminuir,
		btChoqueRapidoDiminuir,
		btReflexaoAmplificadaDiminuir,
		btAegisDominiDiminuir,
		btAegisInferiDiminuir,
		btEscudoCompressorDiminuir,
		btProtecaoDaVanguardaDiminuir,
		btRetribuicaoDaVanguardaDiminuir,
		btPisotearArmadilhaDiminuir,
		btPrestigioDivinoDiminuir,
		btDevocaoDiminuir,
		btConsagracaoDiminuir,
		btFormacaoRealDiminuir,
		btToqueDoOblivioDiminuir,
		btExcederLimiteDiminuir,
		btDisparoPerfuranteDiminuir,
		btTrindadeDiminuir,
		btEspiralLunarDiminuir,
		btLancaDoDestinoDiminuir,
		btEstocadaPrecisaDiminuir,
		btLuzDaCriacaoDiminuir;
		
		//Botões de aumentar habilidades
		Button btPericiaComEspadaAumentar,
		btPericiaComEspadaDeDuasMaosAumentar,
		btAumentarRecuperacaoDeHPAumentar,
		btGolpeFulminanteAumentar,
		btProvocarAumentar,
		btImpactoExplosivoAumentar,
		btVigorAumentar,
		btFeAumentar,
		btBloqueioAumentar,
		btPunicaoDivinaAumentar,
		btEscudoBumerangueAumentar,
		btEscudoRefletorAumentar,
		btCruxDivinumAumentar,
		btCruxMagnunAumentar,
		btRedencaoAumentar,
		btDivinaProvidenciaAumentar,
		btAuraSagradaAumentar,
		btRapidezComLancaAumentar,
		btCurarAumentar,
		btMedicarAumentar,
		btPericiaComLancaAumentar,
		btPericiaEmMontariaAumentar,
		btMontariaAumentar,
		btFlageloDoMalAumentar,
		btProtecaoDivinaAumentar,
		btCantoDeBatalhaAumentar,
		btGloriaDominiAumentar,
		btSacrificioDoMartirAumentar,
		btChoqueRapidoAumentar,
		btReflexaoAmplificadaAumentar,
		btAegisDominiAumentar,
		btAegisInferiAumentar,
		btEscudoCompressorAumentar,
		btProtecaoDaVanguardaAumentar,
		btRetribuicaoDaVanguardaAumentar,
		btPisotearArmadilhaAumentar,
		btPrestigioDivinoAumentar,
		btDevocaoAumentar,
		btConsagracaoAumentar,
		btFormacaoRealAumentar,
		btToqueDoOblivioAumentar,
		btExcederLimiteAumentar,
		btDisparoPerfuranteAumentar,
		btTrindadeAumentar,
		btEspiralLunarAumentar,
		btLancaDoDestinoAumentar,
		btEstocadaPrecisaAumentar,
		btLuzDaCriacaoAumentar;
		
		//Resto dos botões
		Button btResetar, btSalvar, btSalvarIMG;
		ToggleButton tgbtSomenteHabilidadeAprendida;
		
		
		//Txt pontos da tela
		TextView txtPericiaComEspadaPontos,
		txtPericiaComEspadaDeDuasMaosPontos,
		txtAumentarRecuperacaoDeHPPontos,
		txtGolpeFulminantePontos,
		txtProvocarPontos,
		txtImpactoExplosivoPontos,
		txtVigorPontos,
		txtFePontos,
		txtBloqueioPontos,
		txtPunicaoDivinaPontos,
		txtEscudoBumeranguePontos,
		txtEscudoRefletorPontos,
		txtCruxDivinumPontos,
		txtCruxMagnunPontos,
		txtRedencaoPontos,
		txtDivinaProvidenciaPontos,
		txtAuraSagradaPontos,
		txtRapidezComLancaPontos,
		txtCurarPontos,
		txtMedicarPontos,
		txtPericiaComLancaPontos,
		txtPericiaEmMontariaPontos,
		txtMontariaPontos,
		txtFlageloDoMalPontos,
		txtProtecaoDivinaPontos,
		txtCantoDeBatalhaPontos,
		txtGloriaDominiPontos,
		txtSacrificioDoMartirPontos,
		txtChoqueRapidoPontos,
		txtReflexaoAmplificadaPontos,
		txtAegisDominiPontos,
		txtAegisInferiPontos,
		txtEscudoCompressorPontos,
		txtProtecaoDaVanguardaPontos,
		txtRetribuicaoDaVanguardaPontos,
		txtPisotearArmadilhaPontos,
		txtPrestigioDivinoPontos,
		txtDevocaoPontos,
		txtConsagracaoPontos,
		txtFormacaoRealPontos,
		txtToqueDoOblivioPontos,
		txtExcederLimitePontos,
		txtDisparoPerfurantePontos,
		txtTrindadePontos,
		txtEspiralLunarPontos,
		txtLancaDoDestinoPontos,
		txtEstocadaPrecisaPontos,
		txtLuzDaCriacaoPontos;
		
		//Txt pontos restantes
		TextView txtClasse1, txtClasse2, txtTransClasse, txtClasse3;
		
		//Layouts
		LinearLayout layPericiaComEspada,
		layPericiaComEspadaDeDuasMaos,
		layAumentarRecuperacaoDeHP,
		layGolpeFulminante,
		layProvocar,
		layImpactoExplosivo,
		layVigor,
		layFe,
		layBloqueio,
		layPunicaoDivina,
		layEscudoBumerangue,
		layEscudoRefletor,
		layCruxDivinum,
		layCruxMagnun,
		layRedencao,
		layDivinaProvidencia,
		layAuraSagrada,
		layRapidezComLanca,
		layCurar,
		layMedicar,
		layPericiaComLanca,
		layPericiaEmMontaria,
		layMontaria,
		layFlageloDoMal,
		layProtecaoDivina,
		layCantoDeBatalha,
		layGloriaDomini,
		laySacrificioDoMartir,
		layChoqueRapido,
		layReflexaoAmplificada,
		layAegisDomini,
		layAegisInferi,
		layEscudoCompressor,
		layProtecaoDaVanguarda,
		layRetribuicaoDaVanguarda,
		layPisotearArmadilha,
		layPrestigioDivino,
		layDevocao,
		layConsagracao,
		layFormacaoReal,
		layToqueDoOblivio,
		layExcederLimite,
		layDisparoPerfurante,
		layTrindade,
		layEspiralLunar,
		layLancaDoDestino,
		layEstocadaPrecisa,
		layLuzDaCriacao;
		
		//Variaveis de Skill
		int varPericiaComEspada,
		varPericiaComEspadaDeDuasMaos,
		varAumentarRecuperacaoDeHP,
		varGolpeFulminante,
		varProvocar,
		varImpactoExplosivo,
		varVigor,
		varFe,
		varBloqueio,
		varPunicaoDivina,
		varEscudoBumerangue,
		varEscudoRefletor,
		varCruxDivinum,
		varCruxMagnun,
		varRedencao,
		varDivinaProvidencia,
		varAuraSagrada,
		varRapidezComLanca,
		varCurar,
		varMedicar,
		varPericiaComLanca,
		varPericiaEmMontaria,
		varMontaria,
		varFlageloDoMal,
		varProtecaoDivina,
		varCantoDeBatalha,
		varGloriaDomini,
		varSacrificioDoMartir,
		varChoqueRapido,
		varReflexaoAmplificada,
		varAegisDomini,
		varAegisInferi,
		varEscudoCompressor,
		varProtecaoDaVanguarda,
		varRetribuicaoDaVanguarda,
		varPisotearArmadilha,
		varPrestigioDivino,
		varDevocao,
		varConsagracao,
		varFormacaoReal,
		varToqueDoOblivio,
		varExcederLimite,
		varDisparoPerfurante,
		varTrindade,
		varEspiralLunar,
		varLancaDoDestino,
		varEstocadaPrecisa,
		varLuzDaCriacao;
		
		//variavel para alteração de db
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
			setContentView(R.layout.activity_simulador_guardiao_real);
			
			Intent it = getIntent();
			
			final int id = it.getIntExtra("id", 0);
			idParaAlterar = "_id =" +id;
			
			
			//inicialização de variáveis
			varPericiaComEspada = 0;
			varPericiaComEspadaDeDuasMaos = 0;
			varAumentarRecuperacaoDeHP = 0;
			varGolpeFulminante = 0;
			varProvocar = 0;
			varImpactoExplosivo = 0;
			varVigor = 0;
			varFe = 0;
			varBloqueio = 0;
			varPunicaoDivina = 0;
			varEscudoBumerangue = 0;
			varEscudoRefletor = 0;
			varCruxDivinum = 0;
			varCruxMagnun = 0;
			varRedencao = 0;
			varDivinaProvidencia = 0;
			varAuraSagrada = 0;
			varRapidezComLanca = 0;
			varCurar = 0;
			varMedicar = 0;
			varPericiaComLanca = 0;
			varPericiaEmMontaria = 0;
			varMontaria = 0;
			varFlageloDoMal = 0;
			varProtecaoDivina = 0;
			varCantoDeBatalha = 0;
			varGloriaDomini = 0;
			varSacrificioDoMartir = 0;
			varChoqueRapido = 0;
			varReflexaoAmplificada = 0;
			varAegisDomini = 0;
			varAegisInferi = 0;
			varEscudoCompressor = 0;
			varProtecaoDaVanguarda = 0;
			varRetribuicaoDaVanguarda = 0;
			varPisotearArmadilha = 0;
			varPrestigioDivino = 0;
			varDevocao = 0;
			varConsagracao = 0;
			varFormacaoReal = 0;
			varToqueDoOblivio = 0;
			varExcederLimite = 0;
			varDisparoPerfurante = 0;
			varTrindade = 0;
			varEspiralLunar = 0;
			varLancaDoDestino = 0;
			varEstocadaPrecisa = 0;
			varLuzDaCriacao = 0;
			
			
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
			btPericiaComEspadaInterrogacao = (Button) findViewById(R.id.btPericiaComEspadaInterrogacao);
			btPericiaComEspadaDeDuasMaosInterrogacao = (Button) findViewById(R.id.btPericiaComEspadaDeDuasMaosInterrogacao);
			btAumentarRecuperacaoDeHPInterrogacao = (Button) findViewById(R.id.btAumentarRecuperacaoDeHPInterrogacao);
			btGolpeFulminanteInterrogacao = (Button) findViewById(R.id.btGolpeFulminanteInterrogacao);
			btProvocarInterrogacao = (Button) findViewById(R.id.btProvocarInterrogacao);
			btImpactoExplosivoInterrogacao = (Button) findViewById(R.id.btImpactoExplosivoInterrogacao);
			btVigorInterrogacao = (Button) findViewById(R.id.btVigorInterrogacao);
			btInstintoDeSobrevivenciaInterrogacao = (Button) findViewById(R.id.btInstintoDeSobrevivenciaInterrogacao);
			btGolpeFatalInterrogacao = (Button) findViewById(R.id.btGolpeFatalInterrogacao);
			btRecuperarHPEmMovimentoInterrogacao = (Button) findViewById(R.id.btRecuperarHPEmMovimentoInterrogacao);
			btFeInterrogacao = (Button) findViewById(R.id.btFeInterrogacao);
			btBloqueioInterrogacao = (Button) findViewById(R.id.btBloqueioInterrogacao);
			btPunicaoDivinaInterrogacao = (Button) findViewById(R.id.btPunicaoDivinaInterrogacao);
			btEscudoBumerangueInterrogacao = (Button) findViewById(R.id.btEscudoBumerangueInterrogacao);
			btEscudoRefletorInterrogacao = (Button) findViewById(R.id.btEscudoRefletorInterrogacao);
			btCruxDivinumInterrogacao = (Button) findViewById(R.id.btCruxDivinumInterrogacao);
			btCruxMagnunInterrogacao = (Button) findViewById(R.id.btCruxMagnunInterrogacao);
			btRedencaoInterrogacao = (Button) findViewById(R.id.btRedencaoInterrogacao);
			btDivinaProvidenciaInterrogacao = (Button) findViewById(R.id.btDivinaProvidenciaInterrogacao);
			btAuraSagradaInterrogacao = (Button) findViewById(R.id.btAuraSagradaInterrogacao);
			btRapidezComLancaInterrogacao = (Button) findViewById(R.id.btRapidezComLancaInterrogacao);
			btCurarInterrogacao = (Button) findViewById(R.id.btCurarInterrogacao);
			btMedicarInterrogacao = (Button) findViewById(R.id.btMedicarInterrogacao);
			btPericiaComLancaInterrogacao = (Button) findViewById(R.id.btPericiaComLancaInterrogacao);
			btPericiaEmMontariaInterrogacao = (Button) findViewById(R.id.btPericiaEmMontariaInterrogacao);
			btMontariaInterrogacao = (Button) findViewById(R.id.btMontariaInterrogacao);
			btFlageloDoMalInterrogacao = (Button) findViewById(R.id.btFlageloDoMalInterrogacao);
			btProtecaoDivinaInterrogacao = (Button) findViewById(R.id.btProtecaoDivinaInterrogacao);
			btSubmissaoInterrogacao = (Button) findViewById(R.id.btSubmissaoInterrogacao);
			btCantoDeBatalhaInterrogacao = (Button) findViewById(R.id.btCantoDeBatalhaInterrogacao);
			btGloriaDominiInterrogacao = (Button) findViewById(R.id.btGloriaDominiInterrogacao);
			btSacrificioDoMartirInterrogacao = (Button) findViewById(R.id.btSacrificioDoMartirInterrogacao);
			btChoqueRapidoInterrogacao = (Button) findViewById(R.id.btChoqueRapidoInterrogacao);
			btReflexaoAmplificadaInterrogacao = (Button) findViewById(R.id.btReflexaoAmplificadaInterrogacao);
			btAegisDominiInterrogacao = (Button) findViewById(R.id.btAegisDominiInterrogacao);
			btAegisInferiInterrogacao = (Button) findViewById(R.id.btAegisInferiInterrogacao);
			btEscudoCompressorInterrogacao = (Button) findViewById(R.id.btEscudoCompressorInterrogacao);
			btProtecaoDaVanguardaInterrogacao = (Button) findViewById(R.id.btProtecaoDaVanguardaInterrogacao);
			btRetribuicaoDaVanguardaInterrogacao = (Button) findViewById(R.id.btRetribuicaoDaVanguardaInterrogacao);
			btPisotearArmadilhaInterrogacao = (Button) findViewById(R.id.btPisotearArmadilhaInterrogacao);
			btPrestigioDivinoInterrogacao = (Button) findViewById(R.id.btPrestigioDivinoInterrogacao);
			btDevocaoInterrogacao = (Button) findViewById(R.id.btDevocaoInterrogacao);
			btConsagracaoInterrogacao = (Button) findViewById(R.id.btConsagracaoInterrogacao);
			btFormacaoRealInterrogacao = (Button) findViewById(R.id.btFormacaoRealInterrogacao);
			btToqueDoOblivioInterrogacao = (Button) findViewById(R.id.btToqueDoOblivioInterrogacao);
			btExcederLimiteInterrogacao = (Button) findViewById(R.id.btExcederLimiteInterrogacao);
			btDisparoPerfuranteInterrogacao = (Button) findViewById(R.id.btDisparoPerfuranteInterrogacao);
			btTrindadeInterrogacao = (Button) findViewById(R.id.btTrindadeInterrogacao);
			btEspiralLunarInterrogacao = (Button) findViewById(R.id.btEspiralLunarInterrogacao);
			btLancaDoDestinoInterrogacao = (Button) findViewById(R.id.btLancaDoDestinoInterrogacao);
			btEstocadaPrecisaInterrogacao = (Button) findViewById(R.id.btEstocadaPrecisaInterrogacao);
			btLuzDaCriacaoInterrogacao = (Button) findViewById(R.id.btLuzDaCriacaoInterrogacao);
			
			//Botões de diminuir habilidades
			btPericiaComEspadaDiminuir = (Button) findViewById(R.id.btPericiaComEspadaDiminuir);
			btPericiaComEspadaDeDuasMaosDiminuir = (Button) findViewById(R.id.btPericiaComEspadaDeDuasMaosDiminuir);
			btAumentarRecuperacaoDeHPDiminuir = (Button) findViewById(R.id.btAumentarRecuperacaoDeHPDiminuir);
			btGolpeFulminanteDiminuir = (Button) findViewById(R.id.btGolpeFulminanteDiminuir);
			btProvocarDiminuir = (Button) findViewById(R.id.btProvocarDiminuir);
			btImpactoExplosivoDiminuir = (Button) findViewById(R.id.btImpactoExplosivoDiminuir);
			btVigorDiminuir = (Button) findViewById(R.id.btVigorDiminuir);
			btFeDiminuir = (Button) findViewById(R.id.btFeDiminuir);
			btBloqueioDiminuir = (Button) findViewById(R.id.btBloqueioDiminuir);
			btPunicaoDivinaDiminuir = (Button) findViewById(R.id.btPunicaoDivinaDiminuir);
			btEscudoBumerangueDiminuir = (Button) findViewById(R.id.btEscudoBumerangueDiminuir);
			btEscudoRefletorDiminuir = (Button) findViewById(R.id.btEscudoRefletorDiminuir);
			btCruxDivinumDiminuir = (Button) findViewById(R.id.btCruxDivinumDiminuir);
			btCruxMagnunDiminuir = (Button) findViewById(R.id.btCruxMagnunDiminuir);
			btRedencaoDiminuir = (Button) findViewById(R.id.btRedencaoDiminuir);
			btDivinaProvidenciaDiminuir = (Button) findViewById(R.id.btDivinaProvidenciaDiminuir);
			btAuraSagradaDiminuir = (Button) findViewById(R.id.btAuraSagradaDiminuir);
			btRapidezComLancaDiminuir = (Button) findViewById(R.id.btRapidezComLancaDiminuir);
			btCurarDiminuir = (Button) findViewById(R.id.btCurarDiminuir);
			btMedicarDiminuir = (Button) findViewById(R.id.btMedicarDiminuir);
			btPericiaComLancaDiminuir = (Button) findViewById(R.id.btPericiaComLancaDiminuir);
			btPericiaEmMontariaDiminuir = (Button) findViewById(R.id.btPericiaEmMontariaDiminuir);
			btMontariaDiminuir = (Button) findViewById(R.id.btMontariaDiminuir);
			btFlageloDoMalDiminuir = (Button) findViewById(R.id.btFlageloDoMalDiminuir);
			btProtecaoDivinaDiminuir = (Button) findViewById(R.id.btProtecaoDivinaDiminuir);
			btCantoDeBatalhaDiminuir = (Button) findViewById(R.id.btCantoDeBatalhaDiminuir);
			btGloriaDominiDiminuir = (Button) findViewById(R.id.btGloriaDominiDiminuir);
			btSacrificioDoMartirDiminuir = (Button) findViewById(R.id.btSacrificioDoMartirDiminuir);
			btChoqueRapidoDiminuir = (Button) findViewById(R.id.btChoqueRapidoDiminuir);
			btReflexaoAmplificadaDiminuir = (Button) findViewById(R.id.btReflexaoAmplificadaDiminuir);
			btAegisDominiDiminuir = (Button) findViewById(R.id.btAegisDominiDiminuir);
			btAegisInferiDiminuir = (Button) findViewById(R.id.btAegisInferiDiminuir);
			btEscudoCompressorDiminuir = (Button) findViewById(R.id.btEscudoCompressorDiminuir);
			btProtecaoDaVanguardaDiminuir = (Button) findViewById(R.id.btProtecaoDaVanguardaDiminuir);
			btRetribuicaoDaVanguardaDiminuir = (Button) findViewById(R.id.btRetribuicaoDaVanguardaDiminuir);
			btPisotearArmadilhaDiminuir = (Button) findViewById(R.id.btPisotearArmadilhaDiminuir);
			btPrestigioDivinoDiminuir = (Button) findViewById(R.id.btPrestigioDivinoDiminuir);
			btDevocaoDiminuir = (Button) findViewById(R.id.btDevocaoDiminuir);
			btConsagracaoDiminuir = (Button) findViewById(R.id.btConsagracaoDiminuir);
			btFormacaoRealDiminuir = (Button) findViewById(R.id.btFormacaoRealDiminuir);
			btToqueDoOblivioDiminuir = (Button) findViewById(R.id.btToqueDoOblivioDiminuir);
			btExcederLimiteDiminuir = (Button) findViewById(R.id.btExcederLimiteDiminuir);
			btDisparoPerfuranteDiminuir = (Button) findViewById(R.id.btDisparoPerfuranteDiminuir);
			btTrindadeDiminuir = (Button) findViewById(R.id.btTrindadeDiminuir);
			btEspiralLunarDiminuir = (Button) findViewById(R.id.btEspiralLunarDiminuir);
			btLancaDoDestinoDiminuir = (Button) findViewById(R.id.btLancaDoDestinoDiminuir);
			btEstocadaPrecisaDiminuir = (Button) findViewById(R.id.btEstocadaPrecisaDiminuir);
			btLuzDaCriacaoDiminuir = (Button) findViewById(R.id.btLuzDaCriacaoDiminuir);
			
			//Botões de aumentar habilidades
			btPericiaComEspadaAumentar = (Button) findViewById(R.id.btPericiaComEspadaAumentar);
			btPericiaComEspadaDeDuasMaosAumentar= (Button) findViewById(R.id.btPericiaComEspadaDeDuasMaosAumentar);
			btAumentarRecuperacaoDeHPAumentar = (Button) findViewById(R.id.btAumentarRecuperacaoDeHPAumentar);
			btGolpeFulminanteAumentar = (Button) findViewById(R.id.btGolpeFulminanteAumentar);
			btProvocarAumentar = (Button) findViewById(R.id.btProvocarAumentar);
			btImpactoExplosivoAumentar = (Button) findViewById(R.id.btImpactoExplosivoAumentar);
			btVigorAumentar = (Button) findViewById(R.id.btVigorAumentar);
			btFeAumentar = (Button) findViewById(R.id.btFeAumentar);
			btBloqueioAumentar = (Button) findViewById(R.id.btBloqueioAumentar);
			btPunicaoDivinaAumentar = (Button) findViewById(R.id.btPunicaoDivinaAumentar);
			btEscudoBumerangueAumentar = (Button) findViewById(R.id.btEscudoBumerangueAumentar);
			btEscudoRefletorAumentar = (Button) findViewById(R.id.btEscudoRefletorAumentar);
			btCruxDivinumAumentar = (Button) findViewById(R.id.btCruxDivinumAumentar);
			btCruxMagnunAumentar = (Button) findViewById(R.id.btCruxMagnunAumentar);
			btRedencaoAumentar = (Button) findViewById(R.id.btRedencaoAumentar);
			btDivinaProvidenciaAumentar = (Button) findViewById(R.id.btDivinaProvidenciaAumentar);
			btAuraSagradaAumentar = (Button) findViewById(R.id.btAuraSagradaAumentar);
			btRapidezComLancaAumentar = (Button) findViewById(R.id.btRapidezComLancaAumentar);
			btCurarAumentar = (Button) findViewById(R.id.btCurarAumentar);
			btMedicarAumentar = (Button) findViewById(R.id.btMedicarAumentar);
			btPericiaComLancaAumentar = (Button) findViewById(R.id.btPericiaComLancaAumentar);
			btPericiaEmMontariaAumentar = (Button) findViewById(R.id.btPericiaEmMontariaAumentar);
			btMontariaAumentar = (Button) findViewById(R.id.btMontariaAumentar);
			btFlageloDoMalAumentar = (Button) findViewById(R.id.btFlageloDoMalAumentar);
			btProtecaoDivinaAumentar = (Button) findViewById(R.id.btProtecaoDivinaAumentar);
			btCantoDeBatalhaAumentar = (Button) findViewById(R.id.btCantoDeBatalhaAumentar);
			btGloriaDominiAumentar = (Button) findViewById(R.id.btGloriaDominiAumentar);
			btSacrificioDoMartirAumentar = (Button) findViewById(R.id.btSacrificioDoMartirAumentar);
			btChoqueRapidoAumentar = (Button) findViewById(R.id.btChoqueRapidoAumentar);
			btReflexaoAmplificadaAumentar = (Button) findViewById(R.id.btReflexaoAmplificadaAumentar);
			btAegisDominiAumentar = (Button) findViewById(R.id.btAegisDominiAumentar);
			btAegisInferiAumentar = (Button) findViewById(R.id.btAegisInferiAumentar);
			btEscudoCompressorAumentar = (Button) findViewById(R.id.btEscudoCompressorAumentar);
			btProtecaoDaVanguardaAumentar = (Button) findViewById(R.id.btProtecaoDaVanguardaAumentar);
			btRetribuicaoDaVanguardaAumentar = (Button) findViewById(R.id.btRetribuicaoDaVanguardaAumentar);
			btPisotearArmadilhaAumentar = (Button) findViewById(R.id.btPisotearArmadilhaAumentar);
			btPrestigioDivinoAumentar = (Button) findViewById(R.id.btPrestigioDivinoAumentar);
			btDevocaoAumentar = (Button) findViewById(R.id.btDevocaoAumentar);
			btConsagracaoAumentar = (Button) findViewById(R.id.btConsagracaoAumentar);
			btFormacaoRealAumentar = (Button) findViewById(R.id.btFormacaoRealAumentar);
			btToqueDoOblivioAumentar = (Button) findViewById(R.id.btToqueDoOblivioAumentar);
			btExcederLimiteAumentar = (Button) findViewById(R.id.btExcederLimiteAumentar);
			btDisparoPerfuranteAumentar = (Button) findViewById(R.id.btDisparoPerfuranteAumentar);
			btTrindadeAumentar = (Button) findViewById(R.id.btTrindadeAumentar);
			btEspiralLunarAumentar = (Button) findViewById(R.id.btEspiralLunarAumentar);
			btLancaDoDestinoAumentar = (Button) findViewById(R.id.btLancaDoDestinoAumentar);
			btEstocadaPrecisaAumentar = (Button) findViewById(R.id.btEstocadaPrecisaAumentar);
			btLuzDaCriacaoAumentar = (Button) findViewById(R.id.btLuzDaCriacaoAumentar);
		
			//Resto dos botões
			btResetar = (Button) findViewById(R.id.btResetar);
			btSalvar = (Button) findViewById(R.id.btSalvar);
			btSalvarIMG = (Button) findViewById(R.id.btSalvarIMG);
			tgbtSomenteHabilidadeAprendida = (ToggleButton) findViewById(R.id.tgbtSomenteHabilidadeAprendida);
			
			//Txt pontos da tela
			txtPericiaComEspadaPontos = (TextView) findViewById(R.id.txtPericiaComEspadaPontos);
			txtPericiaComEspadaDeDuasMaosPontos = (TextView) findViewById(R.id.txtPericiaComEspadaDeDuasMaosPontos);
			txtAumentarRecuperacaoDeHPPontos = (TextView) findViewById(R.id.txtAumentarRecuperacaoDeHPPontos);
			txtGolpeFulminantePontos = (TextView) findViewById(R.id.txtGolpeFulminantePontos);
			txtProvocarPontos = (TextView) findViewById(R.id.txtProvocarPontos);
			txtImpactoExplosivoPontos = (TextView) findViewById(R.id.txtImpactoPontos);
			txtVigorPontos = (TextView) findViewById(R.id.txtVigorPontos);
			txtFePontos = (TextView) findViewById(R.id.txtFePontos);
			txtBloqueioPontos = (TextView) findViewById(R.id.txtBloqueioPontos);
			txtPunicaoDivinaPontos = (TextView) findViewById(R.id.txtPunicaoDivinaPontos);
			txtEscudoBumeranguePontos = (TextView) findViewById(R.id.txtEscudoBumeranguePontos);
			txtEscudoRefletorPontos = (TextView) findViewById(R.id.txtEscudoRefletorPontos);
			txtCruxDivinumPontos = (TextView) findViewById(R.id.txtCruxDivinumPontos);
			txtCruxMagnunPontos = (TextView) findViewById(R.id.txtCruxMagnunPontos);
			txtRedencaoPontos = (TextView) findViewById(R.id.txtRedencaoPontos);
			txtDivinaProvidenciaPontos = (TextView) findViewById(R.id.txtDivinaProvidenciaPontos);
			txtAuraSagradaPontos = (TextView) findViewById(R.id.txtAuraSagradaPontos);
			txtRapidezComLancaPontos = (TextView) findViewById(R.id.txtRapidezComLancaPontos);
			txtCurarPontos = (TextView) findViewById(R.id.txtCurarPontos);
			txtMedicarPontos = (TextView) findViewById(R.id.txtMedicarPontos);
			txtPericiaComLancaPontos = (TextView) findViewById(R.id.txtPericiaComLancaPontos);
			txtPericiaEmMontariaPontos = (TextView) findViewById(R.id.txtPericiaEmMontariaPontos);
			txtMontariaPontos = (TextView) findViewById(R.id.txtMontariaPontos);
			txtFlageloDoMalPontos = (TextView) findViewById(R.id.txtFlageloDoMalPontos);
			txtProtecaoDivinaPontos = (TextView) findViewById(R.id.txtProtecaoDivinaPontos);
			txtCantoDeBatalhaPontos = (TextView) findViewById(R.id.txtCantoDeBatalhaPontos);
			txtGloriaDominiPontos = (TextView) findViewById(R.id.txtGloriaDominiPontos);
			txtSacrificioDoMartirPontos = (TextView) findViewById(R.id.txtSacrificioDoMartirPontos);
			txtChoqueRapidoPontos = (TextView) findViewById(R.id.txtChoqueRapidoPontos);
			txtReflexaoAmplificadaPontos = (TextView) findViewById(R.id.txtReflexaoAmplificadaPontos);
			txtAegisDominiPontos = (TextView) findViewById(R.id.txtAegisDominiPontos);
			txtAegisInferiPontos = (TextView) findViewById(R.id.txtAegisInferiPontos);
			txtEscudoCompressorPontos = (TextView) findViewById(R.id.txtEscudoCompressorPontos);
			txtProtecaoDaVanguardaPontos = (TextView) findViewById(R.id.txtProtecaoDaVanguardaPontos);
			txtRetribuicaoDaVanguardaPontos = (TextView) findViewById(R.id.txtRetribuicaoDaVanguardaPontos);
			txtPisotearArmadilhaPontos = (TextView) findViewById(R.id.txtPisotearArmadilhaPontos);
			txtPrestigioDivinoPontos = (TextView) findViewById(R.id.txtPrestigioDivinoPontos);
			txtDevocaoPontos = (TextView) findViewById(R.id.txtDevocaoPontos);
			txtConsagracaoPontos = (TextView) findViewById(R.id.txtConsagracaoPontos);
			txtFormacaoRealPontos = (TextView) findViewById(R.id.txtFormacaoRealPontos);
			txtToqueDoOblivioPontos = (TextView) findViewById(R.id.txtToqueDoOblivioPontos);
			txtExcederLimitePontos = (TextView) findViewById(R.id.txtExcederLimitePontos);
			txtDisparoPerfurantePontos = (TextView) findViewById(R.id.txtDisparoPerfurantePontos);
			txtTrindadePontos = (TextView) findViewById(R.id.txtTrindadePontos);
			txtEspiralLunarPontos = (TextView) findViewById(R.id.txtEspiralLunarPontos);
			txtLancaDoDestinoPontos = (TextView) findViewById(R.id.txtLancaDoDestinoPontos);
			txtEstocadaPrecisaPontos = (TextView) findViewById(R.id.txtEstocadaPrecisaPontos);
			txtLuzDaCriacaoPontos = (TextView) findViewById(R.id.txtLuzDaCriacaoPontos);
			
			//Txt pontos restantes
			txtClasse1 = (TextView) findViewById(R.id.txtClasse1);
			txtClasse2 = (TextView) findViewById(R.id.txtClasse2);
			txtTransClasse = (TextView) findViewById(R.id.txtClasseTrans);
			txtClasse3 = (TextView) findViewById(R.id.txtClasse3);
			
			//Layouts
			layPericiaComEspada = (LinearLayout) findViewById(R.id.layPericiaComEspada);
			layPericiaComEspadaDeDuasMaos = (LinearLayout) findViewById(R.id.layPericiaComEspadaDeDoasMaos);
			layAumentarRecuperacaoDeHP = (LinearLayout) findViewById(R.id.layAumentarRecuperacaoDeHP);
			layGolpeFulminante = (LinearLayout) findViewById(R.id.layGolpeFulminante);
			layProvocar = (LinearLayout) findViewById(R.id.layProvocar);
			layImpactoExplosivo = (LinearLayout) findViewById(R.id.layImpactoExplosivo);
			layVigor = (LinearLayout) findViewById(R.id.layVigor);
			layFe = (LinearLayout) findViewById(R.id.layFe);
			layBloqueio = (LinearLayout) findViewById(R.id.layBloqueio);
			layPunicaoDivina = (LinearLayout) findViewById(R.id.layPunicaoDivina);
			layEscudoBumerangue = (LinearLayout) findViewById(R.id.layEscudoBumerangue);
			layEscudoRefletor = (LinearLayout) findViewById(R.id.layEscudoRefletor);
			layCruxDivinum = (LinearLayout) findViewById(R.id.layCruxDivinum);
			layCruxMagnun = (LinearLayout) findViewById(R.id.layCruxMagnun);
			layRedencao = (LinearLayout) findViewById(R.id.layRedencao);
			layDivinaProvidencia = (LinearLayout) findViewById(R.id.layDivinaProvidencia);
			layAuraSagrada = (LinearLayout) findViewById(R.id.layAuraSagrada);
			layRapidezComLanca = (LinearLayout) findViewById(R.id.layRapidezComLanca);
			layCurar = (LinearLayout) findViewById(R.id.layCurar);
			layMedicar = (LinearLayout) findViewById(R.id.layMedicar);
			layPericiaComLanca = (LinearLayout) findViewById(R.id.layPericiaComLanca);
			layPericiaEmMontaria = (LinearLayout) findViewById(R.id.layPericiaEmMontaria);
			layMontaria = (LinearLayout) findViewById(R.id.layMontaria);
			layFlageloDoMal = (LinearLayout) findViewById(R.id.layFlageloDoMal);
			layProtecaoDivina = (LinearLayout) findViewById(R.id.layProtecaoDivina);
			layCantoDeBatalha = (LinearLayout) findViewById(R.id.layCantoDeBatalha);
			layGloriaDomini = (LinearLayout) findViewById(R.id.layGloriaDomini);
			laySacrificioDoMartir = (LinearLayout) findViewById(R.id.laySacrificioDoMartir);
			layChoqueRapido = (LinearLayout) findViewById(R.id.layChoqueRapido);
			layReflexaoAmplificada = (LinearLayout) findViewById(R.id.layReflexaoAmplificada);
			layAegisDomini = (LinearLayout) findViewById(R.id.layAegisDomini);
			layAegisInferi = (LinearLayout) findViewById(R.id.layAegisInferi);
			layEscudoCompressor = (LinearLayout) findViewById(R.id.layEscudoCompressor);
			layProtecaoDaVanguarda = (LinearLayout) findViewById(R.id.layProtecaoDaVanguarda);
			layRetribuicaoDaVanguarda = (LinearLayout) findViewById(R.id.layRetribuicaoDaVanguarda);
			layPisotearArmadilha = (LinearLayout) findViewById(R.id.layPisotearArmadilha);
			layPrestigioDivino = (LinearLayout) findViewById(R.id.layPrestigioDivino);
			layDevocao = (LinearLayout) findViewById(R.id.layDevocao);
			layConsagracao = (LinearLayout) findViewById(R.id.layConsagracao);
			layFormacaoReal = (LinearLayout) findViewById(R.id.layFormacaoReal);
			layToqueDoOblivio = (LinearLayout) findViewById(R.id.layToqueDoOblivio);
			layExcederLimite = (LinearLayout) findViewById(R.id.layExcederLimite);
			layDisparoPerfurante = (LinearLayout) findViewById(R.id.layDisparoPerfurante);
			layTrindade = (LinearLayout) findViewById(R.id.layTrindade);
			layEspiralLunar = (LinearLayout) findViewById(R.id.layEspiralLunar);
			layLancaDoDestino = (LinearLayout) findViewById(R.id.layLancaDoDestino);
			layEstocadaPrecisa = (LinearLayout) findViewById(R.id.layEstocadaPrecisa);
			layLuzDaCriacao = (LinearLayout) findViewById(R.id.layLuzDaCriacao);
			
			layPrincipal = (LinearLayout) findViewById(R.id.habilidades);
			
			if (id>0)
				recarregarBuild(id);
			
			
			
			
			//Eventos de informação		
			btPericiaComEspadaInterrogacao.setOnClickListener(new OnClickListener() {	
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Perícia com Espada");
					dialogo.setMessage(R.string.periciaComEspadaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaComEspadaDeDuasMaosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Perícia com Espada de Duas Mãos");
					dialogo.setMessage(R.string.periciaComEspadaDeDuasMaosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAumentarRecuperacaoDeHPInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Aumentar Recuperação de HP");
					dialogo.setMessage(R.string.aumentarRecuperacaoDeHPInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGolpeFulminanteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Golpe Fulminante");
					dialogo.setMessage(R.string.golpeFulminanteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btProvocarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Provocar");
					dialogo.setMessage(R.string.provocarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btImpactoExplosivoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Impacto Explosivo");
					dialogo.setMessage(R.string.impactoExplosivoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btVigorInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Vigor");
					dialogo.setMessage(R.string.vigorInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInstintoDeSobrevivenciaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Instinto de Sobrevivência");
					dialogo.setMessage(R.string.instintoDeSobrevivenciaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGolpeFatalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Golpe Fatal");
					dialogo.setMessage(R.string.golpeFatalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		btRecuperarHPEmMovimentoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Recuperar HP em movimento");
					dialogo.setMessage(R.string.recuperarHPEmMovimentoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btFeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Fé");
					dialogo.setMessage(R.string.feInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});

	 		btBloqueioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Bloqueio");
					dialogo.setMessage(R.string.bloqueioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btPunicaoDivinaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Punição Divina");
					dialogo.setMessage(R.string.punicaoDivinaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btEscudoBumerangueInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Escudo Bumerangue");
					dialogo.setMessage(R.string.escudoBumerangueInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btEscudoRefletorInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Escudo Refletor");
					dialogo.setMessage(R.string.escudoRefletorInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btCruxDivinumInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Crux Divinum");
					dialogo.setMessage(R.string.cruxDivinumInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btCruxMagnunInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Crux Magnun");
					dialogo.setMessage(R.string.cruxMagnunInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btRedencaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Redenção");
					dialogo.setMessage(R.string.redencaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btDivinaProvidenciaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Divina Providência");
					dialogo.setMessage(R.string.divinaProvidenciaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btAuraSagradaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Aura Sagrada");
					dialogo.setMessage(R.string.auraSagradaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btRapidezComLancaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Rapidez Com Lança");
					dialogo.setMessage(R.string.rapidezComLancaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btCurarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Curar");
					dialogo.setMessage(R.string.curarTemplarioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btMedicarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Medicar");
					dialogo.setMessage(R.string.medicarTemplarioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btPericiaComLancaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Perícia com Lança");
					dialogo.setMessage(R.string.periciaComLancaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btPericiaEmMontariaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Perícia em Montaria");
					dialogo.setMessage(R.string.periciaEmMontariaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btMontariaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Perícia em Montaria");
					dialogo.setMessage(R.string.montariaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btFlageloDoMalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Flagelo do Mal");
					dialogo.setMessage(R.string.flageloDoMalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btProtecaoDivinaInterrogacao.setOnClickListener(new OnClickListener() {
	 			public void onClick(View v) {
	 				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
	 				dialogo.setTitle("ProtecaoDivina");
	 				dialogo.setMessage(R.string.protecaoDivinaTemplarioInfo);
	 				dialogo.setNeutralButton("Fechar info", null);
	 				dialogo.show();
	 			}
	 		});
	 		
	 		btSubmissaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Submissão");
					dialogo.setMessage(R.string.submissaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btCantoDeBatalhaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Canto de Batalha");
					dialogo.setMessage(R.string.cantoDeBatalhaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btGloriaDominiInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Gloria Domini");
					dialogo.setMessage(R.string.gloriaDominiInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btSacrificioDoMartirInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Sacrifício do Mártir");
					dialogo.setMessage(R.string.sacrificioDoMartirInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btChoqueRapidoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Choque Rápido");
					dialogo.setMessage(R.string.choqueRapidoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btReflexaoAmplificadaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Reflexão Amplificada");
					dialogo.setMessage(R.string.reflexaoAmplificadaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btAegisDominiInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Aegis Domini");
					dialogo.setMessage(R.string.aegisDominiInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btAegisInferiInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Aegis Inferi");
					dialogo.setMessage(R.string.aegisInferiInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btEscudoCompressorInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Escudo Compressor");
					dialogo.setMessage(R.string.escudoCompressorInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btProtecaoDaVanguardaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Proteção Da Vanguarda");
					dialogo.setMessage(R.string.protecaoDaVanguardaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btRetribuicaoDaVanguardaInterrogacao.setOnClickListener(new OnClickListener() {
	 			public void onClick(View v) {
	 				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
	 				dialogo.setTitle("Retribuição Da Vanguarda");
	 				dialogo.setMessage(R.string.redistribuicaoDaVanguardaInfo);
	 				dialogo.setNeutralButton("Fechar info", null);
	 				dialogo.show();
	 			}
	 		});
	 		
	 		btPisotearArmadilhaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Pisotear Armadilha");
					dialogo.setMessage(R.string.pisotearArmadilhaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
	 		
	 		btPrestigioDivinoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Prestígio Divino");
					dialogo.setMessage(R.string.prestigioDivinoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
	 		});
	 		
	 		btDevocaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Devoção");
					dialogo.setMessage(R.string.devocaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
	 		});
	 		
	 		btConsagracaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Consagração");
					dialogo.setMessage(R.string.consagracaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
	 		});
	 		
	 		btFormacaoRealInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Formação Real");
					dialogo.setMessage(R.string.formacaoRealInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
	 		});
	 		
	 		btToqueDoOblivioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Toque do Oblívio");
					dialogo.setMessage(R.string.toqueDoOblivioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
	 		});
	 		
	 		btExcederLimiteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Exceder Limite");
					dialogo.setMessage(R.string.excederLimiteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
	 		});
	 		
	 		btDisparoPerfuranteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Disparo Perfurante");
					dialogo.setMessage(R.string.disparoPerfuranteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
	 		});
	 		
	 		btTrindadeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Trindade");
					dialogo.setMessage(R.string.trindadeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
	 		});
	 		
	 		btEspiralLunarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Espiral Lunar");
					dialogo.setMessage(R.string.espiralLunarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
	 		});
	 		
	 		btLancaDoDestinoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Lança do Destino");
					dialogo.setMessage(R.string.lancaDoDestinoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
	 		});
	 		
	 		btEstocadaPrecisaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Estocada Precisa");
					dialogo.setMessage(R.string.estocadaPrecisaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
	 		});
	 		
	 		btLuzDaCriacaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
					dialogo.setTitle("Luz da Criação");
					dialogo.setMessage(R.string.luzDaCriacaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
	 		});
	 		
			//Eventos de aumentar
	 		btPericiaComEspadaAumentar.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 1, "Aumentar");
					
				}
			});
	 		
	 		btPericiaComEspadaDeDuasMaosAumentar.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					if (varPericiaComEspada==0)
						atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 1, "Aumentar");
					
					atualizarCalculo(varPericiaComEspadaDeDuasMaos, "PericiaComEspadaDeDuasMaos", 10, 1, "Aumentar");
					
				}
			});
	 		
	 		btAumentarRecuperacaoDeHPAumentar.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					atualizarCalculo(varAumentarRecuperacaoDeHP, "AumentarRecuperacaoDeHP", 10, 1, "Aumentar");
					
				}
			});
	 		
	 		btGolpeFulminanteAumentar.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					atualizarCalculo(varGolpeFulminante, "GolpeFulminante", 10, 1, "Aumentar");
					
				}
			});
	 		
	 			btProvocarAumentar.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
					
				}
			});
	 			
	 			btImpactoExplosivoAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varGolpeFulminante<5 && count<5){
	 						atualizarCalculo(varGolpeFulminante, "GolpeFulminante", 10, 1, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					atualizarCalculo(varImpactoExplosivo, "ImpactoExplosivo", 10, 1, "Aumentar");
	 					
	 				}
	 		});
	 			
	 			btVigorAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varProvocar<5 && count<5) {
	 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
	 					
	 				}
	 		});
	 			
	 			btFeAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 					
	 				}
	 		});
	 			
	 			btBloqueioAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btPunicaoDivinaAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varBloqueio<5 && count<5) {
	 						atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varPunicaoDivina, "PunicaoDivina", 5, 2, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btEscudoBumerangueAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varBloqueio<5 && count<5) {
	 						atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varPunicaoDivina<3 && count<3) {
	 						atualizarCalculo(varPunicaoDivina, "PunicaoDivina", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varEscudoBumerangue, "EscudoBumerangue", 5, 2, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btEscudoRefletorAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varBloqueio<5 && count<5) {
	 						atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varPunicaoDivina<3 && count<3) {
	 						atualizarCalculo(varPunicaoDivina, "PunicaoDivina", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoBumerangue<3 && count<3) {
	 						atualizarCalculo(varEscudoBumerangue, "EscudoBumerangue", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varEscudoRefletor, "EscudoRefletor", 10, 2, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btCruxDivinumAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varFe<7 && count<7) {
	 						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varCruxDivinum, "CruxDivinum", 10, 2, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btCruxMagnunAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varFe<10 && count<10) {
	 						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varFe<6 && count<6) {
	 						atualizarCalculo(varCruxDivinum, "CruxDivinum", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varCruxMagnun, "CruxMagnun", 10, 2, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btRedencaoAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varFe<10 && count<10) {
	 						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varCruxDivinum<6 && count<6) {
	 						atualizarCalculo(varCruxDivinum, "CruxDivinum", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varCruxMagnun<4 && count<4) {
	 						atualizarCalculo(varCruxMagnun, "CruxMagnun", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varBloqueio<5 && count<5) {
	 						atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varPunicaoDivina<3 && count<3) {
	 						atualizarCalculo(varPunicaoDivina, "PunicaoDivina", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoBumerangue<3 && count<3) {
	 						atualizarCalculo(varEscudoBumerangue, "EscudoBumerangue", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoRefletor<5 && count<5) {
	 						atualizarCalculo(varEscudoRefletor, "EscudoRefletor", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varRedencao, "Redencao", 5, 2, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btDivinaProvidenciaAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varFe<10 && count<10) {
	 						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varMedicar<1 && count<1) {
	 						atualizarCalculo(varMedicar, "Medicar", 1, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varProtecaoDivina<5 && count<5) {
	 						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varFlageloDoMal<5 && count<5) {
	 						atualizarCalculo(varFlageloDoMal, "FlageloDoMal", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varCurar<5 && count<5) {
	 						atualizarCalculo(varCurar, "Curar", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varDivinaProvidencia, "DivinaProvidencia", 5, 2, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btAuraSagradaAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varBloqueio<5 && count<5) {
	 						atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varPunicaoDivina<3 && count<3) {
	 						atualizarCalculo(varPunicaoDivina, "PunicaoDivina", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoBumerangue<1 && count<1) {
	 						atualizarCalculo(varEscudoBumerangue, "EscudoBumerangue", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varAuraSagrada, "AuraSagrada", 5, 2, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btRapidezComLancaAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varPericiaComLanca<10 && count<10) {
	 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varRapidezComLanca, "RapidezComLanca", 10, 2, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btCurarAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varFe<10 && count<10) {
	 						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varMedicar<1 && count<1) {
	 						atualizarCalculo(varMedicar, "Medicar", 1, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varProtecaoDivina<3 && count<3) {
	 						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varFlageloDoMal<5 && count<5) {
	 						atualizarCalculo(varFlageloDoMal, "FlageloDoMal", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varCurar, "Curar", 10, 2, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btMedicarAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varFe<5 && count<5) {
	 						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varMedicar, "Medicar", 1, 2, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btPericiaComLancaAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
	 					
	 				}
	 			});
	 			

	 			btPericiaEmMontariaAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					
	 					while (varProvocar < 5 && count < 5){
	 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
	 						count++;
	 					}
	 					count=0;
	 					
	 					if (varVigor == 0)
	 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
	 					
	 					if (varMontaria == 0)
	 						atualizarCalculo(varMontaria, "Montaria", 1, 2, "Aumentar");
	 					
	 					atualizarCalculo(varPericiaEmMontaria, "PericiaEmMontaria", 5, 2, "Aumentar");
	 					
	 				}
	 		});
	 			
	 			btMontariaAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varProvocar < 5 && count < 5){
	 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
	 						count++;
	 					}
	 					count=0;
	 					
	 					if (varVigor == 0)
	 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
	 					
	 					atualizarCalculo(varMontaria, "Montaria", 1, 2, "Aumentar");
	 					
	 				}
	 		});
	 			
	 			btFlageloDoMalAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varFe<5 && count<5) {
	 						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varMedicar<1 && count<1) {
	 						atualizarCalculo(varMedicar, "Medicar", 1, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varProtecaoDivina<3 && count<3) {
	 						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varFlageloDoMal, "FlageloDoMal", 10, 2, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btProtecaoDivinaAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varFe<5 && count<5) {
	 						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varMedicar<1 && count<1) {
	 						atualizarCalculo(varMedicar, "Medicar", 1, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 2, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btCantoDeBatalhaAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varFe<8 && count<8) {
	 						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varMedicar<1 && count<1) {
	 						atualizarCalculo(varMedicar, "Medicar", 1, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varProtecaoDivina<3 && count<3) {
	 						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varFlageloDoMal<5 && count<5) {
	 						atualizarCalculo(varFlageloDoMal, "FlageloDoMal", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varCantoDeBatalha, "CantoDeBatalha", 10, 3, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btGloriaDominiAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varFe<5 && count<5) {
	 						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varProvocar < 5 && count < 5){
	 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
	 						count++;
	 					}
	 					count=0;
	 					
	 					while (varVigor < 5 && count < 5){
	 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
	 					}
	 					count=0;
	 					
	 					while (varBloqueio<5 && count<5) {
	 						atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varPunicaoDivina<2 && count<2) {
	 						atualizarCalculo(varPunicaoDivina, "PunicaoDivina", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varGloriaDomini, "GloriaDomini", 5, 3, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btSacrificioDoMartirAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					
	 					while (varProvocar < 5 && count < 5){
	 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
	 						count++;
	 					}
	 					count=0;
	 					
	 					while (varVigor < 1 && count < 1){
	 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
	 					}
	 					count=0;
	 					
	 					while (varFe<10 && count<10) {
	 						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varCruxDivinum<6 && count<6) {
	 						atualizarCalculo(varCruxDivinum, "CruxDivinum", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varCruxMagnun<4 && count<4) {
	 						atualizarCalculo(varCruxMagnun, "CruxMagnun", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varBloqueio<5 && count<5) {
	 						atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varPunicaoDivina<3 && count<3) {
	 						atualizarCalculo(varPunicaoDivina, "PunicaoDivina", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoBumerangue<3 && count<3) {
	 						atualizarCalculo(varEscudoBumerangue, "EscudoBumerangue", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoRefletor<5 && count<5) {
	 						atualizarCalculo(varEscudoRefletor, "EscudoRefletor", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varRedencao<3 && count<3){
	 						atualizarCalculo(varRedencao, "Redencao", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varSacrificioDoMartir, "SacrificioDoMartir", 5, 3, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btChoqueRapidoAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varBloqueio<5 && count<5) {
	 						atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varPunicaoDivina<3 && count<3) {
	 						atualizarCalculo(varPunicaoDivina, "PunicaoDivina", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoBumerangue<5 && count<5) {
	 						atualizarCalculo(varEscudoBumerangue, "EscudoBumerangue", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varChoqueRapido, "ChoqueRapido", 5, 3, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btReflexaoAmplificadaAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					
	 					while (varBloqueio<5 && count<5) {
	 						atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varPunicaoDivina<3 && count<3) {
	 						atualizarCalculo(varPunicaoDivina, "PunicaoDivina", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoBumerangue<3 && count<3) {
	 						atualizarCalculo(varEscudoBumerangue, "EscudoBumerangue", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoRefletor<5 && count<5) {
	 						atualizarCalculo(varEscudoRefletor, "EscudoRefletor", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varReflexaoAmplificada, "ReflexaoAmplificada", 5, 4, "Aumentar");
	 					
	 				}
	 			});
	 			
	 			btAegisDominiAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					
	 					while (varBloqueio<5 && count<5) {
	 						atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varPunicaoDivina<3 && count<3) {
	 						atualizarCalculo(varPunicaoDivina, "PunicaoDivina", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoBumerangue<3 && count<3) {
	 						atualizarCalculo(varEscudoBumerangue, "EscudoBumerangue", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoRefletor<5 && count<5) {
	 						atualizarCalculo(varEscudoRefletor, "EscudoRefletor", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varReflexaoAmplificada<3 && count<3) {
	 						atualizarCalculo(varReflexaoAmplificada, "ReflexaoAmplificada", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varAegisInferi<2 && count<2) {
	 						atualizarCalculo(varAegisInferi, "AegisInferi", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoCompressor<3 && count<3) {
	 						atualizarCalculo(varEscudoCompressor, "EscudoCompressor", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varAegisDomini, "AegisDomini", 3, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btAegisInferiAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					
	 					while (varBloqueio<5 && count<5) {
	 						atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varPunicaoDivina<3 && count<3) {
	 						atualizarCalculo(varPunicaoDivina, "PunicaoDivina", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoBumerangue<3 && count<3) {
	 						atualizarCalculo(varEscudoBumerangue, "EscudoBumerangue", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoRefletor<5 && count<5) {
	 						atualizarCalculo(varEscudoRefletor, "EscudoRefletor", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varReflexaoAmplificada<3 && count<3) {
	 						atualizarCalculo(varReflexaoAmplificada, "ReflexaoAmplificada", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varAegisInferi, "AegisInferi", 5, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btEscudoCompressorAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					
	 					while (varBloqueio<5 && count<5) {
	 						atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varPunicaoDivina<3 && count<3) {
	 						atualizarCalculo(varPunicaoDivina, "PunicaoDivina", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varEscudoCompressor, "EscudoCompressor", 5, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btProtecaoDaVanguardaAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					atualizarCalculo(varProtecaoDaVanguarda, "ProtecaoDaVanguarda", 5, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btRetribuicaoDaVanguardaAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varProtecaoDaVanguarda<1 && count<1) {
	 						atualizarCalculo(varProtecaoDaVanguarda, "ProtecaoDaVanguarda", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varRetribuicaoDaVanguarda, "RetribuicaoDaVanguarda", 1, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btPisotearArmadilhaAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					atualizarCalculo(varPisotearArmadilha, "PisotearArmadilha", 3, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btPrestigioDivinoAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varPisotearArmadilha<3 && count<3) {
	 						atualizarCalculo(varPisotearArmadilha, "PisotearArmadilha", 3, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varPrestigioDivino, "PrestigioDivino", 5, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btDevocaoAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varFe<3 && count<3) {
	 						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varDevocao, "Devocao", 5, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btConsagracaoAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varFe<10 && count<10) {
	 						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varDevocao<5 && count<5) {
	 						atualizarCalculo(varDevocao, "Devocao", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varBloqueio<5 && count<5) {
	 						atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varPunicaoDivina<3 && count<3) {
	 						atualizarCalculo(varPunicaoDivina, "PunicaoDivina", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoBumerangue<3 && count<3) {
	 						atualizarCalculo(varEscudoBumerangue, "EscudoBumerangue", 5, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoRefletor<5 && count<5) {
	 						atualizarCalculo(varEscudoRefletor, "EscudoRefletor", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varReflexaoAmplificada<3 && count<3) {
	 						atualizarCalculo(varReflexaoAmplificada, "ReflexaoAmplificada", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varAegisInferi<2 && count<2) {
	 						atualizarCalculo(varAegisInferi, "AegisInferi", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEscudoCompressor<3 && count<3) {
	 						atualizarCalculo(varEscudoCompressor, "EscudoCompressor", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varAegisDomini<3 && count<3) {
	 						atualizarCalculo(varAegisDomini, "AegisDomini", 3, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varCruxDivinum<6 && count<6) {
	 						atualizarCalculo(varCruxDivinum, "CruxDivinum", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varCruxMagnun<5 && count<5) {
	 						atualizarCalculo(varCruxMagnun, "CruxMagnun", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varLuzDaCriacao<4 && count<4) {
	 						atualizarCalculo(varLuzDaCriacao, "LuzDaCriacao", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varConsagracao, "Consagracao", 5, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btFormacaoRealAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varPericiaComLanca<1 && count<1) {
	 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varToqueDoOblivio<5 && count<5) {
	 						atualizarCalculo(varToqueDoOblivio, "ToqueDoOblivio", 10, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEstocadaPrecisa<3 && count<3) {
	 						atualizarCalculo(varEstocadaPrecisa, "EstocadaPrecisa", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varProtecaoDaVanguarda<1 && count<1) {
	 						atualizarCalculo(varProtecaoDaVanguarda, "ProtecaoDaVanguarda", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varRetribuicaoDaVanguarda<1 && count<1) {
	 						atualizarCalculo(varRetribuicaoDaVanguarda, "RetribuicaoDaVanguarda", 1, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varFormacaoReal, "FormacaoReal", 5, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btToqueDoOblivioAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varPericiaComLanca<1 && count<1) {
	 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varToqueDoOblivio, "ToqueDoOblivio", 10, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btExcederLimiteAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varPericiaComLanca<1 && count<1) {
	 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varToqueDoOblivio<3 && count<3) {
	 						atualizarCalculo(varToqueDoOblivio, "ToqueDoOblivio", 10, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varExcederLimite, "ExcederLimite", 5, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btDisparoPerfuranteAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varPericiaComLanca<1 && count<1) {
	 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varToqueDoOblivio<5 && count<5) {
	 						atualizarCalculo(varToqueDoOblivio, "ToqueDoOblivio", 10, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEstocadaPrecisa<1 && count<1) {
	 						atualizarCalculo(varEstocadaPrecisa, "EstocadaPrecisa", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varDisparoPerfurante, "DisparoPerfurante", 5, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btTrindadeAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					
	 					while (varPisotearArmadilha<3 && count<3) {
	 						atualizarCalculo(varPisotearArmadilha, "PisotearArmadilha", 3, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varPrestigioDivino<3 && count<3) {
	 						atualizarCalculo(varPrestigioDivino, "PrestigioDivino", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varPericiaComLanca<1 && count<1) {
	 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varToqueDoOblivio<5 && count<5) {
	 						atualizarCalculo(varToqueDoOblivio, "ToqueDoOblivio", 10, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEstocadaPrecisa<3 && count<3) {
	 						atualizarCalculo(varEstocadaPrecisa, "EstocadaPrecisa", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varProtecaoDaVanguarda<1 && count<1) {
	 						atualizarCalculo(varProtecaoDaVanguarda, "ProtecaoDaVanguarda", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varRetribuicaoDaVanguarda<1 && count<1) {
	 						atualizarCalculo(varRetribuicaoDaVanguarda, "RetribuicaoDaVanguarda", 1, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varFormacaoReal<3 && count<3) {
	 						atualizarCalculo(varFormacaoReal, "FormacaoReal", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varTrindade, "Trindade", 5, 4, "Aumentar");
	 				}
	 			});

	 			btEspiralLunarAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varPericiaComLanca<1 && count<1) {
	 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varEspiralLunar, "EspiralLunar", 5, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btLancaDoDestinoAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varPericiaComLanca<1 && count<1) {
	 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEspiralLunar<3 && count<3) {
	 						atualizarCalculo(varEspiralLunar, "EspiralLunar", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varToqueDoOblivio<5 && count<5) {
	 						atualizarCalculo(varToqueDoOblivio, "ToqueDoOblivio", 10, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varEstocadaPrecisa<1 && count<1) {
	 						atualizarCalculo(varEstocadaPrecisa, "EstocadaPrecisa", 5, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varLancaDoDestino, "LancaDoDestino", 5, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btEstocadaPrecisaAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varPericiaComLanca<1 && count<1) {
	 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varToqueDoOblivio<5 && count<5) {
	 						atualizarCalculo(varToqueDoOblivio, "ToqueDoOblivio", 10, 4, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varEstocadaPrecisa, "EstocadaPrecisa", 5, 4, "Aumentar");
	 				}
	 			});
	 			
	 			btLuzDaCriacaoAumentar.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					while (varFe<10 && count<10) {
	 						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varCruxDivinum<6 && count<6) {
	 						atualizarCalculo(varCruxDivinum, "CruxDivinum", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					while (varCruxMagnun<5 && count<5) {
	 						atualizarCalculo(varCruxMagnun, "CruxMagnun", 10, 2, "Aumentar");
	 						count++;
	 					}
	 					count = 0;
	 					
	 					atualizarCalculo(varLuzDaCriacao, "LuzDaCriacao", 5, 4, "Aumentar");
	 				}
	 			});
	 			
	 			
	 			//Eventos de diminuir
	 			btPericiaComEspadaDiminuir.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 1, "Diminuir");
	 					
	 				}
	 			});
	 			
	 			btPericiaComEspadaDeDuasMaosDiminuir.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					atualizarCalculo(varPericiaComEspadaDeDuasMaos, "PericiaComEspadaDeDuasMaos", 10, 1, "Diminuir");
	 					
	 				}
	 			});
	 	 		
	 	 		btAumentarRecuperacaoDeHPDiminuir.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					atualizarCalculo(varAumentarRecuperacaoDeHP, "AumentarRecuperacaoDeHP", 10, 1, "Diminuir");
	 					
	 				}
	 			});
	 	 		
	 	 		btGolpeFulminanteDiminuir.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					atualizarCalculo(varGolpeFulminante, "GolpeFulminante", 10, 1, "Diminuir");
	 					
	 				}
	 			});
	 	 		
	 	 			btProvocarDiminuir.setOnClickListener(new View.OnClickListener() {
	 				
	 				@Override
	 				public void onClick(View v) {
	 					atualizarCalculo(varProvocar, "Provocar", 10, 1, "Diminuir");
	 					
	 				}
	 			});
	 	 			
	 	 			btImpactoExplosivoDiminuir.setOnClickListener(new View.OnClickListener() {
	 	 				
	 	 				@Override
	 	 				public void onClick(View v) {
	 	 					atualizarCalculo(varImpactoExplosivo, "ImpactoExplosivo", 10, 1, "Diminuir");
	 	 					
	 	 				}
	 	 		});
	 	 			
	 	 			btVigorDiminuir.setOnClickListener(new View.OnClickListener() {
	 	 				
	 	 				@Override
	 	 				public void onClick(View v) {
	 	 					atualizarCalculo(varVigor, "Vigor", 10, 1, "Diminuir");
	 	 					
	 	 				}
	 	 		});
	 	 			
	 	 			btFeDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					atualizarCalculo(varFe, "Fe", 10, 2, "Diminuir");
		 					
		 				}
		 		});
		 			
		 			btBloqueioDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					atualizarCalculo(varBloqueio, "Bloqueio", 10, 2, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btPunicaoDivinaDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varPunicaoDivina, "PunicaoDivina", 5, 2, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btEscudoBumerangueDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {

		 					atualizarCalculo(varEscudoBumerangue, "EscudoBumerangue", 5, 2, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btEscudoRefletorDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {

		 					atualizarCalculo(varEscudoRefletor, "EscudoRefletor", 10, 2, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btCruxDivinumDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varCruxDivinum, "CruxDivinum", 10, 2, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btCruxMagnunDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varCruxMagnun, "CruxMagnun", 10, 2, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btRedencaoDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varRedencao, "Redencao", 5, 2, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btDivinaProvidenciaDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {

		 					atualizarCalculo(varDivinaProvidencia, "DivinaProvidencia", 5, 2, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btAuraSagradaDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varAuraSagrada, "AuraSagrada", 5, 2, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btRapidezComLancaDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varRapidezComLanca, "RapidezComLanca", 10, 2, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btCurarDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {

		 					atualizarCalculo(varCurar, "Curar", 10, 2, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btMedicarDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {

		 					atualizarCalculo(varMedicar, "Medicar", 1, 2, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btPericiaComLancaDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Diminuir");
		 					
		 				}
		 			});
		 			

		 			btPericiaEmMontariaDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varPericiaEmMontaria, "PericiaEmMontaria", 5, 2, "Diminuir");
		 					
		 				}
		 		});
		 			
		 			btMontariaDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varMontaria, "Montaria", 1, 2, "Diminuir");
		 					
		 				}
		 		});
		 			
		 			btFlageloDoMalDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varFlageloDoMal, "FlageloDoMal", 10, 2, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btProtecaoDivinaDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 2, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btCantoDeBatalhaDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varCantoDeBatalha, "CantoDeBatalha", 10, 3, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btGloriaDominiDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varGloriaDomini, "GloriaDomini", 5, 3, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btSacrificioDoMartirDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varSacrificioDoMartir, "SacrificioDoMartir", 5, 3, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btChoqueRapidoDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varChoqueRapido, "ChoqueRapido", 5, 3, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btReflexaoAmplificadaDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varReflexaoAmplificada, "ReflexaoAmplificada", 5, 4, "Diminuir");
		 					
		 				}
		 			});
		 			
		 			btAegisDominiDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varAegisDomini, "AegisDomini", 3, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btAegisInferiDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varAegisInferi, "AegisInferi", 5, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btEscudoCompressorDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varEscudoCompressor, "EscudoCompressor", 5, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btProtecaoDaVanguardaDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					atualizarCalculo(varProtecaoDaVanguarda, "ProtecaoDaVanguarda", 5, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btRetribuicaoDaVanguardaDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varRetribuicaoDaVanguarda, "RetribuicaoDaVanguarda", 1, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btPisotearArmadilhaDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					atualizarCalculo(varPisotearArmadilha, "PisotearArmadilha", 3, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btPrestigioDivinoDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varPrestigioDivino, "PrestigioDivino", 5, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btDevocaoDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varDevocao, "Devocao", 5, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btConsagracaoDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varConsagracao, "Consagracao", 5, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btFormacaoRealDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varFormacaoReal, "FormacaoReal", 5, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btToqueDoOblivioDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varToqueDoOblivio, "ToqueDoOblivio", 10, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btExcederLimiteDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varExcederLimite, "ExcederLimite", 5, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btDisparoPerfuranteDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varDisparoPerfurante, "DisparoPerfurante", 5, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btTrindadeDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varTrindade, "Trindade", 5, 4, "Diminuir");
		 				}
		 			});

		 			btEspiralLunarDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varEspiralLunar, "EspiralLunar", 5, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btLancaDoDestinoDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varLancaDoDestino, "LancaDoDestino", 5, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btEstocadaPrecisaDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varEstocadaPrecisa, "EstocadaPrecisa", 5, 4, "Diminuir");
		 				}
		 			});
		 			
		 			btLuzDaCriacaoDiminuir.setOnClickListener(new View.OnClickListener() {
		 				
		 				@Override
		 				public void onClick(View v) {
		 					
		 					atualizarCalculo(varLuzDaCriacao, "LuzDaCriacao", 5, 4, "Diminuir");
		 				}
		 			});
	 	 			
	 	 			
	 	 			
	 	 			//Outros Botões
	 	 			
	 	 			btResetar.setOnClickListener(new View.OnClickListener() {
	 	 				
	 	 				@Override
	 	 				public void onClick(View v) {
	 	 					varPericiaComEspada = 0;
	 	 					varPericiaComEspadaDeDuasMaos = 0;
	 	 					varAumentarRecuperacaoDeHP = 0;
	 	 					varGolpeFulminante = 0;
	 	 					varProvocar = 0;
	 	 					varImpactoExplosivo = 0;
	 	 					varVigor = 0;
	 	 					varFe = 0;
	 	 					varBloqueio = 0;
	 	 					varPunicaoDivina = 0;
	 	 					varEscudoBumerangue = 0;
	 	 					varEscudoRefletor = 0;
	 	 					varCruxDivinum = 0;
	 	 					varCruxMagnun = 0;
	 	 					varRedencao = 0;
	 	 					varDivinaProvidencia = 0;
	 	 					varAuraSagrada = 0;
	 	 					varRapidezComLanca = 0;
	 	 					varCurar = 0;
	 	 					varMedicar = 0;
	 	 					varPericiaComLanca = 0;
	 	 					varPericiaEmMontaria = 0;
	 	 					varMontaria = 0;
	 	 					varFlageloDoMal = 0;
	 	 					varProtecaoDivina = 0;
	 	 					varCantoDeBatalha = 0;
	 	 					varGloriaDomini = 0;
	 	 					varSacrificioDoMartir = 0;
	 	 					varChoqueRapido = 0;
	 	 					varReflexaoAmplificada = 0;
	 	 					varAegisDomini = 0;
	 	 					varAegisInferi = 0;
	 	 					varEscudoCompressor = 0;
	 	 					varProtecaoDaVanguarda = 0;
	 	 					varRetribuicaoDaVanguarda = 0;
	 	 					varPisotearArmadilha = 0;
	 	 					varPrestigioDivino = 0;
	 	 					varDevocao = 0;
	 	 					varConsagracao = 0;
	 	 					varFormacaoReal = 0;
	 	 					varToqueDoOblivio = 0;
	 	 					varExcederLimite = 0;
	 	 					varDisparoPerfurante = 0;
	 	 					varTrindade = 0;
	 	 					varEspiralLunar = 0;
	 	 					varLancaDoDestino = 0;
	 	 					varEstocadaPrecisa = 0;
	 	 					varLuzDaCriacao = 0;
	 	 					
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
	 	 						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
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
		 	 							AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
			 	 						msg.setTitle("Escolha um nome");
			 	 						msg.setMessage("Escolha um nome para salvar esta simulação:");
			 	 						final EditText nomeParaSalvar = new EditText(SimuladorGuardiaoReal.this);
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
	 	 					
	 	 						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
	 	 						msg.setTitle("Escolha um nome");
	 	 						msg.setMessage("Escolha um nome para salvar esta simulação:");
	 	 						final EditText nomeParaSalvar = new EditText(SimuladorGuardiaoReal.this);
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

	 						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorGuardiaoReal.this);
	 						msg.setTitle("Escolha um nome");
	 						msg.setMessage("OBS: Salvar PNG só irá salvar em forma de imagem! É recomendado que salve a build na memória do celular também.\nEscolha um nome para salvar esta simulação:");
	 						final EditText nomeParaSalvar = new EditText(SimuladorGuardiaoReal.this);
	 						msg.setView(nomeParaSalvar);
	 						msg.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {

	 								@Override
	 							public void onClick(DialogInterface dialog, int which) {
	 								if (nomeParaSalvar.getText().toString().length() <= 0) {
	 									nomeParaSalvar.setError("Preencha o campo!");
	 									Toast.makeText(getBaseContext(), "ERROR: Insira um nome!", Toast.LENGTH_SHORT).show();
	 								} else {
	 									SaveFile sf = new SaveFile();
	 									sf.takeAScreenShot(SimuladorGuardiaoReal.this, layPrincipal, nomeParaSalvar.getText().toString());
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
				if(varPericiaComEspada==0)
					layPericiaComEspada.setVisibility(View.GONE);
				if(varPericiaComEspadaDeDuasMaos==0)
					layPericiaComEspadaDeDuasMaos.setVisibility(View.GONE);
				if(varAumentarRecuperacaoDeHP==0)
					layAumentarRecuperacaoDeHP.setVisibility(View.GONE);
				if(varGolpeFulminante==0)
					layGolpeFulminante.setVisibility(View.GONE);
				if(varProvocar==0)
					layProvocar.setVisibility(View.GONE);
				if(varImpactoExplosivo==0)
					layImpactoExplosivo.setVisibility(View.GONE);
				if(varVigor==0)
					layVigor.setVisibility(View.GONE);
				
				if(varFe==0)
					layFe.setVisibility(View.GONE);
				if(varBloqueio==0)
					layBloqueio.setVisibility(View.GONE);
				if(varPunicaoDivina==0)
					layPunicaoDivina.setVisibility(View.GONE);
				if(varEscudoBumerangue==0)
					layEscudoBumerangue.setVisibility(View.GONE);
				if(varEscudoRefletor==0)
					layEscudoRefletor.setVisibility(View.GONE);
				if(varCruxDivinum==0)
					layCruxDivinum.setVisibility(View.GONE);
				if(varCruxMagnun==0)
					layCruxMagnun.setVisibility(View.GONE);
				if(varRedencao==0)
					layRedencao.setVisibility(View.GONE);
				if(varDivinaProvidencia==0)
					layDivinaProvidencia.setVisibility(View.GONE);
				if(varAuraSagrada==0)
					layAuraSagrada.setVisibility(View.GONE);
				if(varRapidezComLanca==0)
					layRapidezComLanca.setVisibility(View.GONE);
				if(varCurar==0)
					layCurar.setVisibility(View.GONE);
				if(varMedicar==0)
					layMedicar.setVisibility(View.GONE);
				if(varPericiaComLanca==0)
					layPericiaComLanca.setVisibility(View.GONE);
				if(varPericiaEmMontaria==0)
					layPericiaEmMontaria.setVisibility(View.GONE);
				if(varMontaria==0)
					layMontaria.setVisibility(View.GONE);
				if(varFlageloDoMal==0)
					layFlageloDoMal.setVisibility(View.GONE);
				if(varProtecaoDivina==0)
					layProtecaoDivina.setVisibility(View.GONE);
				
				if(varCantoDeBatalha==0)
					layCantoDeBatalha.setVisibility(View.GONE);
				if(varGloriaDomini==0)
					layGloriaDomini.setVisibility(View.GONE);
				if(varSacrificioDoMartir==0)
					laySacrificioDoMartir.setVisibility(View.GONE);
				if(varChoqueRapido==0)
					layChoqueRapido.setVisibility(View.GONE);
				
				if(varReflexaoAmplificada==0)
					layReflexaoAmplificada.setVisibility(View.GONE);
				if(varAegisDomini==0)
					layAegisDomini.setVisibility(View.GONE);
				if(varAegisInferi==0)
					layAegisInferi.setVisibility(View.GONE);
				if(varEscudoCompressor==0)
					layEscudoCompressor.setVisibility(View.GONE);
				if(varProtecaoDaVanguarda==0)
					layProtecaoDaVanguarda.setVisibility(View.GONE);
				if(varRetribuicaoDaVanguarda==0)
					layRetribuicaoDaVanguarda.setVisibility(View.GONE);
				if(varPisotearArmadilha==0)
					layPisotearArmadilha.setVisibility(View.GONE);
				if(varPrestigioDivino==0)
					layPrestigioDivino.setVisibility(View.GONE);
				if(varDevocao==0)
					layDevocao.setVisibility(View.GONE);
				if(varConsagracao==0)
					layConsagracao.setVisibility(View.GONE);
				if(varFormacaoReal==0)
					layFormacaoReal.setVisibility(View.GONE);
				if(varToqueDoOblivio==0)
					layToqueDoOblivio.setVisibility(View.GONE);
				if(varExcederLimite==0)
					layExcederLimite.setVisibility(View.GONE);
				if(varDisparoPerfurante==0)
					layDisparoPerfurante.setVisibility(View.GONE);
				if(varTrindade==0)
					layTrindade.setVisibility(View.GONE);
				if(varEspiralLunar==0)
					layEspiralLunar.setVisibility(View.GONE);
				if(varLancaDoDestino==0)
					layLancaDoDestino.setVisibility(View.GONE);
				if(varEstocadaPrecisa==0)
					layEstocadaPrecisa.setVisibility(View.GONE);
				if(varLuzDaCriacao==0)
					layLuzDaCriacao.setVisibility(View.GONE);
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
							if (terceiraClasse>0) {
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
				
				if (nomeDaHabilidade=="PericiaComEspada" && varPericiaComEspadaDeDuasMaos>=1 && varPericiaComEspada<=1){
					podeDiminuir = false;
					
				}

				if (nomeDaHabilidade=="GolpeFulminante" && varImpactoExplosivo>=1 && varGolpeFulminante<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Provocar" && varVigor>=1 && varProvocar<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Bloqueio" && varPunicaoDivina>=1 && varBloqueio>=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="PunicaoDivina" && varEscudoBumerangue>=1 && varPunicaoDivina<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="EscudoBumerangue" && varEscudoRefletor>=1 && varEscudoBumerangue<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Fe" && varCruxDivinum>=1 && varFe<=7){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Fe" && varCruxMagnun>=1 && varFe<=10){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="CruxDivinum" && varCruxMagnun>=1 && varCruxDivinum<=6){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="CruxMagnun" && varRedencao>=1 && varCruxMagnun<=4){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="EscudoRefletor" && varRedencao>=1 && varEscudoRefletor<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Curar" && varDivinaProvidencia>=1 && varCurar<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="ProtecaoDivina" && varDivinaProvidencia>=1 && varProtecaoDivina<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Bloqueio" && varAuraSagrada>=1 && varBloqueio<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="PunicaoDivina" && varAuraSagrada>=1 && varPunicaoDivina<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="EscudoBumerangue" && varAuraSagrada>=1 && varEscudoBumerangue<=1){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="PericiaComLanca" && varRapidezComLanca>=1 && varPericiaComLanca<=10){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Fe" && varCurar>=1 && varFe<=10){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="FlageloDoMal" && varCurar>=1 && varFlageloDoMal<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Fe" && varMedicar>=1 && varFe<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Montaria" && varPericiaEmMontaria>=1 && varMontaria<=1){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Vigor" && varMontaria>=1 && varVigor<=1){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="ProtecaoDivina" && varFlageloDoMal>=1 && varProtecaoDivina<=3){
					podeDiminuir = false;
					
				}
				
				
				if (nomeDaHabilidade=="Medicar" && varProtecaoDivina>=1 && varMedicar<=1){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="FlageloDoMal" && varCantoDeBatalha>=1 && varFlageloDoMal<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Fe" && varCantoDeBatalha>=1 && varFe<=8){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Fe" && varGloriaDomini>=1 && varFe<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Vigor" && varGloriaDomini>=1 && varVigor<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="PunicaoDivina" && varGloriaDomini>=1 && varPunicaoDivina<=2){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Vigor" && varSacrificioDoMartir>=1 && varVigor<=1){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Redencao" && varSacrificioDoMartir>=1 && varRedencao<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="EscudoBumerangue" && varChoqueRapido>=1 && varEscudoBumerangue<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="EscudoRefletor" && varReflexaoAmplificada>=1 && varEscudoRefletor<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="AegisInferi" && varAegisDomini>=1 && varAegisInferi<=2){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="EscudoCompressor" && varAegisDomini>=1 && varEscudoCompressor<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="ReflexaoAmplificada" && varAegisInferi>=1 && varReflexaoAmplificada<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="PunicaoDivina" && varEscudoCompressor>=1 && varPunicaoDivina<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="ProtecaoDaVanguarda" && varRetribuicaoDaVanguarda>=1 && varProtecaoDaVanguarda<=1){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="PisotearArmadilha" && varPrestigioDivino>=1 && varPisotearArmadilha<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Fe" && varDevocao>=1 && varFe<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="Devocao" && varConsagracao>=1 && varDevocao<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="AegisDomini" && varConsagracao>=1 && varAegisDomini<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="LuzDaCriacao" && varConsagracao>=1 && varLuzDaCriacao<=4){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="EstocadaPrecisa" && varFormacaoReal>=1 && varEstocadaPrecisa<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="RetribuicaoDaVanguarda" && varFormacaoReal>=1 && varRetribuicaoDaVanguarda<=1){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="PericiaComLanca" && varToqueDoOblivio>=1 && varPericiaComLanca<=1){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="ToqueDoOblivio" && varExcederLimite>=1 && varToqueDoOblivio<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="EstocadaPrecisa" && varDisparoPerfurante>=1 && varEstocadaPrecisa<=1){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="PrestigioDivino" && varTrindade>=1 && varPrestigioDivino<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="FormacaoReal" && varTrindade>=1 && varFormacaoReal<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="PericiaComLanca" && varEspiralLunar>=1 && varPericiaComLanca<=1){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="EspiralLunar" && varLancaDoDestino>=1 && varEspiralLunar<=3){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="EstocadaPrecisa" && varLancaDoDestino>=1 && varEstocadaPrecisa<=1){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="ToqueDoOblivio" && varEstocadaPrecisa>=1 && varToqueDoOblivio<=5){
					podeDiminuir = false;
					
				}
				
				if (nomeDaHabilidade=="CruxMagnun" && varLuzDaCriacao>=1 && varCruxMagnun<=5){
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
			
			
			if(nomeDaHabilidade=="PericiaComEspada"){
				varPericiaComEspada = habilidade;
			} else if (nomeDaHabilidade=="PericiaComEspadaDeDuasMaos"){
				varPericiaComEspadaDeDuasMaos = habilidade;
			} else if(nomeDaHabilidade=="AumentarRecuperacaoDeHP"){ 
				varAumentarRecuperacaoDeHP = habilidade;
			} else if (nomeDaHabilidade=="GolpeFulminante"){
				varGolpeFulminante = habilidade;
			} else if (nomeDaHabilidade=="Provocar"){
				varProvocar = habilidade;
			} else if (nomeDaHabilidade=="ImpactoExplosivo"){
				varImpactoExplosivo = habilidade;
			} else if (nomeDaHabilidade=="Vigor"){
				varVigor = habilidade;
			}
			
			else if (nomeDaHabilidade=="Fe"){
				varFe = habilidade;
			} else if (nomeDaHabilidade=="Bloqueio"){
				varBloqueio = habilidade;
			} else if (nomeDaHabilidade=="PunicaoDivina"){
				varPunicaoDivina = habilidade;
			} else if (nomeDaHabilidade=="EscudoBumerangue"){
				varEscudoBumerangue = habilidade;
			} else if (nomeDaHabilidade=="EscudoRefletor"){
				varEscudoRefletor = habilidade;
			} else if (nomeDaHabilidade=="CruxDivinum"){
				varCruxDivinum = habilidade;
			} else if (nomeDaHabilidade=="CruxMagnun"){
				varCruxMagnun = habilidade;
			} else if (nomeDaHabilidade=="Redencao"){
				varRedencao = habilidade;
			} else if (nomeDaHabilidade=="DivinaProvidencia"){
				varDivinaProvidencia = habilidade;
			} else if (nomeDaHabilidade=="AuraSagrada"){
				varAuraSagrada = habilidade;
			} else if (nomeDaHabilidade=="RapidezComLanca"){
				varRapidezComLanca = habilidade;
			} else if (nomeDaHabilidade=="Curar"){
				varCurar = habilidade;
			} else if (nomeDaHabilidade=="Medicar"){
				varMedicar = habilidade;
			} else if (nomeDaHabilidade=="PericiaComLanca"){
				varPericiaComLanca = habilidade;
			} else if (nomeDaHabilidade=="PericiaEmMontaria"){
				varPericiaEmMontaria = habilidade;
			} else if (nomeDaHabilidade=="Montaria"){
				varMontaria = habilidade;
			} else if (nomeDaHabilidade=="FlageloDoMal"){
				varFlageloDoMal = habilidade;
			} else if (nomeDaHabilidade=="ProtecaoDivina"){
				varProtecaoDivina = habilidade;
			}
			
			else if (nomeDaHabilidade=="CantoDeBatalha"){
				varCantoDeBatalha = habilidade;
			} else if (nomeDaHabilidade=="GloriaDomini"){
				varGloriaDomini = habilidade;
			} else if (nomeDaHabilidade=="SacrificioDoMartir"){
				varSacrificioDoMartir = habilidade;
			} else if (nomeDaHabilidade=="ChoqueRapido"){
				varChoqueRapido = habilidade;
			}
			
			else if (nomeDaHabilidade=="ReflexaoAmplificada"){
				varReflexaoAmplificada = habilidade;
			} else if (nomeDaHabilidade=="AegisDomini"){
				varAegisDomini = habilidade;
			} else if (nomeDaHabilidade=="AegisInferi"){
				varAegisInferi = habilidade;
			} else if (nomeDaHabilidade=="EscudoCompressor"){
				varEscudoCompressor = habilidade;
			} else if (nomeDaHabilidade=="ProtecaoDaVanguarda"){
				varProtecaoDaVanguarda = habilidade;
			} else if (nomeDaHabilidade=="RetribuicaoDaVanguarda"){
				varRetribuicaoDaVanguarda = habilidade;
			} else if (nomeDaHabilidade=="PisotearArmadilha"){
				varPisotearArmadilha = habilidade;
			} else if (nomeDaHabilidade=="PrestigioDivino"){
				varPrestigioDivino = habilidade;
			} else if (nomeDaHabilidade=="Devocao"){
 				varDevocao = habilidade;
			} else if (nomeDaHabilidade=="Consagracao"){
				varConsagracao = habilidade;
			} else if (nomeDaHabilidade=="FormacaoReal"){
				varFormacaoReal = habilidade;
			} else if (nomeDaHabilidade=="ToqueDoOblivio"){
				varToqueDoOblivio = habilidade;
			} else if (nomeDaHabilidade=="ExcederLimite"){
				varExcederLimite = habilidade;
			} else if (nomeDaHabilidade=="DisparoPerfurante"){
				varDisparoPerfurante = habilidade;
			} else if (nomeDaHabilidade=="Trindade"){
				varTrindade = habilidade;
			} else if (nomeDaHabilidade=="EspiralLunar"){
				varEspiralLunar = habilidade;
			} else if (nomeDaHabilidade=="LancaDoDestino"){
				varLancaDoDestino = habilidade;
			} else if (nomeDaHabilidade=="EstocadaPrecisa"){
				varEstocadaPrecisa = habilidade;
			} else if (nomeDaHabilidade=="LuzDaCriacao"){
				varLuzDaCriacao = habilidade;
			}
			
			atualizarTela();
			
		}
		
		public void atualizarTela(){
			txtPericiaComEspadaPontos.setText(varPericiaComEspada + "/10");
			txtPericiaComEspadaDeDuasMaosPontos.setText(varPericiaComEspadaDeDuasMaos + "/10");
			txtAumentarRecuperacaoDeHPPontos.setText(varAumentarRecuperacaoDeHP + "/10");
			txtGolpeFulminantePontos.setText(varGolpeFulminante + "/10");
			txtProvocarPontos.setText(varProvocar + "/10");
			txtImpactoExplosivoPontos.setText(varImpactoExplosivo + "/10");
			txtVigorPontos.setText(varVigor + "/10");
			
			txtFePontos.setText(varFe + "/10");
			txtBloqueioPontos.setText(varBloqueio + "/10");
			txtPunicaoDivinaPontos.setText(varPunicaoDivina + "/5");
			txtEscudoBumeranguePontos.setText(varEscudoBumerangue + "/5");
			txtEscudoRefletorPontos.setText(varEscudoRefletor + "/10");
			txtCruxDivinumPontos.setText(varCruxDivinum + "/10");
			txtCruxMagnunPontos.setText(varCruxMagnun + "/10");
			txtRedencaoPontos.setText(varRedencao + "/5");
			txtDivinaProvidenciaPontos.setText(varDivinaProvidencia + "/5");
			txtAuraSagradaPontos.setText(varAuraSagrada + "/5");
			txtRapidezComLancaPontos.setText(varRapidezComLanca + "/10");
			txtCurarPontos.setText(varCurar + "/10");
			txtMedicarPontos.setText(varMedicar + "/1");
			txtPericiaComLancaPontos.setText(varPericiaComLanca + "/10");
			txtPericiaEmMontariaPontos.setText(varPericiaEmMontaria + "/5");
			txtMontariaPontos.setText(varMontaria + "/1");
			txtFlageloDoMalPontos.setText(varFlageloDoMal + "/10");
			txtProtecaoDivinaPontos.setText(varProtecaoDivina + "/10");
			
			txtCantoDeBatalhaPontos.setText(varCantoDeBatalha + "/10");
			txtGloriaDominiPontos.setText(varGloriaDomini + "/5");
			txtSacrificioDoMartirPontos.setText(varSacrificioDoMartir + "/5");
			txtChoqueRapidoPontos.setText(varChoqueRapido + "/5");
			
			txtReflexaoAmplificadaPontos.setText(varReflexaoAmplificada + "/5");
			txtAegisDominiPontos.setText(varAegisDomini + "/3");
			txtAegisInferiPontos.setText(varAegisInferi + "/5");
			txtEscudoCompressorPontos.setText(varEscudoCompressor + "/5");
			txtProtecaoDaVanguardaPontos.setText(varProtecaoDaVanguarda + "/5");
			txtRetribuicaoDaVanguardaPontos.setText(varRetribuicaoDaVanguarda + "/1");
			txtPisotearArmadilhaPontos.setText(varPisotearArmadilha + "/3");
			txtPrestigioDivinoPontos.setText(varPrestigioDivino + "/5");
			txtDevocaoPontos.setText(varDevocao + "/5");
			txtConsagracaoPontos.setText(varConsagracao + "/5");
			txtFormacaoRealPontos.setText(varFormacaoReal + "/5");
			txtToqueDoOblivioPontos.setText(varToqueDoOblivio + "/10");
			txtExcederLimitePontos.setText(varExcederLimite + "/5");
			txtDisparoPerfurantePontos.setText(varDisparoPerfurante + "/5");
			txtTrindadePontos.setText(varTrindade + "/5");
			txtEspiralLunarPontos.setText(varEspiralLunar + "/5");
			txtLancaDoDestinoPontos.setText(varLancaDoDestino + "/5");
			txtEstocadaPrecisaPontos.setText(varEstocadaPrecisa + "/5");
			txtLuzDaCriacaoPontos.setText(varLuzDaCriacao + "/5");
			
			txtClasse1.setText("Classe 1: " + primeiraClasse);
			txtClasse2.setText("Classe 2: " + segundaClasse);
			txtTransClasse.setText("Transclasse: " + transClasse + " (" + (segundaClasse + transClasse) + ")");
			txtClasse3.setText("Classe 3: " + terceiraClasse);
			
			tudoVisivel();
		}

		public void tudoVisivel(){
			layPericiaComEspada.setVisibility(View.VISIBLE);
			layPericiaComEspadaDeDuasMaos.setVisibility(View.VISIBLE);
			layAumentarRecuperacaoDeHP.setVisibility(View.VISIBLE);
			layGolpeFulminante.setVisibility(View.VISIBLE);
			layProvocar.setVisibility(View.VISIBLE);
			layImpactoExplosivo.setVisibility(View.VISIBLE);
			layVigor.setVisibility(View.VISIBLE);

			layFe.setVisibility(View.VISIBLE);
			layBloqueio.setVisibility(View.VISIBLE);
			layPunicaoDivina.setVisibility(View.VISIBLE);
			layEscudoBumerangue.setVisibility(View.VISIBLE);
			layEscudoRefletor.setVisibility(View.VISIBLE);
			layCruxDivinum.setVisibility(View.VISIBLE);
			layCruxMagnun.setVisibility(View.VISIBLE);
			layRedencao.setVisibility(View.VISIBLE);
			layDivinaProvidencia.setVisibility(View.VISIBLE);
			layAuraSagrada.setVisibility(View.VISIBLE);
			layRapidezComLanca.setVisibility(View.VISIBLE);
			layCurar.setVisibility(View.VISIBLE);
			layMedicar.setVisibility(View.VISIBLE);
			layPericiaComLanca.setVisibility(View.VISIBLE);
			layPericiaEmMontaria.setVisibility(View.VISIBLE);
			layMontaria.setVisibility(View.VISIBLE);
			layFlageloDoMal.setVisibility(View.VISIBLE);
			layProtecaoDivina.setVisibility(View.VISIBLE);
			
			layCantoDeBatalha.setVisibility(View.VISIBLE);
			layGloriaDomini.setVisibility(View.VISIBLE);
			laySacrificioDoMartir.setVisibility(View.VISIBLE);
			layChoqueRapido.setVisibility(View.VISIBLE);
			
			layReflexaoAmplificada.setVisibility(View.VISIBLE);
			layAegisDomini.setVisibility(View.VISIBLE);
			layAegisInferi.setVisibility(View.VISIBLE);
			layEscudoCompressor.setVisibility(View.VISIBLE);
			layProtecaoDaVanguarda.setVisibility(View.VISIBLE);
			layRetribuicaoDaVanguarda.setVisibility(View.VISIBLE);
			layPisotearArmadilha.setVisibility(View.VISIBLE);
			layPrestigioDivino.setVisibility(View.VISIBLE);
			layDevocao.setVisibility(View.VISIBLE);
			layConsagracao.setVisibility(View.VISIBLE);
			layFormacaoReal.setVisibility(View.VISIBLE);
			layToqueDoOblivio.setVisibility(View.VISIBLE);
			layExcederLimite.setVisibility(View.VISIBLE);
			layDisparoPerfurante.setVisibility(View.VISIBLE);
			layTrindade.setVisibility(View.VISIBLE);
			layEspiralLunar.setVisibility(View.VISIBLE);
			layLancaDoDestino.setVisibility(View.VISIBLE);
			layEstocadaPrecisa.setVisibility(View.VISIBLE);
			layLuzDaCriacao.setVisibility(View.VISIBLE);
			
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}
		
		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM guardiao_real WHERE _id = ?", new String[]{String.valueOf(id)});
			
			if(cs.moveToFirst()){
			primeiraClasse = cs.getInt(2);
			segundaClasse = cs.getInt(3);
			transClasse = cs.getInt(4);
			terceiraClasse = cs.getInt(5);

			varPericiaComEspada = cs.getInt(6);
			varPericiaComEspadaDeDuasMaos = cs.getInt(7);
			varAumentarRecuperacaoDeHP = cs.getInt(8);
			varGolpeFulminante = cs.getInt(9);
			varProvocar = cs.getInt(10);
			varImpactoExplosivo = cs.getInt(11);
			varVigor = cs.getInt(12);
			varFe = cs.getInt(13);
			varBloqueio = cs.getInt(14);
			varPunicaoDivina = cs.getInt(15);
			varEscudoBumerangue = cs.getInt(16);
			varEscudoRefletor = cs.getInt(17);
			varCruxDivinum = cs.getInt(18);
			varCruxMagnun = cs.getInt(19);
			varRedencao = cs.getInt(20);
			varDivinaProvidencia = cs.getInt(21);
			varAuraSagrada = cs.getInt(22);
			varRapidezComLanca = cs.getInt(23);
			varCurar = cs.getInt(24);
			varMedicar = cs.getInt(25);
			varPericiaComLanca = cs.getInt(26);
			varPericiaEmMontaria = cs.getInt(27);
			varMontaria = cs.getInt(28);
			varFlageloDoMal = cs.getInt(29);
			varProtecaoDivina = cs.getInt(30);
			varCantoDeBatalha = cs.getInt(31);
			varGloriaDomini = cs.getInt(32);
			varSacrificioDoMartir = cs.getInt(33);
			varChoqueRapido = cs.getInt(34);
			varReflexaoAmplificada = cs.getInt(35);
			varAegisDomini = cs.getInt(36);
			varAegisInferi = cs.getInt(37);
			varEscudoCompressor = cs.getInt(38);
			varProtecaoDaVanguarda = cs.getInt(39);
			varRetribuicaoDaVanguarda = cs.getInt(40);
			varPisotearArmadilha = cs.getInt(41);
			varPrestigioDivino = cs.getInt(42);
			varDevocao = cs.getInt(43);
			varConsagracao = cs.getInt(44);
			varFormacaoReal = cs.getInt(45);
			varToqueDoOblivio = cs.getInt(46);
			varExcederLimite = cs.getInt(47);
			varDisparoPerfurante = cs.getInt(48);
			varTrindade = cs.getInt(49);
			varEspiralLunar = cs.getInt(50);
			varLancaDoDestino = cs.getInt(51);
			varEstocadaPrecisa = cs.getInt(52);
			varLuzDaCriacao = cs.getInt(53);
			
			skillPrimeira = cs.getInt(54);
			skillSegunda = cs.getInt(55);
			skillTrans = cs.getInt(56);
			skillTerceira = cs.getInt(57);
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
				sqlClasse.append("CREATE TABLE IF NOT EXISTS guardiao_real (");
				sqlClasse.append("_id INTEGER PRIMARY KEY, ");
				sqlClasse.append("nome VARCHAR(30), ");
				sqlClasse.append("primeira_classe INT(2), ");
				sqlClasse.append("segunda_classe INT(2), ");
				sqlClasse.append("trans_classe INT(2), ");
				sqlClasse.append("terceira_classe INT(2), ");
				sqlClasse.append("skill_periciacomespada INT(2), ");
				sqlClasse.append("skill_periciacomespadadeduasmaos INT(2), ");
				sqlClasse.append("skill_aumentarrecuperacaodehp INT(2), ");
				sqlClasse.append("skill_golpefulminante INT(2), ");
				sqlClasse.append("skill_provocar INT(2), ");
				sqlClasse.append("skill_impactoexplosivo INT(2), ");
				sqlClasse.append("skill_vigor INT(2), ");
				sqlClasse.append("skill_fe INT(2), ");
				sqlClasse.append("skill_bloqueio INT(2), ");
				sqlClasse.append("skill_punicaodivina INT(2), ");
				sqlClasse.append("skill_escudobumerangue INT(2), ");
				sqlClasse.append("skill_escudorefletor INT(2), ");
				sqlClasse.append("skill_cruxdivinum INT(2), ");
				sqlClasse.append("skill_cruxmagnun INT(2), ");
				sqlClasse.append("skill_redencao INT(2), ");
				sqlClasse.append("skill_divinaprovidencia INT(2), ");
				sqlClasse.append("skill_aurasagrada INT(2), ");
				sqlClasse.append("skill_rapidezcomlanca INT(2), ");
				sqlClasse.append("skill_curar INT(2), ");
				sqlClasse.append("skill_medicar INT(2), ");
				sqlClasse.append("skill_periciacomlanca INT(2), ");
				sqlClasse.append("skill_periciaemmontaria INT(2), ");
				sqlClasse.append("skill_montaria INT(2), ");
				sqlClasse.append("skill_flagelodomal INT(2), ");
				sqlClasse.append("skill_protecaodivina INT(2), ");
				sqlClasse.append("skill_cantodebatalha INT(2), ");
				sqlClasse.append("skill_gloriadomini INT(2), ");
				sqlClasse.append("skill_sacrificiodomartir INT(2), ");
				sqlClasse.append("skill_choquerapido INT(2), ");
				sqlClasse.append("skill_reflexaoamplificada INT(2), ");
				sqlClasse.append("skill_aegisdomini INT(2), ");
				sqlClasse.append("skill_aegisinferi INT(2), ");
				sqlClasse.append("skill_escudocompressor INT(2), ");
				sqlClasse.append("skill_protecaodavanguarda INT(2), ");
				sqlClasse.append("skill_retribuicaodavanguarda INT(2), ");
				sqlClasse.append("skill_pisoteararmadilha INT(2), ");
				sqlClasse.append("skill_prestigiodivino INT(2), ");
				sqlClasse.append("skill_devocao INT(2), ");
				sqlClasse.append("skill_consagracao INT(2), ");
				sqlClasse.append("skill_formacaoreal INT(2), ");
				sqlClasse.append("skill_toquedooblivio INT(2), ");
				sqlClasse.append("skill_excederlimite INT(2), ");
				sqlClasse.append("skill_disparoperfurante INT(2), ");
				sqlClasse.append("skill_trindade INT(2), ");
				sqlClasse.append("skill_espirallunar INT(2), ");
				sqlClasse.append("skill_lancadodestino INT(2), ");
				sqlClasse.append("skill_estocadaprecisa INT(2), ");
				sqlClasse.append("skill_luzdacriacao INT(2), ");
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
				ins.put("skill_periciacomespada", varPericiaComEspada);
				ins.put("skill_periciacomespadadeduasmaos", varPericiaComEspadaDeDuasMaos);
				ins.put("skill_aumentarrecuperacaodehp", varAumentarRecuperacaoDeHP);
				ins.put("skill_golpefulminante", varGolpeFulminante);
				ins.put("skill_provocar", varProvocar);
				ins.put("skill_impactoexplosivo", varImpactoExplosivo);
				ins.put("skill_vigor", varVigor);
				ins.put("skill_fe", varFe);
				ins.put("skill_bloqueio", varBloqueio);
				ins.put("skill_punicaodivina", varPunicaoDivina);
				ins.put("skill_escudobumerangue", varEscudoBumerangue);
				ins.put("skill_escudorefletor", varEscudoRefletor);
				ins.put("skill_cruxdivinum", varCruxDivinum);
				ins.put("skill_cruxmagnun", varCruxMagnun);
				ins.put("skill_redencao", varRedencao);
				ins.put("skill_divinaprovidencia", varDivinaProvidencia);
				ins.put("skill_aurasagrada", varAuraSagrada);
				ins.put("skill_rapidezcomlanca", varRapidezComLanca);
				ins.put("skill_curar", varCurar);
				ins.put("skill_medicar", varMedicar);
				ins.put("skill_periciacomlanca", varPericiaComLanca);
				ins.put("skill_periciaemmontaria", varPericiaEmMontaria);
				ins.put("skill_montaria", varMontaria);
				ins.put("skill_flagelodomal", varFlageloDoMal);
				ins.put("skill_protecaodivina", varProtecaoDivina);
				ins.put("skill_cantodebatalha", varCantoDeBatalha);
				ins.put("skill_gloriadomini", varGloriaDomini);
				ins.put("skill_sacrificiodomartir", varSacrificioDoMartir);
				ins.put("skill_choquerapido", varChoqueRapido);
				ins.put("skill_reflexaoamplificada", varReflexaoAmplificada);
				ins.put("skill_aegisdomini", varAegisDomini);
				ins.put("skill_aegisinferi", varAegisInferi);
				ins.put("skill_escudocompressor", varEscudoCompressor);
				ins.put("skill_protecaodavanguarda", varProtecaoDaVanguarda);
				ins.put("skill_retribuicaodavanguarda", varRetribuicaoDaVanguarda);
				ins.put("skill_pisoteararmadilha", varPisotearArmadilha);
				ins.put("skill_prestigiodivino", varPrestigioDivino);
				ins.put("skill_devocao", varDevocao);
				ins.put("skill_consagracao", varConsagracao);
				ins.put("skill_formacaoreal", varFormacaoReal);
				ins.put("skill_toquedooblivio", varToqueDoOblivio);
				ins.put("skill_excederlimite", varExcederLimite);
				ins.put("skill_disparoperfurante", varDisparoPerfurante);
				ins.put("skill_trindade", varTrindade);
				ins.put("skill_espirallunar", varEspiralLunar);
				ins.put("skill_lancadodestino", varLancaDoDestino);
				ins.put("skill_estocadaprecisa", varEstocadaPrecisa);
				ins.put("skill_luzdacriacao", varLuzDaCriacao);
				ins.put("skill_primeira", skillPrimeira);
				ins.put("skill_segunda", skillSegunda);
				ins.put("skill_trans", skillTrans);
				ins.put("skill_terceira", skillTerceira);
				if(!novo){
					try {
						db.update("guardiao_real", ins, idParaAlterar, null);
						Toast.makeText(getBaseContext(), "Alterações salvas!",
								Toast.LENGTH_SHORT).show();
					} catch (Exception e) {
						Toast.makeText(getBaseContext(), "Erro ao salvar!",
								Toast.LENGTH_SHORT).show();
					}
				} else {
				if (db.insert("guardiao_real", "_id", ins) > 0) {
					Toast.makeText(getBaseContext(), "Salvando...",
							Toast.LENGTH_SHORT).show();
					
					Cursor cs = db.rawQuery("SELECT * from guardiao_real", null);
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
					ins2.put("classe", "guardiao real");
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
