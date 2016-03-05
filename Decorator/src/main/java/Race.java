
public interface Race {

    int hp();

    int attack();

    Type getType();

    enum Type {
        ORC, HUMAN, ELF
    }
}
