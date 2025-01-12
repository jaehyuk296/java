
class Song{
	String title;
	String singer;
	int year;
	String lang;
	
	Song(String title,String singer,int year, String lang){
		this.title=title;
		this.singer=singer;
		this.year=year;
		this.lang=lang;
	}
	
	void show() {
		System.out.println(year+"년 "+lang+"의 "+singer+"가 부른 "+title);
	}
}

public class Ch4_5 {

	public static void main(String[] args) {
		Song song = new Song("그대 눈물까지도","투투",1988,"한국");
		song.show();
	}

}
