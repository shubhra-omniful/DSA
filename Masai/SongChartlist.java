class song{

	String name;
	int duration;
	int popularity;

	public song ( int duration, String name, int popularity ) {
		this.duration = duration;
		this.name = name;
		this.popularity = popularity;
	}
}

class chartlist{

	int n;
	song[] arr;

	public chartlist (int n, song[] arr){
		this.n = n;
		this.arr = arr;
	}

	public String[] top_five () {
		String[] topFive = new String[5];

		for ( int i = 0; i < n ; i++ ){
			for ( int j = 0 ; j < n - 1 - i; j++ ){
				if ( arr[j].popularity > arr[j+1].popularity ){
					song temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for ( int i = 0; i < 5 ; i++){
			topFive[i] = arr[i].name;
		}

		return topFive;
	}

	public String leastPopular () {
		String leastSong = "";
		Integer min = Integer.MIN_VALUE;

		for ( int i = 0; i < n; i++ ){

			song data = arr[i];

			if ( data.popularity > min ){
				min = data.popularity;
				leastSong = data.name;
			}
		}

		return leastSong;
	}

	public String mostPopular ( ) {
		String mostSong = "";
		Integer max = Integer.MAX_VALUE;

		for ( int i = 0; i < n; i++ ){

			song data = arr[i];

			if ( data.popularity < max ){
				max = data.popularity;
				mostSong = data.name;
			}
		}

		return mostSong;
	}

	public String longestSong ( ) {
		String longestSong = "";
		Integer min = Integer.MIN_VALUE;

		for ( int i = 0; i < n; i++ ){

			song data = arr[i];

			if ( data.duration > min ){
				min = data.duration;
				longestSong = data.name;
			}
		}

		return longestSong;
	}

	public String shortestSong ( ) {
		String shortestSong = "";
		Integer max = Integer.MAX_VALUE;

		for ( int i = 0; i < n; i++ ){

			song data = arr[i];

			if ( data.duration < max ){
				max = data.duration;
				shortestSong = data.name;
			}
		}

		return shortestSong;
	}

}