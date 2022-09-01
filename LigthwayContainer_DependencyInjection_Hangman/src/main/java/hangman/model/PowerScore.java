package hangman.model;

public class PowerScore implements GameScore{

    int initialScore = 0;

    /**
     * Clases de Equivalencia en PowerScore:
     * De -Math.inf a 0, todo resultado será 0
     * Si el resultado es 0, se mantendrá en 0
     * Si el resultado es mayor que 0 y menor que 500, se mantendrá intacto
     * Si el resultado es 500, se mantendrá en 500
     * De 500 a Math.inf, todo resultado será 500
     */
    
    /**
     * Metodo que permite calcular la cantidad de puntos
     * El juego inicia en 0 puntos.
     * La i-ésima letra correcta se bonifica con 5^i.
     * Se penaliza con 5 puntos cada letra incorrecta
     * El puntaje mínimo es 0.
     * Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
     * @pre Los puntos initialPoints son inicialmente 0
     * @param correctCount Cantidad de letras correctas
     * @param incorrectCount Cantidad de letras incorrectas
     * @return initialScore Int de puntos
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {

        for (int i = 1 ; i<= correctCount ; i++){
            initialScore += Math.pow(5, i);
        }
        initialScore -= 8*incorrectCount;
        if(initialScore<0){
            initialScore = 0;
        }else if(initialScore > 500){
            initialScore = 500;
        }
        return initialScore;
    }

}
