package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.manager.ManagerMovies;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerMoviesTest {
        ManagerMovies manager = new ManagerMovies();

        Movie a1 = new Movie(1, "first");
        Movie a2 = new Movie(2, "second");
        Movie a3 = new Movie(3, "third");
        Movie a4 = new Movie(4, "fourth");
        Movie a5 = new Movie(5, "fifth");
        Movie a6 = new Movie(6, "sixth");
        Movie a7 = new Movie(7, "seventh");
        Movie a8 = new Movie(8, "eighth");
        Movie a9 = new Movie(9, "ninth");
        Movie a10 = new Movie(10, "tenth");
        Movie a11 = new Movie(11, "eleven");

     @Test
             void shouldAdd10LastMovies(){
         ManagerMovies manager = new ManagerMovies();
         manager.add(a1);
         manager.add(a2);
         manager.add(a3);
         manager.add(a4);
         manager.add(a5);
         manager.add(a6);
         manager.add(a7);
         manager.add(a8);
         manager.add(a9);
         manager.add(a10);
         manager.add(a11);

         Movie[] actual = manager.getAll();
         Movie[] expected = new Movie[]{a11,a10,a9,a8,a7,a6,a5,a4,a3,a2};
         assertArrayEquals(actual, expected);
     }
    @Test
    void shouldAdd8Movies(){
        ManagerMovies manager = new ManagerMovies(9);
        manager.add(a1);
        manager.add(a2);
        manager.add(a3);
        manager.add(a4);
        manager.add(a5);
        manager.add(a6);
        manager.add(a7);
        manager.add(a8);


        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{a8,a7,a6,a5,a4,a3,a2,a1};
        assertArrayEquals(actual, expected);
    }
    @Test
    void shouldAdd0LastMovies() {
        ManagerMovies manager = new ManagerMovies();
        manager.add(a1);
        manager.add(a2);
        manager.add(a3);
        manager.add(a4);



        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{a4,a3,a2,a1};
        assertArrayEquals(actual, expected);
    }






}





