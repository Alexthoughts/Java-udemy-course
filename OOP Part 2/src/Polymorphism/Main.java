package Polymorphism;

class Movie { //polymorphism
    private String name;

    public Movie(String name) { //constructor
        this.name = name;
    }
    public String plot() {
        return "No plot (suget)";
    }
    public String getName() {
        return name;
    }
}

    class Jaws extends Movie { //polymorphism Movie
        public Jaws() {
            super("Jaws"); //constructor
        }
        //no plot - return "No plot (suget)"
    }

    class IndependenceDay extends Movie { //polymorphism Movie
        public IndependenceDay() {
            super("Independence day");
        }
        @Override
        public String plot() {
            //polymorphism (rewrite plot for the specific movie)
            return "Aliens attempt to take over the planet";
        }
    }

    class StarWars extends Movie { //polymorphism Movie
        public StarWars() {
            super("Star Wars");
        }
        @Override
        public String plot() {
            //polymorphism (rewrite plot for the specific movie)
            return "Imperial try to take over the universe";
        }
    }

    public class Main {
    public static void main(String[] args) {
        for (int i=1;i<5;i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # " + i +
                    movie.getName() +
                    "\n"/*new line*/ +
                    "Plot: " + movie.plot()
                    + "\n"/*new line*/);
        }
    }

    public static Movie randomMovie() { //return a random movie
        int randomNumber = (int) (Math.random() * 3) + 1; //numbers 1 - 3
        System.out.println("Random number is " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new StarWars();
        }
        return null;
    }
}



