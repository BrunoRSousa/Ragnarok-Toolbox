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

public class SimuladorOboro extends Activity {

		//Botões de interrogação
		Button btAuraNinjaInterrogacao,
		btPericiaNinjaInterrogacao,
		btImagemFalsaInterrogacao,
		btTrocaDePeleInterrogacao,
		btPetalasFlamejantesInterrogacao,
		btEscudoDeChamasInterrogacao,
		btDragaoExplosivoInterrogacao,
		btLancaCongelanteInterrogacao,
		btEvasaoAquaticaInterrogacao,
		btGrandeFlocoDeNeveInterrogacao,
		btLaminaDeVentoInterrogacao,
		btDescargaEletricaInterrogacao,
		btBrisaCortanteInterrogacao,
		btPraticaDeArremessoDeShurikenInterrogacao,
		btArremessarShurikenInterrogacao,
		btArremessarShurikenHuumaInterrogacao,
		btArremessarKunaiInterrogacao,
		btChuvaDeMoedasInterrogacao,
		btVirarTatamiInterrogacao,
		btSaltoDasSombrasInterrogacao,
		btCorteDaNevoaInterrogacao,
		btCorteDasSombrasInterrogacao,
		btAtaqueMortalInterrogacao,
		btVoragemEspiritualInterrogacao,
		btAmuletoEspiritualAguaInterrogacao,
		btAmuletoEspiritualFogoInterrogacao,
		btAmuletoEspiritualTerraInterrogacao,
		btAmuletoEspiritualVentoInterrogacao,
		btArremessarAmuletoEspiritualInterrogacao,
		btCorteEspiritualInterrogacao,
		btGenjutsuAssaltoDasSombrasInterrogacao,
		btGenjutsuChamadoDaMorteInterrogacao,
		btGenjutsuCloneDasSombrasInterrogacao,
		btGenjutsuSubstituicaoInterrogacao,
		btKunaiExplosivaInterrogacao,
		btTurbilhaoDeKunaisInterrogacao,
		btTurbilhaoDePetalasInterrogacao,
		btEstrepesInterrogacao,
		btPurificacaoDaAlmaInterrogacao,
		btInspiracaoInterrogacao,
		btRefugioDasSombrasInterrogacao,
		btExplosaoDeMoedasInterrogacao,
		btImpactoCruzadoInterrogacao,
		btPericiaComMaoDireitaInterrogacao,
		btPericiaComMaoEsquerdaInterrogacao,
		btDistorcaoCrescenteInterrogacao,
		btIlusaoDoLuarInterrogacao,
		btLuarSinistroInterrogacao;

		//Botões de diminuir habilidades
		Button btAuraNinjaDiminuir,
		btPericiaNinjaDiminuir,
		btImagemFalsaDiminuir,
		btTrocaDePeleDiminuir,
		btPetalasFlamejantesDiminuir,
		btEscudoDeChamasDiminuir,
		btDragaoExplosivoDiminuir,
		btLancaCongelanteDiminuir,
		btEvasaoAquaticaDiminuir,
		btGrandeFlocoDeNeveDiminuir,
		btLaminaDeVentoDiminuir,
		btDescargaEletricaDiminuir,
		btBrisaCortanteDiminuir,
		btPraticaDeArremessoDeShurikenDiminuir,
		btArremessarShurikenDiminuir,
		btArremessarShurikenHuumaDiminuir,
		btArremessarKunaiDiminuir,
		btChuvaDeMoedasDiminuir,
		btVirarTatamiDiminuir,
		btSaltoDasSombrasDiminuir,
		btCorteDaNevoaDiminuir,
		btCorteDasSombrasDiminuir,
		btAtaqueMortalDiminuir,
		btVoragemEspiritualDiminuir,
		btAmuletoEspiritualAguaDiminuir,
		btAmuletoEspiritualFogoDiminuir,
		btAmuletoEspiritualTerraDiminuir,
		btAmuletoEspiritualVentoDiminuir,
		btArremessarAmuletoEspiritualDiminuir,
		btCorteEspiritualDiminuir,
		btGenjutsuAssaltoDasSombrasDiminuir,
		btGenjutsuChamadoDaMorteDiminuir,
		btGenjutsuCloneDasSombrasDiminuir,
		btGenjutsuSubstituicaoDiminuir,
		btKunaiExplosivaDiminuir,
		btTurbilhaoDeKunaisDiminuir,
		btTurbilhaoDePetalasDiminuir,
		btEstrepesDiminuir,
		btPurificacaoDaAlmaDiminuir,
		btInspiracaoDiminuir,
		btRefugioDasSombrasDiminuir,
		btExplosaoDeMoedasDiminuir,
		btImpactoCruzadoDiminuir,
		btPericiaComMaoDireitaDiminuir,
		btPericiaComMaoEsquerdaDiminuir,
		btDistorcaoCrescenteDiminuir,
		btIlusaoDoLuarDiminuir,
		btLuarSinistroDiminuir;

		//Botões de aumentar habilidades
		Button btAuraNinjaAumentar,
		btPericiaNinjaAumentar,
		btImagemFalsaAumentar,
		btTrocaDePeleAumentar,
		btPetalasFlamejantesAumentar,
		btEscudoDeChamasAumentar,
		btDragaoExplosivoAumentar,
		btLancaCongelanteAumentar,
		btEvasaoAquaticaAumentar,
		btGrandeFlocoDeNeveAumentar,
		btLaminaDeVentoAumentar,
		btDescargaEletricaAumentar,
		btBrisaCortanteAumentar,
		btPraticaDeArremessoDeShurikenAumentar,
		btArremessarShurikenAumentar,
		btArremessarShurikenHuumaAumentar,
		btArremessarKunaiAumentar,
		btChuvaDeMoedasAumentar,
		btVirarTatamiAumentar,
		btSaltoDasSombrasAumentar,
		btCorteDaNevoaAumentar,
		btCorteDasSombrasAumentar,
		btAtaqueMortalAumentar,
		btVoragemEspiritualAumentar,
		btAmuletoEspiritualAguaAumentar,
		btAmuletoEspiritualFogoAumentar,
		btAmuletoEspiritualTerraAumentar,
		btAmuletoEspiritualVentoAumentar,
		btArremessarAmuletoEspiritualAumentar,
		btCorteEspiritualAumentar,
		btGenjutsuAssaltoDasSombrasAumentar,
		btGenjutsuChamadoDaMorteAumentar,
		btGenjutsuCloneDasSombrasAumentar,
		btGenjutsuSubstituicaoAumentar,
		btKunaiExplosivaAumentar,
		btTurbilhaoDeKunaisAumentar,
		btTurbilhaoDePetalasAumentar,
		btEstrepesAumentar,
		btPurificacaoDaAlmaAumentar,
		btInspiracaoAumentar,
		btRefugioDasSombrasAumentar,
		btExplosaoDeMoedasAumentar,
		btImpactoCruzadoAumentar,
		btPericiaComMaoDireitaAumentar,
		btPericiaComMaoEsquerdaAumentar,
		btDistorcaoCrescenteAumentar,
		btIlusaoDoLuarAumentar,
		btLuarSinistroAumentar;

		//Resto dos botões
		Button btResetar, btSalvar, btSalvarIMG;
		ToggleButton tgbtSomenteHabilidadeAprendida;


		//Txt pontos da tela
		TextView txtAuraNinjaPontos,
		txtPericiaNinjaPontos,
		txtImagemFalsaPontos,
		txtTrocaDePelePontos,
		txtPetalasFlamejantesPontos,
		txtEscudoDeChamasPontos,
		txtDragaoExplosivoPontos,
		txtLancaCongelantePontos,
		txtEvasaoAquaticaPontos,
		txtGrandeFlocoDeNevePontos,
		txtLaminaDeVentoPontos,
		txtDescargaEletricaPontos,
		txtBrisaCortantePontos,
		txtPraticaDeArremessoDeShurikenPontos,
		txtArremessarShurikenPontos,
		txtArremessarShurikenHuumaPontos,
		txtArremessarKunaiPontos,
		txtChuvaDeMoedasPontos,
		txtVirarTatamiPontos,
		txtSaltoDasSombrasPontos,
		txtCorteDaNevoaPontos,
		txtCorteDasSombrasPontos,
		txtAtaqueMortalPontos,
		txtVoragemEspiritualPontos,
		txtAmuletoEspiritualAguaPontos,
		txtAmuletoEspiritualFogoPontos,
		txtAmuletoEspiritualTerraPontos,
		txtAmuletoEspiritualVentoPontos,
		txtArremessarAmuletoEspiritualPontos,
		txtCorteEspiritualPontos,
		txtGenjutsuAssaltoDasSombrasPontos,
		txtGenjutsuChamadoDaMortePontos,
		txtGenjutsuCloneDasSombrasPontos,
		txtGenjutsuSubstituicaoPontos,
		txtKunaiExplosivaPontos,
		txtTurbilhaoDeKunaisPontos,
		txtTurbilhaoDePetalasPontos,
		txtEstrepesPontos,
		txtPurificacaoDaAlmaPontos,
		txtInspiracaoPontos,
		txtRefugioDasSombrasPontos,
		txtExplosaoDeMoedasPontos,
		txtImpactoCruzadoPontos,
		txtPericiaComMaoDireitaPontos,
		txtPericiaComMaoEsquerdaPontos,
		txtDistorcaoCrescentePontos,
		txtIlusaoDoLuarPontos,
		txtLuarSinistroPontos;

		//Txt pontos restantes
		TextView txtClasse1, txtClasse2;

		//Layouts
		LinearLayout layAuraNinja,
		layPericiaNinja,
		layImagemFalsa,
		layTrocaDePele,
		layPetalasFlamejantes,
		layEscudoDeChamas,
		layDragaoExplosivo,
		layLancaCongelante,
		layEvasaoAquatica,
		layGrandeFlocoDeNeve,
		layLaminaDeVento,
		layDescargaEletrica,
		layBrisaCortante,
		layPraticaDeArremessoDeShuriken,
		layArremessarShuriken,
		layArremessarShurikenHuuma,
		layArremessarKunai,
		layChuvaDeMoedas,
		layVirarTatami,
		laySaltoDasSombras,
		layCorteDaNevoa,
		layCorteDasSombras,
		layAtaqueMortal,
		layVoragemEspiritual,
		layAmuletoEspiritualAgua,
		layAmuletoEspiritualFogo,
		layAmuletoEspiritualTerra,
		layAmuletoEspiritualVento,
		layArremessarAmuletoEspiritual,
		layCorteEspiritual,
		layGenjutsuAssaltoDasSombras,
		layGenjutsuChamadoDaMorte,
		layGenjutsuCloneDasSombras,
		layGenjutsuSubstituicao,
		layKunaiExplosiva,
		layTurbilhaoDeKunais,
		layTurbilhaoDePetalas,
		layEstrepes,
		layPurificacaoDaAlma,
		layInspiracao,
		layRefugioDasSombras,
		layExplosaoDeMoedas,
		layImpactoCruzado,
		layPericiaComMaoDireita,
		layPericiaComMaoEsquerda,
		layDistorcaoCrescente,
		layIlusaoDoLuar,
		layLuarSinistro;

		//Variaveis de Skill
		int varAuraNinja,
		varPericiaNinja,
		varImagemFalsa,
		varTrocaDePele,
		varPetalasFlamejantes,
		varEscudoDeChamas,
		varDragaoExplosivo,
		varLancaCongelante,
		varEvasaoAquatica,
		varGrandeFlocoDeNeve,
		varLaminaDeVento,
		varDescargaEletrica,
		varBrisaCortante,
		varPraticaDeArremessoDeShuriken,
		varArremessarShuriken,
		varArremessarShurikenHuuma,
		varArremessarKunai,
		varChuvaDeMoedas,
		varVirarTatami,
		varSaltoDasSombras,
		varCorteDaNevoa,
		varCorteDasSombras,
		varAtaqueMortal,
		varVoragemEspiritual,
		varAmuletoEspiritualAgua,
		varAmuletoEspiritualFogo,
		varAmuletoEspiritualTerra,
		varAmuletoEspiritualVento,
		varArremessarAmuletoEspiritual,
		varCorteEspiritual,
		varGenjutsuAssaltoDasSombras,
		varGenjutsuChamadoDaMorte,
		varGenjutsuCloneDasSombras,
		varGenjutsuSubstituicao,
		varKunaiExplosiva,
		varTurbilhaoDeKunais,
		varTurbilhaoDePetalas,
		varEstrepes,
		varPurificacaoDaAlma,
		varInspiracao,
		varRefugioDasSombras,
		varExplosaoDeMoedas,
		varImpactoCruzado,
		varPericiaComMaoDireita,
		varPericiaComMaoEsquerda,
		varDistorcaoCrescente,
		varIlusaoDoLuar,
		varLuarSinistro;

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
			setContentView(R.layout.activity_simulador_oboro);

			Intent it = getIntent();

			final int id = it.getIntExtra("id", 0);
			idParaAlterar = "_id =" +id;

			//inicialização de variáveis
			varAuraNinja = 0;
			varPericiaNinja = 0;
			varImagemFalsa = 0;
			varTrocaDePele = 0;
			varPetalasFlamejantes = 0;
			varEscudoDeChamas = 0;
			varDragaoExplosivo = 0;
			varLancaCongelante = 0;
			varEvasaoAquatica = 0;
			varGrandeFlocoDeNeve = 0;
			varLaminaDeVento = 0;
			varDescargaEletrica = 0;
			varBrisaCortante = 0;
			varPraticaDeArremessoDeShuriken = 0;
			varArremessarShuriken = 0;
			varArremessarShurikenHuuma = 0;
			varArremessarKunai = 0;
			varChuvaDeMoedas = 0;
			varVirarTatami = 0;
			varSaltoDasSombras = 0;
			varCorteDaNevoa = 0;
			varCorteDasSombras = 0;
			varAtaqueMortal = 0;
			varVoragemEspiritual = 0;
			varAmuletoEspiritualAgua = 0;
			varAmuletoEspiritualFogo = 0;
			varAmuletoEspiritualTerra = 0;
			varAmuletoEspiritualVento = 0;
			varArremessarAmuletoEspiritual = 0;
			varCorteEspiritual = 0;
			varGenjutsuAssaltoDasSombras = 0;
			varGenjutsuChamadoDaMorte = 0;
			varGenjutsuCloneDasSombras = 0;
			varGenjutsuSubstituicao = 0;
			varKunaiExplosiva = 0;
			varTurbilhaoDeKunais = 0;
			varTurbilhaoDePetalas = 0;
			varEstrepes = 0;
			varPurificacaoDaAlma = 0;
			varInspiracao = 0;
			varRefugioDasSombras = 0;
			varExplosaoDeMoedas = 0;
			varImpactoCruzado = 0;
			varPericiaComMaoDireita = 0;
			varPericiaComMaoEsquerda = 0;
			varDistorcaoCrescente = 0;
			varIlusaoDoLuar = 0;
			varLuarSinistro = 0;



			primeiraClasse = 69;
			segundaClasse = 49;

			skillPrimeira = 0;
			skillSegunda = 0;

			count = 0;


			//Botões de interrogações
			btAuraNinjaInterrogacao = (Button) findViewById(R.id.btAuraNinjaInterrogacao);
			btPericiaNinjaInterrogacao = (Button) findViewById(R.id.btPericiaNinjaInterrogacao);
			btImagemFalsaInterrogacao = (Button) findViewById(R.id.btImagemFalsaInterrogacao);
			btTrocaDePeleInterrogacao = (Button) findViewById(R.id.btTrocaDePeleInterrogacao);
			btPetalasFlamejantesInterrogacao = (Button) findViewById(R.id.btPetalasFlamejantesInterrogacao);
			btEscudoDeChamasInterrogacao = (Button) findViewById(R.id.btEscudoDeChamasInterrogacao);
			btDragaoExplosivoInterrogacao = (Button) findViewById(R.id.btDragaoExplosivoInterrogacao);
			btLancaCongelanteInterrogacao = (Button) findViewById(R.id.btLancaCongelanteInterrogacao);
			btEvasaoAquaticaInterrogacao = (Button) findViewById(R.id.btEvasaoAquaticaInterrogacao);
			btGrandeFlocoDeNeveInterrogacao = (Button) findViewById(R.id.btGrandeFlocoDeNeveInterrogacao);
			btLaminaDeVentoInterrogacao = (Button) findViewById(R.id.btLaminaDeVentoInterrogacao);
			btDescargaEletricaInterrogacao = (Button) findViewById(R.id.btDescargaEletricaInterrogacao);
			btBrisaCortanteInterrogacao = (Button) findViewById(R.id.btBrisaCortanteInterrogacao);
			btPraticaDeArremessoDeShurikenInterrogacao = (Button) findViewById(R.id.btPraticaDeArremessoDeShurikenInterrogacao);
			btArremessarShurikenInterrogacao = (Button) findViewById(R.id.btArremessarShurikenInterrogacao);
			btArremessarShurikenHuumaInterrogacao = (Button) findViewById(R.id.btArremessarShurikenHuumaInterrogacao);
			btArremessarKunaiInterrogacao = (Button) findViewById(R.id.btArremessarKunaiInterrogacao);
			btChuvaDeMoedasInterrogacao = (Button) findViewById(R.id.btChuvaDeMoedasInterrogacao);
			btVirarTatamiInterrogacao = (Button) findViewById(R.id.btVirarTatamiInterrogacao);
			btSaltoDasSombrasInterrogacao = (Button) findViewById(R.id.btSaltoDasSombrasInterrogacao);
			btCorteDaNevoaInterrogacao = (Button) findViewById(R.id.btCorteDaNevoaInterrogacao);
			btCorteDasSombrasInterrogacao = (Button) findViewById(R.id.btCorteDasSombrasInterrogacao);
			btAtaqueMortalInterrogacao = (Button) findViewById(R.id.btAtaqueMortalInterrogacao);
			btVoragemEspiritualInterrogacao = (Button) findViewById(R.id.btVoragemEspiritualInterrogacao);
			btAmuletoEspiritualAguaInterrogacao = (Button) findViewById(R.id.btAmuletoEspiritualAguaInterrogacao);
			btAmuletoEspiritualFogoInterrogacao = (Button) findViewById(R.id.btAmuletoEspiritualFogoInterrogacao);
			btAmuletoEspiritualTerraInterrogacao = (Button) findViewById(R.id.btAmuletoEspiritualTerraInterrogacao);
			btAmuletoEspiritualVentoInterrogacao = (Button) findViewById(R.id.btAmuletoEspiritualVentoInterrogacao);
			btArremessarAmuletoEspiritualInterrogacao = (Button) findViewById(R.id.btArremessarAmuletoEspiritualInterrogacao);
			btCorteEspiritualInterrogacao = (Button) findViewById(R.id.btCorteEspiritualInterrogacao);
			btGenjutsuAssaltoDasSombrasInterrogacao = (Button) findViewById(R.id.btGenjutsuAssaltoDasSombrasInterrogacao);
			btGenjutsuChamadoDaMorteInterrogacao = (Button) findViewById(R.id.btGenjutsuChamadoDaMorteInterrogacao);
			btGenjutsuCloneDasSombrasInterrogacao = (Button) findViewById(R.id.btGenjutsuCloneDasSombrasInterrogacao);
			btGenjutsuSubstituicaoInterrogacao = (Button) findViewById(R.id.btGenjutsuSubstituicaoInterrogacao);
			btKunaiExplosivaInterrogacao = (Button) findViewById(R.id.btKunaiExplosivaInterrogacao);
			btTurbilhaoDeKunaisInterrogacao = (Button) findViewById(R.id.btTurbilhaoDeKunaisInterrogacao);
			btTurbilhaoDePetalasInterrogacao = (Button) findViewById(R.id.btTurbilhaoDePetalasInterrogacao);
			btEstrepesInterrogacao = (Button) findViewById(R.id.btEstrepesInterrogacao);
			btPurificacaoDaAlmaInterrogacao = (Button) findViewById(R.id.btPurificacaoDaAlmaInterrogacao);
			btInspiracaoInterrogacao = (Button) findViewById(R.id.btInspiracaoInterrogacao);
			btRefugioDasSombrasInterrogacao = (Button) findViewById(R.id.btRefugioDasSombrasInterrogacao);
			btExplosaoDeMoedasInterrogacao = (Button) findViewById(R.id.btExplosaoDeMoedasInterrogacao);
			btImpactoCruzadoInterrogacao = (Button) findViewById(R.id.btImpactoCruzadoInterrogacao);
			btPericiaComMaoDireitaInterrogacao = (Button) findViewById(R.id.btPericiaComMaoDireitaInterrogacao);
			btPericiaComMaoEsquerdaInterrogacao = (Button) findViewById(R.id.btPericiaComMaoEsquerdaInterrogacao);
			btDistorcaoCrescenteInterrogacao = (Button) findViewById(R.id.btDistorcaoCrescenteInterrogacao);
			btIlusaoDoLuarInterrogacao = (Button) findViewById(R.id.btIlusaoDoLuarInterrogacao);
			btLuarSinistroInterrogacao = (Button) findViewById(R.id.btLuarSinistroInterrogacao);

			//Botões de diminuir habilidades
			btAuraNinjaDiminuir = (Button) findViewById(R.id.btAuraNinjaDiminuir);
			btPericiaNinjaDiminuir = (Button) findViewById(R.id.btPericiaNinjaDiminuir);
			btImagemFalsaDiminuir = (Button) findViewById(R.id.btImagemFalsaDiminuir);
			btTrocaDePeleDiminuir = (Button) findViewById(R.id.btTrocaDePeleDiminuir);
			btPetalasFlamejantesDiminuir = (Button) findViewById(R.id.btPetalasFlamejantesDiminuir);
			btEscudoDeChamasDiminuir = (Button) findViewById(R.id.btEscudoDeChamasDiminuir);
			btDragaoExplosivoDiminuir = (Button) findViewById(R.id.btDragaoExplosivoDiminuir);
			btLancaCongelanteDiminuir = (Button) findViewById(R.id.btLancaCongelanteDiminuir);
			btEvasaoAquaticaDiminuir = (Button) findViewById(R.id.btEvasaoAquaticaDiminuir);
			btGrandeFlocoDeNeveDiminuir = (Button) findViewById(R.id.btGrandeFlocoDeNeveDiminuir);
			btLaminaDeVentoDiminuir = (Button) findViewById(R.id.btLaminaDeVentoDiminuir);
			btDescargaEletricaDiminuir = (Button) findViewById(R.id.btDescargaEletricaDiminuir);
			btBrisaCortanteDiminuir = (Button) findViewById(R.id.btBrisaCortanteDiminuir);
			btPraticaDeArremessoDeShurikenDiminuir = (Button) findViewById(R.id.btPraticaDeArremessoDeShurikenDiminuir);
			btArremessarShurikenDiminuir = (Button) findViewById(R.id.btArremessarShurikenDiminuir);
			btArremessarShurikenHuumaDiminuir = (Button) findViewById(R.id.btArremessarShurikenHuumaDiminuir);
			btArremessarKunaiDiminuir = (Button) findViewById(R.id.btArremessarKunaiDiminuir);
			btChuvaDeMoedasDiminuir = (Button) findViewById(R.id.btChuvaDeMoedasDiminuir);
			btVirarTatamiDiminuir = (Button) findViewById(R.id.btVirarTatamiDiminuir);
			btSaltoDasSombrasDiminuir = (Button) findViewById(R.id.btSaltoDasSombrasDiminuir);
			btCorteDaNevoaDiminuir = (Button) findViewById(R.id.btCorteDaNevoaDiminuir);
			btCorteDasSombrasDiminuir = (Button) findViewById(R.id.btCorteDasSombrasDiminuir);
			btAtaqueMortalDiminuir = (Button) findViewById(R.id.btAtaqueMortalDiminuir);
			btVoragemEspiritualDiminuir = (Button) findViewById(R.id.btVoragemEspiritualDiminuir);
			btAmuletoEspiritualAguaDiminuir = (Button) findViewById(R.id.btAmuletoEspiritualAguaDiminuir);
			btAmuletoEspiritualFogoDiminuir = (Button) findViewById(R.id.btAmuletoEspiritualFogoDiminuir);
			btAmuletoEspiritualTerraDiminuir = (Button) findViewById(R.id.btAmuletoEspiritualTerraDiminuir);
			btAmuletoEspiritualVentoDiminuir = (Button) findViewById(R.id.btAmuletoEspiritualVentoDiminuir);
			btArremessarAmuletoEspiritualDiminuir = (Button) findViewById(R.id.btArremessarAmuletoEspiritualDiminuir);
			btCorteEspiritualDiminuir = (Button) findViewById(R.id.btCorteEspiritualDiminuir);
			btGenjutsuAssaltoDasSombrasDiminuir = (Button) findViewById(R.id.btGenjutsuAssaltoDasSombrasDiminuir);
			btGenjutsuChamadoDaMorteDiminuir = (Button) findViewById(R.id.btGenjutsuChamadoDaMorteDiminuir);
			btGenjutsuCloneDasSombrasDiminuir = (Button) findViewById(R.id.btGenjutsuCloneDasSombrasDiminuir);
			btGenjutsuSubstituicaoDiminuir = (Button) findViewById(R.id.btGenjutsuSubstituicaoDiminuir);
			btKunaiExplosivaDiminuir = (Button) findViewById(R.id.btKunaiExplosivaDiminuir);
			btTurbilhaoDeKunaisDiminuir = (Button) findViewById(R.id.btTurbilhaoDeKunaisDiminuir);
			btTurbilhaoDePetalasDiminuir = (Button) findViewById(R.id.btTurbilhaoDePetalasDiminuir);
			btEstrepesDiminuir = (Button) findViewById(R.id.btEstrepesDiminuir);
			btPurificacaoDaAlmaDiminuir = (Button) findViewById(R.id.btPurificacaoDaAlmaDiminuir);
			btInspiracaoDiminuir = (Button) findViewById(R.id.btInspiracaoDiminuir);
			btRefugioDasSombrasDiminuir = (Button) findViewById(R.id.btRefugioDasSombrasDiminuir);
			btExplosaoDeMoedasDiminuir = (Button) findViewById(R.id.btExplosaoDeMoedasDiminuir);
			btImpactoCruzadoDiminuir = (Button) findViewById(R.id.btImpactoCruzadoDiminuir);
			btPericiaComMaoDireitaDiminuir = (Button) findViewById(R.id.btPericiaComMaoDireitaDiminuir);
			btPericiaComMaoEsquerdaDiminuir = (Button) findViewById(R.id.btPericiaComMaoEsquerdaDiminuir);
			btDistorcaoCrescenteDiminuir = (Button) findViewById(R.id.btDistorcaoCrescenteDiminuir);
			btIlusaoDoLuarDiminuir = (Button) findViewById(R.id.btIlusaoDoLuarDiminuir);
			btLuarSinistroDiminuir = (Button) findViewById(R.id.btLuarSinistroDiminuir);

			//Botões de aumentar habilidades
			btAuraNinjaAumentar = (Button) findViewById(R.id.btAuraNinjaAumentar);
			btPericiaNinjaAumentar = (Button) findViewById(R.id.btPericiaNinjaAumentar);
			btImagemFalsaAumentar = (Button) findViewById(R.id.btImagemFalsaAumentar);
			btTrocaDePeleAumentar = (Button) findViewById(R.id.btTrocaDePeleAumentar);
			btPetalasFlamejantesAumentar = (Button) findViewById(R.id.btPetalasFlamejantesAumentar);
			btEscudoDeChamasAumentar = (Button) findViewById(R.id.btEscudoDeChamasAumentar);
			btDragaoExplosivoAumentar = (Button) findViewById(R.id.btDragaoExplosivoAumentar);
			btLancaCongelanteAumentar = (Button) findViewById(R.id.btLancaCongelanteAumentar);
			btEvasaoAquaticaAumentar = (Button) findViewById(R.id.btEvasaoAquaticaAumentar);
			btGrandeFlocoDeNeveAumentar = (Button) findViewById(R.id.btGrandeFlocoDeNeveAumentar);
			btLaminaDeVentoAumentar = (Button) findViewById(R.id.btLaminaDeVentoAumentar);
			btDescargaEletricaAumentar = (Button) findViewById(R.id.btDescargaEletricaAumentar);
			btBrisaCortanteAumentar = (Button) findViewById(R.id.btBrisaCortanteAumentar);
			btPraticaDeArremessoDeShurikenAumentar = (Button) findViewById(R.id.btPraticaDeArremessoDeShurikenAumentar);
			btArremessarShurikenAumentar = (Button) findViewById(R.id.btArremessarShurikenAumentar);
			btArremessarShurikenHuumaAumentar = (Button) findViewById(R.id.btArremessarShurikenHuumaAumentar);
			btArremessarKunaiAumentar = (Button) findViewById(R.id.btArremessarKunaiAumentar);
			btChuvaDeMoedasAumentar = (Button) findViewById(R.id.btChuvaDeMoedasAumentar);
			btVirarTatamiAumentar = (Button) findViewById(R.id.btVirarTatamiAumentar);
			btSaltoDasSombrasAumentar = (Button) findViewById(R.id.btSaltoDasSombrasAumentar);
			btCorteDaNevoaAumentar = (Button) findViewById(R.id.btCorteDaNevoaAumentar);
			btCorteDasSombrasAumentar = (Button) findViewById(R.id.btCorteDasSombrasAumentar);
			btAtaqueMortalAumentar = (Button) findViewById(R.id.btAtaqueMortalAumentar);
			btVoragemEspiritualAumentar = (Button) findViewById(R.id.btVoragemEspiritualAumentar);
			btAmuletoEspiritualAguaAumentar = (Button) findViewById(R.id.btAmuletoEspiritualAguaAumentar);
			btAmuletoEspiritualFogoAumentar = (Button) findViewById(R.id.btAmuletoEspiritualFogoAumentar);
			btAmuletoEspiritualTerraAumentar = (Button) findViewById(R.id.btAmuletoEspiritualTerraAumentar);
			btAmuletoEspiritualVentoAumentar = (Button) findViewById(R.id.btAmuletoEspiritualVentoAumentar);
			btArremessarAmuletoEspiritualAumentar = (Button) findViewById(R.id.btArremessarAmuletoEspiritualAumentar);
			btCorteEspiritualAumentar = (Button) findViewById(R.id.btCorteEspiritualAumentar);
			btGenjutsuAssaltoDasSombrasAumentar = (Button) findViewById(R.id.btGenjutsuAssaltoDasSombrasAumentar);
			btGenjutsuChamadoDaMorteAumentar = (Button) findViewById(R.id.btGenjutsuChamadoDaMorteAumentar);
			btGenjutsuCloneDasSombrasAumentar = (Button) findViewById(R.id.btGenjutsuCloneDasSombrasAumentar);
			btGenjutsuSubstituicaoAumentar = (Button) findViewById(R.id.btGenjutsuSubstituicaoAumentar);
			btKunaiExplosivaAumentar = (Button) findViewById(R.id.btKunaiExplosivaAumentar);
			btTurbilhaoDeKunaisAumentar = (Button) findViewById(R.id.btTurbilhaoDeKunaisAumentar);
			btTurbilhaoDePetalasAumentar = (Button) findViewById(R.id.btTurbilhaoDePetalasAumentar);
			btEstrepesAumentar = (Button) findViewById(R.id.btEstrepesAumentar);
			btPurificacaoDaAlmaAumentar = (Button) findViewById(R.id.btPurificacaoDaAlmaAumentar);
			btInspiracaoAumentar = (Button) findViewById(R.id.btInspiracaoAumentar);
			btRefugioDasSombrasAumentar = (Button) findViewById(R.id.btRefugioDasSombrasAumentar);
			btExplosaoDeMoedasAumentar = (Button) findViewById(R.id.btExplosaoDeMoedasAumentar);
			btImpactoCruzadoAumentar = (Button) findViewById(R.id.btImpactoCruzadoAumentar);
			btPericiaComMaoDireitaAumentar = (Button) findViewById(R.id.btPericiaComMaoDireitaAumentar);
			btPericiaComMaoEsquerdaAumentar = (Button) findViewById(R.id.btPericiaComMaoEsquerdaAumentar);
			btDistorcaoCrescenteAumentar = (Button) findViewById(R.id.btDistorcaoCrescenteAumentar);
			btIlusaoDoLuarAumentar = (Button) findViewById(R.id.btIlusaoDoLuarAumentar);
			btLuarSinistroAumentar = (Button) findViewById(R.id.btLuarSinistroAumentar);

			//Resto dos botões
			btResetar = (Button) findViewById(R.id.btResetar);
			btSalvar = (Button) findViewById(R.id.btSalvar);
			btSalvarIMG = (Button) findViewById(R.id.btSalvarIMG);
			tgbtSomenteHabilidadeAprendida = (ToggleButton) findViewById(R.id.tgbtSomenteHabilidadeAprendida);

			//Txt pontos da tela
			txtAuraNinjaPontos = (TextView) findViewById(R.id.txtAuraNinjaPontos);
			txtPericiaNinjaPontos = (TextView) findViewById(R.id.txtPericiaNinjaPontos);
			txtImagemFalsaPontos = (TextView) findViewById(R.id.txtImagemFalsaPontos);
			txtTrocaDePelePontos = (TextView) findViewById(R.id.txtTrocaDePelePontos);
			txtPetalasFlamejantesPontos = (TextView) findViewById(R.id.txtPetalasFlamejantesPontos);
			txtEscudoDeChamasPontos = (TextView) findViewById(R.id.txtEscudoDeChamasPontos);
			txtDragaoExplosivoPontos = (TextView) findViewById(R.id.txtDragaoExplosivoPontos);
			txtLancaCongelantePontos = (TextView) findViewById(R.id.txtLancaCongelantePontos);
			txtEvasaoAquaticaPontos = (TextView) findViewById(R.id.txtEvasaoAquaticaPontos);
			txtGrandeFlocoDeNevePontos = (TextView) findViewById(R.id.txtGrandeFlocoDeNevePontos);
			txtLaminaDeVentoPontos = (TextView) findViewById(R.id.txtLaminaDeVentoPontos);
			txtDescargaEletricaPontos = (TextView) findViewById(R.id.txtDescargaEletricaPontos);
			txtBrisaCortantePontos = (TextView) findViewById(R.id.txtBrisaCortantePontos);
			txtPraticaDeArremessoDeShurikenPontos = (TextView) findViewById(R.id.txtPraticaDeArremessoDeShurikenPontos);
			txtArremessarShurikenPontos = (TextView) findViewById(R.id.txtArremessarShurikenPontos);
			txtArremessarShurikenHuumaPontos = (TextView) findViewById(R.id.txtArremessarShurikenHuumaPontos);
			txtArremessarKunaiPontos = (TextView) findViewById(R.id.txtArremessarKunaiPontos);
			txtChuvaDeMoedasPontos = (TextView) findViewById(R.id.txtChuvaDeMoedasPontos);
			txtVirarTatamiPontos = (TextView) findViewById(R.id.txtVirarTatamiPontos);
			txtSaltoDasSombrasPontos = (TextView) findViewById(R.id.txtSaltoDasSombrasPontos);
			txtCorteDaNevoaPontos = (TextView) findViewById(R.id.txtCorteDaNevoaPontos);
			txtCorteDasSombrasPontos = (TextView) findViewById(R.id.txtCorteDasSombrasPontos);
			txtAtaqueMortalPontos = (TextView) findViewById(R.id.txtAtaqueMortalPontos);
			txtVoragemEspiritualPontos = (TextView) findViewById(R.id.txtVoragemEspiritualPontos);
			txtAmuletoEspiritualAguaPontos = (TextView) findViewById(R.id.txtAmuletoEspiritualAguaPontos);
			txtAmuletoEspiritualFogoPontos = (TextView) findViewById(R.id.txtAmuletoEspiritualFogoPontos);
			txtAmuletoEspiritualTerraPontos = (TextView) findViewById(R.id.txtAmuletoEspiritualTerraPontos);
			txtAmuletoEspiritualVentoPontos = (TextView) findViewById(R.id.txtAmuletoEspiritualVentoPontos);
			txtArremessarAmuletoEspiritualPontos = (TextView) findViewById(R.id.txtArremessarAmuletoEspiritualPontos);
			txtCorteEspiritualPontos = (TextView) findViewById(R.id.txtCorteEspiritualPontos);
			txtGenjutsuAssaltoDasSombrasPontos = (TextView) findViewById(R.id.txtGenjutsuAssaltoDasSombrasPontos);
			txtGenjutsuChamadoDaMortePontos = (TextView) findViewById(R.id.txtGenjutsuChamadoDaMortePontos);
			txtGenjutsuCloneDasSombrasPontos = (TextView) findViewById(R.id.txtGenjutsuCloneDasSombrasPontos);
			txtGenjutsuSubstituicaoPontos = (TextView) findViewById(R.id.txtGenjutsuSubstituicaoPontos);
			txtKunaiExplosivaPontos = (TextView) findViewById(R.id.txtKunaiExplosivaPontos);
			txtTurbilhaoDeKunaisPontos = (TextView) findViewById(R.id.txtTurbilhaoDeKunaisPontos);
			txtTurbilhaoDePetalasPontos = (TextView) findViewById(R.id.txtTurbilhaoDePetalasPontos);
			txtEstrepesPontos = (TextView) findViewById(R.id.txtEstrepesPontos);
			txtPurificacaoDaAlmaPontos = (TextView) findViewById(R.id.txtPurificacaoDaAlmaPontos);
			txtInspiracaoPontos = (TextView) findViewById(R.id.txtInspiracaoPontos);
			txtRefugioDasSombrasPontos = (TextView) findViewById(R.id.txtRefugioDasSombrasPontos);
			txtExplosaoDeMoedasPontos = (TextView) findViewById(R.id.txtExplosaoDeMoedasPontos);
			txtImpactoCruzadoPontos = (TextView) findViewById(R.id.txtImpactoCruzadoPontos);
			txtPericiaComMaoDireitaPontos = (TextView) findViewById(R.id.txtPericiaComMaoDireitaPontos);
			txtPericiaComMaoEsquerdaPontos = (TextView) findViewById(R.id.txtPericiaComMaoEsquerdaPontos);
			txtDistorcaoCrescentePontos = (TextView) findViewById(R.id.txtDistorcaoCrescentePontos);
			txtIlusaoDoLuarPontos = (TextView) findViewById(R.id.txtIlusaoDoLuarPontos);
			txtLuarSinistroPontos = (TextView) findViewById(R.id.txtLuarSinistroPontos);

			//Txt pontos restantes
			txtClasse1 = (TextView) findViewById(R.id.txtClasse1);
			txtClasse2 = (TextView) findViewById(R.id.txtClasse2);

			//Layouts
			layAuraNinja = (LinearLayout) findViewById(R.id.layAuraNinja);
			layPericiaNinja = (LinearLayout) findViewById(R.id.layPericiaNinja);
			layImagemFalsa = (LinearLayout) findViewById(R.id.layImagemFalsa);
			layTrocaDePele = (LinearLayout) findViewById(R.id.layTrocaDePele);
			layPetalasFlamejantes = (LinearLayout) findViewById(R.id.layPetalasFlamejantes);
			layEscudoDeChamas = (LinearLayout) findViewById(R.id.layEscudoDeChamas);
			layDragaoExplosivo = (LinearLayout) findViewById(R.id.layDragaoExplosivo);
			layLancaCongelante = (LinearLayout) findViewById(R.id.layLancaCongelante);
			layEvasaoAquatica = (LinearLayout) findViewById(R.id.layEvasaoAquatica);
			layGrandeFlocoDeNeve = (LinearLayout) findViewById(R.id.layGrandeFlocoDeNeve);
			layLaminaDeVento = (LinearLayout) findViewById(R.id.layLaminaDeVento);
			layDescargaEletrica = (LinearLayout) findViewById(R.id.layDescargaEletrica);
			layBrisaCortante = (LinearLayout) findViewById(R.id.layBrisaCortante);
			layPraticaDeArremessoDeShuriken = (LinearLayout) findViewById(R.id.layPraticaDeArremessoDeShuriken);
			layArremessarShuriken = (LinearLayout) findViewById(R.id.layArremessarShuriken);
			layArremessarShurikenHuuma = (LinearLayout) findViewById(R.id.layArremessarShurikenHuuma);
			layArremessarKunai = (LinearLayout) findViewById(R.id.layArremessarKunai);
			layChuvaDeMoedas = (LinearLayout) findViewById(R.id.layChuvaDeMoedas);
			layVirarTatami = (LinearLayout) findViewById(R.id.layVirarTatami);
			laySaltoDasSombras = (LinearLayout) findViewById(R.id.laySaltoDasSombras);
			layCorteDaNevoa = (LinearLayout) findViewById(R.id.layCorteDaNevoa);
			layCorteDasSombras = (LinearLayout) findViewById(R.id.layCorteDasSombras);
			layAtaqueMortal = (LinearLayout) findViewById(R.id.layAtaqueMortal);
			layVoragemEspiritual = (LinearLayout) findViewById(R.id.layVoragemEspiritual);
			layAmuletoEspiritualAgua = (LinearLayout) findViewById(R.id.layAmuletoEspiritualAgua);
			layAmuletoEspiritualFogo = (LinearLayout) findViewById(R.id.layAmuletoEspiritualFogo);
			layAmuletoEspiritualTerra = (LinearLayout) findViewById(R.id.layAmuletoEspiritualTerra);
			layAmuletoEspiritualVento = (LinearLayout) findViewById(R.id.layAmuletoEspiritualVento);
			layArremessarAmuletoEspiritual = (LinearLayout) findViewById(R.id.layArremessarAmuletoEspiritual);
			layCorteEspiritual = (LinearLayout) findViewById(R.id.layCorteEspiritual);
			layGenjutsuAssaltoDasSombras = (LinearLayout) findViewById(R.id.layGenjutsuAssaltoDasSombras);
			layGenjutsuChamadoDaMorte = (LinearLayout) findViewById(R.id.layGenjutsuChamadoDaMorte);
			layGenjutsuCloneDasSombras = (LinearLayout) findViewById(R.id.layGenjutsuCloneDasSombras);
			layGenjutsuSubstituicao = (LinearLayout) findViewById(R.id.layGenjutsuSubstituicao);
			layKunaiExplosiva = (LinearLayout) findViewById(R.id.layKunaiExplosiva);
			layTurbilhaoDeKunais = (LinearLayout) findViewById(R.id.layTurbilhaoDeKunais);
			layTurbilhaoDePetalas = (LinearLayout) findViewById(R.id.layTurbilhaoDePetalas);
			layEstrepes = (LinearLayout) findViewById(R.id.layEstrepes);
			layPurificacaoDaAlma = (LinearLayout) findViewById(R.id.layPurificacaoDaAlma);
			layInspiracao = (LinearLayout) findViewById(R.id.layInspiracao);
			layRefugioDasSombras = (LinearLayout) findViewById(R.id.layRefugioDasSombras);
			layExplosaoDeMoedas = (LinearLayout) findViewById(R.id.layExplosaoDeMoedas);
			layImpactoCruzado = (LinearLayout) findViewById(R.id.layImpactoCruzado);
			layPericiaComMaoDireita = (LinearLayout) findViewById(R.id.layPericiaComMaoDireita);
			layPericiaComMaoEsquerda = (LinearLayout) findViewById(R.id.layPericiaComMaoEsquerda);
			layDistorcaoCrescente = (LinearLayout) findViewById(R.id.layDistorcaoCrescente);
			layIlusaoDoLuar = (LinearLayout) findViewById(R.id.layIlusaoDoLuar);
			layLuarSinistro = (LinearLayout) findViewById(R.id.layLuarSinistro);

			if (id>0)
				recarregarBuild(id);

			layPrincipal = (LinearLayout) findViewById(R.id.habilidades);

			//Eventos de informação
			btAuraNinjaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Aura Ninja");
					dialogo.setMessage(R.string.auraNinjaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaNinjaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Perícia Ninja");
					dialogo.setMessage(R.string.periciaNinjaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btImagemFalsaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Imagem Falsa");
					dialogo.setMessage(R.string.imagemFalsaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTrocaDePeleInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Troca De Pele");
					dialogo.setMessage(R.string.trocaDePeleInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPetalasFlamejantesInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Pétalas Flamejantes");
					dialogo.setMessage(R.string.petalasFlamejantesInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEscudoDeChamasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Escudo De Chamas");
					dialogo.setMessage(R.string.escudoDeChamasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDragaoExplosivoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Dragão Explosivo");
					dialogo.setMessage(R.string.dragaoExplosivoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLancaCongelanteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Lança Congelante");
					dialogo.setMessage(R.string.lancaCongelanteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEvasaoAquaticaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Evasão Aquática");
					dialogo.setMessage(R.string.evasaoAquaticaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGrandeFlocoDeNeveInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Grande Floco De Neve");
					dialogo.setMessage(R.string.grandeFlocoDeNeveInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLaminaDeVentoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Lâmina De Vento");
					dialogo.setMessage(R.string.laminaDeVentoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDescargaEletricaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Descarga Elétrica");
					dialogo.setMessage(R.string.descargaEletricaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btBrisaCortanteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Brisa Cortante");
					dialogo.setMessage(R.string.brisaCortanteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPraticaDeArremessoDeShurikenInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Prática De Arremesso De Shuriken");
					dialogo.setMessage(R.string.praticaDeArremessoDeShurikenInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArremessarShurikenInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Arremessar Shuriken");
					dialogo.setMessage(R.string.arremessarShurikenInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArremessarShurikenHuumaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Arremessar Shuriken Huuma");
					dialogo.setMessage(R.string.arremessarShurikenHuumaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArremessarKunaiInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Arremessar Kunai");
					dialogo.setMessage(R.string.arremessarKunaiInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btChuvaDeMoedasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Chuva De Moedas");
					dialogo.setMessage(R.string.chuvaDeMoedasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btVirarTatamiInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Virar Tatami");
					dialogo.setMessage(R.string.virarTatamiInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btSaltoDasSombrasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Salto Das Sombras");
					dialogo.setMessage(R.string.saltoDasSombrasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCorteDaNevoaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Corte Da Névoa");
					dialogo.setMessage(R.string.corteDaNevoaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCorteDasSombrasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Corte Das Sombras");
					dialogo.setMessage(R.string.corteDasSombrasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAtaqueMortalInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Ataque Mortal");
					dialogo.setMessage(R.string.ataqueMortalInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btVoragemEspiritualInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Voragem Espiritual");
					dialogo.setMessage(R.string.voragemEspiritualInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAmuletoEspiritualAguaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Amuleto Espiritual Água");
					dialogo.setMessage(R.string.amuletoEspiritualAguaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAmuletoEspiritualFogoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Amuleto Espiritual Fogo");
					dialogo.setMessage(R.string.amuletoEspiritualFogoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAmuletoEspiritualTerraInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Amuleto Espiritual Terra");
					dialogo.setMessage(R.string.amuletoEspiritualTerraInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btAmuletoEspiritualVentoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Amuleto Espiritual Vento");
					dialogo.setMessage(R.string.amuletoEspiritualVentoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btArremessarAmuletoEspiritualInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Arremessar Amuleto Espiritual");
					dialogo.setMessage(R.string.arremessarAmuletoEspiritualInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btCorteEspiritualInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Corte Espiritual");
					dialogo.setMessage(R.string.corteEspiritualInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGenjutsuAssaltoDasSombrasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Genjutsu Assalto Das Sombras");
					dialogo.setMessage(R.string.genjutsuAssaltoDasSombrasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGenjutsuChamadoDaMorteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Genjutsu Chamado Da Morte");
					dialogo.setMessage(R.string.genjutsuChamadoDaMorteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGenjutsuCloneDasSombrasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Genjutsu Clone Das Sombras");
					dialogo.setMessage(R.string.genjutsuCloneDasSombrasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btGenjutsuSubstituicaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Genjutsu Substituição");
					dialogo.setMessage(R.string.genjutsuSubstituicaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btKunaiExplosivaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Kunai Explosiva");
					dialogo.setMessage(R.string.kunaiExplosivaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTurbilhaoDeKunaisInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Turbilhão De Kunais");
					dialogo.setMessage(R.string.turbilhaoDeKunaisInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btTurbilhaoDePetalasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Turbilhão De Pétalas");
					dialogo.setMessage(R.string.turbilhaoDePetalasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btEstrepesInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Estrepes");
					dialogo.setMessage(R.string.estrepesInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPurificacaoDaAlmaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Purificação Da Alma");
					dialogo.setMessage(R.string.purificacaoDaAlmaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btInspiracaoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Inspiração");
					dialogo.setMessage(R.string.inspiracaoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btRefugioDasSombrasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Refúgio Das Sombras");
					dialogo.setMessage(R.string.refugioDasSombrasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btExplosaoDeMoedasInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Explosão De Moedas");
					dialogo.setMessage(R.string.explosaoDeMoedasInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btImpactoCruzadoInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Impacto Cruzado");
					dialogo.setMessage(R.string.impactoCruzadoInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaComMaoDireitaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Perícia Com Mão Direita");
					dialogo.setMessage(R.string.periciaComMaoDireitaNinjaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btPericiaComMaoEsquerdaInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Perícia Com Mão Esquerda");
					dialogo.setMessage(R.string.periciaComMaoEsquerdaNinjaInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btDistorcaoCrescenteInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Distorção Crescente");
					dialogo.setMessage(R.string.distorcaoCrescenteInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btIlusaoDoLuarInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Ilusão Do Luar");
					dialogo.setMessage(R.string.ilusaoDoLuarInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});
			btLuarSinistroInterrogacao.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					AlertDialog.Builder dialogo = new AlertDialog.Builder(SimuladorOboro.this);
					dialogo.setTitle("Luar Sinistro");
					dialogo.setMessage(R.string.luarSinistroInfo);
					dialogo.setNeutralButton("Fechar info", null);
					dialogo.show();
				}
			});


			//Eventos de aumentar
			btAuraNinjaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<5 && count<5){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAuraNinja, "AuraNinja", 5, 1, "Aumentar");

				}
			});
			btPericiaNinjaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");

				}
			});
			btImagemFalsaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<5 && count<5){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAuraNinja<1 && count<1){
						atualizarCalculo(varAuraNinja, "AuraNinja", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<5 && count<5){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrocaDePele<4 && count<4){
						atualizarCalculo(varTrocaDePele, "TrocaDePele", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<1 && count<1){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varCorteDaNevoa<5 && count<5){
						atualizarCalculo(varCorteDaNevoa, "CorteDaNevoa", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varCorteDasSombras<3 && count<3){
						atualizarCalculo(varCorteDasSombras, "CorteDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varImagemFalsa, "ImagemFalsa", 10, 1, "Aumentar");

				}
			});
			btTrocaDePeleAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<5 && count<5){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTrocaDePele, "TrocaDePele", 5, 1, "Aumentar");

				}
			});
			btPetalasFlamejantesAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<1 && count<1){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPetalasFlamejantes, "PetalasFlamejantes", 10, 1, "Aumentar");

				}
			});
			btEscudoDeChamasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<1 && count<1){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetalasFlamejantes<5 && count<5){
						atualizarCalculo(varPetalasFlamejantes, "PetalasFlamejantes", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEscudoDeChamas, "EscudoDeChamas", 10, 1, "Aumentar");

				}
			});
			btDragaoExplosivoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<10 && count<10){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaNinja<1 && count<1){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPetalasFlamejantes<5 && count<5){
						atualizarCalculo(varPetalasFlamejantes, "PetalasFlamejantes", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEscudoDeChamas<7 && count<7){
						atualizarCalculo(varEscudoDeChamas, "EscudoDeChamas", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDragaoExplosivo, "DragaoExplosivo", 5, 1, "Aumentar");

				}
			});
			btLancaCongelanteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<1 && count<1){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varLancaCongelante, "LancaCongelante", 10, 1, "Aumentar");

				}
			});
			btEvasaoAquaticaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<1 && count<1){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancaCongelante<5 && count<5){
						atualizarCalculo(varLancaCongelante, "LancaCongelante", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEvasaoAquatica, "EvasaoAquatica", 10, 1, "Aumentar");

				}
			});
			btGrandeFlocoDeNeveAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<10 && count<10){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaNinja<1 && count<1){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLancaCongelante<5 && count<5){
						atualizarCalculo(varLancaCongelante, "LancaCongelante", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEvasaoAquatica<7 && count<7){
						atualizarCalculo(varEvasaoAquatica, "EvasaoAquatica", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGrandeFlocoDeNeve, "GrandeFlocoDeNeve", 5, 1, "Aumentar");

				}
			});
			btLaminaDeVentoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<1 && count<1){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varLaminaDeVento, "LaminaDeVento", 10, 1, "Aumentar");

				}
			});
			btDescargaEletricaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<1 && count<1){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaminaDeVento<5 && count<5){
						atualizarCalculo(varLaminaDeVento, "LaminaDeVento", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDescargaEletrica, "DescargaEletrica", 5, 1, "Aumentar");

				}
			});
			btBrisaCortanteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<10 && count<10){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPericiaNinja<1 && count<1){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varLaminaDeVento<5 && count<5){
						atualizarCalculo(varLaminaDeVento, "LaminaDeVento", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varDescargaEletrica<5 && count<5){
						atualizarCalculo(varDescargaEletrica, "DescargaEletrica", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varBrisaCortante, "BrisaCortante", 5, 1, "Aumentar");

				}
			});
			btPraticaDeArremessoDeShurikenAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");

				}
			});
			btArremessarShurikenAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPraticaDeArremessoDeShuriken<1 && count<1){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArremessarShuriken, "ArremessarShuriken", 10, 1, "Aumentar");

				}
			});
			btArremessarShurikenHuumaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPraticaDeArremessoDeShuriken<1 && count<1){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarShuriken<5 && count<5){
						atualizarCalculo(varArremessarShuriken, "ArremessarShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarKunai<5 && count<5){
						atualizarCalculo(varArremessarKunai, "ArremessarKunai", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPraticaDeArremessoDeShuriken<5 && count<5){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArremessarShurikenHuuma, "ArremessarShurikenHuuma", 5, 1, "Aumentar");

				}
			});
			btArremessarKunaiAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPraticaDeArremessoDeShuriken<1 && count<1){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarShuriken<5 && count<5){
						atualizarCalculo(varArremessarShuriken, "ArremessarShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArremessarKunai, "ArremessarKunai", 5, 1, "Aumentar");

				}
			});
			btChuvaDeMoedasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPraticaDeArremessoDeShuriken<1 && count<1){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarShuriken<5 && count<5){
						atualizarCalculo(varArremessarShuriken, "ArremessarShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarKunai<5 && count<5){
						atualizarCalculo(varArremessarKunai, "ArremessarKunai", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPraticaDeArremessoDeShuriken<5 && count<5){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarShurikenHuuma<5 && count<5){
						atualizarCalculo(varArremessarShurikenHuuma, "ArremessarShurikenHuuma", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPraticaDeArremessoDeShuriken<10 && count<10){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varChuvaDeMoedas, "ChuvaDeMoedas", 10, 1, "Aumentar");

				}
			});
			btVirarTatamiAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");

				}
			});
			btSaltoDasSombrasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");

				}
			});
			btCorteDaNevoaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<1 && count<1){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCorteDaNevoa, "CorteDaNevoa", 10, 1, "Aumentar");

				}
			});
			btCorteDasSombrasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<1 && count<1){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varCorteDaNevoa<5 && count<5){
						atualizarCalculo(varCorteDaNevoa, "CorteDaNevoa", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCorteDasSombras, "CorteDasSombras", 5, 1, "Aumentar");

				}
			});
			btAtaqueMortalAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<5 && count<5){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varAuraNinja<1 && count<1){
						atualizarCalculo(varAuraNinja, "AuraNinja", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<1 && count<1){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varCorteDaNevoa<5 && count<5){
						atualizarCalculo(varCorteDaNevoa, "CorteDaNevoa", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varCorteDasSombras<5 && count<5){
						atualizarCalculo(varCorteDasSombras, "CorteDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPraticaDeArremessoDeShuriken<7 && count<7){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varAtaqueMortal, "AtaqueMortal", 10, 1, "Aumentar");

				}
			});
			btVoragemEspiritualAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<5 && count<5){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varInspiracao<1 && count<1){
						atualizarCalculo(varInspiracao, "Inspiracao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAmuletoEspiritualAgua<1 && count<1){
						atualizarCalculo(varAmuletoEspiritualAgua, "AmuletoEspiritualAgua", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAmuletoEspiritualFogo<1 && count<1){
						atualizarCalculo(varAmuletoEspiritualFogo, "AmuletoEspiritualFogo", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAmuletoEspiritualTerra<1 && count<1){
						atualizarCalculo(varAmuletoEspiritualTerra, "AmuletoEspiritualTerra", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAmuletoEspiritualVento<1 && count<1){
						atualizarCalculo(varAmuletoEspiritualVento, "AmuletoEspiritualVento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarAmuletoEspiritual<1 && count<1){
						atualizarCalculo(varArremessarAmuletoEspiritual, "ArremessarAmuletoEspiritual", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varVoragemEspiritual, "VoragemEspiritual", 1, 2, "Aumentar");

				}
			});
			btAmuletoEspiritualAguaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAmuletoEspiritualAgua, "AmuletoEspiritualAgua", 1, 2, "Aumentar");

				}
			});
			btAmuletoEspiritualFogoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAmuletoEspiritualFogo, "AmuletoEspiritualFogo", 1, 2, "Aumentar");

				}
			});
			btAmuletoEspiritualTerraAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAmuletoEspiritualTerra, "AmuletoEspiritualTerra", 1, 2, "Aumentar");

				}
			});
			btAmuletoEspiritualVentoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAmuletoEspiritualVento, "AmuletoEspiritualVento", 1, 2, "Aumentar");

				}
			});
			btArremessarAmuletoEspiritualAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varAmuletoEspiritualAgua<1 && count<1){
						atualizarCalculo(varAmuletoEspiritualAgua, "AmuletoEspiritualAgua", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAmuletoEspiritualFogo<1 && count<1){
						atualizarCalculo(varAmuletoEspiritualFogo, "AmuletoEspiritualFogo", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAmuletoEspiritualTerra<1 && count<1){
						atualizarCalculo(varAmuletoEspiritualTerra, "AmuletoEspiritualTerra", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varAmuletoEspiritualVento<1 && count<1){
						atualizarCalculo(varAmuletoEspiritualVento, "AmuletoEspiritualVento", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varArremessarAmuletoEspiritual, "ArremessarAmuletoEspiritual", 1, 2, "Aumentar");

				}
			});
			btCorteEspiritualAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<1 && count<1){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varCorteDaNevoa<5 && count<5){
						atualizarCalculo(varCorteDaNevoa, "CorteDaNevoa", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varCorteDasSombras<5 && count<5){
						atualizarCalculo(varCorteDasSombras, "CorteDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRefugioDasSombras<1 && count<1){
						atualizarCalculo(varRefugioDasSombras, "RefugioDasSombras", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varImpactoCruzado<2 && count<2){
						atualizarCalculo(varImpactoCruzado, "ImpactoCruzado", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varCorteEspiritual, "CorteEspiritual", 5, 2, "Aumentar");

				}
			});
			btGenjutsuAssaltoDasSombrasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<5 && count<5){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrocaDePele<1 && count<1){
						atualizarCalculo(varTrocaDePele, "TrocaDePele", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varGenjutsuCloneDasSombras<2 && count<2){
						atualizarCalculo(varGenjutsuCloneDasSombras, "GenjutsuCloneDasSombras", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGenjutsuAssaltoDasSombras, "GenjutsuAssaltoDasSombras", 5, 2, "Aumentar");

				}
			});
			btGenjutsuChamadoDaMorteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<5 && count<5){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrocaDePele<1 && count<1){
						atualizarCalculo(varTrocaDePele, "TrocaDePele", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varGenjutsuCloneDasSombras<2 && count<2){
						atualizarCalculo(varGenjutsuCloneDasSombras, "GenjutsuCloneDasSombras", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varGenjutsuAssaltoDasSombras<3 && count<3){
						atualizarCalculo(varGenjutsuAssaltoDasSombras, "GenjutsuAssaltoDasSombras", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGenjutsuChamadoDaMorte, "GenjutsuChamadoDaMorte", 5, 2, "Aumentar");

				}
			});
			btGenjutsuCloneDasSombrasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<5 && count<5){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrocaDePele<1 && count<1){
						atualizarCalculo(varTrocaDePele, "TrocaDePele", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGenjutsuCloneDasSombras, "GenjutsuCloneDasSombras", 5, 2, "Aumentar");

				}
			});
			btGenjutsuSubstituicaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<5 && count<5){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrocaDePele<1 && count<1){
						atualizarCalculo(varTrocaDePele, "TrocaDePele", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varGenjutsuSubstituicao, "GenjutsuSubstituicao", 5, 2, "Aumentar");

				}
			});
			btKunaiExplosivaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPraticaDeArremessoDeShuriken<1 && count<1){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarShuriken<5 && count<5){
						atualizarCalculo(varArremessarShuriken, "ArremessarShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarKunai<5 && count<5){
						atualizarCalculo(varArremessarKunai, "ArremessarKunai", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varKunaiExplosiva, "KunaiExplosiva", 5, 2, "Aumentar");

				}
			});
			btTurbilhaoDeKunaisAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPraticaDeArremessoDeShuriken<1 && count<1){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarShuriken<5 && count<5){
						atualizarCalculo(varArremessarShuriken, "ArremessarShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarKunai<5 && count<5){
						atualizarCalculo(varArremessarKunai, "ArremessarKunai", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varKunaiExplosiva<1 && count<1){
						atualizarCalculo(varKunaiExplosiva, "KunaiExplosiva", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTurbilhaoDeKunais, "TurbilhaoDeKunais", 5, 2, "Aumentar");

				}
			});
			btTurbilhaoDePetalasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPraticaDeArremessoDeShuriken<1 && count<1){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarShuriken<5 && count<5){
						atualizarCalculo(varArremessarShuriken, "ArremessarShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarKunai<5 && count<5){
						atualizarCalculo(varArremessarKunai, "ArremessarKunai", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPraticaDeArremessoDeShuriken<5 && count<5){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarShurikenHuuma<5 && count<5){
						atualizarCalculo(varArremessarShurikenHuuma, "ArremessarShurikenHuuma", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varTurbilhaoDePetalas, "TurbilhaoDePetalas", 5, 2, "Aumentar");

				}
			});
			btEstrepesAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPraticaDeArremessoDeShuriken<1 && count<1){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarShuriken<5 && count<5){
						atualizarCalculo(varArremessarShuriken, "ArremessarShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarKunai<5 && count<5){
						atualizarCalculo(varArremessarKunai, "ArremessarKunai", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPraticaDeArremessoDeShuriken<5 && count<5){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarShurikenHuuma<5 && count<5){
						atualizarCalculo(varArremessarShurikenHuuma, "ArremessarShurikenHuuma", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPraticaDeArremessoDeShuriken<10 && count<10){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varChuvaDeMoedas<1 && count<1){
						atualizarCalculo(varChuvaDeMoedas, "ChuvaDeMoedas", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varEstrepes, "Estrepes", 5, 2, "Aumentar");

				}
			});
			btPurificacaoDaAlmaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<10 && count<10){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varPurificacaoDaAlma, "PurificacaoDaAlma", 5, 2, "Aumentar");

				}
			});
			btInspiracaoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPericiaNinja<5 && count<5){
						atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varInspiracao, "Inspiracao", 5, 2, "Aumentar");

				}
			});
			btRefugioDasSombrasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<1 && count<1){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varCorteDaNevoa<5 && count<5){
						atualizarCalculo(varCorteDaNevoa, "CorteDaNevoa", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varCorteDasSombras<5 && count<5){
						atualizarCalculo(varCorteDasSombras, "CorteDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varRefugioDasSombras, "RefugioDasSombras", 1, 2, "Aumentar");

				}
			});
			btExplosaoDeMoedasAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varPraticaDeArremessoDeShuriken<1 && count<1){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarShuriken<5 && count<5){
						atualizarCalculo(varArremessarShuriken, "ArremessarShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarKunai<5 && count<5){
						atualizarCalculo(varArremessarKunai, "ArremessarKunai", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPraticaDeArremessoDeShuriken<5 && count<5){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varArremessarShurikenHuuma<5 && count<5){
						atualizarCalculo(varArremessarShurikenHuuma, "ArremessarShurikenHuuma", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varPraticaDeArremessoDeShuriken<10 && count<10){
						atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varChuvaDeMoedas<1 && count<1){
						atualizarCalculo(varChuvaDeMoedas, "ChuvaDeMoedas", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varEstrepes<3 && count<3){
						atualizarCalculo(varEstrepes, "Estrepes", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varExplosaoDeMoedas, "ExplosaoDeMoedas", 10, 2, "Aumentar");

				}
			});
			btImpactoCruzadoAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<1 && count<1){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varCorteDaNevoa<5 && count<5){
						atualizarCalculo(varCorteDaNevoa, "CorteDaNevoa", 10, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varCorteDasSombras<5 && count<5){
						atualizarCalculo(varCorteDasSombras, "CorteDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varRefugioDasSombras<1 && count<1){
						atualizarCalculo(varRefugioDasSombras, "RefugioDasSombras", 1, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varImpactoCruzado, "ImpactoCruzado", 5, 2, "Aumentar");

				}
			});
			btPericiaComMaoDireitaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComMaoDireita, "PericiaComMaoDireita", 5, 2, "Aumentar");

				}
			});
			btPericiaComMaoEsquerdaAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComMaoEsquerda, "PericiaComMaoEsquerda", 5, 2, "Aumentar");

				}
			});
			btDistorcaoCrescenteAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<5 && count<5){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrocaDePele<1 && count<1){
						atualizarCalculo(varTrocaDePele, "TrocaDePele", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varGenjutsuSubstituicao<1 && count<1){
						atualizarCalculo(varGenjutsuSubstituicao, "GenjutsuSubstituicao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varDistorcaoCrescente, "DistorcaoCrescente", 5, 2, "Aumentar");

				}
			});
			btIlusaoDoLuarAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<5 && count<5){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrocaDePele<1 && count<1){
						atualizarCalculo(varTrocaDePele, "TrocaDePele", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varGenjutsuSubstituicao<1 && count<1){
						atualizarCalculo(varGenjutsuSubstituicao, "GenjutsuSubstituicao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDistorcaoCrescente<2 && count<2){
						atualizarCalculo(varDistorcaoCrescente, "DistorcaoCrescente", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varLuarSinistro<3 && count<3){
						atualizarCalculo(varLuarSinistro, "LuarSinistro", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varIlusaoDoLuar, "IlusaoDoLuar", 5, 2, "Aumentar");

				}
			});
			btLuarSinistroAumentar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					while(varVirarTatami<1 && count<1){
						atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varSaltoDasSombras<5 && count<5){
						atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varTrocaDePele<1 && count<1){
						atualizarCalculo(varTrocaDePele, "TrocaDePele", 5, 1, "Aumentar");
						count++;
					}
					count = 0;
					while(varGenjutsuSubstituicao<1 && count<1){
						atualizarCalculo(varGenjutsuSubstituicao, "GenjutsuSubstituicao", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					while(varDistorcaoCrescente<2 && count<2){
						atualizarCalculo(varDistorcaoCrescente, "DistorcaoCrescente", 5, 2, "Aumentar");
						count++;
					}
					count = 0;
					atualizarCalculo(varLuarSinistro, "LuarSinistro", 5, 2, "Aumentar");

				}
			});


			//Eventos de diminuir
			btAuraNinjaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAuraNinja, "AuraNinja", 5, 1, "Diminuir");

				}
			});
			btPericiaNinjaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaNinja, "PericiaNinja", 10, 1, "Diminuir");

				}
			});
			btImagemFalsaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varImagemFalsa, "ImagemFalsa", 10, 1, "Diminuir");

				}
			});
			btTrocaDePeleDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTrocaDePele, "TrocaDePele", 5, 1, "Diminuir");

				}
			});
			btPetalasFlamejantesDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPetalasFlamejantes, "PetalasFlamejantes", 10, 1, "Diminuir");

				}
			});
			btEscudoDeChamasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEscudoDeChamas, "EscudoDeChamas", 10, 1, "Diminuir");

				}
			});
			btDragaoExplosivoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDragaoExplosivo, "DragaoExplosivo", 5, 1, "Diminuir");

				}
			});
			btLancaCongelanteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLancaCongelante, "LancaCongelante", 10, 1, "Diminuir");

				}
			});
			btEvasaoAquaticaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEvasaoAquatica, "EvasaoAquatica", 10, 1, "Diminuir");

				}
			});
			btGrandeFlocoDeNeveDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGrandeFlocoDeNeve, "GrandeFlocoDeNeve", 5, 1, "Diminuir");

				}
			});
			btLaminaDeVentoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLaminaDeVento, "LaminaDeVento", 10, 1, "Diminuir");

				}
			});
			btDescargaEletricaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDescargaEletrica, "DescargaEletrica", 5, 1, "Diminuir");

				}
			});
			btBrisaCortanteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varBrisaCortante, "BrisaCortante", 5, 1, "Diminuir");

				}
			});
			btPraticaDeArremessoDeShurikenDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPraticaDeArremessoDeShuriken, "PraticaDeArremessoDeShuriken", 10, 1, "Diminuir");

				}
			});
			btArremessarShurikenDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArremessarShuriken, "ArremessarShuriken", 10, 1, "Diminuir");

				}
			});
			btArremessarShurikenHuumaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArremessarShurikenHuuma, "ArremessarShurikenHuuma", 5, 1, "Diminuir");

				}
			});
			btArremessarKunaiDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArremessarKunai, "ArremessarKunai", 5, 1, "Diminuir");

				}
			});
			btChuvaDeMoedasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varChuvaDeMoedas, "ChuvaDeMoedas", 10, 1, "Diminuir");

				}
			});
			btVirarTatamiDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varVirarTatami, "VirarTatami", 5, 1, "Diminuir");

				}
			});
			btSaltoDasSombrasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varSaltoDasSombras, "SaltoDasSombras", 5, 1, "Diminuir");

				}
			});
			btCorteDaNevoaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCorteDaNevoa, "CorteDaNevoa", 10, 1, "Diminuir");

				}
			});
			btCorteDasSombrasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCorteDasSombras, "CorteDasSombras", 5, 1, "Diminuir");

				}
			});
			btAtaqueMortalDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAtaqueMortal, "AtaqueMortal", 10, 1, "Diminuir");

				}
			});
			btVoragemEspiritualDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varVoragemEspiritual, "VoragemEspiritual", 1, 2, "Diminuir");

				}
			});
			btAmuletoEspiritualAguaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAmuletoEspiritualAgua, "AmuletoEspiritualAgua", 1, 2, "Diminuir");

				}
			});
			btAmuletoEspiritualFogoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAmuletoEspiritualFogo, "AmuletoEspiritualFogo", 1, 2, "Diminuir");

				}
			});
			btAmuletoEspiritualTerraDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAmuletoEspiritualTerra, "AmuletoEspiritualTerra", 1, 2, "Diminuir");

				}
			});
			btAmuletoEspiritualVentoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varAmuletoEspiritualVento, "AmuletoEspiritualVento", 1, 2, "Diminuir");

				}
			});
			btArremessarAmuletoEspiritualDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varArremessarAmuletoEspiritual, "ArremessarAmuletoEspiritual", 1, 2, "Diminuir");

				}
			});
			btCorteEspiritualDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varCorteEspiritual, "CorteEspiritual", 5, 2, "Diminuir");

				}
			});
			btGenjutsuAssaltoDasSombrasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGenjutsuAssaltoDasSombras, "GenjutsuAssaltoDasSombras", 5, 2, "Diminuir");

				}
			});
			btGenjutsuChamadoDaMorteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGenjutsuChamadoDaMorte, "GenjutsuChamadoDaMorte", 5, 2, "Diminuir");

				}
			});
			btGenjutsuCloneDasSombrasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGenjutsuCloneDasSombras, "GenjutsuCloneDasSombras", 5, 2, "Diminuir");

				}
			});
			btGenjutsuSubstituicaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varGenjutsuSubstituicao, "GenjutsuSubstituicao", 5, 2, "Diminuir");

				}
			});
			btKunaiExplosivaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varKunaiExplosiva, "KunaiExplosiva", 5, 2, "Diminuir");

				}
			});
			btTurbilhaoDeKunaisDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTurbilhaoDeKunais, "TurbilhaoDeKunais", 5, 2, "Diminuir");

				}
			});
			btTurbilhaoDePetalasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varTurbilhaoDePetalas, "TurbilhaoDePetalas", 5, 2, "Diminuir");

				}
			});
			btEstrepesDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varEstrepes, "Estrepes", 5, 2, "Diminuir");

				}
			});
			btPurificacaoDaAlmaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPurificacaoDaAlma, "PurificacaoDaAlma", 5, 2, "Diminuir");

				}
			});
			btInspiracaoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varInspiracao, "Inspiracao", 5, 2, "Diminuir");

				}
			});
			btRefugioDasSombrasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varRefugioDasSombras, "RefugioDasSombras", 1, 2, "Diminuir");

				}
			});
			btExplosaoDeMoedasDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varExplosaoDeMoedas, "ExplosaoDeMoedas", 10, 2, "Diminuir");

				}
			});
			btImpactoCruzadoDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varImpactoCruzado, "ImpactoCruzado", 5, 2, "Diminuir");

				}
			});
			btPericiaComMaoDireitaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComMaoDireita, "PericiaComMaoDireita", 5, 2, "Diminuir");

				}
			});
			btPericiaComMaoEsquerdaDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varPericiaComMaoEsquerda, "PericiaComMaoEsquerda", 5, 2, "Diminuir");

				}
			});
			btDistorcaoCrescenteDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varDistorcaoCrescente, "DistorcaoCrescente", 5, 2, "Diminuir");

				}
			});
			btIlusaoDoLuarDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varIlusaoDoLuar, "IlusaoDoLuar", 5, 2, "Diminuir");

				}
			});
			btLuarSinistroDiminuir.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					atualizarCalculo(varLuarSinistro, "LuarSinistro", 5, 2, "Diminuir");

				}
			});


			//Outros Botões
			btResetar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					varAuraNinja = 0;
					varPericiaNinja = 0;
					varImagemFalsa = 0;
					varTrocaDePele = 0;
					varPetalasFlamejantes = 0;
					varEscudoDeChamas = 0;
					varDragaoExplosivo = 0;
					varLancaCongelante = 0;
					varEvasaoAquatica = 0;
					varGrandeFlocoDeNeve = 0;
					varLaminaDeVento = 0;
					varDescargaEletrica = 0;
					varBrisaCortante = 0;
					varPraticaDeArremessoDeShuriken = 0;
					varArremessarShuriken = 0;
					varArremessarShurikenHuuma = 0;
					varArremessarKunai = 0;
					varChuvaDeMoedas = 0;
					varVirarTatami = 0;
					varSaltoDasSombras = 0;
					varCorteDaNevoa = 0;
					varCorteDasSombras = 0;
					varAtaqueMortal = 0;
					varVoragemEspiritual = 0;
					varAmuletoEspiritualAgua = 0;
					varAmuletoEspiritualFogo = 0;
					varAmuletoEspiritualTerra = 0;
					varAmuletoEspiritualVento = 0;
					varArremessarAmuletoEspiritual = 0;
					varCorteEspiritual = 0;
					varGenjutsuAssaltoDasSombras = 0;
					varGenjutsuChamadoDaMorte = 0;
					varGenjutsuCloneDasSombras = 0;
					varGenjutsuSubstituicao = 0;
					varKunaiExplosiva = 0;
					varTurbilhaoDeKunais = 0;
					varTurbilhaoDePetalas = 0;
					varEstrepes = 0;
					varPurificacaoDaAlma = 0;
					varInspiracao = 0;
					varRefugioDasSombras = 0;
					varExplosaoDeMoedas = 0;
					varImpactoCruzado = 0;
					varPericiaComMaoDireita = 0;
					varPericiaComMaoEsquerda = 0;
					varDistorcaoCrescente = 0;
					varIlusaoDoLuar = 0;
					varLuarSinistro = 0;

					primeiraClasse = 69;
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
						AlertDialog.Builder msgA = new AlertDialog.Builder(SimuladorOboro.this);
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
								AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorOboro.this);
								msg.setTitle("Escolha um nome");
								msg.setMessage("Escolha um nome para salvar esta simulação:");
								final EditText nomeParaSalvar = new EditText(SimuladorOboro.this);
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

						AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorOboro.this);
						msg.setTitle("Escolha um nome");
						msg.setMessage("Escolha um nome para salvar esta simulação:");
						final EditText nomeParaSalvar = new EditText(SimuladorOboro.this);
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

					AlertDialog.Builder msg = new AlertDialog.Builder(SimuladorOboro.this);
					msg.setTitle("Escolha um nome");
					msg.setMessage("OBS: Salvar PNG só irá salvar em forma de imagem! É recomendado que salve a build na memória do celular também.\nEscolha um nome para salvar esta simulação:");
					final EditText nomeParaSalvar = new EditText(SimuladorOboro.this);
					msg.setView(nomeParaSalvar);
					msg.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {

							@Override
						public void onClick(DialogInterface dialog, int which) {
							if (nomeParaSalvar.getText().toString().length() <= 0) {
								nomeParaSalvar.setError("Preencha o campo!");
								Toast.makeText(getBaseContext(), "ERROR: Insira um nome!", Toast.LENGTH_SHORT).show();
							} else {
								SaveFile sf = new SaveFile();
								sf.takeAScreenShot(SimuladorOboro.this, layPrincipal, nomeParaSalvar.getText().toString());
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
			if(varAuraNinja==0)
				layAuraNinja.setVisibility(View.GONE);
			if(varPericiaNinja==0)
				layPericiaNinja.setVisibility(View.GONE);
			if(varImagemFalsa==0)
				layImagemFalsa.setVisibility(View.GONE);
			if(varTrocaDePele==0)
				layTrocaDePele.setVisibility(View.GONE);
			if(varPetalasFlamejantes==0)
				layPetalasFlamejantes.setVisibility(View.GONE);
			if(varEscudoDeChamas==0)
				layEscudoDeChamas.setVisibility(View.GONE);
			if(varDragaoExplosivo==0)
				layDragaoExplosivo.setVisibility(View.GONE);
			if(varLancaCongelante==0)
				layLancaCongelante.setVisibility(View.GONE);
			if(varEvasaoAquatica==0)
				layEvasaoAquatica.setVisibility(View.GONE);
			if(varGrandeFlocoDeNeve==0)
				layGrandeFlocoDeNeve.setVisibility(View.GONE);
			if(varLaminaDeVento==0)
				layLaminaDeVento.setVisibility(View.GONE);
			if(varDescargaEletrica==0)
				layDescargaEletrica.setVisibility(View.GONE);
			if(varBrisaCortante==0)
				layBrisaCortante.setVisibility(View.GONE);
			if(varPraticaDeArremessoDeShuriken==0)
				layPraticaDeArremessoDeShuriken.setVisibility(View.GONE);
			if(varArremessarShuriken==0)
				layArremessarShuriken.setVisibility(View.GONE);
			if(varArremessarShurikenHuuma==0)
				layArremessarShurikenHuuma.setVisibility(View.GONE);
			if(varArremessarKunai==0)
				layArremessarKunai.setVisibility(View.GONE);
			if(varChuvaDeMoedas==0)
				layChuvaDeMoedas.setVisibility(View.GONE);
			if(varVirarTatami==0)
				layVirarTatami.setVisibility(View.GONE);
			if(varSaltoDasSombras==0)
				laySaltoDasSombras.setVisibility(View.GONE);
			if(varCorteDaNevoa==0)
				layCorteDaNevoa.setVisibility(View.GONE);
			if(varCorteDasSombras==0)
				layCorteDasSombras.setVisibility(View.GONE);
			if(varAtaqueMortal==0)
				layAtaqueMortal.setVisibility(View.GONE);

			if(varVoragemEspiritual==0)
				layVoragemEspiritual.setVisibility(View.GONE);
			if(varAmuletoEspiritualAgua==0)
				layAmuletoEspiritualAgua.setVisibility(View.GONE);
			if(varAmuletoEspiritualFogo==0)
				layAmuletoEspiritualFogo.setVisibility(View.GONE);
			if(varAmuletoEspiritualTerra==0)
				layAmuletoEspiritualTerra.setVisibility(View.GONE);
			if(varAmuletoEspiritualVento==0)
				layAmuletoEspiritualVento.setVisibility(View.GONE);
			if(varArremessarAmuletoEspiritual==0)
				layArremessarAmuletoEspiritual.setVisibility(View.GONE);
			if(varCorteEspiritual==0)
				layCorteEspiritual.setVisibility(View.GONE);
			if(varGenjutsuAssaltoDasSombras==0)
				layGenjutsuAssaltoDasSombras.setVisibility(View.GONE);
			if(varGenjutsuChamadoDaMorte==0)
				layGenjutsuChamadoDaMorte.setVisibility(View.GONE);
			if(varGenjutsuCloneDasSombras==0)
				layGenjutsuCloneDasSombras.setVisibility(View.GONE);
			if(varGenjutsuSubstituicao==0)
				layGenjutsuSubstituicao.setVisibility(View.GONE);
			if(varKunaiExplosiva==0)
				layKunaiExplosiva.setVisibility(View.GONE);
			if(varTurbilhaoDeKunais==0)
				layTurbilhaoDeKunais.setVisibility(View.GONE);
			if(varTurbilhaoDePetalas==0)
				layTurbilhaoDePetalas.setVisibility(View.GONE);
			if(varEstrepes==0)
				layEstrepes.setVisibility(View.GONE);
			if(varPurificacaoDaAlma==0)
				layPurificacaoDaAlma.setVisibility(View.GONE);
			if(varInspiracao==0)
				layInspiracao.setVisibility(View.GONE);
			if(varRefugioDasSombras==0)
				layRefugioDasSombras.setVisibility(View.GONE);
			if(varExplosaoDeMoedas==0)
				layExplosaoDeMoedas.setVisibility(View.GONE);
			if(varImpactoCruzado==0)
				layImpactoCruzado.setVisibility(View.GONE);
			if(varPericiaComMaoDireita==0)
				layPericiaComMaoDireita.setVisibility(View.GONE);
			if(varPericiaComMaoEsquerda==0)
				layPericiaComMaoEsquerda.setVisibility(View.GONE);
			if(varDistorcaoCrescente==0)
				layDistorcaoCrescente.setVisibility(View.GONE);
			if(varIlusaoDoLuar==0)
				layIlusaoDoLuar.setVisibility(View.GONE);
			if(varLuarSinistro==0)
				layLuarSinistro.setVisibility(View.GONE);

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

				if (nomeDaHabilidade=="PericiaNinja" && varAuraNinja>=1 && varPericiaNinja<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AuraNinja" && varImagemFalsa>=1 && varAuraNinja<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TrocaDePele" && varImagemFalsa>=1 && varTrocaDePele<=04){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CorteDasSombras" && varImagemFalsa>=1 && varCorteDasSombras<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="SaltoDasSombras" && varTrocaDePele>=1 && varSaltoDasSombras<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaNinja" && varPetalasFlamejantes>=1 && varPericiaNinja<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PetalasFlamejantes" && varEscudoDeChamas>=1 && varPetalasFlamejantes<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaNinja" && varDragaoExplosivo>=1 && varPericiaNinja<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EscudoDeChamas" && varDragaoExplosivo>=1 && varEscudoDeChamas<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaNinja" && varLancaCongelante>=1 && varPericiaNinja<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LancaCongelante" && varEvasaoAquatica>=1 && varLancaCongelante<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaNinja" && varGrandeFlocoDeNeve>=1 && varPericiaNinja<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="EvasaoAquatica" && varGrandeFlocoDeNeve>=1 && varEvasaoAquatica<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaNinja" && varLaminaDeVento>=1 && varPericiaNinja<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LaminaDeVento" && varDescargaEletrica>=1 && varLaminaDeVento<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaNinja" && varBrisaCortante>=1 && varPericiaNinja<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DescargaEletrica" && varBrisaCortante>=1 && varDescargaEletrica<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PraticaDeArremessoDeShuriken" && varArremessarShuriken>=1 && varPraticaDeArremessoDeShuriken<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArremessarKunai" && varArremessarShurikenHuuma>=1 && varArremessarKunai<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PraticaDeArremessoDeShuriken" && varArremessarShurikenHuuma>=1 && varPraticaDeArremessoDeShuriken<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArremessarShuriken" && varArremessarKunai>=1 && varArremessarShuriken<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArremessarShurikenHuuma" && varChuvaDeMoedas>=1 && varArremessarShurikenHuuma<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PraticaDeArremessoDeShuriken" && varChuvaDeMoedas>=1 && varPraticaDeArremessoDeShuriken<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="VirarTatami" && varSaltoDasSombras>=1 && varVirarTatami<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="SaltoDasSombras" && varCorteDaNevoa>=1 && varSaltoDasSombras<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CorteDaNevoa" && varCorteDasSombras>=1 && varCorteDaNevoa<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AuraNinja" && varAtaqueMortal>=1 && varAuraNinja<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CorteDasSombras" && varAtaqueMortal>=1 && varCorteDasSombras<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PraticaDeArremessoDeShuriken" && varAtaqueMortal>=1 && varPraticaDeArremessoDeShuriken<=07){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Inspiracao" && varVoragemEspiritual>=1 && varInspiracao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArremessarAmuletoEspiritual" && varVoragemEspiritual>=1 && varArremessarAmuletoEspiritual<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AmuletoEspiritualAgua" && varArremessarAmuletoEspiritual>=1 && varAmuletoEspiritualAgua<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AmuletoEspiritualFogo" && varArremessarAmuletoEspiritual>=1 && varAmuletoEspiritualFogo<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AmuletoEspiritualTerra" && varArremessarAmuletoEspiritual>=1 && varAmuletoEspiritualTerra<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="AmuletoEspiritualVento" && varArremessarAmuletoEspiritual>=1 && varAmuletoEspiritualVento<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ImpactoCruzado" && varCorteEspiritual>=1 && varImpactoCruzado<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="GenjutsuCloneDasSombras" && varGenjutsuAssaltoDasSombras>=1 && varGenjutsuCloneDasSombras<=02){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="GenjutsuAssaltoDasSombras" && varGenjutsuChamadoDaMorte>=1 && varGenjutsuAssaltoDasSombras<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TrocaDePele" && varGenjutsuCloneDasSombras>=1 && varTrocaDePele<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="TrocaDePele" && varGenjutsuSubstituicao>=1 && varTrocaDePele<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArremessarKunai" && varKunaiExplosiva>=1 && varArremessarKunai<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="KunaiExplosiva" && varTurbilhaoDeKunais>=1 && varKunaiExplosiva<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ArremessarShurikenHuuma" && varTurbilhaoDePetalas>=1 && varArremessarShurikenHuuma<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="ChuvaDeMoedas" && varEstrepes>=1 && varChuvaDeMoedas<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaNinja" && varPurificacaoDaAlma>=1 && varPericiaNinja<=10){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="PericiaNinja" && varInspiracao>=1 && varPericiaNinja<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="CorteDasSombras" && varRefugioDasSombras>=1 && varCorteDasSombras<=05){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="Estrepes" && varExplosaoDeMoedas>=1 && varEstrepes<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="RefugioDasSombras" && varImpactoCruzado>=1 && varRefugioDasSombras<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="GenjutsuSubstituicao" && varDistorcaoCrescente>=1 && varGenjutsuSubstituicao<=01){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="LuarSinistro" && varIlusaoDoLuar>=1 && varLuarSinistro<=03){
					podeDiminuir = false;
				}

				if (nomeDaHabilidade=="DistorcaoCrescente" && varLuarSinistro>=1 && varDistorcaoCrescente<=02){
					podeDiminuir = false;
				}


				if(podeDiminuir){
					if (habilidade>0){
						habilidade--;

						if (classe==1){
							if (skillPrimeira>0 && skillPrimeira<=69 && primeiraClasse <69){
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
			if(nomeDaHabilidade=="AuraNinja"){
				varAuraNinja = habilidade;
			} else if(nomeDaHabilidade=="PericiaNinja"){
				varPericiaNinja = habilidade;
			} else if(nomeDaHabilidade=="ImagemFalsa"){
				varImagemFalsa = habilidade;
			} else if(nomeDaHabilidade=="TrocaDePele"){
				varTrocaDePele = habilidade;
			} else if(nomeDaHabilidade=="PetalasFlamejantes"){
				varPetalasFlamejantes = habilidade;
			} else if(nomeDaHabilidade=="EscudoDeChamas"){
				varEscudoDeChamas = habilidade;
			} else if(nomeDaHabilidade=="DragaoExplosivo"){
				varDragaoExplosivo = habilidade;
			} else if(nomeDaHabilidade=="LancaCongelante"){
				varLancaCongelante = habilidade;
			} else if(nomeDaHabilidade=="EvasaoAquatica"){
				varEvasaoAquatica = habilidade;
			} else if(nomeDaHabilidade=="GrandeFlocoDeNeve"){
				varGrandeFlocoDeNeve = habilidade;
			} else if(nomeDaHabilidade=="LaminaDeVento"){
				varLaminaDeVento = habilidade;
			} else if(nomeDaHabilidade=="DescargaEletrica"){
				varDescargaEletrica = habilidade;
			} else if(nomeDaHabilidade=="BrisaCortante"){
				varBrisaCortante = habilidade;
			} else if(nomeDaHabilidade=="PraticaDeArremessoDeShuriken"){
				varPraticaDeArremessoDeShuriken = habilidade;
			} else if(nomeDaHabilidade=="ArremessarShuriken"){
				varArremessarShuriken = habilidade;
			} else if(nomeDaHabilidade=="ArremessarShurikenHuuma"){
				varArremessarShurikenHuuma = habilidade;
			} else if(nomeDaHabilidade=="ArremessarKunai"){
				varArremessarKunai = habilidade;
			} else if(nomeDaHabilidade=="ChuvaDeMoedas"){
				varChuvaDeMoedas = habilidade;
			} else if(nomeDaHabilidade=="VirarTatami"){
				varVirarTatami = habilidade;
			} else if(nomeDaHabilidade=="SaltoDasSombras"){
				varSaltoDasSombras = habilidade;
			} else if(nomeDaHabilidade=="CorteDaNevoa"){
				varCorteDaNevoa = habilidade;
			} else if(nomeDaHabilidade=="CorteDasSombras"){
				varCorteDasSombras = habilidade;
			} else if(nomeDaHabilidade=="AtaqueMortal"){
				varAtaqueMortal = habilidade;
			}

			else if(nomeDaHabilidade=="VoragemEspiritual"){
				varVoragemEspiritual = habilidade;
			} else if(nomeDaHabilidade=="AmuletoEspiritualAgua"){
				varAmuletoEspiritualAgua = habilidade;
			} else if(nomeDaHabilidade=="AmuletoEspiritualFogo"){
				varAmuletoEspiritualFogo = habilidade;
			} else if(nomeDaHabilidade=="AmuletoEspiritualTerra"){
				varAmuletoEspiritualTerra = habilidade;
			} else if(nomeDaHabilidade=="AmuletoEspiritualVento"){
				varAmuletoEspiritualVento = habilidade;
			} else if(nomeDaHabilidade=="ArremessarAmuletoEspiritual"){
				varArremessarAmuletoEspiritual = habilidade;
			} else if(nomeDaHabilidade=="CorteEspiritual"){
				varCorteEspiritual = habilidade;
			} else if(nomeDaHabilidade=="GenjutsuAssaltoDasSombras"){
				varGenjutsuAssaltoDasSombras = habilidade;
			} else if(nomeDaHabilidade=="GenjutsuChamadoDaMorte"){
				varGenjutsuChamadoDaMorte = habilidade;
			} else if(nomeDaHabilidade=="GenjutsuCloneDasSombras"){
				varGenjutsuCloneDasSombras = habilidade;
			} else if(nomeDaHabilidade=="GenjutsuSubstituicao"){
				varGenjutsuSubstituicao = habilidade;
			} else if(nomeDaHabilidade=="KunaiExplosiva"){
				varKunaiExplosiva = habilidade;
			} else if(nomeDaHabilidade=="TurbilhaoDeKunais"){
				varTurbilhaoDeKunais = habilidade;
			} else if(nomeDaHabilidade=="TurbilhaoDePetalas"){
				varTurbilhaoDePetalas = habilidade;
			} else if(nomeDaHabilidade=="Estrepes"){
				varEstrepes = habilidade;
			} else if(nomeDaHabilidade=="PurificacaoDaAlma"){
				varPurificacaoDaAlma = habilidade;
			} else if(nomeDaHabilidade=="Inspiracao"){
				varInspiracao = habilidade;
			} else if(nomeDaHabilidade=="RefugioDasSombras"){
				varRefugioDasSombras = habilidade;
			} else if(nomeDaHabilidade=="ExplosaoDeMoedas"){
				varExplosaoDeMoedas = habilidade;
			} else if(nomeDaHabilidade=="ImpactoCruzado"){
				varImpactoCruzado = habilidade;
			} else if(nomeDaHabilidade=="PericiaComMaoDireita"){
				varPericiaComMaoDireita = habilidade;
			} else if(nomeDaHabilidade=="PericiaComMaoEsquerda"){
				varPericiaComMaoEsquerda = habilidade;
			} else if(nomeDaHabilidade=="DistorcaoCrescente"){
				varDistorcaoCrescente = habilidade;
			} else if(nomeDaHabilidade=="IlusaoDoLuar"){
				varIlusaoDoLuar = habilidade;
			} else if(nomeDaHabilidade=="LuarSinistro"){
				varLuarSinistro = habilidade;
			}

			atualizarTela();

		}

		public void atualizarTela(){
			txtAuraNinjaPontos.setText(varAuraNinja + "/5");
			txtPericiaNinjaPontos.setText(varPericiaNinja + "/10");
			txtImagemFalsaPontos.setText(varImagemFalsa + "/10");
			txtTrocaDePelePontos.setText(varTrocaDePele + "/5");
			txtPetalasFlamejantesPontos.setText(varPetalasFlamejantes + "/10");
			txtEscudoDeChamasPontos.setText(varEscudoDeChamas + "/10");
			txtDragaoExplosivoPontos.setText(varDragaoExplosivo + "/5");
			txtLancaCongelantePontos.setText(varLancaCongelante + "/10");
			txtEvasaoAquaticaPontos.setText(varEvasaoAquatica + "/10");
			txtGrandeFlocoDeNevePontos.setText(varGrandeFlocoDeNeve + "/5");
			txtLaminaDeVentoPontos.setText(varLaminaDeVento + "/10");
			txtDescargaEletricaPontos.setText(varDescargaEletrica + "/5");
			txtBrisaCortantePontos.setText(varBrisaCortante + "/5");
			txtPraticaDeArremessoDeShurikenPontos.setText(varPraticaDeArremessoDeShuriken + "/10");
			txtArremessarShurikenPontos.setText(varArremessarShuriken + "/10");
			txtArremessarShurikenHuumaPontos.setText(varArremessarShurikenHuuma + "/5");
			txtArremessarKunaiPontos.setText(varArremessarKunai + "/5");
			txtChuvaDeMoedasPontos.setText(varChuvaDeMoedas + "/10");
			txtVirarTatamiPontos.setText(varVirarTatami + "/5");
			txtSaltoDasSombrasPontos.setText(varSaltoDasSombras + "/5");
			txtCorteDaNevoaPontos.setText(varCorteDaNevoa + "/10");
			txtCorteDasSombrasPontos.setText(varCorteDasSombras + "/5");
			txtAtaqueMortalPontos.setText(varAtaqueMortal + "/10");

			txtVoragemEspiritualPontos.setText(varVoragemEspiritual + "/1");
			txtAmuletoEspiritualAguaPontos.setText(varAmuletoEspiritualAgua + "/1");
			txtAmuletoEspiritualFogoPontos.setText(varAmuletoEspiritualFogo + "/1");
			txtAmuletoEspiritualTerraPontos.setText(varAmuletoEspiritualTerra + "/1");
			txtAmuletoEspiritualVentoPontos.setText(varAmuletoEspiritualVento + "/1");
			txtArremessarAmuletoEspiritualPontos.setText(varArremessarAmuletoEspiritual + "/1");
			txtCorteEspiritualPontos.setText(varCorteEspiritual + "/5");
			txtGenjutsuAssaltoDasSombrasPontos.setText(varGenjutsuAssaltoDasSombras + "/5");
			txtGenjutsuChamadoDaMortePontos.setText(varGenjutsuChamadoDaMorte + "/5");
			txtGenjutsuCloneDasSombrasPontos.setText(varGenjutsuCloneDasSombras + "/5");
			txtGenjutsuSubstituicaoPontos.setText(varGenjutsuSubstituicao + "/5");
			txtKunaiExplosivaPontos.setText(varKunaiExplosiva + "/5");
			txtTurbilhaoDeKunaisPontos.setText(varTurbilhaoDeKunais + "/5");
			txtTurbilhaoDePetalasPontos.setText(varTurbilhaoDePetalas + "/5");
			txtEstrepesPontos.setText(varEstrepes + "/5");
			txtPurificacaoDaAlmaPontos.setText(varPurificacaoDaAlma + "/5");
			txtInspiracaoPontos.setText(varInspiracao + "/5");
			txtRefugioDasSombrasPontos.setText(varRefugioDasSombras + "/1");
			txtExplosaoDeMoedasPontos.setText(varExplosaoDeMoedas + "/10");
			txtImpactoCruzadoPontos.setText(varImpactoCruzado + "/5");
			txtPericiaComMaoDireitaPontos.setText(varPericiaComMaoDireita + "/5");
			txtPericiaComMaoEsquerdaPontos.setText(varPericiaComMaoEsquerda + "/5");
			txtDistorcaoCrescentePontos.setText(varDistorcaoCrescente + "/5");
			txtIlusaoDoLuarPontos.setText(varIlusaoDoLuar + "/5");
			txtLuarSinistroPontos.setText(varLuarSinistro + "/5");

			txtClasse1.setText("Classe 1: " + primeiraClasse);
			txtClasse2.setText("Classe 2: " + segundaClasse);

			tudoVisivel();
		}

		public void tudoVisivel(){
			layAuraNinja.setVisibility(View.VISIBLE);
			layPericiaNinja.setVisibility(View.VISIBLE);
			layImagemFalsa.setVisibility(View.VISIBLE);
			layTrocaDePele.setVisibility(View.VISIBLE);
			layPetalasFlamejantes.setVisibility(View.VISIBLE);
			layEscudoDeChamas.setVisibility(View.VISIBLE);
			layDragaoExplosivo.setVisibility(View.VISIBLE);
			layLancaCongelante.setVisibility(View.VISIBLE);
			layEvasaoAquatica.setVisibility(View.VISIBLE);
			layGrandeFlocoDeNeve.setVisibility(View.VISIBLE);
			layLaminaDeVento.setVisibility(View.VISIBLE);
			layDescargaEletrica.setVisibility(View.VISIBLE);
			layBrisaCortante.setVisibility(View.VISIBLE);
			layPraticaDeArremessoDeShuriken.setVisibility(View.VISIBLE);
			layArremessarShuriken.setVisibility(View.VISIBLE);
			layArremessarShurikenHuuma.setVisibility(View.VISIBLE);
			layArremessarKunai.setVisibility(View.VISIBLE);
			layChuvaDeMoedas.setVisibility(View.VISIBLE);
			layVirarTatami.setVisibility(View.VISIBLE);
			laySaltoDasSombras.setVisibility(View.VISIBLE);
			layCorteDaNevoa.setVisibility(View.VISIBLE);
			layCorteDasSombras.setVisibility(View.VISIBLE);
			layAtaqueMortal.setVisibility(View.VISIBLE);

			layVoragemEspiritual.setVisibility(View.VISIBLE);
			layAmuletoEspiritualAgua.setVisibility(View.VISIBLE);
			layAmuletoEspiritualFogo.setVisibility(View.VISIBLE);
			layAmuletoEspiritualTerra.setVisibility(View.VISIBLE);
			layAmuletoEspiritualVento.setVisibility(View.VISIBLE);
			layArremessarAmuletoEspiritual.setVisibility(View.VISIBLE);
			layCorteEspiritual.setVisibility(View.VISIBLE);
			layGenjutsuAssaltoDasSombras.setVisibility(View.VISIBLE);
			layGenjutsuChamadoDaMorte.setVisibility(View.VISIBLE);
			layGenjutsuCloneDasSombras.setVisibility(View.VISIBLE);
			layGenjutsuSubstituicao.setVisibility(View.VISIBLE);
			layKunaiExplosiva.setVisibility(View.VISIBLE);
			layTurbilhaoDeKunais.setVisibility(View.VISIBLE);
			layTurbilhaoDePetalas.setVisibility(View.VISIBLE);
			layEstrepes.setVisibility(View.VISIBLE);
			layPurificacaoDaAlma.setVisibility(View.VISIBLE);
			layInspiracao.setVisibility(View.VISIBLE);
			layRefugioDasSombras.setVisibility(View.VISIBLE);
			layExplosaoDeMoedas.setVisibility(View.VISIBLE);
			layImpactoCruzado.setVisibility(View.VISIBLE);
			layPericiaComMaoDireita.setVisibility(View.VISIBLE);
			layPericiaComMaoEsquerda.setVisibility(View.VISIBLE);
			layDistorcaoCrescente.setVisibility(View.VISIBLE);
			layIlusaoDoLuar.setVisibility(View.VISIBLE);
			layLuarSinistro.setVisibility(View.VISIBLE);
			tgbtSomenteHabilidadeAprendida.setChecked(false);
		}

		public void recarregarBuild(int id){
			try {
			SQLiteDatabase db = openOrCreateDatabase("simulador.db", Context.MODE_PRIVATE, null);
			Cursor cs = db.rawQuery("SELECT * FROM oboro WHERE _id = ?", new String[]{String.valueOf(id)});

			if(cs.moveToFirst()){
			primeiraClasse = cs.getInt(2);
			segundaClasse = cs.getInt(3);

			varAuraNinja = cs.getInt(4);
			varPericiaNinja = cs.getInt(5);
			varImagemFalsa = cs.getInt(6);
			varTrocaDePele = cs.getInt(7);
			varPetalasFlamejantes = cs.getInt(8);
			varEscudoDeChamas = cs.getInt(9);
			varDragaoExplosivo = cs.getInt(10);
			varLancaCongelante = cs.getInt(11);
			varEvasaoAquatica = cs.getInt(12);
			varGrandeFlocoDeNeve = cs.getInt(13);
			varLaminaDeVento = cs.getInt(14);
			varDescargaEletrica = cs.getInt(15);
			varBrisaCortante = cs.getInt(16);
			varPraticaDeArremessoDeShuriken = cs.getInt(17);
			varArremessarShuriken = cs.getInt(18);
			varArremessarShurikenHuuma = cs.getInt(19);
			varArremessarKunai = cs.getInt(20);
			varChuvaDeMoedas = cs.getInt(21);
			varVirarTatami = cs.getInt(22);
			varSaltoDasSombras = cs.getInt(23);
			varCorteDaNevoa = cs.getInt(24);
			varCorteDasSombras = cs.getInt(25);
			varAtaqueMortal = cs.getInt(26);

			varVoragemEspiritual = cs.getInt(27);
			varAmuletoEspiritualAgua = cs.getInt(28);
			varAmuletoEspiritualFogo = cs.getInt(29);
			varAmuletoEspiritualTerra = cs.getInt(30);
			varAmuletoEspiritualVento = cs.getInt(31);
			varArremessarAmuletoEspiritual = cs.getInt(32);
			varCorteEspiritual = cs.getInt(33);
			varGenjutsuAssaltoDasSombras = cs.getInt(34);
			varGenjutsuChamadoDaMorte = cs.getInt(35);
			varGenjutsuCloneDasSombras = cs.getInt(36);
			varGenjutsuSubstituicao = cs.getInt(37);
			varKunaiExplosiva = cs.getInt(38);
			varTurbilhaoDeKunais = cs.getInt(39);
			varTurbilhaoDePetalas = cs.getInt(40);
			varEstrepes = cs.getInt(41);
			varPurificacaoDaAlma = cs.getInt(42);
			varInspiracao = cs.getInt(43);
			varRefugioDasSombras = cs.getInt(44);
			varExplosaoDeMoedas = cs.getInt(45);
			varImpactoCruzado = cs.getInt(46);
			varPericiaComMaoDireita = cs.getInt(47);
			varPericiaComMaoEsquerda = cs.getInt(48);
			varDistorcaoCrescente = cs.getInt(49);
			varIlusaoDoLuar = cs.getInt(50);
			varLuarSinistro = cs.getInt(51);

			skillPrimeira = cs.getInt(52);
			skillSegunda = cs.getInt(53);
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
					sqlClasse.append("CREATE TABLE IF NOT EXISTS oboro (");
					sqlClasse.append("_id INTEGER PRIMARY KEY, ");
					sqlClasse.append("nome VARCHAR(30), ");
					sqlClasse.append("primeira_classe INT(2), ");
					sqlClasse.append("segunda_classe INT(2), ");
					sqlClasse.append("skill_auraninja INT(2), ");
					sqlClasse.append("skill_pericianinja INT(2), ");
					sqlClasse.append("skill_imagemfalsa INT(2), ");
					sqlClasse.append("skill_trocadepele INT(2), ");
					sqlClasse.append("skill_petalasflamejantes INT(2), ");
					sqlClasse.append("skill_escudodechamas INT(2), ");
					sqlClasse.append("skill_dragaoexplosivo INT(2), ");
					sqlClasse.append("skill_lancacongelante INT(2), ");
					sqlClasse.append("skill_evasaoaquatica INT(2), ");
					sqlClasse.append("skill_grandeflocodeneve INT(2), ");
					sqlClasse.append("skill_laminadevento INT(2), ");
					sqlClasse.append("skill_descargaeletrica INT(2), ");
					sqlClasse.append("skill_brisacortante INT(2), ");
					sqlClasse.append("skill_praticadearremessodeshuriken INT(2), ");
					sqlClasse.append("skill_arremessarshuriken INT(2), ");
					sqlClasse.append("skill_arremessarshurikenhuuma INT(2), ");
					sqlClasse.append("skill_arremessarkunai INT(2), ");
					sqlClasse.append("skill_chuvademoedas INT(2), ");
					sqlClasse.append("skill_virartatami INT(2), ");
					sqlClasse.append("skill_saltodassombras INT(2), ");
					sqlClasse.append("skill_cortedanevoa INT(2), ");
					sqlClasse.append("skill_cortedassombras INT(2), ");
					sqlClasse.append("skill_ataquemortal INT(2), ");
					sqlClasse.append("skill_voragemespiritual INT(2), ");
					sqlClasse.append("skill_amuletoespiritualagua INT(2), ");
					sqlClasse.append("skill_amuletoespiritualfogo INT(2), ");
					sqlClasse.append("skill_amuletoespiritualterra INT(2), ");
					sqlClasse.append("skill_amuletoespiritualvento INT(2), ");
					sqlClasse.append("skill_arremessaramuletoespiritual INT(2), ");
					sqlClasse.append("skill_corteespiritual INT(2), ");
					sqlClasse.append("skill_genjutsuassaltodassombras INT(2), ");
					sqlClasse.append("skill_genjutsuchamadodamorte INT(2), ");
					sqlClasse.append("skill_genjutsuclonedassombras INT(2), ");
					sqlClasse.append("skill_genjutsusubstituicao INT(2), ");
					sqlClasse.append("skill_kunaiexplosiva INT(2), ");
					sqlClasse.append("skill_turbilhaodekunais INT(2), ");
					sqlClasse.append("skill_turbilhaodepetalas INT(2), ");
					sqlClasse.append("skill_estrepes INT(2), ");
					sqlClasse.append("skill_purificacaodaalma INT(2), ");
					sqlClasse.append("skill_inspiracao INT(2), ");
					sqlClasse.append("skill_refugiodassombras INT(2), ");
					sqlClasse.append("skill_explosaodemoedas INT(2), ");
					sqlClasse.append("skill_impactocruzado INT(2), ");
					sqlClasse.append("skill_periciacommaodireita INT(2), ");
					sqlClasse.append("skill_periciacommaoesquerda INT(2), ");
					sqlClasse.append("skill_distorcaocrescente INT(2), ");
					sqlClasse.append("skill_ilusaodoluar INT(2), ");
					sqlClasse.append("skill_luarsinistro INT(2), ");
					sqlClasse.append("skill_primeira INT(2), ");
					sqlClasse.append("skill_segunda INT(2));");
					db.execSQL(sqlClasse.toString());

					ContentValues ins = new ContentValues();
					ins.put("nome", nomeDaSim);
					ins.put("primeira_classe", primeiraClasse);
					ins.put("segunda_classe", segundaClasse);
					ins.put("skill_auraninja", varAuraNinja);
					ins.put("skill_pericianinja", varPericiaNinja);
					ins.put("skill_imagemfalsa", varImagemFalsa);
					ins.put("skill_trocadepele", varTrocaDePele);
					ins.put("skill_petalasflamejantes", varPetalasFlamejantes);
					ins.put("skill_escudodechamas", varEscudoDeChamas);
					ins.put("skill_dragaoexplosivo", varDragaoExplosivo);
					ins.put("skill_lancacongelante", varLancaCongelante);
					ins.put("skill_evasaoaquatica", varEvasaoAquatica);
					ins.put("skill_grandeflocodeneve", varGrandeFlocoDeNeve);
					ins.put("skill_laminadevento", varLaminaDeVento);
					ins.put("skill_descargaeletrica", varDescargaEletrica);
					ins.put("skill_brisacortante", varBrisaCortante);
					ins.put("skill_praticadearremessodeshuriken", varPraticaDeArremessoDeShuriken);
					ins.put("skill_arremessarshuriken", varArremessarShuriken);
					ins.put("skill_arremessarshurikenhuuma", varArremessarShurikenHuuma);
					ins.put("skill_arremessarkunai", varArremessarKunai);
					ins.put("skill_chuvademoedas", varChuvaDeMoedas);
					ins.put("skill_virartatami", varVirarTatami);
					ins.put("skill_saltodassombras", varSaltoDasSombras);
					ins.put("skill_cortedanevoa", varCorteDaNevoa);
					ins.put("skill_cortedassombras", varCorteDasSombras);
					ins.put("skill_ataquemortal", varAtaqueMortal);
					ins.put("skill_voragemespiritual", varVoragemEspiritual);
					ins.put("skill_amuletoespiritualagua", varAmuletoEspiritualAgua);
					ins.put("skill_amuletoespiritualfogo", varAmuletoEspiritualFogo);
					ins.put("skill_amuletoespiritualterra", varAmuletoEspiritualTerra);
					ins.put("skill_amuletoespiritualvento", varAmuletoEspiritualVento);
					ins.put("skill_arremessaramuletoespiritual", varArremessarAmuletoEspiritual);
					ins.put("skill_corteespiritual", varCorteEspiritual);
					ins.put("skill_genjutsuassaltodassombras", varGenjutsuAssaltoDasSombras);
					ins.put("skill_genjutsuchamadodamorte", varGenjutsuChamadoDaMorte);
					ins.put("skill_genjutsuclonedassombras", varGenjutsuCloneDasSombras);
					ins.put("skill_genjutsusubstituicao", varGenjutsuSubstituicao);
					ins.put("skill_kunaiexplosiva", varKunaiExplosiva);
					ins.put("skill_turbilhaodekunais", varTurbilhaoDeKunais);
					ins.put("skill_turbilhaodepetalas", varTurbilhaoDePetalas);
					ins.put("skill_estrepes", varEstrepes);
					ins.put("skill_purificacaodaalma", varPurificacaoDaAlma);
					ins.put("skill_inspiracao", varInspiracao);
					ins.put("skill_refugiodassombras", varRefugioDasSombras);
					ins.put("skill_explosaodemoedas", varExplosaoDeMoedas);
					ins.put("skill_impactocruzado", varImpactoCruzado);
					ins.put("skill_periciacommaodireita", varPericiaComMaoDireita);
					ins.put("skill_periciacommaoesquerda", varPericiaComMaoEsquerda);
					ins.put("skill_distorcaocrescente", varDistorcaoCrescente);
					ins.put("skill_ilusaodoluar", varIlusaoDoLuar);
					ins.put("skill_luarsinistro", varLuarSinistro);
					ins.put("skill_primeira", skillPrimeira);
					ins.put("skill_segunda", skillSegunda);
					if(!novo){
						try {
							db.update("oboro", ins, idParaAlterar, null);
							Toast.makeText(getBaseContext(), "Alterações salvas!",
									Toast.LENGTH_SHORT).show();
						} catch (Exception e) {
							Toast.makeText(getBaseContext(), "Erro ao salvar!",
									Toast.LENGTH_SHORT).show();
						}
					} else {
					if (db.insert("oboro", "_id", ins) > 0) {
						Toast.makeText(getBaseContext(), "Salvando...",
								Toast.LENGTH_SHORT).show();
						Cursor cs = db.rawQuery("SELECT * from oboro", null);
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
						ins2.put("classe", "oboro");
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