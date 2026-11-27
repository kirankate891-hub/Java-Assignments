class Artist {
    private String name;
    private int age;

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Painter extends Artist {
    private String paintingStyle;
    private String mediumUsed;
    private int numberOfPaintings;

    public Painter(String name, int age, String paintingStyle, String mediumUsed, int numberOfPaintings) {
        super(name, age);
        this.paintingStyle = paintingStyle;
        this.mediumUsed = mediumUsed;
        this.numberOfPaintings = numberOfPaintings;
    }

    public String getPaintingStyle() { return paintingStyle; }
    public String getMediumUsed() { return mediumUsed; }
    public int getNumberOfPaintings() { return numberOfPaintings; }

    @Override
    public void display() {
        super.display();
        System.out.println("Style: " + paintingStyle + ", Medium: " + mediumUsed
                + ", Paintings: " + numberOfPaintings);
    }
}

class Musician extends Artist {
    private String instrument;
    private String musicGenre;
    private int numberOfAlbums;

    public Musician(String name, int age, String instrument, String musicGenre, int numberOfAlbums) {
        super(name, age);
        this.instrument = instrument;
        this.musicGenre = musicGenre;
        this.numberOfAlbums = numberOfAlbums;
    }

    public String getInstrument() { return instrument; }
    public String getMusicGenre() { return musicGenre; }
    public int getNumberOfAlbums() { return numberOfAlbums; }

    @Override
    public void display() {
        super.display();
        System.out.println("Instrument: " + instrument + ", Genre: " + musicGenre
                + ", Albums: " + numberOfAlbums);
    }
}

class Actor extends Artist {
    private String filmIndustry;
    private int numberOfMovies;

    public Actor(String name, int age, String filmIndustry, int numberOfMovies) {
        super(name, age);
        this.filmIndustry = filmIndustry;
        this.numberOfMovies = numberOfMovies;
    }

    public String getFilmIndustry() { return filmIndustry; }
    public int getNumberOfMovies() { return numberOfMovies; }

    @Override
    public void display() {
        super.display();
        System.out.println("Industry: " + filmIndustry + ", Movies: " + numberOfMovies);
    }
}

public class ArtistDemo {
    public static void main(String[] args) {
        Artist[] artists = {
            new Painter("Ravi", 45, "Realism", "Oil", 120),
            new Musician("Meera", 30, "Guitar", "Rock", 5),
            new Actor("Arjun", 38, "Bollywood", 25)
        };
        for (Artist a : artists) {
            a.display();
            System.out.println("----------");
        }
    }
}
