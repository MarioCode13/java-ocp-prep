import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Movie theMovie = new Adventure("Star Wars");
        theMovie.watchMovie();

        Movie theMovie2 = new Comedy("Grown Ups");
        theMovie2.watchMovie();

        Movie theMovie3 = Movie.getMovie("Adventure", "Indiana Jones");
        theMovie3.watchMovie();

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter type of movie: ?");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }

            System.out.print("Enter movie title: ");
            String title = s.nextLine();
            Movie theMovie4 = Movie.getMovie(type, title);
            theMovie4.watchMovie();

        }

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("Comedy", "asdf");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchMovie();

        var airplane = Movie.getMovie("S", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchMovie();

        Object unknownObject = Movie.getMovie("C", "Plane");
        if (unknownObject.getClass().getSimpleName().equals("Comedy")) {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure)  unknownObject).watchMovie();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
