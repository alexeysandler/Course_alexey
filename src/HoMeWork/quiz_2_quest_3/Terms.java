package HoMeWork.quiz_2_quest_3;

public enum Terms {
    _semestr_A ('a'),
    _semestr_B ('b'),
    _semestr_C ('c');

    private Character character;

    Terms(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
