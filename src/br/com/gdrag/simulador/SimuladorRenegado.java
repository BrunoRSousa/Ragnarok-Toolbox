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

public class SimuladorRenegado extends Activity {

		//Botões de interrogação
		Button btEnvenenarInterrogacao,
		btDesintoxicarInterrogacao,
		btAtaqueDuploInterrogacao,
		btPericiaEmEsquivaInterrogacao,
		btFurtoInterrogacao,
		btEsconderijoInterrogacao,
		btRecuarInterrogacao,
		btChutarAreiaInterrogacao,
		btProcurarPedrasInterrogacao,
		btArremessarPedraInterrogacao,
		btApunhalarInterrogacao,
		btRemoverArmaduraInterrogacao,
		btRemoverCapaceteInterrogacao,
		btRemoverEscudoInterrogacao,
		btRemoverArmaInterrogacao,
		btRajadaDeFlechasInterrogacao,
		btMaosLevesInterrogacao,
		btExtorquirInterrogacao,
		btPlagioInterrogacao,
		btAfanarInterrogacao,
		btPicharInterrogacao,
		btRemoverArmadilhaInterrogacao,
		btFaxinaInterrogacao,
		btGrafittiInterrogacao,
		btAtaqueSurpresaInterrogacao,
		btMalandragemInterrogacao,
		btRaptoInterrogacao,
		btTunelDeFugaInterrogacao,
		btPericiaComEspadaInterrogacao,
		btOlhosDeAguiaInterrogacao,
		btConfinamentoInterrogacao,
		btInstintoDeDefesaInterrogacao,
		btRemocaoTotalInterrogacao,
		btEspreitarInterrogacao,
		btPreservarInterrogacao,
		btSedeDeSangueInterrogacao,
		btBorrifarTintaInterrogacao,
		btSimboloDoCaosInterrogacao,
		btPestilenciaInterrogacao,
		btPortaDimensionalInterrogacao,
		btRemoverAcessorioInterrogacao,
		btAcertoDeContasInterrogacao,
		btCopiaExplosivaInterrogacao,
		btFormaEtereaInterrogacao,
		btRedemoinhoDeAbsorcaoInterrogacao,
		btPintarArmadilhaInterrogacao,
		btMascaraDaFraquezaInterrogacao,
		btMascaraDaMelancoliaInterrogacao,
		btMascaraDaToliceInterrogacao,
		btMascaraDaOciosidadeInterrogacao,
		btMascaraDaVulnerabilidadeInterrogacao,
		btMascaraDoInfortunioInterrogacao,
		btMimetismoInterrogacao,
		btVinculoSombrioInterrogacao,
		btDesejoDasSombrasInterrogacao,
		btDisparoTriploInterrogacao;

		//Botões de diminuir habilidades
		Button btEnvenenarDiminuir,
		btDesintoxicarDiminuir,
		btAtaqueDuploDiminuir,
		btPericiaEmEsquivaDiminuir,
		btFurtoDiminuir,
		btEsconderijoDiminuir,
		btApunhalarDiminuir,
		btRemoverArmaduraDiminuir,
		btRemoverCapaceteDiminuir,
		btRemoverEscudoDiminuir,
		btRemoverArmaDiminuir,
		btRajadaDeFlechasDiminuir,
		btMaosLevesDiminuir,
		btExtorquirDiminuir,
		btPlagioDiminuir,
		btAfanarDiminuir,
		btPicharDiminuir,
		btRemoverArmadilhaDiminuir,
		btFaxinaDiminuir,
		btGrafittiDiminuir,
		btAtaqueSurpresaDiminuir,
		btMalandragemDiminuir,
		btRaptoDiminuir,
		btTunelDeFugaDiminuir,
		btPericiaComEspadaDiminuir,
		btOlhosDeAguiaDiminuir,
		btInstintoDeDefesaDiminuir,
		btRemocaoTotalDiminuir,
		btEspreitarDiminuir,
		btPreservarDiminuir,
		btSedeDeSangueDiminuir,
		btBorrifarTintaDiminuir,
		btSimboloDoCaosDiminuir,
		btPestilenciaDiminuir,
		btPortaDimensionalDiminuir,
		btRemoverAcessorioDiminuir,
		btAcertoDeContasDiminuir,
		btCopiaExplosivaDiminuir,
		btFormaEtereaDiminuir,
		btRedemoinhoDeAbsorcaoDiminuir,
		btPintarArmadilhaDiminuir,
		btMascaraDaFraquezaDiminuir,
		btMascaraDaMelancoliaDiminuir,
		btMascaraDaToliceDiminuir,
		btMascaraDaOciosidadeDiminuir,
		btMascaraDaVulnerabilidadeDiminuir,
		btMascaraDoInfortunioDiminuir,
		btMimetismoDiminuir,
		btVinculoSombrioDiminuir,
		btDesejoDasSombrasDiminuir,
		btDisparoTriploDiminuir;

		//Botões de aumentar habilidades
		Button btEnvenenarAumentar,
		btDesintoxicarAumentar,
		btAtaqueDuploAumentar,
		btPericiaEmEsquivaAumentar,
		btFurtoAumentar,
		btEsconderijoAumentar,
		btApunhalarAumentar,
		btRemoverArmaduraAumentar,
		btRemoverCapaceteAumentar,
		btRemoverEscudoAumentar,
		btRemoverArmaAumentar,
		btRajadaDeFlechasAumentar,
		btMaosLevesAumentar,
		btExtorquirAumentar,
		btPlagioAumentar,
		btAfanarAumentar,
		btPicharAumentar,
		btRemoverArmadilhaAumentar,
		btFaxinaAumentar,
		btGrafittiAumentar,
		btAtaqueSurpresaAumentar,
		btMalandragemAumentar,
		btRaptoAumentar,
		btTunelDeFugaAumentar,
		btPericiaComEspadaAumentar,
		btOlhosDeAguiaAumentar,
		btInstintoDeDefesaAumentar,
		btRemocaoTotalAumentar,
		btEspreitarAumentar,
		btPreservarAumentar,
		btSedeDeSangueAumentar,
		btBorrifarTintaAumentar,
		btSimboloDoCaosAumentar,
		btPestilenciaAumentar,
		btPortaDimensionalAumentar,
		btRemoverAcessorioAumentar,
		btAcertoDeContasAumentar,
		btCopiaExplosivaAumentar,
		btFormaEtereaAumentar,
		btRedemoinhoDeAbsorcaoAumentar,
		btPintarArmadilhaAumentar,
		btMascaraDaFraquezaAumentar,
		btMascaraDaMelancoliaAumentar,
		btMascaraDaToliceAumentar,
		btMascaraDaOciosidadeAumentar,
		btMascaraDaVulnerabilidadeAumentar,
		btMascaraDoInfortunioAumentar,
		btMimetismoAumentar,
		btVinculoSombrioAumentar,
		btDesejoDasSombrasAumentar,
		btDisparoTriploAumentar;

		//Resto dos botões
		Button btResetar, btSalvar;
		ToggleButton tgbtSomenteHabilidadeAprendida;


		//Txt pontos da tela
		TextView txtEnvenenarPontos,
		txtDesintoxicarPontos,
		txtAtaqueDuploPontos,
		txtPericiaEmEsquivaPontos,
		txtFurtoPontos,
		txtEsconderijoPontos,
		txtApunhalarPontos,
		txtRemoverArmaduraPontos,
		txtRemoverCapacetePontos,
		txtRemoverEscudoPontos,
		txtRemoverArmaPontos,
		txtRajadaDeFlechasPontos,
		txtMaosLevesPontos,
		txtExtorquirPontos,
		txtPlagioPontos,
		txtAfanarPontos,
		txtPicharPontos,
		txtRemoverArmadilhaPontos,
		txtFaxinaPontos,
		txtGrafittiPontos,
		txtAtaqueSurpresaPontos,
		txtMalandragemPontos,
		txtRaptoPontos,
		txtTunelDeFugaPontos,
		txtPericiaComEspadaPontos,
		txtOlhosDeAguiaPontos,
		txtInstintoDeDefesaPontos,
		txtRemocaoTotalPontos,
		txtEspreitarPontos,
		txtPreservarPontos,
		txtSedeDeSanguePontos,
		txtBorrifarTintaPontos,
		txtSimboloDoCaosPontos,
		txtPestilenciaPontos,
		txtPortaDimensionalPontos,
		txtRemoverAcessorioPontos,
		txtAcertoDeContasPontos,
		txtCopiaExplosivaPontos,
		txtFormaEtereaPontos,
		txtRedemoinhoDeAbsorcaoPontos,
		txtPintarArmadilhaPontos,
		txtMascaraDaFraquezaPontos,
		txtMascaraDaMelancoliaPontos,
		txtMascaraDaTolicePontos,
		txtMascaraDaOciosidadePontos,
		txtMascaraDaVulnerabilidadePontos,
		txtMascaraDoInfortunioPontos,
		txtMimetismoPontos,
		txtVinculoSombrioPontos,
		txtDesejoDasSombrasPontos,
		txtDisparoTriploPontos;

		//Txt pontos restantes
		TextView txtClasse1, txtClasse2, txtTransClasse, txtClasse3;

		//Layouts
		LinearLayout layEnvenenar,
		layDesintoxicar,
		layAtaqueDuplo,
		layPericiaEmEsquiva,
		layFurto,
		layEsconderijo,
		layApunhalar,
		layRemoverArmadura,
		layRemoverCapacete,
		layRemoverEscudo,
		layRemoverArma,
		layRajadaDeFlechas,
		layMaosLeves,
		layExtorquir,
		layPlagio,
		layAfanar,
		layPichar,
		layRemoverArmadilha,
		layFaxina,
		layGrafitti,
		layAtaqueSurpresa,
		layMalandragem,
		layRapto,
		layTunelDeFuga,
		layPericiaComEspada,
		layOlhosDeAguia,
		layInstintoDeDefesa,
		layRemocaoTotal,
		layEspreitar,
		layPreservar,
		laySedeDeSangue,
		layBorrifarTinta,
		laySimboloDoCaos,
		layPestilencia,
		layPortaDimensional,
		layRemoverAcessorio,
		layAcertoDeContas,
		layCopiaExplosiva,
		layFormaEterea,
		layRedemoinhoDeAbsorcao,
		layPintarArmadilha,
		layMascaraDaFraqueza,
		layMascaraDaMelancolia,
		layMascaraDaTolice,
		layMascaraDaOciosidade,
		layMascaraDaVulnerabilidade,
		layMascaraDoInfortunio,
		layMimetismo,
		layVinculoSombrio,
		layDesejoDasSombras,
		layDisparoTriplo;

		//Variaveis de Skill
		int varEnvenenar,
		varDesintoxicar,
		varAtaqueDuplo,
		varPericiaEmEsquiva,
		varFurto,
		varEsconderijo,
		varApunhalar,
		varRemoverArmadura,
		varRemoverCapacete,
		varRemoverEscudo,
		varRemoverArma,
		varRajadaDeFlechas,
		varMaosLeves,
		varExtorquir,
		varPlagio,
		varAfanar,
		varPichar,
		varRemoverArmadilha,
		varFaxina,
		varGrafitti,
		varAtaqueSurpresa,
		varMalandragem,
		varRapto,
		varTunelDeFuga,
		varPericiaComEspada,
		varOlhosDeAguia,
		varInstintoDeDefesa,
		varRemocaoTotal,
		varEspreitar,
		varPreservar,
		varSedeDeSangue,
		varBorrifarTinta,
		varSimboloDoCaos,
		varPestilencia,
		varPortaDimensional,
		varRemoverAcessorio,
		varAcertoDeContas,
		varCopiaExplosiva,
		varFormaEterea,
		varRedemoinhoDeAbsorcao,
		varPintarArmadilha,
		varMascaraDaFraqueza,
		varMascaraDaMelancolia,
		varMascaraDaTolice,
		varMascaraDaOciosidade,
		varMascaraDaVulnerabilidade,
		varMascaraDoInfortunio,
		varMimetismo,
		varVinculoSombrio,
		varDesejoDasSombras,
		varDisparoTriplo;

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
			setContentView(R.layout.activity_simulador_renegado);

			Intent it = getIntent();

			final int id = it.getIntExtra("id", 0);
			idParaAlterar = "_id =" +id;

			//inicialização de variáveis
			varEnvenenar = 0;
			varDesintoxicar = 0;
			varAtaqueDuplo = 0;
			varPericiaEmEsquiva = 0;
			varFurto = 0;
			varEsconderijo = 0;
			varApunhalar = 0;
			varRemoverArmadura = 0;
			varRemoverCapacete = 0;
			varRemoverEscudo = 0;
			varRemoverArma = 0;
			varRajadaDeFlechas = 0;
			varMaosLeves = 0;
			varExtorquir = 0;
			varPlagio = 0;
			varAfanar = 0;
			varPichar = 0;
			varRemoverArmadilha = 0;
			varFaxina = 0;
			varGrafitti = 0;
			varAtaqueSurpresa = 0;
			varMalandragem = 0;
			varRapto = 0;
			varTunelDeFuga = 0;
			varPericiaComEspada = 0;
			varOlhosDeAguia = 0;
			varInstintoDeDefesa = 0;
			varRemocaoTotal = 0;
			varEspreitar = 0;
			varPreservar = 0;
			varSedeDeSangue = 0;
			varBorrifarTinta = 0;
			varSimboloDoCaos = 0;
			varPestilencia = 0;
			varPortaDimensional = 0;
			varRemoverAcessorio = 0;
			varAcertoDeContas = 0;
			varCopiaExplosiva = 0;
			varFormaEterea = 0;
			varRedemoinhoDeAbsorcao = 0;
			varPintarArmadilha = 0;
			varMascaraDaFraqueza = 0;
			varMascaraDaMelancolia = 0;
			varMascaraDaTolice = 0;
			varMascaraDaOciosidade = 0;
			varMascaraDaVulnerabilidade = 0;
			varMascaraDoInfortunio = 0;
			varMimetismo = 0;
			varVinculoSombrio = 0;
			varDesejoDasSombras = 0;
			varDisparoTriplo = 0;



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
			btEnvenenarInterrogacao = (Button) findViewById(R.id.btEnvenenarInterrogacao);
			btDesintoxicarInterrogacao = (Button) findViewById(R.id.btDesintoxicarInterrogacao);
			btAtaqueDuploInterrogacao = (Button) findViewById(R.id.btAtaqueDuploInterrogacao);
			btPericiaEmEsquivaInterrogacao = (Button) findViewById(R.id.btPericiaEmEsquivaInterrogacao);
			btFurtoInterrogacao = (Button) findViewById(R.id.btFurtoInterrogacao);
			btEsconderijoInterrogacao = (Button) findViewById(R.id.btEsconderijoInterrogacao);
			btRecuarInterrogacao = (Button) findViewById(R.id.btRecuarInterrogacao);
			btChutarAreiaInterrogacao = (Button) findViewById(R.id.btChutarAreiaInterrogacao);
			btProcurarPedrasInterrogacao = (Button) findViewById(R.id.btProcurarPedrasInterrogacao);
			btArremessarPedraInterrogacao = (Button) findViewById(R.id.btArremessarPedraInterrogacao);
			btApunhalarInterrogacao = (Button) findViewById(R.id.btApunhalarInterrogacao);
			btRemoverArmaduraInterrogacao = (Button) findViewById(R.id.btRemoverArmaduraInterrogacao);
			btRemoverCapaceteInterrogacao = (Button) findViewById(R.id.btRemoverCapaceteInterrogacao);
			btRemoverEscudoInterrogacao = (Button) findViewById(R.id.btRemoverEscudoInterrogacao);
			btRemoverArmaInterrogacao = (Button) findViewById(R.id.btRemoverArmaInterrogacao);
			btRajadaDeFlechasInterrogacao = (Button) findViewById(R.id.btRajadaDeFlechasInterrogacao);
			btMaosLevesInterrogacao = (Button) findViewById(R.id.btMaosLevesInterrogacao);
			btExtorquirInterrogacao = (Button) findViewById(R.id.btExtorquirInterrogacao);
			btPlagioInterrogacao = (Button) findViewById(R.id.btPlagioInterrogacao);
			btAfanarInterrogacao = (Button) findViewById(R.id.btAfanarInterrogacao);
			btPicharInterrogacao = (Button) findViewById(R.id.btPicharInterrogacao);
			btRemoverArmadilhaInterrogacao = (Button) findViewById(R.id.btRemoverArmadilhaInterrogacao);
			btFaxinaInterrogacao = (Button) findViewById(R.id.btFaxinaInterrogacao);
			btGrafittiInterrogacao = (Button) findViewById(R.id.btGrafittiInterrogacao);
			btAtaqueSurpresaInterrogacao = (Button) findViewById(R.id.btAtaqueSurpresaInterrogacao);
			btMalandragemInterrogacao = (Button) findViewById(R.id.btMalandragemInterrogacao);
			btRaptoInterrogacao = (Button) findViewById(R.id.btRaptoInterrogacao);
			btTunelDeFugaInterrogacao = (Button) findViewById(R.id.btTunelDeFugaInterrogacao);
			btPericiaComEspadaInterrogacao = (Button) findViewById(R.id.btPericiaComEspadaInterrogacao);
			btOlhosDeAguiaInterrogacao = (Button) findViewById(R.id.btOlhosDeAguiaInterrogacao);
			btConfinamentoInterrogacao = (Button) findViewById(R.id.btConfinamentoInterrogacao);
			btInstintoDeDefesaInterrogacao = (Button) findViewById(R.id.btInstintoDeDefesaInterrogacao);
			btRemocaoTotalInterrogacao = (Button) findViewById(R.id.btRemocaoTotalInterrogacao);
			btEspreitarInterrogacao = (Button) findViewById(R.id.btEspreitarInterrogacao);
			btPreservarInterrogacao = (Button) findViewById(R.id.btPreservarInterrogacao);
			btSedeDeSangueInterrogacao = (Button) findViewById(R.id.btSedeDeSangueInterrogacao);
			btBorrifarTintaInterrogacao = (Button) findViewById(R.id.btBorrifarTintaInterrogacao);
			btSimboloDoCaosInterrogacao = (Button) findViewById(R.id.btSimboloDoCaosInterrogacao);
			btPestilenciaInterrogacao = (Button) findViewById(R.id.btPestilenciaInterrogacao);
			btPortaDimensionalInterrogacao = (Button) findViewById(R.id.btPortaDimensionalInterrogacao);
			btRemoverAcessorioInterrogacao = (Button) findViewById(R.id.btRemoverAcessorioInterrogacao);
			btAcertoDeContasInterrogacao = (Button) findViewById(R.id.btAcertoDeContasInterrogacao);
			btCopiaExplosivaInterrogacao = (Button) findViewById(R.id.btCopiaExplosivaInterrogacao);
			btFormaEtereaInterrogacao = (Button) findViewById(R.id.btFormaEtereaInterrogacao);
			btRedemoinhoDeAbsorcaoInterrogacao = (Button) findViewById(R.id.btRedemoinhoDeAbsorcaoInterrogacao);
			btPintarArmadilhaInterrogacao = (Button) findViewById(R.id.btPintarArmadilhaInterrogacao);
			btMascaraDaFraquezaInterrogacao = (Button) findViewById(R.id.btMascaraDaFraquezaInterrogacao);
			btMascaraDaMelancoliaInterrogacao = (Button) findViewById(R.id.btMascaraDaMelancoliaInterrogacao);
			btMascaraDaToliceInterrogacao = (Button) findViewById(R.id.btMascaraDaToliceInterrogacao);
			btMascaraDaOciosidadeInterrogacao = (Button) findViewById(R.id.btMascaraDaOciosidadeInterrogacao);
			btMascaraDaVulnerabilidadeInterrogacao = (Button) findViewById(R.id.btMascaraDaVulnerabilidadeInterrogacao);
			btMascaraDoInfortunioInterrogacao = (Button) findViewById(R.id.btMascaraDoInfortunioInterrogacao);
			btMimetismoInterrogacao = (Button) findViewById(R.id.btMimetismoInterrogacao);
			btVinculoSombrioInterrogacao = (Button) findViewById(R.id.btVinculoSombrioInterrogacao);
			btDesejoDasSombrasInterrogacao = (Button) findViewById(R.id.btDesejoDasSombrasInterrogacao);
			btDisparoTriploInterrogacao = (Button) findViewById(R.id.btDisparoTriploInterrogacao);

			//Botões de diminuir habilidades
			btEnvenenarDiminuir = (Button) findViewById(R.id.btEnvenenarDiminuir);
			btDesintoxicarDiminuir = (Button) findViewById(R.id.btDesintoxicarDiminuir);
			btAtaqueDuploDiminuir = (Button) findViewById(R.id.btAtaqueDuploDiminuir);
			btPericiaEmEsquivaDiminuir = (Button) findViewById(R.id.btPericiaEmEsquivaDiminuir);
			btFurtoDiminuir = (Button) findViewById(R.id.btFurtoDiminuir);
			btEsconderijoDiminuir = (Button) findViewById(R.id.btEsconderijoDiminuir);
			btApunhalarDiminuir = (Button) findViewById(R.id.btApunhalarDiminuir);
			btRemoverArmaduraDiminuir = (Button) findViewById(R.id.btRemoverArmaduraDiminuir);
			btRemoverCapaceteDiminuir = (Button) findViewById(R.id.btRemoverCapaceteDiminuir);
			btRemoverEscudoDiminuir = (Button) findViewById(R.id.btRemoverEscudoDiminuir);
			btRemoverArmaDiminuir = (Button) findViewById(R.id.btRemoverArmaDiminuir);
			btRajadaDeFlechasDiminuir = (Button) findViewById(R.id.btRajadaDeFlechasDiminuir);
			btMaosLevesDiminuir = (Button) findViewById(R.id.btMaosLevesDiminuir);
			btExtorquirDiminuir = (Button) findViewById(R.id.btExtorquirDiminuir);
			btPlagioDiminuir = (Button) findViewById(R.id.btPlagioDiminuir);
			btAfanarDiminuir = (Button) findViewById(R.id.btAfanarDiminuir);
			btPicharDiminuir = (Button) findViewById(R.id.btPicharDiminuir);
			btRemoverArmadilhaDiminuir = (Button) findViewById(R.id.btRemoverArmadilhaDiminuir);
			btFaxinaDiminuir = (Button) findViewById(R.id.btFaxinaDiminuir);
			btGrafittiDiminuir = (Button) findViewById(R.id.btGrafittiDiminuir);
			btAtaqueSurpresaDiminuir = (Button) findViewById(R.id.btAtaqueSurpresaDiminuir);
			btMalandragemDiminuir = (Button) findViewById(R.id.btMalandragemDiminuir);
			btRaptoDiminuir = (Button) findViewById(R.id.btRaptoDiminuir);
			btTunelDeFugaDiminuir = (Button) findViewById(R.id.btTunelDeFugaDiminuir);
			btPericiaComEspadaDiminuir = (Button) findViewById(R.id.btPericiaComEspadaDiminuir);
			btOlhosDeAguiaDiminuir = (Button) findViewById(R.id.btOlhosDeAguiaDiminuir);
			btInstintoDeDefesaDiminuir = (Button) findViewById(R.id.btInstintoDeDefesaDiminuir);
			btRemocaoTotalDiminuir = (Button) findViewById(R.id.btRemocaoTotalDiminuir);
			btEspreitarDiminuir = (Button) findViewById(R.id.btEspreitarDiminuir);
			btPreservarDiminuir = (Button) findViewById(R.id.btPreservarDiminuir);
			btSedeDeSangueDiminuir = (Button) findViewById(R.id.btSedeDeSangueDiminuir);
			btBorrifarTintaDiminuir = (Button) findViewById(R.id.btBorrifarTintaDiminuir);
			btSimboloDoCaosDiminuir = (Button) findViewById(R.id.btSimboloDoCaosDiminuir);
			btPestilenciaDiminuir = (Button) findViewById(R.id.btPestilenciaDiminuir);
			btPortaDimensionalDiminuir = (Button) findViewById(R.id.btPortaDimensionalDiminuir);
			btRemoverAcessorioDiminuir = (Button) findViewById(R.id.btRemoverAcessorioDiminuir);
			btAcertoDeContasDiminuir = (Button) findViewById(R.id.btAcertoDeContasDiminuir);
			btCopiaExplosivaDiminuir = (Button) findViewById(R.id.btCopiaExplosivaDiminuir);
			btFormaEtereaDiminuir = (Button) findViewById(R.id.btFormaEtereaDiminuir);
			btRedemoinhoDeAbsorcaoDiminuir = (Button) findViewById(R.id.btRedemoinhoDeAbsorcaoDiminuir);
			btPintarArmadilhaDiminuir = (Button) findViewById(R.id.btPintarArmadilhaDiminuir);
			btMascaraDaFraquezaDiminuir = (Button) findViewById(R.id.btMascaraDaFraquezaDiminuir);
			btMascaraDaMelancoliaDiminuir = (Button) findViewById(R.id.btMascaraDaMelancoliaDiminuir);
			btMascaraDaToliceDiminuir = (Button) findViewById(R.id.btMascaraDaToliceDiminuir);
			btMascaraDaOciosidadeDiminuir = (Button) findViewById(R.id.btMascaraDaOciosidadeDiminuir);
			btMascaraDaVulnerabilidadeDiminuir = (Button) findViewById(R.id.btMascaraDaVulnerabilidadeDiminuir);
			btMascaraDoInfortunioDiminuir = (Button) findViewById(R.id.btMascaraDoInfortunioDiminuir);
			btMimetismoDiminuir = (Button) findViewById(R.id.btMimetismoDiminuir);
			btVinculoSombrioDiminuir = (Button) findViewById(R.id.btVinculoSombrioDiminuir);
			btDesejoDasSombrasDiminuir = (Button) findViewById(R.id.btDesejoDasSombrasDiminuir);
			btDisparoTriploDiminuir = (Button) findViewById(R.id.btDisparoTriploDiminuir);

			//Botões de aumentar habilidades
			btEnvenenarAumentar = (Button) findViewById(R.id.btEnvenenarAumentar);
			btDesintoxicarAumentar = (Button) findViewById(R.id.btDesintoxicarAumentar);
			btAtaqueDuploAumentar = (Button) findViewById(R.id.btAtaqueDuploAumentar);
			btPericiaEmEsquivaAumentar = (Button) findViewById(R.id.btPericiaEmEsquivaAumentar);
			btFurtoAumentar = (Button) findViewById(R.id.btFurtoAumentar);
			btEsconderijoAumentar = (Button) findViewById(R.id.btEsconderijoAumentar);
			btApunhalarAumentar = (Button) findViewById(R.id.btApunhalarAumentar);
			btRemoverArmaduraAumentar = (Button) findViewById(R.id.btRemoverArmaduraAumentar);
			btRemoverCapaceteAumentar = (Button) findViewById(R.id.btRemoverCapaceteAumentar);
			btRemoverEscudoAumentar = (Button) findViewById(R.id.btRemoverEscudoAumentar);
			btRemoverArmaAumentar = (Button) findViewById(R.id.btRemoverArmaAumentar);
			btRajadaDeFlechasAumentar = (Button) findViewById(R.id.btRajadaDeFlechasAumentar);
			btMaosLevesAumentar = (Button) findViewById(R.id.btMaosLevesAumentar);
			btExtorquirAumentar = (Button) findViewById(R.id.btExtorquirAumentar);
			btPlagioAumentar = (Button) findViewById(R.id.btPlagioAumentar);
			btAfanarAumentar = (Button) findViewById(R.id.btAfanarAumentar);
			btPicharAumentar = (Button) findViewById(R.id.btPicharAumentar);
			btRemoverArmadilhaAumentar = (Button) findViewById(R.id.btRemoverArmadilhaAumentar);
			btFaxinaAumentar = (Button) findViewById(R.id.btFaxinaAumentar);
			btGrafittiAumentar = (Button) findViewById(R.id.btGrafittiAumentar);
			btAtaqueSurpresaAumentar = (Button) findViewById(R.id.btAtaqueSurpresaAumentar);
			btMalandragemAumentar = (Button) findViewById(R.id.btMalandragemAumentar);
			btRaptoAumentar = (Button) findViewById(R.id.btRaptoAumentar);
			btTunelDeFugaAumentar = (Button) findViewById(R.id.btTunelDeFugaAumentar);
			btPericiaComEspadaAumentar = (Button) findViewById(R.id.btPericiaComEspadaAumentar);
			btOlhosDeAguiaAumentar = (Button) findViewById(R.id.btOlhosDeAguiaAumentar);
			btInstintoDeDefesaAumentar = (Button) findViewById(R.id.btInstintoDeDefesaAumentar);
			btRemocaoTotalAumentar = (Button) findViewById(R.id.btRemocaoTotalAumentar);
			btEspreitarAumentar = (Button) findViewById(R.id.btEspreitarAumentar);
			btPreservarAumentar = (Button) findViewById(R.id.btPreservarAumentar);
			btSedeDeSangueAumentar = (Button) findViewById(R.id.btSedeDeSangueAumentar);
			btBorrifarTintaAumentar = (Button) findViewById(R.id.btBorrifarTintaAumentar);
			btSimboloDoCaosAumentar = (Button) findViewById(R.id.btSimboloDoCaosAumentar);
			btPestilenciaAumentar = (Button) findViewById(R.id.btPestilenciaAumentar);
			btPortaDimensionalAumentar = (Button) findViewById(R.id.btPortaDimensionalAumentar);
			btRemoverAcessorioAumentar = (Button) findViewById(R.id.btRemoverAcessorioAumentar);
			btAcertoDeContasAumentar = (Button) findViewById(R.id.btAcertoDeContasAumentar);
			btCopiaExplosivaAumentar = (Button) findViewById(R.id.btCopiaExplosivaAumentar);
			btFormaEtereaAumentar = (Button) findViewById(R.id.btFormaEtereaAumentar);
			btRedemoinhoDeAbsorcaoAumentar = (Button) findViewById(R.id.btRedemoinhoDeAbsorcaoAumentar);
			btPintarArmadilhaAumentar = (Button) findViewById(R.id.btPintarArmadilhaAumentar);
			btMascaraDaFraquezaAumentar = (Button) findViewById(R.id.btMascaraDaFraquezaAumentar);
			btMascaraDaMelancoliaAumentar = (Button) findViewById(R.id.btMascaraDaMelancoliaAumentar);
			btMascaraDaToliceAumentar = (Button) findViewById(R.id.btMascaraDaToliceAumentar);
			btMascaraDaOciosidadeAumentar = (Button) findViewById(R.id.btMascaraDaOciosidadeAumentar);
			btMascaraDaVulnerabilidadeAumentar = (Button) findViewById(R.id.btMascaraDaVulnerabilidadeAumentar);
			btMascaraDoInfortunioAumentar = (Button) findViewById(R.id.btMascaraDoInfortunioAumentar);
			btMimetismoAumentar = (Button) findViewById(R.id.btMimetismoAumentar);
			btVinculoSombrioAumentar = (Button) findViewById(R.id.btVinculoSombrioAumentar);
			btDesejoDasSombrasAumentar = (Button) findViewById(R.id.btDesejoDasSombrasAumentar);
			btDisparoTriploAumentar = (Button) findViewById(R.id.btDisparoTriploAumentar);

			//Resto dos botões
			btResetar = (Button) findViewById(R.id.btResetar);
			btSalvar = (Button) findViewById(R.id.btSalvar);
			tgbtSomenteHabilidadeAprendida = (ToggleButton) findViewById(R.id.tgbtSomenteHabilidadeAprendida);

			//Txt pontos da tela
			txtEnvenenarPontos = (TextView) findViewById(R.id.txtEnvenenarPontos);
			txtDesintoxicarPontos = (TextView) findViewById(R.id.txtDesintoxicarPontos);
			txtAtaqueDuploPontos = (TextView) findViewById(R.id.txtAtaqueDuploPontos);
			txtPericiaEmEsquivaPontos = (TextView) findViewById(R.id.txtPericiaEmEsquivaPontos);
			txtFurtoPontos = (TextView) findViewById(R.id.txtFurtoPontos);
			txtEsconderijoPontos = (TextView) findViewById(R.id.txtEsconderijoPontos);
			txtApunhalarPontos = (TextView) findViewById(R.id.txtApunhalarPontos);
			txtRemoverArmaduraPontos = (TextView) findViewById(R.id.txtRemoverArmaduraPontos);
			txtRemoverCapacetePontos = (TextView) findViewById(R.id.txtRemoverCapacetePontos);
			txtRemoverEscudoPontos = (TextView) findViewById(R.id.txtRemoverEscudoPontos);
			txtRemoverArmaPontos = (TextView) findViewById(R.id.txtRemoverArmaPontos);
			txtRajadaDeFlechasPontos = (TextView) findViewById(R.id.txtRajadaDeFlechasPontos);
			txtMaosLevesPontos = (TextView) findViewById(R.id.txtMaosLevesPontos);
			txtExtorquirPontos = (TextView) findViewById(R.id.txtExtorquirPontos);
			txtPlagioPontos = (TextView) findViewById(R.id.txtPlagioPontos);
			txtAfanarPontos = (TextView) findViewById(R.id.txtAfanarPontos);
			txtPicharPontos = (TextView) findViewById(R.id.txtPicharPontos);
			txtRemoverArmadilhaPontos = (TextView) findViewById(R.id.txtRemoverArmadilhaPontos);
			txtFaxinaPontos = (TextView) findViewById(R.id.txtFaxinaPontos);
			txtGrafittiPontos = (TextView) findViewById(R.id.txtGrafittiPontos);
			txtAtaqueSurpresaPontos = (TextView) findViewById(R.id.txtAtaqueSurpresaPontos);
			txtMalandragemPontos = (TextView) findViewById(R.id.txtMalandragemPontos);
			txtRaptoPontos = (TextView) findViewById(R.id.txtRaptoPontos);
			txtTunelDeFugaPontos = (TextView) findViewById(R.id.txtTunelDeFugaPontos);
			txtPericiaComEspadaPontos = (TextView) findViewById(R.id.txtPericiaComEspadaPontos);
			txtOlhosDeAguiaPontos = (TextView) findViewById(R.id.txtOlhosDeAguiaPontos);
			txtInstintoDeDefesaPontos = (TextView) findViewById(R.id.txtInstintoDeDefesaPontos);
			txtRemocaoTotalPontos = (TextView) findViewById(R.id.txtRemocaoTotalPontos);
			txtEspreitarPontos = (TextView) findViewById(R.id.txtEspreitarPontos);
			txtPreservarPontos = (TextView) findViewById(R.id.txtPreservarPontos);
			txtSedeDeSanguePontos = (TextView) findViewById(R.id.txtSedeDeSanguePontos);
			txtBorrifarTintaPontos = (TextView) findViewById(R.id.txtBorrifarTintaPontos);
			txtSimboloDoCaosPontos = (TextView) findViewById(R.id.txtSimboloDoCaosPontos);
			txtPestilenciaPontos = (TextView) findViewById(R.id.txtPestilenciaPontos);
			txtPortaDimensionalPontos = (TextView) findViewById(R.id.txtPortaDimensionalPontos);
			txtRemoverAcessorioPontos = (TextView) findViewById(R.id.txtRemoverAcessorioPontos);
			txtAcertoDeContasPontos = (TextView) findViewById(R.id.txtAcertoDeContasPontos);
			txtCopiaExplosivaPontos = (TextView) findViewById(R.id.txtCopiaExplosivaPontos);
			txtFormaEtereaPontos = (TextView) findViewById(R.id.txtFormaEtereaPontos);
			txtRedemoinhoDeAbsorcaoPontos = (TextView) findViewById(R.id.txtRedemoinhoDeAbsorcaoPontos);
			txtPintarArmadilhaPontos = (TextView) findViewById(R.id.txtPintarArmadilhaPontos);
			txtMascaraDaFraquezaPontos = (TextView) findViewById(R.id.txtMascaraDaFraquezaPontos);
			txtMascaraDaMelancoliaPontos = (TextView) findViewById(R.id.txtMascaraDaMelancoliaPontos);
			txtMascaraDaTolicePontos = (TextView) findViewById(R.id.txtMascaraDaTolicePontos);
			txtMascaraDaOciosidadePontos = (TextView) findViewById(R.id.txtMascaraDaOciosidadePontos);
			txtMascaraDaVulnerabilidadePontos = (TextView) findViewById(R.id.txtMascaraDaVulnerabilidadePontos);
			txtMascaraDoInfortunioPontos = (TextView) findViewById(R.id.txtMascaraDoInfortunioPontos);
			txtMimetismoPontos = (TextView) findViewById(R.id.txtMimetismoPontos);
			txtVinculoSombrioPontos = (TextView) findViewById(R.id.txtVinculoSombrioPontos);
			txtDesejoDasSombrasPontos = (TextView) findViewById(R.id.txtDesejoDasSombrasPontos);
			txtDisparoTriploPontos = (TextView) findViewById(R.id.txtDisparoTriploPontos);

			//Txt pontos restantes
			txtClasse1 = (TextView) findViewById(R.id.txtClasse1);
			txtClasse2 = (TextView) findViewById(R.id.txtClasse2);
			txtTransClasse = (TextView) findViewById(R.id.txtClasseTrans);
			txtClasse3 = (TextView) findViewById(R.id.txtClasse3);

			//Layouts
			layEnvenenar = (LinearLayout) findViewById(R.id.layEnvenenar);
			layDesintoxicar = (LinearLayout) findViewById(R.id.layDesintoxicar);
			layAtaqueDuplo = (LinearLayout) findViewById(R.id.layAtaqueDuplo);
			layPericiaEmEsquiva = (LinearLayout) findViewById(R.id.layPericiaEmEsquiva);
			layFurto = (LinearLayout) findViewById(R.id.layFurto);
			layEsconderijo = (LinearLayout) findViewById(R.id.layEsconderijo);
			layApunhalar = (LinearLayout) findViewById(R.id.layApunhalar);
			layRemoverArmadura = (LinearLayout) findViewById(R.id.layRemoverArmadura);
			layRemoverCapacete = (LinearLayout) findViewById(R.id.layRemoverCapacete);
			layRemoverEscudo = (LinearLayout) findViewById(R.id.layRemoverEscudo);
			layRemoverArma = (LinearLayout) findViewById(R.id.layRemoverArma);
			layRajadaDeFlechas = (LinearLayout) findViewById(R.id.layRajadaDeFlechas);
			layMaosLeves = (LinearLayout) findViewById(R.id.layMaosLeves);
			layExtorquir = (LinearLayout) findViewById(R.id.layExtorquir);
			layPlagio = (LinearLayout) findViewById(R.id.layPlagio);
			layAfanar = (LinearLayout) findViewById(R.id.layAfanar);
			layPichar = (LinearLayout) findViewById(R.id.layPichar);
			layRemoverArmadilha = (LinearLayout) findViewById(R.id.layRemoverArmadilha);
			layFaxina = (LinearLayout) findViewById(R.id.layFaxina);
			layGrafitti = (LinearLayout) findViewById(R.id.layGrafitti);
			layAtaqueSurpresa = (LinearLayout) findViewById(R.id.layAtaqueSurpresa);
			layMalandragem = (LinearLayout) findViewById(R.id.layMalandragem);
			layRapto = (LinearLayout) findViewById(R.id.layRapto);
			layTunelDeFuga = (LinearLayout) findViewById(R.id.layTunelDeFuga);
			layPericiaComEspada = (LinearLayout) findViewById(R.id.layPericiaComEspada);
			layOlhosDeAguia = (LinearLayout) findViewById(R.id.layOlhosDeAguia);
			layInstintoDeDefesa = (LinearLayout) findViewById(R.id.layInstintoDeDefesa);
			layRemocaoTotal = (LinearLayout) findViewById(R.id.layRemocaoTotal);
			layEspreitar = (LinearLayout) findViewById(R.id.layEspreitar);
			layPreservar = (LinearLayout) findViewById(R.id.layPreservar);
			laySedeDeSangue = (LinearLayout) findViewById(R.id.laySedeDeSangue);
			layBorrifarTinta = (LinearLayout) findViewById(R.id.layBorrifarTinta);
			laySimboloDoCaos = (LinearLayout) findViewById(R.id.laySimboloDoCaos);
			layPestilencia = (LinearLayout) findViewById(R.id.layPestilencia);
			layPortaDimensional = (LinearLayout) findViewById(R.id.layPortaDimensional);
			layRemoverAcessorio = (LinearLayout) findViewById(R.id.layRemoverAcessorio);
			layAcertoDeContas = (LinearLayout) findViewById(R.id.layAcertoDeContas);
			layCopiaExplosiva = (LinearLayout) findViewById(R.id.layCopiaExplosiva);
			layFormaEterea = (LinearLayout) findViewById(R.id.layFormaEterea);
			layRedemoinhoDeAbsorcao = (LinearLayout) findViewById(R.id.layRedemoinhoDeAbsorcao);
			layPintarArmadilha = (LinearLayout) findViewById(R.id.layPintarArmadilha);
			layMascaraDaFraqueza = (LinearLayout) findViewById(R.id.layMascaraDaFraqueza);
			layMascaraDaMelancolia = (LinearLayout) findViewById(R.id.layMascaraDaMelancolia);
			layMascaraDaTolice = (LinearLayout) findViewById(R.id.layMascaraDaTolice);
			layMascaraDaOciosidade = (LinearLayout) findViewById(R.id.layMascaraDaOciosidade);
			layMascaraDaVulnerabilidade = (LinearLayout) findViewById(R.id.layMascaraDaVulnerabilidade);
			layMascaraDoInfortunio = (LinearLayout) findViewById(R.id.layMascaraDoInfortunio);
			layMimetismo = (LinearLayout) findViewById(R.id.layMimetismo);
			layVinculoSombrio = (LinearLayout) findViewById(R.id.layVinculoSombrio);
			layDesejoDasSombras = (LinearLayout) findViewById(R.id.layDesejoDasSombras);
			layDisparoTriplo = (LinearLayout) findViewById(R.id.layDisparoTriplo);

			if (id>0)
				recarregarBuild(id);


			//Eventos de informação
			btEnvenenarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Envenenar");
					dialogo.setMessage(R.string.envenenarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDesintoxicarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Desintoxicar");
					dialogo.setMessage(R.string.desintoxicarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueDuploInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Ataque Duplo");
					dialogo.setMessage(R.string.ataqueDuploInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaEmEsquivaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Perícia Em Esquiva");
					dialogo.setMessage(R.string.periciaEmEsquivaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFurtoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Furto");
					dialogo.setMessage(R.string.furtoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEsconderijoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Esconderijo");
					dialogo.setMessage(R.string.esconderijoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRecuarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Recuar");
					dialogo.setMessage(R.string.recuarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChutarAreiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Chutar Areia");
					dialogo.setMessage(R.string.chutarAreiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btProcurarPedrasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Procurar Pedras");
					dialogo.setMessage(R.string.procurarPedrasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArremessarPedraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Arremessar Pedra");
					dialogo.setMessage(R.string.arremessarPedrasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btApunhalarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Apunhalar");
					dialogo.setMessage(R.string.apunhalarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRemoverArmaduraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Remover Armadura");
					dialogo.setMessage(R.string.removerArmaduraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRemoverCapaceteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Remover Capacete");
					dialogo.setMessage(R.string.removerCapaceteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRemoverEscudoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Remover Escudo");
					dialogo.setMessage(R.string.removerEscudoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRemoverArmaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Remover Arma");
					dialogo.setMessage(R.string.removerArmaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRajadaDeFlechasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Rajada De Flechas");
					dialogo.setMessage(R.string.rajadaDeFlechasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMaosLevesInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Mãos Leves");
					dialogo.setMessage(R.string.maosLevesInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btExtorquirInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Extorquir");
					dialogo.setMessage(R.string.extorquirInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPlagioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Plágio");
					dialogo.setMessage(R.string.plagioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAfanarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Afanar");
					dialogo.setMessage(R.string.afanarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPicharInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Pichar");
					dialogo.setMessage(R.string.picharInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRemoverArmadilhaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Remover Armadilha");
					dialogo.setMessage(R.string.removerArmadilhaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFaxinaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Faxina");
					dialogo.setMessage(R.string.faxinaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGrafittiInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Grafitti");
					dialogo.setMessage(R.string.grafittiInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueSurpresaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Ataque Surpresa");
					dialogo.setMessage(R.string.ataqueSurpresaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMalandragemInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Malandragem");
					dialogo.setMessage(R.string.malandragemInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRaptoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Rapto");
					dialogo.setMessage(R.string.raptoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTunelDeFugaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Túnel De Fuga");
					dialogo.setMessage(R.string.tunelDeFugaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaComEspadaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Perícia Com Espada");
					dialogo.setMessage(R.string.periciaComEspadaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOlhosDeAguiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Olhos De Águia");
					dialogo.setMessage(R.string.olhosDeAguiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btConfinamentoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Confinamento");
					dialogo.setMessage(R.string.confinamentoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInstintoDeDefesaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Instinto De Defesa");
					dialogo.setMessage(R.string.instintoDeDefesaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRemocaoTotalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Remoção Total");
					dialogo.setMessage(R.string.remocaoTotalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspreitarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Espreitar");
					dialogo.setMessage(R.string.espreitarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPreservarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Preservar");
					dialogo.setMessage(R.string.preservarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSedeDeSangueInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Sede De Sangue");
					dialogo.setMessage(R.string.sedeDeSangueInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBorrifarTintaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Borrifar Tinta");
					dialogo.setMessage(R.string.borrifarTintaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSimboloDoCaosInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Símbolo Do Caos");
					dialogo.setMessage(R.string.simboloDoCaosInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPestilenciaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Pestilência");
					dialogo.setMessage(R.string.pestilenciaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPortaDimensionalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Porta Dimensional");
					dialogo.setMessage(R.string.portaDimensionalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRemoverAcessorioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Remover Acessório");
					dialogo.setMessage(R.string.removerAcessorioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAcertoDeContasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Acerto De Contas");
					dialogo.setMessage(R.string.acertoDeContasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCopiaExplosivaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Cópia Explosiva");
					dialogo.setMessage(R.string.copiaExplosivaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFormaEtereaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Forma Etérea");
					dialogo.setMessage(R.string.formaEtereaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRedemoinhoDeAbsorcaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Redemoinho De Absorção");
					dialogo.setMessage(R.string.redemoinhoDeAbsorcaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPintarArmadilhaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Pintar Armadilha");
					dialogo.setMessage(R.string.pintarArmadilhaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMascaraDaFraquezaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Máscara Da Fraqueza");
					dialogo.setMessage(R.string.mascaraDaFraquezaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMascaraDaMelancoliaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Máscara Da Melancolia");
					dialogo.setMessage(R.string.mascaraDaMelancoliaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMascaraDaToliceInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Máscara Da Tolice");
					dialogo.setMessage(R.string.mascaraDaToliceInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMascaraDaOciosidadeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Máscara Da Ociosidade");
					dialogo.setMessage(R.string.mascaraDaOciosidadeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMascaraDaVulnerabilidadeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Máscara Da Vulnerabilidade");
					dialogo.setMessage(R.string.mascaraDaVulnerabilidadeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMascaraDoInfortunioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Máscara Do Infortúnio");
					dialogo.setMessage(R.string.mascaraDoInfortunioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMimetismoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Mimetismo");
					dialogo.setMessage(R.string.mimetismoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btVinculoSombrioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Vínculo Sombrio");
					dialogo.setMessage(R.string.vinculoSombrioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDesejoDasSombrasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Desejo Das Sombras");
					dialogo.setMessage(R.string.desejoDasSombrasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDisparoTriploInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorRenegado.this);
					dialogo.setTitle("Disparo Triplo");
					dialogo.setMessage(R.string.disparoTriploInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});


			//Eventos de aumentar
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
			btApunhalarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");

				}
			});
			btRemoverArmaduraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<5 && count<5){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRemoverArmadura, "RemoverArmadura", 5, 2, "Aumentar");

				}
			});
			btRemoverCapaceteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");

				}
			});
			btRemoverEscudoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");

				}
			});
			btRemoverArmaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<5 && count<5){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArmadura<5 && count<5){
						atualizarCalculo(varRemoverArmadura, "RemoverArmadura", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRemoverArma, "RemoverArma", 5, 2, "Aumentar");

				}
			});
			btRajadaDeFlechasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varOlhosDeAguia<10 && count<10){
						atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRajadaDeFlechas, "RajadaDeFlechas", 10, 2, "Aumentar");

				}
			});
			btMaosLevesAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");

				}
			});
			btExtorquirAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<3 && count<3){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMalandragem<1 && count<1){
						atualizarCalculo(varMalandragem, "Malandragem", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varExtorquir, "Extorquir", 5, 2, "Aumentar");

				}
			});
			btPlagioAumentar.setOnClickListener(new View.OnClickListener() {

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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<4 && count<4){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRapto<5 && count<5){
						atualizarCalculo(varRapto, "Rapto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPlagio, "Plagio", 10, 2, "Aumentar");

				}
			});
			btAfanarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");

				}
			});
			btPicharAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<3 && count<3){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMalandragem<1 && count<1){
						atualizarCalculo(varMalandragem, "Malandragem", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFaxina<1 && count<1){
						atualizarCalculo(varFaxina, "Faxina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPichar, "Pichar", 5, 2, "Aumentar");

				}
			});
			btRemoverArmadilhaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varOlhosDeAguia<10 && count<10){
						atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaDeFlechas<5 && count<5){
						atualizarCalculo(varRajadaDeFlechas, "RajadaDeFlechas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRemoverArmadilha, "RemoverArmadilha", 1, 2, "Aumentar");

				}
			});
			btFaxinaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<3 && count<3){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMalandragem<1 && count<1){
						atualizarCalculo(varMalandragem, "Malandragem", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFaxina, "Faxina", 1, 2, "Aumentar");

				}
			});
			btGrafittiAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<3 && count<3){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMalandragem<1 && count<1){
						atualizarCalculo(varMalandragem, "Malandragem", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFaxina<1 && count<1){
						atualizarCalculo(varFaxina, "Faxina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPichar<5 && count<5){
						atualizarCalculo(varPichar, "Pichar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGrafitti, "Grafitti", 1, 2, "Aumentar");

				}
			});
			btAtaqueSurpresaAumentar.setOnClickListener(new View.OnClickListener() {

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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");

				}
			});
			btMalandragemAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<3 && count<3){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMalandragem, "Malandragem", 1, 2, "Aumentar");

				}
			});
			btRaptoAumentar.setOnClickListener(new View.OnClickListener() {

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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<4 && count<4){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRapto, "Rapto", 5, 2, "Aumentar");

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
			btPericiaComEspadaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 2, "Aumentar");

				}
			});
			btOlhosDeAguiaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 2, "Aumentar");

				}
			});
			btInstintoDeDefesaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInstintoDeDefesa, "InstintoDeDefesa", 5, 3, "Aumentar");

				}
			});
			btRemocaoTotalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<5 && count<5){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArmadura<5 && count<5){
						atualizarCalculo(varRemoverArmadura, "RemoverArmadura", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArma<5 && count<5){
						atualizarCalculo(varRemoverArma, "RemoverArma", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRemocaoTotal, "RemocaoTotal", 5, 3, "Aumentar");

				}
			});
			btEspreitarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<5 && count<5){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsconderijo<5 && count<5){
						atualizarCalculo(varEsconderijo, "Esconderijo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
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
					while(varTunelDeFuga<3 && count<3){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEspreitar, "Espreitar", 5, 3, "Aumentar");

				}
			});
			btPreservarAumentar.setOnClickListener(new View.OnClickListener() {

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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<4 && count<4){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRapto<5 && count<5){
						atualizarCalculo(varRapto, "Rapto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPlagio<10 && count<10){
						atualizarCalculo(varPlagio, "Plagio", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPreservar, "Preservar", 1, 3, "Aumentar");

				}
			});
			btSedeDeSangueAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<3 && count<3){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMalandragem<1 && count<1){
						atualizarCalculo(varMalandragem, "Malandragem", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFaxina<1 && count<1){
						atualizarCalculo(varFaxina, "Faxina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPichar<1 && count<1){
						atualizarCalculo(varPichar, "Pichar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPintarArmadilha<1 && count<1){
						atualizarCalculo(varPintarArmadilha, "PintarArmadilha", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPortaDimensional<3 && count<3){
						atualizarCalculo(varPortaDimensional, "PortaDimensional", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSedeDeSangue, "SedeDeSangue", 3, 4, "Aumentar");

				}
			});
			btBorrifarTintaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");

				}
			});
			btSimboloDoCaosAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<3 && count<3){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMalandragem<1 && count<1){
						atualizarCalculo(varMalandragem, "Malandragem", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFaxina<1 && count<1){
						atualizarCalculo(varFaxina, "Faxina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPichar<1 && count<1){
						atualizarCalculo(varPichar, "Pichar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPintarArmadilha<1 && count<1){
						atualizarCalculo(varPintarArmadilha, "PintarArmadilha", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSimboloDoCaos, "SimboloDoCaos", 3, 4, "Aumentar");

				}
			});
			btPestilenciaAumentar.setOnClickListener(new View.OnClickListener() {

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
					while(varTunelDeFuga<3 && count<3){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varVinculoSombrio<3 && count<3){
						atualizarCalculo(varVinculoSombrio, "VinculoSombrio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<4 && count<4){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRapto<5 && count<5){
						atualizarCalculo(varRapto, "Rapto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<4 && count<4){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRapto<5 && count<5){
						atualizarCalculo(varRapto, "Rapto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPlagio<5 && count<5){
						atualizarCalculo(varPlagio, "Plagio", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMimetismo<5 && count<5){
						atualizarCalculo(varMimetismo, "Mimetismo", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesejoDasSombras<5 && count<5){
						atualizarCalculo(varDesejoDasSombras, "DesejoDasSombras", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPestilencia, "Pestilencia", 5, 4, "Aumentar");

				}
			});
			btPortaDimensionalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<3 && count<3){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMalandragem<1 && count<1){
						atualizarCalculo(varMalandragem, "Malandragem", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFaxina<1 && count<1){
						atualizarCalculo(varFaxina, "Faxina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPichar<1 && count<1){
						atualizarCalculo(varPichar, "Pichar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPintarArmadilha<1 && count<1){
						atualizarCalculo(varPintarArmadilha, "PintarArmadilha", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPortaDimensional, "PortaDimensional", 3, 4, "Aumentar");

				}
			});
			btRemoverAcessorioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<5 && count<5){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArmadura<5 && count<5){
						atualizarCalculo(varRemoverArmadura, "RemoverArmadura", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverArma<1 && count<1){
						atualizarCalculo(varRemoverArma, "RemoverArma", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRemoverAcessorio, "RemoverAcessorio", 5, 4, "Aumentar");

				}
			});
			btAcertoDeContasAumentar.setOnClickListener(new View.OnClickListener() {

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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<4 && count<4){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRapto<5 && count<5){
						atualizarCalculo(varRapto, "Rapto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAcertoDeContas, "AcertoDeContas", 5, 4, "Aumentar");

				}
			});
			btCopiaExplosivaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<3 && count<3){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMalandragem<1 && count<1){
						atualizarCalculo(varMalandragem, "Malandragem", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFaxina<1 && count<1){
						atualizarCalculo(varFaxina, "Faxina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPichar<1 && count<1){
						atualizarCalculo(varPichar, "Pichar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPintarArmadilha<1 && count<1){
						atualizarCalculo(varPintarArmadilha, "PintarArmadilha", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPortaDimensional<3 && count<3){
						atualizarCalculo(varPortaDimensional, "PortaDimensional", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCopiaExplosiva, "CopiaExplosiva", 3, 4, "Aumentar");

				}
			});
			btFormaEtereaAumentar.setOnClickListener(new View.OnClickListener() {

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
					while(varTunelDeFuga<3 && count<3){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varVinculoSombrio<3 && count<3){
						atualizarCalculo(varVinculoSombrio, "VinculoSombrio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<4 && count<4){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRapto<5 && count<5){
						atualizarCalculo(varRapto, "Rapto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<4 && count<4){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRapto<5 && count<5){
						atualizarCalculo(varRapto, "Rapto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPlagio<5 && count<5){
						atualizarCalculo(varPlagio, "Plagio", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMimetismo<5 && count<5){
						atualizarCalculo(varMimetismo, "Mimetismo", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesejoDasSombras<5 && count<5){
						atualizarCalculo(varDesejoDasSombras, "DesejoDasSombras", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPestilencia<5 && count<5){
						atualizarCalculo(varPestilencia, "Pestilencia", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<4 && count<4){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRapto<5 && count<5){
						atualizarCalculo(varRapto, "Rapto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<4 && count<4){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRapto<5 && count<5){
						atualizarCalculo(varRapto, "Rapto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPlagio<5 && count<5){
						atualizarCalculo(varPlagio, "Plagio", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMimetismo<5 && count<5){
						atualizarCalculo(varMimetismo, "Mimetismo", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesejoDasSombras<7 && count<7){
						atualizarCalculo(varDesejoDasSombras, "DesejoDasSombras", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaFraqueza<1 && count<1){
						atualizarCalculo(varMascaraDaFraqueza, "MascaraDaFraqueza", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaMelancolia<1 && count<1){
						atualizarCalculo(varMascaraDaMelancolia, "MascaraDaMelancolia", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaTolice<1 && count<1){
						atualizarCalculo(varMascaraDaTolice, "MascaraDaTolice", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaVulnerabilidade<3 && count<3){
						atualizarCalculo(varMascaraDaVulnerabilidade, "MascaraDaVulnerabilidade", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFormaEterea, "FormaEterea", 5, 4, "Aumentar");

				}
			});
			btRedemoinhoDeAbsorcaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<3 && count<3){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMalandragem<1 && count<1){
						atualizarCalculo(varMalandragem, "Malandragem", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFaxina<1 && count<1){
						atualizarCalculo(varFaxina, "Faxina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPichar<1 && count<1){
						atualizarCalculo(varPichar, "Pichar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPintarArmadilha<1 && count<1){
						atualizarCalculo(varPintarArmadilha, "PintarArmadilha", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varSimboloDoCaos<3 && count<3){
						atualizarCalculo(varSimboloDoCaos, "SimboloDoCaos", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaFraqueza<1 && count<1){
						atualizarCalculo(varMascaraDaFraqueza, "MascaraDaFraqueza", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaMelancolia<1 && count<1){
						atualizarCalculo(varMascaraDaMelancolia, "MascaraDaMelancolia", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaTolice<1 && count<1){
						atualizarCalculo(varMascaraDaTolice, "MascaraDaTolice", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaVulnerabilidade<3 && count<3){
						atualizarCalculo(varMascaraDaVulnerabilidade, "MascaraDaVulnerabilidade", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRedemoinhoDeAbsorcao, "RedemoinhoDeAbsorcao", 3, 4, "Aumentar");

				}
			});
			btPintarArmadilhaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<2 && count<2){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverCapacete<5 && count<5){
						atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRemoverEscudo<3 && count<3){
						atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMalandragem<1 && count<1){
						atualizarCalculo(varMalandragem, "Malandragem", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFaxina<1 && count<1){
						atualizarCalculo(varFaxina, "Faxina", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPichar<1 && count<1){
						atualizarCalculo(varPichar, "Pichar", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPintarArmadilha, "PintarArmadilha", 3, 4, "Aumentar");

				}
			});
			btMascaraDaFraquezaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMascaraDaFraqueza, "MascaraDaFraqueza", 3, 4, "Aumentar");

				}
			});
			btMascaraDaMelancoliaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMascaraDaMelancolia, "MascaraDaMelancolia", 3, 4, "Aumentar");

				}
			});
			btMascaraDaToliceAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMascaraDaTolice, "MascaraDaTolice", 3, 4, "Aumentar");

				}
			});
			btMascaraDaOciosidadeAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaFraqueza<1 && count<1){
						atualizarCalculo(varMascaraDaFraqueza, "MascaraDaFraqueza", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaTolice<1 && count<1){
						atualizarCalculo(varMascaraDaTolice, "MascaraDaTolice", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaMelancolia<1 && count<1){
						atualizarCalculo(varMascaraDaMelancolia, "MascaraDaMelancolia", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMascaraDaOciosidade, "MascaraDaOciosidade", 3, 4, "Aumentar");

				}
			});
			btMascaraDaVulnerabilidadeAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaFraqueza<1 && count<1){
						atualizarCalculo(varMascaraDaFraqueza, "MascaraDaFraqueza", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaMelancolia<1 && count<1){
						atualizarCalculo(varMascaraDaMelancolia, "MascaraDaMelancolia", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaTolice<1 && count<1){
						atualizarCalculo(varMascaraDaTolice, "MascaraDaTolice", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMascaraDaVulnerabilidade, "MascaraDaVulnerabilidade", 3, 4, "Aumentar");

				}
			});
			btMascaraDoInfortunioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaFraqueza<1 && count<1){
						atualizarCalculo(varMascaraDaFraqueza, "MascaraDaFraqueza", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaTolice<1 && count<1){
						atualizarCalculo(varMascaraDaTolice, "MascaraDaTolice", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaMelancolia<1 && count<1){
						atualizarCalculo(varMascaraDaMelancolia, "MascaraDaMelancolia", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaOciosidade<1 && count<1){
						atualizarCalculo(varMascaraDaOciosidade, "MascaraDaOciosidade", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaFraqueza<1 && count<1){
						atualizarCalculo(varMascaraDaFraqueza, "MascaraDaFraqueza", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaMelancolia<1 && count<1){
						atualizarCalculo(varMascaraDaMelancolia, "MascaraDaMelancolia", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varBorrifarTinta<1 && count<1){
						atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaTolice<1 && count<1){
						atualizarCalculo(varMascaraDaTolice, "MascaraDaTolice", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varMascaraDaVulnerabilidade<1 && count<1){
						atualizarCalculo(varMascaraDaVulnerabilidade, "MascaraDaVulnerabilidade", 3, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMascaraDoInfortunio, "MascaraDoInfortunio", 3, 4, "Aumentar");

				}
			});
			btMimetismoAumentar.setOnClickListener(new View.OnClickListener() {

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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<4 && count<4){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRapto<5 && count<5){
						atualizarCalculo(varRapto, "Rapto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<4 && count<4){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRapto<5 && count<5){
						atualizarCalculo(varRapto, "Rapto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPlagio<5 && count<5){
						atualizarCalculo(varPlagio, "Plagio", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMimetismo, "Mimetismo", 10, 4, "Aumentar");

				}
			});
			btVinculoSombrioAumentar.setOnClickListener(new View.OnClickListener() {

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
					while(varTunelDeFuga<3 && count<3){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varVinculoSombrio, "VinculoSombrio", 5, 4, "Aumentar");

				}
			});
			btDesejoDasSombrasAumentar.setOnClickListener(new View.OnClickListener() {

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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<4 && count<4){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRapto<5 && count<5){
						atualizarCalculo(varRapto, "Rapto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<4 && count<4){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRapto<5 && count<5){
						atualizarCalculo(varRapto, "Rapto", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPlagio<5 && count<5){
						atualizarCalculo(varPlagio, "Plagio", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
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
					while(varTunelDeFuga<2 && count<2){
						atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<1 && count<1){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varMaosLeves<4 && count<4){
						atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAfanar<4 && count<4){
						atualizarCalculo(varAfanar, "Afanar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varApunhalar<2 && count<2){
						atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAtaqueSurpresa<5 && count<5){
						atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varMimetismo<5 && count<5){
						atualizarCalculo(varMimetismo, "Mimetismo", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDesejoDasSombras, "DesejoDasSombras", 10, 4, "Aumentar");

				}
			});
			btDisparoTriploAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varOlhosDeAguia<10 && count<10){
						atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRajadaDeFlechas<7 && count<7){
						atualizarCalculo(varRajadaDeFlechas, "RajadaDeFlechas", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDisparoTriplo, "DisparoTriplo", 10, 4, "Aumentar");

				}
			});


			//Eventos de diminuir
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
			btApunhalarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varApunhalar, "Apunhalar", 10, 2, "Diminuir");

				}
			});
			btRemoverArmaduraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRemoverArmadura, "RemoverArmadura", 5, 2, "Diminuir");

				}
			});
			btRemoverCapaceteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRemoverCapacete, "RemoverCapacete", 5, 2, "Diminuir");

				}
			});
			btRemoverEscudoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRemoverEscudo, "RemoverEscudo", 5, 2, "Diminuir");

				}
			});
			btRemoverArmaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRemoverArma, "RemoverArma", 5, 2, "Diminuir");

				}
			});
			btRajadaDeFlechasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRajadaDeFlechas, "RajadaDeFlechas", 10, 2, "Diminuir");

				}
			});
			btMaosLevesDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMaosLeves, "MaosLeves", 10, 2, "Diminuir");

				}
			});
			btExtorquirDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varExtorquir, "Extorquir", 5, 2, "Diminuir");

				}
			});
			btPlagioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPlagio, "Plagio", 10, 2, "Diminuir");

				}
			});
			btAfanarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAfanar, "Afanar", 10, 2, "Diminuir");

				}
			});
			btPicharDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPichar, "Pichar", 5, 2, "Diminuir");

				}
			});
			btRemoverArmadilhaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRemoverArmadilha, "RemoverArmadilha", 1, 2, "Diminuir");

				}
			});
			btFaxinaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFaxina, "Faxina", 1, 2, "Diminuir");

				}
			});
			btGrafittiDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGrafitti, "Grafitti", 1, 2, "Diminuir");

				}
			});
			btAtaqueSurpresaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtaqueSurpresa, "AtaqueSurpresa", 5, 2, "Diminuir");

				}
			});
			btMalandragemDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMalandragem, "Malandragem", 1, 2, "Diminuir");

				}
			});
			btRaptoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRapto, "Rapto", 5, 2, "Diminuir");

				}
			});
			btTunelDeFugaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTunelDeFuga, "TunelDeFuga", 5, 2, "Diminuir");

				}
			});
			btPericiaComEspadaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 2, "Diminuir");

				}
			});
			btOlhosDeAguiaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOlhosDeAguia, "OlhosDeAguia", 10, 2, "Diminuir");

				}
			});
			btInstintoDeDefesaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInstintoDeDefesa, "InstintoDeDefesa", 5, 3, "Diminuir");

				}
			});
			btRemocaoTotalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRemocaoTotal, "RemocaoTotal", 5, 3, "Diminuir");

				}
			});
			btEspreitarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspreitar, "Espreitar", 5, 3, "Diminuir");

				}
			});
			btPreservarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPreservar, "Preservar", 1, 3, "Diminuir");

				}
			});
			btSedeDeSangueDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSedeDeSangue, "SedeDeSangue", 3, 4, "Diminuir");

				}
			});
			btBorrifarTintaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBorrifarTinta, "BorrifarTinta", 5, 4, "Diminuir");

				}
			});
			btSimboloDoCaosDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSimboloDoCaos, "SimboloDoCaos", 3, 4, "Diminuir");

				}
			});
			btPestilenciaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPestilencia, "Pestilencia", 5, 4, "Diminuir");

				}
			});
			btPortaDimensionalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPortaDimensional, "PortaDimensional", 3, 4, "Diminuir");

				}
			});
			btRemoverAcessorioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRemoverAcessorio, "RemoverAcessorio", 5, 4, "Diminuir");

				}
			});
			btAcertoDeContasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAcertoDeContas, "AcertoDeContas", 5, 4, "Diminuir");

				}
			});
			btCopiaExplosivaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCopiaExplosiva, "CopiaExplosiva", 3, 4, "Diminuir");

				}
			});
			btFormaEtereaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFormaEterea, "FormaEterea", 5, 4, "Diminuir");

				}
			});
			btRedemoinhoDeAbsorcaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRedemoinhoDeAbsorcao, "RedemoinhoDeAbsorcao", 3, 4, "Diminuir");

				}
			});
			btPintarArmadilhaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPintarArmadilha, "PintarArmadilha", 3, 4, "Diminuir");

				}
			});
			btMascaraDaFraquezaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMascaraDaFraqueza, "MascaraDaFraqueza", 3, 4, "Diminuir");

				}
			});
			btMascaraDaMelancoliaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMascaraDaMelancolia, "MascaraDaMelancolia", 3, 4, "Diminuir");

				}
			});
			btMascaraDaToliceDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMascaraDaTolice, "MascaraDaTolice", 3, 4, "Diminuir");

				}
			});
			btMascaraDaOciosidadeDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMascaraDaOciosidade, "MascaraDaOciosidade", 3, 4, "Diminuir");

				}
			});
			btMascaraDaVulnerabilidadeDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMascaraDaVulnerabilidade, "MascaraDaVulnerabilidade", 3, 4, "Diminuir");

				}
			});
			btMascaraDoInfortunioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMascaraDoInfortunio, "MascaraDoInfortunio", 3, 4, "Diminuir");

				}
			});
			btMimetismoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMimetismo, "Mimetismo", 10, 4, "Diminuir");

				}
			});
			btVinculoSombrioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varVinculoSombrio, "VinculoSombrio", 5, 4, "Diminuir");

				}
			});
			btDesejoDasSombrasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDesejoDasSombras, "DesejoDasSombras", 10, 4, "Diminuir");

				}
			});
			btDisparoTriploDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDisparoTriplo, "DisparoTriplo", 10, 4, "Diminuir");

				}
			});


			//Outros Botões
			btResetar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					varEnvenenar = 0;
					varDesintoxicar = 0;
					varAtaqueDuplo = 0;
					varPericiaEmEsquiva = 0;
					varFurto = 0;
					varEsconderijo = 0;
					varApunhalar = 0;
					varRemoverArmadura = 0;
					varRemoverCapacete = 0;
					varRemoverEscudo = 0;
					varRemoverArma = 0;
					varRajadaDeFlechas = 0;
					varMaosLeves = 0;
					varExtorquir = 0;
					varPlagio = 0;
					varAfanar = 0;
					varPichar = 0;
					varRemoverArmadilha = 0;
					varFaxina = 0;
					varGrafitti = 0;
					varAtaqueSurpresa = 0;
					varMalandragem = 0;
					varRapto = 0;
					varTunelDeFuga = 0;
					varPericiaComEspada = 0;
					varOlhosDeAguia = 0;
					varInstintoDeDefesa = 0;
					varRemocaoTotal = 0;
					varEspreitar = 0;
					varPreservar = 0;
					varSedeDeSangue = 0;
					varBorrifarTinta = 0;
					varSimboloDoCaos = 0;
					varPestilencia = 0;
					varPortaDimensional = 0;
					varRemoverAcessorio = 0;
					varAcertoDeContas = 0;
					varCopiaExplosiva = 0;
					varFormaEterea = 0;
					varRedemoinhoDeAbsorcao = 0;
					varPintarArmadilha = 0;
					varMascaraDaFraqueza = 0;
					varMascaraDaMelancolia = 0;
					varMascaraDaTolice = 0;
					varMascaraDaOciosidade = 0;
					varMascaraDaVulnerabilidade = 0;
					varMascaraDoInfortunio = 0;
					varMimetismo = 0;
					varVinculoSombrio = 0;
					varDesejoDasSombras = 0;
					varDisparoTriplo = 0;

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
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorRenegado.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorRenegado.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorRenegado.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorRenegado.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorRenegado.this);
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

			if(varApunhalar==0)
				layApunhalar.setVisibility(View.GONE);
			if(varRemoverArmadura==0)
				layRemoverArmadura.setVisibility(View.GONE);
			if(varRemoverCapacete==0)
				layRemoverCapacete.setVisibility(View.GONE);
			if(varRemoverEscudo==0)
				layRemoverEscudo.setVisibility(View.GONE);
			if(varRemoverArma==0)
				layRemoverArma.setVisibility(View.GONE);
			if(varRajadaDeFlechas==0)
				layRajadaDeFlechas.setVisibility(View.GONE);
			if(varMaosLeves==0)
				layMaosLeves.setVisibility(View.GONE);
			if(varExtorquir==0)
				layExtorquir.setVisibility(View.GONE);
			if(varPlagio==0)
				layPlagio.setVisibility(View.GONE);
			if(varAfanar==0)
				layAfanar.setVisibility(View.GONE);
			if(varPichar==0)
				layPichar.setVisibility(View.GONE);
			if(varRemoverArmadilha==0)
				layRemoverArmadilha.setVisibility(View.GONE);
			if(varFaxina==0)
				layFaxina.setVisibility(View.GONE);
			if(varGrafitti==0)
				layGrafitti.setVisibility(View.GONE);
			if(varAtaqueSurpresa==0)
				layAtaqueSurpresa.setVisibility(View.GONE);
			if(varMalandragem==0)
				layMalandragem.setVisibility(View.GONE);
			if(varRapto==0)
				layRapto.setVisibility(View.GONE);
			if(varTunelDeFuga==0)
				layTunelDeFuga.setVisibility(View.GONE);
			if(varPericiaComEspada==0)
				layPericiaComEspada.setVisibility(View.GONE);
			if(varOlhosDeAguia==0)
				layOlhosDeAguia.setVisibility(View.GONE);

			if(varInstintoDeDefesa==0)
				layInstintoDeDefesa.setVisibility(View.GONE);
			if(varRemocaoTotal==0)
				layRemocaoTotal.setVisibility(View.GONE);
			if(varEspreitar==0)
				layEspreitar.setVisibility(View.GONE);
			if(varPreservar==0)
				layPreservar.setVisibility(View.GONE);

			if(varSedeDeSangue==0)
				laySedeDeSangue.setVisibility(View.GONE);
			if(varBorrifarTinta==0)
				layBorrifarTinta.setVisibility(View.GONE);
			if(varSimboloDoCaos==0)
				laySimboloDoCaos.setVisibility(View.GONE);
			if(varPestilencia==0)
				layPestilencia.setVisibility(View.GONE);
			if(varPortaDimensional==0)
				layPortaDimensional.setVisibility(View.GONE);
			if(varRemoverAcessorio==0)
				layRemoverAcessorio.setVisibility(View.GONE);
			if(varAcertoDeContas==0)
				layAcertoDeContas.setVisibility(View.GONE);
			if(varCopiaExplosiva==0)
				layCopiaExplosiva.setVisibility(View.GONE);
			if(varFormaEterea==0)
				layFormaEterea.setVisibility(View.GONE);
			if(varRedemoinhoDeAbsorcao==0)
				layRedemoinhoDeAbsorcao.setVisibility(View.GONE);
			if(varPintarArmadilha==0)
				layPintarArmadilha.setVisibility(View.GONE);
			if(varMascaraDaFraqueza==0)
				layMascaraDaFraqueza.setVisibility(View.GONE);
			if(varMascaraDaMelancolia==0)
				layMascaraDaMelancolia.setVisibility(View.GONE);
			if(varMascaraDaTolice==0)
				layMascaraDaTolice.setVisibility(View.GONE);
			if(varMascaraDaOciosidade==0)
				layMascaraDaOciosidade.setVisibility(View.GONE);
			if(varMascaraDaVulnerabilidade==0)
				layMascaraDaVulnerabilidade.setVisibility(View.GONE);
			if(varMascaraDoInfortunio==0)
				layMascaraDoInfortunio.setVisibility(View.GONE);
			if(varMimetismo==0)
				layMimetismo.setVisibility(View.GONE);
			if(varVinculoSombrio==0)
				layVinculoSombrio.setVisibility(View.GONE);
			if(varDesejoDasSombras==0)
				layDesejoDasSombras.setVisibility(View.GONE);
			if(varDisparoTriplo==0)
				layDisparoTriplo.setVisibility(View.GONE);

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

				if (nomeDaHabilidade=="Envenenar" && varDesintoxicar>=1 && varEnvenenar<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Furto" && varEsconderijo>=1 && varFurto<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MaosLeves" && varApunhalar>=1 && varMaosLeves<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Afanar" && varApunhalar>=1 && varAfanar<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RemoverEscudo" && varRemoverArmadura>=1 && varRemoverEscudo<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MaosLeves" && varRemoverCapacete>=1 && varMaosLeves<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Afanar" && varRemoverCapacete>=1 && varAfanar<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RemoverCapacete" && varRemoverEscudo>=1 && varRemoverCapacete<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RemoverArmadura" && varRemoverArma>=1 && varRemoverArmadura<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OlhosDeAguia" && varRajadaDeFlechas>=1 && varOlhosDeAguia<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Furto" && varMaosLeves>=1 && varFurto<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Malandragem" && varExtorquir>=1 && varMalandragem<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Rapto" && varPlagio>=1 && varRapto<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MaosLeves" && varAfanar>=1 && varMaosLeves<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Faxina" && varPichar>=1 && varFaxina<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RajadaDeFlechas" && varRemoverArmadilha>=1 && varRajadaDeFlechas<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Malandragem" && varFaxina>=1 && varMalandragem<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Pichar" && varGrafitti>=1 && varPichar<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TunelDeFuga" && varAtaqueSurpresa>=1 && varTunelDeFuga<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Apunhalar" && varAtaqueSurpresa>=1 && varApunhalar<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RemoverEscudo" && varMalandragem>=1 && varRemoverEscudo<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtaqueSurpresa" && varRapto>=1 && varAtaqueSurpresa<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Apunhalar" && varRapto>=1 && varApunhalar<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Esconderijo" && varTunelDeFuga>=1 && varEsconderijo<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RemoverArma" && varRemocaoTotal>=1 && varRemoverArma<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Esconderijo" && varEspreitar>=1 && varEsconderijo<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TunelDeFuga" && varEspreitar>=1 && varTunelDeFuga<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Plagio" && varPreservar>=1 && varPlagio<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PortaDimensional" && varSedeDeSangue>=1 && varPortaDimensional<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PintarArmadilha" && varSimboloDoCaos>=1 && varPintarArmadilha<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="VinculoSombrio" && varPestilencia>=1 && varVinculoSombrio<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DesejoDasSombras" && varPestilencia>=1 && varDesejoDasSombras<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PintarArmadilha" && varPortaDimensional>=1 && varPintarArmadilha<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RemoverArma" && varRemoverAcessorio>=1 && varRemoverArma<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Rapto" && varAcertoDeContas>=1 && varRapto<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PortaDimensional" && varCopiaExplosiva>=1 && varPortaDimensional<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Pestilencia" && varFormaEterea>=1 && varPestilencia<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DesejoDasSombras" && varFormaEterea>=1 && varDesejoDasSombras<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MascaraDaVulnerabilidade" && varFormaEterea>=1 && varMascaraDaVulnerabilidade<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="SimboloDoCaos" && varRedemoinhoDeAbsorcao>=1 && varSimboloDoCaos<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MascaraDaVulnerabilidade" && varRedemoinhoDeAbsorcao>=1 && varMascaraDaVulnerabilidade<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Pichar" && varPintarArmadilha>=1 && varPichar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="BorrifarTinta" && varMascaraDaFraqueza>=1 && varBorrifarTinta<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="BorrifarTinta" && varMascaraDaMelancolia>=1 && varBorrifarTinta<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="BorrifarTinta" && varMascaraDaTolice>=1 && varBorrifarTinta<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MascaraDaFraqueza" && varMascaraDaOciosidade>=1 && varMascaraDaFraqueza<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MascaraDaTolice" && varMascaraDaOciosidade>=1 && varMascaraDaTolice<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MascaraDaMelancolia" && varMascaraDaOciosidade>=1 && varMascaraDaMelancolia<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MascaraDaFraqueza" && varMascaraDaVulnerabilidade>=1 && varMascaraDaFraqueza<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MascaraDaMelancolia" && varMascaraDaVulnerabilidade>=1 && varMascaraDaMelancolia<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MascaraDaTolice" && varMascaraDaVulnerabilidade>=1 && varMascaraDaTolice<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MascaraDaOciosidade" && varMascaraDoInfortunio>=1 && varMascaraDaOciosidade<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="MascaraDaVulnerabilidade" && varMascaraDoInfortunio>=1 && varMascaraDaVulnerabilidade<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Rapto" && varMimetismo>=1 && varRapto<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Plagio" && varMimetismo>=1 && varPlagio<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtaqueSurpresa" && varMimetismo>=1 && varAtaqueSurpresa<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TunelDeFuga" && varVinculoSombrio>=1 && varTunelDeFuga<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Mimetismo" && varDesejoDasSombras>=1 && varMimetismo<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RajadaDeFlechas" && varDisparoTriplo>=1 && varRajadaDeFlechas<=07){
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
			if(nomeDaHabilidade=="Envenenar"){
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
			}

			else if(nomeDaHabilidade=="Apunhalar"){
				varApunhalar = habilidade;
			} else if(nomeDaHabilidade=="RemoverArmadura"){
				varRemoverArmadura = habilidade;
			} else if(nomeDaHabilidade=="RemoverCapacete"){
				varRemoverCapacete = habilidade;
			} else if(nomeDaHabilidade=="RemoverEscudo"){
				varRemoverEscudo = habilidade;
			} else if(nomeDaHabilidade=="RemoverArma"){
				varRemoverArma = habilidade;
			} else if(nomeDaHabilidade=="RajadaDeFlechas"){
				varRajadaDeFlechas = habilidade;
			} else if(nomeDaHabilidade=="MaosLeves"){
				varMaosLeves = habilidade;
			} else if(nomeDaHabilidade=="Extorquir"){
				varExtorquir = habilidade;
			} else if(nomeDaHabilidade=="Plagio"){
				varPlagio = habilidade;
			} else if(nomeDaHabilidade=="Afanar"){
				varAfanar = habilidade;
			} else if(nomeDaHabilidade=="Pichar"){
				varPichar = habilidade;
			} else if(nomeDaHabilidade=="RemoverArmadilha"){
				varRemoverArmadilha = habilidade;
			} else if(nomeDaHabilidade=="Faxina"){
				varFaxina = habilidade;
			} else if(nomeDaHabilidade=="Grafitti"){
				varGrafitti = habilidade;
			} else if(nomeDaHabilidade=="AtaqueSurpresa"){
				varAtaqueSurpresa = habilidade;
			} else if(nomeDaHabilidade=="Malandragem"){
				varMalandragem = habilidade;
			} else if(nomeDaHabilidade=="Rapto"){
				varRapto = habilidade;
			} else if(nomeDaHabilidade=="TunelDeFuga"){
				varTunelDeFuga = habilidade;
			} else if(nomeDaHabilidade=="PericiaComEspada"){
				varPericiaComEspada = habilidade;
			} else if(nomeDaHabilidade=="OlhosDeAguia"){
				varOlhosDeAguia = habilidade;
			}

			else if(nomeDaHabilidade=="InstintoDeDefesa"){
				varInstintoDeDefesa = habilidade;
			} else if(nomeDaHabilidade=="RemocaoTotal"){
				varRemocaoTotal = habilidade;
			} else if(nomeDaHabilidade=="Espreitar"){
				varEspreitar = habilidade;
			} else if(nomeDaHabilidade=="Preservar"){
				varPreservar = habilidade;
			}

			else if(nomeDaHabilidade=="SedeDeSangue"){
				varSedeDeSangue = habilidade;
			} else if(nomeDaHabilidade=="BorrifarTinta"){
				varBorrifarTinta = habilidade;
			} else if(nomeDaHabilidade=="SimboloDoCaos"){
				varSimboloDoCaos = habilidade;
			} else if(nomeDaHabilidade=="Pestilencia"){
				varPestilencia = habilidade;
			} else if(nomeDaHabilidade=="PortaDimensional"){
				varPortaDimensional = habilidade;
			} else if(nomeDaHabilidade=="RemoverAcessorio"){
				varRemoverAcessorio = habilidade;
			} else if(nomeDaHabilidade=="AcertoDeContas"){
				varAcertoDeContas = habilidade;
			} else if(nomeDaHabilidade=="CopiaExplosiva"){
				varCopiaExplosiva = habilidade;
			} else if(nomeDaHabilidade=="FormaEterea"){
				varFormaEterea = habilidade;
			} else if(nomeDaHabilidade=="RedemoinhoDeAbsorcao"){
				varRedemoinhoDeAbsorcao = habilidade;
			} else if(nomeDaHabilidade=="PintarArmadilha"){
				varPintarArmadilha = habilidade;
			} else if(nomeDaHabilidade=="MascaraDaFraqueza"){
				varMascaraDaFraqueza = habilidade;
			} else if(nomeDaHabilidade=="MascaraDaMelancolia"){
				varMascaraDaMelancolia = habilidade;
			} else if(nomeDaHabilidade=="MascaraDaTolice"){
				varMascaraDaTolice = habilidade;
			} else if(nomeDaHabilidade=="MascaraDaOciosidade"){
				varMascaraDaOciosidade = habilidade;
			} else if(nomeDaHabilidade=="MascaraDaVulnerabilidade"){
				varMascaraDaVulnerabilidade = habilidade;
			} else if(nomeDaHabilidade=="MascaraDoInfortunio"){
				varMascaraDoInfortunio = habilidade;
			} else if(nomeDaHabilidade=="Mimetismo"){
				varMimetismo = habilidade;
			} else if(nomeDaHabilidade=="VinculoSombrio"){
				varVinculoSombrio = habilidade;
			} else if(nomeDaHabilidade=="DesejoDasSombras"){
				varDesejoDasSombras = habilidade;
			} else if(nomeDaHabilidade=="DisparoTriplo"){
				varDisparoTriplo = habilidade;
			}

			atualizarTela();

		}

		public void atualizarTela(){
			txtEnvenenarPontos.setText(varEnvenenar + "/10");
			txtDesintoxicarPontos.setText(varDesintoxicar + "/1");
			txtAtaqueDuploPontos.setText(varAtaqueDuplo + "/10");
			txtPericiaEmEsquivaPontos.setText(varPericiaEmEsquiva + "/10");
			txtFurtoPontos.setText(varFurto + "/10");
			txtEsconderijoPontos.setText(varEsconderijo + "/10");

			txtApunhalarPontos.setText(varApunhalar + "/10");
			txtRemoverArmaduraPontos.setText(varRemoverArmadura + "/5");
			txtRemoverCapacetePontos.setText(varRemoverCapacete + "/5");
			txtRemoverEscudoPontos.setText(varRemoverEscudo + "/5");
			txtRemoverArmaPontos.setText(varRemoverArma + "/5");
			txtRajadaDeFlechasPontos.setText(varRajadaDeFlechas + "/10");
			txtMaosLevesPontos.setText(varMaosLeves + "/10");
			txtExtorquirPontos.setText(varExtorquir + "/5");
			txtPlagioPontos.setText(varPlagio + "/10");
			txtAfanarPontos.setText(varAfanar + "/10");
			txtPicharPontos.setText(varPichar + "/5");
			txtRemoverArmadilhaPontos.setText(varRemoverArmadilha + "/1");
			txtFaxinaPontos.setText(varFaxina + "/1");
			txtGrafittiPontos.setText(varGrafitti + "/1");
			txtAtaqueSurpresaPontos.setText(varAtaqueSurpresa + "/5");
			txtMalandragemPontos.setText(varMalandragem + "/1");
			txtRaptoPontos.setText(varRapto + "/5");
			txtTunelDeFugaPontos.setText(varTunelDeFuga + "/5");
			txtPericiaComEspadaPontos.setText(varPericiaComEspada + "/10");
			txtOlhosDeAguiaPontos.setText(varOlhosDeAguia + "/10");

			txtInstintoDeDefesaPontos.setText(varInstintoDeDefesa + "/5");
			txtRemocaoTotalPontos.setText(varRemocaoTotal + "/5");
			txtEspreitarPontos.setText(varEspreitar + "/5");
			txtPreservarPontos.setText(varPreservar + "/1");

			txtSedeDeSanguePontos.setText(varSedeDeSangue + "/3");
			txtBorrifarTintaPontos.setText(varBorrifarTinta + "/5");
			txtSimboloDoCaosPontos.setText(varSimboloDoCaos + "/3");
			txtPestilenciaPontos.setText(varPestilencia + "/5");
			txtPortaDimensionalPontos.setText(varPortaDimensional + "/3");
			txtRemoverAcessorioPontos.setText(varRemoverAcessorio + "/5");
			txtAcertoDeContasPontos.setText(varAcertoDeContas + "/5");
			txtCopiaExplosivaPontos.setText(varCopiaExplosiva + "/3");
			txtFormaEtereaPontos.setText(varFormaEterea + "/5");
			txtRedemoinhoDeAbsorcaoPontos.setText(varRedemoinhoDeAbsorcao + "/3");
			txtPintarArmadilhaPontos.setText(varPintarArmadilha + "/3");
			txtMascaraDaFraquezaPontos.setText(varMascaraDaFraqueza + "/3");
			txtMascaraDaMelancoliaPontos.setText(varMascaraDaMelancolia + "/3");
			txtMascaraDaTolicePontos.setText(varMascaraDaTolice + "/3");
			txtMascaraDaOciosidadePontos.setText(varMascaraDaOciosidade + "/3");
			txtMascaraDaVulnerabilidadePontos.setText(varMascaraDaVulnerabilidade + "/3");
			txtMascaraDoInfortunioPontos.setText(varMascaraDoInfortunio + "/3");
			txtMimetismoPontos.setText(varMimetismo + "/10");
			txtVinculoSombrioPontos.setText(varVinculoSombrio + "/5");
			txtDesejoDasSombrasPontos.setText(varDesejoDasSombras + "/10");
			txtDisparoTriploPontos.setText(varDisparoTriplo + "/10");

			txtClasse1.setText("Classe 1: " + primeiraClasse);
			txtClasse2.setText("Classe 2: " + segundaClasse);
			txtTransClasse.setText("Transclasse: " + transClasse);
			txtClasse3.setText("Classe 3: " + terceiraClasse);

			tudoVisivel();
		}

		public void tudoVisivel(){
			layEnvenenar.setVisibility(View.VISIBLE);
			layDesintoxicar.setVisibility(View.VISIBLE);
			layAtaqueDuplo.setVisibility(View.VISIBLE);
			layPericiaEmEsquiva.setVisibility(View.VISIBLE);
			layFurto.setVisibility(View.VISIBLE);
			layEsconderijo.setVisibility(View.VISIBLE);

			layApunhalar.setVisibility(View.VISIBLE);
			layRemoverArmadura.setVisibility(View.VISIBLE);
			layRemoverCapacete.setVisibility(View.VISIBLE);
			layRemoverEscudo.setVisibility(View.VISIBLE);
			layRemoverArma.setVisibility(View.VISIBLE);
			layRajadaDeFlechas.setVisibility(View.VISIBLE);
			layMaosLeves.setVisibility(View.VISIBLE);
			layExtorquir.setVisibility(View.VISIBLE);
			layPlagio.setVisibility(View.VISIBLE);
			layAfanar.setVisibility(View.VISIBLE);
			layPichar.setVisibility(View.VISIBLE);
			layRemoverArmadilha.setVisibility(View.VISIBLE);
			layFaxina.setVisibility(View.VISIBLE);
			layGrafitti.setVisibility(View.VISIBLE);
			layAtaqueSurpresa.setVisibility(View.VISIBLE);
			layMalandragem.setVisibility(View.VISIBLE);
			layRapto.setVisibility(View.VISIBLE);
			layTunelDeFuga.setVisibility(View.VISIBLE);
			layPericiaComEspada.setVisibility(View.VISIBLE);
			layOlhosDeAguia.setVisibility(View.VISIBLE);

			layInstintoDeDefesa.setVisibility(View.VISIBLE);
			layRemocaoTotal.setVisibility(View.VISIBLE);
			layEspreitar.setVisibility(View.VISIBLE);
			layPreservar.setVisibility(View.VISIBLE);

			laySedeDeSangue.setVisibility(View.VISIBLE);
			layBorrifarTinta.setVisibility(View.VISIBLE);
			laySimboloDoCaos.setVisibility(View.VISIBLE);
			layPestilencia.setVisibility(View.VISIBLE);
			layPortaDimensional.setVisibility(View.VISIBLE);
			layRemoverAcessorio.setVisibility(View.VISIBLE);
			layAcertoDeContas.setVisibility(View.VISIBLE);
			layCopiaExplosiva.setVisibility(View.VISIBLE);
			layFormaEterea.setVisibility(View.VISIBLE);
			layRedemoinhoDeAbsorcao.setVisibility(View.VISIBLE);
			layPintarArmadilha.setVisibility(View.VISIBLE);
			layMascaraDaFraqueza.setVisibility(View.VISIBLE);
			layMascaraDaMelancolia.setVisibility(View.VISIBLE);
			layMascaraDaTolice.setVisibility(View.VISIBLE);
			layMascaraDaOciosidade.setVisibility(View.VISIBLE);
			layMascaraDaVulnerabilidade.setVisibility(View.VISIBLE);
			layMascaraDoInfortunio.setVisibility(View.VISIBLE);
			layMimetismo.setVisibility(View.VISIBLE);
			layVinculoSombrio.setVisibility(View.VISIBLE);
			layDesejoDasSombras.setVisibility(View.VISIBLE);
			layDisparoTriplo.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM renegado WHERE _id = ?", new String[]{String.valueOf(id)});

			if(cs.moveToFirst()){
			primeiraClasse = cs.getInt(2);
			segundaClasse = cs.getInt(3);
			transClasse = cs.getInt(4);
			terceiraClasse = cs.getInt(5);

			varEnvenenar = cs.getInt(6);
			varDesintoxicar = cs.getInt(7);
			varAtaqueDuplo = cs.getInt(8);
			varPericiaEmEsquiva = cs.getInt(9);
			varFurto = cs.getInt(10);
			varEsconderijo = cs.getInt(11);

			varApunhalar = cs.getInt(12);
			varRemoverArmadura = cs.getInt(13);
			varRemoverCapacete = cs.getInt(14);
			varRemoverEscudo = cs.getInt(15);
			varRemoverArma = cs.getInt(16);
			varRajadaDeFlechas = cs.getInt(17);
			varMaosLeves = cs.getInt(18);
			varExtorquir = cs.getInt(19);
			varPlagio = cs.getInt(20);
			varAfanar = cs.getInt(21);
			varPichar = cs.getInt(22);
			varRemoverArmadilha = cs.getInt(23);
			varFaxina = cs.getInt(24);
			varGrafitti = cs.getInt(25);
			varAtaqueSurpresa = cs.getInt(26);
			varMalandragem = cs.getInt(27);
			varRapto = cs.getInt(28);
			varTunelDeFuga = cs.getInt(29);
			varPericiaComEspada = cs.getInt(30);
			varOlhosDeAguia = cs.getInt(31);

			varInstintoDeDefesa = cs.getInt(32);
			varRemocaoTotal = cs.getInt(33);
			varEspreitar = cs.getInt(34);
			varPreservar = cs.getInt(35);

			varSedeDeSangue = cs.getInt(36);
			varBorrifarTinta = cs.getInt(37);
			varSimboloDoCaos = cs.getInt(38);
			varPestilencia = cs.getInt(39);
			varPortaDimensional = cs.getInt(40);
			varRemoverAcessorio = cs.getInt(41);
			varAcertoDeContas = cs.getInt(42);
			varCopiaExplosiva = cs.getInt(43);
			varFormaEterea = cs.getInt(44);
			varRedemoinhoDeAbsorcao = cs.getInt(45);
			varPintarArmadilha = cs.getInt(46);
			varMascaraDaFraqueza = cs.getInt(47);
			varMascaraDaMelancolia = cs.getInt(48);
			varMascaraDaTolice = cs.getInt(49);
			varMascaraDaOciosidade = cs.getInt(50);
			varMascaraDaVulnerabilidade = cs.getInt(51);
			varMascaraDoInfortunio = cs.getInt(52);
			varMimetismo = cs.getInt(53);
			varVinculoSombrio = cs.getInt(54);
			varDesejoDasSombras = cs.getInt(55);
			varDisparoTriplo = cs.getInt(56);

			skillPrimeira = cs.getInt(57);
			skillSegunda = cs.getInt(58);
			skillTrans = cs.getInt(59);
			skillTerceira = cs.getInt(60);
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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS renegado (");
					sqlClasse.append("_id INTEGER PRIMARY KEY, ");
					sqlClasse.append("nome VARCHAR(30), ");
					sqlClasse.append("primeira_classe INT(2), ");
					sqlClasse.append("segunda_classe INT(2), ");
					sqlClasse.append("trans_classe INT(2), ");
					sqlClasse.append("terceira_classe INT(2), ");
					sqlClasse.append("skill_envenenar INT(2), ");
					sqlClasse.append("skill_desintoxicar INT(2), ");
					sqlClasse.append("skill_ataqueduplo INT(2), ");
					sqlClasse.append("skill_periciaemesquiva INT(2), ");
					sqlClasse.append("skill_furto INT(2), ");
					sqlClasse.append("skill_esconderijo INT(2), ");
					sqlClasse.append("skill_apunhalar INT(2), ");
					sqlClasse.append("skill_removerarmadura INT(2), ");
					sqlClasse.append("skill_removercapacete INT(2), ");
					sqlClasse.append("skill_removerescudo INT(2), ");
					sqlClasse.append("skill_removerarma INT(2), ");
					sqlClasse.append("skill_rajadadeflechas INT(2), ");
					sqlClasse.append("skill_maosleves INT(2), ");
					sqlClasse.append("skill_extorquir INT(2), ");
					sqlClasse.append("skill_plagio INT(2), ");
					sqlClasse.append("skill_afanar INT(2), ");
					sqlClasse.append("skill_pichar INT(2), ");
					sqlClasse.append("skill_removerarmadilha INT(2), ");
					sqlClasse.append("skill_faxina INT(2), ");
					sqlClasse.append("skill_grafitti INT(2), ");
					sqlClasse.append("skill_ataquesurpresa INT(2), ");
					sqlClasse.append("skill_malandragem INT(2), ");
					sqlClasse.append("skill_rapto INT(2), ");
					sqlClasse.append("skill_tuneldefuga INT(2), ");
					sqlClasse.append("skill_periciacomespada INT(2), ");
					sqlClasse.append("skill_olhosdeaguia INT(2), ");
					sqlClasse.append("skill_instintodedefesa INT(2), ");
					sqlClasse.append("skill_remocaototal INT(2), ");
					sqlClasse.append("skill_espreitar INT(2), ");
					sqlClasse.append("skill_preservar INT(2), ");
					sqlClasse.append("skill_sededesangue INT(2), ");
					sqlClasse.append("skill_borrifartinta INT(2), ");
					sqlClasse.append("skill_simbolodocaos INT(2), ");
					sqlClasse.append("skill_pestilencia INT(2), ");
					sqlClasse.append("skill_portadimensional INT(2), ");
					sqlClasse.append("skill_removeracessorio INT(2), ");
					sqlClasse.append("skill_acertodecontas INT(2), ");
					sqlClasse.append("skill_copiaexplosiva INT(2), ");
					sqlClasse.append("skill_formaeterea INT(2), ");
					sqlClasse.append("skill_redemoinhodeabsorcao INT(2), ");
					sqlClasse.append("skill_pintararmadilha INT(2), ");
					sqlClasse.append("skill_mascaradafraqueza INT(2), ");
					sqlClasse.append("skill_mascaradamelancolia INT(2), ");
					sqlClasse.append("skill_mascaradatolice INT(2), ");
					sqlClasse.append("skill_mascaradaociosidade INT(2), ");
					sqlClasse.append("skill_mascaradavulnerabilidade INT(2), ");
					sqlClasse.append("skill_mascaradoinfortunio INT(2), ");
					sqlClasse.append("skill_mimetismo INT(2), ");
					sqlClasse.append("skill_vinculosombrio INT(2), ");
					sqlClasse.append("skill_desejodassombras INT(2), ");
					sqlClasse.append("skill_disparotriplo INT(2), ");
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
					ins.put("skill_envenenar", varEnvenenar);
					ins.put("skill_desintoxicar", varDesintoxicar);
					ins.put("skill_ataqueduplo", varAtaqueDuplo);
					ins.put("skill_periciaemesquiva", varPericiaEmEsquiva);
					ins.put("skill_furto", varFurto);
					ins.put("skill_esconderijo", varEsconderijo);
					ins.put("skill_apunhalar", varApunhalar);
					ins.put("skill_removerarmadura", varRemoverArmadura);
					ins.put("skill_removercapacete", varRemoverCapacete);
					ins.put("skill_removerescudo", varRemoverEscudo);
					ins.put("skill_removerarma", varRemoverArma);
					ins.put("skill_rajadadeflechas", varRajadaDeFlechas);
					ins.put("skill_maosleves", varMaosLeves);
					ins.put("skill_extorquir", varExtorquir);
					ins.put("skill_plagio", varPlagio);
					ins.put("skill_afanar", varAfanar);
					ins.put("skill_pichar", varPichar);
					ins.put("skill_removerarmadilha", varRemoverArmadilha);
					ins.put("skill_faxina", varFaxina);
					ins.put("skill_grafitti", varGrafitti);
					ins.put("skill_ataquesurpresa", varAtaqueSurpresa);
					ins.put("skill_malandragem", varMalandragem);
					ins.put("skill_rapto", varRapto);
					ins.put("skill_tuneldefuga", varTunelDeFuga);
					ins.put("skill_periciacomespada", varPericiaComEspada);
					ins.put("skill_olhosdeaguia", varOlhosDeAguia);
					ins.put("skill_instintodedefesa", varInstintoDeDefesa);
					ins.put("skill_remocaototal", varRemocaoTotal);
					ins.put("skill_espreitar", varEspreitar);
					ins.put("skill_preservar", varPreservar);
					ins.put("skill_sededesangue", varSedeDeSangue);
					ins.put("skill_borrifartinta", varBorrifarTinta);
					ins.put("skill_simbolodocaos", varSimboloDoCaos);
					ins.put("skill_pestilencia", varPestilencia);
					ins.put("skill_portadimensional", varPortaDimensional);
					ins.put("skill_removeracessorio", varRemoverAcessorio);
					ins.put("skill_acertodecontas", varAcertoDeContas);
					ins.put("skill_copiaexplosiva", varCopiaExplosiva);
					ins.put("skill_formaeterea", varFormaEterea);
					ins.put("skill_redemoinhodeabsorcao", varRedemoinhoDeAbsorcao);
					ins.put("skill_pintararmadilha", varPintarArmadilha);
					ins.put("skill_mascaradafraqueza", varMascaraDaFraqueza);
					ins.put("skill_mascaradamelancolia", varMascaraDaMelancolia);
					ins.put("skill_mascaradatolice", varMascaraDaTolice);
					ins.put("skill_mascaradaociosidade", varMascaraDaOciosidade);
					ins.put("skill_mascaradavulnerabilidade", varMascaraDaVulnerabilidade);
					ins.put("skill_mascaradoinfortunio", varMascaraDoInfortunio);
					ins.put("skill_mimetismo", varMimetismo);
					ins.put("skill_vinculosombrio", varVinculoSombrio);
					ins.put("skill_desejodassombras", varDesejoDasSombras);
					ins.put("skill_disparotriplo", varDisparoTriplo);
					ins.put("skill_primeira", skillPrimeira);
					ins.put("skill_segunda", skillSegunda);
					ins.put("skill_trans", skillTrans);
					ins.put("skill_terceira", skillTerceira);
					if(!novo){
						try {
							db.update("renegado", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("renegado", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from renegado", null);
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
						ins2.put("classe", "renegado");
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
			getMenuInflater().inflate(R.menu.simulador_renegado, menu);
			return true;
		}

	}