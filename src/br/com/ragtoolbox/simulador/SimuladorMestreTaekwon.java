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

public class SimuladorMestreTaekwon extends Activity {

		//Botões de interrogação
		Button btChuteAereoInterrogacao,
		btCorridaInterrogacao,
		btSaltoInterrogacao,
		btCambalhotaInterrogacao,
		btTreguaRapidaInterrogacao,
		btRetiroRapidoInterrogacao,
		btKihopInterrogacao,
		btBrisaLeveInterrogacao,
		btMissaoTaekwonInterrogacao,
		btPosturaDoTornadoInterrogacao,
		btPosturaDaPatadaVoadoraInterrogacao,
		btPosturaDaRasteiraInterrogacao,
		btPosturaDoContrachuteInterrogacao,
		btChuteDoTornadoInterrogacao,
		btPatadaVoadoraInterrogacao,
		btRasteiraInterrogacao,
		btContrachuteInterrogacao,
		btPercepcaoSolarLunarEEstelarInterrogacao,
		btOposicaoSolarLunarEEstelarInterrogacao,
		btSombraSolarLunarEEstelarInterrogacao,
		btAuxilioSolarLunarEEstelarInterrogacao,
		btTransmissaoSolarLunarEEstelarInterrogacao,
		btUniaoSolarLunarEEstelarInterrogacao,
		btCalorSolarInterrogacao,
		btFuriaSolarInterrogacao,
		btProtecaoSolarInterrogacao,
		btBencaoSolarInterrogacao,
		btCalorLunarInterrogacao,
		btFuriaLunarInterrogacao,
		btProtecaoLunarInterrogacao,
		btBencaoLunarInterrogacao,
		btCalorEstelarInterrogacao,
		btFuriaEstelarInterrogacao,
		btProtecaoEstelarInterrogacao,
		btBencaoEstelarInterrogacao,
		btAnjoSolarLunarEEstelarInterrogacao,
		btMilagreSolarLunarEEstelarInterrogacao;

		//Botões de diminuir habilidades
		Button btChuteAereoDiminuir,
		btCorridaDiminuir,
		btSaltoDiminuir,
		btCambalhotaDiminuir,
		btTreguaRapidaDiminuir,
		btRetiroRapidoDiminuir,
		btKihopDiminuir,
		btBrisaLeveDiminuir,
		btMissaoTaekwonDiminuir,
		btPosturaDoTornadoDiminuir,
		btPosturaDaPatadaVoadoraDiminuir,
		btPosturaDaRasteiraDiminuir,
		btPosturaDoContrachuteDiminuir,
		btChuteDoTornadoDiminuir,
		btPatadaVoadoraDiminuir,
		btRasteiraDiminuir,
		btContrachuteDiminuir,
		btPercepcaoSolarLunarEEstelarDiminuir,
		btOposicaoSolarLunarEEstelarDiminuir,
		btSombraSolarLunarEEstelarDiminuir,
		btAuxilioSolarLunarEEstelarDiminuir,
		btTransmissaoSolarLunarEEstelarDiminuir,
		btUniaoSolarLunarEEstelarDiminuir,
		btCalorSolarDiminuir,
		btFuriaSolarDiminuir,
		btProtecaoSolarDiminuir,
		btBencaoSolarDiminuir,
		btCalorLunarDiminuir,
		btFuriaLunarDiminuir,
		btProtecaoLunarDiminuir,
		btBencaoLunarDiminuir,
		btCalorEstelarDiminuir,
		btFuriaEstelarDiminuir,
		btProtecaoEstelarDiminuir,
		btBencaoEstelarDiminuir;

		//Botões de aumentar habilidades
		Button btChuteAereoAumentar,
		btCorridaAumentar,
		btSaltoAumentar,
		btCambalhotaAumentar,
		btTreguaRapidaAumentar,
		btRetiroRapidoAumentar,
		btKihopAumentar,
		btBrisaLeveAumentar,
		btMissaoTaekwonAumentar,
		btPosturaDoTornadoAumentar,
		btPosturaDaPatadaVoadoraAumentar,
		btPosturaDaRasteiraAumentar,
		btPosturaDoContrachuteAumentar,
		btChuteDoTornadoAumentar,
		btPatadaVoadoraAumentar,
		btRasteiraAumentar,
		btContrachuteAumentar,
		btPercepcaoSolarLunarEEstelarAumentar,
		btOposicaoSolarLunarEEstelarAumentar,
		btSombraSolarLunarEEstelarAumentar,
		btAuxilioSolarLunarEEstelarAumentar,
		btTransmissaoSolarLunarEEstelarAumentar,
		btUniaoSolarLunarEEstelarAumentar,
		btCalorSolarAumentar,
		btFuriaSolarAumentar,
		btProtecaoSolarAumentar,
		btBencaoSolarAumentar,
		btCalorLunarAumentar,
		btFuriaLunarAumentar,
		btProtecaoLunarAumentar,
		btBencaoLunarAumentar,
		btCalorEstelarAumentar,
		btFuriaEstelarAumentar,
		btProtecaoEstelarAumentar,
		btBencaoEstelarAumentar;

		//Resto dos botões
		Button btResetar, btSalvar, btSalvarIMG;
		ToggleButton tgbtSomenteHabilidadeAprendida;


		//Txt pontos da tela
		TextView txtChuteAereoPontos,
		txtCorridaPontos,
		txtSaltoPontos,
		txtCambalhotaPontos,
		txtTreguaRapidaPontos,
		txtRetiroRapidoPontos,
		txtKihopPontos,
		txtBrisaLevePontos,
		txtMissaoTaekwonPontos,
		txtPosturaDoTornadoPontos,
		txtPosturaDaPatadaVoadoraPontos,
		txtPosturaDaRasteiraPontos,
		txtPosturaDoContrachutePontos,
		txtChuteDoTornadoPontos,
		txtPatadaVoadoraPontos,
		txtRasteiraPontos,
		txtContrachutePontos,
		txtPercepcaoSolarLunarEEstelarPontos,
		txtOposicaoSolarLunarEEstelarPontos,
		txtSombraSolarLunarEEstelarPontos,
		txtAuxilioSolarLunarEEstelarPontos,
		txtTransmissaoSolarLunarEEstelarPontos,
		txtUniaoSolarLunarEEstelarPontos,
		txtCalorSolarPontos,
		txtFuriaSolarPontos,
		txtProtecaoSolarPontos,
		txtBencaoSolarPontos,
		txtCalorLunarPontos,
		txtFuriaLunarPontos,
		txtProtecaoLunarPontos,
		txtBencaoLunarPontos,
		txtCalorEstelarPontos,
		txtFuriaEstelarPontos,
		txtProtecaoEstelarPontos,
		txtBencaoEstelarPontos;

		//Txt pontos restantes
		TextView txtClasse1, txtClasse2;

		//Layouts
		LinearLayout layChuteAereo,
		layCorrida,
		laySalto,
		layCambalhota,
		layTreguaRapida,
		layRetiroRapido,
		layKihop,
		layBrisaLeve,
		layMissaoTaekwon,
		layPosturaDoTornado,
		layPosturaDaPatadaVoadora,
		layPosturaDaRasteira,
		layPosturaDoContrachute,
		layChuteDoTornado,
		layPatadaVoadora,
		layRasteira,
		layContrachute,
		layPercepcaoSolarLunarEEstelar,
		layOposicaoSolarLunarEEstelar,
		laySombraSolarLunarEEstelar,
		layAuxilioSolarLunarEEstelar,
		layTransmissaoSolarLunarEEstelar,
		layUniaoSolarLunarEEstelar,
		layCalorSolar,
		layFuriaSolar,
		layProtecaoSolar,
		layBencaoSolar,
		layCalorLunar,
		layFuriaLunar,
		layProtecaoLunar,
		layBencaoLunar,
		layCalorEstelar,
		layFuriaEstelar,
		layProtecaoEstelar,
		layBencaoEstelar;

		//Variaveis de Skill
		int varChuteAereo,
		varCorrida,
		varSalto,
		varCambalhota,
		varTreguaRapida,
		varRetiroRapido,
		varKihop,
		varBrisaLeve,
		varMissaoTaekwon,
		varPosturaDoTornado,
		varPosturaDaPatadaVoadora,
		varPosturaDaRasteira,
		varPosturaDoContrachute,
		varChuteDoTornado,
		varPatadaVoadora,
		varRasteira,
		varContrachute,
		varPercepcaoSolarLunarEEstelar,
		varOposicaoSolarLunarEEstelar,
		varSombraSolarLunarEEstelar,
		varAuxilioSolarLunarEEstelar,
		varTransmissaoSolarLunarEEstelar,
		varUniaoSolarLunarEEstelar,
		varCalorSolar,
		varFuriaSolar,
		varProtecaoSolar,
		varBencaoSolar,
		varCalorLunar,
		varFuriaLunar,
		varProtecaoLunar,
		varBencaoLunar,
		varCalorEstelar,
		varFuriaEstelar,
		varProtecaoEstelar,
		varBencaoEstelar;

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
			setContentView(R.layout.activity_simulador_mestre_taekwon);

			Intent it = getIntent();

			final int id = it.getIntExtra("id", 0);
			idParaAlterar = "_id =" +id;

			//inicialização de variáveis
			varChuteAereo = 0;
			varCorrida = 0;
			varSalto = 0;
			varCambalhota = 0;
			varTreguaRapida = 0;
			varRetiroRapido = 0;
			varKihop = 0;
			varBrisaLeve = 0;
			varMissaoTaekwon = 0;
			varPosturaDoTornado = 0;
			varPosturaDaPatadaVoadora = 0;
			varPosturaDaRasteira = 0;
			varPosturaDoContrachute = 0;
			varChuteDoTornado = 0;
			varPatadaVoadora = 0;
			varRasteira = 0;
			varContrachute = 0;
			varPercepcaoSolarLunarEEstelar = 0;
			varOposicaoSolarLunarEEstelar = 0;
			varSombraSolarLunarEEstelar = 0;
			varAuxilioSolarLunarEEstelar = 0;
			varTransmissaoSolarLunarEEstelar = 0;
			varUniaoSolarLunarEEstelar = 0;
			varCalorSolar = 0;
			varFuriaSolar = 0;
			varProtecaoSolar = 0;
			varBencaoSolar = 0;
			varCalorLunar = 0;
			varFuriaLunar = 0;
			varProtecaoLunar = 0;
			varBencaoLunar = 0;
			varCalorEstelar = 0;
			varFuriaEstelar = 0;
			varProtecaoEstelar = 0;
			varBencaoEstelar = 0;



			primeiraClasse = 49;
			segundaClasse = 49;

			skillPrimeira = 0;
			skillSegunda = 0;

			count = 0;


			//Botões de interrogações
			btChuteAereoInterrogacao = (Button) findViewById(R.id.btChuteAereoInterrogacao);
			btCorridaInterrogacao = (Button) findViewById(R.id.btCorridaInterrogacao);
			btSaltoInterrogacao = (Button) findViewById(R.id.btSaltoInterrogacao);
			btCambalhotaInterrogacao = (Button) findViewById(R.id.btCambalhotaInterrogacao);
			btTreguaRapidaInterrogacao = (Button) findViewById(R.id.btTreguaRapidaInterrogacao);
			btRetiroRapidoInterrogacao = (Button) findViewById(R.id.btRetiroRapidoInterrogacao);
			btKihopInterrogacao = (Button) findViewById(R.id.btKihopInterrogacao);
			btBrisaLeveInterrogacao = (Button) findViewById(R.id.btBrisaLeveInterrogacao);
			btMissaoTaekwonInterrogacao = (Button) findViewById(R.id.btMissaoTaekwonInterrogacao);
			btPosturaDoTornadoInterrogacao = (Button) findViewById(R.id.btPosturaDoTornadoInterrogacao);
			btPosturaDaPatadaVoadoraInterrogacao = (Button) findViewById(R.id.btPosturaDaPatadaVoadoraInterrogacao);
			btPosturaDaRasteiraInterrogacao = (Button) findViewById(R.id.btPosturaDaRasteiraInterrogacao);
			btPosturaDoContrachuteInterrogacao = (Button) findViewById(R.id.btPosturaDoContrachuteInterrogacao);
			btChuteDoTornadoInterrogacao = (Button) findViewById(R.id.btChuteDoTornadoInterrogacao);
			btPatadaVoadoraInterrogacao = (Button) findViewById(R.id.btPatadaVoadoraInterrogacao);
			btRasteiraInterrogacao = (Button) findViewById(R.id.btRasteiraInterrogacao);
			btContrachuteInterrogacao = (Button) findViewById(R.id.btContrachuteInterrogacao);
			btPercepcaoSolarLunarEEstelarInterrogacao = (Button) findViewById(R.id.btPercepcaoSolarLunarEEstelarInterrogacao);
			btOposicaoSolarLunarEEstelarInterrogacao = (Button) findViewById(R.id.btOposicaoSolarLunarEEstelarInterrogacao);
			btSombraSolarLunarEEstelarInterrogacao = (Button) findViewById(R.id.btSombraSolarLunarEEstelarInterrogacao);
			btAuxilioSolarLunarEEstelarInterrogacao = (Button) findViewById(R.id.btAuxilioSolarLunarEEstelarInterrogacao);
			btTransmissaoSolarLunarEEstelarInterrogacao = (Button) findViewById(R.id.btTransmissaoSolarLunarEEstelarInterrogacao);
			btUniaoSolarLunarEEstelarInterrogacao = (Button) findViewById(R.id.btUniaoSolarLunarEEstelarInterrogacao);
			btCalorSolarInterrogacao = (Button) findViewById(R.id.btCalorSolarInterrogacao);
			btFuriaSolarInterrogacao = (Button) findViewById(R.id.btFuriaSolarInterrogacao);
			btProtecaoSolarInterrogacao = (Button) findViewById(R.id.btProtecaoSolarInterrogacao);
			btBencaoSolarInterrogacao = (Button) findViewById(R.id.btBencaoSolarInterrogacao);
			btCalorLunarInterrogacao = (Button) findViewById(R.id.btCalorLunarInterrogacao);
			btFuriaLunarInterrogacao = (Button) findViewById(R.id.btFuriaLunarInterrogacao);
			btProtecaoLunarInterrogacao = (Button) findViewById(R.id.btProtecaoLunarInterrogacao);
			btBencaoLunarInterrogacao = (Button) findViewById(R.id.btBencaoLunarInterrogacao);
			btCalorEstelarInterrogacao = (Button) findViewById(R.id.btCalorEstelarInterrogacao);
			btFuriaEstelarInterrogacao = (Button) findViewById(R.id.btFuriaEstelarInterrogacao);
			btProtecaoEstelarInterrogacao = (Button) findViewById(R.id.btProtecaoEstelarInterrogacao);
			btBencaoEstelarInterrogacao = (Button) findViewById(R.id.btBencaoEstelarInterrogacao);
			btAnjoSolarLunarEEstelarInterrogacao = (Button) findViewById(R.id.btAnjoSolarLunarEEstelarInterrogacao);
			btMilagreSolarLunarEEstelarInterrogacao = (Button) findViewById(R.id.btMilagreSolarLunarEEstelarInterrogacao);

			//Botões de diminuir habilidades
			btChuteAereoDiminuir = (Button) findViewById(R.id.btChuteAereoDiminuir);
			btCorridaDiminuir = (Button) findViewById(R.id.btCorridaDiminuir);
			btSaltoDiminuir = (Button) findViewById(R.id.btSaltoDiminuir);
			btCambalhotaDiminuir = (Button) findViewById(R.id.btCambalhotaDiminuir);
			btTreguaRapidaDiminuir = (Button) findViewById(R.id.btTreguaRapidaDiminuir);
			btRetiroRapidoDiminuir = (Button) findViewById(R.id.btRetiroRapidoDiminuir);
			btKihopDiminuir = (Button) findViewById(R.id.btKihopDiminuir);
			btBrisaLeveDiminuir = (Button) findViewById(R.id.btBrisaLeveDiminuir);
			btMissaoTaekwonDiminuir = (Button) findViewById(R.id.btMissaoTaekwonDiminuir);
			btPosturaDoTornadoDiminuir = (Button) findViewById(R.id.btPosturaDoTornadoDiminuir);
			btPosturaDaPatadaVoadoraDiminuir = (Button) findViewById(R.id.btPosturaDaPatadaVoadoraDiminuir);
			btPosturaDaRasteiraDiminuir = (Button) findViewById(R.id.btPosturaDaRasteiraDiminuir);
			btPosturaDoContrachuteDiminuir = (Button) findViewById(R.id.btPosturaDoContrachuteDiminuir);
			btChuteDoTornadoDiminuir = (Button) findViewById(R.id.btChuteDoTornadoDiminuir);
			btPatadaVoadoraDiminuir = (Button) findViewById(R.id.btPatadaVoadoraDiminuir);
			btRasteiraDiminuir = (Button) findViewById(R.id.btRasteiraDiminuir);
			btContrachuteDiminuir = (Button) findViewById(R.id.btContrachuteDiminuir);
			btPercepcaoSolarLunarEEstelarDiminuir = (Button) findViewById(R.id.btPercepcaoSolarLunarEEstelarDiminuir);
			btOposicaoSolarLunarEEstelarDiminuir = (Button) findViewById(R.id.btOposicaoSolarLunarEEstelarDiminuir);
			btSombraSolarLunarEEstelarDiminuir = (Button) findViewById(R.id.btSombraSolarLunarEEstelarDiminuir);
			btAuxilioSolarLunarEEstelarDiminuir = (Button) findViewById(R.id.btAuxilioSolarLunarEEstelarDiminuir);
			btTransmissaoSolarLunarEEstelarDiminuir = (Button) findViewById(R.id.btTransmissaoSolarLunarEEstelarDiminuir);
			btUniaoSolarLunarEEstelarDiminuir = (Button) findViewById(R.id.btUniaoSolarLunarEEstelarDiminuir);
			btCalorSolarDiminuir = (Button) findViewById(R.id.btCalorSolarDiminuir);
			btFuriaSolarDiminuir = (Button) findViewById(R.id.btFuriaSolarDiminuir);
			btProtecaoSolarDiminuir = (Button) findViewById(R.id.btProtecaoSolarDiminuir);
			btBencaoSolarDiminuir = (Button) findViewById(R.id.btBencaoSolarDiminuir);
			btCalorLunarDiminuir = (Button) findViewById(R.id.btCalorLunarDiminuir);
			btFuriaLunarDiminuir = (Button) findViewById(R.id.btFuriaLunarDiminuir);
			btProtecaoLunarDiminuir = (Button) findViewById(R.id.btProtecaoLunarDiminuir);
			btBencaoLunarDiminuir = (Button) findViewById(R.id.btBencaoLunarDiminuir);
			btCalorEstelarDiminuir = (Button) findViewById(R.id.btCalorEstelarDiminuir);
			btFuriaEstelarDiminuir = (Button) findViewById(R.id.btFuriaEstelarDiminuir);
			btProtecaoEstelarDiminuir = (Button) findViewById(R.id.btProtecaoEstelarDiminuir);
			btBencaoEstelarDiminuir = (Button) findViewById(R.id.btBencaoEstelarDiminuir);

			//Botões de aumentar habilidades
			btChuteAereoAumentar = (Button) findViewById(R.id.btChuteAereoAumentar);
			btCorridaAumentar = (Button) findViewById(R.id.btCorridaAumentar);
			btSaltoAumentar = (Button) findViewById(R.id.btSaltoAumentar);
			btCambalhotaAumentar = (Button) findViewById(R.id.btCambalhotaAumentar);
			btTreguaRapidaAumentar = (Button) findViewById(R.id.btTreguaRapidaAumentar);
			btRetiroRapidoAumentar = (Button) findViewById(R.id.btRetiroRapidoAumentar);
			btKihopAumentar = (Button) findViewById(R.id.btKihopAumentar);
			btBrisaLeveAumentar = (Button) findViewById(R.id.btBrisaLeveAumentar);
			btMissaoTaekwonAumentar = (Button) findViewById(R.id.btMissaoTaekwonAumentar);
			btPosturaDoTornadoAumentar = (Button) findViewById(R.id.btPosturaDoTornadoAumentar);
			btPosturaDaPatadaVoadoraAumentar = (Button) findViewById(R.id.btPosturaDaPatadaVoadoraAumentar);
			btPosturaDaRasteiraAumentar = (Button) findViewById(R.id.btPosturaDaRasteiraAumentar);
			btPosturaDoContrachuteAumentar = (Button) findViewById(R.id.btPosturaDoContrachuteAumentar);
			btChuteDoTornadoAumentar = (Button) findViewById(R.id.btChuteDoTornadoAumentar);
			btPatadaVoadoraAumentar = (Button) findViewById(R.id.btPatadaVoadoraAumentar);
			btRasteiraAumentar = (Button) findViewById(R.id.btRasteiraAumentar);
			btContrachuteAumentar = (Button) findViewById(R.id.btContrachuteAumentar);
			btPercepcaoSolarLunarEEstelarAumentar = (Button) findViewById(R.id.btPercepcaoSolarLunarEEstelarAumentar);
			btOposicaoSolarLunarEEstelarAumentar = (Button) findViewById(R.id.btOposicaoSolarLunarEEstelarAumentar);
			btSombraSolarLunarEEstelarAumentar = (Button) findViewById(R.id.btSombraSolarLunarEEstelarAumentar);
			btAuxilioSolarLunarEEstelarAumentar = (Button) findViewById(R.id.btAuxilioSolarLunarEEstelarAumentar);
			btTransmissaoSolarLunarEEstelarAumentar = (Button) findViewById(R.id.btTransmissaoSolarLunarEEstelarAumentar);
			btUniaoSolarLunarEEstelarAumentar = (Button) findViewById(R.id.btUniaoSolarLunarEEstelarAumentar);
			btCalorSolarAumentar = (Button) findViewById(R.id.btCalorSolarAumentar);
			btFuriaSolarAumentar = (Button) findViewById(R.id.btFuriaSolarAumentar);
			btProtecaoSolarAumentar = (Button) findViewById(R.id.btProtecaoSolarAumentar);
			btBencaoSolarAumentar = (Button) findViewById(R.id.btBencaoSolarAumentar);
			btCalorLunarAumentar = (Button) findViewById(R.id.btCalorLunarAumentar);
			btFuriaLunarAumentar = (Button) findViewById(R.id.btFuriaLunarAumentar);
			btProtecaoLunarAumentar = (Button) findViewById(R.id.btProtecaoLunarAumentar);
			btBencaoLunarAumentar = (Button) findViewById(R.id.btBencaoLunarAumentar);
			btCalorEstelarAumentar = (Button) findViewById(R.id.btCalorEstelarAumentar);
			btFuriaEstelarAumentar = (Button) findViewById(R.id.btFuriaEstelarAumentar);
			btProtecaoEstelarAumentar = (Button) findViewById(R.id.btProtecaoEstelarAumentar);
			btBencaoEstelarAumentar = (Button) findViewById(R.id.btBencaoEstelarAumentar);

			//Resto dos botões
			btResetar = (Button) findViewById(R.id.btResetar);
			btSalvar = (Button) findViewById(R.id.btSalvar);
			btSalvarIMG = (Button) findViewById(R.id.btSalvarIMG);
			tgbtSomenteHabilidadeAprendida = (ToggleButton) findViewById(R.id.tgbtSomenteHabilidadeAprendida);

			//Txt pontos da tela
			txtChuteAereoPontos = (TextView) findViewById(R.id.txtChuteAereoPontos);
			txtCorridaPontos = (TextView) findViewById(R.id.txtCorridaPontos);
			txtSaltoPontos = (TextView) findViewById(R.id.txtSaltoPontos);
			txtCambalhotaPontos = (TextView) findViewById(R.id.txtCambalhotaPontos);
			txtTreguaRapidaPontos = (TextView) findViewById(R.id.txtTreguaRapidaPontos);
			txtRetiroRapidoPontos = (TextView) findViewById(R.id.txtRetiroRapidoPontos);
			txtKihopPontos = (TextView) findViewById(R.id.txtKihopPontos);
			txtBrisaLevePontos = (TextView) findViewById(R.id.txtBrisaLevePontos);
			txtMissaoTaekwonPontos = (TextView) findViewById(R.id.txtMissaoTaekwonPontos);
			txtPosturaDoTornadoPontos = (TextView) findViewById(R.id.txtPosturaDoTornadoPontos);
			txtPosturaDaPatadaVoadoraPontos = (TextView) findViewById(R.id.txtPosturaDaPatadaVoadoraPontos);
			txtPosturaDaRasteiraPontos = (TextView) findViewById(R.id.txtPosturaDaRasteiraPontos);
			txtPosturaDoContrachutePontos = (TextView) findViewById(R.id.txtPosturaDoContrachutePontos);
			txtChuteDoTornadoPontos = (TextView) findViewById(R.id.txtChuteDoTornadoPontos);
			txtPatadaVoadoraPontos = (TextView) findViewById(R.id.txtPatadaVoadoraPontos);
			txtRasteiraPontos = (TextView) findViewById(R.id.txtRasteiraPontos);
			txtContrachutePontos = (TextView) findViewById(R.id.txtContrachutePontos);
			txtPercepcaoSolarLunarEEstelarPontos = (TextView) findViewById(R.id.txtPercepcaoSolarLunarEEstelarPontos);
			txtOposicaoSolarLunarEEstelarPontos = (TextView) findViewById(R.id.txtOposicaoSolarLunarEEstelarPontos);
			txtSombraSolarLunarEEstelarPontos = (TextView) findViewById(R.id.txtSombraSolarLunarEEstelarPontos);
			txtAuxilioSolarLunarEEstelarPontos = (TextView) findViewById(R.id.txtAuxilioSolarLunarEEstelarPontos);
			txtTransmissaoSolarLunarEEstelarPontos = (TextView) findViewById(R.id.txtTransmissaoSolarLunarEEstelarPontos);
			txtUniaoSolarLunarEEstelarPontos = (TextView) findViewById(R.id.txtUniaoSolarLunarEEstelarPontos);
			txtCalorSolarPontos = (TextView) findViewById(R.id.txtCalorSolarPontos);
			txtFuriaSolarPontos = (TextView) findViewById(R.id.txtFuriaSolarPontos);
			txtProtecaoSolarPontos = (TextView) findViewById(R.id.txtProtecaoSolarPontos);
			txtBencaoSolarPontos = (TextView) findViewById(R.id.txtBencaoSolarPontos);
			txtCalorLunarPontos = (TextView) findViewById(R.id.txtCalorLunarPontos);
			txtFuriaLunarPontos = (TextView) findViewById(R.id.txtFuriaLunarPontos);
			txtProtecaoLunarPontos = (TextView) findViewById(R.id.txtProtecaoLunarPontos);
			txtBencaoLunarPontos = (TextView) findViewById(R.id.txtBencaoLunarPontos);
			txtCalorEstelarPontos = (TextView) findViewById(R.id.txtCalorEstelarPontos);
			txtFuriaEstelarPontos = (TextView) findViewById(R.id.txtFuriaEstelarPontos);
			txtProtecaoEstelarPontos = (TextView) findViewById(R.id.txtProtecaoEstelarPontos);
			txtBencaoEstelarPontos = (TextView) findViewById(R.id.txtBencaoEstelarPontos);

			//Txt pontos restantes
			txtClasse1 = (TextView) findViewById(R.id.txtClasse1);
			txtClasse2 = (TextView) findViewById(R.id.txtClasse2);

			//Layouts
			layChuteAereo = (LinearLayout) findViewById(R.id.layChuteAereo);
			layCorrida = (LinearLayout) findViewById(R.id.layCorrida);
			laySalto = (LinearLayout) findViewById(R.id.laySalto);
			layCambalhota = (LinearLayout) findViewById(R.id.layCambalhota);
			layTreguaRapida = (LinearLayout) findViewById(R.id.layTreguaRapida);
			layRetiroRapido = (LinearLayout) findViewById(R.id.layRetiroRapido);
			layKihop = (LinearLayout) findViewById(R.id.layKihop);
			layBrisaLeve = (LinearLayout) findViewById(R.id.layBrisaLeve);
			layMissaoTaekwon = (LinearLayout) findViewById(R.id.layMissaoTaekwon);
			layPosturaDoTornado = (LinearLayout) findViewById(R.id.layPosturaDoTornado);
			layPosturaDaPatadaVoadora = (LinearLayout) findViewById(R.id.layPosturaDaPatadaVoadora);
			layPosturaDaRasteira = (LinearLayout) findViewById(R.id.layPosturaDaRasteira);
			layPosturaDoContrachute = (LinearLayout) findViewById(R.id.layPosturaDoContrachute);
			layChuteDoTornado = (LinearLayout) findViewById(R.id.layChuteDoTornado);
			layPatadaVoadora = (LinearLayout) findViewById(R.id.layPatadaVoadora);
			layRasteira = (LinearLayout) findViewById(R.id.layRasteira);
			layContrachute = (LinearLayout) findViewById(R.id.layContrachute);
			layPercepcaoSolarLunarEEstelar = (LinearLayout) findViewById(R.id.layPercepcaoSolarLunarEEstelar);
			layOposicaoSolarLunarEEstelar = (LinearLayout) findViewById(R.id.layOposicaoSolarLunarEEstelar);
			laySombraSolarLunarEEstelar = (LinearLayout) findViewById(R.id.laySombraSolarLunarEEstelar);
			layAuxilioSolarLunarEEstelar = (LinearLayout) findViewById(R.id.layAuxilioSolarLunarEEstelar);
			layTransmissaoSolarLunarEEstelar = (LinearLayout) findViewById(R.id.layTransmissaoSolarLunarEEstelar);
			layUniaoSolarLunarEEstelar = (LinearLayout) findViewById(R.id.layUniaoSolarLunarEEstelar);
			layCalorSolar = (LinearLayout) findViewById(R.id.layCalorSolar);
			layFuriaSolar = (LinearLayout) findViewById(R.id.layFuriaSolar);
			layProtecaoSolar = (LinearLayout) findViewById(R.id.layProtecaoSolar);
			layBencaoSolar = (LinearLayout) findViewById(R.id.layBencaoSolar);
			layCalorLunar = (LinearLayout) findViewById(R.id.layCalorLunar);
			layFuriaLunar = (LinearLayout) findViewById(R.id.layFuriaLunar);
			layProtecaoLunar = (LinearLayout) findViewById(R.id.layProtecaoLunar);
			layBencaoLunar = (LinearLayout) findViewById(R.id.layBencaoLunar);
			layCalorEstelar = (LinearLayout) findViewById(R.id.layCalorEstelar);
			layFuriaEstelar = (LinearLayout) findViewById(R.id.layFuriaEstelar);
			layProtecaoEstelar = (LinearLayout) findViewById(R.id.layProtecaoEstelar);
			layBencaoEstelar = (LinearLayout) findViewById(R.id.layBencaoEstelar);

			if (id>0)
				recarregarBuild(id);
			
			layPrincipal = (LinearLayout) findViewById(R.id.habilidades);


			//Eventos de informação
			btChuteAereoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Chute Aéreo");
					dialogo.setMessage(R.string.chuteAereoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCorridaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Corrida");
					dialogo.setMessage(R.string.corridaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSaltoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Salto");
					dialogo.setMessage(R.string.saltoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCambalhotaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Cambalhota");
					dialogo.setMessage(R.string.cambalhotaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTreguaRapidaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Trégua Rápida");
					dialogo.setMessage(R.string.treguaRapidaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRetiroRapidoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Retiro Rápido");
					dialogo.setMessage(R.string.retiroRapidoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btKihopInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Kihop");
					dialogo.setMessage(R.string.kihopInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBrisaLeveInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Brisa Leve");
					dialogo.setMessage(R.string.brisaLeveInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMissaoTaekwonInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Missão Taekwon");
					dialogo.setMessage(R.string.missaoTaekwonInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPosturaDoTornadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Postura Do Tornado");
					dialogo.setMessage(R.string.posturaDoTornadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPosturaDaPatadaVoadoraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Postura Da Patada Voadora");
					dialogo.setMessage(R.string.posturaDaPatadaVoadoraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPosturaDaRasteiraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Postura Da Rasteira");
					dialogo.setMessage(R.string.posturaDaRasteiraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPosturaDoContrachuteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Postura Do Contrachute");
					dialogo.setMessage(R.string.posturaDoContrachuteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChuteDoTornadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Chute Do Tornado");
					dialogo.setMessage(R.string.chuteDoTornadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPatadaVoadoraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Patada Voadora");
					dialogo.setMessage(R.string.patadaVoadoraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRasteiraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Rasteira");
					dialogo.setMessage(R.string.rasteiraTaekwonInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btContrachuteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Contrachute");
					dialogo.setMessage(R.string.contrachuteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPercepcaoSolarLunarEEstelarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Percepção Solar Lunar E Estelar");
					dialogo.setMessage(R.string.percepcaoSolarLunarEEstelarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btOposicaoSolarLunarEEstelarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Oposição Solar Lunar E Estelar");
					dialogo.setMessage(R.string.oposicaoSolarLunarEEstelarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSombraSolarLunarEEstelarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Sombra Solar Lunar E Estelar");
					dialogo.setMessage(R.string.sombraSolarLunarEEstelarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAuxilioSolarLunarEEstelarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Auxílio Solar Lunar E Estelar");
					dialogo.setMessage(R.string.auxilioSolarLunarEEstelarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTransmissaoSolarLunarEEstelarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Transmissão Solar Lunar E Estelar");
					dialogo.setMessage(R.string.transmissaoSolarLunarEEstelarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btUniaoSolarLunarEEstelarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("União Solar Lunar E Estelar");
					dialogo.setMessage(R.string.uniaoSolarLunarEEstelarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCalorSolarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Calor Solar");
					dialogo.setMessage(R.string.calorSolarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFuriaSolarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Fúria Solar");
					dialogo.setMessage(R.string.furiaSolarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btProtecaoSolarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Proteção Solar");
					dialogo.setMessage(R.string.protecaoSolarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBencaoSolarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Bênção Solar");
					dialogo.setMessage(R.string.bencaoSolarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCalorLunarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Calor Lunar");
					dialogo.setMessage(R.string.calorLunarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFuriaLunarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Fúria Lunar");
					dialogo.setMessage(R.string.furiaLunarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btProtecaoLunarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Proteção Lunar");
					dialogo.setMessage(R.string.protecaoLunarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBencaoLunarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Bênção Lunar");
					dialogo.setMessage(R.string.bencaoLunarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCalorEstelarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Calor Estelar");
					dialogo.setMessage(R.string.calorEstelarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btFuriaEstelarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Fúria Estelar");
					dialogo.setMessage(R.string.furiaEstelarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btProtecaoEstelarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Proteção Estelar");
					dialogo.setMessage(R.string.protecaoEstelarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBencaoEstelarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Bênção Estelar");
					dialogo.setMessage(R.string.bencaoEstelarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAnjoSolarLunarEEstelarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Anjo Solar Lunar E Estelar");
					dialogo.setMessage(R.string.anjoSolarLunarEEstelarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMilagreSolarLunarEEstelarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					dialogo.setTitle("Milagre Solar Lunar E Estelar");
					dialogo.setMessage(R.string.milagreSolarLunarEEstelarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});


			//Eventos de aumentar
			btChuteAereoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChuteAereo, "ChuteAereo", 7, 1, "Aumentar");

				}
			});
			btCorridaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCorrida, "Corrida", 10, 1, "Aumentar");

				}
			});
			btSaltoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSalto, "Salto", 5, 1, "Aumentar");

				}
			});
			btCambalhotaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varChuteAereo<7 && count<7){
						atualizarCalculo(varChuteAereo, "ChuteAereo", 7, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCambalhota, "Cambalhota", 1, 1, "Aumentar");

				}
			});
			btTreguaRapidaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTreguaRapida, "TreguaRapida", 10, 1, "Aumentar");

				}
			});
			btRetiroRapidoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRetiroRapido, "RetiroRapido", 10, 1, "Aumentar");

				}
			});
			btKihopAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varKihop, "Kihop", 5, 1, "Aumentar");

				}
			});
			btBrisaLeveAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varKihop<5 && count<5){
						atualizarCalculo(varKihop, "Kihop", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRetiroRapido<5 && count<5){
						atualizarCalculo(varRetiroRapido, "RetiroRapido", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTreguaRapida<5 && count<5){
						atualizarCalculo(varTreguaRapida, "TreguaRapida", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBrisaLeve, "BrisaLeve", 7, 1, "Aumentar");

				}
			});
			btMissaoTaekwonAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varKihop<5 && count<5){
						atualizarCalculo(varKihop, "Kihop", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varMissaoTaekwon, "MissaoTaekwon", 1, 1, "Aumentar");

				}
			});
			btPosturaDoTornadoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varChuteDoTornado<1 && count<1){
						atualizarCalculo(varChuteDoTornado, "ChuteDoTornado", 7, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPosturaDoTornado, "PosturaDoTornado", 1, 1, "Aumentar");

				}
			});
			btPosturaDaPatadaVoadoraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPatadaVoadora<1 && count<1){
						atualizarCalculo(varPatadaVoadora, "PatadaVoadora", 7, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPosturaDaPatadaVoadora, "PosturaDaPatadaVoadora", 1, 1, "Aumentar");

				}
			});
			btPosturaDaRasteiraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRasteira<1 && count<1){
						atualizarCalculo(varRasteira, "Rasteira", 7, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPosturaDaRasteira, "PosturaDaRasteira", 1, 1, "Aumentar");

				}
			});
			btPosturaDoContrachuteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varContrachute<1 && count<1){
						atualizarCalculo(varContrachute, "Contrachute", 7, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPosturaDoContrachute, "PosturaDoContrachute", 1, 1, "Aumentar");

				}
			});
			btChuteDoTornadoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChuteDoTornado, "ChuteDoTornado", 7, 1, "Aumentar");

				}
			});
			btPatadaVoadoraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPatadaVoadora, "PatadaVoadora", 7, 1, "Aumentar");

				}
			});
			btRasteiraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRasteira, "Rasteira", 7, 1, "Aumentar");

				}
			});
			btContrachuteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varContrachute, "Contrachute", 7, 1, "Aumentar");

				}
			});
			btPercepcaoSolarLunarEEstelarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPercepcaoSolarLunarEEstelar, "PercepcaoSolarLunarEEstelar", 3, 2, "Aumentar");

				}
			});
			btOposicaoSolarLunarEEstelarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOposicaoSolarLunarEEstelar, "OposicaoSolarLunarEEstelar", 3, 2, "Aumentar");

				}
			});
			btSombraSolarLunarEEstelarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSombraSolarLunarEEstelar, "SombraSolarLunarEEstelar", 10, 2, "Aumentar");

				}
			});
			btAuxilioSolarLunarEEstelarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAuxilioSolarLunarEEstelar, "AuxilioSolarLunarEEstelar", 3, 2, "Aumentar");

				}
			});
			btTransmissaoSolarLunarEEstelarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTransmissaoSolarLunarEEstelar, "TransmissaoSolarLunarEEstelar", 10, 2, "Aumentar");

				}
			});
			btUniaoSolarLunarEEstelarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varTransmissaoSolarLunarEEstelar<9 && count<9){
						atualizarCalculo(varTransmissaoSolarLunarEEstelar, "TransmissaoSolarLunarEEstelar", 10, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varUniaoSolarLunarEEstelar, "UniaoSolarLunarEEstelar", 1, 2, "Aumentar");

				}
			});
			btCalorSolarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPercepcaoSolarLunarEEstelar<1 && count<1){
						atualizarCalculo(varPercepcaoSolarLunarEEstelar, "PercepcaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCalorSolar, "CalorSolar", 3, 2, "Aumentar");

				}
			});
			btFuriaSolarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varOposicaoSolarLunarEEstelar<1 && count<1){
						atualizarCalculo(varOposicaoSolarLunarEEstelar, "OposicaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFuriaSolar, "FuriaSolar", 3, 2, "Aumentar");

				}
			});
			btProtecaoSolarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPercepcaoSolarLunarEEstelar<1 && count<1){
						atualizarCalculo(varPercepcaoSolarLunarEEstelar, "PercepcaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varProtecaoSolar, "ProtecaoSolar", 4, 2, "Aumentar");

				}
			});
			btBencaoSolarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPercepcaoSolarLunarEEstelar<1 && count<1){
						atualizarCalculo(varPercepcaoSolarLunarEEstelar, "PercepcaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varOposicaoSolarLunarEEstelar<1 && count<1){
						atualizarCalculo(varOposicaoSolarLunarEEstelar, "OposicaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBencaoSolar, "BencaoSolar", 5, 2, "Aumentar");

				}
			});
			btCalorLunarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPercepcaoSolarLunarEEstelar<2 && count<2){
						atualizarCalculo(varPercepcaoSolarLunarEEstelar, "PercepcaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCalorLunar, "CalorLunar", 3, 2, "Aumentar");

				}
			});
			btFuriaLunarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varOposicaoSolarLunarEEstelar<2 && count<2){
						atualizarCalculo(varOposicaoSolarLunarEEstelar, "OposicaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFuriaLunar, "FuriaLunar", 3, 2, "Aumentar");

				}
			});
			btProtecaoLunarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPercepcaoSolarLunarEEstelar<2 && count<2){
						atualizarCalculo(varPercepcaoSolarLunarEEstelar, "PercepcaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varProtecaoLunar, "ProtecaoLunar", 4, 2, "Aumentar");

				}
			});
			btBencaoLunarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPercepcaoSolarLunarEEstelar<2 && count<2){
						atualizarCalculo(varPercepcaoSolarLunarEEstelar, "PercepcaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varOposicaoSolarLunarEEstelar<2 && count<2){
						atualizarCalculo(varOposicaoSolarLunarEEstelar, "OposicaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBencaoLunar, "BencaoLunar", 5, 2, "Aumentar");

				}
			});
			btCalorEstelarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPercepcaoSolarLunarEEstelar<3 && count<3){
						atualizarCalculo(varPercepcaoSolarLunarEEstelar, "PercepcaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCalorEstelar, "CalorEstelar", 3, 2, "Aumentar");

				}
			});
			btFuriaEstelarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varOposicaoSolarLunarEEstelar<3 && count<3){
						atualizarCalculo(varOposicaoSolarLunarEEstelar, "OposicaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varFuriaEstelar, "FuriaEstelar", 3, 2, "Aumentar");

				}
			});
			btProtecaoEstelarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPercepcaoSolarLunarEEstelar<3 && count<3){
						atualizarCalculo(varPercepcaoSolarLunarEEstelar, "PercepcaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varProtecaoEstelar, "ProtecaoEstelar", 4, 2, "Aumentar");

				}
			});
			btBencaoEstelarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPercepcaoSolarLunarEEstelar<3 && count<3){
						atualizarCalculo(varPercepcaoSolarLunarEEstelar, "PercepcaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varOposicaoSolarLunarEEstelar<3 && count<3){
						atualizarCalculo(varOposicaoSolarLunarEEstelar, "OposicaoSolarLunarEEstelar", 3, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBencaoEstelar, "BencaoEstelar", 5, 2, "Aumentar");

				}
			});


			//Eventos de diminuir
			btChuteAereoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChuteAereo, "ChuteAereo", 7, 1, "Diminuir");

				}
			});
			btCorridaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCorrida, "Corrida", 10, 1, "Diminuir");

				}
			});
			btSaltoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSalto, "Salto", 5, 1, "Diminuir");

				}
			});
			btCambalhotaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCambalhota, "Cambalhota", 1, 1, "Diminuir");

				}
			});
			btTreguaRapidaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTreguaRapida, "TreguaRapida", 10, 1, "Diminuir");

				}
			});
			btRetiroRapidoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRetiroRapido, "RetiroRapido", 10, 1, "Diminuir");

				}
			});
			btKihopDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varKihop, "Kihop", 5, 1, "Diminuir");

				}
			});
			btBrisaLeveDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBrisaLeve, "BrisaLeve", 7, 1, "Diminuir");

				}
			});
			btMissaoTaekwonDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varMissaoTaekwon, "MissaoTaekwon", 1, 1, "Diminuir");

				}
			});
			btPosturaDoTornadoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPosturaDoTornado, "PosturaDoTornado", 1, 1, "Diminuir");

				}
			});
			btPosturaDaPatadaVoadoraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPosturaDaPatadaVoadora, "PosturaDaPatadaVoadora", 1, 1, "Diminuir");

				}
			});
			btPosturaDaRasteiraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPosturaDaRasteira, "PosturaDaRasteira", 1, 1, "Diminuir");

				}
			});
			btPosturaDoContrachuteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPosturaDoContrachute, "PosturaDoContrachute", 1, 1, "Diminuir");

				}
			});
			btChuteDoTornadoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChuteDoTornado, "ChuteDoTornado", 7, 1, "Diminuir");

				}
			});
			btPatadaVoadoraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPatadaVoadora, "PatadaVoadora", 7, 1, "Diminuir");

				}
			});
			btRasteiraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRasteira, "Rasteira", 7, 1, "Diminuir");

				}
			});
			btContrachuteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varContrachute, "Contrachute", 7, 1, "Diminuir");

				}
			});
			btPercepcaoSolarLunarEEstelarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPercepcaoSolarLunarEEstelar, "PercepcaoSolarLunarEEstelar", 3, 2, "Diminuir");

				}
			});
			btOposicaoSolarLunarEEstelarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varOposicaoSolarLunarEEstelar, "OposicaoSolarLunarEEstelar", 3, 2, "Diminuir");

				}
			});
			btSombraSolarLunarEEstelarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSombraSolarLunarEEstelar, "SombraSolarLunarEEstelar", 10, 2, "Diminuir");

				}
			});
			btAuxilioSolarLunarEEstelarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAuxilioSolarLunarEEstelar, "AuxilioSolarLunarEEstelar", 3, 2, "Diminuir");

				}
			});
			btTransmissaoSolarLunarEEstelarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTransmissaoSolarLunarEEstelar, "TransmissaoSolarLunarEEstelar", 10, 2, "Diminuir");

				}
			});
			btUniaoSolarLunarEEstelarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varUniaoSolarLunarEEstelar, "UniaoSolarLunarEEstelar", 1, 2, "Diminuir");

				}
			});
			btCalorSolarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCalorSolar, "CalorSolar", 3, 2, "Diminuir");

				}
			});
			btFuriaSolarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFuriaSolar, "FuriaSolar", 3, 2, "Diminuir");

				}
			});
			btProtecaoSolarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varProtecaoSolar, "ProtecaoSolar", 4, 2, "Diminuir");

				}
			});
			btBencaoSolarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBencaoSolar, "BencaoSolar", 5, 2, "Diminuir");

				}
			});
			btCalorLunarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCalorLunar, "CalorLunar", 3, 2, "Diminuir");

				}
			});
			btFuriaLunarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFuriaLunar, "FuriaLunar", 3, 2, "Diminuir");

				}
			});
			btProtecaoLunarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varProtecaoLunar, "ProtecaoLunar", 4, 2, "Diminuir");

				}
			});
			btBencaoLunarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBencaoLunar, "BencaoLunar", 5, 2, "Diminuir");

				}
			});
			btCalorEstelarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCalorEstelar, "CalorEstelar", 3, 2, "Diminuir");

				}
			});
			btFuriaEstelarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varFuriaEstelar, "FuriaEstelar", 3, 2, "Diminuir");

				}
			});
			btProtecaoEstelarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varProtecaoEstelar, "ProtecaoEstelar", 4, 2, "Diminuir");

				}
			});
			btBencaoEstelarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBencaoEstelar, "BencaoEstelar", 5, 2, "Diminuir");

				}
			});


			//Outros Botões
			btResetar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					varChuteAereo = 0;
					varCorrida = 0;
					varSalto = 0;
					varCambalhota = 0;
					varTreguaRapida = 0;
					varRetiroRapido = 0;
					varKihop = 0;
					varBrisaLeve = 0;
					varMissaoTaekwon = 0;
					varPosturaDoTornado = 0;
					varPosturaDaPatadaVoadora = 0;
					varPosturaDaRasteira = 0;
					varPosturaDoContrachute = 0;
					varChuteDoTornado = 0;
					varPatadaVoadora = 0;
					varRasteira = 0;
					varContrachute = 0;
					varPercepcaoSolarLunarEEstelar = 0;
					varOposicaoSolarLunarEEstelar = 0;
					varSombraSolarLunarEEstelar = 0;
					varAuxilioSolarLunarEEstelar = 0;
					varTransmissaoSolarLunarEEstelar = 0;
					varUniaoSolarLunarEEstelar = 0;
					varCalorSolar = 0;
					varFuriaSolar = 0;
					varProtecaoSolar = 0;
					varBencaoSolar = 0;
					varCalorLunar = 0;
					varFuriaLunar = 0;
					varProtecaoLunar = 0;
					varBencaoLunar = 0;
					varCalorEstelar = 0;
					varFuriaEstelar = 0;
					varProtecaoEstelar = 0;
					varBencaoEstelar = 0;

					primeiraClasse = 49;
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
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorMestreTaekwon.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorMestreTaekwon.this);
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

					AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorMestreTaekwon.this);
					msg.setTitle("Escolha um nome");
					msg.setMessage("OBS: Salvar PNG só irá salvar em forma de imagem! É recomendado que salve a build na memória do celular também.\nEscolha um nome para salvar esta simulação:");
					final EditText nomeParaSalvar = new EditText(SimuladorMestreTaekwon.this);
					msg.setView(nomeParaSalvar);
					msg.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {

							@Override
						public void onClick(DialogInterface dialog, int which) {
							if (nomeParaSalvar.getText().toString().length() <= 0) {
								nomeParaSalvar.setError("Preencha o campo!");
								Toast.makeText(getBaseContext(), "ERROR: Insira um nome!", Toast.LENGTH_SHORT).show();
							} else {
								SaveFile sf = new SaveFile();
								sf.takeAScreenShot(SimuladorMestreTaekwon.this, layPrincipal, nomeParaSalvar.getText().toString());
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
			if(varChuteAereo==0)
				layChuteAereo.setVisibility(View.GONE);
			if(varCorrida==0)
				layCorrida.setVisibility(View.GONE);
			if(varSalto==0)
				laySalto.setVisibility(View.GONE);
			if(varCambalhota==0)
				layCambalhota.setVisibility(View.GONE);
			if(varTreguaRapida==0)
				layTreguaRapida.setVisibility(View.GONE);
			if(varRetiroRapido==0)
				layRetiroRapido.setVisibility(View.GONE);
			if(varKihop==0)
				layKihop.setVisibility(View.GONE);
			if(varBrisaLeve==0)
				layBrisaLeve.setVisibility(View.GONE);
			if(varMissaoTaekwon==0)
				layMissaoTaekwon.setVisibility(View.GONE);
			if(varPosturaDoTornado==0)
				layPosturaDoTornado.setVisibility(View.GONE);
			if(varPosturaDaPatadaVoadora==0)
				layPosturaDaPatadaVoadora.setVisibility(View.GONE);
			if(varPosturaDaRasteira==0)
				layPosturaDaRasteira.setVisibility(View.GONE);
			if(varPosturaDoContrachute==0)
				layPosturaDoContrachute.setVisibility(View.GONE);
			if(varChuteDoTornado==0)
				layChuteDoTornado.setVisibility(View.GONE);
			if(varPatadaVoadora==0)
				layPatadaVoadora.setVisibility(View.GONE);
			if(varRasteira==0)
				layRasteira.setVisibility(View.GONE);
			if(varContrachute==0)
				layContrachute.setVisibility(View.GONE);

			if(varPercepcaoSolarLunarEEstelar==0)
				layPercepcaoSolarLunarEEstelar.setVisibility(View.GONE);
			if(varOposicaoSolarLunarEEstelar==0)
				layOposicaoSolarLunarEEstelar.setVisibility(View.GONE);
			if(varSombraSolarLunarEEstelar==0)
				laySombraSolarLunarEEstelar.setVisibility(View.GONE);
			if(varAuxilioSolarLunarEEstelar==0)
				layAuxilioSolarLunarEEstelar.setVisibility(View.GONE);
			if(varTransmissaoSolarLunarEEstelar==0)
				layTransmissaoSolarLunarEEstelar.setVisibility(View.GONE);
			if(varUniaoSolarLunarEEstelar==0)
				layUniaoSolarLunarEEstelar.setVisibility(View.GONE);
			if(varCalorSolar==0)
				layCalorSolar.setVisibility(View.GONE);
			if(varFuriaSolar==0)
				layFuriaSolar.setVisibility(View.GONE);
			if(varProtecaoSolar==0)
				layProtecaoSolar.setVisibility(View.GONE);
			if(varBencaoSolar==0)
				layBencaoSolar.setVisibility(View.GONE);
			if(varCalorLunar==0)
				layCalorLunar.setVisibility(View.GONE);
			if(varFuriaLunar==0)
				layFuriaLunar.setVisibility(View.GONE);
			if(varProtecaoLunar==0)
				layProtecaoLunar.setVisibility(View.GONE);
			if(varBencaoLunar==0)
				layBencaoLunar.setVisibility(View.GONE);
			if(varCalorEstelar==0)
				layCalorEstelar.setVisibility(View.GONE);
			if(varFuriaEstelar==0)
				layFuriaEstelar.setVisibility(View.GONE);
			if(varProtecaoEstelar==0)
				layProtecaoEstelar.setVisibility(View.GONE);
			if(varBencaoEstelar==0)
				layBencaoEstelar.setVisibility(View.GONE);

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

				if (nomeDaHabilidade=="ChuteAereo" && varCambalhota>=1 && varChuteAereo<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Kihop" && varBrisaLeve>=1 && varKihop<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RetiroRapido" && varBrisaLeve>=1 && varRetiroRapido<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TreguaRapida" && varBrisaLeve>=1 && varTreguaRapida<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Kihop" && varMissaoTaekwon>=1 && varKihop<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ChuteDoTornado" && varPosturaDoTornado>=1 && varChuteDoTornado<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PatadaVoadora" && varPosturaDaPatadaVoadora>=1 && varPatadaVoadora<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Rasteira" && varPosturaDaRasteira>=1 && varRasteira<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Contrachute" && varPosturaDoContrachute>=1 && varContrachute<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TransmissaoSolarLunarEEstelar" && varUniaoSolarLunarEEstelar>=1 && varTransmissaoSolarLunarEEstelar<=9){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PercepcaoSolarLunarEEstelar" && varCalorSolar>=1 && varPercepcaoSolarLunarEEstelar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OposicaoSolarLunarEEstelar" && varFuriaSolar>=1 && varOposicaoSolarLunarEEstelar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PercepcaoSolarLunarEEstelar" && varProtecaoSolar>=1 && varPercepcaoSolarLunarEEstelar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PercepcaoSolarLunarEEstelar" && varBencaoSolar>=1 && varPercepcaoSolarLunarEEstelar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OposicaoSolarLunarEEstelar" && varBencaoSolar>=1 && varOposicaoSolarLunarEEstelar<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PercepcaoSolarLunarEEstelar" && varCalorLunar>=1 && varPercepcaoSolarLunarEEstelar<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OposicaoSolarLunarEEstelar" && varFuriaLunar>=1 && varOposicaoSolarLunarEEstelar<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PercepcaoSolarLunarEEstelar" && varProtecaoLunar>=1 && varPercepcaoSolarLunarEEstelar<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PercepcaoSolarLunarEEstelar" && varBencaoLunar>=1 && varPercepcaoSolarLunarEEstelar<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OposicaoSolarLunarEEstelar" && varBencaoLunar>=1 && varOposicaoSolarLunarEEstelar<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PercepcaoSolarLunarEEstelar" && varCalorEstelar>=1 && varPercepcaoSolarLunarEEstelar<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OposicaoSolarLunarEEstelar" && varFuriaEstelar>=1 && varOposicaoSolarLunarEEstelar<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PercepcaoSolarLunarEEstelar" && varProtecaoEstelar>=1 && varPercepcaoSolarLunarEEstelar<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PercepcaoSolarLunarEEstelar" && varBencaoEstelar>=1 && varPercepcaoSolarLunarEEstelar<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="OposicaoSolarLunarEEstelar" && varBencaoEstelar>=1 && varOposicaoSolarLunarEEstelar<=03){
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
			if(nomeDaHabilidade=="ChuteAereo"){
				varChuteAereo = habilidade;
			} else if(nomeDaHabilidade=="Corrida"){
				varCorrida = habilidade;
			} else if(nomeDaHabilidade=="Salto"){
				varSalto = habilidade;
			} else if(nomeDaHabilidade=="Cambalhota"){
				varCambalhota = habilidade;
			} else if(nomeDaHabilidade=="TreguaRapida"){
				varTreguaRapida = habilidade;
			} else if(nomeDaHabilidade=="RetiroRapido"){
				varRetiroRapido = habilidade;
			} else if(nomeDaHabilidade=="Kihop"){
				varKihop = habilidade;
			} else if(nomeDaHabilidade=="BrisaLeve"){
				varBrisaLeve = habilidade;
			} else if(nomeDaHabilidade=="MissaoTaekwon"){
				varMissaoTaekwon = habilidade;
			} else if(nomeDaHabilidade=="PosturaDoTornado"){
				varPosturaDoTornado = habilidade;
			} else if(nomeDaHabilidade=="PosturaDaPatadaVoadora"){
				varPosturaDaPatadaVoadora = habilidade;
			} else if(nomeDaHabilidade=="PosturaDaRasteira"){
				varPosturaDaRasteira = habilidade;
			} else if(nomeDaHabilidade=="PosturaDoContrachute"){
				varPosturaDoContrachute = habilidade;
			} else if(nomeDaHabilidade=="ChuteDoTornado"){
				varChuteDoTornado = habilidade;
			} else if(nomeDaHabilidade=="PatadaVoadora"){
				varPatadaVoadora = habilidade;
			} else if(nomeDaHabilidade=="Rasteira"){
				varRasteira = habilidade;
			} else if(nomeDaHabilidade=="Contrachute"){
				varContrachute = habilidade;
			}

			else if(nomeDaHabilidade=="PercepcaoSolarLunarEEstelar"){
				varPercepcaoSolarLunarEEstelar = habilidade;
			} else if(nomeDaHabilidade=="OposicaoSolarLunarEEstelar"){
				varOposicaoSolarLunarEEstelar = habilidade;
			} else if(nomeDaHabilidade=="SombraSolarLunarEEstelar"){
				varSombraSolarLunarEEstelar = habilidade;
			} else if(nomeDaHabilidade=="AuxilioSolarLunarEEstelar"){
				varAuxilioSolarLunarEEstelar = habilidade;
			} else if(nomeDaHabilidade=="TransmissaoSolarLunarEEstelar"){
				varTransmissaoSolarLunarEEstelar = habilidade;
			} else if(nomeDaHabilidade=="UniaoSolarLunarEEstelar"){
				varUniaoSolarLunarEEstelar = habilidade;
			} else if(nomeDaHabilidade=="CalorSolar"){
				varCalorSolar = habilidade;
			} else if(nomeDaHabilidade=="FuriaSolar"){
				varFuriaSolar = habilidade;
			} else if(nomeDaHabilidade=="ProtecaoSolar"){
				varProtecaoSolar = habilidade;
			} else if(nomeDaHabilidade=="BencaoSolar"){
				varBencaoSolar = habilidade;
			} else if(nomeDaHabilidade=="CalorLunar"){
				varCalorLunar = habilidade;
			} else if(nomeDaHabilidade=="FuriaLunar"){
				varFuriaLunar = habilidade;
			} else if(nomeDaHabilidade=="ProtecaoLunar"){
				varProtecaoLunar = habilidade;
			} else if(nomeDaHabilidade=="BencaoLunar"){
				varBencaoLunar = habilidade;
			} else if(nomeDaHabilidade=="CalorEstelar"){
				varCalorEstelar = habilidade;
			} else if(nomeDaHabilidade=="FuriaEstelar"){
				varFuriaEstelar = habilidade;
			} else if(nomeDaHabilidade=="ProtecaoEstelar"){
				varProtecaoEstelar = habilidade;
			} else if(nomeDaHabilidade=="BencaoEstelar"){
				varBencaoEstelar = habilidade;
			}

			atualizarTela();

		}

		public void atualizarTela(){
			txtChuteAereoPontos.setText(varChuteAereo + "/7");
			txtCorridaPontos.setText(varCorrida + "/10");
			txtSaltoPontos.setText(varSalto + "/5");
			txtCambalhotaPontos.setText(varCambalhota + "/1");
			txtTreguaRapidaPontos.setText(varTreguaRapida + "/10");
			txtRetiroRapidoPontos.setText(varRetiroRapido + "/10");
			txtKihopPontos.setText(varKihop + "/5");
			txtBrisaLevePontos.setText(varBrisaLeve + "/7");
			txtMissaoTaekwonPontos.setText(varMissaoTaekwon + "/1");
			txtPosturaDoTornadoPontos.setText(varPosturaDoTornado + "/1");
			txtPosturaDaPatadaVoadoraPontos.setText(varPosturaDaPatadaVoadora + "/1");
			txtPosturaDaRasteiraPontos.setText(varPosturaDaRasteira + "/1");
			txtPosturaDoContrachutePontos.setText(varPosturaDoContrachute + "/1");
			txtChuteDoTornadoPontos.setText(varChuteDoTornado + "/7");
			txtPatadaVoadoraPontos.setText(varPatadaVoadora + "/7");
			txtRasteiraPontos.setText(varRasteira + "/7");
			txtContrachutePontos.setText(varContrachute + "/7");

			txtPercepcaoSolarLunarEEstelarPontos.setText(varPercepcaoSolarLunarEEstelar + "/3");
			txtOposicaoSolarLunarEEstelarPontos.setText(varOposicaoSolarLunarEEstelar + "/3");
			txtSombraSolarLunarEEstelarPontos.setText(varSombraSolarLunarEEstelar + "/10");
			txtAuxilioSolarLunarEEstelarPontos.setText(varAuxilioSolarLunarEEstelar + "/3");
			txtTransmissaoSolarLunarEEstelarPontos.setText(varTransmissaoSolarLunarEEstelar + "/10");
			txtUniaoSolarLunarEEstelarPontos.setText(varUniaoSolarLunarEEstelar + "/1");
			txtCalorSolarPontos.setText(varCalorSolar + "/3");
			txtFuriaSolarPontos.setText(varFuriaSolar + "/3");
			txtProtecaoSolarPontos.setText(varProtecaoSolar + "/4");
			txtBencaoSolarPontos.setText(varBencaoSolar + "/5");
			txtCalorLunarPontos.setText(varCalorLunar + "/3");
			txtFuriaLunarPontos.setText(varFuriaLunar + "/3");
			txtProtecaoLunarPontos.setText(varProtecaoLunar + "/4");
			txtBencaoLunarPontos.setText(varBencaoLunar + "/5");
			txtCalorEstelarPontos.setText(varCalorEstelar + "/3");
			txtFuriaEstelarPontos.setText(varFuriaEstelar + "/3");
			txtProtecaoEstelarPontos.setText(varProtecaoEstelar + "/4");
			txtBencaoEstelarPontos.setText(varBencaoEstelar + "/5");

			txtClasse1.setText("Classe 1: " + primeiraClasse);
			txtClasse2.setText("Classe 2: " + segundaClasse);

			tudoVisivel();
		}

		public void tudoVisivel(){
			layChuteAereo.setVisibility(View.VISIBLE);
			layCorrida.setVisibility(View.VISIBLE);
			laySalto.setVisibility(View.VISIBLE);
			layCambalhota.setVisibility(View.VISIBLE);
			layTreguaRapida.setVisibility(View.VISIBLE);
			layRetiroRapido.setVisibility(View.VISIBLE);
			layKihop.setVisibility(View.VISIBLE);
			layBrisaLeve.setVisibility(View.VISIBLE);
			layMissaoTaekwon.setVisibility(View.VISIBLE);
			layPosturaDoTornado.setVisibility(View.VISIBLE);
			layPosturaDaPatadaVoadora.setVisibility(View.VISIBLE);
			layPosturaDaRasteira.setVisibility(View.VISIBLE);
			layPosturaDoContrachute.setVisibility(View.VISIBLE);
			layChuteDoTornado.setVisibility(View.VISIBLE);
			layPatadaVoadora.setVisibility(View.VISIBLE);
			layRasteira.setVisibility(View.VISIBLE);
			layContrachute.setVisibility(View.VISIBLE);

			layPercepcaoSolarLunarEEstelar.setVisibility(View.VISIBLE);
			layOposicaoSolarLunarEEstelar.setVisibility(View.VISIBLE);
			laySombraSolarLunarEEstelar.setVisibility(View.VISIBLE);
			layAuxilioSolarLunarEEstelar.setVisibility(View.VISIBLE);
			layTransmissaoSolarLunarEEstelar.setVisibility(View.VISIBLE);
			layUniaoSolarLunarEEstelar.setVisibility(View.VISIBLE);
			layCalorSolar.setVisibility(View.VISIBLE);
			layFuriaSolar.setVisibility(View.VISIBLE);
			layProtecaoSolar.setVisibility(View.VISIBLE);
			layBencaoSolar.setVisibility(View.VISIBLE);
			layCalorLunar.setVisibility(View.VISIBLE);
			layFuriaLunar.setVisibility(View.VISIBLE);
			layProtecaoLunar.setVisibility(View.VISIBLE);
			layBencaoLunar.setVisibility(View.VISIBLE);
			layCalorEstelar.setVisibility(View.VISIBLE);
			layFuriaEstelar.setVisibility(View.VISIBLE);
			layProtecaoEstelar.setVisibility(View.VISIBLE);
			layBencaoEstelar.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM mestre_taekwon WHERE _id = ?", new String[]{String.valueOf(id)});

			if(cs.moveToFirst()){
			primeiraClasse = cs.getInt(2);
			segundaClasse = cs.getInt(3);

			varChuteAereo = cs.getInt(4);
			varCorrida = cs.getInt(5);
			varSalto = cs.getInt(6);
			varCambalhota = cs.getInt(7);
			varTreguaRapida = cs.getInt(8);
			varRetiroRapido = cs.getInt(9);
			varKihop = cs.getInt(10);
			varBrisaLeve = cs.getInt(11);
			varMissaoTaekwon = cs.getInt(12);
			varPosturaDoTornado = cs.getInt(13);
			varPosturaDaPatadaVoadora = cs.getInt(14);
			varPosturaDaRasteira = cs.getInt(15);
			varPosturaDoContrachute = cs.getInt(16);
			varChuteDoTornado = cs.getInt(17);
			varPatadaVoadora = cs.getInt(18);
			varRasteira = cs.getInt(19);
			varContrachute = cs.getInt(20);

			varPercepcaoSolarLunarEEstelar = cs.getInt(21);
			varOposicaoSolarLunarEEstelar = cs.getInt(22);
			varSombraSolarLunarEEstelar = cs.getInt(23);
			varAuxilioSolarLunarEEstelar = cs.getInt(24);
			varTransmissaoSolarLunarEEstelar = cs.getInt(25);
			varUniaoSolarLunarEEstelar = cs.getInt(26);
			varCalorSolar = cs.getInt(27);
			varFuriaSolar = cs.getInt(28);
			varProtecaoSolar = cs.getInt(29);
			varBencaoSolar = cs.getInt(30);
			varCalorLunar = cs.getInt(31);
			varFuriaLunar = cs.getInt(32);
			varProtecaoLunar = cs.getInt(33);
			varBencaoLunar = cs.getInt(34);
			varCalorEstelar = cs.getInt(35);
			varFuriaEstelar = cs.getInt(36);
			varProtecaoEstelar = cs.getInt(37);
			varBencaoEstelar = cs.getInt(38);

			skillPrimeira = cs.getInt(39);
			skillSegunda = cs.getInt(40);
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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS mestre_taekwon (");
					sqlClasse.append("_id INTEGER PRIMARY KEY, ");
					sqlClasse.append("nome VARCHAR(30), ");
					sqlClasse.append("primeira_classe INT(2), ");
					sqlClasse.append("segunda_classe INT(2), ");
					sqlClasse.append("skill_chuteaereo INT(2), ");
					sqlClasse.append("skill_corrida INT(2), ");
					sqlClasse.append("skill_salto INT(2), ");
					sqlClasse.append("skill_cambalhota INT(2), ");
					sqlClasse.append("skill_treguarapida INT(2), ");
					sqlClasse.append("skill_retirorapido INT(2), ");
					sqlClasse.append("skill_kihop INT(2), ");
					sqlClasse.append("skill_brisaleve INT(2), ");
					sqlClasse.append("skill_missaotaekwon INT(2), ");
					sqlClasse.append("skill_posturadotornado INT(2), ");
					sqlClasse.append("skill_posturadapatadavoadora INT(2), ");
					sqlClasse.append("skill_posturadarasteira INT(2), ");
					sqlClasse.append("skill_posturadocontrachute INT(2), ");
					sqlClasse.append("skill_chutedotornado INT(2), ");
					sqlClasse.append("skill_patadavoadora INT(2), ");
					sqlClasse.append("skill_rasteira INT(2), ");
					sqlClasse.append("skill_contrachute INT(2), ");
					sqlClasse.append("skill_percepcaosolarlunareestelar INT(2), ");
					sqlClasse.append("skill_oposicaosolarlunareestelar INT(2), ");
					sqlClasse.append("skill_sombrasolarlunareestelar INT(2), ");
					sqlClasse.append("skill_auxiliosolarlunareestelar INT(2), ");
					sqlClasse.append("skill_transmissaosolarlunareestelar INT(2), ");
					sqlClasse.append("skill_uniaosolarlunareestelar INT(2), ");
					sqlClasse.append("skill_calorsolar INT(2), ");
					sqlClasse.append("skill_furiasolar INT(2), ");
					sqlClasse.append("skill_protecaosolar INT(2), ");
					sqlClasse.append("skill_bencaosolar INT(2), ");
					sqlClasse.append("skill_calorlunar INT(2), ");
					sqlClasse.append("skill_furialunar INT(2), ");
					sqlClasse.append("skill_protecaolunar INT(2), ");
					sqlClasse.append("skill_bencaolunar INT(2), ");
					sqlClasse.append("skill_calorestelar INT(2), ");
					sqlClasse.append("skill_furiaestelar INT(2), ");
					sqlClasse.append("skill_protecaoestelar INT(2), ");
					sqlClasse.append("skill_bencaoestelar INT(2), ");
					sqlClasse.append("skill_primeira INT(2), ");
					sqlClasse.append("skill_segunda INT(2));");
					db.execSQL(sqlClasse.toString());

					ContentValues ins = new ContentValues();
					ins.put("nome", nomeDaSim);
					ins.put("primeira_classe", primeiraClasse);
					ins.put("segunda_classe", segundaClasse);
					ins.put("skill_chuteaereo", varChuteAereo);
					ins.put("skill_corrida", varCorrida);
					ins.put("skill_salto", varSalto);
					ins.put("skill_cambalhota", varCambalhota);
					ins.put("skill_treguarapida", varTreguaRapida);
					ins.put("skill_retirorapido", varRetiroRapido);
					ins.put("skill_kihop", varKihop);
					ins.put("skill_brisaleve", varBrisaLeve);
					ins.put("skill_missaotaekwon", varMissaoTaekwon);
					ins.put("skill_posturadotornado", varPosturaDoTornado);
					ins.put("skill_posturadapatadavoadora", varPosturaDaPatadaVoadora);
					ins.put("skill_posturadarasteira", varPosturaDaRasteira);
					ins.put("skill_posturadocontrachute", varPosturaDoContrachute);
					ins.put("skill_chutedotornado", varChuteDoTornado);
					ins.put("skill_patadavoadora", varPatadaVoadora);
					ins.put("skill_rasteira", varRasteira);
					ins.put("skill_contrachute", varContrachute);
					ins.put("skill_percepcaosolarlunareestelar", varPercepcaoSolarLunarEEstelar);
					ins.put("skill_oposicaosolarlunareestelar", varOposicaoSolarLunarEEstelar);
					ins.put("skill_sombrasolarlunareestelar", varSombraSolarLunarEEstelar);
					ins.put("skill_auxiliosolarlunareestelar", varAuxilioSolarLunarEEstelar);
					ins.put("skill_transmissaosolarlunareestelar", varTransmissaoSolarLunarEEstelar);
					ins.put("skill_uniaosolarlunareestelar", varUniaoSolarLunarEEstelar);
					ins.put("skill_calorsolar", varCalorSolar);
					ins.put("skill_furiasolar", varFuriaSolar);
					ins.put("skill_protecaosolar", varProtecaoSolar);
					ins.put("skill_bencaosolar", varBencaoSolar);
					ins.put("skill_calorlunar", varCalorLunar);
					ins.put("skill_furialunar", varFuriaLunar);
					ins.put("skill_protecaolunar", varProtecaoLunar);
					ins.put("skill_bencaolunar", varBencaoLunar);
					ins.put("skill_calorestelar", varCalorEstelar);
					ins.put("skill_furiaestelar", varFuriaEstelar);
					ins.put("skill_protecaoestelar", varProtecaoEstelar);
					ins.put("skill_bencaoestelar", varBencaoEstelar);
					ins.put("skill_primeira", skillPrimeira);
					ins.put("skill_segunda", skillSegunda);
					if(!novo){
						try {
							db.update("mestre_taekwon", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("mestre_taekwon", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from mestre_taekwon", null);
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
						ins2.put("classe", "mestre taekwon");
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