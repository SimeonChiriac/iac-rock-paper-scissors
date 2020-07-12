package domain;

public interface Rules {
    Result decideMatch(Move mine, Move theirs);
}
