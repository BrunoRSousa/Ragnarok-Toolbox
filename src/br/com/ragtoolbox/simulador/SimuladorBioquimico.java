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

public class SimuladorBioquimico extends Activity {

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
		btPericiaComMachadoEEspadaInterrogacao,
		btPesquisaDePocoesInterrogacao,
		btPrepararPocaoInterrogacao,
		btFogoGregoInterrogacao,
		btTerrorAcidoInterrogacao,
		btArremessarPocaoInterrogacao,
		btCriarMonstroPlantaInterrogacao,
		btCriarEsferaMarinhaInterrogacao,
		btRevestirArmaInterrogacao,
		btRevestirEscudoInterrogacao,
		btRevestirArmaduraInterrogacao,
		btRevestirCapaceteInterrogacao,
		btBioeticaInterrogacao,
		btCriarHomunculusInterrogacao,
		btRessuscitarHomunculusInterrogacao,
		btVaporizarInterrogacao,
		btCriacaoEspiritualdePocoesIInterrogacao,
		btCriacaoEspiritualdePocoesIIInterrogacao,
		btCriacaoEspiritualdePocoesIIIInterrogacao,
		btArremessarPocaoDaFuriaSelvagemInterrogacao,
		btCultivarPlantaInterrogacao,
		btBombaAcidaInterrogacao,
		btProtecaoQuimicaTotalInterrogacao,
		btArremessarPocaoCompactaInterrogacao,
		btFarmacologiaAvancadaInterrogacao,
		btCulinariaAvancadaInterrogacao,
		btCriarBombaOrganicaInterrogacao,
		btReacaoAlquimicaInterrogacao,
		btArremessarItemInterrogacao,
		btPericiaEmEsgrimaInterrogacao,
		btAprimorarCarrinhoInterrogacao,
		btPropulsaoDoCarrinhoInterrogacao,
		btCanhaoDeProtonsInterrogacao,
		btTornadoDeCarrinhoInterrogacao,
		btArmadilhaDeEspinhosInterrogacao,
		btMuralhaDeEspinhosInterrogacao,
		btPlantaInfernalInterrogacao,
		btPlantaSanguessugaInterrogacao,
		btEsporoExplosivoInterrogacao,
		btGritoDaMandragoraInterrogacao,
		btErvaDaninhaInterrogacao,
		btBombaNapalmInterrogacao,
		btCatalisadorAlquimicoInterrogacao;

		//Botões de diminuir habilidades
		Button btMammonitaDiminuir,
		btDescontoDiminuir,
		btSuperfaturarDiminuir,
		btAumentarCapacidadeDeCargaDiminuir,
		btUsarCarrinhoDiminuir,
		btComercioDiminuir,
		btIdentificarItemDiminuir,
		btPericiaComMachadoEEspadaDiminuir,
		btPesquisaDePocoesDiminuir,
		btPrepararPocaoDiminuir,
		btFogoGregoDiminuir,
		btTerrorAcidoDiminuir,
		btArremessarPocaoDiminuir,
		btCriarMonstroPlantaDiminuir,
		btCriarEsferaMarinhaDiminuir,
		btRevestirArmaDiminuir,
		btRevestirEscudoDiminuir,
		btRevestirArmaduraDiminuir,
		btRevestirCapaceteDiminuir,
		btCriarHomunculusDiminuir,
		btRessuscitarHomunculusDiminuir,
		btVaporizarDiminuir,
		btCultivarPlantaDiminuir,
		btBombaAcidaDiminuir,
		btProtecaoQuimicaTotalDiminuir,
		btArremessarPocaoCompactaDiminuir,
		btFarmacologiaAvancadaDiminuir,
		btCulinariaAvancadaDiminuir,
		btCriarBombaOrganicaDiminuir,
		btReacaoAlquimicaDiminuir,
		btArremessarItemDiminuir,
		btPericiaEmEsgrimaDiminuir,
		btAprimorarCarrinhoDiminuir,
		btPropulsaoDoCarrinhoDiminuir,
		btCanhaoDeProtonsDiminuir,
		btTornadoDeCarrinhoDiminuir,
		btArmadilhaDeEspinhosDiminuir,
		btMuralhaDeEspinhosDiminuir,
		btPlantaInfernalDiminuir,
		btPlantaSanguessugaDiminuir,
		btEsporoExplosivoDiminuir,
		btGritoDaMandragoraDiminuir,
		btErvaDaninhaDiminuir,
		btBombaNapalmDiminuir,
		btCatalisadorAlquimicoDiminuir;

		//Botões de aumentar habilidades
		Button btMammonitaAumentar,
		btDescontoAumentar,
		btSuperfaturarAumentar,
		btAumentarCapacidadeDeCargaAumentar,
		btUsarCarrinhoAumentar,
		btComercioAumentar,
		btIdentificarItemAumentar,
		btPericiaComMachadoEEspadaAumentar,
		btPesquisaDePocoesAumentar,
		btPrepararPocaoAumentar,
		btFogoGregoAumentar,
		btTerrorAcidoAumentar,
		btArremessarPocaoAumentar,
		btCriarMonstroPlantaAumentar,
		btCriarEsferaMarinhaAumentar,
		btRevestirArmaAumentar,
		btRevestirEscudoAumentar,
		btRevestirArmaduraAumentar,
		btRevestirCapaceteAumentar,
		btCriarHomunculusAumentar,
		btRessuscitarHomunculusAumentar,
		btVaporizarAumentar,
		btCultivarPlantaAumentar,
		btBombaAcidaAumentar,
		btProtecaoQuimicaTotalAumentar,
		btArremessarPocaoCompactaAumentar,
		btFarmacologiaAvancadaAumentar,
		btCulinariaAvancadaAumentar,
		btCriarBombaOrganicaAumentar,
		btReacaoAlquimicaAumentar,
		btArremessarItemAumentar,
		btPericiaEmEsgrimaAumentar,
		btAprimorarCarrinhoAumentar,
		btPropulsaoDoCarrinhoAumentar,
		btCanhaoDeProtonsAumentar,
		btTornadoDeCarrinhoAumentar,
		btArmadilhaDeEspinhosAumentar,
		btMuralhaDeEspinhosAumentar,
		btPlantaInfernalAumentar,
		btPlantaSanguessugaAumentar,
		btEsporoExplosivoAumentar,
		btGritoDaMandragoraAumentar,
		btErvaDaninhaAumentar,
		btBombaNapalmAumentar,
		btCatalisadorAlquimicoAumentar;

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
		txtPericiaComMachadoEEspadaPontos,
		txtPesquisaDePocoesPontos,
		txtPrepararPocaoPontos,
		txtFogoGregoPontos,
		txtTerrorAcidoPontos,
		txtArremessarPocaoPontos,
		txtCriarMonstroPlantaPontos,
		txtCriarEsferaMarinhaPontos,
		txtRevestirArmaPontos,
		txtRevestirEscudoPontos,
		txtRevestirArmaduraPontos,
		txtRevestirCapacetePontos,
		txtCriarHomunculusPontos,
		txtRessuscitarHomunculusPontos,
		txtVaporizarPontos,
		txtCultivarPlantaPontos,
		txtBombaAcidaPontos,
		txtProtecaoQuimicaTotalPontos,
		txtArremessarPocaoCompactaPontos,
		txtFarmacologiaAvancadaPontos,
		txtCulinariaAvancadaPontos,
		txtCriarBombaOrganicaPontos,
		txtReacaoAlquimicaPontos,
		txtArremessarItemPontos,
		txtPericiaEmEsgrimaPontos,
		txtAprimorarCarrinhoPontos,
		txtPropulsaoDoCarrinhoPontos,
		txtCanhaoDeProtonsPontos,
		txtTornadoDeCarrinhoPontos,
		txtArmadilhaDeEspinhosPontos,
		txtMuralhaDeEspinhosPontos,
		txtPlantaInfernalPontos,
		txtPlantaSanguessugaPontos,
		txtEsporoExplosivoPontos,
		txtGritoDaMandragoraPontos,
		txtErvaDaninhaPontos,
		txtBombaNapalmPontos,
		txtCatalisadorAlquimicoPontos;

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
		layPericiaComMachadoEEspada,
		layPesquisaDePocoes,
		layPrepararPocao,
		layFogoGrego,
		layTerrorAcido,
		layArremessarPocao,
		layCriarMonstroPlanta,
		layCriarEsferaMarinha,
		layRevestirArma,
		layRevestirEscudo,
		layRevestirArmadura,
		layRevestirCapacete,
		layCriarHomunculus,
		layRessuscitarHomunculus,
		layVaporizar,
		layCultivarPlanta,
		layBombaAcida,
		layProtecaoQuimicaTotal,
		layArremessarPocaoCompacta,
		layFarmacologiaAvancada,
		layCulinariaAvancada,
		layCriarBombaOrganica,
		layReacaoAlquimica,
		layArremessarItem,
		layPericiaEmEsgrima,
		layAprimorarCarrinho,
		layPropulsaoDoCarrinho,
		layCanhaoDeProtons,
		layTornadoDeCarrinho,
		layArmadilhaDeEspinhos,
		layMuralhaDeEspinhos,
		layPlantaInfernal,
		layPlantaSanguessuga,
		layEsporoExplosivo,
		layGritoDaMandragora,
		layErvaDaninha,
		layBombaNapalm,
		layCatalisadorAlquimico;

		//Variaveis de Skill
		int varMammonita,
		varDesconto,
		varSuperfaturar,
		varAumentarCapacidadeDeCarga,
		varUsarCarrinho,
		varComercio,
		varIdentificarItem,
		varPericiaComMachadoEEspada,
		varPesquisaDePocoes,
		varPrepararPocao,
		varFogoGrego,
		varTerrorAcido,
		varArremessarPocao,
		varCriarMonstroPlanta,
		varCriarEsferaMarinha,
		varRevestirArma,
		varRevestirEscudo,
		varRevestirArmadura,
		varRevestirCapacete,
		varCriarHomunculus,
		varRessuscitarHomunculus,
		varVaporizar,
		varCultivarPlanta,
		varBombaAcida,
		varProtecaoQuimicaTotal,
		varArremessarPocaoCompacta,
		varFarmacologiaAvancada,
		varCulinariaAvancada,
		varCriarBombaOrganica,
		varReacaoAlquimica,
		varArremessarItem,
		varPericiaEmEsgrima,
		varAprimorarCarrinho,
		varPropulsaoDoCarrinho,
		varCanhaoDeProtons,
		varTornadoDeCarrinho,
		varArmadilhaDeEspinhos,
		varMuralhaDeEspinhos,
		varPlantaInfernal,
		varPlantaSanguessuga,
		varEsporoExplosivo,
		varGritoDaMandragora,
		varErvaDaninha,
		varBombaNapalm,
		varCatalisadorAlquimico;

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
			setContentView(R.layout.activity_simulador_bioquimico);

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
			varPericiaComMachadoEEspada = 0;
			varPesquisaDePocoes = 0;
			varPrepararPocao = 0;
			varFogoGrego = 0;
			varTerrorAcido = 0;
			varArremessarPocao = 0;
			varCriarMonstroPlanta = 0;
			varCriarEsferaMarinha = 0;
			varRevestirArma = 0;
			varRevestirEscudo = 0;
			varRevestirArmadura = 0;
			varRevestirCapacete = 0;
			varCriarHomunculus = 0;
			varRessuscitarHomunculus = 0;
			varVaporizar = 0;
			varCultivarPlanta = 0;
			varBombaAcida = 0;
			varProtecaoQuimicaTotal = 0;
			varArremessarPocaoCompacta = 0;
			varFarmacologiaAvancada = 0;
			varCulinariaAvancada = 0;
			varCriarBombaOrganica = 0;
			varReacaoAlquimica = 0;
			varArremessarItem = 0;
			varPericiaEmEsgrima = 0;
			varAprimorarCarrinho = 0;
			varPropulsaoDoCarrinho = 0;
			varCanhaoDeProtons = 0;
			varTornadoDeCarrinho = 0;
			varArmadilhaDeEspinhos = 0;
			varMuralhaDeEspinhos = 0;
			varPlantaInfernal = 0;
			varPlantaSanguessuga = 0;
			varEsporoExplosivo = 0;
			varGritoDaMandragora = 0;
			varErvaDaninha = 0;
			varBombaNapalm = 0;
			varCatalisadorAlquimico = 0;



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
			btPericiaComMachadoEEspadaInterrogacao = (Button) findViewById(R.id.btPericiaComMachadoEEspadaInterrogacao);
			btPesquisaDePocoesInterrogacao = (Button) findViewById(R.id.btPesquisaDePocoesInterrogacao);
			btPrepararPocaoInterrogacao = (Button) findViewById(R.id.btPrepararPocaoInterrogacao);
			btFogoGregoInterrogacao = (Button) findViewById(R.id.btFogoGregoInterrogacao);
			btTerrorAcidoInterrogacao = (Button) findViewById(R.id.btTerrorAcidoInterrogacao);
			btArremessarPocaoInterrogacao = (Button) findViewById(R.id.btArremessarPocaoInterrogacao);
			btCriarMonstroPlantaInterrogacao = (Button) findViewById(R.id.btCriarMonstroPlantaInterrogacao);
			btCriarEsferaMarinhaInterrogacao = (Button) findViewById(R.id.btCriarEsferaMarinhaInterrogacao);
			btRevestirArmaInterrogacao = (Button) findViewById(R.id.btRevestirArmaInterrogacao);
			btRevestirEscudoInterrogacao = (Button) findViewById(R.id.btRevestirEscudoInterrogacao);
			btRevestirArmaduraInterrogacao = (Button) findViewById(R.id.btRevestirArmaduraInterrogacao);
			btRevestirCapaceteInterrogacao = (Button) findViewById(R.id.btRevestirCapaceteInterrogacao);
			btBioeticaInterrogacao = (Button) findViewById(R.id.btBioeticaInterrogacao);
			btCriarHomunculusInterrogacao = (Button) findViewById(R.id.btCriarHomunculusInterrogacao);
			btRessuscitarHomunculusInterrogacao = (Button) findViewById(R.id.btRessuscitarHomunculusInterrogacao);
			btVaporizarInterrogacao = (Button) findViewById(R.id.btVaporizarInterrogacao);
			btCriacaoEspiritualdePocoesIInterrogacao = (Button) findViewById(R.id.btCriacaoEspiritualdePocoesIInterrogacao);
			btCriacaoEspiritualdePocoesIIInterrogacao = (Button) findViewById(R.id.btCriacaoEspiritualdePocoesIIInterrogacao);
			btCriacaoEspiritualdePocoesIIIInterrogacao = (Button) findViewById(R.id.btCriacaoEspiritualdePocoesIIIInterrogacao);
			btArremessarPocaoDaFuriaSelvagemInterrogacao = (Button) findViewById(R.id.btArremessarPocaoDaFuriaSelvagemInterrogacao);
			btCultivarPlantaInterrogacao = (Button) findViewById(R.id.btCultivarPlantaInterrogacao);
			btBombaAcidaInterrogacao = (Button) findViewById(R.id.btBombaAcidaInterrogacao);
			btProtecaoQuimicaTotalInterrogacao = (Button) findViewById(R.id.btProtecaoQuimicaTotalInterrogacao);
			btArremessarPocaoCompactaInterrogacao = (Button) findViewById(R.id.btArremessarPocaoCompactaInterrogacao);
			btFarmacologiaAvancadaInterrogacao = (Button) findViewById(R.id.btFarmacologiaAvancadaInterrogacao);
			btCulinariaAvancadaInterrogacao = (Button) findViewById(R.id.btCulinariaAvancadaInterrogacao);
			btCriarBombaOrganicaInterrogacao = (Button) findViewById(R.id.btCriarBombaOrganicaInterrogacao);
			btReacaoAlquimicaInterrogacao = (Button) findViewById(R.id.btReacaoAlquimicaInterrogacao);
			btArremessarItemInterrogacao = (Button) findViewById(R.id.btArremessarItemInterrogacao);
			btPericiaEmEsgrimaInterrogacao = (Button) findViewById(R.id.btPericiaEmEsgrimaInterrogacao);
			btAprimorarCarrinhoInterrogacao = (Button) findViewById(R.id.btAprimorarCarrinhoInterrogacao);
			btPropulsaoDoCarrinhoInterrogacao = (Button) findViewById(R.id.btPropulsaoDoCarrinhoInterrogacao);
			btCanhaoDeProtonsInterrogacao = (Button) findViewById(R.id.btCanhaoDeProtonsInterrogacao);
			btTornadoDeCarrinhoInterrogacao = (Button) findViewById(R.id.btTornadoDeCarrinhoInterrogacao);
			btArmadilhaDeEspinhosInterrogacao = (Button) findViewById(R.id.btArmadilhaDeEspinhosInterrogacao);
			btMuralhaDeEspinhosInterrogacao = (Button) findViewById(R.id.btMuralhaDeEspinhosInterrogacao);
			btPlantaInfernalInterrogacao = (Button) findViewById(R.id.btPlantaInfernalInterrogacao);
			btPlantaSanguessugaInterrogacao = (Button) findViewById(R.id.btPlantaSanguessugaInterrogacao);
			btEsporoExplosivoInterrogacao = (Button) findViewById(R.id.btEsporoExplosivoInterrogacao);
			btGritoDaMandragoraInterrogacao = (Button) findViewById(R.id.btGritoDaMandragoraInterrogacao);
			btErvaDaninhaInterrogacao = (Button) findViewById(R.id.btErvaDaninhaInterrogacao);
			btBombaNapalmInterrogacao = (Button) findViewById(R.id.btBombaNapalmInterrogacao);
			btCatalisadorAlquimicoInterrogacao = (Button) findViewById(R.id.btCatalisadorAlquimicoInterrogacao);

			//Botões de diminuir habilidades
			btMammonitaDiminuir = (Button) findViewById(R.id.btMammonitaDiminuir);
			btDescontoDiminuir = (Button) findViewById(R.id.btDescontoDiminuir);
			btSuperfaturarDiminuir = (Button) findViewById(R.id.btSuperfaturarDiminuir);
			btAumentarCapacidadeDeCargaDiminuir = (Button) findViewById(R.id.btAumentarCapacidadeDeCargaDiminuir);
			btUsarCarrinhoDiminuir = (Button) findViewById(R.id.btUsarCarrinhoDiminuir);
			btComercioDiminuir = (Button) findViewById(R.id.btComercioDiminuir);
			btIdentificarItemDiminuir = (Button) findViewById(R.id.btIdentificarItemDiminuir);
			btPericiaComMachadoEEspadaDiminuir = (Button) findViewById(R.id.btPericiaComMachadoEEspadaDiminuir);
			btPesquisaDePocoesDiminuir = (Button) findViewById(R.id.btPesquisaDePocoesDiminuir);
			btPrepararPocaoDiminuir = (Button) findViewById(R.id.btPrepararPocaoDiminuir);
			btFogoGregoDiminuir = (Button) findViewById(R.id.btFogoGregoDiminuir);
			btTerrorAcidoDiminuir = (Button) findViewById(R.id.btTerrorAcidoDiminuir);
			btArremessarPocaoDiminuir = (Button) findViewById(R.id.btArremessarPocaoDiminuir);
			btCriarMonstroPlantaDiminuir = (Button) findViewById(R.id.btCriarMonstroPlantaDiminuir);
			btCriarEsferaMarinhaDiminuir = (Button) findViewById(R.id.btCriarEsferaMarinhaDiminuir);
			btRevestirArmaDiminuir = (Button) findViewById(R.id.btRevestirArmaDiminuir);
			btRevestirEscudoDiminuir = (Button) findViewById(R.id.btRevestirEscudoDiminuir);
			btRevestirArmaduraDiminuir = (Button) findViewById(R.id.btRevestirArmaduraDiminuir);
			btRevestirCapaceteDiminuir = (Button) findViewById(R.id.btRevestirCapaceteDiminuir);
			btCriarHomunculusDiminuir = (Button) findViewById(R.id.btCriarHomunculusDiminuir);
			btRessuscitarHomunculusDiminuir = (Button) findViewById(R.id.btRessuscitarHomunculusDiminuir);
			btVaporizarDiminuir = (Button) findViewById(R.id.btVaporizarDiminuir);
			btCultivarPlantaDiminuir = (Button) findViewById(R.id.btCultivarPlantaDiminuir);
			btBombaAcidaDiminuir = (Button) findViewById(R.id.btBombaAcidaDiminuir);
			btProtecaoQuimicaTotalDiminuir = (Button) findViewById(R.id.btProtecaoQuimicaTotalDiminuir);
			btArremessarPocaoCompactaDiminuir = (Button) findViewById(R.id.btArremessarPocaoCompactaDiminuir);
			btFarmacologiaAvancadaDiminuir = (Button) findViewById(R.id.btFarmacologiaAvancadaDiminuir);
			btCulinariaAvancadaDiminuir = (Button) findViewById(R.id.btCulinariaAvancadaDiminuir);
			btCriarBombaOrganicaDiminuir = (Button) findViewById(R.id.btCriarBombaOrganicaDiminuir);
			btReacaoAlquimicaDiminuir = (Button) findViewById(R.id.btReacaoAlquimicaDiminuir);
			btArremessarItemDiminuir = (Button) findViewById(R.id.btArremessarItemDiminuir);
			btPericiaEmEsgrimaDiminuir = (Button) findViewById(R.id.btPericiaEmEsgrimaDiminuir);
			btAprimorarCarrinhoDiminuir = (Button) findViewById(R.id.btAprimorarCarrinhoDiminuir);
			btPropulsaoDoCarrinhoDiminuir = (Button) findViewById(R.id.btPropulsaoDoCarrinhoDiminuir);
			btCanhaoDeProtonsDiminuir = (Button) findViewById(R.id.btCanhaoDeProtonsDiminuir);
			btTornadoDeCarrinhoDiminuir = (Button) findViewById(R.id.btTornadoDeCarrinhoDiminuir);
			btArmadilhaDeEspinhosDiminuir = (Button) findViewById(R.id.btArmadilhaDeEspinhosDiminuir);
			btMuralhaDeEspinhosDiminuir = (Button) findViewById(R.id.btMuralhaDeEspinhosDiminuir);
			btPlantaInfernalDiminuir = (Button) findViewById(R.id.btPlantaInfernalDiminuir);
			btPlantaSanguessugaDiminuir = (Button) findViewById(R.id.btPlantaSanguessugaDiminuir);
			btEsporoExplosivoDiminuir = (Button) findViewById(R.id.btEsporoExplosivoDiminuir);
			btGritoDaMandragoraDiminuir = (Button) findViewById(R.id.btGritoDaMandragoraDiminuir);
			btErvaDaninhaDiminuir = (Button) findViewById(R.id.btErvaDaninhaDiminuir);
			btBombaNapalmDiminuir = (Button) findViewById(R.id.btBombaNapalmDiminuir);
			btCatalisadorAlquimicoDiminuir = (Button) findViewById(R.id.btCatalisadorAlquimicoDiminuir);

			//Botões de aumentar habilidades
			btMammonitaAumentar = (Button) findViewById(R.id.btMammonitaAumentar);
			btDescontoAumentar = (Button) findViewById(R.id.btDescontoAumentar);
			btSuperfaturarAumentar = (Button) findViewById(R.id.btSuperfaturarAumentar);
			btAumentarCapacidadeDeCargaAumentar = (Button) findViewById(R.id.btAumentarCapacidadeDeCargaAumentar);
			btUsarCarrinhoAumentar = (Button) findViewById(R.id.btUsarCarrinhoAumentar);
			btComercioAumentar = (Button) findViewById(R.id.btComercioAumentar);
			btIdentificarItemAumentar = (Button) findViewById(R.id.btIdentificarItemAumentar);
			btPericiaComMachadoEEspadaAumentar = (Button) findViewById(R.id.btPericiaComMachadoEEspadaAumentar);
			btPesquisaDePocoesAumentar = (Button) findViewById(R.id.btPesquisaDePocoesAumentar);
			btPrepararPocaoAumentar = (Button) findViewById(R.id.btPrepararPocaoAumentar);
			btFogoGregoAumentar = (Button) findViewById(R.id.btFogoGregoAumentar);
			btTerrorAcidoAumentar = (Button) findViewById(R.id.btTerrorAcidoAumentar);
			btArremessarPocaoAumentar = (Button) findViewById(R.id.btArremessarPocaoAumentar);
			btCriarMonstroPlantaAumentar = (Button) findViewById(R.id.btCriarMonstroPlantaAumentar);
			btCriarEsferaMarinhaAumentar = (Button) findViewById(R.id.btCriarEsferaMarinhaAumentar);
			btRevestirArmaAumentar = (Button) findViewById(R.id.btRevestirArmaAumentar);
			btRevestirEscudoAumentar = (Button) findViewById(R.id.btRevestirEscudoAumentar);
			btRevestirArmaduraAumentar = (Button) findViewById(R.id.btRevestirArmaduraAumentar);
			btRevestirCapaceteAumentar = (Button) findViewById(R.id.btRevestirCapaceteAumentar);
			btCriarHomunculusAumentar = (Button) findViewById(R.id.btCriarHomunculusAumentar);
			btRessuscitarHomunculusAumentar = (Button) findViewById(R.id.btRessuscitarHomunculusAumentar);
			btVaporizarAumentar = (Button) findViewById(R.id.btVaporizarAumentar);
			btCultivarPlantaAumentar = (Button) findViewById(R.id.btCultivarPlantaAumentar);
			btBombaAcidaAumentar = (Button) findViewById(R.id.btBombaAcidaAumentar);
			btProtecaoQuimicaTotalAumentar = (Button) findViewById(R.id.btProtecaoQuimicaTotalAumentar);
			btArremessarPocaoCompactaAumentar = (Button) findViewById(R.id.btArremessarPocaoCompactaAumentar);
			btFarmacologiaAvancadaAumentar = (Button) findViewById(R.id.btFarmacologiaAvancadaAumentar);
			btCulinariaAvancadaAumentar = (Button) findViewById(R.id.btCulinariaAvancadaAumentar);
			btCriarBombaOrganicaAumentar = (Button) findViewById(R.id.btCriarBombaOrganicaAumentar);
			btReacaoAlquimicaAumentar = (Button) findViewById(R.id.btReacaoAlquimicaAumentar);
			btArremessarItemAumentar = (Button) findViewById(R.id.btArremessarItemAumentar);
			btPericiaEmEsgrimaAumentar = (Button) findViewById(R.id.btPericiaEmEsgrimaAumentar);
			btAprimorarCarrinhoAumentar = (Button) findViewById(R.id.btAprimorarCarrinhoAumentar);
			btPropulsaoDoCarrinhoAumentar = (Button) findViewById(R.id.btPropulsaoDoCarrinhoAumentar);
			btCanhaoDeProtonsAumentar = (Button) findViewById(R.id.btCanhaoDeProtonsAumentar);
			btTornadoDeCarrinhoAumentar = (Button) findViewById(R.id.btTornadoDeCarrinhoAumentar);
			btArmadilhaDeEspinhosAumentar = (Button) findViewById(R.id.btArmadilhaDeEspinhosAumentar);
			btMuralhaDeEspinhosAumentar = (Button) findViewById(R.id.btMuralhaDeEspinhosAumentar);
			btPlantaInfernalAumentar = (Button) findViewById(R.id.btPlantaInfernalAumentar);
			btPlantaSanguessugaAumentar = (Button) findViewById(R.id.btPlantaSanguessugaAumentar);
			btEsporoExplosivoAumentar = (Button) findViewById(R.id.btEsporoExplosivoAumentar);
			btGritoDaMandragoraAumentar = (Button) findViewById(R.id.btGritoDaMandragoraAumentar);
			btErvaDaninhaAumentar = (Button) findViewById(R.id.btErvaDaninhaAumentar);
			btBombaNapalmAumentar = (Button) findViewById(R.id.btBombaNapalmAumentar);
			btCatalisadorAlquimicoAumentar = (Button) findViewById(R.id.btCatalisadorAlquimicoAumentar);

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
			txtPericiaComMachadoEEspadaPontos = (TextView) findViewById(R.id.txtPericiaComMachadoEEspadaPontos);
			txtPesquisaDePocoesPontos = (TextView) findViewById(R.id.txtPesquisaDePocoesPontos);
			txtPrepararPocaoPontos = (TextView) findViewById(R.id.txtPrepararPocaoPontos);
			txtFogoGregoPontos = (TextView) findViewById(R.id.txtFogoGregoPontos);
			txtTerrorAcidoPontos = (TextView) findViewById(R.id.txtTerrorAcidoPontos);
			txtArremessarPocaoPontos = (TextView) findViewById(R.id.txtArremessarPocaoPontos);
			txtCriarMonstroPlantaPontos = (TextView) findViewById(R.id.txtCriarMonstroPlantaPontos);
			txtCriarEsferaMarinhaPontos = (TextView) findViewById(R.id.txtCriarEsferaMarinhaPontos);
			txtRevestirArmaPontos = (TextView) findViewById(R.id.txtRevestirArmaPontos);
			txtRevestirEscudoPontos = (TextView) findViewById(R.id.txtRevestirEscudoPontos);
			txtRevestirArmaduraPontos = (TextView) findViewById(R.id.txtRevestirArmaduraPontos);
			txtRevestirCapacetePontos = (TextView) findViewById(R.id.txtRevestirCapacetePontos);
			txtCriarHomunculusPontos = (TextView) findViewById(R.id.txtCriarHomunculusPontos);
			txtRessuscitarHomunculusPontos = (TextView) findViewById(R.id.txtRessuscitarHomunculusPontos);
			txtVaporizarPontos = (TextView) findViewById(R.id.txtVaporizarPontos);
			txtCultivarPlantaPontos = (TextView) findViewById(R.id.txtCultivarPlantaPontos);
			txtBombaAcidaPontos = (TextView) findViewById(R.id.txtBombaAcidaPontos);
			txtProtecaoQuimicaTotalPontos = (TextView) findViewById(R.id.txtProtecaoQuimicaTotalPontos);
			txtArremessarPocaoCompactaPontos = (TextView) findViewById(R.id.txtArremessarPocaoCompactaPontos);
			txtFarmacologiaAvancadaPontos = (TextView) findViewById(R.id.txtFarmacologiaAvancadaPontos);
			txtCulinariaAvancadaPontos = (TextView) findViewById(R.id.txtCulinariaAvancadaPontos);
			txtCriarBombaOrganicaPontos = (TextView) findViewById(R.id.txtCriarBombaOrganicaPontos);
			txtReacaoAlquimicaPontos = (TextView) findViewById(R.id.txtReacaoAlquimicaPontos);
			txtArremessarItemPontos = (TextView) findViewById(R.id.txtArremessarItemPontos);
			txtPericiaEmEsgrimaPontos = (TextView) findViewById(R.id.txtPericiaEmEsgrimaPontos);
			txtAprimorarCarrinhoPontos = (TextView) findViewById(R.id.txtAprimorarCarrinhoPontos);
			txtPropulsaoDoCarrinhoPontos = (TextView) findViewById(R.id.txtPropulsaoDoCarrinhoPontos);
			txtCanhaoDeProtonsPontos = (TextView) findViewById(R.id.txtCanhaoDeProtonsPontos);
			txtTornadoDeCarrinhoPontos = (TextView) findViewById(R.id.txtTornadoDeCarrinhoPontos);
			txtArmadilhaDeEspinhosPontos = (TextView) findViewById(R.id.txtArmadilhaDeEspinhosPontos);
			txtMuralhaDeEspinhosPontos = (TextView) findViewById(R.id.txtMuralhaDeEspinhosPontos);
			txtPlantaInfernalPontos = (TextView) findViewById(R.id.txtPlantaInfernalPontos);
			txtPlantaSanguessugaPontos = (TextView) findViewById(R.id.txtPlantaSanguessugaPontos);
			txtEsporoExplosivoPontos = (TextView) findViewById(R.id.txtEsporoExplosivoPontos);
			txtGritoDaMandragoraPontos = (TextView) findViewById(R.id.txtGritoDaMandragoraPontos);
			txtErvaDaninhaPontos = (TextView) findViewById(R.id.txtErvaDaninhaPontos);
			txtBombaNapalmPontos = (TextView) findViewById(R.id.txtBombaNapalmPontos);
			txtCatalisadorAlquimicoPontos = (TextView) findViewById(R.id.txtCatalisadorAlquimicoPontos);

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
			layPericiaComMachadoEEspada = (LinearLayout) findViewById(R.id.layPericiaComMachadoEEspada);
			layPesquisaDePocoes = (LinearLayout) findViewById(R.id.layPesquisaDePocoes);
			layPrepararPocao = (LinearLayout) findViewById(R.id.layPrepararPocao);
			layFogoGrego = (LinearLayout) findViewById(R.id.layFogoGrego);
			layTerrorAcido = (LinearLayout) findViewById(R.id.layTerrorAcido);
			layArremessarPocao = (LinearLayout) findViewById(R.id.layArremessarPocao);
			layCriarMonstroPlanta = (LinearLayout) findViewById(R.id.layCriarMonstroPlanta);
			layCriarEsferaMarinha = (LinearLayout) findViewById(R.id.layCriarEsferaMarinha);
			layRevestirArma = (LinearLayout) findViewById(R.id.layRevestirArma);
			layRevestirEscudo = (LinearLayout) findViewById(R.id.layRevestirEscudo);
			layRevestirArmadura = (LinearLayout) findViewById(R.id.layRevestirArmadura);
			layRevestirCapacete = (LinearLayout) findViewById(R.id.layRevestirCapacete);
			layCriarHomunculus = (LinearLayout) findViewById(R.id.layCriarHomunculus);
			layRessuscitarHomunculus = (LinearLayout) findViewById(R.id.layRessuscitarHomunculus);
			layVaporizar = (LinearLayout) findViewById(R.id.layVaporizar);
			layCultivarPlanta = (LinearLayout) findViewById(R.id.layCultivarPlanta);
			layBombaAcida = (LinearLayout) findViewById(R.id.layBombaAcida);
			layProtecaoQuimicaTotal = (LinearLayout) findViewById(R.id.layProtecaoQuimicaTotal);
			layArremessarPocaoCompacta = (LinearLayout) findViewById(R.id.layArremessarPocaoCompacta);
			layFarmacologiaAvancada = (LinearLayout) findViewById(R.id.layFarmacologiaAvancada);
			layCulinariaAvancada = (LinearLayout) findViewById(R.id.layCulinariaAvancada);
			layCriarBombaOrganica = (LinearLayout) findViewById(R.id.layCriarBombaOrganica);
			layReacaoAlquimica = (LinearLayout) findViewById(R.id.layReacaoAlquimica);
			layArremessarItem = (LinearLayout) findViewById(R.id.layArremessarItem);
			layPericiaEmEsgrima = (LinearLayout) findViewById(R.id.layPericiaEmEsgrima);
			layAprimorarCarrinho = (LinearLayout) findViewById(R.id.layAprimorarCarrinho);
			layPropulsaoDoCarrinho = (LinearLayout) findViewById(R.id.layPropulsaoDoCarrinho);
			layCanhaoDeProtons = (LinearLayout) findViewById(R.id.layCanhaoDeProtons);
			layTornadoDeCarrinho = (LinearLayout) findViewById(R.id.layTornadoDeCarrinho);
			layArmadilhaDeEspinhos = (LinearLayout) findViewById(R.id.layArmadilhaDeEspinhos);
			layMuralhaDeEspinhos = (LinearLayout) findViewById(R.id.layMuralhaDeEspinhos);
			layPlantaInfernal = (LinearLayout) findViewById(R.id.layPlantaInfernal);
			layPlantaSanguessuga = (LinearLayout) findViewById(R.id.layPlantaSanguessuga);
			layEsporoExplosivo = (LinearLayout) findViewById(R.id.layEsporoExplosivo);
			layGritoDaMandragora = (LinearLayout) findViewById(R.id.layGritoDaMandragora);
			layErvaDaninha = (LinearLayout) findViewById(R.id.layErvaDaninha);
			layBombaNapalm = (LinearLayout) findViewById(R.id.layBombaNapalm);
			layCatalisadorAlquimico = (LinearLayout) findViewById(R.id.layCatalisadorAlquimico);
			
			layPrincipal = (LinearLayout) findViewById(R.id.habilidades);

			if (id>0)
				recarregarBuild(id);


			//Eventos de informação
			btMammonitaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Mammonita");
					dialogo.setMessage(R.string.mammonitaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDescontoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Desconto");
					dialogo.setMessage(R.string.descontoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSuperfaturarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Superfaturar");
					dialogo.setMessage(R.string.superfaturarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAumentarCapacidadeDeCargaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Aumentar Capacidade De Carga");
					dialogo.setMessage(R.string.aumentarCapacidadeDeCargaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btUsarCarrinhoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Usar Carrinho");
					dialogo.setMessage(R.string.usarCarrinhoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btComercioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Comércio");
					dialogo.setMessage(R.string.comercioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btIdentificarItemInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Identificar Item");
					dialogo.setMessage(R.string.identificarItemInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGritoDeGuerraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Grito De Guerra");
					dialogo.setMessage(R.string.gritoDeGuerraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPersonalizarCarrinhoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Personalizar Carrinho");
					dialogo.setMessage(R.string.personalizarCarrinhoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCavaloDePauInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Cavalo De Pau");
					dialogo.setMessage(R.string.cavaloDePauInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaComMachadoEEspadaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Perícia Com Machado E Espada");
					dialogo.setMessage(R.string.periciaComMachadoEEspadaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPesquisaDePocoesInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Pesquisa De Poções");
					dialogo.setMessage(R.string.pesquisaDePocoesInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPrepararPocaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Preparar Poção");
					dialogo.setMessage(R.string.prepararPocaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFogoGregoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Fogo Grego");
					dialogo.setMessage(R.string.fogoGregoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTerrorAcidoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Terror Ácido");
					dialogo.setMessage(R.string.terrorAcidoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArremessarPocaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Arremessar Poção");
					dialogo.setMessage(R.string.arremessarPocaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCriarMonstroPlantaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Criar Monstro Planta");
					dialogo.setMessage(R.string.criarMonstroPlantaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCriarEsferaMarinhaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Criar Esfera Marinha");
					dialogo.setMessage(R.string.criarEsferaMarinhaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRevestirArmaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Revestir Arma");
					dialogo.setMessage(R.string.revestirArmaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRevestirEscudoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Revestir Escudo");
					dialogo.setMessage(R.string.revestirEscudoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRevestirArmaduraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Revestir Armadura");
					dialogo.setMessage(R.string.revestirArmaduraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRevestirCapaceteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Revestir Capacete");
					dialogo.setMessage(R.string.revestirCapaceteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBioeticaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Bioética");
					dialogo.setMessage(R.string.bioeticaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCriarHomunculusInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Criar Homunculus");
					dialogo.setMessage(R.string.criarHomunculusInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRessuscitarHomunculusInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Ressuscitar Homunculus");
					dialogo.setMessage(R.string.ressuscitarHomunculusInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btVaporizarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Vaporizar");
					dialogo.setMessage(R.string.vaporizarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCriacaoEspiritualdePocoesIInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Criação Espiritual de Poções I");
					dialogo.setMessage(R.string.criacaoEspiritualDePocoesIInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCriacaoEspiritualdePocoesIIInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Criação Espiritual de Poções II");
					dialogo.setMessage(R.string.criacaoEspiritualDePocoesIIInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCriacaoEspiritualdePocoesIIIInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Criação Espiritual de Poções III");
					dialogo.setMessage(R.string.criacaoEspiritualDePocoesIIIInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArremessarPocaoDaFuriaSelvagemInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Arremessar Poção Da Fúria Selvagem");
					dialogo.setMessage(R.string.arremessarPocaoDaFuriaSelvagemInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCultivarPlantaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Cultivar Planta");
					dialogo.setMessage(R.string.cultivarPlantaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBombaAcidaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Bomba Ácida");
					dialogo.setMessage(R.string.bombaAcidaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btProtecaoQuimicaTotalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Proteção Química Total");
					dialogo.setMessage(R.string.protecaoQuimicaTotalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArremessarPocaoCompactaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Arremessar Poção Compacta");
					dialogo.setMessage(R.string.arremessarPocaoCompactaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFarmacologiaAvancadaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Farmacologia Avançada");
					dialogo.setMessage(R.string.farmacologiaAvancadaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCulinariaAvancadaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Culinária Avançada");
					dialogo.setMessage(R.string.culinariaAvancadaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCriarBombaOrganicaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Criar Bomba Orgânica");
					dialogo.setMessage(R.string.criarBombaOrganicaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btReacaoAlquimicaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Reação Alquímica");
					dialogo.setMessage(R.string.reacaoAlquimicaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArremessarItemInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Arremessar Item");
					dialogo.setMessage(R.string.arremessarItemInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaEmEsgrimaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Perícia Em Esgrima");
					dialogo.setMessage(R.string.periciaEmEsgrimaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAprimorarCarrinhoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Aprimorar Carrinho");
					dialogo.setMessage(R.string.aprimorarCarrinhoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPropulsaoDoCarrinhoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Propulsão Do Carrinho");
					dialogo.setMessage(R.string.propulsaoDoCarrinhoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCanhaoDeProtonsInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Canhão De Prótons");
					dialogo.setMessage(R.string.canhaoDeProtonsInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTornadoDeCarrinhoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Tornado De Carrinho");
					dialogo.setMessage(R.string.tornadoDeCarrinhoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArmadilhaDeEspinhosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Armadilha De Espinhos");
					dialogo.setMessage(R.string.armadilhaDeEspinhosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMuralhaDeEspinhosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Muralha De Espinhos");
					dialogo.setMessage(R.string.muralhaDeEspinhosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPlantaInfernalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Planta Infernal");
					dialogo.setMessage(R.string.plantaInfernalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPlantaSanguessugaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Planta Sanguessuga");
					dialogo.setMessage(R.string.plantaSanguessugaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEsporoExplosivoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Esporo Explosivo");
					dialogo.setMessage(R.string.esporoExplosivoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGritoDaMandragoraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Grito Da Mandrágora");
					dialogo.setMessage(R.string.gritoDaMandragoraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btErvaDaninhaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Erva Daninha");
					dialogo.setMessage(R.string.ervaDaninhaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBombaNapalmInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Bomba Napalm");
					dialogo.setMessage(R.string.bombaNapalmInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCatalisadorAlquimicoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorBioquimico.this);
					dialogo.setTitle("Catalisador Alquímico");
					dialogo.setMessage(R.string.catalisadorAlquimicoInfo);
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
			btPericiaComMachadoEEspadaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComMachadoEEspada, "PericiaComMachadoEEspada", 10, 2, "Aumentar");

				}
			});
			btPesquisaDePocoesAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");

				}
			});
			btPrepararPocaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");

				}
			});
			btFogoGregoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<4 && count<4){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFogoGrego, "FogoGrego", 5, 2, "Aumentar");

				}
			});
			btTerrorAcidoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<5 && count<5){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTerrorAcido, "TerrorAcido", 5, 2, "Aumentar");

				}
			});
			btArremessarPocaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<3 && count<3){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArremessarPocao, "ArremessarPocao", 5, 2, "Aumentar");

				}
			});
			btCriarMonstroPlantaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<6 && count<6){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCriarMonstroPlanta, "CriarMonstroPlanta", 5, 2, "Aumentar");

				}
			});
			btCriarEsferaMarinhaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<2 && count<2){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCriarEsferaMarinha, "CriarEsferaMarinha", 5, 2, "Aumentar");

				}
			});
			btRevestirArmaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<2 && count<2){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirCapacete<3 && count<3){
						atualizarCalculo(varRevestirCapacete, "RevestirCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirEscudo<3 && count<3){
						atualizarCalculo(varRevestirEscudo, "RevestirEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirArmadura<3 && count<3){
						atualizarCalculo(varRevestirArmadura, "RevestirArmadura", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRevestirArma, "RevestirArma", 5, 2, "Aumentar");

				}
			});
			btRevestirEscudoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<2 && count<2){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirCapacete<3 && count<3){
						atualizarCalculo(varRevestirCapacete, "RevestirCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRevestirEscudo, "RevestirEscudo", 5, 2, "Aumentar");

				}
			});
			btRevestirArmaduraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<2 && count<2){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirCapacete<3 && count<3){
						atualizarCalculo(varRevestirCapacete, "RevestirCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirEscudo<3 && count<3){
						atualizarCalculo(varRevestirEscudo, "RevestirEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRevestirArmadura, "RevestirArmadura", 5, 2, "Aumentar");

				}
			});
			btRevestirCapaceteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<2 && count<2){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRevestirCapacete, "RevestirCapacete", 5, 2, "Aumentar");

				}
			});
			btCriarHomunculusAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCriarHomunculus, "CriarHomunculus", 1, 2, "Aumentar");

				}
			});
			btRessuscitarHomunculusAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varCriarHomunculus<1 && count<1){
						atualizarCalculo(varCriarHomunculus, "CriarHomunculus", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRessuscitarHomunculus, "RessuscitarHomunculus", 5, 2, "Aumentar");

				}
			});
			btVaporizarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varVaporizar, "Vaporizar", 1, 2, "Aumentar");

				}
			});
			btCultivarPlantaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCultivarPlanta, "CultivarPlanta", 2, 3, "Aumentar");

				}
			});
			btBombaAcidaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<5 && count<5){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varTerrorAcido<5 && count<5){
						atualizarCalculo(varTerrorAcido, "TerrorAcido", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<4 && count<4){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFogoGrego<5 && count<5){
						atualizarCalculo(varFogoGrego, "FogoGrego", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBombaAcida, "BombaAcida", 10, 3, "Aumentar");

				}
			});
			btProtecaoQuimicaTotalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<2 && count<2){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirCapacete<3 && count<3){
						atualizarCalculo(varRevestirCapacete, "RevestirCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirEscudo<3 && count<3){
						atualizarCalculo(varRevestirEscudo, "RevestirEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirArmadura<3 && count<3){
						atualizarCalculo(varRevestirArmadura, "RevestirArmadura", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirArma<5 && count<5){
						atualizarCalculo(varRevestirArma, "RevestirArma", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<2 && count<2){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirCapacete<3 && count<3){
						atualizarCalculo(varRevestirCapacete, "RevestirCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirEscudo<3 && count<3){
						atualizarCalculo(varRevestirEscudo, "RevestirEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirArmadura<5 && count<5){
						atualizarCalculo(varRevestirArmadura, "RevestirArmadura", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<2 && count<2){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirCapacete<5 && count<5){
						atualizarCalculo(varRevestirCapacete, "RevestirCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<2 && count<2){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirCapacete<3 && count<3){
						atualizarCalculo(varRevestirCapacete, "RevestirCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRevestirEscudo<5 && count<5){
						atualizarCalculo(varRevestirEscudo, "RevestirEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varProtecaoQuimicaTotal, "ProtecaoQuimicaTotal", 5, 3, "Aumentar");

				}
			});
			btArremessarPocaoCompactaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDePocoes<5 && count<5){
						atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPrepararPocao<3 && count<3){
						atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarPocao<5 && count<5){
						atualizarCalculo(varArremessarPocao, "ArremessarPocao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArremessarPocaoCompacta, "ArremessarPocaoCompacta", 10, 3, "Aumentar");

				}
			});
			btFarmacologiaAvancadaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFarmacologiaAvancada, "FarmacologiaAvancada", 10, 4, "Aumentar");

				}
			});
			btCulinariaAvancadaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFarmacologiaAvancada<1 && count<1){
						atualizarCalculo(varFarmacologiaAvancada, "FarmacologiaAvancada", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCulinariaAvancada, "CulinariaAvancada", 2, 4, "Aumentar");

				}
			});
			btCriarBombaOrganicaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFarmacologiaAvancada<1 && count<1){
						atualizarCalculo(varFarmacologiaAvancada, "FarmacologiaAvancada", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCriarBombaOrganica, "CriarBombaOrganica", 2, 4, "Aumentar");

				}
			});
			btReacaoAlquimicaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varReacaoAlquimica, "ReacaoAlquimica", 1, 4, "Aumentar");

				}
			});
			btArremessarItemAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varReacaoAlquimica<1 && count<1){
						atualizarCalculo(varReacaoAlquimica, "ReacaoAlquimica", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArremessarItem, "ArremessarItem", 1, 4, "Aumentar");

				}
			});
			btPericiaEmEsgrimaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaEmEsgrima, "PericiaEmEsgrima", 5, 4, "Aumentar");

				}
			});
			btAprimorarCarrinhoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAprimorarCarrinho, "AprimorarCarrinho", 5, 4, "Aumentar");

				}
			});
			btPropulsaoDoCarrinhoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAprimorarCarrinho<3 && count<3){
						atualizarCalculo(varAprimorarCarrinho, "AprimorarCarrinho", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPropulsaoDoCarrinho, "PropulsaoDoCarrinho", 5, 4, "Aumentar");

				}
			});
			btCanhaoDeProtonsAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAprimorarCarrinho<2 && count<2){
						atualizarCalculo(varAprimorarCarrinho, "AprimorarCarrinho", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCanhaoDeProtons, "CanhaoDeProtons", 5, 4, "Aumentar");

				}
			});
			btTornadoDeCarrinhoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAprimorarCarrinho<1 && count<1){
						atualizarCalculo(varAprimorarCarrinho, "AprimorarCarrinho", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTornadoDeCarrinho, "TornadoDeCarrinho", 5, 4, "Aumentar");

				}
			});
			btArmadilhaDeEspinhosAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFarmacologiaAvancada<2 && count<2){
						atualizarCalculo(varFarmacologiaAvancada, "FarmacologiaAvancada", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArmadilhaDeEspinhos, "ArmadilhaDeEspinhos", 5, 4, "Aumentar");

				}
			});
			btMuralhaDeEspinhosAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFarmacologiaAvancada<2 && count<2){
						atualizarCalculo(varFarmacologiaAvancada, "FarmacologiaAvancada", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaDeEspinhos<3 && count<3){
						atualizarCalculo(varArmadilhaDeEspinhos, "ArmadilhaDeEspinhos", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMuralhaDeEspinhos, "MuralhaDeEspinhos", 5, 4, "Aumentar");

				}
			});
			btPlantaInfernalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFarmacologiaAvancada<3 && count<3){
						atualizarCalculo(varFarmacologiaAvancada, "FarmacologiaAvancada", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPlantaSanguessuga<3 && count<3){
						atualizarCalculo(varPlantaSanguessuga, "PlantaSanguessuga", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPlantaInfernal, "PlantaInfernal", 5, 4, "Aumentar");

				}
			});
			btPlantaSanguessugaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFarmacologiaAvancada<3 && count<3){
						atualizarCalculo(varFarmacologiaAvancada, "FarmacologiaAvancada", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPlantaSanguessuga, "PlantaSanguessuga", 5, 4, "Aumentar");

				}
			});
			btEsporoExplosivoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFarmacologiaAvancada<4 && count<4){
						atualizarCalculo(varFarmacologiaAvancada, "FarmacologiaAvancada", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEsporoExplosivo, "EsporoExplosivo", 5, 4, "Aumentar");

				}
			});
			btGritoDaMandragoraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFarmacologiaAvancada<3 && count<3){
						atualizarCalculo(varFarmacologiaAvancada, "FarmacologiaAvancada", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPlantaSanguessuga<3 && count<3){
						atualizarCalculo(varPlantaSanguessuga, "PlantaSanguessuga", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPlantaInfernal<3 && count<3){
						atualizarCalculo(varPlantaInfernal, "PlantaInfernal", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGritoDaMandragora, "GritoDaMandragora", 5, 4, "Aumentar");

				}
			});
			btErvaDaninhaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFarmacologiaAvancada<2 && count<2){
						atualizarCalculo(varFarmacologiaAvancada, "FarmacologiaAvancada", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varArmadilhaDeEspinhos<3 && count<3){
						atualizarCalculo(varArmadilhaDeEspinhos, "ArmadilhaDeEspinhos", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMuralhaDeEspinhos<3 && count<3){
						atualizarCalculo(varMuralhaDeEspinhos, "MuralhaDeEspinhos", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varErvaDaninha, "ErvaDaninha", 10, 4, "Aumentar");

				}
			});
			btBombaNapalmAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFarmacologiaAvancada<4 && count<4){
						atualizarCalculo(varFarmacologiaAvancada, "FarmacologiaAvancada", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsporoExplosivo<3 && count<3){
						atualizarCalculo(varEsporoExplosivo, "EsporoExplosivo", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBombaNapalm, "BombaNapalm", 5, 4, "Aumentar");

				}
			});
			btCatalisadorAlquimicoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFarmacologiaAvancada<4 && count<4){
						atualizarCalculo(varFarmacologiaAvancada, "FarmacologiaAvancada", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsporoExplosivo<3 && count<3){
						atualizarCalculo(varEsporoExplosivo, "EsporoExplosivo", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBombaNapalm<3 && count<3){
						atualizarCalculo(varBombaNapalm, "BombaNapalm", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCatalisadorAlquimico, "CatalisadorAlquimico", 5, 4, "Aumentar");

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
			btPericiaComMachadoEEspadaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComMachadoEEspada, "PericiaComMachadoEEspada", 10, 2, "Diminuir");

				}
			});
			btPesquisaDePocoesDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPesquisaDePocoes, "PesquisaDePocoes", 10, 2, "Diminuir");

				}
			});
			btPrepararPocaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPrepararPocao, "PrepararPocao", 10, 2, "Diminuir");

				}
			});
			btFogoGregoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFogoGrego, "FogoGrego", 5, 2, "Diminuir");

				}
			});
			btTerrorAcidoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTerrorAcido, "TerrorAcido", 5, 2, "Diminuir");

				}
			});
			btArremessarPocaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArremessarPocao, "ArremessarPocao", 5, 2, "Diminuir");

				}
			});
			btCriarMonstroPlantaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCriarMonstroPlanta, "CriarMonstroPlanta", 5, 2, "Diminuir");

				}
			});
			btCriarEsferaMarinhaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCriarEsferaMarinha, "CriarEsferaMarinha", 5, 2, "Diminuir");

				}
			});
			btRevestirArmaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRevestirArma, "RevestirArma", 5, 2, "Diminuir");

				}
			});
			btRevestirEscudoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRevestirEscudo, "RevestirEscudo", 5, 2, "Diminuir");

				}
			});
			btRevestirArmaduraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRevestirArmadura, "RevestirArmadura", 5, 2, "Diminuir");

				}
			});
			btRevestirCapaceteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRevestirCapacete, "RevestirCapacete", 5, 2, "Diminuir");

				}
			});
			btCriarHomunculusDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCriarHomunculus, "CriarHomunculus", 1, 2, "Diminuir");

				}
			});
			btRessuscitarHomunculusDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRessuscitarHomunculus, "RessuscitarHomunculus", 5, 2, "Diminuir");

				}
			});
			btVaporizarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varVaporizar, "Vaporizar", 1, 2, "Diminuir");

				}
			});
			btCultivarPlantaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCultivarPlanta, "CultivarPlanta", 2, 3, "Diminuir");

				}
			});
			btBombaAcidaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBombaAcida, "BombaAcida", 10, 3, "Diminuir");

				}
			});
			btProtecaoQuimicaTotalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varProtecaoQuimicaTotal, "ProtecaoQuimicaTotal", 5, 3, "Diminuir");

				}
			});
			btArremessarPocaoCompactaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArremessarPocaoCompacta, "ArremessarPocaoCompacta", 10, 3, "Diminuir");

				}
			});
			btFarmacologiaAvancadaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFarmacologiaAvancada, "FarmacologiaAvancada", 10, 4, "Diminuir");

				}
			});
			btCulinariaAvancadaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCulinariaAvancada, "CulinariaAvancada", 2, 4, "Diminuir");

				}
			});
			btCriarBombaOrganicaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCriarBombaOrganica, "CriarBombaOrganica", 2, 4, "Diminuir");

				}
			});
			btReacaoAlquimicaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varReacaoAlquimica, "ReacaoAlquimica", 1, 4, "Diminuir");

				}
			});
			btArremessarItemDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArremessarItem, "ArremessarItem", 1, 4, "Diminuir");

				}
			});
			btPericiaEmEsgrimaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaEmEsgrima, "PericiaEmEsgrima", 5, 4, "Diminuir");

				}
			});
			btAprimorarCarrinhoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAprimorarCarrinho, "AprimorarCarrinho", 5, 4, "Diminuir");

				}
			});
			btPropulsaoDoCarrinhoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPropulsaoDoCarrinho, "PropulsaoDoCarrinho", 5, 4, "Diminuir");

				}
			});
			btCanhaoDeProtonsDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCanhaoDeProtons, "CanhaoDeProtons", 5, 4, "Diminuir");

				}
			});
			btTornadoDeCarrinhoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTornadoDeCarrinho, "TornadoDeCarrinho", 5, 4, "Diminuir");

				}
			});
			btArmadilhaDeEspinhosDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArmadilhaDeEspinhos, "ArmadilhaDeEspinhos", 5, 4, "Diminuir");

				}
			});
			btMuralhaDeEspinhosDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMuralhaDeEspinhos, "MuralhaDeEspinhos", 5, 4, "Diminuir");

				}
			});
			btPlantaInfernalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPlantaInfernal, "PlantaInfernal", 5, 4, "Diminuir");

				}
			});
			btPlantaSanguessugaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPlantaSanguessuga, "PlantaSanguessuga", 5, 4, "Diminuir");

				}
			});
			btEsporoExplosivoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEsporoExplosivo, "EsporoExplosivo", 5, 4, "Diminuir");

				}
			});
			btGritoDaMandragoraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGritoDaMandragora, "GritoDaMandragora", 5, 4, "Diminuir");

				}
			});
			btErvaDaninhaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varErvaDaninha, "ErvaDaninha", 10, 4, "Diminuir");

				}
			});
			btBombaNapalmDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBombaNapalm, "BombaNapalm", 5, 4, "Diminuir");

				}
			});
			btCatalisadorAlquimicoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCatalisadorAlquimico, "CatalisadorAlquimico", 5, 4, "Diminuir");

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
					varPericiaComMachadoEEspada = 0;
					varPesquisaDePocoes = 0;
					varPrepararPocao = 0;
					varFogoGrego = 0;
					varTerrorAcido = 0;
					varArremessarPocao = 0;
					varCriarMonstroPlanta = 0;
					varCriarEsferaMarinha = 0;
					varRevestirArma = 0;
					varRevestirEscudo = 0;
					varRevestirArmadura = 0;
					varRevestirCapacete = 0;
					varCriarHomunculus = 0;
					varRessuscitarHomunculus = 0;
					varVaporizar = 0;
					varCultivarPlanta = 0;
					varBombaAcida = 0;
					varProtecaoQuimicaTotal = 0;
					varArremessarPocaoCompacta = 0;
					varFarmacologiaAvancada = 0;
					varCulinariaAvancada = 0;
					varCriarBombaOrganica = 0;
					varReacaoAlquimica = 0;
					varArremessarItem = 0;
					varPericiaEmEsgrima = 0;
					varAprimorarCarrinho = 0;
					varPropulsaoDoCarrinho = 0;
					varCanhaoDeProtons = 0;
					varTornadoDeCarrinho = 0;
					varArmadilhaDeEspinhos = 0;
					varMuralhaDeEspinhos = 0;
					varPlantaInfernal = 0;
					varPlantaSanguessuga = 0;
					varEsporoExplosivo = 0;
					varGritoDaMandragora = 0;
					varErvaDaninha = 0;
					varBombaNapalm = 0;
					varCatalisadorAlquimico = 0;

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
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorBioquimico.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorBioquimico.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorBioquimico.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorBioquimico.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorBioquimico.this);
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

					AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorBioquimico.this);
					msg.setTitle("Escolha um nome");
					msg.setMessage("OBS: Salvar PNG só irá salvar em forma de imagem! É recomendado que salve a build na memória do celular também.\nEscolha um nome para salvar esta simulação:");
					final EditText nomeParaSalvar = new EditText(SimuladorBioquimico.this);
					msg.setView(nomeParaSalvar);
					msg.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {

							@Override
						public void onClick(DialogInterface dialog, int which) {
							if (nomeParaSalvar.getText().toString().length() <= 0) {
								nomeParaSalvar.setError("Preencha o campo!");
								Toast.makeText(getBaseContext(), "ERROR: Insira um nome!", Toast.LENGTH_SHORT).show();
							} else {
								SaveFile sf = new SaveFile();
								sf.takeAScreenShot(SimuladorBioquimico.this, layPrincipal, nomeParaSalvar.getText().toString());
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

			if(varPericiaComMachadoEEspada==0)
				layPericiaComMachadoEEspada.setVisibility(View.GONE);
			if(varPesquisaDePocoes==0)
				layPesquisaDePocoes.setVisibility(View.GONE);
			if(varPrepararPocao==0)
				layPrepararPocao.setVisibility(View.GONE);
			if(varFogoGrego==0)
				layFogoGrego.setVisibility(View.GONE);
			if(varTerrorAcido==0)
				layTerrorAcido.setVisibility(View.GONE);
			if(varArremessarPocao==0)
				layArremessarPocao.setVisibility(View.GONE);
			if(varCriarMonstroPlanta==0)
				layCriarMonstroPlanta.setVisibility(View.GONE);
			if(varCriarEsferaMarinha==0)
				layCriarEsferaMarinha.setVisibility(View.GONE);
			if(varRevestirArma==0)
				layRevestirArma.setVisibility(View.GONE);
			if(varRevestirEscudo==0)
				layRevestirEscudo.setVisibility(View.GONE);
			if(varRevestirArmadura==0)
				layRevestirArmadura.setVisibility(View.GONE);
			if(varRevestirCapacete==0)
				layRevestirCapacete.setVisibility(View.GONE);
			if(varCriarHomunculus==0)
				layCriarHomunculus.setVisibility(View.GONE);
			if(varRessuscitarHomunculus==0)
				layRessuscitarHomunculus.setVisibility(View.GONE);
			if(varVaporizar==0)
				layVaporizar.setVisibility(View.GONE);

			if(varCultivarPlanta==0)
				layCultivarPlanta.setVisibility(View.GONE);
			if(varBombaAcida==0)
				layBombaAcida.setVisibility(View.GONE);
			if(varProtecaoQuimicaTotal==0)
				layProtecaoQuimicaTotal.setVisibility(View.GONE);
			if(varArremessarPocaoCompacta==0)
				layArremessarPocaoCompacta.setVisibility(View.GONE);

			if(varFarmacologiaAvancada==0)
				layFarmacologiaAvancada.setVisibility(View.GONE);
			if(varCulinariaAvancada==0)
				layCulinariaAvancada.setVisibility(View.GONE);
			if(varCriarBombaOrganica==0)
				layCriarBombaOrganica.setVisibility(View.GONE);
			if(varReacaoAlquimica==0)
				layReacaoAlquimica.setVisibility(View.GONE);
			if(varArremessarItem==0)
				layArremessarItem.setVisibility(View.GONE);
			if(varPericiaEmEsgrima==0)
				layPericiaEmEsgrima.setVisibility(View.GONE);
			if(varAprimorarCarrinho==0)
				layAprimorarCarrinho.setVisibility(View.GONE);
			if(varPropulsaoDoCarrinho==0)
				layPropulsaoDoCarrinho.setVisibility(View.GONE);
			if(varCanhaoDeProtons==0)
				layCanhaoDeProtons.setVisibility(View.GONE);
			if(varTornadoDeCarrinho==0)
				layTornadoDeCarrinho.setVisibility(View.GONE);
			if(varArmadilhaDeEspinhos==0)
				layArmadilhaDeEspinhos.setVisibility(View.GONE);
			if(varMuralhaDeEspinhos==0)
				layMuralhaDeEspinhos.setVisibility(View.GONE);
			if(varPlantaInfernal==0)
				layPlantaInfernal.setVisibility(View.GONE);
			if(varPlantaSanguessuga==0)
				layPlantaSanguessuga.setVisibility(View.GONE);
			if(varEsporoExplosivo==0)
				layEsporoExplosivo.setVisibility(View.GONE);
			if(varGritoDaMandragora==0)
				layGritoDaMandragora.setVisibility(View.GONE);
			if(varErvaDaninha==0)
				layErvaDaninha.setVisibility(View.GONE);
			if(varBombaNapalm==0)
				layBombaNapalm.setVisibility(View.GONE);
			if(varCatalisadorAlquimico==0)
				layCatalisadorAlquimico.setVisibility(View.GONE);

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

				if (nomeDaHabilidade=="PesquisaDePocoes" && varPrepararPocao>=1 && varPesquisaDePocoes<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PrepararPocao" && varFogoGrego>=1 && varPrepararPocao<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PrepararPocao" && varTerrorAcido>=1 && varPrepararPocao<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PrepararPocao" && varArremessarPocao>=1 && varPrepararPocao<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PrepararPocao" && varCriarMonstroPlanta>=1 && varPrepararPocao<=06){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PrepararPocao" && varCriarEsferaMarinha>=1 && varPrepararPocao<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RevestirArmadura" && varRevestirArma>=1 && varRevestirArmadura<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RevestirCapacete" && varRevestirEscudo>=1 && varRevestirCapacete<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RevestirEscudo" && varRevestirArmadura>=1 && varRevestirEscudo<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PrepararPocao" && varRevestirCapacete>=1 && varPrepararPocao<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CriarHomunculus" && varRessuscitarHomunculus>=1 && varCriarHomunculus<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TerrorAcido" && varBombaAcida>=1 && varTerrorAcido<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FogoGrego" && varBombaAcida>=1 && varFogoGrego<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RevestirArma" && varProtecaoQuimicaTotal>=1 && varRevestirArma<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RevestirArmadura" && varProtecaoQuimicaTotal>=1 && varRevestirArmadura<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RevestirCapacete" && varProtecaoQuimicaTotal>=1 && varRevestirCapacete<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RevestirEscudo" && varProtecaoQuimicaTotal>=1 && varRevestirEscudo<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArremessarPocao" && varArremessarPocaoCompacta>=1 && varArremessarPocao<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FarmacologiaAvancada" && varCulinariaAvancada>=1 && varFarmacologiaAvancada<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FarmacologiaAvancada" && varCriarBombaOrganica>=1 && varFarmacologiaAvancada<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ReacaoAlquimica" && varArremessarItem>=1 && varReacaoAlquimica<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AprimorarCarrinho" && varPropulsaoDoCarrinho>=1 && varAprimorarCarrinho<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AprimorarCarrinho" && varCanhaoDeProtons>=1 && varAprimorarCarrinho<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AprimorarCarrinho" && varTornadoDeCarrinho>=1 && varAprimorarCarrinho<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FarmacologiaAvancada" && varArmadilhaDeEspinhos>=1 && varFarmacologiaAvancada<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArmadilhaDeEspinhos" && varMuralhaDeEspinhos>=1 && varArmadilhaDeEspinhos<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PlantaSanguessuga" && varPlantaInfernal>=1 && varPlantaSanguessuga<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FarmacologiaAvancada" && varPlantaSanguessuga>=1 && varFarmacologiaAvancada<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="FarmacologiaAvancada" && varEsporoExplosivo>=1 && varFarmacologiaAvancada<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PlantaInfernal" && varGritoDaMandragora>=1 && varPlantaInfernal<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MuralhaDeEspinhos" && varErvaDaninha>=1 && varMuralhaDeEspinhos<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EsporoExplosivo" && varBombaNapalm>=1 && varEsporoExplosivo<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="BombaNapalm" && varCatalisadorAlquimico>=1 && varBombaNapalm<=03){
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

			else if(nomeDaHabilidade=="PericiaComMachadoEEspada"){
				varPericiaComMachadoEEspada = habilidade;
			} else if(nomeDaHabilidade=="PesquisaDePocoes"){
				varPesquisaDePocoes = habilidade;
			} else if(nomeDaHabilidade=="PrepararPocao"){
				varPrepararPocao = habilidade;
			} else if(nomeDaHabilidade=="FogoGrego"){
				varFogoGrego = habilidade;
			} else if(nomeDaHabilidade=="TerrorAcido"){
				varTerrorAcido = habilidade;
			} else if(nomeDaHabilidade=="ArremessarPocao"){
				varArremessarPocao = habilidade;
			} else if(nomeDaHabilidade=="CriarMonstroPlanta"){
				varCriarMonstroPlanta = habilidade;
			} else if(nomeDaHabilidade=="CriarEsferaMarinha"){
				varCriarEsferaMarinha = habilidade;
			} else if(nomeDaHabilidade=="RevestirArma"){
				varRevestirArma = habilidade;
			} else if(nomeDaHabilidade=="RevestirEscudo"){
				varRevestirEscudo = habilidade;
			} else if(nomeDaHabilidade=="RevestirArmadura"){
				varRevestirArmadura = habilidade;
			} else if(nomeDaHabilidade=="RevestirCapacete"){
				varRevestirCapacete = habilidade;
			} else if(nomeDaHabilidade=="CriarHomunculus"){
				varCriarHomunculus = habilidade;
			} else if(nomeDaHabilidade=="RessuscitarHomunculus"){
				varRessuscitarHomunculus = habilidade;
			} else if(nomeDaHabilidade=="Vaporizar"){
				varVaporizar = habilidade;
			}

			else if(nomeDaHabilidade=="CultivarPlanta"){
				varCultivarPlanta = habilidade;
			} else if(nomeDaHabilidade=="BombaAcida"){
				varBombaAcida = habilidade;
			} else if(nomeDaHabilidade=="ProtecaoQuimicaTotal"){
				varProtecaoQuimicaTotal = habilidade;
			} else if(nomeDaHabilidade=="ArremessarPocaoCompacta"){
				varArremessarPocaoCompacta = habilidade;
			}

			else if(nomeDaHabilidade=="FarmacologiaAvancada"){
				varFarmacologiaAvancada = habilidade;
			} else if(nomeDaHabilidade=="CulinariaAvancada"){
				varCulinariaAvancada = habilidade;
			} else if(nomeDaHabilidade=="CriarBombaOrganica"){
				varCriarBombaOrganica = habilidade;
			} else if(nomeDaHabilidade=="ReacaoAlquimica"){
				varReacaoAlquimica = habilidade;
			} else if(nomeDaHabilidade=="ArremessarItem"){
				varArremessarItem = habilidade;
			} else if(nomeDaHabilidade=="PericiaEmEsgrima"){
				varPericiaEmEsgrima = habilidade;
			} else if(nomeDaHabilidade=="AprimorarCarrinho"){
				varAprimorarCarrinho = habilidade;
			} else if(nomeDaHabilidade=="PropulsaoDoCarrinho"){
				varPropulsaoDoCarrinho = habilidade;
			} else if(nomeDaHabilidade=="CanhaoDeProtons"){
				varCanhaoDeProtons = habilidade;
			} else if(nomeDaHabilidade=="TornadoDeCarrinho"){
				varTornadoDeCarrinho = habilidade;
			} else if(nomeDaHabilidade=="ArmadilhaDeEspinhos"){
				varArmadilhaDeEspinhos = habilidade;
			} else if(nomeDaHabilidade=="MuralhaDeEspinhos"){
				varMuralhaDeEspinhos = habilidade;
			} else if(nomeDaHabilidade=="PlantaInfernal"){
				varPlantaInfernal = habilidade;
			} else if(nomeDaHabilidade=="PlantaSanguessuga"){
				varPlantaSanguessuga = habilidade;
			} else if(nomeDaHabilidade=="EsporoExplosivo"){
				varEsporoExplosivo = habilidade;
			} else if(nomeDaHabilidade=="GritoDaMandragora"){
				varGritoDaMandragora = habilidade;
			} else if(nomeDaHabilidade=="ErvaDaninha"){
				varErvaDaninha = habilidade;
			} else if(nomeDaHabilidade=="BombaNapalm"){
				varBombaNapalm = habilidade;
			} else if(nomeDaHabilidade=="CatalisadorAlquimico"){
				varCatalisadorAlquimico = habilidade;
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

			txtPericiaComMachadoEEspadaPontos.setText(varPericiaComMachadoEEspada + "/10");
			txtPesquisaDePocoesPontos.setText(varPesquisaDePocoes + "/10");
			txtPrepararPocaoPontos.setText(varPrepararPocao + "/10");
			txtFogoGregoPontos.setText(varFogoGrego + "/5");
			txtTerrorAcidoPontos.setText(varTerrorAcido + "/5");
			txtArremessarPocaoPontos.setText(varArremessarPocao + "/5");
			txtCriarMonstroPlantaPontos.setText(varCriarMonstroPlanta + "/5");
			txtCriarEsferaMarinhaPontos.setText(varCriarEsferaMarinha + "/5");
			txtRevestirArmaPontos.setText(varRevestirArma + "/5");
			txtRevestirEscudoPontos.setText(varRevestirEscudo + "/5");
			txtRevestirArmaduraPontos.setText(varRevestirArmadura + "/5");
			txtRevestirCapacetePontos.setText(varRevestirCapacete + "/5");
			txtCriarHomunculusPontos.setText(varCriarHomunculus + "/1");
			txtRessuscitarHomunculusPontos.setText(varRessuscitarHomunculus + "/5");
			txtVaporizarPontos.setText(varVaporizar + "/1");

			txtCultivarPlantaPontos.setText(varCultivarPlanta + "/2");
			txtBombaAcidaPontos.setText(varBombaAcida + "/10");
			txtProtecaoQuimicaTotalPontos.setText(varProtecaoQuimicaTotal + "/5");
			txtArremessarPocaoCompactaPontos.setText(varArremessarPocaoCompacta + "/10");

			txtFarmacologiaAvancadaPontos.setText(varFarmacologiaAvancada + "/10");
			txtCulinariaAvancadaPontos.setText(varCulinariaAvancada + "/2");
			txtCriarBombaOrganicaPontos.setText(varCriarBombaOrganica + "/2");
			txtReacaoAlquimicaPontos.setText(varReacaoAlquimica + "/1");
			txtArremessarItemPontos.setText(varArremessarItem + "/1");
			txtPericiaEmEsgrimaPontos.setText(varPericiaEmEsgrima + "/5");
			txtAprimorarCarrinhoPontos.setText(varAprimorarCarrinho + "/5");
			txtPropulsaoDoCarrinhoPontos.setText(varPropulsaoDoCarrinho + "/5");
			txtCanhaoDeProtonsPontos.setText(varCanhaoDeProtons + "/5");
			txtTornadoDeCarrinhoPontos.setText(varTornadoDeCarrinho + "/5");
			txtArmadilhaDeEspinhosPontos.setText(varArmadilhaDeEspinhos + "/5");
			txtMuralhaDeEspinhosPontos.setText(varMuralhaDeEspinhos + "/5");
			txtPlantaInfernalPontos.setText(varPlantaInfernal + "/5");
			txtPlantaSanguessugaPontos.setText(varPlantaSanguessuga + "/5");
			txtEsporoExplosivoPontos.setText(varEsporoExplosivo + "/5");
			txtGritoDaMandragoraPontos.setText(varGritoDaMandragora + "/5");
			txtErvaDaninhaPontos.setText(varErvaDaninha + "/10");
			txtBombaNapalmPontos.setText(varBombaNapalm + "/5");
			txtCatalisadorAlquimicoPontos.setText(varCatalisadorAlquimico + "/5");

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

			layPericiaComMachadoEEspada.setVisibility(View.VISIBLE);
			layPesquisaDePocoes.setVisibility(View.VISIBLE);
			layPrepararPocao.setVisibility(View.VISIBLE);
			layFogoGrego.setVisibility(View.VISIBLE);
			layTerrorAcido.setVisibility(View.VISIBLE);
			layArremessarPocao.setVisibility(View.VISIBLE);
			layCriarMonstroPlanta.setVisibility(View.VISIBLE);
			layCriarEsferaMarinha.setVisibility(View.VISIBLE);
			layRevestirArma.setVisibility(View.VISIBLE);
			layRevestirEscudo.setVisibility(View.VISIBLE);
			layRevestirArmadura.setVisibility(View.VISIBLE);
			layRevestirCapacete.setVisibility(View.VISIBLE);
			layCriarHomunculus.setVisibility(View.VISIBLE);
			layRessuscitarHomunculus.setVisibility(View.VISIBLE);
			layVaporizar.setVisibility(View.VISIBLE);

			layCultivarPlanta.setVisibility(View.VISIBLE);
			layBombaAcida.setVisibility(View.VISIBLE);
			layProtecaoQuimicaTotal.setVisibility(View.VISIBLE);
			layArremessarPocaoCompacta.setVisibility(View.VISIBLE);

			layFarmacologiaAvancada.setVisibility(View.VISIBLE);
			layCulinariaAvancada.setVisibility(View.VISIBLE);
			layCriarBombaOrganica.setVisibility(View.VISIBLE);
			layReacaoAlquimica.setVisibility(View.VISIBLE);
			layArremessarItem.setVisibility(View.VISIBLE);
			layPericiaEmEsgrima.setVisibility(View.VISIBLE);
			layAprimorarCarrinho.setVisibility(View.VISIBLE);
			layPropulsaoDoCarrinho.setVisibility(View.VISIBLE);
			layCanhaoDeProtons.setVisibility(View.VISIBLE);
			layTornadoDeCarrinho.setVisibility(View.VISIBLE);
			layArmadilhaDeEspinhos.setVisibility(View.VISIBLE);
			layMuralhaDeEspinhos.setVisibility(View.VISIBLE);
			layPlantaInfernal.setVisibility(View.VISIBLE);
			layPlantaSanguessuga.setVisibility(View.VISIBLE);
			layEsporoExplosivo.setVisibility(View.VISIBLE);
			layGritoDaMandragora.setVisibility(View.VISIBLE);
			layErvaDaninha.setVisibility(View.VISIBLE);
			layBombaNapalm.setVisibility(View.VISIBLE);
			layCatalisadorAlquimico.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM bioquimico WHERE _id = ?", new String[]{String.valueOf(id)});

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

			varPericiaComMachadoEEspada = cs.getInt(13);
			varPesquisaDePocoes = cs.getInt(14);
			varPrepararPocao = cs.getInt(15);
			varFogoGrego = cs.getInt(16);
			varTerrorAcido = cs.getInt(17);
			varArremessarPocao = cs.getInt(18);
			varCriarMonstroPlanta = cs.getInt(19);
			varCriarEsferaMarinha = cs.getInt(20);
			varRevestirArma = cs.getInt(21);
			varRevestirEscudo = cs.getInt(22);
			varRevestirArmadura = cs.getInt(23);
			varRevestirCapacete = cs.getInt(24);
			varCriarHomunculus = cs.getInt(25);
			varRessuscitarHomunculus = cs.getInt(26);
			varVaporizar = cs.getInt(27);

			varCultivarPlanta = cs.getInt(28);
			varBombaAcida = cs.getInt(29);
			varProtecaoQuimicaTotal = cs.getInt(30);
			varArremessarPocaoCompacta = cs.getInt(31);

			varFarmacologiaAvancada = cs.getInt(32);
			varCulinariaAvancada = cs.getInt(33);
			varCriarBombaOrganica = cs.getInt(34);
			varReacaoAlquimica = cs.getInt(35);
			varArremessarItem = cs.getInt(36);
			varPericiaEmEsgrima = cs.getInt(37);
			varAprimorarCarrinho = cs.getInt(38);
			varPropulsaoDoCarrinho = cs.getInt(39);
			varCanhaoDeProtons = cs.getInt(40);
			varTornadoDeCarrinho = cs.getInt(41);
			varArmadilhaDeEspinhos = cs.getInt(42);
			varMuralhaDeEspinhos = cs.getInt(43);
			varPlantaInfernal = cs.getInt(44);
			varPlantaSanguessuga = cs.getInt(45);
			varEsporoExplosivo = cs.getInt(46);
			varGritoDaMandragora = cs.getInt(47);
			varErvaDaninha = cs.getInt(48);
			varBombaNapalm = cs.getInt(49);
			varCatalisadorAlquimico = cs.getInt(50);

			skillPrimeira = cs.getInt(51);
			skillSegunda = cs.getInt(52);
			skillTrans = cs.getInt(53);
			skillTerceira = cs.getInt(54);
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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS bioquimico (");
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
					sqlClasse.append("skill_periciacommachadoeespada INT(2), ");
					sqlClasse.append("skill_pesquisadepocoes INT(2), ");
					sqlClasse.append("skill_prepararpocao INT(2), ");
					sqlClasse.append("skill_fogogrego INT(2), ");
					sqlClasse.append("skill_terroracido INT(2), ");
					sqlClasse.append("skill_arremessarpocao INT(2), ");
					sqlClasse.append("skill_criarmonstroplanta INT(2), ");
					sqlClasse.append("skill_criaresferamarinha INT(2), ");
					sqlClasse.append("skill_revestirarma INT(2), ");
					sqlClasse.append("skill_revestirescudo INT(2), ");
					sqlClasse.append("skill_revestirarmadura INT(2), ");
					sqlClasse.append("skill_revestircapacete INT(2), ");
					sqlClasse.append("skill_criarhomunculus INT(2), ");
					sqlClasse.append("skill_ressuscitarhomunculus INT(2), ");
					sqlClasse.append("skill_vaporizar INT(2), ");
					sqlClasse.append("skill_cultivarplanta INT(2), ");
					sqlClasse.append("skill_bombaacida INT(2), ");
					sqlClasse.append("skill_protecaoquimicatotal INT(2), ");
					sqlClasse.append("skill_arremessarpocaocompacta INT(2), ");
					sqlClasse.append("skill_farmacologiaavancada INT(2), ");
					sqlClasse.append("skill_culinariaavancada INT(2), ");
					sqlClasse.append("skill_criarbombaorganica INT(2), ");
					sqlClasse.append("skill_reacaoalquimica INT(2), ");
					sqlClasse.append("skill_arremessaritem INT(2), ");
					sqlClasse.append("skill_periciaemesgrima INT(2), ");
					sqlClasse.append("skill_aprimorarcarrinho INT(2), ");
					sqlClasse.append("skill_propulsaodocarrinho INT(2), ");
					sqlClasse.append("skill_canhaodeprotons INT(2), ");
					sqlClasse.append("skill_tornadodecarrinho INT(2), ");
					sqlClasse.append("skill_armadilhadeespinhos INT(2), ");
					sqlClasse.append("skill_muralhadeespinhos INT(2), ");
					sqlClasse.append("skill_plantainfernal INT(2), ");
					sqlClasse.append("skill_plantasanguessuga INT(2), ");
					sqlClasse.append("skill_esporoexplosivo INT(2), ");
					sqlClasse.append("skill_gritodamandragora INT(2), ");
					sqlClasse.append("skill_ervadaninha INT(2), ");
					sqlClasse.append("skill_bombanapalm INT(2), ");
					sqlClasse.append("skill_catalisadoralquimico INT(2), ");
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
					ins.put("skill_periciacommachadoeespada", varPericiaComMachadoEEspada);
					ins.put("skill_pesquisadepocoes", varPesquisaDePocoes);
					ins.put("skill_prepararpocao", varPrepararPocao);
					ins.put("skill_fogogrego", varFogoGrego);
					ins.put("skill_terroracido", varTerrorAcido);
					ins.put("skill_arremessarpocao", varArremessarPocao);
					ins.put("skill_criarmonstroplanta", varCriarMonstroPlanta);
					ins.put("skill_criaresferamarinha", varCriarEsferaMarinha);
					ins.put("skill_revestirarma", varRevestirArma);
					ins.put("skill_revestirescudo", varRevestirEscudo);
					ins.put("skill_revestirarmadura", varRevestirArmadura);
					ins.put("skill_revestircapacete", varRevestirCapacete);
					ins.put("skill_criarhomunculus", varCriarHomunculus);
					ins.put("skill_ressuscitarhomunculus", varRessuscitarHomunculus);
					ins.put("skill_vaporizar", varVaporizar);
					ins.put("skill_cultivarplanta", varCultivarPlanta);
					ins.put("skill_bombaacida", varBombaAcida);
					ins.put("skill_protecaoquimicatotal", varProtecaoQuimicaTotal);
					ins.put("skill_arremessarpocaocompacta", varArremessarPocaoCompacta);
					ins.put("skill_farmacologiaavancada", varFarmacologiaAvancada);
					ins.put("skill_culinariaavancada", varCulinariaAvancada);
					ins.put("skill_criarbombaorganica", varCriarBombaOrganica);
					ins.put("skill_reacaoalquimica", varReacaoAlquimica);
					ins.put("skill_arremessaritem", varArremessarItem);
					ins.put("skill_periciaemesgrima", varPericiaEmEsgrima);
					ins.put("skill_aprimorarcarrinho", varAprimorarCarrinho);
					ins.put("skill_propulsaodocarrinho", varPropulsaoDoCarrinho);
					ins.put("skill_canhaodeprotons", varCanhaoDeProtons);
					ins.put("skill_tornadodecarrinho", varTornadoDeCarrinho);
					ins.put("skill_armadilhadeespinhos", varArmadilhaDeEspinhos);
					ins.put("skill_muralhadeespinhos", varMuralhaDeEspinhos);
					ins.put("skill_plantainfernal", varPlantaInfernal);
					ins.put("skill_plantasanguessuga", varPlantaSanguessuga);
					ins.put("skill_esporoexplosivo", varEsporoExplosivo);
					ins.put("skill_gritodamandragora", varGritoDaMandragora);
					ins.put("skill_ervadaninha", varErvaDaninha);
					ins.put("skill_bombanapalm", varBombaNapalm);
					ins.put("skill_catalisadoralquimico", varCatalisadorAlquimico);
					ins.put("skill_primeira", skillPrimeira);
					ins.put("skill_segunda", skillSegunda);
					ins.put("skill_trans", skillTrans);
					ins.put("skill_terceira", skillTerceira);
					if(!novo){
						try {
							db.update("bioquimico", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("bioquimico", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from bioquimico", null);
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
						ins2.put("classe", "bioquimico");
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