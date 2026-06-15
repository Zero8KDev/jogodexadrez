public class Tabuleiro {

    private String[][] casas = new String[8][8];

    public Tabuleiro() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                casas[i][j] = "   ";
            }
        }

        colocarPecas();
        mostrar();
    }

public void colocarPecas() {

    new Rei('b');
    new Rei('p');

    new Rainha('b');
    new Rainha('p');

    new Torre('b');
    new Torre('b');
    new Torre('p');
    new Torre('p');

    new Bispo('b');
    new Bispo('b');
    new Bispo('p');
    new Bispo('p');

    new Cavalo('b');
    new Cavalo('b');
    new Cavalo('p');
    new Cavalo('p');

    for (int i = 0; i < 8; i++) {
        new Peao('b');
        new Peao('p');
    }
}
    public void mostrar() {

    for (int i = 0; i < 8; i++) {

        for (int j = 0; j < 8; j++) {
            System.out.print("[" + casas[i][j] + "]");
        }

        System.out.println();
    }
}

    public boolean acabouOJogo() {
        return true;
    }
}