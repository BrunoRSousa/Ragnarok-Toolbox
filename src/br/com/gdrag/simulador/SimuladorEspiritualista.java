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

public class SimuladorEspiritualista extends Activity {

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
		btKainaInterrogacao,
		btKaahiInterrogacao,
		btKaiteInterrogacao,
		btKaizelInterrogacao,
		btKaupeInterrogacao,
		btEsmaInterrogacao,
		btEstinInterrogacao,
		btEstunInterrogacao,
		btEskaInterrogacao,
		btEskeInterrogacao,
		btEswooInterrogacao,
		btEspiritoDoAlquimistaInterrogacao,
		btEspiritoDoArruaceiroInterrogacao,
		btEspiritoDoArtistaInterrogacao,
		btEspiritoDoBruxoInterrogacao,
		btEspiritoDoCacadorInterrogacao,
		btEspiritoDoCavaleiroInterrogacao,
		btEspiritoDoEspiritualistaInterrogacao,
		btEspiritoDoFerreiroInterrogacao,
		btEspiritoDoMercenarioInterrogacao,
		btEspiritoDoMestreTaekwonInterrogacao,
		btEspiritoDoMongeInterrogacao,
		btEspiritoDoSabioInterrogacao,
		btEspiritoDoSacerdoteInterrogacao,
		btEspiritoDoSuperAprendizInterrogacao,
		btEspiritoDoTemplarioInterrogacao,
		btEspiritoDoTranscendentaisInterrogacao;

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
		btKainaDiminuir,
		btKaahiDiminuir,
		btKaiteDiminuir,
		btKaizelDiminuir,
		btKaupeDiminuir,
		btEsmaDiminuir,
		btEstinDiminuir,
		btEstunDiminuir,
		btEskaDiminuir,
		btEskeDiminuir,
		btEswooDiminuir,
		btEspiritoDoAlquimistaDiminuir,
		btEspiritoDoArruaceiroDiminuir,
		btEspiritoDoArtistaDiminuir,
		btEspiritoDoBruxoDiminuir,
		btEspiritoDoCacadorDiminuir,
		btEspiritoDoCavaleiroDiminuir,
		btEspiritoDoEspiritualistaDiminuir,
		btEspiritoDoFerreiroDiminuir,
		btEspiritoDoMercenarioDiminuir,
		btEspiritoDoMestreTaekwonDiminuir,
		btEspiritoDoMongeDiminuir,
		btEspiritoDoSabioDiminuir,
		btEspiritoDoSacerdoteDiminuir,
		btEspiritoDoSuperAprendizDiminuir,
		btEspiritoDoTemplarioDiminuir,
		btEspiritoDoTranscendentaisDiminuir;

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
		btKainaAumentar,
		btKaahiAumentar,
		btKaiteAumentar,
		btKaizelAumentar,
		btKaupeAumentar,
		btEsmaAumentar,
		btEstinAumentar,
		btEstunAumentar,
		btEskaAumentar,
		btEskeAumentar,
		btEswooAumentar,
		btEspiritoDoAlquimistaAumentar,
		btEspiritoDoArruaceiroAumentar,
		btEspiritoDoArtistaAumentar,
		btEspiritoDoBruxoAumentar,
		btEspiritoDoCacadorAumentar,
		btEspiritoDoCavaleiroAumentar,
		btEspiritoDoEspiritualistaAumentar,
		btEspiritoDoFerreiroAumentar,
		btEspiritoDoMercenarioAumentar,
		btEspiritoDoMestreTaekwonAumentar,
		btEspiritoDoMongeAumentar,
		btEspiritoDoSabioAumentar,
		btEspiritoDoSacerdoteAumentar,
		btEspiritoDoSuperAprendizAumentar,
		btEspiritoDoTemplarioAumentar,
		btEspiritoDoTranscendentaisAumentar;

		//Resto dos botões
		Button btResetar, btSalvar;
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
		txtKainaPontos,
		txtKaahiPontos,
		txtKaitePontos,
		txtKaizelPontos,
		txtKaupePontos,
		txtEsmaPontos,
		txtEstinPontos,
		txtEstunPontos,
		txtEskaPontos,
		txtEskePontos,
		txtEswooPontos,
		txtEspiritoDoAlquimistaPontos,
		txtEspiritoDoArruaceiroPontos,
		txtEspiritoDoArtistaPontos,
		txtEspiritoDoBruxoPontos,
		txtEspiritoDoCacadorPontos,
		txtEspiritoDoCavaleiroPontos,
		txtEspiritoDoEspiritualistaPontos,
		txtEspiritoDoFerreiroPontos,
		txtEspiritoDoMercenarioPontos,
		txtEspiritoDoMestreTaekwonPontos,
		txtEspiritoDoMongePontos,
		txtEspiritoDoSabioPontos,
		txtEspiritoDoSacerdotePontos,
		txtEspiritoDoSuperAprendizPontos,
		txtEspiritoDoTemplarioPontos,
		txtEspiritoDoTranscendentaisPontos;

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
		layKaina,
		layKaahi,
		layKaite,
		layKaizel,
		layKaupe,
		layEsma,
		layEstin,
		layEstun,
		layEska,
		layEske,
		layEswoo,
		layEspiritoDoAlquimista,
		layEspiritoDoArruaceiro,
		layEspiritoDoArtista,
		layEspiritoDoBruxo,
		layEspiritoDoCacador,
		layEspiritoDoCavaleiro,
		layEspiritoDoEspiritualista,
		layEspiritoDoFerreiro,
		layEspiritoDoMercenario,
		layEspiritoDoMestreTaekwon,
		layEspiritoDoMonge,
		layEspiritoDoSabio,
		layEspiritoDoSacerdote,
		layEspiritoDoSuperAprendiz,
		layEspiritoDoTemplario,
		layEspiritoDoTranscendentais;

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
		varKaina,
		varKaahi,
		varKaite,
		varKaizel,
		varKaupe,
		varEsma,
		varEstin,
		varEstun,
		varEska,
		varEske,
		varEswoo,
		varEspiritoDoAlquimista,
		varEspiritoDoArruaceiro,
		varEspiritoDoArtista,
		varEspiritoDoBruxo,
		varEspiritoDoCacador,
		varEspiritoDoCavaleiro,
		varEspiritoDoEspiritualista,
		varEspiritoDoFerreiro,
		varEspiritoDoMercenario,
		varEspiritoDoMestreTaekwon,
		varEspiritoDoMonge,
		varEspiritoDoSabio,
		varEspiritoDoSacerdote,
		varEspiritoDoSuperAprendiz,
		varEspiritoDoTemplario,
		varEspiritoDoTranscendentais;

		//variavel para alteração do db
		String idParaAlterar;

		//Variaveis de ponto
		int primeiraClasse;
		int segundaClasse;

		int skillPrimeira;
		int skillSegunda;

		int count;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_simulador_espiritualista);

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
			varKaina = 0;
			varKaahi = 0;
			varKaite = 0;
			varKaizel = 0;
			varKaupe = 0;
			varEsma = 0;
			varEstin = 0;
			varEstun = 0;
			varEska = 0;
			varEske = 0;
			varEswoo = 0;
			varEspiritoDoAlquimista = 0;
			varEspiritoDoArruaceiro = 0;
			varEspiritoDoArtista = 0;
			varEspiritoDoBruxo = 0;
			varEspiritoDoCacador = 0;
			varEspiritoDoCavaleiro = 0;
			varEspiritoDoEspiritualista = 0;
			varEspiritoDoFerreiro = 0;
			varEspiritoDoMercenario = 0;
			varEspiritoDoMestreTaekwon = 0;
			varEspiritoDoMonge = 0;
			varEspiritoDoSabio = 0;
			varEspiritoDoSacerdote = 0;
			varEspiritoDoSuperAprendiz = 0;
			varEspiritoDoTemplario = 0;
			varEspiritoDoTranscendentais = 0;



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
			btKainaInterrogacao = (Button) findViewById(R.id.btKainaInterrogacao);
			btKaahiInterrogacao = (Button) findViewById(R.id.btKaahiInterrogacao);
			btKaiteInterrogacao = (Button) findViewById(R.id.btKaiteInterrogacao);
			btKaizelInterrogacao = (Button) findViewById(R.id.btKaizelInterrogacao);
			btKaupeInterrogacao = (Button) findViewById(R.id.btKaupeInterrogacao);
			btEsmaInterrogacao = (Button) findViewById(R.id.btEsmaInterrogacao);
			btEstinInterrogacao = (Button) findViewById(R.id.btEstinInterrogacao);
			btEstunInterrogacao = (Button) findViewById(R.id.btEstunInterrogacao);
			btEskaInterrogacao = (Button) findViewById(R.id.btEskaInterrogacao);
			btEskeInterrogacao = (Button) findViewById(R.id.btEskeInterrogacao);
			btEswooInterrogacao = (Button) findViewById(R.id.btEswooInterrogacao);
			btEspiritoDoAlquimistaInterrogacao = (Button) findViewById(R.id.btEspiritoDoAlquimistaInterrogacao);
			btEspiritoDoArruaceiroInterrogacao = (Button) findViewById(R.id.btEspiritoDoArruaceiroInterrogacao);
			btEspiritoDoArtistaInterrogacao = (Button) findViewById(R.id.btEspiritoDoArtistaInterrogacao);
			btEspiritoDoBruxoInterrogacao = (Button) findViewById(R.id.btEspiritoDoBruxoInterrogacao);
			btEspiritoDoCacadorInterrogacao = (Button) findViewById(R.id.btEspiritoDoCacadorInterrogacao);
			btEspiritoDoCavaleiroInterrogacao = (Button) findViewById(R.id.btEspiritoDoCavaleiroInterrogacao);
			btEspiritoDoEspiritualistaInterrogacao = (Button) findViewById(R.id.btEspiritoDoEspiritualistaInterrogacao);
			btEspiritoDoFerreiroInterrogacao = (Button) findViewById(R.id.btEspiritoDoFerreiroInterrogacao);
			btEspiritoDoMercenarioInterrogacao = (Button) findViewById(R.id.btEspiritoDoMercenarioInterrogacao);
			btEspiritoDoMestreTaekwonInterrogacao = (Button) findViewById(R.id.btEspiritoDoMestreTaekwonInterrogacao);
			btEspiritoDoMongeInterrogacao = (Button) findViewById(R.id.btEspiritoDoMongeInterrogacao);
			btEspiritoDoSabioInterrogacao = (Button) findViewById(R.id.btEspiritoDoSabioInterrogacao);
			btEspiritoDoSacerdoteInterrogacao = (Button) findViewById(R.id.btEspiritoDoSacerdoteInterrogacao);
			btEspiritoDoSuperAprendizInterrogacao = (Button) findViewById(R.id.btEspiritoDoSuperAprendizInterrogacao);
			btEspiritoDoTemplarioInterrogacao = (Button) findViewById(R.id.btEspiritoDoTemplarioInterrogacao);
			btEspiritoDoTranscendentaisInterrogacao = (Button) findViewById(R.id.btEspiritoDoTranscendentaisInterrogacao);

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
			btKainaDiminuir = (Button) findViewById(R.id.btKainaDiminuir);
			btKaahiDiminuir = (Button) findViewById(R.id.btKaahiDiminuir);
			btKaiteDiminuir = (Button) findViewById(R.id.btKaiteDiminuir);
			btKaizelDiminuir = (Button) findViewById(R.id.btKaizelDiminuir);
			btKaupeDiminuir = (Button) findViewById(R.id.btKaupeDiminuir);
			btEsmaDiminuir = (Button) findViewById(R.id.btEsmaDiminuir);
			btEstinDiminuir = (Button) findViewById(R.id.btEstinDiminuir);
			btEstunDiminuir = (Button) findViewById(R.id.btEstunDiminuir);
			btEskaDiminuir = (Button) findViewById(R.id.btEskaDiminuir);
			btEskeDiminuir = (Button) findViewById(R.id.btEskeDiminuir);
			btEswooDiminuir = (Button) findViewById(R.id.btEswooDiminuir);
			btEspiritoDoAlquimistaDiminuir = (Button) findViewById(R.id.btEspiritoDoAlquimistaDiminuir);
			btEspiritoDoArruaceiroDiminuir = (Button) findViewById(R.id.btEspiritoDoArruaceiroDiminuir);
			btEspiritoDoArtistaDiminuir = (Button) findViewById(R.id.btEspiritoDoArtistaDiminuir);
			btEspiritoDoBruxoDiminuir = (Button) findViewById(R.id.btEspiritoDoBruxoDiminuir);
			btEspiritoDoCacadorDiminuir = (Button) findViewById(R.id.btEspiritoDoCacadorDiminuir);
			btEspiritoDoCavaleiroDiminuir = (Button) findViewById(R.id.btEspiritoDoCavaleiroDiminuir);
			btEspiritoDoEspiritualistaDiminuir = (Button) findViewById(R.id.btEspiritoDoEspiritualistaDiminuir);
			btEspiritoDoFerreiroDiminuir = (Button) findViewById(R.id.btEspiritoDoFerreiroDiminuir);
			btEspiritoDoMercenarioDiminuir = (Button) findViewById(R.id.btEspiritoDoMercenarioDiminuir);
			btEspiritoDoMestreTaekwonDiminuir = (Button) findViewById(R.id.btEspiritoDoMestreTaekwonDiminuir);
			btEspiritoDoMongeDiminuir = (Button) findViewById(R.id.btEspiritoDoMongeDiminuir);
			btEspiritoDoSabioDiminuir = (Button) findViewById(R.id.btEspiritoDoSabioDiminuir);
			btEspiritoDoSacerdoteDiminuir = (Button) findViewById(R.id.btEspiritoDoSacerdoteDiminuir);
			btEspiritoDoSuperAprendizDiminuir = (Button) findViewById(R.id.btEspiritoDoSuperAprendizDiminuir);
			btEspiritoDoTemplarioDiminuir = (Button) findViewById(R.id.btEspiritoDoTemplarioDiminuir);
			btEspiritoDoTranscendentaisDiminuir = (Button) findViewById(R.id.btEspiritoDoTranscendentaisDiminuir);

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
			btKainaAumentar = (Button) findViewById(R.id.btKainaAumentar);
			btKaahiAumentar = (Button) findViewById(R.id.btKaahiAumentar);
			btKaiteAumentar = (Button) findViewById(R.id.btKaiteAumentar);
			btKaizelAumentar = (Button) findViewById(R.id.btKaizelAumentar);
			btKaupeAumentar = (Button) findViewById(R.id.btKaupeAumentar);
			btEsmaAumentar = (Button) findViewById(R.id.btEsmaAumentar);
			btEstinAumentar = (Button) findViewById(R.id.btEstinAumentar);
			btEstunAumentar = (Button) findViewById(R.id.btEstunAumentar);
			btEskaAumentar = (Button) findViewById(R.id.btEskaAumentar);
			btEskeAumentar = (Button) findViewById(R.id.btEskeAumentar);
			btEswooAumentar = (Button) findViewById(R.id.btEswooAumentar);
			btEspiritoDoAlquimistaAumentar = (Button) findViewById(R.id.btEspiritoDoAlquimistaAumentar);
			btEspiritoDoArruaceiroAumentar = (Button) findViewById(R.id.btEspiritoDoArruaceiroAumentar);
			btEspiritoDoArtistaAumentar = (Button) findViewById(R.id.btEspiritoDoArtistaAumentar);
			btEspiritoDoBruxoAumentar = (Button) findViewById(R.id.btEspiritoDoBruxoAumentar);
			btEspiritoDoCacadorAumentar = (Button) findViewById(R.id.btEspiritoDoCacadorAumentar);
			btEspiritoDoCavaleiroAumentar = (Button) findViewById(R.id.btEspiritoDoCavaleiroAumentar);
			btEspiritoDoEspiritualistaAumentar = (Button) findViewById(R.id.btEspiritoDoEspiritualistaAumentar);
			btEspiritoDoFerreiroAumentar = (Button) findViewById(R.id.btEspiritoDoFerreiroAumentar);
			btEspiritoDoMercenarioAumentar = (Button) findViewById(R.id.btEspiritoDoMercenarioAumentar);
			btEspiritoDoMestreTaekwonAumentar = (Button) findViewById(R.id.btEspiritoDoMestreTaekwonAumentar);
			btEspiritoDoMongeAumentar = (Button) findViewById(R.id.btEspiritoDoMongeAumentar);
			btEspiritoDoSabioAumentar = (Button) findViewById(R.id.btEspiritoDoSabioAumentar);
			btEspiritoDoSacerdoteAumentar = (Button) findViewById(R.id.btEspiritoDoSacerdoteAumentar);
			btEspiritoDoSuperAprendizAumentar = (Button) findViewById(R.id.btEspiritoDoSuperAprendizAumentar);
			btEspiritoDoTemplarioAumentar = (Button) findViewById(R.id.btEspiritoDoTemplarioAumentar);
			btEspiritoDoTranscendentaisAumentar = (Button) findViewById(R.id.btEspiritoDoTranscendentaisAumentar);

			//Resto dos botões
			btResetar = (Button) findViewById(R.id.btResetar);
			btSalvar = (Button) findViewById(R.id.btSalvar);
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
			txtKainaPontos = (TextView) findViewById(R.id.txtKainaPontos);
			txtKaahiPontos = (TextView) findViewById(R.id.txtKaahiPontos);
			txtKaitePontos = (TextView) findViewById(R.id.txtKaitePontos);
			txtKaizelPontos = (TextView) findViewById(R.id.txtKaizelPontos);
			txtKaupePontos = (TextView) findViewById(R.id.txtKaupePontos);
			txtEsmaPontos = (TextView) findViewById(R.id.txtEsmaPontos);
			txtEstinPontos = (TextView) findViewById(R.id.txtEstinPontos);
			txtEstunPontos = (TextView) findViewById(R.id.txtEstunPontos);
			txtEskaPontos = (TextView) findViewById(R.id.txtEskaPontos);
			txtEskePontos = (TextView) findViewById(R.id.txtEskePontos);
			txtEswooPontos = (TextView) findViewById(R.id.txtEswooPontos);
			txtEspiritoDoAlquimistaPontos = (TextView) findViewById(R.id.txtEspiritoDoAlquimistaPontos);
			txtEspiritoDoArruaceiroPontos = (TextView) findViewById(R.id.txtEspiritoDoArruaceiroPontos);
			txtEspiritoDoArtistaPontos = (TextView) findViewById(R.id.txtEspiritoDoArtistaPontos);
			txtEspiritoDoBruxoPontos = (TextView) findViewById(R.id.txtEspiritoDoBruxoPontos);
			txtEspiritoDoCacadorPontos = (TextView) findViewById(R.id.txtEspiritoDoCacadorPontos);
			txtEspiritoDoCavaleiroPontos = (TextView) findViewById(R.id.txtEspiritoDoCavaleiroPontos);
			txtEspiritoDoEspiritualistaPontos = (TextView) findViewById(R.id.txtEspiritoDoEspiritualistaPontos);
			txtEspiritoDoFerreiroPontos = (TextView) findViewById(R.id.txtEspiritoDoFerreiroPontos);
			txtEspiritoDoMercenarioPontos = (TextView) findViewById(R.id.txtEspiritoDoMercenarioPontos);
			txtEspiritoDoMestreTaekwonPontos = (TextView) findViewById(R.id.txtEspiritoDoMestreTaekwonPontos);
			txtEspiritoDoMongePontos = (TextView) findViewById(R.id.txtEspiritoDoMongePontos);
			txtEspiritoDoSabioPontos = (TextView) findViewById(R.id.txtEspiritoDoSabioPontos);
			txtEspiritoDoSacerdotePontos = (TextView) findViewById(R.id.txtEspiritoDoSacerdotePontos);
			txtEspiritoDoSuperAprendizPontos = (TextView) findViewById(R.id.txtEspiritoDoSuperAprendizPontos);
			txtEspiritoDoTemplarioPontos = (TextView) findViewById(R.id.txtEspiritoDoTemplarioPontos);
			txtEspiritoDoTranscendentaisPontos = (TextView) findViewById(R.id.txtEspiritoDoTranscendentaisPontos);

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
			layKaina = (LinearLayout) findViewById(R.id.layKaina);
			layKaahi = (LinearLayout) findViewById(R.id.layKaahi);
			layKaite = (LinearLayout) findViewById(R.id.layKaite);
			layKaizel = (LinearLayout) findViewById(R.id.layKaizel);
			layKaupe = (LinearLayout) findViewById(R.id.layKaupe);
			layEsma = (LinearLayout) findViewById(R.id.layEsma);
			layEstin = (LinearLayout) findViewById(R.id.layEstin);
			layEstun = (LinearLayout) findViewById(R.id.layEstun);
			layEska = (LinearLayout) findViewById(R.id.layEska);
			layEske = (LinearLayout) findViewById(R.id.layEske);
			layEswoo = (LinearLayout) findViewById(R.id.layEswoo);
			layEspiritoDoAlquimista = (LinearLayout) findViewById(R.id.layEspiritoDoAlquimista);
			layEspiritoDoArruaceiro = (LinearLayout) findViewById(R.id.layEspiritoDoArruaceiro);
			layEspiritoDoArtista = (LinearLayout) findViewById(R.id.layEspiritoDoArtista);
			layEspiritoDoBruxo = (LinearLayout) findViewById(R.id.layEspiritoDoBruxo);
			layEspiritoDoCacador = (LinearLayout) findViewById(R.id.layEspiritoDoCacador);
			layEspiritoDoCavaleiro = (LinearLayout) findViewById(R.id.layEspiritoDoCavaleiro);
			layEspiritoDoEspiritualista = (LinearLayout) findViewById(R.id.layEspiritoDoEspiritualista);
			layEspiritoDoFerreiro = (LinearLayout) findViewById(R.id.layEspiritoDoFerreiro);
			layEspiritoDoMercenario = (LinearLayout) findViewById(R.id.layEspiritoDoMercenario);
			layEspiritoDoMestreTaekwon = (LinearLayout) findViewById(R.id.layEspiritoDoMestreTaekwon);
			layEspiritoDoMonge = (LinearLayout) findViewById(R.id.layEspiritoDoMonge);
			layEspiritoDoSabio = (LinearLayout) findViewById(R.id.layEspiritoDoSabio);
			layEspiritoDoSacerdote = (LinearLayout) findViewById(R.id.layEspiritoDoSacerdote);
			layEspiritoDoSuperAprendiz = (LinearLayout) findViewById(R.id.layEspiritoDoSuperAprendiz);
			layEspiritoDoTemplario = (LinearLayout) findViewById(R.id.layEspiritoDoTemplario);
			layEspiritoDoTranscendentais = (LinearLayout) findViewById(R.id.layEspiritoDoTranscendentais);

			if (id>0)
				recarregarBuild(id);


			//Eventos de informação
			btChuteAereoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Chute Aéreo");
					dialogo.setMessage(R.string.chuteAereoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCorridaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Corrida");
					dialogo.setMessage(R.string.corridaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSaltoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Salto");
					dialogo.setMessage(R.string.saltoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCambalhotaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Cambalhota");
					dialogo.setMessage(R.string.cambalhotaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTreguaRapidaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Trégua Rápida");
					dialogo.setMessage(R.string.treguaRapidaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRetiroRapidoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Retiro Rápido");
					dialogo.setMessage(R.string.retiroRapidoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btKihopInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Kihop");
					dialogo.setMessage(R.string.kihopInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBrisaLeveInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Brisa Leve");
					dialogo.setMessage(R.string.brisaLeveInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btMissaoTaekwonInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Missão Taekwon");
					dialogo.setMessage(R.string.missaoTaekwonInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPosturaDoTornadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Postura Do Tornado");
					dialogo.setMessage(R.string.posturaDoTornadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPosturaDaPatadaVoadoraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Postura Da Patada Voadora");
					dialogo.setMessage(R.string.posturaDaPatadaVoadoraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPosturaDaRasteiraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Postura Da Rasteira");
					dialogo.setMessage(R.string.posturaDaRasteiraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPosturaDoContrachuteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Postura Do Contrachute");
					dialogo.setMessage(R.string.posturaDoContrachuteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChuteDoTornadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Chute Do Tornado");
					dialogo.setMessage(R.string.chuteDoTornadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPatadaVoadoraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Patada Voadora");
					dialogo.setMessage(R.string.patadaVoadoraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRasteiraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Rasteira");
					dialogo.setMessage(R.string.rasteiraTaekwonInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btContrachuteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Contrachute");
					dialogo.setMessage(R.string.contrachuteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btKainaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Kaina");
					dialogo.setMessage(R.string.kainaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btKaahiInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Kaahi");
					dialogo.setMessage(R.string.kaahiInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btKaiteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Kaite");
					dialogo.setMessage(R.string.kaiteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btKaizelInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Kaizel");
					dialogo.setMessage(R.string.kaizelInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btKaupeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Kaupe");
					dialogo.setMessage(R.string.kaupeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEsmaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Esma");
					dialogo.setMessage(R.string.esmaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEstinInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Estin");
					dialogo.setMessage(R.string.estinInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEstunInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Estun");
					dialogo.setMessage(R.string.estunInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEskaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Eska");
					dialogo.setMessage(R.string.eskaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEskeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Eske");
					dialogo.setMessage(R.string.eskeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEswooInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Eswoo");
					dialogo.setMessage(R.string.eswooInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoAlquimistaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Alquimista");
					dialogo.setMessage(R.string.espiritoDoAlquimistaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoArruaceiroInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Arruaceiro");
					dialogo.setMessage(R.string.espiritoDoArruaceiroInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoArtistaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Artista");
					dialogo.setMessage(R.string.espiritoDoArtistaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoBruxoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Bruxo");
					dialogo.setMessage(R.string.espiritoDoBruxoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoCacadorInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Caçador");
					dialogo.setMessage(R.string.espiritoDoCacadorInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoCavaleiroInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Cavaleiro");
					dialogo.setMessage(R.string.espiritoDoCavaleiroInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoEspiritualistaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Espiritualista");
					dialogo.setMessage(R.string.espiritoDoEspiritualistaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoFerreiroInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Ferreiro");
					dialogo.setMessage(R.string.espiritoDoFerreiroInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoMercenarioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Mercenário");
					dialogo.setMessage(R.string.espiritoDoMercenarioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoMestreTaekwonInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Mestre Taekwon");
					dialogo.setMessage(R.string.espiritoDoMestreTaekwonInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoMongeInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Monge");
					dialogo.setMessage(R.string.espiritoDoMongeInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoSabioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Sábio");
					dialogo.setMessage(R.string.espiritoDoSabioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoSacerdoteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Sacerdote");
					dialogo.setMessage(R.string.espiritoDoSacerdoteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoSuperAprendizInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Super Aprendiz");
					dialogo.setMessage(R.string.espiritoDoSuperaprendizInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoTemplarioInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Templário");
					dialogo.setMessage(R.string.espiritoDoTemplarioInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEspiritoDoTranscendentaisInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorEspiritualista.this);
					dialogo.setTitle("Espírito Do Transcendentais");
					dialogo.setMessage(R.string.espiritoDosTranscendentaisInfo);
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
			btKainaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varRetiroRapido<1 && count<1){
						atualizarCalculo(varRetiroRapido, "RetiroRapido", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varKaina, "Kaina", 7, 2, "Aumentar");

				}
			});
			btKaahiAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoMonge<1 && count<1){
						atualizarCalculo(varEspiritoDoMonge, "EspiritoDoMonge", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspiritoDoSacerdote<1 && count<1){
						atualizarCalculo(varEspiritoDoSacerdote, "EspiritoDoSacerdote", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspiritoDoTemplario<1 && count<1){
						atualizarCalculo(varEspiritoDoTemplario, "EspiritoDoTemplario", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varKaahi, "Kaahi", 7, 2, "Aumentar");

				}
			});
			btKaiteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoSabio<1 && count<1){
						atualizarCalculo(varEspiritoDoSabio, "EspiritoDoSabio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspiritoDoBruxo<1 && count<1){
						atualizarCalculo(varEspiritoDoBruxo, "EspiritoDoBruxo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varKaite, "Kaite", 7, 2, "Aumentar");

				}
			});
			btKaizelAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoMonge<1 && count<1){
						atualizarCalculo(varEspiritoDoMonge, "EspiritoDoMonge", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspiritoDoSacerdote<1 && count<1){
						atualizarCalculo(varEspiritoDoSacerdote, "EspiritoDoSacerdote", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varKaizel, "Kaizel", 7, 2, "Aumentar");

				}
			});
			btKaupeAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoMercenario<1 && count<1){
						atualizarCalculo(varEspiritoDoMercenario, "EspiritoDoMercenario", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspiritoDoArruaceiro<1 && count<1){
						atualizarCalculo(varEspiritoDoArruaceiro, "EspiritoDoArruaceiro", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varKaupe, "Kaupe", 7, 2, "Aumentar");

				}
			});
			btEsmaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoSabio<1 && count<1){
						atualizarCalculo(varEspiritoDoSabio, "EspiritoDoSabio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspiritoDoBruxo<1 && count<1){
						atualizarCalculo(varEspiritoDoBruxo, "EspiritoDoBruxo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstin<7 && count<7){
						atualizarCalculo(varEstin, "Estin", 7, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspiritoDoSabio<1 && count<1){
						atualizarCalculo(varEspiritoDoSabio, "EspiritoDoSabio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspiritoDoBruxo<1 && count<1){
						atualizarCalculo(varEspiritoDoBruxo, "EspiritoDoBruxo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstun<7 && count<7){
						atualizarCalculo(varEstun, "Estun", 7, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEsma, "Esma", 10, 2, "Aumentar");

				}
			});
			btEstinAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoSabio<1 && count<1){
						atualizarCalculo(varEspiritoDoSabio, "EspiritoDoSabio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspiritoDoBruxo<1 && count<1){
						atualizarCalculo(varEspiritoDoBruxo, "EspiritoDoBruxo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEstin, "Estin", 7, 2, "Aumentar");

				}
			});
			btEstunAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoSabio<1 && count<1){
						atualizarCalculo(varEspiritoDoSabio, "EspiritoDoSabio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspiritoDoBruxo<1 && count<1){
						atualizarCalculo(varEspiritoDoBruxo, "EspiritoDoBruxo", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEstun, "Estun", 7, 2, "Aumentar");

				}
			});
			btEskaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoMonge<1 && count<1){
						atualizarCalculo(varEspiritoDoMonge, "EspiritoDoMonge", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEska, "Eska", 3, 2, "Aumentar");

				}
			});
			btEskeAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoTemplario<1 && count<1){
						atualizarCalculo(varEspiritoDoTemplario, "EspiritoDoTemplario", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspiritoDoCavaleiro<1 && count<1){
						atualizarCalculo(varEspiritoDoCavaleiro, "EspiritoDoCavaleiro", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEske, "Eske", 3, 2, "Aumentar");

				}
			});
			btEswooAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoMonge<1 && count<1){
						atualizarCalculo(varEspiritoDoMonge, "EspiritoDoMonge", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varEspiritoDoSacerdote<1 && count<1){
						atualizarCalculo(varEspiritoDoSacerdote, "EspiritoDoSacerdote", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEswoo, "Eswoo", 7, 2, "Aumentar");

				}
			});
			btEspiritoDoAlquimistaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoAlquimista, "EspiritoDoAlquimista", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoArruaceiroAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoMercenario<1 && count<1){
						atualizarCalculo(varEspiritoDoMercenario, "EspiritoDoMercenario", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEspiritoDoArruaceiro, "EspiritoDoArruaceiro", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoArtistaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoArtista, "EspiritoDoArtista", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoBruxoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoSabio<1 && count<1){
						atualizarCalculo(varEspiritoDoSabio, "EspiritoDoSabio", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEspiritoDoBruxo, "EspiritoDoBruxo", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoCacadorAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoArtista<1 && count<1){
						atualizarCalculo(varEspiritoDoArtista, "EspiritoDoArtista", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEspiritoDoCacador, "EspiritoDoCacador", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoCavaleiroAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoTemplario<1 && count<1){
						atualizarCalculo(varEspiritoDoTemplario, "EspiritoDoTemplario", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEspiritoDoCavaleiro, "EspiritoDoCavaleiro", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoEspiritualistaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoMestreTaekwon<1 && count<1){
						atualizarCalculo(varEspiritoDoMestreTaekwon, "EspiritoDoMestreTaekwon", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEspiritoDoEspiritualista, "EspiritoDoEspiritualista", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoFerreiroAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoAlquimista<1 && count<1){
						atualizarCalculo(varEspiritoDoAlquimista, "EspiritoDoAlquimista", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEspiritoDoFerreiro, "EspiritoDoFerreiro", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoMercenarioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoMercenario, "EspiritoDoMercenario", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoMestreTaekwonAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoMestreTaekwon, "EspiritoDoMestreTaekwon", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoMongeAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoMonge, "EspiritoDoMonge", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoSabioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoSabio, "EspiritoDoSabio", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoSacerdoteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoMonge<1 && count<1){
						atualizarCalculo(varEspiritoDoMonge, "EspiritoDoMonge", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEspiritoDoSacerdote, "EspiritoDoSacerdote", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoSuperAprendizAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoSuperAprendiz, "EspiritoDoSuperAprendiz", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoTemplarioAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoTemplario, "EspiritoDoTemplario", 5, 2, "Aumentar");

				}
			});
			btEspiritoDoTranscendentaisAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varEspiritoDoSuperAprendiz<5 && count<5){
						atualizarCalculo(varEspiritoDoSuperAprendiz, "EspiritoDoSuperAprendiz", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEspiritoDoTranscendentais, "EspiritoDoTranscendentais", 5, 2, "Aumentar");

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
			btKainaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varKaina, "Kaina", 7, 2, "Diminuir");

				}
			});
			btKaahiDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varKaahi, "Kaahi", 7, 2, "Diminuir");

				}
			});
			btKaiteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varKaite, "Kaite", 7, 2, "Diminuir");

				}
			});
			btKaizelDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varKaizel, "Kaizel", 7, 2, "Diminuir");

				}
			});
			btKaupeDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varKaupe, "Kaupe", 7, 2, "Diminuir");

				}
			});
			btEsmaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEsma, "Esma", 10, 2, "Diminuir");

				}
			});
			btEstinDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEstin, "Estin", 7, 2, "Diminuir");

				}
			});
			btEstunDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEstun, "Estun", 7, 2, "Diminuir");

				}
			});
			btEskaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEska, "Eska", 3, 2, "Diminuir");

				}
			});
			btEskeDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEske, "Eske", 3, 2, "Diminuir");

				}
			});
			btEswooDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEswoo, "Eswoo", 7, 2, "Diminuir");

				}
			});
			btEspiritoDoAlquimistaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoAlquimista, "EspiritoDoAlquimista", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoArruaceiroDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoArruaceiro, "EspiritoDoArruaceiro", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoArtistaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoArtista, "EspiritoDoArtista", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoBruxoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoBruxo, "EspiritoDoBruxo", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoCacadorDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoCacador, "EspiritoDoCacador", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoCavaleiroDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoCavaleiro, "EspiritoDoCavaleiro", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoEspiritualistaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoEspiritualista, "EspiritoDoEspiritualista", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoFerreiroDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoFerreiro, "EspiritoDoFerreiro", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoMercenarioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoMercenario, "EspiritoDoMercenario", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoMestreTaekwonDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoMestreTaekwon, "EspiritoDoMestreTaekwon", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoMongeDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoMonge, "EspiritoDoMonge", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoSabioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoSabio, "EspiritoDoSabio", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoSacerdoteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoSacerdote, "EspiritoDoSacerdote", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoSuperAprendizDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoSuperAprendiz, "EspiritoDoSuperAprendiz", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoTemplarioDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoTemplario, "EspiritoDoTemplario", 5, 2, "Diminuir");

				}
			});
			btEspiritoDoTranscendentaisDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEspiritoDoTranscendentais, "EspiritoDoTranscendentais", 5, 2, "Diminuir");

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
					varKaina = 0;
					varKaahi = 0;
					varKaite = 0;
					varKaizel = 0;
					varKaupe = 0;
					varEsma = 0;
					varEstin = 0;
					varEstun = 0;
					varEska = 0;
					varEske = 0;
					varEswoo = 0;
					varEspiritoDoAlquimista = 0;
					varEspiritoDoArruaceiro = 0;
					varEspiritoDoArtista = 0;
					varEspiritoDoBruxo = 0;
					varEspiritoDoCacador = 0;
					varEspiritoDoCavaleiro = 0;
					varEspiritoDoEspiritualista = 0;
					varEspiritoDoFerreiro = 0;
					varEspiritoDoMercenario = 0;
					varEspiritoDoMestreTaekwon = 0;
					varEspiritoDoMonge = 0;
					varEspiritoDoSabio = 0;
					varEspiritoDoSacerdote = 0;
					varEspiritoDoSuperAprendiz = 0;
					varEspiritoDoTemplario = 0;
					varEspiritoDoTranscendentais = 0;

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
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorEspiritualista.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorEspiritualista.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorEspiritualista.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorEspiritualista.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorEspiritualista.this);
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

			if(varKaina==0)
				layKaina.setVisibility(View.GONE);
			if(varKaahi==0)
				layKaahi.setVisibility(View.GONE);
			if(varKaite==0)
				layKaite.setVisibility(View.GONE);
			if(varKaizel==0)
				layKaizel.setVisibility(View.GONE);
			if(varKaupe==0)
				layKaupe.setVisibility(View.GONE);
			if(varEsma==0)
				layEsma.setVisibility(View.GONE);
			if(varEstin==0)
				layEstin.setVisibility(View.GONE);
			if(varEstun==0)
				layEstun.setVisibility(View.GONE);
			if(varEska==0)
				layEska.setVisibility(View.GONE);
			if(varEske==0)
				layEske.setVisibility(View.GONE);
			if(varEswoo==0)
				layEswoo.setVisibility(View.GONE);
			if(varEspiritoDoAlquimista==0)
				layEspiritoDoAlquimista.setVisibility(View.GONE);
			if(varEspiritoDoArruaceiro==0)
				layEspiritoDoArruaceiro.setVisibility(View.GONE);
			if(varEspiritoDoArtista==0)
				layEspiritoDoArtista.setVisibility(View.GONE);
			if(varEspiritoDoBruxo==0)
				layEspiritoDoBruxo.setVisibility(View.GONE);
			if(varEspiritoDoCacador==0)
				layEspiritoDoCacador.setVisibility(View.GONE);
			if(varEspiritoDoCavaleiro==0)
				layEspiritoDoCavaleiro.setVisibility(View.GONE);
			if(varEspiritoDoEspiritualista==0)
				layEspiritoDoEspiritualista.setVisibility(View.GONE);
			if(varEspiritoDoFerreiro==0)
				layEspiritoDoFerreiro.setVisibility(View.GONE);
			if(varEspiritoDoMercenario==0)
				layEspiritoDoMercenario.setVisibility(View.GONE);
			if(varEspiritoDoMestreTaekwon==0)
				layEspiritoDoMestreTaekwon.setVisibility(View.GONE);
			if(varEspiritoDoMonge==0)
				layEspiritoDoMonge.setVisibility(View.GONE);
			if(varEspiritoDoSabio==0)
				layEspiritoDoSabio.setVisibility(View.GONE);
			if(varEspiritoDoSacerdote==0)
				layEspiritoDoSacerdote.setVisibility(View.GONE);
			if(varEspiritoDoSuperAprendiz==0)
				layEspiritoDoSuperAprendiz.setVisibility(View.GONE);
			if(varEspiritoDoTemplario==0)
				layEspiritoDoTemplario.setVisibility(View.GONE);
			if(varEspiritoDoTranscendentais==0)
				layEspiritoDoTranscendentais.setVisibility(View.GONE);

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

				if (nomeDaHabilidade=="RetiroRapido" && varKaina>=1 && varRetiroRapido<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoSacerdote" && varKaahi>=1 && varEspiritoDoSacerdote<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoTemplario" && varKaahi>=1 && varEspiritoDoTemplario<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoBruxo" && varKaite>=1 && varEspiritoDoBruxo<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoSacerdote" && varKaizel>=1 && varEspiritoDoSacerdote<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoArruaceiro" && varKaupe>=1 && varEspiritoDoArruaceiro<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Estin" && varEsma>=1 && varEstin<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Estun" && varEsma>=1 && varEstun<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoBruxo" && varEstin>=1 && varEspiritoDoBruxo<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoBruxo" && varEstun>=1 && varEspiritoDoBruxo<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoMonge" && varEska>=1 && varEspiritoDoMonge<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoCavaleiro" && varEske>=1 && varEspiritoDoCavaleiro<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoSacerdote" && varEswoo>=1 && varEspiritoDoSacerdote<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoMercenario" && varEspiritoDoArruaceiro>=1 && varEspiritoDoMercenario<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoSabio" && varEspiritoDoBruxo>=1 && varEspiritoDoSabio<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoArtista" && varEspiritoDoCacador>=1 && varEspiritoDoArtista<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoTemplario" && varEspiritoDoCavaleiro>=1 && varEspiritoDoTemplario<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoMestreTaekwon" && varEspiritoDoEspiritualista>=1 && varEspiritoDoMestreTaekwon<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoAlquimista" && varEspiritoDoFerreiro>=1 && varEspiritoDoAlquimista<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoMonge" && varEspiritoDoSacerdote>=1 && varEspiritoDoMonge<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EspiritoDoSuperAprendiz" && varEspiritoDoTranscendentais>=1 && varEspiritoDoSuperAprendiz<=05){
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

			else if(nomeDaHabilidade=="Kaina"){
				varKaina = habilidade;
			} else if(nomeDaHabilidade=="Kaahi"){
				varKaahi = habilidade;
			} else if(nomeDaHabilidade=="Kaite"){
				varKaite = habilidade;
			} else if(nomeDaHabilidade=="Kaizel"){
				varKaizel = habilidade;
			} else if(nomeDaHabilidade=="Kaupe"){
				varKaupe = habilidade;
			} else if(nomeDaHabilidade=="Esma"){
				varEsma = habilidade;
			} else if(nomeDaHabilidade=="Estin"){
				varEstin = habilidade;
			} else if(nomeDaHabilidade=="Estun"){
				varEstun = habilidade;
			} else if(nomeDaHabilidade=="Eska"){
				varEska = habilidade;
			} else if(nomeDaHabilidade=="Eske"){
				varEske = habilidade;
			} else if(nomeDaHabilidade=="Eswoo"){
				varEswoo = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoAlquimista"){
				varEspiritoDoAlquimista = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoArruaceiro"){
				varEspiritoDoArruaceiro = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoArtista"){
				varEspiritoDoArtista = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoBruxo"){
				varEspiritoDoBruxo = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoCacador"){
				varEspiritoDoCacador = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoCavaleiro"){
				varEspiritoDoCavaleiro = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoEspiritualista"){
				varEspiritoDoEspiritualista = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoFerreiro"){
				varEspiritoDoFerreiro = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoMercenario"){
				varEspiritoDoMercenario = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoMestreTaekwon"){
				varEspiritoDoMestreTaekwon = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoMonge"){
				varEspiritoDoMonge = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoSabio"){
				varEspiritoDoSabio = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoSacerdote"){
				varEspiritoDoSacerdote = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoSuperAprendiz"){
				varEspiritoDoSuperAprendiz = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoTemplario"){
				varEspiritoDoTemplario = habilidade;
			} else if(nomeDaHabilidade=="EspiritoDoTranscendentais"){
				varEspiritoDoTranscendentais = habilidade;
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

			txtKainaPontos.setText(varKaina + "/7");
			txtKaahiPontos.setText(varKaahi + "/7");
			txtKaitePontos.setText(varKaite + "/7");
			txtKaizelPontos.setText(varKaizel + "/7");
			txtKaupePontos.setText(varKaupe + "/7");
			txtEsmaPontos.setText(varEsma + "/10");
			txtEstinPontos.setText(varEstin + "/7");
			txtEstunPontos.setText(varEstun + "/7");
			txtEskaPontos.setText(varEska + "/3");
			txtEskePontos.setText(varEske + "/3");
			txtEswooPontos.setText(varEswoo + "/7");
			txtEspiritoDoAlquimistaPontos.setText(varEspiritoDoAlquimista + "/5");
			txtEspiritoDoArruaceiroPontos.setText(varEspiritoDoArruaceiro + "/5");
			txtEspiritoDoArtistaPontos.setText(varEspiritoDoArtista + "/5");
			txtEspiritoDoBruxoPontos.setText(varEspiritoDoBruxo + "/5");
			txtEspiritoDoCacadorPontos.setText(varEspiritoDoCacador + "/5");
			txtEspiritoDoCavaleiroPontos.setText(varEspiritoDoCavaleiro + "/5");
			txtEspiritoDoEspiritualistaPontos.setText(varEspiritoDoEspiritualista + "/5");
			txtEspiritoDoFerreiroPontos.setText(varEspiritoDoFerreiro + "/5");
			txtEspiritoDoMercenarioPontos.setText(varEspiritoDoMercenario + "/5");
			txtEspiritoDoMestreTaekwonPontos.setText(varEspiritoDoMestreTaekwon + "/5");
			txtEspiritoDoMongePontos.setText(varEspiritoDoMonge + "/5");
			txtEspiritoDoSabioPontos.setText(varEspiritoDoSabio + "/5");
			txtEspiritoDoSacerdotePontos.setText(varEspiritoDoSacerdote + "/5");
			txtEspiritoDoSuperAprendizPontos.setText(varEspiritoDoSuperAprendiz + "/5");
			txtEspiritoDoTemplarioPontos.setText(varEspiritoDoTemplario + "/5");
			txtEspiritoDoTranscendentaisPontos.setText(varEspiritoDoTranscendentais + "/5");

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

			layKaina.setVisibility(View.VISIBLE);
			layKaahi.setVisibility(View.VISIBLE);
			layKaite.setVisibility(View.VISIBLE);
			layKaizel.setVisibility(View.VISIBLE);
			layKaupe.setVisibility(View.VISIBLE);
			layEsma.setVisibility(View.VISIBLE);
			layEstin.setVisibility(View.VISIBLE);
			layEstun.setVisibility(View.VISIBLE);
			layEska.setVisibility(View.VISIBLE);
			layEske.setVisibility(View.VISIBLE);
			layEswoo.setVisibility(View.VISIBLE);
			layEspiritoDoAlquimista.setVisibility(View.VISIBLE);
			layEspiritoDoArruaceiro.setVisibility(View.VISIBLE);
			layEspiritoDoArtista.setVisibility(View.VISIBLE);
			layEspiritoDoBruxo.setVisibility(View.VISIBLE);
			layEspiritoDoCacador.setVisibility(View.VISIBLE);
			layEspiritoDoCavaleiro.setVisibility(View.VISIBLE);
			layEspiritoDoEspiritualista.setVisibility(View.VISIBLE);
			layEspiritoDoFerreiro.setVisibility(View.VISIBLE);
			layEspiritoDoMercenario.setVisibility(View.VISIBLE);
			layEspiritoDoMestreTaekwon.setVisibility(View.VISIBLE);
			layEspiritoDoMonge.setVisibility(View.VISIBLE);
			layEspiritoDoSabio.setVisibility(View.VISIBLE);
			layEspiritoDoSacerdote.setVisibility(View.VISIBLE);
			layEspiritoDoSuperAprendiz.setVisibility(View.VISIBLE);
			layEspiritoDoTemplario.setVisibility(View.VISIBLE);
			layEspiritoDoTranscendentais.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM espiritualista WHERE _id = ?", new String[]{String.valueOf(id)});

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

			varKaina = cs.getInt(21);
			varKaahi = cs.getInt(22);
			varKaite = cs.getInt(23);
			varKaizel = cs.getInt(24);
			varKaupe = cs.getInt(25);
			varEsma = cs.getInt(26);
			varEstin = cs.getInt(27);
			varEstun = cs.getInt(28);
			varEska = cs.getInt(29);
			varEske = cs.getInt(30);
			varEswoo = cs.getInt(31);
			varEspiritoDoAlquimista = cs.getInt(32);
			varEspiritoDoArruaceiro = cs.getInt(33);
			varEspiritoDoArtista = cs.getInt(34);
			varEspiritoDoBruxo = cs.getInt(35);
			varEspiritoDoCacador = cs.getInt(36);
			varEspiritoDoCavaleiro = cs.getInt(37);
			varEspiritoDoEspiritualista = cs.getInt(38);
			varEspiritoDoFerreiro = cs.getInt(39);
			varEspiritoDoMercenario = cs.getInt(40);
			varEspiritoDoMestreTaekwon = cs.getInt(41);
			varEspiritoDoMonge = cs.getInt(42);
			varEspiritoDoSabio = cs.getInt(43);
			varEspiritoDoSacerdote = cs.getInt(44);
			varEspiritoDoSuperAprendiz = cs.getInt(45);
			varEspiritoDoTemplario = cs.getInt(46);
			varEspiritoDoTranscendentais = cs.getInt(47);

			skillPrimeira = cs.getInt(48);
			skillSegunda = cs.getInt(49);
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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS espiritualista (");
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
					sqlClasse.append("skill_kaina INT(2), ");
					sqlClasse.append("skill_kaahi INT(2), ");
					sqlClasse.append("skill_kaite INT(2), ");
					sqlClasse.append("skill_kaizel INT(2), ");
					sqlClasse.append("skill_kaupe INT(2), ");
					sqlClasse.append("skill_esma INT(2), ");
					sqlClasse.append("skill_estin INT(2), ");
					sqlClasse.append("skill_estun INT(2), ");
					sqlClasse.append("skill_eska INT(2), ");
					sqlClasse.append("skill_eske INT(2), ");
					sqlClasse.append("skill_eswoo INT(2), ");
					sqlClasse.append("skill_espiritodoalquimista INT(2), ");
					sqlClasse.append("skill_espiritodoarruaceiro INT(2), ");
					sqlClasse.append("skill_espiritodoartista INT(2), ");
					sqlClasse.append("skill_espiritodobruxo INT(2), ");
					sqlClasse.append("skill_espiritodocacador INT(2), ");
					sqlClasse.append("skill_espiritodocavaleiro INT(2), ");
					sqlClasse.append("skill_espiritodoespiritualista INT(2), ");
					sqlClasse.append("skill_espiritodoferreiro INT(2), ");
					sqlClasse.append("skill_espiritodomercenario INT(2), ");
					sqlClasse.append("skill_espiritodomestretaekwon INT(2), ");
					sqlClasse.append("skill_espiritodomonge INT(2), ");
					sqlClasse.append("skill_espiritodosabio INT(2), ");
					sqlClasse.append("skill_espiritodosacerdote INT(2), ");
					sqlClasse.append("skill_espiritodosuperaprendiz INT(2), ");
					sqlClasse.append("skill_espiritodotemplario INT(2), ");
					sqlClasse.append("skill_espiritodotranscendentais INT(2), ");
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
					ins.put("skill_kaina", varKaina);
					ins.put("skill_kaahi", varKaahi);
					ins.put("skill_kaite", varKaite);
					ins.put("skill_kaizel", varKaizel);
					ins.put("skill_kaupe", varKaupe);
					ins.put("skill_esma", varEsma);
					ins.put("skill_estin", varEstin);
					ins.put("skill_estun", varEstun);
					ins.put("skill_eska", varEska);
					ins.put("skill_eske", varEske);
					ins.put("skill_eswoo", varEswoo);
					ins.put("skill_espiritodoalquimista", varEspiritoDoAlquimista);
					ins.put("skill_espiritodoarruaceiro", varEspiritoDoArruaceiro);
					ins.put("skill_espiritodoartista", varEspiritoDoArtista);
					ins.put("skill_espiritodobruxo", varEspiritoDoBruxo);
					ins.put("skill_espiritodocacador", varEspiritoDoCacador);
					ins.put("skill_espiritodocavaleiro", varEspiritoDoCavaleiro);
					ins.put("skill_espiritodoespiritualista", varEspiritoDoEspiritualista);
					ins.put("skill_espiritodoferreiro", varEspiritoDoFerreiro);
					ins.put("skill_espiritodomercenario", varEspiritoDoMercenario);
					ins.put("skill_espiritodomestretaekwon", varEspiritoDoMestreTaekwon);
					ins.put("skill_espiritodomonge", varEspiritoDoMonge);
					ins.put("skill_espiritodosabio", varEspiritoDoSabio);
					ins.put("skill_espiritodosacerdote", varEspiritoDoSacerdote);
					ins.put("skill_espiritodosuperaprendiz", varEspiritoDoSuperAprendiz);
					ins.put("skill_espiritodotemplario", varEspiritoDoTemplario);
					ins.put("skill_espiritodotranscendentais", varEspiritoDoTranscendentais);
					ins.put("skill_primeira", skillPrimeira);
					ins.put("skill_segunda", skillSegunda);
					if(!novo){
						try {
							db.update("espiritualista", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("espiritualista", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from espiritualista", null);
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
						ins2.put("classe", "espiritualista");
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
			getMenuInflater().inflate(R.menu.simulador_espiritualista, menu);
			return true;
		}

	}