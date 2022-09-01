package hangman.model;

import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {
    
    /**
     * Tests para OriginalScore
     */
    @Test
    public void originalInit(){
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(0, 0);
        Assert.assertEquals(100, result);
    }

    @Test
    public void originalCorrect(){
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(10, 0);
        Assert.assertEquals(100, result);
    }

    @Test
    public void originalIncorrect(){
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(0, 1);
        Assert.assertEquals(90, result);
    }

    @Test
    public void originalMinim(){
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(0, 100);
        Assert.assertEquals(0, result);
    }

    @Test
    public void originalFrontier(){
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(0, 10);
        Assert.assertEquals(0, result);
    }

    /**
     * Tests para BonusScore
     */
    @Test
    public void bonusInit(){
        BonusScore score = new BonusScore();
        int result = score.calculateScore(0, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void bonusCorrect(){
        BonusScore score = new BonusScore();
        int result = score.calculateScore(10, 0);
        Assert.assertEquals(100, result);
    }

    @Test
    public void bonusIncorrect(){
        BonusScore score = new BonusScore();
        int result = score.calculateScore(10, 10);
        Assert.assertEquals(50, result);
    }

    @Test
    public void bonusMinim(){
        BonusScore score = new BonusScore();
        int result = score.calculateScore(0, 1);
        Assert.assertEquals(0, result);
    }

    @Test
    public void bonusFrontier(){
        BonusScore score = new BonusScore();
        int result = score.calculateScore(10, 20);
        Assert.assertEquals(0, result);
    }

    /**
     * Tests para PowerScore
     */
    @Test
    public void powerInit(){
        PowerScore score = new PowerScore();
        int result = score.calculateScore(0, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void powerCorrect(){
        PowerScore score = new PowerScore();
        int result = score.calculateScore(3, 0);
        Assert.assertEquals(155, result);
    }

    @Test
    public void powerIncorrect(){
        PowerScore score = new PowerScore();
        int result = score.calculateScore(3, 10);
        Assert.assertEquals(75, result);
    }

    @Test
    public void powerMinim(){
        PowerScore score = new PowerScore();
        int result = score.calculateScore(0, 10);
        Assert.assertEquals(0, result);
    }

    @Test
    public void powerMax(){
        PowerScore score = new PowerScore();
        int result = score.calculateScore(10, 0);
        Assert.assertEquals(500, result);
    }

    @Test
    public void powerInfFrontier(){
        PowerScore score = new PowerScore();
        int result = score.calculateScore(1, 1);
        Assert.assertEquals(0, result);
    }

    @Test
    public void powerSupFrontier(){
        PowerScore score = new PowerScore();
        int result = score.calculateScore(10, 10);
        Assert.assertEquals(500, result);
    }
}
