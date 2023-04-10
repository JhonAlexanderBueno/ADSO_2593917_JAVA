import java.util.Scanner;

public class Ahorcado {
    private String palabraSecreta;
    private StringBuilder palabraMostrada;
    private int vidas_del_juego;
    private boolean juegoTerminado;

    public Ahorcado(String palabraSecreta, int vidasIniciales) {
        this.palabraSecreta = palabraSecreta.toUpperCase();
        this.palabraMostrada = new StringBuilder("_".repeat(palabraSecreta.length()));
        this.vidas_del_juego = vidasIniciales;
        this.juegoTerminado = false;
    }

    public void start() {
        System.out.println("juego del Ahorcado");
        Scanner scanner = new Scanner(System.in);
        while (!juegoTerminado) {
            System.out.println("escribir una letra: ");
            char letra = scanner.nextLine().toUpperCase().charAt(0);
            if (intentarLetra(letra)) {
                System.out.println("Correcto " + palabraMostrada);
            } else {
                System.out.println("palabra incorrecta Te quedan " + vidas_del_juego + " vidas.");
            }
        }
        scanner.close();
    }

    private boolean intentarLetra(char letra) {
        boolean acierto = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraMostrada.setCharAt(i, letra);
                acierto = true;
            }
        }
        if (!acierto) {
            vidas_del_juego--;
            if (vidas_del_juego == 0) {
                System.out.println("perdido, La palabra era " + palabraSecreta);
                juegoTerminado = true;
            }
        } else if (palabraMostrada.indexOf("_") == -1) {
            System.out.println("Felicidades, gano La palabra era " + palabraSecreta);
            juegoTerminado = true;
        }
        return acierto;
    }
}