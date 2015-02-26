package br.com.gdrag.simulador;

import br.com.gdrag.R;
import br.com.gdrag.R.layout;
import br.com.gdrag.R.menu;
import android.os.Bundle;
import android.renderscript.Sampler.Value;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
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

public class SimuladorCavaleiroRunico extends Activity {

	//Botões de interrogações
	Button btPericiaComEspadaInterrogacao,
	btPericiaComEspadaDeDuasMaosInterrogacao,
	btAumentarRecuperacaoDeHPInterrogacao,
	btGolpeFulminanteInterrogacao,
	btProvocarInterrogacao,
	btImpactoExplosivoInterrogacao,
	btVigorInterrogacao,
	btInstintoDeSobrevivenciaInterrogacao,
	btGolpeFatalInterrogacao,
	btRecuperarHPEmMovimentoInterrogacao,
	btPericiaComLancaInterrogacao,
	btPerfurarInterrogacao,
	btEstocadaInterrogacao,
	btLancaBumerangueInterrogacao,
	btBrandirLancaInterrogacao,
	btRapidezComDuasMaosInterrogacao,
	btContraAtaqueInterrogacao,
	btImpactoDeTyrInterrogacao,
	btPericiaEmMontariaInterrogacao,
	btMontariaInterrogacao,
	btAvancoOfensivoInterrogacao,
	btRapidezComUmaMaoInterrogacao,
	btLaminaDeAuraInterrogacao,
	btPerfurarEmEspiralInterrogacao,
	btFrenesiInterrogacao,
	btApararGolpeInterrogacao,
	btRelaxarInterrogacao,
	btDedicacaoInterrogacao,
	btGolpeTraumaticoInterrogacao,
	btAtaqueVitalInterrogacao,
	btPericiaEmRunasInterrogacao,
	btAdestrarDragaoInterrogacao,
	btSoproDoDragaoInterrogacao,
	btRugidoDoDragaoInterrogacao,
	btRevidarDanoInterrogacao,
	btEncantarLaminaInterrogacao,
	btImpactoFlamejanteInterrogacao,
	btArpaoInterrogacao,
	btOndaDeChoqueInterrogacao,
	btVentoCortanteInterrogacao,
	btLancaDasMilPontasInterrogacao;
	
	//Botões de diminuir habilidades
	Button btPericiaComEspadaDiminuir,
	btPericiaComEspadaDeDuasMaosDiminuir,
	btAumentarRecuperacaoDeHPDiminuir,
	btGolpeFulminanteDiminuir,
	btProvocarDiminuir,
	btImpactoExplosivoDiminuir,
	btVigorDiminuir,
	btPericiaComLancaDiminuir,
	btPerfurarDiminuir,
	btEstocadaDiminuir,
	btLancaBumerangueDiminuir,
	btBrandirLancaDiminuir,
	btRapidezComDuasMaosDiminuir,
	btContraAtaqueDiminuir,
	btImpactoDeTyrDiminuir,
	btPericiaEmMontariaDiminuir,
	btMontariaDiminuir,
	btLaminaDeAuraDiminuir,
	btPerfurarEmEspiralDiminuir,
	btFrenesiDiminuir,
	btApararGolpeDiminuir,
	btRelaxarDiminuir,
	btDedicacaoDiminuir,
	btGolpeTraumaticoDiminuir,
	btAtaqueVitalDiminuir,
	btPericiaEmRunasDiminuir,
	btAdestrarDragaoDiminuir,
	btSoproDoDragaoDiminuir,
	btRugidoDoDragaoDiminuir,
	btRevidarDanoDiminuir,
	btEncantarLaminaDiminuir,
	btImpactoFlamejanteDiminuir,
	btArpaoDiminuir,
	btOndaDeChoqueDiminuir,
	btVentoCortanteDiminuir,
	btLancaDasMilPontasDiminuir;
	
	//Botões de aumentar habilidades
	Button btPericiaComEspadaAumentar,
	btPericiaComEspadaDeDuasMaosAumentar,
	btAumentarRecuperacaoDeHPAumentar,
	btGolpeFulminanteAumentar,
	btProvocarAumentar,
	btImpactoExplosivoAumentar,
	btVigorAumentar,
	btPericiaComLancaAumentar,
	btPerfurarAumentar,
	btEstocadaAumentar,
	btLancaBumerangueAumentar,
	btBrandirLancaAumentar,
	btRapidezComDuasMaosAumentar,
	btContraAtaqueAumentar,
	btImpactoDeTyrAumentar,
	btPericiaEmMontariaAumentar,
	btMontariaAumentar,
	btLaminaDeAuraAumentar,
	btPerfurarEmEspiralAumentar,
	btFrenesiAumentar,
	btApararGolpeAumentar,
	btRelaxarAumentar,
	btDedicacaoAumentar,
	btGolpeTraumaticoAumentar,
	btAtaqueVitalAumentar,
	btPericiaEmRunasAumentar,
	btAdestrarDragaoAumentar,
	btSoproDoDragaoAumentar,
	btRugidoDoDragaoAumentar,
	btRevidarDanoAumentar,
	btEncantarLaminaAumentar,
	btImpactoFlamejanteAumentar,
	btArpaoAumentar,
	btOndaDeChoqueAumentar,
	btVentoCortanteAumentar,
	btLancaDasMilPontasAumentar;
	
	//Resto dos botões
	Button btResetar, btSalvar;
	ToggleButton tgbtSomenteHabilidadeAprendida;
	
	
	//Txt pontos da tela
	TextView txtPericiaComEspadaPontos,
	txtPericiaComEspadaDeDuasMaosPontos,
	txtAumentarRecuperacaoDeHPPontos,
	txtGolpeFulminantePontos,
	txtProvocarPontos,
	txtImpactoExplosivoPontos,
	txtVigorPontos,
	txtPericiaComLancaPontos,
	txtPerfurarPontos,
	txtEstocadaPontos,
	txtLancaBumeranguePontos,
	txtBrandirLancaPontos,
	txtRapidezComDuasMaosPontos,
	txtContraAtaquePontos,
	txtImpactoDeTyrPontos,
	txtPericiaEmMontariaPontos,
	txtMontariaPontos,
	txtLaminaDeAuraPontos,
	txtPerfurarEmEspiralPontos,
	txtFrenesiPontos,
	txtApararGolpePontos,
	txtRelaxarPontos,
	txtDedicacaoPontos,
	txtGolpeTraumaticoPontos,
	txtAtaqueVitalPontos,
	txtPericiaEmRunasPontos,
	txtAdestrarDragaoPontos,
	txtSoproDoDragaoPontos,
	txtRugidoDoDragaoPontos,
	txtRevidarDanoPontos,
	txtEncantarLaminaPontos,
	txtImpactoFlamejantePontos,
	txtArpaoPontos,
	txtOndaDeChoquePontos,
	txtVentoCortantePontos,
	txtLancaDasMilPontasPontos;
	
	//Txt pontos restantes
	TextView txtClasse1, txtClasse2, txtTransClasse, txtClasse3;
	
	//Layouts
	LinearLayout layPericiaComEspada,
	layPericiaComEspadaDeDuasMaos,
	layAumentarRecuperacaoDeHP,
	layGolpeFulminante,
	layProvocar,
	layImpactoExplosivo,
	layVigor,
	layPericiaComLanca,
	layPerfurar,
	layEstocada,
	layLancaBumerangue,
	layBrandirLanca,
	layRapidezComDuasMaos,
	layContraAtaque,
	layImpactoDeTyr,
	layPericiaEmMontaria,
	layMontaria,
	layLaminaDeAura,
	layPerfurarEmEspiral,
	layFrenesi,
	layApararGolpe,
	layRelaxar,
	layDedicacao,
	layGolpeTraumatico,
	layAtaqueVital,
	layPericiaEmRunas,
	layAdestrarDragao,
	laySoproDoDragao,
	layRugidoDoDragao,
	layRevidarDano,
	layEncantarLamina,
	layImpactoFlamejante,
	layArpao,
	layOndaDeChoque,
	layVentoCortante,
	layLancaDasMilPontas;
	
	//Variaveis de Skill
	int varPericiaComEspada,
	varPericiaComEspadaDeDuasMaos,
	varAumentarRecuperacaoDeHP,
	varGolpeFulminante,
	varProvocar,
	varImpactoExplosivo,
	varVigor,
	varPericiaComLanca,
	varPerfurar,
	varEstocada,
	varLancaBumerangue,
	varBrandirLanca,
	varRapidezComDuasMaos,
	varContraAtaque,
	varImpactoDeTyr,
	varPericiaEmMontaria,
	varMontaria,
	varLaminaDeAura,
	varPerfurarEmEspiral,
	varFrenesi,
	varApararGolpe,
	varRelaxar,
	varDedicacao,
	varGolpeTraumatico,
	varAtaqueVital,
	varPericiaEmRunas,
	varAdestrarDragao,
	varSoproDoDragao,
	varRugidoDoDragao,
	varRevidarDano,
	varEncantarLamina,
	varImpactoFlamejante,
	varArpao,
	varOndaDeChoque,
	varVentoCortante,
	varLancaDasMilPontas;
	
	//variavel para alteração de db
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
		setContentView(R.layout.activity_simulador_cavaleiro_runico);
		
		Intent it = getIntent();
		
		final int id = it.getIntExtra("id", 0);
		
		
		
		//inicialização de variáveis
		varPericiaComEspada = 0;
		varPericiaComEspadaDeDuasMaos = 0;
		varAumentarRecuperacaoDeHP = 0;
		varGolpeFulminante = 0;
		varProvocar = 0;
		varImpactoExplosivo = 0;
		varVigor = 0;
		varPericiaComLanca = 0;
		varPerfurar = 0;
		varEstocada = 0;
		varLancaBumerangue = 0;
		varBrandirLanca = 0;
		varRapidezComDuasMaos = 0;
		varContraAtaque = 0;
		varImpactoDeTyr = 0;
		varPericiaEmMontaria = 0;
		varMontaria = 0;
		varLaminaDeAura = 0;
		varPerfurarEmEspiral = 0;
		varFrenesi = 0;
		varApararGolpe = 0;
		varRelaxar = 0;
		varDedicacao = 0;
		varGolpeTraumatico = 0;
		varAtaqueVital = 0;
		varPericiaEmRunas = 0;
		varAdestrarDragao = 0;
		varSoproDoDragao = 0;
		varRugidoDoDragao = 0;
		varRevidarDano = 0;
		varEncantarLamina = 0;
		varImpactoFlamejante = 0;
		varArpao = 0;
		varOndaDeChoque = 0;
		varVentoCortante = 0;
		varLancaDasMilPontas = 0;
		
		
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
		btPericiaComEspadaInterrogacao = (Button) findViewById(R.id.btPericiaComEspadaInterrogacao);
		btPericiaComEspadaDeDuasMaosInterrogacao = (Button) findViewById(R.id.btPericiaComEspadaDeDuasMaosInterrogacao);
		btAumentarRecuperacaoDeHPInterrogacao = (Button) findViewById(R.id.btAumentarRecuperacaoDeHPInterrogacao);
		btGolpeFulminanteInterrogacao = (Button) findViewById(R.id.btGolpeFulminanteInterrogacao);
		btProvocarInterrogacao = (Button) findViewById(R.id.btProvocarInterrogacao);
		btImpactoExplosivoInterrogacao = (Button) findViewById(R.id.btImpactoExplosivoInterrogacao);
		btVigorInterrogacao = (Button) findViewById(R.id.btVigorInterrogacao);
		btInstintoDeSobrevivenciaInterrogacao = (Button) findViewById(R.id.btInstintoDeSobrevivenciaInterrogacao);
		btGolpeFatalInterrogacao = (Button) findViewById(R.id.btGolpeFatalInterrogacao);
		btRecuperarHPEmMovimentoInterrogacao = (Button) findViewById(R.id.btRecuperarHPEmMovimentoInterrogacao);
		btPericiaComLancaInterrogacao = (Button) findViewById(R.id.btPericiaComLancaInterrogacao);
		btPerfurarInterrogacao = (Button) findViewById(R.id.btPerfurarInterrogacao);
		btEstocadaInterrogacao = (Button) findViewById(R.id.btEstocadaInterrogacao);
		btLancaBumerangueInterrogacao = (Button) findViewById(R.id.btLancaBumerangueInterrogacao);
		btBrandirLancaInterrogacao = (Button) findViewById(R.id.btBrandirLancaInterrogacao);
		btRapidezComDuasMaosInterrogacao = (Button) findViewById(R.id.btRapidezComDuasMaosInterrogacao);
		btContraAtaqueInterrogacao = (Button) findViewById(R.id.btContraAtaqueInterrogacao);
		btImpactoDeTyrInterrogacao = (Button) findViewById(R.id.btImpactoDeTyrInterrogacao);
		btPericiaEmMontariaInterrogacao = (Button) findViewById(R.id.btPericiaEmMontariaInterrogacao);
		btMontariaInterrogacao = (Button) findViewById(R.id.btMontariaInterrogacao);
		btAvancoOfensivoInterrogacao = (Button) findViewById(R.id.btAvancoOfensivoInterrogacao);
		btRapidezComUmaMaoInterrogacao = (Button) findViewById(R.id.btRapidezComUmaMaoInterrogacao);
		btLaminaDeAuraInterrogacao = (Button) findViewById(R.id.btLaminaDeAuraInterrogacao);
		btPerfurarEmEspiralInterrogacao = (Button) findViewById(R.id.btPerfurarEmEspiralInterrogacao);
		btFrenesiInterrogacao = (Button) findViewById(R.id.btFrenesiInterrogacao);
		btApararGolpeInterrogacao = (Button) findViewById(R.id.btApararGolpeInterrogacao);
		btRelaxarInterrogacao = (Button) findViewById(R.id.btRelaxarInterrogacao);
		btDedicacaoInterrogacao = (Button) findViewById(R.id.btDedicacaoInterrogacao);
		btGolpeTraumaticoInterrogacao = (Button) findViewById(R.id.btGolpeTraumaticoInterrogacao);
		btAtaqueVitalInterrogacao = (Button) findViewById(R.id.btAtaqueVitalInterrogacao);
		btPericiaEmRunasInterrogacao = (Button) findViewById(R.id.btPericiaEmRunasInterrogacao);
		btAdestrarDragaoInterrogacao = (Button) findViewById(R.id.btAdestrarDragaoInterrogacao);
		btSoproDoDragaoInterrogacao = (Button) findViewById(R.id.btSoproDoDragaoInterrogacao);
		btRugidoDoDragaoInterrogacao = (Button) findViewById(R.id.btRugidoDoDragaoInterrogacao);
		btRevidarDanoInterrogacao = (Button) findViewById(R.id.btRevidarDanoInterrogacao);
		btEncantarLaminaInterrogacao = (Button) findViewById(R.id.btEncantarLaminaInterrogacao);
		btImpactoFlamejanteInterrogacao = (Button) findViewById(R.id.btImpactoFlamejanteInterrogacao);
		btArpaoInterrogacao = (Button) findViewById(R.id.btArpaoInterrogacao);
		btOndaDeChoqueInterrogacao = (Button) findViewById(R.id.btOndaDeChoqueInterrogacao);
		btVentoCortanteInterrogacao = (Button) findViewById(R.id.btVentoCortanteInterrogacao);
		btLancaDasMilPontasInterrogacao = (Button) findViewById(R.id.btLancaDasMilPontasInterrogacao);
		
		//Botões de diminuir habilidades
		btPericiaComEspadaDiminuir = (Button) findViewById(R.id.btPericiaComEspadaDiminuir);
		btPericiaComEspadaDeDuasMaosDiminuir = (Button) findViewById(R.id.btPericiaComEspadaDeDuasMaosDiminuir);
		btAumentarRecuperacaoDeHPDiminuir = (Button) findViewById(R.id.btAumentarRecuperacaoDeHPDiminuir);
		btGolpeFulminanteDiminuir = (Button) findViewById(R.id.btGolpeFulminanteDiminuir);
		btProvocarDiminuir = (Button) findViewById(R.id.btProvocarDiminuir);
		btImpactoExplosivoDiminuir = (Button) findViewById(R.id.btImpactoExplosivoDiminuir);
		btVigorDiminuir = (Button) findViewById(R.id.btVigorDiminuir);
		btPericiaComLancaDiminuir = (Button) findViewById(R.id.btPericiaComLancaDiminuir);
		btPerfurarDiminuir = (Button) findViewById(R.id.btPerfurarDiminuir);
		btEstocadaDiminuir = (Button) findViewById(R.id.btEstocadaDiminuir);
		btLancaBumerangueDiminuir = (Button) findViewById(R.id.btLancaBumerangueDiminuir);
		btBrandirLancaDiminuir = (Button) findViewById(R.id.btBrandirLancaDiminuir);
		btRapidezComDuasMaosDiminuir = (Button) findViewById(R.id.btRapidezComDuasMaosDiminuir);
		btContraAtaqueDiminuir = (Button) findViewById(R.id.btContraAtaqueDiminuir);
		btImpactoDeTyrDiminuir = (Button) findViewById(R.id.btImpactoDeTyrDiminuir);
		btPericiaEmMontariaDiminuir = (Button) findViewById(R.id.btPericiaEmMontariaDiminuir);
		btMontariaDiminuir = (Button) findViewById(R.id.btMontariaDiminuir);
		btLaminaDeAuraDiminuir = (Button) findViewById(R.id.btLaminaDeAuraDiminuir);
		btPerfurarEmEspiralDiminuir = (Button) findViewById(R.id.btPerfurarEmEspiralDiminuir);
		btFrenesiDiminuir = (Button) findViewById(R.id.btFrenesiDiminuir);
		btApararGolpeDiminuir = (Button) findViewById(R.id.btApararGolpeDiminuir);
		btRelaxarDiminuir = (Button) findViewById(R.id.btRelaxarDiminuir);
		btDedicacaoDiminuir = (Button) findViewById(R.id.btDedicacaoDiminuir);
		btGolpeTraumaticoDiminuir = (Button) findViewById(R.id.btGolpeTraumaticoDiminuir);
		btAtaqueVitalDiminuir = (Button) findViewById(R.id.btAtaqueVitalDiminuir);
		btPericiaEmRunasDiminuir = (Button) findViewById(R.id.btPericiaEmRunasDiminuir);
		btAdestrarDragaoDiminuir = (Button) findViewById(R.id.btAdestrarDragaoDiminuir);
		btSoproDoDragaoDiminuir = (Button) findViewById(R.id.btSoproDoDragaoDiminuir);
		btRugidoDoDragaoDiminuir = (Button) findViewById(R.id.btRugidoDoDragaoDiminuir);
		btRevidarDanoDiminuir = (Button) findViewById(R.id.btRevidarDanoDiminuir);
		btEncantarLaminaDiminuir = (Button) findViewById(R.id.btEncantarLaminaDiminuir);
		btImpactoFlamejanteDiminuir = (Button) findViewById(R.id.btImpactoFlamejanteDiminuir);
		btArpaoDiminuir = (Button) findViewById(R.id.btArpaoDiminuir);
		btOndaDeChoqueDiminuir = (Button) findViewById(R.id.btOndaDeChoqueDiminuir);
		btVentoCortanteDiminuir = (Button) findViewById(R.id.btVentoCortanteDiminuir);
		btLancaDasMilPontasDiminuir = (Button) findViewById(R.id.btLancaDasMilPontasDiminuir);
		
		//Botões de aumentar habilidades
		btPericiaComEspadaAumentar = (Button) findViewById(R.id.btPericiaComEspadaAumentar);
		btPericiaComEspadaDeDuasMaosAumentar= (Button) findViewById(R.id.btPericiaComEspadaDeDuasMaosAumentar);
		btAumentarRecuperacaoDeHPAumentar = (Button) findViewById(R.id.btAumentarRecuperacaoDeHPAumentar);
		btGolpeFulminanteAumentar = (Button) findViewById(R.id.btGolpeFulminanteAumentar);
		btProvocarAumentar = (Button) findViewById(R.id.btProvocarAumentar);
		btImpactoExplosivoAumentar = (Button) findViewById(R.id.btImpactoExplosivoAumentar);
		btVigorAumentar = (Button) findViewById(R.id.btVigorAumentar);
		btPericiaComLancaAumentar = (Button) findViewById(R.id.btPericiaComLancaAumentar);
		btPerfurarAumentar = (Button) findViewById(R.id.btPerfurarAumentar);
		btEstocadaAumentar = (Button) findViewById(R.id.btEstocadaAumentar);
		btLancaBumerangueAumentar = (Button) findViewById(R.id.btLancaBumerangueAumentar);
		btBrandirLancaAumentar = (Button) findViewById(R.id.btBrandirLancaAumentar);
		btRapidezComDuasMaosAumentar = (Button) findViewById(R.id.btRapidezComDuasMaosAumentar);
		btContraAtaqueAumentar = (Button) findViewById(R.id.btContraAtaqueAumentar);
		btImpactoDeTyrAumentar = (Button) findViewById(R.id.btImpactoDeTyrAumentar);
		btPericiaEmMontariaAumentar = (Button) findViewById(R.id.btPericiaEmMontariaAumentar);
		btMontariaAumentar = (Button) findViewById(R.id.btMontariaAumentar);
		btLaminaDeAuraAumentar = (Button) findViewById(R.id.btLaminaDeAuraAumentar);
		btPerfurarEmEspiralAumentar = (Button) findViewById(R.id.btPerfurarEmEspiralAumentar);
		btFrenesiAumentar = (Button) findViewById(R.id.btFrenesiAumentar);
		btApararGolpeAumentar = (Button) findViewById(R.id.btApararGolpeAumentar);
		btRelaxarAumentar = (Button) findViewById(R.id.btRelaxarAumentar);
		btDedicacaoAumentar = (Button) findViewById(R.id.btDedicacaoAumentar);
		btGolpeTraumaticoAumentar = (Button) findViewById(R.id.btGolpeTraumaticoAumentar);
		btAtaqueVitalAumentar = (Button) findViewById(R.id.btAtaqueVitalAumentar);
		btPericiaEmRunasAumentar = (Button) findViewById(R.id.btPericiaEmRunasAumentar);
		btAdestrarDragaoAumentar = (Button) findViewById(R.id.btAdestrarDragaoAumentar);
		btSoproDoDragaoAumentar = (Button) findViewById(R.id.btSoproDoDragaoAumentar);
		btRugidoDoDragaoAumentar = (Button) findViewById(R.id.btRugidoDoDragaoAumentar);
		btRevidarDanoAumentar = (Button) findViewById(R.id.btRevidarDanoAumentar);
		btEncantarLaminaAumentar = (Button) findViewById(R.id.btEncantarLaminaAumentar);
		btImpactoFlamejanteAumentar = (Button) findViewById(R.id.btImpactoFlamejanteAumentar);
		btArpaoAumentar = (Button) findViewById(R.id.btArpaoAumentar);
		btOndaDeChoqueAumentar = (Button) findViewById(R.id.btOndaDeChoqueAumentar);
		btVentoCortanteAumentar = (Button) findViewById(R.id.btVentoCortanteAumentar);
		btLancaDasMilPontasAumentar = (Button) findViewById(R.id.btLancaDasMilPontasAumentar);
		
		//Resto dos botões
		btResetar = (Button) findViewById(R.id.btResetar);
		btSalvar = (Button) findViewById(R.id.btSalvar);
		tgbtSomenteHabilidadeAprendida = (ToggleButton) findViewById(R.id.tgbtSomenteHabilidadeAprendida);
		
		//Txt pontos da tela
		txtPericiaComEspadaPontos = (TextView) findViewById(R.id.txtPericiaComEspadaPontos);
		txtPericiaComEspadaDeDuasMaosPontos = (TextView) findViewById(R.id.txtPericiaComEspadaDeDuasMaosPontos);
		txtAumentarRecuperacaoDeHPPontos = (TextView) findViewById(R.id.txtAumentarRecuperacaoDeHPPontos);
		txtGolpeFulminantePontos = (TextView) findViewById(R.id.txtGolpeFulminantePontos);
		txtProvocarPontos = (TextView) findViewById(R.id.txtProvocarPontos);
		txtImpactoExplosivoPontos = (TextView) findViewById(R.id.txtImpactoPontos);
		txtVigorPontos = (TextView) findViewById(R.id.txtVigorPontos);
		txtPericiaComLancaPontos = (TextView) findViewById(R.id.txtPericiaComLancaPontos);
		txtPerfurarPontos = (TextView) findViewById(R.id.txtPerfurarPontos);
		txtEstocadaPontos = (TextView) findViewById(R.id.txtEstocadaPontos);
		txtLancaBumeranguePontos = (TextView) findViewById(R.id.txtLancaBumeranguePontos);
		txtBrandirLancaPontos = (TextView) findViewById(R.id.txtBrandirLancaPontos);
		txtRapidezComDuasMaosPontos = (TextView) findViewById(R.id.txtRapidezComDuasMaosPontos);
		txtContraAtaquePontos = (TextView) findViewById(R.id.txtContraAtaquePontos);
		txtImpactoDeTyrPontos = (TextView) findViewById(R.id.txtImpactoDeTyrPontos);
		txtPericiaEmMontariaPontos = (TextView) findViewById(R.id.txtPericiaEmMontariaPontos);
		txtMontariaPontos = (TextView) findViewById(R.id.txtMontariaPontos);
		txtLaminaDeAuraPontos = (TextView) findViewById(R.id.txtLaminaDeAuraPontos);
		txtPerfurarEmEspiralPontos = (TextView) findViewById(R.id.txtPerfurarEmEspiralPontos);
		txtFrenesiPontos = (TextView) findViewById(R.id.txtFrenesiPontos);
		txtApararGolpePontos = (TextView) findViewById(R.id.txtApararGolpePontos);
		txtRelaxarPontos = (TextView) findViewById(R.id.txtRelaxarPontos);
		txtDedicacaoPontos = (TextView) findViewById(R.id.txtDedicacaoPontos);
		txtGolpeTraumaticoPontos = (TextView) findViewById(R.id.txtGolpeTraumaticoPontos);
		txtAtaqueVitalPontos = (TextView) findViewById(R.id.txtAtaqueVitalPontos);
		txtPericiaEmRunasPontos = (TextView) findViewById(R.id.txtPericiaEmRunasPontos);
		txtAdestrarDragaoPontos = (TextView) findViewById(R.id.txtAdestrarDragaoPontos);
		txtSoproDoDragaoPontos = (TextView) findViewById(R.id.txtSoproDoDragaoPontos);
		txtRugidoDoDragaoPontos = (TextView) findViewById(R.id.txtRugidoDoDragaoPontos);
		txtRevidarDanoPontos = (TextView) findViewById(R.id.txtRevidarDanoPontos);
		txtEncantarLaminaPontos = (TextView) findViewById(R.id.txtEncantarLaminaPontos);
		txtImpactoFlamejantePontos = (TextView) findViewById(R.id.txtImpactoFlamejantePontos);
		txtArpaoPontos = (TextView) findViewById(R.id.txtArpaoPontos);
		txtOndaDeChoquePontos = (TextView) findViewById(R.id.txtOndaDeChoquePontos);
		txtVentoCortantePontos = (TextView) findViewById(R.id.txtVentoCortantePontos);
		txtLancaDasMilPontasPontos = (TextView) findViewById(R.id.txtLancaDasMilPontasPontos);
		
		//Txt pontos restantes
		txtClasse1 = (TextView) findViewById(R.id.txtClasse1);
		txtClasse2 = (TextView) findViewById(R.id.txtClasse2);
		txtTransClasse = (TextView) findViewById(R.id.txtClasseTrans);
		txtClasse3 = (TextView) findViewById(R.id.txtClasse3);
		
		//Layouts
		layPericiaComEspada = (LinearLayout) findViewById(R.id.layPericiaComEspada);
		layPericiaComEspadaDeDuasMaos = (LinearLayout) findViewById(R.id.layPericiaComEspadaDeDoasMaos);
		layAumentarRecuperacaoDeHP = (LinearLayout) findViewById(R.id.layAumentarRecuperacaoDeHP);
		layGolpeFulminante = (LinearLayout) findViewById(R.id.layGolpeFulminante);
		layProvocar = (LinearLayout) findViewById(R.id.layProvocar);
		layImpactoExplosivo = (LinearLayout) findViewById(R.id.layImpactoExplosivo);
		layVigor = (LinearLayout) findViewById(R.id.layVigor);
		layPericiaComLanca = (LinearLayout) findViewById(R.id.layPericiaComLanca);
		layPerfurar = (LinearLayout) findViewById(R.id.layPerfurar);
		layEstocada = (LinearLayout) findViewById(R.id.layEstocada);
		layLancaBumerangue = (LinearLayout) findViewById(R.id.layLancaBumerangue);
		layBrandirLanca = (LinearLayout) findViewById(R.id.layBrandirLanca);
		layRapidezComDuasMaos = (LinearLayout) findViewById(R.id.layRapidezComDuasMaos);
		layContraAtaque = (LinearLayout) findViewById(R.id.layContraAtaque);
		layImpactoDeTyr = (LinearLayout) findViewById(R.id.layImpactoDeTyr);
		layPericiaEmMontaria = (LinearLayout) findViewById(R.id.layPericiaEmMontaria);
		layMontaria = (LinearLayout) findViewById(R.id.layMontaria);
		layLaminaDeAura = (LinearLayout) findViewById(R.id.layLaminaDeAura);
		layPerfurarEmEspiral = (LinearLayout) findViewById(R.id.layPerfurarEmEspiral);
		layFrenesi = (LinearLayout) findViewById(R.id.layFrenesi);
		layApararGolpe = (LinearLayout) findViewById(R.id.layApararGolpe);
		layRelaxar = (LinearLayout) findViewById(R.id.layRelaxar);
		layDedicacao = (LinearLayout) findViewById(R.id.layDedicacao);
		layGolpeTraumatico = (LinearLayout) findViewById(R.id.layGolpeTraumatico);
		layAtaqueVital = (LinearLayout) findViewById(R.id.layAtaqueVital);
		layPericiaEmRunas = (LinearLayout) findViewById(R.id.layPericiaEmRunas);
		layAdestrarDragao = (LinearLayout) findViewById(R.id.layAdestrarDragao);
		laySoproDoDragao = (LinearLayout) findViewById(R.id.laySoproDoDragao);
		layRugidoDoDragao = (LinearLayout) findViewById(R.id.layRugidoDoDragao);
		layRevidarDano = (LinearLayout) findViewById(R.id.layRevidarDano);
		layEncantarLamina = (LinearLayout) findViewById(R.id.layEncantarLamina);
		layImpactoFlamejante = (LinearLayout) findViewById(R.id.layImpactoFlamejante);
		layArpao = (LinearLayout) findViewById(R.id.layArpao);
		layOndaDeChoque = (LinearLayout) findViewById(R.id.layOndaDeChoque);
		layVentoCortante = (LinearLayout) findViewById(R.id.layVentoCortante);
		layLancaDasMilPontas = (LinearLayout) findViewById(R.id.layLancaDasMilPontas);
		
		if (id>0)
			recarregarBuild(id);
		
		
		
		//Eventos de informação		
		btPericiaComEspadaInterrogacao.setOnClickListener(new OnClickListener() {	
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Perícia com Espada");
				dialogo.setMessage(R.string.periciaComEspadaInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
		btPericiaComEspadaDeDuasMaosInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Perícia com Espada de Duas Mãos");
				dialogo.setMessage(R.string.periciaComEspadaDeDuasMaosInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
		btAumentarRecuperacaoDeHPInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Aumentar Recuperação de HP");
				dialogo.setMessage(R.string.aumentarRecuperacaoDeHPInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
		btGolpeFulminanteInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Golpe Fulminante");
				dialogo.setMessage(R.string.golpeFulminanteInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
		btProvocarInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Provocar");
				dialogo.setMessage(R.string.provocarInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
		btImpactoExplosivoInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Impacto Explosivo");
				dialogo.setMessage(R.string.impactoExplosivoInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
		btVigorInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Vigor");
				dialogo.setMessage(R.string.vigorInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
		btInstintoDeSobrevivenciaInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Instinto de Sobrevivência");
				dialogo.setMessage(R.string.instintoDeSobrevivenciaInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
		btGolpeFatalInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Golpe Fatal");
				dialogo.setMessage(R.string.golpeFatalInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		btRecuperarHPEmMovimentoInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Recuperar HP em movimento");
				dialogo.setMessage(R.string.recuperarHPEmMovimentoInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btPericiaComLancaInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Perícia com Lança");
				dialogo.setMessage(R.string.periciaComLancaInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btPerfurarInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Perfurar");
				dialogo.setMessage(R.string.perfurarInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btEstocadaInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Estocada");
				dialogo.setMessage(R.string.estocadaInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btLancaBumerangueInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Lança Bumerangue");
				dialogo.setMessage(R.string.lancaBumerangueInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btBrandirLancaInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Brandir Lança");
				dialogo.setMessage(R.string.brandirLancaInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btRapidezComDuasMaosInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Rapidez com duas mãos");
				dialogo.setMessage(R.string.rapidezComDuasMaosInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btContraAtaqueInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Contra-Ataque");
				dialogo.setMessage(R.string.contraAtaqueInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btImpactoDeTyrInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Impacto de Tyr");
				dialogo.setMessage(R.string.impactoDeTyrInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btPericiaEmMontariaInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Perícia em Montaria");
				dialogo.setMessage(R.string.periciaEmMontariaInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btMontariaInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Perícia em Montaria");
				dialogo.setMessage(R.string.montariaInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btRapidezComUmaMaoInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Rapidez com uma mão");
				dialogo.setMessage(R.string.rapidezComUmaMaoInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btAvancoOfensivoInterrogacao.setOnClickListener(new OnClickListener() {
 			public void onClick(View v) {
 				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
 				dialogo.setTitle("Avanço Ofensivo");
 				dialogo.setMessage(R.string.avancoOfensivoInfo);
 				dialogo.setNeutralButton("Fechar info", null);
 				dialogo.show();
 			}
 		});
 		
 		btLaminaDeAuraInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Lâmina de Aura");
				dialogo.setMessage(R.string.laminaDeAuraInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btPerfurarEmEspiralInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Perfurar em Espiral");
				dialogo.setMessage(R.string.perfurarEmEspiralInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btFrenesiInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Frenesi");
				dialogo.setMessage(R.string.frenesiInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btApararGolpeInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Aparar Golpe");
				dialogo.setMessage(R.string.apararGolpeInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btRelaxarInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Relaxar");
				dialogo.setMessage(R.string.relaxarInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btDedicacaoInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Dedicação");
				dialogo.setMessage(R.string.dedicacaoInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btGolpeTraumaticoInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Golpe Traumático");
				dialogo.setMessage(R.string.golpeTraumaticoInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btAtaqueVitalInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Ataque Vital");
				dialogo.setMessage(R.string.ataqueVitalInfo);;
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btPericiaEmRunasInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Perícia em Runas");
				dialogo.setMessage(R.string.periciaEmRunasInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btAdestrarDragaoInterrogacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
				dialogo.setTitle("Adestrar Dragão");
				dialogo.setMessage(R.string.adestrarDragaoInfo);
				dialogo.setNeutralButton("Fechar info", null);
				dialogo.show();
			}
		});
 		
 		btSoproDoDragaoInterrogacao.setOnClickListener(new OnClickListener() {
 			public void onClick(View v) {
 				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
 				dialogo.setTitle("Sopro Do Dragão");
 				dialogo.setMessage(R.string.soproDoDragaoInfo);
 				dialogo.setNeutralButton("Fechar info", null);
 				dialogo.show();
 			}
 		});
 		
 		btRugidoDoDragaoInterrogacao.setOnClickListener(new OnClickListener() {
 			public void onClick(View v) {
 				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
 				dialogo.setTitle("Rugido Do Dragão");
 				dialogo.setMessage(R.string.rugidoDoDragaoInfo);
 				dialogo.setNeutralButton("Fechar info", null);
 				dialogo.show();
 			}
 		});
 		
 		btRevidarDanoInterrogacao.setOnClickListener(new OnClickListener() {
 			public void onClick(View v) {
 				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
 				dialogo.setTitle("Revidar Dano");
 				dialogo.setMessage(R.string.revidarDanoInfo);
 				dialogo.setNeutralButton("Fechar info", null);
 				dialogo.show();
 			}
 		});
 		
 		btEncantarLaminaInterrogacao.setOnClickListener(new OnClickListener() {
 			public void onClick(View v) {
 				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
 				dialogo.setTitle("Encantar Lâmina");
 				dialogo.setMessage(R.string.encantarLaminaInfo);
 				dialogo.setNeutralButton("Fechar info", null);
 				dialogo.show();
 			}
 		});
 		
 		btImpactoFlamejanteInterrogacao.setOnClickListener(new OnClickListener() {
 			public void onClick(View v) {
 				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
 				dialogo.setTitle("Impacto Flamejante");
 				dialogo.setMessage(R.string.impactoFlamejanteInfo);
 				dialogo.setNeutralButton("Fechar info", null);
 				dialogo.show();
 			}
 		});
 		
 		btArpaoInterrogacao.setOnClickListener(new OnClickListener() {
 			public void onClick(View v) {
 				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
 				dialogo.setTitle("Arpão");
 				dialogo.setMessage(R.string.arpaoInfo);
 				dialogo.setNeutralButton("Fechar info", null);
 				dialogo.show();
 			}
 		});
 		
 		btOndaDeChoqueInterrogacao.setOnClickListener(new OnClickListener() {
 			public void onClick(View v) {
 				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
 				dialogo.setTitle("Onda de Choque");
 				dialogo.setMessage(R.string.ondaDeChoqueInfo);
 				dialogo.setNeutralButton("Fechar info", null);
 				dialogo.show();
 			}
 		});
 		
 		btVentoCortanteInterrogacao.setOnClickListener(new OnClickListener() {
 			public void onClick(View v) {
 				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
 				dialogo.setTitle("Vento Cortante");
 				dialogo.setMessage(R.string.ventoCortanteInfo);
 				dialogo.setNeutralButton("Fechar info", null);
 				dialogo.show();
 			}
 		});
 		
 		btLancaDasMilPontasInterrogacao.setOnClickListener(new OnClickListener() {
 			public void onClick(View v) {
 				AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
 				dialogo.setTitle("Lança das Mil Pontas");
 				dialogo.setMessage(R.string.lancaDasMilPontasInfo);
 				dialogo.setNeutralButton("Fechar info", null);
 				dialogo.show();
 			}
 		});
 		
		//Eventos de aumentar
 		btPericiaComEspadaAumentar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 1, "Aumentar");
				
			}
		});
 		
 		btPericiaComEspadaDeDuasMaosAumentar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (varPericiaComEspada==0)
					atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 1, "Aumentar");
				
				atualizarCalculo(varPericiaComEspadaDeDuasMaos, "PericiaComEspadaDeDuasMaos", 10, 1, "Aumentar");
				
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
 					while (varGolpeFulminante<5 && count<5){
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
 					while (varProvocar<5 && count<5) {
 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
 						count++;
 					}
 					count = 0;
 					atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
 					
 				}
 		});
 			
 			btPericiaComLancaAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
 					
 				}
 		});
 			
 			btPerfurarAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					if (varPericiaComLanca==0)
 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
 						
 					atualizarCalculo(varPerfurar, "Perfurar", 10, 2, "Aumentar");
 					
 				}
 		});
 			
 			btEstocadaAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					if (varPericiaComLanca == 0)
 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
 					
 					while (varPerfurar < 5 && count < 0) {
 						atualizarCalculo(varPerfurar, "Perfurar", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varEstocada, "Estocada", 10, 2, "Aumentar");
 					
 				}
 		});
 			
 			btLancaBumerangueAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					if (varPericiaComLanca == 0)
 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
 					
 					while (varPerfurar < 3 && count < 3){
 						atualizarCalculo(varPerfurar, "Perfurar", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varLancaBumerangue, "LancaBumerangue", 5, 2, "Aumentar");
 					
 				}
 		});
 			
 			btBrandirLancaAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					while (varProvocar < 5 && count < 5){
 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					if (varVigor == 0)
 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
 					
 					if (varMontaria == 0)
 						atualizarCalculo(varMontaria, "Montaria", 1, 2, "Aumentar");
 					
 					if (varPericiaComLanca == 0)
 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
 					
 					while (varPerfurar < 5 && count < 5){
 						atualizarCalculo(varPerfurar, "Perfurar", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varEstocada <3 && count < 3){
 						atualizarCalculo(varEstocada, "Estocada", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varBrandirLanca, "BrandirLanca", 10, 2, "Aumentar");
 					
 				}
 		});
 			
 			btRapidezComDuasMaosAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					if (varPericiaComEspada == 0)
 						atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 1, "Aumentar");
 					if (varPericiaComEspadaDeDuasMaos == 0)
 						atualizarCalculo(varPericiaComEspadaDeDuasMaos, "PericiaComEspadaDeDuasMaos", 10, 1, "Aumentar");
 					
 					atualizarCalculo(varRapidezComDuasMaos, "RapidezComDuasMaos", 10, 2, "Aumentar");
 					
 				}
 		});
 			
 			btContraAtaqueAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					if (varPericiaComEspada == 0)
 						atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 1, "Aumentar");
 					if (varPericiaComEspadaDeDuasMaos == 0)
 						atualizarCalculo(varPericiaComEspadaDeDuasMaos, "PericiaComEspadaDeDuasMaos", 10, 1, "Aumentar");
 					
 					atualizarCalculo(varContraAtaque, "ContraAtaque", 5, 2, "Aumentar");
 					
 				}
 		});
 			
 			btImpactoDeTyrAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					while (varGolpeFulminante < 10 && count < 10){
 						atualizarCalculo(varGolpeFulminante, "GolpeFulminante", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varImpactoExplosivo < 3 && count < 3){
 						atualizarCalculo(varImpactoExplosivo, "ImpactoExplosivo", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					if (varPericiaComEspada == 0)
 						atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 1, "Aumentar");
 					
 					while (varPericiaComEspadaDeDuasMaos < 5 && count < 5){
 						atualizarCalculo(varPericiaComEspadaDeDuasMaos, "PericiaComEspadaDeDuasMaos", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varRapidezComDuasMaos < 10 && count < 10){
 						atualizarCalculo(varRapidezComDuasMaos, "RapidezComDuasMaos", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varContraAtaque < 5 && count < 5){
 						atualizarCalculo(varContraAtaque, "ContraAtaque", 5, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varImpactoDeTyr, "ImpactoDeTyr", 10, 2, "Aumentar");
 					
 				}
 		});
 			
 			btPericiaEmMontariaAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					while (varProvocar < 5 && count < 5){
 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					if (varVigor == 0)
 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
 					
 					if (varMontaria == 0)
 						atualizarCalculo(varMontaria, "Montaria", 1, 2, "Aumentar");
 					
 					atualizarCalculo(varPericiaEmMontaria, "PericiaEmMontaria", 5, 2, "Aumentar");
 					
 				}
 		});
 			
 			btMontariaAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					while (varProvocar < 5 && count < 5){
 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					if (varVigor == 0)
 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
 					
 					atualizarCalculo(varMontaria, "Montaria", 1, 2, "Aumentar");
 					
 				}
 		});
 			
 			btLaminaDeAuraAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					while (varGolpeFulminante < 5 && count < 5){
 						atualizarCalculo(varGolpeFulminante, "GolpeFulminante", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varImpactoExplosivo < 5 && count < 5){
 						atualizarCalculo(varImpactoExplosivo, "ImpactoExplosivo", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					if (varPericiaComEspada == 0)
 						atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 1, "Aumentar");
 					
 					while (varPericiaComEspadaDeDuasMaos < 5 && count < 5){
 						atualizarCalculo(varPericiaComEspadaDeDuasMaos, "PericiaComEspadaDeDuasMaos", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varLaminaDeAura, "LaminaDeAura", 5, 3, "Aumentar");
 					
 				}
 			});
 			
 			btPerfurarEmEspiralAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					while (varPericiaComLanca < 5 && count < 5){
 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varPerfurar < 5 && count < 5){
 						atualizarCalculo(varPerfurar, "Perfurar", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varEstocada <5 && count < 5){
 						atualizarCalculo(varEstocada, "Estocada", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varPerfurarEmEspiral, "PerfurarEmEspiral", 5, 3, "Aumentar");
 					
 				}
 			});
 			
 			btFrenesiAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					atualizarCalculo(varFrenesi, "Frenesi", 1, 3, "Aumentar");
 					
 				}
 			});
 			
 			btApararGolpeAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					while(varProvocar <5 && count <5){
 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varPericiaComEspadaDeDuasMaos < 10 && count < 10){
 						atualizarCalculo(varPericiaComEspadaDeDuasMaos, "PericiaComEspadaDeDuasMaos", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varRapidezComDuasMaos < 3 && count < 3){
 						atualizarCalculo(varRapidezComDuasMaos, "RapidezComDuasMaos", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varApararGolpe, "ApararGolpe", 10, 3, "Aumentar");
 					
 				}
 			});
 			
 			btRelaxarAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 						
 					while (varProvocar < 5 && count < 5){
 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varVigor < 3 && count < 3){
 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varAumentarRecuperacaoDeHP < 10 && count < 10){
 						atualizarCalculo(varAumentarRecuperacaoDeHP, "AumentarRecuperacaoDeHP", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varRelaxar, "Relaxar", 1, 3, "Aumentar");
 					
 				}
 			});
 			
 			btDedicacaoAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					while (varProvocar < 5 && count < 5){
 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					if (varVigor == 0)
 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
 					
 					if (varMontaria == 0)
 						atualizarCalculo(varMontaria, "Montaria", 1, 2, "Aumentar");
 					
 					while (varPericiaComLanca < 5 && count < 5){
 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varAumentarRecuperacaoDeHP < 5 && count < 5){
 						atualizarCalculo(varAumentarRecuperacaoDeHP, "AumentarRecuperacaoDeHP", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varDedicacao, "Dedicacao", 5, 3, "Aumentar");
 					
 				}
 			});
 			
 			btGolpeTraumaticoAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					while (varProvocar < 5 && count < 5){
 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					if (varVigor == 0)
 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
 					
 					if (varMontaria == 0)
 						atualizarCalculo(varMontaria, "Montaria", 1, 2, "Aumentar");
 					
 					while (varPericiaComLanca < 9 && count < 9){
 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varGolpeTraumatico, "GolpeTraumatico", 5, 3, "Aumentar");
 					
 				}
 			});
 			
 			btAtaqueVitalAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					while (varProvocar < 5 && count < 5){
 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					if (varVigor == 0)
 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
 					
 					if (varMontaria == 0)
 						atualizarCalculo(varMontaria, "Montaria", 1, 2, "Aumentar");
 					
 					while (varPericiaComLanca < 9 && count < 9){
 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varGolpeTraumatico < 3 && count < 3){
 						atualizarCalculo(varGolpeTraumatico, "GolpeTraumatico", 5, 3, "Aumentar");
 						count++;
 					}
 					count = 0;
 					
 					while (varPericiaEmMontaria < 3 && count < 3){
 						atualizarCalculo(varPericiaEmMontaria, "PericiaEmMontaria", 5, 2, "Aumentar");
 						count++;
 					}
 					count = 0;
 					
 					atualizarCalculo(varAtaqueVital, "AtaqueVital", 10, 3, "Aumentar");
 				}
 			});
 			
 			btPericiaEmRunasAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					atualizarCalculo(varPericiaEmRunas, "PericiaEmRunas", 10, 4, "Aumentar");
 				}
 			});
 			
 			btAdestrarDragaoAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					while (varProvocar < 5 && count < 5){
 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					if (varVigor == 0)
 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
 					
 					if (varMontaria == 0)
 						atualizarCalculo(varMontaria, "Montaria", 1, 2, "Aumentar");
 					
 					if (varPericiaEmMontaria == 0)
 						atualizarCalculo(varPericiaEmMontaria, "PericiaEmMontaria", 5, 2, "Aumentar");
 					
 					atualizarCalculo(varAdestrarDragao, "AdestrarDragao", 5, 4, "Aumentar");
 				}
 			});
 			
 			btSoproDoDragaoAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					while (varProvocar < 5 && count < 5){
 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					if (varVigor == 0)
 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
 					
 					if (varMontaria == 0)
 						atualizarCalculo(varMontaria, "Montaria", 1, 2, "Aumentar");
 					
 					if (varPericiaEmMontaria == 0)
 						atualizarCalculo(varPericiaEmMontaria, "PericiaEmMontaria", 5, 2, "Aumentar");
 					
 					while (varAdestrarDragao < 2 && count < 2){
 						atualizarCalculo(varAdestrarDragao, "AdestrarDragao", 5, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varSoproDoDragao, "SoproDoDragao", 10, 4, "Aumentar");
 				}
 			});
 			
 			btRugidoDoDragaoAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					while (varProvocar < 5 && count < 5){
 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					if (varVigor == 0)
 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
 					
 					if (varMontaria == 0)
 						atualizarCalculo(varMontaria, "Montaria", 1, 2, "Aumentar");
 					
 					if (varPericiaEmMontaria == 0)
 						atualizarCalculo(varPericiaEmMontaria, "PericiaEmMontaria", 5, 2, "Aumentar");
 					
 					while (varAdestrarDragao < 2 && count < 2){
 						atualizarCalculo(varAdestrarDragao, "AdestrarDragao", 5, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varRugidoDoDragao, "RugidoDoDragao", 5, 4, "Aumentar");
 				}
 			});
 			
 			btRevidarDanoAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					if (varPericiaComEspada == 0)
 						atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 1, "Aumentar");
 					if (varPericiaComEspadaDeDuasMaos == 0)
 						atualizarCalculo(varPericiaComEspadaDeDuasMaos, "PericiaComEspadaDeDuasMaos", 10, 1, "Aumentar");
 					if (varContraAtaque == 0)
 						atualizarCalculo(varContraAtaque, "ContraAtaque", 5, 2, "Aumentar");
 					
 					while (varPericiaEmRunas < 2 && count < 2){
 						atualizarCalculo(varPericiaEmRunas, "PericiaEmRunas", 10, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varEncantarLamina < 2 && count < 2){
 						atualizarCalculo(varEncantarLamina, "EncantarLamina", 5, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varRevidarDano, "RevidarDano", 10, 4, "Aumentar");
 				}
 			});
 			
 			btEncantarLaminaAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					while (varPericiaEmRunas < 2 && count < 2){
 						atualizarCalculo(varPericiaEmRunas, "PericiaEmRunas", 10, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varEncantarLamina, "EncantarLamina", 5, 4, "Aumentar");
 				}
 			});
 			
 			btImpactoFlamejanteAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					while (varPericiaEmRunas < 2 && count < 2){
 						atualizarCalculo(varPericiaEmRunas, "PericiaEmRunas", 10, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varEncantarLamina < 3 && count < 3){
 						atualizarCalculo(varEncantarLamina, "EncantarLamina", 5, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varOndaDeChoque < 2 && count < 2){
 						atualizarCalculo(varOndaDeChoque, "OndaDeChoque", 5, 4, "Aumentar");
 						count++;
 					}
 					
 					while (varPericiaEmRunas < 2 && count < 2){
 						atualizarCalculo(varPericiaEmRunas, "PericiaEmRunas", 10, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varEncantarLamina < 5 && count < 5){
 						atualizarCalculo(varEncantarLamina, "EncantarLamina", 5, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varVentoCortante < 3 && count < 3){
 						atualizarCalculo(varVentoCortante, "VentoCortante", 5, 4, "Aumentar");
 						count++;
 					}
 					
 					count=0;
 					
 					if (varPericiaComEspada == 0)
 						atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 1, "Aumentar");
 					if (varPericiaComEspadaDeDuasMaos == 0)
 						atualizarCalculo(varPericiaComEspadaDeDuasMaos, "PericiaComEspadaDeDuasMaos", 10, 1, "Aumentar");
 					if (varContraAtaque == 0)
 						atualizarCalculo(varContraAtaque, "ContraAtaque", 5, 2, "Aumentar");
 					
 					while (varPericiaEmRunas < 2 && count < 2){
 						atualizarCalculo(varPericiaEmRunas, "PericiaEmRunas", 10, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varEncantarLamina < 2 && count < 2){
 						atualizarCalculo(varEncantarLamina, "EncantarLamina", 5, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varRevidarDano < 5 && count < 5){
 						atualizarCalculo(varRevidarDano, "RevidarDano", 10, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varImpactoFlamejante, "ImpactoFlamejante", 5, 4, "Aumentar");
 				}
 			});
 			
 			btArpaoAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					while (varProvocar < 5 && count < 5){
 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					if (varVigor == 0)
 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
 					
 					if (varMontaria == 0)
 						atualizarCalculo(varMontaria, "Montaria", 1, 2, "Aumentar");
 					
 					if (varPericiaComLanca == 0)
 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
 					
 					while (varPerfurar < 5 && count < 5){
 						atualizarCalculo(varPerfurar, "Perfurar", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varEstocada <3 && count < 3){
 						atualizarCalculo(varEstocada, "Estocada", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varBrandirLanca <2 && count < 2){
 						atualizarCalculo(varBrandirLanca, "BrandirLanca", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varArpao, "Arpao", 5, 4, "Aumentar");
 				}
 			});
 			
 			btOndaDeChoqueAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					while (varPericiaEmRunas < 2 && count < 2){
 						atualizarCalculo(varPericiaEmRunas, "PericiaEmRunas", 10, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varEncantarLamina < 3 && count < 3){
 						atualizarCalculo(varEncantarLamina, "EncantarLamina", 5, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varOndaDeChoque, "OndaDeChoque", 5, 4, "Aumentar");
 				}
 			});
 			
 			btVentoCortanteAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					while (varPericiaEmRunas < 2 && count < 2){
 						atualizarCalculo(varPericiaEmRunas, "PericiaEmRunas", 10, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varEncantarLamina < 5 && count < 5){
 						atualizarCalculo(varEncantarLamina, "EncantarLamina", 5, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varVentoCortante, "VentoCortante", 5, 4, "Aumentar");
 				}
 			});
 			
 			btLancaDasMilPontasAumentar.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					
 					while (varProvocar < 5 && count < 5){
 						atualizarCalculo(varProvocar, "Provocar", 10, 1, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					if (varVigor == 0)
 						atualizarCalculo(varVigor, "Vigor", 10, 1, "Aumentar");
 					
 					if (varMontaria == 0)
 						atualizarCalculo(varMontaria, "Montaria", 1, 2, "Aumentar");
 					
 					if (varPericiaComLanca == 0)
 						atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Aumentar");
 					
 					while (varPerfurar < 5 && count < 5){
 						atualizarCalculo(varPerfurar, "Perfurar", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varEstocada <3 && count < 3){
 						atualizarCalculo(varEstocada, "Estocada", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varBrandirLanca <2 && count < 2){
 						atualizarCalculo(varBrandirLanca, "BrandirLanca", 10, 2, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					while (varArpao <3 && count < 3){
 						atualizarCalculo(varArpao, "Arpao", 5, 4, "Aumentar");
 						count++;
 					}
 					count=0;
 					
 					atualizarCalculo(varLancaDasMilPontas, "LancaDasMilPontas", 10, 4, "Aumentar");
 				}
 			});
 			
 			
 			//Eventos de diminuir
 			btPericiaComEspadaDiminuir.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					atualizarCalculo(varPericiaComEspada, "PericiaComEspada", 10, 1, "Diminuir");
 					
 				}
 			});
 			
 			btPericiaComEspadaDeDuasMaosDiminuir.setOnClickListener(new View.OnClickListener() {
 				
 				@Override
 				public void onClick(View v) {
 					atualizarCalculo(varPericiaComEspadaDeDuasMaos, "PericiaComEspadaDeDuasMaos", 10, 1, "Diminuir");
 					
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
 	 			
 	 			btPericiaComLancaDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varPericiaComLanca, "PericiaComLanca", 10, 2, "Diminuir");
 	 					
 	 				}
 	 		});
 	 			
 	 			btPerfurarDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varPerfurar, "Perfurar", 10, 2, "Diminuir");
 	 					
 	 				}
 	 		});
 	 			
 	 			btEstocadaDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varEstocada, "Estocada", 10, 2, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btLancaBumerangueDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varLancaBumerangue, "LancaBumerangue", 5, 2, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btBrandirLancaDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varBrandirLanca, "BrandirLanca", 10, 2, "Diminuir");
 	 					
 	 				}
 	 		});
 	 			
 	 			btRapidezComDuasMaosDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varRapidezComDuasMaos, "RapidezComDuasMaos", 10, 2, "Diminuir");
 	 					
 	 				}
 	 		});
 	 			
 	 			btContraAtaqueDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varContraAtaque, "ContraAtaque", 5, 2, "Diminuir");
 	 					
 	 				}
 	 		});
 	 			
 	 			btImpactoDeTyrDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varImpactoDeTyr, "ImpactoDeTyr", 10, 2, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btPericiaEmMontariaDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varPericiaEmMontaria, "PericiaEmMontaria", 5, 2, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btMontariaDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varMontaria, "Montaria", 1, 2, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btLaminaDeAuraDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varLaminaDeAura, "LaminaDeAura", 5, 3, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btPerfurarEmEspiralDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varPerfurarEmEspiral, "PerfurarEmEspiral", 5, 3, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btFrenesiDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varFrenesi, "Frenesi", 1, 3, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btApararGolpeDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varApararGolpe, "ApararGolpe", 10, 3, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btRelaxarDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varRelaxar, "Relaxar", 1, 3, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btDedicacaoDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varDedicacao, "Dedicacao", 5, 3, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btGolpeTraumaticoDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varGolpeTraumatico, "GolpeTraumatico", 5, 3, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btAtaqueVitalDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varAtaqueVital, "AtaqueVital", 10, 3, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btPericiaEmRunasDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varPericiaEmRunas, "PericiaEmRunas", 10, 4, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btAdestrarDragaoDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varAdestrarDragao, "AdestrarDragao", 5, 4, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btSoproDoDragaoDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varSoproDoDragao, "SoproDoDragao", 10, 4, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btRugidoDoDragaoDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varRugidoDoDragao, "RugidoDoDragao", 5, 4, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btRevidarDanoDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varRevidarDano, "RevidarDano", 10, 4, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btEncantarLaminaDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varEncantarLamina, "EncantarLamina", 5, 4, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btImpactoFlamejanteDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varImpactoFlamejante, "ImpactoFlamejante", 5, 4, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btArpaoDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varArpao, "Arpao", 5, 4, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btOndaDeChoqueDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varOndaDeChoque, "OndaDeChoque", 5, 4, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btVentoCortanteDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varVentoCortante, "VentoCortante", 5, 4, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			btLancaDasMilPontasDiminuir.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					atualizarCalculo(varLancaDasMilPontas, "LancaDasMilPontas", 10 , 4, "Diminuir");
 	 					
 	 				}
 	 			});
 	 			
 	 			
 	 			
 	 			//Outros Botões
 	 			
 	 			btResetar.setOnClickListener(new View.OnClickListener() {
 	 				
 	 				@Override
 	 				public void onClick(View v) {
 	 					varPericiaComEspada = 0;
 	 					varPericiaComEspadaDeDuasMaos = 0;
 	 					varAumentarRecuperacaoDeHP = 0;
 	 					varGolpeFulminante = 0;
 	 					varProvocar = 0;
 	 					varImpactoExplosivo = 0;
 	 					varVigor = 0;
 	 					varPericiaComLanca = 0;
 	 					varPerfurar = 0;
 	 					varEstocada = 0;
 	 					varLancaBumerangue = 0;
 	 					varBrandirLanca = 0;
 	 					varRapidezComDuasMaos = 0;
 	 					varContraAtaque = 0;
 	 					varImpactoDeTyr = 0;
 	 					varPericiaEmMontaria = 0;
 	 					varMontaria = 0;
 	 					varLaminaDeAura = 0;
 	 					varPerfurarEmEspiral = 0;
 	 					varFrenesi = 0;
 	 					varApararGolpe = 0;
 	 					varRelaxar = 0;
 	 					varDedicacao = 0;
 	 					varGolpeTraumatico = 0;
 	 					varAtaqueVital = 0;
 	 					varPericiaEmRunas = 0;
 	 					varAdestrarDragao = 0;
 	 					varSoproDoDragao = 0;
 	 					varRugidoDoDragao = 0;
 	 					varRevidarDano = 0;
 	 					varEncantarLamina = 0;
 	 					varImpactoFlamejante = 0;
 	 					varArpao = 0;
 	 					varOndaDeChoque = 0;
 	 					varVentoCortante = 0;
 	 					varLancaDasMilPontas = 0;
 	 					
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
 	 						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
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
	 	 							AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
		 	 						msg.setTitle("Escolha um nome");
		 	 						msg.setMessage("Escolha um nome para salvar esta simulação:");
		 	 						final EditText nomeParaSalvar = new EditText(SimuladorCavaleiroRunico.this);
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
 	 					
 	 						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorCavaleiroRunico.this);
 	 						msg.setTitle("Escolha um nome");
 	 						msg.setMessage("Escolha um nome para salvar esta simulação:");
 	 						final EditText nomeParaSalvar = new EditText(SimuladorCavaleiroRunico.this);
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
			if(varPericiaComEspada==0)
				layPericiaComEspada.setVisibility(View.GONE);
			if(varPericiaComEspadaDeDuasMaos==0)
				layPericiaComEspadaDeDuasMaos.setVisibility(View.GONE);
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
			
			if(varPericiaComLanca==0)
				layPericiaComLanca.setVisibility(View.GONE);
			if(varPerfurar==0)
				layPerfurar.setVisibility(View.GONE);
			if(varEstocada==0)
				layEstocada.setVisibility(View.GONE);
			if(varLancaBumerangue==0)
				layLancaBumerangue.setVisibility(View.GONE);
			if(varBrandirLanca==0)
				layBrandirLanca.setVisibility(View.GONE);
			if(varRapidezComDuasMaos==0)
				layRapidezComDuasMaos.setVisibility(View.GONE);
			if(varContraAtaque==0)
				layContraAtaque.setVisibility(View.GONE);
			if(varImpactoDeTyr==0)
				layImpactoDeTyr.setVisibility(View.GONE);
			if(varPericiaEmMontaria==0)
				layPericiaEmMontaria.setVisibility(View.GONE);
			if(varMontaria==0)
				layMontaria.setVisibility(View.GONE);
			
			if(varLaminaDeAura==0)
				layLaminaDeAura.setVisibility(View.GONE);
			if(varPerfurarEmEspiral==0)
				layPerfurarEmEspiral.setVisibility(View.GONE);
			if(varFrenesi==0)
				layFrenesi.setVisibility(View.GONE);
			if(varApararGolpe==0)
				layApararGolpe.setVisibility(View.GONE);
			if(varRelaxar==0)
				layRelaxar.setVisibility(View.GONE);
			if(varDedicacao==0)
				layDedicacao.setVisibility(View.GONE);
			if(varGolpeTraumatico==0)
				layGolpeTraumatico.setVisibility(View.GONE);
			if(varAtaqueVital==0)
				layAtaqueVital.setVisibility(View.GONE);
			
			if(varPericiaEmRunas==0)
				layPericiaEmRunas.setVisibility(View.GONE);
			if(varAdestrarDragao==0)
				layAdestrarDragao.setVisibility(View.GONE);
			if(varSoproDoDragao==0)
				laySoproDoDragao.setVisibility(View.GONE);
			if(varRugidoDoDragao==0)
				layRugidoDoDragao.setVisibility(View.GONE);
			if(varRevidarDano==0)
				layRevidarDano.setVisibility(View.GONE);
			if(varEncantarLamina==0)
				layEncantarLamina.setVisibility(View.GONE);
			if(varImpactoFlamejante==0)
				layImpactoFlamejante.setVisibility(View.GONE);
			if(varArpao==0)
				layArpao.setVisibility(View.GONE);
			if(varOndaDeChoque==0)
				layOndaDeChoque.setVisibility(View.GONE);
			if(varVentoCortante==0)
				layVentoCortante.setVisibility(View.GONE);
			if(varLancaDasMilPontas==0)
				layLancaDasMilPontas.setVisibility(View.GONE);
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
						if (terceiraClasse>0) {
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
			
			if (nomeDaHabilidade=="PericiaComEspada" && varPericiaComEspadaDeDuasMaos>=1 && varPericiaComEspada<=1){
				podeDiminuir = false;
				
			}

			if (nomeDaHabilidade=="GolpeFulminante" && varImpactoExplosivo>=1 && varGolpeFulminante<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="Provocar" && varVigor>=1 && varProvocar<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="PericiaComLanca" && varPerfurar>=1 && varPericiaComLanca>=1){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="Perfurar" && varEstocada>=1 && varPerfurar<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="Perfurar" && varLancaBumerangue>=1 && varPerfurar<=3){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="Estocada" && varBrandirLanca>=1 && varEstocada<=3){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="Montaria" && varBrandirLanca>=1 && varMontaria<=1){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="Vigor" && varMontaria>=1 && varVigor<=1){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="PericiaComEspadaDeDuasMaos" && varRapidezComDuasMaos>=1 && varPericiaComEspadaDeDuasMaos<=1){
				podeDiminuir = false;
				
			}

			if (nomeDaHabilidade=="PericiaComEspadaDeDuasMaos" && varContraAtaque>=1 && varPericiaComEspadaDeDuasMaos<=1){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="GolpeFulminante" && varImpactoDeTyr>=1 && varGolpeFulminante<=10){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="ImpactoExplosivo" && varImpactoDeTyr>=1 && varImpactoExplosivo<=3){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="PericiaComEspadaDeDuasMaos" && varImpactoDeTyr>=1 && varPericiaComEspadaDeDuasMaos<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="RapidezComDuasMaos" && varImpactoDeTyr>=1 && varRapidezComDuasMaos<=10){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="ContraAtaque" && varImpactoDeTyr>=1 && varContraAtaque<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="Montaria" && varPericiaEmMontaria>=1 && varMontaria<=1){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="ImpactoExplosivo" && varLaminaDeAura>=1 && varImpactoExplosivo<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="PericiaComEspadaDeDuasMaos" && varLaminaDeAura>=1 && varPericiaComEspadaDeDuasMaos<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="Perfurar" && varPerfurarEmEspiral>=1 && varPerfurar<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="Estocada" && varPerfurarEmEspiral>=1 && varEstocada<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="PericiaComLanca" && varPerfurarEmEspiral>=1 && varPericiaComLanca<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="Provocar" && varApararGolpe>=1 && varProvocar<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="RapidezComDuasMaos" && varApararGolpe>=1 && varRapidezComDuasMaos<=3){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="PericiaComEspadaDeDuasMaos" && varApararGolpe>=1 && varPericiaComEspadaDeDuasMaos<=10){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="Vigor" && varRelaxar>=1 && varVigor<=3){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="AumentarRecuperacaoDeHP" && varRelaxar>=1 && varAumentarRecuperacaoDeHP<=10){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="Montaria" && varDedicacao>=1 && varMontaria<=1){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="PericiaComLanca" && varDedicacao>=1 && varPericiaComLanca<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="AumentarRecuperacaoDeHP" && varDedicacao>=1 && varAumentarRecuperacaoDeHP<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="Montaria" && varGolpeTraumatico>=1 && varMontaria<=1){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="PericiaComLanca" && varGolpeTraumatico>=1 && varPericiaComLanca<=9){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="GolpeTraumatico" && varAtaqueVital>=1 && varGolpeTraumatico<=3){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="PericiaComLanca" && varAtaqueVital>=1 && varPericiaComLanca<=9){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="PericiaEmMontaria" && varAtaqueVital>=1 && varPericiaEmMontaria<=3){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="PericiaEmMontaria" && varAdestrarDragao>=1 && varPericiaEmMontaria<=1){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="AdestrarDragao" && varSoproDoDragao>=1 && varAdestrarDragao<=2){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="AdestrarDragao" && varRugidoDoDragao>=1 && varAdestrarDragao<=2){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="ContraAtaque" && varRevidarDano>=1 && varContraAtaque<=1){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="EncantarLamina" && varRevidarDano>=1 && varEncantarLamina<=2){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="PericiaEmRunas" && varEncantarLamina>=1 && varPericiaEmRunas<=2){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="OndaDeChoque" && varImpactoFlamejante>=1 && varOndaDeChoque<=2){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="VentoCortante" && varImpactoFlamejante>=1 && varVentoCortante<=3){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="RevidarDano" && varImpactoFlamejante>=1 && varRevidarDano<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="BrandirLanca" && varArpao>=1 && varBrandirLanca<=2){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="EncantarLamina" && varOndaDeChoque>=1 && varEncantarLamina<=3){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="EncantarLamina" && varVentoCortante>=1 && varEncantarLamina<=5){
				podeDiminuir = false;
				
			}
			
			if (nomeDaHabilidade=="Arpao" && varLancaDasMilPontas>=1 && varArpao<=3){
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
		
		
		if(nomeDaHabilidade=="PericiaComEspada"){
			varPericiaComEspada = habilidade;
		} else if (nomeDaHabilidade=="PericiaComEspadaDeDuasMaos"){
			varPericiaComEspadaDeDuasMaos = habilidade;
		} else if(nomeDaHabilidade=="AumentarRecuperacaoDeHP"){ 
			varAumentarRecuperacaoDeHP = habilidade;
		} else if (nomeDaHabilidade=="GolpeFulminante"){
			varGolpeFulminante = habilidade;
		} else if (nomeDaHabilidade=="Provocar"){
			varProvocar = habilidade;
		} else if (nomeDaHabilidade=="ImpactoExplosivo"){
			varImpactoExplosivo = habilidade;
		} else if (nomeDaHabilidade=="Vigor"){
			varVigor = habilidade;
		}
		
		else if (nomeDaHabilidade=="PericiaComLanca"){
			varPericiaComLanca = habilidade;
		} else if (nomeDaHabilidade=="Perfurar"){
			varPerfurar = habilidade;
		} else if (nomeDaHabilidade=="Estocada"){
			varEstocada = habilidade;
		} else if (nomeDaHabilidade=="LancaBumerangue"){
			varLancaBumerangue = habilidade;
		} else if (nomeDaHabilidade=="BrandirLanca"){
			varBrandirLanca = habilidade;
		} else if (nomeDaHabilidade=="RapidezComDuasMaos"){
			varRapidezComDuasMaos = habilidade;
		} else if (nomeDaHabilidade=="ContraAtaque"){
			varContraAtaque = habilidade;
		} else if (nomeDaHabilidade=="ImpactoDeTyr"){
			varImpactoDeTyr = habilidade;
		} else if (nomeDaHabilidade=="PericiaEmMontaria"){
			varPericiaEmMontaria = habilidade;
		} else if (nomeDaHabilidade=="Montaria"){
			varMontaria = habilidade;
		}
		
		else if (nomeDaHabilidade=="LaminaDeAura"){
			varLaminaDeAura = habilidade;
		} else if (nomeDaHabilidade=="PerfurarEmEspiral"){
			varPerfurarEmEspiral = habilidade;
		} else if (nomeDaHabilidade=="Frenesi"){
			varFrenesi = habilidade;
		} else if (nomeDaHabilidade=="ApararGolpe"){
			varApararGolpe = habilidade;
		} else if (nomeDaHabilidade=="Relaxar"){
			varRelaxar = habilidade;
		} else if (nomeDaHabilidade=="Dedicacao"){
			varDedicacao = habilidade;
		} else if (nomeDaHabilidade=="GolpeTraumatico"){
			varGolpeTraumatico = habilidade;
		} else if (nomeDaHabilidade=="AtaqueVital"){
			varAtaqueVital = habilidade;
		}
		
		else if (nomeDaHabilidade=="PericiaEmRunas"){
			varPericiaEmRunas = habilidade;
		} else if (nomeDaHabilidade=="AdestrarDragao"){
			varAdestrarDragao = habilidade;
		} else if (nomeDaHabilidade=="SoproDoDragao"){
			varSoproDoDragao = habilidade;
		} else if (nomeDaHabilidade=="RugidoDoDragao"){
			varRugidoDoDragao = habilidade;
		} else if (nomeDaHabilidade=="RevidarDano"){
			varRevidarDano = habilidade;
		} else if (nomeDaHabilidade=="EncantarLamina"){
			varEncantarLamina = habilidade;
		} else if (nomeDaHabilidade=="ImpactoFlamejante"){
			varImpactoFlamejante = habilidade;
		} else if (nomeDaHabilidade=="Arpao"){
			varArpao = habilidade;
		} else if (nomeDaHabilidade=="OndaDeChoque"){
			varOndaDeChoque = habilidade;
		} else if (nomeDaHabilidade=="VentoCortante"){
			varVentoCortante = habilidade;
		} else if (nomeDaHabilidade=="LancaDasMilPontas"){
			varLancaDasMilPontas = habilidade;
		}
		
		atualizarTela();
		
	}
	
	public void atualizarTela(){
		txtPericiaComEspadaPontos.setText(varPericiaComEspada + "/10");
		txtPericiaComEspadaDeDuasMaosPontos.setText(varPericiaComEspadaDeDuasMaos + "/10");
		txtAumentarRecuperacaoDeHPPontos.setText(varAumentarRecuperacaoDeHP + "/10");
		txtGolpeFulminantePontos.setText(varGolpeFulminante + "/10");
		txtProvocarPontos.setText(varProvocar + "/10");
		txtImpactoExplosivoPontos.setText(varImpactoExplosivo + "/10");
		txtVigorPontos.setText(varVigor + "/10");
		
		txtPericiaComLancaPontos.setText(varPericiaComLanca + "/10");
		txtPerfurarPontos.setText(varPerfurar + "/10");
		txtEstocadaPontos.setText(varEstocada + "/10");
		txtLancaBumeranguePontos.setText(varLancaBumerangue + "/5");
		txtBrandirLancaPontos.setText(varBrandirLanca + "/10");
		txtRapidezComDuasMaosPontos.setText(varRapidezComDuasMaos + "/10");
		txtContraAtaquePontos.setText(varContraAtaque + "/5");
		txtImpactoDeTyrPontos.setText(varImpactoDeTyr + "/10");
		txtPericiaEmMontariaPontos.setText(varPericiaEmMontaria + "/5");
		txtMontariaPontos.setText(varMontaria + "/1");
		
		txtLaminaDeAuraPontos.setText(varLaminaDeAura + "/5");
		txtPerfurarEmEspiralPontos.setText(varPerfurarEmEspiral + "/5");
		txtFrenesiPontos.setText(varFrenesi + "/1");
		txtApararGolpePontos.setText(varApararGolpe + "/10");
		txtRelaxarPontos.setText(varRelaxar + "/1");
		txtDedicacaoPontos.setText(varDedicacao + "/5");
		txtGolpeTraumaticoPontos.setText(varGolpeTraumatico + "/5");
		txtAtaqueVitalPontos.setText(varAtaqueVital + "/10");
		
		txtPericiaEmRunasPontos.setText(varPericiaEmRunas + "/10");
		txtAdestrarDragaoPontos.setText(varAdestrarDragao + "/5");
		txtSoproDoDragaoPontos.setText(varSoproDoDragao + "/10");
		txtRugidoDoDragaoPontos.setText(varRugidoDoDragao + "/5");
		txtRevidarDanoPontos.setText(varRevidarDano + "/10");
		txtEncantarLaminaPontos.setText(varEncantarLamina + "/5");
		txtImpactoFlamejantePontos.setText(varImpactoFlamejante + "/5");
		txtArpaoPontos.setText(varArpao + "/5");
		txtOndaDeChoquePontos.setText(varOndaDeChoque + "/5");
		txtVentoCortantePontos.setText(varVentoCortante + "/5");
		txtLancaDasMilPontasPontos.setText(varLancaDasMilPontas + "/10");
		
		txtClasse1.setText("Classe 1: " + primeiraClasse);
		txtClasse2.setText("Classe 2: " + segundaClasse);
		txtTransClasse.setText("Transclasse: " + transClasse);
		txtClasse3.setText("Classe 3: " + terceiraClasse);
		
		tudoVisivel();
	}

	public void tudoVisivel(){
		layPericiaComEspada.setVisibility(View.VISIBLE);
		layPericiaComEspadaDeDuasMaos.setVisibility(View.VISIBLE);
		layAumentarRecuperacaoDeHP.setVisibility(View.VISIBLE);
		layGolpeFulminante.setVisibility(View.VISIBLE);
		layProvocar.setVisibility(View.VISIBLE);
		layImpactoExplosivo.setVisibility(View.VISIBLE);
		layVigor.setVisibility(View.VISIBLE);

		layPericiaComLanca.setVisibility(View.VISIBLE);
		layPerfurar.setVisibility(View.VISIBLE);
		layEstocada.setVisibility(View.VISIBLE);
		layLancaBumerangue.setVisibility(View.VISIBLE);
		layBrandirLanca.setVisibility(View.VISIBLE);
		layRapidezComDuasMaos.setVisibility(View.VISIBLE);
		layContraAtaque.setVisibility(View.VISIBLE);
		layImpactoDeTyr.setVisibility(View.VISIBLE);
		layPericiaEmMontaria.setVisibility(View.VISIBLE);
		layMontaria.setVisibility(View.VISIBLE);
		
		layLaminaDeAura.setVisibility(View.VISIBLE);
		layPerfurarEmEspiral.setVisibility(View.VISIBLE);
		layFrenesi.setVisibility(View.VISIBLE);
		layApararGolpe.setVisibility(View.VISIBLE);
		layRelaxar.setVisibility(View.VISIBLE);
		layDedicacao.setVisibility(View.VISIBLE);
		layGolpeTraumatico.setVisibility(View.VISIBLE);
		layAtaqueVital.setVisibility(View.VISIBLE);
		
		layPericiaEmRunas.setVisibility(View.VISIBLE);
		layAdestrarDragao.setVisibility(View.VISIBLE);
		laySoproDoDragao.setVisibility(View.VISIBLE);
		layRugidoDoDragao.setVisibility(View.VISIBLE);
		layRevidarDano.setVisibility(View.VISIBLE);
		layEncantarLamina.setVisibility(View.VISIBLE);
		layImpactoFlamejante.setVisibility(View.VISIBLE);
		layArpao.setVisibility(View.VISIBLE);
		layOndaDeChoque.setVisibility(View.VISIBLE);
		layVentoCortante.setVisibility(View.VISIBLE);
		layLancaDasMilPontas.setVisibility(View.VISIBLE);
		
		tgbtSomenteHabilidadeAprendida.setChecked(false);
	}
	
	public void recarregarBuild(int id){
		try {
		SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
		Cursor cs = db.rawQuery("SELECT * FROM cavaleiro_runico WHERE _id = ?", new String[]{String.valueOf(id)});
		
		if(cs.moveToFirst()){
		primeiraClasse = cs.getInt(2);
		segundaClasse = cs.getInt(3);
		transClasse = cs.getInt(4);
		terceiraClasse = cs.getInt(5);

		varPericiaComEspada = cs.getInt(6);
		varPericiaComEspadaDeDuasMaos = cs.getInt(7);
		varAumentarRecuperacaoDeHP = cs.getInt(8);
		varGolpeFulminante = cs.getInt(9);
		varProvocar = cs.getInt(10);
		varImpactoExplosivo = cs.getInt(11);
		varVigor = cs.getInt(12);
		varPericiaComLanca = cs.getInt(13);
		varPerfurar = cs.getInt(14);
		varEstocada = cs.getInt(15);
		varLancaBumerangue = cs.getInt(16);
		varBrandirLanca = cs.getInt(17);
		varRapidezComDuasMaos = cs.getInt(18);
		varContraAtaque = cs.getInt(19);
		varImpactoDeTyr = cs.getInt(20);
		varPericiaEmMontaria = cs.getInt(21);
		varMontaria = cs.getInt(22);
		varLaminaDeAura = cs.getInt(23);
		varPerfurarEmEspiral = cs.getInt(24);
		varFrenesi = cs.getInt(25);
		varApararGolpe = cs.getInt(26);
		varRelaxar = cs.getInt(27);
		varDedicacao = cs.getInt(28);
		varGolpeTraumatico = cs.getInt(29);
		varAtaqueVital = cs.getInt(30);
		varPericiaEmRunas = cs.getInt(31);
		varAdestrarDragao = cs.getInt(32);
		varSoproDoDragao = cs.getInt(33);
		varRugidoDoDragao = cs.getInt(34);
		varRevidarDano = cs.getInt(35);
		varEncantarLamina = cs.getInt(36);
		varImpactoFlamejante = cs.getInt(37);
		varArpao = cs.getInt(38);
		varOndaDeChoque = cs.getInt(39);
		varVentoCortante = cs.getInt(40);
		varLancaDasMilPontas = cs.getInt(41);
		
		skillPrimeira = cs.getInt(42);
		skillSegunda = cs.getInt(43);
		skillTrans = cs.getInt(44);
		skillTerceira = cs.getInt(45);
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
			sqlClasse.append("CREATE TABLE IF NOT EXISTS cavaleiro_runico (");
			sqlClasse.append("_id INTEGER PRIMARY KEY, ");
			sqlClasse.append("nome VARCHAR(30), ");
			sqlClasse.append("primeira_classe INT(2), ");
			sqlClasse.append("segunda_classe INT(2), ");
			sqlClasse.append("trans_classe INT(2), ");
			sqlClasse.append("terceira_classe INT(2), ");
			sqlClasse.append("skill_periciacomespada INT(2), ");
			sqlClasse.append("skill_periciacomespadadeduasmaos INT(2), ");
			sqlClasse.append("skill_aumentarrecuperacaodehp INT(2), ");
			sqlClasse.append("skill_golpefulminante INT(2), ");
			sqlClasse.append("skill_provocar INT(2), ");
			sqlClasse.append("skill_impactoexplosivo INT(2), ");
			sqlClasse.append("skill_vigor INT(2), ");
			sqlClasse.append("skill_periciacomlanca INT(2), ");
			sqlClasse.append("skill_perfurar INT(2), ");
			sqlClasse.append("skill_estocada INT(2), ");
			sqlClasse.append("skill_lancabumerangue INT(2), ");
			sqlClasse.append("skill_brandirlanca INT(2), ");
			sqlClasse.append("skill_rapidezcomduasmaos INT(2), ");
			sqlClasse.append("skill_contraataque INT(2), ");
			sqlClasse.append("skill_impactodetyr INT(2), ");
			sqlClasse.append("skill_periciaemmontaria INT(2), ");
			sqlClasse.append("skill_montaria INT(2), ");
			sqlClasse.append("skill_laminadeaura INT(2), ");
			sqlClasse.append("skill_perfuraremespiral INT(2), ");
			sqlClasse.append("skill_frenesi INT(2), ");
			sqlClasse.append("skill_aparargolpe INT(2), ");
			sqlClasse.append("skill_relaxar INT(2), ");
			sqlClasse.append("skill_dedicacao INT(2), ");
			sqlClasse.append("skill_golpetraumatico INT(2), ");
			sqlClasse.append("skill_ataquevital INT(2), ");
			sqlClasse.append("skill_periciaemrunas INT(2), ");
			sqlClasse.append("skill_adestrardragao INT(2), ");
			sqlClasse.append("skill_soprododragao INT(2), ");
			sqlClasse.append("skill_rugidododragao INT(2), ");
			sqlClasse.append("skill_revidardano INT(2), ");
			sqlClasse.append("skill_encantarlamina INT(2), ");
			sqlClasse.append("skill_impactoflamejante INT(2), ");
			sqlClasse.append("skill_arpao INT(2), ");
			sqlClasse.append("skill_ondadechoque INT(2), ");
			sqlClasse.append("skill_ventocortante INT(2), ");
			sqlClasse.append("skill_lancademilpontas INT(2), ");
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
			ins.put("skill_periciacomespada", varPericiaComEspada);
			ins.put("skill_periciacomespadadeduasmaos", varPericiaComEspadaDeDuasMaos);
			ins.put("skill_aumentarrecuperacaodehp", varAumentarRecuperacaoDeHP);
			ins.put("skill_golpefulminante", varGolpeFulminante);
			ins.put("skill_provocar", varProvocar);
			ins.put("skill_impactoexplosivo", varImpactoExplosivo);
			ins.put("skill_vigor", varVigor);
			ins.put("skill_periciacomlanca", varPericiaComLanca);
			ins.put("skill_perfurar", varPerfurar);
			ins.put("skill_estocada", varEstocada);
			ins.put("skill_lancabumerangue", varLancaBumerangue);
			ins.put("skill_brandirlanca", varBrandirLanca);
			ins.put("skill_rapidezcomduasmaos", varRapidezComDuasMaos);
			ins.put("skill_contraataque", varContraAtaque);
			ins.put("skill_impactodetyr", varImpactoDeTyr);
			ins.put("skill_periciaemmontaria", varPericiaEmMontaria);
			ins.put("skill_montaria", varMontaria);
			ins.put("skill_laminadeaura", varLaminaDeAura);
			ins.put("skill_perfuraremespiral", varPerfurarEmEspiral);
			ins.put("skill_frenesi", varFrenesi);
			ins.put("skill_aparargolpe", varApararGolpe);
			ins.put("skill_relaxar", varRelaxar);
			ins.put("skill_dedicacao", varDedicacao);
			ins.put("skill_golpetraumatico", varGolpeTraumatico);
			ins.put("skill_ataquevital", varAtaqueVital);
			ins.put("skill_periciaemrunas", varPericiaEmRunas);
			ins.put("skill_adestrardragao", varAdestrarDragao);
			ins.put("skill_soprododragao", varSoproDoDragao);
			ins.put("skill_rugidododragao", varRugidoDoDragao);
			ins.put("skill_revidardano", varRevidarDano);
			ins.put("skill_encantarlamina", varEncantarLamina);
			ins.put("skill_impactoflamejante", varImpactoFlamejante);
			ins.put("skill_arpao", varArpao);
			ins.put("skill_ondadechoque", varOndaDeChoque);
			ins.put("skill_ventocortante", varVentoCortante);
			ins.put("skill_lancademilpontas", varLancaDasMilPontas);
			ins.put("skill_primeira", skillPrimeira);
			ins.put("skill_segunda", skillSegunda);
			ins.put("skill_trans", skillTrans);
			ins.put("skill_terceira", skillTerceira);
			
			if(!novo){
				try {
					db.update("cavaleiro_runico", ins, idParaAlterar, null);
					Toast.makeText(getBaseContext(), "Alterações salvas!",
							Toast.LENGTH_SHORT).show();
				} catch (Exception e) {
					Toast.makeText(getBaseContext(), "Erro ao salvar!",
							Toast.LENGTH_SHORT).show();
				}
			} else {
			if (db.insert("cavaleiro_runico", "_id", ins) > 0) {
				Toast.makeText(getBaseContext(), "Salvando...",
						Toast.LENGTH_SHORT).show();
				
				Cursor cs = db.rawQuery("SELECT * from cavaleiro_runico", null);
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
				ins2.put("classe", "cavaleiro runico");
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
		getMenuInflater().inflate(R.menu.simulador_cavaleiro_runico, menu);
		return true;
	}

}
