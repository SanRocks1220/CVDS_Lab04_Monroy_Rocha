
package hangman.model;

public class OriginalScore implements GameScore {

    public int initialPoints = 100;
    public int minimPoints = 0;

    /**
     * Metodo para calcular el puntaje para Hangman, que consiste en:
     * Iniciar con 100 puntos.
     * No se bonifican las letras correctas.
     * Se penaliza con 10 puntos con cada letra incorrecta.
     * El puntaje minimo es 0.
     * @pre Los puntos initialPoints son inicialmente 100
     * @param correctCount Número de letras correctas en el intento
     * @param incorrectCount Número de letras incorrectas en el intento
     * @return El puntaje actual del jugador, teniendo en cuenta sus errores y aciertos
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int actualPoints = initialPoints - incorrectCount*10;
        if (actualPoints <= minimPoints){
            actualPoints = 0;
        }
        return actualPoints;
    }
    
}