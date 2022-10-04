package enums;

public enum StudyProfile {
    MEDICINE("Медицина"),
    PROGRAMMER("Программист"),
    LERNING("Учитель");

    private String title;

    StudyProfile(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "'" + title + '\'';
    }
}
