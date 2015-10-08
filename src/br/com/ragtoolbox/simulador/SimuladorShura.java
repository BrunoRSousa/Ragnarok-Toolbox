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

public class SimuladorShura extends Activity {

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
		btCairDasPetalasInterrogacao,
		btFuriaInteriorInterrogacao,
		btPunhoSupremoDeAsuraInterrogacao,
		btPunhosDeFerroInterrogacao,
		btCorpoFechadoInterrogacao,
		btImpactoPsiquicoInterrogacao,
		btComboQuadruploInterrogacao,
		btOUltimoDragaoInterrogacao,
		btComboTriploInterrogacao,
		btDilemaInterrogacao,
		btPassoEtereoInterrogacao,
		btMeditacaoInterrogacao,
		btAbsorverEsferasEspirituaisInterrogacao,
		btInvocarEsferasEspirituaisInterrogacao,
		btDisparoDasEsferasEspirituaisInterrogacao,
		btConcessaoEspiritualInterrogacao,
		btPunhosIntensosInterrogacao,
		btComboEsmagadorInterrogacao,
		btPunhoDoTigreInterrogacao,
		btGolpeDaPalmaEmFuriaInterrogacao,
		btZenInterrogacao,
		btCotoveladaAscendenteInterrogacao,
		btCampoAmaldicoadoInterrogacao,
		btPunhoDoDragaoInterrogacao,
		btImpactoSismicoInterrogacao,
		btRuinaInterrogacao,
		btChakraDaFuriaInterrogacao,
		btChakraDaCuraInterrogacao,
		btChakraDoVigorInterrogacao,
		btChakraDeEnergiaInterrogacao,
		btChakraDoSilencioInterrogacao,
		btPortoesDoInfernoInterrogacao,
		btSaltoRelampagoInterrogacao,
		btCavalgarRelampagoInterrogacao,
		btRugidoDoLeaoInterrogacao,
		btInvestidaDeShuraInterrogacao,
		btRenunciaEspiritualInterrogacao,
		btAbsorcaoEspiritualInterrogacao,
		btExplosaoEspiritualInterrogacao,
		btDragaoAscendenteInterrogacao,
		btSocoFuracaoInterrogacao,
		btGarraDeTigreInterrogacao,
		btRasteiraInterrogacao;

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
		btCairDasPetalasDiminuir,
		btFuriaInteriorDiminuir,
		btPunhoSupremoDeAsuraDiminuir,
		btPunhosDeFerroDiminuir,
		btCorpoFechadoDiminuir,
		btImpactoPsiquicoDiminuir,
		btComboQuadruploDiminuir,
		btOUltimoDragaoDiminuir,
		btComboTriploDiminuir,
		btDilemaDiminuir,
		btPassoEtereoDiminuir,
		btMeditacaoDiminuir,
		btAbsorverEsferasEspirituaisDiminuir,
		btInvocarEsferasEspirituaisDiminuir,
		btDisparoDasEsferasEspirituaisDiminuir,
		btComboEsmagadorDiminuir,
		btPunhoDoTigreDiminuir,
		btGolpeDaPalmaEmFuriaDiminuir,
		btZenDiminuir,
		btCotoveladaAscendenteDiminuir,
		btCampoAmaldicoadoDiminuir,
		btPunhoDoDragaoDiminuir,
		btImpactoSismicoDiminuir,
		btRuinaDiminuir,
		btChakraDaFuriaDiminuir,
		btChakraDaCuraDiminuir,
		btChakraDoVigorDiminuir,
		btChakraDeEnergiaDiminuir,
		btChakraDoSilencioDiminuir,
		btPortoesDoInfernoDiminuir,
		btSaltoRelampagoDiminuir,
		btCavalgarRelampagoDiminuir,
		btRugidoDoLeaoDiminuir,
		btInvestidaDeShuraDiminuir,
		btRenunciaEspiritualDiminuir,
		btAbsorcaoEspiritualDiminuir,
		btExplosaoEspiritualDiminuir,
		btDragaoAscendenteDiminuir,
		btSocoFuracaoDiminuir,
		btGarraDeTigreDiminuir,
		btRasteiraDiminuir;

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
		btCairDasPetalasAumentar,
		btFuriaInteriorAumentar,
		btPunhoSupremoDeAsuraAumentar,
		btPunhosDeFerroAumentar,
		btCorpoFechadoAumentar,
		btImpactoPsiquicoAumentar,
		btComboQuadruploAumentar,
		btOUltimoDragaoAumentar,
		btComboTriploAumentar,
		btDilemaAumentar,
		btPassoEtereoAumentar,
		btMeditacaoAumentar,
		btAbsorverEsferasEspirituaisAumentar,
		btInvocarEsferasEspirituaisAumentar,
		btDisparoDasEsferasEspirituaisAumentar,
		btComboEsmagadorAumentar,
		btPunhoDoTigreAumentar,
		btGolpeDaPalmaEmFuriaAumentar,
		btZenAumentar,
		btCotoveladaAscendenteAumentar,
		btCampoAmaldicoadoAumentar,
		btPunhoDoDragaoAumentar,
		btImpactoSismicoAumentar,
		btRuinaAumentar,
		btChakraDaFuriaAumentar,
		btChakraDaCuraAumentar,
		btChakraDoVigorAumentar,
		btChakraDeEnergiaAumentar,
		btChakraDoSilencioAumentar,
		btPortoesDoInfernoAumentar,
		btSaltoRelampagoAumentar,
		btCavalgarRelampagoAumentar,
		btRugidoDoLeaoAumentar,
		btInvestidaDeShuraAumentar,
		btRenunciaEspiritualAumentar,
		btAbsorcaoEspiritualAumentar,
		btExplosaoEspiritualAumentar,
		btDragaoAscendenteAumentar,
		btSocoFuracaoAumentar,
		btGarraDeTigreAumentar,
		btRasteiraAumentar;

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
		txtCairDasPetalasPontos,
		txtFuriaInteriorPontos,
		txtPunhoSupremoDeAsuraPontos,
		txtPunhosDeFerroPontos,
		txtCorpoFechadoPontos,
		txtImpactoPsiquicoPontos,
		txtComboQuadruploPontos,
		txtOUltimoDragaoPontos,
		txtComboTriploPontos,
		txtDilemaPontos,
		txtPassoEtereoPontos,
		txtMeditacaoPontos,
		txtAbsorverEsferasEspirituaisPontos,
		txtInvocarEsferasEspirituaisPontos,
		txtDisparoDasEsferasEspirituaisPontos,
		txtComboEsmagadorPontos,
		txtPunhoDoTigrePontos,
		txtGolpeDaPalmaEmFuriaPontos,
		txtZenPontos,
		txtCotoveladaAscendentePontos,
		txtCampoAmaldicoadoPontos,
		txtPunhoDoDragaoPontos,
		txtImpactoSismicoPontos,
		txtRuinaPontos,
		txtChakraDaFuriaPontos,
		txtChakraDaCuraPontos,
		txtChakraDoVigorPontos,
		txtChakraDeEnergiaPontos,
		txtChakraDoSilencioPontos,
		txtPortoesDoInfernoPontos,
		txtSaltoRelampagoPontos,
		txtCavalgarRelampagoPontos,
		txtRugidoDoLeaoPontos,
		txtInvestidaDeShuraPontos,
		txtRenunciaEspiritualPontos,
		txtAbsorcaoEspiritualPontos,
		txtExplosaoEspiritualPontos,
		txtDragaoAscendentePontos,
		txtSocoFuracaoPontos,
		txtGarraDeTigrePontos,
		txtRasteiraPontos;

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
		layCairDasPetalas,
		layFuriaInterior,
		layPunhoSupremoDeAsura,
		layPunhosDeFerro,
		layCorpoFechado,
		layImpactoPsiquico,
		layComboQuadruplo,
		layOUltimoDragao,
		layComboTriplo,
		layDilema,
		layPassoEtereo,
		layMeditacao,
		layAbsorverEsferasEspirituais,
		layInvocarEsferasEspirituais,
		layDisparoDasEsferasEspirituais,
		layComboEsmagador,
		layPunhoDoTigre,
		layGolpeDaPalmaEmFuria,
		layZen,
		layCotoveladaAscendente,
		layCampoAmaldicoado,
		layPunhoDoDragao,
		layImpactoSismico,
		layRuina,
		layChakraDaFuria,
		layChakraDaCura,
		layChakraDoVigor,
		layChakraDeEnergia,
		layChakraDoSilencio,
		layPortoesDoInferno,
		laySaltoRelampago,
		layCavalgarRelampago,
		layRugidoDoLeao,
		layInvestidaDeShura,
		layRenunciaEspiritual,
		layAbsorcaoEspiritual,
		layExplosaoEspiritual,
		layDragaoAscendente,
		laySocoFuracao,
		layGarraDeTigre,
		layRasteira;

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
		varCairDasPetalas,
		varFuriaInterior,
		varPunhoSupremoDeAsura,
		varPunhosDeFerro,
		varCorpoFechado,
		varImpactoPsiquico,
		varComboQuadruplo,
		varOUltimoDragao,
		varComboTriplo,
		varDilema,
		varPassoEtereo,
		varMeditacao,
		varAbsorverEsferasEspirituais,
		varInvocarEsferasEspirituais,
		varDisparoDasEsferasEspirituais,
		varComboEsmagador,
		varPunhoDoTigre,
		varGolpeDaPalmaEmFuria,
		varZen,
		varCotoveladaAscendente,
		varCampoAmaldicoado,
		varPunhoDoDragao,
		varImpactoSismico,
		varRuina,
		varChakraDaFuria,
		varChakraDaCura,
		varChakraDoVigor,
		varChakraDeEnergia,
		varChakraDoSilencio,
		varPortoesDoInferno,
		varSaltoRelampago,
		varCavalgarRelampago,
		varRugidoDoLeao,
		varInvestidaDeShura,
		varRenunciaEspiritual,
		varAbsorcaoEspiritual,
		varExplosaoEspiritual,
		varDragaoAscendente,
		varSocoFuracao,
		varGarraDeTigre,
		varRasteira;

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
			setContentView(R.layout.activity_simulador_shura);

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
			varCairDasPetalas = 0;
			varFuriaInterior = 0;
			varPunhoSupremoDeAsura = 0;
			varPunhosDeFerro = 0;
			varCorpoFechado = 0;
			varImpactoPsiquico = 0;
			varComboQuadruplo = 0;
			varOUltimoDragao = 0;
			varComboTriplo = 0;
			varDilema = 0;
			varPassoEtereo = 0;
			varMeditacao = 0;
			varAbsorverEsferasEspirituais = 0;
			varInvocarEsferasEspirituais = 0;
			varDisparoDasEsferasEspirituais = 0;
			varComboEsmagador = 0;
			varPunhoDoTigre = 0;
			varGolpeDaPalmaEmFuria = 0;
			varZen = 0;
			varCotoveladaAscendente = 0;
			varCampoAmaldicoado = 0;
			varPunhoDoDragao = 0;
			varImpactoSismico = 0;
			varRuina = 0;
			varChakraDaFuria = 0;
			varChakraDaCura = 0;
			varChakraDoVigor = 0;
			varChakraDeEnergia = 0;
			varChakraDoSilencio = 0;
			varPortoesDoInferno = 0;
			varSaltoRelampago = 0;
			varCavalgarRelampago = 0;
			varRugidoDoLeao = 0;
			varInvestidaDeShura = 0;
			varRenunciaEspiritual = 0;
			varAbsorcaoEspiritual = 0;
			varExplosaoEspiritual = 0;
			varDragaoAscendente = 0;
			varSocoFuracao = 0;
			varGarraDeTigre = 0;
			varRasteira = 0;



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
			btCairDasPetalasInterrogacao = (Button) findViewById(R.id.btCairDasPetalasInterrogacao);
			btFuriaInteriorInterrogacao = (Button) findViewById(R.id.btFuriaInteriorInterrogacao);
			btPunhoSupremoDeAsuraInterrogacao = (Button) findViewById(R.id.btPunhoSupremoDeAsuraInterrogacao);
			btPunhosDeFerroInterrogacao = (Button) findViewById(R.id.btPunhosDeFerroInterrogacao);
			btCorpoFechadoInterrogacao = (Button) findViewById(R.id.btCorpoFechadoInterrogacao);
			btImpactoPsiquicoInterrogacao = (Button) findViewById(R.id.btImpactoPsiquicoInterrogacao);
			btComboQuadruploInterrogacao = (Button) findViewById(R.id.btComboQuadruploInterrogacao);
			btOUltimoDragaoInterrogacao = (Button) findViewById(R.id.btOUltimoDragaoInterrogacao);
			btComboTriploInterrogacao = (Button) findViewById(R.id.btComboTriploInterrogacao);
			btDilemaInterrogacao = (Button) findViewById(R.id.btDilemaInterrogacao);
			btPassoEtereoInterrogacao = (Button) findViewById(R.id.btPassoEtereoInterrogacao);
			btMeditacaoInterrogacao = (Button) findViewById(R.id.btMeditacaoInterrogacao);
			btAbsorverEsferasEspirituaisInterrogacao = (Button) findViewById(R.id.btAbsorverEsferasEspirituaisInterrogacao);
			btInvocarEsferasEspirituaisInterrogacao = (Button) findViewById(R.id.btInvocarEsferasEspirituaisInterrogacao);
			btDisparoDasEsferasEspirituaisInterrogacao = (Button) findViewById(R.id.btDisparoDasEsferasEspirituaisInterrogacao);
			btConcessaoEspiritualInterrogacao = (Button) findViewById(R.id.btConcessaoEspiritualInterrogacao);
			btPunhosIntensosInterrogacao = (Button) findViewById(R.id.btPunhosIntensosInterrogacao);
			btComboEsmagadorInterrogacao = (Button) findViewById(R.id.btComboEsmagadorInterrogacao);
			btPunhoDoTigreInterrogacao = (Button) findViewById(R.id.btPunhoDoTigreInterrogacao);
			btGolpeDaPalmaEmFuriaInterrogacao = (Button) findViewById(R.id.btGolpeDaPalmaEmFuriaInterrogacao);
			btZenInterrogacao = (Button) findViewById(R.id.btZenInterrogacao);
			btCotoveladaAscendenteInterrogacao = (Button) findViewById(R.id.btCotoveladaAscendenteInterrogacao);
			btCampoAmaldicoadoInterrogacao = (Button) findViewById(R.id.btCampoAmaldicoadoInterrogacao);
			btPunhoDoDragaoInterrogacao = (Button) findViewById(R.id.btPunhoDoDragaoInterrogacao);
			btImpactoSismicoInterrogacao = (Button) findViewById(R.id.btImpactoSismicoInterrogacao);
			btRuinaInterrogacao = (Button) findViewById(R.id.btRuinaInterrogacao);
			btChakraDaFuriaInterrogacao = (Button) findViewById(R.id.btChakraDaFuriaInterrogacao);
			btChakraDaCuraInterrogacao = (Button) findViewById(R.id.btChakraDaCuraInterrogacao);
			btChakraDoVigorInterrogacao = (Button) findViewById(R.id.btChakraDoVigorInterrogacao);
			btChakraDeEnergiaInterrogacao = (Button) findViewById(R.id.btChakraDeEnergiaInterrogacao);
			btChakraDoSilencioInterrogacao = (Button) findViewById(R.id.btChakraDoSilencioInterrogacao);
			btPortoesDoInfernoInterrogacao = (Button) findViewById(R.id.btPortoesDoInfernoInterrogacao);
			btSaltoRelampagoInterrogacao = (Button) findViewById(R.id.btSaltoRelampagoInterrogacao);
			btCavalgarRelampagoInterrogacao = (Button) findViewById(R.id.btCavalgarRelampagoInterrogacao);
			btRugidoDoLeaoInterrogacao = (Button) findViewById(R.id.btRugidoDoLeaoInterrogacao);
			btInvestidaDeShuraInterrogacao = (Button) findViewById(R.id.btInvestidaDeShuraInterrogacao);
			btRenunciaEspiritualInterrogacao = (Button) findViewById(R.id.btRenunciaEspiritualInterrogacao);
			btAbsorcaoEspiritualInterrogacao = (Button) findViewById(R.id.btAbsorcaoEspiritualInterrogacao);
			btExplosaoEspiritualInterrogacao = (Button) findViewById(R.id.btExplosaoEspiritualInterrogacao);
			btDragaoAscendenteInterrogacao = (Button) findViewById(R.id.btDragaoAscendenteInterrogacao);
			btSocoFuracaoInterrogacao = (Button) findViewById(R.id.btSocoFuracaoInterrogacao);
			btGarraDeTigreInterrogacao = (Button) findViewById(R.id.btGarraDeTigreInterrogacao);
			btRasteiraInterrogacao = (Button) findViewById(R.id.btRasteiraInterrogacao);

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
			btCairDasPetalasDiminuir = (Button) findViewById(R.id.btCairDasPetalasDiminuir);
			btFuriaInteriorDiminuir = (Button) findViewById(R.id.btFuriaInteriorDiminuir);
			btPunhoSupremoDeAsuraDiminuir = (Button) findViewById(R.id.btPunhoSupremoDeAsuraDiminuir);
			btPunhosDeFerroDiminuir = (Button) findViewById(R.id.btPunhosDeFerroDiminuir);
			btCorpoFechadoDiminuir = (Button) findViewById(R.id.btCorpoFechadoDiminuir);
			btImpactoPsiquicoDiminuir = (Button) findViewById(R.id.btImpactoPsiquicoDiminuir);
			btComboQuadruploDiminuir = (Button) findViewById(R.id.btComboQuadruploDiminuir);
			btOUltimoDragaoDiminuir = (Button) findViewById(R.id.btOUltimoDragaoDiminuir);
			btComboTriploDiminuir = (Button) findViewById(R.id.btComboTriploDiminuir);
			btDilemaDiminuir = (Button) findViewById(R.id.btDilemaDiminuir);
			btPassoEtereoDiminuir = (Button) findViewById(R.id.btPassoEtereoDiminuir);
			btMeditacaoDiminuir = (Button) findViewById(R.id.btMeditacaoDiminuir);
			btAbsorverEsferasEspirituaisDiminuir = (Button) findViewById(R.id.btAbsorverEsferasEspirituaisDiminuir);
			btInvocarEsferasEspirituaisDiminuir = (Button) findViewById(R.id.btInvocarEsferasEspirituaisDiminuir);
			btDisparoDasEsferasEspirituaisDiminuir = (Button) findViewById(R.id.btDisparoDasEsferasEspirituaisDiminuir);
			btComboEsmagadorDiminuir = (Button) findViewById(R.id.btComboEsmagadorDiminuir);
			btPunhoDoTigreDiminuir = (Button) findViewById(R.id.btPunhoDoTigreDiminuir);
			btGolpeDaPalmaEmFuriaDiminuir = (Button) findViewById(R.id.btGolpeDaPalmaEmFuriaDiminuir);
			btZenDiminuir = (Button) findViewById(R.id.btZenDiminuir);
			btCotoveladaAscendenteDiminuir = (Button) findViewById(R.id.btCotoveladaAscendenteDiminuir);
			btCampoAmaldicoadoDiminuir = (Button) findViewById(R.id.btCampoAmaldicoadoDiminuir);
			btPunhoDoDragaoDiminuir = (Button) findViewById(R.id.btPunhoDoDragaoDiminuir);
			btImpactoSismicoDiminuir = (Button) findViewById(R.id.btImpactoSismicoDiminuir);
			btRuinaDiminuir = (Button) findViewById(R.id.btRuinaDiminuir);
			btChakraDaFuriaDiminuir = (Button) findViewById(R.id.btChakraDaFuriaDiminuir);
			btChakraDaCuraDiminuir = (Button) findViewById(R.id.btChakraDaCuraDiminuir);
			btChakraDoVigorDiminuir = (Button) findViewById(R.id.btChakraDoVigorDiminuir);
			btChakraDeEnergiaDiminuir = (Button) findViewById(R.id.btChakraDeEnergiaDiminuir);
			btChakraDoSilencioDiminuir = (Button) findViewById(R.id.btChakraDoSilencioDiminuir);
			btPortoesDoInfernoDiminuir = (Button) findViewById(R.id.btPortoesDoInfernoDiminuir);
			btSaltoRelampagoDiminuir = (Button) findViewById(R.id.btSaltoRelampagoDiminuir);
			btCavalgarRelampagoDiminuir = (Button) findViewById(R.id.btCavalgarRelampagoDiminuir);
			btRugidoDoLeaoDiminuir = (Button) findViewById(R.id.btRugidoDoLeaoDiminuir);
			btInvestidaDeShuraDiminuir = (Button) findViewById(R.id.btInvestidaDeShuraDiminuir);
			btRenunciaEspiritualDiminuir = (Button) findViewById(R.id.btRenunciaEspiritualDiminuir);
			btAbsorcaoEspiritualDiminuir = (Button) findViewById(R.id.btAbsorcaoEspiritualDiminuir);
			btExplosaoEspiritualDiminuir = (Button) findViewById(R.id.btExplosaoEspiritualDiminuir);
			btDragaoAscendenteDiminuir = (Button) findViewById(R.id.btDragaoAscendenteDiminuir);
			btSocoFuracaoDiminuir = (Button) findViewById(R.id.btSocoFuracaoDiminuir);
			btGarraDeTigreDiminuir = (Button) findViewById(R.id.btGarraDeTigreDiminuir);
			btRasteiraDiminuir = (Button) findViewById(R.id.btRasteiraDiminuir);

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
			btCairDasPetalasAumentar = (Button) findViewById(R.id.btCairDasPetalasAumentar);
			btFuriaInteriorAumentar = (Button) findViewById(R.id.btFuriaInteriorAumentar);
			btPunhoSupremoDeAsuraAumentar = (Button) findViewById(R.id.btPunhoSupremoDeAsuraAumentar);
			btPunhosDeFerroAumentar = (Button) findViewById(R.id.btPunhosDeFerroAumentar);
			btCorpoFechadoAumentar = (Button) findViewById(R.id.btCorpoFechadoAumentar);
			btImpactoPsiquicoAumentar = (Button) findViewById(R.id.btImpactoPsiquicoAumentar);
			btComboQuadruploAumentar = (Button) findViewById(R.id.btComboQuadruploAumentar);
			btOUltimoDragaoAumentar = (Button) findViewById(R.id.btOUltimoDragaoAumentar);
			btComboTriploAumentar = (Button) findViewById(R.id.btComboTriploAumentar);
			btDilemaAumentar = (Button) findViewById(R.id.btDilemaAumentar);
			btPassoEtereoAumentar = (Button) findViewById(R.id.btPassoEtereoAumentar);
			btMeditacaoAumentar = (Button) findViewById(R.id.btMeditacaoAumentar);
			btAbsorverEsferasEspirituaisAumentar = (Button) findViewById(R.id.btAbsorverEsferasEspirituaisAumentar);
			btInvocarEsferasEspirituaisAumentar = (Button) findViewById(R.id.btInvocarEsferasEspirituaisAumentar);
			btDisparoDasEsferasEspirituaisAumentar = (Button) findViewById(R.id.btDisparoDasEsferasEspirituaisAumentar);
			btComboEsmagadorAumentar = (Button) findViewById(R.id.btComboEsmagadorAumentar);
			btPunhoDoTigreAumentar = (Button) findViewById(R.id.btPunhoDoTigreAumentar);
			btGolpeDaPalmaEmFuriaAumentar = (Button) findViewById(R.id.btGolpeDaPalmaEmFuriaAumentar);
			btZenAumentar = (Button) findViewById(R.id.btZenAumentar);
			btCotoveladaAscendenteAumentar = (Button) findViewById(R.id.btCotoveladaAscendenteAumentar);
			btCampoAmaldicoadoAumentar = (Button) findViewById(R.id.btCampoAmaldicoadoAumentar);
			btPunhoDoDragaoAumentar = (Button) findViewById(R.id.btPunhoDoDragaoAumentar);
			btImpactoSismicoAumentar = (Button) findViewById(R.id.btImpactoSismicoAumentar);
			btRuinaAumentar = (Button) findViewById(R.id.btRuinaAumentar);
			btChakraDaFuriaAumentar = (Button) findViewById(R.id.btChakraDaFuriaAumentar);
			btChakraDaCuraAumentar = (Button) findViewById(R.id.btChakraDaCuraAumentar);
			btChakraDoVigorAumentar = (Button) findViewById(R.id.btChakraDoVigorAumentar);
			btChakraDeEnergiaAumentar = (Button) findViewById(R.id.btChakraDeEnergiaAumentar);
			btChakraDoSilencioAumentar = (Button) findViewById(R.id.btChakraDoSilencioAumentar);
			btPortoesDoInfernoAumentar = (Button) findViewById(R.id.btPortoesDoInfernoAumentar);
			btSaltoRelampagoAumentar = (Button) findViewById(R.id.btSaltoRelampagoAumentar);
			btCavalgarRelampagoAumentar = (Button) findViewById(R.id.btCavalgarRelampagoAumentar);
			btRugidoDoLeaoAumentar = (Button) findViewById(R.id.btRugidoDoLeaoAumentar);
			btInvestidaDeShuraAumentar = (Button) findViewById(R.id.btInvestidaDeShuraAumentar);
			btRenunciaEspiritualAumentar = (Button) findViewById(R.id.btRenunciaEspiritualAumentar);
			btAbsorcaoEspiritualAumentar = (Button) findViewById(R.id.btAbsorcaoEspiritualAumentar);
			btExplosaoEspiritualAumentar = (Button) findViewById(R.id.btExplosaoEspiritualAumentar);
			btDragaoAscendenteAumentar = (Button) findViewById(R.id.btDragaoAscendenteAumentar);
			btSocoFuracaoAumentar = (Button) findViewById(R.id.btSocoFuracaoAumentar);
			btGarraDeTigreAumentar = (Button) findViewById(R.id.btGarraDeTigreAumentar);
			btRasteiraAumentar = (Button) findViewById(R.id.btRasteiraAumentar);

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
			txtCairDasPetalasPontos = (TextView) findViewById(R.id.txtCairDasPetalasPontos);
			txtFuriaInteriorPontos = (TextView) findViewById(R.id.txtFuriaInteriorPontos);
			txtPunhoSupremoDeAsuraPontos = (TextView) findViewById(R.id.txtPunhoSupremoDeAsuraPontos);
			txtPunhosDeFerroPontos = (TextView) findViewById(R.id.txtPunhosDeFerroPontos);
			txtCorpoFechadoPontos = (TextView) findViewById(R.id.txtCorpoFechadoPontos);
			txtImpactoPsiquicoPontos = (TextView) findViewById(R.id.txtImpactoPsiquicoPontos);
			txtComboQuadruploPontos = (TextView) findViewById(R.id.txtComboQuadruploPontos);
			txtOUltimoDragaoPontos = (TextView) findViewById(R.id.txtOUltimoDragaoPontos);
			txtComboTriploPontos = (TextView) findViewById(R.id.txtComboTriploPontos);
			txtDilemaPontos = (TextView) findViewById(R.id.txtDilemaPontos);
			txtPassoEtereoPontos = (TextView) findViewById(R.id.txtPassoEtereoPontos);
			txtMeditacaoPontos = (TextView) findViewById(R.id.txtMeditacaoPontos);
			txtAbsorverEsferasEspirituaisPontos = (TextView) findViewById(R.id.txtAbsorverEsferasEspirituaisPontos);
			txtInvocarEsferasEspirituaisPontos = (TextView) findViewById(R.id.txtInvocarEsferasEspirituaisPontos);
			txtDisparoDasEsferasEspirituaisPontos = (TextView) findViewById(R.id.txtDisparoDasEsferasEspirituaisPontos);
			txtComboEsmagadorPontos = (TextView) findViewById(R.id.txtComboEsmagadorPontos);
			txtPunhoDoTigrePontos = (TextView) findViewById(R.id.txtPunhoDoTigrePontos);
			txtGolpeDaPalmaEmFuriaPontos = (TextView) findViewById(R.id.txtGolpeDaPalmaEmFuriaPontos);
			txtZenPontos = (TextView) findViewById(R.id.txtZenPontos);
			txtCotoveladaAscendentePontos = (TextView) findViewById(R.id.txtCotoveladaAscendentePontos);
			txtCampoAmaldicoadoPontos = (TextView) findViewById(R.id.txtCampoAmaldicoadoPontos);
			txtPunhoDoDragaoPontos = (TextView) findViewById(R.id.txtPunhoDoDragaoPontos);
			txtImpactoSismicoPontos = (TextView) findViewById(R.id.txtImpactoSismicoPontos);
			txtRuinaPontos = (TextView) findViewById(R.id.txtRuinaPontos);
			txtChakraDaFuriaPontos = (TextView) findViewById(R.id.txtChakraDaFuriaPontos);
			txtChakraDaCuraPontos = (TextView) findViewById(R.id.txtChakraDaCuraPontos);
			txtChakraDoVigorPontos = (TextView) findViewById(R.id.txtChakraDoVigorPontos);
			txtChakraDeEnergiaPontos = (TextView) findViewById(R.id.txtChakraDeEnergiaPontos);
			txtChakraDoSilencioPontos = (TextView) findViewById(R.id.txtChakraDoSilencioPontos);
			txtPortoesDoInfernoPontos = (TextView) findViewById(R.id.txtPortoesDoInfernoPontos);
			txtSaltoRelampagoPontos = (TextView) findViewById(R.id.txtSaltoRelampagoPontos);
			txtCavalgarRelampagoPontos = (TextView) findViewById(R.id.txtCavalgarRelampagoPontos);
			txtRugidoDoLeaoPontos = (TextView) findViewById(R.id.txtRugidoDoLeaoPontos);
			txtInvestidaDeShuraPontos = (TextView) findViewById(R.id.txtInvestidaDeShuraPontos);
			txtRenunciaEspiritualPontos = (TextView) findViewById(R.id.txtRenunciaEspiritualPontos);
			txtAbsorcaoEspiritualPontos = (TextView) findViewById(R.id.txtAbsorcaoEspiritualPontos);
			txtExplosaoEspiritualPontos = (TextView) findViewById(R.id.txtExplosaoEspiritualPontos);
			txtDragaoAscendentePontos = (TextView) findViewById(R.id.txtDragaoAscendentePontos);
			txtSocoFuracaoPontos = (TextView) findViewById(R.id.txtSocoFuracaoPontos);
			txtGarraDeTigrePontos = (TextView) findViewById(R.id.txtGarraDeTigrePontos);
			txtRasteiraPontos = (TextView) findViewById(R.id.txtRasteiraPontos);

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
			layCairDasPetalas = (LinearLayout) findViewById(R.id.layCairDasPetalas);
			layFuriaInterior = (LinearLayout) findViewById(R.id.layFuriaInterior);
			layPunhoSupremoDeAsura = (LinearLayout) findViewById(R.id.layPunhoSupremoDeAsura);
			layPunhosDeFerro = (LinearLayout) findViewById(R.id.layPunhosDeFerro);
			layCorpoFechado = (LinearLayout) findViewById(R.id.layCorpoFechado);
			layImpactoPsiquico = (LinearLayout) findViewById(R.id.layImpactoPsiquico);
			layComboQuadruplo = (LinearLayout) findViewById(R.id.layComboQuadruplo);
			layOUltimoDragao = (LinearLayout) findViewById(R.id.layOUltimoDragao);
			layComboTriplo = (LinearLayout) findViewById(R.id.layComboTriplo);
			layDilema = (LinearLayout) findViewById(R.id.layDilema);
			layPassoEtereo = (LinearLayout) findViewById(R.id.layPassoEtereo);
			layMeditacao = (LinearLayout) findViewById(R.id.layMeditacao);
			layAbsorverEsferasEspirituais = (LinearLayout) findViewById(R.id.layAbsorverEsferasEspirituais);
			layInvocarEsferasEspirituais = (LinearLayout) findViewById(R.id.layInvocarEsferasEspirituais);
			layDisparoDasEsferasEspirituais = (LinearLayout) findViewById(R.id.layDisparoDasEsferasEspirituais);
			layComboEsmagador = (LinearLayout) findViewById(R.id.layComboEsmagador);
			layPunhoDoTigre = (LinearLayout) findViewById(R.id.layPunhoDoTigre);
			layGolpeDaPalmaEmFuria = (LinearLayout) findViewById(R.id.layGolpeDaPalmaEmFuria);
			layZen = (LinearLayout) findViewById(R.id.layZen);
			layCotoveladaAscendente = (LinearLayout) findViewById(R.id.layCotoveladaAscendente);
			layCampoAmaldicoado = (LinearLayout) findViewById(R.id.layCampoAmaldicoado);
			layPunhoDoDragao = (LinearLayout) findViewById(R.id.layPunhoDoDragao);
			layImpactoSismico = (LinearLayout) findViewById(R.id.layImpactoSismico);
			layRuina = (LinearLayout) findViewById(R.id.layRuina);
			layChakraDaFuria = (LinearLayout) findViewById(R.id.layChakraDaFuria);
			layChakraDaCura = (LinearLayout) findViewById(R.id.layChakraDaCura);
			layChakraDoVigor = (LinearLayout) findViewById(R.id.layChakraDoVigor);
			layChakraDeEnergia = (LinearLayout) findViewById(R.id.layChakraDeEnergia);
			layChakraDoSilencio = (LinearLayout) findViewById(R.id.layChakraDoSilencio);
			layPortoesDoInferno = (LinearLayout) findViewById(R.id.layPortoesDoInferno);
			laySaltoRelampago = (LinearLayout) findViewById(R.id.laySaltoRelampago);
			layCavalgarRelampago = (LinearLayout) findViewById(R.id.layCavalgarRelampago);
			layRugidoDoLeao = (LinearLayout) findViewById(R.id.layRugidoDoLeao);
			layInvestidaDeShura = (LinearLayout) findViewById(R.id.layInvestidaDeShura);
			layRenunciaEspiritual = (LinearLayout) findViewById(R.id.layRenunciaEspiritual);
			layAbsorcaoEspiritual = (LinearLayout) findViewById(R.id.layAbsorcaoEspiritual);
			layExplosaoEspiritual = (LinearLayout) findViewById(R.id.layExplosaoEspiritual);
			layDragaoAscendente = (LinearLayout) findViewById(R.id.layDragaoAscendente);
			laySocoFuracao = (LinearLayout) findViewById(R.id.laySocoFuracao);
			layGarraDeTigre = (LinearLayout) findViewById(R.id.layGarraDeTigre);
			layRasteira = (LinearLayout) findViewById(R.id.layRasteira);

			if (id>0)
				recarregarBuild(id);
			
			layPrincipal = (LinearLayout) findViewById(R.id.habilidades);


			//Eventos de informação
			btProtecaoDivinaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Proteção Divina");
					dialogo.setMessage(R.string.protecaoDivinaNovicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFlageloDoMalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Flagelo Do Mal");
					dialogo.setMessage(R.string.flageloDoMalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSignumCrucisInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Signum Crucis");
					dialogo.setMessage(R.string.signumCrucisInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAngelusInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Angelus");
					dialogo.setMessage(R.string.angelusInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBencaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Bênção");
					dialogo.setMessage(R.string.bencaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCurarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Curar");
					dialogo.setMessage(R.string.curarNovicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAumentarAgilidadeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Aumentar Agilidade");
					dialogo.setMessage(R.string.aumentarAgilidadeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDiminuirAgilidadeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Diminuir Agilidade");
					dialogo.setMessage(R.string.diminuirAgilidadeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAquaBenedictaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Aqua Benedicta");
					dialogo.setMessage(R.string.aquaBenedictaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTeleporteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Teleporte");
					dialogo.setMessage(R.string.teleporteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPortalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Portal");
					dialogo.setMessage(R.string.portalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRevelacaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Revelação");
					dialogo.setMessage(R.string.revelacaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEscudoSagradoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Escudo Sagrado");
					dialogo.setMessage(R.string.escudoSagradoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMedicarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Medicar");
					dialogo.setMessage(R.string.medicarNovicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLuzDivinaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Luz Divina");
					dialogo.setMessage(R.string.luzDivinaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCairDasPetalasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Cair Das Pétalas");
					dialogo.setMessage(R.string.cairDasPetalasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFuriaInteriorInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Fúria Interior");
					dialogo.setMessage(R.string.furiaInteriorInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPunhoSupremoDeAsuraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Punho Supremo De Asura");
					dialogo.setMessage(R.string.punhoSupremoDeAsuraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPunhosDeFerroInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Punhos De Ferro");
					dialogo.setMessage(R.string.punhosDeFerroInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCorpoFechadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Corpo Fechado");
					dialogo.setMessage(R.string.corpoFechadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btImpactoPsiquicoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Impacto Psíquico");
					dialogo.setMessage(R.string.impactoPsiquicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btComboQuadruploInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Combo Quádruplo");
					dialogo.setMessage(R.string.comboQuadruploInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOUltimoDragaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("O Último Dragão");
					dialogo.setMessage(R.string.oUltimoDragaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btComboTriploInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Combo Triplo");
					dialogo.setMessage(R.string.comboTriploInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDilemaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Dilema");
					dialogo.setMessage(R.string.dilemaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPassoEtereoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Passo Etéreo");
					dialogo.setMessage(R.string.passoEtereoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMeditacaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Meditação");
					dialogo.setMessage(R.string.meditacaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAbsorverEsferasEspirituaisInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Absorver Esferas Espirituais");
					dialogo.setMessage(R.string.absorverEsferasEspirituaisInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInvocarEsferasEspirituaisInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Invocar Esferas Espirituais");
					dialogo.setMessage(R.string.invocarEsferasEspirituaisInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDisparoDasEsferasEspirituaisInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Disparo Das Esferas Espirituais");
					dialogo.setMessage(R.string.disparoDasEsferasEspirituaisInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btConcessaoEspiritualInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Concessão Espiritual");
					dialogo.setMessage(R.string.concessaoEspiritualInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPunhosIntensosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Punhos Intensos");
					dialogo.setMessage(R.string.punhosIntensosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btComboEsmagadorInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Combo Esmagador");
					dialogo.setMessage(R.string.comboEsmagadorInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPunhoDoTigreInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Punho Do Tigre");
					dialogo.setMessage(R.string.punhoDoTigreInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGolpeDaPalmaEmFuriaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Golpe Da Palma Em Fúria");
					dialogo.setMessage(R.string.golpeDaPalmaEmFuriaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btZenInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Zen");
					dialogo.setMessage(R.string.zenInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCotoveladaAscendenteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Cotovelada Ascendente");
					dialogo.setMessage(R.string.cotoveladaAscendenteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCampoAmaldicoadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Campo Amaldiçoado");
					dialogo.setMessage(R.string.campoAmaldicoadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPunhoDoDragaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Punho Do Dragão");
					dialogo.setMessage(R.string.punhoDoDragaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btImpactoSismicoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Impacto Sísmico");
					dialogo.setMessage(R.string.impactoSismicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRuinaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Ruína");
					dialogo.setMessage(R.string.ruinaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChakraDaFuriaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Chakra Da Fúria");
					dialogo.setMessage(R.string.chakraDaFuriaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChakraDaCuraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Chakra Da Cura");
					dialogo.setMessage(R.string.chakraDaCuraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChakraDoVigorInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Chakra Do Vigor");
					dialogo.setMessage(R.string.chakraDoVigorInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChakraDeEnergiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Chakra De Energia");
					dialogo.setMessage(R.string.chakraDeEnergiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChakraDoSilencioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Chakra Do Silêncio");
					dialogo.setMessage(R.string.chakraDoSilencioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPortoesDoInfernoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Portões Do Inferno");
					dialogo.setMessage(R.string.portoesDoInfernoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSaltoRelampagoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Salto Relâmpago");
					dialogo.setMessage(R.string.saltoRelampagoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCavalgarRelampagoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Cavalgar Relâmpago");
					dialogo.setMessage(R.string.cavalgarRelampagoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRugidoDoLeaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Rugido Do Leão");
					dialogo.setMessage(R.string.rugidoDoLeaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInvestidaDeShuraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Investida De Shura");
					dialogo.setMessage(R.string.investidaDeShuraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRenunciaEspiritualInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Renúncia Espiritual");
					dialogo.setMessage(R.string.renunciaEspiritualInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAbsorcaoEspiritualInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Absorção Espiritual");
					dialogo.setMessage(R.string.absorcaoEspiritualInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btExplosaoEspiritualInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Explosão Espiritual");
					dialogo.setMessage(R.string.explosaoEspiritualInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDragaoAscendenteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Dragão Ascendente");
					dialogo.setMessage(R.string.dragaoAscendenteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSocoFuracaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Soco Furacão");
					dialogo.setMessage(R.string.socoFuracaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGarraDeTigreInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Garra De Tigre");
					dialogo.setMessage(R.string.garraDeTigreInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRasteiraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorShura.this);
					dialogo.setTitle("Rasteira");
					dialogo.setMessage(R.string.rasteiraShuraInfo);
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
			btCairDasPetalasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");

				}
			});
			btFuriaInteriorAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAbsorverEsferasEspirituais<1 && count<1){
						atualizarCalculo(varAbsorverEsferasEspirituais, "AbsorverEsferasEspirituais", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFuriaInterior, "FuriaInterior", 5, 2, "Aumentar");

				}
			});
			btPunhoSupremoDeAsuraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAbsorverEsferasEspirituais<1 && count<1){
						atualizarCalculo(varAbsorverEsferasEspirituais, "AbsorverEsferasEspirituais", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuriaInterior<3 && count<3){
						atualizarCalculo(varFuriaInterior, "FuriaInterior", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpactoPsiquico<3 && count<3){
						atualizarCalculo(varImpactoPsiquico, "ImpactoPsiquico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDisparoDasEsferasEspirituais<3 && count<3){
						atualizarCalculo(varDisparoDasEsferasEspirituais, "DisparoDasEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPunhoSupremoDeAsura, "PunhoSupremoDeAsura", 5, 2, "Aumentar");

				}
			});
			btPunhosDeFerroAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");

				}
			});
			btCorpoFechadoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboQuadruplo<3 && count<3){
						atualizarCalculo(varComboQuadruplo, "ComboQuadruplo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varOUltimoDragao<3 && count<3){
						atualizarCalculo(varOUltimoDragao, "OUltimoDragao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCorpoFechado, "CorpoFechado", 5, 2, "Aumentar");

				}
			});
			btImpactoPsiquicoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varImpactoPsiquico, "ImpactoPsiquico", 5, 2, "Aumentar");

				}
			});
			btComboQuadruploAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varComboQuadruplo, "ComboQuadruplo", 5, 2, "Aumentar");

				}
			});
			btOUltimoDragaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboQuadruplo<3 && count<3){
						atualizarCalculo(varComboQuadruplo, "ComboQuadruplo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varOUltimoDragao, "OUltimoDragao", 5, 2, "Aumentar");

				}
			});
			btComboTriploAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");

				}
			});
			btDilemaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDilema, "Dilema", 5, 2, "Aumentar");

				}
			});
			btPassoEtereoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDilema<2 && count<2){
						atualizarCalculo(varDilema, "Dilema", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMeditacao<2 && count<2){
						atualizarCalculo(varMeditacao, "Meditacao", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboQuadruplo<3 && count<3){
						atualizarCalculo(varComboQuadruplo, "ComboQuadruplo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varOUltimoDragao<3 && count<3){
						atualizarCalculo(varOUltimoDragao, "OUltimoDragao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCorpoFechado<3 && count<3){
						atualizarCalculo(varCorpoFechado, "CorpoFechado", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAbsorverEsferasEspirituais<1 && count<1){
						atualizarCalculo(varAbsorverEsferasEspirituais, "AbsorverEsferasEspirituais", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuriaInterior<3 && count<3){
						atualizarCalculo(varFuriaInterior, "FuriaInterior", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpactoPsiquico<3 && count<3){
						atualizarCalculo(varImpactoPsiquico, "ImpactoPsiquico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDisparoDasEsferasEspirituais<3 && count<3){
						atualizarCalculo(varDisparoDasEsferasEspirituais, "DisparoDasEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoSupremoDeAsura<3 && count<3){
						atualizarCalculo(varPunhoSupremoDeAsura, "PunhoSupremoDeAsura", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPassoEtereo, "PassoEtereo", 1, 2, "Aumentar");

				}
			});
			btMeditacaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDilema<2 && count<2){
						atualizarCalculo(varDilema, "Dilema", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMeditacao, "Meditacao", 5, 2, "Aumentar");

				}
			});
			btAbsorverEsferasEspirituaisAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAbsorverEsferasEspirituais, "AbsorverEsferasEspirituais", 1, 2, "Aumentar");

				}
			});
			btInvocarEsferasEspirituaisAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");

				}
			});
			btDisparoDasEsferasEspirituaisAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpactoPsiquico<3 && count<3){
						atualizarCalculo(varImpactoPsiquico, "ImpactoPsiquico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDisparoDasEsferasEspirituais, "DisparoDasEsferasEspirituais", 5, 2, "Aumentar");

				}
			});
			btComboEsmagadorAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboQuadruplo<3 && count<3){
						atualizarCalculo(varComboQuadruplo, "ComboQuadruplo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varOUltimoDragao<3 && count<3){
						atualizarCalculo(varOUltimoDragao, "OUltimoDragao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoDoTigre<2 && count<2){
						atualizarCalculo(varPunhoDoTigre, "PunhoDoTigre", 5, 3, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varComboEsmagador, "ComboEsmagador", 10, 3, "Aumentar");

				}
			});
			btPunhoDoTigreAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboQuadruplo<3 && count<3){
						atualizarCalculo(varComboQuadruplo, "ComboQuadruplo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varOUltimoDragao<3 && count<3){
						atualizarCalculo(varOUltimoDragao, "OUltimoDragao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPunhoDoTigre, "PunhoDoTigre", 5, 3, "Aumentar");

				}
			});
			btGolpeDaPalmaEmFuriaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<7 && count<7){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGolpeDaPalmaEmFuria, "GolpeDaPalmaEmFuria", 5, 3, "Aumentar");

				}
			});
			btZenAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAbsorverEsferasEspirituais<1 && count<1){
						atualizarCalculo(varAbsorverEsferasEspirituais, "AbsorverEsferasEspirituais", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuriaInterior<5 && count<5){
						atualizarCalculo(varFuriaInterior, "FuriaInterior", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varZen, "Zen", 1, 3, "Aumentar");

				}
			});
			btCotoveladaAscendenteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoDoDragao<3 && count<3){
						atualizarCalculo(varPunhoDoDragao, "PunhoDoDragao", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSocoFuracao<1 && count<1){
						atualizarCalculo(varSocoFuracao, "SocoFuracao", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCotoveladaAscendente, "CotoveladaAscendente", 5, 4, "Aumentar");

				}
			});
			btCampoAmaldicoadoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDilema<2 && count<2){
						atualizarCalculo(varDilema, "Dilema", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDoSilencio<2 && count<2){
						atualizarCalculo(varChakraDoSilencio, "ChakraDoSilencio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCampoAmaldicoado, "CampoAmaldicoado", 5, 4, "Aumentar");

				}
			});
			btPunhoDoDragaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPunhoDoDragao, "PunhoDoDragao", 10, 4, "Aumentar");

				}
			});
			btImpactoSismicoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDilema<2 && count<2){
						atualizarCalculo(varDilema, "Dilema", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDoSilencio<2 && count<2){
						atualizarCalculo(varChakraDoSilencio, "ChakraDoSilencio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCampoAmaldicoado<1 && count<1){
						atualizarCalculo(varCampoAmaldicoado, "CampoAmaldicoado", 5, 4, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoDoDragao<1 && count<1){
						atualizarCalculo(varPunhoDoDragao, "PunhoDoDragao", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varImpactoSismico, "ImpactoSismico", 5, 4, "Aumentar");

				}
			});
			btRuinaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoDoDragao<1 && count<1){
						atualizarCalculo(varPunhoDoDragao, "PunhoDoDragao", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRuina, "Ruina", 5, 4, "Aumentar");

				}
			});
			btChakraDaFuriaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDaCura<4 && count<4){
						atualizarCalculo(varChakraDaCura, "ChakraDaCura", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varChakraDaFuria, "ChakraDaFuria", 5, 4, "Aumentar");

				}
			});
			btChakraDaCuraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varChakraDaCura, "ChakraDaCura", 5, 4, "Aumentar");

				}
			});
			btChakraDoVigorAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDaCura<4 && count<4){
						atualizarCalculo(varChakraDaCura, "ChakraDaCura", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDaFuria<5 && count<5){
						atualizarCalculo(varChakraDaFuria, "ChakraDaFuria", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varChakraDoVigor, "ChakraDoVigor", 5, 4, "Aumentar");

				}
			});
			btChakraDeEnergiaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDoSilencio<3 && count<3){
						atualizarCalculo(varChakraDoSilencio, "ChakraDoSilencio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varChakraDeEnergia, "ChakraDeEnergia", 5, 4, "Aumentar");

				}
			});
			btChakraDoSilencioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varChakraDoSilencio, "ChakraDoSilencio", 5, 4, "Aumentar");

				}
			});
			btPortoesDoInfernoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoDoDragao<1 && count<1){
						atualizarCalculo(varPunhoDoDragao, "PunhoDoDragao", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRuina<3 && count<3){
						atualizarCalculo(varRuina, "Ruina", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varGarraDeTigre<5 && count<5){
						atualizarCalculo(varGarraDeTigre, "GarraDeTigre", 10, 4, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDilema<2 && count<2){
						atualizarCalculo(varDilema, "Dilema", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDoSilencio<2 && count<2){
						atualizarCalculo(varChakraDoSilencio, "ChakraDoSilencio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCampoAmaldicoado<1 && count<1){
						atualizarCalculo(varCampoAmaldicoado, "CampoAmaldicoado", 5, 4, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoDoDragao<1 && count<1){
						atualizarCalculo(varPunhoDoDragao, "PunhoDoDragao", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpactoSismico<2 && count<2){
						atualizarCalculo(varImpactoSismico, "ImpactoSismico", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varExplosaoEspiritual<3 && count<3){
						atualizarCalculo(varExplosaoEspiritual, "ExplosaoEspiritual", 5, 4, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDoSilencio<3 && count<3){
						atualizarCalculo(varChakraDoSilencio, "ChakraDoSilencio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDeEnergia<3 && count<3){
						atualizarCalculo(varChakraDeEnergia, "ChakraDeEnergia", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDragaoAscendente<5 && count<5){
						atualizarCalculo(varDragaoAscendente, "DragaoAscendente", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPortoesDoInferno, "PortoesDoInferno", 10, 4, "Aumentar");

				}
			});
			btSaltoRelampagoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDilema<2 && count<2){
						atualizarCalculo(varDilema, "Dilema", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDoSilencio<2 && count<2){
						atualizarCalculo(varChakraDoSilencio, "ChakraDoSilencio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCampoAmaldicoado<1 && count<1){
						atualizarCalculo(varCampoAmaldicoado, "CampoAmaldicoado", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRasteira<1 && count<1){
						atualizarCalculo(varRasteira, "Rasteira", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSaltoRelampago, "SaltoRelampago", 5, 4, "Aumentar");

				}
			});
			btCavalgarRelampagoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpactoPsiquico<3 && count<3){
						atualizarCalculo(varImpactoPsiquico, "ImpactoPsiquico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDisparoDasEsferasEspirituais<3 && count<3){
						atualizarCalculo(varDisparoDasEsferasEspirituais, "DisparoDasEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCavalgarRelampago, "CavalgarRelampago", 5, 4, "Aumentar");

				}
			});
			btRugidoDoLeaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAbsorcaoEspiritual<1 && count<1){
						atualizarCalculo(varAbsorcaoEspiritual, "AbsorcaoEspiritual", 1, 4, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpactoPsiquico<3 && count<3){
						atualizarCalculo(varImpactoPsiquico, "ImpactoPsiquico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDisparoDasEsferasEspirituais<3 && count<3){
						atualizarCalculo(varDisparoDasEsferasEspirituais, "DisparoDasEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCavalgarRelampago<3 && count<3){
						atualizarCalculo(varCavalgarRelampago, "CavalgarRelampago", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRugidoDoLeao, "RugidoDoLeao", 5, 4, "Aumentar");

				}
			});
			btInvestidaDeShuraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDilema<2 && count<2){
						atualizarCalculo(varDilema, "Dilema", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDoSilencio<2 && count<2){
						atualizarCalculo(varChakraDoSilencio, "ChakraDoSilencio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCampoAmaldicoado<1 && count<1){
						atualizarCalculo(varCampoAmaldicoado, "CampoAmaldicoado", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRasteira<1 && count<1){
						atualizarCalculo(varRasteira, "Rasteira", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoRelampago<3 && count<3){
						atualizarCalculo(varSaltoRelampago, "SaltoRelampago", 5, 4, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDilema<2 && count<2){
						atualizarCalculo(varDilema, "Dilema", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDoSilencio<2 && count<2){
						atualizarCalculo(varChakraDoSilencio, "ChakraDoSilencio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCampoAmaldicoado<1 && count<1){
						atualizarCalculo(varCampoAmaldicoado, "CampoAmaldicoado", 5, 4, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoDoDragao<1 && count<1){
						atualizarCalculo(varPunhoDoDragao, "PunhoDoDragao", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpactoSismico<2 && count<2){
						atualizarCalculo(varImpactoSismico, "ImpactoSismico", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varExplosaoEspiritual<3 && count<3){
						atualizarCalculo(varExplosaoEspiritual, "ExplosaoEspiritual", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInvestidaDeShura, "InvestidaDeShura", 5, 4, "Aumentar");

				}
			});
			btRenunciaEspiritualAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");

				}
			});
			btAbsorcaoEspiritualAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAbsorcaoEspiritual, "AbsorcaoEspiritual", 1, 4, "Aumentar");

				}
			});
			btExplosaoEspiritualAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDilema<2 && count<2){
						atualizarCalculo(varDilema, "Dilema", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDoSilencio<2 && count<2){
						atualizarCalculo(varChakraDoSilencio, "ChakraDoSilencio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCampoAmaldicoado<1 && count<1){
						atualizarCalculo(varCampoAmaldicoado, "CampoAmaldicoado", 5, 4, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoDoDragao<1 && count<1){
						atualizarCalculo(varPunhoDoDragao, "PunhoDoDragao", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpactoSismico<2 && count<2){
						atualizarCalculo(varImpactoSismico, "ImpactoSismico", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varExplosaoEspiritual, "ExplosaoEspiritual", 5, 4, "Aumentar");

				}
			});
			btDragaoAscendenteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDilema<2 && count<2){
						atualizarCalculo(varDilema, "Dilema", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDoSilencio<2 && count<2){
						atualizarCalculo(varChakraDoSilencio, "ChakraDoSilencio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCampoAmaldicoado<1 && count<1){
						atualizarCalculo(varCampoAmaldicoado, "CampoAmaldicoado", 5, 4, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoDoDragao<1 && count<1){
						atualizarCalculo(varPunhoDoDragao, "PunhoDoDragao", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpactoSismico<2 && count<2){
						atualizarCalculo(varImpactoSismico, "ImpactoSismico", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varExplosaoEspiritual<3 && count<3){
						atualizarCalculo(varExplosaoEspiritual, "ExplosaoEspiritual", 5, 4, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDoSilencio<3 && count<3){
						atualizarCalculo(varChakraDoSilencio, "ChakraDoSilencio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDeEnergia<3 && count<3){
						atualizarCalculo(varChakraDeEnergia, "ChakraDeEnergia", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDragaoAscendente, "DragaoAscendente", 10, 4, "Aumentar");

				}
			});
			btSocoFuracaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoDoDragao<3 && count<3){
						atualizarCalculo(varPunhoDoDragao, "PunhoDoDragao", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSocoFuracao, "SocoFuracao", 5, 4, "Aumentar");

				}
			});
			btGarraDeTigreAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varComboTriplo<5 && count<5){
						atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoDoDragao<1 && count<1){
						atualizarCalculo(varPunhoDoDragao, "PunhoDoDragao", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRuina<3 && count<3){
						atualizarCalculo(varRuina, "Ruina", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGarraDeTigre, "GarraDeTigre", 10, 4, "Aumentar");

				}
			});
			btRasteiraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<5 && count<5){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCairDasPetalas<5 && count<5){
						atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDilema<2 && count<2){
						atualizarCalculo(varDilema, "Dilema", 5, 2, "Aumentar");
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
					while(varProtecaoDivina<10 && count<10){
						atualizarCalculo(varProtecaoDivina, "ProtecaoDivina", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhosDeFerro<2 && count<2){
						atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferasEspirituais<5 && count<5){
						atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRenunciaEspiritual<1 && count<1){
						atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChakraDoSilencio<2 && count<2){
						atualizarCalculo(varChakraDoSilencio, "ChakraDoSilencio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCampoAmaldicoado<1 && count<1){
						atualizarCalculo(varCampoAmaldicoado, "CampoAmaldicoado", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRasteira, "Rasteira", 1, 4, "Aumentar");

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
			btCairDasPetalasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCairDasPetalas, "CairDasPetalas", 10, 2, "Diminuir");

				}
			});
			btFuriaInteriorDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFuriaInterior, "FuriaInterior", 5, 2, "Diminuir");

				}
			});
			btPunhoSupremoDeAsuraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPunhoSupremoDeAsura, "PunhoSupremoDeAsura", 5, 2, "Diminuir");

				}
			});
			btPunhosDeFerroDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Diminuir");

				}
			});
			btCorpoFechadoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCorpoFechado, "CorpoFechado", 5, 2, "Diminuir");

				}
			});
			btImpactoPsiquicoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varImpactoPsiquico, "ImpactoPsiquico", 5, 2, "Diminuir");

				}
			});
			btComboQuadruploDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varComboQuadruplo, "ComboQuadruplo", 5, 2, "Diminuir");

				}
			});
			btOUltimoDragaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOUltimoDragao, "OUltimoDragao", 5, 2, "Diminuir");

				}
			});
			btComboTriploDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varComboTriplo, "ComboTriplo", 10, 2, "Diminuir");

				}
			});
			btDilemaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDilema, "Dilema", 5, 2, "Diminuir");

				}
			});
			btPassoEtereoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPassoEtereo, "PassoEtereo", 1, 2, "Diminuir");

				}
			});
			btMeditacaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMeditacao, "Meditacao", 5, 2, "Diminuir");

				}
			});
			btAbsorverEsferasEspirituaisDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAbsorverEsferasEspirituais, "AbsorverEsferasEspirituais", 1, 2, "Diminuir");

				}
			});
			btInvocarEsferasEspirituaisDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInvocarEsferasEspirituais, "InvocarEsferasEspirituais", 5, 2, "Diminuir");

				}
			});
			btDisparoDasEsferasEspirituaisDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDisparoDasEsferasEspirituais, "DisparoDasEsferasEspirituais", 5, 2, "Diminuir");

				}
			});
			btComboEsmagadorDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varComboEsmagador, "ComboEsmagador", 10, 3, "Diminuir");

				}
			});
			btPunhoDoTigreDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPunhoDoTigre, "PunhoDoTigre", 5, 3, "Diminuir");

				}
			});
			btGolpeDaPalmaEmFuriaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGolpeDaPalmaEmFuria, "GolpeDaPalmaEmFuria", 5, 3, "Diminuir");

				}
			});
			btZenDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varZen, "Zen", 1, 3, "Diminuir");

				}
			});
			btCotoveladaAscendenteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCotoveladaAscendente, "CotoveladaAscendente", 5, 4, "Diminuir");

				}
			});
			btCampoAmaldicoadoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCampoAmaldicoado, "CampoAmaldicoado", 5, 4, "Diminuir");

				}
			});
			btPunhoDoDragaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPunhoDoDragao, "PunhoDoDragao", 10, 4, "Diminuir");

				}
			});
			btImpactoSismicoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varImpactoSismico, "ImpactoSismico", 5, 4, "Diminuir");

				}
			});
			btRuinaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRuina, "Ruina", 5, 4, "Diminuir");

				}
			});
			btChakraDaFuriaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChakraDaFuria, "ChakraDaFuria", 5, 4, "Diminuir");

				}
			});
			btChakraDaCuraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChakraDaCura, "ChakraDaCura", 5, 4, "Diminuir");

				}
			});
			btChakraDoVigorDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChakraDoVigor, "ChakraDoVigor", 5, 4, "Diminuir");

				}
			});
			btChakraDeEnergiaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChakraDeEnergia, "ChakraDeEnergia", 5, 4, "Diminuir");

				}
			});
			btChakraDoSilencioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChakraDoSilencio, "ChakraDoSilencio", 5, 4, "Diminuir");

				}
			});
			btPortoesDoInfernoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPortoesDoInferno, "PortoesDoInferno", 10, 4, "Diminuir");

				}
			});
			btSaltoRelampagoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSaltoRelampago, "SaltoRelampago", 5, 4, "Diminuir");

				}
			});
			btCavalgarRelampagoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCavalgarRelampago, "CavalgarRelampago", 5, 4, "Diminuir");

				}
			});
			btRugidoDoLeaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRugidoDoLeao, "RugidoDoLeao", 5, 4, "Diminuir");

				}
			});
			btInvestidaDeShuraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInvestidaDeShura, "InvestidaDeShura", 5, 4, "Diminuir");

				}
			});
			btRenunciaEspiritualDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRenunciaEspiritual, "RenunciaEspiritual", 1, 4, "Diminuir");

				}
			});
			btAbsorcaoEspiritualDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAbsorcaoEspiritual, "AbsorcaoEspiritual", 1, 4, "Diminuir");

				}
			});
			btExplosaoEspiritualDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varExplosaoEspiritual, "ExplosaoEspiritual", 5, 4, "Diminuir");

				}
			});
			btDragaoAscendenteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDragaoAscendente, "DragaoAscendente", 10, 4, "Diminuir");

				}
			});
			btSocoFuracaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSocoFuracao, "SocoFuracao", 5, 4, "Diminuir");

				}
			});
			btGarraDeTigreDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGarraDeTigre, "GarraDeTigre", 10, 4, "Diminuir");

				}
			});
			btRasteiraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRasteira, "Rasteira", 1, 4, "Diminuir");

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
					varCairDasPetalas = 0;
					varFuriaInterior = 0;
					varPunhoSupremoDeAsura = 0;
					varPunhosDeFerro = 0;
					varCorpoFechado = 0;
					varImpactoPsiquico = 0;
					varComboQuadruplo = 0;
					varOUltimoDragao = 0;
					varComboTriplo = 0;
					varDilema = 0;
					varPassoEtereo = 0;
					varMeditacao = 0;
					varAbsorverEsferasEspirituais = 0;
					varInvocarEsferasEspirituais = 0;
					varDisparoDasEsferasEspirituais = 0;
					varComboEsmagador = 0;
					varPunhoDoTigre = 0;
					varGolpeDaPalmaEmFuria = 0;
					varZen = 0;
					varCotoveladaAscendente = 0;
					varCampoAmaldicoado = 0;
					varPunhoDoDragao = 0;
					varImpactoSismico = 0;
					varRuina = 0;
					varChakraDaFuria = 0;
					varChakraDaCura = 0;
					varChakraDoVigor = 0;
					varChakraDeEnergia = 0;
					varChakraDoSilencio = 0;
					varPortoesDoInferno = 0;
					varSaltoRelampago = 0;
					varCavalgarRelampago = 0;
					varRugidoDoLeao = 0;
					varInvestidaDeShura = 0;
					varRenunciaEspiritual = 0;
					varAbsorcaoEspiritual = 0;
					varExplosaoEspiritual = 0;
					varDragaoAscendente = 0;
					varSocoFuracao = 0;
					varGarraDeTigre = 0;
					varRasteira = 0;

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
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorShura.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorShura.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorShura.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorShura.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorShura.this);
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

					AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorShura.this);
					msg.setTitle("Escolha um nome");
					msg.setMessage("OBS: Salvar PNG só irá salvar em forma de imagem! É recomendado que salve a build na memória do celular também.\nEscolha um nome para salvar esta simulação:");
					final EditText nomeParaSalvar = new EditText(SimuladorShura.this);
					msg.setView(nomeParaSalvar);
					msg.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {

							@Override
						public void onClick(DialogInterface dialog, int which) {
							if (nomeParaSalvar.getText().toString().length() <= 0) {
								nomeParaSalvar.setError("Preencha o campo!");
								Toast.makeText(getBaseContext(), "ERROR: Insira um nome!", Toast.LENGTH_SHORT).show();
							} else {
								SaveFile sf = new SaveFile();
								sf.takeAScreenShot(SimuladorShura.this, layPrincipal, nomeParaSalvar.getText().toString());
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

			if(varCairDasPetalas==0)
				layCairDasPetalas.setVisibility(View.GONE);
			if(varFuriaInterior==0)
				layFuriaInterior.setVisibility(View.GONE);
			if(varPunhoSupremoDeAsura==0)
				layPunhoSupremoDeAsura.setVisibility(View.GONE);
			if(varPunhosDeFerro==0)
				layPunhosDeFerro.setVisibility(View.GONE);
			if(varCorpoFechado==0)
				layCorpoFechado.setVisibility(View.GONE);
			if(varImpactoPsiquico==0)
				layImpactoPsiquico.setVisibility(View.GONE);
			if(varComboQuadruplo==0)
				layComboQuadruplo.setVisibility(View.GONE);
			if(varOUltimoDragao==0)
				layOUltimoDragao.setVisibility(View.GONE);
			if(varComboTriplo==0)
				layComboTriplo.setVisibility(View.GONE);
			if(varDilema==0)
				layDilema.setVisibility(View.GONE);
			if(varPassoEtereo==0)
				layPassoEtereo.setVisibility(View.GONE);
			if(varMeditacao==0)
				layMeditacao.setVisibility(View.GONE);
			if(varAbsorverEsferasEspirituais==0)
				layAbsorverEsferasEspirituais.setVisibility(View.GONE);
			if(varInvocarEsferasEspirituais==0)
				layInvocarEsferasEspirituais.setVisibility(View.GONE);
			if(varDisparoDasEsferasEspirituais==0)
				layDisparoDasEsferasEspirituais.setVisibility(View.GONE);

			if(varComboEsmagador==0)
				layComboEsmagador.setVisibility(View.GONE);
			if(varPunhoDoTigre==0)
				layPunhoDoTigre.setVisibility(View.GONE);
			if(varGolpeDaPalmaEmFuria==0)
				layGolpeDaPalmaEmFuria.setVisibility(View.GONE);
			if(varZen==0)
				layZen.setVisibility(View.GONE);

			if(varCotoveladaAscendente==0)
				layCotoveladaAscendente.setVisibility(View.GONE);
			if(varCampoAmaldicoado==0)
				layCampoAmaldicoado.setVisibility(View.GONE);
			if(varPunhoDoDragao==0)
				layPunhoDoDragao.setVisibility(View.GONE);
			if(varImpactoSismico==0)
				layImpactoSismico.setVisibility(View.GONE);
			if(varRuina==0)
				layRuina.setVisibility(View.GONE);
			if(varChakraDaFuria==0)
				layChakraDaFuria.setVisibility(View.GONE);
			if(varChakraDaCura==0)
				layChakraDaCura.setVisibility(View.GONE);
			if(varChakraDoVigor==0)
				layChakraDoVigor.setVisibility(View.GONE);
			if(varChakraDeEnergia==0)
				layChakraDeEnergia.setVisibility(View.GONE);
			if(varChakraDoSilencio==0)
				layChakraDoSilencio.setVisibility(View.GONE);
			if(varPortoesDoInferno==0)
				layPortoesDoInferno.setVisibility(View.GONE);
			if(varSaltoRelampago==0)
				laySaltoRelampago.setVisibility(View.GONE);
			if(varCavalgarRelampago==0)
				layCavalgarRelampago.setVisibility(View.GONE);
			if(varRugidoDoLeao==0)
				layRugidoDoLeao.setVisibility(View.GONE);
			if(varInvestidaDeShura==0)
				layInvestidaDeShura.setVisibility(View.GONE);
			if(varRenunciaEspiritual==0)
				layRenunciaEspiritual.setVisibility(View.GONE);
			if(varAbsorcaoEspiritual==0)
				layAbsorcaoEspiritual.setVisibility(View.GONE);
			if(varExplosaoEspiritual==0)
				layExplosaoEspiritual.setVisibility(View.GONE);
			if(varDragaoAscendente==0)
				layDragaoAscendente.setVisibility(View.GONE);
			if(varSocoFuracao==0)
				laySocoFuracao.setVisibility(View.GONE);
			if(varGarraDeTigre==0)
				layGarraDeTigre.setVisibility(View.GONE);
			if(varRasteira==0)
				layRasteira.setVisibility(View.GONE);

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

				if (nomeDaHabilidade=="InvocarEsferasEspirituais" && varCairDasPetalas>=1 && varInvocarEsferasEspirituais<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhosDeFerro" && varCairDasPetalas>=1 && varPunhosDeFerro<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AbsorverEsferasEspirituais" && varFuriaInterior>=1 && varAbsorverEsferasEspirituais<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FuriaInterior" && varPunhoSupremoDeAsura>=1 && varFuriaInterior<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DisparoDasEsferasEspirituais" && varPunhoSupremoDeAsura>=1 && varDisparoDasEsferasEspirituais<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FlageloDoMal" && varPunhosDeFerro>=1 && varFlageloDoMal<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ProtecaoDivina" && varPunhosDeFerro>=1 && varProtecaoDivina<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OUltimoDragao" && varCorpoFechado>=1 && varOUltimoDragao<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InvocarEsferasEspirituais" && varImpactoPsiquico>=1 && varInvocarEsferasEspirituais<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ComboTriplo" && varComboQuadruplo>=1 && varComboTriplo<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ComboQuadruplo" && varOUltimoDragao>=1 && varComboQuadruplo<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CairDasPetalas" && varComboTriplo>=1 && varCairDasPetalas<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CairDasPetalas" && varDilema>=1 && varCairDasPetalas<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Meditacao" && varPassoEtereo>=1 && varMeditacao<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CorpoFechado" && varPassoEtereo>=1 && varCorpoFechado<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhoSupremoDeAsura" && varPassoEtereo>=1 && varPunhoSupremoDeAsura<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Dilema" && varMeditacao>=1 && varDilema<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InvocarEsferasEspirituais" && varAbsorverEsferasEspirituais>=1 && varInvocarEsferasEspirituais<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhosDeFerro" && varInvocarEsferasEspirituais>=1 && varPunhosDeFerro<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ImpactoPsiquico" && varDisparoDasEsferasEspirituais>=1 && varImpactoPsiquico<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhoDoTigre" && varComboEsmagador>=1 && varPunhoDoTigre<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OUltimoDragao" && varPunhoDoTigre>=1 && varOUltimoDragao<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhosDeFerro" && varGolpeDaPalmaEmFuria>=1 && varPunhosDeFerro<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InvocarEsferasEspirituais" && varGolpeDaPalmaEmFuria>=1 && varInvocarEsferasEspirituais<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FuriaInterior" && varZen>=1 && varFuriaInterior<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="SocoFuracao" && varCotoveladaAscendente>=1 && varSocoFuracao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Dilema" && varCampoAmaldicoado>=1 && varDilema<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ChakraDoSilencio" && varCampoAmaldicoado>=1 && varChakraDoSilencio<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ComboTriplo" && varPunhoDoDragao>=1 && varComboTriplo<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CampoAmaldicoado" && varImpactoSismico>=1 && varCampoAmaldicoado<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhoDoDragao" && varImpactoSismico>=1 && varPunhoDoDragao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhoDoDragao" && varRuina>=1 && varPunhoDoDragao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ChakraDaCura" && varChakraDaFuria>=1 && varChakraDaCura<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RenunciaEspiritual" && varChakraDaCura>=1 && varRenunciaEspiritual<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ChakraDaFuria" && varChakraDoVigor>=1 && varChakraDaFuria<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ChakraDoSilencio" && varChakraDeEnergia>=1 && varChakraDoSilencio<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RenunciaEspiritual" && varChakraDoSilencio>=1 && varRenunciaEspiritual<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="GarraDeTigre" && varPortoesDoInferno>=1 && varGarraDeTigre<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DragaoAscendente" && varPortoesDoInferno>=1 && varDragaoAscendente<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Rasteira" && varSaltoRelampago>=1 && varRasteira<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DisparoDasEsferasEspirituais" && varCavalgarRelampago>=1 && varDisparoDasEsferasEspirituais<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AbsorcaoEspiritual" && varRugidoDoLeao>=1 && varAbsorcaoEspiritual<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CavalgarRelampago" && varRugidoDoLeao>=1 && varCavalgarRelampago<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="SaltoRelampago" && varInvestidaDeShura>=1 && varSaltoRelampago<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ExplosaoEspiritual" && varInvestidaDeShura>=1 && varExplosaoEspiritual<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InvocarEsferasEspirituais" && varRenunciaEspiritual>=1 && varInvocarEsferasEspirituais<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RenunciaEspiritual" && varAbsorcaoEspiritual>=1 && varRenunciaEspiritual<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ImpactoSismico" && varExplosaoEspiritual>=1 && varImpactoSismico<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ExplosaoEspiritual" && varDragaoAscendente>=1 && varExplosaoEspiritual<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ChakraDeEnergia" && varDragaoAscendente>=1 && varChakraDeEnergia<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhoDoDragao" && varSocoFuracao>=1 && varPunhoDoDragao<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Ruina" && varGarraDeTigre>=1 && varRuina<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CampoAmaldicoado" && varRasteira>=1 && varCampoAmaldicoado<=01){
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

			else if(nomeDaHabilidade=="CairDasPetalas"){
				varCairDasPetalas = habilidade;
			} else if(nomeDaHabilidade=="FuriaInterior"){
				varFuriaInterior = habilidade;
			} else if(nomeDaHabilidade=="PunhoSupremoDeAsura"){
				varPunhoSupremoDeAsura = habilidade;
			} else if(nomeDaHabilidade=="PunhosDeFerro"){
				varPunhosDeFerro = habilidade;
			} else if(nomeDaHabilidade=="CorpoFechado"){
				varCorpoFechado = habilidade;
			} else if(nomeDaHabilidade=="ImpactoPsiquico"){
				varImpactoPsiquico = habilidade;
			} else if(nomeDaHabilidade=="ComboQuadruplo"){
				varComboQuadruplo = habilidade;
			} else if(nomeDaHabilidade=="OUltimoDragao"){
				varOUltimoDragao = habilidade;
			} else if(nomeDaHabilidade=="ComboTriplo"){
				varComboTriplo = habilidade;
			} else if(nomeDaHabilidade=="Dilema"){
				varDilema = habilidade;
			} else if(nomeDaHabilidade=="PassoEtereo"){
				varPassoEtereo = habilidade;
			} else if(nomeDaHabilidade=="Meditacao"){
				varMeditacao = habilidade;
			} else if(nomeDaHabilidade=="AbsorverEsferasEspirituais"){
				varAbsorverEsferasEspirituais = habilidade;
			} else if(nomeDaHabilidade=="InvocarEsferasEspirituais"){
				varInvocarEsferasEspirituais = habilidade;
			} else if(nomeDaHabilidade=="DisparoDasEsferasEspirituais"){
				varDisparoDasEsferasEspirituais = habilidade;
			}

			else if(nomeDaHabilidade=="ComboEsmagador"){
				varComboEsmagador = habilidade;
			} else if(nomeDaHabilidade=="PunhoDoTigre"){
				varPunhoDoTigre = habilidade;
			} else if(nomeDaHabilidade=="GolpeDaPalmaEmFuria"){
				varGolpeDaPalmaEmFuria = habilidade;
			} else if(nomeDaHabilidade=="Zen"){
				varZen = habilidade;
			}

			else if(nomeDaHabilidade=="CotoveladaAscendente"){
				varCotoveladaAscendente = habilidade;
			} else if(nomeDaHabilidade=="CampoAmaldicoado"){
				varCampoAmaldicoado = habilidade;
			} else if(nomeDaHabilidade=="PunhoDoDragao"){
				varPunhoDoDragao = habilidade;
			} else if(nomeDaHabilidade=="ImpactoSismico"){
				varImpactoSismico = habilidade;
			} else if(nomeDaHabilidade=="Ruina"){
				varRuina = habilidade;
			} else if(nomeDaHabilidade=="ChakraDaFuria"){
				varChakraDaFuria = habilidade;
			} else if(nomeDaHabilidade=="ChakraDaCura"){
				varChakraDaCura = habilidade;
			} else if(nomeDaHabilidade=="ChakraDoVigor"){
				varChakraDoVigor = habilidade;
			} else if(nomeDaHabilidade=="ChakraDeEnergia"){
				varChakraDeEnergia = habilidade;
			} else if(nomeDaHabilidade=="ChakraDoSilencio"){
				varChakraDoSilencio = habilidade;
			} else if(nomeDaHabilidade=="PortoesDoInferno"){
				varPortoesDoInferno = habilidade;
			} else if(nomeDaHabilidade=="SaltoRelampago"){
				varSaltoRelampago = habilidade;
			} else if(nomeDaHabilidade=="CavalgarRelampago"){
				varCavalgarRelampago = habilidade;
			} else if(nomeDaHabilidade=="RugidoDoLeao"){
				varRugidoDoLeao = habilidade;
			} else if(nomeDaHabilidade=="InvestidaDeShura"){
				varInvestidaDeShura = habilidade;
			} else if(nomeDaHabilidade=="RenunciaEspiritual"){
				varRenunciaEspiritual = habilidade;
			} else if(nomeDaHabilidade=="AbsorcaoEspiritual"){
				varAbsorcaoEspiritual = habilidade;
			} else if(nomeDaHabilidade=="ExplosaoEspiritual"){
				varExplosaoEspiritual = habilidade;
			} else if(nomeDaHabilidade=="DragaoAscendente"){
				varDragaoAscendente = habilidade;
			} else if(nomeDaHabilidade=="SocoFuracao"){
				varSocoFuracao = habilidade;
			} else if(nomeDaHabilidade=="GarraDeTigre"){
				varGarraDeTigre = habilidade;
			} else if(nomeDaHabilidade=="Rasteira"){
				varRasteira = habilidade;
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

			txtCairDasPetalasPontos.setText(varCairDasPetalas + "/10");
			txtFuriaInteriorPontos.setText(varFuriaInterior + "/5");
			txtPunhoSupremoDeAsuraPontos.setText(varPunhoSupremoDeAsura + "/5");
			txtPunhosDeFerroPontos.setText(varPunhosDeFerro + "/10");
			txtCorpoFechadoPontos.setText(varCorpoFechado + "/5");
			txtImpactoPsiquicoPontos.setText(varImpactoPsiquico + "/5");
			txtComboQuadruploPontos.setText(varComboQuadruplo + "/5");
			txtOUltimoDragaoPontos.setText(varOUltimoDragao + "/5");
			txtComboTriploPontos.setText(varComboTriplo + "/10");
			txtDilemaPontos.setText(varDilema + "/5");
			txtPassoEtereoPontos.setText(varPassoEtereo + "/1");
			txtMeditacaoPontos.setText(varMeditacao + "/5");
			txtAbsorverEsferasEspirituaisPontos.setText(varAbsorverEsferasEspirituais + "/1");
			txtInvocarEsferasEspirituaisPontos.setText(varInvocarEsferasEspirituais + "/5");
			txtDisparoDasEsferasEspirituaisPontos.setText(varDisparoDasEsferasEspirituais + "/5");

			txtComboEsmagadorPontos.setText(varComboEsmagador + "/10");
			txtPunhoDoTigrePontos.setText(varPunhoDoTigre + "/5");
			txtGolpeDaPalmaEmFuriaPontos.setText(varGolpeDaPalmaEmFuria + "/5");
			txtZenPontos.setText(varZen + "/1");

			txtCotoveladaAscendentePontos.setText(varCotoveladaAscendente + "/5");
			txtCampoAmaldicoadoPontos.setText(varCampoAmaldicoado + "/5");
			txtPunhoDoDragaoPontos.setText(varPunhoDoDragao + "/10");
			txtImpactoSismicoPontos.setText(varImpactoSismico + "/5");
			txtRuinaPontos.setText(varRuina + "/5");
			txtChakraDaFuriaPontos.setText(varChakraDaFuria + "/5");
			txtChakraDaCuraPontos.setText(varChakraDaCura + "/5");
			txtChakraDoVigorPontos.setText(varChakraDoVigor + "/5");
			txtChakraDeEnergiaPontos.setText(varChakraDeEnergia + "/5");
			txtChakraDoSilencioPontos.setText(varChakraDoSilencio + "/5");
			txtPortoesDoInfernoPontos.setText(varPortoesDoInferno + "/10");
			txtSaltoRelampagoPontos.setText(varSaltoRelampago + "/5");
			txtCavalgarRelampagoPontos.setText(varCavalgarRelampago + "/5");
			txtRugidoDoLeaoPontos.setText(varRugidoDoLeao + "/5");
			txtInvestidaDeShuraPontos.setText(varInvestidaDeShura + "/5");
			txtRenunciaEspiritualPontos.setText(varRenunciaEspiritual + "/1");
			txtAbsorcaoEspiritualPontos.setText(varAbsorcaoEspiritual + "/1");
			txtExplosaoEspiritualPontos.setText(varExplosaoEspiritual + "/5");
			txtDragaoAscendentePontos.setText(varDragaoAscendente + "/10");
			txtSocoFuracaoPontos.setText(varSocoFuracao + "/5");
			txtGarraDeTigrePontos.setText(varGarraDeTigre + "/10");
			txtRasteiraPontos.setText(varRasteira + "/1");

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

			layCairDasPetalas.setVisibility(View.VISIBLE);
			layFuriaInterior.setVisibility(View.VISIBLE);
			layPunhoSupremoDeAsura.setVisibility(View.VISIBLE);
			layPunhosDeFerro.setVisibility(View.VISIBLE);
			layCorpoFechado.setVisibility(View.VISIBLE);
			layImpactoPsiquico.setVisibility(View.VISIBLE);
			layComboQuadruplo.setVisibility(View.VISIBLE);
			layOUltimoDragao.setVisibility(View.VISIBLE);
			layComboTriplo.setVisibility(View.VISIBLE);
			layDilema.setVisibility(View.VISIBLE);
			layPassoEtereo.setVisibility(View.VISIBLE);
			layMeditacao.setVisibility(View.VISIBLE);
			layAbsorverEsferasEspirituais.setVisibility(View.VISIBLE);
			layInvocarEsferasEspirituais.setVisibility(View.VISIBLE);
			layDisparoDasEsferasEspirituais.setVisibility(View.VISIBLE);

			layComboEsmagador.setVisibility(View.VISIBLE);
			layPunhoDoTigre.setVisibility(View.VISIBLE);
			layGolpeDaPalmaEmFuria.setVisibility(View.VISIBLE);
			layZen.setVisibility(View.VISIBLE);

			layCotoveladaAscendente.setVisibility(View.VISIBLE);
			layCampoAmaldicoado.setVisibility(View.VISIBLE);
			layPunhoDoDragao.setVisibility(View.VISIBLE);
			layImpactoSismico.setVisibility(View.VISIBLE);
			layRuina.setVisibility(View.VISIBLE);
			layChakraDaFuria.setVisibility(View.VISIBLE);
			layChakraDaCura.setVisibility(View.VISIBLE);
			layChakraDoVigor.setVisibility(View.VISIBLE);
			layChakraDeEnergia.setVisibility(View.VISIBLE);
			layChakraDoSilencio.setVisibility(View.VISIBLE);
			layPortoesDoInferno.setVisibility(View.VISIBLE);
			laySaltoRelampago.setVisibility(View.VISIBLE);
			layCavalgarRelampago.setVisibility(View.VISIBLE);
			layRugidoDoLeao.setVisibility(View.VISIBLE);
			layInvestidaDeShura.setVisibility(View.VISIBLE);
			layRenunciaEspiritual.setVisibility(View.VISIBLE);
			layAbsorcaoEspiritual.setVisibility(View.VISIBLE);
			layExplosaoEspiritual.setVisibility(View.VISIBLE);
			layDragaoAscendente.setVisibility(View.VISIBLE);
			laySocoFuracao.setVisibility(View.VISIBLE);
			layGarraDeTigre.setVisibility(View.VISIBLE);
			layRasteira.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM shura WHERE _id = ?", new String[]{String.valueOf(id)});

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

			varCairDasPetalas = cs.getInt(20);
			varFuriaInterior = cs.getInt(21);
			varPunhoSupremoDeAsura = cs.getInt(22);
			varPunhosDeFerro = cs.getInt(23);
			varCorpoFechado = cs.getInt(24);
			varImpactoPsiquico = cs.getInt(25);
			varComboQuadruplo = cs.getInt(26);
			varOUltimoDragao = cs.getInt(27);
			varComboTriplo = cs.getInt(28);
			varDilema = cs.getInt(29);
			varPassoEtereo = cs.getInt(30);
			varMeditacao = cs.getInt(31);
			varAbsorverEsferasEspirituais = cs.getInt(32);
			varInvocarEsferasEspirituais = cs.getInt(33);
			varDisparoDasEsferasEspirituais = cs.getInt(34);

			varComboEsmagador = cs.getInt(35);
			varPunhoDoTigre = cs.getInt(36);
			varGolpeDaPalmaEmFuria = cs.getInt(37);
			varZen = cs.getInt(38);

			varCotoveladaAscendente = cs.getInt(39);
			varCampoAmaldicoado = cs.getInt(40);
			varPunhoDoDragao = cs.getInt(41);
			varImpactoSismico = cs.getInt(42);
			varRuina = cs.getInt(43);
			varChakraDaFuria = cs.getInt(44);
			varChakraDaCura = cs.getInt(45);
			varChakraDoVigor = cs.getInt(46);
			varChakraDeEnergia = cs.getInt(47);
			varChakraDoSilencio = cs.getInt(48);
			varPortoesDoInferno = cs.getInt(49);
			varSaltoRelampago = cs.getInt(50);
			varCavalgarRelampago = cs.getInt(51);
			varRugidoDoLeao = cs.getInt(52);
			varInvestidaDeShura = cs.getInt(53);
			varRenunciaEspiritual = cs.getInt(54);
			varAbsorcaoEspiritual = cs.getInt(55);
			varExplosaoEspiritual = cs.getInt(56);
			varDragaoAscendente = cs.getInt(57);
			varSocoFuracao = cs.getInt(58);
			varGarraDeTigre = cs.getInt(59);
			varRasteira = cs.getInt(60);

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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS shura (");
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
					sqlClasse.append("skill_cairdaspetalas INT(2), ");
					sqlClasse.append("skill_furiainterior INT(2), ");
					sqlClasse.append("skill_punhosupremodeasura INT(2), ");
					sqlClasse.append("skill_punhosdeferro INT(2), ");
					sqlClasse.append("skill_corpofechado INT(2), ");
					sqlClasse.append("skill_impactopsiquico INT(2), ");
					sqlClasse.append("skill_comboquadruplo INT(2), ");
					sqlClasse.append("skill_oultimodragao INT(2), ");
					sqlClasse.append("skill_combotriplo INT(2), ");
					sqlClasse.append("skill_dilema INT(2), ");
					sqlClasse.append("skill_passoetereo INT(2), ");
					sqlClasse.append("skill_meditacao INT(2), ");
					sqlClasse.append("skill_absorveresferasespirituais INT(2), ");
					sqlClasse.append("skill_invocaresferasespirituais INT(2), ");
					sqlClasse.append("skill_disparodasesferasespirituais INT(2), ");
					sqlClasse.append("skill_comboesmagador INT(2), ");
					sqlClasse.append("skill_punhodotigre INT(2), ");
					sqlClasse.append("skill_golpedapalmaemfuria INT(2), ");
					sqlClasse.append("skill_zen INT(2), ");
					sqlClasse.append("skill_cotoveladaascendente INT(2), ");
					sqlClasse.append("skill_campoamaldicoado INT(2), ");
					sqlClasse.append("skill_punhododragao INT(2), ");
					sqlClasse.append("skill_impactosismico INT(2), ");
					sqlClasse.append("skill_ruina INT(2), ");
					sqlClasse.append("skill_chakradafuria INT(2), ");
					sqlClasse.append("skill_chakradacura INT(2), ");
					sqlClasse.append("skill_chakradovigor INT(2), ");
					sqlClasse.append("skill_chakradeenergia INT(2), ");
					sqlClasse.append("skill_chakradosilencio INT(2), ");
					sqlClasse.append("skill_portoesdoinferno INT(2), ");
					sqlClasse.append("skill_saltorelampago INT(2), ");
					sqlClasse.append("skill_cavalgarrelampago INT(2), ");
					sqlClasse.append("skill_rugidodoleao INT(2), ");
					sqlClasse.append("skill_investidadeshura INT(2), ");
					sqlClasse.append("skill_renunciaespiritual INT(2), ");
					sqlClasse.append("skill_absorcaoespiritual INT(2), ");
					sqlClasse.append("skill_explosaoespiritual INT(2), ");
					sqlClasse.append("skill_dragaoascendente INT(2), ");
					sqlClasse.append("skill_socofuracao INT(2), ");
					sqlClasse.append("skill_garradetigre INT(2), ");
					sqlClasse.append("skill_rasteira INT(2), ");
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
					ins.put("skill_cairdaspetalas", varCairDasPetalas);
					ins.put("skill_furiainterior", varFuriaInterior);
					ins.put("skill_punhosupremodeasura", varPunhoSupremoDeAsura);
					ins.put("skill_punhosdeferro", varPunhosDeFerro);
					ins.put("skill_corpofechado", varCorpoFechado);
					ins.put("skill_impactopsiquico", varImpactoPsiquico);
					ins.put("skill_comboquadruplo", varComboQuadruplo);
					ins.put("skill_oultimodragao", varOUltimoDragao);
					ins.put("skill_combotriplo", varComboTriplo);
					ins.put("skill_dilema", varDilema);
					ins.put("skill_passoetereo", varPassoEtereo);
					ins.put("skill_meditacao", varMeditacao);
					ins.put("skill_absorveresferasespirituais", varAbsorverEsferasEspirituais);
					ins.put("skill_invocaresferasespirituais", varInvocarEsferasEspirituais);
					ins.put("skill_disparodasesferasespirituais", varDisparoDasEsferasEspirituais);
					ins.put("skill_comboesmagador", varComboEsmagador);
					ins.put("skill_punhodotigre", varPunhoDoTigre);
					ins.put("skill_golpedapalmaemfuria", varGolpeDaPalmaEmFuria);
					ins.put("skill_zen", varZen);
					ins.put("skill_cotoveladaascendente", varCotoveladaAscendente);
					ins.put("skill_campoamaldicoado", varCampoAmaldicoado);
					ins.put("skill_punhododragao", varPunhoDoDragao);
					ins.put("skill_impactosismico", varImpactoSismico);
					ins.put("skill_ruina", varRuina);
					ins.put("skill_chakradafuria", varChakraDaFuria);
					ins.put("skill_chakradacura", varChakraDaCura);
					ins.put("skill_chakradovigor", varChakraDoVigor);
					ins.put("skill_chakradeenergia", varChakraDeEnergia);
					ins.put("skill_chakradosilencio", varChakraDoSilencio);
					ins.put("skill_portoesdoinferno", varPortoesDoInferno);
					ins.put("skill_saltorelampago", varSaltoRelampago);
					ins.put("skill_cavalgarrelampago", varCavalgarRelampago);
					ins.put("skill_rugidodoleao", varRugidoDoLeao);
					ins.put("skill_investidadeshura", varInvestidaDeShura);
					ins.put("skill_renunciaespiritual", varRenunciaEspiritual);
					ins.put("skill_absorcaoespiritual", varAbsorcaoEspiritual);
					ins.put("skill_explosaoespiritual", varExplosaoEspiritual);
					ins.put("skill_dragaoascendente", varDragaoAscendente);
					ins.put("skill_socofuracao", varSocoFuracao);
					ins.put("skill_garradetigre", varGarraDeTigre);
					ins.put("skill_rasteira", varRasteira);
					ins.put("skill_primeira", skillPrimeira);
					ins.put("skill_segunda", skillSegunda);
					ins.put("skill_trans", skillTrans);
					ins.put("skill_terceira", skillTerceira);
					if(!novo){
						try {
							db.update("shura", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("shura", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from shura", null);
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
						ins2.put("classe", "shura");
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