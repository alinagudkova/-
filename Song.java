package croc2;
class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {//конструктор, содержащий информацию о названии и исполнителе
        this.title = title;
        this.artist = artist;
    }
//геттеры,возвращающие информацию о названии песни и исполнителе
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    
    }
}
