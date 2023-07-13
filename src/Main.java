import SongsPackage.Album;
import SongsPackage.Song;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Album a = new Album("Dsp", "Pushpa");
        a.addSongAlbum("saami", 3.22);
        a.addSongAlbum("srivalli", 5.22);
        a.addSongAlbum("oo antava", 4.02);
        Album b = new Album("Dsp", "Rangasthalam");
        b.addSongAlbum("Rangamma Mangamma", 5.33);
        b.addSongAlbum("jigeluraani", 4.22);
        b.addSongAlbum("Yenthasakkagunnave", 5.22);
        ArrayList<Song> playlist = new ArrayList<>();
        HashMap<String, List<Song>> map = new HashMap<String, List<Song>>();
        a.addSongToPlayList(1, playlist, map);
        a.addSongToPlayList(2, playlist, map);
        b.addSongToPlayList("jigeluraani", playlist, map);
        b.addSongToPlayList("Yenthasakkagunnave", playlist, map);
        play();
        System.out.println(playlist.get(0).toString());
        Scanner sc = new Scanner(System.in);

        boolean flag = false;
        int index = 0;
        while(!flag){
            int i = sc.nextInt();
                switch(i){
                    case 1 :

                        if(index == playlist.size()-1)
                            System.out.println("Your at last song");
                        else System.out.println(playlist.get(index+1).toString());
                        index++;
                        if(index == playlist.size()){
                            index--;
                        }

                        break;
                    case 2 :


                        if(index == 0)
                            System.out.println("Your are at the first Song");
                        else{
                            System.out.println(playlist.get(index-1).toString());
                        }
                        index--;
                        if(index <0) index++;

                        break;
                    case 3:
                        System.out.println(playlist.get(index).toString());
                       break;
                    case 4 :
                        play();
                        index = 0;
                        System.out.println(playlist.get(index).toString());
                        break;
                    case 5 :
                        flag = true;



                }
        }

    }
    public static void play() {
        System.out.println("Press 1 for next Song");
        System.out.println("Press 2 for previous Song");
        System.out.println("Press 3 for repeat Song");
        System.out.println("Press 4 for play menu");
        System.out.println("Press 5 for suffle Song");
        System.out.println("Press 6 for artist Song");
        System.out.println("Press 7 to exit the playlist");
    }





    }
