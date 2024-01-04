package com.april_eclipse_test_2019;
/*
 * There is an arraylist of song object { int song id , String songname , flaot volume } . As
song objects are added into list, volume variable of current object is increased by 2 .
e.g. first song added will have volume 2 , second song will have volume 4 and so on.
But the when volume becomes divisible by 3. It gets reduced by 50% for that song
(current object). Again for next song onwards volume will increase by 2 and so on.
Find out index of atleast one song object for which volume will be equal to or greater
than 10 .
You have to accept only song id and song name from user. Volume will be set as per
above logic.
e.g. first song added – 1 , ‘all is well’ , 2
second song – 2 , ‘e vatan’ , 4
third song - 3 , ‘lakshya to’ , 6 .. now this volume is divisible by 3 so. This song’s
volume will be reduced by 50% so will become 3.
Now next song will have volume 3+2 = 5 and so on . Again when volume becomes 9
it will be reduced to 4.5. [2M]
 */
class SongQ1 {
    private int songId;
    private String songName;
   public  float volume;
   static float count;

    public SongQ1(int songId, String songName) {
        this.songId = songId;
        this.songName = songName;
        count=count+2;
        this.volume =count;
        updateVolume();
    }

    private void updateVolume() {
      //  volume += 2;

        if (volume % 3 == 0) {
            volume /= 2;
        }
    }

    public int getSongId() {
        return songId;
    }

    public String getSongName() {
        return songName;
    }

    public float getVolume() {
        return volume;
    }

	@Override
	public String toString() {
		return "SongQ1 [songId=" + songId + ", songName=" + songName + "Volume"+volume+"]";
	}
    
}


