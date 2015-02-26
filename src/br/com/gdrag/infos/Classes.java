package br.com.gdrag.infos;

import br.com.gdrag.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Classes extends Activity {

	
	ArrayAdapter aClassesIniciais;
	ArrayAdapter aClassesEvoluidas;
	Spinner spnclassesiniciais;
	Spinner spnclassesevoluidas;
	ImageView imgpersona;
	
	TextView txtatributos;
	TextView txtforca;
	TextView txtagilidade;
	TextView txtvitalidade;
	TextView txtinteligencia;
	TextView txtdestreza;
	TextView txtsorte;
	TextView txtdescricao;
	
	
	int escolha1 = 0;
	int escolha2 = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_classes);
		
		imgpersona = (ImageView) findViewById(R.id.imgpersona);
		
		txtatributos = (TextView) findViewById(R.id.txtatributos);
		txtforca = (TextView) findViewById(R.id.txtforca);
		txtagilidade = (TextView) findViewById(R.id.txtagilidade);
		txtvitalidade = (TextView) findViewById(R.id.txtvitalidade);
		txtinteligencia = (TextView) findViewById(R.id.txtinteligencia);
		txtdestreza = (TextView) findViewById(R.id.txtdestreza);
		txtsorte = (TextView) findViewById(R.id.txtsorte);
		
		txtdescricao = (TextView) findViewById(R.id.txtdescricao);
		
		spnclassesiniciais = (Spinner) findViewById(R.id.spnclassesiniciais);
		aClassesIniciais = ArrayAdapter.createFromResource(this, R.array.classesIniciais, R.layout.spinner_item);
		aClassesIniciais.setDropDownViewResource(R.layout.spinner_dropdown_item);
		spnclassesiniciais.setAdapter(aClassesIniciais);
		
		spnclassesevoluidas = (Spinner) findViewById(R.id.spnevolucao);
		aClassesEvoluidas = ArrayAdapter.createFromResource(this, R.array.evolucoesAprendiz, R.layout.spinner_item);
		aClassesEvoluidas.setDropDownViewResource(R.layout.spinner_dropdown_item);
		spnclassesevoluidas.setAdapter(aClassesEvoluidas);
		
		//Spinner inicial
		spnclassesiniciais.setOnItemSelectedListener(new OnItemSelectedListener() {

			
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				escolha1 = (int) spnclassesiniciais.getSelectedItemPosition();
				
				if (escolha1==0)
					atualizar("Aprendiz");
				if (escolha1==1)
					atualizar("Arqueiro");
				if (escolha1==2)
					atualizar("Espadachin");
				if (escolha1==3)
					atualizar("Gatuno");
				if (escolha1==4)
					atualizar("Justiceiro");
				if (escolha1==5)
					atualizar("Mago");
				if (escolha1==6)
					atualizar("Mercador");
				if (escolha1==7)
					atualizar("Ninja");
				if (escolha1==8)
					atualizar("Novico");
				if (escolha1==9)
					atualizar("Taekwon");
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//Spinner das classes evoluidas
		spnclassesevoluidas.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				escolha2 = (int) spnclassesevoluidas.getSelectedItemPosition();
				
				//aprendiz
				if(escolha1==0 && escolha2==0)
					atualizar("Aprendiz");
				if(escolha1==0 && escolha2==1)
					atualizar("SuperAprendiz");
				if(escolha1==0 && escolha2==2)
					atualizar("SuperAprendizExp");
				
				//arqueiro
				if(escolha1==1 && escolha2==1)
					atualizar("Arqueiro");
				if(escolha1==1 && escolha2==3)
					atualizar("Cacador");
				if(escolha1==1 && escolha2==4)
					atualizar("Bardo");
				if(escolha1==1 && escolha2==5)
					atualizar("Odalisca");
				if(escolha1==1 && escolha2==7)
					atualizar("AtiradorDeElite");
				if(escolha1==1 && escolha2==8)
					atualizar("Menestrel");
				if(escolha1==1 && escolha2==9)
					atualizar("Cigana");
				if(escolha1==1 && escolha2==11)
					atualizar("Sentinela");
				if(escolha1==1 && escolha2==12)
					atualizar("Trovador");
				if(escolha1==1 && escolha2==13)
					atualizar("Musa");
				
				//espadachin
				if(escolha1==2 && escolha2==1)
					atualizar("Espadachin");
				if(escolha1==2 && escolha2==3)
					atualizar("Cavaleiro");
				if(escolha1==2 && escolha2==4)
					atualizar("Templario");
				if(escolha1==2 && escolha2==6)
					atualizar("Lorde");
				if(escolha1==2 && escolha2==7)
					atualizar("Paladino");
				if(escolha1==2 && escolha2==9)
					atualizar("CavaleiroRunico");
				if(escolha1==2 && escolha2==10)
					atualizar("GuardiaoReal");
				
				//gatuno
				if(escolha1==3 && escolha2==1)
					atualizar("Gatuno");
				if(escolha1==3 && escolha2==3)
					atualizar("Mercenario");
				if(escolha1==3 && escolha2==4)
					atualizar("Arruaceiro");
				if(escolha1==3 && escolha2==6)
					atualizar("Algoz");
				if(escolha1==3 && escolha2==7)
					atualizar("Desordeiro");
				if(escolha1==3 && escolha2==9)
					atualizar("Sicario");
				if(escolha1==3 && escolha2==10)
					atualizar("Renegado");
				
				//justiceiro
				if(escolha1==4 && escolha2==1)
					atualizar("Justiceiro");
				if(escolha1==4 && escolha2==3)
					atualizar("Rebelde");

				//Mago
				if(escolha1==5 && escolha2==1)
					atualizar("Mago");
				if(escolha1==5 && escolha2==3)
					atualizar("Bruxo");
				if(escolha1==5 && escolha2==4)
					atualizar("Sabio");
				if(escolha1==5 && escolha2==6)
					atualizar("Arquimago");
				if(escolha1==5 && escolha2==7)
					atualizar("Professor");
				if(escolha1==5 && escolha2==9)
					atualizar("Arcano");
				if(escolha1==5 && escolha2==10)
					atualizar("Feiticeiro");
				
				//Mercador
				if(escolha1==6 && escolha2==1)
					atualizar("Mercador");
				if(escolha1==6 && escolha2==3)
					atualizar("Ferreiro");
				if(escolha1==6 && escolha2==4)
					atualizar("Alquimista");
				if(escolha1==6 && escolha2==6)
					atualizar("MestreFerreiro");
				if(escolha1==6 && escolha2==7)
					atualizar("Criador");
				if(escolha1==6 && escolha2==9)
					atualizar("Mecanico");
				if(escolha1==6 && escolha2==10)
					atualizar("Bioquimico");
				
				//Ninja
				if(escolha1==7 && escolha2==1)
					atualizar("Ninja");
				if(escolha1==7 && escolha2==3)
					atualizar("Kagerou");
				if(escolha1==7 && escolha2==4)
					atualizar("Oboro");
				
				//Noviço
				if(escolha1==8 && escolha2==1)
					atualizar("Novico");
				if(escolha1==8 && escolha2==3)
					atualizar("Sacerdote");
				if(escolha1==8 && escolha2==4)
					atualizar("Monge");
				if(escolha1==8 && escolha2==6)
					atualizar("SumoSacerdote");
				if(escolha1==8 && escolha2==7)
					atualizar("Mestre");
				if(escolha1==8 && escolha2==9)
					atualizar("Arcebispo");
				if(escolha1==8 && escolha2==10)
					atualizar("Shura");
				
				//Taekwon
				if(escolha1==9 && escolha2==1)
					atualizar("Taekwon");
				if(escolha1==9 && escolha2==3)
					atualizar("MestreTaekwon");
				if(escolha1==9 && escolha2==4)
					atualizar("Espiritualista");
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void atualizar(String escolha){
		if (escolha.equals("Aprendiz")){
			aClassesEvoluidas = ArrayAdapter.createFromResource(this, R.array.evolucoesAprendiz, R.layout.spinner_item);
			aClassesEvoluidas.setDropDownViewResource(R.layout.spinner_dropdown_item);
			spnclassesevoluidas.setAdapter(aClassesEvoluidas);
			spnclassesevoluidas.setSelection(0);
		}
		if (escolha.equals("Arqueiro")){
			aClassesEvoluidas = ArrayAdapter.createFromResource(this, R.array.evolucoesArqueiro, R.layout.spinner_item);
			aClassesEvoluidas.setDropDownViewResource(R.layout.spinner_dropdown_item);
			spnclassesevoluidas.setAdapter(aClassesEvoluidas);
			spnclassesevoluidas.setSelection(1);
		}
		if (escolha.equals("Espadachin")){
			aClassesEvoluidas = ArrayAdapter.createFromResource(this, R.array.evolucoesEspadachin, R.layout.spinner_item);
			aClassesEvoluidas.setDropDownViewResource(R.layout.spinner_dropdown_item);
			spnclassesevoluidas.setAdapter(aClassesEvoluidas);
			spnclassesevoluidas.setSelection(1);
		}
		if (escolha.equals("Gatuno")){
			aClassesEvoluidas = ArrayAdapter.createFromResource(this, R.array.evolucoesGatuno, R.layout.spinner_item);
			aClassesEvoluidas.setDropDownViewResource(R.layout.spinner_dropdown_item);
			spnclassesevoluidas.setAdapter(aClassesEvoluidas);
			spnclassesevoluidas.setSelection(1);
		}
		if (escolha.equals("Justiceiro")){
			aClassesEvoluidas = ArrayAdapter.createFromResource(this, R.array.evolucoesJusticeiro, R.layout.spinner_item);
			aClassesEvoluidas.setDropDownViewResource(R.layout.spinner_dropdown_item);
			spnclassesevoluidas.setAdapter(aClassesEvoluidas);
			spnclassesevoluidas.setSelection(1);
		}
		if (escolha.equals("Mago")){
			aClassesEvoluidas = ArrayAdapter.createFromResource(this, R.array.evolucoesMago, R.layout.spinner_item);
			aClassesEvoluidas.setDropDownViewResource(R.layout.spinner_dropdown_item);
			spnclassesevoluidas.setAdapter(aClassesEvoluidas);
			spnclassesevoluidas.setSelection(1);
		}
		if (escolha.equals("Mercador")){
			aClassesEvoluidas = ArrayAdapter.createFromResource(this, R.array.evolucoesMercador, R.layout.spinner_item);
			aClassesEvoluidas.setDropDownViewResource(R.layout.spinner_dropdown_item);
			spnclassesevoluidas.setAdapter(aClassesEvoluidas);
			spnclassesevoluidas.setSelection(1);
		}
		if (escolha.equals("Ninja")){
			aClassesEvoluidas = ArrayAdapter.createFromResource(this, R.array.evolucoesNinja, R.layout.spinner_item);
			aClassesEvoluidas.setDropDownViewResource(R.layout.spinner_dropdown_item);
			spnclassesevoluidas.setAdapter(aClassesEvoluidas);
			spnclassesevoluidas.setSelection(1);
		}
		if (escolha.equals("Novico")){
			aClassesEvoluidas = ArrayAdapter.createFromResource(this, R.array.evolucoesNovico, R.layout.spinner_item);
			aClassesEvoluidas.setDropDownViewResource(R.layout.spinner_dropdown_item);
			spnclassesevoluidas.setAdapter(aClassesEvoluidas);
			spnclassesevoluidas.setSelection(1);
		}
		if (escolha.equals("Taekwon")){
			aClassesEvoluidas = ArrayAdapter.createFromResource(this, R.array.evolucoesTaekwon, R.layout.spinner_item);
			aClassesEvoluidas.setDropDownViewResource(R.layout.spinner_dropdown_item);
			spnclassesevoluidas.setAdapter(aClassesEvoluidas);
			spnclassesevoluidas.setSelection(1);
		}
		
		//Atualização de tela
		
		if (escolha.equals("Aprendiz")){
			imgpersona.setImageResource(R.drawable.personaaprendiz);
			txtatributos.setText(" Atributos com lv de classe 10:");
			txtforca.setText("Força +0");
			txtagilidade.setText("Agilidade +0");
			txtvitalidade.setText("Vitalidade +0");
			txtinteligencia.setText("Inteligencia +0");
			txtdestreza.setText("Destreza +0");
			txtsorte.setText("Sorte +0");
			
			txtdescricao.setText("	A classe inicial de todo aventureiro de Rune Midgard, apesar de não possuir nenhuma especialidade e ter seu level de classe limitado a 10, é o ponto inicial para se tornar qualquer classe do jogo, além disso os aprendizes não sofrem penalidade de exp ao morrer e quando retornam a vida, tem 50% do seu hp recuperado. Você não precisa de quest para se tornar um aprendiz pois seu personagem já será um aprendiz assim que ele for criado.");
		}
		
		if (escolha.equals("SuperAprendiz")){
			imgpersona.setImageResource(R.drawable.personasuperaprendiz);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +5");
			txtagilidade.setText("Agilidade +5");
			txtvitalidade.setText("Vitalidade +5");
			txtinteligencia.setText("Inteligencia +5");
			txtdestreza.setText("Destreza +5");
			txtsorte.setText("Sorte +5");
			
			txtdescricao.setText("	Mesmo possuindo a fragilidade de um aprendiz, podem ter habilidades de qualquer classe primária do jogo, o que permite criar uma mistura de várias classes, tornando o assim, a classe com maior liberdade de Ragnarok Online. Tem seu limite de level máximo em 99 tanto em base quanto em classe, porém isso muda ao evoluir para um ''Super Aprendiz Expandido'', além disso Super Aprendizes possuem muitos segredos que os tornam ainda mais incríveis.");
		}
		
		if (escolha.equals("SuperAprendizExp")){
			imgpersona.setImageResource(R.drawable.personasuperaprendizexp);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +5");
			txtagilidade.setText("Agilidade +5");
			txtvitalidade.setText("Vitalidade +5");
			txtinteligencia.setText("Inteligencia +5");
			txtdestreza.setText("Destreza +5");
			txtsorte.setText("Sorte +5");
			
			txtdescricao.setText("	Um Super Aprendiz Expandido possui a mesma sprite do Super Aprendiz comum e a dificuldade de upar igual a de uma terceira classe. Ao expandir sua classe de Super Aprendiz, você perderá os bônus de +5 em todos os atributos, porém eles serão recuperados ao atingir level de classe 50. O level máximo de base é aumentado para 150 sem perder o seu level base atual, enquanto isso  o seu level de classe é resetado (porém não perde nenhuma habilidade) e o máximo passa a ser 50, além de liberar as habilidades das classes secundárias do jogo.");
		}
		
		if (escolha.equals("Arqueiro")){
			imgpersona.setImageResource(R.drawable.personaarqueiro);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +3");
			txtagilidade.setText("Agilidade +3");
			txtvitalidade.setText("Vitalidade +1");
			txtinteligencia.setText("Inteligencia +2");
			txtdestreza.setText("Destreza +7");
			txtsorte.setText("Sorte +2");
			
			txtdescricao.setText("	Os arqueiros atacam a longa distancia com velocidade e precisão além de poderem detectar inimigos que estão por perto com uma das suas habilidades, outra vantagem é poder trocar o elemento de sua arma simplesmente trocando de flecha o que permite caçadas focadas no ponto fraco do inimigo, em contra ponto, possuem vitalidade baixa o que dificulta sobreviver quando um inimigo corpo a corpo está te atacando e também dependem muito de suas flechas, então sempre carregue com você algumas flechas reservas ou pegue a habilidade ''Fabricar Flechas''(requer itens para fabricação).");
		}
		
		if (escolha.equals("Cacador")){
			imgpersona.setImageResource(R.drawable.personacacador);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +4");
			txtagilidade.setText("Agilidade +6");
			txtvitalidade.setText("Vitalidade +2");
			txtinteligencia.setText("Inteligencia +4");
			txtdestreza.setText("Destreza +10");
			txtsorte.setText("Sorte +4");
			
			txtdescricao.setText("	Caçadores podem evitar combate corpo a corpo facilmente com suas armadilhas, prendendo os inimigos durante a batalha onde somente você irá atacar. Além de armadilhas comuns que prendem o inimigo, também possuem armadilhas com dano elemental(Armadilha Atordoante, Armadilha Explosiva...) e efeitos negativos(Armadilha Luminosa, Armadilha Congelante...). Outra caracteristica do caçador é poder domesticar um Falcão que ao atacar ignora a defesa do inimigo.");
		}
		
		if (escolha.equals("Bardo")){
			imgpersona.setImageResource(R.drawable.personabardo);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +2");
			txtagilidade.setText("Agilidade +7");
			txtvitalidade.setText("Vitalidade +3");
			txtinteligencia.setText("Inteligencia +5");
			txtdestreza.setText("Destreza +9");
			txtsorte.setText("Sorte +4");
			
			txtdescricao.setText("	Bardo é uma classe focada em suporte, porém diferente dos noviços e evoluções, ele toca alguma musica que causa efeitos positivos para jogadores pertos(conjuração e recarga mais rapida, mais esquiva, mais velocidade de ataque, etc...) e se estiver junto com uma odalisca pode fazer duetos onde terá mais opções de buffs e efeitos negativos para inimigos. Mesmo sendo um suporte, você ainda poderá usar habilidades de arqueiro se equipar um arco.");
		}
		
		if (escolha.equals("Odalisca")){
			imgpersona.setImageResource(R.drawable.personaodalisca);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +2");
			txtagilidade.setText("Agilidade +7");
			txtvitalidade.setText("Vitalidade +3");
			txtinteligencia.setText("Inteligencia +5");
			txtdestreza.setText("Destreza +5");
			txtsorte.setText("Sorte +8");
			
			txtdescricao.setText("	Assim como os bardos, uma classe de suporte que usa a musica para beneficiar sua equipe, utilizando um chicote como arma pode dançar para causar buffs para seus aliados(aumento de critico, aumento de precisão...) ou efeitos negativos para os inimigos(reduzir velocidade de movimento e ataque, diminuir sp...), e assim como um arco, o chicote usa a sua destreza para causar dano no inimigo. Odaliscas também podem alterar sua arma para um arco a qualquer momento, assim podendo utilizar suas habilidades de arqueira.");
		}
		
		if (escolha.equals("AtiradorDeElite")){
			imgpersona.setImageResource(R.drawable.personaatiradordeelite);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +4");
			txtagilidade.setText("Agilidade +11");
			txtvitalidade.setText("Vitalidade +3");
			txtinteligencia.setText("Inteligencia +5");
			txtdestreza.setText("Destreza +14");
			txtsorte.setText("Sorte +8");
			
			txtdescricao.setText("	Um tiro, uma morte. Uma classe com incríveis danos a longa distância agora em seu modo transcendental, onde recebe algumas habilidades novas, melhorando seus atributos, tiros com o arco, velocidade e habilidade com o falcão.");
		}
		
		if (escolha.equals("Menestrel")){
			imgpersona.setImageResource(R.drawable.personamenestrel);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +8");
			txtagilidade.setText("Agilidade +12");
			txtvitalidade.setText("Vitalidade +2");
			txtinteligencia.setText("Inteligencia +5");
			txtdestreza.setText("Destreza +14");
			txtsorte.setText("Sorte +4");
			
			txtdescricao.setText("	Menestrel, a versão transcendental de um Bardo, recebe as mesmas habilidades que uma Odalisca recebe ao transceder, com a unica diferença em seus bônus de atributos por level de classe. Ao transceder se torna um suporte melhor(porém você não precisa ser suporte) e tem mais liberdades em duetos, podendo andar, atacar e utilizar habilidades, além disso, não é mais necessário um arco para soltar suas flechas, com uma habilidade ele utiliza do seu instrumento para atacar com uma metralhadora de flechas sobre o alvo consumindo somente 1 flecha.");
		}
		
		if (escolha.equals("Cigana")){
			imgpersona.setImageResource(R.drawable.personacigana);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +6");
			txtagilidade.setText("Agilidade +14");
			txtvitalidade.setText("Vitalidade +2");
			txtinteligencia.setText("Inteligencia +5");
			txtdestreza.setText("Destreza +16");
			txtsorte.setText("Sorte +2");
			
			txtdescricao.setText("	Cigana, a versão transcendental de uma Odalisca, recebe as mesmas habilidades que um Bardo recebe ao transceder, com a unica diferença em seus bônus de atributos por level de classe. Ao transceder se torna uma suporte melhor(porém você não precisa ser suporte) e tem mais liberdades em duetos, podendo andar, atacar e utilizar habilidades, além disso, não é mais necessário um arco para soltar suas flechas, com uma habilidade ela utiliza do seu instrumento para atacar com uma metralhadora de flechas sobre o alvo consumindo somente 1 flecha.");
		}
		
		if (escolha.equals("Sentinela")){
			imgpersona.setImageResource(R.drawable.personasentinela);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +2");
			txtagilidade.setText("Agilidade +8");
			txtvitalidade.setText("Vitalidade +5");
			txtinteligencia.setText("Inteligencia +8");
			txtdestreza.setText("Destreza +6");
			txtsorte.setText("Sorte +0");
			
			txtdescricao.setText("	Sentinelas são ainda melhores que Atiradores de Elite na maestria com arco, com as habilidades novas, um Sentinela pode se camuflar para não ser detectado e ainda desferir um bom dano em um ataque surpresa, além disso, contam com armadilhas ainda mais poderosas e podem domesticar um lobo(Worg) que te ajudará em combate e também pode servir de montaria, ajudando sua locomoção pelos mapas.");
		}
		
		if (escolha.equals("Trovador")){
			imgpersona.setImageResource(R.drawable.personatrovador);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +5");
			txtagilidade.setText("Agilidade +4");
			txtvitalidade.setText("Vitalidade +5");
			txtinteligencia.setText("Inteligencia +8");
			txtdestreza.setText("Destreza +6");
			txtsorte.setText("Sorte +0");
			
			txtdescricao.setText("	Trovador, a ultima classe de um bardo, assim como uma Musa, possuem poderes musicais incríveis que tanto podem beneficiar seu grupo ou acabar com o grupo inimigo, além disso trovadores podem conjurar algumas habilidades de magos e bruxos aleatóriamente. Ao se juntar com sua dupla(Musa) libera as danças e canções de dueto.");
		}
		
		if (escolha.equals("Musa")){
			imgpersona.setImageResource(R.drawable.personamusa);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +2");
			txtagilidade.setText("Agilidade +8");
			txtvitalidade.setText("Vitalidade +5");
			txtinteligencia.setText("Inteligencia +8");
			txtdestreza.setText("Destreza +6");
			txtsorte.setText("Sorte +0");
			
			txtdescricao.setText("	Musa, a ultima classe de uma odalisca, assim como um Trovador, possuem poderes musicais incríveis que tanto podem beneficiar seu grupo ou acabar com o grupo inimigo, além disso musas podem conjurar algumas habilidades de magos e bruxos aleatóriamente. Ao se juntar com sua dupla(Trovador) libera as danças e canções de dueto.");
		}
		
		if (escolha.equals("Espadachin")){
			imgpersona.setImageResource(R.drawable.personaespadachin);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +7");
			txtagilidade.setText("Agilidade +2");
			txtvitalidade.setText("Vitalidade +4");
			txtinteligencia.setText("Inteligencia +0");
			txtdestreza.setText("Destreza +3");
			txtsorte.setText("Sorte +2");
			
			txtdescricao.setText("	Com as armaduras mais defensivas, as armas com os maiores danos, e seu vigor, os espadachins são ótimos para a frente de batalha, podendo utilizar espadas de uma ou duas mãos, até lanças. Espadachins também possuem habilidades para regenerar sua vida.");
		}
		
		if (escolha.equals("Cavaleiro")){
			imgpersona.setImageResource(R.drawable.personacavaleiro);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +8");
			txtagilidade.setText("Agilidade +2");
			txtvitalidade.setText("Vitalidade +10");
			txtinteligencia.setText("Inteligencia +0");
			txtdestreza.setText("Destreza +6");
			txtsorte.setText("Sorte +4");
			
			txtdescricao.setText("	Montado em um Peco-Peco e atacando com uma lança, além da sua velocidade de movimento por conta da montaria, um cavaleiro tem um poder de ataque imenso. Um cavaleiro não é limitado a usar montaria e atacar com uma lança, possui também habilidades que aumentam a velocidade de ataque com a espada.");
		}
		
		if (escolha.equals("Templario")){
			imgpersona.setImageResource(R.drawable.personatemplario);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +7");
			txtagilidade.setText("Agilidade +2");
			txtvitalidade.setText("Vitalidade +7");
			txtinteligencia.setText("Inteligencia +6");
			txtdestreza.setText("Destreza +2");
			txtsorte.setText("Sorte +5");
			
			txtdescricao.setText("	Diferente de um cavaleiro que usa seu poder de forma ofensiva, o templário usa para defender seus companheiros, um guerreiro movido pela fé em Deus ao invés de reis, as vezes se sacrificam pelos companheiros ou para simplesmente vencer uma batalha. Assim como os cavaleiros, eles também possuem montarias e podem ser uma classe ofensiva dependendo da construção do personagem.");
		}
		
		if (escolha.equals("Lorde")){
			imgpersona.setImageResource(R.drawable.personalorde);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +15");
			txtagilidade.setText("Agilidade +8");
			txtvitalidade.setText("Vitalidade +8");
			txtinteligencia.setText("Inteligencia +2");
			txtdestreza.setText("Destreza +9");
			txtsorte.setText("Sorte +3");
			
			txtdescricao.setText("	Após transcender, um cavaleiro se torna um lorde, agora suas habilidades o permite andar mais rápido, desferir mais dano, melhorar sua precisão e hp, e também causam efeitos negativos nos inimigos.");
		}
		
		if (escolha.equals("Paladino")){
			imgpersona.setImageResource(R.drawable.personapaladino);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +9");
			txtagilidade.setText("Agilidade +8");
			txtvitalidade.setText("Vitalidade +10");
			txtinteligencia.setText("Inteligencia +7");
			txtdestreza.setText("Destreza +8");
			txtsorte.setText("Sorte +3");
			
			txtdescricao.setText("	Se você não acredita em Deus é porque ainda não viu o poder divino e destrutivo de um paladino, dando seu sangue em troca da vida de seus companheiros ou sua vida pela morte do inimigo. Paladino é a versão transcendental de um templário.");
		}
		
		if (escolha.equals("CavaleiroRunico")){
			imgpersona.setImageResource(R.drawable.personacavaleirorunico);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +3");
			txtagilidade.setText("Agilidade +3");
			txtvitalidade.setText("Vitalidade +5");
			txtinteligencia.setText("Inteligencia +10");
			txtdestreza.setText("Destreza +7");
			txtsorte.setText("Sorte +3");
			
			txtdescricao.setText("	A ordem secreta dos cavaleiros rúnicos sairam das profundezas de Glasht Heim para proteger a todos com seu poder arcano. Convertendo magia em ataque físico e armazenando magia em rúnas, prometem dominar os campos de batalha. Um cavaleiro rúnico pode domar um Ferus que além de servir como montaria, pode usar o poder do dragão(Ferus) ao seu lado.");
		}
		
		if (escolha.equals("GuardiaoReal")){
			imgpersona.setImageResource(R.drawable.personaguardiaoreal);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +6");
			txtagilidade.setText("Agilidade +2");
			txtvitalidade.setText("Vitalidade +5");
			txtinteligencia.setText("Inteligencia +9");
			txtdestreza.setText("Destreza +6");
			txtsorte.setText("Sorte +2");
			
			txtdescricao.setText("	Os Guardiões Reais surgiram na mesma época que Glast Heim foi construída, como uma força especial criada para combater o mal, usam seu poder sagrado tanto sozinhos como em grupo com outros guardiões reais, aonde podem utilizar habilidades específicas de grupo para vencer a batalha. Assim como os cavaleiros rúnicos, os guardiões reais também recebem uma nova montaria, o Grifo.");
		}
		
		if (escolha.equals("Gatuno")){
			imgpersona.setImageResource(R.drawable.personagatuno);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +4");
			txtagilidade.setText("Agilidade +4");
			txtvitalidade.setText("Vitalidade +2");
			txtinteligencia.setText("Inteligencia +1");
			txtdestreza.setText("Destreza +4");
			txtsorte.setText("Sorte +3");
			
			txtdescricao.setText("	Com uma agilidade incrível atacam rapidamente e se esquivam com facilidade, os gatunos dificilmente são acertados em batalhas e podem transformar um simples ataque com adaga em um ataque duplo. Esta classe se destaca pelas habilidades de furto, esconderijo(''invisibilidade'') e envenenamento, onde ficam melhor quando se tornam mercenários ou arruaceiros. Um gatuno pode usar adagas, espadas de uma mão e até mesmo arco e flecha.");
		}
		
		if (escolha.equals("Mercenario")){
			imgpersona.setImageResource(R.drawable.personamercenario);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +6");
			txtagilidade.setText("Agilidade +10");
			txtvitalidade.setText("Vitalidade +2");
			txtinteligencia.setText("Inteligencia +4");
			txtdestreza.setText("Destreza +8");
			txtsorte.setText("Sorte +0");
			
			txtdescricao.setText("	Além de se moverem sem serem notados com sua furtividade, podem empunhar 2 armas ao mesmo tempo, usando katares que favorecem os ataques criticos e ignoram a defesa do inimigo ou usando 2 adagas para aproveitar de um ataque triplo, além dessas armas também é possivel utilizar espadas de uma mão e machados. Você não precisa retalhar seu inimigo até a morte, além da sua maestria com 2 armas, um mercenário também sabe como matar sua vítima lentamente com venenos. Se você investiu em pericia em esquiva, terá mais velocidade de movimento com o mercenário(e evoluções).");
		}
		
		if (escolha.equals("Arruaceiro")){
			imgpersona.setImageResource(R.drawable.personaarruaceiro);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +6");
			txtagilidade.setText("Agilidade +7");
			txtvitalidade.setText("Vitalidade +6");
			txtinteligencia.setText("Inteligencia +4");
			txtdestreza.setText("Destreza +7");
			txtsorte.setText("Sorte +0");
			
			txtdescricao.setText("	Arruaceiros com suas mãos leves roubam o inimigo sem nem mesmo você precisar utilizar alguma habilidade, podendo roubar zenys, raptar inimigos e grafitar o chão, arruaceiros levam a malandragem de um gatuno em um nével mais elevado. Com suas habilidades de remover equipamentos do inimigo você o deixará exposto a receber danos absurdos, podendo assim, acabar com a batalha rapidamente. Um arruaceiro pode andar invisivel assim como um mercenário, além disso, tem habilidades para atacar pelas costas. Outras características são as de copiar habilidades do inimigo e ter um lado meio arqueiro, com algumas habilidades da classe arqueiro e caçador, pode focar em usar arco e flecha para upar ou para matar outros jogadores no pvp.");
		}
		
		if (escolha.equals("Algoz")){
			imgpersona.setImageResource(R.drawable.personaalgoz);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +9");
			txtagilidade.setText("Agilidade +15");
			txtvitalidade.setText("Vitalidade +3");
			txtinteligencia.setText("Inteligencia +0");
			txtdestreza.setText("Destreza +10");
			txtsorte.setText("Sorte +8");
			
			txtdescricao.setText("	Mestres da furtividade e da criação de venenos, um algoz pode criar um veneno tão forte que qualquer um que beber morrerá, a não ser que um Algoz beba, nesse caso o Algoz ficará envenenado porém ao mesmo tempo sua velocidade de ataque será aumentada, ou se preferir, coloque o veneno na sua arma(aumentará o dano dela e reduzirá o dano de algumas habilidades) e aplique no inimigo em meio de combate(não irá causar morte instantânea do inimigo, porém reduzirá drasticamente seu hp em certo tempo, podendo mata-lo). Além de venenos, seu ataque com katar aumentará com a Perícia avançada de katar além de 2 novas habilidades ativas que causam dano.");
		}
		
		if (escolha.equals("Desordeiro")){
			imgpersona.setImageResource(R.drawable.personadesordeiro);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +9");
			txtagilidade.setText("Agilidade +11");
			txtvitalidade.setText("Vitalidade +4");
			txtinteligencia.setText("Inteligencia +3");
			txtdestreza.setText("Destreza +12");
			txtsorte.setText("Sorte +6");
			
			txtdescricao.setText("	Um Desordeiro com uma só habilidade removerá seu capacete, armadura, escudo e arma de uma só vez, tem um maior controle das habilidades que vão ser copiadas ou não, podém refletir espadas ou adagas e além disso, não pode ser detectado com habilidades como ''Chama Reveladora'' quando ele usar ''Espreitar'').");
		}
		
		if (escolha.equals("Sicario")){
			imgpersona.setImageResource(R.drawable.personasicario);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +6");
			txtagilidade.setText("Agilidade +7");
			txtvitalidade.setText("Vitalidade +5");
			txtinteligencia.setText("Inteligencia +4");
			txtdestreza.setText("Destreza +7");
			txtsorte.setText("Sorte +0");
			
			txtdescricao.setText("	Após a destruição de morroc, os Sicários resolveram se revelar para o mundo para agir de forma mais eficaz. Essa evolução te permite criar venenos mais especificos e avançados, bloquear ataques, novos ataques furtivos, dano em área e uma evolução das lâminas destruidoras.");
		}
		
		if (escolha.equals("Renegado")){
			imgpersona.setImageResource(R.drawable.personarenegado);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +6");
			txtagilidade.setText("Agilidade +3");
			txtvitalidade.setText("Vitalidade +7");
			txtinteligencia.setText("Inteligencia +5");
			txtdestreza.setText("Destreza +3");
			txtsorte.setText("Sorte +5");
			
			txtdescricao.setText("	Renegados usam a tinta ao seu favor, com pinturas mágicas no chão podem criar portais, armadilhas que prendem, explodem ou causam debuff, mas também podem usar pintura corporal no inimigo para causar algum debuff especifico. Além de pinturas, os Renegados possuem outras habilidades, como por exemplo se esconder na sombra de outros ou passar seus efeitos negativos/debuff para algum alvo.");
		}
		
		if (escolha.equals("Justiceiro")){
			imgpersona.setImageResource(R.drawable.personajusticeiro);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +4");
			txtagilidade.setText("Agilidade +1");
			txtvitalidade.setText("Vitalidade +1");
			txtinteligencia.setText("Inteligencia +2");
			txtdestreza.setText("Destreza +9");
			txtsorte.setText("Sorte +7");
			
			txtdescricao.setText("	Justiceiros sempre estão armados, podendo equipar entre: pistola, espingarda, rifle, metralhadora gatling e lança-granadas, onde ele possui habilidades especificas para cada arma, mas também possui habilidades livres para usar com qualquer uma das 5 armas. Assim como um arqueiro, é uma classe de dano a distancia, porém se um justiceiro entrar em desespero poderá matar qualquer coisa que esteja o atacando fisicamente, porém tudo depende da forma que o personagem foi criado e da arma equipada.");
		}
		
		if (escolha.equals("Rebelde")){
			imgpersona.setImageResource(R.drawable.personarebelde);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +3");
			txtagilidade.setText("Agilidade +6");
			txtvitalidade.setText("Vitalidade +6");
			txtinteligencia.setText("Inteligencia +8");
			txtdestreza.setText("Destreza +8");
			txtsorte.setText("Sorte +5");
			
			txtdescricao.setText("	Os soldados que sobreviveram a revolta após o incidente, esconderam sua indentidade em einbroch, aonde aparentemente seria um bar comum, é o ponto de encontro deles que recebem o nome de ''Rebeldes''. Essa classe possui novas habilidades exclusivas pra cada arma, aonde você poderá criar um personagem que fique trocando de arma no meio de combate para combinar algumas habilidades e matar o alvo antes dele se aproximar de você. Podendo causar stun com rifle, quebrar equipamentos com sua espingarda, colocar armadilhas no chão, entre outras coisas, essa classe é a evolução dos Justiceiros.		(OBS: Esssa classe ainda não está disponivel no BRO (Brasil Ragnarok Online) e poderá vir com algum nome diferente)");
		}
		
		if (escolha.equals("Mago")){
			imgpersona.setImageResource(R.drawable.personamago);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +0");
			txtagilidade.setText("Agilidade +4");
			txtvitalidade.setText("Vitalidade +0");
			txtinteligencia.setText("Inteligencia +8");
			txtdestreza.setText("Destreza +3");
			txtsorte.setText("Sorte +3");
			
			txtdescricao.setText("	Utiliza-se de cajados para conjurar magias incríveis, sendo ela elemental ou não, é uma classe que pode adquirir danos devastadores mesmo sendo um pré-feiticeiro ou um pré-arcano. Classe perfeita para quem gosta de magias, porém magos não podem utilizar equipamentos pesados.");
		}
		
		if (escolha.equals("Bruxo")){
			imgpersona.setImageResource(R.drawable.personabruxo);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +1");
			txtagilidade.setText("Agilidade +8");
			txtvitalidade.setText("Vitalidade +1");
			txtinteligencia.setText("Inteligencia +12");
			txtdestreza.setText("Destreza +6");
			txtsorte.setText("Sorte +2");
			
			txtdescricao.setText("	A evolução de um mago, onde suas magias antes eram fixas em um alvo, agora acertam em área com um dano mais devastador, além disso, podem congelar inimigos pertos, trancar passagens com sua barreira de gelo e ver a fraqueza e hp do seu inimigo, além de outras habilidades que ele possui. Uma classe que pode ter desvantagem em andar sozinho, assim como um mago, ainda leva dano alto dos inimigos.");
		}
		
		if (escolha.equals("Sabio")){
			imgpersona.setImageResource(R.drawable.personasabio);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +5");
			txtagilidade.setText("Agilidade +5");
			txtvitalidade.setText("Vitalidade +3");
			txtinteligencia.setText("Inteligencia +9");
			txtdestreza.setText("Destreza +5");
			txtsorte.setText("Sorte +3");
			
			txtdescricao.setText("	Se você é mago e quer mais conhecimento da magia, se torne um sábio, diferente dos bruxos, os sábios trocam as habilidades ofensivas por magias que ajudam seus companheiros em batalha, como por exemplo encantar a arma de um aliado ou o solo com qualquer elemento, além de outras coisas que podem fazer para ajudar o grupo. O seu conhecimento em magia o permite andar e atacar ao mesmo tempo que conjura alguma habilidade, conjurar magias de outras classes aleatóriamente, parar de conjurar quando achar necessário(cancela a habilidade) e até mesmo cancelar a conjuração de um inimigo, entre outras coisas que só um verdadeiro conhecedor da magia pode fazer.");
		}
		
		if (escolha.equals("Arquimago")){
			imgpersona.setImageResource(R.drawable.personaarquimago);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +3");
			txtagilidade.setText("Agilidade +8");
			txtvitalidade.setText("Vitalidade +5");
			txtinteligencia.setText("Inteligencia +17");
			txtdestreza.setText("Destreza +9");
			txtsorte.setText("Sorte +3");
			
			txtdescricao.setText("	Transformando as forças da natureza em destruição, essa é a versão Transcendental de um bruxo. Um arquimago pode aumentar seu poder com amplificações místicas, além de nunca ficarem sem SP ao utilizar magias alvo com seu dreno de alma (magias em área não ativam essa habilidade), também podem aumentar a gravidade do local para dificultar a defesa e movimentação dos inimigos, atacar com propriedade fantasma podendo amaldiçoar o alvo, entre outras habilidades novas.");
		}
		
		if (escolha.equals("Professor")){
			imgpersona.setImageResource(R.drawable.personaprofessor);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +6");
			txtagilidade.setText("Agilidade +9");
			txtvitalidade.setText("Vitalidade +4");
			txtinteligencia.setText("Inteligencia +13");
			txtdestreza.setText("Destreza +11");
			txtsorte.setText("Sorte +2");
			
			txtdescricao.setText("	Ao transcender um sábio, você pode se tornar um professor, onde você irá adquirir mais conhecimento poderá utilizá-lo para conjurar o dobro de lanças de uma vez, converter seu HP em SP, trocar de SP com algum aliádo, entre outras habilidadse que podem ajudar seu aliado ou derrotar um inimigo.");
		}
		
		if (escolha.equals("Arcano")){
			imgpersona.setImageResource(R.drawable.personaarcano);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +1");
			txtagilidade.setText("Agilidade +5");
			txtvitalidade.setText("Vitalidade +4");
			txtinteligencia.setText("Inteligencia +11");
			txtdestreza.setText("Destreza +6");
			txtsorte.setText("Sorte +1");
			
			txtdescricao.setText("	Um arcano tem muito controle de multidão com suas novas habilidades podendo até combina-las para um dano mais devastador. Essa classe possui um grande foco de magias em área, porém tem outras especialidades também, como por exemplo memorizar uma habilidade para lança-la sem precisar conjurar, se concentrar para dar sempre o dano máximo em suas habilidades e invocar os elementos para ataca-los diretamente em um alvo causando danos devastadores além de efeitos negativos. Um arcano não possui somente habilidades focadas em destruição, o arcano também tem habilidades para abaixar atributos dos inimigos, impedir ou dificultar sua movimentação, entre outras.");
		}
		
		if (escolha.equals("Feiticeiro")){
			imgpersona.setImageResource(R.drawable.personafeiticeiro);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +3");
			txtagilidade.setText("Agilidade +3");
			txtvitalidade.setText("Vitalidade +5");
			txtinteligencia.setText("Inteligencia +10");
			txtdestreza.setText("Destreza +7");
			txtsorte.setText("Sorte +3");
			
			txtdescricao.setText("	O feiticeiro não está sozinho em batalha, pode invocar um monstro elemental para ajudá-lo sempre quando for necessário. Essa classe utiliza habilidades em área para atacar e mesmo sendo a evolução de uma classe ''suporte'', pode causar danos incríveis em suas habilidades que normalmente acompanham de um efeito negativo na área que foi conjurada, além da capacidade de encantar seu punho com alguma lança elemental.");
		}
		
		if (escolha.equals("Mercador")){
			imgpersona.setImageResource(R.drawable.personamercador);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +5");
			txtagilidade.setText("Agilidade +1");
			txtvitalidade.setText("Vitalidade +4");
			txtinteligencia.setText("Inteligencia +5");
			txtdestreza.setText("Destreza +1");
			txtsorte.setText("Sorte +2");
			
			txtdescricao.setText("	Mercadores moldam a economia de Ragnarok, que ao invés de irem pro campo de batalha, vendem itens em suas lojas espalhadas por Rune-Midgard. Uma classe que pode comprar mais barato e vender mais caro em NPCs, tem suas habilidades focadas em dinheiro, podendo carregar mais peso que qualquer classe, ainda pode levar um carrinho que depois se transforma em uma loja para vender seus itens. Se você for um mercador, lembre-se, o importante é ter dinheiro.");
		}
		
		if (escolha.equals("Ferreiro")){
			imgpersona.setImageResource(R.drawable.personaferreiro);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +6");
			txtagilidade.setText("Agilidade +2");
			txtvitalidade.setText("Vitalidade +6");
			txtinteligencia.setText("Inteligencia +2");
			txtdestreza.setText("Destreza +12");
			txtsorte.setText("Sorte +2");
			
			txtdescricao.setText("	Ferreiros podem escolher entre ir pro campo de batalha, se tornando um grande guerreiro com suas novas habilidades ou usar seu conhecimento para criar armas (elementais ou não), refinar minerais, criar pedras elementais e reparar o armamento quebrado de seus amigos. Toda arma que você criar recebe sua assinatura após o nome do item.");
		}
		
		if (escolha.equals("Alquimista")){
			imgpersona.setImageResource(R.drawable.personaalquimista);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +5");
			txtagilidade.setText("Agilidade +6");
			txtvitalidade.setText("Vitalidade +3");
			txtinteligencia.setText("Inteligencia +7");
			txtdestreza.setText("Destreza +9");
			txtsorte.setText("Sorte +0");
			
			txtdescricao.setText("	Sempre pesquisando novas fórmulas, o alquimista tem o poder de não só criar poções, como também bombas químicas com alto poder destrutivo, revestir equipamentos com proteção anti-remoção e a incrível habilidade de criar a vida apartir de um embrião. Alquimistas podem ficar sentados enquanto seu homunculus acaba com os inimigos, mas não se esqueça de alimenta-lo, caso o contrario, ele morrerá de fome. (OBS: um homunculus só compartilha a exp de base ao derrotar um monstro, para conseguir exp de classe é necessário o alquimista matar os monstros ou upar em grupo)");
		}
		
		if (escolha.equals("MestreFerreiro")){
			imgpersona.setImageResource(R.drawable.personamestreferreiro);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +6");
			txtagilidade.setText("Agilidade +7");
			txtvitalidade.setText("Vitalidade +6");
			txtinteligencia.setText("Inteligencia +6");
			txtdestreza.setText("Destreza +12");
			txtsorte.setText("Sorte +8");
			
			txtdescricao.setText("	Suas habilidades com o metal o permite refinar as armas com mais chance de sucesso que um npc (a chance muda se baseando no seu lv de classe não nos seus atributos, e ao se tornar um mecânico sua chance de refinar volta a ser igual de um npc), porém ao transcender você não aprende só a melhorar uma arma, aprende também a destruir as armas e armaduras dos seus inimigos. Além de aprender a melhorar ou destruir armas, um Mestre-Ferreiro pode usar um impulso no carrinho para se movimentar em uma velocidade incrível e usando um pouco de zeny pode usar ''Choque do carrinho'' e ''Força Violentíssima'' que são habilidades do Mestre-Ferreiro.");
		}
		
		if (escolha.equals("Criador")){
			imgpersona.setImageResource(R.drawable.personacriador);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +4");
			txtagilidade.setText("Agilidade +6");
			txtvitalidade.setText("Vitalidade +3");
			txtinteligencia.setText("Inteligencia +7");
			txtdestreza.setText("Destreza +14");
			txtsorte.setText("Sorte +11");
			
			txtdescricao.setText("	Um criador recebe esse nome pois seu foco agora é criar a vida, podendo cultivar plantas apartir de caules e esporos, e utilizando a arma certa, você pode transformar suas plantas inofensivas em verdadeiros monstros. Combinando suas 2 bombas químicas, causam grande dano e podem danificar as vestimentas do alvo. Agora você também poderá arremessar poções compactas em uma área para curar vários aliados ao invés de somente 1. Outra habilidade do criador é utilizar um simples frasco de revestimento para proteger os quatro equipamentos de serem quebrados.");
		}
		
		if (escolha.equals("Mecanico")){
			imgpersona.setImageResource(R.drawable.personamecanico);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +6");
			txtagilidade.setText("Agilidade +3");
			txtvitalidade.setText("Vitalidade +7");
			txtinteligencia.setText("Inteligencia +5");
			txtdestreza.setText("Destreza +3");
			txtsorte.setText("Sorte +5");
			
			txtdescricao.setText("	Mestres da mecânica arcana, um Mecânico pode pilotar um M.E.C.H.A., uma armadura de metal incrível com infinitas ferramentas para ajudar na batalha, como por exemplo: Sensor infravermelho que detecta oponentes ocultos, planador que evita armadilhas e magias no chão, canhão, metralhadora, lança chamas, etc... Mas um mecânico não se limita somente em M.E.C.H.A.s, possuem também novas habilidades com o machado e a possibilidade de montar até 2 artilharias no chão que atacam a longa distância.");
		}
		
		if (escolha.equals("Bioquimico")){
			imgpersona.setImageResource(R.drawable.personabioquimico);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +1");
			txtagilidade.setText("Agilidade +5");
			txtvitalidade.setText("Vitalidade +4");
			txtinteligencia.setText("Inteligencia +6");
			txtdestreza.setText("Destreza +11");
			txtsorte.setText("Sorte +1");
			
			txtdescricao.setText("	Usando seu carrinho como máquina de guerra, criando novas poções, bombas orgânicas apartir de frutas, novas plantações, misturar itens para formar um outro, entre outras habilidades, um bioquimico se destaca pela criação ciêntifica. Agora o fogo grego pode ser usado como uma Bomba Napalm criando chamas no local, e se combinar com ''Catalisador Alquímico'' pode gerar diversos efeitos dependendo do item utilizado.");
		}
		
		if (escolha.equals("Ninja")){
			imgpersona.setImageResource(R.drawable.personaninja);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +1");
			txtagilidade.setText("Agilidade +8");
			txtvitalidade.setText("Vitalidade +1");
			txtinteligencia.setText("Inteligencia +5");
			txtdestreza.setText("Destreza +6");
			txtsorte.setText("Sorte +4");
			
			txtdescricao.setText(" 	Guerreiros das sombras, os ninjas podem sempre contar com sua rapidez e versatilidade, seja um ninja de magia (Ninpou), luta corporal (Taijutsu) ou de armas de arremesso (Togatana). Pode criar uma imagem falsa ou trocar de pele sempre que é atacado, assim se esquiva facilmente de ataques fisicos, além disso pode criar um escudo de fogo que qualquer inimigo que ousar atravessar receberá dano. Alguns ninjas focam em sacrifício, podendo a qualquer momento dar um ataque mortal que além de causar dano no inimigo, acaba deixando o HP do ninja em 1, uma forma arriscada, porém, eficiente de matar seu inimigo.");
		}
		
		if (escolha.equals("Kagerou")){
			imgpersona.setImageResource(R.drawable.personakagerou);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +7");
			txtagilidade.setText("Agilidade +6");
			txtvitalidade.setText("Vitalidade +4");
			txtinteligencia.setText("Inteligencia +6");
			txtdestreza.setText("Destreza +8");
			txtsorte.setText("Sorte +4");
			
			txtdescricao.setText("	A um tempo atrás, os clãs de Kagerou e Oboro eram a mão direita e esquerda do senhor feudal de amatsu, completavam suas tarefas rapidamente e com precisão, mas por algum motivo foram expulsos de amatsu pelo senhor feudal, dizem que eles ainda existem escondidos nas sombras. Decadas depois, um novo clã surgiu em amatsu, rumores dizem que os jounins estão ensinando os ninjas mais experientes a se tornar um Kagerou ou Oboro. O que diferencia um Kagerou e Oboro são 3 habilidades exclusivas e o sexo, um Kagerou possui como habilidade exclusiva: Imobilizar e revelar inimigos em uma área ao redor do Kagerou (Só pode ser utilizada em PVP e Guerra Do Emperium) | Anular a capacidade de reflexão de um alvo | Dar ataque duplo para o alvo até acabar o efeito da habilidade (drena 1 sp por segundo no alvo).");
		}
		
		if (escolha.equals("Oboro")){
			imgpersona.setImageResource(R.drawable.personaoboro);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +7");
			txtagilidade.setText("Agilidade +6");
			txtvitalidade.setText("Vitalidade +4");
			txtinteligencia.setText("Inteligencia +6");
			txtdestreza.setText("Destreza +8");
			txtsorte.setText("Sorte +4");
			
			txtdescricao.setText("	A um tempo atrás, os clãs de Kagerou e Oboro eram a mão direita e esquerda do senhor feudal de amatsu, completavam suas tarefas rapidamente e com precisão, mas por algum motivo foram expulsos de amatsu pelo senhor feudal, dizem que eles ainda existem escondidos nas sombras. Decadas depois, um novo clã surgiu em amatsu, rumores dizem que os jounins estão ensinando os ninjas mais experientes a se tornar um Kagerou ou Oboro. O que diferencia um Kagerou e Oboro são 3 habilidades exclusivas e o sexo, uma Oboro possui como habilidade exclusiva: Alterar o ataque e ataque magico do alvo | Aumentar ou diminuir aleatóriamente o HP do alvo distribuindo qualquer dano magico que ele levar para um alvo proximo (Não funciona em monstros) | Infectar o alvo com um efeito negativo que converte habilidades de recuperação de HP usadas nele em dano.");
		}
		
		if (escolha.equals("Novico")){
			imgpersona.setImageResource(R.drawable.personanovico);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +3");
			txtagilidade.setText("Agilidade +2");
			txtvitalidade.setText("Vitalidade +3");
			txtinteligencia.setText("Inteligencia +3");
			txtdestreza.setText("Destreza +3");
			txtsorte.setText("Sorte +4");
			
			txtdescricao.setText("	Noviços, servos da igreja, não procuram machucar ninguém, sempre ajudando o proximo podendo curar e abençoar, o que deixa qualquer um mais forte. Se não estão ajudando aliados provavelmente estão por ai eliminando os monstros malditos e sombrios que assombram rune-midgard. Uma classe suporte, porém não precisa ser um, tem dano sagrado e pode evoluir para um Monge, uma classe focada em batalha, ou para um Sacerdote, uma classe focada em suporte.");
		}
		
		if (escolha.equals("Sacerdote")){
			imgpersona.setImageResource(R.drawable.personasacerdote);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +5");
			txtagilidade.setText("Agilidade +4");
			txtvitalidade.setText("Vitalidade +5");
			txtinteligencia.setText("Inteligencia +5");
			txtdestreza.setText("Destreza +4");
			txtsorte.setText("Sorte +7");
			
			txtdescricao.setText("	Graças a sua fé e dedicação ao senhor, possui incriveis poderes de purificação, sendo a principal classe de suporte em Rune-Midgard, pode curar diversos efeitos negativos ou causa-los em alguns tipos de monstros, abençoar seus parceiros com diversos efeitos que ajudaram no combate, além da incrivel habilidade de trazer alguém de volta a vida. Além de suporte, é um grande inimigo dos monstros malditos, sombrios e mortos-vivos.");
		}
		
		if (escolha.equals("Monge")){
			imgpersona.setImageResource(R.drawable.personamonge);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +8");
			txtagilidade.setText("Agilidade +7");
			txtvitalidade.setText("Vitalidade +6");
			txtinteligencia.setText("Inteligencia +2");
			txtdestreza.setText("Destreza +4");
			txtsorte.setText("Sorte +3");
			
			txtdescricao.setText("	Alinhando sua mente, espirito e força fisica, causa danos devastadores em seu ''punho supremo de asura'', além do punho supremo, um monge também pode usar combos rápidos, precisos e fortes em seu inimigo. Podendo absorver 90% do dano recebido, paralizar o inimigo (o monge também fica paralizado), aumentar sua força invocando esferas espirituais, entre outras habilidades, um monge é uma classe ótima para PVP, WOE e MVP (porém não é muito eficiente para isso agora, recomenda-se evoluir para sua terceira classe antes de tentar WOE, MVP ou PVP livre).");
		}
		
		if (escolha.equals("SumoSacerdote")){
			imgpersona.setImageResource(R.drawable.personasumosacerdote);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +7");
			txtagilidade.setText("Agilidade +8");
			txtvitalidade.setText("Vitalidade +7");
			txtinteligencia.setText("Inteligencia +12");
			txtdestreza.setText("Destreza +9");
			txtsorte.setText("Sorte +2");
			
			txtdescricao.setText("	Representação de Deus na terra, os Sumo-Sacerdotes adquiriram uma riqueza de espírito quado transcenderam, agora usando menos SP para conjurar habilidades, pode criar um escudo impenetrável (exceto para chefes e guerra do emperium) que nenhum inimigo ou ataque poderá entrar, sua cura também é mais eficiente e pode dobrar a defesa de um alvo. Mas lembre-se, para ter esses efeitos você precisa adquirir as novas habilidades.");
		}
		
		if (escolha.equals("Mestre")){
			imgpersona.setImageResource(R.drawable.personamestre);
			txtatributos.setText(" Atributos com lv de classe 70:");
			txtforca.setText("Força +9");
			txtagilidade.setText("Agilidade +9");
			txtvitalidade.setText("Vitalidade +7");
			txtinteligencia.setText("Inteligencia +7");
			txtdestreza.setText("Destreza +10");
			txtsorte.setText("Sorte +3");
			
			txtdescricao.setText("	Dizem que você só pode se tornar um Mestre quando conhecer os limites do corpo humano, adicionando novos ataques de combo e um golpe tão poderoso que pode imobilizar o alvo, um mestre também pode entrar em um estado Zen onde consegue invocar todas as esferas espirituais de uma só vez. O Mestre é a versão transcendental do Monge.");
		}
		
		if (escolha.equals("Arcebispo")){
			imgpersona.setImageResource(R.drawable.personaarcebispo);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +5");
			txtagilidade.setText("Agilidade +4");
			txtvitalidade.setText("Vitalidade +5");
			txtinteligencia.setText("Inteligencia +8");
			txtdestreza.setText("Destreza +6");
			txtsorte.setText("Sorte +0");
			
			txtdescricao.setText("	Arcebispos são grupos especiais formados pela igreja, seus poderes sagrados aumentaram graças ao Cálice Sagrado do templo de odin, onde agora algumas de suas habilidades de sacerdote (Curar, Abençoar...) funcionam no grupo todo de uma só vez, além de novos buffs (efeitos positivos) que um Arcebispo pode adquirir.");
		}
		
		if (escolha.equals("Shura")){
			imgpersona.setImageResource(R.drawable.personashura);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +6");
			txtagilidade.setText("Agilidade +7");
			txtvitalidade.setText("Vitalidade +5");
			txtinteligencia.setText("Inteligencia +4");
			txtdestreza.setText("Destreza +7");
			txtsorte.setText("Sorte +0");
			
			txtdescricao.setText("	Shuras são Deuses de Guerra, são Monges que superaram os limites humanos, podendo revidar ataques, paralizar em área, possui mais combos e libera os ''Portões do Inferno'' podendo causar danos extremamente altos, além de outras habilidades que só um shura pode ter. Shura é a ultima evolução para quem escolheu o caminho das lutas quando ainda era um noviço.");
		}
		
		if (escolha.equals("Taekwon")){
			imgpersona.setImageResource(R.drawable.personataekwon);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +6");
			txtagilidade.setText("Agilidade +6");
			txtvitalidade.setText("Vitalidade +0");
			txtinteligencia.setText("Inteligencia +0");
			txtdestreza.setText("Destreza +6");
			txtsorte.setText("Sorte +6");
			
			txtdescricao.setText("	Os taekwons são aqueles que dominam a arte-marcial conhecida como Taekwondo, utilizam diversos chutes para atacar seu inimigo e não podem equipar quase nenhuma arma. Essa classe é abençoada com um anjo que toda vez que o usuário mudar de level esse anjo aparecerá e o taekwon receberá benção e agilidade com duração maior. Você pode ser um eterno taekwon para fazer suas ''Missões taekwon'', assim que o usuário trocar de classe, essa habilidade será desabilitada.");
		}
		
		if (escolha.equals("MestreTaekwon")){
			imgpersona.setImageResource(R.drawable.personamestretaekwon);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +12");
			txtagilidade.setText("Agilidade +12");
			txtvitalidade.setText("Vitalidade +0");
			txtinteligencia.setText("Inteligencia +0");
			txtdestreza.setText("Destreza +6");
			txtsorte.setText("Sorte +0");
			
			txtdescricao.setText("	Retirando o conhecimento de livros para melhorar seus chutes, um Mestre Taekwon também pode usar as estrelas, o sol e a lua para guia-lo. Esses alinhamentos com a lua, o sol e as estrelas, servem para ganhar vantagem em certo mapa, contra certo inimigo, essas vantagens podem ser desde habilidades ofensivas até habilidades passivas, incluindo, o ganho de mais exp. Assim como os Super Aprendizes, um Mestre Taekwon também possui alguns segredos.");
		}
		
		if (escolha.equals("Espiritualista")){
			imgpersona.setImageResource(R.drawable.personaespiritualista);
			txtatributos.setText(" Atributos com lv de classe 50:");
			txtforca.setText("Força +0");
			txtagilidade.setText("Agilidade +4");
			txtvitalidade.setText("Vitalidade +6");
			txtinteligencia.setText("Inteligencia +12");
			txtdestreza.setText("Destreza +12");
			txtsorte.setText("Sorte +0");
			
			txtdescricao.setText("	Ao contrário de um Mestre Taekwon, os Espiritualistas abrem mão dos chutes de um taekwon para se tornar um ''Mago Espiritual'', pode utilizar equipamentos de mago para se proteger e atacar, mas sua principal característica é invocar espíritos ancestrais em seus companheiros para liberar habilidades perdidas no tempo, onde somente os melhores da classe conseguiram adquirir, essas habilidades ficaram livres para uso enquanto durar o espírito.");
		}
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.classes, menu);
		return true;
	}

}
