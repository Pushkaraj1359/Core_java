package class_objects;

class song{
    String songName;
    String singer;
    String album;
    double duration;


    song(){
        songName="shape of you";
        singer="Ed Sheeran";
        album="divide";
        duration=4.34;
    }

    void showDetails(){
        System.out.println("songname = "+songName);
        System.out.println("singer = "+singer);
        System.out.println("album = "+album);
        System.out.println("duration = "+duration);
    }

    // get only SongName
    String getSongName(){
        return songName;
    }

    void setSongName(String songName){
        this.songName=songName;
    }

}

public class C_song {
    public static void main(String[] args) {
        song s=new song();

        // Behaviour
        s.showDetails();
        s.setSongName("ray thakur");
        System.out.println("the singer name is ="+s.getSongName());

        // State
        System.out.println("Singer: " + s.singer);

        // Identity
        System.out.println(s);
    }
}
