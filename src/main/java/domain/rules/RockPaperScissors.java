package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {
//Stefan van Eechelt en Bruus Riezebos hebben mij geholpen bij het schrijven van deze klasse

    private Result getResultOfMatch(boolean result) {
        if (result) {
            return Result.WIN;
        }
        return Result.LOSE;
    }

    @Override
    public Result decideMatch(Move handOne, Move handTwo) {
        if (handOne.equals(handTwo)) {
            return Result.DRAW;
        }

        switch (handOne) {
            case ROCK:
                return getResultOfMatch(handTwo.equals(Move.SCISSORS));
            case PAPER:
                return getResultOfMatch(handTwo.equals(Move.ROCK));
            case SCISSORS:
                return getResultOfMatch(handTwo.equals(Move.PAPER));
        }

        return Result.DRAW;
    }
}
