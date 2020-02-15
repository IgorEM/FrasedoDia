package frasedodia.blackmoses.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases =  {
            "“Os problemas são oportunidades para se mostrar o que sabe.” (Duke Ellington)",
            "“Nossos fracassos, às vezes, são mais frutíferos do que os êxitos.” (Henry Ford)",
            " “Tente de novo. Fracasse de novo. Mas fracasse melhor”. (Samuel Beckett)",
            "“É costume de um tolo, quando erra, queixar-se dos outros. É costume de um sábio queixar-se de si mesmo”. (Sócrates)",
            "“O verdadeiro heroísmo consiste em persistir por mais um momento, quando tudo parece perdido”. (W. F. Grenfel)",
            " “Cada cliente é como se fosse primeiro e único”. (Norman Bawes)",
            "“Mesmo que já tenhas feito uma longa caminhada, há sempre um novo caminho a fazer”. (Santo Agostinho)",
            "“Vender é construir uma ponte entre você e seu cliente e fazê-lo atravessar para o seu lado”. (Ciclo dos Profissionais de Venda)",
            "“Na prosperidade, nossos amigos nos conhecem; na adversidade, nós é que conhecemos nossos amigos”. (Churton Collins)",
            " “Lembre sempre que a sua vontade de triunfar é mais importante do que qualquer outra coisa”. (Abraham Lincoln)",
            "“Prefiro os erros do entusiasmo à indiferença da sabedoria”. (Anatole France)\n",
            "”Na realidade, vendas e serviços são inseparáveis”. (Carter Brow)",
            "“A arte de ser ora audacioso, ora prudente, é a arte de vencer”. (Napoleão Bonaparte)",
            "“Seja corajoso. Mesmo que você não seja, finja ser. Ninguém nota a diferença”. (H. Jackson Brown Jr.)\n",
            "“Não somos responsáveis apenas pelo que fazemos, mas também pelo que deixamos de fazer”. (Moliere)",
            "“Quando você contrata pessoas mais inteligentes do que você, prova que é mais inteligente do que elas”. (R. H. Grant)",
            "“O talento vence jogos, mas só o trabalho em equipe vence campeonatos”. (Michael Jordan)\n",
            "“Um negócio nunca é bom se com ele conseguimos um inimigo”. (Hugh Prather)",
            "“Um objetivo nada mais é do que um sonho com limite de tempo”. (Joel L. Griffith)",
            "“Sorte é o que acontece quando a preparação encontra a oportunidade”. (Elmer Letterman)\n",
            "“O mercado dita inovações. Quem não segue vira peça de museu”. (Phill Knight)\n",
            " “O único lugar que o sucesso vem antes do trabalho é no dicionário”. (Vidal Sasson)",
            "“Se você quiser ir daqui para lá no mundo dos negócios, não encontrará nenhuma linha reta para levá-lo”. (William Ahmanson)",
            "“Existe o risco que você jamais pode correr. Existe o risco que você jamais pode deixar de correr”. (Peter Drucker)\n",
            "“A qualidade do seu trabalho tem tudo a ver com a qualidade da sua vida”. (Orison Swett Marden)",
            "“Somos o que repetidamente fazemos. Portanto, a excelência não é um feito, é um hábito”. (Aristóteles)",
            "“Persistência é irmã gêmea da excelência. Uma é mãe da qualidade, a outra a mãe do tempo”. (Marabel Morgan)",
            "“Comemore os seus sucessos. Veja com humor os seus fracassos”. (Sam Walton)",
            "“Autorrespeito, autoconhecimento e autocontrole conduzem a vida ao poder supremo”. (Alfred Tennyson)\n",
    }; //frases é um array de strings

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.Texto_NovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botao_novafraseId);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length); // frases.legth ( rage do tamanho do array)

                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });


    }
}
