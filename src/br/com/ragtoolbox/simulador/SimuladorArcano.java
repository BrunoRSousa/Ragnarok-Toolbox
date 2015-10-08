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

public class SimuladorArcano extends Activity {

		//Botões de interrogação
		Button btLancasDeGeloInterrogacao,
		btBolasDeFogoInterrogacao,
		btLancasDeFogoInterrogacao,
		btBarreiraDeFogoInterrogacao,
		btRajadaCongelanteInterrogacao,
		btAumentarRecuperacaoDeSPInterrogacao,
		btRelampagoInterrogacao,
		btAtaqueEspiritualInterrogacao,
		btEscudoMagicoInterrogacao,
		btChamaReveladoraInterrogacao,
		btEspiritosAncioesInterrogacao,
		btPetrificarInterrogacao,
		btTempestadeDeRaiosInterrogacao,
		btProtecaoArcanaInterrogacao,
		btColunaDePedraInterrogacao,
		btColunaDeFogoInterrogacao,
		btCongelarInterrogacao,
		btFuriaDaTerraInterrogacao,
		btBarreiraDeGeloInterrogacao,
		btTrovaoDeJupiterInterrogacao,
		btIraDeThorInterrogacao,
		btChuvaDeMeteorosInterrogacao,
		btPantanoDosMortosInterrogacao,
		btSentidoSobrenaturalInterrogacao,
		btSupernovaInterrogacao,
		btNevascaInterrogacao,
		btEsferaDaguaInterrogacao,
		btExplosaoProtetoraInterrogacao,
		btGanbanteinInterrogacao,
		btCampoGravitacionalInterrogacao,
		btAmplificacaoMisticaInterrogacao,
		btVulcaoNapalmInterrogacao,
		btDrenoDeAlmaInterrogacao,
		btEsmagamentoMagicoInterrogacao,
		btMaestriaArcanaInterrogacao,
		btExpansaoArcanaInterrogacao,
		btEstudoArcanoInterrogacao,
		btEstudoArcanoAvancadoInterrogacao,
		btDistorcaoArcanaInterrogacao,
		btDrenarVidaInterrogacao,
		btInvocarEsferaDeFogoInterrogacao,
		btInvocarEsferaDeAguaInterrogacao,
		btInvocarEsferaDeVentoInterrogacao,
		btInvocarEsferaDeTerraInterrogacao,
		btDisparoArcanoInterrogacao,
		btZeroAbsolutoInterrogacao,
		btEsquifeDeGeloInterrogacao,
		btChamasDeHelaInterrogacao,
		btMeteoroEscarlateInterrogacao,
		btAbaloSismicoInterrogacao,
		btImpactoEspiritualInterrogacao,
		btCorrenteEletricaInterrogacao,
		btPantanoDeNifflheimInterrogacao,
		btFuriaDaMedusaInterrogacao,
		btExilioInterrogacao,
		btCometaInterrogacao,
		btTetraVortexInterrogacao;

		//Botões de diminuir habilidades
		Button btLancasDeGeloDiminuir,
		btBolasDeFogoDiminuir,
		btLancasDeFogoDiminuir,
		btBarreiraDeFogoDiminuir,
		btRajadaCongelanteDiminuir,
		btAumentarRecuperacaoDeSPDiminuir,
		btRelampagoDiminuir,
		btAtaqueEspiritualDiminuir,
		btEscudoMagicoDiminuir,
		btChamaReveladoraDiminuir,
		btEspiritosAncioesDiminuir,
		btPetrificarDiminuir,
		btTempestadeDeRaiosDiminuir,
		btColunaDePedraDiminuir,
		btColunaDeFogoDiminuir,
		btCongelarDiminuir,
		btFuriaDaTerraDiminuir,
		btBarreiraDeGeloDiminuir,
		btTrovaoDeJupiterDiminuir,
		btIraDeThorDiminuir,
		btChuvaDeMeteorosDiminuir,
		btPantanoDosMortosDiminuir,
		btSentidoSobrenaturalDiminuir,
		btSupernovaDiminuir,
		btNevascaDiminuir,
		btEsferaDaguaDiminuir,
		btGanbanteinDiminuir,
		btCampoGravitacionalDiminuir,
		btAmplificacaoMisticaDiminuir,
		btVulcaoNapalmDiminuir,
		btDrenoDeAlmaDiminuir,
		btEsmagamentoMagicoDiminuir,
		btMaestriaArcanaDiminuir,
		btExpansaoArcanaDiminuir,
		btEstudoArcanoDiminuir,
		btEstudoArcanoAvancadoDiminuir,
		btDistorcaoArcanaDiminuir,
		btDrenarVidaDiminuir,
		btInvocarEsferaDeFogoDiminuir,
		btInvocarEsferaDeAguaDiminuir,
		btInvocarEsferaDeVentoDiminuir,
		btInvocarEsferaDeTerraDiminuir,
		btDisparoArcanoDiminuir,
		btZeroAbsolutoDiminuir,
		btEsquifeDeGeloDiminuir,
		btChamasDeHelaDiminuir,
		btMeteoroEscarlateDiminuir,
		btAbaloSismicoDiminuir,
		btImpactoEspiritualDiminuir,
		btCorrenteEletricaDiminuir,
		btPantanoDeNifflheimDiminuir,
		btFuriaDaMedusaDiminuir,
		btExilioDiminuir,
		btCometaDiminuir,
		btTetraVortexDiminuir;

		//Botões de aumentar habilidades
		Button btLancasDeGeloAumentar,
		btBolasDeFogoAumentar,
		btLancasDeFogoAumentar,
		btBarreiraDeFogoAumentar,
		btRajadaCongelanteAumentar,
		btAumentarRecuperacaoDeSPAumentar,
		btRelampagoAumentar,
		btAtaqueEspiritualAumentar,
		btEscudoMagicoAumentar,
		btChamaReveladoraAumentar,
		btEspiritosAncioesAumentar,
		btPetrificarAumentar,
		btTempestadeDeRaiosAumentar,
		btColunaDePedraAumentar,
		btColunaDeFogoAumentar,
		btCongelarAumentar,
		btFuriaDaTerraAumentar,
		btBarreiraDeGeloAumentar,
		btTrovaoDeJupiterAumentar,
		btIraDeThorAumentar,
		btChuvaDeMeteorosAumentar,
		btPantanoDosMortosAumentar,
		btSentidoSobrenaturalAumentar,
		btSupernovaAumentar,
		btNevascaAumentar,
		btEsferaDaguaAumentar,
		btGanbanteinAumentar,
		btCampoGravitacionalAumentar,
		btAmplificacaoMisticaAumentar,
		btVulcaoNapalmAumentar,
		btDrenoDeAlmaAumentar,
		btEsmagamentoMagicoAumentar,
		btMaestriaArcanaAumentar,
		btExpansaoArcanaAumentar,
		btEstudoArcanoAumentar,
		btEstudoArcanoAvancadoAumentar,
		btDistorcaoArcanaAumentar,
		btDrenarVidaAumentar,
		btInvocarEsferaDeFogoAumentar,
		btInvocarEsferaDeAguaAumentar,
		btInvocarEsferaDeVentoAumentar,
		btInvocarEsferaDeTerraAumentar,
		btDisparoArcanoAumentar,
		btZeroAbsolutoAumentar,
		btEsquifeDeGeloAumentar,
		btChamasDeHelaAumentar,
		btMeteoroEscarlateAumentar,
		btAbaloSismicoAumentar,
		btImpactoEspiritualAumentar,
		btCorrenteEletricaAumentar,
		btPantanoDeNifflheimAumentar,
		btFuriaDaMedusaAumentar,
		btExilioAumentar,
		btCometaAumentar,
		btTetraVortexAumentar;

		//Resto dos botões
		Button btResetar, btSalvar, btSalvarIMG;
		ToggleButton tgbtSomenteHabilidadeAprendida;


		//Txt pontos da tela
		TextView txtLancasDeGeloPontos,
		txtBolasDeFogoPontos,
		txtLancasDeFogoPontos,
		txtBarreiraDeFogoPontos,
		txtRajadaCongelantePontos,
		txtAumentarRecuperacaoDeSPPontos,
		txtRelampagoPontos,
		txtAtaqueEspiritualPontos,
		txtEscudoMagicoPontos,
		txtChamaReveladoraPontos,
		txtEspiritosAncioesPontos,
		txtPetrificarPontos,
		txtTempestadeDeRaiosPontos,
		txtColunaDePedraPontos,
		txtColunaDeFogoPontos,
		txtCongelarPontos,
		txtFuriaDaTerraPontos,
		txtBarreiraDeGeloPontos,
		txtTrovaoDeJupiterPontos,
		txtIraDeThorPontos,
		txtChuvaDeMeteorosPontos,
		txtPantanoDosMortosPontos,
		txtSentidoSobrenaturalPontos,
		txtSupernovaPontos,
		txtNevascaPontos,
		txtEsferaDaguaPontos,
		txtGanbanteinPontos,
		txtCampoGravitacionalPontos,
		txtAmplificacaoMisticaPontos,
		txtVulcaoNapalmPontos,
		txtDrenoDeAlmaPontos,
		txtEsmagamentoMagicoPontos,
		txtMaestriaArcanaPontos,
		txtExpansaoArcanaPontos,
		txtEstudoArcanoPontos,
		txtEstudoArcanoAvancadoPontos,
		txtDistorcaoArcanaPontos,
		txtDrenarVidaPontos,
		txtInvocarEsferaDeFogoPontos,
		txtInvocarEsferaDeAguaPontos,
		txtInvocarEsferaDeVentoPontos,
		txtInvocarEsferaDeTerraPontos,
		txtDisparoArcanoPontos,
		txtZeroAbsolutoPontos,
		txtEsquifeDeGeloPontos,
		txtChamasDeHelaPontos,
		txtMeteoroEscarlatePontos,
		txtAbaloSismicoPontos,
		txtImpactoEspiritualPontos,
		txtCorrenteEletricaPontos,
		txtPantanoDeNifflheimPontos,
		txtFuriaDaMedusaPontos,
		txtExilioPontos,
		txtCometaPontos,
		txtTetraVortexPontos;

		//Txt pontos restantes
		TextView txtClasse1, txtClasse2, txtTransClasse, txtClasse3;

		//Layouts
		LinearLayout layLancasDeGelo,
		layBolasDeFogo,
		layLancasDeFogo,
		layBarreiraDeFogo,
		layRajadaCongelante,
		layAumentarRecuperacaoDeSP,
		layRelampago,
		layAtaqueEspiritual,
		layEscudoMagico,
		layChamaReveladora,
		layEspiritosAncioes,
		layPetrificar,
		layTempestadeDeRaios,
		layColunaDePedra,
		layColunaDeFogo,
		layCongelar,
		layFuriaDaTerra,
		layBarreiraDeGelo,
		layTrovaoDeJupiter,
		layIraDeThor,
		layChuvaDeMeteoros,
		layPantanoDosMortos,
		laySentidoSobrenatural,
		laySupernova,
		layNevasca,
		layEsferaDagua,
		layGanbantein,
		layCampoGravitacional,
		layAmplificacaoMistica,
		layVulcaoNapalm,
		layDrenoDeAlma,
		layEsmagamentoMagico,
		layMaestriaArcana,
		layExpansaoArcana,
		layEstudoArcano,
		layEstudoArcanoAvancado,
		layDistorcaoArcana,
		layDrenarVida,
		layInvocarEsferaDeFogo,
		layInvocarEsferaDeAgua,
		layInvocarEsferaDeVento,
		layInvocarEsferaDeTerra,
		layDisparoArcano,
		layZeroAbsoluto,
		layEsquifeDeGelo,
		layChamasDeHela,
		layMeteoroEscarlate,
		layAbaloSismico,
		layImpactoEspiritual,
		layCorrenteEletrica,
		layPantanoDeNifflheim,
		layFuriaDaMedusa,
		layExilio,
		layCometa,
		layTetraVortex;

		//Variaveis de Skill
		int varLancasDeGelo,
		varBolasDeFogo,
		varLancasDeFogo,
		varBarreiraDeFogo,
		varRajadaCongelante,
		varAumentarRecuperacaoDeSP,
		varRelampago,
		varAtaqueEspiritual,
		varEscudoMagico,
		varChamaReveladora,
		varEspiritosAncioes,
		varPetrificar,
		varTempestadeDeRaios,
		varColunaDePedra,
		varColunaDeFogo,
		varCongelar,
		varFuriaDaTerra,
		varBarreiraDeGelo,
		varTrovaoDeJupiter,
		varIraDeThor,
		varChuvaDeMeteoros,
		varPantanoDosMortos,
		varSentidoSobrenatural,
		varSupernova,
		varNevasca,
		varEsferaDagua,
		varGanbantein,
		varCampoGravitacional,
		varAmplificacaoMistica,
		varVulcaoNapalm,
		varDrenoDeAlma,
		varEsmagamentoMagico,
		varMaestriaArcana,
		varExpansaoArcana,
		varEstudoArcano,
		varEstudoArcanoAvancado,
		varDistorcaoArcana,
		varDrenarVida,
		varInvocarEsferaDeFogo,
		varInvocarEsferaDeAgua,
		varInvocarEsferaDeVento,
		varInvocarEsferaDeTerra,
		varDisparoArcano,
		varZeroAbsoluto,
		varEsquifeDeGelo,
		varChamasDeHela,
		varMeteoroEscarlate,
		varAbaloSismico,
		varImpactoEspiritual,
		varCorrenteEletrica,
		varPantanoDeNifflheim,
		varFuriaDaMedusa,
		varExilio,
		varCometa,
		varTetraVortex;

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
			setContentView(R.layout.activity_simulador_arcano);

			Intent it = getIntent();

			final int id = it.getIntExtra("id", 0);
			idParaAlterar = "_id =" +id;

			//inicialização de variáveis
			varLancasDeGelo = 0;
			varBolasDeFogo = 0;
			varLancasDeFogo = 0;
			varBarreiraDeFogo = 0;
			varRajadaCongelante = 0;
			varAumentarRecuperacaoDeSP = 0;
			varRelampago = 0;
			varAtaqueEspiritual = 0;
			varEscudoMagico = 0;
			varChamaReveladora = 0;
			varEspiritosAncioes = 0;
			varPetrificar = 0;
			varTempestadeDeRaios = 0;
			varColunaDePedra = 0;
			varColunaDeFogo = 0;
			varCongelar = 0;
			varFuriaDaTerra = 0;
			varBarreiraDeGelo = 0;
			varTrovaoDeJupiter = 0;
			varIraDeThor = 0;
			varChuvaDeMeteoros = 0;
			varPantanoDosMortos = 0;
			varSentidoSobrenatural = 0;
			varSupernova = 0;
			varNevasca = 0;
			varEsferaDagua = 0;
			varGanbantein = 0;
			varCampoGravitacional = 0;
			varAmplificacaoMistica = 0;
			varVulcaoNapalm = 0;
			varDrenoDeAlma = 0;
			varEsmagamentoMagico = 0;
			varMaestriaArcana = 0;
			varExpansaoArcana = 0;
			varEstudoArcano = 0;
			varEstudoArcanoAvancado = 0;
			varDistorcaoArcana = 0;
			varDrenarVida = 0;
			varInvocarEsferaDeFogo = 0;
			varInvocarEsferaDeAgua = 0;
			varInvocarEsferaDeVento = 0;
			varInvocarEsferaDeTerra = 0;
			varDisparoArcano = 0;
			varZeroAbsoluto = 0;
			varEsquifeDeGelo = 0;
			varChamasDeHela = 0;
			varMeteoroEscarlate = 0;
			varAbaloSismico = 0;
			varImpactoEspiritual = 0;
			varCorrenteEletrica = 0;
			varPantanoDeNifflheim = 0;
			varFuriaDaMedusa = 0;
			varExilio = 0;
			varCometa = 0;
			varTetraVortex = 0;



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
			btLancasDeGeloInterrogacao = (Button) findViewById(R.id.btLancasDeGeloInterrogacao);
			btBolasDeFogoInterrogacao = (Button) findViewById(R.id.btBolasDeFogoInterrogacao);
			btLancasDeFogoInterrogacao = (Button) findViewById(R.id.btLancasDeFogoInterrogacao);
			btBarreiraDeFogoInterrogacao = (Button) findViewById(R.id.btBarreiraDeFogoInterrogacao);
			btRajadaCongelanteInterrogacao = (Button) findViewById(R.id.btRajadaCongelanteInterrogacao);
			btAumentarRecuperacaoDeSPInterrogacao = (Button) findViewById(R.id.btAumentarRecuperacaoDeSPInterrogacao);
			btRelampagoInterrogacao = (Button) findViewById(R.id.btRelampagoInterrogacao);
			btAtaqueEspiritualInterrogacao = (Button) findViewById(R.id.btAtaqueEspiritualInterrogacao);
			btEscudoMagicoInterrogacao = (Button) findViewById(R.id.btEscudoMagicoInterrogacao);
			btChamaReveladoraInterrogacao = (Button) findViewById(R.id.btChamaReveladoraInterrogacao);
			btEspiritosAncioesInterrogacao = (Button) findViewById(R.id.btEspiritosAncioesInterrogacao);
			btPetrificarInterrogacao = (Button) findViewById(R.id.btPetrificarInterrogacao);
			btTempestadeDeRaiosInterrogacao = (Button) findViewById(R.id.btTempestadeDeRaiosInterrogacao);
			btProtecaoArcanaInterrogacao = (Button) findViewById(R.id.btProtecaoArcanaInterrogacao);
			btColunaDePedraInterrogacao = (Button) findViewById(R.id.btColunaDePedraInterrogacao);
			btColunaDeFogoInterrogacao = (Button) findViewById(R.id.btColunaDeFogoInterrogacao);
			btCongelarInterrogacao = (Button) findViewById(R.id.btCongelarInterrogacao);
			btFuriaDaTerraInterrogacao = (Button) findViewById(R.id.btFuriaDaTerraInterrogacao);
			btBarreiraDeGeloInterrogacao = (Button) findViewById(R.id.btBarreiraDeGeloInterrogacao);
			btTrovaoDeJupiterInterrogacao = (Button) findViewById(R.id.btTrovaoDeJupiterInterrogacao);
			btIraDeThorInterrogacao = (Button) findViewById(R.id.btIraDeThorInterrogacao);
			btChuvaDeMeteorosInterrogacao = (Button) findViewById(R.id.btChuvaDeMeteorosInterrogacao);
			btPantanoDosMortosInterrogacao = (Button) findViewById(R.id.btPantanoDosMortosInterrogacao);
			btSentidoSobrenaturalInterrogacao = (Button) findViewById(R.id.btSentidoSobrenaturalInterrogacao);
			btSupernovaInterrogacao = (Button) findViewById(R.id.btSupernovaInterrogacao);
			btNevascaInterrogacao = (Button) findViewById(R.id.btNevascaInterrogacao);
			btEsferaDaguaInterrogacao = (Button) findViewById(R.id.btEsferaDaguaInterrogacao);
			btExplosaoProtetoraInterrogacao = (Button) findViewById(R.id.btExplosaoProtetoraInterrogacao);
			btGanbanteinInterrogacao = (Button) findViewById(R.id.btGanbanteinInterrogacao);
			btCampoGravitacionalInterrogacao = (Button) findViewById(R.id.btCampoGravitacionalInterrogacao);
			btAmplificacaoMisticaInterrogacao = (Button) findViewById(R.id.btAmplificacaoMisticaInterrogacao);
			btVulcaoNapalmInterrogacao = (Button) findViewById(R.id.btVulcaoNapalmInterrogacao);
			btDrenoDeAlmaInterrogacao = (Button) findViewById(R.id.btDrenoDeAlmaInterrogacao);
			btEsmagamentoMagicoInterrogacao = (Button) findViewById(R.id.btEsmagamentoMagicoInterrogacao);
			btMaestriaArcanaInterrogacao = (Button) findViewById(R.id.btMaestriaArcanaInterrogacao);
			btExpansaoArcanaInterrogacao = (Button) findViewById(R.id.btExpansaoArcanaInterrogacao);
			btEstudoArcanoInterrogacao = (Button) findViewById(R.id.btEstudoArcanoInterrogacao);
			btEstudoArcanoAvancadoInterrogacao = (Button) findViewById(R.id.btEstudoArcanoAvancadoInterrogacao);
			btDistorcaoArcanaInterrogacao = (Button) findViewById(R.id.btDistorcaoArcanaInterrogacao);
			btDrenarVidaInterrogacao = (Button) findViewById(R.id.btDrenarVidaInterrogacao);
			btInvocarEsferaDeFogoInterrogacao = (Button) findViewById(R.id.btInvocarEsferaDeFogoInterrogacao);
			btInvocarEsferaDeAguaInterrogacao = (Button) findViewById(R.id.btInvocarEsferaDeAguaInterrogacao);
			btInvocarEsferaDeVentoInterrogacao = (Button) findViewById(R.id.btInvocarEsferaDeVentoInterrogacao);
			btInvocarEsferaDeTerraInterrogacao = (Button) findViewById(R.id.btInvocarEsferaDeTerraInterrogacao);
			btDisparoArcanoInterrogacao = (Button) findViewById(R.id.btDisparoArcanoInterrogacao);
			btZeroAbsolutoInterrogacao = (Button) findViewById(R.id.btZeroAbsolutoInterrogacao);
			btEsquifeDeGeloInterrogacao = (Button) findViewById(R.id.btEsquifeDeGeloInterrogacao);
			btChamasDeHelaInterrogacao = (Button) findViewById(R.id.btChamasDeHelaInterrogacao);
			btMeteoroEscarlateInterrogacao = (Button) findViewById(R.id.btMeteoroEscarlateInterrogacao);
			btAbaloSismicoInterrogacao = (Button) findViewById(R.id.btAbaloSismicoInterrogacao);
			btImpactoEspiritualInterrogacao = (Button) findViewById(R.id.btImpactoEspiritualInterrogacao);
			btCorrenteEletricaInterrogacao = (Button) findViewById(R.id.btCorrenteEletricaInterrogacao);
			btPantanoDeNifflheimInterrogacao = (Button) findViewById(R.id.btPantanoDeNifflheimInterrogacao);
			btFuriaDaMedusaInterrogacao = (Button) findViewById(R.id.btFuriaDaMedusaInterrogacao);
			btExilioInterrogacao = (Button) findViewById(R.id.btExilioInterrogacao);
			btCometaInterrogacao = (Button) findViewById(R.id.btCometaInterrogacao);
			btTetraVortexInterrogacao = (Button) findViewById(R.id.btTetraVortexInterrogacao);

			//Botões de diminuir habilidades
			btLancasDeGeloDiminuir = (Button) findViewById(R.id.btLancasDeGeloDiminuir);
			btBolasDeFogoDiminuir = (Button) findViewById(R.id.btBolasDeFogoDiminuir);
			btLancasDeFogoDiminuir = (Button) findViewById(R.id.btLancasDeFogoDiminuir);
			btBarreiraDeFogoDiminuir = (Button) findViewById(R.id.btBarreiraDeFogoDiminuir);
			btRajadaCongelanteDiminuir = (Button) findViewById(R.id.btRajadaCongelanteDiminuir);
			btAumentarRecuperacaoDeSPDiminuir = (Button) findViewById(R.id.btAumentarRecuperacaoDeSPDiminuir);
			btRelampagoDiminuir = (Button) findViewById(R.id.btRelampagoDiminuir);
			btAtaqueEspiritualDiminuir = (Button) findViewById(R.id.btAtaqueEspiritualDiminuir);
			btEscudoMagicoDiminuir = (Button) findViewById(R.id.btEscudoMagicoDiminuir);
			btChamaReveladoraDiminuir = (Button) findViewById(R.id.btChamaReveladoraDiminuir);
			btEspiritosAncioesDiminuir = (Button) findViewById(R.id.btEspiritosAncioesDiminuir);
			btPetrificarDiminuir = (Button) findViewById(R.id.btPetrificarDiminuir);
			btTempestadeDeRaiosDiminuir = (Button) findViewById(R.id.btTempestadeDeRaiosDiminuir);
			btColunaDePedraDiminuir = (Button) findViewById(R.id.btColunaDePedraDiminuir);
			btColunaDeFogoDiminuir = (Button) findViewById(R.id.btColunaDeFogoDiminuir);
			btCongelarDiminuir = (Button) findViewById(R.id.btCongelarDiminuir);
			btFuriaDaTerraDiminuir = (Button) findViewById(R.id.btFuriaDaTerraDiminuir);
			btBarreiraDeGeloDiminuir = (Button) findViewById(R.id.btBarreiraDeGeloDiminuir);
			btTrovaoDeJupiterDiminuir = (Button) findViewById(R.id.btTrovaoDeJupiterDiminuir);
			btIraDeThorDiminuir = (Button) findViewById(R.id.btIraDeThorDiminuir);
			btChuvaDeMeteorosDiminuir = (Button) findViewById(R.id.btChuvaDeMeteorosDiminuir);
			btPantanoDosMortosDiminuir = (Button) findViewById(R.id.btPantanoDosMortosDiminuir);
			btSentidoSobrenaturalDiminuir = (Button) findViewById(R.id.btSentidoSobrenaturalDiminuir);
			btSupernovaDiminuir = (Button) findViewById(R.id.btSupernovaDiminuir);
			btNevascaDiminuir = (Button) findViewById(R.id.btNevascaDiminuir);
			btEsferaDaguaDiminuir = (Button) findViewById(R.id.btEsferaDaguaDiminuir);
			btGanbanteinDiminuir = (Button) findViewById(R.id.btGanbanteinDiminuir);
			btCampoGravitacionalDiminuir = (Button) findViewById(R.id.btCampoGravitacionalDiminuir);
			btAmplificacaoMisticaDiminuir = (Button) findViewById(R.id.btAmplificacaoMisticaDiminuir);
			btVulcaoNapalmDiminuir = (Button) findViewById(R.id.btVulcaoNapalmDiminuir);
			btDrenoDeAlmaDiminuir = (Button) findViewById(R.id.btDrenoDeAlmaDiminuir);
			btEsmagamentoMagicoDiminuir = (Button) findViewById(R.id.btEsmagamentoMagicoDiminuir);
			btMaestriaArcanaDiminuir = (Button) findViewById(R.id.btMaestriaArcanaDiminuir);
			btExpansaoArcanaDiminuir = (Button) findViewById(R.id.btExpansaoArcanaDiminuir);
			btEstudoArcanoDiminuir = (Button) findViewById(R.id.btEstudoArcanoDiminuir);
			btEstudoArcanoAvancadoDiminuir = (Button) findViewById(R.id.btEstudoArcanoAvancadoDiminuir);
			btDistorcaoArcanaDiminuir = (Button) findViewById(R.id.btDistorcaoArcanaDiminuir);
			btDrenarVidaDiminuir = (Button) findViewById(R.id.btDrenarVidaDiminuir);
			btInvocarEsferaDeFogoDiminuir = (Button) findViewById(R.id.btInvocarEsferaDeFogoDiminuir);
			btInvocarEsferaDeAguaDiminuir = (Button) findViewById(R.id.btInvocarEsferaDeAguaDiminuir);
			btInvocarEsferaDeVentoDiminuir = (Button) findViewById(R.id.btInvocarEsferaDeVentoDiminuir);
			btInvocarEsferaDeTerraDiminuir = (Button) findViewById(R.id.btInvocarEsferaDeTerraDiminuir);
			btDisparoArcanoDiminuir = (Button) findViewById(R.id.btDisparoArcanoDiminuir);
			btZeroAbsolutoDiminuir = (Button) findViewById(R.id.btZeroAbsolutoDiminuir);
			btEsquifeDeGeloDiminuir = (Button) findViewById(R.id.btEsquifeDeGeloDiminuir);
			btChamasDeHelaDiminuir = (Button) findViewById(R.id.btChamasDeHelaDiminuir);
			btMeteoroEscarlateDiminuir = (Button) findViewById(R.id.btMeteoroEscarlateDiminuir);
			btAbaloSismicoDiminuir = (Button) findViewById(R.id.btAbaloSismicoDiminuir);
			btImpactoEspiritualDiminuir = (Button) findViewById(R.id.btImpactoEspiritualDiminuir);
			btCorrenteEletricaDiminuir = (Button) findViewById(R.id.btCorrenteEletricaDiminuir);
			btPantanoDeNifflheimDiminuir = (Button) findViewById(R.id.btPantanoDeNifflheimDiminuir);
			btFuriaDaMedusaDiminuir = (Button) findViewById(R.id.btFuriaDaMedusaDiminuir);
			btExilioDiminuir = (Button) findViewById(R.id.btExilioDiminuir);
			btCometaDiminuir = (Button) findViewById(R.id.btCometaDiminuir);
			btTetraVortexDiminuir = (Button) findViewById(R.id.btTetraVortexDiminuir);

			//Botões de aumentar habilidades
			btLancasDeGeloAumentar = (Button) findViewById(R.id.btLancasDeGeloAumentar);
			btBolasDeFogoAumentar = (Button) findViewById(R.id.btBolasDeFogoAumentar);
			btLancasDeFogoAumentar = (Button) findViewById(R.id.btLancasDeFogoAumentar);
			btBarreiraDeFogoAumentar = (Button) findViewById(R.id.btBarreiraDeFogoAumentar);
			btRajadaCongelanteAumentar = (Button) findViewById(R.id.btRajadaCongelanteAumentar);
			btAumentarRecuperacaoDeSPAumentar = (Button) findViewById(R.id.btAumentarRecuperacaoDeSPAumentar);
			btRelampagoAumentar = (Button) findViewById(R.id.btRelampagoAumentar);
			btAtaqueEspiritualAumentar = (Button) findViewById(R.id.btAtaqueEspiritualAumentar);
			btEscudoMagicoAumentar = (Button) findViewById(R.id.btEscudoMagicoAumentar);
			btChamaReveladoraAumentar = (Button) findViewById(R.id.btChamaReveladoraAumentar);
			btEspiritosAncioesAumentar = (Button) findViewById(R.id.btEspiritosAncioesAumentar);
			btPetrificarAumentar = (Button) findViewById(R.id.btPetrificarAumentar);
			btTempestadeDeRaiosAumentar = (Button) findViewById(R.id.btTempestadeDeRaiosAumentar);
			btColunaDePedraAumentar = (Button) findViewById(R.id.btColunaDePedraAumentar);
			btColunaDeFogoAumentar = (Button) findViewById(R.id.btColunaDeFogoAumentar);
			btCongelarAumentar = (Button) findViewById(R.id.btCongelarAumentar);
			btFuriaDaTerraAumentar = (Button) findViewById(R.id.btFuriaDaTerraAumentar);
			btBarreiraDeGeloAumentar = (Button) findViewById(R.id.btBarreiraDeGeloAumentar);
			btTrovaoDeJupiterAumentar = (Button) findViewById(R.id.btTrovaoDeJupiterAumentar);
			btIraDeThorAumentar = (Button) findViewById(R.id.btIraDeThorAumentar);
			btChuvaDeMeteorosAumentar = (Button) findViewById(R.id.btChuvaDeMeteorosAumentar);
			btPantanoDosMortosAumentar = (Button) findViewById(R.id.btPantanoDosMortosAumentar);
			btSentidoSobrenaturalAumentar = (Button) findViewById(R.id.btSentidoSobrenaturalAumentar);
			btSupernovaAumentar = (Button) findViewById(R.id.btSupernovaAumentar);
			btNevascaAumentar = (Button) findViewById(R.id.btNevascaAumentar);
			btEsferaDaguaAumentar = (Button) findViewById(R.id.btEsferaDaguaAumentar);
			btGanbanteinAumentar = (Button) findViewById(R.id.btGanbanteinAumentar);
			btCampoGravitacionalAumentar = (Button) findViewById(R.id.btCampoGravitacionalAumentar);
			btAmplificacaoMisticaAumentar = (Button) findViewById(R.id.btAmplificacaoMisticaAumentar);
			btVulcaoNapalmAumentar = (Button) findViewById(R.id.btVulcaoNapalmAumentar);
			btDrenoDeAlmaAumentar = (Button) findViewById(R.id.btDrenoDeAlmaAumentar);
			btEsmagamentoMagicoAumentar = (Button) findViewById(R.id.btEsmagamentoMagicoAumentar);
			btMaestriaArcanaAumentar = (Button) findViewById(R.id.btMaestriaArcanaAumentar);
			btExpansaoArcanaAumentar = (Button) findViewById(R.id.btExpansaoArcanaAumentar);
			btEstudoArcanoAumentar = (Button) findViewById(R.id.btEstudoArcanoAumentar);
			btEstudoArcanoAvancadoAumentar = (Button) findViewById(R.id.btEstudoArcanoAvancadoAumentar);
			btDistorcaoArcanaAumentar = (Button) findViewById(R.id.btDistorcaoArcanaAumentar);
			btDrenarVidaAumentar = (Button) findViewById(R.id.btDrenarVidaAumentar);
			btInvocarEsferaDeFogoAumentar = (Button) findViewById(R.id.btInvocarEsferaDeFogoAumentar);
			btInvocarEsferaDeAguaAumentar = (Button) findViewById(R.id.btInvocarEsferaDeAguaAumentar);
			btInvocarEsferaDeVentoAumentar = (Button) findViewById(R.id.btInvocarEsferaDeVentoAumentar);
			btInvocarEsferaDeTerraAumentar = (Button) findViewById(R.id.btInvocarEsferaDeTerraAumentar);
			btDisparoArcanoAumentar = (Button) findViewById(R.id.btDisparoArcanoAumentar);
			btZeroAbsolutoAumentar = (Button) findViewById(R.id.btZeroAbsolutoAumentar);
			btEsquifeDeGeloAumentar = (Button) findViewById(R.id.btEsquifeDeGeloAumentar);
			btChamasDeHelaAumentar = (Button) findViewById(R.id.btChamasDeHelaAumentar);
			btMeteoroEscarlateAumentar = (Button) findViewById(R.id.btMeteoroEscarlateAumentar);
			btAbaloSismicoAumentar = (Button) findViewById(R.id.btAbaloSismicoAumentar);
			btImpactoEspiritualAumentar = (Button) findViewById(R.id.btImpactoEspiritualAumentar);
			btCorrenteEletricaAumentar = (Button) findViewById(R.id.btCorrenteEletricaAumentar);
			btPantanoDeNifflheimAumentar = (Button) findViewById(R.id.btPantanoDeNifflheimAumentar);
			btFuriaDaMedusaAumentar = (Button) findViewById(R.id.btFuriaDaMedusaAumentar);
			btExilioAumentar = (Button) findViewById(R.id.btExilioAumentar);
			btCometaAumentar = (Button) findViewById(R.id.btCometaAumentar);
			btTetraVortexAumentar = (Button) findViewById(R.id.btTetraVortexAumentar);

			//Resto dos botões
			btResetar = (Button) findViewById(R.id.btResetar);
			btSalvar = (Button) findViewById(R.id.btSalvar);
			btSalvarIMG = (Button) findViewById(R.id.btSalvarIMG);
			tgbtSomenteHabilidadeAprendida = (ToggleButton) findViewById(R.id.tgbtSomenteHabilidadeAprendida);

			//Txt pontos da tela
			txtLancasDeGeloPontos = (TextView) findViewById(R.id.txtLancasDeGeloPontos);
			txtBolasDeFogoPontos = (TextView) findViewById(R.id.txtBolasDeFogoPontos);
			txtLancasDeFogoPontos = (TextView) findViewById(R.id.txtLancasDeFogoPontos);
			txtBarreiraDeFogoPontos = (TextView) findViewById(R.id.txtBarreiraDeFogoPontos);
			txtRajadaCongelantePontos = (TextView) findViewById(R.id.txtRajadaCongelantePontos);
			txtAumentarRecuperacaoDeSPPontos = (TextView) findViewById(R.id.txtAumentarRecuperacaoDeSPPontos);
			txtRelampagoPontos = (TextView) findViewById(R.id.txtRelampagoPontos);
			txtAtaqueEspiritualPontos = (TextView) findViewById(R.id.txtAtaqueEspiritualPontos);
			txtEscudoMagicoPontos = (TextView) findViewById(R.id.txtEscudoMagicoPontos);
			txtChamaReveladoraPontos = (TextView) findViewById(R.id.txtChamaReveladoraPontos);
			txtEspiritosAncioesPontos = (TextView) findViewById(R.id.txtEspiritosAncioesPontos);
			txtPetrificarPontos = (TextView) findViewById(R.id.txtPetrificarPontos);
			txtTempestadeDeRaiosPontos = (TextView) findViewById(R.id.txtTempestadeDeRaiosPontos);
			txtColunaDePedraPontos = (TextView) findViewById(R.id.txtColunaDePedraPontos);
			txtColunaDeFogoPontos = (TextView) findViewById(R.id.txtColunaDeFogoPontos);
			txtCongelarPontos = (TextView) findViewById(R.id.txtCongelarPontos);
			txtFuriaDaTerraPontos = (TextView) findViewById(R.id.txtFuriaDaTerraPontos);
			txtBarreiraDeGeloPontos = (TextView) findViewById(R.id.txtBarreiraDeGeloPontos);
			txtTrovaoDeJupiterPontos = (TextView) findViewById(R.id.txtTrovaoDeJupiterPontos);
			txtIraDeThorPontos = (TextView) findViewById(R.id.txtIraDeThorPontos);
			txtChuvaDeMeteorosPontos = (TextView) findViewById(R.id.txtChuvaDeMeteorosPontos);
			txtPantanoDosMortosPontos = (TextView) findViewById(R.id.txtPantanoDosMortosPontos);
			txtSentidoSobrenaturalPontos = (TextView) findViewById(R.id.txtSentidoSobrenaturalPontos);
			txtSupernovaPontos = (TextView) findViewById(R.id.txtSupernovaPontos);
			txtNevascaPontos = (TextView) findViewById(R.id.txtNevascaPontos);
			txtEsferaDaguaPontos = (TextView) findViewById(R.id.txtEsferaDaguaPontos);
			txtGanbanteinPontos = (TextView) findViewById(R.id.txtGanbanteinPontos);
			txtCampoGravitacionalPontos = (TextView) findViewById(R.id.txtCampoGravitacionalPontos);
			txtAmplificacaoMisticaPontos = (TextView) findViewById(R.id.txtAmplificacaoMisticaPontos);
			txtVulcaoNapalmPontos = (TextView) findViewById(R.id.txtVulcaoNapalmPontos);
			txtDrenoDeAlmaPontos = (TextView) findViewById(R.id.txtDrenoDeAlmaPontos);
			txtEsmagamentoMagicoPontos = (TextView) findViewById(R.id.txtEsmagamentoMagicoPontos);
			txtMaestriaArcanaPontos = (TextView) findViewById(R.id.txtMaestriaArcanaPontos);
			txtExpansaoArcanaPontos = (TextView) findViewById(R.id.txtExpansaoArcanaPontos);
			txtEstudoArcanoPontos = (TextView) findViewById(R.id.txtEstudoArcanoPontos);
			txtEstudoArcanoAvancadoPontos = (TextView) findViewById(R.id.txtEstudoArcanoAvancadoPontos);
			txtDistorcaoArcanaPontos = (TextView) findViewById(R.id.txtDistorcaoArcanaPontos);
			txtDrenarVidaPontos = (TextView) findViewById(R.id.txtDrenarVidaPontos);
			txtInvocarEsferaDeFogoPontos = (TextView) findViewById(R.id.txtInvocarEsferaDeFogoPontos);
			txtInvocarEsferaDeAguaPontos = (TextView) findViewById(R.id.txtInvocarEsferaDeAguaPontos);
			txtInvocarEsferaDeVentoPontos = (TextView) findViewById(R.id.txtInvocarEsferaDeVentoPontos);
			txtInvocarEsferaDeTerraPontos = (TextView) findViewById(R.id.txtInvocarEsferaDeTerraPontos);
			txtDisparoArcanoPontos = (TextView) findViewById(R.id.txtDisparoArcanoPontos);
			txtZeroAbsolutoPontos = (TextView) findViewById(R.id.txtZeroAbsolutoPontos);
			txtEsquifeDeGeloPontos = (TextView) findViewById(R.id.txtEsquifeDeGeloPontos);
			txtChamasDeHelaPontos = (TextView) findViewById(R.id.txtChamasDeHelaPontos);
			txtMeteoroEscarlatePontos = (TextView) findViewById(R.id.txtMeteoroEscarlatePontos);
			txtAbaloSismicoPontos = (TextView) findViewById(R.id.txtAbaloSismicoPontos);
			txtImpactoEspiritualPontos = (TextView) findViewById(R.id.txtImpactoEspiritualPontos);
			txtCorrenteEletricaPontos = (TextView) findViewById(R.id.txtCorrenteEletricaPontos);
			txtPantanoDeNifflheimPontos = (TextView) findViewById(R.id.txtPantanoDeNifflheimPontos);
			txtFuriaDaMedusaPontos = (TextView) findViewById(R.id.txtFuriaDaMedusaPontos);
			txtExilioPontos = (TextView) findViewById(R.id.txtExilioPontos);
			txtCometaPontos = (TextView) findViewById(R.id.txtCometaPontos);
			txtTetraVortexPontos = (TextView) findViewById(R.id.txtTetraVortexPontos);

			//Txt pontos restantes
			txtClasse1 = (TextView) findViewById(R.id.txtClasse1);
			txtClasse2 = (TextView) findViewById(R.id.txtClasse2);
			txtTransClasse = (TextView) findViewById(R.id.txtClasseTrans);
			txtClasse3 = (TextView) findViewById(R.id.txtClasse3);

			//Layouts
			layLancasDeGelo = (LinearLayout) findViewById(R.id.layLancasDeGelo);
			layBolasDeFogo = (LinearLayout) findViewById(R.id.layBolasDeFogo);
			layLancasDeFogo = (LinearLayout) findViewById(R.id.layLancasDeFogo);
			layBarreiraDeFogo = (LinearLayout) findViewById(R.id.layBarreiraDeFogo);
			layRajadaCongelante = (LinearLayout) findViewById(R.id.layRajadaCongelante);
			layAumentarRecuperacaoDeSP = (LinearLayout) findViewById(R.id.layAumentarRecuperacaoDeSP);
			layRelampago = (LinearLayout) findViewById(R.id.layRelampago);
			layAtaqueEspiritual = (LinearLayout) findViewById(R.id.layAtaqueEspiritual);
			layEscudoMagico = (LinearLayout) findViewById(R.id.layEscudoMagico);
			layChamaReveladora = (LinearLayout) findViewById(R.id.layChamaReveladora);
			layEspiritosAncioes = (LinearLayout) findViewById(R.id.layEspiritosAncioes);
			layPetrificar = (LinearLayout) findViewById(R.id.layPetrificar);
			layTempestadeDeRaios = (LinearLayout) findViewById(R.id.layTempestadeDeRaios);
			layColunaDePedra = (LinearLayout) findViewById(R.id.layColunaDePedra);
			layColunaDeFogo = (LinearLayout) findViewById(R.id.layColunaDeFogo);
			layCongelar = (LinearLayout) findViewById(R.id.layCongelar);
			layFuriaDaTerra = (LinearLayout) findViewById(R.id.layFuriaDaTerra);
			layBarreiraDeGelo = (LinearLayout) findViewById(R.id.layBarreiraDeGelo);
			layTrovaoDeJupiter = (LinearLayout) findViewById(R.id.layTrovaoDeJupiter);
			layIraDeThor = (LinearLayout) findViewById(R.id.layIraDeThor);
			layChuvaDeMeteoros = (LinearLayout) findViewById(R.id.layChuvaDeMeteoros);
			layPantanoDosMortos = (LinearLayout) findViewById(R.id.layPantanoDosMortos);
			laySentidoSobrenatural = (LinearLayout) findViewById(R.id.laySentidoSobrenatural);
			laySupernova = (LinearLayout) findViewById(R.id.laySupernova);
			layNevasca = (LinearLayout) findViewById(R.id.layNevasca);
			layEsferaDagua = (LinearLayout) findViewById(R.id.layEsferaDagua);
			layGanbantein = (LinearLayout) findViewById(R.id.layGanbantein);
			layCampoGravitacional = (LinearLayout) findViewById(R.id.layCampoGravitacional);
			layAmplificacaoMistica = (LinearLayout) findViewById(R.id.layAmplificacaoMistica);
			layVulcaoNapalm = (LinearLayout) findViewById(R.id.layVulcaoNapalm);
			layDrenoDeAlma = (LinearLayout) findViewById(R.id.layDrenoDeAlma);
			layEsmagamentoMagico = (LinearLayout) findViewById(R.id.layEsmagamentoMagico);
			layMaestriaArcana = (LinearLayout) findViewById(R.id.layMaestriaArcana);
			layExpansaoArcana = (LinearLayout) findViewById(R.id.layExpansaoArcana);
			layEstudoArcano = (LinearLayout) findViewById(R.id.layEstudoArcano);
			layEstudoArcanoAvancado = (LinearLayout) findViewById(R.id.layEstudoArcanoAvancado);
			layDistorcaoArcana = (LinearLayout) findViewById(R.id.layDistorcaoArcana);
			layDrenarVida = (LinearLayout) findViewById(R.id.layDrenarVida);
			layInvocarEsferaDeFogo = (LinearLayout) findViewById(R.id.layInvocarEsferaDeFogo);
			layInvocarEsferaDeAgua = (LinearLayout) findViewById(R.id.layInvocarEsferaDeAgua);
			layInvocarEsferaDeVento = (LinearLayout) findViewById(R.id.layInvocarEsferaDeVento);
			layInvocarEsferaDeTerra = (LinearLayout) findViewById(R.id.layInvocarEsferaDeTerra);
			layDisparoArcano = (LinearLayout) findViewById(R.id.layDisparoArcano);
			layZeroAbsoluto = (LinearLayout) findViewById(R.id.layZeroAbsoluto);
			layEsquifeDeGelo = (LinearLayout) findViewById(R.id.layEsquifeDeGelo);
			layChamasDeHela = (LinearLayout) findViewById(R.id.layChamasDeHela);
			layMeteoroEscarlate = (LinearLayout) findViewById(R.id.layMeteoroEscarlate);
			layAbaloSismico = (LinearLayout) findViewById(R.id.layAbaloSismico);
			layImpactoEspiritual = (LinearLayout) findViewById(R.id.layImpactoEspiritual);
			layCorrenteEletrica = (LinearLayout) findViewById(R.id.layCorrenteEletrica);
			layPantanoDeNifflheim = (LinearLayout) findViewById(R.id.layPantanoDeNifflheim);
			layFuriaDaMedusa = (LinearLayout) findViewById(R.id.layFuriaDaMedusa);
			layExilio = (LinearLayout) findViewById(R.id.layExilio);
			layCometa = (LinearLayout) findViewById(R.id.layCometa);
			layTetraVortex = (LinearLayout) findViewById(R.id.layTetraVortex);
			
			layPrincipal = (LinearLayout) findViewById(R.id.habilidades);

			if (id>0)
				recarregarBuild(id);


			//Eventos de informação
			btLancasDeGeloInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Lanças De Gelo");
					dialogo.setMessage(R.string.lancasDeGeloInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBolasDeFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Bolas De Fogo");
					dialogo.setMessage(R.string.bolasDeFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLancasDeFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Lanças De Fogo");
					dialogo.setMessage(R.string.lancasDeFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBarreiraDeFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Barreira De Fogo");
					dialogo.setMessage(R.string.barreiraDeFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRajadaCongelanteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Rajada Congelante");
					dialogo.setMessage(R.string.rajadaCongelanteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAumentarRecuperacaoDeSPInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Aumentar Recuperação De SP");
					dialogo.setMessage(R.string.aumentarRecuperacaoDeSPInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRelampagoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Relâmpago");
					dialogo.setMessage(R.string.relampagoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueEspiritualInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Ataque Espiritual");
					dialogo.setMessage(R.string.ataqueEspiritualInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEscudoMagicoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Escudo Mágico");
					dialogo.setMessage(R.string.escudoMagicoMagoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChamaReveladoraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Chama Reveladora");
					dialogo.setMessage(R.string.chamaReveladoraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritosAncioesInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Espíritos Anciões");
					dialogo.setMessage(R.string.espiritosAncioesInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPetrificarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Petrificar");
					dialogo.setMessage(R.string.petrificarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTempestadeDeRaiosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Tempestade De Raios");
					dialogo.setMessage(R.string.tempestadeDeRaiosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btProtecaoArcanaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Proteção Arcana");
					dialogo.setMessage(R.string.protecaoArcanaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btColunaDePedraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Coluna De Pedra");
					dialogo.setMessage(R.string.colunaDePedraBruxoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btColunaDeFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Coluna De Fogo");
					dialogo.setMessage(R.string.colunaDeFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCongelarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Congelar");
					dialogo.setMessage(R.string.congelarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFuriaDaTerraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Fúria Da Terra");
					dialogo.setMessage(R.string.furiaDaTerraBruxoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBarreiraDeGeloInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Barreira De Gelo");
					dialogo.setMessage(R.string.barreiraDeGeloInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTrovaoDeJupiterInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Trovão De Júpiter");
					dialogo.setMessage(R.string.trovaoDeJupiterInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btIraDeThorInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Ira De Thor");
					dialogo.setMessage(R.string.iraDeThorInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChuvaDeMeteorosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Chuva De Meteoros");
					dialogo.setMessage(R.string.chuvaDeMeteorosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPantanoDosMortosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Pântano Dos Mortos");
					dialogo.setMessage(R.string.pantanoDosMortosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSentidoSobrenaturalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Sentido Sobrenatural");
					dialogo.setMessage(R.string.sentidoSobrenaturalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSupernovaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Supernova");
					dialogo.setMessage(R.string.supernovaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btNevascaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Nevasca");
					dialogo.setMessage(R.string.nevascaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEsferaDaguaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Esfera Dágua");
					dialogo.setMessage(R.string.esferaDaguaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btExplosaoProtetoraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Explosão Protetora");
					dialogo.setMessage(R.string.explosaoProtetoraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGanbanteinInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Ganbantein");
					dialogo.setMessage(R.string.ganbanteinInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCampoGravitacionalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Campo Gravitacional");
					dialogo.setMessage(R.string.campoGravitacionalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAmplificacaoMisticaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Amplificação Mística");
					dialogo.setMessage(R.string.amplificacaoMisticaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btVulcaoNapalmInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Vulcão Napalm");
					dialogo.setMessage(R.string.vulcaoNapalmInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDrenoDeAlmaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Dreno De Alma");
					dialogo.setMessage(R.string.drenoDeAlmaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEsmagamentoMagicoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Esmagamento Mágico");
					dialogo.setMessage(R.string.esmagamentoMagicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMaestriaArcanaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Maestria Arcana");
					dialogo.setMessage(R.string.maestriaArcanaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btExpansaoArcanaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Expansão Arcana");
					dialogo.setMessage(R.string.expansaoArcanaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEstudoArcanoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Estudo Arcano");
					dialogo.setMessage(R.string.estudoArcanoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEstudoArcanoAvancadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Estudo Arcano Avançado");
					dialogo.setMessage(R.string.estudoArcanoAvancadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDistorcaoArcanaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Distorção Arcana");
					dialogo.setMessage(R.string.distorcaoArcanaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDrenarVidaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Drenar Vida");
					dialogo.setMessage(R.string.drenarVidaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInvocarEsferaDeFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Invocar Esfera De Fogo");
					dialogo.setMessage(R.string.invocarEsferaDeFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInvocarEsferaDeAguaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Invocar Esfera De Água");
					dialogo.setMessage(R.string.invocarEsferaDeAguaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInvocarEsferaDeVentoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Invocar Esfera De Vento");
					dialogo.setMessage(R.string.invocarEsferaDeVentoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInvocarEsferaDeTerraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Invocar Esfera De Terra");
					dialogo.setMessage(R.string.invocarEsferaDeTerraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDisparoArcanoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Disparo Arcano");
					dialogo.setMessage(R.string.disparoArcanoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btZeroAbsolutoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Zero Absoluto");
					dialogo.setMessage(R.string.zeroAbsolutoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEsquifeDeGeloInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Esquife De Gelo");
					dialogo.setMessage(R.string.esquifeDeGeloInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChamasDeHelaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Chamas De Hela");
					dialogo.setMessage(R.string.chamasDeHelaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMeteoroEscarlateInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Meteoro Escarlate");
					dialogo.setMessage(R.string.meteoroEscarlateInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAbaloSismicoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Abalo Sísmico");
					dialogo.setMessage(R.string.abaloSismicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btImpactoEspiritualInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Impacto Espiritual");
					dialogo.setMessage(R.string.impactoEspiritualInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCorrenteEletricaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Corrente Elétrica");
					dialogo.setMessage(R.string.correnteEletricaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPantanoDeNifflheimInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Pântano De Nifflheim");
					dialogo.setMessage(R.string.pantanoDeNifflheimInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFuriaDaMedusaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Fúria Da Medusa");
					dialogo.setMessage(R.string.furiaDaMedusaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btExilioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Exílio");
					dialogo.setMessage(R.string.exilioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCometaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Cometa");
					dialogo.setMessage(R.string.cometaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTetraVortexInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorArcano.this);
					dialogo.setTitle("Tetra Vortex");
					dialogo.setMessage(R.string.tetraVortexInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});


			//Eventos de aumentar
			btLancasDeGeloAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");

				}
			});
			btBolasDeFogoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<4 && count<4){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBolasDeFogo, "BolasDeFogo", 10, 1, "Aumentar");

				}
			});
			btLancasDeFogoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");

				}
			});
			btBarreiraDeFogoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<4 && count<4){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varBolasDeFogo<5 && count<5){
						atualizarCalculo(varBolasDeFogo, "BolasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varChamaReveladora<1 && count<1){
						atualizarCalculo(varChamaReveladora, "ChamaReveladora", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBarreiraDeFogo, "BarreiraDeFogo", 10, 1, "Aumentar");

				}
			});
			btRajadaCongelanteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<5 && count<5){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRajadaCongelante, "RajadaCongelante", 10, 1, "Aumentar");

				}
			});
			btAumentarRecuperacaoDeSPAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 1, "Aumentar");

				}
			});
			btRelampagoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");

				}
			});
			btAtaqueEspiritualAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");

				}
			});
			btEscudoMagicoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueEspiritual<7 && count<7){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueEspiritual<4 && count<4){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspiritosAncioes<5 && count<5){
						atualizarCalculo(varEspiritosAncioes, "EspiritosAncioes", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEscudoMagico, "EscudoMagico", 10, 1, "Aumentar");

				}
			});
			btChamaReveladoraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChamaReveladora, "ChamaReveladora", 1, 1, "Aumentar");

				}
			});
			btEspiritosAncioesAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueEspiritual<4 && count<4){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEspiritosAncioes, "EspiritosAncioes", 10, 1, "Aumentar");

				}
			});
			btPetrificarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");

				}
			});
			btTempestadeDeRaiosAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<4 && count<4){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTempestadeDeRaios, "TempestadeDeRaios", 10, 1, "Aumentar");

				}
			});
			btColunaDePedraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");

				}
			});
			btColunaDeFogoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<4 && count<4){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varBolasDeFogo<5 && count<5){
						atualizarCalculo(varBolasDeFogo, "BolasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varChamaReveladora<1 && count<1){
						atualizarCalculo(varChamaReveladora, "ChamaReveladora", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varBarreiraDeFogo<1 && count<1){
						atualizarCalculo(varBarreiraDeFogo, "BarreiraDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varColunaDeFogo, "ColunaDeFogo", 10, 2, "Aumentar");

				}
			});
			btCongelarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<5 && count<5){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaCongelante<1 && count<1){
						atualizarCalculo(varRajadaCongelante, "RajadaCongelante", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<5 && count<5){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaCongelante<1 && count<1){
						atualizarCalculo(varRajadaCongelante, "RajadaCongelante", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varBarreiraDeGelo<1 && count<1){
						atualizarCalculo(varBarreiraDeGelo, "BarreiraDeGelo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCongelar, "Congelar", 10, 2, "Aumentar");

				}
			});
			btFuriaDaTerraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varColunaDePedra<3 && count<3){
						atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFuriaDaTerra, "FuriaDaTerra", 5, 2, "Aumentar");

				}
			});
			btBarreiraDeGeloAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<5 && count<5){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaCongelante<1 && count<1){
						atualizarCalculo(varRajadaCongelante, "RajadaCongelante", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBarreiraDeGelo, "BarreiraDeGelo", 10, 2, "Aumentar");

				}
			});
			btTrovaoDeJupiterAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueEspiritual<1 && count<1){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTrovaoDeJupiter, "TrovaoDeJupiter", 10, 2, "Aumentar");

				}
			});
			btIraDeThorAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<4 && count<4){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTempestadeDeRaios<1 && count<1){
						atualizarCalculo(varTempestadeDeRaios, "TempestadeDeRaios", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueEspiritual<1 && count<1){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrovaoDeJupiter<5 && count<5){
						atualizarCalculo(varTrovaoDeJupiter, "TrovaoDeJupiter", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varIraDeThor, "IraDeThor", 10, 2, "Aumentar");

				}
			});
			btChuvaDeMeteorosAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<4 && count<4){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTempestadeDeRaios<1 && count<1){
						atualizarCalculo(varTempestadeDeRaios, "TempestadeDeRaios", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varChamaReveladora<1 && count<1){
						atualizarCalculo(varChamaReveladora, "ChamaReveladora", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSupernova<2 && count<2){
						atualizarCalculo(varSupernova, "Supernova", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varChuvaDeMeteoros, "ChuvaDeMeteoros", 10, 2, "Aumentar");

				}
			});
			btPantanoDosMortosAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varColunaDePedra<3 && count<3){
						atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuriaDaTerra<1 && count<1){
						atualizarCalculo(varFuriaDaTerra, "FuriaDaTerra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPantanoDosMortos, "PantanoDosMortos", 5, 2, "Aumentar");

				}
			});
			btSentidoSobrenaturalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSentidoSobrenatural, "SentidoSobrenatural", 1, 2, "Aumentar");

				}
			});
			btSupernovaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varChamaReveladora<1 && count<1){
						atualizarCalculo(varChamaReveladora, "ChamaReveladora", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSupernova, "Supernova", 10, 2, "Aumentar");

				}
			});
			btNevascaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<5 && count<5){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaCongelante<1 && count<1){
						atualizarCalculo(varRajadaCongelante, "RajadaCongelante", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueEspiritual<1 && count<1){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrovaoDeJupiter<3 && count<3){
						atualizarCalculo(varTrovaoDeJupiter, "TrovaoDeJupiter", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varNevasca, "Nevasca", 10, 2, "Aumentar");

				}
			});
			btEsferaDaguaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEsferaDagua, "EsferaDagua", 5, 2, "Aumentar");

				}
			});
			btGanbanteinAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varSentidoSobrenatural<1 && count<1){
						atualizarCalculo(varSentidoSobrenatural, "SentidoSobrenatural", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<5 && count<5){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaCongelante<1 && count<1){
						atualizarCalculo(varRajadaCongelante, "RajadaCongelante", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varBarreiraDeGelo<1 && count<1){
						atualizarCalculo(varBarreiraDeGelo, "BarreiraDeGelo", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGanbantein, "Ganbantein", 1, 3, "Aumentar");

				}
			});
			btCampoGravitacionalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varColunaDePedra<3 && count<3){
						atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuriaDaTerra<1 && count<1){
						atualizarCalculo(varFuriaDaTerra, "FuriaDaTerra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPantanoDosMortos<1 && count<1){
						atualizarCalculo(varPantanoDosMortos, "PantanoDosMortos", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAumentarRecuperacaoDeSP<1 && count<1){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsmagamentoMagico<1 && count<1){
						atualizarCalculo(varEsmagamentoMagico, "EsmagamentoMagico", 1, 3, "Aumentar");
						count++;
					}
					count = 0;
					while(varAmplificacaoMistica<10 && count<10){
						atualizarCalculo(varAmplificacaoMistica, "AmplificacaoMistica", 10, 3, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCampoGravitacional, "CampoGravitacional", 5, 3, "Aumentar");

				}
			});
			btAmplificacaoMisticaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAmplificacaoMistica, "AmplificacaoMistica", 10, 3, "Aumentar");

				}
			});
			btVulcaoNapalmAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueEspiritual<5 && count<5){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varVulcaoNapalm, "VulcaoNapalm", 5, 3, "Aumentar");

				}
			});
			btDrenoDeAlmaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAumentarRecuperacaoDeSP<5 && count<5){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueEspiritual<4 && count<4){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspiritosAncioes<7 && count<7){
						atualizarCalculo(varEspiritosAncioes, "EspiritosAncioes", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDrenoDeAlma, "DrenoDeAlma", 10, 3, "Aumentar");

				}
			});
			btEsmagamentoMagicoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAumentarRecuperacaoDeSP<1 && count<1){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEsmagamentoMagico, "EsmagamentoMagico", 1, 3, "Aumentar");

				}
			});
			btMaestriaArcanaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varExpansaoArcana<1 && count<1){
						atualizarCalculo(varExpansaoArcana, "ExpansaoArcana", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDrenarVida<1 && count<1){
						atualizarCalculo(varDrenarVida, "DrenarVida", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpactoEspiritual<3 && count<3){
						atualizarCalculo(varImpactoEspiritual, "ImpactoEspiritual", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varExilio<1 && count<1){
						atualizarCalculo(varExilio, "Exilio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDisparoArcano<2 && count<2){
						atualizarCalculo(varDisparoArcano, "DisparoArcano", 2, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varExpansaoArcana<1 && count<1){
						atualizarCalculo(varExpansaoArcana, "ExpansaoArcana", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDrenarVida<1 && count<1){
						atualizarCalculo(varDrenarVida, "DrenarVida", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDistorcaoArcana<1 && count<1){
						atualizarCalculo(varDistorcaoArcana, "DistorcaoArcana", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMaestriaArcana, "MaestriaArcana", 5, 4, "Aumentar");

				}
			});
			btExpansaoArcanaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varExpansaoArcana, "ExpansaoArcana", 3, 4, "Aumentar");

				}
			});
			btEstudoArcanoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEstudoArcano, "EstudoArcano", 1, 4, "Aumentar");

				}
			});
			btEstudoArcanoAvancadoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEstudoArcanoAvancado, "EstudoArcanoAvancado", 5, 4, "Aumentar");

				}
			});
			btDistorcaoArcanaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varExpansaoArcana<1 && count<1){
						atualizarCalculo(varExpansaoArcana, "ExpansaoArcana", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDrenarVida<1 && count<1){
						atualizarCalculo(varDrenarVida, "DrenarVida", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDistorcaoArcana, "DistorcaoArcana", 5, 4, "Aumentar");

				}
			});
			btDrenarVidaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varExpansaoArcana<1 && count<1){
						atualizarCalculo(varExpansaoArcana, "ExpansaoArcana", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDrenarVida, "DrenarVida", 5, 4, "Aumentar");

				}
			});
			btInvocarEsferaDeFogoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<4 && count<4){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTempestadeDeRaios<1 && count<1){
						atualizarCalculo(varTempestadeDeRaios, "TempestadeDeRaios", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varChamaReveladora<1 && count<1){
						atualizarCalculo(varChamaReveladora, "ChamaReveladora", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSupernova<2 && count<2){
						atualizarCalculo(varSupernova, "Supernova", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varChuvaDeMeteoros<1 && count<1){
						atualizarCalculo(varChuvaDeMeteoros, "ChuvaDeMeteoros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInvocarEsferaDeFogo, "InvocarEsferaDeFogo", 5, 4, "Aumentar");

				}
			});
			btInvocarEsferaDeAguaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<5 && count<5){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaCongelante<1 && count<1){
						atualizarCalculo(varRajadaCongelante, "RajadaCongelante", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueEspiritual<1 && count<1){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrovaoDeJupiter<3 && count<3){
						atualizarCalculo(varTrovaoDeJupiter, "TrovaoDeJupiter", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varNevasca<1 && count<1){
						atualizarCalculo(varNevasca, "Nevasca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInvocarEsferaDeAgua, "InvocarEsferaDeAgua", 5, 4, "Aumentar");

				}
			});
			btInvocarEsferaDeVentoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<4 && count<4){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTempestadeDeRaios<1 && count<1){
						atualizarCalculo(varTempestadeDeRaios, "TempestadeDeRaios", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueEspiritual<1 && count<1){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrovaoDeJupiter<5 && count<5){
						atualizarCalculo(varTrovaoDeJupiter, "TrovaoDeJupiter", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varIraDeThor<1 && count<1){
						atualizarCalculo(varIraDeThor, "IraDeThor", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInvocarEsferaDeVento, "InvocarEsferaDeVento", 5, 4, "Aumentar");

				}
			});
			btInvocarEsferaDeTerraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varColunaDePedra<3 && count<3){
						atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuriaDaTerra<1 && count<1){
						atualizarCalculo(varFuriaDaTerra, "FuriaDaTerra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInvocarEsferaDeTerra, "InvocarEsferaDeTerra", 5, 4, "Aumentar");

				}
			});
			btDisparoArcanoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDisparoArcano, "DisparoArcano", 2, 4, "Aumentar");

				}
			});
			btZeroAbsolutoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<5 && count<5){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaCongelante<1 && count<1){
						atualizarCalculo(varRajadaCongelante, "RajadaCongelante", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueEspiritual<1 && count<1){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrovaoDeJupiter<3 && count<3){
						atualizarCalculo(varTrovaoDeJupiter, "TrovaoDeJupiter", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varNevasca<1 && count<1){
						atualizarCalculo(varNevasca, "Nevasca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferaDeAgua<1 && count<1){
						atualizarCalculo(varInvocarEsferaDeAgua, "InvocarEsferaDeAgua", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varZeroAbsoluto, "ZeroAbsoluto", 5, 4, "Aumentar");

				}
			});
			btEsquifeDeGeloAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<5 && count<5){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaCongelante<1 && count<1){
						atualizarCalculo(varRajadaCongelante, "RajadaCongelante", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueEspiritual<1 && count<1){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrovaoDeJupiter<3 && count<3){
						atualizarCalculo(varTrovaoDeJupiter, "TrovaoDeJupiter", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varNevasca<1 && count<1){
						atualizarCalculo(varNevasca, "Nevasca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferaDeAgua<1 && count<1){
						atualizarCalculo(varInvocarEsferaDeAgua, "InvocarEsferaDeAgua", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varZeroAbsoluto<2 && count<2){
						atualizarCalculo(varZeroAbsoluto, "ZeroAbsoluto", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEsquifeDeGelo, "EsquifeDeGelo", 5, 4, "Aumentar");

				}
			});
			btChamasDeHelaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<4 && count<4){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTempestadeDeRaios<1 && count<1){
						atualizarCalculo(varTempestadeDeRaios, "TempestadeDeRaios", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varChamaReveladora<1 && count<1){
						atualizarCalculo(varChamaReveladora, "ChamaReveladora", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSupernova<2 && count<2){
						atualizarCalculo(varSupernova, "Supernova", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varChuvaDeMeteoros<1 && count<1){
						atualizarCalculo(varChuvaDeMeteoros, "ChuvaDeMeteoros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferaDeFogo<1 && count<1){
						atualizarCalculo(varInvocarEsferaDeFogo, "InvocarEsferaDeFogo", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMeteoroEscarlate<2 && count<2){
						atualizarCalculo(varMeteoroEscarlate, "MeteoroEscarlate", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varChamasDeHela, "ChamasDeHela", 5, 4, "Aumentar");

				}
			});
			btMeteoroEscarlateAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<4 && count<4){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTempestadeDeRaios<1 && count<1){
						atualizarCalculo(varTempestadeDeRaios, "TempestadeDeRaios", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varChamaReveladora<1 && count<1){
						atualizarCalculo(varChamaReveladora, "ChamaReveladora", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSupernova<2 && count<2){
						atualizarCalculo(varSupernova, "Supernova", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varChuvaDeMeteoros<1 && count<1){
						atualizarCalculo(varChuvaDeMeteoros, "ChuvaDeMeteoros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferaDeFogo<1 && count<1){
						atualizarCalculo(varInvocarEsferaDeFogo, "InvocarEsferaDeFogo", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMeteoroEscarlate, "MeteoroEscarlate", 5, 4, "Aumentar");

				}
			});
			btAbaloSismicoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varColunaDePedra<3 && count<3){
						atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuriaDaTerra<1 && count<1){
						atualizarCalculo(varFuriaDaTerra, "FuriaDaTerra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferaDeTerra<1 && count<1){
						atualizarCalculo(varInvocarEsferaDeTerra, "InvocarEsferaDeTerra", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuriaDaMedusa<2 && count<2){
						atualizarCalculo(varFuriaDaMedusa, "FuriaDaMedusa", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAbaloSismico, "AbaloSismico", 5, 4, "Aumentar");

				}
			});
			btImpactoEspiritualAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varExpansaoArcana<1 && count<1){
						atualizarCalculo(varExpansaoArcana, "ExpansaoArcana", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDrenarVida<1 && count<1){
						atualizarCalculo(varDrenarVida, "DrenarVida", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varImpactoEspiritual, "ImpactoEspiritual", 5, 4, "Aumentar");

				}
			});
			btCorrenteEletricaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<4 && count<4){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTempestadeDeRaios<1 && count<1){
						atualizarCalculo(varTempestadeDeRaios, "TempestadeDeRaios", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueEspiritual<1 && count<1){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrovaoDeJupiter<5 && count<5){
						atualizarCalculo(varTrovaoDeJupiter, "TrovaoDeJupiter", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varIraDeThor<1 && count<1){
						atualizarCalculo(varIraDeThor, "IraDeThor", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferaDeVento<1 && count<1){
						atualizarCalculo(varInvocarEsferaDeVento, "InvocarEsferaDeVento", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCorrenteEletrica, "CorrenteEletrica", 5, 4, "Aumentar");

				}
			});
			btPantanoDeNifflheimAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varColunaDePedra<3 && count<3){
						atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuriaDaTerra<1 && count<1){
						atualizarCalculo(varFuriaDaTerra, "FuriaDaTerra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPantanoDosMortos<1 && count<1){
						atualizarCalculo(varPantanoDosMortos, "PantanoDosMortos", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPantanoDeNifflheim, "PantanoDeNifflheim", 5, 4, "Aumentar");

				}
			});
			btFuriaDaMedusaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varColunaDePedra<3 && count<3){
						atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuriaDaTerra<1 && count<1){
						atualizarCalculo(varFuriaDaTerra, "FuriaDaTerra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferaDeTerra<1 && count<1){
						atualizarCalculo(varInvocarEsferaDeTerra, "InvocarEsferaDeTerra", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFuriaDaMedusa, "FuriaDaMedusa", 5, 4, "Aumentar");

				}
			});
			btExilioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varExpansaoArcana<1 && count<1){
						atualizarCalculo(varExpansaoArcana, "ExpansaoArcana", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDrenarVida<1 && count<1){
						atualizarCalculo(varDrenarVida, "DrenarVida", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpactoEspiritual<3 && count<3){
						atualizarCalculo(varImpactoEspiritual, "ImpactoEspiritual", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varExilio, "Exilio", 5, 4, "Aumentar");

				}
			});
			btCometaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<4 && count<4){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTempestadeDeRaios<1 && count<1){
						atualizarCalculo(varTempestadeDeRaios, "TempestadeDeRaios", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varChamaReveladora<1 && count<1){
						atualizarCalculo(varChamaReveladora, "ChamaReveladora", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSupernova<2 && count<2){
						atualizarCalculo(varSupernova, "Supernova", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varChuvaDeMeteoros<1 && count<1){
						atualizarCalculo(varChuvaDeMeteoros, "ChuvaDeMeteoros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferaDeFogo<1 && count<1){
						atualizarCalculo(varInvocarEsferaDeFogo, "InvocarEsferaDeFogo", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMeteoroEscarlate<2 && count<2){
						atualizarCalculo(varMeteoroEscarlate, "MeteoroEscarlate", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChamasDeHela<3 && count<3){
						atualizarCalculo(varChamasDeHela, "ChamasDeHela", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCometa, "Cometa", 10, 4, "Aumentar");

				}
			});
			btTetraVortexAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<4 && count<4){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTempestadeDeRaios<1 && count<1){
						atualizarCalculo(varTempestadeDeRaios, "TempestadeDeRaios", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varChamaReveladora<1 && count<1){
						atualizarCalculo(varChamaReveladora, "ChamaReveladora", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSupernova<2 && count<2){
						atualizarCalculo(varSupernova, "Supernova", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varChuvaDeMeteoros<1 && count<1){
						atualizarCalculo(varChuvaDeMeteoros, "ChuvaDeMeteoros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferaDeFogo<1 && count<1){
						atualizarCalculo(varInvocarEsferaDeFogo, "InvocarEsferaDeFogo", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMeteoroEscarlate<2 && count<2){
						atualizarCalculo(varMeteoroEscarlate, "MeteoroEscarlate", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varChamasDeHela<5 && count<5){
						atualizarCalculo(varChamasDeHela, "ChamasDeHela", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<5 && count<5){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaCongelante<1 && count<1){
						atualizarCalculo(varRajadaCongelante, "RajadaCongelante", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueEspiritual<1 && count<1){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrovaoDeJupiter<3 && count<3){
						atualizarCalculo(varTrovaoDeJupiter, "TrovaoDeJupiter", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varNevasca<1 && count<1){
						atualizarCalculo(varNevasca, "Nevasca", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferaDeAgua<1 && count<1){
						atualizarCalculo(varInvocarEsferaDeAgua, "InvocarEsferaDeAgua", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varZeroAbsoluto<2 && count<2){
						atualizarCalculo(varZeroAbsoluto, "ZeroAbsoluto", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsquifeDeGelo<5 && count<5){
						atualizarCalculo(varEsquifeDeGelo, "EsquifeDeGelo", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<4 && count<4){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTempestadeDeRaios<1 && count<1){
						atualizarCalculo(varTempestadeDeRaios, "TempestadeDeRaios", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueEspiritual<1 && count<1){
						atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrovaoDeJupiter<5 && count<5){
						atualizarCalculo(varTrovaoDeJupiter, "TrovaoDeJupiter", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varIraDeThor<1 && count<1){
						atualizarCalculo(varIraDeThor, "IraDeThor", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferaDeVento<1 && count<1){
						atualizarCalculo(varInvocarEsferaDeVento, "InvocarEsferaDeVento", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCorrenteEletrica<5 && count<5){
						atualizarCalculo(varCorrenteEletrica, "CorrenteEletrica", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varColunaDePedra<3 && count<3){
						atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuriaDaTerra<1 && count<1){
						atualizarCalculo(varFuriaDaTerra, "FuriaDaTerra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarEsferaDeTerra<1 && count<1){
						atualizarCalculo(varInvocarEsferaDeTerra, "InvocarEsferaDeTerra", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuriaDaMedusa<2 && count<2){
						atualizarCalculo(varFuriaDaMedusa, "FuriaDaMedusa", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAbaloSismico<5 && count<5){
						atualizarCalculo(varAbaloSismico, "AbaloSismico", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTetraVortex, "TetraVortex", 5, 4, "Aumentar");

				}
			});


			//Eventos de diminuir
			btLancasDeGeloDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Diminuir");

				}
			});
			btBolasDeFogoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBolasDeFogo, "BolasDeFogo", 10, 1, "Diminuir");

				}
			});
			btLancasDeFogoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Diminuir");

				}
			});
			btBarreiraDeFogoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBarreiraDeFogo, "BarreiraDeFogo", 10, 1, "Diminuir");

				}
			});
			btRajadaCongelanteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRajadaCongelante, "RajadaCongelante", 10, 1, "Diminuir");

				}
			});
			btAumentarRecuperacaoDeSPDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 1, "Diminuir");

				}
			});
			btRelampagoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRelampago, "Relampago", 10, 1, "Diminuir");

				}
			});
			btAtaqueEspiritualDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtaqueEspiritual, "AtaqueEspiritual", 10, 1, "Diminuir");

				}
			});
			btEscudoMagicoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEscudoMagico, "EscudoMagico", 10, 1, "Diminuir");

				}
			});
			btChamaReveladoraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChamaReveladora, "ChamaReveladora", 1, 1, "Diminuir");

				}
			});
			btEspiritosAncioesDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritosAncioes, "EspiritosAncioes", 10, 1, "Diminuir");

				}
			});
			btPetrificarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Diminuir");

				}
			});
			btTempestadeDeRaiosDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTempestadeDeRaios, "TempestadeDeRaios", 10, 1, "Diminuir");

				}
			});
			btColunaDePedraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Diminuir");

				}
			});
			btColunaDeFogoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varColunaDeFogo, "ColunaDeFogo", 10, 2, "Diminuir");

				}
			});
			btCongelarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCongelar, "Congelar", 10, 2, "Diminuir");

				}
			});
			btFuriaDaTerraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFuriaDaTerra, "FuriaDaTerra", 5, 2, "Diminuir");

				}
			});
			btBarreiraDeGeloDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBarreiraDeGelo, "BarreiraDeGelo", 10, 2, "Diminuir");

				}
			});
			btTrovaoDeJupiterDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTrovaoDeJupiter, "TrovaoDeJupiter", 10, 2, "Diminuir");

				}
			});
			btIraDeThorDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varIraDeThor, "IraDeThor", 10, 2, "Diminuir");

				}
			});
			btChuvaDeMeteorosDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChuvaDeMeteoros, "ChuvaDeMeteoros", 10, 2, "Diminuir");

				}
			});
			btPantanoDosMortosDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPantanoDosMortos, "PantanoDosMortos", 5, 2, "Diminuir");

				}
			});
			btSentidoSobrenaturalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSentidoSobrenatural, "SentidoSobrenatural", 1, 2, "Diminuir");

				}
			});
			btSupernovaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSupernova, "Supernova", 10, 2, "Diminuir");

				}
			});
			btNevascaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varNevasca, "Nevasca", 10, 2, "Diminuir");

				}
			});
			btEsferaDaguaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEsferaDagua, "EsferaDagua", 5, 2, "Diminuir");

				}
			});
			btGanbanteinDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGanbantein, "Ganbantein", 1, 3, "Diminuir");

				}
			});
			btCampoGravitacionalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCampoGravitacional, "CampoGravitacional", 5, 3, "Diminuir");

				}
			});
			btAmplificacaoMisticaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAmplificacaoMistica, "AmplificacaoMistica", 10, 3, "Diminuir");

				}
			});
			btVulcaoNapalmDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varVulcaoNapalm, "VulcaoNapalm", 5, 3, "Diminuir");

				}
			});
			btDrenoDeAlmaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDrenoDeAlma, "DrenoDeAlma", 10, 3, "Diminuir");

				}
			});
			btEsmagamentoMagicoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEsmagamentoMagico, "EsmagamentoMagico", 1, 3, "Diminuir");

				}
			});
			btMaestriaArcanaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMaestriaArcana, "MaestriaArcana", 5, 4, "Diminuir");

				}
			});
			btExpansaoArcanaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varExpansaoArcana, "ExpansaoArcana", 3, 4, "Diminuir");

				}
			});
			btEstudoArcanoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEstudoArcano, "EstudoArcano", 1, 4, "Diminuir");

				}
			});
			btEstudoArcanoAvancadoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEstudoArcanoAvancado, "EstudoArcanoAvancado", 5, 4, "Diminuir");

				}
			});
			btDistorcaoArcanaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDistorcaoArcana, "DistorcaoArcana", 5, 4, "Diminuir");

				}
			});
			btDrenarVidaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDrenarVida, "DrenarVida", 5, 4, "Diminuir");

				}
			});
			btInvocarEsferaDeFogoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInvocarEsferaDeFogo, "InvocarEsferaDeFogo", 5, 4, "Diminuir");

				}
			});
			btInvocarEsferaDeAguaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInvocarEsferaDeAgua, "InvocarEsferaDeAgua", 5, 4, "Diminuir");

				}
			});
			btInvocarEsferaDeVentoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInvocarEsferaDeVento, "InvocarEsferaDeVento", 5, 4, "Diminuir");

				}
			});
			btInvocarEsferaDeTerraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInvocarEsferaDeTerra, "InvocarEsferaDeTerra", 5, 4, "Diminuir");

				}
			});
			btDisparoArcanoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDisparoArcano, "DisparoArcano", 2, 4, "Diminuir");

				}
			});
			btZeroAbsolutoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varZeroAbsoluto, "ZeroAbsoluto", 5, 4, "Diminuir");

				}
			});
			btEsquifeDeGeloDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEsquifeDeGelo, "EsquifeDeGelo", 5, 4, "Diminuir");

				}
			});
			btChamasDeHelaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChamasDeHela, "ChamasDeHela", 5, 4, "Diminuir");

				}
			});
			btMeteoroEscarlateDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMeteoroEscarlate, "MeteoroEscarlate", 5, 4, "Diminuir");

				}
			});
			btAbaloSismicoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAbaloSismico, "AbaloSismico", 5, 4, "Diminuir");

				}
			});
			btImpactoEspiritualDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varImpactoEspiritual, "ImpactoEspiritual", 5, 4, "Diminuir");

				}
			});
			btCorrenteEletricaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCorrenteEletrica, "CorrenteEletrica", 5, 4, "Diminuir");

				}
			});
			btPantanoDeNifflheimDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPantanoDeNifflheim, "PantanoDeNifflheim", 5, 4, "Diminuir");

				}
			});
			btFuriaDaMedusaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFuriaDaMedusa, "FuriaDaMedusa", 5, 4, "Diminuir");

				}
			});
			btExilioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varExilio, "Exilio", 5, 4, "Diminuir");

				}
			});
			btCometaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCometa, "Cometa", 10, 4, "Diminuir");

				}
			});
			btTetraVortexDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTetraVortex, "TetraVortex", 5, 4, "Diminuir");

				}
			});


			//Outros Botões
			btResetar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					varLancasDeGelo = 0;
					varBolasDeFogo = 0;
					varLancasDeFogo = 0;
					varBarreiraDeFogo = 0;
					varRajadaCongelante = 0;
					varAumentarRecuperacaoDeSP = 0;
					varRelampago = 0;
					varAtaqueEspiritual = 0;
					varEscudoMagico = 0;
					varChamaReveladora = 0;
					varEspiritosAncioes = 0;
					varPetrificar = 0;
					varTempestadeDeRaios = 0;
					varColunaDePedra = 0;
					varColunaDeFogo = 0;
					varCongelar = 0;
					varFuriaDaTerra = 0;
					varBarreiraDeGelo = 0;
					varTrovaoDeJupiter = 0;
					varIraDeThor = 0;
					varChuvaDeMeteoros = 0;
					varPantanoDosMortos = 0;
					varSentidoSobrenatural = 0;
					varSupernova = 0;
					varNevasca = 0;
					varEsferaDagua = 0;
					varGanbantein = 0;
					varCampoGravitacional = 0;
					varAmplificacaoMistica = 0;
					varVulcaoNapalm = 0;
					varDrenoDeAlma = 0;
					varEsmagamentoMagico = 0;
					varMaestriaArcana = 0;
					varExpansaoArcana = 0;
					varEstudoArcano = 0;
					varEstudoArcanoAvancado = 0;
					varDistorcaoArcana = 0;
					varDrenarVida = 0;
					varInvocarEsferaDeFogo = 0;
					varInvocarEsferaDeAgua = 0;
					varInvocarEsferaDeVento = 0;
					varInvocarEsferaDeTerra = 0;
					varDisparoArcano = 0;
					varZeroAbsoluto = 0;
					varEsquifeDeGelo = 0;
					varChamasDeHela = 0;
					varMeteoroEscarlate = 0;
					varAbaloSismico = 0;
					varImpactoEspiritual = 0;
					varCorrenteEletrica = 0;
					varPantanoDeNifflheim = 0;
					varFuriaDaMedusa = 0;
					varExilio = 0;
					varCometa = 0;
					varTetraVortex = 0;

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
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorArcano.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorArcano.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorArcano.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorArcano.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorArcano.this);
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

					AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorArcano.this);
					msg.setTitle("Escolha um nome");
					msg.setMessage("OBS: Salvar PNG só irá salvar em forma de imagem! É recomendado que salve a build na memória do celular também.\nEscolha um nome para salvar esta simulação:");
					final EditText nomeParaSalvar = new EditText(SimuladorArcano.this);
					msg.setView(nomeParaSalvar);
					msg.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {

							@Override
						public void onClick(DialogInterface dialog, int which) {
							if (nomeParaSalvar.getText().toString().length() <= 0) {
								nomeParaSalvar.setError("Preencha o campo!");
								Toast.makeText(getBaseContext(), "ERROR: Insira um nome!", Toast.LENGTH_SHORT).show();
							} else {
								SaveFile sf = new SaveFile();
								sf.takeAScreenShot(SimuladorArcano.this, layPrincipal, nomeParaSalvar.getText().toString());
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
			if(varLancasDeGelo==0)
				layLancasDeGelo.setVisibility(View.GONE);
			if(varBolasDeFogo==0)
				layBolasDeFogo.setVisibility(View.GONE);
			if(varLancasDeFogo==0)
				layLancasDeFogo.setVisibility(View.GONE);
			if(varBarreiraDeFogo==0)
				layBarreiraDeFogo.setVisibility(View.GONE);
			if(varRajadaCongelante==0)
				layRajadaCongelante.setVisibility(View.GONE);
			if(varAumentarRecuperacaoDeSP==0)
				layAumentarRecuperacaoDeSP.setVisibility(View.GONE);
			if(varRelampago==0)
				layRelampago.setVisibility(View.GONE);
			if(varAtaqueEspiritual==0)
				layAtaqueEspiritual.setVisibility(View.GONE);
			if(varEscudoMagico==0)
				layEscudoMagico.setVisibility(View.GONE);
			if(varChamaReveladora==0)
				layChamaReveladora.setVisibility(View.GONE);
			if(varEspiritosAncioes==0)
				layEspiritosAncioes.setVisibility(View.GONE);
			if(varPetrificar==0)
				layPetrificar.setVisibility(View.GONE);
			if(varTempestadeDeRaios==0)
				layTempestadeDeRaios.setVisibility(View.GONE);

			if(varColunaDePedra==0)
				layColunaDePedra.setVisibility(View.GONE);
			if(varColunaDeFogo==0)
				layColunaDeFogo.setVisibility(View.GONE);
			if(varCongelar==0)
				layCongelar.setVisibility(View.GONE);
			if(varFuriaDaTerra==0)
				layFuriaDaTerra.setVisibility(View.GONE);
			if(varBarreiraDeGelo==0)
				layBarreiraDeGelo.setVisibility(View.GONE);
			if(varTrovaoDeJupiter==0)
				layTrovaoDeJupiter.setVisibility(View.GONE);
			if(varIraDeThor==0)
				layIraDeThor.setVisibility(View.GONE);
			if(varChuvaDeMeteoros==0)
				layChuvaDeMeteoros.setVisibility(View.GONE);
			if(varPantanoDosMortos==0)
				layPantanoDosMortos.setVisibility(View.GONE);
			if(varSentidoSobrenatural==0)
				laySentidoSobrenatural.setVisibility(View.GONE);
			if(varSupernova==0)
				laySupernova.setVisibility(View.GONE);
			if(varNevasca==0)
				layNevasca.setVisibility(View.GONE);
			if(varEsferaDagua==0)
				layEsferaDagua.setVisibility(View.GONE);

			if(varGanbantein==0)
				layGanbantein.setVisibility(View.GONE);
			if(varCampoGravitacional==0)
				layCampoGravitacional.setVisibility(View.GONE);
			if(varAmplificacaoMistica==0)
				layAmplificacaoMistica.setVisibility(View.GONE);
			if(varVulcaoNapalm==0)
				layVulcaoNapalm.setVisibility(View.GONE);
			if(varDrenoDeAlma==0)
				layDrenoDeAlma.setVisibility(View.GONE);
			if(varEsmagamentoMagico==0)
				layEsmagamentoMagico.setVisibility(View.GONE);

			if(varMaestriaArcana==0)
				layMaestriaArcana.setVisibility(View.GONE);
			if(varExpansaoArcana==0)
				layExpansaoArcana.setVisibility(View.GONE);
			if(varEstudoArcano==0)
				layEstudoArcano.setVisibility(View.GONE);
			if(varEstudoArcanoAvancado==0)
				layEstudoArcanoAvancado.setVisibility(View.GONE);
			if(varDistorcaoArcana==0)
				layDistorcaoArcana.setVisibility(View.GONE);
			if(varDrenarVida==0)
				layDrenarVida.setVisibility(View.GONE);
			if(varInvocarEsferaDeFogo==0)
				layInvocarEsferaDeFogo.setVisibility(View.GONE);
			if(varInvocarEsferaDeAgua==0)
				layInvocarEsferaDeAgua.setVisibility(View.GONE);
			if(varInvocarEsferaDeVento==0)
				layInvocarEsferaDeVento.setVisibility(View.GONE);
			if(varInvocarEsferaDeTerra==0)
				layInvocarEsferaDeTerra.setVisibility(View.GONE);
			if(varDisparoArcano==0)
				layDisparoArcano.setVisibility(View.GONE);
			if(varZeroAbsoluto==0)
				layZeroAbsoluto.setVisibility(View.GONE);
			if(varEsquifeDeGelo==0)
				layEsquifeDeGelo.setVisibility(View.GONE);
			if(varChamasDeHela==0)
				layChamasDeHela.setVisibility(View.GONE);
			if(varMeteoroEscarlate==0)
				layMeteoroEscarlate.setVisibility(View.GONE);
			if(varAbaloSismico==0)
				layAbaloSismico.setVisibility(View.GONE);
			if(varImpactoEspiritual==0)
				layImpactoEspiritual.setVisibility(View.GONE);
			if(varCorrenteEletrica==0)
				layCorrenteEletrica.setVisibility(View.GONE);
			if(varPantanoDeNifflheim==0)
				layPantanoDeNifflheim.setVisibility(View.GONE);
			if(varFuriaDaMedusa==0)
				layFuriaDaMedusa.setVisibility(View.GONE);
			if(varExilio==0)
				layExilio.setVisibility(View.GONE);
			if(varCometa==0)
				layCometa.setVisibility(View.GONE);
			if(varTetraVortex==0)
				layTetraVortex.setVisibility(View.GONE);

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

				if (nomeDaHabilidade=="LancasDeFogo" && varBolasDeFogo>=1 && varLancasDeFogo<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="BolasDeFogo" && varBarreiraDeFogo>=1 && varBolasDeFogo<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ChamaReveladora" && varBarreiraDeFogo>=1 && varChamaReveladora<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LancasDeGelo" && varRajadaCongelante>=1 && varLancasDeGelo<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtaqueEspiritual" && varEscudoMagico>=1 && varAtaqueEspiritual<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritosAncioes" && varEscudoMagico>=1 && varEspiritosAncioes<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtaqueEspiritual" && varEspiritosAncioes>=1 && varAtaqueEspiritual<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Relampago" && varTempestadeDeRaios>=1 && varRelampago<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Petrificar" && varColunaDePedra>=1 && varPetrificar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="BarreiraDeFogo" && varColunaDeFogo>=1 && varBarreiraDeFogo<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RajadaCongelante" && varCongelar>=1 && varRajadaCongelante<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="BarreiraDeGelo" && varCongelar>=1 && varBarreiraDeGelo<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ColunaDePedra" && varFuriaDaTerra>=1 && varColunaDePedra<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RajadaCongelante" && varBarreiraDeGelo>=1 && varRajadaCongelante<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Petrificar" && varBarreiraDeGelo>=1 && varPetrificar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Relampago" && varTrovaoDeJupiter>=1 && varRelampago<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtaqueEspiritual" && varTrovaoDeJupiter>=1 && varAtaqueEspiritual<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TempestadeDeRaios" && varIraDeThor>=1 && varTempestadeDeRaios<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TrovaoDeJupiter" && varIraDeThor>=1 && varTrovaoDeJupiter<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TempestadeDeRaios" && varChuvaDeMeteoros>=1 && varTempestadeDeRaios<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Supernova" && varChuvaDeMeteoros>=1 && varSupernova<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FuriaDaTerra" && varPantanoDosMortos>=1 && varFuriaDaTerra<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ChamaReveladora" && varSupernova>=1 && varChamaReveladora<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Relampago" && varSupernova>=1 && varRelampago<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RajadaCongelante" && varNevasca>=1 && varRajadaCongelante<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TrovaoDeJupiter" && varNevasca>=1 && varTrovaoDeJupiter<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LancasDeGelo" && varEsferaDagua>=1 && varLancasDeGelo<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Relampago" && varEsferaDagua>=1 && varRelampago<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="SentidoSobrenatural" && varGanbantein>=1 && varSentidoSobrenatural<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="BarreiraDeGelo" && varGanbantein>=1 && varBarreiraDeGelo<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PantanoDosMortos" && varCampoGravitacional>=1 && varPantanoDosMortos<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EsmagamentoMagico" && varCampoGravitacional>=1 && varEsmagamentoMagico<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AmplificacaoMistica" && varCampoGravitacional>=1 && varAmplificacaoMistica<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtaqueEspiritual" && varVulcaoNapalm>=1 && varAtaqueEspiritual<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AumentarRecuperacaoDeSP" && varDrenoDeAlma>=1 && varAumentarRecuperacaoDeSP<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritosAncioes" && varDrenoDeAlma>=1 && varEspiritosAncioes<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AumentarRecuperacaoDeSP" && varEsmagamentoMagico>=1 && varAumentarRecuperacaoDeSP<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Exilio" && varMaestriaArcana>=1 && varExilio<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DisparoArcano" && varMaestriaArcana>=1 && varDisparoArcano<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DistorcaoArcana" && varMaestriaArcana>=1 && varDistorcaoArcana<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DrenarVida" && varDistorcaoArcana>=1 && varDrenarVida<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ExpansaoArcana" && varDrenarVida>=1 && varExpansaoArcana<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ChuvaDeMeteoros" && varInvocarEsferaDeFogo>=1 && varChuvaDeMeteoros<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Nevasca" && varInvocarEsferaDeAgua>=1 && varNevasca<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="IraDeThor" && varInvocarEsferaDeVento>=1 && varIraDeThor<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FuriaDaTerra" && varInvocarEsferaDeTerra>=1 && varFuriaDaTerra<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InvocarEsferaDeAgua" && varZeroAbsoluto>=1 && varInvocarEsferaDeAgua<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ZeroAbsoluto" && varEsquifeDeGelo>=1 && varZeroAbsoluto<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MeteoroEscarlate" && varChamasDeHela>=1 && varMeteoroEscarlate<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InvocarEsferaDeFogo" && varMeteoroEscarlate>=1 && varInvocarEsferaDeFogo<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FuriaDaMedusa" && varAbaloSismico>=1 && varFuriaDaMedusa<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DrenarVida" && varImpactoEspiritual>=1 && varDrenarVida<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InvocarEsferaDeVento" && varCorrenteEletrica>=1 && varInvocarEsferaDeVento<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PantanoDosMortos" && varPantanoDeNifflheim>=1 && varPantanoDosMortos<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InvocarEsferaDeTerra" && varFuriaDaMedusa>=1 && varInvocarEsferaDeTerra<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ImpactoEspiritual" && varExilio>=1 && varImpactoEspiritual<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ChamasDeHela" && varCometa>=1 && varChamasDeHela<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ChamasDeHela" && varTetraVortex>=1 && varChamasDeHela<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EsquifeDeGelo" && varTetraVortex>=1 && varEsquifeDeGelo<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CorrenteEletrica" && varTetraVortex>=1 && varCorrenteEletrica<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AbaloSismico" && varTetraVortex>=1 && varAbaloSismico<=05){
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
			if(nomeDaHabilidade=="LancasDeGelo"){
				varLancasDeGelo = habilidade;
			} else if(nomeDaHabilidade=="BolasDeFogo"){
				varBolasDeFogo = habilidade;
			} else if(nomeDaHabilidade=="LancasDeFogo"){
				varLancasDeFogo = habilidade;
			} else if(nomeDaHabilidade=="BarreiraDeFogo"){
				varBarreiraDeFogo = habilidade;
			} else if(nomeDaHabilidade=="RajadaCongelante"){
				varRajadaCongelante = habilidade;
			} else if(nomeDaHabilidade=="AumentarRecuperacaoDeSP"){
				varAumentarRecuperacaoDeSP = habilidade;
			} else if(nomeDaHabilidade=="Relampago"){
				varRelampago = habilidade;
			} else if(nomeDaHabilidade=="AtaqueEspiritual"){
				varAtaqueEspiritual = habilidade;
			} else if(nomeDaHabilidade=="EscudoMagico"){
				varEscudoMagico = habilidade;
			} else if(nomeDaHabilidade=="ChamaReveladora"){
				varChamaReveladora = habilidade;
			} else if(nomeDaHabilidade=="EspiritosAncioes"){
				varEspiritosAncioes = habilidade;
			} else if(nomeDaHabilidade=="Petrificar"){
				varPetrificar = habilidade;
			} else if(nomeDaHabilidade=="TempestadeDeRaios"){
				varTempestadeDeRaios = habilidade;
			}

			else if(nomeDaHabilidade=="ColunaDePedra"){
				varColunaDePedra = habilidade;
			} else if(nomeDaHabilidade=="ColunaDeFogo"){
				varColunaDeFogo = habilidade;
			} else if(nomeDaHabilidade=="Congelar"){
				varCongelar = habilidade;
			} else if(nomeDaHabilidade=="FuriaDaTerra"){
				varFuriaDaTerra = habilidade;
			} else if(nomeDaHabilidade=="BarreiraDeGelo"){
				varBarreiraDeGelo = habilidade;
			} else if(nomeDaHabilidade=="TrovaoDeJupiter"){
				varTrovaoDeJupiter = habilidade;
			} else if(nomeDaHabilidade=="IraDeThor"){
				varIraDeThor = habilidade;
			} else if(nomeDaHabilidade=="ChuvaDeMeteoros"){
				varChuvaDeMeteoros = habilidade;
			} else if(nomeDaHabilidade=="PantanoDosMortos"){
				varPantanoDosMortos = habilidade;
			} else if(nomeDaHabilidade=="SentidoSobrenatural"){
				varSentidoSobrenatural = habilidade;
			} else if(nomeDaHabilidade=="Supernova"){
				varSupernova = habilidade;
			} else if(nomeDaHabilidade=="Nevasca"){
				varNevasca = habilidade;
			} else if(nomeDaHabilidade=="EsferaDagua"){
				varEsferaDagua = habilidade;
			}

			else if(nomeDaHabilidade=="Ganbantein"){
				varGanbantein = habilidade;
			} else if(nomeDaHabilidade=="CampoGravitacional"){
				varCampoGravitacional = habilidade;
			} else if(nomeDaHabilidade=="AmplificacaoMistica"){
				varAmplificacaoMistica = habilidade;
			} else if(nomeDaHabilidade=="VulcaoNapalm"){
				varVulcaoNapalm = habilidade;
			} else if(nomeDaHabilidade=="DrenoDeAlma"){
				varDrenoDeAlma = habilidade;
			} else if(nomeDaHabilidade=="EsmagamentoMagico"){
				varEsmagamentoMagico = habilidade;
			}

			else if(nomeDaHabilidade=="MaestriaArcana"){
				varMaestriaArcana = habilidade;
			} else if(nomeDaHabilidade=="ExpansaoArcana"){
				varExpansaoArcana = habilidade;
			} else if(nomeDaHabilidade=="EstudoArcano"){
				varEstudoArcano = habilidade;
			} else if(nomeDaHabilidade=="EstudoArcanoAvancado"){
				varEstudoArcanoAvancado = habilidade;
			} else if(nomeDaHabilidade=="DistorcaoArcana"){
				varDistorcaoArcana = habilidade;
			} else if(nomeDaHabilidade=="DrenarVida"){
				varDrenarVida = habilidade;
			} else if(nomeDaHabilidade=="InvocarEsferaDeFogo"){
				varInvocarEsferaDeFogo = habilidade;
			} else if(nomeDaHabilidade=="InvocarEsferaDeAgua"){
				varInvocarEsferaDeAgua = habilidade;
			} else if(nomeDaHabilidade=="InvocarEsferaDeVento"){
				varInvocarEsferaDeVento = habilidade;
			} else if(nomeDaHabilidade=="InvocarEsferaDeTerra"){
				varInvocarEsferaDeTerra = habilidade;
			} else if(nomeDaHabilidade=="DisparoArcano"){
				varDisparoArcano = habilidade;
			} else if(nomeDaHabilidade=="ZeroAbsoluto"){
				varZeroAbsoluto = habilidade;
			} else if(nomeDaHabilidade=="EsquifeDeGelo"){
				varEsquifeDeGelo = habilidade;
			} else if(nomeDaHabilidade=="ChamasDeHela"){
				varChamasDeHela = habilidade;
			} else if(nomeDaHabilidade=="MeteoroEscarlate"){
				varMeteoroEscarlate = habilidade;
			} else if(nomeDaHabilidade=="AbaloSismico"){
				varAbaloSismico = habilidade;
			} else if(nomeDaHabilidade=="ImpactoEspiritual"){
				varImpactoEspiritual = habilidade;
			} else if(nomeDaHabilidade=="CorrenteEletrica"){
				varCorrenteEletrica = habilidade;
			} else if(nomeDaHabilidade=="PantanoDeNifflheim"){
				varPantanoDeNifflheim = habilidade;
			} else if(nomeDaHabilidade=="FuriaDaMedusa"){
				varFuriaDaMedusa = habilidade;
			} else if(nomeDaHabilidade=="Exilio"){
				varExilio = habilidade;
			} else if(nomeDaHabilidade=="Cometa"){
				varCometa = habilidade;
			} else if(nomeDaHabilidade=="TetraVortex"){
				varTetraVortex = habilidade;
			}

			atualizarTela();

		}

		public void atualizarTela(){
			txtLancasDeGeloPontos.setText(varLancasDeGelo + "/10");
			txtBolasDeFogoPontos.setText(varBolasDeFogo + "/10");
			txtLancasDeFogoPontos.setText(varLancasDeFogo + "/10");
			txtBarreiraDeFogoPontos.setText(varBarreiraDeFogo + "/10");
			txtRajadaCongelantePontos.setText(varRajadaCongelante + "/10");
			txtAumentarRecuperacaoDeSPPontos.setText(varAumentarRecuperacaoDeSP + "/10");
			txtRelampagoPontos.setText(varRelampago + "/10");
			txtAtaqueEspiritualPontos.setText(varAtaqueEspiritual + "/10");
			txtEscudoMagicoPontos.setText(varEscudoMagico + "/10");
			txtChamaReveladoraPontos.setText(varChamaReveladora + "/1");
			txtEspiritosAncioesPontos.setText(varEspiritosAncioes + "/10");
			txtPetrificarPontos.setText(varPetrificar + "/10");
			txtTempestadeDeRaiosPontos.setText(varTempestadeDeRaios + "/10");

			txtColunaDePedraPontos.setText(varColunaDePedra + "/5");
			txtColunaDeFogoPontos.setText(varColunaDeFogo + "/10");
			txtCongelarPontos.setText(varCongelar + "/10");
			txtFuriaDaTerraPontos.setText(varFuriaDaTerra + "/5");
			txtBarreiraDeGeloPontos.setText(varBarreiraDeGelo + "/10");
			txtTrovaoDeJupiterPontos.setText(varTrovaoDeJupiter + "/10");
			txtIraDeThorPontos.setText(varIraDeThor + "/10");
			txtChuvaDeMeteorosPontos.setText(varChuvaDeMeteoros + "/10");
			txtPantanoDosMortosPontos.setText(varPantanoDosMortos + "/5");
			txtSentidoSobrenaturalPontos.setText(varSentidoSobrenatural + "/1");
			txtSupernovaPontos.setText(varSupernova + "/10");
			txtNevascaPontos.setText(varNevasca + "/10");
			txtEsferaDaguaPontos.setText(varEsferaDagua + "/5");

			txtGanbanteinPontos.setText(varGanbantein + "/1");
			txtCampoGravitacionalPontos.setText(varCampoGravitacional + "/5");
			txtAmplificacaoMisticaPontos.setText(varAmplificacaoMistica + "/10");
			txtVulcaoNapalmPontos.setText(varVulcaoNapalm + "/5");
			txtDrenoDeAlmaPontos.setText(varDrenoDeAlma + "/10");
			txtEsmagamentoMagicoPontos.setText(varEsmagamentoMagico + "/1");

			txtMaestriaArcanaPontos.setText(varMaestriaArcana + "/5");
			txtExpansaoArcanaPontos.setText(varExpansaoArcana + "/3");
			txtEstudoArcanoPontos.setText(varEstudoArcano + "/1");
			txtEstudoArcanoAvancadoPontos.setText(varEstudoArcanoAvancado + "/5");
			txtDistorcaoArcanaPontos.setText(varDistorcaoArcana + "/5");
			txtDrenarVidaPontos.setText(varDrenarVida + "/5");
			txtInvocarEsferaDeFogoPontos.setText(varInvocarEsferaDeFogo + "/5");
			txtInvocarEsferaDeAguaPontos.setText(varInvocarEsferaDeAgua + "/5");
			txtInvocarEsferaDeVentoPontos.setText(varInvocarEsferaDeVento + "/5");
			txtInvocarEsferaDeTerraPontos.setText(varInvocarEsferaDeTerra + "/5");
			txtDisparoArcanoPontos.setText(varDisparoArcano + "/2");
			txtZeroAbsolutoPontos.setText(varZeroAbsoluto + "/5");
			txtEsquifeDeGeloPontos.setText(varEsquifeDeGelo + "/5");
			txtChamasDeHelaPontos.setText(varChamasDeHela + "/5");
			txtMeteoroEscarlatePontos.setText(varMeteoroEscarlate + "/5");
			txtAbaloSismicoPontos.setText(varAbaloSismico + "/5");
			txtImpactoEspiritualPontos.setText(varImpactoEspiritual + "/5");
			txtCorrenteEletricaPontos.setText(varCorrenteEletrica + "/5");
			txtPantanoDeNifflheimPontos.setText(varPantanoDeNifflheim + "/5");
			txtFuriaDaMedusaPontos.setText(varFuriaDaMedusa + "/5");
			txtExilioPontos.setText(varExilio + "/5");
			txtCometaPontos.setText(varCometa + "/10");
			txtTetraVortexPontos.setText(varTetraVortex + "/5");

			txtClasse1.setText("Classe 1: " + primeiraClasse);
			txtClasse2.setText("Classe 2: " + segundaClasse);
			txtTransClasse.setText("Transclasse: " + transClasse + " (" + (segundaClasse + transClasse) + ")");
			txtClasse3.setText("Classe 3: " + terceiraClasse);

			tudoVisivel();
		}

		public void tudoVisivel(){
			layLancasDeGelo.setVisibility(View.VISIBLE);
			layBolasDeFogo.setVisibility(View.VISIBLE);
			layLancasDeFogo.setVisibility(View.VISIBLE);
			layBarreiraDeFogo.setVisibility(View.VISIBLE);
			layRajadaCongelante.setVisibility(View.VISIBLE);
			layAumentarRecuperacaoDeSP.setVisibility(View.VISIBLE);
			layRelampago.setVisibility(View.VISIBLE);
			layAtaqueEspiritual.setVisibility(View.VISIBLE);
			layEscudoMagico.setVisibility(View.VISIBLE);
			layChamaReveladora.setVisibility(View.VISIBLE);
			layEspiritosAncioes.setVisibility(View.VISIBLE);
			layPetrificar.setVisibility(View.VISIBLE);
			layTempestadeDeRaios.setVisibility(View.VISIBLE);

			layColunaDePedra.setVisibility(View.VISIBLE);
			layColunaDeFogo.setVisibility(View.VISIBLE);
			layCongelar.setVisibility(View.VISIBLE);
			layFuriaDaTerra.setVisibility(View.VISIBLE);
			layBarreiraDeGelo.setVisibility(View.VISIBLE);
			layTrovaoDeJupiter.setVisibility(View.VISIBLE);
			layIraDeThor.setVisibility(View.VISIBLE);
			layChuvaDeMeteoros.setVisibility(View.VISIBLE);
			layPantanoDosMortos.setVisibility(View.VISIBLE);
			laySentidoSobrenatural.setVisibility(View.VISIBLE);
			laySupernova.setVisibility(View.VISIBLE);
			layNevasca.setVisibility(View.VISIBLE);
			layEsferaDagua.setVisibility(View.VISIBLE);

			layGanbantein.setVisibility(View.VISIBLE);
			layCampoGravitacional.setVisibility(View.VISIBLE);
			layAmplificacaoMistica.setVisibility(View.VISIBLE);
			layVulcaoNapalm.setVisibility(View.VISIBLE);
			layDrenoDeAlma.setVisibility(View.VISIBLE);
			layEsmagamentoMagico.setVisibility(View.VISIBLE);

			layMaestriaArcana.setVisibility(View.VISIBLE);
			layExpansaoArcana.setVisibility(View.VISIBLE);
			layEstudoArcano.setVisibility(View.VISIBLE);
			layEstudoArcanoAvancado.setVisibility(View.VISIBLE);
			layDistorcaoArcana.setVisibility(View.VISIBLE);
			layDrenarVida.setVisibility(View.VISIBLE);
			layInvocarEsferaDeFogo.setVisibility(View.VISIBLE);
			layInvocarEsferaDeAgua.setVisibility(View.VISIBLE);
			layInvocarEsferaDeVento.setVisibility(View.VISIBLE);
			layInvocarEsferaDeTerra.setVisibility(View.VISIBLE);
			layDisparoArcano.setVisibility(View.VISIBLE);
			layZeroAbsoluto.setVisibility(View.VISIBLE);
			layEsquifeDeGelo.setVisibility(View.VISIBLE);
			layChamasDeHela.setVisibility(View.VISIBLE);
			layMeteoroEscarlate.setVisibility(View.VISIBLE);
			layAbaloSismico.setVisibility(View.VISIBLE);
			layImpactoEspiritual.setVisibility(View.VISIBLE);
			layCorrenteEletrica.setVisibility(View.VISIBLE);
			layPantanoDeNifflheim.setVisibility(View.VISIBLE);
			layFuriaDaMedusa.setVisibility(View.VISIBLE);
			layExilio.setVisibility(View.VISIBLE);
			layCometa.setVisibility(View.VISIBLE);
			layTetraVortex.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM arcano WHERE _id = ?", new String[]{String.valueOf(id)});

			if(cs.moveToFirst()){
			primeiraClasse = cs.getInt(2);
			segundaClasse = cs.getInt(3);
			transClasse = cs.getInt(4);
			terceiraClasse = cs.getInt(5);

			varLancasDeGelo = cs.getInt(6);
			varBolasDeFogo = cs.getInt(7);
			varLancasDeFogo = cs.getInt(8);
			varBarreiraDeFogo = cs.getInt(9);
			varRajadaCongelante = cs.getInt(10);
			varAumentarRecuperacaoDeSP = cs.getInt(11);
			varRelampago = cs.getInt(12);
			varAtaqueEspiritual = cs.getInt(13);
			varEscudoMagico = cs.getInt(14);
			varChamaReveladora = cs.getInt(15);
			varEspiritosAncioes = cs.getInt(16);
			varPetrificar = cs.getInt(17);
			varTempestadeDeRaios = cs.getInt(18);

			varColunaDePedra = cs.getInt(19);
			varColunaDeFogo = cs.getInt(20);
			varCongelar = cs.getInt(21);
			varFuriaDaTerra = cs.getInt(22);
			varBarreiraDeGelo = cs.getInt(23);
			varTrovaoDeJupiter = cs.getInt(24);
			varIraDeThor = cs.getInt(25);
			varChuvaDeMeteoros = cs.getInt(26);
			varPantanoDosMortos = cs.getInt(27);
			varSentidoSobrenatural = cs.getInt(28);
			varSupernova = cs.getInt(29);
			varNevasca = cs.getInt(30);
			varEsferaDagua = cs.getInt(31);

			varGanbantein = cs.getInt(32);
			varCampoGravitacional = cs.getInt(33);
			varAmplificacaoMistica = cs.getInt(34);
			varVulcaoNapalm = cs.getInt(35);
			varDrenoDeAlma = cs.getInt(36);
			varEsmagamentoMagico = cs.getInt(37);

			varMaestriaArcana = cs.getInt(38);
			varExpansaoArcana = cs.getInt(39);
			varEstudoArcano = cs.getInt(40);
			varEstudoArcanoAvancado = cs.getInt(41);
			varDistorcaoArcana = cs.getInt(42);
			varDrenarVida = cs.getInt(43);
			varInvocarEsferaDeFogo = cs.getInt(44);
			varInvocarEsferaDeAgua = cs.getInt(45);
			varInvocarEsferaDeVento = cs.getInt(46);
			varInvocarEsferaDeTerra = cs.getInt(47);
			varDisparoArcano = cs.getInt(48);
			varZeroAbsoluto = cs.getInt(49);
			varEsquifeDeGelo = cs.getInt(50);
			varChamasDeHela = cs.getInt(51);
			varMeteoroEscarlate = cs.getInt(52);
			varAbaloSismico = cs.getInt(53);
			varImpactoEspiritual = cs.getInt(54);
			varCorrenteEletrica = cs.getInt(55);
			varPantanoDeNifflheim = cs.getInt(56);
			varFuriaDaMedusa = cs.getInt(57);
			varExilio = cs.getInt(58);
			varCometa = cs.getInt(59);
			varTetraVortex = cs.getInt(60);

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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS arcano (");
					sqlClasse.append("_id INTEGER PRIMARY KEY, ");
					sqlClasse.append("nome VARCHAR(30), ");
					sqlClasse.append("primeira_classe INT(2), ");
					sqlClasse.append("segunda_classe INT(2), ");
					sqlClasse.append("trans_classe INT(2), ");
					sqlClasse.append("terceira_classe INT(2), ");
					sqlClasse.append("skill_lancasdegelo INT(2), ");
					sqlClasse.append("skill_bolasdefogo INT(2), ");
					sqlClasse.append("skill_lancasdefogo INT(2), ");
					sqlClasse.append("skill_barreiradefogo INT(2), ");
					sqlClasse.append("skill_rajadacongelante INT(2), ");
					sqlClasse.append("skill_aumentarrecuperacaodesp INT(2), ");
					sqlClasse.append("skill_relampago INT(2), ");
					sqlClasse.append("skill_ataqueespiritual INT(2), ");
					sqlClasse.append("skill_escudomagico INT(2), ");
					sqlClasse.append("skill_chamareveladora INT(2), ");
					sqlClasse.append("skill_espiritosancioes INT(2), ");
					sqlClasse.append("skill_petrificar INT(2), ");
					sqlClasse.append("skill_tempestadederaios INT(2), ");
					sqlClasse.append("skill_colunadepedra INT(2), ");
					sqlClasse.append("skill_colunadefogo INT(2), ");
					sqlClasse.append("skill_congelar INT(2), ");
					sqlClasse.append("skill_furiadaterra INT(2), ");
					sqlClasse.append("skill_barreiradegelo INT(2), ");
					sqlClasse.append("skill_trovaodejupiter INT(2), ");
					sqlClasse.append("skill_iradethor INT(2), ");
					sqlClasse.append("skill_chuvademeteoros INT(2), ");
					sqlClasse.append("skill_pantanodosmortos INT(2), ");
					sqlClasse.append("skill_sentidosobrenatural INT(2), ");
					sqlClasse.append("skill_supernova INT(2), ");
					sqlClasse.append("skill_nevasca INT(2), ");
					sqlClasse.append("skill_esferadagua INT(2), ");
					sqlClasse.append("skill_ganbantein INT(2), ");
					sqlClasse.append("skill_campogravitacional INT(2), ");
					sqlClasse.append("skill_amplificacaomistica INT(2), ");
					sqlClasse.append("skill_vulcaonapalm INT(2), ");
					sqlClasse.append("skill_drenodealma INT(2), ");
					sqlClasse.append("skill_esmagamentomagico INT(2), ");
					sqlClasse.append("skill_maestriaarcana INT(2), ");
					sqlClasse.append("skill_expansaoarcana INT(2), ");
					sqlClasse.append("skill_estudoarcano INT(2), ");
					sqlClasse.append("skill_estudoarcanoavancado INT(2), ");
					sqlClasse.append("skill_distorcaoarcana INT(2), ");
					sqlClasse.append("skill_drenarvida INT(2), ");
					sqlClasse.append("skill_invocaresferadefogo INT(2), ");
					sqlClasse.append("skill_invocaresferadeagua INT(2), ");
					sqlClasse.append("skill_invocaresferadevento INT(2), ");
					sqlClasse.append("skill_invocaresferadeterra INT(2), ");
					sqlClasse.append("skill_disparoarcano INT(2), ");
					sqlClasse.append("skill_zeroabsoluto INT(2), ");
					sqlClasse.append("skill_esquifedegelo INT(2), ");
					sqlClasse.append("skill_chamasdehela INT(2), ");
					sqlClasse.append("skill_meteoroescarlate INT(2), ");
					sqlClasse.append("skill_abalosismico INT(2), ");
					sqlClasse.append("skill_impactoespiritual INT(2), ");
					sqlClasse.append("skill_correnteeletrica INT(2), ");
					sqlClasse.append("skill_pantanodenifflheim INT(2), ");
					sqlClasse.append("skill_furiadamedusa INT(2), ");
					sqlClasse.append("skill_exilio INT(2), ");
					sqlClasse.append("skill_cometa INT(2), ");
					sqlClasse.append("skill_tetravortex INT(2), ");
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
					ins.put("skill_lancasdegelo", varLancasDeGelo);
					ins.put("skill_bolasdefogo", varBolasDeFogo);
					ins.put("skill_lancasdefogo", varLancasDeFogo);
					ins.put("skill_barreiradefogo", varBarreiraDeFogo);
					ins.put("skill_rajadacongelante", varRajadaCongelante);
					ins.put("skill_aumentarrecuperacaodesp", varAumentarRecuperacaoDeSP);
					ins.put("skill_relampago", varRelampago);
					ins.put("skill_ataqueespiritual", varAtaqueEspiritual);
					ins.put("skill_escudomagico", varEscudoMagico);
					ins.put("skill_chamareveladora", varChamaReveladora);
					ins.put("skill_espiritosancioes", varEspiritosAncioes);
					ins.put("skill_petrificar", varPetrificar);
					ins.put("skill_tempestadederaios", varTempestadeDeRaios);
					ins.put("skill_colunadepedra", varColunaDePedra);
					ins.put("skill_colunadefogo", varColunaDeFogo);
					ins.put("skill_congelar", varCongelar);
					ins.put("skill_furiadaterra", varFuriaDaTerra);
					ins.put("skill_barreiradegelo", varBarreiraDeGelo);
					ins.put("skill_trovaodejupiter", varTrovaoDeJupiter);
					ins.put("skill_iradethor", varIraDeThor);
					ins.put("skill_chuvademeteoros", varChuvaDeMeteoros);
					ins.put("skill_pantanodosmortos", varPantanoDosMortos);
					ins.put("skill_sentidosobrenatural", varSentidoSobrenatural);
					ins.put("skill_supernova", varSupernova);
					ins.put("skill_nevasca", varNevasca);
					ins.put("skill_esferadagua", varEsferaDagua);
					ins.put("skill_ganbantein", varGanbantein);
					ins.put("skill_campogravitacional", varCampoGravitacional);
					ins.put("skill_amplificacaomistica", varAmplificacaoMistica);
					ins.put("skill_vulcaonapalm", varVulcaoNapalm);
					ins.put("skill_drenodealma", varDrenoDeAlma);
					ins.put("skill_esmagamentomagico", varEsmagamentoMagico);
					ins.put("skill_maestriaarcana", varMaestriaArcana);
					ins.put("skill_expansaoarcana", varExpansaoArcana);
					ins.put("skill_estudoarcano", varEstudoArcano);
					ins.put("skill_estudoarcanoavancado", varEstudoArcanoAvancado);
					ins.put("skill_distorcaoarcana", varDistorcaoArcana);
					ins.put("skill_drenarvida", varDrenarVida);
					ins.put("skill_invocaresferadefogo", varInvocarEsferaDeFogo);
					ins.put("skill_invocaresferadeagua", varInvocarEsferaDeAgua);
					ins.put("skill_invocaresferadevento", varInvocarEsferaDeVento);
					ins.put("skill_invocaresferadeterra", varInvocarEsferaDeTerra);
					ins.put("skill_disparoarcano", varDisparoArcano);
					ins.put("skill_zeroabsoluto", varZeroAbsoluto);
					ins.put("skill_esquifedegelo", varEsquifeDeGelo);
					ins.put("skill_chamasdehela", varChamasDeHela);
					ins.put("skill_meteoroescarlate", varMeteoroEscarlate);
					ins.put("skill_abalosismico", varAbaloSismico);
					ins.put("skill_impactoespiritual", varImpactoEspiritual);
					ins.put("skill_correnteeletrica", varCorrenteEletrica);
					ins.put("skill_pantanodenifflheim", varPantanoDeNifflheim);
					ins.put("skill_furiadamedusa", varFuriaDaMedusa);
					ins.put("skill_exilio", varExilio);
					ins.put("skill_cometa", varCometa);
					ins.put("skill_tetravortex", varTetraVortex);
					ins.put("skill_primeira", skillPrimeira);
					ins.put("skill_segunda", skillSegunda);
					ins.put("skill_trans", skillTrans);
					ins.put("skill_terceira", skillTerceira);
					if(!novo){
						try {
							db.update("arcano", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("arcano", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from arcano", null);
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
						ins2.put("classe", "arcano");
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