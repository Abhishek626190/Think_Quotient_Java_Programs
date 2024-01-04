package com.april_eclipse_test_2019;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SongALQ1 {

	public static void main(String[] args) {
		ArrayList<SongQ1> songList = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter Song Id: ");
			int songId = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character
			System.out.print("Enter Song Name: ");
			String songName = scanner.nextLine();

			SongQ1 newSong = new SongQ1(songId, songName);  
			songList.add(newSong);
			System.out.println(newSong);

			System.out.println("Song Added Successfully");
			// System.out.println("Current Volume: " + newSong.getVolume());

			if (newSong.getVolume() >= 10) {
				System.out.println("Index of the song with volume 10 or greater: " + songList.indexOf(newSong));
				break;
			}

			System.out.print("Do you want to add another song? (Yes/No): ");
			String choice = scanner.next().toLowerCase();

			if (!choice.equals("yes")) {
				break;   
			}
		}

		// Print the ArrayList
		System.out.println("Song List:");
//		for (SongQ1 song : songList) {
//			System.out.println("Song Id: " + song.getSongId() + ", Song Name: " + song.getSongName() + ", Volume: "
//					+ song.getVolume());
//			System.out.println();
//		}
		Iterator<SongQ1>itr=songList.iterator();
		while(itr.hasNext())
		{
			SongQ1 s=itr.next();
			System.out.println(s);
		}
		
	}
}
