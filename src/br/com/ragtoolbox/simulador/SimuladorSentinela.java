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

public class SimuladorSentinela extends Activity {

		//Botões de interrogação
		Button btRajadaDeFlechasInterrogacao,
		btChuvaDeFlechasInterrogacao,
		btOlhosDeAguiaInterrogacao,
		btPrecisaoInterrogacao,
		btConcentracaoInterrogacao,
		btFabricarFlechasInterrogacao,
		btDisparoViolentoInterrogacao,
		btArmadilhaEscorregadiaInterrogacao,
		btArmadilhaAtordoanteInterrogacao,
		btInstalarArmadilhaInterrogacao,
		btArmadilhaLuminosaInterrogacao,
		btArmadilhaExtenuanteInterrogacao,
		btArmadilhaSoniferaInterrogacao,
		btArmadilhaCongelanteInterrogacao,
		btInstalarMinaInterrogacao,
		btArmadilhaExplosivaInterrogacao,
		btRemoverArmadilhaInterrogacao,
		btFlageloDasFerasInterrogacao,
		btAdestrarFalcaoInterrogacao,
		btAtaqueAereoInterrogacao,
		btGarrasDeAcoInterrogacao,
		btAlertaInterrogacao,
		btDesativarArmadilhaInterrogacao,
		btMensagemSecretaInterrogacao,
		btFlechaFantasmaInterrogacao,
		btAtaqueDaFeraInterrogacao,
		btAssaltoDoFalcaoInterrogacao,
		btTiroPrecisoInterrogacao,
		btCaminhoDoVentoInterrogacao,
		btVisaoRealInterrogacao,
		btTaticasDeSobrevivenciaInterrogacao,
		btCamuflagemInterrogacao,
		btDisparoCerteiroInterrogacao,
		btTempestadeDeFlechasInterrogacao,
		btDisparoSelvagemInterrogacao,
		btPericiaComArmadilhaInterrogacao,
		btDetonadorInterrogacao,
		btBombaRelogioInterrogacao,
		btArmadilhaEnergizadaInterrogacao,
		btArmadilhaIncendiariaInterrogacao,
		btArmadilhaGlacialInterrogacao,
		btArmadilhaEscarlateInterrogacao,
		btArmadilhaOcreInterrogacao,
		btArmadilhaEsmeraldaInterrogacao,
		btArmadilhaCobaltoInterrogacao,
		btAdestrarWorgInterrogacao,
		btMontariaEmWorgInterrogacao,
		btPresasAfiadasInterrogacao,
		btFaroAgucadoInterrogacao,
		btAssaltoDeWorgInterrogacao,
		btMordidaFerozInterrogacao,
		btInvestidaDeWorgInterrogacao;

		//Botões de diminuir habilidades
		Button btRajadaDeFlechasDiminuir,
		btChuvaDeFlechasDiminuir,
		btOlhosDeAguiaDiminuir,
		btPrecisaoDiminuir,
		btConcentracaoDiminuir,
		btArmadilhaEscorregadiaDiminuir,
		btArmadilhaAtordoanteDiminuir,
		btInstalarArmadilhaDiminuir,
		btArmadilhaLuminosaDiminuir,
		btArmadilhaExtenuanteDiminuir,
		btArmadilhaSoniferaDiminuir,
		btArmadilhaCongelanteDiminuir,
		btInstalarMinaDiminuir,
		btArmadilhaExplosivaDiminuir,
		btRemoverArmadilhaDiminuir,
		btFlageloDasFerasDiminuir,
		btAdestrarFalcaoDiminuir,
		btAtaqueAereoDiminuir,
		btGarrasDeAcoDiminuir,
		btAlertaDiminuir,
		btDesativarArmadilhaDiminuir,
		btMensagemSecretaDiminuir,
		btAssaltoDoFalcaoDiminuir,
		btTiroPrecisoDiminuir,
		btCaminhoDoVentoDiminuir,
		btVisaoRealDiminuir,
		btTaticasDeSobrevivenciaDiminuir,
		btCamuflagemDiminuir,
		btDisparoCerteiroDiminuir,
		btTempestadeDeFlechasDiminuir,
		btDisparoSelvagemDiminuir,
		btPericiaComArmadilhaDiminuir,
		btDetonadorDiminuir,
		btBombaRelogioDiminuir,
		btArmadilhaEnergizadaDiminuir,
		btArmadilhaIncendiariaDiminuir,
		btArmadilhaGlacialDiminuir,
		btArmadilhaEscarlateDiminuir,
		btArmadilhaOcreDiminuir,
		btArmadilhaEsmeraldaDiminuir,
		btArmadilhaCobaltoDiminuir,
		btAdestrarWorgDiminuir,
		btMontariaEmWorgDiminuir,
		btPresasAfiadasDiminuir,
		btFaroAgucadoDiminuir,
		btAssaltoDeWorgDiminuir,
		btMordidaFerozDiminuir,
		btInvestidaDeWorgDiminuir;

		//Botões de aumentar habilidades
		Button btRajadaDeFlechasAumentar,
		btChuvaDeFlechasAumentar,
		btOlhosDeAguiaAumentar,
		btPrecisaoAumentar,
		btConcentracaoAumentar,
		btArmadilhaEscorregadiaAumentar,
		btArmadilhaAtordoanteAumentar,
		btInstalarArmadilhaAumentar,
		btArmadilhaLuminosaAumentar,
		btArmadilhaExtenuanteAumentar,
		btArmadilhaSoniferaAumentar,
		btArmadilhaCongelanteAumentar,
		btInstalarMinaAumentar,
		btArmadilhaExplosivaAumentar,
		btRemoverArmadilhaAumentar,
		btFlageloDasFerasAumentar,
		btAdestrarFalcaoAumentar,
		btAtaqueAereoAumentar,
		btGarrasDeAcoAumentar,
		btAlertaAumentar,
		btDesativarArmadilhaAumentar,
		btMensagemSecretaAumentar,
		btAssaltoDoFalcaoAumentar,
		btTiroPrecisoAumentar,
		btCaminhoDoVentoAumentar,
		btVisaoRealAumentar,
		btTaticasDeSobrevivenciaAumentar,
		btCamuflagemAumentar,
		btDisparoCerteiroAumentar,
		btTempestadeDeFlechasAumentar,
		btDisparoSelvagemAumentar,
		btPericiaComArmadilhaAumentar,
		btDetonadorAumentar,
		btBombaRelogioAumentar,
		btArmadilhaEnergizadaAumentar,
		btArmadilhaIncendiariaAumentar,
		btArmadilhaGlacialAumentar,
		btArmadilhaEscarlateAumentar,
		btArmadilhaOcreAumentar,
		btArmadilhaEsmeraldaAumentar,
		btArmadilhaCobaltoAumentar,
		btAdestrarWorgAumentar,
		btMontariaEmWorgAumentar,
		btPresasAfiadasAumentar,
		btFaroAgucadoAumentar,
		btAssaltoDeWorgAumentar,
		btMordidaFerozAumentar,
		btInvestidaDeWorgAumentar;

		//Resto dos botões
		Button btResetar, btSalvar, btSalvarIMG;
		ToggleButton tgbtSomenteHabilidadeAprendida;


		//Txt pontos da tela
		TextView txtRajadaDeFlechasPontos,
		txtChuvaDeFlechasPontos,
		txtOlhosDeAguiaPontos,
		txtPrecisaoPontos,
		txtConcentracaoPontos,
		txtArmadilhaEscorregadiaPontos,
		txtArmadilhaAtordoantePontos,
		txtInstalarArmadilhaPontos,
		txtArmadilhaLuminosaPontos,
		txtArmadilhaExtenuantePontos,
		txtArmadilhaSoniferaPontos,
		txtArmadilhaCongelantePontos,
		txtInstalarMinaPontos,
		txtArmadilhaExplosivaPontos,
		txtRemoverArmadilhaPontos,
		txtFlageloDasFerasPontos,
		txtAdestrarFalcaoPontos,
		txtAtaqueAereoPontos,
		txtGarrasDeAcoPontos,
		txtAlertaPontos,
		txtDesativarArmadilhaPontos,
		txtMensagemSecretaPontos,
		txtAssaltoDoFalcaoPontos,
		txtTiroPrecisoPontos,
		txtCaminhoDoVentoPontos,
		txtVisaoRealPontos,
		txtTaticasDeSobrevivenciaPontos,
		txtCamuflagemPontos,
		txtDisparoCerteiroPontos,
		txtTempestadeDeFlechasPontos,
		txtDisparoSelvagemPontos,
		txtPericiaComArmadilhaPontos,
		txtDetonadorPontos,
		txtBombaRelogioPontos,
		txtArmadilhaEnergizadaPontos,
		txtArmadilhaIncendiariaPontos,
		txtArmadilhaGlacialPontos,
		txtArmadilhaEscarlatePontos,
		txtArmadilhaOcrePontos,
		txtArmadilhaEsmeraldaPontos,
		txtArmadilhaCobaltoPontos,
		txtAdestrarWorgPontos,
		txtMontariaEmWorgPontos,
		txtPresasAfiadasPontos,
		txtFaroAgucadoPontos,
		txtAssaltoDeWorgPontos,
		txtMordidaFerozPontos,
		txtInvestidaDeWorgPontos;

		//Txt pontos restantes
		TextView txtClasse1, txtClasse2, txtTransClasse, txtClasse3;

		//Layouts
		LinearLayout layRajadaDeFlechas,
		layChuvaDeFlechas,
		layOlhosDeAguia,
		layPrecisao,
		layConcentracao,
		layArmadilhaEscorregadia,
		layArmadilhaAtordoante,
		layInstalarArmadilha,
		layArmadilhaLuminosa,
		layArmadilhaExtenuante,
		layArmadilhaSonifera,
		layArmadilhaCongelante,
		layInstalarMina,
		layArmadilhaExplosiva,
		layRemoverArmadilha,
		layFlageloDasFeras,
		layAdestrarFalcao,
		layAtaqueAereo,
		layGarrasDeAco,
		layAlerta,
		layDesativarArmadilha,
		layMensagemSecreta,
		layAssaltoDoFalcao,
		layTiroPreciso,
		layCaminhoDoVento,
		layVisaoReal,
		layTaticasDeSobrevivencia,
		layCamuflagem,
		layDisparoCerteiro,
		layTempestadeDeFlechas,
		layDisparoSelvagem,
		layPericiaComArmadilha,
		layDetonador,
		layBombaRelogio,
		layArmadilhaEnergizada,
		layArmadilhaIncendiaria,
		layArmadilhaGlacial,
		layArmadilhaEscarlate,
		layArmadilhaOcre,
		layArmadilhaEsmeralda,
		layArmadilhaCobalto,
		layAdestrarWorg,
		layMontariaEmWorg,
		layPresasAfiadas,
		layFaroAgucado,
		layAssaltoDeWorg,
		layMordidaFeroz,
		layInvestidaDeWorg;

		//Variaveis de Skill
		int varRajadaDeFlechas,
		varChuvaDeFlechas,
		varOlhosDeAguia,
		varPrecisao,
		varConcentracao,
		varArmadilhaEscorregadia,
		varArmadilhaAtordoante,
		varInstalarArmadilha,
		varArmadilhaLuminosa,
		varArmadilhaExtenuante,
		varArmadilhaSonifera,
		varArmadilhaCongelante,
		varInstalarMina,
		varArmadilhaExplosiva,
		varRemoverArmadilha,
		varFlageloDasFeras,
		varAdestrarFalcao,
		varAtaqueAereo,
		varGarrasDeAco,
		varAlerta,
		varDesativarArmadilha,
		varMensagemSecreta,
		varAssaltoDoFalcao,
		varTiroPreciso,
		varCaminhoDoVento,
		varVisaoReal,
		varTaticasDeSobrevivencia,
		varCamuflagem,
		varDisparoCerteiro,
		varTempestadeDeFlechas,
		varDisparoSelvagem,
		varPericiaComArmadilha,
		varDetonador,
		varBombaRelogio,
		varArmadilhaEnergizada,
		varArmadilhaIncendiaria,
		varArmadilhaGlacial,
		varArmadilhaEscarlate,
		varArmadilhaOcre,
		varArmadilhaEsmeralda,
		varArmadilhaCobalto,
		varAdestrarWorg,
		varMontariaEmWorg,
		varPresasAfiadas,
		varFaroAgucado,
		varAssaltoDeWorg,
		varMordidaFeroz,
		varInvestidaDeWorg;

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
			setContentView(R.layout.activity_simulador_sentinela);

			Intent it = getIntent();

			final int id = it.getIntExtra("id", 0);
			idParaAlterar = "_id =" +id;

			//inicialização de variáveis
			varRajadaDeFlechas = 0;
			varChuvaDeFlechas = 0;
			varOlhosDeAguia = 0;
			varPrecisao = 0;
			varConcentracao = 0;
			varArmadilhaEscorregadia = 0;
			varArmadilhaAtordoante = 0;
			varInstalarArmadilha = 0;
			varArmadilhaLuminosa = 0;
			varArmadilhaExtenuante = 0;
			varArmadilhaSonifera = 0;
			varArmadilhaCongelante = 0;
			varInstalarMina = 0;
			varArmadilhaExplosiva = 0;
			varRemoverArmadilha = 0;
			varFlageloDasFeras = 0;
			varAdestrarFalcao = 0;
			varAtaqueAereo = 0;
			varGarrasDeAco = 0;
			varAlerta = 0;
			varDesativarArmadilha = 0;
			varMensagemSecreta = 0;
			varAssaltoDoFalcao = 0;
			varTiroPreciso = 0;
			varCaminhoDoVento = 0;
			varVisaoReal = 0;
			varTaticasDeSobrevivencia = 0;
			varCamuflagem = 0;
			varDisparoCerteiro = 0;
			varTempestadeDeFlechas = 0;
			varDisparoSelvagem = 0;
			varPericiaComArmadilha = 0;
			varDetonador = 0;
			varBombaRelogio = 0;
			varArmadilhaEnergizada = 0;
			varArmadilhaIncendiaria = 0;
			varArmadilhaGlacial = 0;
			varArmadilhaEscarlate = 0;
			varArmadilhaOcre = 0;
			varArmadilhaEsmeralda = 0;
			varArmadilhaCobalto = 0;
			varAdestrarWorg = 0;
			varMontariaEmWorg = 0;
			varPresasAfiadas = 0;
			varFaroAgucado = 0;
			varAssaltoDeWorg = 0;
			varMordidaFeroz = 0;
			varInvestidaDeWorg = 0;



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
			btArmadilhaEscorregadiaInterrogacao = (Button) findViewById(R.id.btArmadilhaEscorregadiaInterrogacao);
			btArmadilhaAtordoanteInterrogacao = (Button) findViewById(R.id.btArmadilhaAtordoanteInterrogacao);
			btInstalarArmadilhaInterrogacao = (Button) findViewById(R.id.btInstalarArmadilhaInterrogacao);
			btArmadilhaLuminosaInterrogacao = (Button) findViewById(R.id.btArmadilhaLuminosaInterrogacao);
			btArmadilhaExtenuanteInterrogacao = (Button) findViewById(R.id.btArmadilhaExtenuanteInterrogacao);
			btArmadilhaSoniferaInterrogacao = (Button) findViewById(R.id.btArmadilhaSoniferaInterrogacao);
			btArmadilhaCongelanteInterrogacao = (Button) findViewById(R.id.btArmadilhaCongelanteInterrogacao);
			btInstalarMinaInterrogacao = (Button) findViewById(R.id.btInstalarMinaInterrogacao);
			btArmadilhaExplosivaInterrogacao = (Button) findViewById(R.id.btArmadilhaExplosivaInterrogacao);
			btRemoverArmadilhaInterrogacao = (Button) findViewById(R.id.btRemoverArmadilhaInterrogacao);
			btFlageloDasFerasInterrogacao = (Button) findViewById(R.id.btFlageloDasFerasInterrogacao);
			btAdestrarFalcaoInterrogacao = (Button) findViewById(R.id.btAdestrarFalcaoInterrogacao);
			btAtaqueAereoInterrogacao = (Button) findViewById(R.id.btAtaqueAereoInterrogacao);
			btGarrasDeAcoInterrogacao = (Button) findViewById(R.id.btGarrasDeAcoInterrogacao);
			btAlertaInterrogacao = (Button) findViewById(R.id.btAlertaInterrogacao);
			btDesativarArmadilhaInterrogacao = (Button) findViewById(R.id.btDesativarArmadilhaInterrogacao);
			btMensagemSecretaInterrogacao = (Button) findViewById(R.id.btMensagemSecretaInterrogacao);
			btFlechaFantasmaInterrogacao = (Button) findViewById(R.id.btFlechaFantasmaInterrogacao);
			btAtaqueDaFeraInterrogacao = (Button) findViewById(R.id.btAtaqueDaFeraInterrogacao);
			btAssaltoDoFalcaoInterrogacao = (Button) findViewById(R.id.btAssaltoDoFalcaoInterrogacao);
			btTiroPrecisoInterrogacao = (Button) findViewById(R.id.btTiroPrecisoInterrogacao);
			btCaminhoDoVentoInterrogacao = (Button) findViewById(R.id.btCaminhoDoVentoInterrogacao);
			btVisaoRealInterrogacao = (Button) findViewById(R.id.btVisaoRealInterrogacao);
			btTaticasDeSobrevivenciaInterrogacao = (Button) findViewById(R.id.btTaticasDeSobrevivenciaInterrogacao);
			btCamuflagemInterrogacao = (Button) findViewById(R.id.btCamuflagemInterrogacao);
			btDisparoCerteiroInterrogacao = (Button) findViewById(R.id.btDisparoCerteiroInterrogacao);
			btTempestadeDeFlechasInterrogacao = (Button) findViewById(R.id.btTempestadeDeFlechasInterrogacao);
			btDisparoSelvagemInterrogacao = (Button) findViewById(R.id.btDisparoSelvagemInterrogacao);
			btPericiaComArmadilhaInterrogacao = (Button) findViewById(R.id.btPericiaComArmadilhaInterrogacao);
			btDetonadorInterrogacao = (Button) findViewById(R.id.btDetonadorInterrogacao);
			btBombaRelogioInterrogacao = (Button) findViewById(R.id.btBombaRelogioInterrogacao);
			btArmadilhaEnergizadaInterrogacao = (Button) findViewById(R.id.btArmadilhaEnergizadaInterrogacao);
			btArmadilhaIncendiariaInterrogacao = (Button) findViewById(R.id.btArmadilhaIncendiariaInterrogacao);
			btArmadilhaGlacialInterrogacao = (Button) findViewById(R.id.btArmadilhaGlacialInterrogacao);
			btArmadilhaEscarlateInterrogacao = (Button) findViewById(R.id.btArmadilhaEscarlateInterrogacao);
			btArmadilhaOcreInterrogacao = (Button) findViewById(R.id.btArmadilhaOcreInterrogacao);
			btArmadilhaEsmeraldaInterrogacao = (Button) findViewById(R.id.btArmadilhaEsmeraldaInterrogacao);
			btArmadilhaCobaltoInterrogacao = (Button) findViewById(R.id.btArmadilhaCobaltoInterrogacao);
			btAdestrarWorgInterrogacao = (Button) findViewById(R.id.btAdestrarWorgInterrogacao);
			btMontariaEmWorgInterrogacao = (Button) findViewById(R.id.btMontariaEmWorgInterrogacao);
			btPresasAfiadasInterrogacao = (Button) findViewById(R.id.btPresasAfiadasInterrogacao);
			btFaroAgucadoInterrogacao = (Button) findViewById(R.id.btFaroAgucadoInterrogacao);
			btAssaltoDeWorgInterrogacao = (Button) findViewById(R.id.btAssaltoDeWorgInterrogacao);
			btMordidaFerozInterrogacao = (Button) findViewById(R.id.btMordidaFerozInterrogacao);
			btInvestidaDeWorgInterrogacao = (Button) findViewById(R.id.btInvestidaDeWorgInterrogacao);

			//Botões de diminuir habilidades
			btRajadaDeFlechasDiminuir = (Button) findViewById(R.id.btRajadaDeFlechasDiminuir);
			btChuvaDeFlechasDiminuir = (Button) findViewById(R.id.btChuvaDeFlechasDiminuir);
			btOlhosDeAguiaDiminuir = (Button) findViewById(R.id.btOlhosDeAguiaDiminuir);
			btPrecisaoDiminuir = (Button) findViewById(R.id.btPrecisaoDiminuir);
			btConcentracaoDiminuir = (Button) findViewById(R.id.btConcentracaoDiminuir);
			btArmadilhaEscorregadiaDiminuir = (Button) findViewById(R.id.btArmadilhaEscorregadiaDiminuir);
			btArmadilhaAtordoanteDiminuir = (Button) findViewById(R.id.btArmadilhaAtordoanteDiminuir);
			btInstalarArmadilhaDiminuir = (Button) findViewById(R.id.btInstalarArmadilhaDiminuir);
			btArmadilhaLuminosaDiminuir = (Button) findViewById(R.id.btArmadilhaLuminosaDiminuir);
			btArmadilhaExtenuanteDiminuir = (Button) findViewById(R.id.btArmadilhaExtenuanteDiminuir);
			btArmadilhaSoniferaDiminuir = (Button) findViewById(R.id.btArmadilhaSoniferaDiminuir);
			btArmadilhaCongelanteDiminuir = (Button) findViewById(R.id.btArmadilhaCongelanteDiminuir);
			btInstalarMinaDiminuir = (Button) findViewById(R.id.btInstalarMinaDiminuir);
			btArmadilhaExplosivaDiminuir = (Button) findViewById(R.id.btArmadilhaExplosivaDiminuir);
			btRemoverArmadilhaDiminuir = (Button) findViewById(R.id.btRemoverArmadilhaDiminuir);
			btFlageloDasFerasDiminuir = (Button) findViewById(R.id.btFlageloDasFerasDiminuir);
			btAdestrarFalcaoDiminuir = (Button) findViewById(R.id.btAdestrarFalcaoDiminuir);
			btAtaqueAereoDiminuir = (Button) findViewById(R.id.btAtaqueAereoDiminuir);
			btGarrasDeAcoDiminuir = (Button) findViewById(R.id.btGarrasDeAcoDiminuir);
			btAlertaDiminuir = (Button) findViewById(R.id.btAlertaDiminuir);
			btDesativarArmadilhaDiminuir = (Button) findViewById(R.id.btDesativarArmadilhaDiminuir);
			btMensagemSecretaDiminuir = (Button) findViewById(R.id.btMensagemSecretaDiminuir);
			btAssaltoDoFalcaoDiminuir = (Button) findViewById(R.id.btAssaltoDoFalcaoDiminuir);
			btTiroPrecisoDiminuir = (Button) findViewById(R.id.btTiroPrecisoDiminuir);
			btCaminhoDoVentoDiminuir = (Button) findViewById(R.id.btCaminhoDoVentoDiminuir);
			btVisaoRealDiminuir = (Button) findViewById(R.id.btVisaoRealDiminuir);
			btTaticasDeSobrevivenciaDiminuir = (Button) findViewById(R.id.btTaticasDeSobrevivenciaDiminuir);
			btCamuflagemDiminuir = (Button) findViewById(R.id.btCamuflagemDiminuir);
			btDisparoCerteiroDiminuir = (Button) findViewById(R.id.btDisparoCerteiroDiminuir);
			btTempestadeDeFlechasDiminuir = (Button) findViewById(R.id.btTempestadeDeFlechasDiminuir);
			btDisparoSelvagemDiminuir = (Button) findViewById(R.id.btDisparoSelvagemDiminuir);
			btPericiaComArmadilhaDiminuir = (Button) findViewById(R.id.btPericiaComArmadilhaDiminuir);
			btDetonadorDiminuir = (Button) findViewById(R.id.btDetonadorDiminuir);
			btBombaRelogioDiminuir = (Button) findViewById(R.id.btBombaRelogioDiminuir);
			btArmadilhaEnergizadaDiminuir = (Button) findViewById(R.id.btArmadilhaEnergizadaDiminuir);
			btArmadilhaIncendiariaDiminuir = (Button) findViewById(R.id.btArmadilhaIncendiariaDiminuir);
			btArmadilhaGlacialDiminuir = (Button) findViewById(R.id.btArmadilhaGlacialDiminuir);
			btArmadilhaEscarlateDiminuir = (Button) findViewById(R.id.btArmadilhaEscarlateDiminuir);
			btArmadilhaOcreDiminuir = (Button) findViewById(R.id.btArmadilhaOcreDiminuir);
			btArmadilhaEsmeraldaDiminuir = (Button) findViewById(R.id.btArmadilhaEsmeraldaDiminuir);
			btArmadilhaCobaltoDiminuir = (Button) findViewById(R.id.btArmadilhaCobaltoDiminuir);
			btAdestrarWorgDiminuir = (Button) findViewById(R.id.btAdestrarWorgDiminuir);
			btMontariaEmWorgDiminuir = (Button) findViewById(R.id.btMontariaEmWorgDiminuir);
			btPresasAfiadasDiminuir = (Button) findViewById(R.id.btPresasAfiadasDiminuir);
			btFaroAgucadoDiminuir = (Button) findViewById(R.id.btFaroAgucadoDiminuir);
			btAssaltoDeWorgDiminuir = (Button) findViewById(R.id.btAssaltoDeWorgDiminuir);
			btMordidaFerozDiminuir = (Button) findViewById(R.id.btMordidaFerozDiminuir);
			btInvestidaDeWorgDiminuir = (Button) findViewById(R.id.btInvestidaDeWorgDiminuir);

			//Botões de aumentar habilidades
			btRajadaDeFlechasAumentar = (Button) findViewById(R.id.btRajadaDeFlechasAumentar);
			btChuvaDeFlechasAumentar = (Button) findViewById(R.id.btChuvaDeFlechasAumentar);
			btOlhosDeAguiaAumentar = (Button) findViewById(R.id.btOlhosDeAguiaAumentar);
			btPrecisaoAumentar = (Button) findViewById(R.id.btPrecisaoAumentar);
			btConcentracaoAumentar = (Button) findViewById(R.id.btConcentracaoAumentar);
			btArmadilhaEscorregadiaAumentar = (Button) findViewById(R.id.btArmadilhaEscorregadiaAumentar);
			btArmadilhaAtordoanteAumentar = (Button) findViewById(R.id.btArmadilhaAtordoanteAumentar);
			btInstalarArmadilhaAumentar = (Button) findViewById(R.id.btInstalarArmadilhaAumentar);
			btArmadilhaLuminosaAumentar = (Button) findViewById(R.id.btArmadilhaLuminosaAumentar);
			btArmadilhaExtenuanteAumentar = (Button) findViewById(R.id.btArmadilhaExtenuanteAumentar);
			btArmadilhaSoniferaAumentar = (Button) findViewById(R.id.btArmadilhaSoniferaAumentar);
			btArmadilhaCongelanteAumentar = (Button) findViewById(R.id.btArmadilhaCongelanteAumentar);
			btInstalarMinaAumentar = (Button) findViewById(R.id.btInstalarMinaAumentar);
			btArmadilhaExplosivaAumentar = (Button) findViewById(R.id.btArmadilhaExplosivaAumentar);
			btRemoverArmadilhaAumentar = (Button) findViewById(R.id.btRemoverArmadilhaAumentar);
			btFlageloDasFerasAumentar = (Button) findViewById(R.id.btFlageloDasFerasAumentar);
			btAdestrarFalcaoAumentar = (Button) findViewById(R.id.btAdestrarFalcaoAumentar);
			btAtaqueAereoAumentar = (Button) findViewById(R.id.btAtaqueAereoAumentar);
			btGarrasDeAcoAumentar = (Button) findViewById(R.id.btGarrasDeAcoAumentar);
			btAlertaAumentar = (Button) findViewById(R.id.btAlertaAumentar);
			btDesativarArmadilhaAumentar = (Button) findViewById(R.id.btDesativarArmadilhaAumentar);
			btMensagemSecretaAumentar = (Button) findViewById(R.id.btMensagemSecretaAumentar);
			btAssaltoDoFalcaoAumentar = (Button) findViewById(R.id.btAssaltoDoFalcaoAumentar);
			btTiroPrecisoAumentar = (Button) findViewById(R.id.btTiroPrecisoAumentar);
			btCaminhoDoVentoAumentar = (Button) findViewById(R.id.btCaminhoDoVentoAumentar);
			btVisaoRealAumentar = (Button) findViewById(R.id.btVisaoRealAumentar);
			btTaticasDeSobrevivenciaAumentar = (Button) findViewById(R.id.btTaticasDeSobrevivenciaAumentar);
			btCamuflagemAumentar = (Button) findViewById(R.id.btCamuflagemAumentar);
			btDisparoCerteiroAumentar = (Button) findViewById(R.id.btDisparoCerteiroAumentar);
			btTempestadeDeFlechasAumentar = (Button) findViewById(R.id.btTempestadeDeFlechasAumentar);
			btDisparoSelvagemAumentar = (Button) findViewById(R.id.btDisparoSelvagemAumentar);
			btPericiaComArmadilhaAumentar = (Button) findViewById(R.id.btPericiaComArmadilhaAumentar);
			btDetonadorAumentar = (Button) findViewById(R.id.btDetonadorAumentar);
			btBombaRelogioAumentar = (Button) findViewById(R.id.btBombaRelogioAumentar);
			btArmadilhaEnergizadaAumentar = (Button) findViewById(R.id.btArmadilhaEnergizadaAumentar);
			btArmadilhaIncendiariaAumentar = (Button) findViewById(R.id.btArmadilhaIncendiariaAumentar);
			btArmadilhaGlacialAumentar = (Button) findViewById(R.id.btArmadilhaGlacialAumentar);
			btArmadilhaEscarlateAumentar = (Button) findViewById(R.id.btArmadilhaEscarlateAumentar);
			btArmadilhaOcreAumentar = (Button) findViewById(R.id.btArmadilhaOcreAumentar);
			btArmadilhaEsmeraldaAumentar = (Button) findViewById(R.id.btArmadilhaEsmeraldaAumentar);
			btArmadilhaCobaltoAumentar = (Button) findViewById(R.id.btArmadilhaCobaltoAumentar);
			btAdestrarWorgAumentar = (Button) findViewById(R.id.btAdestrarWorgAumentar);
			btMontariaEmWorgAumentar = (Button) findViewById(R.id.btMontariaEmWorgAumentar);
			btPresasAfiadasAumentar = (Button) findViewById(R.id.btPresasAfiadasAumentar);
			btFaroAgucadoAumentar = (Button) findViewById(R.id.btFaroAgucadoAumentar);
			btAssaltoDeWorgAumentar = (Button) findViewById(R.id.btAssaltoDeWorgAumentar);
			btMordidaFerozAumentar = (Button) findViewById(R.id.btMordidaFerozAumentar);
			btInvestidaDeWorgAumentar = (Button) findViewById(R.id.btInvestidaDeWorgAumentar);

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
			txtArmadilhaEscorregadiaPontos = (TextView) findViewById(R.id.txtArmadilhaEscorregadiaPontos);
			txtArmadilhaAtordoantePontos = (TextView) findViewById(R.id.txtArmadilhaAtordoantePontos);
			txtInstalarArmadilhaPontos = (TextView) findViewById(R.id.txtInstalarArmadilhaPontos);
			txtArmadilhaLuminosaPontos = (TextView) findViewById(R.id.txtArmadilhaLuminosaPontos);
			txtArmadilhaExtenuantePontos = (TextView) findViewById(R.id.txtArmadilhaExtenuantePontos);
			txtArmadilhaSoniferaPontos = (TextView) findViewById(R.id.txtArmadilhaSoniferaPontos);
			txtArmadilhaCongelantePontos = (TextView) findViewById(R.id.txtArmadilhaCongelantePontos);
			txtInstalarMinaPontos = (TextView) findViewById(R.id.txtInstalarMinaPontos);
			txtArmadilhaExplosivaPontos = (TextView) findViewById(R.id.txtArmadilhaExplosivaPontos);
			txtRemoverArmadilhaPontos = (TextView) findViewById(R.id.txtRemoverArmadilhaPontos);
			txtFlageloDasFerasPontos = (TextView) findViewById(R.id.txtFlageloDasFerasPontos);
			txtAdestrarFalcaoPontos = (TextView) findViewById(R.id.txtAdestrarFalcaoPontos);
			txtAtaqueAereoPontos = (TextView) findViewById(R.id.txtAtaqueAereoPontos);
			txtGarrasDeAcoPontos = (TextView) findViewById(R.id.txtGarrasDeAcoPontos);
			txtAlertaPontos = (TextView) findViewById(R.id.txtAlertaPontos);
			txtDesativarArmadilhaPontos = (TextView) findViewById(R.id.txtDesativarArmadilhaPontos);
			txtMensagemSecretaPontos = (TextView) findViewById(R.id.txtMensagemSecretaPontos);
			txtAssaltoDoFalcaoPontos = (TextView) findViewById(R.id.txtAssaltoDoFalcaoPontos);
			txtTiroPrecisoPontos = (TextView) findViewById(R.id.txtTiroPrecisoPontos);
			txtCaminhoDoVentoPontos = (TextView) findViewById(R.id.txtCaminhoDoVentoPontos);
			txtVisaoRealPontos = (TextView) findViewById(R.id.txtVisaoRealPontos);
			txtTaticasDeSobrevivenciaPontos = (TextView) findViewById(R.id.txtTaticasDeSobrevivenciaPontos);
			txtCamuflagemPontos = (TextView) findViewById(R.id.txtCamuflagemPontos);
			txtDisparoCerteiroPontos = (TextView) findViewById(R.id.txtDisparoCerteiroPontos);
			txtTempestadeDeFlechasPontos = (TextView) findViewById(R.id.txtTempestadeDeFlechasPontos);
			txtDisparoSelvagemPontos = (TextView) findViewById(R.id.txtDisparoSelvagemPontos);
			txtPericiaComArmadilhaPontos = (TextView) findViewById(R.id.txtPericiaComArmadilhaPontos);
			txtDetonadorPontos = (TextView) findViewById(R.id.txtDetonadorPontos);
			txtBombaRelogioPontos = (TextView) findViewById(R.id.txtBombaRelogioPontos);
			txtArmadilhaEnergizadaPontos = (TextView) findViewById(R.id.txtArmadilhaEnergizadaPontos);
			txtArmadilhaIncendiariaPontos = (TextView) findViewById(R.id.txtArmadilhaIncendiariaPontos);
			txtArmadilhaGlacialPontos = (TextView) findViewById(R.id.txtArmadilhaGlacialPontos);
			txtArmadilhaEscarlatePontos = (TextView) findViewById(R.id.txtArmadilhaEscarlatePontos);
			txtArmadilhaOcrePontos = (TextView) findViewById(R.id.txtArmadilhaOcrePontos);
			txtArmadilhaEsmeraldaPontos = (TextView) findViewById(R.id.txtArmadilhaEsmeraldaPontos);
			txtArmadilhaCobaltoPontos = (TextView) findViewById(R.id.txtArmadilhaCobaltoPontos);
			txtAdestrarWorgPontos = (TextView) findViewById(R.id.txtAdestrarWorgPontos);
			txtMontariaEmWorgPontos = (TextView) findViewById(R.id.txtMontariaEmWorgPontos);
			txtPresasAfiadasPontos = (TextView) findViewById(R.id.txtPresasAfiadasPontos);
			txtFaroAgucadoPontos = (TextView) findViewById(R.id.txtFaroAgucadoPontos);
			txtAssaltoDeWorgPontos = (TextView) findViewById(R.id.txtAssaltoDeWorgPontos);
			txtMordidaFerozPontos = (TextView) findViewById(R.id.txtMordidaFerozPontos);
			txtInvestidaDeWorgPontos = (TextView) findViewById(R.id.txtInvestidaDeWorgPontos);

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
			layArmadilhaEscorregadia = (LinearLayout) findViewById(R.id.layArmadilhaEscorregadia);
			layArmadilhaAtordoante = (LinearLayout) findViewById(R.id.layArmadilhaAtordoante);
			layInstalarArmadilha = (LinearLayout) findViewById(R.id.layInstalarArmadilha);
			layArmadilhaLuminosa = (LinearLayout) findViewById(R.id.layArmadilhaLuminosa);
			layArmadilhaExtenuante = (LinearLayout) findViewById(R.id.layArmadilhaExtenuante);
			layArmadilhaSonifera = (LinearLayout) findViewById(R.id.layArmadilhaSonifera);
			layArmadilhaCongelante = (LinearLayout) findViewById(R.id.layArmadilhaCongelante);
			layInstalarMina = (LinearLayout) findViewById(R.id.layInstalarMina);
			layArmadilhaExplosiva = (LinearLayout) findViewById(R.id.layArmadilhaExplosiva);
			layRemoverArmadilha = (LinearLayout) findViewById(R.id.layRemoverArmadilha);
			layFlageloDasFeras = (LinearLayout) findViewById(R.id.layFlageloDasFeras);
			layAdestrarFalcao = (LinearLayout) findViewById(R.id.layAdestrarFalcao);
			layAtaqueAereo = (LinearLayout) findViewById(R.id.layAtaqueAereo);
			layGarrasDeAco = (LinearLayout) findViewById(R.id.layGarrasDeAco);
			layAlerta = (LinearLayout) findViewById(R.id.layAlerta);
			layDesativarArmadilha = (LinearLayout) findViewById(R.id.layDesativarArmadilha);
			layMensagemSecreta = (LinearLayout) findViewById(R.id.layMensagemSecreta);
			layAssaltoDoFalcao = (LinearLayout) findViewById(R.id.layAssaltoDoFalcao);
			layTiroPreciso = (LinearLayout) findViewById(R.id.layTiroPreciso);
			layCaminhoDoVento = (LinearLayout) findViewById(R.id.layCaminhoDoVento);
			layVisaoReal = (LinearLayout) findViewById(R.id.layVisaoReal);
			layTaticasDeSobrevivencia = (LinearLayout) findViewById(R.id.layTaticasDeSobrevivencia);
			layCamuflagem = (LinearLayout) findViewById(R.id.layCamuflagem);
			layDisparoCerteiro = (LinearLayout) findViewById(R.id.layDisparoCerteiro);
			layTempestadeDeFlechas = (LinearLayout) findViewById(R.id.layTempestadeDeFlechas);
			layDisparoSelvagem = (LinearLayout) findViewById(R.id.layDisparoSelvagem);
			layPericiaComArmadilha = (LinearLayout) findViewById(R.id.layPericiaComArmadilha);
			layDetonador = (LinearLayout) findViewById(R.id.layDetonador);
			layBombaRelogio = (LinearLayout) findViewById(R.id.layBombaRelogio);
			layArmadilhaEnergizada = (LinearLayout) findViewById(R.id.layArmadilhaEnergizada);
			layArmadilhaIncendiaria = (LinearLayout) findViewById(R.id.layArmadilhaIncendiaria);
			layArmadilhaGlacial = (LinearLayout) findViewById(R.id.layArmadilhaGlacial);
			layArmadilhaEscarlate = (LinearLayout) findViewById(R.id.layArmadilhaEscarlate);
			layArmadilhaOcre = (LinearLayout) findViewById(R.id.layArmadilhaOcre);
			layArmadilhaEsmeralda = (LinearLayout) findViewById(R.id.layArmadilhaEsmeralda);
			layArmadilhaCobalto = (LinearLayout) findViewById(R.id.layArmadilhaCobalto);
			layAdestrarWorg = (LinearLayout) findViewById(R.id.layAdestrarWorg);
			layMontariaEmWorg = (LinearLayout) findViewById(R.id.layMontariaEmWorg);
			layPresasAfiadas = (LinearLayout) findViewById(R.id.layPresasAfiadas);
			layFaroAgucado = (LinearLayout) findViewById(R.id.layFaroAgucado);
			layAssaltoDeWorg = (LinearLayout) findViewById(R.id.layAssaltoDeWorg);
			layMordidaFeroz = (LinearLayout) findViewById(R.id.layMordidaFeroz);
			layInvestidaDeWorg = (LinearLayout) findViewById(R.id.layInvestidaDeWorg);

			if (id>0)
				recarregarBuild(id);

			layPrincipal = (LinearLayout) findViewById(R.id.habilidades);

			//Eventos de informação
			btRajadaDeFlechasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Rajada De Flechas");
					dialogo.setMessage(R.string.rajadaDeFlechasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChuvaDeFlechasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Chuva De Flechas");
					dialogo.setMessage(R.string.chuvaDeFlechasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOlhosDeAguiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Olhos De Águia");
					dialogo.setMessage(R.string.olhosDeAguiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPrecisaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Precisão");
					dialogo.setMessage(R.string.precisaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btConcentracaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Concentração");
					dialogo.setMessage(R.string.concentracaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFabricarFlechasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Fabricar Flechas");
					dialogo.setMessage(R.string.fabricarFlechasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDisparoViolentoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Disparo Violento");
					dialogo.setMessage(R.string.disparoViolentoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaEscorregadiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Armadilha Escorregadia");
					dialogo.setMessage(R.string.armadilhaEscorregadiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaAtordoanteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Armadilha Atordoante");
					dialogo.setMessage(R.string.armadilhaAtordoanteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInstalarArmadilhaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Instalar Armadilha");
					dialogo.setMessage(R.string.instalarArmadilhaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaLuminosaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Armadilha Luminosa");
					dialogo.setMessage(R.string.armadilhaLuminosaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaExtenuanteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Armadilha Extenuante");
					dialogo.setMessage(R.string.armadilhaExtenuanteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaSoniferaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Armadilha Sonífera");
					dialogo.setMessage(R.string.armadilhaSoniferaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaCongelanteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Armadilha Congelante");
					dialogo.setMessage(R.string.armadilhaCongelanteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInstalarMinaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Instalar Mina");
					dialogo.setMessage(R.string.instalarMinaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaExplosivaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Armadilha Explosiva");
					dialogo.setMessage(R.string.armadilhaExplosivaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRemoverArmadilhaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Remover Armadilha");
					dialogo.setMessage(R.string.removerArmadilhaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFlageloDasFerasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Flagelo Das Feras");
					dialogo.setMessage(R.string.flageloDasFerasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAdestrarFalcaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Adestrar Falcão");
					dialogo.setMessage(R.string.adestrarFalcaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueAereoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Ataque Aéreo");
					dialogo.setMessage(R.string.ataqueAereoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGarrasDeAcoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Garras De Aço");
					dialogo.setMessage(R.string.garrasDeAcoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAlertaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Alerta");
					dialogo.setMessage(R.string.alertaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDesativarArmadilhaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Desativar Armadilha");
					dialogo.setMessage(R.string.desativarArmadilhaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMensagemSecretaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Mensagem Secreta");
					dialogo.setMessage(R.string.mensagemSecretaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFlechaFantasmaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Flecha Fantasma");
					dialogo.setMessage(R.string.flechaFantasmaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueDaFeraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Ataque Da Fera");
					dialogo.setMessage(R.string.ataqueDaFeraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAssaltoDoFalcaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Assalto Do Falcão");
					dialogo.setMessage(R.string.assaltoDoFalcaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTiroPrecisoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Tiro Preciso");
					dialogo.setMessage(R.string.tiroPrecisoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCaminhoDoVentoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Caminho Do Vento");
					dialogo.setMessage(R.string.caminhoDoVentoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btVisaoRealInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Visão Real");
					dialogo.setMessage(R.string.visaoRealInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTaticasDeSobrevivenciaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Táticas De Sobrevivência");
					dialogo.setMessage(R.string.taticasDeSobrevivenciaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCamuflagemInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Camuflagem");
					dialogo.setMessage(R.string.camuflagemInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDisparoCerteiroInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Disparo Certeiro");
					dialogo.setMessage(R.string.disparoCerteiroInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTempestadeDeFlechasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Tempestade De Flechas");
					dialogo.setMessage(R.string.tempestadeDeFlechasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDisparoSelvagemInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Disparo Selvagem");
					dialogo.setMessage(R.string.disparoSelvagemInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaComArmadilhaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Perícia Com Armadilha");
					dialogo.setMessage(R.string.periciaComArmadilhaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDetonadorInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Detonador");
					dialogo.setMessage(R.string.detonadorInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBombaRelogioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Bomba Relógio");
					dialogo.setMessage(R.string.bombaRelogioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaEnergizadaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Armadilha Energizada");
					dialogo.setMessage(R.string.armadilhaEnergizadaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaIncendiariaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Armadilha Incendiária");
					dialogo.setMessage(R.string.armadilhaIncendiariaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaGlacialInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Armadilha Glacial");
					dialogo.setMessage(R.string.armadilhaGlacialInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaEscarlateInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Armadilha Escarlate");
					dialogo.setMessage(R.string.armadilhaEscarlateInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaOcreInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Armadilha Ocre");
					dialogo.setMessage(R.string.armadilhaOcreInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaEsmeraldaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Armadilha Esmeralda");
					dialogo.setMessage(R.string.armadilhaEsmeraldaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaCobaltoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Armadilha Cobalto");
					dialogo.setMessage(R.string.armadilhaCobaltoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAdestrarWorgInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Adestrar Worg");
					dialogo.setMessage(R.string.adestrarWorgInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMontariaEmWorgInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Montaria Em Worg");
					dialogo.setMessage(R.string.montariaWorgInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPresasAfiadasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Presas Afiadas");
					dialogo.setMessage(R.string.presasAfiadasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFaroAgucadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Faro Aguçado");
					dialogo.setMessage(R.string.faroAgucadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAssaltoDeWorgInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Assalto De Worg");
					dialogo.setMessage(R.string.avancoWorgInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMordidaFerozInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Mordida Feroz");
					dialogo.setMessage(R.string.mordidaFerozInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInvestidaDeWorgInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSentinela.this);
					dialogo.setTitle("Investida De Worg");
					dialogo.setMessage(R.string.investidaDeWorgInfo);
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
			btArmadilhaEscorregadiaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");

				}
			});
			btArmadilhaAtordoanteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");

				}
			});
			btInstalarArmadilhaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");

				}
			});
			btArmadilhaLuminosaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");

				}
			});
			btArmadilhaExtenuanteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<1 && count<1){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArmadilhaExtenuante, "ArmadilhaExtenuante", 5, 2, "Aumentar");

				}
			});
			btArmadilhaSoniferaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArmadilhaSonifera, "ArmadilhaSonifera", 5, 2, "Aumentar");

				}
			});
			btArmadilhaCongelanteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArmadilhaCongelante, "ArmadilhaCongelante", 5, 2, "Aumentar");

				}
			});
			btInstalarMinaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaSonifera<1 && count<1){
						atualizarCalculo(varArmadilhaSonifera, "ArmadilhaSonifera", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaCongelante<1 && count<1){
						atualizarCalculo(varArmadilhaCongelante, "ArmadilhaCongelante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInstalarMina, "InstalarMina", 5, 2, "Aumentar");

				}
			});
			btArmadilhaExplosivaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaSonifera<1 && count<1){
						atualizarCalculo(varArmadilhaSonifera, "ArmadilhaSonifera", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaCongelante<1 && count<1){
						atualizarCalculo(varArmadilhaCongelante, "ArmadilhaCongelante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarMina<1 && count<1){
						atualizarCalculo(varInstalarMina, "InstalarMina", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<1 && count<1){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExtenuante<1 && count<1){
						atualizarCalculo(varArmadilhaExtenuante, "ArmadilhaExtenuante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArmadilhaExplosiva, "ArmadilhaExplosiva", 5, 2, "Aumentar");

				}
			});
			btRemoverArmadilhaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRemoverArmadilha, "RemoverArmadilha", 1, 2, "Aumentar");

				}
			});
			btFlageloDasFerasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFlageloDasFeras, "FlageloDasFeras", 10, 2, "Aumentar");

				}
			});
			btAdestrarFalcaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFlageloDasFeras<1 && count<1){
						atualizarCalculo(varFlageloDasFeras, "FlageloDasFeras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAdestrarFalcao, "AdestrarFalcao", 1, 2, "Aumentar");

				}
			});
			btAtaqueAereoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFlageloDasFeras<1 && count<1){
						atualizarCalculo(varFlageloDasFeras, "FlageloDasFeras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFlageloDasFeras<1 && count<1){
						atualizarCalculo(varFlageloDasFeras, "FlageloDasFeras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAdestrarFalcao<1 && count<1){
						atualizarCalculo(varAdestrarFalcao, "AdestrarFalcao", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAtaqueAereo, "AtaqueAereo", 5, 2, "Aumentar");

				}
			});
			btGarrasDeAcoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFlageloDasFeras<1 && count<1){
						atualizarCalculo(varFlageloDasFeras, "FlageloDasFeras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFlageloDasFeras<1 && count<1){
						atualizarCalculo(varFlageloDasFeras, "FlageloDasFeras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAdestrarFalcao<1 && count<1){
						atualizarCalculo(varAdestrarFalcao, "AdestrarFalcao", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueAereo<5 && count<5){
						atualizarCalculo(varAtaqueAereo, "AtaqueAereo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGarrasDeAco, "GarrasDeAco", 10, 2, "Aumentar");

				}
			});
			btAlertaAumentar.setOnClickListener(new View.OnClickListener() {

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
					while(varConcentracao<1 && count<1){
						atualizarCalculo(varConcentracao, "Concentracao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varFlageloDasFeras<1 && count<1){
						atualizarCalculo(varFlageloDasFeras, "FlageloDasFeras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAdestrarFalcao<1 && count<1){
						atualizarCalculo(varAdestrarFalcao, "AdestrarFalcao", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAlerta, "Alerta", 4, 2, "Aumentar");

				}
			});
			btDesativarArmadilhaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArmadilha<1 && count<1){
						atualizarCalculo(varRemoverArmadilha, "RemoverArmadilha", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFlageloDasFeras<1 && count<1){
						atualizarCalculo(varFlageloDasFeras, "FlageloDasFeras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAdestrarFalcao<1 && count<1){
						atualizarCalculo(varAdestrarFalcao, "AdestrarFalcao", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDesativarArmadilha, "DesativarArmadilha", 5, 2, "Aumentar");

				}
			});
			btMensagemSecretaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<1 && count<1){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<1 && count<1){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExtenuante<1 && count<1){
						atualizarCalculo(varArmadilhaExtenuante, "ArmadilhaExtenuante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMensagemSecreta, "MensagemSecreta", 1, 2, "Aumentar");

				}
			});
			btAssaltoDoFalcaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varOlhosDeAguia<5 && count<5){
						atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varFlageloDasFeras<1 && count<1){
						atualizarCalculo(varFlageloDasFeras, "FlageloDasFeras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFlageloDasFeras<1 && count<1){
						atualizarCalculo(varFlageloDasFeras, "FlageloDasFeras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAdestrarFalcao<1 && count<1){
						atualizarCalculo(varAdestrarFalcao, "AdestrarFalcao", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueAereo<5 && count<5){
						atualizarCalculo(varAtaqueAereo, "AtaqueAereo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varGarrasDeAco<3 && count<3){
						atualizarCalculo(varGarrasDeAco, "GarrasDeAco", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAssaltoDoFalcao, "AssaltoDoFalcao", 5, 3, "Aumentar");

				}
			});
			btTiroPrecisoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRajadaDeFlechas<5 && count<5){
						atualizarCalculo(varRajadaDeFlechas, "RajadaDeFlechas", 10, 1, "Aumentar");
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
					atualizarCalculo(varTiroPreciso, "TiroPreciso", 5, 3, "Aumentar");

				}
			});
			btCaminhoDoVentoAumentar.setOnClickListener(new View.OnClickListener() {

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
					while(varConcentracao<9 && count<9){
						atualizarCalculo(varConcentracao, "Concentracao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCaminhoDoVento, "CaminhoDoVento", 10, 3, "Aumentar");

				}
			});
			btVisaoRealAumentar.setOnClickListener(new View.OnClickListener() {

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
					while(varPrecisao<3 && count<3){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varOlhosDeAguia<10 && count<10){
						atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrecisao<10 && count<10){
						atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varFlageloDasFeras<1 && count<1){
						atualizarCalculo(varFlageloDasFeras, "FlageloDasFeras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAdestrarFalcao<1 && count<1){
						atualizarCalculo(varAdestrarFalcao, "AdestrarFalcao", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varVisaoReal, "VisaoReal", 10, 3, "Aumentar");

				}
			});
			btTaticasDeSobrevivenciaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTaticasDeSobrevivencia, "TaticasDeSobrevivencia", 10, 4, "Aumentar");

				}
			});
			btCamuflagemAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varTaticasDeSobrevivencia<1 && count<1){
						atualizarCalculo(varTaticasDeSobrevivencia, "TaticasDeSobrevivencia", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCamuflagem, "Camuflagem", 5, 4, "Aumentar");

				}
			});
			btDisparoCerteiroAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<5 && count<5){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDisparoCerteiro, "DisparoCerteiro", 10, 4, "Aumentar");

				}
			});
			btTempestadeDeFlechasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<5 && count<5){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDisparoCerteiro<5 && count<5){
						atualizarCalculo(varDisparoCerteiro, "DisparoCerteiro", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTempestadeDeFlechas, "TempestadeDeFlechas", 10, 4, "Aumentar");

				}
			});
			btDisparoSelvagemAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<5 && count<5){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<5 && count<5){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDisparoCerteiro<5 && count<5){
						atualizarCalculo(varDisparoCerteiro, "DisparoCerteiro", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varTempestadeDeFlechas<5 && count<5){
						atualizarCalculo(varTempestadeDeFlechas, "TempestadeDeFlechas", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<5 && count<5){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDisparoCerteiro<5 && count<5){
						atualizarCalculo(varDisparoCerteiro, "DisparoCerteiro", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varTaticasDeSobrevivencia<1 && count<1){
						atualizarCalculo(varTaticasDeSobrevivencia, "TaticasDeSobrevivencia", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCamuflagem<1 && count<1){
						atualizarCalculo(varCamuflagem, "Camuflagem", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDisparoSelvagem, "DisparoSelvagem", 5, 4, "Aumentar");

				}
			});
			btPericiaComArmadilhaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaSonifera<1 && count<1){
						atualizarCalculo(varArmadilhaSonifera, "ArmadilhaSonifera", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaCongelante<1 && count<1){
						atualizarCalculo(varArmadilhaCongelante, "ArmadilhaCongelante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarMina<1 && count<1){
						atualizarCalculo(varInstalarMina, "InstalarMina", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<1 && count<1){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExtenuante<1 && count<1){
						atualizarCalculo(varArmadilhaExtenuante, "ArmadilhaExtenuante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExplosiva<1 && count<1){
						atualizarCalculo(varArmadilhaExplosiva, "ArmadilhaExplosiva", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArmadilha<1 && count<1){
						atualizarCalculo(varRemoverArmadilha, "RemoverArmadilha", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPericiaComArmadilha, "PericiaComArmadilha", 5, 4, "Aumentar");

				}
			});
			btDetonadorAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaSonifera<1 && count<1){
						atualizarCalculo(varArmadilhaSonifera, "ArmadilhaSonifera", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaCongelante<1 && count<1){
						atualizarCalculo(varArmadilhaCongelante, "ArmadilhaCongelante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarMina<1 && count<1){
						atualizarCalculo(varInstalarMina, "InstalarMina", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<1 && count<1){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExtenuante<1 && count<1){
						atualizarCalculo(varArmadilhaExtenuante, "ArmadilhaExtenuante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExplosiva<1 && count<1){
						atualizarCalculo(varArmadilhaExplosiva, "ArmadilhaExplosiva", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArmadilha<1 && count<1){
						atualizarCalculo(varRemoverArmadilha, "RemoverArmadilha", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComArmadilha<3 && count<3){
						atualizarCalculo(varPericiaComArmadilha, "PericiaComArmadilha", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBombaRelogio<3 && count<3){
						atualizarCalculo(varBombaRelogio, "BombaRelogio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDetonador, "Detonador", 1, 4, "Aumentar");

				}
			});
			btBombaRelogioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaSonifera<1 && count<1){
						atualizarCalculo(varArmadilhaSonifera, "ArmadilhaSonifera", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaCongelante<1 && count<1){
						atualizarCalculo(varArmadilhaCongelante, "ArmadilhaCongelante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarMina<1 && count<1){
						atualizarCalculo(varInstalarMina, "InstalarMina", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<1 && count<1){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExtenuante<1 && count<1){
						atualizarCalculo(varArmadilhaExtenuante, "ArmadilhaExtenuante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExplosiva<1 && count<1){
						atualizarCalculo(varArmadilhaExplosiva, "ArmadilhaExplosiva", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArmadilha<1 && count<1){
						atualizarCalculo(varRemoverArmadilha, "RemoverArmadilha", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComArmadilha<3 && count<3){
						atualizarCalculo(varPericiaComArmadilha, "PericiaComArmadilha", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBombaRelogio, "BombaRelogio", 5, 4, "Aumentar");

				}
			});
			btArmadilhaEnergizadaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<1 && count<1){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExtenuante<5 && count<5){
						atualizarCalculo(varArmadilhaExtenuante, "ArmadilhaExtenuante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArmadilhaEnergizada, "ArmadilhaEnergizada", 5, 4, "Aumentar");

				}
			});
			btArmadilhaIncendiariaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaSonifera<1 && count<1){
						atualizarCalculo(varArmadilhaSonifera, "ArmadilhaSonifera", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaCongelante<1 && count<1){
						atualizarCalculo(varArmadilhaCongelante, "ArmadilhaCongelante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarMina<1 && count<1){
						atualizarCalculo(varInstalarMina, "InstalarMina", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<1 && count<1){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExtenuante<1 && count<1){
						atualizarCalculo(varArmadilhaExtenuante, "ArmadilhaExtenuante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExplosiva<1 && count<1){
						atualizarCalculo(varArmadilhaExplosiva, "ArmadilhaExplosiva", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArmadilha<1 && count<1){
						atualizarCalculo(varRemoverArmadilha, "RemoverArmadilha", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComArmadilha<3 && count<3){
						atualizarCalculo(varPericiaComArmadilha, "PericiaComArmadilha", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBombaRelogio<3 && count<3){
						atualizarCalculo(varBombaRelogio, "BombaRelogio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDetonador<1 && count<1){
						atualizarCalculo(varDetonador, "Detonador", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArmadilhaIncendiaria, "ArmadilhaIncendiaria", 5, 4, "Aumentar");

				}
			});
			btArmadilhaGlacialAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaSonifera<1 && count<1){
						atualizarCalculo(varArmadilhaSonifera, "ArmadilhaSonifera", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaCongelante<1 && count<1){
						atualizarCalculo(varArmadilhaCongelante, "ArmadilhaCongelante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarMina<1 && count<1){
						atualizarCalculo(varInstalarMina, "InstalarMina", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<1 && count<1){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExtenuante<1 && count<1){
						atualizarCalculo(varArmadilhaExtenuante, "ArmadilhaExtenuante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExplosiva<1 && count<1){
						atualizarCalculo(varArmadilhaExplosiva, "ArmadilhaExplosiva", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArmadilha<1 && count<1){
						atualizarCalculo(varRemoverArmadilha, "RemoverArmadilha", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComArmadilha<3 && count<3){
						atualizarCalculo(varPericiaComArmadilha, "PericiaComArmadilha", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBombaRelogio<3 && count<3){
						atualizarCalculo(varBombaRelogio, "BombaRelogio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDetonador<1 && count<1){
						atualizarCalculo(varDetonador, "Detonador", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArmadilhaGlacial, "ArmadilhaGlacial", 5, 4, "Aumentar");

				}
			});
			btArmadilhaEscarlateAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaSonifera<1 && count<1){
						atualizarCalculo(varArmadilhaSonifera, "ArmadilhaSonifera", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaCongelante<1 && count<1){
						atualizarCalculo(varArmadilhaCongelante, "ArmadilhaCongelante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarMina<1 && count<1){
						atualizarCalculo(varInstalarMina, "InstalarMina", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<1 && count<1){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExtenuante<1 && count<1){
						atualizarCalculo(varArmadilhaExtenuante, "ArmadilhaExtenuante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExplosiva<1 && count<1){
						atualizarCalculo(varArmadilhaExplosiva, "ArmadilhaExplosiva", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArmadilha<1 && count<1){
						atualizarCalculo(varRemoverArmadilha, "RemoverArmadilha", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComArmadilha<1 && count<1){
						atualizarCalculo(varPericiaComArmadilha, "PericiaComArmadilha", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArmadilhaEscarlate, "ArmadilhaEscarlate", 1, 4, "Aumentar");

				}
			});
			btArmadilhaOcreAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaSonifera<1 && count<1){
						atualizarCalculo(varArmadilhaSonifera, "ArmadilhaSonifera", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaCongelante<1 && count<1){
						atualizarCalculo(varArmadilhaCongelante, "ArmadilhaCongelante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarMina<1 && count<1){
						atualizarCalculo(varInstalarMina, "InstalarMina", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<1 && count<1){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExtenuante<1 && count<1){
						atualizarCalculo(varArmadilhaExtenuante, "ArmadilhaExtenuante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExplosiva<1 && count<1){
						atualizarCalculo(varArmadilhaExplosiva, "ArmadilhaExplosiva", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArmadilha<1 && count<1){
						atualizarCalculo(varRemoverArmadilha, "RemoverArmadilha", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComArmadilha<1 && count<1){
						atualizarCalculo(varPericiaComArmadilha, "PericiaComArmadilha", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArmadilhaOcre, "ArmadilhaOcre", 1, 4, "Aumentar");

				}
			});
			btArmadilhaEsmeraldaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaSonifera<1 && count<1){
						atualizarCalculo(varArmadilhaSonifera, "ArmadilhaSonifera", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaCongelante<1 && count<1){
						atualizarCalculo(varArmadilhaCongelante, "ArmadilhaCongelante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarMina<1 && count<1){
						atualizarCalculo(varInstalarMina, "InstalarMina", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<1 && count<1){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExtenuante<1 && count<1){
						atualizarCalculo(varArmadilhaExtenuante, "ArmadilhaExtenuante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExplosiva<1 && count<1){
						atualizarCalculo(varArmadilhaExplosiva, "ArmadilhaExplosiva", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArmadilha<1 && count<1){
						atualizarCalculo(varRemoverArmadilha, "RemoverArmadilha", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComArmadilha<1 && count<1){
						atualizarCalculo(varPericiaComArmadilha, "PericiaComArmadilha", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArmadilhaEsmeralda, "ArmadilhaEsmeralda", 1, 4, "Aumentar");

				}
			});
			btArmadilhaCobaltoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaSonifera<1 && count<1){
						atualizarCalculo(varArmadilhaSonifera, "ArmadilhaSonifera", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaCongelante<1 && count<1){
						atualizarCalculo(varArmadilhaCongelante, "ArmadilhaCongelante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarMina<1 && count<1){
						atualizarCalculo(varInstalarMina, "InstalarMina", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaEscorregadia<1 && count<1){
						atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInstalarArmadilha<1 && count<1){
						atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExtenuante<1 && count<1){
						atualizarCalculo(varArmadilhaExtenuante, "ArmadilhaExtenuante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaExplosiva<1 && count<1){
						atualizarCalculo(varArmadilhaExplosiva, "ArmadilhaExplosiva", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaAtordoante<1 && count<1){
						atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArmadilha<1 && count<1){
						atualizarCalculo(varRemoverArmadilha, "RemoverArmadilha", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComArmadilha<1 && count<1){
						atualizarCalculo(varPericiaComArmadilha, "PericiaComArmadilha", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArmadilhaCobalto, "ArmadilhaCobalto", 1, 4, "Aumentar");

				}
			});
			btAdestrarWorgAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAdestrarWorg, "AdestrarWorg", 1, 4, "Aumentar");

				}
			});
			btMontariaEmWorgAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAdestrarWorg<1 && count<1){
						atualizarCalculo(varAdestrarWorg, "AdestrarWorg", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMontariaEmWorg, "MontariaEmWorg", 3, 4, "Aumentar");

				}
			});
			btPresasAfiadasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAdestrarWorg<1 && count<1){
						atualizarCalculo(varAdestrarWorg, "AdestrarWorg", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPresasAfiadas, "PresasAfiadas", 10, 4, "Aumentar");

				}
			});
			btFaroAgucadoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAdestrarWorg<1 && count<1){
						atualizarCalculo(varAdestrarWorg, "AdestrarWorg", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPresasAfiadas<3 && count<3){
						atualizarCalculo(varPresasAfiadas, "PresasAfiadas", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFaroAgucado, "FaroAgucado", 5, 4, "Aumentar");

				}
			});
			btAssaltoDeWorgAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAdestrarWorg<1 && count<1){
						atualizarCalculo(varAdestrarWorg, "AdestrarWorg", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMontariaEmWorg<1 && count<1){
						atualizarCalculo(varMontariaEmWorg, "MontariaEmWorg", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAssaltoDeWorg, "AssaltoDeWorg", 1, 4, "Aumentar");

				}
			});
			btMordidaFerozAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAdestrarWorg<1 && count<1){
						atualizarCalculo(varAdestrarWorg, "AdestrarWorg", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPresasAfiadas<1 && count<1){
						atualizarCalculo(varPresasAfiadas, "PresasAfiadas", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvestidaDeWorg<1 && count<1){
						atualizarCalculo(varInvestidaDeWorg, "InvestidaDeWorg", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMordidaFeroz, "MordidaFeroz", 5, 4, "Aumentar");

				}
			});
			btInvestidaDeWorgAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAdestrarWorg<1 && count<1){
						atualizarCalculo(varAdestrarWorg, "AdestrarWorg", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPresasAfiadas<1 && count<1){
						atualizarCalculo(varPresasAfiadas, "PresasAfiadas", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInvestidaDeWorg, "InvestidaDeWorg", 5, 4, "Aumentar");

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
			btArmadilhaEscorregadiaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Diminuir");

				}
			});
			btArmadilhaAtordoanteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaAtordoante, "ArmadilhaAtordoante", 5, 2, "Diminuir");

				}
			});
			btInstalarArmadilhaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInstalarArmadilha, "InstalarArmadilha", 5, 2, "Diminuir");

				}
			});
			btArmadilhaLuminosaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Diminuir");

				}
			});
			btArmadilhaExtenuanteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaExtenuante, "ArmadilhaExtenuante", 5, 2, "Diminuir");

				}
			});
			btArmadilhaSoniferaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaSonifera, "ArmadilhaSonifera", 5, 2, "Diminuir");

				}
			});
			btArmadilhaCongelanteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaCongelante, "ArmadilhaCongelante", 5, 2, "Diminuir");

				}
			});
			btInstalarMinaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInstalarMina, "InstalarMina", 5, 2, "Diminuir");

				}
			});
			btArmadilhaExplosivaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaExplosiva, "ArmadilhaExplosiva", 5, 2, "Diminuir");

				}
			});
			btRemoverArmadilhaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRemoverArmadilha, "RemoverArmadilha", 1, 2, "Diminuir");

				}
			});
			btFlageloDasFerasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFlageloDasFeras, "FlageloDasFeras", 10, 2, "Diminuir");

				}
			});
			btAdestrarFalcaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAdestrarFalcao, "AdestrarFalcao", 1, 2, "Diminuir");

				}
			});
			btAtaqueAereoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtaqueAereo, "AtaqueAereo", 5, 2, "Diminuir");

				}
			});
			btGarrasDeAcoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGarrasDeAco, "GarrasDeAco", 10, 2, "Diminuir");

				}
			});
			btAlertaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAlerta, "Alerta", 4, 2, "Diminuir");

				}
			});
			btDesativarArmadilhaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDesativarArmadilha, "DesativarArmadilha", 5, 2, "Diminuir");

				}
			});
			btMensagemSecretaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMensagemSecreta, "MensagemSecreta", 1, 2, "Diminuir");

				}
			});
			btAssaltoDoFalcaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAssaltoDoFalcao, "AssaltoDoFalcao", 5, 3, "Diminuir");

				}
			});
			btTiroPrecisoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTiroPreciso, "TiroPreciso", 5, 3, "Diminuir");

				}
			});
			btCaminhoDoVentoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCaminhoDoVento, "CaminhoDoVento", 10, 3, "Diminuir");

				}
			});
			btVisaoRealDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varVisaoReal, "VisaoReal", 10, 3, "Diminuir");

				}
			});
			btTaticasDeSobrevivenciaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTaticasDeSobrevivencia, "TaticasDeSobrevivencia", 10, 4, "Diminuir");

				}
			});
			btCamuflagemDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCamuflagem, "Camuflagem", 5, 4, "Diminuir");

				}
			});
			btDisparoCerteiroDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDisparoCerteiro, "DisparoCerteiro", 10, 4, "Diminuir");

				}
			});
			btTempestadeDeFlechasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTempestadeDeFlechas, "TempestadeDeFlechas", 10, 4, "Diminuir");

				}
			});
			btDisparoSelvagemDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDisparoSelvagem, "DisparoSelvagem", 5, 4, "Diminuir");

				}
			});
			btPericiaComArmadilhaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComArmadilha, "PericiaComArmadilha", 5, 4, "Diminuir");

				}
			});
			btDetonadorDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDetonador, "Detonador", 1, 4, "Diminuir");

				}
			});
			btBombaRelogioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBombaRelogio, "BombaRelogio", 5, 4, "Diminuir");

				}
			});
			btArmadilhaEnergizadaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaEnergizada, "ArmadilhaEnergizada", 5, 4, "Diminuir");

				}
			});
			btArmadilhaIncendiariaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaIncendiaria, "ArmadilhaIncendiaria", 5, 4, "Diminuir");

				}
			});
			btArmadilhaGlacialDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaGlacial, "ArmadilhaGlacial", 5, 4, "Diminuir");

				}
			});
			btArmadilhaEscarlateDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaEscarlate, "ArmadilhaEscarlate", 1, 4, "Diminuir");

				}
			});
			btArmadilhaOcreDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaOcre, "ArmadilhaOcre", 1, 4, "Diminuir");

				}
			});
			btArmadilhaEsmeraldaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaEsmeralda, "ArmadilhaEsmeralda", 1, 4, "Diminuir");

				}
			});
			btArmadilhaCobaltoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaCobalto, "ArmadilhaCobalto", 1, 4, "Diminuir");

				}
			});
			btAdestrarWorgDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAdestrarWorg, "AdestrarWorg", 1, 4, "Diminuir");

				}
			});
			btMontariaEmWorgDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMontariaEmWorg, "MontariaEmWorg", 3, 4, "Diminuir");

				}
			});
			btPresasAfiadasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPresasAfiadas, "PresasAfiadas", 10, 4, "Diminuir");

				}
			});
			btFaroAgucadoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFaroAgucado, "FaroAgucado", 5, 4, "Diminuir");

				}
			});
			btAssaltoDeWorgDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAssaltoDeWorg, "AssaltoDeWorg", 1, 4, "Diminuir");

				}
			});
			btMordidaFerozDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMordidaFeroz, "MordidaFeroz", 5, 4, "Diminuir");

				}
			});
			btInvestidaDeWorgDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInvestidaDeWorg, "InvestidaDeWorg", 5, 4, "Diminuir");

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
					varArmadilhaEscorregadia = 0;
					varArmadilhaAtordoante = 0;
					varInstalarArmadilha = 0;
					varArmadilhaLuminosa = 0;
					varArmadilhaExtenuante = 0;
					varArmadilhaSonifera = 0;
					varArmadilhaCongelante = 0;
					varInstalarMina = 0;
					varArmadilhaExplosiva = 0;
					varRemoverArmadilha = 0;
					varFlageloDasFeras = 0;
					varAdestrarFalcao = 0;
					varAtaqueAereo = 0;
					varGarrasDeAco = 0;
					varAlerta = 0;
					varDesativarArmadilha = 0;
					varMensagemSecreta = 0;
					varAssaltoDoFalcao = 0;
					varTiroPreciso = 0;
					varCaminhoDoVento = 0;
					varVisaoReal = 0;
					varTaticasDeSobrevivencia = 0;
					varCamuflagem = 0;
					varDisparoCerteiro = 0;
					varTempestadeDeFlechas = 0;
					varDisparoSelvagem = 0;
					varPericiaComArmadilha = 0;
					varDetonador = 0;
					varBombaRelogio = 0;
					varArmadilhaEnergizada = 0;
					varArmadilhaIncendiaria = 0;
					varArmadilhaGlacial = 0;
					varArmadilhaEscarlate = 0;
					varArmadilhaOcre = 0;
					varArmadilhaEsmeralda = 0;
					varArmadilhaCobalto = 0;
					varAdestrarWorg = 0;
					varMontariaEmWorg = 0;
					varPresasAfiadas = 0;
					varFaroAgucado = 0;
					varAssaltoDeWorg = 0;
					varMordidaFeroz = 0;
					varInvestidaDeWorg = 0;

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
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorSentinela.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorSentinela.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorSentinela.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorSentinela.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorSentinela.this);
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

					AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorSentinela.this);
					msg.setTitle("Escolha um nome");
					msg.setMessage("OBS: Salvar PNG só irá salvar em forma de imagem! É recomendado que salve a build na memória do celular também.\nEscolha um nome para salvar esta simulação:");
					final EditText nomeParaSalvar = new EditText(SimuladorSentinela.this);
					msg.setView(nomeParaSalvar);
					msg.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {

							@Override
						public void onClick(DialogInterface dialog, int which) {
							if (nomeParaSalvar.getText().toString().length() <= 0) {
								nomeParaSalvar.setError("Preencha o campo!");
								Toast.makeText(getBaseContext(), "ERROR: Insira um nome!", Toast.LENGTH_SHORT).show();
							} else {
								SaveFile sf = new SaveFile();
								sf.takeAScreenShot(SimuladorSentinela.this, layPrincipal, nomeParaSalvar.getText().toString());
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

			if(varArmadilhaEscorregadia==0)
				layArmadilhaEscorregadia.setVisibility(View.GONE);
			if(varArmadilhaAtordoante==0)
				layArmadilhaAtordoante.setVisibility(View.GONE);
			if(varInstalarArmadilha==0)
				layInstalarArmadilha.setVisibility(View.GONE);
			if(varArmadilhaLuminosa==0)
				layArmadilhaLuminosa.setVisibility(View.GONE);
			if(varArmadilhaExtenuante==0)
				layArmadilhaExtenuante.setVisibility(View.GONE);
			if(varArmadilhaSonifera==0)
				layArmadilhaSonifera.setVisibility(View.GONE);
			if(varArmadilhaCongelante==0)
				layArmadilhaCongelante.setVisibility(View.GONE);
			if(varInstalarMina==0)
				layInstalarMina.setVisibility(View.GONE);
			if(varArmadilhaExplosiva==0)
				layArmadilhaExplosiva.setVisibility(View.GONE);
			if(varRemoverArmadilha==0)
				layRemoverArmadilha.setVisibility(View.GONE);
			if(varFlageloDasFeras==0)
				layFlageloDasFeras.setVisibility(View.GONE);
			if(varAdestrarFalcao==0)
				layAdestrarFalcao.setVisibility(View.GONE);
			if(varAtaqueAereo==0)
				layAtaqueAereo.setVisibility(View.GONE);
			if(varGarrasDeAco==0)
				layGarrasDeAco.setVisibility(View.GONE);
			if(varAlerta==0)
				layAlerta.setVisibility(View.GONE);
			if(varDesativarArmadilha==0)
				layDesativarArmadilha.setVisibility(View.GONE);
			if(varMensagemSecreta==0)
				layMensagemSecreta.setVisibility(View.GONE);

			if(varAssaltoDoFalcao==0)
				layAssaltoDoFalcao.setVisibility(View.GONE);
			if(varTiroPreciso==0)
				layTiroPreciso.setVisibility(View.GONE);
			if(varCaminhoDoVento==0)
				layCaminhoDoVento.setVisibility(View.GONE);
			if(varVisaoReal==0)
				layVisaoReal.setVisibility(View.GONE);

			if(varTaticasDeSobrevivencia==0)
				layTaticasDeSobrevivencia.setVisibility(View.GONE);
			if(varCamuflagem==0)
				layCamuflagem.setVisibility(View.GONE);
			if(varDisparoCerteiro==0)
				layDisparoCerteiro.setVisibility(View.GONE);
			if(varTempestadeDeFlechas==0)
				layTempestadeDeFlechas.setVisibility(View.GONE);
			if(varDisparoSelvagem==0)
				layDisparoSelvagem.setVisibility(View.GONE);
			if(varPericiaComArmadilha==0)
				layPericiaComArmadilha.setVisibility(View.GONE);
			if(varDetonador==0)
				layDetonador.setVisibility(View.GONE);
			if(varBombaRelogio==0)
				layBombaRelogio.setVisibility(View.GONE);
			if(varArmadilhaEnergizada==0)
				layArmadilhaEnergizada.setVisibility(View.GONE);
			if(varArmadilhaIncendiaria==0)
				layArmadilhaIncendiaria.setVisibility(View.GONE);
			if(varArmadilhaGlacial==0)
				layArmadilhaGlacial.setVisibility(View.GONE);
			if(varArmadilhaEscarlate==0)
				layArmadilhaEscarlate.setVisibility(View.GONE);
			if(varArmadilhaOcre==0)
				layArmadilhaOcre.setVisibility(View.GONE);
			if(varArmadilhaEsmeralda==0)
				layArmadilhaEsmeralda.setVisibility(View.GONE);
			if(varArmadilhaCobalto==0)
				layArmadilhaCobalto.setVisibility(View.GONE);
			if(varAdestrarWorg==0)
				layAdestrarWorg.setVisibility(View.GONE);
			if(varMontariaEmWorg==0)
				layMontariaEmWorg.setVisibility(View.GONE);
			if(varPresasAfiadas==0)
				layPresasAfiadas.setVisibility(View.GONE);
			if(varFaroAgucado==0)
				layFaroAgucado.setVisibility(View.GONE);
			if(varAssaltoDeWorg==0)
				layAssaltoDeWorg.setVisibility(View.GONE);
			if(varMordidaFeroz==0)
				layMordidaFeroz.setVisibility(View.GONE);
			if(varInvestidaDeWorg==0)
				layInvestidaDeWorg.setVisibility(View.GONE);

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

				if (nomeDaHabilidade=="ArmadilhaEscorregadia" && varInstalarArmadilha>=1 && varArmadilhaEscorregadia<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaEscorregadia" && varArmadilhaLuminosa>=1 && varArmadilhaEscorregadia<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InstalarArmadilha" && varArmadilhaExtenuante>=1 && varInstalarArmadilha<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaLuminosa" && varArmadilhaSonifera>=1 && varArmadilhaLuminosa<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaEscorregadia" && varArmadilhaCongelante>=1 && varArmadilhaEscorregadia<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaLuminosa" && varArmadilhaCongelante>=1 && varArmadilhaLuminosa<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaAtordoante" && varInstalarMina>=1 && varArmadilhaAtordoante<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaSonifera" && varInstalarMina>=1 && varArmadilhaSonifera<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaCongelante" && varInstalarMina>=1 && varArmadilhaCongelante<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InstalarMina" && varArmadilhaExplosiva>=1 && varInstalarMina<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaExtenuante" && varArmadilhaExplosiva>=1 && varArmadilhaExtenuante<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaAtordoante" && varRemoverArmadilha>=1 && varArmadilhaAtordoante<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FlageloDasFeras" && varAdestrarFalcao>=1 && varFlageloDasFeras<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FlageloDasFeras" && varAtaqueAereo>=1 && varFlageloDasFeras<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AdestrarFalcao" && varAtaqueAereo>=1 && varAdestrarFalcao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtaqueAereo" && varGarrasDeAco>=1 && varAtaqueAereo<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Concentracao" && varAlerta>=1 && varConcentracao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AdestrarFalcao" && varAlerta>=1 && varAdestrarFalcao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RemoverArmadilha" && varDesativarArmadilha>=1 && varRemoverArmadilha<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AdestrarFalcao" && varDesativarArmadilha>=1 && varAdestrarFalcao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InstalarArmadilha" && varMensagemSecreta>=1 && varInstalarArmadilha<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaExtenuante" && varMensagemSecreta>=1 && varArmadilhaExtenuante<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OlhosDeAguia" && varAssaltoDoFalcao>=1 && varOlhosDeAguia<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="GarrasDeAco" && varAssaltoDoFalcao>=1 && varGarrasDeAco<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RajadaDeFlechas" && varTiroPreciso>=1 && varRajadaDeFlechas<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Concentracao" && varTiroPreciso>=1 && varConcentracao<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Concentracao" && varCaminhoDoVento>=1 && varConcentracao<=9){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Concentracao" && varVisaoReal>=1 && varConcentracao<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OlhosDeAguia" && varVisaoReal>=1 && varOlhosDeAguia<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Precisao" && varVisaoReal>=1 && varPrecisao<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AdestrarFalcao" && varVisaoReal>=1 && varAdestrarFalcao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TaticasDeSobrevivencia" && varCamuflagem>=1 && varTaticasDeSobrevivencia<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaEscorregadia" && varDisparoCerteiro>=1 && varArmadilhaEscorregadia<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InstalarArmadilha" && varDisparoCerteiro>=1 && varInstalarArmadilha<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DisparoCerteiro" && varTempestadeDeFlechas>=1 && varDisparoCerteiro<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InstalarArmadilha" && varDisparoSelvagem>=1 && varInstalarArmadilha<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaEscorregadia" && varDisparoSelvagem>=1 && varArmadilhaEscorregadia<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TempestadeDeFlechas" && varDisparoSelvagem>=1 && varTempestadeDeFlechas<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DisparoCerteiro" && varDisparoSelvagem>=1 && varDisparoCerteiro<=05){
					podeDiminuir = false;
				}
				
				if (nomeDaHabilidade=="Camuflagem" && varDisparoSelvagem>=1 && varCamuflagem<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaExplosiva" && varPericiaComArmadilha>=1 && varArmadilhaExplosiva<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RemoverArmadilha" && varPericiaComArmadilha>=1 && varRemoverArmadilha<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="BombaRelogio" && varDetonador>=1 && varBombaRelogio<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaComArmadilha" && varBombaRelogio>=1 && varPericiaComArmadilha<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaExtenuante" && varArmadilhaEnergizada>=1 && varArmadilhaExtenuante<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Detonador" && varArmadilhaIncendiaria>=1 && varDetonador<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Detonador" && varArmadilhaGlacial>=1 && varDetonador<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaComArmadilha" && varArmadilhaEscarlate>=1 && varPericiaComArmadilha<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaComArmadilha" && varArmadilhaOcre>=1 && varPericiaComArmadilha<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaComArmadilha" && varArmadilhaEsmeralda>=1 && varPericiaComArmadilha<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaComArmadilha" && varArmadilhaCobalto>=1 && varPericiaComArmadilha<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AdestrarWorg" && varMontariaEmWorg>=1 && varAdestrarWorg<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AdestrarWorg" && varPresasAfiadas>=1 && varAdestrarWorg<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PresasAfiadas" && varFaroAgucado>=1 && varPresasAfiadas<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MontariaEmWorg" && varAssaltoDeWorg>=1 && varMontariaEmWorg<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InvestidaDeWorg" && varMordidaFeroz>=1 && varInvestidaDeWorg<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PresasAfiadas" && varInvestidaDeWorg>=1 && varPresasAfiadas<=01){
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

			else if(nomeDaHabilidade=="ArmadilhaEscorregadia"){
				varArmadilhaEscorregadia = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaAtordoante"){
				varArmadilhaAtordoante = habilidade;
			} else if(nomeDaHabilidade=="InstalarArmadilha"){
				varInstalarArmadilha = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaLuminosa"){
				varArmadilhaLuminosa = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaExtenuante"){
				varArmadilhaExtenuante = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaSonifera"){
				varArmadilhaSonifera = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaCongelante"){
				varArmadilhaCongelante = habilidade;
			} else if(nomeDaHabilidade=="InstalarMina"){
				varInstalarMina = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaExplosiva"){
				varArmadilhaExplosiva = habilidade;
			} else if(nomeDaHabilidade=="RemoverArmadilha"){
				varRemoverArmadilha = habilidade;
			} else if(nomeDaHabilidade=="FlageloDasFeras"){
				varFlageloDasFeras = habilidade;
			} else if(nomeDaHabilidade=="AdestrarFalcao"){
				varAdestrarFalcao = habilidade;
			} else if(nomeDaHabilidade=="AtaqueAereo"){
				varAtaqueAereo = habilidade;
			} else if(nomeDaHabilidade=="GarrasDeAco"){
				varGarrasDeAco = habilidade;
			} else if(nomeDaHabilidade=="Alerta"){
				varAlerta = habilidade;
			} else if(nomeDaHabilidade=="DesativarArmadilha"){
				varDesativarArmadilha = habilidade;
			} else if(nomeDaHabilidade=="MensagemSecreta"){
				varMensagemSecreta = habilidade;
			}

			else if(nomeDaHabilidade=="AssaltoDoFalcao"){
				varAssaltoDoFalcao = habilidade;
			} else if(nomeDaHabilidade=="TiroPreciso"){
				varTiroPreciso = habilidade;
			} else if(nomeDaHabilidade=="CaminhoDoVento"){
				varCaminhoDoVento = habilidade;
			} else if(nomeDaHabilidade=="VisaoReal"){
				varVisaoReal = habilidade;
			}

			else if(nomeDaHabilidade=="TaticasDeSobrevivencia"){
				varTaticasDeSobrevivencia = habilidade;
			} else if(nomeDaHabilidade=="Camuflagem"){
				varCamuflagem = habilidade;
			} else if(nomeDaHabilidade=="DisparoCerteiro"){
				varDisparoCerteiro = habilidade;
			} else if(nomeDaHabilidade=="TempestadeDeFlechas"){
				varTempestadeDeFlechas = habilidade;
			} else if(nomeDaHabilidade=="DisparoSelvagem"){
				varDisparoSelvagem = habilidade;
			} else if(nomeDaHabilidade=="PericiaComArmadilha"){
				varPericiaComArmadilha = habilidade;
			} else if(nomeDaHabilidade=="Detonador"){
				varDetonador = habilidade;
			} else if(nomeDaHabilidade=="BombaRelogio"){
				varBombaRelogio = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaEnergizada"){
				varArmadilhaEnergizada = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaIncendiaria"){
				varArmadilhaIncendiaria = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaGlacial"){
				varArmadilhaGlacial = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaEscarlate"){
				varArmadilhaEscarlate = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaOcre"){
				varArmadilhaOcre = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaEsmeralda"){
				varArmadilhaEsmeralda = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaCobalto"){
				varArmadilhaCobalto = habilidade;
			} else if(nomeDaHabilidade=="AdestrarWorg"){
				varAdestrarWorg = habilidade;
			} else if(nomeDaHabilidade=="MontariaEmWorg"){
				varMontariaEmWorg = habilidade;
			} else if(nomeDaHabilidade=="PresasAfiadas"){
				varPresasAfiadas = habilidade;
			} else if(nomeDaHabilidade=="FaroAgucado"){
				varFaroAgucado = habilidade;
			} else if(nomeDaHabilidade=="AssaltoDeWorg"){
				varAssaltoDeWorg = habilidade;
			} else if(nomeDaHabilidade=="MordidaFeroz"){
				varMordidaFeroz = habilidade;
			} else if(nomeDaHabilidade=="InvestidaDeWorg"){
				varInvestidaDeWorg = habilidade;
			}

			atualizarTela();

		}

		public void atualizarTela(){
			txtRajadaDeFlechasPontos.setText(varRajadaDeFlechas + "/10");
			txtChuvaDeFlechasPontos.setText(varChuvaDeFlechas + "/10");
			txtOlhosDeAguiaPontos.setText(varOlhosDeAguia + "/10");
			txtPrecisaoPontos.setText(varPrecisao + "/10");
			txtConcentracaoPontos.setText(varConcentracao + "/10");

			txtArmadilhaEscorregadiaPontos.setText(varArmadilhaEscorregadia + "/5");
			txtArmadilhaAtordoantePontos.setText(varArmadilhaAtordoante + "/5");
			txtInstalarArmadilhaPontos.setText(varInstalarArmadilha + "/5");
			txtArmadilhaLuminosaPontos.setText(varArmadilhaLuminosa + "/5");
			txtArmadilhaExtenuantePontos.setText(varArmadilhaExtenuante + "/5");
			txtArmadilhaSoniferaPontos.setText(varArmadilhaSonifera + "/5");
			txtArmadilhaCongelantePontos.setText(varArmadilhaCongelante + "/5");
			txtInstalarMinaPontos.setText(varInstalarMina + "/5");
			txtArmadilhaExplosivaPontos.setText(varArmadilhaExplosiva + "/5");
			txtRemoverArmadilhaPontos.setText(varRemoverArmadilha + "/1");
			txtFlageloDasFerasPontos.setText(varFlageloDasFeras + "/10");
			txtAdestrarFalcaoPontos.setText(varAdestrarFalcao + "/1");
			txtAtaqueAereoPontos.setText(varAtaqueAereo + "/5");
			txtGarrasDeAcoPontos.setText(varGarrasDeAco + "/10");
			txtAlertaPontos.setText(varAlerta + "/4");
			txtDesativarArmadilhaPontos.setText(varDesativarArmadilha + "/5");
			txtMensagemSecretaPontos.setText(varMensagemSecreta + "/1");

			txtAssaltoDoFalcaoPontos.setText(varAssaltoDoFalcao + "/5");
			txtTiroPrecisoPontos.setText(varTiroPreciso + "/5");
			txtCaminhoDoVentoPontos.setText(varCaminhoDoVento + "/10");
			txtVisaoRealPontos.setText(varVisaoReal + "/10");

			txtTaticasDeSobrevivenciaPontos.setText(varTaticasDeSobrevivencia + "/10");
			txtCamuflagemPontos.setText(varCamuflagem + "/5");
			txtDisparoCerteiroPontos.setText(varDisparoCerteiro + "/10");
			txtTempestadeDeFlechasPontos.setText(varTempestadeDeFlechas + "/10");
			txtDisparoSelvagemPontos.setText(varDisparoSelvagem + "/5");
			txtPericiaComArmadilhaPontos.setText(varPericiaComArmadilha + "/5");
			txtDetonadorPontos.setText(varDetonador + "/1");
			txtBombaRelogioPontos.setText(varBombaRelogio + "/5");
			txtArmadilhaEnergizadaPontos.setText(varArmadilhaEnergizada + "/5");
			txtArmadilhaIncendiariaPontos.setText(varArmadilhaIncendiaria + "/5");
			txtArmadilhaGlacialPontos.setText(varArmadilhaGlacial + "/5");
			txtArmadilhaEscarlatePontos.setText(varArmadilhaEscarlate + "/1");
			txtArmadilhaOcrePontos.setText(varArmadilhaOcre + "/1");
			txtArmadilhaEsmeraldaPontos.setText(varArmadilhaEsmeralda + "/1");
			txtArmadilhaCobaltoPontos.setText(varArmadilhaCobalto + "/1");
			txtAdestrarWorgPontos.setText(varAdestrarWorg + "/1");
			txtMontariaEmWorgPontos.setText(varMontariaEmWorg + "/3");
			txtPresasAfiadasPontos.setText(varPresasAfiadas + "/10");
			txtFaroAgucadoPontos.setText(varFaroAgucado + "/5");
			txtAssaltoDeWorgPontos.setText(varAssaltoDeWorg + "/1");
			txtMordidaFerozPontos.setText(varMordidaFeroz + "/5");
			txtInvestidaDeWorgPontos.setText(varInvestidaDeWorg + "/5");

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

			layArmadilhaEscorregadia.setVisibility(View.VISIBLE);
			layArmadilhaAtordoante.setVisibility(View.VISIBLE);
			layInstalarArmadilha.setVisibility(View.VISIBLE);
			layArmadilhaLuminosa.setVisibility(View.VISIBLE);
			layArmadilhaExtenuante.setVisibility(View.VISIBLE);
			layArmadilhaSonifera.setVisibility(View.VISIBLE);
			layArmadilhaCongelante.setVisibility(View.VISIBLE);
			layInstalarMina.setVisibility(View.VISIBLE);
			layArmadilhaExplosiva.setVisibility(View.VISIBLE);
			layRemoverArmadilha.setVisibility(View.VISIBLE);
			layFlageloDasFeras.setVisibility(View.VISIBLE);
			layAdestrarFalcao.setVisibility(View.VISIBLE);
			layAtaqueAereo.setVisibility(View.VISIBLE);
			layGarrasDeAco.setVisibility(View.VISIBLE);
			layAlerta.setVisibility(View.VISIBLE);
			layDesativarArmadilha.setVisibility(View.VISIBLE);
			layMensagemSecreta.setVisibility(View.VISIBLE);

			layAssaltoDoFalcao.setVisibility(View.VISIBLE);
			layTiroPreciso.setVisibility(View.VISIBLE);
			layCaminhoDoVento.setVisibility(View.VISIBLE);
			layVisaoReal.setVisibility(View.VISIBLE);

			layTaticasDeSobrevivencia.setVisibility(View.VISIBLE);
			layCamuflagem.setVisibility(View.VISIBLE);
			layDisparoCerteiro.setVisibility(View.VISIBLE);
			layTempestadeDeFlechas.setVisibility(View.VISIBLE);
			layDisparoSelvagem.setVisibility(View.VISIBLE);
			layPericiaComArmadilha.setVisibility(View.VISIBLE);
			layDetonador.setVisibility(View.VISIBLE);
			layBombaRelogio.setVisibility(View.VISIBLE);
			layArmadilhaEnergizada.setVisibility(View.VISIBLE);
			layArmadilhaIncendiaria.setVisibility(View.VISIBLE);
			layArmadilhaGlacial.setVisibility(View.VISIBLE);
			layArmadilhaEscarlate.setVisibility(View.VISIBLE);
			layArmadilhaOcre.setVisibility(View.VISIBLE);
			layArmadilhaEsmeralda.setVisibility(View.VISIBLE);
			layArmadilhaCobalto.setVisibility(View.VISIBLE);
			layAdestrarWorg.setVisibility(View.VISIBLE);
			layMontariaEmWorg.setVisibility(View.VISIBLE);
			layPresasAfiadas.setVisibility(View.VISIBLE);
			layFaroAgucado.setVisibility(View.VISIBLE);
			layAssaltoDeWorg.setVisibility(View.VISIBLE);
			layMordidaFeroz.setVisibility(View.VISIBLE);
			layInvestidaDeWorg.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM sentinela WHERE _id = ?", new String[]{String.valueOf(id)});

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

			varArmadilhaEscorregadia = cs.getInt(11);
			varArmadilhaAtordoante = cs.getInt(12);
			varInstalarArmadilha = cs.getInt(13);
			varArmadilhaLuminosa = cs.getInt(14);
			varArmadilhaExtenuante = cs.getInt(15);
			varArmadilhaSonifera = cs.getInt(16);
			varArmadilhaCongelante = cs.getInt(17);
			varInstalarMina = cs.getInt(18);
			varArmadilhaExplosiva = cs.getInt(19);
			varRemoverArmadilha = cs.getInt(20);
			varFlageloDasFeras = cs.getInt(21);
			varAdestrarFalcao = cs.getInt(22);
			varAtaqueAereo = cs.getInt(23);
			varGarrasDeAco = cs.getInt(24);
			varAlerta = cs.getInt(25);
			varDesativarArmadilha = cs.getInt(26);
			varMensagemSecreta = cs.getInt(27);

			varAssaltoDoFalcao = cs.getInt(28);
			varTiroPreciso = cs.getInt(29);
			varCaminhoDoVento = cs.getInt(30);
			varVisaoReal = cs.getInt(31);

			varTaticasDeSobrevivencia = cs.getInt(32);
			varCamuflagem = cs.getInt(33);
			varDisparoCerteiro = cs.getInt(34);
			varTempestadeDeFlechas = cs.getInt(35);
			varDisparoSelvagem = cs.getInt(36);
			varPericiaComArmadilha = cs.getInt(37);
			varDetonador = cs.getInt(38);
			varBombaRelogio = cs.getInt(39);
			varArmadilhaEnergizada = cs.getInt(40);
			varArmadilhaIncendiaria = cs.getInt(41);
			varArmadilhaGlacial = cs.getInt(42);
			varArmadilhaEscarlate = cs.getInt(43);
			varArmadilhaOcre = cs.getInt(44);
			varArmadilhaEsmeralda = cs.getInt(45);
			varArmadilhaCobalto = cs.getInt(46);
			varAdestrarWorg = cs.getInt(47);
			varMontariaEmWorg = cs.getInt(48);
			varPresasAfiadas = cs.getInt(49);
			varFaroAgucado = cs.getInt(50);
			varAssaltoDeWorg = cs.getInt(51);
			varMordidaFeroz = cs.getInt(52);
			varInvestidaDeWorg = cs.getInt(53);

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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS sentinela (");
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
					sqlClasse.append("skill_armadilhaescorregadia INT(2), ");
					sqlClasse.append("skill_armadilhaatordoante INT(2), ");
					sqlClasse.append("skill_instalararmadilha INT(2), ");
					sqlClasse.append("skill_armadilhaluminosa INT(2), ");
					sqlClasse.append("skill_armadilhaextenuante INT(2), ");
					sqlClasse.append("skill_armadilhasonifera INT(2), ");
					sqlClasse.append("skill_armadilhacongelante INT(2), ");
					sqlClasse.append("skill_instalarmina INT(2), ");
					sqlClasse.append("skill_armadilhaexplosiva INT(2), ");
					sqlClasse.append("skill_removerarmadilha INT(2), ");
					sqlClasse.append("skill_flagelodasferas INT(2), ");
					sqlClasse.append("skill_adestrarfalcao INT(2), ");
					sqlClasse.append("skill_ataqueaereo INT(2), ");
					sqlClasse.append("skill_garrasdeaco INT(2), ");
					sqlClasse.append("skill_alerta INT(2), ");
					sqlClasse.append("skill_desativararmadilha INT(2), ");
					sqlClasse.append("skill_mensagemsecreta INT(2), ");
					sqlClasse.append("skill_assaltodofalcao INT(2), ");
					sqlClasse.append("skill_tiropreciso INT(2), ");
					sqlClasse.append("skill_caminhodovento INT(2), ");
					sqlClasse.append("skill_visaoreal INT(2), ");
					sqlClasse.append("skill_taticasdesobrevivencia INT(2), ");
					sqlClasse.append("skill_camuflagem INT(2), ");
					sqlClasse.append("skill_disparocerteiro INT(2), ");
					sqlClasse.append("skill_tempestadedeflechas INT(2), ");
					sqlClasse.append("skill_disparoselvagem INT(2), ");
					sqlClasse.append("skill_periciacomarmadilha INT(2), ");
					sqlClasse.append("skill_detonador INT(2), ");
					sqlClasse.append("skill_bombarelogio INT(2), ");
					sqlClasse.append("skill_armadilhaenergizada INT(2), ");
					sqlClasse.append("skill_armadilhaincendiaria INT(2), ");
					sqlClasse.append("skill_armadilhaglacial INT(2), ");
					sqlClasse.append("skill_armadilhaescarlate INT(2), ");
					sqlClasse.append("skill_armadilhaocre INT(2), ");
					sqlClasse.append("skill_armadilhaesmeralda INT(2), ");
					sqlClasse.append("skill_armadilhacobalto INT(2), ");
					sqlClasse.append("skill_adestrarworg INT(2), ");
					sqlClasse.append("skill_montariaemworg INT(2), ");
					sqlClasse.append("skill_presasafiadas INT(2), ");
					sqlClasse.append("skill_faroagucado INT(2), ");
					sqlClasse.append("skill_assaltodeworg INT(2), ");
					sqlClasse.append("skill_mordidaferoz INT(2), ");
					sqlClasse.append("skill_investidadeworg INT(2), ");
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
					ins.put("skill_armadilhaescorregadia", varArmadilhaEscorregadia);
					ins.put("skill_armadilhaatordoante", varArmadilhaAtordoante);
					ins.put("skill_instalararmadilha", varInstalarArmadilha);
					ins.put("skill_armadilhaluminosa", varArmadilhaLuminosa);
					ins.put("skill_armadilhaextenuante", varArmadilhaExtenuante);
					ins.put("skill_armadilhasonifera", varArmadilhaSonifera);
					ins.put("skill_armadilhacongelante", varArmadilhaCongelante);
					ins.put("skill_instalarmina", varInstalarMina);
					ins.put("skill_armadilhaexplosiva", varArmadilhaExplosiva);
					ins.put("skill_removerarmadilha", varRemoverArmadilha);
					ins.put("skill_flagelodasferas", varFlageloDasFeras);
					ins.put("skill_adestrarfalcao", varAdestrarFalcao);
					ins.put("skill_ataqueaereo", varAtaqueAereo);
					ins.put("skill_garrasdeaco", varGarrasDeAco);
					ins.put("skill_alerta", varAlerta);
					ins.put("skill_desativararmadilha", varDesativarArmadilha);
					ins.put("skill_mensagemsecreta", varMensagemSecreta);
					ins.put("skill_assaltodofalcao", varAssaltoDoFalcao);
					ins.put("skill_tiropreciso", varTiroPreciso);
					ins.put("skill_caminhodovento", varCaminhoDoVento);
					ins.put("skill_visaoreal", varVisaoReal);
					ins.put("skill_taticasdesobrevivencia", varTaticasDeSobrevivencia);
					ins.put("skill_camuflagem", varCamuflagem);
					ins.put("skill_disparocerteiro", varDisparoCerteiro);
					ins.put("skill_tempestadedeflechas", varTempestadeDeFlechas);
					ins.put("skill_disparoselvagem", varDisparoSelvagem);
					ins.put("skill_periciacomarmadilha", varPericiaComArmadilha);
					ins.put("skill_detonador", varDetonador);
					ins.put("skill_bombarelogio", varBombaRelogio);
					ins.put("skill_armadilhaenergizada", varArmadilhaEnergizada);
					ins.put("skill_armadilhaincendiaria", varArmadilhaIncendiaria);
					ins.put("skill_armadilhaglacial", varArmadilhaGlacial);
					ins.put("skill_armadilhaescarlate", varArmadilhaEscarlate);
					ins.put("skill_armadilhaocre", varArmadilhaOcre);
					ins.put("skill_armadilhaesmeralda", varArmadilhaEsmeralda);
					ins.put("skill_armadilhacobalto", varArmadilhaCobalto);
					ins.put("skill_adestrarworg", varAdestrarWorg);
					ins.put("skill_montariaemworg", varMontariaEmWorg);
					ins.put("skill_presasafiadas", varPresasAfiadas);
					ins.put("skill_faroagucado", varFaroAgucado);
					ins.put("skill_assaltodeworg", varAssaltoDeWorg);
					ins.put("skill_mordidaferoz", varMordidaFeroz);
					ins.put("skill_investidadeworg", varInvestidaDeWorg);
					ins.put("skill_primeira", skillPrimeira);
					ins.put("skill_segunda", skillSegunda);
					ins.put("skill_trans", skillTrans);
					ins.put("skill_terceira", skillTerceira);
					if(!novo){
						try {
							db.update("sentinela", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("sentinela", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from sentinela", null);
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
						ins2.put("classe", "sentinela");
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