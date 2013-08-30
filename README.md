# Android Playlists Module 

## Summary

This project is a native Android module for Titanium that allows you to get Android's native playlists and its contents.

## API
The module is very similar to a web service in the sense that it returns JSON strings.

There are only two methods:

### getPlaylists
Returns an array of objects:

```
[
	{name:'Playlist Name 1',id: '1234'},
	{name:'Playlist Name 2',id: '4321'}
]
```

### getSongs(playlist_id)
Returns an array of objects:

```
[
	{index:0,path: '/storage/extSdCard/ArtistName/SongName.mp3'},
	{index:0,path: '/storage/extSdCard/ArtistName/SongName.mp3'}
]
```

## Licenses
This project is licensed under the MIL License. [http://alco.mit-license.org/](http://alco.mit-license.org/)

## Note
This is my first native Android module for Titanium, and my first attempt at Java coding in MANY years.  If you see something that could be improved or something that simply I shouldn't do in code, feel free to let me know. :)