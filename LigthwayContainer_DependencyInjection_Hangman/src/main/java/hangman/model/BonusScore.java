package hangman.model;

public class BonusScore implements GameScore{

    int initialScore = 0;

    /**
     * Metodo que permite calcular la cantidad de puntos
     * El juego inicia en 0 puntos.
     * Se bonifica con 10 puntos cada letra correcta.
     * Se penaliza con 5 puntos cada letra incorrecta
     * El puntaje mínimo es 0.
     * @pre Los puntos initialPoints son inicialmente 0
     * @param correctCount Cantidad de letras correctas
     * @param incorrectCount Cantidad de letras incorrectas
     * @return actualPoints Int de puntos
     */

    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        
        initialScore = (correctCount*10)-(incorrectCount*5);
        if(initialScore<0){
            initialScore=0;
        }     
        return initialScore;
    }
    
}
