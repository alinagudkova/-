package croc2;
import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {//объявление списков доступных песен и поддерживаемых носителей
    private List<Song> songs;
    private List<String> supportedMediaTypes;

    public MusicLibrary() {//конструкторы списков доступных песен и поддерживаемых носителей
        this.songs = new ArrayList<>();
        this.supportedMediaTypes = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void addSupportedMediaType(String mediaType) {
        supportedMediaTypes.add(mediaType);
    }
//геттеры, возвращающие список доступных песен и поддерживаемых носителей
    public List<String> getSupportedMediaTypes() {
        return supportedMediaTypes;
    }

    public Song getSong(int index) {
        return songs.get(index);
    }
}
