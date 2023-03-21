package croc2;

import java.util.List;

public class Croc2 {
    public class AudioPlayer {
        private String name;
        private List<String> supportedMediaTypes;

        public AudioPlayer(String name, List<String> supportedMediaTypes) {//конструктор
            this.name = name;
            this.supportedMediaTypes = supportedMediaTypes;
        }

        public void play(Song song, String mediaType) {//проверка наличия носителя
            if (supportedMediaTypes.contains(mediaType)) {
                System.out.println(name + " исполняется" + song.getTitle() + song.getArtist());//вывод информации о песни
            } else {
                System.out.println(name + "не исполняется" + mediaType);
            }
        }
       
    }

}


