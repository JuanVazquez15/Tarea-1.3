package isc;

public class ESpotifai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Playlist play1=new Playlist("fiesta");
        Playlist play2=new Playlist("salsa");
        
        Cancion song1=new Cancion ("SSSSSSSS","rrrrrr", 1950);
        Cancion song2=new Cancion ("tttttttt","qqqqqq", 1960);
        Cancion song3=new Cancion ("yyyyyyyy","oooooo", 1970);
        Cancion song4=new Cancion ("zzzzzzzz","rrrrrr", 1980);
        Cancion song5=new Cancion ("vvvvvvvv","mmmmmm", 1990);
        Cancion song6=new Cancion ("ññññññññ","kkkkkk", 2000);
        
        play1.add(song1);
        play1.add(song2);
        play1.add(song6);
        play1.add(song3);
        
        play2.add(song4);
        play2.add(song5);
        play2.add(song6);
    }
    
}
