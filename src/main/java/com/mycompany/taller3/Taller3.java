package com.mycompany.taller3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Application that manages a library of songs
 * @author Jaime Sanchez Mendieta
 */
public class Taller3 {
    
    public static void main(String[] args) {        
        // Building songs via Song class objects
        Song song1 = new Song(1,"Bon Jovi - It's My Life","Rock","","Bon Jovi hit",4.26,LocalDate.parse("2000-05-20"));
        Song song2 = new Song(2,"Pantera - Cowboys From Hell","Metal","","Pantera lml",4.07,LocalDate.parse("1990-07-24"));
        Song song3 = new Song(3,"Europe - The Final Countdown","Rock","","Europe's biggest hit",4.56,LocalDate.parse("1986-05-26"));
        Song song4 = new Song(4,"Pantera - Cementery Gates","Metal","","Pantera lml",7.03,LocalDate.parse("1990-07-24"));
        Song song5 = new Song(5,"Aerosmith - Fly Away From Here","Rock","","Fly away from heree",4.19,LocalDate.parse("2001-06-02"));
        Song song6 = new Song(6,"Mayhem - Life Eternal","Metal","","Mayhem lml",6.57,LocalDate.parse("1994-05-24"));
        Song song7 = new Song(7,"Mayhem - Freezing Moon","Metal","","The freezing mooon",6.22,LocalDate.parse("1994-05-24"));
        Song song8 = new Song(8,"Megadeth - Tornado of Souls","Metal","","Megadeth lml",5.22,LocalDate.parse("1990-09-24"));
        Song song9 = new Song(9,"Mozart - Eine kleine Nachtmusik","Classical Music","","A piece of classical music",16.00,LocalDate.parse("1787-08-10"));
        Song song10 = new Song(10,"Nirvana - Where Did You Sleep Last Night(Cover)","Folk Rock","","Interpretation of an old folk song",5.08,LocalDate.parse("1994-11-01"));
        
        // Creating the song library
        List<Song> songLibrary= Arrays.asList(song1,song2,song3,song4,song5,song6,song7,song8,song9,song10);

        /**
         * Music App entry menu, created by options
         */
        int optionGlobalSwitch = 0, optionCreatePlaylist = 0;
        boolean controlGlobalWhile = true, controlCreatePlaylist = true;
        Scanner inputOption = new Scanner(System.in);;
        Scanner inputOptionPlayList = new Scanner(System.in);
        Scanner inputGenre = new Scanner(System.in);
        Scanner inputYear = new Scanner(System.in);
       
        while(controlGlobalWhile == true) {
            System.out.println("Welcome to MusicApp!");
            System.out.println("1. View full library");
            System.out.println("2. Filter library by genre");
            System.out.println("3. Filter library by year");
            System.out.println("4. Sort library by songs duration");
            System.out.println("5. Sort library by songs release date");
            System.out.println("6. Create a playlist");
            System.out.println("7. Exit");
            boolean inputValidNumber = false;
            
            // Method that helps capturing exceptions due to bad numbers given by user in the option menu
            optionGlobalSwitch = validNumber(inputValidNumber, optionGlobalSwitch, inputOption);
        
            switch(optionGlobalSwitch) {
                case 1:
                    songLibrary.forEach((element) -> {
                        System.out.println(element);
                    });
                    break;
                case 2:
                    System.out.println("Type the genre wanted to filter:");
                    String genre = inputGenre.nextLine();
                    if(songLibrary.toString().contains(genre)) {
                        songLibrary.stream()
                                .filter(element -> element.getGenre().equals(genre))
                                .forEach(System.out::println);
                    } else {
                        System.out.println("The searched genre does not exist in the library");
                    }
                    break;
                case 3:
                    System.out.println("Type the year wanted to filter:");
                    String year = inputYear.nextLine();
                    if(songLibrary.toString().contains(year)) {
                        songLibrary.stream()
                                .filter(element -> element.getDate().toString().contains(year))
                                .forEach(System.out::println);
                    } else {
                        System.out.println("The searched year does not exist in the library");
                    }
                    break;
                case 4:
                    songLibrary.sort((o1, o2) -> o1.getDuration().compareTo(o2.getDuration()));
                    for (int i = 0; i < songLibrary.size(); i++) {
                        songLibrary.get(i).setId(i+1);
                        System.out.println(songLibrary.get(i));
                    }
                    break;
                case 5:
                    songLibrary.sort((o1, o2) -> o1.getDate().compareTo(o2.getDate()));
                    for (int i = 0; i < songLibrary.size(); i++) {
                        songLibrary.get(i).setId(i+1);
                        System.out.println(songLibrary.get(i));
                    }
                    break;
                case 6:
                    // Creating the list for the new playlist
                    List<Song> playList = new ArrayList<Song>();
                    Scanner inputAnotherSong = new Scanner(System.in);
                    controlCreatePlaylist = true;
                    boolean inputValidNumberPlaylist = false;
                    
                    while (controlCreatePlaylist == true) {
                        songLibrary.forEach((element) -> {
                            System.out.println(element);
                        });
                        System.out.println("");
                        
                        // Validating exceptions in the playlist options menu
                        optionCreatePlaylist = validNumber(inputValidNumberPlaylist, optionCreatePlaylist, inputOptionPlayList);
                        switch (optionCreatePlaylist) {
                            case 1:
                                if(playList.contains(songLibrary.get(0))) {
                                    System.out.println("The song you are trying to add is already in the playlist!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                } else {
                                    playList.add(songLibrary.get(0));
                                    System.out.println("Song added successfully!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                }
                                break;
                            case 2:
                                if(playList.contains(songLibrary.get(1))) {
                                    System.out.println("The song you are trying to add is already in the playlist!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                } else {
                                    playList.add(songLibrary.get(1));
                                    System.out.println("Song added successfully!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                }
                                break;
                            case 3:
                                if(playList.contains(songLibrary.get(2))) {
                                    System.out.println("The song you are trying to add is already in the playlist!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                } else {
                                    playList.add(songLibrary.get(2));
                                    System.out.println("Song added successfully!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                }
                                break;
                            case 4:
                                if(playList.contains(songLibrary.get(3))) {
                                    System.out.println("The song you are trying to add is already in the playlist!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                } else {
                                    playList.add(songLibrary.get(3));
                                    System.out.println("Song added successfully!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                }
                                break;
                            case 5:
                                if(playList.contains(songLibrary.get(4))) {
                                    System.out.println("The song you are trying to add is already in the playlist!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                } else {
                                    playList.add(songLibrary.get(4));
                                    System.out.println("Song added successfully!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                }
                                break;
                            case 6:
                                if(playList.contains(songLibrary.get(5))) {
                                    System.out.println("The song you are trying to add is already in the playlist!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                } else {
                                    playList.add(songLibrary.get(5));
                                    System.out.println("Song added successfully!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                }
                                break;
                            case 7:
                                if(playList.contains(songLibrary.get(6))) {
                                    System.out.println("The song you are trying to add is already in the playlist!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                } else {
                                    playList.add(songLibrary.get(6));
                                    System.out.println("Song added successfully!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                }
                                break;
                            case 8:
                                if(playList.contains(songLibrary.get(7))) {
                                    System.out.println("The song you are trying to add is already in the playlist!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                } else {
                                    playList.add(songLibrary.get(7));
                                    System.out.println("Song added successfully!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                }
                                break;
                            case 9:
                                if(playList.contains(songLibrary.get(8))) {
                                    System.out.println("The song you are trying to add is already in the playlist!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                } else {
                                    playList.add(songLibrary.get(8));
                                    System.out.println("Song added successfully!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                }
                                break;
                            case 10:
                                if(playList.contains(songLibrary.get(9))) {
                                    System.out.println("The song you are trying to add is already in the playlist!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                } else {
                                    playList.add(songLibrary.get(9));
                                    System.out.println("Song added successfully!");
                                    playList.forEach((element) -> {
                                        System.out.println(element);
                                    });
                                }
                                break;    
                            default:
                                System.out.println("The option you entered does not exist");
                                break;
                        }
                        System.out.println("Do you want to add another song? Please answer Yes or No:");
                        String addAnotherSong = inputAnotherSong.nextLine();
                        if(addAnotherSong.equals("Yes")) {
                            
                        } else if(addAnotherSong.equals("No")) {
                            System.out.println("This is the playlist you have created:");
                            playList.forEach((element) -> {
                                System.out.println(element);
                            });
                        } else {
                            boolean comparison = false;
                            while(!comparison) {
                                System.out.println("Incorrect option, type Yes or No:");
                                addAnotherSong = inputAnotherSong.nextLine();
                                comparison = addAnotherSong.equals("Yes") || addAnotherSong.equals("No");
                            }
                            if(addAnotherSong.equals("No")) {
                                System.out.println("This is the playlist you have created:");
                                playList.forEach((element) -> {
                                    System.out.println(element);
                                });
                            }
                        }
                        if(addAnotherSong.equals("No")) {
                            // Playlist options
                            if(playList.size() > 1) {
                                boolean controlPlayList = true;
                                while(controlPlayList) {
                                    boolean inputValidPlayList = false;
                                    int playListOptions = 0;
                                    Scanner inputPlayList = new Scanner(System.in);
                                    Scanner inputGenrePlayList = new Scanner(System.in);
                                    Scanner inputYearPlayList = new Scanner(System.in);
                                    System.out.println("1. View full playlist");
                                    System.out.println("2. Filter by genre");
                                    System.out.println("3. Filter by year");
                                    System.out.println("4. Sort by songs duration");
                                    System.out.println("5. Sort by songs release date");
                                    System.out.println("6. Exit");
                                    
                                    playListOptions = validNumber(inputValidPlayList, playListOptions, inputPlayList);
                        
                                    switch (playListOptions) {
                                        case 1:
                                            playList.forEach((element) -> {
                                                System.out.println(element);
                                            });
                                            break;
                                        case 2:
                                            System.out.println("Type the genre wanted to filter:");
                                            String genrePlayList = inputGenrePlayList.nextLine();
                                            if(playList.toString().contains(genrePlayList)) {
                                                playList.stream()
                                                        .filter(element -> element.getGenre().equals(genrePlayList))
                                                        .forEach(System.out::println);
                                            } else {
                                                System.out.println("The searched genre does not exist in the playlist");
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Type the year wanted to filter:");
                                            String yearPlayList = inputYearPlayList.nextLine();
                                            if(playList.toString().contains(yearPlayList)) {
                                                playList.stream()
                                                        .filter(element -> element.getDate().toString().contains(yearPlayList))
                                                        .forEach(System.out::println);
                                            } else {
                                                System.out.println("The searched year does not exist in the playlist");
                                            }
                                            break;
                                        case 4:
                                            playList.sort((o1, o2) -> o1.getDuration().compareTo(o2.getDuration()));
                                            playList.forEach((element) -> {
                                                System.out.println(element);
                                            });
                                            break;
                                        case 5:
                                            playList.sort((o1, o2) -> o1.getDate().compareTo(o2.getDate()));
                                            playList.forEach((element) -> {
                                                System.out.println(element);
                                            });
                                            break;
                                        case 6:
                                            controlPlayList = false;
                                            break;
                                        default:
                                            System.out.println("The option you entered does not exist");
                                            break;
                                    }
                                }
                            }
                            controlCreatePlaylist = false;      
                        }
                    }
                    break;
                case 7:
                    controlGlobalWhile = false;
                    break;
                default:
                    System.out.println("The option you entered does not exist");
                    break;
            }
        }
    }
    
    /**
     * Exception handling method for InputMismatchException cases
     * @param inputValidNumber = boolean that is false until a numeric value is entered
     * @param optionMenu = value entered by the user in the options menu
     * @param inputOption = scanner structure that receives the entered value
     * @return = a valid option for the menu to work
     */
    private static int validNumber(boolean inputValidNumber, int optionMenu, Scanner inputOption) {
        while(!inputValidNumber) { // As long as the given option is invalid, it will keep asking
            try {
                System.out.print("Please choose one of the options: ");
                optionMenu = inputOption.nextInt();
                inputValidNumber = true;
            }
            catch (InputMismatchException e) { // Captures the exception and asks the user for a valid number
                inputOption.nextLine();
                System.out.println("You need to choose a valid number!");
            }
        }
        return optionMenu; // Once it's a valid number, the method will return it so we can use it in other functions
    }
}


