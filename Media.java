package croc2;
public class Media {
    private String type;

    public Media(String type) {//конструктор, содержащий информацию о носителе
        this.type = type;
    }

    public String getType() {//возвращает информацию о носителе музыки
        return type;
    }
}

