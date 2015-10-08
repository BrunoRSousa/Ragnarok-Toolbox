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

public class SimuladorMecanico extends Activity {

		//Botões de interrogação
		Button btMammonitaInterrogacao,
		btDescontoInterrogacao,
		btSuperfaturarInterrogacao,
		btAumentarCapacidadeDeCargaInterrogacao,
		btUsarCarrinhoInterrogacao,
		btComercioInterrogacao,
		btIdentificarItemInterrogacao,
		btGritoDeGuerraInterrogacao,
		btPersonalizarCarrinhoInterrogacao,
		btCavaloDePauInterrogacao,
		btAdrenalinaPuraInterrogacao,
		btMarteloDeThorInterrogacao,
		btPunhoFirmeInterrogacao,
		btAmplificarPoderInterrogacao,
		btForcaViolentaInterrogacao,
		btResistenciaAoFogoInterrogacao,
		btManejoPerfeitoInterrogacao,
		btConsertarArmaInterrogacao,
		btPericiaEmArmamentoInterrogacao,
		btEncontrarMinerioInterrogacao,
		btVendaDuvidosaInterrogacao,
		btGananciaInterrogacao,
		btAdrenalinaConcentradaInterrogacao,
		btProduzirPedraFundamentalInterrogacao,
		btTrabalharFerroInterrogacao,
		btTrabalharAcoInterrogacao,
		btPericiaComOrideconInterrogacao,
		btForjarMachadoInterrogacao,
		btForjarAdagaInterrogacao,
		btForjarSoqueiraInterrogacao,
		btForjarMacaInterrogacao,
		btForjarLancaInterrogacao,
		btForjarEspadaInterrogacao,
		btForjarEspadaDeDuasMaosInterrogacao,
		btImpulsoNoCarrinhoInterrogacao,
		btChoqueDoCarrinhoInterrogacao,
		btForcaViolentissimaInterrogacao,
		btGolpeEstilhacanteInterrogacao,
		btAprimorarArmamentoInterrogacao,
		btMaestriaComMachadosInterrogacao,
		btArremessoDeMachadoInterrogacao,
		btFuriaDoFuracaoInterrogacao,
		btBrandirMachadoInterrogacao,
		btSabedoriaDeHefestoInterrogacao,
		btArtilhariaCacadoraInterrogacao,
		btArtilhariaArcanaInterrogacao,
		btRemoverArtilhariaInterrogacao,
		btLicencaDePilotagemInterrogacao,
		btRepararInterrogacao,
		btPunhoFogueteInterrogacao,
		btBateEstacaInterrogacao,
		btMetralhadoraInterrogacao,
		btLancaChamasInterrogacao,
		btGasCriogenicoInterrogacao,
		btCanhaoInterrogacao,
		btAceleracaoInterrogacao,
		btPlanarInterrogacao,
		btPropulsaoDianteiraInterrogacao,
		btPropulsaoTraseiraInterrogacao,
		btReforcarEstruturaInterrogacao,
		btAutodestruicaoInterrogacao,
		btResfriamentoInterrogacao,
		btCampoMagneticoInterrogacao,
		btCampoProtetorInterrogacao,
		btReconfigurarElementoInterrogacao,
		btSensorInfravermelhoInterrogacao,
		btAnalisarInterrogacao,
		btCampoDeInvisibilidadeInterrogacao;

		//Botões de diminuir habilidades
		Button btMammonitaDiminuir,
		btDescontoDiminuir,
		btSuperfaturarDiminuir,
		btAumentarCapacidadeDeCargaDiminuir,
		btUsarCarrinhoDiminuir,
		btComercioDiminuir,
		btIdentificarItemDiminuir,
		btAdrenalinaPuraDiminuir,
		btMarteloDeThorDiminuir,
		btPunhoFirmeDiminuir,
		btAmplificarPoderDiminuir,
		btForcaViolentaDiminuir,
		btResistenciaAoFogoDiminuir,
		btManejoPerfeitoDiminuir,
		btConsertarArmaDiminuir,
		btPericiaEmArmamentoDiminuir,
		btEncontrarMinerioDiminuir,
		btProduzirPedraFundamentalDiminuir,
		btTrabalharFerroDiminuir,
		btTrabalharAcoDiminuir,
		btPericiaComOrideconDiminuir,
		btForjarMachadoDiminuir,
		btForjarAdagaDiminuir,
		btForjarSoqueiraDiminuir,
		btForjarMacaDiminuir,
		btForjarLancaDiminuir,
		btForjarEspadaDiminuir,
		btForjarEspadaDeDuasMaosDiminuir,
		btImpulsoNoCarrinhoDiminuir,
		btChoqueDoCarrinhoDiminuir,
		btForcaViolentissimaDiminuir,
		btGolpeEstilhacanteDiminuir,
		btAprimorarArmamentoDiminuir,
		btMaestriaComMachadosDiminuir,
		btArremessoDeMachadoDiminuir,
		btFuriaDoFuracaoDiminuir,
		btBrandirMachadoDiminuir,
		btSabedoriaDeHefestoDiminuir,
		btArtilhariaCacadoraDiminuir,
		btArtilhariaArcanaDiminuir,
		btRemoverArtilhariaDiminuir,
		btLicencaDePilotagemDiminuir,
		btRepararDiminuir,
		btPunhoFogueteDiminuir,
		btBateEstacaDiminuir,
		btMetralhadoraDiminuir,
		btLancaChamasDiminuir,
		btGasCriogenicoDiminuir,
		btCanhaoDiminuir,
		btAceleracaoDiminuir,
		btPlanarDiminuir,
		btPropulsaoDianteiraDiminuir,
		btPropulsaoTraseiraDiminuir,
		btReforcarEstruturaDiminuir,
		btAutodestruicaoDiminuir,
		btResfriamentoDiminuir,
		btCampoMagneticoDiminuir,
		btCampoProtetorDiminuir,
		btReconfigurarElementoDiminuir,
		btSensorInfravermelhoDiminuir,
		btAnalisarDiminuir,
		btCampoDeInvisibilidadeDiminuir;

		//Botões de aumentar habilidades
		Button btMammonitaAumentar,
		btDescontoAumentar,
		btSuperfaturarAumentar,
		btAumentarCapacidadeDeCargaAumentar,
		btUsarCarrinhoAumentar,
		btComercioAumentar,
		btIdentificarItemAumentar,
		btAdrenalinaPuraAumentar,
		btMarteloDeThorAumentar,
		btPunhoFirmeAumentar,
		btAmplificarPoderAumentar,
		btForcaViolentaAumentar,
		btResistenciaAoFogoAumentar,
		btManejoPerfeitoAumentar,
		btConsertarArmaAumentar,
		btPericiaEmArmamentoAumentar,
		btEncontrarMinerioAumentar,
		btProduzirPedraFundamentalAumentar,
		btTrabalharFerroAumentar,
		btTrabalharAcoAumentar,
		btPericiaComOrideconAumentar,
		btForjarMachadoAumentar,
		btForjarAdagaAumentar,
		btForjarSoqueiraAumentar,
		btForjarMacaAumentar,
		btForjarLancaAumentar,
		btForjarEspadaAumentar,
		btForjarEspadaDeDuasMaosAumentar,
		btImpulsoNoCarrinhoAumentar,
		btChoqueDoCarrinhoAumentar,
		btForcaViolentissimaAumentar,
		btGolpeEstilhacanteAumentar,
		btAprimorarArmamentoAumentar,
		btMaestriaComMachadosAumentar,
		btArremessoDeMachadoAumentar,
		btFuriaDoFuracaoAumentar,
		btBrandirMachadoAumentar,
		btSabedoriaDeHefestoAumentar,
		btArtilhariaCacadoraAumentar,
		btArtilhariaArcanaAumentar,
		btRemoverArtilhariaAumentar,
		btLicencaDePilotagemAumentar,
		btRepararAumentar,
		btPunhoFogueteAumentar,
		btBateEstacaAumentar,
		btMetralhadoraAumentar,
		btLancaChamasAumentar,
		btGasCriogenicoAumentar,
		btCanhaoAumentar,
		btAceleracaoAumentar,
		btPlanarAumentar,
		btPropulsaoDianteiraAumentar,
		btPropulsaoTraseiraAumentar,
		btReforcarEstruturaAumentar,
		btAutodestruicaoAumentar,
		btResfriamentoAumentar,
		btCampoMagneticoAumentar,
		btCampoProtetorAumentar,
		btReconfigurarElementoAumentar,
		btSensorInfravermelhoAumentar,
		btAnalisarAumentar,
		btCampoDeInvisibilidadeAumentar;

		//Resto dos botões
		Button btResetar, btSalvar, btSalvarIMG;
		ToggleButton tgbtSomenteHabilidadeAprendida;


		//Txt pontos da tela
		TextView txtMammonitaPontos,
		txtDescontoPontos,
		txtSuperfaturarPontos,
		txtAumentarCapacidadeDeCargaPontos,
		txtUsarCarrinhoPontos,
		txtComercioPontos,
		txtIdentificarItemPontos,
		txtAdrenalinaPuraPontos,
		txtMarteloDeThorPontos,
		txtPunhoFirmePontos,
		txtAmplificarPoderPontos,
		txtForcaViolentaPontos,
		txtResistenciaAoFogoPontos,
		txtManejoPerfeitoPontos,
		txtConsertarArmaPontos,
		txtPericiaEmArmamentoPontos,
		txtEncontrarMinerioPontos,
		txtProduzirPedraFundamentalPontos,
		txtTrabalharFerroPontos,
		txtTrabalharAcoPontos,
		txtPericiaComOrideconPontos,
		txtForjarMachadoPontos,
		txtForjarAdagaPontos,
		txtForjarSoqueiraPontos,
		txtForjarMacaPontos,
		txtForjarLancaPontos,
		txtForjarEspadaPontos,
		txtForjarEspadaDeDuasMaosPontos,
		txtImpulsoNoCarrinhoPontos,
		txtChoqueDoCarrinhoPontos,
		txtForcaViolentissimaPontos,
		txtGolpeEstilhacantePontos,
		txtAprimorarArmamentoPontos,
		txtMaestriaComMachadosPontos,
		txtArremessoDeMachadoPontos,
		txtFuriaDoFuracaoPontos,
		txtBrandirMachadoPontos,
		txtSabedoriaDeHefestoPontos,
		txtArtilhariaCacadoraPontos,
		txtArtilhariaArcanaPontos,
		txtRemoverArtilhariaPontos,
		txtLicencaDePilotagemPontos,
		txtRepararPontos,
		txtPunhoFoguetePontos,
		txtBateEstacaPontos,
		txtMetralhadoraPontos,
		txtLancaChamasPontos,
		txtGasCriogenicoPontos,
		txtCanhaoPontos,
		txtAceleracaoPontos,
		txtPlanarPontos,
		txtPropulsaoDianteiraPontos,
		txtPropulsaoTraseiraPontos,
		txtReforcarEstruturaPontos,
		txtAutodestruicaoPontos,
		txtResfriamentoPontos,
		txtCampoMagneticoPontos,
		txtCampoProtetorPontos,
		txtReconfigurarElementoPontos,
		txtSensorInfravermelhoPontos,
		txtAnalisarPontos,
		txtCampoDeInvisibilidadePontos;

		//Txt pontos restantes
		TextView txtClasse1, txtClasse2, txtTransClasse, txtClasse3;

		//Layouts
		LinearLayout layMammonita,
		layDesconto,
		laySuperfaturar,
		layAumentarCapacidadeDeCarga,
		layUsarCarrinho,
		layComercio,
		layIdentificarItem,
		layAdrenalinaPura,
		layMarteloDeThor,
		layPunhoFirme,
		layAmplificarPoder,
		layForcaViolenta,
		layResistenciaAoFogo,
		layManejoPerfeito,
		layConsertarArma,
		layPericiaEmArmamento,
		layEncontrarMinerio,
		layProduzirPedraFundamental,
		layTrabalharFerro,
		layTrabalharAco,
		layPericiaComOridecon,
		layForjarMachado,
		layForjarAdaga,
		layForjarSoqueira,
		layForjarMaca,
		layForjarLanca,
		layForjarEspada,
		layForjarEspadaDeDuasMaos,
		layImpulsoNoCarrinho,
		layChoqueDoCarrinho,
		layForcaViolentissima,
		layGolpeEstilhacante,
		layAprimorarArmamento,
		layMaestriaComMachados,
		layArremessoDeMachado,
		layFuriaDoFuracao,
		layBrandirMachado,
		laySabedoriaDeHefesto,
		layArtilhariaCacadora,
		layArtilhariaArcana,
		layRemoverArtilharia,
		layLicencaDePilotagem,
		layReparar,
		layPunhoFoguete,
		layBateEstaca,
		layMetralhadora,
		layLancaChamas,
		layGasCriogenico,
		layCanhao,
		layAceleracao,
		layPlanar,
		layPropulsaoDianteira,
		layPropulsaoTraseira,
		layReforcarEstrutura,
		layAutodestruicao,
		layResfriamento,
		layCampoMagnetico,
		layCampoProtetor,
		layReconfigurarElemento,
		laySensorInfravermelho,
		layAnalisar,
		layCampoDeInvisibilidade;

		//Variaveis de Skill
		int varMammonita,
		varDesconto,
		varSuperfaturar,
		varAumentarCapacidadeDeCarga,
		varUsarCarrinho,
		varComercio,
		varIdentificarItem,
		varAdrenalinaPura,
		varMarteloDeThor,
		varPunhoFirme,
		varAmplificarPoder,
		varForcaViolenta,
		varResistenciaAoFogo,
		varManejoPerfeito,
		varConsertarArma,
		varPericiaEmArmamento,
		varEncontrarMinerio,
		varProduzirPedraFundamental,
		varTrabalharFerro,
		varTrabalharAco,
		varPericiaComOridecon,
		varForjarMachado,
		varForjarAdaga,
		varForjarSoqueira,
		varForjarMaca,
		varForjarLanca,
		varForjarEspada,
		varForjarEspadaDeDuasMaos,
		varImpulsoNoCarrinho,
		varChoqueDoCarrinho,
		varForcaViolentissima,
		varGolpeEstilhacante,
		varAprimorarArmamento,
		varMaestriaComMachados,
		varArremessoDeMachado,
		varFuriaDoFuracao,
		varBrandirMachado,
		varSabedoriaDeHefesto,
		varArtilhariaCacadora,
		varArtilhariaArcana,
		varRemoverArtilharia,
		varLicencaDePilotagem,
		varReparar,
		varPunhoFoguete,
		varBateEstaca,
		varMetralhadora,
		varLancaChamas,
		varGasCriogenico,
		varCanhao,
		varAceleracao,
		varPlanar,
		varPropulsaoDianteira,
		varPropulsaoTraseira,
		varReforcarEstrutura,
		varAutodestruicao,
		varResfriamento,
		varCampoMagnetico,
		varCampoProtetor,
		varReconfigurarElemento,
		varSensorInfravermelho,
		varAnalisar,
		varCampoDeInvisibilidade;

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
			setContentView(R.layout.activity_simulador_mecanico);

			Intent it = getIntent();

			final int id = it.getIntExtra("id", 0);
			idParaAlterar = "_id =" +id;

			//inicialização de variáveis
			varMammonita = 0;
			varDesconto = 0;
			varSuperfaturar = 0;
			varAumentarCapacidadeDeCarga = 0;
			varUsarCarrinho = 0;
			varComercio = 0;
			varIdentificarItem = 0;
			varAdrenalinaPura = 0;
			varMarteloDeThor = 0;
			varPunhoFirme = 0;
			varAmplificarPoder = 0;
			varForcaViolenta = 0;
			varResistenciaAoFogo = 0;
			varManejoPerfeito = 0;
			varConsertarArma = 0;
			varPericiaEmArmamento = 0;
			varEncontrarMinerio = 0;
			varProduzirPedraFundamental = 0;
			varTrabalharFerro = 0;
			varTrabalharAco = 0;
			varPericiaComOridecon = 0;
			varForjarMachado = 0;
			varForjarAdaga = 0;
			varForjarSoqueira = 0;
			varForjarMaca = 0;
			varForjarLanca = 0;
			varForjarEspada = 0;
			varForjarEspadaDeDuasMaos = 0;
			varImpulsoNoCarrinho = 0;
			varChoqueDoCarrinho = 0;
			varForcaViolentissima = 0;
			varGolpeEstilhacante = 0;
			varAprimorarArmamento = 0;
			varMaestriaComMachados = 0;
			varArremessoDeMachado = 0;
			varFuriaDoFuracao = 0;
			varBrandirMachado = 0;
			varSabedoriaDeHefesto = 0;
			varArtilhariaCacadora = 0;
			varArtilhariaArcana = 0;
			varRemoverArtilharia = 0;
			varLicencaDePilotagem = 0;
			varReparar = 0;
			varPunhoFoguete = 0;
			varBateEstaca = 0;
			varMetralhadora = 0;
			varLancaChamas = 0;
			varGasCriogenico = 0;
			varCanhao = 0;
			varAceleracao = 0;
			varPlanar = 0;
			varPropulsaoDianteira = 0;
			varPropulsaoTraseira = 0;
			varReforcarEstrutura = 0;
			varAutodestruicao = 0;
			varResfriamento = 0;
			varCampoMagnetico = 0;
			varCampoProtetor = 0;
			varReconfigurarElemento = 0;
			varSensorInfravermelho = 0;
			varAnalisar = 0;
			varCampoDeInvisibilidade = 0;



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
			btMammonitaInterrogacao = (Button) findViewById(R.id.btMammonitaInterrogacao);
			btDescontoInterrogacao = (Button) findViewById(R.id.btDescontoInterrogacao);
			btSuperfaturarInterrogacao = (Button) findViewById(R.id.btSuperfaturarInterrogacao);
			btAumentarCapacidadeDeCargaInterrogacao = (Button) findViewById(R.id.btAumentarCapacidadeDeCargaInterrogacao);
			btUsarCarrinhoInterrogacao = (Button) findViewById(R.id.btUsarCarrinhoInterrogacao);
			btComercioInterrogacao = (Button) findViewById(R.id.btComercioInterrogacao);
			btIdentificarItemInterrogacao = (Button) findViewById(R.id.btIdentificarItemInterrogacao);
			btGritoDeGuerraInterrogacao = (Button) findViewById(R.id.btGritoDeGuerraInterrogacao);
			btPersonalizarCarrinhoInterrogacao = (Button) findViewById(R.id.btPersonalizarCarrinhoInterrogacao);
			btCavaloDePauInterrogacao = (Button) findViewById(R.id.btCavaloDePauInterrogacao);
			btAdrenalinaPuraInterrogacao = (Button) findViewById(R.id.btAdrenalinaPuraInterrogacao);
			btMarteloDeThorInterrogacao = (Button) findViewById(R.id.btMarteloDeThorInterrogacao);
			btPunhoFirmeInterrogacao = (Button) findViewById(R.id.btPunhoFirmeInterrogacao);
			btAmplificarPoderInterrogacao = (Button) findViewById(R.id.btAmplificarPoderInterrogacao);
			btForcaViolentaInterrogacao = (Button) findViewById(R.id.btForcaViolentaInterrogacao);
			btResistenciaAoFogoInterrogacao = (Button) findViewById(R.id.btResistenciaAoFogoInterrogacao);
			btManejoPerfeitoInterrogacao = (Button) findViewById(R.id.btManejoPerfeitoInterrogacao);
			btConsertarArmaInterrogacao = (Button) findViewById(R.id.btConsertarArmaInterrogacao);
			btPericiaEmArmamentoInterrogacao = (Button) findViewById(R.id.btPericiaEmArmamentoInterrogacao);
			btEncontrarMinerioInterrogacao = (Button) findViewById(R.id.btEncontrarMinerioInterrogacao);
			btVendaDuvidosaInterrogacao = (Button) findViewById(R.id.btVendaDuvidosaInterrogacao);
			btGananciaInterrogacao = (Button) findViewById(R.id.btGananciaInterrogacao);
			btAdrenalinaConcentradaInterrogacao = (Button) findViewById(R.id.btAdrenalinaConcentradaInterrogacao);
			btProduzirPedraFundamentalInterrogacao = (Button) findViewById(R.id.btProduzirPedraFundamentalInterrogacao);
			btTrabalharFerroInterrogacao = (Button) findViewById(R.id.btTrabalharFerroInterrogacao);
			btTrabalharAcoInterrogacao = (Button) findViewById(R.id.btTrabalharAcoInterrogacao);
			btPericiaComOrideconInterrogacao = (Button) findViewById(R.id.btPericiaComOrideconInterrogacao);
			btForjarMachadoInterrogacao = (Button) findViewById(R.id.btForjarMachadoInterrogacao);
			btForjarAdagaInterrogacao = (Button) findViewById(R.id.btForjarAdagaInterrogacao);
			btForjarSoqueiraInterrogacao = (Button) findViewById(R.id.btForjarSoqueiraInterrogacao);
			btForjarMacaInterrogacao = (Button) findViewById(R.id.btForjarMacaInterrogacao);
			btForjarLancaInterrogacao = (Button) findViewById(R.id.btForjarLancaInterrogacao);
			btForjarEspadaInterrogacao = (Button) findViewById(R.id.btForjarEspadaInterrogacao);
			btForjarEspadaDeDuasMaosInterrogacao = (Button) findViewById(R.id.btForjarEspadaDeDuasMaosInterrogacao);
			btImpulsoNoCarrinhoInterrogacao = (Button) findViewById(R.id.btImpulsoNoCarrinhoInterrogacao);
			btChoqueDoCarrinhoInterrogacao = (Button) findViewById(R.id.btChoqueDoCarrinhoInterrogacao);
			btForcaViolentissimaInterrogacao = (Button) findViewById(R.id.btForcaViolentissimaInterrogacao);
			btGolpeEstilhacanteInterrogacao = (Button) findViewById(R.id.btGolpeEstilhacanteInterrogacao);
			btAprimorarArmamentoInterrogacao = (Button) findViewById(R.id.btAprimorarArmamentoInterrogacao);
			btMaestriaComMachadosInterrogacao = (Button) findViewById(R.id.btMaestriaComMachadosInterrogacao);
			btArremessoDeMachadoInterrogacao = (Button) findViewById(R.id.btArremessoDeMachadoInterrogacao);
			btFuriaDoFuracaoInterrogacao = (Button) findViewById(R.id.btFuriaDoFuracaoInterrogacao);
			btBrandirMachadoInterrogacao = (Button) findViewById(R.id.btBrandirMachadoInterrogacao);
			btSabedoriaDeHefestoInterrogacao = (Button) findViewById(R.id.btSabedoriaDeHefestoInterrogacao);
			btArtilhariaCacadoraInterrogacao = (Button) findViewById(R.id.btArtilhariaCacadoraInterrogacao);
			btArtilhariaArcanaInterrogacao = (Button) findViewById(R.id.btArtilhariaArcanaInterrogacao);
			btRemoverArtilhariaInterrogacao = (Button) findViewById(R.id.btRemoverArtilhariaInterrogacao);
			btLicencaDePilotagemInterrogacao = (Button) findViewById(R.id.btLicencaDePilotagemInterrogacao);
			btRepararInterrogacao = (Button) findViewById(R.id.btRepararInterrogacao);
			btPunhoFogueteInterrogacao = (Button) findViewById(R.id.btPunhoFogueteInterrogacao);
			btBateEstacaInterrogacao = (Button) findViewById(R.id.btBateEstacaInterrogacao);
			btMetralhadoraInterrogacao = (Button) findViewById(R.id.btMetralhadoraInterrogacao);
			btLancaChamasInterrogacao = (Button) findViewById(R.id.btLancaChamasInterrogacao);
			btGasCriogenicoInterrogacao = (Button) findViewById(R.id.btGasCriogenicoInterrogacao);
			btCanhaoInterrogacao = (Button) findViewById(R.id.btCanhaoInterrogacao);
			btAceleracaoInterrogacao = (Button) findViewById(R.id.btAceleracaoInterrogacao);
			btPlanarInterrogacao = (Button) findViewById(R.id.btPlanarInterrogacao);
			btPropulsaoDianteiraInterrogacao = (Button) findViewById(R.id.btPropulsaoDianteiraInterrogacao);
			btPropulsaoTraseiraInterrogacao = (Button) findViewById(R.id.btPropulsaoTraseiraInterrogacao);
			btReforcarEstruturaInterrogacao = (Button) findViewById(R.id.btReforcarEstruturaInterrogacao);
			btAutodestruicaoInterrogacao = (Button) findViewById(R.id.btAutodestruicaoInterrogacao);
			btResfriamentoInterrogacao = (Button) findViewById(R.id.btResfriamentoInterrogacao);
			btCampoMagneticoInterrogacao = (Button) findViewById(R.id.btCampoMagneticoInterrogacao);
			btCampoProtetorInterrogacao = (Button) findViewById(R.id.btCampoProtetorInterrogacao);
			btReconfigurarElementoInterrogacao = (Button) findViewById(R.id.btReconfigurarElementoInterrogacao);
			btSensorInfravermelhoInterrogacao = (Button) findViewById(R.id.btSensorInfravermelhoInterrogacao);
			btAnalisarInterrogacao = (Button) findViewById(R.id.btAnalisarInterrogacao);
			btCampoDeInvisibilidadeInterrogacao = (Button) findViewById(R.id.btCampoDeInvisibilidadeInterrogacao);

			//Botões de diminuir habilidades
			btMammonitaDiminuir = (Button) findViewById(R.id.btMammonitaDiminuir);
			btDescontoDiminuir = (Button) findViewById(R.id.btDescontoDiminuir);
			btSuperfaturarDiminuir = (Button) findViewById(R.id.btSuperfaturarDiminuir);
			btAumentarCapacidadeDeCargaDiminuir = (Button) findViewById(R.id.btAumentarCapacidadeDeCargaDiminuir);
			btUsarCarrinhoDiminuir = (Button) findViewById(R.id.btUsarCarrinhoDiminuir);
			btComercioDiminuir = (Button) findViewById(R.id.btComercioDiminuir);
			btIdentificarItemDiminuir = (Button) findViewById(R.id.btIdentificarItemDiminuir);
			btAdrenalinaPuraDiminuir = (Button) findViewById(R.id.btAdrenalinaPuraDiminuir);
			btMarteloDeThorDiminuir = (Button) findViewById(R.id.btMarteloDeThorDiminuir);
			btPunhoFirmeDiminuir = (Button) findViewById(R.id.btPunhoFirmeDiminuir);
			btAmplificarPoderDiminuir = (Button) findViewById(R.id.btAmplificarPoderDiminuir);
			btForcaViolentaDiminuir = (Button) findViewById(R.id.btForcaViolentaDiminuir);
			btResistenciaAoFogoDiminuir = (Button) findViewById(R.id.btResistenciaAoFogoDiminuir);
			btManejoPerfeitoDiminuir = (Button) findViewById(R.id.btManejoPerfeitoDiminuir);
			btConsertarArmaDiminuir = (Button) findViewById(R.id.btConsertarArmaDiminuir);
			btPericiaEmArmamentoDiminuir = (Button) findViewById(R.id.btPericiaEmArmamentoDiminuir);
			btEncontrarMinerioDiminuir = (Button) findViewById(R.id.btEncontrarMinerioDiminuir);
			btProduzirPedraFundamentalDiminuir = (Button) findViewById(R.id.btProduzirPedraFundamentalDiminuir);
			btTrabalharFerroDiminuir = (Button) findViewById(R.id.btTrabalharFerroDiminuir);
			btTrabalharAcoDiminuir = (Button) findViewById(R.id.btTrabalharAcoDiminuir);
			btPericiaComOrideconDiminuir = (Button) findViewById(R.id.btPericiaComOrideconDiminuir);
			btForjarMachadoDiminuir = (Button) findViewById(R.id.btForjarMachadoDiminuir);
			btForjarAdagaDiminuir = (Button) findViewById(R.id.btForjarAdagaDiminuir);
			btForjarSoqueiraDiminuir = (Button) findViewById(R.id.btForjarSoqueiraDiminuir);
			btForjarMacaDiminuir = (Button) findViewById(R.id.btForjarMacaDiminuir);
			btForjarLancaDiminuir = (Button) findViewById(R.id.btForjarLancaDiminuir);
			btForjarEspadaDiminuir = (Button) findViewById(R.id.btForjarEspadaDiminuir);
			btForjarEspadaDeDuasMaosDiminuir = (Button) findViewById(R.id.btForjarEspadaDeDuasMaosDiminuir);
			btImpulsoNoCarrinhoDiminuir = (Button) findViewById(R.id.btImpulsoNoCarrinhoDiminuir);
			btChoqueDoCarrinhoDiminuir = (Button) findViewById(R.id.btChoqueDoCarrinhoDiminuir);
			btForcaViolentissimaDiminuir = (Button) findViewById(R.id.btForcaViolentissimaDiminuir);
			btGolpeEstilhacanteDiminuir = (Button) findViewById(R.id.btGolpeEstilhacanteDiminuir);
			btAprimorarArmamentoDiminuir = (Button) findViewById(R.id.btAprimorarArmamentoDiminuir);
			btMaestriaComMachadosDiminuir = (Button) findViewById(R.id.btMaestriaComMachadosDiminuir);
			btArremessoDeMachadoDiminuir = (Button) findViewById(R.id.btArremessoDeMachadoDiminuir);
			btFuriaDoFuracaoDiminuir = (Button) findViewById(R.id.btFuriaDoFuracaoDiminuir);
			btBrandirMachadoDiminuir = (Button) findViewById(R.id.btBrandirMachadoDiminuir);
			btSabedoriaDeHefestoDiminuir = (Button) findViewById(R.id.btSabedoriaDeHefestoDiminuir);
			btArtilhariaCacadoraDiminuir = (Button) findViewById(R.id.btArtilhariaCacadoraDiminuir);
			btArtilhariaArcanaDiminuir = (Button) findViewById(R.id.btArtilhariaArcanaDiminuir);
			btRemoverArtilhariaDiminuir = (Button) findViewById(R.id.btRemoverArtilhariaDiminuir);
			btLicencaDePilotagemDiminuir = (Button) findViewById(R.id.btLicencaDePilotagemDiminuir);
			btRepararDiminuir = (Button) findViewById(R.id.btRepararDiminuir);
			btPunhoFogueteDiminuir = (Button) findViewById(R.id.btPunhoFogueteDiminuir);
			btBateEstacaDiminuir = (Button) findViewById(R.id.btBateEstacaDiminuir);
			btMetralhadoraDiminuir = (Button) findViewById(R.id.btMetralhadoraDiminuir);
			btLancaChamasDiminuir = (Button) findViewById(R.id.btLancaChamasDiminuir);
			btGasCriogenicoDiminuir = (Button) findViewById(R.id.btGasCriogenicoDiminuir);
			btCanhaoDiminuir = (Button) findViewById(R.id.btCanhaoDiminuir);
			btAceleracaoDiminuir = (Button) findViewById(R.id.btAceleracaoDiminuir);
			btPlanarDiminuir = (Button) findViewById(R.id.btPlanarDiminuir);
			btPropulsaoDianteiraDiminuir = (Button) findViewById(R.id.btPropulsaoDianteiraDiminuir);
			btPropulsaoTraseiraDiminuir = (Button) findViewById(R.id.btPropulsaoTraseiraDiminuir);
			btReforcarEstruturaDiminuir = (Button) findViewById(R.id.btReforcarEstruturaDiminuir);
			btAutodestruicaoDiminuir = (Button) findViewById(R.id.btAutodestruicaoDiminuir);
			btResfriamentoDiminuir = (Button) findViewById(R.id.btResfriamentoDiminuir);
			btCampoMagneticoDiminuir = (Button) findViewById(R.id.btCampoMagneticoDiminuir);
			btCampoProtetorDiminuir = (Button) findViewById(R.id.btCampoProtetorDiminuir);
			btReconfigurarElementoDiminuir = (Button) findViewById(R.id.btReconfigurarElementoDiminuir);
			btSensorInfravermelhoDiminuir = (Button) findViewById(R.id.btSensorInfravermelhoDiminuir);
			btAnalisarDiminuir = (Button) findViewById(R.id.btAnalisarDiminuir);
			btCampoDeInvisibilidadeDiminuir = (Button) findViewById(R.id.btCampoDeInvisibilidadeDiminuir);

			//Botões de aumentar habilidades
			btMammonitaAumentar = (Button) findViewById(R.id.btMammonitaAumentar);
			btDescontoAumentar = (Button) findViewById(R.id.btDescontoAumentar);
			btSuperfaturarAumentar = (Button) findViewById(R.id.btSuperfaturarAumentar);
			btAumentarCapacidadeDeCargaAumentar = (Button) findViewById(R.id.btAumentarCapacidadeDeCargaAumentar);
			btUsarCarrinhoAumentar = (Button) findViewById(R.id.btUsarCarrinhoAumentar);
			btComercioAumentar = (Button) findViewById(R.id.btComercioAumentar);
			btIdentificarItemAumentar = (Button) findViewById(R.id.btIdentificarItemAumentar);
			btAdrenalinaPuraAumentar = (Button) findViewById(R.id.btAdrenalinaPuraAumentar);
			btMarteloDeThorAumentar = (Button) findViewById(R.id.btMarteloDeThorAumentar);
			btPunhoFirmeAumentar = (Button) findViewById(R.id.btPunhoFirmeAumentar);
			btAmplificarPoderAumentar = (Button) findViewById(R.id.btAmplificarPoderAumentar);
			btForcaViolentaAumentar = (Button) findViewById(R.id.btForcaViolentaAumentar);
			btResistenciaAoFogoAumentar = (Button) findViewById(R.id.btResistenciaAoFogoAumentar);
			btManejoPerfeitoAumentar = (Button) findViewById(R.id.btManejoPerfeitoAumentar);
			btConsertarArmaAumentar = (Button) findViewById(R.id.btConsertarArmaAumentar);
			btPericiaEmArmamentoAumentar = (Button) findViewById(R.id.btPericiaEmArmamentoAumentar);
			btEncontrarMinerioAumentar = (Button) findViewById(R.id.btEncontrarMinerioAumentar);
			btProduzirPedraFundamentalAumentar = (Button) findViewById(R.id.btProduzirPedraFundamentalAumentar);
			btTrabalharFerroAumentar = (Button) findViewById(R.id.btTrabalharFerroAumentar);
			btTrabalharAcoAumentar = (Button) findViewById(R.id.btTrabalharAcoAumentar);
			btPericiaComOrideconAumentar = (Button) findViewById(R.id.btPericiaComOrideconAumentar);
			btForjarMachadoAumentar = (Button) findViewById(R.id.btForjarMachadoAumentar);
			btForjarAdagaAumentar = (Button) findViewById(R.id.btForjarAdagaAumentar);
			btForjarSoqueiraAumentar = (Button) findViewById(R.id.btForjarSoqueiraAumentar);
			btForjarMacaAumentar = (Button) findViewById(R.id.btForjarMacaAumentar);
			btForjarLancaAumentar = (Button) findViewById(R.id.btForjarLancaAumentar);
			btForjarEspadaAumentar = (Button) findViewById(R.id.btForjarEspadaAumentar);
			btForjarEspadaDeDuasMaosAumentar = (Button) findViewById(R.id.btForjarEspadaDeDuasMaosAumentar);
			btImpulsoNoCarrinhoAumentar = (Button) findViewById(R.id.btImpulsoNoCarrinhoAumentar);
			btChoqueDoCarrinhoAumentar = (Button) findViewById(R.id.btChoqueDoCarrinhoAumentar);
			btForcaViolentissimaAumentar = (Button) findViewById(R.id.btForcaViolentissimaAumentar);
			btGolpeEstilhacanteAumentar = (Button) findViewById(R.id.btGolpeEstilhacanteAumentar);
			btAprimorarArmamentoAumentar = (Button) findViewById(R.id.btAprimorarArmamentoAumentar);
			btMaestriaComMachadosAumentar = (Button) findViewById(R.id.btMaestriaComMachadosAumentar);
			btArremessoDeMachadoAumentar = (Button) findViewById(R.id.btArremessoDeMachadoAumentar);
			btFuriaDoFuracaoAumentar = (Button) findViewById(R.id.btFuriaDoFuracaoAumentar);
			btBrandirMachadoAumentar = (Button) findViewById(R.id.btBrandirMachadoAumentar);
			btSabedoriaDeHefestoAumentar = (Button) findViewById(R.id.btSabedoriaDeHefestoAumentar);
			btArtilhariaCacadoraAumentar = (Button) findViewById(R.id.btArtilhariaCacadoraAumentar);
			btArtilhariaArcanaAumentar = (Button) findViewById(R.id.btArtilhariaArcanaAumentar);
			btRemoverArtilhariaAumentar = (Button) findViewById(R.id.btRemoverArtilhariaAumentar);
			btLicencaDePilotagemAumentar = (Button) findViewById(R.id.btLicencaDePilotagemAumentar);
			btRepararAumentar = (Button) findViewById(R.id.btRepararAumentar);
			btPunhoFogueteAumentar = (Button) findViewById(R.id.btPunhoFogueteAumentar);
			btBateEstacaAumentar = (Button) findViewById(R.id.btBateEstacaAumentar);
			btMetralhadoraAumentar = (Button) findViewById(R.id.btMetralhadoraAumentar);
			btLancaChamasAumentar = (Button) findViewById(R.id.btLancaChamasAumentar);
			btGasCriogenicoAumentar = (Button) findViewById(R.id.btGasCriogenicoAumentar);
			btCanhaoAumentar = (Button) findViewById(R.id.btCanhaoAumentar);
			btAceleracaoAumentar = (Button) findViewById(R.id.btAceleracaoAumentar);
			btPlanarAumentar = (Button) findViewById(R.id.btPlanarAumentar);
			btPropulsaoDianteiraAumentar = (Button) findViewById(R.id.btPropulsaoDianteiraAumentar);
			btPropulsaoTraseiraAumentar = (Button) findViewById(R.id.btPropulsaoTraseiraAumentar);
			btReforcarEstruturaAumentar = (Button) findViewById(R.id.btReforcarEstruturaAumentar);
			btAutodestruicaoAumentar = (Button) findViewById(R.id.btAutodestruicaoAumentar);
			btResfriamentoAumentar = (Button) findViewById(R.id.btResfriamentoAumentar);
			btCampoMagneticoAumentar = (Button) findViewById(R.id.btCampoMagneticoAumentar);
			btCampoProtetorAumentar = (Button) findViewById(R.id.btCampoProtetorAumentar);
			btReconfigurarElementoAumentar = (Button) findViewById(R.id.btReconfigurarElementoAumentar);
			btSensorInfravermelhoAumentar = (Button) findViewById(R.id.btSensorInfravermelhoAumentar);
			btAnalisarAumentar = (Button) findViewById(R.id.btAnalisarAumentar);
			btCampoDeInvisibilidadeAumentar = (Button) findViewById(R.id.btCampoDeInvisibilidadeAumentar);

			//Resto dos botões
			btResetar = (Button) findViewById(R.id.btResetar);
			btSalvar = (Button) findViewById(R.id.btSalvar);
			btSalvarIMG = (Button) findViewById(R.id.btSalvarIMG);
			tgbtSomenteHabilidadeAprendida = (ToggleButton) findViewById(R.id.tgbtSomenteHabilidadeAprendida);

			//Txt pontos da tela
			txtMammonitaPontos = (TextView) findViewById(R.id.txtMammonitaPontos);
			txtDescontoPontos = (TextView) findViewById(R.id.txtDescontoPontos);
			txtSuperfaturarPontos = (TextView) findViewById(R.id.txtSuperfaturarPontos);
			txtAumentarCapacidadeDeCargaPontos = (TextView) findViewById(R.id.txtAumentarCapacidadeDeCargaPontos);
			txtUsarCarrinhoPontos = (TextView) findViewById(R.id.txtUsarCarrinhoPontos);
			txtComercioPontos = (TextView) findViewById(R.id.txtComercioPontos);
			txtIdentificarItemPontos = (TextView) findViewById(R.id.txtIdentificarItemPontos);
			txtAdrenalinaPuraPontos = (TextView) findViewById(R.id.txtAdrenalinaPuraPontos);
			txtMarteloDeThorPontos = (TextView) findViewById(R.id.txtMarteloDeThorPontos);
			txtPunhoFirmePontos = (TextView) findViewById(R.id.txtPunhoFirmePontos);
			txtAmplificarPoderPontos = (TextView) findViewById(R.id.txtAmplificarPoderPontos);
			txtForcaViolentaPontos = (TextView) findViewById(R.id.txtForcaViolentaPontos);
			txtResistenciaAoFogoPontos = (TextView) findViewById(R.id.txtResistenciaAoFogoPontos);
			txtManejoPerfeitoPontos = (TextView) findViewById(R.id.txtManejoPerfeitoPontos);
			txtConsertarArmaPontos = (TextView) findViewById(R.id.txtConsertarArmaPontos);
			txtPericiaEmArmamentoPontos = (TextView) findViewById(R.id.txtPericiaEmArmamentoPontos);
			txtEncontrarMinerioPontos = (TextView) findViewById(R.id.txtEncontrarMinerioPontos);
			txtProduzirPedraFundamentalPontos = (TextView) findViewById(R.id.txtProduzirPedraFundamentalPontos);
			txtTrabalharFerroPontos = (TextView) findViewById(R.id.txtTrabalharFerroPontos);
			txtTrabalharAcoPontos = (TextView) findViewById(R.id.txtTrabalharAcoPontos);
			txtPericiaComOrideconPontos = (TextView) findViewById(R.id.txtPericiaComOrideconPontos);
			txtForjarMachadoPontos = (TextView) findViewById(R.id.txtForjarMachadoPontos);
			txtForjarAdagaPontos = (TextView) findViewById(R.id.txtForjarAdagaPontos);
			txtForjarSoqueiraPontos = (TextView) findViewById(R.id.txtForjarSoqueiraPontos);
			txtForjarMacaPontos = (TextView) findViewById(R.id.txtForjarMacaPontos);
			txtForjarLancaPontos = (TextView) findViewById(R.id.txtForjarLancaPontos);
			txtForjarEspadaPontos = (TextView) findViewById(R.id.txtForjarEspadaPontos);
			txtForjarEspadaDeDuasMaosPontos = (TextView) findViewById(R.id.txtForjarEspadaDeDuasMaosPontos);
			txtImpulsoNoCarrinhoPontos = (TextView) findViewById(R.id.txtImpulsoNoCarrinhoPontos);
			txtChoqueDoCarrinhoPontos = (TextView) findViewById(R.id.txtChoqueDoCarrinhoPontos);
			txtForcaViolentissimaPontos = (TextView) findViewById(R.id.txtForcaViolentissimaPontos);
			txtGolpeEstilhacantePontos = (TextView) findViewById(R.id.txtGolpeEstilhacantePontos);
			txtAprimorarArmamentoPontos = (TextView) findViewById(R.id.txtAprimorarArmamentoPontos);
			txtMaestriaComMachadosPontos = (TextView) findViewById(R.id.txtMaestriaComMachadosPontos);
			txtArremessoDeMachadoPontos = (TextView) findViewById(R.id.txtArremessoDeMachadoPontos);
			txtFuriaDoFuracaoPontos = (TextView) findViewById(R.id.txtFuriaDoFuracaoPontos);
			txtBrandirMachadoPontos = (TextView) findViewById(R.id.txtBrandirMachadoPontos);
			txtSabedoriaDeHefestoPontos = (TextView) findViewById(R.id.txtSabedoriaDeHefestoPontos);
			txtArtilhariaCacadoraPontos = (TextView) findViewById(R.id.txtArtilhariaCacadoraPontos);
			txtArtilhariaArcanaPontos = (TextView) findViewById(R.id.txtArtilhariaArcanaPontos);
			txtRemoverArtilhariaPontos = (TextView) findViewById(R.id.txtRemoverArtilhariaPontos);
			txtLicencaDePilotagemPontos = (TextView) findViewById(R.id.txtLicencaDePilotagemPontos);
			txtRepararPontos = (TextView) findViewById(R.id.txtRepararPontos);
			txtPunhoFoguetePontos = (TextView) findViewById(R.id.txtPunhoFoguetePontos);
			txtBateEstacaPontos = (TextView) findViewById(R.id.txtBateEstacaPontos);
			txtMetralhadoraPontos = (TextView) findViewById(R.id.txtMetralhadoraPontos);
			txtLancaChamasPontos = (TextView) findViewById(R.id.txtLancaChamasPontos);
			txtGasCriogenicoPontos = (TextView) findViewById(R.id.txtGasCriogenicoPontos);
			txtCanhaoPontos = (TextView) findViewById(R.id.txtCanhaoPontos);
			txtAceleracaoPontos = (TextView) findViewById(R.id.txtAceleracaoPontos);
			txtPlanarPontos = (TextView) findViewById(R.id.txtPlanarPontos);
			txtPropulsaoDianteiraPontos = (TextView) findViewById(R.id.txtPropulsaoDianteiraPontos);
			txtPropulsaoTraseiraPontos = (TextView) findViewById(R.id.txtPropulsaoTraseiraPontos);
			txtReforcarEstruturaPontos = (TextView) findViewById(R.id.txtReforcarEstruturaPontos);
			txtAutodestruicaoPontos = (TextView) findViewById(R.id.txtAutodestruicaoPontos);
			txtResfriamentoPontos = (TextView) findViewById(R.id.txtResfriamentoPontos);
			txtCampoMagneticoPontos = (TextView) findViewById(R.id.txtCampoMagneticoPontos);
			txtCampoProtetorPontos = (TextView) findViewById(R.id.txtCampoProtetorPontos);
			txtReconfigurarElementoPontos = (TextView) findViewById(R.id.txtReconfigurarElementoPontos);
			txtSensorInfravermelhoPontos = (TextView) findViewById(R.id.txtSensorInfravermelhoPontos);
			txtAnalisarPontos = (TextView) findViewById(R.id.txtAnalisarPontos);
			txtCampoDeInvisibilidadePontos = (TextView) findViewById(R.id.txtCampoDeInvisibilidadePontos);

			//Txt pontos restantes
			txtClasse1 = (TextView) findViewById(R.id.txtClasse1);
			txtClasse2 = (TextView) findViewById(R.id.txtClasse2);
			txtTransClasse = (TextView) findViewById(R.id.txtClasseTrans);
			txtClasse3 = (TextView) findViewById(R.id.txtClasse3);

			//Layouts
			layMammonita = (LinearLayout) findViewById(R.id.layMammonita);
			layDesconto = (LinearLayout) findViewById(R.id.layDesconto);
			laySuperfaturar = (LinearLayout) findViewById(R.id.laySuperfaturar);
			layAumentarCapacidadeDeCarga = (LinearLayout) findViewById(R.id.layAumentarCapacidadeDeCarga);
			layUsarCarrinho = (LinearLayout) findViewById(R.id.layUsarCarrinho);
			layComercio = (LinearLayout) findViewById(R.id.layComercio);
			layIdentificarItem = (LinearLayout) findViewById(R.id.layIdentificarItem);
			layAdrenalinaPura = (LinearLayout) findViewById(R.id.layAdrenalinaPura);
			layMarteloDeThor = (LinearLayout) findViewById(R.id.layMarteloDeThor);
			layPunhoFirme = (LinearLayout) findViewById(R.id.layPunhoFirme);
			layAmplificarPoder = (LinearLayout) findViewById(R.id.layAmplificarPoder);
			layForcaViolenta = (LinearLayout) findViewById(R.id.layForcaViolenta);
			layResistenciaAoFogo = (LinearLayout) findViewById(R.id.layResistenciaAoFogo);
			layManejoPerfeito = (LinearLayout) findViewById(R.id.layManejoPerfeito);
			layConsertarArma = (LinearLayout) findViewById(R.id.layConsertarArma);
			layPericiaEmArmamento = (LinearLayout) findViewById(R.id.layPericiaEmArmamento);
			layEncontrarMinerio = (LinearLayout) findViewById(R.id.layEncontrarMinerio);
			layProduzirPedraFundamental = (LinearLayout) findViewById(R.id.layProduzirPedraFundamental);
			layTrabalharFerro = (LinearLayout) findViewById(R.id.layTrabalharFerro);
			layTrabalharAco = (LinearLayout) findViewById(R.id.layTrabalharAco);
			layPericiaComOridecon = (LinearLayout) findViewById(R.id.layPericiaComOridecon);
			layForjarMachado = (LinearLayout) findViewById(R.id.layForjarMachado);
			layForjarAdaga = (LinearLayout) findViewById(R.id.layForjarAdaga);
			layForjarSoqueira = (LinearLayout) findViewById(R.id.layForjarSoqueira);
			layForjarMaca = (LinearLayout) findViewById(R.id.layForjarMaca);
			layForjarLanca = (LinearLayout) findViewById(R.id.layForjarLanca);
			layForjarEspada = (LinearLayout) findViewById(R.id.layForjarEspada);
			layForjarEspadaDeDuasMaos = (LinearLayout) findViewById(R.id.layForjarEspadaDeDuasMaos);
			layImpulsoNoCarrinho = (LinearLayout) findViewById(R.id.layImpulsoNoCarrinho);
			layChoqueDoCarrinho = (LinearLayout) findViewById(R.id.layChoqueDoCarrinho);
			layForcaViolentissima = (LinearLayout) findViewById(R.id.layForcaViolentissima);
			layGolpeEstilhacante = (LinearLayout) findViewById(R.id.layGolpeEstilhacante);
			layAprimorarArmamento = (LinearLayout) findViewById(R.id.layAprimorarArmamento);
			layMaestriaComMachados = (LinearLayout) findViewById(R.id.layMaestriaComMachados);
			layArremessoDeMachado = (LinearLayout) findViewById(R.id.layArremessoDeMachado);
			layFuriaDoFuracao = (LinearLayout) findViewById(R.id.layFuriaDoFuracao);
			layBrandirMachado = (LinearLayout) findViewById(R.id.layBrandirMachado);
			laySabedoriaDeHefesto = (LinearLayout) findViewById(R.id.laySabedoriaDeHefesto);
			layArtilhariaCacadora = (LinearLayout) findViewById(R.id.layArtilhariaCacadora);
			layArtilhariaArcana = (LinearLayout) findViewById(R.id.layArtilhariaArcana);
			layRemoverArtilharia = (LinearLayout) findViewById(R.id.layRemoverArtilharia);
			layLicencaDePilotagem = (LinearLayout) findViewById(R.id.layLicencaDePilotagem);
			layReparar = (LinearLayout) findViewById(R.id.layReparar);
			layPunhoFoguete = (LinearLayout) findViewById(R.id.layPunhoFoguete);
			layBateEstaca = (LinearLayout) findViewById(R.id.layBateEstaca);
			layMetralhadora = (LinearLayout) findViewById(R.id.layMetralhadora);
			layLancaChamas = (LinearLayout) findViewById(R.id.layLancaChamas);
			layGasCriogenico = (LinearLayout) findViewById(R.id.layGasCriogenico);
			layCanhao = (LinearLayout) findViewById(R.id.layCanhao);
			layAceleracao = (LinearLayout) findViewById(R.id.layAceleracao);
			layPlanar = (LinearLayout) findViewById(R.id.layPlanar);
			layPropulsaoDianteira = (LinearLayout) findViewById(R.id.layPropulsaoDianteira);
			layPropulsaoTraseira = (LinearLayout) findViewById(R.id.layPropulsaoTraseira);
			layReforcarEstrutura = (LinearLayout) findViewById(R.id.layReforcarEstrutura);
			layAutodestruicao = (LinearLayout) findViewById(R.id.layAutodestruicao);
			layResfriamento = (LinearLayout) findViewById(R.id.layResfriamento);
			layCampoMagnetico = (LinearLayout) findViewById(R.id.layCampoMagnetico);
			layCampoProtetor = (LinearLayout) findViewById(R.id.layCampoProtetor);
			layReconfigurarElemento = (LinearLayout) findViewById(R.id.layReconfigurarElemento);
			laySensorInfravermelho = (LinearLayout) findViewById(R.id.laySensorInfravermelho);
			layAnalisar = (LinearLayout) findViewById(R.id.layAnalisar);
			layCampoDeInvisibilidade = (LinearLayout) findViewById(R.id.layCampoDeInvisibilidade);

			layPrincipal = (LinearLayout) findViewById(R.id.habilidades);
			
			if (id>0)
				recarregarBuild(id);


			//Eventos de informação
			btMammonitaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Mammonita");
					dialogo.setMessage(R.string.mammonitaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDescontoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Desconto");
					dialogo.setMessage(R.string.descontoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSuperfaturarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Superfaturar");
					dialogo.setMessage(R.string.superfaturarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAumentarCapacidadeDeCargaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Aumentar Capacidade De Carga");
					dialogo.setMessage(R.string.aumentarCapacidadeDeCargaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btUsarCarrinhoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Usar Carrinho");
					dialogo.setMessage(R.string.usarCarrinhoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btComercioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Comércio");
					dialogo.setMessage(R.string.comercioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btIdentificarItemInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Identificar Item");
					dialogo.setMessage(R.string.identificarItemInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGritoDeGuerraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Grito De Guerra");
					dialogo.setMessage(R.string.gritoDeGuerraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPersonalizarCarrinhoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Personalizar Carrinho");
					dialogo.setMessage(R.string.personalizarCarrinhoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCavaloDePauInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Cavalo De Pau");
					dialogo.setMessage(R.string.cavaloDePauInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAdrenalinaPuraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Adrenalina Pura");
					dialogo.setMessage(R.string.adrenalinaPuraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMarteloDeThorInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Martelo De Thor");
					dialogo.setMessage(R.string.marteloDeThorInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPunhoFirmeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Punho Firme");
					dialogo.setMessage(R.string.punhoFirmeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAmplificarPoderInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Amplificar Poder");
					dialogo.setMessage(R.string.amplificarPoderInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btForcaViolentaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Força Violenta");
					dialogo.setMessage(R.string.forcaViolentaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btResistenciaAoFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Resistência Ao Fogo");
					dialogo.setMessage(R.string.resistenciaAoFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btManejoPerfeitoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Manejo Perfeito");
					dialogo.setMessage(R.string.manejoPerfeitoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btConsertarArmaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Consertar Arma");
					dialogo.setMessage(R.string.consertarArmaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaEmArmamentoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Perícia Em Armamento");
					dialogo.setMessage(R.string.periciaEmArmamentoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEncontrarMinerioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Encontrar Minério");
					dialogo.setMessage(R.string.encontrarMinerioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btVendaDuvidosaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Venda Duvidosa");
					dialogo.setMessage(R.string.vendaDuvidosaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGananciaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Ganância");
					dialogo.setMessage(R.string.gananciaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAdrenalinaConcentradaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Adrenalina Concentrada");
					dialogo.setMessage(R.string.adrenalinaConcentradaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btProduzirPedraFundamentalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Produzir Pedra Fundamental");
					dialogo.setMessage(R.string.produzirPedraFundamentalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTrabalharFerroInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Trabalhar Ferro");
					dialogo.setMessage(R.string.trabalharFerroInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTrabalharAcoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Trabalhar Aço");
					dialogo.setMessage(R.string.trabalharAcoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaComOrideconInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Perícia Com Oridecon");
					dialogo.setMessage(R.string.periciaComOrideconInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btForjarMachadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Forjar Machado");
					dialogo.setMessage(R.string.forjarMachadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btForjarAdagaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Forjar Adaga");
					dialogo.setMessage(R.string.forjarAdagaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btForjarSoqueiraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Forjar Soqueira");
					dialogo.setMessage(R.string.forjarSoqueiraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btForjarMacaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Forjar Maça");
					dialogo.setMessage(R.string.forjarMacaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btForjarLancaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Forjar Lança");
					dialogo.setMessage(R.string.forjarLancaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btForjarEspadaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Forjar Espada");
					dialogo.setMessage(R.string.forjarEspadaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btForjarEspadaDeDuasMaosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Forjar Espada De Duas Mãos");
					dialogo.setMessage(R.string.forjarEspadaDeDuasMaosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btImpulsoNoCarrinhoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Impulso No Carrinho");
					dialogo.setMessage(R.string.impulsoNoCarrinhoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChoqueDoCarrinhoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Choque Do Carrinho");
					dialogo.setMessage(R.string.choqueDoCarrinhoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btForcaViolentissimaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Força Violentíssima");
					dialogo.setMessage(R.string.forcaViolentissimaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGolpeEstilhacanteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Golpe Estilhaçante");
					dialogo.setMessage(R.string.golpeEstilhacanteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAprimorarArmamentoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Aprimorar Armamento");
					dialogo.setMessage(R.string.aprimorarArmamentoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMaestriaComMachadosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Maestria Com Machados");
					dialogo.setMessage(R.string.maestriaComMachadosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArremessoDeMachadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Arremesso De Machado");
					dialogo.setMessage(R.string.arremessoDeMachadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFuriaDoFuracaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Fúria Do Furacão");
					dialogo.setMessage(R.string.furiaDoFuracaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBrandirMachadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Brandir Machado");
					dialogo.setMessage(R.string.brandirMachadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSabedoriaDeHefestoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Sabedoria De Hefesto");
					dialogo.setMessage(R.string.sabedoriaDeHefestoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArtilhariaCacadoraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Artilharia Caçadora");
					dialogo.setMessage(R.string.artilhariaCacadoraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArtilhariaArcanaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Artilharia Arcana");
					dialogo.setMessage(R.string.artilhariaArcanaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRemoverArtilhariaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Remover Artilharia");
					dialogo.setMessage(R.string.removerArtilhariaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLicencaDePilotagemInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Licença De Pilotagem");
					dialogo.setMessage(R.string.licencaDePilotagemInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRepararInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Reparar");
					dialogo.setMessage(R.string.repararInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPunhoFogueteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Punho Foguete");
					dialogo.setMessage(R.string.punhoFogueteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBateEstacaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Bate Estaca");
					dialogo.setMessage(R.string.bateEstacaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMetralhadoraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Metralhadora");
					dialogo.setMessage(R.string.metralhadoraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLancaChamasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Lança Chamas");
					dialogo.setMessage(R.string.lancaChamasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGasCriogenicoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Gás Criogênico");
					dialogo.setMessage(R.string.gasCriogenicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCanhaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Canhão");
					dialogo.setMessage(R.string.canhaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAceleracaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Aceleração");
					dialogo.setMessage(R.string.aceleracaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPlanarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Planar");
					dialogo.setMessage(R.string.planarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPropulsaoDianteiraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Propulsão Dianteira");
					dialogo.setMessage(R.string.propulsaoDianteiraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPropulsaoTraseiraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Propulsão Traseira");
					dialogo.setMessage(R.string.propulsaoTraseiraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btReforcarEstruturaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Reforçar Estrutura");
					dialogo.setMessage(R.string.reforcarEstruturaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAutodestruicaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Autodestruição");
					dialogo.setMessage(R.string.autodestruicaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btResfriamentoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Resfriamento");
					dialogo.setMessage(R.string.resfriamentoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCampoMagneticoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Campo Magnético");
					dialogo.setMessage(R.string.campoMagneticoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCampoProtetorInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Campo Protetor");
					dialogo.setMessage(R.string.campoProtetorInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btReconfigurarElementoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Reconfigurar Elemento");
					dialogo.setMessage(R.string.reconfigurarElementoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSensorInfravermelhoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Sensor Infravermelho");
					dialogo.setMessage(R.string.sensorInfravermelhoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAnalisarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Analisar");
					dialogo.setMessage(R.string.analisarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCampoDeInvisibilidadeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMecanico.this);
					dialogo.setTitle("Campo De Invisibilidade");
					dialogo.setMessage(R.string.campoDeInvisibilidadeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});


			//Eventos de aumentar
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
			btAdrenalinaPuraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varMarteloDeThor<2 && count<2){
						atualizarCalculo(varMarteloDeThor, "MarteloDeThor", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAdrenalinaPura, "AdrenalinaPura", 5, 2, "Aumentar");

				}
			});
			btMarteloDeThorAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMarteloDeThor, "MarteloDeThor", 5, 2, "Aumentar");

				}
			});
			btPunhoFirmeAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPunhoFirme, "PunhoFirme", 1, 2, "Aumentar");

				}
			});
			btAmplificarPoderAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varMarteloDeThor<2 && count<2){
						atualizarCalculo(varMarteloDeThor, "MarteloDeThor", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAdrenalinaPura<3 && count<3){
						atualizarCalculo(varAdrenalinaPura, "AdrenalinaPura", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varForcaViolenta<2 && count<2){
						atualizarCalculo(varForcaViolenta, "ForcaViolenta", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMarteloDeThor<2 && count<2){
						atualizarCalculo(varMarteloDeThor, "MarteloDeThor", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAdrenalinaPura<2 && count<2){
						atualizarCalculo(varAdrenalinaPura, "AdrenalinaPura", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoFirme<1 && count<1){
						atualizarCalculo(varPunhoFirme, "PunhoFirme", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaEmArmamento<2 && count<2){
						atualizarCalculo(varPericiaEmArmamento, "PericiaEmArmamento", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varManejoPerfeito<3 && count<3){
						atualizarCalculo(varManejoPerfeito, "ManejoPerfeito", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAmplificarPoder, "AmplificarPoder", 5, 2, "Aumentar");

				}
			});
			btForcaViolentaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varMarteloDeThor<2 && count<2){
						atualizarCalculo(varMarteloDeThor, "MarteloDeThor", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAdrenalinaPura<3 && count<3){
						atualizarCalculo(varAdrenalinaPura, "AdrenalinaPura", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varForcaViolenta, "ForcaViolenta", 5, 2, "Aumentar");

				}
			});
			btResistenciaAoFogoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varResistenciaAoFogo, "ResistenciaAoFogo", 5, 2, "Aumentar");

				}
			});
			btManejoPerfeitoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varMarteloDeThor<2 && count<2){
						atualizarCalculo(varMarteloDeThor, "MarteloDeThor", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAdrenalinaPura<2 && count<2){
						atualizarCalculo(varAdrenalinaPura, "AdrenalinaPura", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoFirme<1 && count<1){
						atualizarCalculo(varPunhoFirme, "PunhoFirme", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaEmArmamento<2 && count<2){
						atualizarCalculo(varPericiaEmArmamento, "PericiaEmArmamento", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varManejoPerfeito, "ManejoPerfeito", 5, 2, "Aumentar");

				}
			});
			btConsertarArmaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPunhoFirme<1 && count<1){
						atualizarCalculo(varPunhoFirme, "PunhoFirme", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaEmArmamento<1 && count<1){
						atualizarCalculo(varPericiaEmArmamento, "PericiaEmArmamento", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varConsertarArma, "ConsertarArma", 1, 2, "Aumentar");

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
			btEncontrarMinerioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPunhoFirme<1 && count<1){
						atualizarCalculo(varPunhoFirme, "PunhoFirme", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrabalharFerro<1 && count<1){
						atualizarCalculo(varTrabalharFerro, "TrabalharFerro", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrabalharAco<1 && count<1){
						atualizarCalculo(varTrabalharAco, "TrabalharAco", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEncontrarMinerio, "EncontrarMinerio", 1, 2, "Aumentar");

				}
			});
			btProduzirPedraFundamentalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varTrabalharFerro<1 && count<1){
						atualizarCalculo(varTrabalharFerro, "TrabalharFerro", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varProduzirPedraFundamental, "ProduzirPedraFundamental", 5, 2, "Aumentar");

				}
			});
			btTrabalharFerroAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTrabalharFerro, "TrabalharFerro", 5, 2, "Aumentar");

				}
			});
			btTrabalharAcoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varTrabalharFerro<1 && count<1){
						atualizarCalculo(varTrabalharFerro, "TrabalharFerro", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTrabalharAco, "TrabalharAco", 5, 2, "Aumentar");

				}
			});
			btPericiaComOrideconAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varTrabalharFerro<1 && count<1){
						atualizarCalculo(varTrabalharFerro, "TrabalharFerro", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varProduzirPedraFundamental<1 && count<1){
						atualizarCalculo(varProduzirPedraFundamental, "ProduzirPedraFundamental", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPericiaComOridecon, "PericiaComOridecon", 5, 2, "Aumentar");

				}
			});
			btForjarMachadoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varForjarAdaga<1 && count<1){
						atualizarCalculo(varForjarAdaga, "ForjarAdaga", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varForjarEspada<2 && count<2){
						atualizarCalculo(varForjarEspada, "ForjarEspada", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varForjarMachado, "ForjarMachado", 3, 2, "Aumentar");

				}
			});
			btForjarAdagaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varForjarAdaga, "ForjarAdaga", 3, 2, "Aumentar");

				}
			});
			btForjarSoqueiraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varForjarAdaga<1 && count<1){
						atualizarCalculo(varForjarAdaga, "ForjarAdaga", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varForjarSoqueira, "ForjarSoqueira", 3, 2, "Aumentar");

				}
			});
			btForjarMacaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varForjarAdaga<1 && count<1){
						atualizarCalculo(varForjarAdaga, "ForjarAdaga", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varForjarSoqueira<1 && count<1){
						atualizarCalculo(varForjarSoqueira, "ForjarSoqueira", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varForjarMaca, "ForjarMaca", 3, 2, "Aumentar");

				}
			});
			btForjarLancaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varForjarAdaga<2 && count<2){
						atualizarCalculo(varForjarAdaga, "ForjarAdaga", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varForjarLanca, "ForjarLanca", 3, 2, "Aumentar");

				}
			});
			btForjarEspadaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varForjarAdaga<1 && count<1){
						atualizarCalculo(varForjarAdaga, "ForjarAdaga", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varForjarEspada, "ForjarEspada", 3, 2, "Aumentar");

				}
			});
			btForjarEspadaDeDuasMaosAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varForjarAdaga<1 && count<1){
						atualizarCalculo(varForjarAdaga, "ForjarAdaga", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varForjarEspada<1 && count<1){
						atualizarCalculo(varForjarEspada, "ForjarEspada", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varForjarEspadaDeDuasMaos, "ForjarEspadaDeDuasMaos", 3, 2, "Aumentar");

				}
			});
			btImpulsoNoCarrinhoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAumentarCapacidadeDeCarga<5 && count<5){
						atualizarCalculo(varAumentarCapacidadeDeCarga, "AumentarCapacidadeDeCarga", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varUsarCarrinho<5 && count<5){
						atualizarCalculo(varUsarCarrinho, "UsarCarrinho", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoFirme<1 && count<1){
						atualizarCalculo(varPunhoFirme, "PunhoFirme", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varImpulsoNoCarrinho, "ImpulsoNoCarrinho", 1, 3, "Aumentar");

				}
			});
			btChoqueDoCarrinhoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varMammonita<10 && count<10){
						atualizarCalculo(varMammonita, "Mammonita", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMarteloDeThor<5 && count<5){
						atualizarCalculo(varMarteloDeThor, "MarteloDeThor", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAumentarCapacidadeDeCarga<5 && count<5){
						atualizarCalculo(varAumentarCapacidadeDeCarga, "AumentarCapacidadeDeCarga", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varUsarCarrinho<5 && count<5){
						atualizarCalculo(varUsarCarrinho, "UsarCarrinho", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoFirme<1 && count<1){
						atualizarCalculo(varPunhoFirme, "PunhoFirme", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpulsoNoCarrinho<1 && count<1){
						atualizarCalculo(varImpulsoNoCarrinho, "ImpulsoNoCarrinho", 1, 3, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varChoqueDoCarrinho, "ChoqueDoCarrinho", 10, 3, "Aumentar");

				}
			});
			btForcaViolentissimaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varMarteloDeThor<2 && count<2){
						atualizarCalculo(varMarteloDeThor, "MarteloDeThor", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAdrenalinaPura<3 && count<3){
						atualizarCalculo(varAdrenalinaPura, "AdrenalinaPura", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varForcaViolenta<5 && count<5){
						atualizarCalculo(varForcaViolenta, "ForcaViolenta", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varForcaViolentissima, "ForcaViolentissima", 5, 3, "Aumentar");

				}
			});
			btGolpeEstilhacanteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varResistenciaAoFogo<3 && count<3){
						atualizarCalculo(varResistenciaAoFogo, "ResistenciaAoFogo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoFirme<1 && count<1){
						atualizarCalculo(varPunhoFirme, "PunhoFirme", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaEmArmamento<5 && count<5){
						atualizarCalculo(varPericiaEmArmamento, "PericiaEmArmamento", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMarteloDeThor<2 && count<2){
						atualizarCalculo(varMarteloDeThor, "MarteloDeThor", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAdrenalinaPura<3 && count<3){
						atualizarCalculo(varAdrenalinaPura, "AdrenalinaPura", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varForcaViolenta<3 && count<3){
						atualizarCalculo(varForcaViolenta, "ForcaViolenta", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGolpeEstilhacante, "GolpeEstilhacante", 10, 3, "Aumentar");

				}
			});
			btAprimorarArmamentoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPunhoFirme<1 && count<1){
						atualizarCalculo(varPunhoFirme, "PunhoFirme", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaEmArmamento<10 && count<10){
						atualizarCalculo(varPericiaEmArmamento, "PericiaEmArmamento", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAprimorarArmamento, "AprimorarArmamento", 10, 3, "Aumentar");

				}
			});
			btMaestriaComMachadosAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMaestriaComMachados, "MaestriaComMachados", 10, 4, "Aumentar");

				}
			});
			btArremessoDeMachadoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varMaestriaComMachados<1 && count<1){
						atualizarCalculo(varMaestriaComMachados, "MaestriaComMachados", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArremessoDeMachado, "ArremessoDeMachado", 5, 4, "Aumentar");

				}
			});
			btFuriaDoFuracaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varMaestriaComMachados<1 && count<1){
						atualizarCalculo(varMaestriaComMachados, "MaestriaComMachados", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFuriaDoFuracao, "FuriaDoFuracao", 5, 4, "Aumentar");

				}
			});
			btBrandirMachadoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varMaestriaComMachados<1 && count<1){
						atualizarCalculo(varMaestriaComMachados, "MaestriaComMachados", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessoDeMachado<3 && count<3){
						atualizarCalculo(varArremessoDeMachado, "ArremessoDeMachado", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBrandirMachado, "BrandirMachado", 5, 4, "Aumentar");

				}
			});
			btSabedoriaDeHefestoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSabedoriaDeHefesto, "SabedoriaDeHefesto", 5, 4, "Aumentar");

				}
			});
			btArtilhariaCacadoraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varSabedoriaDeHefesto<2 && count<2){
						atualizarCalculo(varSabedoriaDeHefesto, "SabedoriaDeHefesto", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArtilhariaCacadora, "ArtilhariaCacadora", 5, 4, "Aumentar");

				}
			});
			btArtilhariaArcanaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varSabedoriaDeHefesto<2 && count<2){
						atualizarCalculo(varSabedoriaDeHefesto, "SabedoriaDeHefesto", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varArtilhariaCacadora<2 && count<2){
						atualizarCalculo(varArtilhariaCacadora, "ArtilhariaCacadora", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArtilhariaArcana, "ArtilhariaArcana", 5, 4, "Aumentar");

				}
			});
			btRemoverArtilhariaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varSabedoriaDeHefesto<2 && count<2){
						atualizarCalculo(varSabedoriaDeHefesto, "SabedoriaDeHefesto", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varArtilhariaCacadora<1 && count<1){
						atualizarCalculo(varArtilhariaCacadora, "ArtilhariaCacadora", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRemoverArtilharia, "RemoverArtilharia", 1, 4, "Aumentar");

				}
			});
			btLicencaDePilotagemAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");

				}
			});
			btRepararAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<2 && count<2){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varReparar, "Reparar", 5, 4, "Aumentar");

				}
			});
			btPunhoFogueteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<1 && count<1){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPunhoFoguete, "PunhoFoguete", 5, 4, "Aumentar");

				}
			});
			btBateEstacaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<1 && count<1){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoFoguete<2 && count<2){
						atualizarCalculo(varPunhoFoguete, "PunhoFoguete", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBateEstaca, "BateEstaca", 3, 4, "Aumentar");

				}
			});
			btMetralhadoraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<1 && count<1){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoFoguete<2 && count<2){
						atualizarCalculo(varPunhoFoguete, "PunhoFoguete", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMetralhadora, "Metralhadora", 3, 4, "Aumentar");

				}
			});
			btLancaChamasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<1 && count<1){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoFoguete<2 && count<2){
						atualizarCalculo(varPunhoFoguete, "PunhoFoguete", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMetralhadora<1 && count<1){
						atualizarCalculo(varMetralhadora, "Metralhadora", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varLancaChamas, "LancaChamas", 3, 4, "Aumentar");

				}
			});
			btGasCriogenicoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<1 && count<1){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoFoguete<2 && count<2){
						atualizarCalculo(varPunhoFoguete, "PunhoFoguete", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMetralhadora<3 && count<3){
						atualizarCalculo(varMetralhadora, "Metralhadora", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGasCriogenico, "GasCriogenico", 3, 4, "Aumentar");

				}
			});
			btCanhaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<1 && count<1){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoFoguete<2 && count<2){
						atualizarCalculo(varPunhoFoguete, "PunhoFoguete", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMetralhadora<1 && count<1){
						atualizarCalculo(varMetralhadora, "Metralhadora", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancaChamas<2 && count<2){
						atualizarCalculo(varLancaChamas, "LancaChamas", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicencaDePilotagem<1 && count<1){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPunhoFoguete<2 && count<2){
						atualizarCalculo(varPunhoFoguete, "PunhoFoguete", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMetralhadora<3 && count<3){
						atualizarCalculo(varMetralhadora, "Metralhadora", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varGasCriogenico<2 && count<2){
						atualizarCalculo(varGasCriogenico, "GasCriogenico", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCanhao, "Canhao", 3, 4, "Aumentar");

				}
			});
			btAceleracaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<1 && count<1){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAceleracao, "Aceleracao", 3, 4, "Aumentar");

				}
			});
			btPlanarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<1 && count<1){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAceleracao<1 && count<1){
						atualizarCalculo(varAceleracao, "Aceleracao", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPlanar, "Planar", 1, 4, "Aumentar");

				}
			});
			btPropulsaoDianteiraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<1 && count<1){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAceleracao<1 && count<1){
						atualizarCalculo(varAceleracao, "Aceleracao", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPlanar<1 && count<1){
						atualizarCalculo(varPlanar, "Planar", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPropulsaoDianteira, "PropulsaoDianteira", 1, 4, "Aumentar");

				}
			});
			btPropulsaoTraseiraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<1 && count<1){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAceleracao<1 && count<1){
						atualizarCalculo(varAceleracao, "Aceleracao", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPlanar<1 && count<1){
						atualizarCalculo(varPlanar, "Planar", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPropulsaoTraseira, "PropulsaoTraseira", 1, 4, "Aumentar");

				}
			});
			btReforcarEstruturaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<4 && count<4){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varReforcarEstrutura, "ReforcarEstrutura", 5, 4, "Aumentar");

				}
			});
			btAutodestruicaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<4 && count<4){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varReforcarEstrutura<2 && count<2){
						atualizarCalculo(varReforcarEstrutura, "ReforcarEstrutura", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAutodestruicao, "Autodestruicao", 3, 4, "Aumentar");

				}
			});
			btResfriamentoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<4 && count<4){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varReforcarEstrutura<2 && count<2){
						atualizarCalculo(varReforcarEstrutura, "ReforcarEstrutura", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAutodestruicao<2 && count<2){
						atualizarCalculo(varAutodestruicao, "Autodestruicao", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varResfriamento, "Resfriamento", 1, 4, "Aumentar");

				}
			});
			btCampoMagneticoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<4 && count<4){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varReforcarEstrutura<2 && count<2){
						atualizarCalculo(varReforcarEstrutura, "ReforcarEstrutura", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAutodestruicao<2 && count<2){
						atualizarCalculo(varAutodestruicao, "Autodestruicao", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varResfriamento<1 && count<1){
						atualizarCalculo(varResfriamento, "Resfriamento", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCampoMagnetico, "CampoMagnetico", 3, 4, "Aumentar");

				}
			});
			btCampoProtetorAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<4 && count<4){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varReforcarEstrutura<2 && count<2){
						atualizarCalculo(varReforcarEstrutura, "ReforcarEstrutura", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAutodestruicao<2 && count<2){
						atualizarCalculo(varAutodestruicao, "Autodestruicao", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varResfriamento<1 && count<1){
						atualizarCalculo(varResfriamento, "Resfriamento", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCampoMagnetico<2 && count<2){
						atualizarCalculo(varCampoMagnetico, "CampoMagnetico", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCampoProtetor, "CampoProtetor", 3, 4, "Aumentar");

				}
			});
			btReconfigurarElementoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<4 && count<4){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varReforcarEstrutura<2 && count<2){
						atualizarCalculo(varReforcarEstrutura, "ReforcarEstrutura", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varReconfigurarElemento, "ReconfigurarElemento", 4, 4, "Aumentar");

				}
			});
			btSensorInfravermelhoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<4 && count<4){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varReforcarEstrutura<2 && count<2){
						atualizarCalculo(varReforcarEstrutura, "ReforcarEstrutura", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varReconfigurarElemento<2 && count<2){
						atualizarCalculo(varReconfigurarElemento, "ReconfigurarElemento", 4, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSensorInfravermelho, "SensorInfravermelho", 3, 4, "Aumentar");

				}
			});
			btAnalisarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<4 && count<4){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varReforcarEstrutura<2 && count<2){
						atualizarCalculo(varReforcarEstrutura, "ReforcarEstrutura", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varReconfigurarElemento<2 && count<2){
						atualizarCalculo(varReconfigurarElemento, "ReconfigurarElemento", 4, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSensorInfravermelho<1 && count<1){
						atualizarCalculo(varSensorInfravermelho, "SensorInfravermelho", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAnalisar, "Analisar", 3, 4, "Aumentar");

				}
			});
			btCampoDeInvisibilidadeAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varLicencaDePilotagem<4 && count<4){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varReforcarEstrutura<2 && count<2){
						atualizarCalculo(varReforcarEstrutura, "ReforcarEstrutura", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varReconfigurarElemento<2 && count<2){
						atualizarCalculo(varReconfigurarElemento, "ReconfigurarElemento", 4, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSensorInfravermelho<1 && count<1){
						atualizarCalculo(varSensorInfravermelho, "SensorInfravermelho", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAnalisar<3 && count<3){
						atualizarCalculo(varAnalisar, "Analisar", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varLicencaDePilotagem<4 && count<4){
						atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varReforcarEstrutura<2 && count<2){
						atualizarCalculo(varReforcarEstrutura, "ReforcarEstrutura", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAutodestruicao<2 && count<2){
						atualizarCalculo(varAutodestruicao, "Autodestruicao", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varResfriamento<1 && count<1){
						atualizarCalculo(varResfriamento, "Resfriamento", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCampoMagnetico<2 && count<2){
						atualizarCalculo(varCampoMagnetico, "CampoMagnetico", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCampoProtetor<2 && count<2){
						atualizarCalculo(varCampoProtetor, "CampoProtetor", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCampoDeInvisibilidade, "CampoDeInvisibilidade", 3, 4, "Aumentar");

				}
			});


			//Eventos de diminuir
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
			btAdrenalinaPuraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAdrenalinaPura, "AdrenalinaPura", 5, 2, "Diminuir");

				}
			});
			btMarteloDeThorDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMarteloDeThor, "MarteloDeThor", 5, 2, "Diminuir");

				}
			});
			btPunhoFirmeDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPunhoFirme, "PunhoFirme", 1, 2, "Diminuir");

				}
			});
			btAmplificarPoderDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAmplificarPoder, "AmplificarPoder", 5, 2, "Diminuir");

				}
			});
			btForcaViolentaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varForcaViolenta, "ForcaViolenta", 5, 2, "Diminuir");

				}
			});
			btResistenciaAoFogoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varResistenciaAoFogo, "ResistenciaAoFogo", 5, 2, "Diminuir");

				}
			});
			btManejoPerfeitoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varManejoPerfeito, "ManejoPerfeito", 5, 2, "Diminuir");

				}
			});
			btConsertarArmaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varConsertarArma, "ConsertarArma", 1, 2, "Diminuir");

				}
			});
			btPericiaEmArmamentoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaEmArmamento, "PericiaEmArmamento", 10, 2, "Diminuir");

				}
			});
			btEncontrarMinerioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEncontrarMinerio, "EncontrarMinerio", 1, 2, "Diminuir");

				}
			});
			btProduzirPedraFundamentalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varProduzirPedraFundamental, "ProduzirPedraFundamental", 5, 2, "Diminuir");

				}
			});
			btTrabalharFerroDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTrabalharFerro, "TrabalharFerro", 5, 2, "Diminuir");

				}
			});
			btTrabalharAcoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTrabalharAco, "TrabalharAco", 5, 2, "Diminuir");

				}
			});
			btPericiaComOrideconDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComOridecon, "PericiaComOridecon", 5, 2, "Diminuir");

				}
			});
			btForjarMachadoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varForjarMachado, "ForjarMachado", 3, 2, "Diminuir");

				}
			});
			btForjarAdagaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varForjarAdaga, "ForjarAdaga", 3, 2, "Diminuir");

				}
			});
			btForjarSoqueiraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varForjarSoqueira, "ForjarSoqueira", 3, 2, "Diminuir");

				}
			});
			btForjarMacaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varForjarMaca, "ForjarMaca", 3, 2, "Diminuir");

				}
			});
			btForjarLancaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varForjarLanca, "ForjarLanca", 3, 2, "Diminuir");

				}
			});
			btForjarEspadaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varForjarEspada, "ForjarEspada", 3, 2, "Diminuir");

				}
			});
			btForjarEspadaDeDuasMaosDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varForjarEspadaDeDuasMaos, "ForjarEspadaDeDuasMaos", 3, 2, "Diminuir");

				}
			});
			btImpulsoNoCarrinhoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varImpulsoNoCarrinho, "ImpulsoNoCarrinho", 1, 3, "Diminuir");

				}
			});
			btChoqueDoCarrinhoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChoqueDoCarrinho, "ChoqueDoCarrinho", 10, 3, "Diminuir");

				}
			});
			btForcaViolentissimaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varForcaViolentissima, "ForcaViolentissima", 5, 3, "Diminuir");

				}
			});
			btGolpeEstilhacanteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGolpeEstilhacante, "GolpeEstilhacante", 10, 3, "Diminuir");

				}
			});
			btAprimorarArmamentoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAprimorarArmamento, "AprimorarArmamento", 10, 3, "Diminuir");

				}
			});
			btMaestriaComMachadosDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMaestriaComMachados, "MaestriaComMachados", 10, 4, "Diminuir");

				}
			});
			btArremessoDeMachadoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArremessoDeMachado, "ArremessoDeMachado", 5, 4, "Diminuir");

				}
			});
			btFuriaDoFuracaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFuriaDoFuracao, "FuriaDoFuracao", 5, 4, "Diminuir");

				}
			});
			btBrandirMachadoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBrandirMachado, "BrandirMachado", 5, 4, "Diminuir");

				}
			});
			btSabedoriaDeHefestoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSabedoriaDeHefesto, "SabedoriaDeHefesto", 5, 4, "Diminuir");

				}
			});
			btArtilhariaCacadoraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArtilhariaCacadora, "ArtilhariaCacadora", 5, 4, "Diminuir");

				}
			});
			btArtilhariaArcanaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArtilhariaArcana, "ArtilhariaArcana", 5, 4, "Diminuir");

				}
			});
			btRemoverArtilhariaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRemoverArtilharia, "RemoverArtilharia", 1, 4, "Diminuir");

				}
			});
			btLicencaDePilotagemDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLicencaDePilotagem, "LicencaDePilotagem", 5, 4, "Diminuir");

				}
			});
			btRepararDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varReparar, "Reparar", 5, 4, "Diminuir");

				}
			});
			btPunhoFogueteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPunhoFoguete, "PunhoFoguete", 5, 4, "Diminuir");

				}
			});
			btBateEstacaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBateEstaca, "BateEstaca", 3, 4, "Diminuir");

				}
			});
			btMetralhadoraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMetralhadora, "Metralhadora", 3, 4, "Diminuir");

				}
			});
			btLancaChamasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLancaChamas, "LancaChamas", 3, 4, "Diminuir");

				}
			});
			btGasCriogenicoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGasCriogenico, "GasCriogenico", 3, 4, "Diminuir");

				}
			});
			btCanhaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCanhao, "Canhao", 3, 4, "Diminuir");

				}
			});
			btAceleracaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAceleracao, "Aceleracao", 3, 4, "Diminuir");

				}
			});
			btPlanarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPlanar, "Planar", 1, 4, "Diminuir");

				}
			});
			btPropulsaoDianteiraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPropulsaoDianteira, "PropulsaoDianteira", 1, 4, "Diminuir");

				}
			});
			btPropulsaoTraseiraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPropulsaoTraseira, "PropulsaoTraseira", 1, 4, "Diminuir");

				}
			});
			btReforcarEstruturaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varReforcarEstrutura, "ReforcarEstrutura", 5, 4, "Diminuir");

				}
			});
			btAutodestruicaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAutodestruicao, "Autodestruicao", 3, 4, "Diminuir");

				}
			});
			btResfriamentoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varResfriamento, "Resfriamento", 1, 4, "Diminuir");

				}
			});
			btCampoMagneticoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCampoMagnetico, "CampoMagnetico", 3, 4, "Diminuir");

				}
			});
			btCampoProtetorDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCampoProtetor, "CampoProtetor", 3, 4, "Diminuir");

				}
			});
			btReconfigurarElementoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varReconfigurarElemento, "ReconfigurarElemento", 4, 4, "Diminuir");

				}
			});
			btSensorInfravermelhoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSensorInfravermelho, "SensorInfravermelho", 3, 4, "Diminuir");

				}
			});
			btAnalisarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAnalisar, "Analisar", 3, 4, "Diminuir");

				}
			});
			btCampoDeInvisibilidadeDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCampoDeInvisibilidade, "CampoDeInvisibilidade", 3, 4, "Diminuir");

				}
			});


			//Outros Botões
			btResetar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					varMammonita = 0;
					varDesconto = 0;
					varSuperfaturar = 0;
					varAumentarCapacidadeDeCarga = 0;
					varUsarCarrinho = 0;
					varComercio = 0;
					varIdentificarItem = 0;
					varAdrenalinaPura = 0;
					varMarteloDeThor = 0;
					varPunhoFirme = 0;
					varAmplificarPoder = 0;
					varForcaViolenta = 0;
					varResistenciaAoFogo = 0;
					varManejoPerfeito = 0;
					varConsertarArma = 0;
					varPericiaEmArmamento = 0;
					varEncontrarMinerio = 0;
					varProduzirPedraFundamental = 0;
					varTrabalharFerro = 0;
					varTrabalharAco = 0;
					varPericiaComOridecon = 0;
					varForjarMachado = 0;
					varForjarAdaga = 0;
					varForjarSoqueira = 0;
					varForjarMaca = 0;
					varForjarLanca = 0;
					varForjarEspada = 0;
					varForjarEspadaDeDuasMaos = 0;
					varImpulsoNoCarrinho = 0;
					varChoqueDoCarrinho = 0;
					varForcaViolentissima = 0;
					varGolpeEstilhacante = 0;
					varAprimorarArmamento = 0;
					varMaestriaComMachados = 0;
					varArremessoDeMachado = 0;
					varFuriaDoFuracao = 0;
					varBrandirMachado = 0;
					varSabedoriaDeHefesto = 0;
					varArtilhariaCacadora = 0;
					varArtilhariaArcana = 0;
					varRemoverArtilharia = 0;
					varLicencaDePilotagem = 0;
					varReparar = 0;
					varPunhoFoguete = 0;
					varBateEstaca = 0;
					varMetralhadora = 0;
					varLancaChamas = 0;
					varGasCriogenico = 0;
					varCanhao = 0;
					varAceleracao = 0;
					varPlanar = 0;
					varPropulsaoDianteira = 0;
					varPropulsaoTraseira = 0;
					varReforcarEstrutura = 0;
					varAutodestruicao = 0;
					varResfriamento = 0;
					varCampoMagnetico = 0;
					varCampoProtetor = 0;
					varReconfigurarElemento = 0;
					varSensorInfravermelho = 0;
					varAnalisar = 0;
					varCampoDeInvisibilidade = 0;

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
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorMecanico.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorMecanico.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorMecanico.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorMecanico.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorMecanico.this);
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

					AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorMecanico.this);
					msg.setTitle("Escolha um nome");
					msg.setMessage("OBS: Salvar PNG só irá salvar em forma de imagem! É recomendado que salve a build na memória do celular também.\nEscolha um nome para salvar esta simulação:");
					final EditText nomeParaSalvar = new EditText(SimuladorMecanico.this);
					msg.setView(nomeParaSalvar);
					msg.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {

							@Override
						public void onClick(DialogInterface dialog, int which) {
							if (nomeParaSalvar.getText().toString().length() <= 0) {
								nomeParaSalvar.setError("Preencha o campo!");
								Toast.makeText(getBaseContext(), "ERROR: Insira um nome!", Toast.LENGTH_SHORT).show();
							} else {
								SaveFile sf = new SaveFile();
								sf.takeAScreenShot(SimuladorMecanico.this, layPrincipal, nomeParaSalvar.getText().toString());
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

			if(varAdrenalinaPura==0)
				layAdrenalinaPura.setVisibility(View.GONE);
			if(varMarteloDeThor==0)
				layMarteloDeThor.setVisibility(View.GONE);
			if(varPunhoFirme==0)
				layPunhoFirme.setVisibility(View.GONE);
			if(varAmplificarPoder==0)
				layAmplificarPoder.setVisibility(View.GONE);
			if(varForcaViolenta==0)
				layForcaViolenta.setVisibility(View.GONE);
			if(varResistenciaAoFogo==0)
				layResistenciaAoFogo.setVisibility(View.GONE);
			if(varManejoPerfeito==0)
				layManejoPerfeito.setVisibility(View.GONE);
			if(varConsertarArma==0)
				layConsertarArma.setVisibility(View.GONE);
			if(varPericiaEmArmamento==0)
				layPericiaEmArmamento.setVisibility(View.GONE);
			if(varEncontrarMinerio==0)
				layEncontrarMinerio.setVisibility(View.GONE);
			if(varProduzirPedraFundamental==0)
				layProduzirPedraFundamental.setVisibility(View.GONE);
			if(varTrabalharFerro==0)
				layTrabalharFerro.setVisibility(View.GONE);
			if(varTrabalharAco==0)
				layTrabalharAco.setVisibility(View.GONE);
			if(varPericiaComOridecon==0)
				layPericiaComOridecon.setVisibility(View.GONE);
			if(varForjarMachado==0)
				layForjarMachado.setVisibility(View.GONE);
			if(varForjarAdaga==0)
				layForjarAdaga.setVisibility(View.GONE);
			if(varForjarSoqueira==0)
				layForjarSoqueira.setVisibility(View.GONE);
			if(varForjarMaca==0)
				layForjarMaca.setVisibility(View.GONE);
			if(varForjarLanca==0)
				layForjarLanca.setVisibility(View.GONE);
			if(varForjarEspada==0)
				layForjarEspada.setVisibility(View.GONE);
			if(varForjarEspadaDeDuasMaos==0)
				layForjarEspadaDeDuasMaos.setVisibility(View.GONE);

			if(varImpulsoNoCarrinho==0)
				layImpulsoNoCarrinho.setVisibility(View.GONE);
			if(varChoqueDoCarrinho==0)
				layChoqueDoCarrinho.setVisibility(View.GONE);
			if(varForcaViolentissima==0)
				layForcaViolentissima.setVisibility(View.GONE);
			if(varGolpeEstilhacante==0)
				layGolpeEstilhacante.setVisibility(View.GONE);
			if(varAprimorarArmamento==0)
				layAprimorarArmamento.setVisibility(View.GONE);

			if(varMaestriaComMachados==0)
				layMaestriaComMachados.setVisibility(View.GONE);
			if(varArremessoDeMachado==0)
				layArremessoDeMachado.setVisibility(View.GONE);
			if(varFuriaDoFuracao==0)
				layFuriaDoFuracao.setVisibility(View.GONE);
			if(varBrandirMachado==0)
				layBrandirMachado.setVisibility(View.GONE);
			if(varSabedoriaDeHefesto==0)
				laySabedoriaDeHefesto.setVisibility(View.GONE);
			if(varArtilhariaCacadora==0)
				layArtilhariaCacadora.setVisibility(View.GONE);
			if(varArtilhariaArcana==0)
				layArtilhariaArcana.setVisibility(View.GONE);
			if(varRemoverArtilharia==0)
				layRemoverArtilharia.setVisibility(View.GONE);
			if(varLicencaDePilotagem==0)
				layLicencaDePilotagem.setVisibility(View.GONE);
			if(varReparar==0)
				layReparar.setVisibility(View.GONE);
			if(varPunhoFoguete==0)
				layPunhoFoguete.setVisibility(View.GONE);
			if(varBateEstaca==0)
				layBateEstaca.setVisibility(View.GONE);
			if(varMetralhadora==0)
				layMetralhadora.setVisibility(View.GONE);
			if(varLancaChamas==0)
				layLancaChamas.setVisibility(View.GONE);
			if(varGasCriogenico==0)
				layGasCriogenico.setVisibility(View.GONE);
			if(varCanhao==0)
				layCanhao.setVisibility(View.GONE);
			if(varAceleracao==0)
				layAceleracao.setVisibility(View.GONE);
			if(varPlanar==0)
				layPlanar.setVisibility(View.GONE);
			if(varPropulsaoDianteira==0)
				layPropulsaoDianteira.setVisibility(View.GONE);
			if(varPropulsaoTraseira==0)
				layPropulsaoTraseira.setVisibility(View.GONE);
			if(varReforcarEstrutura==0)
				layReforcarEstrutura.setVisibility(View.GONE);
			if(varAutodestruicao==0)
				layAutodestruicao.setVisibility(View.GONE);
			if(varResfriamento==0)
				layResfriamento.setVisibility(View.GONE);
			if(varCampoMagnetico==0)
				layCampoMagnetico.setVisibility(View.GONE);
			if(varCampoProtetor==0)
				layCampoProtetor.setVisibility(View.GONE);
			if(varReconfigurarElemento==0)
				layReconfigurarElemento.setVisibility(View.GONE);
			if(varSensorInfravermelho==0)
				laySensorInfravermelho.setVisibility(View.GONE);
			if(varAnalisar==0)
				layAnalisar.setVisibility(View.GONE);
			if(varCampoDeInvisibilidade==0)
				layCampoDeInvisibilidade.setVisibility(View.GONE);

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

				if (nomeDaHabilidade=="MarteloDeThor" && varAdrenalinaPura>=1 && varMarteloDeThor<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ForcaViolenta" && varAmplificarPoder>=1 && varForcaViolenta<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ManejoPerfeito" && varAmplificarPoder>=1 && varManejoPerfeito<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AdrenalinaPura" && varForcaViolenta>=1 && varAdrenalinaPura<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AdrenalinaPura" && varManejoPerfeito>=1 && varAdrenalinaPura<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaEmArmamento" && varManejoPerfeito>=1 && varPericiaEmArmamento<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaEmArmamento" && varConsertarArma>=1 && varPericiaEmArmamento<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhoFirme" && varPericiaEmArmamento>=1 && varPunhoFirme<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhoFirme" && varEncontrarMinerio>=1 && varPunhoFirme<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TrabalharAco" && varEncontrarMinerio>=1 && varTrabalharAco<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TrabalharFerro" && varProduzirPedraFundamental>=1 && varTrabalharFerro<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TrabalharFerro" && varTrabalharAco>=1 && varTrabalharFerro<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ProduzirPedraFundamental" && varPericiaComOridecon>=1 && varProduzirPedraFundamental<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ForjarEspada" && varForjarMachado>=1 && varForjarEspada<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ForjarAdaga" && varForjarSoqueira>=1 && varForjarAdaga<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ForjarSoqueira" && varForjarMaca>=1 && varForjarSoqueira<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ForjarAdaga" && varForjarLanca>=1 && varForjarAdaga<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ForjarAdaga" && varForjarEspada>=1 && varForjarAdaga<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ForjarEspada" && varForjarEspadaDeDuasMaos>=1 && varForjarEspada<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="UsarCarrinho" && varImpulsoNoCarrinho>=1 && varUsarCarrinho<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhoFirme" && varImpulsoNoCarrinho>=1 && varPunhoFirme<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Mammonita" && varChoqueDoCarrinho>=1 && varMammonita<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MarteloDeThor" && varChoqueDoCarrinho>=1 && varMarteloDeThor<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ImpulsoNoCarrinho" && varChoqueDoCarrinho>=1 && varImpulsoNoCarrinho<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ForcaViolenta" && varForcaViolentissima>=1 && varForcaViolenta<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ResistenciaAoFogo" && varGolpeEstilhacante>=1 && varResistenciaAoFogo<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaEmArmamento" && varGolpeEstilhacante>=1 && varPericiaEmArmamento<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ForcaViolenta" && varGolpeEstilhacante>=1 && varForcaViolenta<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaEmArmamento" && varAprimorarArmamento>=1 && varPericiaEmArmamento<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MaestriaComMachados" && varArremessoDeMachado>=1 && varMaestriaComMachados<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MaestriaComMachados" && varFuriaDoFuracao>=1 && varMaestriaComMachados<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArremessoDeMachado" && varBrandirMachado>=1 && varArremessoDeMachado<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="SabedoriaDeHefesto" && varArtilhariaCacadora>=1 && varSabedoriaDeHefesto<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArtilhariaCacadora" && varArtilhariaArcana>=1 && varArtilhariaCacadora<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArtilhariaCacadora" && varRemoverArtilharia>=1 && varArtilhariaCacadora<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LicencaDePilotagem" && varReparar>=1 && varLicencaDePilotagem<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LicencaDePilotagem" && varPunhoFoguete>=1 && varLicencaDePilotagem<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhoFoguete" && varBateEstaca>=1 && varPunhoFoguete<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PunhoFoguete" && varMetralhadora>=1 && varPunhoFoguete<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Metralhadora" && varLancaChamas>=1 && varMetralhadora<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Metralhadora" && varGasCriogenico>=1 && varMetralhadora<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LancaChamas" && varCanhao>=1 && varLancaChamas<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="GasCriogenico" && varCanhao>=1 && varGasCriogenico<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LicencaDePilotagem" && varAceleracao>=1 && varLicencaDePilotagem<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Aceleracao" && varPlanar>=1 && varAceleracao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Planar" && varPropulsaoDianteira>=1 && varPlanar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Planar" && varPropulsaoTraseira>=1 && varPlanar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LicencaDePilotagem" && varReforcarEstrutura>=1 && varLicencaDePilotagem<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ReforcarEstrutura" && varAutodestruicao>=1 && varReforcarEstrutura<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Autodestruicao" && varResfriamento>=1 && varAutodestruicao<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Resfriamento" && varCampoMagnetico>=1 && varResfriamento<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CampoMagnetico" && varCampoProtetor>=1 && varCampoMagnetico<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ReforcarEstrutura" && varReconfigurarElemento>=1 && varReforcarEstrutura<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ReconfigurarElemento" && varSensorInfravermelho>=1 && varReconfigurarElemento<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="SensorInfravermelho" && varAnalisar>=1 && varSensorInfravermelho<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Analisar" && varCampoDeInvisibilidade>=1 && varAnalisar<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CampoProtetor" && varCampoDeInvisibilidade>=1 && varCampoProtetor<=02){
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
			if(nomeDaHabilidade=="Mammonita"){
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
			}

			else if(nomeDaHabilidade=="AdrenalinaPura"){
				varAdrenalinaPura = habilidade;
			} else if(nomeDaHabilidade=="MarteloDeThor"){
				varMarteloDeThor = habilidade;
			} else if(nomeDaHabilidade=="PunhoFirme"){
				varPunhoFirme = habilidade;
			} else if(nomeDaHabilidade=="AmplificarPoder"){
				varAmplificarPoder = habilidade;
			} else if(nomeDaHabilidade=="ForcaViolenta"){
				varForcaViolenta = habilidade;
			} else if(nomeDaHabilidade=="ResistenciaAoFogo"){
				varResistenciaAoFogo = habilidade;
			} else if(nomeDaHabilidade=="ManejoPerfeito"){
				varManejoPerfeito = habilidade;
			} else if(nomeDaHabilidade=="ConsertarArma"){
				varConsertarArma = habilidade;
			} else if(nomeDaHabilidade=="PericiaEmArmamento"){
				varPericiaEmArmamento = habilidade;
			} else if(nomeDaHabilidade=="EncontrarMinerio"){
				varEncontrarMinerio = habilidade;
			} else if(nomeDaHabilidade=="ProduzirPedraFundamental"){
				varProduzirPedraFundamental = habilidade;
			} else if(nomeDaHabilidade=="TrabalharFerro"){
				varTrabalharFerro = habilidade;
			} else if(nomeDaHabilidade=="TrabalharAco"){
				varTrabalharAco = habilidade;
			} else if(nomeDaHabilidade=="PericiaComOridecon"){
				varPericiaComOridecon = habilidade;
			} else if(nomeDaHabilidade=="ForjarMachado"){
				varForjarMachado = habilidade;
			} else if(nomeDaHabilidade=="ForjarAdaga"){
				varForjarAdaga = habilidade;
			} else if(nomeDaHabilidade=="ForjarSoqueira"){
				varForjarSoqueira = habilidade;
			} else if(nomeDaHabilidade=="ForjarMaca"){
				varForjarMaca = habilidade;
			} else if(nomeDaHabilidade=="ForjarLanca"){
				varForjarLanca = habilidade;
			} else if(nomeDaHabilidade=="ForjarEspada"){
				varForjarEspada = habilidade;
			} else if(nomeDaHabilidade=="ForjarEspadaDeDuasMaos"){
				varForjarEspadaDeDuasMaos = habilidade;
			}

			else if(nomeDaHabilidade=="ImpulsoNoCarrinho"){
				varImpulsoNoCarrinho = habilidade;
			} else if(nomeDaHabilidade=="ChoqueDoCarrinho"){
				varChoqueDoCarrinho = habilidade;
			} else if(nomeDaHabilidade=="ForcaViolentissima"){
				varForcaViolentissima = habilidade;
			} else if(nomeDaHabilidade=="GolpeEstilhacante"){
				varGolpeEstilhacante = habilidade;
			} else if(nomeDaHabilidade=="AprimorarArmamento"){
				varAprimorarArmamento = habilidade;
			}

			else if(nomeDaHabilidade=="MaestriaComMachados"){
				varMaestriaComMachados = habilidade;
			} else if(nomeDaHabilidade=="ArremessoDeMachado"){
				varArremessoDeMachado = habilidade;
			} else if(nomeDaHabilidade=="FuriaDoFuracao"){
				varFuriaDoFuracao = habilidade;
			} else if(nomeDaHabilidade=="BrandirMachado"){
				varBrandirMachado = habilidade;
			} else if(nomeDaHabilidade=="SabedoriaDeHefesto"){
				varSabedoriaDeHefesto = habilidade;
			} else if(nomeDaHabilidade=="ArtilhariaCacadora"){
				varArtilhariaCacadora = habilidade;
			} else if(nomeDaHabilidade=="ArtilhariaArcana"){
				varArtilhariaArcana = habilidade;
			} else if(nomeDaHabilidade=="RemoverArtilharia"){
				varRemoverArtilharia = habilidade;
			} else if(nomeDaHabilidade=="LicencaDePilotagem"){
				varLicencaDePilotagem = habilidade;
			} else if(nomeDaHabilidade=="Reparar"){
				varReparar = habilidade;
			} else if(nomeDaHabilidade=="PunhoFoguete"){
				varPunhoFoguete = habilidade;
			} else if(nomeDaHabilidade=="BateEstaca"){
				varBateEstaca = habilidade;
			} else if(nomeDaHabilidade=="Metralhadora"){
				varMetralhadora = habilidade;
			} else if(nomeDaHabilidade=="LancaChamas"){
				varLancaChamas = habilidade;
			} else if(nomeDaHabilidade=="GasCriogenico"){
				varGasCriogenico = habilidade;
			} else if(nomeDaHabilidade=="Canhao"){
				varCanhao = habilidade;
			} else if(nomeDaHabilidade=="Aceleracao"){
				varAceleracao = habilidade;
			} else if(nomeDaHabilidade=="Planar"){
				varPlanar = habilidade;
			} else if(nomeDaHabilidade=="PropulsaoDianteira"){
				varPropulsaoDianteira = habilidade;
			} else if(nomeDaHabilidade=="PropulsaoTraseira"){
				varPropulsaoTraseira = habilidade;
			} else if(nomeDaHabilidade=="ReforcarEstrutura"){
				varReforcarEstrutura = habilidade;
			} else if(nomeDaHabilidade=="Autodestruicao"){
				varAutodestruicao = habilidade;
			} else if(nomeDaHabilidade=="Resfriamento"){
				varResfriamento = habilidade;
			} else if(nomeDaHabilidade=="CampoMagnetico"){
				varCampoMagnetico = habilidade;
			} else if(nomeDaHabilidade=="CampoProtetor"){
				varCampoProtetor = habilidade;
			} else if(nomeDaHabilidade=="ReconfigurarElemento"){
				varReconfigurarElemento = habilidade;
			} else if(nomeDaHabilidade=="SensorInfravermelho"){
				varSensorInfravermelho = habilidade;
			} else if(nomeDaHabilidade=="Analisar"){
				varAnalisar = habilidade;
			} else if(nomeDaHabilidade=="CampoDeInvisibilidade"){
				varCampoDeInvisibilidade = habilidade;
			}

			atualizarTela();

		}

		public void atualizarTela(){
			txtMammonitaPontos.setText(varMammonita + "/10");
			txtDescontoPontos.setText(varDesconto + "/10");
			txtSuperfaturarPontos.setText(varSuperfaturar + "/10");
			txtAumentarCapacidadeDeCargaPontos.setText(varAumentarCapacidadeDeCarga + "/10");
			txtUsarCarrinhoPontos.setText(varUsarCarrinho + "/10");
			txtComercioPontos.setText(varComercio + "/10");
			txtIdentificarItemPontos.setText(varIdentificarItem + "/1");

			txtAdrenalinaPuraPontos.setText(varAdrenalinaPura + "/5");
			txtMarteloDeThorPontos.setText(varMarteloDeThor + "/5");
			txtPunhoFirmePontos.setText(varPunhoFirme + "/1");
			txtAmplificarPoderPontos.setText(varAmplificarPoder + "/5");
			txtForcaViolentaPontos.setText(varForcaViolenta + "/5");
			txtResistenciaAoFogoPontos.setText(varResistenciaAoFogo + "/5");
			txtManejoPerfeitoPontos.setText(varManejoPerfeito + "/5");
			txtConsertarArmaPontos.setText(varConsertarArma + "/1");
			txtPericiaEmArmamentoPontos.setText(varPericiaEmArmamento + "/10");
			txtEncontrarMinerioPontos.setText(varEncontrarMinerio + "/1");
			txtProduzirPedraFundamentalPontos.setText(varProduzirPedraFundamental + "/5");
			txtTrabalharFerroPontos.setText(varTrabalharFerro + "/5");
			txtTrabalharAcoPontos.setText(varTrabalharAco + "/5");
			txtPericiaComOrideconPontos.setText(varPericiaComOridecon + "/5");
			txtForjarMachadoPontos.setText(varForjarMachado + "/3");
			txtForjarAdagaPontos.setText(varForjarAdaga + "/3");
			txtForjarSoqueiraPontos.setText(varForjarSoqueira + "/3");
			txtForjarMacaPontos.setText(varForjarMaca + "/3");
			txtForjarLancaPontos.setText(varForjarLanca + "/3");
			txtForjarEspadaPontos.setText(varForjarEspada + "/3");
			txtForjarEspadaDeDuasMaosPontos.setText(varForjarEspadaDeDuasMaos + "/3");

			txtImpulsoNoCarrinhoPontos.setText(varImpulsoNoCarrinho + "/1");
			txtChoqueDoCarrinhoPontos.setText(varChoqueDoCarrinho + "/10");
			txtForcaViolentissimaPontos.setText(varForcaViolentissima + "/5");
			txtGolpeEstilhacantePontos.setText(varGolpeEstilhacante + "/10");
			txtAprimorarArmamentoPontos.setText(varAprimorarArmamento + "/10");

			txtMaestriaComMachadosPontos.setText(varMaestriaComMachados + "/10");
			txtArremessoDeMachadoPontos.setText(varArremessoDeMachado + "/5");
			txtFuriaDoFuracaoPontos.setText(varFuriaDoFuracao + "/5");
			txtBrandirMachadoPontos.setText(varBrandirMachado + "/5");
			txtSabedoriaDeHefestoPontos.setText(varSabedoriaDeHefesto + "/5");
			txtArtilhariaCacadoraPontos.setText(varArtilhariaCacadora + "/5");
			txtArtilhariaArcanaPontos.setText(varArtilhariaArcana + "/5");
			txtRemoverArtilhariaPontos.setText(varRemoverArtilharia + "/1");
			txtLicencaDePilotagemPontos.setText(varLicencaDePilotagem + "/5");
			txtRepararPontos.setText(varReparar + "/5");
			txtPunhoFoguetePontos.setText(varPunhoFoguete + "/5");
			txtBateEstacaPontos.setText(varBateEstaca + "/3");
			txtMetralhadoraPontos.setText(varMetralhadora + "/3");
			txtLancaChamasPontos.setText(varLancaChamas + "/3");
			txtGasCriogenicoPontos.setText(varGasCriogenico + "/3");
			txtCanhaoPontos.setText(varCanhao + "/3");
			txtAceleracaoPontos.setText(varAceleracao + "/3");
			txtPlanarPontos.setText(varPlanar + "/1");
			txtPropulsaoDianteiraPontos.setText(varPropulsaoDianteira + "/1");
			txtPropulsaoTraseiraPontos.setText(varPropulsaoTraseira + "/1");
			txtReforcarEstruturaPontos.setText(varReforcarEstrutura + "/5");
			txtAutodestruicaoPontos.setText(varAutodestruicao + "/3");
			txtResfriamentoPontos.setText(varResfriamento + "/1");
			txtCampoMagneticoPontos.setText(varCampoMagnetico + "/3");
			txtCampoProtetorPontos.setText(varCampoProtetor + "/3");
			txtReconfigurarElementoPontos.setText(varReconfigurarElemento + "/4");
			txtSensorInfravermelhoPontos.setText(varSensorInfravermelho + "/3");
			txtAnalisarPontos.setText(varAnalisar + "/3");
			txtCampoDeInvisibilidadePontos.setText(varCampoDeInvisibilidade + "/3");

			txtClasse1.setText("Classe 1: " + primeiraClasse);
			txtClasse2.setText("Classe 2: " + segundaClasse);
			txtTransClasse.setText("Transclasse: " + transClasse + " (" + (segundaClasse + transClasse) + ")");
			txtClasse3.setText("Classe 3: " + terceiraClasse);

			tudoVisivel();
		}

		public void tudoVisivel(){
			layMammonita.setVisibility(View.VISIBLE);
			layDesconto.setVisibility(View.VISIBLE);
			laySuperfaturar.setVisibility(View.VISIBLE);
			layAumentarCapacidadeDeCarga.setVisibility(View.VISIBLE);
			layUsarCarrinho.setVisibility(View.VISIBLE);
			layComercio.setVisibility(View.VISIBLE);
			layIdentificarItem.setVisibility(View.VISIBLE);

			layAdrenalinaPura.setVisibility(View.VISIBLE);
			layMarteloDeThor.setVisibility(View.VISIBLE);
			layPunhoFirme.setVisibility(View.VISIBLE);
			layAmplificarPoder.setVisibility(View.VISIBLE);
			layForcaViolenta.setVisibility(View.VISIBLE);
			layResistenciaAoFogo.setVisibility(View.VISIBLE);
			layManejoPerfeito.setVisibility(View.VISIBLE);
			layConsertarArma.setVisibility(View.VISIBLE);
			layPericiaEmArmamento.setVisibility(View.VISIBLE);
			layEncontrarMinerio.setVisibility(View.VISIBLE);
			layProduzirPedraFundamental.setVisibility(View.VISIBLE);
			layTrabalharFerro.setVisibility(View.VISIBLE);
			layTrabalharAco.setVisibility(View.VISIBLE);
			layPericiaComOridecon.setVisibility(View.VISIBLE);
			layForjarMachado.setVisibility(View.VISIBLE);
			layForjarAdaga.setVisibility(View.VISIBLE);
			layForjarSoqueira.setVisibility(View.VISIBLE);
			layForjarMaca.setVisibility(View.VISIBLE);
			layForjarLanca.setVisibility(View.VISIBLE);
			layForjarEspada.setVisibility(View.VISIBLE);
			layForjarEspadaDeDuasMaos.setVisibility(View.VISIBLE);

			layImpulsoNoCarrinho.setVisibility(View.VISIBLE);
			layChoqueDoCarrinho.setVisibility(View.VISIBLE);
			layForcaViolentissima.setVisibility(View.VISIBLE);
			layGolpeEstilhacante.setVisibility(View.VISIBLE);
			layAprimorarArmamento.setVisibility(View.VISIBLE);

			layMaestriaComMachados.setVisibility(View.VISIBLE);
			layArremessoDeMachado.setVisibility(View.VISIBLE);
			layFuriaDoFuracao.setVisibility(View.VISIBLE);
			layBrandirMachado.setVisibility(View.VISIBLE);
			laySabedoriaDeHefesto.setVisibility(View.VISIBLE);
			layArtilhariaCacadora.setVisibility(View.VISIBLE);
			layArtilhariaArcana.setVisibility(View.VISIBLE);
			layRemoverArtilharia.setVisibility(View.VISIBLE);
			layLicencaDePilotagem.setVisibility(View.VISIBLE);
			layReparar.setVisibility(View.VISIBLE);
			layPunhoFoguete.setVisibility(View.VISIBLE);
			layBateEstaca.setVisibility(View.VISIBLE);
			layMetralhadora.setVisibility(View.VISIBLE);
			layLancaChamas.setVisibility(View.VISIBLE);
			layGasCriogenico.setVisibility(View.VISIBLE);
			layCanhao.setVisibility(View.VISIBLE);
			layAceleracao.setVisibility(View.VISIBLE);
			layPlanar.setVisibility(View.VISIBLE);
			layPropulsaoDianteira.setVisibility(View.VISIBLE);
			layPropulsaoTraseira.setVisibility(View.VISIBLE);
			layReforcarEstrutura.setVisibility(View.VISIBLE);
			layAutodestruicao.setVisibility(View.VISIBLE);
			layResfriamento.setVisibility(View.VISIBLE);
			layCampoMagnetico.setVisibility(View.VISIBLE);
			layCampoProtetor.setVisibility(View.VISIBLE);
			layReconfigurarElemento.setVisibility(View.VISIBLE);
			laySensorInfravermelho.setVisibility(View.VISIBLE);
			layAnalisar.setVisibility(View.VISIBLE);
			layCampoDeInvisibilidade.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM mecanico WHERE _id = ?", new String[]{String.valueOf(id)});

			if(cs.moveToFirst()){
			primeiraClasse = cs.getInt(2);
			segundaClasse = cs.getInt(3);
			transClasse = cs.getInt(4);
			terceiraClasse = cs.getInt(5);

			varMammonita = cs.getInt(6);
			varDesconto = cs.getInt(7);
			varSuperfaturar = cs.getInt(8);
			varAumentarCapacidadeDeCarga = cs.getInt(9);
			varUsarCarrinho = cs.getInt(10);
			varComercio = cs.getInt(11);
			varIdentificarItem = cs.getInt(12);

			varAdrenalinaPura = cs.getInt(13);
			varMarteloDeThor = cs.getInt(14);
			varPunhoFirme = cs.getInt(15);
			varAmplificarPoder = cs.getInt(16);
			varForcaViolenta = cs.getInt(17);
			varResistenciaAoFogo = cs.getInt(18);
			varManejoPerfeito = cs.getInt(19);
			varConsertarArma = cs.getInt(20);
			varPericiaEmArmamento = cs.getInt(21);
			varEncontrarMinerio = cs.getInt(22);
			varProduzirPedraFundamental = cs.getInt(23);
			varTrabalharFerro = cs.getInt(24);
			varTrabalharAco = cs.getInt(25);
			varPericiaComOridecon = cs.getInt(26);
			varForjarMachado = cs.getInt(27);
			varForjarAdaga = cs.getInt(28);
			varForjarSoqueira = cs.getInt(29);
			varForjarMaca = cs.getInt(30);
			varForjarLanca = cs.getInt(31);
			varForjarEspada = cs.getInt(32);
			varForjarEspadaDeDuasMaos = cs.getInt(33);

			varImpulsoNoCarrinho = cs.getInt(34);
			varChoqueDoCarrinho = cs.getInt(35);
			varForcaViolentissima = cs.getInt(36);
			varGolpeEstilhacante = cs.getInt(37);
			varAprimorarArmamento = cs.getInt(38);

			varMaestriaComMachados = cs.getInt(39);
			varArremessoDeMachado = cs.getInt(40);
			varFuriaDoFuracao = cs.getInt(41);
			varBrandirMachado = cs.getInt(42);
			varSabedoriaDeHefesto = cs.getInt(43);
			varArtilhariaCacadora = cs.getInt(44);
			varArtilhariaArcana = cs.getInt(45);
			varRemoverArtilharia = cs.getInt(46);
			varLicencaDePilotagem = cs.getInt(47);
			varReparar = cs.getInt(48);
			varPunhoFoguete = cs.getInt(49);
			varBateEstaca = cs.getInt(50);
			varMetralhadora = cs.getInt(51);
			varLancaChamas = cs.getInt(52);
			varGasCriogenico = cs.getInt(53);
			varCanhao = cs.getInt(54);
			varAceleracao = cs.getInt(55);
			varPlanar = cs.getInt(56);
			varPropulsaoDianteira = cs.getInt(57);
			varPropulsaoTraseira = cs.getInt(58);
			varReforcarEstrutura = cs.getInt(59);
			varAutodestruicao = cs.getInt(60);
			varResfriamento = cs.getInt(61);
			varCampoMagnetico = cs.getInt(62);
			varCampoProtetor = cs.getInt(63);
			varReconfigurarElemento = cs.getInt(64);
			varSensorInfravermelho = cs.getInt(65);
			varAnalisar = cs.getInt(66);
			varCampoDeInvisibilidade = cs.getInt(67);

			skillPrimeira = cs.getInt(68);
			skillSegunda = cs.getInt(69);
			skillTrans = cs.getInt(70);
			skillTerceira = cs.getInt(71);
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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS mecanico (");
					sqlClasse.append("_id INTEGER PRIMARY KEY, ");
					sqlClasse.append("nome VARCHAR(30), ");
					sqlClasse.append("primeira_classe INT(2), ");
					sqlClasse.append("segunda_classe INT(2), ");
					sqlClasse.append("trans_classe INT(2), ");
					sqlClasse.append("terceira_classe INT(2), ");
					sqlClasse.append("skill_mammonita INT(2), ");
					sqlClasse.append("skill_desconto INT(2), ");
					sqlClasse.append("skill_superfaturar INT(2), ");
					sqlClasse.append("skill_aumentarcapacidadedecarga INT(2), ");
					sqlClasse.append("skill_usarcarrinho INT(2), ");
					sqlClasse.append("skill_comercio INT(2), ");
					sqlClasse.append("skill_identificaritem INT(2), ");
					sqlClasse.append("skill_adrenalinapura INT(2), ");
					sqlClasse.append("skill_martelodethor INT(2), ");
					sqlClasse.append("skill_punhofirme INT(2), ");
					sqlClasse.append("skill_amplificarpoder INT(2), ");
					sqlClasse.append("skill_forcaviolenta INT(2), ");
					sqlClasse.append("skill_resistenciaaofogo INT(2), ");
					sqlClasse.append("skill_manejoperfeito INT(2), ");
					sqlClasse.append("skill_consertararma INT(2), ");
					sqlClasse.append("skill_periciaemarmamento INT(2), ");
					sqlClasse.append("skill_encontrarminerio INT(2), ");
					sqlClasse.append("skill_produzirpedrafundamental INT(2), ");
					sqlClasse.append("skill_trabalharferro INT(2), ");
					sqlClasse.append("skill_trabalharaco INT(2), ");
					sqlClasse.append("skill_periciacomoridecon INT(2), ");
					sqlClasse.append("skill_forjarmachado INT(2), ");
					sqlClasse.append("skill_forjaradaga INT(2), ");
					sqlClasse.append("skill_forjarsoqueira INT(2), ");
					sqlClasse.append("skill_forjarmaca INT(2), ");
					sqlClasse.append("skill_forjarlanca INT(2), ");
					sqlClasse.append("skill_forjarespada INT(2), ");
					sqlClasse.append("skill_forjarespadadeduasmaos INT(2), ");
					sqlClasse.append("skill_impulsonocarrinho INT(2), ");
					sqlClasse.append("skill_choquedocarrinho INT(2), ");
					sqlClasse.append("skill_forcaviolentissima INT(2), ");
					sqlClasse.append("skill_golpeestilhacante INT(2), ");
					sqlClasse.append("skill_aprimorararmamento INT(2), ");
					sqlClasse.append("skill_maestriacommachados INT(2), ");
					sqlClasse.append("skill_arremessodemachado INT(2), ");
					sqlClasse.append("skill_furiadofuracao INT(2), ");
					sqlClasse.append("skill_brandirmachado INT(2), ");
					sqlClasse.append("skill_sabedoriadehefesto INT(2), ");
					sqlClasse.append("skill_artilhariacacadora INT(2), ");
					sqlClasse.append("skill_artilhariaarcana INT(2), ");
					sqlClasse.append("skill_removerartilharia INT(2), ");
					sqlClasse.append("skill_licencadepilotagem INT(2), ");
					sqlClasse.append("skill_reparar INT(2), ");
					sqlClasse.append("skill_punhofoguete INT(2), ");
					sqlClasse.append("skill_bateestaca INT(2), ");
					sqlClasse.append("skill_metralhadora INT(2), ");
					sqlClasse.append("skill_lancachamas INT(2), ");
					sqlClasse.append("skill_gascriogenico INT(2), ");
					sqlClasse.append("skill_canhao INT(2), ");
					sqlClasse.append("skill_aceleracao INT(2), ");
					sqlClasse.append("skill_planar INT(2), ");
					sqlClasse.append("skill_propulsaodianteira INT(2), ");
					sqlClasse.append("skill_propulsaotraseira INT(2), ");
					sqlClasse.append("skill_reforcarestrutura INT(2), ");
					sqlClasse.append("skill_autodestruicao INT(2), ");
					sqlClasse.append("skill_resfriamento INT(2), ");
					sqlClasse.append("skill_campomagnetico INT(2), ");
					sqlClasse.append("skill_campoprotetor INT(2), ");
					sqlClasse.append("skill_reconfigurarelemento INT(2), ");
					sqlClasse.append("skill_sensorinfravermelho INT(2), ");
					sqlClasse.append("skill_analisar INT(2), ");
					sqlClasse.append("skill_campodeinvisibilidade INT(2), ");
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
					ins.put("skill_mammonita", varMammonita);
					ins.put("skill_desconto", varDesconto);
					ins.put("skill_superfaturar", varSuperfaturar);
					ins.put("skill_aumentarcapacidadedecarga", varAumentarCapacidadeDeCarga);
					ins.put("skill_usarcarrinho", varUsarCarrinho);
					ins.put("skill_comercio", varComercio);
					ins.put("skill_identificaritem", varIdentificarItem);
					ins.put("skill_adrenalinapura", varAdrenalinaPura);
					ins.put("skill_martelodethor", varMarteloDeThor);
					ins.put("skill_punhofirme", varPunhoFirme);
					ins.put("skill_amplificarpoder", varAmplificarPoder);
					ins.put("skill_forcaviolenta", varForcaViolenta);
					ins.put("skill_resistenciaaofogo", varResistenciaAoFogo);
					ins.put("skill_manejoperfeito", varManejoPerfeito);
					ins.put("skill_consertararma", varConsertarArma);
					ins.put("skill_periciaemarmamento", varPericiaEmArmamento);
					ins.put("skill_encontrarminerio", varEncontrarMinerio);
					ins.put("skill_produzirpedrafundamental", varProduzirPedraFundamental);
					ins.put("skill_trabalharferro", varTrabalharFerro);
					ins.put("skill_trabalharaco", varTrabalharAco);
					ins.put("skill_periciacomoridecon", varPericiaComOridecon);
					ins.put("skill_forjarmachado", varForjarMachado);
					ins.put("skill_forjaradaga", varForjarAdaga);
					ins.put("skill_forjarsoqueira", varForjarSoqueira);
					ins.put("skill_forjarmaca", varForjarMaca);
					ins.put("skill_forjarlanca", varForjarLanca);
					ins.put("skill_forjarespada", varForjarEspada);
					ins.put("skill_forjarespadadeduasmaos", varForjarEspadaDeDuasMaos);
					ins.put("skill_impulsonocarrinho", varImpulsoNoCarrinho);
					ins.put("skill_choquedocarrinho", varChoqueDoCarrinho);
					ins.put("skill_forcaviolentissima", varForcaViolentissima);
					ins.put("skill_golpeestilhacante", varGolpeEstilhacante);
					ins.put("skill_aprimorararmamento", varAprimorarArmamento);
					ins.put("skill_maestriacommachados", varMaestriaComMachados);
					ins.put("skill_arremessodemachado", varArremessoDeMachado);
					ins.put("skill_furiadofuracao", varFuriaDoFuracao);
					ins.put("skill_brandirmachado", varBrandirMachado);
					ins.put("skill_sabedoriadehefesto", varSabedoriaDeHefesto);
					ins.put("skill_artilhariacacadora", varArtilhariaCacadora);
					ins.put("skill_artilhariaarcana", varArtilhariaArcana);
					ins.put("skill_removerartilharia", varRemoverArtilharia);
					ins.put("skill_licencadepilotagem", varLicencaDePilotagem);
					ins.put("skill_reparar", varReparar);
					ins.put("skill_punhofoguete", varPunhoFoguete);
					ins.put("skill_bateestaca", varBateEstaca);
					ins.put("skill_metralhadora", varMetralhadora);
					ins.put("skill_lancachamas", varLancaChamas);
					ins.put("skill_gascriogenico", varGasCriogenico);
					ins.put("skill_canhao", varCanhao);
					ins.put("skill_aceleracao", varAceleracao);
					ins.put("skill_planar", varPlanar);
					ins.put("skill_propulsaodianteira", varPropulsaoDianteira);
					ins.put("skill_propulsaotraseira", varPropulsaoTraseira);
					ins.put("skill_reforcarestrutura", varReforcarEstrutura);
					ins.put("skill_autodestruicao", varAutodestruicao);
					ins.put("skill_resfriamento", varResfriamento);
					ins.put("skill_campomagnetico", varCampoMagnetico);
					ins.put("skill_campoprotetor", varCampoProtetor);
					ins.put("skill_reconfigurarelemento", varReconfigurarElemento);
					ins.put("skill_sensorinfravermelho", varSensorInfravermelho);
					ins.put("skill_analisar", varAnalisar);
					ins.put("skill_campodeinvisibilidade", varCampoDeInvisibilidade);
					ins.put("skill_primeira", skillPrimeira);
					ins.put("skill_segunda", skillSegunda);
					ins.put("skill_trans", skillTrans);
					ins.put("skill_terceira", skillTerceira);
					if(!novo){
						try {
							db.update("mecanico", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("mecanico", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from mecanico", null);
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
						ins2.put("classe", "mecanico");
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