package desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico ninjaBasico = new NinjaBasico("Naruto Uzumaki", 17, "Salvar o mundo ninja", "Alta", "Em andamento");
        System.out.println("Informações do Ninja Básico:");
        ninjaBasico.mostrarInformacoes();
        ninjaBasico.executarHabilidade();
        
        NinjaAvancado ninjaAvancado = new NinjaAvancado("Sasuke Uchiha", 17, "Proteger a aldeia", "Média", "Concluída", "Sharingan");
        System.out.println("\nInformações do Ninja Avançado:");
        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();
        
    }
    
}
