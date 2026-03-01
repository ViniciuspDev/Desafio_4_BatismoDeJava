package desafioninja.desafio4;

public class NinjaBasico implements Ninja {
    private final String nome;
    private final int idade;
    private final String missao;
    private final String nivelDificuldade;
    private final String statusMissao;

    public NinjaBasico(String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nível de Dificuldade: " + nivelDificuldade);
        System.out.println("Status da Missão: " + statusMissao);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " está executando uma habilidade básica!");
        System.out.println("Habilidade: " + HabilidadesExtras.TAIJUTSU);
        System.out.println("Descrição: Técnica de combate corpo a corpo.");
    }


    
}
