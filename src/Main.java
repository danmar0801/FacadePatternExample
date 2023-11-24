public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new SmartTV(), new SurroundSoundSystem(), new BluRayPlayer());
        homeTheater.watchMovie(); // starts the movie
        homeTheater.endMovie(); // ends the movie
    }
}