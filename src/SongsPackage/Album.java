package SongsPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Album {
    private String artistName;
    private String albumName;
    private List<Song> songs;

    public Album(String artistName, String albumName) {
        this.artistName = artistName;
        this.albumName = albumName;
        songs = new ArrayList<>();
    }

    public String addSongAlbum(String title, double duration) {
        for (Song s : songs) {
            if (s.getTitle().equals(title)) {
                return "Song is already in album";
            }
        }
        Song s = new Song(title, duration);
        songs.add(s);
        return "Song has been in the album";
    }

    public String findSong(String title) {
        for (Song s : songs) {
            if (s.getTitle().equals(title)) {
                return "Song is present in the Album";
            }
        }
        return "Song is not present in the Album";
    }

    public String addSongToPlayList(String title, ArrayList<Song> list, HashMap<String, List<Song>> map) {
        for (Song s : songs) {
            if (s.getTitle().equals(title)) {
                list.add(s);
                if (map.containsKey(artistName)) {
                    List<Song> songg = map.get(artistName);
                    songg.add(s);
                    map.put(artistName, songg);
                } else {
                    List<Song> listt = new ArrayList<>();
                    listt.add(s);
                    map.put(artistName, listt);
                }
            }
        }
        return "Song is not present in the Album";
    }

    public String addSongToPlayList(int index, ArrayList<Song> list, HashMap<String, List<Song>> map) {
        index = index - 1;
        if (index >= 0 && index < songs.size()) {
            list.add(songs.get(index));
        }
        if (map.containsKey(artistName)) {
            List<Song> songg = map.get(artistName);
            songg.add(songs.get(index));
            map.put(artistName, songg);
        } else {
            List<Song> listt = new ArrayList<>();
            listt.add(songs.get(index));
            map.put(artistName, listt);
        }
        return "";

    }
}
