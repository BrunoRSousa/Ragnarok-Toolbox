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

public class SimuladorSuperAprendizExpandido extends Activity {

		//Botões de interrogação
		Button btPrecisaoInterrogacao,
		btOlhosDeAguiaInterrogacao,
		btConcentracaoInterrogacao,
		btEnvenenarInterrogacao,
		btDesintoxicarInterrogacao,
		btAtaqueDuploInterrogacao,
		btPericiaEmEsquivaInterrogacao,
		btFurtoInterrogacao,
		btEsconderijoInterrogacao,
		btPericiaComEspadaInterrogacao,
		btAumentarRecuperacaoDeHPInterrogacao,
		btGolpeFulminanteInterrogacao,
		btProvocarInterrogacao,
		btImpactoExplosivoInterrogacao,
		btVigorInterrogacao,
		btMammonitaInterrogacao,
		btDescontoInterrogacao,
		btSuperfaturarInterrogacao,
		btAumentarCapacidadeDeCargaInterrogacao,
		btUsarCarrinhoInterrogacao,
		btComercioInterrogacao,
		btIdentificarItemInterrogacao,
		btLancasDeGeloInterrogacao,
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
		btProtecaoDivinaInterrogacao,
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
		btEnvenenarArmaInterrogacao,
		btTunelDeFugaInterrogacao,
		btArmadilhaEscorregadiaInterrogacao,
		btArmadilhaLuminosaInterrogacao,
		btArmadilhaSoniferaInterrogacao,
		btArmadilhaCongelanteInterrogacao,
		btFeInterrogacao,
		btCruxDivinumInterrogacao,
		btPunhoFirmeInterrogacao,
		btPericiaEmArmamentoInterrogacao,
		btPericiaComMachadoEEspadaInterrogacao,
		btPunhosDeFerroInterrogacao,
		btAbsorverEsferasEspirituaisInterrogacao,
		btInvocarEsferasEspirituaisInterrogacao,
		btGracaDivinaInterrogacao,
		btImpositioManusInterrogacao,
		btSantuarioInterrogacao,
		btGloriaInterrogacao,
		btColunaDePedraInterrogacao,
		btColunaDeFogoInterrogacao,
		btCongelarInterrogacao,
		btFuriaDaTerraInterrogacao,
		btBarreiraDeGeloInterrogacao,
		btEsmagamentoMagicoInterrogacao,
		btPantanoDosMortosInterrogacao,
		btSentidoSobrenaturalInterrogacao,
		btSupernovaInterrogacao,
		btEsferaDaguaInterrogacao;

		//Botões de diminuir habilidades
		Button btPrecisaoDiminuir,
		btOlhosDeAguiaDiminuir,
		btConcentracaoDiminuir,
		btEnvenenarDiminuir,
		btDesintoxicarDiminuir,
		btAtaqueDuploDiminuir,
		btPericiaEmEsquivaDiminuir,
		btFurtoDiminuir,
		btEsconderijoDiminuir,
		btPericiaComEspadaDiminuir,
		btAumentarRecuperacaoDeHPDiminuir,
		btGolpeFulminanteDiminuir,
		btProvocarDiminuir,
		btImpactoExplosivoDiminuir,
		btVigorDiminuir,
		btMammonitaDiminuir,
		btDescontoDiminuir,
		btSuperfaturarDiminuir,
		btAumentarCapacidadeDeCargaDiminuir,
		btUsarCarrinhoDiminuir,
		btComercioDiminuir,
		btIdentificarItemDiminuir,
		btLancasDeGeloDiminuir,
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
		btProtecaoDivinaDiminuir,
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
		btEnvenenarArmaDiminuir,
		btTunelDeFugaDiminuir,
		btArmadilhaEscorregadiaDiminuir,
		btArmadilhaLuminosaDiminuir,
		btArmadilhaSoniferaDiminuir,
		btArmadilhaCongelanteDiminuir,
		btFeDiminuir,
		btCruxDivinumDiminuir,
		btPunhoFirmeDiminuir,
		btPericiaEmArmamentoDiminuir,
		btPericiaComMachadoEEspadaDiminuir,
		btPunhosDeFerroDiminuir,
		btAbsorverEsferasEspirituaisDiminuir,
		btInvocarEsferasEspirituaisDiminuir,
		btGracaDivinaDiminuir,
		btImpositioManusDiminuir,
		btSantuarioDiminuir,
		btGloriaDiminuir,
		btColunaDePedraDiminuir,
		btColunaDeFogoDiminuir,
		btCongelarDiminuir,
		btFuriaDaTerraDiminuir,
		btBarreiraDeGeloDiminuir,
		btEsmagamentoMagicoDiminuir,
		btPantanoDosMortosDiminuir,
		btSentidoSobrenaturalDiminuir,
		btSupernovaDiminuir,
		btEsferaDaguaDiminuir;

		//Botões de aumentar habilidades
		Button btPrecisaoAumentar,
		btOlhosDeAguiaAumentar,
		btConcentracaoAumentar,
		btEnvenenarAumentar,
		btDesintoxicarAumentar,
		btAtaqueDuploAumentar,
		btPericiaEmEsquivaAumentar,
		btFurtoAumentar,
		btEsconderijoAumentar,
		btPericiaComEspadaAumentar,
		btAumentarRecuperacaoDeHPAumentar,
		btGolpeFulminanteAumentar,
		btProvocarAumentar,
		btImpactoExplosivoAumentar,
		btVigorAumentar,
		btMammonitaAumentar,
		btDescontoAumentar,
		btSuperfaturarAumentar,
		btAumentarCapacidadeDeCargaAumentar,
		btUsarCarrinhoAumentar,
		btComercioAumentar,
		btIdentificarItemAumentar,
		btLancasDeGeloAumentar,
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
		btProtecaoDivinaAumentar,
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
		btEnvenenarArmaAumentar,
		btTunelDeFugaAumentar,
		btArmadilhaEscorregadiaAumentar,
		btArmadilhaLuminosaAumentar,
		btArmadilhaSoniferaAumentar,
		btArmadilhaCongelanteAumentar,
		btFeAumentar,
		btCruxDivinumAumentar,
		btPunhoFirmeAumentar,
		btPericiaEmArmamentoAumentar,
		btPericiaComMachadoEEspadaAumentar,
		btPunhosDeFerroAumentar,
		btAbsorverEsferasEspirituaisAumentar,
		btInvocarEsferasEspirituaisAumentar,
		btGracaDivinaAumentar,
		btImpositioManusAumentar,
		btSantuarioAumentar,
		btGloriaAumentar,
		btColunaDePedraAumentar,
		btColunaDeFogoAumentar,
		btCongelarAumentar,
		btFuriaDaTerraAumentar,
		btBarreiraDeGeloAumentar,
		btEsmagamentoMagicoAumentar,
		btPantanoDosMortosAumentar,
		btSentidoSobrenaturalAumentar,
		btSupernovaAumentar,
		btEsferaDaguaAumentar;

		//Resto dos botões
		Button btResetar, btSalvar, btSalvarIMG;
		ToggleButton tgbtSomenteHabilidadeAprendida;


		//Txt pontos da tela
		TextView txtPrecisaoPontos,
		txtOlhosDeAguiaPontos,
		txtConcentracaoPontos,
		txtEnvenenarPontos,
		txtDesintoxicarPontos,
		txtAtaqueDuploPontos,
		txtPericiaEmEsquivaPontos,
		txtFurtoPontos,
		txtEsconderijoPontos,
		txtPericiaComEspadaPontos,
		txtAumentarRecuperacaoDeHPPontos,
		txtGolpeFulminantePontos,
		txtProvocarPontos,
		txtImpactoExplosivoPontos,
		txtVigorPontos,
		txtMammonitaPontos,
		txtDescontoPontos,
		txtSuperfaturarPontos,
		txtAumentarCapacidadeDeCargaPontos,
		txtUsarCarrinhoPontos,
		txtComercioPontos,
		txtIdentificarItemPontos,
		txtLancasDeGeloPontos,
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
		txtProtecaoDivinaPontos,
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
		txtEnvenenarArmaPontos,
		txtTunelDeFugaPontos,
		txtArmadilhaEscorregadiaPontos,
		txtArmadilhaLuminosaPontos,
		txtArmadilhaSoniferaPontos,
		txtArmadilhaCongelantePontos,
		txtFePontos,
		txtCruxDivinumPontos,
		txtPunhoFirmePontos,
		txtPericiaEmArmamentoPontos,
		txtPericiaComMachadoEEspadaPontos,
		txtPunhosDeFerroPontos,
		txtAbsorverEsferasEspirituaisPontos,
		txtInvocarEsferasEspirituaisPontos,
		txtGracaDivinaPontos,
		txtImpositioManusPontos,
		txtSantuarioPontos,
		txtGloriaPontos,
		txtColunaDePedraPontos,
		txtColunaDeFogoPontos,
		txtCongelarPontos,
		txtFuriaDaTerraPontos,
		txtBarreiraDeGeloPontos,
		txtEsmagamentoMagicoPontos,
		txtPantanoDosMortosPontos,
		txtSentidoSobrenaturalPontos,
		txtSupernovaPontos,
		txtEsferaDaguaPontos;

		//Txt pontos restantes
		TextView txtClasse1, txtClasse2;

		//Layouts
		LinearLayout layPrecisao,
		layOlhosDeAguia,
		layConcentracao,
		layEnvenenar,
		layDesintoxicar,
		layAtaqueDuplo,
		layPericiaEmEsquiva,
		layFurto,
		layEsconderijo,
		layPericiaComEspada,
		layAumentarRecuperacaoDeHP,
		layGolpeFulminante,
		layProvocar,
		layImpactoExplosivo,
		layVigor,
		layMammonita,
		layDesconto,
		laySuperfaturar,
		layAumentarCapacidadeDeCarga,
		layUsarCarrinho,
		layComercio,
		layIdentificarItem,
		layLancasDeGelo,
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
		layProtecaoDivina,
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
		layEnvenenarArma,
		layTunelDeFuga,
		layArmadilhaEscorregadia,
		layArmadilhaLuminosa,
		layArmadilhaSonifera,
		layArmadilhaCongelante,
		layFe,
		layCruxDivinum,
		layPunhoFirme,
		layPericiaEmArmamento,
		layPericiaComMachadoEEspada,
		layPunhosDeFerro,
		layAbsorverEsferasEspirituais,
		layInvocarEsferasEspirituais,
		layGracaDivina,
		layImpositioManus,
		laySantuario,
		layGloria,
		layColunaDePedra,
		layColunaDeFogo,
		layCongelar,
		layFuriaDaTerra,
		layBarreiraDeGelo,
		layEsmagamentoMagico,
		layPantanoDosMortos,
		laySentidoSobrenatural,
		laySupernova,
		layEsferaDagua;

		//Variaveis de Skill
		int varPrecisao,
		varOlhosDeAguia,
		varConcentracao,
		varEnvenenar,
		varDesintoxicar,
		varAtaqueDuplo,
		varPericiaEmEsquiva,
		varFurto,
		varEsconderijo,
		varPericiaComEspada,
		varAumentarRecuperacaoDeHP,
		varGolpeFulminante,
		varProvocar,
		varImpactoExplosivo,
		varVigor,
		varMammonita,
		varDesconto,
		varSuperfaturar,
		varAumentarCapacidadeDeCarga,
		varUsarCarrinho,
		varComercio,
		varIdentificarItem,
		varLancasDeGelo,
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
		varProtecaoDivina,
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
		varEnvenenarArma,
		varTunelDeFuga,
		varArmadilhaEscorregadia,
		varArmadilhaLuminosa,
		varArmadilhaSonifera,
		varArmadilhaCongelante,
		varFe,
		varCruxDivinum,
		varPunhoFirme,
		varPericiaEmArmamento,
		varPericiaComMachadoEEspada,
		varPunhosDeFerro,
		varAbsorverEsferasEspirituais,
		varInvocarEsferasEspirituais,
		varGracaDivina,
		varImpositioManus,
		varSantuario,
		varGloria,
		varColunaDePedra,
		varColunaDeFogo,
		varCongelar,
		varFuriaDaTerra,
		varBarreiraDeGelo,
		varEsmagamentoMagico,
		varPantanoDosMortos,
		varSentidoSobrenatural,
		varSupernova,
		varEsferaDagua;

		//variavel para alteração do db
		String idParaAlterar;

		//Variaveis de ponto
		int primeiraClasse;
		int segundaClasse;

		int skillPrimeira;
		int skillSegunda;

		int count;
		
		LinearLayout layPrincipal;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_simulador_super_aprendiz_expandido);

			Intent it = getIntent();

			final int id = it.getIntExtra("id", 0);
			idParaAlterar = "_id =" +id;

			//inicialização de variáveis
			varPrecisao = 0;
			varOlhosDeAguia = 0;
			varConcentracao = 0;
			varEnvenenar = 0;
			varDesintoxicar = 0;
			varAtaqueDuplo = 0;
			varPericiaEmEsquiva = 0;
			varFurto = 0;
			varEsconderijo = 0;
			varPericiaComEspada = 0;
			varAumentarRecuperacaoDeHP = 0;
			varGolpeFulminante = 0;
			varProvocar = 0;
			varImpactoExplosivo = 0;
			varVigor = 0;
			varMammonita = 0;
			varDesconto = 0;
			varSuperfaturar = 0;
			varAumentarCapacidadeDeCarga = 0;
			varUsarCarrinho = 0;
			varComercio = 0;
			varIdentificarItem = 0;
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
			varEnvenenarArma = 0;
			varTunelDeFuga = 0;
			varArmadilhaEscorregadia = 0;
			varArmadilhaLuminosa = 0;
			varArmadilhaSonifera = 0;
			varArmadilhaCongelante = 0;
			varFe = 0;
			varCruxDivinum = 0;
			varPunhoFirme = 0;
			varPericiaEmArmamento = 0;
			varPericiaComMachadoEEspada = 0;
			varPunhosDeFerro = 0;
			varAbsorverEsferasEspirituais = 0;
			varInvocarEsferasEspirituais = 0;
			varGracaDivina = 0;
			varImpositioManus = 0;
			varSantuario = 0;
			varGloria = 0;
			varColunaDePedra = 0;
			varColunaDeFogo = 0;
			varCongelar = 0;
			varFuriaDaTerra = 0;
			varBarreiraDeGelo = 0;
			varEsmagamentoMagico = 0;
			varPantanoDosMortos = 0;
			varSentidoSobrenatural = 0;
			varSupernova = 0;
			varEsferaDagua = 0;



			primeiraClasse = 98;
			segundaClasse = 49;

			skillPrimeira = 0;
			skillSegunda = 0;

			count = 0;


			//Botões de interrogações
			btPrecisaoInterrogacao = (Button) findViewById(R.id.btPrecisaoInterrogacao);
			btOlhosDeAguiaInterrogacao = (Button) findViewById(R.id.btOlhosDeAguiaInterrogacao);
			btConcentracaoInterrogacao = (Button) findViewById(R.id.btConcentracaoInterrogacao);
			btEnvenenarInterrogacao = (Button) findViewById(R.id.btEnvenenarInterrogacao);
			btDesintoxicarInterrogacao = (Button) findViewById(R.id.btDesintoxicarInterrogacao);
			btAtaqueDuploInterrogacao = (Button) findViewById(R.id.btAtaqueDuploInterrogacao);
			btPericiaEmEsquivaInterrogacao = (Button) findViewById(R.id.btPericiaEmEsquivaInterrogacao);
			btFurtoInterrogacao = (Button) findViewById(R.id.btFurtoInterrogacao);
			btEsconderijoInterrogacao = (Button) findViewById(R.id.btEsconderijoInterrogacao);
			btPericiaComEspadaInterrogacao = (Button) findViewById(R.id.btPericiaComEspadaInterrogacao);
			btAumentarRecuperacaoDeHPInterrogacao = (Button) findViewById(R.id.btAumentarRecuperacaoDeHPInterrogacao);
			btGolpeFulminanteInterrogacao = (Button) findViewById(R.id.btGolpeFulminanteInterrogacao);
			btProvocarInterrogacao = (Button) findViewById(R.id.btProvocarInterrogacao);
			btImpactoExplosivoInterrogacao = (Button) findViewById(R.id.btImpactoExplosivoInterrogacao);
			btVigorInterrogacao = (Button) findViewById(R.id.btVigorInterrogacao);
			btMammonitaInterrogacao = (Button) findViewById(R.id.btMammonitaInterrogacao);
			btDescontoInterrogacao = (Button) findViewById(R.id.btDescontoInterrogacao);
			btSuperfaturarInterrogacao = (Button) findViewById(R.id.btSuperfaturarInterrogacao);
			btAumentarCapacidadeDeCargaInterrogacao = (Button) findViewById(R.id.btAumentarCapacidadeDeCargaInterrogacao);
			btUsarCarrinhoInterrogacao = (Button) findViewById(R.id.btUsarCarrinhoInterrogacao);
			btComercioInterrogacao = (Button) findViewById(R.id.btComercioInterrogacao);
			btIdentificarItemInterrogacao = (Button) findViewById(R.id.btIdentificarItemInterrogacao);
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
			btEnvenenarArmaInterrogacao = (Button) findViewById(R.id.btEnvenenarArmaInterrogacao);
			btTunelDeFugaInterrogacao = (Button) findViewById(R.id.btTunelDeFugaInterrogacao);
			btArmadilhaEscorregadiaInterrogacao = (Button) findViewById(R.id.btArmadilhaEscorregadiaInterrogacao);
			btArmadilhaLuminosaInterrogacao = (Button) findViewById(R.id.btArmadilhaLuminosaInterrogacao);
			btArmadilhaSoniferaInterrogacao = (Button) findViewById(R.id.btArmadilhaSoniferaInterrogacao);
			btArmadilhaCongelanteInterrogacao = (Button) findViewById(R.id.btArmadilhaCongelanteInterrogacao);
			btFeInterrogacao = (Button) findViewById(R.id.btFeInterrogacao);
			btCruxDivinumInterrogacao = (Button) findViewById(R.id.btCruxDivinumInterrogacao);
			btPunhoFirmeInterrogacao = (Button) findViewById(R.id.btPunhoFirmeInterrogacao);
			btPericiaEmArmamentoInterrogacao = (Button) findViewById(R.id.btPericiaEmArmamentoInterrogacao);
			btPericiaComMachadoEEspadaInterrogacao = (Button) findViewById(R.id.btPericiaComMachadoEEspadaInterrogacao);
			btPunhosDeFerroInterrogacao = (Button) findViewById(R.id.btPunhosDeFerroInterrogacao);
			btAbsorverEsferasEspirituaisInterrogacao = (Button) findViewById(R.id.btAbsorverEsferasEspirituaisInterrogacao);
			btInvocarEsferasEspirituaisInterrogacao = (Button) findViewById(R.id.btInvocarEsferasEspirituaisInterrogacao);
			btGracaDivinaInterrogacao = (Button) findViewById(R.id.btGracaDivinaInterrogacao);
			btImpositioManusInterrogacao = (Button) findViewById(R.id.btImpositioManusInterrogacao);
			btSantuarioInterrogacao = (Button) findViewById(R.id.btSantuarioInterrogacao);
			btGloriaInterrogacao = (Button) findViewById(R.id.btGloriaInterrogacao);
			btColunaDePedraInterrogacao = (Button) findViewById(R.id.btColunaDePedraInterrogacao);
			btColunaDeFogoInterrogacao = (Button) findViewById(R.id.btColunaDeFogoInterrogacao);
			btCongelarInterrogacao = (Button) findViewById(R.id.btCongelarInterrogacao);
			btFuriaDaTerraInterrogacao = (Button) findViewById(R.id.btFuriaDaTerraInterrogacao);
			btBarreiraDeGeloInterrogacao = (Button) findViewById(R.id.btBarreiraDeGeloInterrogacao);
			btEsmagamentoMagicoInterrogacao = (Button) findViewById(R.id.btEsmagamentoMagicoInterrogacao);
			btPantanoDosMortosInterrogacao = (Button) findViewById(R.id.btPantanoDosMortosInterrogacao);
			btSentidoSobrenaturalInterrogacao = (Button) findViewById(R.id.btSentidoSobrenaturalInterrogacao);
			btSupernovaInterrogacao = (Button) findViewById(R.id.btSupernovaInterrogacao);
			btEsferaDaguaInterrogacao = (Button) findViewById(R.id.btEsferaDaguaInterrogacao);

			//Botões de diminuir habilidades
			btPrecisaoDiminuir = (Button) findViewById(R.id.btPrecisaoDiminuir);
			btOlhosDeAguiaDiminuir = (Button) findViewById(R.id.btOlhosDeAguiaDiminuir);
			btConcentracaoDiminuir = (Button) findViewById(R.id.btConcentracaoDiminuir);
			btEnvenenarDiminuir = (Button) findViewById(R.id.btEnvenenarDiminuir);
			btDesintoxicarDiminuir = (Button) findViewById(R.id.btDesintoxicarDiminuir);
			btAtaqueDuploDiminuir = (Button) findViewById(R.id.btAtaqueDuploDiminuir);
			btPericiaEmEsquivaDiminuir = (Button) findViewById(R.id.btPericiaEmEsquivaDiminuir);
			btFurtoDiminuir = (Button) findViewById(R.id.btFurtoDiminuir);
			btEsconderijoDiminuir = (Button) findViewById(R.id.btEsconderijoDiminuir);
			btPericiaComEspadaDiminuir = (Button) findViewById(R.id.btPericiaComEspadaDiminuir);
			btAumentarRecuperacaoDeHPDiminuir = (Button) findViewById(R.id.btAumentarRecuperacaoDeHPDiminuir);
			btGolpeFulminanteDiminuir = (Button) findViewById(R.id.btGolpeFulminanteDiminuir);
			btProvocarDiminuir = (Button) findViewById(R.id.btProvocarDiminuir);
			btImpactoExplosivoDiminuir = (Button) findViewById(R.id.btImpactoExplosivoDiminuir);
			btVigorDiminuir = (Button) findViewById(R.id.btVigorDiminuir);
			btMammonitaDiminuir = (Button) findViewById(R.id.btMammonitaDiminuir);
			btDescontoDiminuir = (Button) findViewById(R.id.btDescontoDiminuir);
			btSuperfaturarDiminuir = (Button) findViewById(R.id.btSuperfaturarDiminuir);
			btAumentarCapacidadeDeCargaDiminuir = (Button) findViewById(R.id.btAumentarCapacidadeDeCargaDiminuir);
			btUsarCarrinhoDiminuir = (Button) findViewById(R.id.btUsarCarrinhoDiminuir);
			btComercioDiminuir = (Button) findViewById(R.id.btComercioDiminuir);
			btIdentificarItemDiminuir = (Button) findViewById(R.id.btIdentificarItemDiminuir);
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
			btEnvenenarArmaDiminuir = (Button) findViewById(R.id.btEnvenenarArmaDiminuir);
			btTunelDeFugaDiminuir = (Button) findViewById(R.id.btTunelDeFugaDiminuir);
			btArmadilhaEscorregadiaDiminuir = (Button) findViewById(R.id.btArmadilhaEscorregadiaDiminuir);
			btArmadilhaLuminosaDiminuir = (Button) findViewById(R.id.btArmadilhaLuminosaDiminuir);
			btArmadilhaSoniferaDiminuir = (Button) findViewById(R.id.btArmadilhaSoniferaDiminuir);
			btArmadilhaCongelanteDiminuir = (Button) findViewById(R.id.btArmadilhaCongelanteDiminuir);
			btFeDiminuir = (Button) findViewById(R.id.btFeDiminuir);
			btCruxDivinumDiminuir = (Button) findViewById(R.id.btCruxDivinumDiminuir);
			btPunhoFirmeDiminuir = (Button) findViewById(R.id.btPunhoFirmeDiminuir);
			btPericiaEmArmamentoDiminuir = (Button) findViewById(R.id.btPericiaEmArmamentoDiminuir);
			btPericiaComMachadoEEspadaDiminuir = (Button) findViewById(R.id.btPericiaComMachadoEEspadaDiminuir);
			btPunhosDeFerroDiminuir = (Button) findViewById(R.id.btPunhosDeFerroDiminuir);
			btAbsorverEsferasEspirituaisDiminuir = (Button) findViewById(R.id.btAbsorverEsferasEspirituaisDiminuir);
			btInvocarEsferasEspirituaisDiminuir = (Button) findViewById(R.id.btInvocarEsferasEspirituaisDiminuir);
			btGracaDivinaDiminuir = (Button) findViewById(R.id.btGracaDivinaDiminuir);
			btImpositioManusDiminuir = (Button) findViewById(R.id.btImpositioManusDiminuir);
			btSantuarioDiminuir = (Button) findViewById(R.id.btSantuarioDiminuir);
			btGloriaDiminuir = (Button) findViewById(R.id.btGloriaDiminuir);
			btColunaDePedraDiminuir = (Button) findViewById(R.id.btColunaDePedraDiminuir);
			btColunaDeFogoDiminuir = (Button) findViewById(R.id.btColunaDeFogoDiminuir);
			btCongelarDiminuir = (Button) findViewById(R.id.btCongelarDiminuir);
			btFuriaDaTerraDiminuir = (Button) findViewById(R.id.btFuriaDaTerraDiminuir);
			btBarreiraDeGeloDiminuir = (Button) findViewById(R.id.btBarreiraDeGeloDiminuir);
			btEsmagamentoMagicoDiminuir = (Button) findViewById(R.id.btEsmagamentoMagicoDiminuir);
			btPantanoDosMortosDiminuir = (Button) findViewById(R.id.btPantanoDosMortosDiminuir);
			btSentidoSobrenaturalDiminuir = (Button) findViewById(R.id.btSentidoSobrenaturalDiminuir);
			btSupernovaDiminuir = (Button) findViewById(R.id.btSupernovaDiminuir);
			btEsferaDaguaDiminuir = (Button) findViewById(R.id.btEsferaDaguaDiminuir);

			//Botões de aumentar habilidades
			btPrecisaoAumentar = (Button) findViewById(R.id.btPrecisaoAumentar);
			btOlhosDeAguiaAumentar = (Button) findViewById(R.id.btOlhosDeAguiaAumentar);
			btConcentracaoAumentar = (Button) findViewById(R.id.btConcentracaoAumentar);
			btEnvenenarAumentar = (Button) findViewById(R.id.btEnvenenarAumentar);
			btDesintoxicarAumentar = (Button) findViewById(R.id.btDesintoxicarAumentar);
			btAtaqueDuploAumentar = (Button) findViewById(R.id.btAtaqueDuploAumentar);
			btPericiaEmEsquivaAumentar = (Button) findViewById(R.id.btPericiaEmEsquivaAumentar);
			btFurtoAumentar = (Button) findViewById(R.id.btFurtoAumentar);
			btEsconderijoAumentar = (Button) findViewById(R.id.btEsconderijoAumentar);
			btPericiaComEspadaAumentar = (Button) findViewById(R.id.btPericiaComEspadaAumentar);
			btAumentarRecuperacaoDeHPAumentar = (Button) findViewById(R.id.btAumentarRecuperacaoDeHPAumentar);
			btGolpeFulminanteAumentar = (Button) findViewById(R.id.btGolpeFulminanteAumentar);
			btProvocarAumentar = (Button) findViewById(R.id.btProvocarAumentar);
			btImpactoExplosivoAumentar = (Button) findViewById(R.id.btImpactoExplosivoAumentar);
			btVigorAumentar = (Button) findViewById(R.id.btVigorAumentar);
			btMammonitaAumentar = (Button) findViewById(R.id.btMammonitaAumentar);
			btDescontoAumentar = (Button) findViewById(R.id.btDescontoAumentar);
			btSuperfaturarAumentar = (Button) findViewById(R.id.btSuperfaturarAumentar);
			btAumentarCapacidadeDeCargaAumentar = (Button) findViewById(R.id.btAumentarCapacidadeDeCargaAumentar);
			btUsarCarrinhoAumentar = (Button) findViewById(R.id.btUsarCarrinhoAumentar);
			btComercioAumentar = (Button) findViewById(R.id.btComercioAumentar);
			btIdentificarItemAumentar = (Button) findViewById(R.id.btIdentificarItemAumentar);
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
			btEnvenenarArmaAumentar = (Button) findViewById(R.id.btEnvenenarArmaAumentar);
			btTunelDeFugaAumentar = (Button) findViewById(R.id.btTunelDeFugaAumentar);
			btArmadilhaEscorregadiaAumentar = (Button) findViewById(R.id.btArmadilhaEscorregadiaAumentar);
			btArmadilhaLuminosaAumentar = (Button) findViewById(R.id.btArmadilhaLuminosaAumentar);
			btArmadilhaSoniferaAumentar = (Button) findViewById(R.id.btArmadilhaSoniferaAumentar);
			btArmadilhaCongelanteAumentar = (Button) findViewById(R.id.btArmadilhaCongelanteAumentar);
			btFeAumentar = (Button) findViewById(R.id.btFeAumentar);
			btCruxDivinumAumentar = (Button) findViewById(R.id.btCruxDivinumAumentar);
			btPunhoFirmeAumentar = (Button) findViewById(R.id.btPunhoFirmeAumentar);
			btPericiaEmArmamentoAumentar = (Button) findViewById(R.id.btPericiaEmArmamentoAumentar);
			btPericiaComMachadoEEspadaAumentar = (Button) findViewById(R.id.btPericiaComMachadoEEspadaAumentar);
			btPunhosDeFerroAumentar = (Button) findViewById(R.id.btPunhosDeFerroAumentar);
			btAbsorverEsferasEspirituaisAumentar = (Button) findViewById(R.id.btAbsorverEsferasEspirituaisAumentar);
			btInvocarEsferasEspirituaisAumentar = (Button) findViewById(R.id.btInvocarEsferasEspirituaisAumentar);
			btGracaDivinaAumentar = (Button) findViewById(R.id.btGracaDivinaAumentar);
			btImpositioManusAumentar = (Button) findViewById(R.id.btImpositioManusAumentar);
			btSantuarioAumentar = (Button) findViewById(R.id.btSantuarioAumentar);
			btGloriaAumentar = (Button) findViewById(R.id.btGloriaAumentar);
			btColunaDePedraAumentar = (Button) findViewById(R.id.btColunaDePedraAumentar);
			btColunaDeFogoAumentar = (Button) findViewById(R.id.btColunaDeFogoAumentar);
			btCongelarAumentar = (Button) findViewById(R.id.btCongelarAumentar);
			btFuriaDaTerraAumentar = (Button) findViewById(R.id.btFuriaDaTerraAumentar);
			btBarreiraDeGeloAumentar = (Button) findViewById(R.id.btBarreiraDeGeloAumentar);
			btEsmagamentoMagicoAumentar = (Button) findViewById(R.id.btEsmagamentoMagicoAumentar);
			btPantanoDosMortosAumentar = (Button) findViewById(R.id.btPantanoDosMortosAumentar);
			btSentidoSobrenaturalAumentar = (Button) findViewById(R.id.btSentidoSobrenaturalAumentar);
			btSupernovaAumentar = (Button) findViewById(R.id.btSupernovaAumentar);
			btEsferaDaguaAumentar = (Button) findViewById(R.id.btEsferaDaguaAumentar);

			//Resto dos botões
			btResetar = (Button) findViewById(R.id.btResetar);
			btSalvar = (Button) findViewById(R.id.btSalvar);
			btSalvarIMG = (Button) findViewById(R.id.btSalvarIMG);
			tgbtSomenteHabilidadeAprendida = (ToggleButton) findViewById(R.id.tgbtSomenteHabilidadeAprendida);

			//Txt pontos da tela
			txtPrecisaoPontos = (TextView) findViewById(R.id.txtPrecisaoPontos);
			txtOlhosDeAguiaPontos = (TextView) findViewById(R.id.txtOlhosDeAguiaPontos);
			txtConcentracaoPontos = (TextView) findViewById(R.id.txtConcentracaoPontos);
			txtEnvenenarPontos = (TextView) findViewById(R.id.txtEnvenenarPontos);
			txtDesintoxicarPontos = (TextView) findViewById(R.id.txtDesintoxicarPontos);
			txtAtaqueDuploPontos = (TextView) findViewById(R.id.txtAtaqueDuploPontos);
			txtPericiaEmEsquivaPontos = (TextView) findViewById(R.id.txtPericiaEmEsquivaPontos);
			txtFurtoPontos = (TextView) findViewById(R.id.txtFurtoPontos);
			txtEsconderijoPontos = (TextView) findViewById(R.id.txtEsconderijoPontos);
			txtPericiaComEspadaPontos = (TextView) findViewById(R.id.txtPericiaComEspadaPontos);
			txtAumentarRecuperacaoDeHPPontos = (TextView) findViewById(R.id.txtAumentarRecuperacaoDeHPPontos);
			txtGolpeFulminantePontos = (TextView) findViewById(R.id.txtGolpeFulminantePontos);
			txtProvocarPontos = (TextView) findViewById(R.id.txtProvocarPontos);
			txtImpactoExplosivoPontos = (TextView) findViewById(R.id.txtImpactoExplosivoPontos);
			txtVigorPontos = (TextView) findViewById(R.id.txtVigorPontos);
			txtMammonitaPontos = (TextView) findViewById(R.id.txtMammonitaPontos);
			txtDescontoPontos = (TextView) findViewById(R.id.txtDescontoPontos);
			txtSuperfaturarPontos = (TextView) findViewById(R.id.txtSuperfaturarPontos);
			txtAumentarCapacidadeDeCargaPontos = (TextView) findViewById(R.id.txtAumentarCapacidadeDeCargaPontos);
			txtUsarCarrinhoPontos = (TextView) findViewById(R.id.txtUsarCarrinhoPontos);
			txtComercioPontos = (TextView) findViewById(R.id.txtComercioPontos);
			txtIdentificarItemPontos = (TextView) findViewById(R.id.txtIdentificarItemPontos);
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
			txtEnvenenarArmaPontos = (TextView) findViewById(R.id.txtEnvenenarArmaPontos);
			txtTunelDeFugaPontos = (TextView) findViewById(R.id.txtTunelDeFugaPontos);
			txtArmadilhaEscorregadiaPontos = (TextView) findViewById(R.id.txtArmadilhaEscorregadiaPontos);
			txtArmadilhaLuminosaPontos = (TextView) findViewById(R.id.txtArmadilhaLuminosaPontos);
			txtArmadilhaSoniferaPontos = (TextView) findViewById(R.id.txtArmadilhaSoniferaPontos);
			txtArmadilhaCongelantePontos = (TextView) findViewById(R.id.txtArmadilhaCongelantePontos);
			txtFePontos = (TextView) findViewById(R.id.txtFePontos);
			txtCruxDivinumPontos = (TextView) findViewById(R.id.txtCruxDivinumPontos);
			txtPunhoFirmePontos = (TextView) findViewById(R.id.txtPunhoFirmePontos);
			txtPericiaEmArmamentoPontos = (TextView) findViewById(R.id.txtPericiaEmArmamentoPontos);
			txtPericiaComMachadoEEspadaPontos = (TextView) findViewById(R.id.txtPericiaComMachadoEEspadaPontos);
			txtPunhosDeFerroPontos = (TextView) findViewById(R.id.txtPunhosDeFerroPontos);
			txtAbsorverEsferasEspirituaisPontos = (TextView) findViewById(R.id.txtAbsorverEsferasEspirituaisPontos);
			txtInvocarEsferasEspirituaisPontos = (TextView) findViewById(R.id.txtInvocarEsferasEspirituaisPontos);
			txtGracaDivinaPontos = (TextView) findViewById(R.id.txtGracaDivinaPontos);
			txtImpositioManusPontos = (TextView) findViewById(R.id.txtImpositioManusPontos);
			txtSantuarioPontos = (TextView) findViewById(R.id.txtSantuarioPontos);
			txtGloriaPontos = (TextView) findViewById(R.id.txtGloriaPontos);
			txtColunaDePedraPontos = (TextView) findViewById(R.id.txtColunaDePedraPontos);
			txtColunaDeFogoPontos = (TextView) findViewById(R.id.txtColunaDeFogoPontos);
			txtCongelarPontos = (TextView) findViewById(R.id.txtCongelarPontos);
			txtFuriaDaTerraPontos = (TextView) findViewById(R.id.txtFuriaDaTerraPontos);
			txtBarreiraDeGeloPontos = (TextView) findViewById(R.id.txtBarreiraDeGeloPontos);
			txtEsmagamentoMagicoPontos = (TextView) findViewById(R.id.txtEsmagamentoMagicoPontos);
			txtPantanoDosMortosPontos = (TextView) findViewById(R.id.txtPantanoDosMortosPontos);
			txtSentidoSobrenaturalPontos = (TextView) findViewById(R.id.txtSentidoSobrenaturalPontos);
			txtSupernovaPontos = (TextView) findViewById(R.id.txtSupernovaPontos);
			txtEsferaDaguaPontos = (TextView) findViewById(R.id.txtEsferaDaguaPontos);

			//Txt pontos restantes
			txtClasse1 = (TextView) findViewById(R.id.txtClasse1);
			txtClasse2 = (TextView) findViewById(R.id.txtClasse2);

			//Layouts
			layPrecisao = (LinearLayout) findViewById(R.id.layPrecisao);
			layOlhosDeAguia = (LinearLayout) findViewById(R.id.layOlhosDeAguia);
			layConcentracao = (LinearLayout) findViewById(R.id.layConcentracao);
			layEnvenenar = (LinearLayout) findViewById(R.id.layEnvenenar);
			layDesintoxicar = (LinearLayout) findViewById(R.id.layDesintoxicar);
			layAtaqueDuplo = (LinearLayout) findViewById(R.id.layAtaqueDuplo);
			layPericiaEmEsquiva = (LinearLayout) findViewById(R.id.layPericiaEmEsquiva);
			layFurto = (LinearLayout) findViewById(R.id.layFurto);
			layEsconderijo = (LinearLayout) findViewById(R.id.layEsconderijo);
			layPericiaComEspada = (LinearLayout) findViewById(R.id.layPericiaComEspada);
			layAumentarRecuperacaoDeHP = (LinearLayout) findViewById(R.id.layAumentarRecuperacaoDeHP);
			layGolpeFulminante = (LinearLayout) findViewById(R.id.layGolpeFulminante);
			layProvocar = (LinearLayout) findViewById(R.id.layProvocar);
			layImpactoExplosivo = (LinearLayout) findViewById(R.id.layImpactoExplosivo);
			layVigor = (LinearLayout) findViewById(R.id.layVigor);
			layMammonita = (LinearLayout) findViewById(R.id.layMammonita);
			layDesconto = (LinearLayout) findViewById(R.id.layDesconto);
			laySuperfaturar = (LinearLayout) findViewById(R.id.laySuperfaturar);
			layAumentarCapacidadeDeCarga = (LinearLayout) findViewById(R.id.layAumentarCapacidadeDeCarga);
			layUsarCarrinho = (LinearLayout) findViewById(R.id.layUsarCarrinho);
			layComercio = (LinearLayout) findViewById(R.id.layComercio);
			layIdentificarItem = (LinearLayout) findViewById(R.id.layIdentificarItem);
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
			layEnvenenarArma = (LinearLayout) findViewById(R.id.layEnvenenarArma);
			layTunelDeFuga = (LinearLayout) findViewById(R.id.layTunelDeFuga);
			layArmadilhaEscorregadia = (LinearLayout) findViewById(R.id.layArmadilhaEscorregadia);
			layArmadilhaLuminosa = (LinearLayout) findViewById(R.id.layArmadilhaLuminosa);
			layArmadilhaSonifera = (LinearLayout) findViewById(R.id.layArmadilhaSonifera);
			layArmadilhaCongelante = (LinearLayout) findViewById(R.id.layArmadilhaCongelante);
			layFe = (LinearLayout) findViewById(R.id.layFe);
			layCruxDivinum = (LinearLayout) findViewById(R.id.layCruxDivinum);
			layPunhoFirme = (LinearLayout) findViewById(R.id.layPunhoFirme);
			layPericiaEmArmamento = (LinearLayout) findViewById(R.id.layPericiaEmArmamento);
			layPericiaComMachadoEEspada = (LinearLayout) findViewById(R.id.layPericiaComMachadoEEspada);
			layPunhosDeFerro = (LinearLayout) findViewById(R.id.layPunhosDeFerro);
			layAbsorverEsferasEspirituais = (LinearLayout) findViewById(R.id.layAbsorverEsferasEspirituais);
			layInvocarEsferasEspirituais = (LinearLayout) findViewById(R.id.layInvocarEsferasEspirituais);
			layGracaDivina = (LinearLayout) findViewById(R.id.layGracaDivina);
			layImpositioManus = (LinearLayout) findViewById(R.id.layImpositioManus);
			laySantuario = (LinearLayout) findViewById(R.id.laySantuario);
			layGloria = (LinearLayout) findViewById(R.id.layGloria);
			layColunaDePedra = (LinearLayout) findViewById(R.id.layColunaDePedra);
			layColunaDeFogo = (LinearLayout) findViewById(R.id.layColunaDeFogo);
			layCongelar = (LinearLayout) findViewById(R.id.layCongelar);
			layFuriaDaTerra = (LinearLayout) findViewById(R.id.layFuriaDaTerra);
			layBarreiraDeGelo = (LinearLayout) findViewById(R.id.layBarreiraDeGelo);
			layEsmagamentoMagico = (LinearLayout) findViewById(R.id.layEsmagamentoMagico);
			layPantanoDosMortos = (LinearLayout) findViewById(R.id.layPantanoDosMortos);
			laySentidoSobrenatural = (LinearLayout) findViewById(R.id.laySentidoSobrenatural);
			laySupernova = (LinearLayout) findViewById(R.id.laySupernova);
			layEsferaDagua = (LinearLayout) findViewById(R.id.layEsferaDagua);

			if (id>0)
				recarregarBuild(id);
			
			layPrincipal = (LinearLayout) findViewById(R.id.habilidades);


			//Eventos de informação
			btPrecisaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Precisão");
					dialogo.setMessage(R.string.precisaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOlhosDeAguiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Olhos De Águia");
					dialogo.setMessage(R.string.olhosDeAguiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btConcentracaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Concentração");
					dialogo.setMessage(R.string.concentracaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEnvenenarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Envenenar");
					dialogo.setMessage(R.string.envenenarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDesintoxicarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Desintoxicar");
					dialogo.setMessage(R.string.desintoxicarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueDuploInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Ataque Duplo");
					dialogo.setMessage(R.string.ataqueDuploInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaEmEsquivaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Perícia Em Esquiva");
					dialogo.setMessage(R.string.periciaEmEsquivaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFurtoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Furto");
					dialogo.setMessage(R.string.furtoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEsconderijoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Esconderijo");
					dialogo.setMessage(R.string.esconderijoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaComEspadaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Perícia Com Espada");
					dialogo.setMessage(R.string.periciaComEspadaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAumentarRecuperacaoDeHPInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Aumentar Recuperação De HP");
					dialogo.setMessage(R.string.aumentarRecuperacaoDeHPInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGolpeFulminanteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Golpe Fulminante");
					dialogo.setMessage(R.string.golpeFulminanteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btProvocarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Provocar");
					dialogo.setMessage(R.string.provocarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btImpactoExplosivoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Impacto Explosivo");
					dialogo.setMessage(R.string.impactoExplosivoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btVigorInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Vigor");
					dialogo.setMessage(R.string.vigorInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMammonitaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Mammonita");
					dialogo.setMessage(R.string.mammonitaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDescontoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Desconto");
					dialogo.setMessage(R.string.descontoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSuperfaturarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Superfaturar");
					dialogo.setMessage(R.string.superfaturarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAumentarCapacidadeDeCargaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Aumentar Capacidade De Carga");
					dialogo.setMessage(R.string.aumentarCapacidadeDeCargaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btUsarCarrinhoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Usar Carrinho");
					dialogo.setMessage(R.string.usarCarrinhoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btComercioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Comércio");
					dialogo.setMessage(R.string.comercioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btIdentificarItemInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Identificar Item");
					dialogo.setMessage(R.string.identificarItemInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLancasDeGeloInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Lanças De Gelo");
					dialogo.setMessage(R.string.lancasDeGeloInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBolasDeFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Bolas De Fogo");
					dialogo.setMessage(R.string.bolasDeFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLancasDeFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Lanças De Fogo");
					dialogo.setMessage(R.string.lancasDeFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBarreiraDeFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Barreira De Fogo");
					dialogo.setMessage(R.string.barreiraDeFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRajadaCongelanteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Rajada Congelante");
					dialogo.setMessage(R.string.rajadaCongelanteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAumentarRecuperacaoDeSPInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Aumentar Recuperação De SP");
					dialogo.setMessage(R.string.aumentarRecuperacaoDeSPInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRelampagoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Relâmpago");
					dialogo.setMessage(R.string.relampagoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueEspiritualInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Ataque Espiritual");
					dialogo.setMessage(R.string.ataqueEspiritualInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEscudoMagicoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Escudo Mágico");
					dialogo.setMessage(R.string.escudoMagicoMagoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChamaReveladoraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Chama Reveladora");
					dialogo.setMessage(R.string.chamaReveladoraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritosAncioesInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Espíritos Anciões");
					dialogo.setMessage(R.string.espiritosAncioesInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPetrificarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Petrificar");
					dialogo.setMessage(R.string.petrificarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTempestadeDeRaiosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Tempestade De Raios");
					dialogo.setMessage(R.string.tempestadeDeRaiosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btProtecaoDivinaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Proteção Divina");
					dialogo.setMessage(R.string.protecaoDivinaNovicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFlageloDoMalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Flagelo Do Mal");
					dialogo.setMessage(R.string.flageloDoMalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSignumCrucisInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Signum Crucis");
					dialogo.setMessage(R.string.signumCrucisInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAngelusInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Angelus");
					dialogo.setMessage(R.string.angelusInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBencaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Bênção");
					dialogo.setMessage(R.string.bencaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCurarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Curar");
					dialogo.setMessage(R.string.curarNovicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAumentarAgilidadeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Aumentar Agilidade");
					dialogo.setMessage(R.string.aumentarAgilidadeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDiminuirAgilidadeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Diminuir Agilidade");
					dialogo.setMessage(R.string.diminuirAgilidadeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAquaBenedictaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Aqua Benedicta");
					dialogo.setMessage(R.string.aquaBenedictaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTeleporteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Teleporte");
					dialogo.setMessage(R.string.teleporteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPortalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Portal");
					dialogo.setMessage(R.string.portalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRevelacaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Revelação");
					dialogo.setMessage(R.string.revelacaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEscudoSagradoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Escudo Sagrado");
					dialogo.setMessage(R.string.escudoSagradoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMedicarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Medicar");
					dialogo.setMessage(R.string.medicarNovicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEnvenenarArmaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Envenenar Arma");
					dialogo.setMessage(R.string.envenenarArmaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTunelDeFugaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Túnel De Fuga");
					dialogo.setMessage(R.string.tunelDeFugaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaEscorregadiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Armadilha Escorregadia");
					dialogo.setMessage(R.string.armadilhaEscorregadiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaLuminosaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Armadilha Luminosa");
					dialogo.setMessage(R.string.armadilhaLuminosaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaSoniferaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Armadilha Sonífera");
					dialogo.setMessage(R.string.armadilhaSoniferaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaCongelanteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Armadilha Congelante");
					dialogo.setMessage(R.string.armadilhaCongelanteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Fé");
					dialogo.setMessage(R.string.feInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCruxDivinumInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Crux Divinum");
					dialogo.setMessage(R.string.cruxDivinumInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPunhoFirmeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Punho Firme");
					dialogo.setMessage(R.string.punhoFirmeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaEmArmamentoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Perícia Em Armamento");
					dialogo.setMessage(R.string.periciaEmArmamentoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaComMachadoEEspadaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Perícia Com Machado E Espada");
					dialogo.setMessage(R.string.periciaComMachadoEEspadaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPunhosDeFerroInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Punhos De Ferro");
					dialogo.setMessage(R.string.punhosDeFerroInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAbsorverEsferasEspirituaisInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Absorver Esferas Espirituais");
					dialogo.setMessage(R.string.absorverEsferasEspirituaisInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInvocarEsferasEspirituaisInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Invocar Esferas Espirituais");
					dialogo.setMessage(R.string.invocarEsferasEspirituaisInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGracaDivinaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Graça Divina");
					dialogo.setMessage(R.string.gracaDivinaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btImpositioManusInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Impositio Manus");
					dialogo.setMessage(R.string.impositioManusInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSantuarioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Santuário");
					dialogo.setMessage(R.string.santuarioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGloriaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Glória");
					dialogo.setMessage(R.string.gloriaSAInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btColunaDePedraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Coluna De Pedra");
					dialogo.setMessage(R.string.colunaDePedraBruxoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btColunaDeFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Coluna De Fogo");
					dialogo.setMessage(R.string.colunaDeFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCongelarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Congelar");
					dialogo.setMessage(R.string.congelarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFuriaDaTerraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Fúria Da Terra");
					dialogo.setMessage(R.string.furiaDaTerraBruxoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBarreiraDeGeloInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Barreira De Gelo");
					dialogo.setMessage(R.string.barreiraDeGeloInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEsmagamentoMagicoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Esmagamento Mágico");
					dialogo.setMessage(R.string.esmagamentoMagicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPantanoDosMortosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Pântano Dos Mortos");
					dialogo.setMessage(R.string.pantanoDosMortosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSentidoSobrenaturalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Sentido Sobrenatural");
					dialogo.setMessage(R.string.sentidoSobrenaturalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSupernovaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Supernova");
					dialogo.setMessage(R.string.supernovaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEsferaDaguaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					dialogo.setTitle("Esfera Dágua");
					dialogo.setMessage(R.string.esferaDaguaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});


			//Eventos de aumentar
			btPrecisaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Aumentar");

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
			btEnvenenarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");

				}
			});
			btDesintoxicarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEnvenenar<3 && count<3){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDesintoxicar, "Desintoxicar", 1, 1, "Aumentar");

				}
			});
			btAtaqueDuploAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtaqueDuplo, "AtaqueDuplo", 10, 1, "Aumentar");

				}
			});
			btPericiaEmEsquivaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaEmEsquiva, "PericiaEmEsquiva", 10, 1, "Aumentar");

				}
			});
			btFurtoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");

				}
			});
			btEsconderijoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<5 && count<5){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEsconderijo, "Esconderijo", 10, 1, "Aumentar");

				}
			});
			btPericiaComEspadaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 1, "Aumentar");

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
					while(varGolpeFulminante<5 && count<5){
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
					while(varProvocar<5 && count<5){
						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");

				}
			});
			btMammonitaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMammonita, "Mammonita", 10, 1, "Aumentar");

				}
			});
			btDescontoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAumentarCapacidadeDeCarga<3 && count<3){
						atualizarCalculo(varAumentarCapacidadeDeCarga, "AumentarCapacidadeDeCarga", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDesconto, "Desconto", 10, 1, "Aumentar");

				}
			});
			btSuperfaturarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAumentarCapacidadeDeCarga<3 && count<3){
						atualizarCalculo(varAumentarCapacidadeDeCarga, "AumentarCapacidadeDeCarga", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesconto<3 && count<3){
						atualizarCalculo(varDesconto, "Desconto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSuperfaturar, "Superfaturar", 10, 1, "Aumentar");

				}
			});
			btAumentarCapacidadeDeCargaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAumentarCapacidadeDeCarga, "AumentarCapacidadeDeCarga", 10, 1, "Aumentar");

				}
			});
			btUsarCarrinhoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAumentarCapacidadeDeCarga<5 && count<5){
						atualizarCalculo(varAumentarCapacidadeDeCarga, "AumentarCapacidadeDeCarga", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varUsarCarrinho, "UsarCarrinho", 10, 1, "Aumentar");

				}
			});
			btComercioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAumentarCapacidadeDeCarga<5 && count<5){
						atualizarCalculo(varAumentarCapacidadeDeCarga, "AumentarCapacidadeDeCarga", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varUsarCarrinho<3 && count<3){
						atualizarCalculo(varUsarCarrinho, "UsarCarrinho", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varComercio, "Comercio", 10, 1, "Aumentar");

				}
			});
			btIdentificarItemAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varIdentificarItem, "IdentificarItem", 1, 1, "Aumentar");

				}
			});
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
			btEnvenenarArmaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEnvenenar<1 && count<1){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEnvenenarArma, "EnvenenarArma", 10, 2, "Aumentar");

				}
			});
			btTunelDeFugaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<5 && count<5){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsconderijo<1 && count<1){
						atualizarCalculo(varEsconderijo, "Esconderijo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");

				}
			});
			btArmadilhaEscorregadiaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Aumentar");

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
					while(varArmadilhaLuminosa<1 && count<1){
						atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArmadilhaCongelante, "ArmadilhaCongelante", 5, 2, "Aumentar");

				}
			});
			btFeAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");

				}
			});
			btCruxDivinumAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFe<7 && count<7){
						atualizarCalculo(varFe, "Fe", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCruxDivinum, "CruxDivinum", 10, 2, "Aumentar");

				}
			});
			btPunhoFirmeAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPunhoFirme, "PunhoFirme", 1, 2, "Aumentar");

				}
			});
			btPericiaEmArmamentoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPunhoFirme<1 && count<1){
						atualizarCalculo(varPunhoFirme, "PunhoFirme", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPericiaEmArmamento, "PericiaEmArmamento", 10, 2, "Aumentar");

				}
			});
			btPericiaComMachadoEEspadaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComMachadoEEspada, "PericiaComMachadoEEspada", 10, 2, "Aumentar");

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
			btGracaDivinaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Aumentar");

				}
			});
			btImpositioManusAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Aumentar");

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
			btGloriaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCurar<1 && count<1){
						atualizarCalculo(varCurar, "Curar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSantuario<7 && count<7){
						atualizarCalculo(varSantuario, "Santuario", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGloria, "Gloria", 5, 2, "Aumentar");

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
			btEsmagamentoMagicoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAumentarRecuperacaoDeSP<1 && count<1){
						atualizarCalculo(varAumentarRecuperacaoDeSP, "AumentarRecuperacaoDeSP", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEsmagamentoMagico, "EsmagamentoMagico", 1, 2, "Aumentar");

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


			//Eventos de diminuir
			btPrecisaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPrecisao, "Precisao", 10, 1, "Diminuir");

				}
			});
			btOlhosDeAguiaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 1, "Diminuir");

				}
			});
			btConcentracaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varConcentracao, "Concentracao", 10, 1, "Diminuir");

				}
			});
			btEnvenenarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Diminuir");

				}
			});
			btDesintoxicarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDesintoxicar, "Desintoxicar", 1, 1, "Diminuir");

				}
			});
			btAtaqueDuploDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtaqueDuplo, "AtaqueDuplo", 10, 1, "Diminuir");

				}
			});
			btPericiaEmEsquivaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaEmEsquiva, "PericiaEmEsquiva", 10, 1, "Diminuir");

				}
			});
			btFurtoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFurto, "Furto", 10, 1, "Diminuir");

				}
			});
			btEsconderijoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEsconderijo, "Esconderijo", 10, 1, "Diminuir");

				}
			});
			btPericiaComEspadaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 1, "Diminuir");

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
			btMammonitaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMammonita, "Mammonita", 10, 1, "Diminuir");

				}
			});
			btDescontoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDesconto, "Desconto", 10, 1, "Diminuir");

				}
			});
			btSuperfaturarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSuperfaturar, "Superfaturar", 10, 1, "Diminuir");

				}
			});
			btAumentarCapacidadeDeCargaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAumentarCapacidadeDeCarga, "AumentarCapacidadeDeCarga", 10, 1, "Diminuir");

				}
			});
			btUsarCarrinhoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varUsarCarrinho, "UsarCarrinho", 10, 1, "Diminuir");

				}
			});
			btComercioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varComercio, "Comercio", 10, 1, "Diminuir");

				}
			});
			btIdentificarItemDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varIdentificarItem, "IdentificarItem", 1, 1, "Diminuir");

				}
			});
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
			btEnvenenarArmaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEnvenenarArma, "EnvenenarArma", 10, 2, "Diminuir");

				}
			});
			btTunelDeFugaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Diminuir");

				}
			});
			btArmadilhaEscorregadiaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaEscorregadia, "ArmadilhaEscorregadia", 5, 2, "Diminuir");

				}
			});
			btArmadilhaLuminosaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaLuminosa, "ArmadilhaLuminosa", 5, 2, "Diminuir");

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
			btFeDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFe, "Fe", 10, 2, "Diminuir");

				}
			});
			btCruxDivinumDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCruxDivinum, "CruxDivinum", 10, 2, "Diminuir");

				}
			});
			btPunhoFirmeDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPunhoFirme, "PunhoFirme", 1, 2, "Diminuir");

				}
			});
			btPericiaEmArmamentoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaEmArmamento, "PericiaEmArmamento", 10, 2, "Diminuir");

				}
			});
			btPericiaComMachadoEEspadaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComMachadoEEspada, "PericiaComMachadoEEspada", 10, 2, "Diminuir");

				}
			});
			btPunhosDeFerroDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPunhosDeFerro, "PunhosDeFerro", 10, 2, "Diminuir");

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
			btGracaDivinaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGracaDivina, "GracaDivina", 1, 2, "Diminuir");

				}
			});
			btImpositioManusDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varImpositioManus, "ImpositioManus", 5, 2, "Diminuir");

				}
			});
			btSantuarioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSantuario, "Santuario", 10, 2, "Diminuir");

				}
			});
			btGloriaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGloria, "Gloria", 5, 2, "Diminuir");

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
			btEsmagamentoMagicoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEsmagamentoMagico, "EsmagamentoMagico", 1, 2, "Diminuir");

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
			btEsferaDaguaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEsferaDagua, "EsferaDagua", 5, 2, "Diminuir");

				}
			});


			//Outros Botões
			btResetar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					varPrecisao = 0;
					varOlhosDeAguia = 0;
					varConcentracao = 0;
					varEnvenenar = 0;
					varDesintoxicar = 0;
					varAtaqueDuplo = 0;
					varPericiaEmEsquiva = 0;
					varFurto = 0;
					varEsconderijo = 0;
					varPericiaComEspada = 0;
					varAumentarRecuperacaoDeHP = 0;
					varGolpeFulminante = 0;
					varProvocar = 0;
					varImpactoExplosivo = 0;
					varVigor = 0;
					varMammonita = 0;
					varDesconto = 0;
					varSuperfaturar = 0;
					varAumentarCapacidadeDeCarga = 0;
					varUsarCarrinho = 0;
					varComercio = 0;
					varIdentificarItem = 0;
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
					varEnvenenarArma = 0;
					varTunelDeFuga = 0;
					varArmadilhaEscorregadia = 0;
					varArmadilhaLuminosa = 0;
					varArmadilhaSonifera = 0;
					varArmadilhaCongelante = 0;
					varFe = 0;
					varCruxDivinum = 0;
					varPunhoFirme = 0;
					varPericiaEmArmamento = 0;
					varPericiaComMachadoEEspada = 0;
					varPunhosDeFerro = 0;
					varAbsorverEsferasEspirituais = 0;
					varInvocarEsferasEspirituais = 0;
					varGracaDivina = 0;
					varImpositioManus = 0;
					varSantuario = 0;
					varGloria = 0;
					varColunaDePedra = 0;
					varColunaDeFogo = 0;
					varCongelar = 0;
					varFuriaDaTerra = 0;
					varBarreiraDeGelo = 0;
					varEsmagamentoMagico = 0;
					varPantanoDosMortos = 0;
					varSentidoSobrenatural = 0;
					varSupernova = 0;
					varEsferaDagua = 0;

					primeiraClasse = 98;
					segundaClasse = 49;

					skillPrimeira = 0;
					skillSegunda = 0;
					atualizarTela();

				}
			});

			btSalvar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					if (id > 0){
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorSuperAprendizExpandido.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorSuperAprendizExpandido.this);
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

					AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorSuperAprendizExpandido.this);
					msg.setTitle("Escolha um nome");
					msg.setMessage("OBS: Salvar PNG só irá salvar em forma de imagem! É recomendado que salve a build na memória do celular também.\nEscolha um nome para salvar esta simulação:");
					final EditText nomeParaSalvar = new EditText(SimuladorSuperAprendizExpandido.this);
					msg.setView(nomeParaSalvar);
					msg.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {

							@Override
						public void onClick(DialogInterface dialog, int which) {
							if (nomeParaSalvar.getText().toString().length() <= 0) {
								nomeParaSalvar.setError("Preencha o campo!");
								Toast.makeText(getBaseContext(), "ERROR: Insira um nome!", Toast.LENGTH_SHORT).show();
							} else {
								SaveFile sf = new SaveFile();
								sf.takeAScreenShot(SimuladorSuperAprendizExpandido.this, layPrincipal, nomeParaSalvar.getText().toString());
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
			if(varPrecisao==0)
				layPrecisao.setVisibility(View.GONE);
			if(varOlhosDeAguia==0)
				layOlhosDeAguia.setVisibility(View.GONE);
			if(varConcentracao==0)
				layConcentracao.setVisibility(View.GONE);
			if(varEnvenenar==0)
				layEnvenenar.setVisibility(View.GONE);
			if(varDesintoxicar==0)
				layDesintoxicar.setVisibility(View.GONE);
			if(varAtaqueDuplo==0)
				layAtaqueDuplo.setVisibility(View.GONE);
			if(varPericiaEmEsquiva==0)
				layPericiaEmEsquiva.setVisibility(View.GONE);
			if(varFurto==0)
				layFurto.setVisibility(View.GONE);
			if(varEsconderijo==0)
				layEsconderijo.setVisibility(View.GONE);
			if(varPericiaComEspada==0)
				layPericiaComEspada.setVisibility(View.GONE);
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
			if(varMammonita==0)
				layMammonita.setVisibility(View.GONE);
			if(varDesconto==0)
				layDesconto.setVisibility(View.GONE);
			if(varSuperfaturar==0)
				laySuperfaturar.setVisibility(View.GONE);
			if(varAumentarCapacidadeDeCarga==0)
				layAumentarCapacidadeDeCarga.setVisibility(View.GONE);
			if(varUsarCarrinho==0)
				layUsarCarrinho.setVisibility(View.GONE);
			if(varComercio==0)
				layComercio.setVisibility(View.GONE);
			if(varIdentificarItem==0)
				layIdentificarItem.setVisibility(View.GONE);
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

			if(varEnvenenarArma==0)
				layEnvenenarArma.setVisibility(View.GONE);
			if(varTunelDeFuga==0)
				layTunelDeFuga.setVisibility(View.GONE);
			if(varArmadilhaEscorregadia==0)
				layArmadilhaEscorregadia.setVisibility(View.GONE);
			if(varArmadilhaLuminosa==0)
				layArmadilhaLuminosa.setVisibility(View.GONE);
			if(varArmadilhaSonifera==0)
				layArmadilhaSonifera.setVisibility(View.GONE);
			if(varArmadilhaCongelante==0)
				layArmadilhaCongelante.setVisibility(View.GONE);
			if(varFe==0)
				layFe.setVisibility(View.GONE);
			if(varCruxDivinum==0)
				layCruxDivinum.setVisibility(View.GONE);
			if(varPunhoFirme==0)
				layPunhoFirme.setVisibility(View.GONE);
			if(varPericiaEmArmamento==0)
				layPericiaEmArmamento.setVisibility(View.GONE);
			if(varPericiaComMachadoEEspada==0)
				layPericiaComMachadoEEspada.setVisibility(View.GONE);
			if(varPunhosDeFerro==0)
				layPunhosDeFerro.setVisibility(View.GONE);
			if(varAbsorverEsferasEspirituais==0)
				layAbsorverEsferasEspirituais.setVisibility(View.GONE);
			if(varInvocarEsferasEspirituais==0)
				layInvocarEsferasEspirituais.setVisibility(View.GONE);
			if(varGracaDivina==0)
				layGracaDivina.setVisibility(View.GONE);
			if(varImpositioManus==0)
				layImpositioManus.setVisibility(View.GONE);
			if(varSantuario==0)
				laySantuario.setVisibility(View.GONE);
			if(varGloria==0)
				layGloria.setVisibility(View.GONE);
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
			if(varEsmagamentoMagico==0)
				layEsmagamentoMagico.setVisibility(View.GONE);
			if(varPantanoDosMortos==0)
				layPantanoDosMortos.setVisibility(View.GONE);
			if(varSentidoSobrenatural==0)
				laySentidoSobrenatural.setVisibility(View.GONE);
			if(varSupernova==0)
				laySupernova.setVisibility(View.GONE);
			if(varEsferaDagua==0)
				layEsferaDagua.setVisibility(View.GONE);

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
						} else {
							Toast.makeText(this, "0 pontos disponiveis", Toast.LENGTH_LONG).show();
						}

					} else if (classe==2){
						if (segundaClasse>0){
							segundaClasse--;
							skillSegunda++;
							habilidade++;
						} else {
							Toast.makeText(this, "0 pontos disponiveis", Toast.LENGTH_LONG).show();
						}

					}
				}

			} else if (acao=="Diminuir"){
				boolean podeDiminuir = true;

				if (nomeDaHabilidade=="Precisao" && varOlhosDeAguia>=1 && varPrecisao<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Precisao" && varConcentracao>=1 && varPrecisao<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OlhosDeAguia" && varConcentracao>=1 && varOlhosDeAguia<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Envenenar" && varDesintoxicar>=1 && varEnvenenar<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Furto" && varEsconderijo>=1 && varFurto<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="GolpeFulminante" && varImpactoExplosivo>=1 && varGolpeFulminante<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Provocar" && varVigor>=1 && varProvocar<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AumentarCapacidadeDeCarga" && varDesconto>=1 && varAumentarCapacidadeDeCarga<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Desconto" && varSuperfaturar>=1 && varDesconto<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AumentarCapacidadeDeCarga" && varUsarCarrinho>=1 && varAumentarCapacidadeDeCarga<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="UsarCarrinho" && varComercio>=1 && varUsarCarrinho<=03){
					podeDiminuir = false;
				}

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

				if (nomeDaHabilidade=="Envenenar" && varEnvenenarArma>=1 && varEnvenenar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Esconderijo" && varTunelDeFuga>=1 && varEsconderijo<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaEscorregadia" && varArmadilhaLuminosa>=1 && varArmadilhaEscorregadia<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaLuminosa" && varArmadilhaSonifera>=1 && varArmadilhaLuminosa<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaLuminosa" && varArmadilhaCongelante>=1 && varArmadilhaLuminosa<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Fe" && varCruxDivinum>=1 && varFe<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhoFirme" && varPericiaEmArmamento>=1 && varPunhoFirme<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FlageloDoMal" && varPunhosDeFerro>=1 && varFlageloDoMal<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ProtecaoDivina" && varPunhosDeFerro>=1 && varProtecaoDivina<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="InvocarEsferasEspirituais" && varAbsorverEsferasEspirituais>=1 && varInvocarEsferasEspirituais<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhosDeFerro" && varInvocarEsferasEspirituais>=1 && varPunhosDeFerro<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Curar" && varSantuario>=1 && varCurar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Santuario" && varGloria>=1 && varSantuario<=07){
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

				if (nomeDaHabilidade=="AumentarRecuperacaoDeSP" && varEsmagamentoMagico>=1 && varAumentarRecuperacaoDeSP<=01){
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

				if (nomeDaHabilidade=="LancasDeGelo" && varEsferaDagua>=1 && varLancasDeGelo<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Relampago" && varEsferaDagua>=1 && varRelampago<=01){
					podeDiminuir = false;
				}


				if(podeDiminuir){
					if (habilidade>0){
						habilidade--;

						if (classe==1){
							if (skillPrimeira>0 && skillPrimeira<=98 && primeiraClasse <98){
								primeiraClasse++;
							} else if ((segundaClasse+skillSegunda)<49){
								segundaClasse++;
							}
							skillPrimeira--;
						} else if (classe==2){
							if (skillSegunda>0 && skillSegunda<=49 && segundaClasse <49){
								segundaClasse++;
							}
							skillSegunda--;
						}
					}

				} else {
					Toast.makeText(this, "Essa Habilidade é pré requisito de outra já aprendia", Toast.LENGTH_LONG).show();
				}

				podeDiminuir=true;
			}
			if(nomeDaHabilidade=="Precisao"){
				varPrecisao = habilidade;
			} else if(nomeDaHabilidade=="OlhosDeAguia"){
				varOlhosDeAguia = habilidade;
			} else if(nomeDaHabilidade=="Concentracao"){
				varConcentracao = habilidade;
			} else if(nomeDaHabilidade=="Envenenar"){
				varEnvenenar = habilidade;
			} else if(nomeDaHabilidade=="Desintoxicar"){
				varDesintoxicar = habilidade;
			} else if(nomeDaHabilidade=="AtaqueDuplo"){
				varAtaqueDuplo = habilidade;
			} else if(nomeDaHabilidade=="PericiaEmEsquiva"){
				varPericiaEmEsquiva = habilidade;
			} else if(nomeDaHabilidade=="Furto"){
				varFurto = habilidade;
			} else if(nomeDaHabilidade=="Esconderijo"){
				varEsconderijo = habilidade;
			} else if(nomeDaHabilidade=="PericiaComEspada"){
				varPericiaComEspada = habilidade;
			} else if(nomeDaHabilidade=="AumentarRecuperacaoDeHP"){
				varAumentarRecuperacaoDeHP = habilidade;
			} else if(nomeDaHabilidade=="GolpeFulminante"){
				varGolpeFulminante = habilidade;
			} else if(nomeDaHabilidade=="Provocar"){
				varProvocar = habilidade;
			} else if(nomeDaHabilidade=="ImpactoExplosivo"){
				varImpactoExplosivo = habilidade;
			} else if(nomeDaHabilidade=="Vigor"){
				varVigor = habilidade;
			} else if(nomeDaHabilidade=="Mammonita"){
				varMammonita = habilidade;
			} else if(nomeDaHabilidade=="Desconto"){
				varDesconto = habilidade;
			} else if(nomeDaHabilidade=="Superfaturar"){
				varSuperfaturar = habilidade;
			} else if(nomeDaHabilidade=="AumentarCapacidadeDeCarga"){
				varAumentarCapacidadeDeCarga = habilidade;
			} else if(nomeDaHabilidade=="UsarCarrinho"){
				varUsarCarrinho = habilidade;
			} else if(nomeDaHabilidade=="Comercio"){
				varComercio = habilidade;
			} else if(nomeDaHabilidade=="IdentificarItem"){
				varIdentificarItem = habilidade;
			} else if(nomeDaHabilidade=="LancasDeGelo"){
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
			} else if(nomeDaHabilidade=="ProtecaoDivina"){
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

			else if(nomeDaHabilidade=="EnvenenarArma"){
				varEnvenenarArma = habilidade;
			} else if(nomeDaHabilidade=="TunelDeFuga"){
				varTunelDeFuga = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaEscorregadia"){
				varArmadilhaEscorregadia = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaLuminosa"){
				varArmadilhaLuminosa = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaSonifera"){
				varArmadilhaSonifera = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaCongelante"){
				varArmadilhaCongelante = habilidade;
			} else if(nomeDaHabilidade=="Fe"){
				varFe = habilidade;
			} else if(nomeDaHabilidade=="CruxDivinum"){
				varCruxDivinum = habilidade;
			} else if(nomeDaHabilidade=="PunhoFirme"){
				varPunhoFirme = habilidade;
			} else if(nomeDaHabilidade=="PericiaEmArmamento"){
				varPericiaEmArmamento = habilidade;
			} else if(nomeDaHabilidade=="PericiaComMachadoEEspada"){
				varPericiaComMachadoEEspada = habilidade;
			} else if(nomeDaHabilidade=="PunhosDeFerro"){
				varPunhosDeFerro = habilidade;
			} else if(nomeDaHabilidade=="AbsorverEsferasEspirituais"){
				varAbsorverEsferasEspirituais = habilidade;
			} else if(nomeDaHabilidade=="InvocarEsferasEspirituais"){
				varInvocarEsferasEspirituais = habilidade;
			} else if(nomeDaHabilidade=="GracaDivina"){
				varGracaDivina = habilidade;
			} else if(nomeDaHabilidade=="ImpositioManus"){
				varImpositioManus = habilidade;
			} else if(nomeDaHabilidade=="Santuario"){
				varSantuario = habilidade;
			} else if(nomeDaHabilidade=="Gloria"){
				varGloria = habilidade;
			} else if(nomeDaHabilidade=="ColunaDePedra"){
				varColunaDePedra = habilidade;
			} else if(nomeDaHabilidade=="ColunaDeFogo"){
				varColunaDeFogo = habilidade;
			} else if(nomeDaHabilidade=="Congelar"){
				varCongelar = habilidade;
			} else if(nomeDaHabilidade=="FuriaDaTerra"){
				varFuriaDaTerra = habilidade;
			} else if(nomeDaHabilidade=="BarreiraDeGelo"){
				varBarreiraDeGelo = habilidade;
			} else if(nomeDaHabilidade=="EsmagamentoMagico"){
				varEsmagamentoMagico = habilidade;
			} else if(nomeDaHabilidade=="PantanoDosMortos"){
				varPantanoDosMortos = habilidade;
			} else if(nomeDaHabilidade=="SentidoSobrenatural"){
				varSentidoSobrenatural = habilidade;
			} else if(nomeDaHabilidade=="Supernova"){
				varSupernova = habilidade;
			} else if(nomeDaHabilidade=="EsferaDagua"){
				varEsferaDagua = habilidade;
			}

			atualizarTela();

		}

		public void atualizarTela(){
			txtPrecisaoPontos.setText(varPrecisao + "/10");
			txtOlhosDeAguiaPontos.setText(varOlhosDeAguia + "/10");
			txtConcentracaoPontos.setText(varConcentracao + "/10");
			txtEnvenenarPontos.setText(varEnvenenar + "/10");
			txtDesintoxicarPontos.setText(varDesintoxicar + "/1");
			txtAtaqueDuploPontos.setText(varAtaqueDuplo + "/10");
			txtPericiaEmEsquivaPontos.setText(varPericiaEmEsquiva + "/10");
			txtFurtoPontos.setText(varFurto + "/10");
			txtEsconderijoPontos.setText(varEsconderijo + "/10");
			txtPericiaComEspadaPontos.setText(varPericiaComEspada + "/10");
			txtAumentarRecuperacaoDeHPPontos.setText(varAumentarRecuperacaoDeHP + "/10");
			txtGolpeFulminantePontos.setText(varGolpeFulminante + "/10");
			txtProvocarPontos.setText(varProvocar + "/10");
			txtImpactoExplosivoPontos.setText(varImpactoExplosivo + "/10");
			txtVigorPontos.setText(varVigor + "/10");
			txtMammonitaPontos.setText(varMammonita + "/10");
			txtDescontoPontos.setText(varDesconto + "/10");
			txtSuperfaturarPontos.setText(varSuperfaturar + "/10");
			txtAumentarCapacidadeDeCargaPontos.setText(varAumentarCapacidadeDeCarga + "/10");
			txtUsarCarrinhoPontos.setText(varUsarCarrinho + "/10");
			txtComercioPontos.setText(varComercio + "/10");
			txtIdentificarItemPontos.setText(varIdentificarItem + "/1");
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

			txtEnvenenarArmaPontos.setText(varEnvenenarArma + "/10");
			txtTunelDeFugaPontos.setText(varTunelDeFuga + "/5");
			txtArmadilhaEscorregadiaPontos.setText(varArmadilhaEscorregadia + "/5");
			txtArmadilhaLuminosaPontos.setText(varArmadilhaLuminosa + "/5");
			txtArmadilhaSoniferaPontos.setText(varArmadilhaSonifera + "/5");
			txtArmadilhaCongelantePontos.setText(varArmadilhaCongelante + "/5");
			txtFePontos.setText(varFe + "/10");
			txtCruxDivinumPontos.setText(varCruxDivinum + "/10");
			txtPunhoFirmePontos.setText(varPunhoFirme + "/1");
			txtPericiaEmArmamentoPontos.setText(varPericiaEmArmamento + "/10");
			txtPericiaComMachadoEEspadaPontos.setText(varPericiaComMachadoEEspada + "/10");
			txtPunhosDeFerroPontos.setText(varPunhosDeFerro + "/10");
			txtAbsorverEsferasEspirituaisPontos.setText(varAbsorverEsferasEspirituais + "/1");
			txtInvocarEsferasEspirituaisPontos.setText(varInvocarEsferasEspirituais + "/5");
			txtGracaDivinaPontos.setText(varGracaDivina + "/1");
			txtImpositioManusPontos.setText(varImpositioManus + "/5");
			txtSantuarioPontos.setText(varSantuario + "/10");
			txtGloriaPontos.setText(varGloria + "/5");
			txtColunaDePedraPontos.setText(varColunaDePedra + "/5");
			txtColunaDeFogoPontos.setText(varColunaDeFogo + "/10");
			txtCongelarPontos.setText(varCongelar + "/10");
			txtFuriaDaTerraPontos.setText(varFuriaDaTerra + "/5");
			txtBarreiraDeGeloPontos.setText(varBarreiraDeGelo + "/10");
			txtEsmagamentoMagicoPontos.setText(varEsmagamentoMagico + "/1");
			txtPantanoDosMortosPontos.setText(varPantanoDosMortos + "/5");
			txtSentidoSobrenaturalPontos.setText(varSentidoSobrenatural + "/1");
			txtSupernovaPontos.setText(varSupernova + "/10");
			txtEsferaDaguaPontos.setText(varEsferaDagua + "/5");

			txtClasse1.setText("Classe 1: " + primeiraClasse);
			txtClasse2.setText("Classe 2: " + segundaClasse);

			tudoVisivel();
		}

		public void tudoVisivel(){
			layPrecisao.setVisibility(View.VISIBLE);
			layOlhosDeAguia.setVisibility(View.VISIBLE);
			layConcentracao.setVisibility(View.VISIBLE);
			layEnvenenar.setVisibility(View.VISIBLE);
			layDesintoxicar.setVisibility(View.VISIBLE);
			layAtaqueDuplo.setVisibility(View.VISIBLE);
			layPericiaEmEsquiva.setVisibility(View.VISIBLE);
			layFurto.setVisibility(View.VISIBLE);
			layEsconderijo.setVisibility(View.VISIBLE);
			layPericiaComEspada.setVisibility(View.VISIBLE);
			layAumentarRecuperacaoDeHP.setVisibility(View.VISIBLE);
			layGolpeFulminante.setVisibility(View.VISIBLE);
			layProvocar.setVisibility(View.VISIBLE);
			layImpactoExplosivo.setVisibility(View.VISIBLE);
			layVigor.setVisibility(View.VISIBLE);
			layMammonita.setVisibility(View.VISIBLE);
			layDesconto.setVisibility(View.VISIBLE);
			laySuperfaturar.setVisibility(View.VISIBLE);
			layAumentarCapacidadeDeCarga.setVisibility(View.VISIBLE);
			layUsarCarrinho.setVisibility(View.VISIBLE);
			layComercio.setVisibility(View.VISIBLE);
			layIdentificarItem.setVisibility(View.VISIBLE);
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

			layEnvenenarArma.setVisibility(View.VISIBLE);
			layTunelDeFuga.setVisibility(View.VISIBLE);
			layArmadilhaEscorregadia.setVisibility(View.VISIBLE);
			layArmadilhaLuminosa.setVisibility(View.VISIBLE);
			layArmadilhaSonifera.setVisibility(View.VISIBLE);
			layArmadilhaCongelante.setVisibility(View.VISIBLE);
			layFe.setVisibility(View.VISIBLE);
			layCruxDivinum.setVisibility(View.VISIBLE);
			layPunhoFirme.setVisibility(View.VISIBLE);
			layPericiaEmArmamento.setVisibility(View.VISIBLE);
			layPericiaComMachadoEEspada.setVisibility(View.VISIBLE);
			layPunhosDeFerro.setVisibility(View.VISIBLE);
			layAbsorverEsferasEspirituais.setVisibility(View.VISIBLE);
			layInvocarEsferasEspirituais.setVisibility(View.VISIBLE);
			layGracaDivina.setVisibility(View.VISIBLE);
			layImpositioManus.setVisibility(View.VISIBLE);
			laySantuario.setVisibility(View.VISIBLE);
			layGloria.setVisibility(View.VISIBLE);
			layColunaDePedra.setVisibility(View.VISIBLE);
			layColunaDeFogo.setVisibility(View.VISIBLE);
			layCongelar.setVisibility(View.VISIBLE);
			layFuriaDaTerra.setVisibility(View.VISIBLE);
			layBarreiraDeGelo.setVisibility(View.VISIBLE);
			layEsmagamentoMagico.setVisibility(View.VISIBLE);
			layPantanoDosMortos.setVisibility(View.VISIBLE);
			laySentidoSobrenatural.setVisibility(View.VISIBLE);
			laySupernova.setVisibility(View.VISIBLE);
			layEsferaDagua.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM super_aprendiz_expandido WHERE _id = ?", new String[]{String.valueOf(id)});

			if(cs.moveToFirst()){
			primeiraClasse = cs.getInt(2);
			segundaClasse = cs.getInt(3);

			varPrecisao = cs.getInt(4);
			varOlhosDeAguia = cs.getInt(5);
			varConcentracao = cs.getInt(6);
			varEnvenenar = cs.getInt(7);
			varDesintoxicar = cs.getInt(8);
			varAtaqueDuplo = cs.getInt(9);
			varPericiaEmEsquiva = cs.getInt(10);
			varFurto = cs.getInt(11);
			varEsconderijo = cs.getInt(12);
			varPericiaComEspada = cs.getInt(13);
			varAumentarRecuperacaoDeHP = cs.getInt(14);
			varGolpeFulminante = cs.getInt(15);
			varProvocar = cs.getInt(16);
			varImpactoExplosivo = cs.getInt(17);
			varVigor = cs.getInt(18);
			varMammonita = cs.getInt(19);
			varDesconto = cs.getInt(20);
			varSuperfaturar = cs.getInt(21);
			varAumentarCapacidadeDeCarga = cs.getInt(22);
			varUsarCarrinho = cs.getInt(23);
			varComercio = cs.getInt(24);
			varIdentificarItem = cs.getInt(25);
			varLancasDeGelo = cs.getInt(26);
			varBolasDeFogo = cs.getInt(27);
			varLancasDeFogo = cs.getInt(28);
			varBarreiraDeFogo = cs.getInt(29);
			varRajadaCongelante = cs.getInt(30);
			varAumentarRecuperacaoDeSP = cs.getInt(31);
			varRelampago = cs.getInt(32);
			varAtaqueEspiritual = cs.getInt(33);
			varEscudoMagico = cs.getInt(34);
			varChamaReveladora = cs.getInt(35);
			varEspiritosAncioes = cs.getInt(36);
			varPetrificar = cs.getInt(37);
			varTempestadeDeRaios = cs.getInt(38);
			varProtecaoDivina = cs.getInt(39);
			varFlageloDoMal = cs.getInt(40);
			varSignumCrucis = cs.getInt(41);
			varAngelus = cs.getInt(42);
			varBencao = cs.getInt(43);
			varCurar = cs.getInt(44);
			varAumentarAgilidade = cs.getInt(45);
			varDiminuirAgilidade = cs.getInt(46);
			varAquaBenedicta = cs.getInt(47);
			varTeleporte = cs.getInt(48);
			varPortal = cs.getInt(49);
			varRevelacao = cs.getInt(50);
			varEscudoSagrado = cs.getInt(51);
			varMedicar = cs.getInt(52);

			varEnvenenarArma = cs.getInt(53);
			varTunelDeFuga = cs.getInt(54);
			varArmadilhaEscorregadia = cs.getInt(55);
			varArmadilhaLuminosa = cs.getInt(56);
			varArmadilhaSonifera = cs.getInt(57);
			varArmadilhaCongelante = cs.getInt(58);
			varFe = cs.getInt(59);
			varCruxDivinum = cs.getInt(60);
			varPunhoFirme = cs.getInt(61);
			varPericiaEmArmamento = cs.getInt(62);
			varPericiaComMachadoEEspada = cs.getInt(63);
			varPunhosDeFerro = cs.getInt(64);
			varAbsorverEsferasEspirituais = cs.getInt(65);
			varInvocarEsferasEspirituais = cs.getInt(66);
			varGracaDivina = cs.getInt(67);
			varImpositioManus = cs.getInt(68);
			varSantuario = cs.getInt(69);
			varGloria = cs.getInt(70);
			varColunaDePedra = cs.getInt(71);
			varColunaDeFogo = cs.getInt(72);
			varCongelar = cs.getInt(73);
			varFuriaDaTerra = cs.getInt(74);
			varBarreiraDeGelo = cs.getInt(75);
			varEsmagamentoMagico = cs.getInt(76);
			varPantanoDosMortos = cs.getInt(77);
			varSentidoSobrenatural = cs.getInt(78);
			varSupernova = cs.getInt(79);
			varEsferaDagua = cs.getInt(80);

			skillPrimeira = cs.getInt(81);
			skillSegunda = cs.getInt(82);
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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS super_aprendiz_expandido (");
					sqlClasse.append("_id INTEGER PRIMARY KEY, ");
					sqlClasse.append("nome VARCHAR(30), ");
					sqlClasse.append("primeira_classe INT(2), ");
					sqlClasse.append("segunda_classe INT(2), ");
					sqlClasse.append("skill_precisao INT(2), ");
					sqlClasse.append("skill_olhosdeaguia INT(2), ");
					sqlClasse.append("skill_concentracao INT(2), ");
					sqlClasse.append("skill_envenenar INT(2), ");
					sqlClasse.append("skill_desintoxicar INT(2), ");
					sqlClasse.append("skill_ataqueduplo INT(2), ");
					sqlClasse.append("skill_periciaemesquiva INT(2), ");
					sqlClasse.append("skill_furto INT(2), ");
					sqlClasse.append("skill_esconderijo INT(2), ");
					sqlClasse.append("skill_periciacomespada INT(2), ");
					sqlClasse.append("skill_aumentarrecuperacaodehp INT(2), ");
					sqlClasse.append("skill_golpefulminante INT(2), ");
					sqlClasse.append("skill_provocar INT(2), ");
					sqlClasse.append("skill_impactoexplosivo INT(2), ");
					sqlClasse.append("skill_vigor INT(2), ");
					sqlClasse.append("skill_mammonita INT(2), ");
					sqlClasse.append("skill_desconto INT(2), ");
					sqlClasse.append("skill_superfaturar INT(2), ");
					sqlClasse.append("skill_aumentarcapacidadedecarga INT(2), ");
					sqlClasse.append("skill_usarcarrinho INT(2), ");
					sqlClasse.append("skill_comercio INT(2), ");
					sqlClasse.append("skill_identificaritem INT(2), ");
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
					sqlClasse.append("skill_envenenararma INT(2), ");
					sqlClasse.append("skill_tuneldefuga INT(2), ");
					sqlClasse.append("skill_armadilhaescorregadia INT(2), ");
					sqlClasse.append("skill_armadilhaluminosa INT(2), ");
					sqlClasse.append("skill_armadilhasonifera INT(2), ");
					sqlClasse.append("skill_armadilhacongelante INT(2), ");
					sqlClasse.append("skill_fe INT(2), ");
					sqlClasse.append("skill_cruxdivinum INT(2), ");
					sqlClasse.append("skill_punhofirme INT(2), ");
					sqlClasse.append("skill_periciaemarmamento INT(2), ");
					sqlClasse.append("skill_periciacommachadoeespada INT(2), ");
					sqlClasse.append("skill_punhosdeferro INT(2), ");
					sqlClasse.append("skill_absorveresferasespirituais INT(2), ");
					sqlClasse.append("skill_invocaresferasespirituais INT(2), ");
					sqlClasse.append("skill_gracadivina INT(2), ");
					sqlClasse.append("skill_impositiomanus INT(2), ");
					sqlClasse.append("skill_santuario INT(2), ");
					sqlClasse.append("skill_gloria INT(2), ");
					sqlClasse.append("skill_colunadepedra INT(2), ");
					sqlClasse.append("skill_colunadefogo INT(2), ");
					sqlClasse.append("skill_congelar INT(2), ");
					sqlClasse.append("skill_furiadaterra INT(2), ");
					sqlClasse.append("skill_barreiradegelo INT(2), ");
					sqlClasse.append("skill_esmagamentomagico INT(2), ");
					sqlClasse.append("skill_pantanodosmortos INT(2), ");
					sqlClasse.append("skill_sentidosobrenatural INT(2), ");
					sqlClasse.append("skill_supernova INT(2), ");
					sqlClasse.append("skill_esferadagua INT(2), ");
					sqlClasse.append("skill_primeira INT(2), ");
					sqlClasse.append("skill_segunda INT(2));");
					db.execSQL(sqlClasse.toString());

					ContentValues ins = new ContentValues();
					ins.put("nome", nomeDaSim);
					ins.put("primeira_classe", primeiraClasse);
					ins.put("segunda_classe", segundaClasse);
					ins.put("skill_precisao", varPrecisao);
					ins.put("skill_olhosdeaguia", varOlhosDeAguia);
					ins.put("skill_concentracao", varConcentracao);
					ins.put("skill_envenenar", varEnvenenar);
					ins.put("skill_desintoxicar", varDesintoxicar);
					ins.put("skill_ataqueduplo", varAtaqueDuplo);
					ins.put("skill_periciaemesquiva", varPericiaEmEsquiva);
					ins.put("skill_furto", varFurto);
					ins.put("skill_esconderijo", varEsconderijo);
					ins.put("skill_periciacomespada", varPericiaComEspada);
					ins.put("skill_aumentarrecuperacaodehp", varAumentarRecuperacaoDeHP);
					ins.put("skill_golpefulminante", varGolpeFulminante);
					ins.put("skill_provocar", varProvocar);
					ins.put("skill_impactoexplosivo", varImpactoExplosivo);
					ins.put("skill_vigor", varVigor);
					ins.put("skill_mammonita", varMammonita);
					ins.put("skill_desconto", varDesconto);
					ins.put("skill_superfaturar", varSuperfaturar);
					ins.put("skill_aumentarcapacidadedecarga", varAumentarCapacidadeDeCarga);
					ins.put("skill_usarcarrinho", varUsarCarrinho);
					ins.put("skill_comercio", varComercio);
					ins.put("skill_identificaritem", varIdentificarItem);
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
					ins.put("skill_envenenararma", varEnvenenarArma);
					ins.put("skill_tuneldefuga", varTunelDeFuga);
					ins.put("skill_armadilhaescorregadia", varArmadilhaEscorregadia);
					ins.put("skill_armadilhaluminosa", varArmadilhaLuminosa);
					ins.put("skill_armadilhasonifera", varArmadilhaSonifera);
					ins.put("skill_armadilhacongelante", varArmadilhaCongelante);
					ins.put("skill_fe", varFe);
					ins.put("skill_cruxdivinum", varCruxDivinum);
					ins.put("skill_punhofirme", varPunhoFirme);
					ins.put("skill_periciaemarmamento", varPericiaEmArmamento);
					ins.put("skill_periciacommachadoeespada", varPericiaComMachadoEEspada);
					ins.put("skill_punhosdeferro", varPunhosDeFerro);
					ins.put("skill_absorveresferasespirituais", varAbsorverEsferasEspirituais);
					ins.put("skill_invocaresferasespirituais", varInvocarEsferasEspirituais);
					ins.put("skill_gracadivina", varGracaDivina);
					ins.put("skill_impositiomanus", varImpositioManus);
					ins.put("skill_santuario", varSantuario);
					ins.put("skill_gloria", varGloria);
					ins.put("skill_colunadepedra", varColunaDePedra);
					ins.put("skill_colunadefogo", varColunaDeFogo);
					ins.put("skill_congelar", varCongelar);
					ins.put("skill_furiadaterra", varFuriaDaTerra);
					ins.put("skill_barreiradegelo", varBarreiraDeGelo);
					ins.put("skill_esmagamentomagico", varEsmagamentoMagico);
					ins.put("skill_pantanodosmortos", varPantanoDosMortos);
					ins.put("skill_sentidosobrenatural", varSentidoSobrenatural);
					ins.put("skill_supernova", varSupernova);
					ins.put("skill_esferadagua", varEsferaDagua);
					ins.put("skill_primeira", skillPrimeira);
					ins.put("skill_segunda", skillSegunda);
					if(!novo){
						try {
							db.update("super_aprendiz_expandido", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("super_aprendiz_expandido", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from super_aprendiz_expandido", null);
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
						ins2.put("classe", "super aprendiz expandido");
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