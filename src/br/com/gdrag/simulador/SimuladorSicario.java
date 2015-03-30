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

public class SimuladorSicario extends Activity {

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
		btPericiaComKatarInterrogacao,
		btPericiaComMaoEsquerdaInterrogacao,
		btPericiaComMaoDireitaInterrogacao,
		btLaminasDestruidorasInterrogacao,
		btFurtividadeInterrogacao,
		btTocaiaInterrogacao,
		btEnvenenarArmaInterrogacao,
		btRefletirVenenoInterrogacao,
		btNevoaToxicaInterrogacao,
		btExplosaoToxicaInterrogacao,
		btFacaEnvenenadaInterrogacao,
		btLaminasAceleradasInterrogacao,
		btImpactoMeteoroInterrogacao,
		btPericiaComKatarAvancadaInterrogacao,
		btCriarVenenoMortalInterrogacao,
		btEncantarComVenenoMortalInterrogacao,
		btDestruidorDeAlmasInterrogacao,
		btPesquisaDeToxinasInterrogacao,
		btCriarToxinaInterrogacao,
		btAplicarAntidotoInterrogacao,
		btAplicarToxinaInterrogacao,
		btIntoxicarInterrogacao,
		btPotencializarVenenoInterrogacao,
		btNevoeiroToxicoInterrogacao,
		btOcultacaoInterrogacao,
		btPassosDaIlusaoInterrogacao,
		btPassoSombrioInterrogacao,
		btAmeacaFantasmaInterrogacao,
		btReflexoDeCombateInterrogacao,
		btEstilhacarArmaInterrogacao,
		btLaminasRetalhadorasInterrogacao,
		btLaminasDeLokiInterrogacao,
		btCastigoDeLokiInterrogacao,
		btRetaliacaoInterrogacao;

		//Botões de diminuir habilidades
		Button btEnvenenarDiminuir,
		btDesintoxicarDiminuir,
		btAtaqueDuploDiminuir,
		btPericiaEmEsquivaDiminuir,
		btFurtoDiminuir,
		btEsconderijoDiminuir,
		btPericiaComKatarDiminuir,
		btPericiaComMaoEsquerdaDiminuir,
		btPericiaComMaoDireitaDiminuir,
		btLaminasDestruidorasDiminuir,
		btFurtividadeDiminuir,
		btTocaiaDiminuir,
		btEnvenenarArmaDiminuir,
		btRefletirVenenoDiminuir,
		btNevoaToxicaDiminuir,
		btExplosaoToxicaDiminuir,
		btImpactoMeteoroDiminuir,
		btPericiaComKatarAvancadaDiminuir,
		btCriarVenenoMortalDiminuir,
		btEncantarComVenenoMortalDiminuir,
		btDestruidorDeAlmasDiminuir,
		btPesquisaDeToxinasDiminuir,
		btCriarToxinaDiminuir,
		btAplicarAntidotoDiminuir,
		btAplicarToxinaDiminuir,
		btIntoxicarDiminuir,
		btPotencializarVenenoDiminuir,
		btNevoeiroToxicoDiminuir,
		btOcultacaoDiminuir,
		btPassosDaIlusaoDiminuir,
		btPassoSombrioDiminuir,
		btAmeacaFantasmaDiminuir,
		btReflexoDeCombateDiminuir,
		btEstilhacarArmaDiminuir,
		btLaminasRetalhadorasDiminuir,
		btLaminasDeLokiDiminuir,
		btCastigoDeLokiDiminuir,
		btRetaliacaoDiminuir;

		//Botões de aumentar habilidades
		Button btEnvenenarAumentar,
		btDesintoxicarAumentar,
		btAtaqueDuploAumentar,
		btPericiaEmEsquivaAumentar,
		btFurtoAumentar,
		btEsconderijoAumentar,
		btPericiaComKatarAumentar,
		btPericiaComMaoEsquerdaAumentar,
		btPericiaComMaoDireitaAumentar,
		btLaminasDestruidorasAumentar,
		btFurtividadeAumentar,
		btTocaiaAumentar,
		btEnvenenarArmaAumentar,
		btRefletirVenenoAumentar,
		btNevoaToxicaAumentar,
		btExplosaoToxicaAumentar,
		btImpactoMeteoroAumentar,
		btPericiaComKatarAvancadaAumentar,
		btCriarVenenoMortalAumentar,
		btEncantarComVenenoMortalAumentar,
		btDestruidorDeAlmasAumentar,
		btPesquisaDeToxinasAumentar,
		btCriarToxinaAumentar,
		btAplicarAntidotoAumentar,
		btAplicarToxinaAumentar,
		btIntoxicarAumentar,
		btPotencializarVenenoAumentar,
		btNevoeiroToxicoAumentar,
		btOcultacaoAumentar,
		btPassosDaIlusaoAumentar,
		btPassoSombrioAumentar,
		btAmeacaFantasmaAumentar,
		btReflexoDeCombateAumentar,
		btEstilhacarArmaAumentar,
		btLaminasRetalhadorasAumentar,
		btLaminasDeLokiAumentar,
		btCastigoDeLokiAumentar,
		btRetaliacaoAumentar;

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
		txtPericiaComKatarPontos,
		txtPericiaComMaoEsquerdaPontos,
		txtPericiaComMaoDireitaPontos,
		txtLaminasDestruidorasPontos,
		txtFurtividadePontos,
		txtTocaiaPontos,
		txtEnvenenarArmaPontos,
		txtRefletirVenenoPontos,
		txtNevoaToxicaPontos,
		txtExplosaoToxicaPontos,
		txtImpactoMeteoroPontos,
		txtPericiaComKatarAvancadaPontos,
		txtCriarVenenoMortalPontos,
		txtEncantarComVenenoMortalPontos,
		txtDestruidorDeAlmasPontos,
		txtPesquisaDeToxinasPontos,
		txtCriarToxinaPontos,
		txtAplicarAntidotoPontos,
		txtAplicarToxinaPontos,
		txtIntoxicarPontos,
		txtPotencializarVenenoPontos,
		txtNevoeiroToxicoPontos,
		txtOcultacaoPontos,
		txtPassosDaIlusaoPontos,
		txtPassoSombrioPontos,
		txtAmeacaFantasmaPontos,
		txtReflexoDeCombatePontos,
		txtEstilhacarArmaPontos,
		txtLaminasRetalhadorasPontos,
		txtLaminasDeLokiPontos,
		txtCastigoDeLokiPontos,
		txtRetaliacaoPontos;

		//Txt pontos restantes
		TextView txtClasse1, txtClasse2, txtTransClasse, txtClasse3;

		//Layouts
		LinearLayout layEnvenenar,
		layDesintoxicar,
		layAtaqueDuplo,
		layPericiaEmEsquiva,
		layFurto,
		layEsconderijo,
		layPericiaComKatar,
		layPericiaComMaoEsquerda,
		layPericiaComMaoDireita,
		layLaminasDestruidoras,
		layFurtividade,
		layTocaia,
		layEnvenenarArma,
		layRefletirVeneno,
		layNevoaToxica,
		layExplosaoToxica,
		layImpactoMeteoro,
		layPericiaComKatarAvancada,
		layCriarVenenoMortal,
		layEncantarComVenenoMortal,
		layDestruidorDeAlmas,
		layPesquisaDeToxinas,
		layCriarToxina,
		layAplicarAntidoto,
		layAplicarToxina,
		layIntoxicar,
		layPotencializarVeneno,
		layNevoeiroToxico,
		layOcultacao,
		layPassosDaIlusao,
		layPassoSombrio,
		layAmeacaFantasma,
		layReflexoDeCombate,
		layEstilhacarArma,
		layLaminasRetalhadoras,
		layLaminasDeLoki,
		layCastigoDeLoki,
		layRetaliacao;

		//Variaveis de Skill
		int varEnvenenar,
		varDesintoxicar,
		varAtaqueDuplo,
		varPericiaEmEsquiva,
		varFurto,
		varEsconderijo,
		varPericiaComKatar,
		varPericiaComMaoEsquerda,
		varPericiaComMaoDireita,
		varLaminasDestruidoras,
		varFurtividade,
		varTocaia,
		varEnvenenarArma,
		varRefletirVeneno,
		varNevoaToxica,
		varExplosaoToxica,
		varImpactoMeteoro,
		varPericiaComKatarAvancada,
		varCriarVenenoMortal,
		varEncantarComVenenoMortal,
		varDestruidorDeAlmas,
		varPesquisaDeToxinas,
		varCriarToxina,
		varAplicarAntidoto,
		varAplicarToxina,
		varIntoxicar,
		varPotencializarVeneno,
		varNevoeiroToxico,
		varOcultacao,
		varPassosDaIlusao,
		varPassoSombrio,
		varAmeacaFantasma,
		varReflexoDeCombate,
		varEstilhacarArma,
		varLaminasRetalhadoras,
		varLaminasDeLoki,
		varCastigoDeLoki,
		varRetaliacao;

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
			setContentView(R.layout.activity_simulador_sicario);

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
			varPericiaComKatar = 0;
			varPericiaComMaoEsquerda = 0;
			varPericiaComMaoDireita = 0;
			varLaminasDestruidoras = 0;
			varFurtividade = 0;
			varTocaia = 0;
			varEnvenenarArma = 0;
			varRefletirVeneno = 0;
			varNevoaToxica = 0;
			varExplosaoToxica = 0;
			varImpactoMeteoro = 0;
			varPericiaComKatarAvancada = 0;
			varCriarVenenoMortal = 0;
			varEncantarComVenenoMortal = 0;
			varDestruidorDeAlmas = 0;
			varPesquisaDeToxinas = 0;
			varCriarToxina = 0;
			varAplicarAntidoto = 0;
			varAplicarToxina = 0;
			varIntoxicar = 0;
			varPotencializarVeneno = 0;
			varNevoeiroToxico = 0;
			varOcultacao = 0;
			varPassosDaIlusao = 0;
			varPassoSombrio = 0;
			varAmeacaFantasma = 0;
			varReflexoDeCombate = 0;
			varEstilhacarArma = 0;
			varLaminasRetalhadoras = 0;
			varLaminasDeLoki = 0;
			varCastigoDeLoki = 0;
			varRetaliacao = 0;



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
			btPericiaComKatarInterrogacao = (Button) findViewById(R.id.btPericiaComKatarInterrogacao);
			btPericiaComMaoEsquerdaInterrogacao = (Button) findViewById(R.id.btPericiaComMaoEsquerdaInterrogacao);
			btPericiaComMaoDireitaInterrogacao = (Button) findViewById(R.id.btPericiaComMaoDireitaInterrogacao);
			btLaminasDestruidorasInterrogacao = (Button) findViewById(R.id.btLaminasDestruidorasInterrogacao);
			btFurtividadeInterrogacao = (Button) findViewById(R.id.btFurtividadeInterrogacao);
			btTocaiaInterrogacao = (Button) findViewById(R.id.btTocaiaInterrogacao);
			btEnvenenarArmaInterrogacao = (Button) findViewById(R.id.btEnvenenarArmaInterrogacao);
			btRefletirVenenoInterrogacao = (Button) findViewById(R.id.btRefletirVenenoInterrogacao);
			btNevoaToxicaInterrogacao = (Button) findViewById(R.id.btNevoaToxicaInterrogacao);
			btExplosaoToxicaInterrogacao = (Button) findViewById(R.id.btExplosaoToxicaInterrogacao);
			btFacaEnvenenadaInterrogacao = (Button) findViewById(R.id.btFacaEnvenenadaInterrogacao);
			btLaminasAceleradasInterrogacao = (Button) findViewById(R.id.btLaminasAceleradasInterrogacao);
			btImpactoMeteoroInterrogacao = (Button) findViewById(R.id.btImpactoMeteoroInterrogacao);
			btPericiaComKatarAvancadaInterrogacao = (Button) findViewById(R.id.btPericiaComKatarAvancadaInterrogacao);
			btCriarVenenoMortalInterrogacao = (Button) findViewById(R.id.btCriarVenenoMortalInterrogacao);
			btEncantarComVenenoMortalInterrogacao = (Button) findViewById(R.id.btEncantarComVenenoMortalInterrogacao);
			btDestruidorDeAlmasInterrogacao = (Button) findViewById(R.id.btDestruidorDeAlmasInterrogacao);
			btPesquisaDeToxinasInterrogacao = (Button) findViewById(R.id.btPesquisaDeToxinasInterrogacao);
			btCriarToxinaInterrogacao = (Button) findViewById(R.id.btCriarToxinaInterrogacao);
			btAplicarAntidotoInterrogacao = (Button) findViewById(R.id.btAplicarAntidotoInterrogacao);
			btAplicarToxinaInterrogacao = (Button) findViewById(R.id.btAplicarToxinaInterrogacao);
			btIntoxicarInterrogacao = (Button) findViewById(R.id.btIntoxicarInterrogacao);
			btPotencializarVenenoInterrogacao = (Button) findViewById(R.id.btPotencializarVenenoInterrogacao);
			btNevoeiroToxicoInterrogacao = (Button) findViewById(R.id.btNevoeiroToxicoInterrogacao);
			btOcultacaoInterrogacao = (Button) findViewById(R.id.btOcultacaoInterrogacao);
			btPassosDaIlusaoInterrogacao = (Button) findViewById(R.id.btPassosDaIlusaoInterrogacao);
			btPassoSombrioInterrogacao = (Button) findViewById(R.id.btPassoSombrioInterrogacao);
			btAmeacaFantasmaInterrogacao = (Button) findViewById(R.id.btAmeacaFantasmaInterrogacao);
			btReflexoDeCombateInterrogacao = (Button) findViewById(R.id.btReflexoDeCombateInterrogacao);
			btEstilhacarArmaInterrogacao = (Button) findViewById(R.id.btEstilhacarArmaInterrogacao);
			btLaminasRetalhadorasInterrogacao = (Button) findViewById(R.id.btLaminasRetalhadorasInterrogacao);
			btLaminasDeLokiInterrogacao = (Button) findViewById(R.id.btLaminasDeLokiInterrogacao);
			btCastigoDeLokiInterrogacao = (Button) findViewById(R.id.btCastigoDeLokiInterrogacao);
			btRetaliacaoInterrogacao = (Button) findViewById(R.id.btRetaliacaoInterrogacao);

			//Botões de diminuir habilidades
			btEnvenenarDiminuir = (Button) findViewById(R.id.btEnvenenarDiminuir);
			btDesintoxicarDiminuir = (Button) findViewById(R.id.btDesintoxicarDiminuir);
			btAtaqueDuploDiminuir = (Button) findViewById(R.id.btAtaqueDuploDiminuir);
			btPericiaEmEsquivaDiminuir = (Button) findViewById(R.id.btPericiaEmEsquivaDiminuir);
			btFurtoDiminuir = (Button) findViewById(R.id.btFurtoDiminuir);
			btEsconderijoDiminuir = (Button) findViewById(R.id.btEsconderijoDiminuir);
			btPericiaComKatarDiminuir = (Button) findViewById(R.id.btPericiaComKatarDiminuir);
			btPericiaComMaoEsquerdaDiminuir = (Button) findViewById(R.id.btPericiaComMaoEsquerdaDiminuir);
			btPericiaComMaoDireitaDiminuir = (Button) findViewById(R.id.btPericiaComMaoDireitaDiminuir);
			btLaminasDestruidorasDiminuir = (Button) findViewById(R.id.btLaminasDestruidorasDiminuir);
			btFurtividadeDiminuir = (Button) findViewById(R.id.btFurtividadeDiminuir);
			btTocaiaDiminuir = (Button) findViewById(R.id.btTocaiaDiminuir);
			btEnvenenarArmaDiminuir = (Button) findViewById(R.id.btEnvenenarArmaDiminuir);
			btRefletirVenenoDiminuir = (Button) findViewById(R.id.btRefletirVenenoDiminuir);
			btNevoaToxicaDiminuir = (Button) findViewById(R.id.btNevoaToxicaDiminuir);
			btExplosaoToxicaDiminuir = (Button) findViewById(R.id.btExplosaoToxicaDiminuir);
			btImpactoMeteoroDiminuir = (Button) findViewById(R.id.btImpactoMeteoroDiminuir);
			btPericiaComKatarAvancadaDiminuir = (Button) findViewById(R.id.btPericiaComKatarAvancadaDiminuir);
			btCriarVenenoMortalDiminuir = (Button) findViewById(R.id.btCriarVenenoMortalDiminuir);
			btEncantarComVenenoMortalDiminuir = (Button) findViewById(R.id.btEncantarComVenenoMortalDiminuir);
			btDestruidorDeAlmasDiminuir = (Button) findViewById(R.id.btDestruidorDeAlmasDiminuir);
			btPesquisaDeToxinasDiminuir = (Button) findViewById(R.id.btPesquisaDeToxinasDiminuir);
			btCriarToxinaDiminuir = (Button) findViewById(R.id.btCriarToxinaDiminuir);
			btAplicarAntidotoDiminuir = (Button) findViewById(R.id.btAplicarAntidotoDiminuir);
			btAplicarToxinaDiminuir = (Button) findViewById(R.id.btAplicarToxinaDiminuir);
			btIntoxicarDiminuir = (Button) findViewById(R.id.btIntoxicarDiminuir);
			btPotencializarVenenoDiminuir = (Button) findViewById(R.id.btPotencializarVenenoDiminuir);
			btNevoeiroToxicoDiminuir = (Button) findViewById(R.id.btNevoeiroToxicoDiminuir);
			btOcultacaoDiminuir = (Button) findViewById(R.id.btOcultacaoDiminuir);
			btPassosDaIlusaoDiminuir = (Button) findViewById(R.id.btPassosDaIlusaoDiminuir);
			btPassoSombrioDiminuir = (Button) findViewById(R.id.btPassoSombrioDiminuir);
			btAmeacaFantasmaDiminuir = (Button) findViewById(R.id.btAmeacaFantasmaDiminuir);
			btReflexoDeCombateDiminuir = (Button) findViewById(R.id.btReflexoDeCombateDiminuir);
			btEstilhacarArmaDiminuir = (Button) findViewById(R.id.btEstilhacarArmaDiminuir);
			btLaminasRetalhadorasDiminuir = (Button) findViewById(R.id.btLaminasRetalhadorasDiminuir);
			btLaminasDeLokiDiminuir = (Button) findViewById(R.id.btLaminasDeLokiDiminuir);
			btCastigoDeLokiDiminuir = (Button) findViewById(R.id.btCastigoDeLokiDiminuir);
			btRetaliacaoDiminuir = (Button) findViewById(R.id.btRetaliacaoDiminuir);

			//Botões de aumentar habilidades
			btEnvenenarAumentar = (Button) findViewById(R.id.btEnvenenarAumentar);
			btDesintoxicarAumentar = (Button) findViewById(R.id.btDesintoxicarAumentar);
			btAtaqueDuploAumentar = (Button) findViewById(R.id.btAtaqueDuploAumentar);
			btPericiaEmEsquivaAumentar = (Button) findViewById(R.id.btPericiaEmEsquivaAumentar);
			btFurtoAumentar = (Button) findViewById(R.id.btFurtoAumentar);
			btEsconderijoAumentar = (Button) findViewById(R.id.btEsconderijoAumentar);
			btPericiaComKatarAumentar = (Button) findViewById(R.id.btPericiaComKatarAumentar);
			btPericiaComMaoEsquerdaAumentar = (Button) findViewById(R.id.btPericiaComMaoEsquerdaAumentar);
			btPericiaComMaoDireitaAumentar = (Button) findViewById(R.id.btPericiaComMaoDireitaAumentar);
			btLaminasDestruidorasAumentar = (Button) findViewById(R.id.btLaminasDestruidorasAumentar);
			btFurtividadeAumentar = (Button) findViewById(R.id.btFurtividadeAumentar);
			btTocaiaAumentar = (Button) findViewById(R.id.btTocaiaAumentar);
			btEnvenenarArmaAumentar = (Button) findViewById(R.id.btEnvenenarArmaAumentar);
			btRefletirVenenoAumentar = (Button) findViewById(R.id.btRefletirVenenoAumentar);
			btNevoaToxicaAumentar = (Button) findViewById(R.id.btNevoaToxicaAumentar);
			btExplosaoToxicaAumentar = (Button) findViewById(R.id.btExplosaoToxicaAumentar);
			btImpactoMeteoroAumentar = (Button) findViewById(R.id.btImpactoMeteoroAumentar);
			btPericiaComKatarAvancadaAumentar = (Button) findViewById(R.id.btPericiaComKatarAvancadaAumentar);
			btCriarVenenoMortalAumentar = (Button) findViewById(R.id.btCriarVenenoMortalAumentar);
			btEncantarComVenenoMortalAumentar = (Button) findViewById(R.id.btEncantarComVenenoMortalAumentar);
			btDestruidorDeAlmasAumentar = (Button) findViewById(R.id.btDestruidorDeAlmasAumentar);
			btPesquisaDeToxinasAumentar = (Button) findViewById(R.id.btPesquisaDeToxinasAumentar);
			btCriarToxinaAumentar = (Button) findViewById(R.id.btCriarToxinaAumentar);
			btAplicarAntidotoAumentar = (Button) findViewById(R.id.btAplicarAntidotoAumentar);
			btAplicarToxinaAumentar = (Button) findViewById(R.id.btAplicarToxinaAumentar);
			btIntoxicarAumentar = (Button) findViewById(R.id.btIntoxicarAumentar);
			btPotencializarVenenoAumentar = (Button) findViewById(R.id.btPotencializarVenenoAumentar);
			btNevoeiroToxicoAumentar = (Button) findViewById(R.id.btNevoeiroToxicoAumentar);
			btOcultacaoAumentar = (Button) findViewById(R.id.btOcultacaoAumentar);
			btPassosDaIlusaoAumentar = (Button) findViewById(R.id.btPassosDaIlusaoAumentar);
			btPassoSombrioAumentar = (Button) findViewById(R.id.btPassoSombrioAumentar);
			btAmeacaFantasmaAumentar = (Button) findViewById(R.id.btAmeacaFantasmaAumentar);
			btReflexoDeCombateAumentar = (Button) findViewById(R.id.btReflexoDeCombateAumentar);
			btEstilhacarArmaAumentar = (Button) findViewById(R.id.btEstilhacarArmaAumentar);
			btLaminasRetalhadorasAumentar = (Button) findViewById(R.id.btLaminasRetalhadorasAumentar);
			btLaminasDeLokiAumentar = (Button) findViewById(R.id.btLaminasDeLokiAumentar);
			btCastigoDeLokiAumentar = (Button) findViewById(R.id.btCastigoDeLokiAumentar);
			btRetaliacaoAumentar = (Button) findViewById(R.id.btRetaliacaoAumentar);

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
			txtPericiaComKatarPontos = (TextView) findViewById(R.id.txtPericiaComKatarPontos);
			txtPericiaComMaoEsquerdaPontos = (TextView) findViewById(R.id.txtPericiaComMaoEsquerdaPontos);
			txtPericiaComMaoDireitaPontos = (TextView) findViewById(R.id.txtPericiaComMaoDireitaPontos);
			txtLaminasDestruidorasPontos = (TextView) findViewById(R.id.txtLaminasDestruidorasPontos);
			txtFurtividadePontos = (TextView) findViewById(R.id.txtFurtividadePontos);
			txtTocaiaPontos = (TextView) findViewById(R.id.txtTocaiaPontos);
			txtEnvenenarArmaPontos = (TextView) findViewById(R.id.txtEnvenenarArmaPontos);
			txtRefletirVenenoPontos = (TextView) findViewById(R.id.txtRefletirVenenoPontos);
			txtNevoaToxicaPontos = (TextView) findViewById(R.id.txtNevoaToxicaPontos);
			txtExplosaoToxicaPontos = (TextView) findViewById(R.id.txtExplosaoToxicaPontos);
			txtImpactoMeteoroPontos = (TextView) findViewById(R.id.txtImpactoMeteoroPontos);
			txtPericiaComKatarAvancadaPontos = (TextView) findViewById(R.id.txtPericiaComKatarAvancadaPontos);
			txtCriarVenenoMortalPontos = (TextView) findViewById(R.id.txtCriarVenenoMortalPontos);
			txtEncantarComVenenoMortalPontos = (TextView) findViewById(R.id.txtEncantarComVenenoMortalPontos);
			txtDestruidorDeAlmasPontos = (TextView) findViewById(R.id.txtDestruidorDeAlmasPontos);
			txtPesquisaDeToxinasPontos = (TextView) findViewById(R.id.txtPesquisaDeToxinasPontos);
			txtCriarToxinaPontos = (TextView) findViewById(R.id.txtCriarToxinaPontos);
			txtAplicarAntidotoPontos = (TextView) findViewById(R.id.txtAplicarAntidotoPontos);
			txtAplicarToxinaPontos = (TextView) findViewById(R.id.txtAplicarToxinaPontos);
			txtIntoxicarPontos = (TextView) findViewById(R.id.txtIntoxicarPontos);
			txtPotencializarVenenoPontos = (TextView) findViewById(R.id.txtPotencializarVenenoPontos);
			txtNevoeiroToxicoPontos = (TextView) findViewById(R.id.txtNevoeiroToxicoPontos);
			txtOcultacaoPontos = (TextView) findViewById(R.id.txtOcultacaoPontos);
			txtPassosDaIlusaoPontos = (TextView) findViewById(R.id.txtPassosDaIlusaoPontos);
			txtPassoSombrioPontos = (TextView) findViewById(R.id.txtPassoSombrioPontos);
			txtAmeacaFantasmaPontos = (TextView) findViewById(R.id.txtAmeacaFantasmaPontos);
			txtReflexoDeCombatePontos = (TextView) findViewById(R.id.txtReflexoDeCombatePontos);
			txtEstilhacarArmaPontos = (TextView) findViewById(R.id.txtEstilhacarArmaPontos);
			txtLaminasRetalhadorasPontos = (TextView) findViewById(R.id.txtLaminasRetalhadorasPontos);
			txtLaminasDeLokiPontos = (TextView) findViewById(R.id.txtLaminasDeLokiPontos);
			txtCastigoDeLokiPontos = (TextView) findViewById(R.id.txtCastigoDeLokiPontos);
			txtRetaliacaoPontos = (TextView) findViewById(R.id.txtRetaliacaoPontos);

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
			layPericiaComKatar = (LinearLayout) findViewById(R.id.layPericiaComKatar);
			layPericiaComMaoEsquerda = (LinearLayout) findViewById(R.id.layPericiaComMaoEsquerda);
			layPericiaComMaoDireita = (LinearLayout) findViewById(R.id.layPericiaComMaoDireita);
			layLaminasDestruidoras = (LinearLayout) findViewById(R.id.layLaminasDestruidoras);
			layFurtividade = (LinearLayout) findViewById(R.id.layFurtividade);
			layTocaia = (LinearLayout) findViewById(R.id.layTocaia);
			layEnvenenarArma = (LinearLayout) findViewById(R.id.layEnvenenarArma);
			layRefletirVeneno = (LinearLayout) findViewById(R.id.layRefletirVeneno);
			layNevoaToxica = (LinearLayout) findViewById(R.id.layNevoaToxica);
			layExplosaoToxica = (LinearLayout) findViewById(R.id.layExplosaoToxica);
			layImpactoMeteoro = (LinearLayout) findViewById(R.id.layImpactoMeteoro);
			layPericiaComKatarAvancada = (LinearLayout) findViewById(R.id.layPericiaComKatarAvancada);
			layCriarVenenoMortal = (LinearLayout) findViewById(R.id.layCriarVenenoMortal);
			layEncantarComVenenoMortal = (LinearLayout) findViewById(R.id.layEncantarComVenenoMortal);
			layDestruidorDeAlmas = (LinearLayout) findViewById(R.id.layDestruidorDeAlmas);
			layPesquisaDeToxinas = (LinearLayout) findViewById(R.id.layPesquisaDeToxinas);
			layCriarToxina = (LinearLayout) findViewById(R.id.layCriarToxina);
			layAplicarAntidoto = (LinearLayout) findViewById(R.id.layAplicarAntidoto);
			layAplicarToxina = (LinearLayout) findViewById(R.id.layAplicarToxina);
			layIntoxicar = (LinearLayout) findViewById(R.id.layIntoxicar);
			layPotencializarVeneno = (LinearLayout) findViewById(R.id.layPotencializarVeneno);
			layNevoeiroToxico = (LinearLayout) findViewById(R.id.layNevoeiroToxico);
			layOcultacao = (LinearLayout) findViewById(R.id.layOcultacao);
			layPassosDaIlusao = (LinearLayout) findViewById(R.id.layPassosDaIlusao);
			layPassoSombrio = (LinearLayout) findViewById(R.id.layPassoSombrio);
			layAmeacaFantasma = (LinearLayout) findViewById(R.id.layAmeacaFantasma);
			layReflexoDeCombate = (LinearLayout) findViewById(R.id.layReflexoDeCombate);
			layEstilhacarArma = (LinearLayout) findViewById(R.id.layEstilhacarArma);
			layLaminasRetalhadoras = (LinearLayout) findViewById(R.id.layLaminasRetalhadoras);
			layLaminasDeLoki = (LinearLayout) findViewById(R.id.layLaminasDeLoki);
			layCastigoDeLoki = (LinearLayout) findViewById(R.id.layCastigoDeLoki);
			layRetaliacao = (LinearLayout) findViewById(R.id.layRetaliacao);

			if (id>0)
				recarregarBuild(id);


			//Eventos de informação
			btEnvenenarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Envenenar");
					dialogo.setMessage(R.string.envenenarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDesintoxicarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Desintoxicar");
					dialogo.setMessage(R.string.desintoxicarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueDuploInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Ataque Duplo");
					dialogo.setMessage(R.string.ataqueDuploInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaEmEsquivaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Perícia Em Esquiva");
					dialogo.setMessage(R.string.periciaEmEsquivaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFurtoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Furto");
					dialogo.setMessage(R.string.furtoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEsconderijoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Esconderijo");
					dialogo.setMessage(R.string.esconderijoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRecuarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Recuar");
					dialogo.setMessage(R.string.recuarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChutarAreiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Chutar Areia");
					dialogo.setMessage(R.string.chutarAreiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btProcurarPedrasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Procurar Pedras");
					dialogo.setMessage(R.string.procurarPedrasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArremessarPedraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Arremessar Pedra");
					dialogo.setMessage(R.string.arremessarPedrasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaComKatarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Perícia Com Katar");
					dialogo.setMessage(R.string.periciaComKatarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaComMaoEsquerdaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Perícia Com Mão Esquerda");
					dialogo.setMessage(R.string.periciaComMaoEsquerdaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaComMaoDireitaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Perícia Com Mão Direita");
					dialogo.setMessage(R.string.periciaComMaoDireitaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLaminasDestruidorasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Lâminas Destruidoras");
					dialogo.setMessage(R.string.laminasDestruidorasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFurtividadeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Furtividade");
					dialogo.setMessage(R.string.furtividadeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTocaiaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Tocaia");
					dialogo.setMessage(R.string.tocaiaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEnvenenarArmaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Envenenar Arma");
					dialogo.setMessage(R.string.envenenarArmaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRefletirVenenoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Refletir Veneno");
					dialogo.setMessage(R.string.refletirVenenoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btNevoaToxicaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Névoa Tóxica");
					dialogo.setMessage(R.string.nevoaToxicaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btExplosaoToxicaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Explosão Tóxica");
					dialogo.setMessage(R.string.explosaoToxicaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFacaEnvenenadaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Faca Envenenada");
					dialogo.setMessage(R.string.facaEnvenenadaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLaminasAceleradasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Lâminas Aceleradas");
					dialogo.setMessage(R.string.laminasAceleradasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btImpactoMeteoroInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Impacto Meteoro");
					dialogo.setMessage(R.string.impactoMeteoroInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaComKatarAvancadaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Perícia Com Katar Avançada");
					dialogo.setMessage(R.string.periciaComKatarAvancadaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCriarVenenoMortalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Criar Veneno Mortal");
					dialogo.setMessage(R.string.criarVenenoMortalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEncantarComVenenoMortalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Encantar Com Veneno Mortal");
					dialogo.setMessage(R.string.encantarComVenenoMortalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDestruidorDeAlmasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Destruidor De Almas");
					dialogo.setMessage(R.string.destruidorDeAlmasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPesquisaDeToxinasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Pesquisa De Toxinas");
					dialogo.setMessage(R.string.pesquisaDeToxinasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCriarToxinaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Criar Toxina");
					dialogo.setMessage(R.string.criarToxinaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAplicarAntidotoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Aplicar Antídoto");
					dialogo.setMessage(R.string.aplicarAntidotoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAplicarToxinaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Aplicar Toxina");
					dialogo.setMessage(R.string.aplicarToxinaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btIntoxicarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Intoxicar");
					dialogo.setMessage(R.string.intoxicarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPotencializarVenenoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Potencializar Veneno");
					dialogo.setMessage(R.string.potencializarVenenoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btNevoeiroToxicoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Nevoeiro Tóxico");
					dialogo.setMessage(R.string.nevoeiroToxicoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOcultacaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Ocultação");
					dialogo.setMessage(R.string.ocultacaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPassosDaIlusaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Passos Da Ilusão");
					dialogo.setMessage(R.string.passosDaIlusaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPassoSombrioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Passo Sombrio");
					dialogo.setMessage(R.string.passoSombrioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAmeacaFantasmaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Ameaça Fantasma");
					dialogo.setMessage(R.string.ameacaFantasmaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btReflexoDeCombateInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Reflexo De Combate");
					dialogo.setMessage(R.string.reflexoDeCombateInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEstilhacarArmaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Estilhaçar Arma");
					dialogo.setMessage(R.string.estilhacarArmaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLaminasRetalhadorasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Lâminas Retalhadoras");
					dialogo.setMessage(R.string.laminasRetalhadorasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLaminasDeLokiInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Lâminas De Loki");
					dialogo.setMessage(R.string.laminasDeLokiInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCastigoDeLokiInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Castigo De Loki");
					dialogo.setMessage(R.string.castigoDeLokiInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRetaliacaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorSicario.this);
					dialogo.setTitle("Retaliação");
					dialogo.setMessage(R.string.retaliacaoInfo);
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
			btPericiaComKatarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComKatar, "PericiaComKatar", 10, 2, "Aumentar");

				}
			});
			btPericiaComMaoEsquerdaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaComMaoDireita<2 && count<2){
						atualizarCalculo(varPericiaComMaoDireita, "PericiaComMaoDireita", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPericiaComMaoEsquerda, "PericiaComMaoEsquerda", 5, 2, "Aumentar");

				}
			});
			btPericiaComMaoDireitaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComMaoDireita, "PericiaComMaoDireita", 5, 2, "Aumentar");

				}
			});
			btLaminasDestruidorasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaComKatar<4 && count<4){
						atualizarCalculo(varPericiaComKatar, "PericiaComKatar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varLaminasDestruidoras, "LaminasDestruidoras", 10, 2, "Aumentar");

				}
			});
			btFurtividadeAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<5 && count<5){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsconderijo<2 && count<2){
						atualizarCalculo(varEsconderijo, "Esconderijo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFurtividade, "Furtividade", 10, 2, "Aumentar");

				}
			});
			btTocaiaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<5 && count<5){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsconderijo<2 && count<2){
						atualizarCalculo(varEsconderijo, "Esconderijo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurtividade<2 && count<2){
						atualizarCalculo(varFurtividade, "Furtividade", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComKatar<4 && count<4){
						atualizarCalculo(varPericiaComKatar, "PericiaComKatar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaminasDestruidoras<5 && count<5){
						atualizarCalculo(varLaminasDestruidoras, "LaminasDestruidoras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTocaia, "Tocaia", 5, 2, "Aumentar");

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
			btRefletirVenenoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEnvenenar<1 && count<1){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEnvenenarArma<3 && count<3){
						atualizarCalculo(varEnvenenarArma, "EnvenenarArma", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRefletirVeneno, "RefletirVeneno", 10, 2, "Aumentar");

				}
			});
			btNevoaToxicaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEnvenenar<1 && count<1){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEnvenenarArma<5 && count<5){
						atualizarCalculo(varEnvenenarArma, "EnvenenarArma", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varNevoaToxica, "NevoaToxica", 10, 2, "Aumentar");

				}
			});
			btExplosaoToxicaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEnvenenar<1 && count<1){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEnvenenarArma<3 && count<3){
						atualizarCalculo(varEnvenenarArma, "EnvenenarArma", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varRefletirVeneno<5 && count<5){
						atualizarCalculo(varRefletirVeneno, "RefletirVeneno", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEnvenenar<1 && count<1){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEnvenenarArma<5 && count<5){
						atualizarCalculo(varEnvenenarArma, "EnvenenarArma", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varNevoaToxica<5 && count<5){
						atualizarCalculo(varNevoaToxica, "NevoaToxica", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varExplosaoToxica, "ExplosaoToxica", 10, 2, "Aumentar");

				}
			});
			btImpactoMeteoroAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueDuplo<5 && count<5){
						atualizarCalculo(varAtaqueDuplo, "AtaqueDuplo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEnvenenar<5 && count<5){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<5 && count<5){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsconderijo<2 && count<2){
						atualizarCalculo(varEsconderijo, "Esconderijo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurtividade<3 && count<3){
						atualizarCalculo(varFurtividade, "Furtividade", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEnvenenar<1 && count<1){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEnvenenarArma<6 && count<6){
						atualizarCalculo(varEnvenenarArma, "EnvenenarArma", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDestruidorDeAlmas<1 && count<1){
						atualizarCalculo(varDestruidorDeAlmas, "DestruidorDeAlmas", 10, 3, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComKatar<4 && count<4){
						atualizarCalculo(varPericiaComKatar, "PericiaComKatar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaminasDestruidoras<5 && count<5){
						atualizarCalculo(varLaminasDestruidoras, "LaminasDestruidoras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComMaoDireita<3 && count<3){
						atualizarCalculo(varPericiaComMaoDireita, "PericiaComMaoDireita", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComKatar<5 && count<5){
						atualizarCalculo(varPericiaComKatar, "PericiaComKatar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varImpactoMeteoro, "ImpactoMeteoro", 10, 3, "Aumentar");

				}
			});
			btPericiaComKatarAvancadaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueDuplo<5 && count<5){
						atualizarCalculo(varAtaqueDuplo, "AtaqueDuplo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComKatar<7 && count<7){
						atualizarCalculo(varPericiaComKatar, "PericiaComKatar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPericiaComKatarAvancada, "PericiaComKatarAvancada", 5, 3, "Aumentar");

				}
			});
			btCriarVenenoMortalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEnvenenar<10 && count<10){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEnvenenar<3 && count<3){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesintoxicar<1 && count<1){
						atualizarCalculo(varDesintoxicar, "Desintoxicar", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCriarVenenoMortal, "CriarVenenoMortal", 1, 3, "Aumentar");

				}
			});
			btEncantarComVenenoMortalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEnvenenar<10 && count<10){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEnvenenar<3 && count<3){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varDesintoxicar<1 && count<1){
						atualizarCalculo(varDesintoxicar, "Desintoxicar", 1, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varCriarVenenoMortal<1 && count<1){
						atualizarCalculo(varCriarVenenoMortal, "CriarVenenoMortal", 1, 3, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEncantarComVenenoMortal, "EncantarComVenenoMortal", 5, 3, "Aumentar");

				}
			});
			btDestruidorDeAlmasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAtaqueDuplo<5 && count<5){
						atualizarCalculo(varAtaqueDuplo, "AtaqueDuplo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEnvenenar<5 && count<5){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurto<5 && count<5){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsconderijo<2 && count<2){
						atualizarCalculo(varEsconderijo, "Esconderijo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurtividade<3 && count<3){
						atualizarCalculo(varFurtividade, "Furtividade", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEnvenenar<1 && count<1){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEnvenenarArma<6 && count<6){
						atualizarCalculo(varEnvenenarArma, "EnvenenarArma", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDestruidorDeAlmas, "DestruidorDeAlmas", 10, 3, "Aumentar");

				}
			});
			btPesquisaDeToxinasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPesquisaDeToxinas, "PesquisaDeToxinas", 10, 4, "Aumentar");

				}
			});
			btCriarToxinaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDeToxinas<1 && count<1){
						atualizarCalculo(varPesquisaDeToxinas, "PesquisaDeToxinas", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCriarToxina, "CriarToxina", 1, 4, "Aumentar");

				}
			});
			btAplicarAntidotoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDeToxinas<5 && count<5){
						atualizarCalculo(varPesquisaDeToxinas, "PesquisaDeToxinas", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAplicarAntidoto, "AplicarAntidoto", 1, 4, "Aumentar");

				}
			});
			btAplicarToxinaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPesquisaDeToxinas<1 && count<1){
						atualizarCalculo(varPesquisaDeToxinas, "PesquisaDeToxinas", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCriarToxina<1 && count<1){
						atualizarCalculo(varCriarToxina, "CriarToxina", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAplicarToxina, "AplicarToxina", 5, 4, "Aumentar");

				}
			});
			btIntoxicarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaComMaoDireita<2 && count<2){
						atualizarCalculo(varPericiaComMaoDireita, "PericiaComMaoDireita", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComMaoEsquerda<5 && count<5){
						atualizarCalculo(varPericiaComMaoEsquerda, "PericiaComMaoEsquerda", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varReflexoDeCombate<1 && count<1){
						atualizarCalculo(varReflexoDeCombate, "ReflexoDeCombate", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPesquisaDeToxinas<1 && count<1){
						atualizarCalculo(varPesquisaDeToxinas, "PesquisaDeToxinas", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCriarToxina<1 && count<1){
						atualizarCalculo(varCriarToxina, "CriarToxina", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAplicarToxina<3 && count<3){
						atualizarCalculo(varAplicarToxina, "AplicarToxina", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varIntoxicar, "Intoxicar", 5, 4, "Aumentar");

				}
			});
			btPotencializarVenenoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEnvenenar<1 && count<1){
						atualizarCalculo(varEnvenenar, "Envenenar", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEnvenenarArma<3 && count<3){
						atualizarCalculo(varEnvenenarArma, "EnvenenarArma", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPotencializarVeneno, "PotencializarVeneno", 5, 4, "Aumentar");

				}
			});
			btNevoeiroToxicoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaComMaoDireita<2 && count<2){
						atualizarCalculo(varPericiaComMaoDireita, "PericiaComMaoDireita", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComMaoEsquerda<5 && count<5){
						atualizarCalculo(varPericiaComMaoEsquerda, "PericiaComMaoEsquerda", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varReflexoDeCombate<1 && count<1){
						atualizarCalculo(varReflexoDeCombate, "ReflexoDeCombate", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPesquisaDeToxinas<1 && count<1){
						atualizarCalculo(varPesquisaDeToxinas, "PesquisaDeToxinas", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCriarToxina<1 && count<1){
						atualizarCalculo(varCriarToxina, "CriarToxina", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAplicarToxina<3 && count<3){
						atualizarCalculo(varAplicarToxina, "AplicarToxina", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varIntoxicar<5 && count<5){
						atualizarCalculo(varIntoxicar, "Intoxicar", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPesquisaDeToxinas<1 && count<1){
						atualizarCalculo(varPesquisaDeToxinas, "PesquisaDeToxinas", 10, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varCriarToxina<1 && count<1){
						atualizarCalculo(varCriarToxina, "CriarToxina", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAplicarToxina<5 && count<5){
						atualizarCalculo(varAplicarToxina, "AplicarToxina", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varNevoeiroToxico, "NevoeiroToxico", 5, 4, "Aumentar");

				}
			});
			btOcultacaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<5 && count<5){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsconderijo<2 && count<2){
						atualizarCalculo(varEsconderijo, "Esconderijo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurtividade<3 && count<3){
						atualizarCalculo(varFurtividade, "Furtividade", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varOcultacao, "Ocultacao", 5, 4, "Aumentar");

				}
			});
			btPassosDaIlusaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<5 && count<5){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsconderijo<2 && count<2){
						atualizarCalculo(varEsconderijo, "Esconderijo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurtividade<3 && count<3){
						atualizarCalculo(varFurtividade, "Furtividade", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varOcultacao<5 && count<5){
						atualizarCalculo(varOcultacao, "Ocultacao", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComKatar<4 && count<4){
						atualizarCalculo(varPericiaComKatar, "PericiaComKatar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaminasDestruidoras<10 && count<10){
						atualizarCalculo(varLaminasDestruidoras, "LaminasDestruidoras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaminasRetalhadoras<3 && count<3){
						atualizarCalculo(varLaminasRetalhadoras, "LaminasRetalhadoras", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPassoSombrio<5 && count<5){
						atualizarCalculo(varPassoSombrio, "PassoSombrio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varAmeacaFantasma<1 && count<1){
						atualizarCalculo(varAmeacaFantasma, "AmeacaFantasma", 1, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPassosDaIlusao, "PassosDaIlusao", 5, 4, "Aumentar");

				}
			});
			btPassoSombrioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaComKatar<4 && count<4){
						atualizarCalculo(varPericiaComKatar, "PericiaComKatar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaminasDestruidoras<10 && count<10){
						atualizarCalculo(varLaminasDestruidoras, "LaminasDestruidoras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaminasRetalhadoras<3 && count<3){
						atualizarCalculo(varLaminasRetalhadoras, "LaminasRetalhadoras", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPassoSombrio, "PassoSombrio", 5, 4, "Aumentar");

				}
			});
			btAmeacaFantasmaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varFurto<5 && count<5){
						atualizarCalculo(varFurto, "Furto", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEsconderijo<2 && count<2){
						atualizarCalculo(varEsconderijo, "Esconderijo", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varFurtividade<3 && count<3){
						atualizarCalculo(varFurtividade, "Furtividade", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varOcultacao<5 && count<5){
						atualizarCalculo(varOcultacao, "Ocultacao", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComKatar<4 && count<4){
						atualizarCalculo(varPericiaComKatar, "PericiaComKatar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaminasDestruidoras<10 && count<10){
						atualizarCalculo(varLaminasDestruidoras, "LaminasDestruidoras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaminasRetalhadoras<3 && count<3){
						atualizarCalculo(varLaminasRetalhadoras, "LaminasRetalhadoras", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					while(varPassoSombrio<5 && count<5){
						atualizarCalculo(varPassoSombrio, "PassoSombrio", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAmeacaFantasma, "AmeacaFantasma", 1, 4, "Aumentar");

				}
			});
			btReflexoDeCombateAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaComMaoDireita<2 && count<2){
						atualizarCalculo(varPericiaComMaoDireita, "PericiaComMaoDireita", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComMaoEsquerda<5 && count<5){
						atualizarCalculo(varPericiaComMaoEsquerda, "PericiaComMaoEsquerda", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varReflexoDeCombate, "ReflexoDeCombate", 5, 4, "Aumentar");

				}
			});
			btEstilhacarArmaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaComMaoDireita<2 && count<2){
						atualizarCalculo(varPericiaComMaoDireita, "PericiaComMaoDireita", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComMaoEsquerda<5 && count<5){
						atualizarCalculo(varPericiaComMaoEsquerda, "PericiaComMaoEsquerda", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varReflexoDeCombate<1 && count<1){
						atualizarCalculo(varReflexoDeCombate, "ReflexoDeCombate", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEstilhacarArma, "EstilhacarArma", 5, 4, "Aumentar");

				}
			});
			btLaminasRetalhadorasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaComKatar<4 && count<4){
						atualizarCalculo(varPericiaComKatar, "PericiaComKatar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaminasDestruidoras<10 && count<10){
						atualizarCalculo(varLaminasDestruidoras, "LaminasDestruidoras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varLaminasRetalhadoras, "LaminasRetalhadoras", 5, 4, "Aumentar");

				}
			});
			btLaminasDeLokiAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaComKatar<4 && count<4){
						atualizarCalculo(varPericiaComKatar, "PericiaComKatar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaminasDestruidoras<10 && count<10){
						atualizarCalculo(varLaminasDestruidoras, "LaminasDestruidoras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varLaminasDeLoki, "LaminasDeLoki", 5, 4, "Aumentar");

				}
			});
			btCastigoDeLokiAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaComKatar<4 && count<4){
						atualizarCalculo(varPericiaComKatar, "PericiaComKatar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaminasDestruidoras<10 && count<10){
						atualizarCalculo(varLaminasDestruidoras, "LaminasDestruidoras", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaminasDeLoki<1 && count<1){
						atualizarCalculo(varLaminasDeLoki, "LaminasDeLoki", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCastigoDeLoki, "CastigoDeLoki", 5, 4, "Aumentar");

				}
			});
			btRetaliacaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaComMaoDireita<2 && count<2){
						atualizarCalculo(varPericiaComMaoDireita, "PericiaComMaoDireita", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaComMaoEsquerda<5 && count<5){
						atualizarCalculo(varPericiaComMaoEsquerda, "PericiaComMaoEsquerda", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varReflexoDeCombate<1 && count<1){
						atualizarCalculo(varReflexoDeCombate, "ReflexoDeCombate", 5, 4, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRetaliacao, "Retaliacao", 5, 4, "Aumentar");

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
			btPericiaComKatarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComKatar, "PericiaComKatar", 10, 2, "Diminuir");

				}
			});
			btPericiaComMaoEsquerdaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComMaoEsquerda, "PericiaComMaoEsquerda", 5, 2, "Diminuir");

				}
			});
			btPericiaComMaoDireitaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComMaoDireita, "PericiaComMaoDireita", 5, 2, "Diminuir");

				}
			});
			btLaminasDestruidorasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLaminasDestruidoras, "LaminasDestruidoras", 10, 2, "Diminuir");

				}
			});
			btFurtividadeDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFurtividade, "Furtividade", 10, 2, "Diminuir");

				}
			});
			btTocaiaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTocaia, "Tocaia", 5, 2, "Diminuir");

				}
			});
			btEnvenenarArmaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEnvenenarArma, "EnvenenarArma", 10, 2, "Diminuir");

				}
			});
			btRefletirVenenoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRefletirVeneno, "RefletirVeneno", 10, 2, "Diminuir");

				}
			});
			btNevoaToxicaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varNevoaToxica, "NevoaToxica", 10, 2, "Diminuir");

				}
			});
			btExplosaoToxicaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varExplosaoToxica, "ExplosaoToxica", 10, 2, "Diminuir");

				}
			});
			btImpactoMeteoroDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varImpactoMeteoro, "ImpactoMeteoro", 10, 3, "Diminuir");

				}
			});
			btPericiaComKatarAvancadaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComKatarAvancada, "PericiaComKatarAvancada", 5, 3, "Diminuir");

				}
			});
			btCriarVenenoMortalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCriarVenenoMortal, "CriarVenenoMortal", 1, 3, "Diminuir");

				}
			});
			btEncantarComVenenoMortalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEncantarComVenenoMortal, "EncantarComVenenoMortal", 5, 3, "Diminuir");

				}
			});
			btDestruidorDeAlmasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDestruidorDeAlmas, "DestruidorDeAlmas", 10, 3, "Diminuir");

				}
			});
			btPesquisaDeToxinasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPesquisaDeToxinas, "PesquisaDeToxinas", 10, 4, "Diminuir");

				}
			});
			btCriarToxinaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCriarToxina, "CriarToxina", 1, 4, "Diminuir");

				}
			});
			btAplicarAntidotoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAplicarAntidoto, "AplicarAntidoto", 1, 4, "Diminuir");

				}
			});
			btAplicarToxinaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAplicarToxina, "AplicarToxina", 5, 4, "Diminuir");

				}
			});
			btIntoxicarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varIntoxicar, "Intoxicar", 5, 4, "Diminuir");

				}
			});
			btPotencializarVenenoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPotencializarVeneno, "PotencializarVeneno", 5, 4, "Diminuir");

				}
			});
			btNevoeiroToxicoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varNevoeiroToxico, "NevoeiroToxico", 5, 4, "Diminuir");

				}
			});
			btOcultacaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOcultacao, "Ocultacao", 5, 4, "Diminuir");

				}
			});
			btPassosDaIlusaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPassosDaIlusao, "PassosDaIlusao", 5, 4, "Diminuir");

				}
			});
			btPassoSombrioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPassoSombrio, "PassoSombrio", 5, 4, "Diminuir");

				}
			});
			btAmeacaFantasmaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAmeacaFantasma, "AmeacaFantasma", 1, 4, "Diminuir");

				}
			});
			btReflexoDeCombateDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varReflexoDeCombate, "ReflexoDeCombate", 5, 4, "Diminuir");

				}
			});
			btEstilhacarArmaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEstilhacarArma, "EstilhacarArma", 5, 4, "Diminuir");

				}
			});
			btLaminasRetalhadorasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLaminasRetalhadoras, "LaminasRetalhadoras", 5, 4, "Diminuir");

				}
			});
			btLaminasDeLokiDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLaminasDeLoki, "LaminasDeLoki", 5, 4, "Diminuir");

				}
			});
			btCastigoDeLokiDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCastigoDeLoki, "CastigoDeLoki", 5, 4, "Diminuir");

				}
			});
			btRetaliacaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRetaliacao, "Retaliacao", 5, 4, "Diminuir");

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
					varPericiaComKatar = 0;
					varPericiaComMaoEsquerda = 0;
					varPericiaComMaoDireita = 0;
					varLaminasDestruidoras = 0;
					varFurtividade = 0;
					varTocaia = 0;
					varEnvenenarArma = 0;
					varRefletirVeneno = 0;
					varNevoaToxica = 0;
					varExplosaoToxica = 0;
					varImpactoMeteoro = 0;
					varPericiaComKatarAvancada = 0;
					varCriarVenenoMortal = 0;
					varEncantarComVenenoMortal = 0;
					varDestruidorDeAlmas = 0;
					varPesquisaDeToxinas = 0;
					varCriarToxina = 0;
					varAplicarAntidoto = 0;
					varAplicarToxina = 0;
					varIntoxicar = 0;
					varPotencializarVeneno = 0;
					varNevoeiroToxico = 0;
					varOcultacao = 0;
					varPassosDaIlusao = 0;
					varPassoSombrio = 0;
					varAmeacaFantasma = 0;
					varReflexoDeCombate = 0;
					varEstilhacarArma = 0;
					varLaminasRetalhadoras = 0;
					varLaminasDeLoki = 0;
					varCastigoDeLoki = 0;
					varRetaliacao = 0;

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
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorSicario.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorSicario.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorSicario.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorSicario.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorSicario.this);
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

			if(varPericiaComKatar==0)
				layPericiaComKatar.setVisibility(View.GONE);
			if(varPericiaComMaoEsquerda==0)
				layPericiaComMaoEsquerda.setVisibility(View.GONE);
			if(varPericiaComMaoDireita==0)
				layPericiaComMaoDireita.setVisibility(View.GONE);
			if(varLaminasDestruidoras==0)
				layLaminasDestruidoras.setVisibility(View.GONE);
			if(varFurtividade==0)
				layFurtividade.setVisibility(View.GONE);
			if(varTocaia==0)
				layTocaia.setVisibility(View.GONE);
			if(varEnvenenarArma==0)
				layEnvenenarArma.setVisibility(View.GONE);
			if(varRefletirVeneno==0)
				layRefletirVeneno.setVisibility(View.GONE);
			if(varNevoaToxica==0)
				layNevoaToxica.setVisibility(View.GONE);
			if(varExplosaoToxica==0)
				layExplosaoToxica.setVisibility(View.GONE);

			if(varImpactoMeteoro==0)
				layImpactoMeteoro.setVisibility(View.GONE);
			if(varPericiaComKatarAvancada==0)
				layPericiaComKatarAvancada.setVisibility(View.GONE);
			if(varCriarVenenoMortal==0)
				layCriarVenenoMortal.setVisibility(View.GONE);
			if(varEncantarComVenenoMortal==0)
				layEncantarComVenenoMortal.setVisibility(View.GONE);
			if(varDestruidorDeAlmas==0)
				layDestruidorDeAlmas.setVisibility(View.GONE);

			if(varPesquisaDeToxinas==0)
				layPesquisaDeToxinas.setVisibility(View.GONE);
			if(varCriarToxina==0)
				layCriarToxina.setVisibility(View.GONE);
			if(varAplicarAntidoto==0)
				layAplicarAntidoto.setVisibility(View.GONE);
			if(varAplicarToxina==0)
				layAplicarToxina.setVisibility(View.GONE);
			if(varIntoxicar==0)
				layIntoxicar.setVisibility(View.GONE);
			if(varPotencializarVeneno==0)
				layPotencializarVeneno.setVisibility(View.GONE);
			if(varNevoeiroToxico==0)
				layNevoeiroToxico.setVisibility(View.GONE);
			if(varOcultacao==0)
				layOcultacao.setVisibility(View.GONE);
			if(varPassosDaIlusao==0)
				layPassosDaIlusao.setVisibility(View.GONE);
			if(varPassoSombrio==0)
				layPassoSombrio.setVisibility(View.GONE);
			if(varAmeacaFantasma==0)
				layAmeacaFantasma.setVisibility(View.GONE);
			if(varReflexoDeCombate==0)
				layReflexoDeCombate.setVisibility(View.GONE);
			if(varEstilhacarArma==0)
				layEstilhacarArma.setVisibility(View.GONE);
			if(varLaminasRetalhadoras==0)
				layLaminasRetalhadoras.setVisibility(View.GONE);
			if(varLaminasDeLoki==0)
				layLaminasDeLoki.setVisibility(View.GONE);
			if(varCastigoDeLoki==0)
				layCastigoDeLoki.setVisibility(View.GONE);
			if(varRetaliacao==0)
				layRetaliacao.setVisibility(View.GONE);

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

				if (nomeDaHabilidade=="PericiaComMaoDireita" && varPericiaComMaoEsquerda>=1 && varPericiaComMaoDireita<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaComKatar" && varLaminasDestruidoras>=1 && varPericiaComKatar<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Esconderijo" && varFurtividade>=1 && varEsconderijo<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Furtividade" && varTocaia>=1 && varFurtividade<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LaminasDestruidoras" && varTocaia>=1 && varLaminasDestruidoras<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Envenenar" && varEnvenenarArma>=1 && varEnvenenar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EnvenenarArma" && varRefletirVeneno>=1 && varEnvenenarArma<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EnvenenarArma" && varNevoaToxica>=1 && varEnvenenarArma<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RefletirVeneno" && varExplosaoToxica>=1 && varRefletirVeneno<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="NevoaToxica" && varExplosaoToxica>=1 && varNevoaToxica<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DestruidorDeAlmas" && varImpactoMeteoro>=1 && varDestruidorDeAlmas<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LaminasDestruidoras" && varImpactoMeteoro>=1 && varLaminasDestruidoras<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaComMaoDireita" && varImpactoMeteoro>=1 && varPericiaComMaoDireita<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaComKatar" && varImpactoMeteoro>=1 && varPericiaComKatar<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtaqueDuplo" && varPericiaComKatarAvancada>=1 && varAtaqueDuplo<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaComKatar" && varPericiaComKatarAvancada>=1 && varPericiaComKatar<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Envenenar" && varCriarVenenoMortal>=1 && varEnvenenar<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Desintoxicar" && varCriarVenenoMortal>=1 && varDesintoxicar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CriarVenenoMortal" && varEncantarComVenenoMortal>=1 && varCriarVenenoMortal<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AtaqueDuplo" && varDestruidorDeAlmas>=1 && varAtaqueDuplo<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Envenenar" && varDestruidorDeAlmas>=1 && varEnvenenar<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Furtividade" && varDestruidorDeAlmas>=1 && varFurtividade<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EnvenenarArma" && varDestruidorDeAlmas>=1 && varEnvenenarArma<=06){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PesquisaDeToxinas" && varCriarToxina>=1 && varPesquisaDeToxinas<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PesquisaDeToxinas" && varAplicarAntidoto>=1 && varPesquisaDeToxinas<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CriarToxina" && varAplicarToxina>=1 && varCriarToxina<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ReflexoDeCombate" && varIntoxicar>=1 && varReflexoDeCombate<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AplicarToxina" && varIntoxicar>=1 && varAplicarToxina<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EnvenenarArma" && varPotencializarVeneno>=1 && varEnvenenarArma<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Intoxicar" && varNevoeiroToxico>=1 && varIntoxicar<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AplicarToxina" && varNevoeiroToxico>=1 && varAplicarToxina<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Furtividade" && varOcultacao>=1 && varFurtividade<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AmeacaFantasma" && varPassosDaIlusao>=1 && varAmeacaFantasma<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LaminasRetalhadoras" && varPassoSombrio>=1 && varLaminasRetalhadoras<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Ocultacao" && varAmeacaFantasma>=1 && varOcultacao<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PassoSombrio" && varAmeacaFantasma>=1 && varPassoSombrio<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaComMaoEsquerda" && varReflexoDeCombate>=1 && varPericiaComMaoEsquerda<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ReflexoDeCombate" && varEstilhacarArma>=1 && varReflexoDeCombate<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LaminasDestruidoras" && varLaminasRetalhadoras>=1 && varLaminasDestruidoras<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LaminasDestruidoras" && varLaminasDeLoki>=1 && varLaminasDestruidoras<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LaminasDeLoki" && varCastigoDeLoki>=1 && varLaminasDeLoki<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ReflexoDeCombate" && varRetaliacao>=1 && varReflexoDeCombate<=01){
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

			else if(nomeDaHabilidade=="PericiaComKatar"){
				varPericiaComKatar = habilidade;
			} else if(nomeDaHabilidade=="PericiaComMaoEsquerda"){
				varPericiaComMaoEsquerda = habilidade;
			} else if(nomeDaHabilidade=="PericiaComMaoDireita"){
				varPericiaComMaoDireita = habilidade;
			} else if(nomeDaHabilidade=="LaminasDestruidoras"){
				varLaminasDestruidoras = habilidade;
			} else if(nomeDaHabilidade=="Furtividade"){
				varFurtividade = habilidade;
			} else if(nomeDaHabilidade=="Tocaia"){
				varTocaia = habilidade;
			} else if(nomeDaHabilidade=="EnvenenarArma"){
				varEnvenenarArma = habilidade;
			} else if(nomeDaHabilidade=="RefletirVeneno"){
				varRefletirVeneno = habilidade;
			} else if(nomeDaHabilidade=="NevoaToxica"){
				varNevoaToxica = habilidade;
			} else if(nomeDaHabilidade=="ExplosaoToxica"){
				varExplosaoToxica = habilidade;
			}

			else if(nomeDaHabilidade=="ImpactoMeteoro"){
				varImpactoMeteoro = habilidade;
			} else if(nomeDaHabilidade=="PericiaComKatarAvancada"){
				varPericiaComKatarAvancada = habilidade;
			} else if(nomeDaHabilidade=="CriarVenenoMortal"){
				varCriarVenenoMortal = habilidade;
			} else if(nomeDaHabilidade=="EncantarComVenenoMortal"){
				varEncantarComVenenoMortal = habilidade;
			} else if(nomeDaHabilidade=="DestruidorDeAlmas"){
				varDestruidorDeAlmas = habilidade;
			}

			else if(nomeDaHabilidade=="PesquisaDeToxinas"){
				varPesquisaDeToxinas = habilidade;
			} else if(nomeDaHabilidade=="CriarToxina"){
				varCriarToxina = habilidade;
			} else if(nomeDaHabilidade=="AplicarAntidoto"){
				varAplicarAntidoto = habilidade;
			} else if(nomeDaHabilidade=="AplicarToxina"){
				varAplicarToxina = habilidade;
			} else if(nomeDaHabilidade=="Intoxicar"){
				varIntoxicar = habilidade;
			} else if(nomeDaHabilidade=="PotencializarVeneno"){
				varPotencializarVeneno = habilidade;
			} else if(nomeDaHabilidade=="NevoeiroToxico"){
				varNevoeiroToxico = habilidade;
			} else if(nomeDaHabilidade=="Ocultacao"){
				varOcultacao = habilidade;
			} else if(nomeDaHabilidade=="PassosDaIlusao"){
				varPassosDaIlusao = habilidade;
			} else if(nomeDaHabilidade=="PassoSombrio"){
				varPassoSombrio = habilidade;
			} else if(nomeDaHabilidade=="AmeacaFantasma"){
				varAmeacaFantasma = habilidade;
			} else if(nomeDaHabilidade=="ReflexoDeCombate"){
				varReflexoDeCombate = habilidade;
			} else if(nomeDaHabilidade=="EstilhacarArma"){
				varEstilhacarArma = habilidade;
			} else if(nomeDaHabilidade=="LaminasRetalhadoras"){
				varLaminasRetalhadoras = habilidade;
			} else if(nomeDaHabilidade=="LaminasDeLoki"){
				varLaminasDeLoki = habilidade;
			} else if(nomeDaHabilidade=="CastigoDeLoki"){
				varCastigoDeLoki = habilidade;
			} else if(nomeDaHabilidade=="Retaliacao"){
				varRetaliacao = habilidade;
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

			txtPericiaComKatarPontos.setText(varPericiaComKatar + "/10");
			txtPericiaComMaoEsquerdaPontos.setText(varPericiaComMaoEsquerda + "/5");
			txtPericiaComMaoDireitaPontos.setText(varPericiaComMaoDireita + "/5");
			txtLaminasDestruidorasPontos.setText(varLaminasDestruidoras + "/10");
			txtFurtividadePontos.setText(varFurtividade + "/10");
			txtTocaiaPontos.setText(varTocaia + "/5");
			txtEnvenenarArmaPontos.setText(varEnvenenarArma + "/10");
			txtRefletirVenenoPontos.setText(varRefletirVeneno + "/10");
			txtNevoaToxicaPontos.setText(varNevoaToxica + "/10");
			txtExplosaoToxicaPontos.setText(varExplosaoToxica + "/10");

			txtImpactoMeteoroPontos.setText(varImpactoMeteoro + "/10");
			txtPericiaComKatarAvancadaPontos.setText(varPericiaComKatarAvancada + "/5");
			txtCriarVenenoMortalPontos.setText(varCriarVenenoMortal + "/1");
			txtEncantarComVenenoMortalPontos.setText(varEncantarComVenenoMortal + "/5");
			txtDestruidorDeAlmasPontos.setText(varDestruidorDeAlmas + "/10");

			txtPesquisaDeToxinasPontos.setText(varPesquisaDeToxinas + "/10");
			txtCriarToxinaPontos.setText(varCriarToxina + "/1");
			txtAplicarAntidotoPontos.setText(varAplicarAntidoto + "/1");
			txtAplicarToxinaPontos.setText(varAplicarToxina + "/5");
			txtIntoxicarPontos.setText(varIntoxicar + "/5");
			txtPotencializarVenenoPontos.setText(varPotencializarVeneno + "/5");
			txtNevoeiroToxicoPontos.setText(varNevoeiroToxico + "/5");
			txtOcultacaoPontos.setText(varOcultacao + "/5");
			txtPassosDaIlusaoPontos.setText(varPassosDaIlusao + "/5");
			txtPassoSombrioPontos.setText(varPassoSombrio + "/5");
			txtAmeacaFantasmaPontos.setText(varAmeacaFantasma + "/1");
			txtReflexoDeCombatePontos.setText(varReflexoDeCombate + "/5");
			txtEstilhacarArmaPontos.setText(varEstilhacarArma + "/5");
			txtLaminasRetalhadorasPontos.setText(varLaminasRetalhadoras + "/5");
			txtLaminasDeLokiPontos.setText(varLaminasDeLoki + "/5");
			txtCastigoDeLokiPontos.setText(varCastigoDeLoki + "/5");
			txtRetaliacaoPontos.setText(varRetaliacao + "/5");

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

			layPericiaComKatar.setVisibility(View.VISIBLE);
			layPericiaComMaoEsquerda.setVisibility(View.VISIBLE);
			layPericiaComMaoDireita.setVisibility(View.VISIBLE);
			layLaminasDestruidoras.setVisibility(View.VISIBLE);
			layFurtividade.setVisibility(View.VISIBLE);
			layTocaia.setVisibility(View.VISIBLE);
			layEnvenenarArma.setVisibility(View.VISIBLE);
			layRefletirVeneno.setVisibility(View.VISIBLE);
			layNevoaToxica.setVisibility(View.VISIBLE);
			layExplosaoToxica.setVisibility(View.VISIBLE);

			layImpactoMeteoro.setVisibility(View.VISIBLE);
			layPericiaComKatarAvancada.setVisibility(View.VISIBLE);
			layCriarVenenoMortal.setVisibility(View.VISIBLE);
			layEncantarComVenenoMortal.setVisibility(View.VISIBLE);
			layDestruidorDeAlmas.setVisibility(View.VISIBLE);

			layPesquisaDeToxinas.setVisibility(View.VISIBLE);
			layCriarToxina.setVisibility(View.VISIBLE);
			layAplicarAntidoto.setVisibility(View.VISIBLE);
			layAplicarToxina.setVisibility(View.VISIBLE);
			layIntoxicar.setVisibility(View.VISIBLE);
			layPotencializarVeneno.setVisibility(View.VISIBLE);
			layNevoeiroToxico.setVisibility(View.VISIBLE);
			layOcultacao.setVisibility(View.VISIBLE);
			layPassosDaIlusao.setVisibility(View.VISIBLE);
			layPassoSombrio.setVisibility(View.VISIBLE);
			layAmeacaFantasma.setVisibility(View.VISIBLE);
			layReflexoDeCombate.setVisibility(View.VISIBLE);
			layEstilhacarArma.setVisibility(View.VISIBLE);
			layLaminasRetalhadoras.setVisibility(View.VISIBLE);
			layLaminasDeLoki.setVisibility(View.VISIBLE);
			layCastigoDeLoki.setVisibility(View.VISIBLE);
			layRetaliacao.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM sicario WHERE _id = ?", new String[]{String.valueOf(id)});

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

			varPericiaComKatar = cs.getInt(12);
			varPericiaComMaoEsquerda = cs.getInt(13);
			varPericiaComMaoDireita = cs.getInt(14);
			varLaminasDestruidoras = cs.getInt(15);
			varFurtividade = cs.getInt(16);
			varTocaia = cs.getInt(17);
			varEnvenenarArma = cs.getInt(18);
			varRefletirVeneno = cs.getInt(19);
			varNevoaToxica = cs.getInt(20);
			varExplosaoToxica = cs.getInt(21);

			varImpactoMeteoro = cs.getInt(22);
			varPericiaComKatarAvancada = cs.getInt(23);
			varCriarVenenoMortal = cs.getInt(24);
			varEncantarComVenenoMortal = cs.getInt(25);
			varDestruidorDeAlmas = cs.getInt(26);

			varPesquisaDeToxinas = cs.getInt(27);
			varCriarToxina = cs.getInt(28);
			varAplicarAntidoto = cs.getInt(29);
			varAplicarToxina = cs.getInt(30);
			varIntoxicar = cs.getInt(31);
			varPotencializarVeneno = cs.getInt(32);
			varNevoeiroToxico = cs.getInt(33);
			varOcultacao = cs.getInt(34);
			varPassosDaIlusao = cs.getInt(35);
			varPassoSombrio = cs.getInt(36);
			varAmeacaFantasma = cs.getInt(37);
			varReflexoDeCombate = cs.getInt(38);
			varEstilhacarArma = cs.getInt(39);
			varLaminasRetalhadoras = cs.getInt(40);
			varLaminasDeLoki = cs.getInt(41);
			varCastigoDeLoki = cs.getInt(42);
			varRetaliacao = cs.getInt(43);

			skillPrimeira = cs.getInt(44);
			skillSegunda = cs.getInt(45);
			skillTrans = cs.getInt(46);
			skillTerceira = cs.getInt(47);
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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS sicario (");
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
					sqlClasse.append("skill_periciacomkatar INT(2), ");
					sqlClasse.append("skill_periciacommaoesquerda INT(2), ");
					sqlClasse.append("skill_periciacommaodireita INT(2), ");
					sqlClasse.append("skill_laminasdestruidoras INT(2), ");
					sqlClasse.append("skill_furtividade INT(2), ");
					sqlClasse.append("skill_tocaia INT(2), ");
					sqlClasse.append("skill_envenenararma INT(2), ");
					sqlClasse.append("skill_refletirveneno INT(2), ");
					sqlClasse.append("skill_nevoatoxica INT(2), ");
					sqlClasse.append("skill_explosaotoxica INT(2), ");
					sqlClasse.append("skill_impactometeoro INT(2), ");
					sqlClasse.append("skill_periciacomkataravancada INT(2), ");
					sqlClasse.append("skill_criarvenenomortal INT(2), ");
					sqlClasse.append("skill_encantarcomvenenomortal INT(2), ");
					sqlClasse.append("skill_destruidordealmas INT(2), ");
					sqlClasse.append("skill_pesquisadetoxinas INT(2), ");
					sqlClasse.append("skill_criartoxina INT(2), ");
					sqlClasse.append("skill_aplicarantidoto INT(2), ");
					sqlClasse.append("skill_aplicartoxina INT(2), ");
					sqlClasse.append("skill_intoxicar INT(2), ");
					sqlClasse.append("skill_potencializarveneno INT(2), ");
					sqlClasse.append("skill_nevoeirotoxico INT(2), ");
					sqlClasse.append("skill_ocultacao INT(2), ");
					sqlClasse.append("skill_passosdailusao INT(2), ");
					sqlClasse.append("skill_passosombrio INT(2), ");
					sqlClasse.append("skill_ameacafantasma INT(2), ");
					sqlClasse.append("skill_reflexodecombate INT(2), ");
					sqlClasse.append("skill_estilhacararma INT(2), ");
					sqlClasse.append("skill_laminasretalhadoras INT(2), ");
					sqlClasse.append("skill_laminasdeloki INT(2), ");
					sqlClasse.append("skill_castigodeloki INT(2), ");
					sqlClasse.append("skill_retaliacao INT(2), ");
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
					ins.put("skill_periciacomkatar", varPericiaComKatar);
					ins.put("skill_periciacommaoesquerda", varPericiaComMaoEsquerda);
					ins.put("skill_periciacommaodireita", varPericiaComMaoDireita);
					ins.put("skill_laminasdestruidoras", varLaminasDestruidoras);
					ins.put("skill_furtividade", varFurtividade);
					ins.put("skill_tocaia", varTocaia);
					ins.put("skill_envenenararma", varEnvenenarArma);
					ins.put("skill_refletirveneno", varRefletirVeneno);
					ins.put("skill_nevoatoxica", varNevoaToxica);
					ins.put("skill_explosaotoxica", varExplosaoToxica);
					ins.put("skill_impactometeoro", varImpactoMeteoro);
					ins.put("skill_periciacomkataravancada", varPericiaComKatarAvancada);
					ins.put("skill_criarvenenomortal", varCriarVenenoMortal);
					ins.put("skill_encantarcomvenenomortal", varEncantarComVenenoMortal);
					ins.put("skill_destruidordealmas", varDestruidorDeAlmas);
					ins.put("skill_pesquisadetoxinas", varPesquisaDeToxinas);
					ins.put("skill_criartoxina", varCriarToxina);
					ins.put("skill_aplicarantidoto", varAplicarAntidoto);
					ins.put("skill_aplicartoxina", varAplicarToxina);
					ins.put("skill_intoxicar", varIntoxicar);
					ins.put("skill_potencializarveneno", varPotencializarVeneno);
					ins.put("skill_nevoeirotoxico", varNevoeiroToxico);
					ins.put("skill_ocultacao", varOcultacao);
					ins.put("skill_passosdailusao", varPassosDaIlusao);
					ins.put("skill_passosombrio", varPassoSombrio);
					ins.put("skill_ameacafantasma", varAmeacaFantasma);
					ins.put("skill_reflexodecombate", varReflexoDeCombate);
					ins.put("skill_estilhacararma", varEstilhacarArma);
					ins.put("skill_laminasretalhadoras", varLaminasRetalhadoras);
					ins.put("skill_laminasdeloki", varLaminasDeLoki);
					ins.put("skill_castigodeloki", varCastigoDeLoki);
					ins.put("skill_retaliacao", varRetaliacao);
					ins.put("skill_primeira", skillPrimeira);
					ins.put("skill_segunda", skillSegunda);
					ins.put("skill_trans", skillTrans);
					ins.put("skill_terceira", skillTerceira);
					if(!novo){
						try {
							db.update("sicario", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("sicario", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from sicario", null);
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
						ins2.put("classe", "sicario");
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
			getMenuInflater().inflate(R.menu.simulador_sicario, menu);
			return true;
		}

	}