/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.alcoapps.androidplaylists;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
//
import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
//import android.util.Log;
import android.net.Uri;
import android.provider.MediaStore;
import android.database.Cursor;
import java.util.ArrayList;

@Kroll.module(name="Modandroidplaylists", id="com.alcoapps.androidplaylists")
public class ModandroidplaylistsModule extends KrollModule
{

	// Standard Debugging variables
	private static final String TAG = "ModandroidplaylistsModule";

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public ModandroidplaylistsModule()
	{
		super();
		Log.d(TAG,"Module instantiated");
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		Log.d(TAG, "inside onAppCreate");
		// put module init code that needs to run when the application is created
	}

	// Methods
	@Kroll.method
	// From: http://stackoverflow.com/questions/7370278/how-can-i-access-playlist-created-by-android-default-music-app-and-call-the-musi
	public String getPlaylists()
	{
		ArrayList<String> pl = new ArrayList<String>();
		Log.d(TAG, "example called");        
		
        final ContentResolver resolver = this.getActivity().getContentResolver();
	    final Uri uri = MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI;
	    final String idKey = MediaStore.Audio.Playlists._ID;
	    final String nameKey = MediaStore.Audio.Playlists.NAME;
	    final String[] columns = { idKey, nameKey };
	    final Cursor playLists = resolver.query(uri, columns, null, null, null);
	    if (playLists == null) {
	        Log.e(TAG, "Found no playlists.");
	        return "NAK";
	    }

	    String playListName = null;
	    for (boolean hasItem = playLists.moveToFirst(); hasItem; hasItem = playLists.moveToNext()) {
	    	// poor man's JSON 
	    	pl.add("{\"name\":\"" + playLists.getString(playLists.getColumnIndex(nameKey)) + "\",\"id\":\"" + playLists.getLong(playLists.getColumnIndex(idKey)) + "\"}");
	        Log.i(TAG, playListName);
	    }
		return pl.toString();
	}

	@Kroll.method
	// From: http://stackoverflow.com/questions/7370278/how-can-i-access-playlist-created-by-android-default-music-app-and-call-the-musi
	public String getSongs(final long playListID)
	{
		ArrayList<String> trks = new ArrayList<String>();
		int dataIndex=0;
		String dataPath=null;
		final ContentResolver resolver = this.getActivity().getContentResolver();
        final Uri uri = MediaStore.Audio.Playlists.Members.getContentUri("external", playListID);
        final String dataKey = MediaStore.Audio.Media.DATA;
        Cursor tracks = resolver.query(uri, new String[] { dataKey }, null, null, null);
        for (boolean hasItem = tracks.moveToFirst(); hasItem; hasItem = tracks.moveToNext()) {
            dataIndex = tracks.getColumnIndex(dataKey);
            dataPath = tracks.getString(dataIndex);
            // poor man's JSON 
            trks.add("{\"index\":\"" +  dataIndex + "\",\"path\":\"" + dataPath + "\"}");
        }
        tracks.close();
        
		return trks.toString();
	}
	
	/*
	// Methods
	@Kroll.method
	public String example()
	{
		Log.d(TAG, "example called");
		return "hello world";
	}

	
	// Properties
	@Kroll.getProperty
	public String getExampleProp()
	{
		Log.d(TAG, "get example property");
		return "hello world";
	}
	
	
	@Kroll.setProperty
	public void setExampleProp(String value) {
		Log.d(TAG, "set example property: " + value);
	}
	*/
}

