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

public class SimuladorFeiticeiro extends Activity {

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
		btAbracadabraInterrogacao,
		btCancelarMagiaInterrogacao,
		btDesencantarInterrogacao,
		btDesconcentrarInterrogacao,
		btEspelhoMagicoInterrogacao,
		btDiluvioInterrogacao,
		btVulcaoInterrogacao,
		btFuracaoInterrogacao,
		btDragonologiaInterrogacao,
		btEstudoDeLivrosInterrogacao,
		btConjuracaoLivreInterrogacao,
		btDesejoArcanoInterrogacao,
		btColunaDePedraInterrogacao,
		btFuriaDaTerraInterrogacao,
		btSentidoSobrenaturalInterrogacao,
		btEncantarComChamaInterrogacao,
		btEncantarComGeadaInterrogacao,
		btEncantarComTerremotoInterrogacao,
		btEncantarComVentaniaInterrogacao,
		btProtegerTerrenoInterrogacao,
		btCriarConversorElementalInterrogacao,
		btMudancaElementalInterrogacao,
		btBrumaOfuscanteInterrogacao,
		btLancasDuplasInterrogacao,
		btPrisaoDeTeiaInterrogacao,
		btPrescienciaInterrogacao,
		btIndulgirInterrogacao,
		btEnlouquecedorInterrogacao,
		btExalarAlmaInterrogacao,
		btSifaoDeAlmasInterrogacao,
		btEncantoDeOrionInterrogacao,
		btPunhoArcanoInterrogacao,
		btOndaPsiquicaInterrogacao,
		btPoDeDiamanteInterrogacao,
		btLancasDosAesirInterrogacao,
		btCastigoDeNerthusInterrogacao,
		btMaldicaoDeJormungandInterrogacao,
		btImplosaoToxicaInterrogacao,
		btPassosDeSalamandraInterrogacao,
		btPassosDeSilfideInterrogacao,
		btAquecerTerrenoInterrogacao,
		btTornadoInterrogacao,
		btOndaHipnoticaInterrogacao,
		btInvocarAgniInterrogacao,
		btInvocarVarunaInterrogacao,
		btInvocarVayuInterrogacao,
		btInvocarChandraInterrogacao,
		btInsigniaDoFogoInterrogacao,
		btInsigniaDaAguaInterrogacao,
		btInsigniaDoVentoInterrogacao,
		btInsigniaDaTerraInterrogacao,
		btEmpatiaElementalInterrogacao,
		btIncitarElementalInterrogacao,
		btDominioElementalInterrogacao,
		btAnaliseElementalInterrogacao,
		btTrocaEspiritualInterrogacao;

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
		btAbracadabraDiminuir,
		btCancelarMagiaDiminuir,
		btDesencantarDiminuir,
		btDesconcentrarDiminuir,
		btEspelhoMagicoDiminuir,
		btDiluvioDiminuir,
		btVulcaoDiminuir,
		btFuracaoDiminuir,
		btDragonologiaDiminuir,
		btEstudoDeLivrosDiminuir,
		btConjuracaoLivreDiminuir,
		btDesejoArcanoDiminuir,
		btColunaDePedraDiminuir,
		btFuriaDaTerraDiminuir,
		btSentidoSobrenaturalDiminuir,
		btEncantarComChamaDiminuir,
		btEncantarComGeadaDiminuir,
		btEncantarComTerremotoDiminuir,
		btEncantarComVentaniaDiminuir,
		btProtegerTerrenoDiminuir,
		btBrumaOfuscanteDiminuir,
		btLancasDuplasDiminuir,
		btPrisaoDeTeiaDiminuir,
		btPrescienciaDiminuir,
		btIndulgirDiminuir,
		btEnlouquecedorDiminuir,
		btExalarAlmaDiminuir,
		btSifaoDeAlmasDiminuir,
		btEncantoDeOrionDiminuir,
		btPunhoArcanoDiminuir,
		btOndaPsiquicaDiminuir,
		btPoDeDiamanteDiminuir,
		btLancasDosAesirDiminuir,
		btCastigoDeNerthusDiminuir,
		btMaldicaoDeJormungandDiminuir,
		btImplosaoToxicaDiminuir,
		btPassosDeSalamandraDiminuir,
		btPassosDeSilfideDiminuir,
		btAquecerTerrenoDiminuir,
		btTornadoDiminuir,
		btOndaHipnoticaDiminuir,
		btInvocarAgniDiminuir,
		btInvocarVarunaDiminuir,
		btInvocarVayuDiminuir,
		btInvocarChandraDiminuir,
		btInsigniaDoFogoDiminuir,
		btInsigniaDaAguaDiminuir,
		btInsigniaDoVentoDiminuir,
		btInsigniaDaTerraDiminuir,
		btEmpatiaElementalDiminuir,
		btIncitarElementalDiminuir,
		btDominioElementalDiminuir,
		btAnaliseElementalDiminuir,
		btTrocaEspiritualDiminuir;

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
		btAbracadabraAumentar,
		btCancelarMagiaAumentar,
		btDesencantarAumentar,
		btDesconcentrarAumentar,
		btEspelhoMagicoAumentar,
		btDiluvioAumentar,
		btVulcaoAumentar,
		btFuracaoAumentar,
		btDragonologiaAumentar,
		btEstudoDeLivrosAumentar,
		btConjuracaoLivreAumentar,
		btDesejoArcanoAumentar,
		btColunaDePedraAumentar,
		btFuriaDaTerraAumentar,
		btSentidoSobrenaturalAumentar,
		btEncantarComChamaAumentar,
		btEncantarComGeadaAumentar,
		btEncantarComTerremotoAumentar,
		btEncantarComVentaniaAumentar,
		btProtegerTerrenoAumentar,
		btBrumaOfuscanteAumentar,
		btLancasDuplasAumentar,
		btPrisaoDeTeiaAumentar,
		btPrescienciaAumentar,
		btIndulgirAumentar,
		btEnlouquecedorAumentar,
		btExalarAlmaAumentar,
		btSifaoDeAlmasAumentar,
		btEncantoDeOrionAumentar,
		btPunhoArcanoAumentar,
		btOndaPsiquicaAumentar,
		btPoDeDiamanteAumentar,
		btLancasDosAesirAumentar,
		btCastigoDeNerthusAumentar,
		btMaldicaoDeJormungandAumentar,
		btImplosaoToxicaAumentar,
		btPassosDeSalamandraAumentar,
		btPassosDeSilfideAumentar,
		btAquecerTerrenoAumentar,
		btTornadoAumentar,
		btOndaHipnoticaAumentar,
		btInvocarAgniAumentar,
		btInvocarVarunaAumentar,
		btInvocarVayuAumentar,
		btInvocarChandraAumentar,
		btInsigniaDoFogoAumentar,
		btInsigniaDaAguaAumentar,
		btInsigniaDoVentoAumentar,
		btInsigniaDaTerraAumentar,
		btEmpatiaElementalAumentar,
		btIncitarElementalAumentar,
		btDominioElementalAumentar,
		btAnaliseElementalAumentar,
		btTrocaEspiritualAumentar;

		//Resto dos botões
		Button btResetar, btSalvar;
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
		txtAbracadabraPontos,
		txtCancelarMagiaPontos,
		txtDesencantarPontos,
		txtDesconcentrarPontos,
		txtEspelhoMagicoPontos,
		txtDiluvioPontos,
		txtVulcaoPontos,
		txtFuracaoPontos,
		txtDragonologiaPontos,
		txtEstudoDeLivrosPontos,
		txtConjuracaoLivrePontos,
		txtDesejoArcanoPontos,
		txtColunaDePedraPontos,
		txtFuriaDaTerraPontos,
		txtSentidoSobrenaturalPontos,
		txtEncantarComChamaPontos,
		txtEncantarComGeadaPontos,
		txtEncantarComTerremotoPontos,
		txtEncantarComVentaniaPontos,
		txtProtegerTerrenoPontos,
		txtBrumaOfuscantePontos,
		txtLancasDuplasPontos,
		txtPrisaoDeTeiaPontos,
		txtPrescienciaPontos,
		txtIndulgirPontos,
		txtEnlouquecedorPontos,
		txtExalarAlmaPontos,
		txtSifaoDeAlmasPontos,
		txtEncantoDeOrionPontos,
		txtPunhoArcanoPontos,
		txtOndaPsiquicaPontos,
		txtPoDeDiamantePontos,
		txtLancasDosAesirPontos,
		txtCastigoDeNerthusPontos,
		txtMaldicaoDeJormungandPontos,
		txtImplosaoToxicaPontos,
		txtPassosDeSalamandraPontos,
		txtPassosDeSilfidePontos,
		txtAquecerTerrenoPontos,
		txtTornadoPontos,
		txtOndaHipnoticaPontos,
		txtInvocarAgniPontos,
		txtInvocarVarunaPontos,
		txtInvocarVayuPontos,
		txtInvocarChandraPontos,
		txtInsigniaDoFogoPontos,
		txtInsigniaDaAguaPontos,
		txtInsigniaDoVentoPontos,
		txtInsigniaDaTerraPontos,
		txtEmpatiaElementalPontos,
		txtIncitarElementalPontos,
		txtDominioElementalPontos,
		txtAnaliseElementalPontos,
		txtTrocaEspiritualPontos;

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
		layAbracadabra,
		layCancelarMagia,
		layDesencantar,
		layDesconcentrar,
		layEspelhoMagico,
		layDiluvio,
		layVulcao,
		layFuracao,
		layDragonologia,
		layEstudoDeLivros,
		layConjuracaoLivre,
		layDesejoArcano,
		layColunaDePedra,
		layFuriaDaTerra,
		laySentidoSobrenatural,
		layEncantarComChama,
		layEncantarComGeada,
		layEncantarComTerremoto,
		layEncantarComVentania,
		layProtegerTerreno,
		layBrumaOfuscante,
		layLancasDuplas,
		layPrisaoDeTeia,
		layPresciencia,
		layIndulgir,
		layEnlouquecedor,
		layExalarAlma,
		laySifaoDeAlmas,
		layEncantoDeOrion,
		layPunhoArcano,
		layOndaPsiquica,
		layPoDeDiamante,
		layLancasDosAesir,
		layCastigoDeNerthus,
		layMaldicaoDeJormungand,
		layImplosaoToxica,
		layPassosDeSalamandra,
		layPassosDeSilfide,
		layAquecerTerreno,
		layTornado,
		layOndaHipnotica,
		layInvocarAgni,
		layInvocarVaruna,
		layInvocarVayu,
		layInvocarChandra,
		layInsigniaDoFogo,
		layInsigniaDaAgua,
		layInsigniaDoVento,
		layInsigniaDaTerra,
		layEmpatiaElemental,
		layIncitarElemental,
		layDominioElemental,
		layAnaliseElemental,
		layTrocaEspiritual;

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
		varAbracadabra,
		varCancelarMagia,
		varDesencantar,
		varDesconcentrar,
		varEspelhoMagico,
		varDiluvio,
		varVulcao,
		varFuracao,
		varDragonologia,
		varEstudoDeLivros,
		varConjuracaoLivre,
		varDesejoArcano,
		varColunaDePedra,
		varFuriaDaTerra,
		varSentidoSobrenatural,
		varEncantarComChama,
		varEncantarComGeada,
		varEncantarComTerremoto,
		varEncantarComVentania,
		varProtegerTerreno,
		varBrumaOfuscante,
		varLancasDuplas,
		varPrisaoDeTeia,
		varPresciencia,
		varIndulgir,
		varEnlouquecedor,
		varExalarAlma,
		varSifaoDeAlmas,
		varEncantoDeOrion,
		varPunhoArcano,
		varOndaPsiquica,
		varPoDeDiamante,
		varLancasDosAesir,
		varCastigoDeNerthus,
		varMaldicaoDeJormungand,
		varImplosaoToxica,
		varPassosDeSalamandra,
		varPassosDeSilfide,
		varAquecerTerreno,
		varTornado,
		varOndaHipnotica,
		varInvocarAgni,
		varInvocarVaruna,
		varInvocarVayu,
		varInvocarChandra,
		varInsigniaDoFogo,
		varInsigniaDaAgua,
		varInsigniaDoVento,
		varInsigniaDaTerra,
		varEmpatiaElemental,
		varIncitarElemental,
		varDominioElemental,
		varAnaliseElemental,
		varTrocaEspiritual;

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

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_simulador_feiticeiro);

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
			varAbracadabra = 0;
			varCancelarMagia = 0;
			varDesencantar = 0;
			varDesconcentrar = 0;
			varEspelhoMagico = 0;
			varDiluvio = 0;
			varVulcao = 0;
			varFuracao = 0;
			varDragonologia = 0;
			varEstudoDeLivros = 0;
			varConjuracaoLivre = 0;
			varDesejoArcano = 0;
			varColunaDePedra = 0;
			varFuriaDaTerra = 0;
			varSentidoSobrenatural = 0;
			varEncantarComChama = 0;
			varEncantarComGeada = 0;
			varEncantarComTerremoto = 0;
			varEncantarComVentania = 0;
			varProtegerTerreno = 0;
			varBrumaOfuscante = 0;
			varLancasDuplas = 0;
			varPrisaoDeTeia = 0;
			varPresciencia = 0;
			varIndulgir = 0;
			varEnlouquecedor = 0;
			varExalarAlma = 0;
			varSifaoDeAlmas = 0;
			varEncantoDeOrion = 0;
			varPunhoArcano = 0;
			varOndaPsiquica = 0;
			varPoDeDiamante = 0;
			varLancasDosAesir = 0;
			varCastigoDeNerthus = 0;
			varMaldicaoDeJormungand = 0;
			varImplosaoToxica = 0;
			varPassosDeSalamandra = 0;
			varPassosDeSilfide = 0;
			varAquecerTerreno = 0;
			varTornado = 0;
			varOndaHipnotica = 0;
			varInvocarAgni = 0;
			varInvocarVaruna = 0;
			varInvocarVayu = 0;
			varInvocarChandra = 0;
			varInsigniaDoFogo = 0;
			varInsigniaDaAgua = 0;
			varInsigniaDoVento = 0;
			varInsigniaDaTerra = 0;
			varEmpatiaElemental = 0;
			varIncitarElemental = 0;
			varDominioElemental = 0;
			varAnaliseElemental = 0;
			varTrocaEspiritual = 0;



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
			btAbracadabraInterrogacao = (Button) findViewById(R.id.btAbracadabraInterrogacao);
			btCancelarMagiaInterrogacao = (Button) findViewById(R.id.btCancelarMagiaInterrogacao);
			btDesencantarInterrogacao = (Button) findViewById(R.id.btDesencantarInterrogacao);
			btDesconcentrarInterrogacao = (Button) findViewById(R.id.btDesconcentrarInterrogacao);
			btEspelhoMagicoInterrogacao = (Button) findViewById(R.id.btEspelhoMagicoInterrogacao);
			btDiluvioInterrogacao = (Button) findViewById(R.id.btDiluvioInterrogacao);
			btVulcaoInterrogacao = (Button) findViewById(R.id.btVulcaoInterrogacao);
			btFuracaoInterrogacao = (Button) findViewById(R.id.btFuracaoInterrogacao);
			btDragonologiaInterrogacao = (Button) findViewById(R.id.btDragonologiaInterrogacao);
			btEstudoDeLivrosInterrogacao = (Button) findViewById(R.id.btEstudoDeLivrosInterrogacao);
			btConjuracaoLivreInterrogacao = (Button) findViewById(R.id.btConjuracaoLivreInterrogacao);
			btDesejoArcanoInterrogacao = (Button) findViewById(R.id.btDesejoArcanoInterrogacao);
			btColunaDePedraInterrogacao = (Button) findViewById(R.id.btColunaDePedraInterrogacao);
			btFuriaDaTerraInterrogacao = (Button) findViewById(R.id.btFuriaDaTerraInterrogacao);
			btSentidoSobrenaturalInterrogacao = (Button) findViewById(R.id.btSentidoSobrenaturalInterrogacao);
			btEncantarComChamaInterrogacao = (Button) findViewById(R.id.btEncantarComChamaInterrogacao);
			btEncantarComGeadaInterrogacao = (Button) findViewById(R.id.btEncantarComGeadaInterrogacao);
			btEncantarComTerremotoInterrogacao = (Button) findViewById(R.id.btEncantarComTerremotoInterrogacao);
			btEncantarComVentaniaInterrogacao = (Button) findViewById(R.id.btEncantarComVentaniaInterrogacao);
			btProtegerTerrenoInterrogacao = (Button) findViewById(R.id.btProtegerTerrenoInterrogacao);
			btCriarConversorElementalInterrogacao = (Button) findViewById(R.id.btCriarConversorElementalInterrogacao);
			btMudancaElementalInterrogacao = (Button) findViewById(R.id.btMudancaElementalInterrogacao);
			btBrumaOfuscanteInterrogacao = (Button) findViewById(R.id.btBrumaOfuscanteInterrogacao);
			btLancasDuplasInterrogacao = (Button) findViewById(R.id.btLancasDuplasInterrogacao);
			btPrisaoDeTeiaInterrogacao = (Button) findViewById(R.id.btPrisaoDeTeiaInterrogacao);
			btPrescienciaInterrogacao = (Button) findViewById(R.id.btPrescienciaInterrogacao);
			btIndulgirInterrogacao = (Button) findViewById(R.id.btIndulgirInterrogacao);
			btEnlouquecedorInterrogacao = (Button) findViewById(R.id.btEnlouquecedorInterrogacao);
			btExalarAlmaInterrogacao = (Button) findViewById(R.id.btExalarAlmaInterrogacao);
			btSifaoDeAlmasInterrogacao = (Button) findViewById(R.id.btSifaoDeAlmasInterrogacao);
			btEncantoDeOrionInterrogacao = (Button) findViewById(R.id.btEncantoDeOrionInterrogacao);
			btPunhoArcanoInterrogacao = (Button) findViewById(R.id.btPunhoArcanoInterrogacao);
			btOndaPsiquicaInterrogacao = (Button) findViewById(R.id.btOndaPsiquicaInterrogacao);
			btPoDeDiamanteInterrogacao = (Button) findViewById(R.id.btPoDeDiamanteInterrogacao);
			btLancasDosAesirInterrogacao = (Button) findViewById(R.id.btLancasDosAesirInterrogacao);
			btCastigoDeNerthusInterrogacao = (Button) findViewById(R.id.btCastigoDeNerthusInterrogacao);
			btMaldicaoDeJormungandInterrogacao = (Button) findViewById(R.id.btMaldicaoDeJormungandInterrogacao);
			btImplosaoToxicaInterrogacao = (Button) findViewById(R.id.btImplosaoToxicaInterrogacao);
			btPassosDeSalamandraInterrogacao = (Button) findViewById(R.id.btPassosDeSalamandraInterrogacao);
			btPassosDeSilfideInterrogacao = (Button) findViewById(R.id.btPassosDeSilfideInterrogacao);
			btAquecerTerrenoInterrogacao = (Button) findViewById(R.id.btAquecerTerrenoInterrogacao);
			btTornadoInterrogacao = (Button) findViewById(R.id.btTornadoInterrogacao);
			btOndaHipnoticaInterrogacao = (Button) findViewById(R.id.btOndaHipnoticaInterrogacao);
			btInvocarAgniInterrogacao = (Button) findViewById(R.id.btInvocarAgniInterrogacao);
			btInvocarVarunaInterrogacao = (Button) findViewById(R.id.btInvocarVarunaInterrogacao);
			btInvocarVayuInterrogacao = (Button) findViewById(R.id.btInvocarVayuInterrogacao);
			btInvocarChandraInterrogacao = (Button) findViewById(R.id.btInvocarChandraInterrogacao);
			btInsigniaDoFogoInterrogacao = (Button) findViewById(R.id.btInsigniaDoFogoInterrogacao);
			btInsigniaDaAguaInterrogacao = (Button) findViewById(R.id.btInsigniaDaAguaInterrogacao);
			btInsigniaDoVentoInterrogacao = (Button) findViewById(R.id.btInsigniaDoVentoInterrogacao);
			btInsigniaDaTerraInterrogacao = (Button) findViewById(R.id.btInsigniaDaTerraInterrogacao);
			btEmpatiaElementalInterrogacao = (Button) findViewById(R.id.btEmpatiaElementalInterrogacao);
			btIncitarElementalInterrogacao = (Button) findViewById(R.id.btIncitarElementalInterrogacao);
			btDominioElementalInterrogacao = (Button) findViewById(R.id.btDominioElementalInterrogacao);
			btAnaliseElementalInterrogacao = (Button) findViewById(R.id.btAnaliseElementalInterrogacao);
			btTrocaEspiritualInterrogacao = (Button) findViewById(R.id.btTrocaEspiritualInterrogacao);

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
			btAbracadabraDiminuir = (Button) findViewById(R.id.btAbracadabraDiminuir);
			btCancelarMagiaDiminuir = (Button) findViewById(R.id.btCancelarMagiaDiminuir);
			btDesencantarDiminuir = (Button) findViewById(R.id.btDesencantarDiminuir);
			btDesconcentrarDiminuir = (Button) findViewById(R.id.btDesconcentrarDiminuir);
			btEspelhoMagicoDiminuir = (Button) findViewById(R.id.btEspelhoMagicoDiminuir);
			btDiluvioDiminuir = (Button) findViewById(R.id.btDiluvioDiminuir);
			btVulcaoDiminuir = (Button) findViewById(R.id.btVulcaoDiminuir);
			btFuracaoDiminuir = (Button) findViewById(R.id.btFuracaoDiminuir);
			btDragonologiaDiminuir = (Button) findViewById(R.id.btDragonologiaDiminuir);
			btEstudoDeLivrosDiminuir = (Button) findViewById(R.id.btEstudoDeLivrosDiminuir);
			btConjuracaoLivreDiminuir = (Button) findViewById(R.id.btConjuracaoLivreDiminuir);
			btDesejoArcanoDiminuir = (Button) findViewById(R.id.btDesejoArcanoDiminuir);
			btColunaDePedraDiminuir = (Button) findViewById(R.id.btColunaDePedraDiminuir);
			btFuriaDaTerraDiminuir = (Button) findViewById(R.id.btFuriaDaTerraDiminuir);
			btSentidoSobrenaturalDiminuir = (Button) findViewById(R.id.btSentidoSobrenaturalDiminuir);
			btEncantarComChamaDiminuir = (Button) findViewById(R.id.btEncantarComChamaDiminuir);
			btEncantarComGeadaDiminuir = (Button) findViewById(R.id.btEncantarComGeadaDiminuir);
			btEncantarComTerremotoDiminuir = (Button) findViewById(R.id.btEncantarComTerremotoDiminuir);
			btEncantarComVentaniaDiminuir = (Button) findViewById(R.id.btEncantarComVentaniaDiminuir);
			btProtegerTerrenoDiminuir = (Button) findViewById(R.id.btProtegerTerrenoDiminuir);
			btBrumaOfuscanteDiminuir = (Button) findViewById(R.id.btBrumaOfuscanteDiminuir);
			btLancasDuplasDiminuir = (Button) findViewById(R.id.btLancasDuplasDiminuir);
			btPrisaoDeTeiaDiminuir = (Button) findViewById(R.id.btPrisaoDeTeiaDiminuir);
			btPrescienciaDiminuir = (Button) findViewById(R.id.btPrescienciaDiminuir);
			btIndulgirDiminuir = (Button) findViewById(R.id.btIndulgirDiminuir);
			btEnlouquecedorDiminuir = (Button) findViewById(R.id.btEnlouquecedorDiminuir);
			btExalarAlmaDiminuir = (Button) findViewById(R.id.btExalarAlmaDiminuir);
			btSifaoDeAlmasDiminuir = (Button) findViewById(R.id.btSifaoDeAlmasDiminuir);
			btEncantoDeOrionDiminuir = (Button) findViewById(R.id.btEncantoDeOrionDiminuir);
			btPunhoArcanoDiminuir = (Button) findViewById(R.id.btPunhoArcanoDiminuir);
			btOndaPsiquicaDiminuir = (Button) findViewById(R.id.btOndaPsiquicaDiminuir);
			btPoDeDiamanteDiminuir = (Button) findViewById(R.id.btPoDeDiamanteDiminuir);
			btLancasDosAesirDiminuir = (Button) findViewById(R.id.btLancasDosAesirDiminuir);
			btCastigoDeNerthusDiminuir = (Button) findViewById(R.id.btCastigoDeNerthusDiminuir);
			btMaldicaoDeJormungandDiminuir = (Button) findViewById(R.id.btMaldicaoDeJormungandDiminuir);
			btImplosaoToxicaDiminuir = (Button) findViewById(R.id.btImplosaoToxicaDiminuir);
			btPassosDeSalamandraDiminuir = (Button) findViewById(R.id.btPassosDeSalamandraDiminuir);
			btPassosDeSilfideDiminuir = (Button) findViewById(R.id.btPassosDeSilfideDiminuir);
			btAquecerTerrenoDiminuir = (Button) findViewById(R.id.btAquecerTerrenoDiminuir);
			btTornadoDiminuir = (Button) findViewById(R.id.btTornadoDiminuir);
			btOndaHipnoticaDiminuir = (Button) findViewById(R.id.btOndaHipnoticaDiminuir);
			btInvocarAgniDiminuir = (Button) findViewById(R.id.btInvocarAgniDiminuir);
			btInvocarVarunaDiminuir = (Button) findViewById(R.id.btInvocarVarunaDiminuir);
			btInvocarVayuDiminuir = (Button) findViewById(R.id.btInvocarVayuDiminuir);
			btInvocarChandraDiminuir = (Button) findViewById(R.id.btInvocarChandraDiminuir);
			btInsigniaDoFogoDiminuir = (Button) findViewById(R.id.btInsigniaDoFogoDiminuir);
			btInsigniaDaAguaDiminuir = (Button) findViewById(R.id.btInsigniaDaAguaDiminuir);
			btInsigniaDoVentoDiminuir = (Button) findViewById(R.id.btInsigniaDoVentoDiminuir);
			btInsigniaDaTerraDiminuir = (Button) findViewById(R.id.btInsigniaDaTerraDiminuir);
			btEmpatiaElementalDiminuir = (Button) findViewById(R.id.btEmpatiaElementalDiminuir);
			btIncitarElementalDiminuir = (Button) findViewById(R.id.btIncitarElementalDiminuir);
			btDominioElementalDiminuir = (Button) findViewById(R.id.btDominioElementalDiminuir);
			btAnaliseElementalDiminuir = (Button) findViewById(R.id.btAnaliseElementalDiminuir);
			btTrocaEspiritualDiminuir = (Button) findViewById(R.id.btTrocaEspiritualDiminuir);

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
			btAbracadabraAumentar = (Button) findViewById(R.id.btAbracadabraAumentar);
			btCancelarMagiaAumentar = (Button) findViewById(R.id.btCancelarMagiaAumentar);
			btDesencantarAumentar = (Button) findViewById(R.id.btDesencantarAumentar);
			btDesconcentrarAumentar = (Button) findViewById(R.id.btDesconcentrarAumentar);
			btEspelhoMagicoAumentar = (Button) findViewById(R.id.btEspelhoMagicoAumentar);
			btDiluvioAumentar = (Button) findViewById(R.id.btDiluvioAumentar);
			btVulcaoAumentar = (Button) findViewById(R.id.btVulcaoAumentar);
			btFuracaoAumentar = (Button) findViewById(R.id.btFuracaoAumentar);
			btDragonologiaAumentar = (Button) findViewById(R.id.btDragonologiaAumentar);
			btEstudoDeLivrosAumentar = (Button) findViewById(R.id.btEstudoDeLivrosAumentar);
			btConjuracaoLivreAumentar = (Button) findViewById(R.id.btConjuracaoLivreAumentar);
			btDesejoArcanoAumentar = (Button) findViewById(R.id.btDesejoArcanoAumentar);
			btColunaDePedraAumentar = (Button) findViewById(R.id.btColunaDePedraAumentar);
			btFuriaDaTerraAumentar = (Button) findViewById(R.id.btFuriaDaTerraAumentar);
			btSentidoSobrenaturalAumentar = (Button) findViewById(R.id.btSentidoSobrenaturalAumentar);
			btEncantarComChamaAumentar = (Button) findViewById(R.id.btEncantarComChamaAumentar);
			btEncantarComGeadaAumentar = (Button) findViewById(R.id.btEncantarComGeadaAumentar);
			btEncantarComTerremotoAumentar = (Button) findViewById(R.id.btEncantarComTerremotoAumentar);
			btEncantarComVentaniaAumentar = (Button) findViewById(R.id.btEncantarComVentaniaAumentar);
			btProtegerTerrenoAumentar = (Button) findViewById(R.id.btProtegerTerrenoAumentar);
			btBrumaOfuscanteAumentar = (Button) findViewById(R.id.btBrumaOfuscanteAumentar);
			btLancasDuplasAumentar = (Button) findViewById(R.id.btLancasDuplasAumentar);
			btPrisaoDeTeiaAumentar = (Button) findViewById(R.id.btPrisaoDeTeiaAumentar);
			btPrescienciaAumentar = (Button) findViewById(R.id.btPrescienciaAumentar);
			btIndulgirAumentar = (Button) findViewById(R.id.btIndulgirAumentar);
			btEnlouquecedorAumentar = (Button) findViewById(R.id.btEnlouquecedorAumentar);
			btExalarAlmaAumentar = (Button) findViewById(R.id.btExalarAlmaAumentar);
			btSifaoDeAlmasAumentar = (Button) findViewById(R.id.btSifaoDeAlmasAumentar);
			btEncantoDeOrionAumentar = (Button) findViewById(R.id.btEncantoDeOrionAumentar);
			btPunhoArcanoAumentar = (Button) findViewById(R.id.btPunhoArcanoAumentar);
			btOndaPsiquicaAumentar = (Button) findViewById(R.id.btOndaPsiquicaAumentar);
			btPoDeDiamanteAumentar = (Button) findViewById(R.id.btPoDeDiamanteAumentar);
			btLancasDosAesirAumentar = (Button) findViewById(R.id.btLancasDosAesirAumentar);
			btCastigoDeNerthusAumentar = (Button) findViewById(R.id.btCastigoDeNerthusAumentar);
			btMaldicaoDeJormungandAumentar = (Button) findViewById(R.id.btMaldicaoDeJormungandAumentar);
			btImplosaoToxicaAumentar = (Button) findViewById(R.id.btImplosaoToxicaAumentar);
			btPassosDeSalamandraAumentar = (Button) findViewById(R.id.btPassosDeSalamandraAumentar);
			btPassosDeSilfideAumentar = (Button) findViewById(R.id.btPassosDeSilfideAumentar);
			btAquecerTerrenoAumentar = (Button) findViewById(R.id.btAquecerTerrenoAumentar);
			btTornadoAumentar = (Button) findViewById(R.id.btTornadoAumentar);
			btOndaHipnoticaAumentar = (Button) findViewById(R.id.btOndaHipnoticaAumentar);
			btInvocarAgniAumentar = (Button) findViewById(R.id.btInvocarAgniAumentar);
			btInvocarVarunaAumentar = (Button) findViewById(R.id.btInvocarVarunaAumentar);
			btInvocarVayuAumentar = (Button) findViewById(R.id.btInvocarVayuAumentar);
			btInvocarChandraAumentar = (Button) findViewById(R.id.btInvocarChandraAumentar);
			btInsigniaDoFogoAumentar = (Button) findViewById(R.id.btInsigniaDoFogoAumentar);
			btInsigniaDaAguaAumentar = (Button) findViewById(R.id.btInsigniaDaAguaAumentar);
			btInsigniaDoVentoAumentar = (Button) findViewById(R.id.btInsigniaDoVentoAumentar);
			btInsigniaDaTerraAumentar = (Button) findViewById(R.id.btInsigniaDaTerraAumentar);
			btEmpatiaElementalAumentar = (Button) findViewById(R.id.btEmpatiaElementalAumentar);
			btIncitarElementalAumentar = (Button) findViewById(R.id.btIncitarElementalAumentar);
			btDominioElementalAumentar = (Button) findViewById(R.id.btDominioElementalAumentar);
			btAnaliseElementalAumentar = (Button) findViewById(R.id.btAnaliseElementalAumentar);
			btTrocaEspiritualAumentar = (Button) findViewById(R.id.btTrocaEspiritualAumentar);

			//Resto dos botões
			btResetar = (Button) findViewById(R.id.btResetar);
			btSalvar = (Button) findViewById(R.id.btSalvar);
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
			txtAbracadabraPontos = (TextView) findViewById(R.id.txtAbracadabraPontos);
			txtCancelarMagiaPontos = (TextView) findViewById(R.id.txtCancelarMagiaPontos);
			txtDesencantarPontos = (TextView) findViewById(R.id.txtDesencantarPontos);
			txtDesconcentrarPontos = (TextView) findViewById(R.id.txtDesconcentrarPontos);
			txtEspelhoMagicoPontos = (TextView) findViewById(R.id.txtEspelhoMagicoPontos);
			txtDiluvioPontos = (TextView) findViewById(R.id.txtDiluvioPontos);
			txtVulcaoPontos = (TextView) findViewById(R.id.txtVulcaoPontos);
			txtFuracaoPontos = (TextView) findViewById(R.id.txtFuracaoPontos);
			txtDragonologiaPontos = (TextView) findViewById(R.id.txtDragonologiaPontos);
			txtEstudoDeLivrosPontos = (TextView) findViewById(R.id.txtEstudoDeLivrosPontos);
			txtConjuracaoLivrePontos = (TextView) findViewById(R.id.txtConjuracaoLivrePontos);
			txtDesejoArcanoPontos = (TextView) findViewById(R.id.txtDesejoArcanoPontos);
			txtColunaDePedraPontos = (TextView) findViewById(R.id.txtColunaDePedraPontos);
			txtFuriaDaTerraPontos = (TextView) findViewById(R.id.txtFuriaDaTerraPontos);
			txtSentidoSobrenaturalPontos = (TextView) findViewById(R.id.txtSentidoSobrenaturalPontos);
			txtEncantarComChamaPontos = (TextView) findViewById(R.id.txtEncantarComChamaPontos);
			txtEncantarComGeadaPontos = (TextView) findViewById(R.id.txtEncantarComGeadaPontos);
			txtEncantarComTerremotoPontos = (TextView) findViewById(R.id.txtEncantarComTerremotoPontos);
			txtEncantarComVentaniaPontos = (TextView) findViewById(R.id.txtEncantarComVentaniaPontos);
			txtProtegerTerrenoPontos = (TextView) findViewById(R.id.txtProtegerTerrenoPontos);
			txtBrumaOfuscantePontos = (TextView) findViewById(R.id.txtBrumaOfuscantePontos);
			txtLancasDuplasPontos = (TextView) findViewById(R.id.txtLancasDuplasPontos);
			txtPrisaoDeTeiaPontos = (TextView) findViewById(R.id.txtPrisaoDeTeiaPontos);
			txtPrescienciaPontos = (TextView) findViewById(R.id.txtPrescienciaPontos);
			txtIndulgirPontos = (TextView) findViewById(R.id.txtIndulgirPontos);
			txtEnlouquecedorPontos = (TextView) findViewById(R.id.txtEnlouquecedorPontos);
			txtExalarAlmaPontos = (TextView) findViewById(R.id.txtExalarAlmaPontos);
			txtSifaoDeAlmasPontos = (TextView) findViewById(R.id.txtSifaoDeAlmasPontos);
			txtEncantoDeOrionPontos = (TextView) findViewById(R.id.txtEncantoDeOrionPontos);
			txtPunhoArcanoPontos = (TextView) findViewById(R.id.txtPunhoArcanoPontos);
			txtOndaPsiquicaPontos = (TextView) findViewById(R.id.txtOndaPsiquicaPontos);
			txtPoDeDiamantePontos = (TextView) findViewById(R.id.txtPoDeDiamantePontos);
			txtLancasDosAesirPontos = (TextView) findViewById(R.id.txtLancasDosAesirPontos);
			txtCastigoDeNerthusPontos = (TextView) findViewById(R.id.txtCastigoDeNerthusPontos);
			txtMaldicaoDeJormungandPontos = (TextView) findViewById(R.id.txtMaldicaoDeJormungandPontos);
			txtImplosaoToxicaPontos = (TextView) findViewById(R.id.txtImplosaoToxicaPontos);
			txtPassosDeSalamandraPontos = (TextView) findViewById(R.id.txtPassosDeSalamandraPontos);
			txtPassosDeSilfidePontos = (TextView) findViewById(R.id.txtPassosDeSilfidePontos);
			txtAquecerTerrenoPontos = (TextView) findViewById(R.id.txtAquecerTerrenoPontos);
			txtTornadoPontos = (TextView) findViewById(R.id.txtTornadoPontos);
			txtOndaHipnoticaPontos = (TextView) findViewById(R.id.txtOndaHipnoticaPontos);
			txtInvocarAgniPontos = (TextView) findViewById(R.id.txtInvocarAgniPontos);
			txtInvocarVarunaPontos = (TextView) findViewById(R.id.txtInvocarVarunaPontos);
			txtInvocarVayuPontos = (TextView) findViewById(R.id.txtInvocarVayuPontos);
			txtInvocarChandraPontos = (TextView) findViewById(R.id.txtInvocarChandraPontos);
			txtInsigniaDoFogoPontos = (TextView) findViewById(R.id.txtInsigniaDoFogoPontos);
			txtInsigniaDaAguaPontos = (TextView) findViewById(R.id.txtInsigniaDaAguaPontos);
			txtInsigniaDoVentoPontos = (TextView) findViewById(R.id.txtInsigniaDoVentoPontos);
			txtInsigniaDaTerraPontos = (TextView) findViewById(R.id.txtInsigniaDaTerraPontos);
			txtEmpatiaElementalPontos = (TextView) findViewById(R.id.txtEmpatiaElementalPontos);
			txtIncitarElementalPontos = (TextView) findViewById(R.id.txtIncitarElementalPontos);
			txtDominioElementalPontos = (TextView) findViewById(R.id.txtDominioElementalPontos);
			txtAnaliseElementalPontos = (TextView) findViewById(R.id.txtAnaliseElementalPontos);
			txtTrocaEspiritualPontos = (TextView) findViewById(R.id.txtTrocaEspiritualPontos);

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
			layAbracadabra = (LinearLayout) findViewById(R.id.layAbracadabra);
			layCancelarMagia = (LinearLayout) findViewById(R.id.layCancelarMagia);
			layDesencantar = (LinearLayout) findViewById(R.id.layDesencantar);
			layDesconcentrar = (LinearLayout) findViewById(R.id.layDesconcentrar);
			layEspelhoMagico = (LinearLayout) findViewById(R.id.layEspelhoMagico);
			layDiluvio = (LinearLayout) findViewById(R.id.layDiluvio);
			layVulcao = (LinearLayout) findViewById(R.id.layVulcao);
			layFuracao = (LinearLayout) findViewById(R.id.layFuracao);
			layDragonologia = (LinearLayout) findViewById(R.id.layDragonologia);
			layEstudoDeLivros = (LinearLayout) findViewById(R.id.layEstudoDeLivros);
			layConjuracaoLivre = (LinearLayout) findViewById(R.id.layConjuracaoLivre);
			layDesejoArcano = (LinearLayout) findViewById(R.id.layDesejoArcano);
			layColunaDePedra = (LinearLayout) findViewById(R.id.layColunaDePedra);
			layFuriaDaTerra = (LinearLayout) findViewById(R.id.layFuriaDaTerra);
			laySentidoSobrenatural = (LinearLayout) findViewById(R.id.laySentidoSobrenatural);
			layEncantarComChama = (LinearLayout) findViewById(R.id.layEncantarComChama);
			layEncantarComGeada = (LinearLayout) findViewById(R.id.layEncantarComGeada);
			layEncantarComTerremoto = (LinearLayout) findViewById(R.id.layEncantarComTerremoto);
			layEncantarComVentania = (LinearLayout) findViewById(R.id.layEncantarComVentania);
			layProtegerTerreno = (LinearLayout) findViewById(R.id.layProtegerTerreno);
			layBrumaOfuscante = (LinearLayout) findViewById(R.id.layBrumaOfuscante);
			layLancasDuplas = (LinearLayout) findViewById(R.id.layLancasDuplas);
			layPrisaoDeTeia = (LinearLayout) findViewById(R.id.layPrisaoDeTeia);
			layPresciencia = (LinearLayout) findViewById(R.id.layPresciencia);
			layIndulgir = (LinearLayout) findViewById(R.id.layIndulgir);
			layEnlouquecedor = (LinearLayout) findViewById(R.id.layEnlouquecedor);
			layExalarAlma = (LinearLayout) findViewById(R.id.layExalarAlma);
			laySifaoDeAlmas = (LinearLayout) findViewById(R.id.laySifaoDeAlmas);
			layEncantoDeOrion = (LinearLayout) findViewById(R.id.layEncantoDeOrion);
			layPunhoArcano = (LinearLayout) findViewById(R.id.layPunhoArcano);
			layOndaPsiquica = (LinearLayout) findViewById(R.id.layOndaPsiquica);
			layPoDeDiamante = (LinearLayout) findViewById(R.id.layPoDeDiamante);
			layLancasDosAesir = (LinearLayout) findViewById(R.id.layLancasDosAesir);
			layCastigoDeNerthus = (LinearLayout) findViewById(R.id.layCastigoDeNerthus);
			layMaldicaoDeJormungand = (LinearLayout) findViewById(R.id.layMaldicaoDeJormungand);
			layImplosaoToxica = (LinearLayout) findViewById(R.id.layImplosaoToxica);
			layPassosDeSalamandra = (LinearLayout) findViewById(R.id.layPassosDeSalamandra);
			layPassosDeSilfide = (LinearLayout) findViewById(R.id.layPassosDeSilfide);
			layAquecerTerreno = (LinearLayout) findViewById(R.id.layAquecerTerreno);
			layTornado = (LinearLayout) findViewById(R.id.layTornado);
			layOndaHipnotica = (LinearLayout) findViewById(R.id.layOndaHipnotica);
			layInvocarAgni = (LinearLayout) findViewById(R.id.layInvocarAgni);
			layInvocarVaruna = (LinearLayout) findViewById(R.id.layInvocarVaruna);
			layInvocarVayu = (LinearLayout) findViewById(R.id.layInvocarVayu);
			layInvocarChandra = (LinearLayout) findViewById(R.id.layInvocarChandra);
			layInsigniaDoFogo = (LinearLayout) findViewById(R.id.layInsigniaDoFogo);
			layInsigniaDaAgua = (LinearLayout) findViewById(R.id.layInsigniaDaAgua);
			layInsigniaDoVento = (LinearLayout) findViewById(R.id.layInsigniaDoVento);
			layInsigniaDaTerra = (LinearLayout) findViewById(R.id.layInsigniaDaTerra);
			layEmpatiaElemental = (LinearLayout) findViewById(R.id.layEmpatiaElemental);
			layIncitarElemental = (LinearLayout) findViewById(R.id.layIncitarElemental);
			layDominioElemental = (LinearLayout) findViewById(R.id.layDominioElemental);
			layAnaliseElemental = (LinearLayout) findViewById(R.id.layAnaliseElemental);
			layTrocaEspiritual = (LinearLayout) findViewById(R.id.layTrocaEspiritual);

			if (id>0)
				recarregarBuild(id);


			//Eventos de informação
			btLancasDeGeloInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Lanças De Gelo");
					dialogo.setMessage(R.string.lancasDeGeloInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBolasDeFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Bolas De Fogo");
					dialogo.setMessage(R.string.bolasDeFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLancasDeFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Lanças De Fogo");
					dialogo.setMessage(R.string.lancasDeFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBarreiraDeFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Barreira De Fogo");
					dialogo.setMessage(R.string.barreiraDeFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRajadaCongelanteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Rajada Congelante");
					dialogo.setMessage(R.string.rajadaCongelanteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAumentarRecuperacaoDeSPInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Aumentar Recuperação De SP");
					dialogo.setMessage(R.string.aumentarRecuperacaoDeSPInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRelampagoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Relâmpago");
					dialogo.setMessage(R.string.relampagoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueEspiritualInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Ataque Espiritual");
					dialogo.setMessage(R.string.ataqueEspiritualInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEscudoMagicoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Escudo Mágico");
					dialogo.setMessage(R.string.escudoMagicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChamaReveladoraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Chama Reveladora");
					dialogo.setMessage(R.string.chamaReveladoraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritosAncioesInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Espíritos Anciões");
					dialogo.setMessage(R.string.espiritosAncioesInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPetrificarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Petrificar");
					dialogo.setMessage(R.string.petrificarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTempestadeDeRaiosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Tempestade De Raios");
					dialogo.setMessage(R.string.tempestadeDeRaiosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btProtecaoArcanaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Proteção Arcana");
					dialogo.setMessage(R.string.protecaoArcanaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAbracadabraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Abracadabra");
					dialogo.setMessage(R.string.abracadabraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCancelarMagiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Cancelar Magia");
					dialogo.setMessage(R.string.cancelarMagiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDesencantarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Desencantar");
					dialogo.setMessage(R.string.desencantarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDesconcentrarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Desconcentrar");
					dialogo.setMessage(R.string.desconcentrarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspelhoMagicoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Espelho Mágico");
					dialogo.setMessage(R.string.espelhoMagicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDiluvioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Dilúvio");
					dialogo.setMessage(R.string.diluvioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btVulcaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Vulcão");
					dialogo.setMessage(R.string.vulcaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFuracaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Furacão");
					dialogo.setMessage(R.string.furacaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDragonologiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Dragonologia");
					dialogo.setMessage(R.string.dragonologiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEstudoDeLivrosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Estudo De Livros");
					dialogo.setMessage(R.string.estudoDeLivrosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btConjuracaoLivreInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Conjuração Livre");
					dialogo.setMessage(R.string.conjuracaoLivreInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDesejoArcanoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Desejo Arcano");
					dialogo.setMessage(R.string.desejoArcanoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btColunaDePedraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Coluna De Pedra");
					dialogo.setMessage(R.string.colunaDePedraSabioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFuriaDaTerraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Fúria Da Terra");
					dialogo.setMessage(R.string.furiaDaTerraSabioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSentidoSobrenaturalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Sentido Sobrenatural");
					dialogo.setMessage(R.string.sentidoSobrenaturalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEncantarComChamaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Encantar Com Chama");
					dialogo.setMessage(R.string.encantarComChamaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEncantarComGeadaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Encantar Com Geada");
					dialogo.setMessage(R.string.encantarComGeadaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEncantarComTerremotoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Encantar Com Terremoto");
					dialogo.setMessage(R.string.encantarComTerremotoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEncantarComVentaniaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Encantar Com Ventania");
					dialogo.setMessage(R.string.encantarComVentaniaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btProtegerTerrenoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Proteger Terreno");
					dialogo.setMessage(R.string.protegerTerrenoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCriarConversorElementalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Criar Conversor Elemental");
					dialogo.setMessage(R.string.criarConversorElementalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMudancaElementalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Mudança Elemental");
					dialogo.setMessage(R.string.mudancaElementalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBrumaOfuscanteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Bruma Ofuscante");
					dialogo.setMessage(R.string.brumaOfuscanteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLancasDuplasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Lanças Duplas");
					dialogo.setMessage(R.string.lancasDuplasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPrisaoDeTeiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Prisão De Teia");
					dialogo.setMessage(R.string.prisaoDeTeiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPrescienciaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Presciência");
					dialogo.setMessage(R.string.prescienciaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btIndulgirInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Indulgir");
					dialogo.setMessage(R.string.indulgirInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEnlouquecedorInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Enlouquecedor");
					dialogo.setMessage(R.string.enlouquecedorInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btExalarAlmaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Exalar Alma");
					dialogo.setMessage(R.string.exalarAlmaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSifaoDeAlmasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Sifão De Almas");
					dialogo.setMessage(R.string.sifaoDeAlmasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEncantoDeOrionInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Encanto De Órion");
					dialogo.setMessage(R.string.encantoDeOrionInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPunhoArcanoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Punho Arcano");
					dialogo.setMessage(R.string.punhoArcanoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOndaPsiquicaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Onda Psíquica");
					dialogo.setMessage(R.string.ondaPsiquicaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPoDeDiamanteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Pó De Diamante");
					dialogo.setMessage(R.string.poDeDiamanteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLancasDosAesirInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Lanças Dos Aesir");
					dialogo.setMessage(R.string.lancasDosAesirInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCastigoDeNerthusInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Castigo De Nerthus");
					dialogo.setMessage(R.string.castigoDeNerthusInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMaldicaoDeJormungandInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Maldição De Jormungand");
					dialogo.setMessage(R.string.maldicaoDeJormungandInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btImplosaoToxicaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Implosão Tóxica");
					dialogo.setMessage(R.string.implosaoToxicaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPassosDeSalamandraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Passos De Salamandra");
					dialogo.setMessage(R.string.passosDeSalamandraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPassosDeSilfideInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Passos De Sílfide");
					dialogo.setMessage(R.string.passosDeSilfideInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAquecerTerrenoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Aquecer Terreno");
					dialogo.setMessage(R.string.aquecerTerrenoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTornadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Tornado");
					dialogo.setMessage(R.string.tornadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOndaHipnoticaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Onda Hipnótica");
					dialogo.setMessage(R.string.ondaHipnoticaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInvocarAgniInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Invocar Agni");
					dialogo.setMessage(R.string.invocarAgniInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInvocarVarunaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Invocar Varuna");
					dialogo.setMessage(R.string.invocarVarunaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInvocarVayuInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Invocar Vayu");
					dialogo.setMessage(R.string.invocarVayuInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInvocarChandraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Invocar Chandra");
					dialogo.setMessage(R.string.invocarChandraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInsigniaDoFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Insígnia Do Fogo");
					dialogo.setMessage(R.string.insigniaDoFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInsigniaDaAguaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Insígnia Da Água");
					dialogo.setMessage(R.string.insigniaDaAguaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInsigniaDoVentoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Insígnia Do Vento");
					dialogo.setMessage(R.string.insigniaDoVentoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInsigniaDaTerraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Insígnia Da Terra");
					dialogo.setMessage(R.string.insigniaDaTerraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEmpatiaElementalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Empatia Elemental");
					dialogo.setMessage(R.string.empatiaElementalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btIncitarElementalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Incitar Elemental");
					dialogo.setMessage(R.string.incitarElementalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDominioElementalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Domínio Elemental");
					dialogo.setMessage(R.string.dominioElementalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAnaliseElementalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Análise Elemental");
					dialogo.setMessage(R.string.analiseElementalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTrocaEspiritualInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorFeiticeiro.this);
					dialogo.setTitle("Troca Espiritual");
					dialogo.setMessage(R.string.trocaEspiritualInfo);
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
			btAbracadabraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<4 && count<4){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspelhoMagico<1 && count<1){
						atualizarCalculo(varEspelhoMagico, "EspelhoMagico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesconcentrar<3 && count<3){
						atualizarCalculo(varDesconcentrar, "Desconcentrar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesencantar<1 && count<1){
						atualizarCalculo(varDesencantar, "Desencantar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<2 && count<2){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCancelarMagia<1 && count<1){
						atualizarCalculo(varCancelarMagia, "CancelarMagia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varConjuracaoLivre<4 && count<4){
						atualizarCalculo(varConjuracaoLivre, "ConjuracaoLivre", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesejoArcano<5 && count<5){
						atualizarCalculo(varDesejoArcano, "DesejoArcano", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<2 && count<2){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDiluvio<3 && count<3){
						atualizarCalculo(varDiluvio, "Diluvio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<2 && count<2){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuracao<3 && count<3){
						atualizarCalculo(varFuracao, "Furacao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<2 && count<2){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varVulcao<3 && count<3){
						atualizarCalculo(varVulcao, "Vulcao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varProtegerTerreno<1 && count<1){
						atualizarCalculo(varProtegerTerreno, "ProtegerTerreno", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAbracadabra, "Abracadabra", 10, 2, "Aumentar");

				}
			});
			btCancelarMagiaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<2 && count<2){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCancelarMagia, "CancelarMagia", 5, 2, "Aumentar");

				}
			});
			btDesencantarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<4 && count<4){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspelhoMagico<1 && count<1){
						atualizarCalculo(varEspelhoMagico, "EspelhoMagico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesconcentrar<3 && count<3){
						atualizarCalculo(varDesconcentrar, "Desconcentrar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDesencantar, "Desencantar", 5, 2, "Aumentar");

				}
			});
			btDesconcentrarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<4 && count<4){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspelhoMagico<1 && count<1){
						atualizarCalculo(varEspelhoMagico, "EspelhoMagico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDesconcentrar, "Desconcentrar", 5, 2, "Aumentar");

				}
			});
			btEspelhoMagicoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<4 && count<4){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEspelhoMagico, "EspelhoMagico", 5, 2, "Aumentar");

				}
			});
			btDiluvioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<2 && count<2){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDiluvio, "Diluvio", 5, 2, "Aumentar");

				}
			});
			btVulcaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<2 && count<2){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varVulcao, "Vulcao", 5, 2, "Aumentar");

				}
			});
			btFuracaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<2 && count<2){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFuracao, "Furacao", 5, 2, "Aumentar");

				}
			});
			btDragonologiaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<9 && count<9){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDragonologia, "Dragonologia", 5, 2, "Aumentar");

				}
			});
			btEstudoDeLivrosAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");

				}
			});
			btConjuracaoLivreAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<2 && count<2){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCancelarMagia<1 && count<1){
						atualizarCalculo(varCancelarMagia, "CancelarMagia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varConjuracaoLivre, "ConjuracaoLivre", 10, 2, "Aumentar");

				}
			});
			btDesejoArcanoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<2 && count<2){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCancelarMagia<1 && count<1){
						atualizarCalculo(varCancelarMagia, "CancelarMagia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varConjuracaoLivre<4 && count<4){
						atualizarCalculo(varConjuracaoLivre, "ConjuracaoLivre", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDesejoArcano, "DesejoArcano", 10, 2, "Aumentar");

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
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");

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
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varColunaDePedra<1 && count<1){
						atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFuriaDaTerra, "FuriaDaTerra", 5, 2, "Aumentar");

				}
			});
			btSentidoSobrenaturalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSentidoSobrenatural, "SentidoSobrenatural", 1, 2, "Aumentar");

				}
			});
			btEncantarComChamaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");

				}
			});
			btEncantarComGeadaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");

				}
			});
			btEncantarComTerremotoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");

				}
			});
			btEncantarComVentaniaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");

				}
			});
			btProtegerTerrenoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<2 && count<2){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDiluvio<3 && count<3){
						atualizarCalculo(varDiluvio, "Diluvio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<2 && count<2){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuracao<3 && count<3){
						atualizarCalculo(varFuracao, "Furacao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<2 && count<2){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varVulcao<3 && count<3){
						atualizarCalculo(varVulcao, "Vulcao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varProtegerTerreno, "ProtegerTerreno", 5, 2, "Aumentar");

				}
			});
			btBrumaOfuscanteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<2 && count<2){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDiluvio<1 && count<1){
						atualizarCalculo(varDiluvio, "Diluvio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<2 && count<2){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuracao<1 && count<1){
						atualizarCalculo(varFuracao, "Furacao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBrumaOfuscante, "BrumaOfuscante", 1, 3, "Aumentar");

				}
			});
			btLancasDuplasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<2 && count<2){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCancelarMagia<1 && count<1){
						atualizarCalculo(varCancelarMagia, "CancelarMagia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varConjuracaoLivre<4 && count<4){
						atualizarCalculo(varConjuracaoLivre, "ConjuracaoLivre", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesejoArcano<1 && count<1){
						atualizarCalculo(varDesejoArcano, "DesejoArcano", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varLancasDuplas, "LancasDuplas", 5, 3, "Aumentar");

				}
			});
			btPrisaoDeTeiaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<9 && count<9){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDragonologia<4 && count<4){
						atualizarCalculo(varDragonologia, "Dragonologia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPrisaoDeTeia, "PrisaoDeTeia", 1, 3, "Aumentar");

				}
			});
			btPrescienciaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<2 && count<2){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCancelarMagia<1 && count<1){
						atualizarCalculo(varCancelarMagia, "CancelarMagia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varConjuracaoLivre<4 && count<4){
						atualizarCalculo(varConjuracaoLivre, "ConjuracaoLivre", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesejoArcano<1 && count<1){
						atualizarCalculo(varDesejoArcano, "DesejoArcano", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<2 && count<2){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCancelarMagia<1 && count<1){
						atualizarCalculo(varCancelarMagia, "CancelarMagia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varConjuracaoLivre<5 && count<5){
						atualizarCalculo(varConjuracaoLivre, "ConjuracaoLivre", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPresciencia, "Presciencia", 1, 3, "Aumentar");

				}
			});
			btIndulgirAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAumentarRecuperacaoDeSP<1 && count<1){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<4 && count<4){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspelhoMagico<1 && count<1){
						atualizarCalculo(varEspelhoMagico, "EspelhoMagico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varIndulgir, "Indulgir", 5, 3, "Aumentar");

				}
			});
			btEnlouquecedorAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAumentarRecuperacaoDeSP<3 && count<3){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<4 && count<4){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspelhoMagico<3 && count<3){
						atualizarCalculo(varEspelhoMagico, "EspelhoMagico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<2 && count<2){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCancelarMagia<5 && count<5){
						atualizarCalculo(varCancelarMagia, "CancelarMagia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<4 && count<4){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspelhoMagico<1 && count<1){
						atualizarCalculo(varEspelhoMagico, "EspelhoMagico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesconcentrar<3 && count<3){
						atualizarCalculo(varDesconcentrar, "Desconcentrar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesencantar<3 && count<3){
						atualizarCalculo(varDesencantar, "Desencantar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varSifaoDeAlmas<2 && count<2){
						atualizarCalculo(varSifaoDeAlmas, "SifaoDeAlmas", 5, 3, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEnlouquecedor, "Enlouquecedor", 5, 3, "Aumentar");

				}
			});
			btExalarAlmaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<4 && count<4){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspelhoMagico<3 && count<3){
						atualizarCalculo(varEspelhoMagico, "EspelhoMagico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<4 && count<4){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspelhoMagico<1 && count<1){
						atualizarCalculo(varEspelhoMagico, "EspelhoMagico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesconcentrar<2 && count<2){
						atualizarCalculo(varDesconcentrar, "Desconcentrar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varExalarAlma, "ExalarAlma", 1, 3, "Aumentar");

				}
			});
			btSifaoDeAlmasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<4 && count<4){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspelhoMagico<3 && count<3){
						atualizarCalculo(varEspelhoMagico, "EspelhoMagico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<2 && count<2){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCancelarMagia<5 && count<5){
						atualizarCalculo(varCancelarMagia, "CancelarMagia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<4 && count<4){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspelhoMagico<1 && count<1){
						atualizarCalculo(varEspelhoMagico, "EspelhoMagico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesconcentrar<3 && count<3){
						atualizarCalculo(varDesconcentrar, "Desconcentrar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesencantar<3 && count<3){
						atualizarCalculo(varDesencantar, "Desencantar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSifaoDeAlmas, "SifaoDeAlmas", 5, 3, "Aumentar");

				}
			});
			btEncantoDeOrionAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<1 && count<1){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<1 && count<1){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<1 && count<1){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEncantoDeOrion, "EncantoDeOrion", 5, 4, "Aumentar");

				}
			});
			btPunhoArcanoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<2 && count<2){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCancelarMagia<1 && count<1){
						atualizarCalculo(varCancelarMagia, "CancelarMagia", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varConjuracaoLivre<4 && count<4){
						atualizarCalculo(varConjuracaoLivre, "ConjuracaoLivre", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesejoArcano<4 && count<4){
						atualizarCalculo(varDesejoArcano, "DesejoArcano", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPunhoArcano, "PunhoArcano", 5, 4, "Aumentar");

				}
			});
			btOndaPsiquicaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEstudoDeLivros<4 && count<4){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspelhoMagico<1 && count<1){
						atualizarCalculo(varEspelhoMagico, "EspelhoMagico", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesconcentrar<3 && count<3){
						atualizarCalculo(varDesconcentrar, "Desconcentrar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesencantar<2 && count<2){
						atualizarCalculo(varDesencantar, "Desencantar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varOndaPsiquica, "OndaPsiquica", 5, 4, "Aumentar");

				}
			});
			btPoDeDiamanteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<2 && count<2){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDiluvio<3 && count<3){
						atualizarCalculo(varDiluvio, "Diluvio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPoDeDiamante, "PoDeDiamante", 5, 4, "Aumentar");

				}
			});
			btLancasDosAesirAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<2 && count<2){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuracao<4 && count<4){
						atualizarCalculo(varFuracao, "Furacao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varLancasDosAesir, "LancasDosAesir", 5, 4, "Aumentar");

				}
			});
			btCastigoDeNerthusAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varColunaDePedra<5 && count<5){
						atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCastigoDeNerthus, "CastigoDeNerthus", 5, 4, "Aumentar");

				}
			});
			btMaldicaoDeJormungandAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varColunaDePedra<1 && count<1){
						atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuriaDaTerra<5 && count<5){
						atualizarCalculo(varFuriaDaTerra, "FuriaDaTerra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMaldicaoDeJormungand, "MaldicaoDeJormungand", 5, 4, "Aumentar");

				}
			});
			btImplosaoToxicaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varColunaDePedra<1 && count<1){
						atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuriaDaTerra<5 && count<5){
						atualizarCalculo(varFuriaDaTerra, "FuriaDaTerra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaldicaoDeJormungand<2 && count<2){
						atualizarCalculo(varMaldicaoDeJormungand, "MaldicaoDeJormungand", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varImplosaoToxica, "ImplosaoToxica", 5, 4, "Aumentar");

				}
			});
			btPassosDeSalamandraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<2 && count<2){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varVulcao<1 && count<1){
						atualizarCalculo(varVulcao, "Vulcao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPassosDeSalamandra, "PassosDeSalamandra", 5, 4, "Aumentar");

				}
			});
			btPassosDeSilfideAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<2 && count<2){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuracao<1 && count<1){
						atualizarCalculo(varFuracao, "Furacao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPassosDeSilfide, "PassosDeSilfide", 5, 4, "Aumentar");

				}
			});
			btAquecerTerrenoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<2 && count<2){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varVulcao<1 && count<1){
						atualizarCalculo(varVulcao, "Vulcao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<2 && count<2){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuracao<1 && count<1){
						atualizarCalculo(varFuracao, "Furacao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAquecerTerreno, "AquecerTerreno", 5, 4, "Aumentar");

				}
			});
			btTornadoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<2 && count<2){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDiluvio<3 && count<3){
						atualizarCalculo(varDiluvio, "Diluvio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<2 && count<2){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuracao<3 && count<3){
						atualizarCalculo(varFuracao, "Furacao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<2 && count<2){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varVulcao<3 && count<3){
						atualizarCalculo(varVulcao, "Vulcao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varProtegerTerreno<2 && count<2){
						atualizarCalculo(varProtegerTerreno, "ProtegerTerreno", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTornado, "Tornado", 5, 4, "Aumentar");

				}
			});
			btOndaHipnoticaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<2 && count<2){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varVulcao<1 && count<1){
						atualizarCalculo(varVulcao, "Vulcao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<2 && count<2){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuracao<1 && count<1){
						atualizarCalculo(varFuracao, "Furacao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAquecerTerreno<2 && count<2){
						atualizarCalculo(varAquecerTerreno, "AquecerTerreno", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varOndaHipnotica, "OndaHipnotica", 5, 4, "Aumentar");

				}
			});
			btInvocarAgniAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<2 && count<2){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varVulcao<1 && count<1){
						atualizarCalculo(varVulcao, "Vulcao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<2 && count<2){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuracao<1 && count<1){
						atualizarCalculo(varFuracao, "Furacao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAquecerTerreno<3 && count<3){
						atualizarCalculo(varAquecerTerreno, "AquecerTerreno", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<1 && count<1){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<1 && count<1){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<1 && count<1){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAnaliseElemental<1 && count<1){
						atualizarCalculo(varAnaliseElemental, "AnaliseElemental", 2, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioElemental<1 && count<1){
						atualizarCalculo(varDominioElemental, "DominioElemental", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInvocarAgni, "InvocarAgni", 3, 4, "Aumentar");

				}
			});
			btInvocarVarunaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<2 && count<2){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDiluvio<3 && count<3){
						atualizarCalculo(varDiluvio, "Diluvio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPoDeDiamante<3 && count<3){
						atualizarCalculo(varPoDeDiamante, "PoDeDiamante", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<1 && count<1){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<1 && count<1){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<1 && count<1){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAnaliseElemental<1 && count<1){
						atualizarCalculo(varAnaliseElemental, "AnaliseElemental", 2, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioElemental<1 && count<1){
						atualizarCalculo(varDominioElemental, "DominioElemental", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInvocarVaruna, "InvocarVaruna", 3, 4, "Aumentar");

				}
			});
			btInvocarVayuAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<2 && count<2){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuracao<4 && count<4){
						atualizarCalculo(varFuracao, "Furacao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDosAesir<3 && count<3){
						atualizarCalculo(varLancasDosAesir, "LancasDosAesir", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<1 && count<1){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<1 && count<1){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<1 && count<1){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAnaliseElemental<1 && count<1){
						atualizarCalculo(varAnaliseElemental, "AnaliseElemental", 2, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioElemental<1 && count<1){
						atualizarCalculo(varDominioElemental, "DominioElemental", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInvocarVayu, "InvocarVayu", 3, 4, "Aumentar");

				}
			});
			btInvocarChandraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varColunaDePedra<5 && count<5){
						atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCastigoDeNerthus<3 && count<3){
						atualizarCalculo(varCastigoDeNerthus, "CastigoDeNerthus", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<1 && count<1){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<1 && count<1){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<1 && count<1){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAnaliseElemental<1 && count<1){
						atualizarCalculo(varAnaliseElemental, "AnaliseElemental", 2, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioElemental<1 && count<1){
						atualizarCalculo(varDominioElemental, "DominioElemental", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInvocarChandra, "InvocarChandra", 3, 4, "Aumentar");

				}
			});
			btInsigniaDoFogoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<2 && count<2){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varVulcao<1 && count<1){
						atualizarCalculo(varVulcao, "Vulcao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<2 && count<2){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuracao<1 && count<1){
						atualizarCalculo(varFuracao, "Furacao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAquecerTerreno<3 && count<3){
						atualizarCalculo(varAquecerTerreno, "AquecerTerreno", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<1 && count<1){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<1 && count<1){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<1 && count<1){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAnaliseElemental<1 && count<1){
						atualizarCalculo(varAnaliseElemental, "AnaliseElemental", 2, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioElemental<1 && count<1){
						atualizarCalculo(varDominioElemental, "DominioElemental", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarAgni<3 && count<3){
						atualizarCalculo(varInvocarAgni, "InvocarAgni", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInsigniaDoFogo, "InsigniaDoFogo", 3, 4, "Aumentar");

				}
			});
			btInsigniaDaAguaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<2 && count<2){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDiluvio<3 && count<3){
						atualizarCalculo(varDiluvio, "Diluvio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPoDeDiamante<3 && count<3){
						atualizarCalculo(varPoDeDiamante, "PoDeDiamante", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<1 && count<1){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<1 && count<1){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<1 && count<1){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAnaliseElemental<1 && count<1){
						atualizarCalculo(varAnaliseElemental, "AnaliseElemental", 2, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioElemental<1 && count<1){
						atualizarCalculo(varDominioElemental, "DominioElemental", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarVaruna<3 && count<3){
						atualizarCalculo(varInvocarVaruna, "InvocarVaruna", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInsigniaDaAgua, "InsigniaDaAgua", 3, 4, "Aumentar");

				}
			});
			btInsigniaDoVentoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<2 && count<2){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFuracao<4 && count<4){
						atualizarCalculo(varFuracao, "Furacao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDosAesir<3 && count<3){
						atualizarCalculo(varLancasDosAesir, "LancasDosAesir", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<1 && count<1){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<1 && count<1){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<1 && count<1){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAnaliseElemental<1 && count<1){
						atualizarCalculo(varAnaliseElemental, "AnaliseElemental", 2, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioElemental<1 && count<1){
						atualizarCalculo(varDominioElemental, "DominioElemental", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarVayu<3 && count<3){
						atualizarCalculo(varInvocarVayu, "InvocarVayu", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInsigniaDoVento, "InsigniaDoVento", 3, 4, "Aumentar");

				}
			});
			btInsigniaDaTerraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varColunaDePedra<5 && count<5){
						atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varCastigoDeNerthus<3 && count<3){
						atualizarCalculo(varCastigoDeNerthus, "CastigoDeNerthus", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<1 && count<1){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<1 && count<1){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<1 && count<1){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAnaliseElemental<1 && count<1){
						atualizarCalculo(varAnaliseElemental, "AnaliseElemental", 2, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioElemental<1 && count<1){
						atualizarCalculo(varDominioElemental, "DominioElemental", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varInvocarChandra<3 && count<3){
						atualizarCalculo(varInvocarChandra, "InvocarChandra", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInsigniaDaTerra, "InsigniaDaTerra", 3, 4, "Aumentar");

				}
			});
			btEmpatiaElementalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<1 && count<1){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<1 && count<1){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<1 && count<1){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAnaliseElemental<1 && count<1){
						atualizarCalculo(varAnaliseElemental, "AnaliseElemental", 2, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioElemental<3 && count<3){
						atualizarCalculo(varDominioElemental, "DominioElemental", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEmpatiaElemental, "EmpatiaElemental", 5, 4, "Aumentar");

				}
			});
			btIncitarElementalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<1 && count<1){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<1 && count<1){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<1 && count<1){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAnaliseElemental<1 && count<1){
						atualizarCalculo(varAnaliseElemental, "AnaliseElemental", 2, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioElemental<3 && count<3){
						atualizarCalculo(varDominioElemental, "DominioElemental", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varIncitarElemental, "IncitarElemental", 2, 4, "Aumentar");

				}
			});
			btDominioElementalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<1 && count<1){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<1 && count<1){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<1 && count<1){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAnaliseElemental<1 && count<1){
						atualizarCalculo(varAnaliseElemental, "AnaliseElemental", 2, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDominioElemental, "DominioElemental", 3, 4, "Aumentar");

				}
			});
			btAnaliseElementalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<1 && count<1){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<1 && count<1){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<1 && count<1){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAnaliseElemental, "AnaliseElemental", 2, 4, "Aumentar");

				}
			});
			btTrocaEspiritualAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLancasDeFogo<1 && count<1){
						atualizarCalculo(varLancasDeFogo, "LancasDeFogo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComChama<1 && count<1){
						atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancasDeGelo<1 && count<1){
						atualizarCalculo(varLancasDeGelo, "LancasDeGelo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComGeada<1 && count<1){
						atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRelampago<1 && count<1){
						atualizarCalculo(varRelampago, "Relampago", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComVentania<1 && count<1){
						atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetrificar<1 && count<1){
						atualizarCalculo(varPetrificar, "Petrificar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstudoDeLivros<5 && count<5){
						atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEncantarComTerremoto<1 && count<1){
						atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAnaliseElemental<1 && count<1){
						atualizarCalculo(varAnaliseElemental, "AnaliseElemental", 2, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDominioElemental<3 && count<3){
						atualizarCalculo(varDominioElemental, "DominioElemental", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varEmpatiaElemental<1 && count<1){
						atualizarCalculo(varEmpatiaElemental, "EmpatiaElemental", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTrocaEspiritual, "TrocaEspiritual", 1, 4, "Aumentar");

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
			btAbracadabraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAbracadabra, "Abracadabra", 10, 2, "Diminuir");

				}
			});
			btCancelarMagiaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCancelarMagia, "CancelarMagia", 5, 2, "Diminuir");

				}
			});
			btDesencantarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDesencantar, "Desencantar", 5, 2, "Diminuir");

				}
			});
			btDesconcentrarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDesconcentrar, "Desconcentrar", 5, 2, "Diminuir");

				}
			});
			btEspelhoMagicoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspelhoMagico, "EspelhoMagico", 5, 2, "Diminuir");

				}
			});
			btDiluvioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDiluvio, "Diluvio", 5, 2, "Diminuir");

				}
			});
			btVulcaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varVulcao, "Vulcao", 5, 2, "Diminuir");

				}
			});
			btFuracaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFuracao, "Furacao", 5, 2, "Diminuir");

				}
			});
			btDragonologiaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDragonologia, "Dragonologia", 5, 2, "Diminuir");

				}
			});
			btEstudoDeLivrosDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEstudoDeLivros, "EstudoDeLivros", 10, 2, "Diminuir");

				}
			});
			btConjuracaoLivreDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varConjuracaoLivre, "ConjuracaoLivre", 10, 2, "Diminuir");

				}
			});
			btDesejoArcanoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDesejoArcano, "DesejoArcano", 10, 2, "Diminuir");

				}
			});
			btColunaDePedraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varColunaDePedra, "ColunaDePedra", 5, 2, "Diminuir");

				}
			});
			btFuriaDaTerraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFuriaDaTerra, "FuriaDaTerra", 5, 2, "Diminuir");

				}
			});
			btSentidoSobrenaturalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSentidoSobrenatural, "SentidoSobrenatural", 1, 2, "Diminuir");

				}
			});
			btEncantarComChamaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEncantarComChama, "EncantarComChama", 5, 2, "Diminuir");

				}
			});
			btEncantarComGeadaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEncantarComGeada, "EncantarComGeada", 5, 2, "Diminuir");

				}
			});
			btEncantarComTerremotoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEncantarComTerremoto, "EncantarComTerremoto", 5, 2, "Diminuir");

				}
			});
			btEncantarComVentaniaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEncantarComVentania, "EncantarComVentania", 5, 2, "Diminuir");

				}
			});
			btProtegerTerrenoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varProtegerTerreno, "ProtegerTerreno", 5, 2, "Diminuir");

				}
			});
			btBrumaOfuscanteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBrumaOfuscante, "BrumaOfuscante", 1, 3, "Diminuir");

				}
			});
			btLancasDuplasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLancasDuplas, "LancasDuplas", 5, 3, "Diminuir");

				}
			});
			btPrisaoDeTeiaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPrisaoDeTeia, "PrisaoDeTeia", 1, 3, "Diminuir");

				}
			});
			btPrescienciaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPresciencia, "Presciencia", 1, 3, "Diminuir");

				}
			});
			btIndulgirDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varIndulgir, "Indulgir", 5, 3, "Diminuir");

				}
			});
			btEnlouquecedorDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEnlouquecedor, "Enlouquecedor", 5, 3, "Diminuir");

				}
			});
			btExalarAlmaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varExalarAlma, "ExalarAlma", 1, 3, "Diminuir");

				}
			});
			btSifaoDeAlmasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSifaoDeAlmas, "SifaoDeAlmas", 5, 3, "Diminuir");

				}
			});
			btEncantoDeOrionDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEncantoDeOrion, "EncantoDeOrion", 5, 4, "Diminuir");

				}
			});
			btPunhoArcanoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPunhoArcano, "PunhoArcano", 5, 4, "Diminuir");

				}
			});
			btOndaPsiquicaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOndaPsiquica, "OndaPsiquica", 5, 4, "Diminuir");

				}
			});
			btPoDeDiamanteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPoDeDiamante, "PoDeDiamante", 5, 4, "Diminuir");

				}
			});
			btLancasDosAesirDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLancasDosAesir, "LancasDosAesir", 5, 4, "Diminuir");

				}
			});
			btCastigoDeNerthusDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCastigoDeNerthus, "CastigoDeNerthus", 5, 4, "Diminuir");

				}
			});
			btMaldicaoDeJormungandDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMaldicaoDeJormungand, "MaldicaoDeJormungand", 5, 4, "Diminuir");

				}
			});
			btImplosaoToxicaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varImplosaoToxica, "ImplosaoToxica", 5, 4, "Diminuir");

				}
			});
			btPassosDeSalamandraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPassosDeSalamandra, "PassosDeSalamandra", 5, 4, "Diminuir");

				}
			});
			btPassosDeSilfideDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPassosDeSilfide, "PassosDeSilfide", 5, 4, "Diminuir");

				}
			});
			btAquecerTerrenoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAquecerTerreno, "AquecerTerreno", 5, 4, "Diminuir");

				}
			});
			btTornadoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTornado, "Tornado", 5, 4, "Diminuir");

				}
			});
			btOndaHipnoticaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOndaHipnotica, "OndaHipnotica", 5, 4, "Diminuir");

				}
			});
			btInvocarAgniDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInvocarAgni, "InvocarAgni", 3, 4, "Diminuir");

				}
			});
			btInvocarVarunaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInvocarVaruna, "InvocarVaruna", 3, 4, "Diminuir");

				}
			});
			btInvocarVayuDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInvocarVayu, "InvocarVayu", 3, 4, "Diminuir");

				}
			});
			btInvocarChandraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInvocarChandra, "InvocarChandra", 3, 4, "Diminuir");

				}
			});
			btInsigniaDoFogoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInsigniaDoFogo, "InsigniaDoFogo", 3, 4, "Diminuir");

				}
			});
			btInsigniaDaAguaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInsigniaDaAgua, "InsigniaDaAgua", 3, 4, "Diminuir");

				}
			});
			btInsigniaDoVentoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInsigniaDoVento, "InsigniaDoVento", 3, 4, "Diminuir");

				}
			});
			btInsigniaDaTerraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInsigniaDaTerra, "InsigniaDaTerra", 3, 4, "Diminuir");

				}
			});
			btEmpatiaElementalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEmpatiaElemental, "EmpatiaElemental", 5, 4, "Diminuir");

				}
			});
			btIncitarElementalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varIncitarElemental, "IncitarElemental", 2, 4, "Diminuir");

				}
			});
			btDominioElementalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDominioElemental, "DominioElemental", 3, 4, "Diminuir");

				}
			});
			btAnaliseElementalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAnaliseElemental, "AnaliseElemental", 2, 4, "Diminuir");

				}
			});
			btTrocaEspiritualDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTrocaEspiritual, "TrocaEspiritual", 1, 4, "Diminuir");

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
					varAbracadabra = 0;
					varCancelarMagia = 0;
					varDesencantar = 0;
					varDesconcentrar = 0;
					varEspelhoMagico = 0;
					varDiluvio = 0;
					varVulcao = 0;
					varFuracao = 0;
					varDragonologia = 0;
					varEstudoDeLivros = 0;
					varConjuracaoLivre = 0;
					varDesejoArcano = 0;
					varColunaDePedra = 0;
					varFuriaDaTerra = 0;
					varSentidoSobrenatural = 0;
					varEncantarComChama = 0;
					varEncantarComGeada = 0;
					varEncantarComTerremoto = 0;
					varEncantarComVentania = 0;
					varProtegerTerreno = 0;
					varBrumaOfuscante = 0;
					varLancasDuplas = 0;
					varPrisaoDeTeia = 0;
					varPresciencia = 0;
					varIndulgir = 0;
					varEnlouquecedor = 0;
					varExalarAlma = 0;
					varSifaoDeAlmas = 0;
					varEncantoDeOrion = 0;
					varPunhoArcano = 0;
					varOndaPsiquica = 0;
					varPoDeDiamante = 0;
					varLancasDosAesir = 0;
					varCastigoDeNerthus = 0;
					varMaldicaoDeJormungand = 0;
					varImplosaoToxica = 0;
					varPassosDeSalamandra = 0;
					varPassosDeSilfide = 0;
					varAquecerTerreno = 0;
					varTornado = 0;
					varOndaHipnotica = 0;
					varInvocarAgni = 0;
					varInvocarVaruna = 0;
					varInvocarVayu = 0;
					varInvocarChandra = 0;
					varInsigniaDoFogo = 0;
					varInsigniaDaAgua = 0;
					varInsigniaDoVento = 0;
					varInsigniaDaTerra = 0;
					varEmpatiaElemental = 0;
					varIncitarElemental = 0;
					varDominioElemental = 0;
					varAnaliseElemental = 0;
					varTrocaEspiritual = 0;

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
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorFeiticeiro.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorFeiticeiro.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorFeiticeiro.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorFeiticeiro.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorFeiticeiro.this);
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

			if(varAbracadabra==0)
				layAbracadabra.setVisibility(View.GONE);
			if(varCancelarMagia==0)
				layCancelarMagia.setVisibility(View.GONE);
			if(varDesencantar==0)
				layDesencantar.setVisibility(View.GONE);
			if(varDesconcentrar==0)
				layDesconcentrar.setVisibility(View.GONE);
			if(varEspelhoMagico==0)
				layEspelhoMagico.setVisibility(View.GONE);
			if(varDiluvio==0)
				layDiluvio.setVisibility(View.GONE);
			if(varVulcao==0)
				layVulcao.setVisibility(View.GONE);
			if(varFuracao==0)
				layFuracao.setVisibility(View.GONE);
			if(varDragonologia==0)
				layDragonologia.setVisibility(View.GONE);
			if(varEstudoDeLivros==0)
				layEstudoDeLivros.setVisibility(View.GONE);
			if(varConjuracaoLivre==0)
				layConjuracaoLivre.setVisibility(View.GONE);
			if(varDesejoArcano==0)
				layDesejoArcano.setVisibility(View.GONE);
			if(varColunaDePedra==0)
				layColunaDePedra.setVisibility(View.GONE);
			if(varFuriaDaTerra==0)
				layFuriaDaTerra.setVisibility(View.GONE);
			if(varSentidoSobrenatural==0)
				laySentidoSobrenatural.setVisibility(View.GONE);
			if(varEncantarComChama==0)
				layEncantarComChama.setVisibility(View.GONE);
			if(varEncantarComGeada==0)
				layEncantarComGeada.setVisibility(View.GONE);
			if(varEncantarComTerremoto==0)
				layEncantarComTerremoto.setVisibility(View.GONE);
			if(varEncantarComVentania==0)
				layEncantarComVentania.setVisibility(View.GONE);
			if(varProtegerTerreno==0)
				layProtegerTerreno.setVisibility(View.GONE);

			if(varBrumaOfuscante==0)
				layBrumaOfuscante.setVisibility(View.GONE);
			if(varLancasDuplas==0)
				layLancasDuplas.setVisibility(View.GONE);
			if(varPrisaoDeTeia==0)
				layPrisaoDeTeia.setVisibility(View.GONE);
			if(varPresciencia==0)
				layPresciencia.setVisibility(View.GONE);
			if(varIndulgir==0)
				layIndulgir.setVisibility(View.GONE);
			if(varEnlouquecedor==0)
				layEnlouquecedor.setVisibility(View.GONE);
			if(varExalarAlma==0)
				layExalarAlma.setVisibility(View.GONE);
			if(varSifaoDeAlmas==0)
				laySifaoDeAlmas.setVisibility(View.GONE);

			if(varEncantoDeOrion==0)
				layEncantoDeOrion.setVisibility(View.GONE);
			if(varPunhoArcano==0)
				layPunhoArcano.setVisibility(View.GONE);
			if(varOndaPsiquica==0)
				layOndaPsiquica.setVisibility(View.GONE);
			if(varPoDeDiamante==0)
				layPoDeDiamante.setVisibility(View.GONE);
			if(varLancasDosAesir==0)
				layLancasDosAesir.setVisibility(View.GONE);
			if(varCastigoDeNerthus==0)
				layCastigoDeNerthus.setVisibility(View.GONE);
			if(varMaldicaoDeJormungand==0)
				layMaldicaoDeJormungand.setVisibility(View.GONE);
			if(varImplosaoToxica==0)
				layImplosaoToxica.setVisibility(View.GONE);
			if(varPassosDeSalamandra==0)
				layPassosDeSalamandra.setVisibility(View.GONE);
			if(varPassosDeSilfide==0)
				layPassosDeSilfide.setVisibility(View.GONE);
			if(varAquecerTerreno==0)
				layAquecerTerreno.setVisibility(View.GONE);
			if(varTornado==0)
				layTornado.setVisibility(View.GONE);
			if(varOndaHipnotica==0)
				layOndaHipnotica.setVisibility(View.GONE);
			if(varInvocarAgni==0)
				layInvocarAgni.setVisibility(View.GONE);
			if(varInvocarVaruna==0)
				layInvocarVaruna.setVisibility(View.GONE);
			if(varInvocarVayu==0)
				layInvocarVayu.setVisibility(View.GONE);
			if(varInvocarChandra==0)
				layInvocarChandra.setVisibility(View.GONE);
			if(varInsigniaDoFogo==0)
				layInsigniaDoFogo.setVisibility(View.GONE);
			if(varInsigniaDaAgua==0)
				layInsigniaDaAgua.setVisibility(View.GONE);
			if(varInsigniaDoVento==0)
				layInsigniaDoVento.setVisibility(View.GONE);
			if(varInsigniaDaTerra==0)
				layInsigniaDaTerra.setVisibility(View.GONE);
			if(varEmpatiaElemental==0)
				layEmpatiaElemental.setVisibility(View.GONE);
			if(varIncitarElemental==0)
				layIncitarElemental.setVisibility(View.GONE);
			if(varDominioElemental==0)
				layDominioElemental.setVisibility(View.GONE);
			if(varAnaliseElemental==0)
				layAnaliseElemental.setVisibility(View.GONE);
			if(varTrocaEspiritual==0)
				layTrocaEspiritual.setVisibility(View.GONE);

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
						} else if (terceiraClasse>0){
							terceiraClasse--;
							skillTrans++;
							habilidade++;
						} else {
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

				if (nomeDaHabilidade=="Desencantar" && varAbracadabra>=1 && varDesencantar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DesejoArcano" && varAbracadabra>=1 && varDesejoArcano<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ProtegerTerreno" && varAbracadabra>=1 && varProtegerTerreno<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EstudoDeLivros" && varCancelarMagia>=1 && varEstudoDeLivros<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Desconcentrar" && varDesencantar>=1 && varDesconcentrar<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspelhoMagico" && varDesconcentrar>=1 && varEspelhoMagico<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EstudoDeLivros" && varEspelhoMagico>=1 && varEstudoDeLivros<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EncantarComGeada" && varDiluvio>=1 && varEncantarComGeada<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EncantarComChama" && varVulcao>=1 && varEncantarComChama<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EncantarComVentania" && varFuracao>=1 && varEncantarComVentania<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EstudoDeLivros" && varDragonologia>=1 && varEstudoDeLivros<=9){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CancelarMagia" && varConjuracaoLivre>=1 && varCancelarMagia<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ConjuracaoLivre" && varDesejoArcano>=1 && varConjuracaoLivre<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EncantarComTerremoto" && varColunaDePedra>=1 && varEncantarComTerremoto<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ColunaDePedra" && varFuriaDaTerra>=1 && varColunaDePedra<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LancasDeFogo" && varEncantarComChama>=1 && varLancasDeFogo<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EstudoDeLivros" && varEncantarComChama>=1 && varEstudoDeLivros<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LancasDeGelo" && varEncantarComGeada>=1 && varLancasDeGelo<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EstudoDeLivros" && varEncantarComGeada>=1 && varEstudoDeLivros<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Petrificar" && varEncantarComTerremoto>=1 && varPetrificar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EstudoDeLivros" && varEncantarComTerremoto>=1 && varEstudoDeLivros<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Relampago" && varEncantarComVentania>=1 && varRelampago<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EstudoDeLivros" && varEncantarComVentania>=1 && varEstudoDeLivros<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Diluvio" && varProtegerTerreno>=1 && varDiluvio<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Furacao" && varProtegerTerreno>=1 && varFuracao<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Vulcao" && varProtegerTerreno>=1 && varVulcao<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Diluvio" && varBrumaOfuscante>=1 && varDiluvio<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Furacao" && varBrumaOfuscante>=1 && varFuracao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DesejoArcano" && varLancasDuplas>=1 && varDesejoArcano<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Dragonologia" && varPrisaoDeTeia>=1 && varDragonologia<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DesejoArcano" && varPresciencia>=1 && varDesejoArcano<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EstudoDeLivros" && varPresciencia>=1 && varEstudoDeLivros<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ConjuracaoLivre" && varPresciencia>=1 && varConjuracaoLivre<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AumentarRecuperacaoDeSP" && varIndulgir>=1 && varAumentarRecuperacaoDeSP<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspelhoMagico" && varIndulgir>=1 && varEspelhoMagico<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AumentarRecuperacaoDeSP" && varEnlouquecedor>=1 && varAumentarRecuperacaoDeSP<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="SifaoDeAlmas" && varEnlouquecedor>=1 && varSifaoDeAlmas<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspelhoMagico" && varExalarAlma>=1 && varEspelhoMagico<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Desconcentrar" && varExalarAlma>=1 && varDesconcentrar<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspelhoMagico" && varSifaoDeAlmas>=1 && varEspelhoMagico<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CancelarMagia" && varSifaoDeAlmas>=1 && varCancelarMagia<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Desencantar" && varSifaoDeAlmas>=1 && varDesencantar<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EncantarComGeada" && varEncantoDeOrion>=1 && varEncantarComGeada<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EncantarComChama" && varEncantoDeOrion>=1 && varEncantarComChama<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EncantarComVentania" && varEncantoDeOrion>=1 && varEncantarComVentania<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EncantarComTerremoto" && varEncantoDeOrion>=1 && varEncantarComTerremoto<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DesejoArcano" && varPunhoArcano>=1 && varDesejoArcano<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Desencantar" && varOndaPsiquica>=1 && varDesencantar<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Diluvio" && varPoDeDiamante>=1 && varDiluvio<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Furacao" && varLancasDosAesir>=1 && varFuracao<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EncantarComTerremoto" && varLancasDosAesir>=1 && varEncantarComTerremoto<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ColunaDePedra" && varCastigoDeNerthus>=1 && varColunaDePedra<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FuriaDaTerra" && varMaldicaoDeJormungand>=1 && varFuriaDaTerra<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MaldicaoDeJormungand" && varImplosaoToxica>=1 && varMaldicaoDeJormungand<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Vulcao" && varPassosDeSalamandra>=1 && varVulcao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Furacao" && varPassosDeSilfide>=1 && varFuracao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Vulcao" && varAquecerTerreno>=1 && varVulcao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Furacao" && varAquecerTerreno>=1 && varFuracao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ProtegerTerreno" && varTornado>=1 && varProtegerTerreno<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AquecerTerreno" && varOndaHipnotica>=1 && varAquecerTerreno<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AquecerTerreno" && varInvocarAgni>=1 && varAquecerTerreno<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DominioElemental" && varInvocarAgni>=1 && varDominioElemental<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PoDeDiamante" && varInvocarVaruna>=1 && varPoDeDiamante<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DominioElemental" && varInvocarVaruna>=1 && varDominioElemental<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LancasDosAesir" && varInvocarVayu>=1 && varLancasDosAesir<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DominioElemental" && varInvocarVayu>=1 && varDominioElemental<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CastigoDeNerthus" && varInvocarChandra>=1 && varCastigoDeNerthus<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DominioElemental" && varInvocarChandra>=1 && varDominioElemental<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InvocarAgni" && varInsigniaDoFogo>=1 && varInvocarAgni<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InvocarVaruna" && varInsigniaDaAgua>=1 && varInvocarVaruna<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InvocarVayu" && varInsigniaDoVento>=1 && varInvocarVayu<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InvocarChandra" && varInsigniaDaTerra>=1 && varInvocarChandra<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DominioElemental" && varEmpatiaElemental>=1 && varDominioElemental<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DominioElemental" && varIncitarElemental>=1 && varDominioElemental<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AnaliseElemental" && varDominioElemental>=1 && varAnaliseElemental<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EncantarComChama" && varAnaliseElemental>=1 && varEncantarComChama<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EncantarComGeada" && varAnaliseElemental>=1 && varEncantarComGeada<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EncantarComVentania" && varAnaliseElemental>=1 && varEncantarComVentania<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EncantarComTerremoto" && varAnaliseElemental>=1 && varEncantarComTerremoto<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EmpatiaElemental" && varTrocaEspiritual>=1 && varEmpatiaElemental<=01){
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

			else if(nomeDaHabilidade=="Abracadabra"){
				varAbracadabra = habilidade;
			} else if(nomeDaHabilidade=="CancelarMagia"){
				varCancelarMagia = habilidade;
			} else if(nomeDaHabilidade=="Desencantar"){
				varDesencantar = habilidade;
			} else if(nomeDaHabilidade=="Desconcentrar"){
				varDesconcentrar = habilidade;
			} else if(nomeDaHabilidade=="EspelhoMagico"){
				varEspelhoMagico = habilidade;
			} else if(nomeDaHabilidade=="Diluvio"){
				varDiluvio = habilidade;
			} else if(nomeDaHabilidade=="Vulcao"){
				varVulcao = habilidade;
			} else if(nomeDaHabilidade=="Furacao"){
				varFuracao = habilidade;
			} else if(nomeDaHabilidade=="Dragonologia"){
				varDragonologia = habilidade;
			} else if(nomeDaHabilidade=="EstudoDeLivros"){
				varEstudoDeLivros = habilidade;
			} else if(nomeDaHabilidade=="ConjuracaoLivre"){
				varConjuracaoLivre = habilidade;
			} else if(nomeDaHabilidade=="DesejoArcano"){
				varDesejoArcano = habilidade;
			} else if(nomeDaHabilidade=="ColunaDePedra"){
				varColunaDePedra = habilidade;
			} else if(nomeDaHabilidade=="FuriaDaTerra"){
				varFuriaDaTerra = habilidade;
			} else if(nomeDaHabilidade=="SentidoSobrenatural"){
				varSentidoSobrenatural = habilidade;
			} else if(nomeDaHabilidade=="EncantarComChama"){
				varEncantarComChama = habilidade;
			} else if(nomeDaHabilidade=="EncantarComGeada"){
				varEncantarComGeada = habilidade;
			} else if(nomeDaHabilidade=="EncantarComTerremoto"){
				varEncantarComTerremoto = habilidade;
			} else if(nomeDaHabilidade=="EncantarComVentania"){
				varEncantarComVentania = habilidade;
			} else if(nomeDaHabilidade=="ProtegerTerreno"){
				varProtegerTerreno = habilidade;
			}

			else if(nomeDaHabilidade=="BrumaOfuscante"){
				varBrumaOfuscante = habilidade;
			} else if(nomeDaHabilidade=="LancasDuplas"){
				varLancasDuplas = habilidade;
			} else if(nomeDaHabilidade=="PrisaoDeTeia"){
				varPrisaoDeTeia = habilidade;
			} else if(nomeDaHabilidade=="Presciencia"){
				varPresciencia = habilidade;
			} else if(nomeDaHabilidade=="Indulgir"){
				varIndulgir = habilidade;
			} else if(nomeDaHabilidade=="Enlouquecedor"){
				varEnlouquecedor = habilidade;
			} else if(nomeDaHabilidade=="ExalarAlma"){
				varExalarAlma = habilidade;
			} else if(nomeDaHabilidade=="SifaoDeAlmas"){
				varSifaoDeAlmas = habilidade;
			}

			else if(nomeDaHabilidade=="EncantoDeOrion"){
				varEncantoDeOrion = habilidade;
			} else if(nomeDaHabilidade=="PunhoArcano"){
				varPunhoArcano = habilidade;
			} else if(nomeDaHabilidade=="OndaPsiquica"){
				varOndaPsiquica = habilidade;
			} else if(nomeDaHabilidade=="PoDeDiamante"){
				varPoDeDiamante = habilidade;
			} else if(nomeDaHabilidade=="LancasDosAesir"){
				varLancasDosAesir = habilidade;
			} else if(nomeDaHabilidade=="CastigoDeNerthus"){
				varCastigoDeNerthus = habilidade;
			} else if(nomeDaHabilidade=="MaldicaoDeJormungand"){
				varMaldicaoDeJormungand = habilidade;
			} else if(nomeDaHabilidade=="ImplosaoToxica"){
				varImplosaoToxica = habilidade;
			} else if(nomeDaHabilidade=="PassosDeSalamandra"){
				varPassosDeSalamandra = habilidade;
			} else if(nomeDaHabilidade=="PassosDeSilfide"){
				varPassosDeSilfide = habilidade;
			} else if(nomeDaHabilidade=="AquecerTerreno"){
				varAquecerTerreno = habilidade;
			} else if(nomeDaHabilidade=="Tornado"){
				varTornado = habilidade;
			} else if(nomeDaHabilidade=="OndaHipnotica"){
				varOndaHipnotica = habilidade;
			} else if(nomeDaHabilidade=="InvocarAgni"){
				varInvocarAgni = habilidade;
			} else if(nomeDaHabilidade=="InvocarVaruna"){
				varInvocarVaruna = habilidade;
			} else if(nomeDaHabilidade=="InvocarVayu"){
				varInvocarVayu = habilidade;
			} else if(nomeDaHabilidade=="InvocarChandra"){
				varInvocarChandra = habilidade;
			} else if(nomeDaHabilidade=="InsigniaDoFogo"){
				varInsigniaDoFogo = habilidade;
			} else if(nomeDaHabilidade=="InsigniaDaAgua"){
				varInsigniaDaAgua = habilidade;
			} else if(nomeDaHabilidade=="InsigniaDoVento"){
				varInsigniaDoVento = habilidade;
			} else if(nomeDaHabilidade=="InsigniaDaTerra"){
				varInsigniaDaTerra = habilidade;
			} else if(nomeDaHabilidade=="EmpatiaElemental"){
				varEmpatiaElemental = habilidade;
			} else if(nomeDaHabilidade=="IncitarElemental"){
				varIncitarElemental = habilidade;
			} else if(nomeDaHabilidade=="DominioElemental"){
				varDominioElemental = habilidade;
			} else if(nomeDaHabilidade=="AnaliseElemental"){
				varAnaliseElemental = habilidade;
			} else if(nomeDaHabilidade=="TrocaEspiritual"){
				varTrocaEspiritual = habilidade;
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

			txtAbracadabraPontos.setText(varAbracadabra + "/10");
			txtCancelarMagiaPontos.setText(varCancelarMagia + "/5");
			txtDesencantarPontos.setText(varDesencantar + "/5");
			txtDesconcentrarPontos.setText(varDesconcentrar + "/5");
			txtEspelhoMagicoPontos.setText(varEspelhoMagico + "/5");
			txtDiluvioPontos.setText(varDiluvio + "/5");
			txtVulcaoPontos.setText(varVulcao + "/5");
			txtFuracaoPontos.setText(varFuracao + "/5");
			txtDragonologiaPontos.setText(varDragonologia + "/5");
			txtEstudoDeLivrosPontos.setText(varEstudoDeLivros + "/10");
			txtConjuracaoLivrePontos.setText(varConjuracaoLivre + "/10");
			txtDesejoArcanoPontos.setText(varDesejoArcano + "/10");
			txtColunaDePedraPontos.setText(varColunaDePedra + "/5");
			txtFuriaDaTerraPontos.setText(varFuriaDaTerra + "/5");
			txtSentidoSobrenaturalPontos.setText(varSentidoSobrenatural + "/1");
			txtEncantarComChamaPontos.setText(varEncantarComChama + "/5");
			txtEncantarComGeadaPontos.setText(varEncantarComGeada + "/5");
			txtEncantarComTerremotoPontos.setText(varEncantarComTerremoto + "/5");
			txtEncantarComVentaniaPontos.setText(varEncantarComVentania + "/5");
			txtProtegerTerrenoPontos.setText(varProtegerTerreno + "/5");

			txtBrumaOfuscantePontos.setText(varBrumaOfuscante + "/1");
			txtLancasDuplasPontos.setText(varLancasDuplas + "/5");
			txtPrisaoDeTeiaPontos.setText(varPrisaoDeTeia + "/1");
			txtPrescienciaPontos.setText(varPresciencia + "/1");
			txtIndulgirPontos.setText(varIndulgir + "/5");
			txtEnlouquecedorPontos.setText(varEnlouquecedor + "/5");
			txtExalarAlmaPontos.setText(varExalarAlma + "/1");
			txtSifaoDeAlmasPontos.setText(varSifaoDeAlmas + "/5");

			txtEncantoDeOrionPontos.setText(varEncantoDeOrion + "/5");
			txtPunhoArcanoPontos.setText(varPunhoArcano + "/5");
			txtOndaPsiquicaPontos.setText(varOndaPsiquica + "/5");
			txtPoDeDiamantePontos.setText(varPoDeDiamante + "/5");
			txtLancasDosAesirPontos.setText(varLancasDosAesir + "/5");
			txtCastigoDeNerthusPontos.setText(varCastigoDeNerthus + "/5");
			txtMaldicaoDeJormungandPontos.setText(varMaldicaoDeJormungand + "/5");
			txtImplosaoToxicaPontos.setText(varImplosaoToxica + "/5");
			txtPassosDeSalamandraPontos.setText(varPassosDeSalamandra + "/5");
			txtPassosDeSilfidePontos.setText(varPassosDeSilfide + "/5");
			txtAquecerTerrenoPontos.setText(varAquecerTerreno + "/5");
			txtTornadoPontos.setText(varTornado + "/5");
			txtOndaHipnoticaPontos.setText(varOndaHipnotica + "/5");
			txtInvocarAgniPontos.setText(varInvocarAgni + "/3");
			txtInvocarVarunaPontos.setText(varInvocarVaruna + "/3");
			txtInvocarVayuPontos.setText(varInvocarVayu + "/3");
			txtInvocarChandraPontos.setText(varInvocarChandra + "/3");
			txtInsigniaDoFogoPontos.setText(varInsigniaDoFogo + "/3");
			txtInsigniaDaAguaPontos.setText(varInsigniaDaAgua + "/3");
			txtInsigniaDoVentoPontos.setText(varInsigniaDoVento + "/3");
			txtInsigniaDaTerraPontos.setText(varInsigniaDaTerra + "/3");
			txtEmpatiaElementalPontos.setText(varEmpatiaElemental + "/5");
			txtIncitarElementalPontos.setText(varIncitarElemental + "/2");
			txtDominioElementalPontos.setText(varDominioElemental + "/3");
			txtAnaliseElementalPontos.setText(varAnaliseElemental + "/2");
			txtTrocaEspiritualPontos.setText(varTrocaEspiritual + "/1");

			txtClasse1.setText("Classe 1: " + primeiraClasse);
			txtClasse2.setText("Classe 2: " + segundaClasse);
			txtTransClasse.setText("Transclasse: " + transClasse);
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

			layAbracadabra.setVisibility(View.VISIBLE);
			layCancelarMagia.setVisibility(View.VISIBLE);
			layDesencantar.setVisibility(View.VISIBLE);
			layDesconcentrar.setVisibility(View.VISIBLE);
			layEspelhoMagico.setVisibility(View.VISIBLE);
			layDiluvio.setVisibility(View.VISIBLE);
			layVulcao.setVisibility(View.VISIBLE);
			layFuracao.setVisibility(View.VISIBLE);
			layDragonologia.setVisibility(View.VISIBLE);
			layEstudoDeLivros.setVisibility(View.VISIBLE);
			layConjuracaoLivre.setVisibility(View.VISIBLE);
			layDesejoArcano.setVisibility(View.VISIBLE);
			layColunaDePedra.setVisibility(View.VISIBLE);
			layFuriaDaTerra.setVisibility(View.VISIBLE);
			laySentidoSobrenatural.setVisibility(View.VISIBLE);
			layEncantarComChama.setVisibility(View.VISIBLE);
			layEncantarComGeada.setVisibility(View.VISIBLE);
			layEncantarComTerremoto.setVisibility(View.VISIBLE);
			layEncantarComVentania.setVisibility(View.VISIBLE);
			layProtegerTerreno.setVisibility(View.VISIBLE);

			layBrumaOfuscante.setVisibility(View.VISIBLE);
			layLancasDuplas.setVisibility(View.VISIBLE);
			layPrisaoDeTeia.setVisibility(View.VISIBLE);
			layPresciencia.setVisibility(View.VISIBLE);
			layIndulgir.setVisibility(View.VISIBLE);
			layEnlouquecedor.setVisibility(View.VISIBLE);
			layExalarAlma.setVisibility(View.VISIBLE);
			laySifaoDeAlmas.setVisibility(View.VISIBLE);

			layEncantoDeOrion.setVisibility(View.VISIBLE);
			layPunhoArcano.setVisibility(View.VISIBLE);
			layOndaPsiquica.setVisibility(View.VISIBLE);
			layPoDeDiamante.setVisibility(View.VISIBLE);
			layLancasDosAesir.setVisibility(View.VISIBLE);
			layCastigoDeNerthus.setVisibility(View.VISIBLE);
			layMaldicaoDeJormungand.setVisibility(View.VISIBLE);
			layImplosaoToxica.setVisibility(View.VISIBLE);
			layPassosDeSalamandra.setVisibility(View.VISIBLE);
			layPassosDeSilfide.setVisibility(View.VISIBLE);
			layAquecerTerreno.setVisibility(View.VISIBLE);
			layTornado.setVisibility(View.VISIBLE);
			layOndaHipnotica.setVisibility(View.VISIBLE);
			layInvocarAgni.setVisibility(View.VISIBLE);
			layInvocarVaruna.setVisibility(View.VISIBLE);
			layInvocarVayu.setVisibility(View.VISIBLE);
			layInvocarChandra.setVisibility(View.VISIBLE);
			layInsigniaDoFogo.setVisibility(View.VISIBLE);
			layInsigniaDaAgua.setVisibility(View.VISIBLE);
			layInsigniaDoVento.setVisibility(View.VISIBLE);
			layInsigniaDaTerra.setVisibility(View.VISIBLE);
			layEmpatiaElemental.setVisibility(View.VISIBLE);
			layIncitarElemental.setVisibility(View.VISIBLE);
			layDominioElemental.setVisibility(View.VISIBLE);
			layAnaliseElemental.setVisibility(View.VISIBLE);
			layTrocaEspiritual.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM feiticeiro WHERE _id = ?", new String[]{String.valueOf(id)});

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

			varAbracadabra = cs.getInt(19);
			varCancelarMagia = cs.getInt(20);
			varDesencantar = cs.getInt(21);
			varDesconcentrar = cs.getInt(22);
			varEspelhoMagico = cs.getInt(23);
			varDiluvio = cs.getInt(24);
			varVulcao = cs.getInt(25);
			varFuracao = cs.getInt(26);
			varDragonologia = cs.getInt(27);
			varEstudoDeLivros = cs.getInt(28);
			varConjuracaoLivre = cs.getInt(29);
			varDesejoArcano = cs.getInt(30);
			varColunaDePedra = cs.getInt(31);
			varFuriaDaTerra = cs.getInt(32);
			varSentidoSobrenatural = cs.getInt(33);
			varEncantarComChama = cs.getInt(34);
			varEncantarComGeada = cs.getInt(35);
			varEncantarComTerremoto = cs.getInt(36);
			varEncantarComVentania = cs.getInt(37);
			varProtegerTerreno = cs.getInt(38);

			varBrumaOfuscante = cs.getInt(39);
			varLancasDuplas = cs.getInt(40);
			varPrisaoDeTeia = cs.getInt(41);
			varPresciencia = cs.getInt(42);
			varIndulgir = cs.getInt(43);
			varEnlouquecedor = cs.getInt(44);
			varExalarAlma = cs.getInt(45);
			varSifaoDeAlmas = cs.getInt(46);

			varEncantoDeOrion = cs.getInt(47);
			varPunhoArcano = cs.getInt(48);
			varOndaPsiquica = cs.getInt(49);
			varPoDeDiamante = cs.getInt(50);
			varLancasDosAesir = cs.getInt(51);
			varCastigoDeNerthus = cs.getInt(52);
			varMaldicaoDeJormungand = cs.getInt(53);
			varImplosaoToxica = cs.getInt(54);
			varPassosDeSalamandra = cs.getInt(55);
			varPassosDeSilfide = cs.getInt(56);
			varAquecerTerreno = cs.getInt(57);
			varTornado = cs.getInt(58);
			varOndaHipnotica = cs.getInt(59);
			varInvocarAgni = cs.getInt(60);
			varInvocarVaruna = cs.getInt(61);
			varInvocarVayu = cs.getInt(62);
			varInvocarChandra = cs.getInt(63);
			varInsigniaDoFogo = cs.getInt(64);
			varInsigniaDaAgua = cs.getInt(65);
			varInsigniaDoVento = cs.getInt(66);
			varInsigniaDaTerra = cs.getInt(67);
			varEmpatiaElemental = cs.getInt(68);
			varIncitarElemental = cs.getInt(69);
			varDominioElemental = cs.getInt(70);
			varAnaliseElemental = cs.getInt(71);
			varTrocaEspiritual = cs.getInt(72);

			skillPrimeira = cs.getInt(73);
			skillSegunda = cs.getInt(74);
			skillTrans = cs.getInt(75);
			skillTerceira = cs.getInt(76);
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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS feiticeiro (");
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
					sqlClasse.append("skill_abracadabra INT(2), ");
					sqlClasse.append("skill_cancelarmagia INT(2), ");
					sqlClasse.append("skill_desencantar INT(2), ");
					sqlClasse.append("skill_desconcentrar INT(2), ");
					sqlClasse.append("skill_espelhomagico INT(2), ");
					sqlClasse.append("skill_diluvio INT(2), ");
					sqlClasse.append("skill_vulcao INT(2), ");
					sqlClasse.append("skill_furacao INT(2), ");
					sqlClasse.append("skill_dragonologia INT(2), ");
					sqlClasse.append("skill_estudodelivros INT(2), ");
					sqlClasse.append("skill_conjuracaolivre INT(2), ");
					sqlClasse.append("skill_desejoarcano INT(2), ");
					sqlClasse.append("skill_colunadepedra INT(2), ");
					sqlClasse.append("skill_furiadaterra INT(2), ");
					sqlClasse.append("skill_sentidosobrenatural INT(2), ");
					sqlClasse.append("skill_encantarcomchama INT(2), ");
					sqlClasse.append("skill_encantarcomgeada INT(2), ");
					sqlClasse.append("skill_encantarcomterremoto INT(2), ");
					sqlClasse.append("skill_encantarcomventania INT(2), ");
					sqlClasse.append("skill_protegerterreno INT(2), ");
					sqlClasse.append("skill_brumaofuscante INT(2), ");
					sqlClasse.append("skill_lancasduplas INT(2), ");
					sqlClasse.append("skill_prisaodeteia INT(2), ");
					sqlClasse.append("skill_presciencia INT(2), ");
					sqlClasse.append("skill_indulgir INT(2), ");
					sqlClasse.append("skill_enlouquecedor INT(2), ");
					sqlClasse.append("skill_exalaralma INT(2), ");
					sqlClasse.append("skill_sifaodealmas INT(2), ");
					sqlClasse.append("skill_encantodeorion INT(2), ");
					sqlClasse.append("skill_punhoarcano INT(2), ");
					sqlClasse.append("skill_ondapsiquica INT(2), ");
					sqlClasse.append("skill_podediamante INT(2), ");
					sqlClasse.append("skill_lancasdosaesir INT(2), ");
					sqlClasse.append("skill_castigodenerthus INT(2), ");
					sqlClasse.append("skill_maldicaodejormungand INT(2), ");
					sqlClasse.append("skill_implosaotoxica INT(2), ");
					sqlClasse.append("skill_passosdesalamandra INT(2), ");
					sqlClasse.append("skill_passosdesilfide INT(2), ");
					sqlClasse.append("skill_aquecerterreno INT(2), ");
					sqlClasse.append("skill_tornado INT(2), ");
					sqlClasse.append("skill_ondahipnotica INT(2), ");
					sqlClasse.append("skill_invocaragni INT(2), ");
					sqlClasse.append("skill_invocarvaruna INT(2), ");
					sqlClasse.append("skill_invocarvayu INT(2), ");
					sqlClasse.append("skill_invocarchandra INT(2), ");
					sqlClasse.append("skill_insigniadofogo INT(2), ");
					sqlClasse.append("skill_insigniadaagua INT(2), ");
					sqlClasse.append("skill_insigniadovento INT(2), ");
					sqlClasse.append("skill_insigniadaterra INT(2), ");
					sqlClasse.append("skill_empatiaelemental INT(2), ");
					sqlClasse.append("skill_incitarelemental INT(2), ");
					sqlClasse.append("skill_dominioelemental INT(2), ");
					sqlClasse.append("skill_analiseelemental INT(2), ");
					sqlClasse.append("skill_trocaespiritual INT(2), ");
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
					ins.put("skill_abracadabra", varAbracadabra);
					ins.put("skill_cancelarmagia", varCancelarMagia);
					ins.put("skill_desencantar", varDesencantar);
					ins.put("skill_desconcentrar", varDesconcentrar);
					ins.put("skill_espelhomagico", varEspelhoMagico);
					ins.put("skill_diluvio", varDiluvio);
					ins.put("skill_vulcao", varVulcao);
					ins.put("skill_furacao", varFuracao);
					ins.put("skill_dragonologia", varDragonologia);
					ins.put("skill_estudodelivros", varEstudoDeLivros);
					ins.put("skill_conjuracaolivre", varConjuracaoLivre);
					ins.put("skill_desejoarcano", varDesejoArcano);
					ins.put("skill_colunadepedra", varColunaDePedra);
					ins.put("skill_furiadaterra", varFuriaDaTerra);
					ins.put("skill_sentidosobrenatural", varSentidoSobrenatural);
					ins.put("skill_encantarcomchama", varEncantarComChama);
					ins.put("skill_encantarcomgeada", varEncantarComGeada);
					ins.put("skill_encantarcomterremoto", varEncantarComTerremoto);
					ins.put("skill_encantarcomventania", varEncantarComVentania);
					ins.put("skill_protegerterreno", varProtegerTerreno);
					ins.put("skill_brumaofuscante", varBrumaOfuscante);
					ins.put("skill_lancasduplas", varLancasDuplas);
					ins.put("skill_prisaodeteia", varPrisaoDeTeia);
					ins.put("skill_presciencia", varPresciencia);
					ins.put("skill_indulgir", varIndulgir);
					ins.put("skill_enlouquecedor", varEnlouquecedor);
					ins.put("skill_exalaralma", varExalarAlma);
					ins.put("skill_sifaodealmas", varSifaoDeAlmas);
					ins.put("skill_encantodeorion", varEncantoDeOrion);
					ins.put("skill_punhoarcano", varPunhoArcano);
					ins.put("skill_ondapsiquica", varOndaPsiquica);
					ins.put("skill_podediamante", varPoDeDiamante);
					ins.put("skill_lancasdosaesir", varLancasDosAesir);
					ins.put("skill_castigodenerthus", varCastigoDeNerthus);
					ins.put("skill_maldicaodejormungand", varMaldicaoDeJormungand);
					ins.put("skill_implosaotoxica", varImplosaoToxica);
					ins.put("skill_passosdesalamandra", varPassosDeSalamandra);
					ins.put("skill_passosdesilfide", varPassosDeSilfide);
					ins.put("skill_aquecerterreno", varAquecerTerreno);
					ins.put("skill_tornado", varTornado);
					ins.put("skill_ondahipnotica", varOndaHipnotica);
					ins.put("skill_invocaragni", varInvocarAgni);
					ins.put("skill_invocarvaruna", varInvocarVaruna);
					ins.put("skill_invocarvayu", varInvocarVayu);
					ins.put("skill_invocarchandra", varInvocarChandra);
					ins.put("skill_insigniadofogo", varInsigniaDoFogo);
					ins.put("skill_insigniadaagua", varInsigniaDaAgua);
					ins.put("skill_insigniadovento", varInsigniaDoVento);
					ins.put("skill_insigniadaterra", varInsigniaDaTerra);
					ins.put("skill_empatiaelemental", varEmpatiaElemental);
					ins.put("skill_incitarelemental", varIncitarElemental);
					ins.put("skill_dominioelemental", varDominioElemental);
					ins.put("skill_analiseelemental", varAnaliseElemental);
					ins.put("skill_trocaespiritual", varTrocaEspiritual);
					ins.put("skill_primeira", skillPrimeira);
					ins.put("skill_segunda", skillSegunda);
					ins.put("skill_trans", skillTrans);
					ins.put("skill_terceira", skillTerceira);
					if(!novo){
						try {
							db.update("feiticeiro", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("feiticeiro", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from feiticeiro", null);
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
						ins2.put("classe", "feiticeiro");
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
			getMenuInflater().inflate(R.menu.simulador_feiticeiro, menu);
			return true;
		}

	}