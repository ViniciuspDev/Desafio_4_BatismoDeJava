package desafio4;

public class NinjaAvancado implements Ninja {
    private final String nome;
    private final int idade;
    private final String missao;
    private final String nivelDificuldade;
    private final String statusMissao;
    private final String especialidade;


    public NinjaAvancado(String nome, int idade, String missao, String nivelDificuldade, String statusMissao, String habilidadeEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
        this.especialidade = habilidadeEspecial;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nível de Dificuldade: " + nivelDificuldade);
        System.out.println("Status da Missão: " + statusMissao);
        System.out.println("Habilidade Especial: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " está executando a habilidade especial: " + especialidade);

        System.out.println("Habilidade: " + HabilidadesExtras.TAIJUTSU  );
        System.out.println("Descrição: Técnica de combate corpo a corpo.");
        System.out.println("Habilidade: " + HabilidadesExtras.NINJUTSU  );
        System.out.println("Descrição: Técnica de manipulação de chakra para criar efeitos diversos.");
        System.out.println("Habilidade: " + HabilidadesExtras.GENJUTSU);
        System.out.println("Descrição: Técnica de ilusão que afeta a percepção sensorial.");
        System.out.println("Habilidade: " + HabilidadesExtras.KATON);
        System.out.println("Descrição: Técnica de manipulação de fogo para ataques ofensivos.");
    }
    
}
